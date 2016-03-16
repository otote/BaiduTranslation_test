package com.example.mrlu.baidutranslation_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_input;
    TextView tv_translate;

    //百度api的相关信息
    private final  String appId = "20160316000015704";
    private final  String password = "o8X_F27SJAN6a4kAFZGA";
    private final  String request = "http://api.fanyi.baidu.com/api/trans/vip/translate";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
}
