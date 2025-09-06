package com.unity3d.services.core.webview;

import A3.a;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.webkit.ValueCallback;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebSettings;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent.DefaultImpls;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.collections.k0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.reflect.d;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebView.kt\ncom/unity3d/services/core/webview/WebView\n+ 2 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n*L\n1#1,110:1\n29#2,5:111\n*S KotlinDebug\n*F\n+ 1 WebView.kt\ncom/unity3d/services/core/webview/WebView\n*L\n32#1:111,5\n*E\n"})
public class WebView extends android.webkit.WebView implements IServiceComponent {
    @l
    private final D sdkMetricsSender$delegate;
    @l
    private final WebViewBridgeInterface webViewBridgeInterface;

    @j
    public WebView(@l Context context0) {
        L.p(context0, "context");
        this(context0, false, null, null, null, 30, null);
    }

    @j
    public WebView(@l Context context0, boolean z) {
        L.p(context0, "context");
        this(context0, z, null, null, null, 28, null);
    }

    @j
    public WebView(@l Context context0, boolean z, @l IWebViewBridge iWebViewBridge0) {
        L.p(context0, "context");
        L.p(iWebViewBridge0, "webViewBridge");
        this(context0, z, iWebViewBridge0, null, null, 24, null);
    }

    @j
    public WebView(@l Context context0, boolean z, @l IWebViewBridge iWebViewBridge0, @l IInvocationCallbackInvoker iInvocationCallbackInvoker0) {
        L.p(context0, "context");
        L.p(iWebViewBridge0, "webViewBridge");
        L.p(iInvocationCallbackInvoker0, "callbackInvoker");
        this(context0, z, iWebViewBridge0, iInvocationCallbackInvoker0, null, 16, null);
    }

    @j
    public WebView(@l Context context0, boolean z, @l IWebViewBridge iWebViewBridge0, @l IInvocationCallbackInvoker iInvocationCallbackInvoker0, @l IExperiments iExperiments0) {
        L.p(context0, "context");
        L.p(iWebViewBridge0, "webViewBridge");
        L.p(iInvocationCallbackInvoker0, "callbackInvoker");
        L.p(iExperiments0, "experiments");
        super(context0);
        com.unity3d.services.core.webview.WebView.special..inlined.inject.default.1 webView$special$$inlined$inject$default$10 = new a("") {
            final String $named;
            final IServiceComponent $this_inject;

            {
                this.$this_inject = iServiceComponent0;
                this.$named = s;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                IServicesRegistry iServicesRegistry0 = this.$this_inject.getServiceProvider().getRegistry();
                d d0 = m0.d(SDKMetricsSender.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        this.sdkMetricsSender$delegate = E.c(H.c, webView$special$$inlined$inject$default$10);
        WebViewBridgeInterface webViewBridgeInterface0 = new WebViewBridgeInterface(iWebViewBridge0, iInvocationCallbackInvoker0);
        this.webViewBridgeInterface = webViewBridgeInterface0;
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setAllowFileAccessFromFileURLs(true);
        webSettings0.setAllowUniversalAccessFromFileURLs(true);
        webSettings0.setAllowFileAccess(true);
        webSettings0.setBlockNetworkImage(false);
        webSettings0.setBlockNetworkLoads(false);
        webSettings0.setBuiltInZoomControls(false);
        webSettings0.setCacheMode(2);
        webSettings0.setDatabaseEnabled(false);
        webSettings0.setDisplayZoomControls(false);
        webSettings0.setDomStorageEnabled(false);
        webSettings0.setEnableSmoothTransition(false);
        webSettings0.setGeolocationEnabled(false);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setLightTouchEnabled(false);
        webSettings0.setLoadWithOverviewMode(false);
        webSettings0.setLoadsImagesAutomatically(true);
        webSettings0.setMediaPlaybackRequiresUserGesture(false);
        webSettings0.setMixedContentMode(1);
        webSettings0.setNeedInitialFocus(true);
        webSettings0.setPluginState(WebSettings.PluginState.OFF);
        webSettings0.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        webSettings0.setSaveFormData(false);
        webSettings0.setSavePassword(false);
        webSettings0.setSupportMultipleWindows(false);
        webSettings0.setSupportZoom(false);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setMediaPlaybackRequiresUserGesture(!z);
        this.setHorizontalScrollBarEnabled(false);
        this.setVerticalScrollBarEnabled(false);
        this.setInitialScale(0);
        this.setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        this.setBackgroundResource(0);
        boolean z1 = iExperiments0.isWebMessageEnabled();
        if(z1) {
            this.getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        }
        else {
            this.getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean z2 = WebViewFeature.a("WEB_MESSAGE_LISTENER");
        if(z2) {
            this.getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        }
        else {
            this.getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if(z1 && z2) {
            WebViewCompat.b(this, "handleInvocation", k0.f("*"), new com.unity3d.services.core.webview.a(webViewBridgeInterface0));
            WebViewCompat.b(this, "handleCallback", k0.f("*"), new b(webViewBridgeInterface0));
            return;
        }
        this.addJavascriptInterface(webViewBridgeInterface0, "webviewbridge");
    }

    public WebView(Context context0, boolean z, IWebViewBridge iWebViewBridge0, IInvocationCallbackInvoker iInvocationCallbackInvoker0, IExperiments iExperiments0, int v, w w0) {
        if((v & 4) != 0) {
            iWebViewBridge0 = SharedInstances.INSTANCE.getWebViewBridge();
        }
        if((v & 8) != 0) {
            iInvocationCallbackInvoker0 = SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker();
        }
        if((v & 16) != 0) {
            iExperiments0 = new Experiments();
        }
        this(context0, ((v & 2) == 0 ? z : false), iWebViewBridge0, iInvocationCallbackInvoker0, iExperiments0);
    }

    @Override  // android.webkit.WebView
    public void evaluateJavascript(@l String s, @m ValueCallback valueCallback0) {
        L.p(s, "script");
        Utilities.runOnUiThread(() -> {
            L.p(this, "this$0");
            L.p(s, "$script");
            this.super.evaluateJavascript(s, valueCallback0);
        });
    }

    // 检测为 Lambda 实现
    private static final void evaluateJavascript$lambda$1(WebView webView0, String s, ValueCallback valueCallback0) [...]

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender)this.sdkMetricsSender$delegate.getValue();
    }

    @Override  // com.unity3d.services.core.di.IServiceComponent
    @l
    public IServiceProvider getServiceProvider() {
        return DefaultImpls.getServiceProvider(this);
    }

    @Override  // android.webkit.WebView
    public void loadUrl(@l String s) {
        L.p(s, "url");
        DeviceLog.debug(("Loading url: " + s));
        super.loadUrl(s);
    }
}

