package com.unity3d.services.core.api;

import com.unity3d.services.core.sensorinfo.SensorInfoError;
import com.unity3d.services.core.sensorinfo.SensorInfoListener;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONObject;

public class SensorInfo {
    @WebViewExposed
    public static void getAccelerometerData(WebViewCallback webViewCallback0) {
        JSONObject jSONObject0 = SensorInfoListener.getAccelerometerData();
        if(jSONObject0 != null) {
            webViewCallback0.invoke(new Object[]{jSONObject0});
            return;
        }
        webViewCallback0.error(SensorInfoError.ACCELEROMETER_DATA_NOT_AVAILABLE, new Object[0]);
    }

    @WebViewExposed
    public static void isAccelerometerActive(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.FALSE});
    }

    @WebViewExposed
    public static void startAccelerometerUpdates(Integer integer0, WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(SensorInfoListener.startAccelerometerListener(((int)integer0)))});
    }

    @WebViewExposed
    public static void stopAccelerometerUpdates(WebViewCallback webViewCallback0) {
        SensorInfoListener.stopAccelerometerListener();
        webViewCallback0.invoke(new Object[0]);
    }
}

