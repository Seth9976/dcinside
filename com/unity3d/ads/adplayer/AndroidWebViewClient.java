package com.unity3d.ads.adplayer;

import A3.o;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import androidx.webkit.WebViewFeature;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.extensions.IntExtensionKt;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.X;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.j;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidWebViewClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidWebViewClient.kt\ncom/unity3d/ads/adplayer/AndroidWebViewClient\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,141:1\n230#2,5:142\n230#2,5:147\n230#2,5:152\n230#2,5:157\n*S KotlinDebug\n*F\n+ 1 AndroidWebViewClient.kt\ncom/unity3d/ads/adplayer/AndroidWebViewClient\n*L\n41#1:142,5\n62#1:147,5\n82#1:152,5\n117#1:157,5\n*E\n"})
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final String BLANK_PAGE = "about:blank";
    @l
    public static final Companion Companion;
    @l
    private final E _isRenderProcessGone;
    @l
    private final x _onLoadFinished;
    @l
    private final GetCachedAsset getCachedAsset;
    @l
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    @l
    private final GetWebViewCacheAssetLoader getWebViewAssetLoader;
    @l
    private final U isRenderProcessGone;
    @l
    private final E loadErrors;
    @l
    private final X onLoadFinished;

    static {
        AndroidWebViewClient.Companion = new Companion(null);
    }

    public AndroidWebViewClient(@l GetWebViewCacheAssetLoader getWebViewCacheAssetLoader0, @l GetCachedAsset getCachedAsset0, @l GetLatestWebViewConfiguration getLatestWebViewConfiguration0) {
        L.p(getWebViewCacheAssetLoader0, "getWebViewAssetLoader");
        L.p(getCachedAsset0, "getCachedAsset");
        L.p(getLatestWebViewConfiguration0, "getLatestWebViewConfiguration");
        super();
        this.getWebViewAssetLoader = getWebViewCacheAssetLoader0;
        this.getCachedAsset = getCachedAsset0;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration0;
        this.loadErrors = W.a(u.H());
        x x0 = z.c(null, 1, null);
        this._onLoadFinished = x0;
        this.onLoadFinished = x0;
        E e0 = W.a(Boolean.FALSE);
        this._isRenderProcessGone = e0;
        this.isRenderProcessGone = k.m(e0);
    }

    private final String getLatestWebviewDomain() {
        return (String)j.b(null, new o(null) {
            int label;

            {
                AndroidWebViewClient.this = androidWebViewClient0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.AndroidWebViewClient.getLatestWebviewDomain.1(AndroidWebViewClient.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.AndroidWebViewClient.getLatestWebviewDomain.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        object0 = GetLatestWebViewConfiguration.invoke$default(AndroidWebViewClient.this.getLatestWebViewConfiguration, null, null, null, this, 7, null);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                String s = Uri.parse(((WebViewConfiguration)object0).getEntryPoint()).getHost();
                if(s != null && s.length() != 0) {
                    L.o(s, "it");
                    return s;
                }
                return "webview.unityads.unity3d.com";
            }
        }, 1, null);
    }

    @l
    public final X getOnLoadFinished() {
        return this.onLoadFinished;
    }

    @l
    public final U isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override  // android.webkit.WebViewClient
    public void onPageFinished(@l WebView webView0, @l String s) {
        L.p(webView0, "view");
        L.p(s, "url");
        if(L.g(s, "about:blank")) {
            E e0 = this.loadErrors;
            while(true) {
                Object object0 = e0.getValue();
                if(e0.compareAndSet(object0, u.E4(((List)object0), new WebViewClientError(s, ErrorReason.REASON_WEB_BLANK, null, 4, null)))) {
                    break;
                }
            }
        }
        super.onPageFinished(webView0, s);
        Object object1 = this.loadErrors.getValue();
        this._onLoadFinished.Q(object1);
    }

    @Override  // androidx.webkit.WebViewClientCompat
    @RequiresApi(21)
    public void onReceivedError(@l WebView webView0, @l WebResourceRequest webResourceRequest0, @l WebResourceErrorCompat webResourceErrorCompat0) {
        L.p(webView0, "view");
        L.p(webResourceRequest0, "request");
        L.p(webResourceErrorCompat0, "error");
        super.onReceivedError(webView0, webResourceRequest0, webResourceErrorCompat0);
        ErrorReason errorReason0 = WebViewFeature.a("WEB_RESOURCE_ERROR_GET_CODE") ? IntExtensionKt.webResourceToErrorReason(webResourceErrorCompat0.b()) : ErrorReason.REASON_UNKNOWN;
        E e0 = this.loadErrors;
        do {
            Object object0 = e0.getValue();
        }
        while(!e0.compareAndSet(object0, u.E4(((List)object0), new WebViewClientError(webResourceRequest0.getUrl().toString(), errorReason0, null, 4, null))));
    }

    @Override  // androidx.webkit.WebViewClientCompat
    public void onReceivedHttpError(@l WebView webView0, @l WebResourceRequest webResourceRequest0, @l WebResourceResponse webResourceResponse0) {
        L.p(webView0, "view");
        L.p(webResourceRequest0, "request");
        L.p(webResourceResponse0, "errorResponse");
        super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
        String s = webResourceRequest0.getUrl().toString();
        Integer integer0 = webResourceResponse0.getStatusCode();
        WebViewClientError webViewClientError0 = new WebViewClientError(s, ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, integer0);
        E e0 = this.loadErrors;
        do {
            Object object0 = e0.getValue();
        }
        while(!e0.compareAndSet(object0, u.E4(((List)object0), webViewClientError0)));
    }

    @Override  // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@l WebView webView0, @l RenderProcessGoneDetail renderProcessGoneDetail0) {
        L.p(webView0, "view");
        L.p(renderProcessGoneDetail0, "detail");
        ViewExtensionsKt.removeViewFromParent(webView0);
        webView0.destroy();
        if(!this._onLoadFinished.k()) {
            E e0 = this.loadErrors;
            do {
                Object object0 = e0.getValue();
            }
            while(!e0.compareAndSet(object0, u.E4(((List)object0), new WebViewClientError(webView0.getUrl(), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
            Object object1 = this.loadErrors.getValue();
            this._onLoadFinished.Q(object1);
            return true;
        }
        this._isRenderProcessGone.setValue(Boolean.TRUE);
        return true;
    }

    @Override  // android.webkit.WebViewClient
    @m
    public WebResourceResponse shouldInterceptRequest(@l WebView webView0, @l WebResourceRequest webResourceRequest0) {
        L.p(webView0, "view");
        L.p(webResourceRequest0, "request");
        Uri uri0 = webResourceRequest0.getUrl();
        if(uri0 == null) {
            return super.shouldInterceptRequest(webView0, webResourceRequest0);
        }
        if(L.g(uri0.getLastPathSegment(), "favicon.ico")) {
            return new WebResourceResponse("image/png", null, null);
        }
        if(L.g(uri0.getScheme(), "unity-ads-cache")) {
            Uri uri1 = webResourceRequest0.getUrl();
            L.o(uri1, "request.url");
            return this.getCachedAsset.invoke(uri1);
        }
        return L.g(uri0.getHost(), this.getLatestWebviewDomain()) ? this.getWebViewAssetLoader.invoke().a(uri0) : super.shouldInterceptRequest(webView0, webResourceRequest0);
    }
}

