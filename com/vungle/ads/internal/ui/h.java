package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.Z;
import com.vungle.ads.internal.omsdk.g;
import com.vungle.ads.internal.platform.d;
import com.vungle.ads.internal.ui.view.c;
import com.vungle.ads.internal.util.p;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.v;
import kotlinx.serialization.json.y;
import kotlinx.serialization.json.z;
import y4.l;
import y4.m;

public final class h extends WebViewClient implements c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @RequiresApi(29)
    public static final class b extends WebViewRenderProcessClient {
        @m
        private com.vungle.ads.internal.ui.view.c.b errorHandler;

        public b(@m com.vungle.ads.internal.ui.view.c.b c$b0) {
            this.errorHandler = c$b0;
        }

        @Override  // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(@l WebView webView0, @m WebViewRenderProcess webViewRenderProcess0) {
            L.p(webView0, "webView");
        }

        @Override  // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(@l WebView webView0, @m WebViewRenderProcess webViewRenderProcess0) {
            L.p(webView0, "webView");
            p.Companion.w("VungleWebClient", "onRenderProcessUnresponsive(Title = " + webView0.getTitle() + ", URL = " + webView0.getOriginalUrl() + ", (webViewRenderProcess != null) = " + (webViewRenderProcess0 != null));
            com.vungle.ads.internal.ui.view.c.b c$b0 = this.errorHandler;
            if(c$b0 != null) {
                c$b0.onRenderProcessUnresponsive(webView0, webViewRenderProcess0);
            }
        }
    }

    @l
    public static final a Companion = null;
    @l
    private static final String TAG = "VungleWebClient";
    @l
    private final com.vungle.ads.internal.model.b advertisement;
    private boolean collectConsent;
    @m
    private com.vungle.ads.internal.ui.view.c.b errorHandler;
    @m
    private String gdprAccept;
    @m
    private String gdprBody;
    @m
    private String gdprDeny;
    @m
    private String gdprTitle;
    @m
    private Boolean isViewable;
    @m
    private WebView loadedWebView;
    @m
    private com.vungle.ads.internal.ui.view.c.a mraidDelegate;
    @l
    private final ExecutorService offloadExecutor;
    @l
    private final com.vungle.ads.internal.model.m placement;
    @m
    private final d platform;
    private boolean ready;
    @m
    private final com.vungle.ads.internal.signals.c signalManager;
    @m
    private g webViewObserver;

    static {
        h.Companion = new a(null);
    }

    public h(@l com.vungle.ads.internal.model.b b0, @l com.vungle.ads.internal.model.m m0, @l ExecutorService executorService0, @m com.vungle.ads.internal.signals.c c0, @m d d0) {
        L.p(b0, "advertisement");
        L.p(m0, "placement");
        L.p(executorService0, "offloadExecutor");
        super();
        this.advertisement = b0;
        this.placement = m0;
        this.offloadExecutor = executorService0;
        this.signalManager = c0;
        this.platform = d0;
    }

    public h(com.vungle.ads.internal.model.b b0, com.vungle.ads.internal.model.m m0, ExecutorService executorService0, com.vungle.ads.internal.signals.c c0, d d0, int v, w w0) {
        this(b0, m0, executorService0, ((v & 8) == 0 ? c0 : null), ((v & 16) == 0 ? d0 : null));
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    @VisibleForTesting
    public static void getCollectConsent$vungle_ads_release$annotations() {
    }

    @m
    public final com.vungle.ads.internal.ui.view.c.b getErrorHandler$vungle_ads_release() {
        return this.errorHandler;
    }

    @VisibleForTesting
    public static void getErrorHandler$vungle_ads_release$annotations() {
    }

    @m
    public final String getGdprAccept$vungle_ads_release() {
        return this.gdprAccept;
    }

    @VisibleForTesting
    public static void getGdprAccept$vungle_ads_release$annotations() {
    }

    @m
    public final String getGdprBody$vungle_ads_release() {
        return this.gdprBody;
    }

    @VisibleForTesting
    public static void getGdprBody$vungle_ads_release$annotations() {
    }

    @m
    public final String getGdprDeny$vungle_ads_release() {
        return this.gdprDeny;
    }

    @VisibleForTesting
    public static void getGdprDeny$vungle_ads_release$annotations() {
    }

    @m
    public final String getGdprTitle$vungle_ads_release() {
        return this.gdprTitle;
    }

    @VisibleForTesting
    public static void getGdprTitle$vungle_ads_release$annotations() {
    }

    @m
    public final WebView getLoadedWebView$vungle_ads_release() {
        return this.loadedWebView;
    }

    @VisibleForTesting
    public static void getLoadedWebView$vungle_ads_release$annotations() {
    }

    @m
    public final com.vungle.ads.internal.ui.view.c.a getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    @VisibleForTesting
    public static void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    @VisibleForTesting
    public static void getReady$vungle_ads_release$annotations() {
    }

    @m
    public final g getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    @VisibleForTesting
    public static void getWebViewObserver$vungle_ads_release$annotations() {
    }

    private final void handleWebViewError(String s, String s1, boolean z) {
        com.vungle.ads.internal.ui.view.c.b c$b0 = this.errorHandler;
        if(c$b0 != null) {
            c$b0.onReceivedError(s1 + ' ' + s, z);
        }
    }

    private final boolean isCriticalAsset(String s) {
        return s.length() <= 0 ? false : this.advertisement.isCriticalAsset(s);
    }

    @m
    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    @VisibleForTesting
    public static void isViewable$vungle_ads_release$annotations() {
    }

    public final void notifyDiskAvailableSize(long v) {
        WebView webView0 = this.loadedWebView;
        if(webView0 != null) {
            this.runJavascriptOnWebView(webView0, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + v + ')');
        }
    }

    @Override  // com.vungle.ads.internal.ui.view.c
    public void notifyPropertiesChange(boolean z) {
        WebView webView0 = this.loadedWebView;
        if(webView0 != null) {
            z z1 = new z();
            z z2 = new z();
            kotlinx.serialization.json.m.j(z2, "width", webView0.getWidth());
            kotlinx.serialization.json.m.j(z2, "height", webView0.getHeight());
            y y0 = z2.a();
            z z3 = new z();
            kotlinx.serialization.json.m.j(z3, "x", 0);
            kotlinx.serialization.json.m.j(z3, "y", 0);
            kotlinx.serialization.json.m.j(z3, "width", webView0.getWidth());
            kotlinx.serialization.json.m.j(z3, "height", webView0.getHeight());
            y y1 = z3.a();
            z z4 = new z();
            kotlinx.serialization.json.m.i(z4, "sms", Boolean.FALSE);
            kotlinx.serialization.json.m.i(z4, "tel", Boolean.FALSE);
            kotlinx.serialization.json.m.i(z4, "calendar", Boolean.FALSE);
            kotlinx.serialization.json.m.i(z4, "storePicture", Boolean.FALSE);
            kotlinx.serialization.json.m.i(z4, "inlineVideo", Boolean.FALSE);
            y y2 = z4.a();
            z1.b("maxSize", y0);
            z1.b("screenSize", y0);
            z1.b("defaultPosition", y1);
            z1.b("currentPosition", y1);
            z1.b("supports", y2);
            kotlinx.serialization.json.m.k(z1, "placementType", this.advertisement.templateType());
            Boolean boolean0 = this.isViewable;
            if(boolean0 != null) {
                kotlinx.serialization.json.m.i(z1, "isViewable", boolean0);
            }
            kotlinx.serialization.json.m.k(z1, "os", "android");
            kotlinx.serialization.json.m.k(z1, "osVersion", "33");
            kotlinx.serialization.json.m.i(z1, "incentivized", Boolean.valueOf(this.placement.isRewardedVideo()));
            kotlinx.serialization.json.m.k(z1, "version", "1.0");
            d d0 = this.platform;
            if(d0 != null) {
                kotlinx.serialization.json.m.i(z1, "isSilent", Boolean.valueOf(d0.isSilentModeEnabled()));
            }
            if(this.collectConsent) {
                kotlinx.serialization.json.m.i(z1, "consentRequired", Boolean.TRUE);
                kotlinx.serialization.json.m.k(z1, "consentTitleText", this.gdprTitle);
                kotlinx.serialization.json.m.k(z1, "consentBodyText", this.gdprBody);
                kotlinx.serialization.json.m.k(z1, "consentAcceptButtonText", this.gdprAccept);
                kotlinx.serialization.json.m.k(z1, "consentDenyButtonText", this.gdprDeny);
            }
            else {
                kotlinx.serialization.json.m.i(z1, "consentRequired", Boolean.FALSE);
            }
            String s = null;
            String s1 = this.signalManager == null ? null : this.signalManager.getUuid();
            if(s1 != null && s1.length() != 0) {
                com.vungle.ads.internal.signals.c c0 = this.signalManager;
                if(c0 != null) {
                    s = c0.getUuid();
                }
                kotlinx.serialization.json.m.k(z1, "sessionId", s);
            }
            kotlinx.serialization.json.m.k(z1, "sdkVersion", "7.4.3");
            this.runJavascriptOnWebView(webView0, "window.vungle.mraidBridge.notifyPropertiesChange(" + z1.a() + ',' + z + ')');
        }
    }

    public final void notifySilentModeChange(boolean z) {
        WebView webView0 = this.loadedWebView;
        if(webView0 != null) {
            z z1 = new z();
            kotlinx.serialization.json.m.i(z1, "isSilent", Boolean.valueOf(z));
            this.runJavascriptOnWebView(webView0, "window.vungle.mraidBridge.notifyPropertiesChange(" + z1.a() + ')');
        }
    }

    @Override  // android.webkit.WebViewClient
    public void onPageFinished(@m WebView webView0, @m String s) {
        super.onPageFinished(webView0, s);
        if(webView0 == null) {
            return;
        }
        this.loadedWebView = webView0;
        webView0.setVisibility(0);
        this.notifyPropertiesChange(true);
        if(Build.VERSION.SDK_INT >= 29) {
            webView0.setWebViewRenderProcessClient(com.vungle.ads.internal.ui.c.a(new b(this.errorHandler)));
        }
        g g0 = this.webViewObserver;
        if(g0 != null) {
            g0.onPageFinished(webView0);
        }
    }

    @Override  // android.webkit.WebViewClient
    @k(message = "Deprecated in Java")
    public void onReceivedError(@m WebView webView0, int v, @l String s, @l String s1) {
        L.p(s, "description");
        L.p(s1, "failingUrl");
        super.onReceivedError(webView0, v, s, s1);
        if(Build.VERSION.SDK_INT < 23) {
            boolean z = this.isCriticalAsset(s1);
            p.Companion.e("VungleWebClient", "Error desc " + s + " for URL " + s1);
            this.handleWebViewError(s, s1, z);
        }
    }

    @Override  // android.webkit.WebViewClient
    public void onReceivedError(@m WebView webView0, @m WebResourceRequest webResourceRequest0, @m WebResourceError webResourceError0) {
        Uri uri0 = null;
        super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
        if(Build.VERSION.SDK_INT >= 23) {
            String s = String.valueOf((webResourceError0 == null ? null : webResourceError0.getDescription()));
            if(webResourceRequest0 != null) {
                uri0 = webResourceRequest0.getUrl();
            }
            String s1 = String.valueOf(uri0);
            boolean z = false;
            boolean z1 = webResourceRequest0 != null && webResourceRequest0.isForMainFrame();
            p.Companion.e("VungleWebClient", "Error desc " + s + ' ' + z1 + " for URL " + s1);
            if(this.isCriticalAsset(s1) && z1) {
                z = true;
            }
            this.handleWebViewError(s, s1, z);
        }
    }

    @Override  // android.webkit.WebViewClient
    public void onReceivedHttpError(@m WebView webView0, @m WebResourceRequest webResourceRequest0, @m WebResourceResponse webResourceResponse0) {
        super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
        Uri uri0 = null;
        String s = String.valueOf((webResourceResponse0 == null ? null : webResourceResponse0.getStatusCode()));
        if(webResourceRequest0 != null) {
            uri0 = webResourceRequest0.getUrl();
        }
        String s1 = String.valueOf(uri0);
        boolean z = false;
        boolean z1 = webResourceRequest0 != null && webResourceRequest0.isForMainFrame();
        p.Companion.e("VungleWebClient", "Http Error desc " + s + ' ' + z1 + " for URL " + s1);
        if(this.isCriticalAsset(s1) && z1) {
            z = true;
        }
        this.handleWebViewError(s, s1, z);
    }

    @Override  // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@m WebView webView0, @m RenderProcessGoneDetail renderProcessGoneDetail0) {
        String s = null;
        this.loadedWebView = null;
        if(Build.VERSION.SDK_INT < 26) {
            com.vungle.ads.internal.util.p.a p$a0 = p.Companion;
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("onRenderProcessGone url: ");
            if(webView0 != null) {
                s = webView0.getUrl();
            }
            stringBuilder0.append(s);
            p$a0.w("VungleWebClient", stringBuilder0.toString());
            return this.errorHandler == null ? true : this.errorHandler.onWebRenderingProcessGone(webView0, Boolean.TRUE);
        }
        p.Companion.w("VungleWebClient", "onRenderProcessGone url: " + (webView0 == null ? null : webView0.getUrl()) + ", did crash: " + (renderProcessGoneDetail0 == null ? null : Boolean.valueOf(renderProcessGoneDetail0.didCrash())));
        com.vungle.ads.internal.ui.view.c.b c$b0 = this.errorHandler;
        if(c$b0 != null) {
            if(renderProcessGoneDetail0 != null) {
                s = Boolean.valueOf(renderProcessGoneDetail0.didCrash());
            }
            return c$b0.onWebRenderingProcessGone(webView0, ((Boolean)s));
        }
        return super.onRenderProcessGone(webView0, renderProcessGoneDetail0);
    }

    private final void runJavascriptOnWebView(WebView webView0, String s) {
        try {
            if(webView0 != null && !webView0.isAttachedToWindow()) {
                return;
            }
            p.Companion.w("VungleWebClient", "mraid Injecting JS " + s);
            if(webView0 != null) {
                webView0.evaluateJavascript(s, null);
            }
        }
        catch(Throwable throwable0) {
            new Z("Evaluate js failed " + throwable0.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override  // com.vungle.ads.internal.ui.view.c
    public void setAdVisibility(boolean z) {
        this.isViewable = Boolean.valueOf(z);
        this.notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z) {
        this.collectConsent = z;
    }

    @Override  // com.vungle.ads.internal.ui.view.c
    public void setConsentStatus(boolean z, @m String s, @m String s1, @m String s2, @m String s3) {
        this.collectConsent = z;
        this.gdprTitle = s;
        this.gdprBody = s1;
        this.gdprAccept = s2;
        this.gdprDeny = s3;
    }

    @Override  // com.vungle.ads.internal.ui.view.c
    public void setErrorHandler(@l com.vungle.ads.internal.ui.view.c.b c$b0) {
        L.p(c$b0, "errorHandler");
        this.errorHandler = c$b0;
    }

    public final void setErrorHandler$vungle_ads_release(@m com.vungle.ads.internal.ui.view.c.b c$b0) {
        this.errorHandler = c$b0;
    }

    public final void setGdprAccept$vungle_ads_release(@m String s) {
        this.gdprAccept = s;
    }

    public final void setGdprBody$vungle_ads_release(@m String s) {
        this.gdprBody = s;
    }

    public final void setGdprDeny$vungle_ads_release(@m String s) {
        this.gdprDeny = s;
    }

    public final void setGdprTitle$vungle_ads_release(@m String s) {
        this.gdprTitle = s;
    }

    public final void setLoadedWebView$vungle_ads_release(@m WebView webView0) {
        this.loadedWebView = webView0;
    }

    @Override  // com.vungle.ads.internal.ui.view.c
    public void setMraidDelegate(@m com.vungle.ads.internal.ui.view.c.a c$a0) {
        this.mraidDelegate = c$a0;
    }

    public final void setMraidDelegate$vungle_ads_release(@m com.vungle.ads.internal.ui.view.c.a c$a0) {
        this.mraidDelegate = c$a0;
    }

    public final void setReady$vungle_ads_release(boolean z) {
        this.ready = z;
    }

    public final void setViewable$vungle_ads_release(@m Boolean boolean0) {
        this.isViewable = boolean0;
    }

    @Override  // com.vungle.ads.internal.ui.view.c
    public void setWebViewObserver(@m g g0) {
        this.webViewObserver = g0;
    }

    public final void setWebViewObserver$vungle_ads_release(@m g g0) {
        this.webViewObserver = g0;
    }

    @Override  // android.webkit.WebViewClient
    @k(message = "Deprecated in Java")
    public boolean shouldOverrideUrlLoading(@m WebView webView0, @m String s) {
        com.vungle.ads.internal.util.p.a p$a0 = p.Companion;
        p$a0.d("VungleWebClient", "MRAID Command " + s);
        if(s != null && s.length() != 0) {
            Uri uri0 = Uri.parse(s);
            if(uri0 != null && uri0.getScheme() != null) {
                String s1 = uri0.getScheme();
                if(L.g(s1, "mraid")) {
                    String s2 = uri0.getHost();
                    if(s2 == null) {
                        return false;
                    }
                    if(!L.g("propertiesChangeCompleted", s2)) {
                        com.vungle.ads.internal.ui.view.c.a c$a0 = this.mraidDelegate;
                        if(c$a0 != null) {
                            z z0 = new z();
                            for(Object object0: uri0.getQueryParameterNames()) {
                                L.o(((String)object0), "param");
                                kotlinx.serialization.json.m.k(z0, ((String)object0), uri0.getQueryParameter(((String)object0)));
                            }
                            com.vungle.ads.internal.ui.g g0 = () -> {
                                L.p(c$a0, "$it");
                                L.p(s2, "$command");
                                L.p(z0.a(), "$args");
                                L.p(new Handler(Looper.getMainLooper()), "$handler");
                                L.p(this, "this$0");
                                if(c$a0.processCommand(s2, z0.a())) {
                                    new Handler(Looper.getMainLooper()).post(() -> {
                                        L.p(h0, "this$0");
                                        h0.runJavascriptOnWebView(webView0, "window.vungle.mraidBridge.notifyCommandComplete()");
                                    });
                                }
                            };
                            this.offloadExecutor.submit(g0);
                        }
                    }
                    else if(!this.ready) {
                        this.ready = true;
                        f f0 = () -> {
                            L.p(this, "this$0");
                            L.p(new Handler(Looper.getMainLooper()), "$handler");
                            new Handler(Looper.getMainLooper()).post(() -> {
                                L.p(h0, "this$0");
                                L.p("window.vungle.mraidBridge.notifyReadyEvent(" + h0.advertisement.createMRAIDArgs() + ')', "$injectJs");
                                h0.runJavascriptOnWebView(webView0, "window.vungle.mraidBridge.notifyReadyEvent(" + h0.advertisement.createMRAIDArgs() + ')');
                            });
                        };
                        this.offloadExecutor.submit(f0);
                        return true;
                    }
                    return true;
                }
                if(!v.O1("http", s1, true) && !v.O1("https", s1, true)) {
                    return false;
                }
                p$a0.d("VungleWebClient", "Open URL" + s);
                com.vungle.ads.internal.ui.view.c.a c$a1 = this.mraidDelegate;
                if(c$a1 != null) {
                    z z1 = new z();
                    kotlinx.serialization.json.m.k(z1, "url", s);
                    c$a1.processCommand("openNonMraid", z1.a());
                }
                return true;
            }
            return false;
        }
        p$a0.e("VungleWebClient", "Invalid URL ");
        return false;
    }

    // 检测为 Lambda 实现
    private static final void shouldOverrideUrlLoading$lambda-6$lambda-1(h h0, Handler handler0, WebView webView0) [...]

    // 检测为 Lambda 实现
    private static final void shouldOverrideUrlLoading$lambda-6$lambda-1$lambda-0(h h0, WebView webView0, String s) [...]

    // 检测为 Lambda 实现
    private static final void shouldOverrideUrlLoading$lambda-6$lambda-5$lambda-4(com.vungle.ads.internal.ui.view.c.a c$a0, String s, y y0, Handler handler0, h h0, WebView webView0) [...]

    // 检测为 Lambda 实现
    private static final void shouldOverrideUrlLoading$lambda-6$lambda-5$lambda-4$lambda-3(h h0, WebView webView0) [...]
}

