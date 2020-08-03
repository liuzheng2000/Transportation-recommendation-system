## Ant Hotel

SQL语句位于 Ant-admin-admin包中 下的resources  目录下 （有所不同）

一   ：http://localhost:8081/swagger-ui.html  （swagger的后端接口文档）

![image-20200803093507732](G:\JAVA文档\图片地址\image-20200803093507732.png)

二 ： 人员授权登录 测试

 测试值(实际password为123456)  :   

```
  {"password":"e10adc3949ba59abbe56e057f20f883e","username":"admin"}
```

![FireShot Capture 015 - Swagger UI - localhost](G:\JAVA文档\图片地址\FireShot Capture 015 - Swagger UI - localhost.png)

返回token   在开启验证后   实现需要进行token验证   （实际用处并不大）



2 查询地点测试测试（例如景点）

查询参数如下

```
{
  "locationType": [
    "string"
  ],		//查询全地点时，需要填的类型 且需按照格式
  "price": "string",    //是否根据价钱查询
  "recommend1": "string",    //是否根据推荐值1查询
  "recommend2": "string", 	 //是否根据推荐值2查询
  "scenicAreaArea": "string",   //景点所在区域
  "scenicAreaCity": "string",	//景点所在城市
  "scenicAreaProvince": "string"	//景点所在省份
}
```

因偷懒  后端查询类只写了一个（上面有些参数是无关参数）

关于景点测试

1 景点测试仅有   推荐值查询   示例发送参数如下

```
//根据推荐值1和推荐值2的和   查询 北京市下的景点
//如仅有recommend1 参数  则按照 推荐值1查询
//如仅有recommend2 参数  则按照 推荐值2查询
{
  "recommend1": "true",   
  "recommend2": "true",
  "scenicAreaProvince": "北京市"
}
```

查询结果如图

![FireShot Capture 018 - Swagger UI - localhost](G:\JAVA文档\图片地址\FireShot Capture 018 - Swagger UI - localhost.png)

 解析：未开启拦截器 ，不用发送token    查询北京市下景点    按照推荐值 1和推荐值2和由高到低排序

3  在某些地点中 可按照价格排序进行查询

![FireShot Capture 021 - Swagger UI - localhost](G:\JAVA文档\图片地址\FireShot Capture 021 - Swagger UI - localhost.png)

4  查询列车 按照价钱进行排序实例   （还是懒 ，未将查询类分开）

查询参数如下

```
{
  "endCity": "string",    //结束城市
  "endTrainstation": "string",     //结束站点
  "recommand1": "string",          //推荐值1
  "recommand2": "string",		    //推荐值2
  "recommand3": "string",           //推荐值3
  "recommand4": "string",          //推荐值4
  "recommand5": "string",          //推荐值5
  "startAndEndCity": "string",     //开始和结束城市
  "startCity": "string",           //开始城市
  "startTrainstation": "string"    //开始站点
}
```

示例发送参数如下

```
{
  "endCity": "武汉市",
  "startCity": "北京市"
}
```

![FireShot Capture 026 - Swagger UI - localhost](G:\JAVA文档\图片地址\FireShot Capture 026 - Swagger UI - localhost.png)

示例  ：返回值根据价格由高到低排序  且最高显示6条   

4 全地点查询

查询参数

```
{
  "locationType": [
    "string"
  ],
  "price": "string",
  "recommend1": "string",
  "recommend2": "string",
  "scenicAreaArea": "string",
  "scenicAreaCity": "string",
  "scenicAreaProvince": "string"
}
```

示例查询  目前仅有这五种参数   （查询北京市下，这五种地方）  （可根据推荐值查询）

```
{
  "locationType": [
    "hotel","hospital","restaurant","attraction","entertainment"
  ],
  "scenicAreaProvince": "北京市"
}
```

查询结果如下![FireShot Capture 037 - Swagger UI - localhost](G:\JAVA文档\图片地址\FireShot Capture 037 - Swagger UI - localhost.png)

此类的返回值不固定根据  查询参数返回