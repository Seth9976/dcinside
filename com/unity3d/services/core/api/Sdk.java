package com.unity3d.services.core.api;

import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Sdk {
    @WebViewExposed
    public static void downloadLatestWebView(WebViewCallback webViewCallback0) {
        DeviceLog.debug("Unity Ads init: WebView called download");
        webViewCallback0.invoke(new Object[]{InitializeThread.downloadLatestWebView().getValue()});
    }

    @WebViewExposed
    public static void getDebugMode(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.FALSE});
    }

    @WebViewExposed
    public static void getSharedSessionID(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{"696eddde-f7ef-4952-b974-0dd76719ea6b"});
    }

    @WebViewExposed
    public static void getTrrData(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{WebViewApp.getCurrentApp().getConfiguration().getRawConfigData().toString()});
    }

    @WebViewExposed
    public static void initComplete(WebViewCallback webViewCallback0) {
        DeviceLog.debug("Web Application initialized");
        SdkProperties.setInitialized(true);
        WebViewApp.getCurrentApp().setWebAppInitialized(true);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void initError(String s, Integer integer0, WebViewCallback webViewCallback0) {
        WebViewApp.getCurrentApp().setWebAppFailureMessage(s);
        WebViewApp.getCurrentApp().setWebAppFailureCode(((int)integer0));
        WebViewApp.getCurrentApp().setWebAppInitialized(false);
        webViewCallback0.invoke(new Object[0]);
    }

    // 去混淆评级： 低(20)
    @WebViewExposed
    public static void loadComplete(WebViewCallback webViewCallback0) {
        DeviceLog.debug("Web Application loaded");
        WebViewApp.getCurrentApp().setWebAppLoaded(true);
        String s = ClientProperties.getAppVersion();
        Boolean boolean0 = Boolean.valueOf(ClientProperties.isAppDebuggable());
        String s1 = WebViewApp.getCurrentApp().getConfiguration().getWebViewUrl();
        String s2 = WebViewApp.getCurrentApp().getConfiguration().getWebViewVersion();
        Long long0 = Device.getElapsedRealtime();
        webViewCallback0.invoke(new Object[]{ClientProperties.getGameId(), Boolean.FALSE, "", s, 41401, "4.14.1", boolean0, "https://configv2.unityads.unity3d.com/webview/4.14.1/release/config.json", s1, WebViewApp.getCurrentApp().getConfiguration().getWebViewHash(), s2, 0L, Boolean.FALSE, Boolean.TRUE, Boolean.valueOf(SdkProperties.getLatestConfiguration() != null), long0, "", "unknown"});
    }

    @WebViewExposed
    public static void logDebug(String s, WebViewCallback webViewCallback0) {
        DeviceLog.debug(s);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void logError(String s, WebViewCallback webViewCallback0) {
        DeviceLog.error(s);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void logInfo(String s, WebViewCallback webViewCallback0) {
        DeviceLog.info(s);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void logWarning(String s, WebViewCallback webViewCallback0) {
        DeviceLog.warning(s);
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void reinitialize(WebViewCallback webViewCallback0) {
        SdkProperties.setReinitialized(true);
        InitializeThread.initialize(WebViewApp.getCurrentApp().getConfiguration());
    }

    @WebViewExposed
    public static void setDebugMode(Boolean boolean0, WebViewCallback webViewCallback0) {
        SdkProperties.setDebugMode(boolean0.booleanValue());
        webViewCallback0.invoke(new Object[0]);
    }
}

