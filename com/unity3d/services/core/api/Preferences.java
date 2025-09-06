package com.unity3d.services.core.api;

import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.preferences.PreferencesError;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Preferences {
    @WebViewExposed
    public static void getBoolean(String s, String s1, WebViewCallback webViewCallback0) {
        Boolean boolean0 = AndroidPreferences.getBoolean(s, s1);
        if(boolean0 != null) {
            webViewCallback0.invoke(new Object[]{boolean0});
            return;
        }
        webViewCallback0.error(PreferencesError.COULDNT_GET_VALUE, new Object[]{s, s1});
    }

    @WebViewExposed
    public static void getFloat(String s, String s1, WebViewCallback webViewCallback0) {
        Float float0 = AndroidPreferences.getFloat(s, s1);
        if(float0 != null) {
            webViewCallback0.invoke(new Object[]{float0});
            return;
        }
        webViewCallback0.error(PreferencesError.COULDNT_GET_VALUE, new Object[]{s, s1});
    }

    @WebViewExposed
    public static void getInt(String s, String s1, WebViewCallback webViewCallback0) {
        Integer integer0 = AndroidPreferences.getInteger(s, s1);
        if(integer0 != null) {
            webViewCallback0.invoke(new Object[]{integer0});
            return;
        }
        webViewCallback0.error(PreferencesError.COULDNT_GET_VALUE, new Object[]{s, s1});
    }

    @WebViewExposed
    public static void getLong(String s, String s1, WebViewCallback webViewCallback0) {
        Long long0 = AndroidPreferences.getLong(s, s1);
        if(long0 != null) {
            webViewCallback0.invoke(new Object[]{long0});
            return;
        }
        webViewCallback0.error(PreferencesError.COULDNT_GET_VALUE, new Object[]{s, s1});
    }

    @WebViewExposed
    public static void getString(String s, String s1, WebViewCallback webViewCallback0) {
        String s2 = AndroidPreferences.getString(s, s1);
        if(s2 != null) {
            webViewCallback0.invoke(new Object[]{s2});
            return;
        }
        webViewCallback0.error(PreferencesError.COULDNT_GET_VALUE, new Object[]{s, s1});
    }

    @WebViewExposed
    public static void hasKey(String s, String s1, WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(AndroidPreferences.hasKey(s, s1))});
    }

    @WebViewExposed
    public static void removeKey(String s, String s1, WebViewCallback webViewCallback0) {
        AndroidPreferences.removeKey(s, s1);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setBoolean(String s, String s1, Boolean boolean0, WebViewCallback webViewCallback0) {
        AndroidPreferences.setBoolean(s, s1, boolean0);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setFloat(String s, String s1, Double double0, WebViewCallback webViewCallback0) {
        AndroidPreferences.setFloat(s, s1, double0);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setInt(String s, String s1, Integer integer0, WebViewCallback webViewCallback0) {
        AndroidPreferences.setInteger(s, s1, integer0);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setLong(String s, String s1, Long long0, WebViewCallback webViewCallback0) {
        AndroidPreferences.setLong(s, s1, long0);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setString(String s, String s1, String s2, WebViewCallback webViewCallback0) {
        AndroidPreferences.setString(s, s1, s2);
        webViewCallback0.invoke(new Object[0]);
    }
}

