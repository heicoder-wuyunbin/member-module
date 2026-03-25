package com.quadra.member.common;

import java.time.LocalDateTime;

import lombok.Data;


@Data
public class Result<T> {
    private int code;
    private boolean flag;
    private String message;
    private T data;
    private LocalDateTime timestamp;

    public static  <T>  Result  success(T data){
        Result result=new Result<>();
        result.setCode(20000);
        result.setFlag(true);
        result.setMessage("success");
        result.setTimestamp(LocalDateTime.now());
        result.setData(data);
        return result;
    }


      public static  <T>  Result  fail(){
        Result result=new Result<>();
        result.setCode(-1);
        result.setFlag(false);
        result.setMessage("fail");
        result.setTimestamp(LocalDateTime.now());
        result.setData(null);
        return result;
    }

}
