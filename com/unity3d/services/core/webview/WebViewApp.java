package com.unity3d.services.core.webview;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;

public class WebViewApp implements IWebViewBridgeInvoker {
    static class WebAppClient extends WebViewClient {
        private WebAppClient() {
        }

        WebAppClient(com.unity3d.services.core.webview.WebViewApp.1 webViewApp$10) {
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            super.onPageFinished(webView0, s);
            DeviceLog.debug(("Unity Ads SDK finished loading URL inside WebView: " + s));
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
            super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
            if(Build.VERSION.SDK_INT >= 23 && webResourceRequest0 != null && webResourceError0 != null) {
                DeviceLog.error(("Unity Ads SDK encountered an error (code: " + webResourceError0.getErrorCode() + ")  in WebView while loading a resource " + webResourceRequest0.getUrl()));
                return;
            }
            if(webResourceRequest0 != null) {
                DeviceLog.error(("Unity Ads SDK encountered an error in WebView while loading a resource " + webResourceRequest0.getUrl()));
                return;
            }
            DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource");
        }

        @Override  // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(AdUnit.getAdUnitActivity() != null) {
                        AdUnit.getAdUnitActivity().finish();
                    }
                    if(WebViewApp.getCurrentApp() != null && WebViewApp.getCurrentApp().getWebView() != null) {
                        ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
                    }
                    InitializeThread.reset();
                }
            });
            DeviceLog.error(("UnityAds SDK WebView render process gone with following reason : " + renderProcessGoneDetail0.toString()));
            ((SDKMetricsSender)Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_render_process_gone", null, new HashMap() {
                {
                    RenderProcessGoneDetail renderProcessGoneDetail0 = renderProcessGoneDetail0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    if(Build.VERSION.SDK_INT >= 26) {
                        this.put("dc", "" + renderProcessGoneDetail0.didCrash());
                        this.put("pae", "" + renderProcessGoneDetail0.rendererPriorityAtExit());
                    }
                }
            });
            return true;
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            DeviceLog.debug(("Unity Ads SDK attempts to load URL inside WebView: " + s));
            return false;
        }
    }

    private static final int INVOKE_JS_CHARS_LENGTH = 22;
    private static ConditionVariable _conditionVariable;
    private Configuration _configuration;
    private static WebViewApp _currentApp;
    private static final AtomicReference _initialized;
    private final HashMap _nativeCallbacks;
    private static final AtomicReference _webAppFailureCode;
    private static final AtomicReference _webAppFailureMessage;
    private boolean _webAppLoaded;
    private com.unity3d.services.core.webview.WebView _webView;
    protected final IWebViewBridge _webViewBridge;

    static {
        WebViewApp._initialized = new AtomicReference(Boolean.FALSE);
        WebViewApp._webAppFailureMessage = new AtomicReference();
        WebViewApp._webAppFailureCode = new AtomicReference();
    }

    public WebViewApp() {
        this._webAppLoaded = false;
        this._nativeCallbacks = new HashMap();
        WebViewBridge.setClassTable(new Class[0]);
        this._webViewBridge = SharedInstances.INSTANCE.getWebViewBridge();
        WebViewApp._conditionVariable = new ConditionVariable();
    }

    private WebViewApp(Configuration configuration0, boolean z, boolean z1) {
        this(configuration0, z, z1, SharedInstances.INSTANCE.getWebViewBridge());
    }

    WebViewApp(Configuration configuration0, boolean z, boolean z1, com.unity3d.services.core.webview.WebViewApp.1 webViewApp$10) {
        this(configuration0, z, z1);
    }

    private WebViewApp(Configuration configuration0, boolean z, boolean z1, IWebViewBridge iWebViewBridge0) {
        this._webAppLoaded = false;
        this._nativeCallbacks = new HashMap();
        this.setConfiguration(configuration0);
        WebViewBridge.setClassTable(this.getConfiguration().getWebAppApiClassList());
        IExperiments iExperiments0 = configuration0.getExperiments();
        this._webViewBridge = iWebViewBridge0;
        com.unity3d.services.core.webview.WebView webView0 = z ? new WebViewWithCache(ClientProperties.getApplicationContext(), z1, iExperiments0) : new com.unity3d.services.core.webview.WebView(ClientProperties.getApplicationContext(), z1, SharedInstances.INSTANCE.getWebViewBridge(), SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), iExperiments0);
        this._webView = webView0;
        webView0.setWebViewClient(new WebAppClient(null));
    }

    public void addCallback(NativeCallback nativeCallback0) {
        synchronized(this._nativeCallbacks) {
            this._nativeCallbacks.put(nativeCallback0.getId(), nativeCallback0);
        }
    }

    private String buildInvokeJavascript(String s, String s1, JSONArray jSONArray0) {
        return "javascript:window." + s + "." + s1 + "(" + jSONArray0.toString() + ");";
    }

    public static ErrorState create(Configuration configuration0) throws IllegalThreadStateException {
        return WebViewApp.create(configuration0, false);
    }

    public static ErrorState create(Configuration configuration0, boolean z) throws IllegalThreadStateException {
        DeviceLog.entered();
        if(z) {
            return WebViewApp.createWithRemoteUrl(configuration0);
        }
        if(Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                WebViewApp webViewApp0;
                try {
                    boolean z = configuration0.getExperiments().isWebAssetAdCaching();
                    boolean z1 = configuration0.getExperiments().isWebGestureNotRequired();
                    webViewApp0 = new WebViewApp(configuration0, z, z1, null);
                }
                catch(Exception exception0) {
                    DeviceLog.error(("Unity Ads SDK unable to create WebViewApp " + exception0.getMessage()));
                    WebViewApp._conditionVariable.open();
                    return;
                }
                webViewApp0.getWebView().loadDataWithBaseURL(new WebViewUrlBuilder("file://", configuration0).getUrlWithQueryString(), configuration0.getWebViewData(), "text/html", "UTF-8", null);
                WebViewApp.setCurrentApp(webViewApp0);
            }
        });
        ConditionVariable conditionVariable0 = new ConditionVariable();
        WebViewApp._conditionVariable = conditionVariable0;
        boolean z1 = conditionVariable0.block(configuration0.getWebViewAppCreateTimeout());
        boolean z2 = false;
        boolean z3 = WebViewApp.getCurrentApp() != null;
        if(z3 && WebViewApp.getCurrentApp().isWebAppInitialized()) {
            z2 = true;
        }
        if(z1 && z3 && z2) {
            return null;
        }
        if(!z1) {
            return ErrorState.CreateWebviewTimeout;
        }
        return WebViewApp.getCurrentApp() == null ? ErrorState.CreateWebview : WebViewApp.getCurrentApp().getErrorStateFromWebAppCode();
    }

    private static ErrorState createWithRemoteUrl(Configuration configuration0) {
        if(Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                WebViewApp webViewApp0;
                try {
                    boolean z = configuration0.getExperiments().isWebGestureNotRequired();
                    webViewApp0 = new WebViewApp(configuration0, true, z, null);
                }
                catch(Exception unused_ex) {
                    DeviceLog.error("Unity Ads SDK unable to create WebViewApp");
                    WebViewApp._conditionVariable.open();
                    return;
                }
                webViewApp0.getWebView().loadUrl(new WebViewUrlBuilder(configuration0.getWebViewUrl(), configuration0).getUrlWithQueryString());
                WebViewApp.setCurrentApp(webViewApp0);
            }
        });
        ConditionVariable conditionVariable0 = new ConditionVariable();
        WebViewApp._conditionVariable = conditionVariable0;
        boolean z = conditionVariable0.block(configuration0.getWebViewAppCreateTimeout());
        boolean z1 = false;
        boolean z2 = WebViewApp.getCurrentApp() != null;
        if(z2 && WebViewApp.getCurrentApp().isWebAppInitialized()) {
            z1 = true;
        }
        if(z && z2 && z1) {
            return null;
        }
        if(!z) {
            return ErrorState.CreateWebviewTimeout;
        }
        return WebViewApp.getCurrentApp() == null ? ErrorState.CreateWebview : WebViewApp.getCurrentApp().getErrorStateFromWebAppCode();
    }

    public NativeCallback getCallback(String s) {
        synchronized(this._nativeCallbacks) {
        }
        return (NativeCallback)this._nativeCallbacks.get(s);
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public static WebViewApp getCurrentApp() {
        return WebViewApp._currentApp;
    }

    public ErrorState getErrorStateFromWebAppCode() {
        int v = this.getWebAppFailureCode();
        if(v == 1) {
            return ErrorState.CreateWebviewGameIdDisabled;
        }
        switch(v) {
            case 2: {
                return ErrorState.CreateWebviewConfigError;
            }
            case 3: {
                return ErrorState.CreateWebviewInvalidArgument;
            }
            default: {
                return ErrorState.CreateWebview;
            }
        }
    }

    public int getWebAppFailureCode() {
        return (int)(((Integer)WebViewApp._webAppFailureCode.get()));
    }

    public String getWebAppFailureMessage() {
        return (String)WebViewApp._webAppFailureMessage.get();
    }

    public com.unity3d.services.core.webview.WebView getWebView() {
        return this._webView;
    }

    public boolean invokeCallback(Invocation invocation0) {
        if(!this.isWebAppLoaded()) {
            DeviceLog.debug("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray0 = new JSONArray();
        ArrayList arrayList0 = invocation0.getResponses();
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                CallbackStatus callbackStatus0 = (CallbackStatus)((ArrayList)object0).get(0);
                Enum enum0 = (Enum)((ArrayList)object0).get(1);
                Object[] arr_object = (Object[])((ArrayList)object0).get(2);
                String s = (String)arr_object[0];
                Object[] arr_object1 = Arrays.copyOfRange(arr_object, 1, arr_object.length);
                ArrayList arrayList1 = new ArrayList();
                arrayList1.add(s);
                arrayList1.add(callbackStatus0.toString());
                JSONArray jSONArray1 = new JSONArray();
                if(enum0 != null) {
                    jSONArray1.put(enum0.name());
                }
                int v = arr_object1.length;
                for(int v1 = 0; v1 < v; ++v1) {
                    jSONArray1.put(arr_object1[v1]);
                }
                arrayList1.add(jSONArray1);
                JSONArray jSONArray2 = new JSONArray();
                for(Object object1: arrayList1) {
                    jSONArray2.put(object1);
                }
                jSONArray0.put(jSONArray2);
            }
        }
        try {
            this.invokeJavascriptMethod("nativebridge", "handleCallback", jSONArray0);
            return true;
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error while invoking batch response for WebView", exception0);
            return true;
        }
        catch(Error unused_ex) {
            DeviceLog.error("Out of memory error while invoking callback to WebView");
            ((SDKMetricsSender)Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap() {
                {
                    Invocation invocation0 = invocation0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.put("src", "handleCallback");
                    this.put("invocation", invocation0.toString());
                }
            });
            return false;
        }
    }

    private void invokeJavascriptMethod(String s, String s1, JSONArray jSONArray0) {
        String s2 = this.buildInvokeJavascript(s, s1, jSONArray0);
        DeviceLog.debug("Invoking javascript: %s", new Object[]{s2});
        this.getWebView().evaluateJavascript(s2, null);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
    public boolean invokeMethod(String s, String s1, Method method0, Object[] arr_object) {
        if(!this.isWebAppLoaded()) {
            DeviceLog.debug("invokeMethod ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put(s);
        jSONArray0.put(s1);
        if(method0 == null) {
            jSONArray0.put(null);
        }
        else {
            NativeCallback nativeCallback0 = new NativeCallback(method0);
            this.addCallback(nativeCallback0);
            jSONArray0.put(nativeCallback0.getId());
        }
        if(arr_object != null) {
            for(int v = 0; v < arr_object.length; ++v) {
                jSONArray0.put(arr_object[v]);
            }
        }
        try {
            this.invokeJavascriptMethod("nativebridge", "handleInvocation", jSONArray0);
            return true;
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error invoking javascript method", exception0);
            return false;
        }
        catch(Error unused_ex) {
            DeviceLog.error("Out of memory error while handling invocation to WebView");
            ((SDKMetricsSender)Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap() {
                {
                    String s = s;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    String s1 = s1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.put("src", "handleInvocation");
                    this.put("className", s);
                    this.put("methodName", s1);
                }
            });
            return false;
        }
    }

    public boolean isWebAppInitialized() {
        return ((Boolean)WebViewApp._initialized.get()).booleanValue();
    }

    public boolean isWebAppLoaded() {
        return this._webAppLoaded;
    }

    public void removeCallback(NativeCallback nativeCallback0) {
        synchronized(this._nativeCallbacks) {
            this._nativeCallbacks.remove(nativeCallback0.getId());
        }
    }

    public void resetWebViewAppInitialization() {
        this._webAppLoaded = false;
        WebViewApp._webAppFailureCode.set(-1);
        WebViewApp._webAppFailureMessage.set("");
        WebViewApp._initialized.set(Boolean.FALSE);
    }

    public boolean sendEvent(Enum enum0, Enum enum1, Object[] arr_object) {
        if(!this.isWebAppLoaded()) {
            DeviceLog.debug("sendEvent ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put(enum0.name());
        jSONArray0.put(enum1.name());
        for(int v = 0; v < arr_object.length; ++v) {
            jSONArray0.put(arr_object[v]);
        }
        try {
            this.invokeJavascriptMethod("nativebridge", "handleEvent", jSONArray0);
            return true;
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error while sending event to WebView", exception0);
            return false;
        }
        catch(Error unused_ex) {
            DeviceLog.error("Out of memory error while sending event to WebView");
            ((SDKMetricsSender)Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap() {
                {
                    Enum enum0 = enum0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    Enum enum1 = enum1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.put("src", "handleEvent");
                    this.put("eventCategory", enum0.name());
                    this.put("eventId", enum1.name());
                }
            });
            return false;
        }
    }

    public void setConfiguration(Configuration configuration0) {
        this._configuration = configuration0;
    }

    public static void setCurrentApp(WebViewApp webViewApp0) {
        WebViewApp._currentApp = webViewApp0;
    }

    public void setWebAppFailureCode(int v) {
        WebViewApp._webAppFailureCode.set(v);
    }

    public void setWebAppFailureMessage(String s) {
        WebViewApp._webAppFailureMessage.set(s);
    }

    public void setWebAppInitialized(boolean z) {
        WebViewApp._initialized.set(Boolean.valueOf(z));
        WebViewApp._conditionVariable.open();
    }

    public void setWebAppLoaded(boolean z) {
        this._webAppLoaded = z;
    }

    public void setWebView(com.unity3d.services.core.webview.WebView webView0) {
        this._webView = webView0;
    }
}

