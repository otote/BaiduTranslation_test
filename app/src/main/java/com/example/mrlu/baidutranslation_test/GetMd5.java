package com.example.mrlu.baidutranslation_test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Mr Lu on 2016/3/17 0017.
 */
public class GetMd5 {
    //传入需要进行md5加密的字符串
    public static String getMD5(String val) throws NoSuchAlgorithmException {
        //
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(val.getBytes());
        byte[] m = md5.digest();//加密
        return getString(m);
    }
    private static String getString(byte[] b){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < b.length; i ++){
            sb.append(b[i]);
        }
        return sb.toString();
    }
}
