package com.anthotel.common.utils;

import com.anthotel.common.base.CheckResult;
import com.anthotel.common.base.ResultKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.UUID;

/**
 * @ author Devhui
 * @ Description:Token验证
 */
@Controller
public class MainUtils {

    /**
     * 进行token时间验证
     */


    private static RedisUtil redisUtil = ApplicationContextProvider.getBean(RedisUtil.class);;


    public static ResultKit checkToken(String token) {
        boolean ExistRedis;
        //进行验证
        if (token != null) {
            CheckResult result = JwtUtils.validateJWT(token);
            // 通过redis缓存判断是否过期，或者是否更新token
            if (redisUtil.hasKey(token)){
                ExistRedis = true;
                redisUtil.del(token);
                redisUtil.set(token, UUID.randomUUID(),10000);
            }else {
                ExistRedis = false;
                System.out.println("token已经失效");
            }

            if (ExistRedis && result.isSuccess()) {
                ResultKit<CheckResult> resultKit = new ResultKit<>();
                resultKit.setCode(ResultCode.SUCCESS.code());
                resultKit.setMessage("成功获取信息");
                resultKit.setData(result);
                return resultKit;
            } else {
                ResultKit<String> resultKit = new ResultKit<>();
                resultKit.setCode(ResultCode.UNAUTHORIZED.code());
                resultKit.setMessage("错误:Token验证失败,或许是授权过期,或许是Token错误");
                resultKit.setData("没有权限进行操作");
                return resultKit;
            }

        } else {
            ResultKit<String> resultKit = new ResultKit<>();
            resultKit.setCode(ResultCode.FAIL.code());
            resultKit.setMessage("错误:没有检测到Token");
            resultKit.setData("没有权限进行操作");
            return resultKit;
        }
    }

}
