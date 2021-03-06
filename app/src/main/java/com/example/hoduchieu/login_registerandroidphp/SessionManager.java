package com.example.hoduchieu.login_registerandroidphp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by hoduchieu on 12/8/16.
 */

public class SessionManager {
    private static String TAG = SessionManager.class.getName();
    SharedPreferences preferences;
    Context context;
    SharedPreferences.Editor editor;
    private int PRE_MODE = 1;
    private static final String NAME = "android_demo";
    private static final String KEY_LOGIN = "islogin";

    public SessionManager(Context context){
        this.context = context;
        preferences = context.getSharedPreferences(NAME,PRE_MODE);
        editor = preferences.edit();
    }
    public void SetLogin(boolean isLogin){
        editor.putBoolean(KEY_LOGIN,isLogin);
        editor.commit();
    }
    public boolean Check(){
        return preferences.getBoolean(KEY_LOGIN,false);
    }
}
