package com.example.mrlu.baidutranslation_test;

import
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import 	javax.net.ssl.HttpsURLConnection;

/**
 * Created by Mr Lu on 2016/3/17 0017.
 */
public class BaiduTranslation {

    private static final String UTF8 = "utf-8";

    //申请者开发者id，实际使用时请修改成开发者自己的appid
    private static final String appId = "20160316000015704";

    private static final String password = "o8X_F27SJAN6a4kAFZGA";


    //申请成功后的证书token，实际使用时请修改成开发者自己的token
    private static final String token = "12345678";

    private static final String url = "http://api.fanyi.baidu.com/api/trans/vip/translate";

    //随机数，用于生成md5值，开发者使用时请激活下边第四行代码
    private static final Random random = new Random();

    public String translate(String q) throws Exception {
        //用于md5加密
        int salt = random.nextInt(10000);
        //本演示使用指定的随机数为1435660288

        // 对appId+源文+随机数+token计算md5值
        String md5String = appId + q + salt + password;


        String text = getMD5(md5String);

        BasicNameValuePair
    }




    public static String getMD5(String val) throws NoSuchAlgorithmException {
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