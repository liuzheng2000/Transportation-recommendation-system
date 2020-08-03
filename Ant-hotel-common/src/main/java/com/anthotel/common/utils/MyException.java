package com.anthotel.common.utils;

/**
 * 或者继承RuntimeException（运行时异常）
 */
public class MyException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     *  // 提供无参数的构造方法
     */
    public MyException() {
    }

    /**
     *  // 提供一个有参数的构造方法，可自动生成
     * @param msg
     */
    public MyException(String msg) {
        // 把参数传递给Throwable的带String参数的构造方法
        super(msg);
    }

}
