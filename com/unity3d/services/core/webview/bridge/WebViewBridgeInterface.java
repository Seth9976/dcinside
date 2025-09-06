package com.unity3d.services.core.webview.bridge;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import org.json.JSONArray;
import org.json.JSONObject;
import y4.l;

public final class WebViewBridgeInterface {
    @l
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    @l
    private final IWebViewBridge webViewBridge;

    public WebViewBridgeInterface() {
        this(null, null, 3, null);
    }

    public WebViewBridgeInterface(@l IWebViewBridge iWebViewBridge0, @l IInvocationCallbackInvoker iInvocationCallbackInvoker0) {
        L.p(iWebViewBridge0, "webViewBridge");
        L.p(iInvocationCallbackInvoker0, "webViewAppInvocationCallbackInvoker");
        super();
        this.webViewBridge = iWebViewBridge0;
        this.webViewAppInvocationCallbackInvoker = iInvocationCallbackInvoker0;
    }

    public WebViewBridgeInterface(IWebViewBridge iWebViewBridge0, IInvocationCallbackInvoker iInvocationCallbackInvoker0, int v, w w0) {
        if((v & 1) != 0) {
            iWebViewBridge0 = SharedInstances.INSTANCE.getWebViewBridge();
        }
        if((v & 2) != 0) {
            iInvocationCallbackInvoker0 = SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker();
        }
        this(iWebViewBridge0, iInvocationCallbackInvoker0);
    }

    @JavascriptInterface
    public final void handleCallback(@l String s, @l String s1, @l String s2) {
        L.p(s, "callbackId");
        L.p(s1, "callbackStatus");
        L.p(s2, "rawParameters");
        DeviceLog.debug(("handleCallback " + s + ' ' + s1 + ' ' + s2));
        Object[] arr_object = JSONArrayExtensionsKt.toTypedArray(new JSONArray(s2));
        this.webViewBridge.handleCallback(s, s1, arr_object);
    }

    @JavascriptInterface
    public final void handleInvocation(@l String s) {
        L.p(s, "data");
        DeviceLog.debug(("handleInvocation " + s));
        JSONArray jSONArray0 = new JSONArray(s);
        Invocation invocation0 = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = jSONArray0.get(v1);
            L.n(object0, "null cannot be cast to non-null type org.json.JSONArray");
            Object object1 = ((JSONArray)object0).get(0);
            L.n(object1, "null cannot be cast to non-null type kotlin.String");
            Object object2 = ((JSONArray)object0).get(1);
            L.n(object2, "null cannot be cast to non-null type kotlin.String");
            Object object3 = ((JSONArray)object0).get(2);
            L.n(object3, "null cannot be cast to non-null type org.json.JSONArray");
            Object object4 = ((JSONArray)object0).get(3);
            L.n(object4, "null cannot be cast to non-null type kotlin.String");
            invocation0.addInvocation(((String)object1), ((String)object2), JSONArrayExtensionsKt.toTypedArray(((JSONArray)object3)), new WebViewCallback(((String)object4), invocation0.getId()));
            invocation0.nextInvocation();
        }
        invocation0.sendInvocationCallback();
    }

    public final void onHandleCallback(@l WebView webView0, @l WebMessageCompat webMessageCompat0, @l Uri uri0, boolean z, @l JavaScriptReplyProxy javaScriptReplyProxy0) {
        L.p(webView0, "view");
        L.p(webMessageCompat0, "message");
        L.p(uri0, "sourceOrigin");
        L.p(javaScriptReplyProxy0, "replyProxy");
        String s = webMessageCompat0.c();
        if(z && s != null && !v.x3(s)) {
            JSONObject jSONObject0 = new JSONObject(s);
            String s1 = jSONObject0.getString("id");
            String s2 = jSONObject0.getString("status");
            String s3 = jSONObject0.getString("parameters");
            L.o(s1, "callbackId");
            L.o(s2, "callbackStatus");
            L.o(s3, "rawParameters");
            this.handleCallback(s1, s2, s3);
        }
    }

    public final void onHandleInvocation(@l WebView webView0, @l WebMessageCompat webMessageCompat0, @l Uri uri0, boolean z, @l JavaScriptReplyProxy javaScriptReplyProxy0) {
        L.p(webView0, "view");
        L.p(webMessageCompat0, "message");
        L.p(uri0, "sourceOrigin");
        L.p(javaScriptReplyProxy0, "replyProxy");
        String s = webMessageCompat0.c();
        if(z && s != null && !v.x3(s)) {
            this.handleInvocation(s);
        }
    }
}

