package com.springcloud.zuul;

import java.util.regex.Pattern;

/**
 * @author wangchang
 * @date 2020/4/2 15:28
 */
public class test {
    public static void main(String[] args) {
       String str="";
       /*if(str.equals("")||str==null){
           str="0";
       }*/
       if(isInteger(str)){
           System.out.println(str);
       }

    }
    public static boolean isInteger(String str){
        if(str==null){
            return false;
        }
        Pattern pattern=Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
}
