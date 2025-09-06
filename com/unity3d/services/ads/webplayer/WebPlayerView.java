package com.unity3d.services.ads.webplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WebPlayerView extends WebView {
    class JavaScriptInvocation implements Runnable {
        private String _jsString;
        private WebView _webView;

        public JavaScriptInvocation(String s, WebView webView0) {
            this._jsString = s;
            this._webView = webView0;
        }

        @Override
        public void run() {
            if(this._jsString != null) {
                try {
                    WebPlayerView.this._evaluateJavascript.invoke(this._webView, this._jsString, null);
                }
                catch(Exception exception0) {
                    DeviceLog.exception("Error while processing JavaScriptString", exception0);
                }
                return;
            }
            DeviceLog.error("Could not process JavaScript, the string is NULL");
        }
    }

    @TargetApi(21)
    class WebPlayerChromeClient extends WebChromeClient {
        private WebPlayerChromeClient() {
        }

        WebPlayerChromeClient(com.unity3d.services.ads.webplayer.WebPlayerView.1 webPlayerView$10) {
        }

        @Override  // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView0) {
            if(WebPlayerView.this.shouldCallSuper("onCloseWindow")) {
                super.onCloseWindow(webView0);
            }
            if(WebPlayerView.this.shouldSendEvent("onCloseWindow")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CLOSE_WINDOW, new Object[]{WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage0) {
            Boolean boolean0 = WebPlayerView.this.shouldCallSuper("onConsoleMessage") ? Boolean.valueOf(super.onConsoleMessage(consoleMessage0)) : Boolean.FALSE;
            if(WebPlayerView.this.shouldSendEvent("onConsoleMessage")) {
                String s = consoleMessage0 == null ? "" : consoleMessage0.message();
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CONSOLE_MESSAGE, new Object[]{s, WebPlayerView.this.viewId});
            }
            if(WebPlayerView.this.hasReturnValue("onConsoleMessage")) {
                boolean0 = (Boolean)WebPlayerView.this.getReturnValue("onConsoleMessage", Boolean.class, Boolean.TRUE);
            }
            return boolean0.booleanValue();
        }

        @Override  // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView0, boolean z, boolean z1, Message message0) {
            Boolean boolean0 = WebPlayerView.this.shouldCallSuper("onCreateWindow") ? Boolean.valueOf(super.onCreateWindow(webView0, z, z1, message0)) : Boolean.FALSE;
            if(WebPlayerView.this.shouldSendEvent("onCreateWindow")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CREATE_WINDOW, new Object[]{Boolean.valueOf(z), Boolean.valueOf(z1), message0, WebPlayerView.this.viewId});
            }
            if(WebPlayerView.this.hasReturnValue("onCreateWindow")) {
                boolean0 = (Boolean)WebPlayerView.this.getReturnValue("onCreateWindow", Boolean.class, Boolean.FALSE);
            }
            return boolean0.booleanValue();
        }

        @Override  // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String s, GeolocationPermissions.Callback geolocationPermissions$Callback0) {
            if(WebPlayerView.this.shouldCallSuper("onGeolocationPermissionsShowPrompt")) {
                super.onGeolocationPermissionsShowPrompt(s, geolocationPermissions$Callback0);
            }
            if(WebPlayerView.this.shouldSendEvent("onGeolocationPermissionsShowPrompt")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.GEOLOCATION_PERMISSIONS_SHOW, new Object[]{s, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if(WebPlayerView.this.shouldCallSuper("onHideCustomView")) {
                super.onHideCustomView();
            }
            if(WebPlayerView.this.shouldSendEvent("onHideCustomView")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.HIDE_CUSTOM_VIEW, new Object[]{WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView0, String s, String s1, JsResult jsResult0) {
            Boolean boolean0 = WebPlayerView.this.shouldCallSuper("onJsAlert") ? Boolean.valueOf(super.onJsAlert(webView0, s, s1, jsResult0)) : Boolean.FALSE;
            if(WebPlayerView.this.shouldSendEvent("onJsAlert")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.JS_ALERT, new Object[]{s, s1, jsResult0, WebPlayerView.this.viewId});
            }
            if(WebPlayerView.this.hasReturnValue("onJsAlert")) {
                boolean0 = (Boolean)WebPlayerView.this.getReturnValue("onJsAlert", Boolean.class, Boolean.TRUE);
            }
            return boolean0.booleanValue();
        }

        @Override  // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView0, String s, String s1, JsResult jsResult0) {
            Boolean boolean0 = WebPlayerView.this.shouldCallSuper("onJsConfirm") ? Boolean.valueOf(super.onJsConfirm(webView0, s, s1, jsResult0)) : Boolean.FALSE;
            if(WebPlayerView.this.shouldSendEvent("onJsConfirm")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.JS_CONFIRM, new Object[]{s, s1, WebPlayerView.this.viewId});
            }
            if(WebPlayerView.this.hasReturnValue("onJsConfirm")) {
                boolean0 = (Boolean)WebPlayerView.this.getReturnValue("onJsConfirm", Boolean.class, Boolean.TRUE);
            }
            return boolean0.booleanValue();
        }

        @Override  // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView0, String s, String s1, String s2, JsPromptResult jsPromptResult0) {
            Boolean boolean0 = WebPlayerView.this.shouldCallSuper("onJsPrompt") ? Boolean.valueOf(super.onJsPrompt(webView0, s, s1, s2, jsPromptResult0)) : Boolean.FALSE;
            if(WebPlayerView.this.shouldSendEvent("onJsPrompt")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.JS_PROMPT, new Object[]{s, s1, s2, WebPlayerView.this.viewId});
            }
            if(WebPlayerView.this.hasReturnValue("onJsPrompt")) {
                boolean0 = (Boolean)WebPlayerView.this.getReturnValue("onJsPrompt", Boolean.class, Boolean.TRUE);
            }
            return boolean0.booleanValue();
        }

        @Override  // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest0) {
            if(WebPlayerView.this.shouldCallSuper("onPermissionRequest")) {
                super.onPermissionRequest(permissionRequest0);
            }
            if(WebPlayerView.this.shouldSendEvent("onPermissionRequest")) {
                String s = permissionRequest0 == null || permissionRequest0.getOrigin() == null ? "" : permissionRequest0.getOrigin().toString();
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PERMISSION_REQUEST, new Object[]{s, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView0, int v) {
            if(WebPlayerView.this.shouldCallSuper("onProgressChanged")) {
                super.onProgressChanged(webView0, v);
            }
            if(WebPlayerView.this.shouldSendEvent("onProgressChanged")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PROGRESS_CHANGED, new Object[]{v, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebChromeClient
        public void onReceivedIcon(WebView webView0, Bitmap bitmap0) {
            if(WebPlayerView.this.shouldCallSuper("onReceivedIcon")) {
                super.onReceivedIcon(webView0, bitmap0);
            }
            if(WebPlayerView.this.shouldSendEvent("onReceivedIcon")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.RECEIVED_ICON, new Object[]{WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView0, String s) {
            if(WebPlayerView.this.shouldCallSuper("onReceivedTitle")) {
                super.onReceivedTitle(webView0, s);
            }
            if(WebPlayerView.this.shouldSendEvent("onReceivedTitle")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.RECEIVED_TITLE, new Object[]{s, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebChromeClient
        public void onReceivedTouchIconUrl(WebView webView0, String s, boolean z) {
            if(WebPlayerView.this.shouldCallSuper("onReceivedTouchIconUrl")) {
                super.onReceivedTouchIconUrl(webView0, s, z);
            }
            if(WebPlayerView.this.shouldSendEvent("onReceivedTouchIconUrl")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.RECEIVED_TOUCH_ICON_URL, new Object[]{s, Boolean.valueOf(z), WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebChromeClient
        public void onRequestFocus(WebView webView0) {
            if(WebPlayerView.this.shouldCallSuper("onRequestFocus")) {
                super.onRequestFocus(webView0);
            }
            if(WebPlayerView.this.shouldSendEvent("onRequestFocus")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.REQUEST_FOCUS, new Object[]{WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebChromeClient
        public void onShowCustomView(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
            if(WebPlayerView.this.shouldCallSuper("onShowCustomView")) {
                super.onShowCustomView(view0, webChromeClient$CustomViewCallback0);
            }
            if(WebPlayerView.this.shouldSendEvent("onShowCustomView")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOW_CUSTOM_VIEW, new Object[]{WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView0, ValueCallback valueCallback0, WebChromeClient.FileChooserParams webChromeClient$FileChooserParams0) {
            Boolean boolean0 = WebPlayerView.this.shouldCallSuper("onShowFileChooser") ? Boolean.valueOf(super.onShowFileChooser(webView0, valueCallback0, webChromeClient$FileChooserParams0)) : Boolean.FALSE;
            if(WebPlayerView.this.shouldSendEvent("onShowFileChooser")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOW_FILE_CHOOSER, new Object[]{WebPlayerView.this.viewId});
            }
            if(WebPlayerView.this.hasReturnValue("onShowFileChooser")) {
                boolean0 = (Boolean)WebPlayerView.this.getReturnValue("onShowFileChooser", Boolean.class, Boolean.TRUE);
                if(boolean0.booleanValue()) {
                    valueCallback0.onReceiveValue(null);
                }
            }
            return boolean0.booleanValue();
        }
    }

    class WebPlayerClient extends WebViewClient {
        private WebPlayerClient() {
        }

        WebPlayerClient(com.unity3d.services.ads.webplayer.WebPlayerView.1 webPlayerView$10) {
        }

        @Override  // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView0, Message message0, Message message1) {
            if(WebPlayerView.this.shouldCallSuper("onFormResubmission")) {
                super.onFormResubmission(webView0, message0, message1);
            }
            if(WebPlayerView.this.shouldSendEvent("onFormResubmission")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.FORM_RESUBMISSION, new Object[]{WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onLoadResource(WebView webView0, String s) {
            if(WebPlayerView.this.shouldCallSuper("onLoadResource")) {
                super.onLoadResource(webView0, s);
            }
            if(WebPlayerView.this.shouldSendEvent("onLoadResource")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.LOAD_RESOUCE, new Object[]{s, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView0, String s) {
            if(WebPlayerView.this.shouldCallSuper("onPageCommitVisible")) {
                super.onPageCommitVisible(webView0, s);
            }
            if(WebPlayerView.this.shouldSendEvent("onPageCommitVisible")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PAGE_COMMIT_VISIBLE, new Object[]{s, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            if(WebPlayerView.this.shouldCallSuper("onPageFinished")) {
                super.onPageFinished(webView0, s);
            }
            if(WebPlayerView.this.shouldSendEvent("onPageFinished")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PAGE_FINISHED, new Object[]{s, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
            if(WebPlayerView.this.shouldCallSuper("onPageStarted")) {
                super.onPageStarted(webView0, s, bitmap0);
            }
            if(WebPlayerView.this.shouldSendEvent("onPageStarted")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PAGE_STARTED, new Object[]{s, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedClientCertRequest(WebView webView0, ClientCertRequest clientCertRequest0) {
            int v;
            String s;
            if(WebPlayerView.this.shouldCallSuper("onReceivedClientCertRequest")) {
                super.onReceivedClientCertRequest(webView0, clientCertRequest0);
            }
            if(WebPlayerView.this.shouldSendEvent("onReceivedClientCertRequest")) {
                if(clientCertRequest0 == null) {
                    s = "";
                    v = -1;
                }
                else {
                    s = clientCertRequest0.getHost();
                    v = clientCertRequest0.getPort();
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CLIENT_CERT_REQUEST, new Object[]{s, v, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedError(WebView webView0, int v, String s, String s1) {
            if(WebPlayerView.this.shouldCallSuper("onReceivedError")) {
                super.onReceivedError(webView0, v, s, s1);
            }
            if(WebPlayerView.this.shouldSendEvent("onReceivedError")) {
                WebPlayerEventBridge.error(WebPlayerView.this.viewId, s1, s);
            }
        }

        @Override  // android.webkit.WebViewClient
        @TargetApi(25)
        public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
            if(WebPlayerView.this.shouldCallSuper("onReceivedError")) {
                super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
            }
            String s = "";
            if(WebPlayerView.this.shouldSendEvent("onReceivedError")) {
                String s1 = webResourceError0 == null || webResourceError0.getDescription() == null ? "" : webResourceError0.getDescription().toString();
                if(webResourceRequest0 != null && webResourceRequest0.getUrl() != null) {
                    s = webResourceRequest0.getUrl().toString();
                }
                WebPlayerEventBridge.error(WebPlayerView.this.viewId, s, s1);
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView0, HttpAuthHandler httpAuthHandler0, String s, String s1) {
            if(WebPlayerView.this.shouldCallSuper("onReceivedHttpAuthRequest")) {
                super.onReceivedHttpAuthRequest(webView0, httpAuthHandler0, s, s1);
            }
            if(WebPlayerView.this.shouldSendEvent("onReceivedHttpAuthRequest")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.HTTP_AUTH_REQUEST, new Object[]{s, s1, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
            int v;
            if(WebPlayerView.this.shouldCallSuper("onReceivedHttpError")) {
                super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
            }
            String s = "";
            if(WebPlayerView.this.shouldSendEvent("onReceivedHttpError")) {
                String s1 = webResourceRequest0 == null || webResourceRequest0.getUrl() == null ? "" : webResourceRequest0.getUrl().toString();
                if(webResourceResponse0 == null) {
                    v = -1;
                }
                else {
                    v = webResourceResponse0.getStatusCode();
                    s = webResourceResponse0.getReasonPhrase();
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.HTTP_ERROR, new Object[]{s1, s, v, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView0, String s, String s1, String s2) {
            if(WebPlayerView.this.shouldCallSuper("onReceivedLoginRequest")) {
                super.onReceivedLoginRequest(webView0, s, s1, s2);
            }
            if(WebPlayerView.this.shouldSendEvent("onReceivedLoginRequest")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.LOGIN_REQUEST, new Object[]{s, s1, s2, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        @TargetApi(14)
        public void onReceivedSslError(WebView webView0, SslErrorHandler sslErrorHandler0, SslError sslError0) {
            super.onReceivedSslError(webView0, sslErrorHandler0, sslError0);
            if(sslError0 == null) {
                DeviceLog.error("Received unknown SSL error: SslError was null");
            }
            else {
                DeviceLog.error("Received SSL error for \'%s\': %s", new Object[]{sslError0.getUrl(), sslError0.toString()});
            }
            if(WebPlayerView.this.shouldSendEvent("onReceivedSslError")) {
                String s = sslError0 == null ? "" : sslError0.getUrl();
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SSL_ERROR, new Object[]{s, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    ViewUtilities.removeViewFromParent(webView0);
                    webView0.destroy();
                }
            });
            String s = WebPlayerView.this.getUrl();
            WebPlayerEventBridge.error(WebPlayerView.this.viewId, s, "UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail0.toString());
            DeviceLog.error(("UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail0.toString()));
            return true;
        }

        @Override  // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView0, float f, float f1) {
            if(WebPlayerView.this.shouldCallSuper("onScaleChanged")) {
                super.onScaleChanged(webView0, f, f1);
            }
            if(WebPlayerView.this.shouldSendEvent("onScaleChanged")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SCALE_CHANGED, new Object[]{f, f1, WebPlayerView.this.viewId});
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView0, KeyEvent keyEvent0) {
            if(WebPlayerView.this.shouldCallSuper("onUnhandledKeyEvent")) {
                super.onUnhandledKeyEvent(webView0, keyEvent0);
            }
            if(WebPlayerView.this.shouldSendEvent("onUnhandledKeyEvent")) {
                Object[] arr_object = {keyEvent0.getKeyCode(), keyEvent0.getAction(), WebPlayerView.this.viewId};
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.UNHANDLED_KEY_EVENT, arr_object);
            }
        }

        @Override  // android.webkit.WebViewClient
        @TargetApi(21)
        public WebResourceResponse shouldInterceptRequest(WebView webView0, WebResourceRequest webResourceRequest0) {
            WebResourceResponse webResourceResponse0 = WebPlayerView.this.shouldCallSuper("shouldInterceptRequest") ? super.shouldInterceptRequest(webView0, webResourceRequest0) : null;
            if(WebPlayerView.this.shouldSendEvent("shouldInterceptRequest")) {
                Object[] arr_object = {webResourceRequest0.getUrl().toString(), WebPlayerView.this.viewId};
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_INTERCEPT_REQUEST, arr_object);
            }
            return webResourceResponse0;
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView0, KeyEvent keyEvent0) {
            Boolean boolean0 = WebPlayerView.this.shouldCallSuper("shouldOverrideKeyEvent") ? Boolean.valueOf(super.shouldOverrideKeyEvent(webView0, keyEvent0)) : Boolean.FALSE;
            if(WebPlayerView.this.shouldSendEvent("shouldOverrideKeyEvent")) {
                Object[] arr_object = {keyEvent0.getKeyCode(), keyEvent0.getAction(), WebPlayerView.this.viewId};
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_OVERRIDE_KEY_EVENT, arr_object);
            }
            if(WebPlayerView.this.hasReturnValue("shouldOverrideKeyEvent")) {
                boolean0 = (Boolean)WebPlayerView.this.getReturnValue("shouldOverrideKeyEvent", Boolean.class, Boolean.TRUE);
            }
            return boolean0.booleanValue();
        }

        @Override  // android.webkit.WebViewClient
        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
            Boolean boolean0 = WebPlayerView.this.shouldCallSuper("shouldOverrideUrlLoading") ? Boolean.valueOf(super.shouldOverrideUrlLoading(webView0, webResourceRequest0)) : Boolean.FALSE;
            if(WebPlayerView.this.shouldSendEvent("shouldOverrideUrlLoading")) {
                Object[] arr_object = {webResourceRequest0.getUrl().toString(), webResourceRequest0.getMethod(), WebPlayerView.this.viewId};
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_OVERRIDE_URL_LOADING, arr_object);
            }
            if(WebPlayerView.this.hasReturnValue("shouldOverrideUrlLoading")) {
                boolean0 = (Boolean)WebPlayerView.this.getReturnValue("shouldOverrideUrlLoading", Boolean.class, Boolean.TRUE);
            }
            return boolean0.booleanValue();
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            Boolean boolean0 = WebPlayerView.this.shouldCallSuper("shouldOverrideUrlLoading") ? Boolean.valueOf(super.shouldOverrideUrlLoading(webView0, s)) : Boolean.FALSE;
            if(WebPlayerView.this.shouldSendEvent("shouldOverrideUrlLoading")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_OVERRIDE_URL_LOADING, new Object[]{s, WebPlayerView.this.viewId});
            }
            if(WebPlayerView.this.hasReturnValue("shouldOverrideUrlLoading")) {
                boolean0 = (Boolean)WebPlayerView.this.getReturnValue("shouldOverrideUrlLoading", Boolean.class, Boolean.TRUE);
            }
            return boolean0.booleanValue();
        }
    }

    class WebPlayerDownloadListener implements DownloadListener {
        private WebPlayerDownloadListener() {
        }

        WebPlayerDownloadListener(com.unity3d.services.ads.webplayer.WebPlayerView.1 webPlayerView$10) {
        }

        @Override  // android.webkit.DownloadListener
        public void onDownloadStart(String s, String s1, String s2, String s3, long v) {
            if(WebPlayerView.this.shouldSendEvent("onDownloadStart")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.DOWNLOAD_START, new Object[]{s, s1, s2, s3, v, WebPlayerView.this.viewId});
            }
        }
    }

    private Map _erroredSettings;
    private Method _evaluateJavascript;
    private JSONObject _eventSettings;
    private Runnable _unsubscribeLayoutChange;
    private String viewId;

    public WebPlayerView(Context context0, String s, JSONObject jSONObject0, JSONObject jSONObject1) {
        super(context0);
        this._evaluateJavascript = null;
        this._unsubscribeLayoutChange = null;
        this.viewId = s;
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setAllowFileAccessFromFileURLs(false);
        webSettings0.setAllowUniversalAccessFromFileURLs(false);
        try {
            this._evaluateJavascript = WebView.class.getMethod("evaluateJavascript", String.class, ValueCallback.class);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            DeviceLog.exception("Method evaluateJavascript not found", noSuchMethodException0);
            this._evaluateJavascript = null;
        }
        webSettings0.setCacheMode(2);
        webSettings0.setDatabaseEnabled(false);
        webSettings0.setDomStorageEnabled(false);
        webSettings0.setGeolocationEnabled(false);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setLoadsImagesAutomatically(true);
        webSettings0.setPluginState(WebSettings.PluginState.OFF);
        webSettings0.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        webSettings0.setSaveFormData(false);
        webSettings0.setSavePassword(false);
        this.setHorizontalScrollBarEnabled(false);
        this.setVerticalScrollBarEnabled(false);
        this.setInitialScale(0);
        this.setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        this.setBackgroundResource(0);
        this.setSettings(jSONObject0, jSONObject1);
        this.setWebViewClient(new WebPlayerClient(this, null));
        this.setWebChromeClient(new WebPlayerChromeClient(this, null));
        this.setDownloadListener(new WebPlayerDownloadListener(this, null));
        this.addJavascriptInterface(new WebPlayerBridgeInterface(s), "webplayerbridge");
        WebPlayerViewCache.getInstance().addWebPlayer(s, this);
        this.subscribeOnLayoutChange();
    }

    private void addErroredSetting(String s, String s1) {
        if(this._erroredSettings == null) {
            this._erroredSettings = new HashMap();
        }
        this._erroredSettings.put(s, s1);
    }

    @Override  // android.webkit.WebView
    public void destroy() {
        super.destroy();
        WebPlayerViewCache.getInstance().removeWebPlayer(this.viewId);
        Runnable runnable0 = this._unsubscribeLayoutChange;
        if(runnable0 != null) {
            runnable0.run();
        }
    }

    public Map getErroredSettings() {
        return this._erroredSettings;
    }

    public Class getPrimitiveClass(Class class0) {
        String s = class0.getName();
        if(s.equals("java.lang.Byte")) {
            return Byte.TYPE;
        }
        if(s.equals("java.lang.Short")) {
            return Short.TYPE;
        }
        if(s.equals("java.lang.Integer")) {
            return Integer.TYPE;
        }
        if(s.equals("java.lang.Long")) {
            return Long.TYPE;
        }
        if(s.equals("java.lang.Character")) {
            return Character.TYPE;
        }
        if(s.equals("java.lang.Float")) {
            return Float.TYPE;
        }
        if(s.equals("java.lang.Double")) {
            return Double.TYPE;
        }
        if(s.equals("java.lang.Boolean")) {
            return Boolean.TYPE;
        }
        return s.equals("java.lang.Void") ? Void.TYPE : class0;
    }

    private Object getReturnValue(String s, Class class0, Object object0) {
        try {
            if(this._eventSettings != null && this._eventSettings.has(s) && this._eventSettings.getJSONObject(s).has("returnValue")) {
                return class0.cast(this._eventSettings.getJSONObject(s).get("returnValue"));
            }
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error getting default return value", exception0);
        }
        return object0;
    }

    private Class[] getTypes(JSONArray jSONArray0) throws JSONException, ClassNotFoundException {
        if(jSONArray0 == null) {
            return null;
        }
        Class[] arr_class = new Class[jSONArray0.length()];
        for(int v = 0; v < jSONArray0.length(); ++v) {
            arr_class[v] = jSONArray0.get(v) instanceof JSONObject ? Class.forName(((JSONObject)jSONArray0.get(v)).getString("className")) : this.getPrimitiveClass(jSONArray0.get(v).getClass());
        }
        return arr_class;
    }

    private Object[] getValues(JSONArray jSONArray0) throws JSONException, ClassNotFoundException, NoSuchMethodException {
        if(jSONArray0 == null) {
            return null;
        }
        Object[] arr_object = new Object[jSONArray0.length()];
        Object[] arr_object1 = new Object[jSONArray0.length()];
        for(int v = 0; v < jSONArray0.length(); ++v) {
            if(jSONArray0.get(v) instanceof JSONObject) {
                JSONObject jSONObject0 = (JSONObject)jSONArray0.get(v);
                Object object0 = jSONObject0.get("value");
                String s = jSONObject0.getString("type");
                String s1 = jSONObject0.has("className") ? jSONObject0.getString("className") : null;
                if(s1 != null && s.equals("Enum")) {
                    arr_object1[v] = Enum.valueOf(Class.forName(s1), ((String)object0));
                }
            }
            else {
                arr_object1[v] = jSONArray0.get(v);
            }
        }
        System.arraycopy(arr_object1, 0, arr_object, 0, jSONArray0.length());
        return arr_object;
    }

    private boolean hasReturnValue(String s) {
        try {
            if(this._eventSettings != null && this._eventSettings.has(s) && this._eventSettings.getJSONObject(s).has("returnValue")) {
                return true;
            }
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error getting default return value", exception0);
        }
        return false;
    }

    public void invokeJavascript(String s) {
        Utilities.runOnUiThread(new JavaScriptInvocation(this, s, this));
    }

    // 检测为 Lambda 实现
    public void onLayoutChange() [...]

    @Override  // android.webkit.WebView
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.onLayoutChange();
    }

    public void sendEvent(JSONArray jSONArray0) {
        this.invokeJavascript("javascript:window.nativebridge.receiveEvent(" + jSONArray0.toString() + ")");
    }

    public void setEventSettings(JSONObject jSONObject0) {
        this._eventSettings = jSONObject0;
    }

    public void setSettings(JSONObject jSONObject0, JSONObject jSONObject1) {
        Map map0 = this._erroredSettings;
        if(map0 != null) {
            map0.clear();
        }
        this.setTargetSettings(this.getSettings(), jSONObject0);
        this.setTargetSettings(this, jSONObject1);
    }

    private Object setTargetSettings(Object object0, JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                String s = (String)object1;
                try {
                    JSONArray jSONArray0 = jSONObject0.getJSONArray(s);
                    Class[] arr_class = this.getTypes(jSONArray0);
                    object0.getClass().getMethod(s, arr_class).invoke(object0, this.getValues(jSONArray0));
                }
                catch(Exception exception0) {
                    this.addErroredSetting(s, exception0.getMessage());
                    DeviceLog.exception("Setting errored", exception0);
                }
            }
        }
        return object0;
    }

    private boolean shouldCallSuper(String s) {
        try {
            if(this._eventSettings != null && this._eventSettings.has(s) && this._eventSettings.getJSONObject(s).has("callSuper")) {
                return this._eventSettings.getJSONObject(s).getBoolean("callSuper");
            }
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error getting super call status", exception0);
        }
        return true;
    }

    private boolean shouldSendEvent(String s) {
        try {
            if(this._eventSettings != null && this._eventSettings.has(s) && this._eventSettings.getJSONObject(s).has("sendEvent")) {
                return this._eventSettings.getJSONObject(s).getBoolean("sendEvent");
            }
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error getting send event status", exception0);
        }
        return false;
    }

    private void subscribeOnLayoutChange() {
        Runnable runnable0 = this._unsubscribeLayoutChange;
        if(runnable0 != null) {
            runnable0.run();
        }
        com.unity3d.services.ads.webplayer.WebPlayerView.1 webPlayerView$10 = (/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */) -> {
            int[] arr_v = new int[2];
            WebPlayerView.this.getLocationOnScreen(arr_v);
            int v = arr_v[0];
            int v1 = arr_v[1];
            int v2 = WebPlayerView.this.getWidth();
            int v3 = WebPlayerView.this.getHeight();
            float f = WebPlayerView.this.getAlpha();
            WebPlayerEventBridge.sendFrameUpdate(WebPlayerView.this.viewId, v, v1, v2, v3, f);
        };
        this.addOnLayoutChangeListener(webPlayerView$10);
        this._unsubscribeLayoutChange = new Runnable() {
            @Override
            public void run() {
                WebPlayerView.this.removeOnLayoutChangeListener(webPlayerView$10);
            }
        };

        class com.unity3d.services.ads.webplayer.WebPlayerView.1 implements View.OnLayoutChangeListener {
            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                WebPlayerView.this.onLayoutChange();
            }
        }

    }
}

