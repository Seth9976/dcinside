package com.unity3d.ads.core.domain;

import A3.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    @l
    private final AndroidWebViewClient androidWebViewClient;
    @l
    private final Context context;
    @l
    private final K defaultDispatcher;
    @l
    private final K mainDispatcher;
    @l
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    public AndroidGetWebViewContainerUseCase(@l Context context0, @l AndroidWebViewClient androidWebViewClient0, @l SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics0, @l K k0, @l K k1) {
        L.p(context0, "context");
        L.p(androidWebViewClient0, "androidWebViewClient");
        L.p(sendWebViewClientErrorDiagnostics0, "sendWebViewClientErrorDiagnostics");
        L.p(k0, "mainDispatcher");
        L.p(k1, "defaultDispatcher");
        super();
        this.context = context0;
        this.androidWebViewClient = androidWebViewClient0;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics0;
        this.mainDispatcher = k0;
        this.defaultDispatcher = k1;
    }

    @Override  // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    @SuppressLint({"SetJavaScriptEnabled"})
    @m
    public Object invoke(@l O o0, @l d d0) {
        com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke.1 androidGetWebViewContainerUseCase$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke.1) {
            androidGetWebViewContainerUseCase$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke.1)d0;
            int v = androidGetWebViewContainerUseCase$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetWebViewContainerUseCase$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, this);
                    }
                };
            }
            else {
                androidGetWebViewContainerUseCase$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetWebViewContainerUseCase$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, this);
                }
            };
        }
        Object object0 = androidGetWebViewContainerUseCase$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetWebViewContainerUseCase$invoke$10.label) {
            case 0: {
                f0.n(object0);
                com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke.webview.1 androidGetWebViewContainerUseCase$invoke$webview$10 = new o(null) {
                    int label;

                    {
                        AndroidGetWebViewContainerUseCase.this = androidGetWebViewContainerUseCase0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke.webview.1(AndroidGetWebViewContainerUseCase.this, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke.webview.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        WebView webView0 = new WebView(AndroidGetWebViewContainerUseCase.this.context);
                        WebSettings webSettings0 = webView0.getSettings();
                        webSettings0.setAllowFileAccess(false);
                        webSettings0.setBlockNetworkImage(false);
                        webSettings0.setBlockNetworkLoads(false);
                        webSettings0.setBuiltInZoomControls(false);
                        webSettings0.setCacheMode(-1);
                        webSettings0.setDatabaseEnabled(false);
                        webSettings0.setDisplayZoomControls(false);
                        webSettings0.setDomStorageEnabled(false);
                        webSettings0.setGeolocationEnabled(false);
                        webSettings0.setJavaScriptCanOpenWindowsAutomatically(false);
                        webSettings0.setJavaScriptEnabled(true);
                        webSettings0.setLoadWithOverviewMode(false);
                        webSettings0.setLoadsImagesAutomatically(true);
                        webSettings0.setMediaPlaybackRequiresUserGesture(false);
                        webSettings0.setMixedContentMode(1);
                        webSettings0.setNeedInitialFocus(true);
                        webSettings0.setSupportMultipleWindows(false);
                        webSettings0.setSupportZoom(false);
                        webSettings0.setUseWideViewPort(true);
                        webSettings0.setMediaPlaybackRequiresUserGesture(false);
                        webView0.setWebViewClient(AndroidGetWebViewContainerUseCase.this.androidWebViewClient);
                        webView0.setHorizontalScrollBarEnabled(false);
                        webView0.setVerticalScrollBarEnabled(false);
                        webView0.setInitialScale(0);
                        webView0.setBackgroundColor(0);
                        webView0.setBackgroundResource(0);
                        return webView0;
                    }
                };
                androidGetWebViewContainerUseCase$invoke$10.L$0 = this;
                androidGetWebViewContainerUseCase$invoke$10.L$1 = o0;
                androidGetWebViewContainerUseCase$invoke$10.label = 1;
                object0 = i.h(this.mainDispatcher, androidGetWebViewContainerUseCase$invoke$webview$10, androidGetWebViewContainerUseCase$invoke$10);
                return object0 == object1 ? object1 : new AndroidWebViewContainer(((WebView)object0), this.androidWebViewClient, this.sendWebViewClientErrorDiagnostics, this.mainDispatcher, this.defaultDispatcher, o0);
            }
            case 1: {
                o0 = (O)androidGetWebViewContainerUseCase$invoke$10.L$1;
                AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase0 = (AndroidGetWebViewContainerUseCase)androidGetWebViewContainerUseCase$invoke$10.L$0;
                f0.n(object0);
                return new AndroidWebViewContainer(((WebView)object0), androidGetWebViewContainerUseCase0.androidWebViewClient, androidGetWebViewContainerUseCase0.sendWebViewClientErrorDiagnostics, androidGetWebViewContainerUseCase0.mainDispatcher, androidGetWebViewContainerUseCase0.defaultDispatcher, o0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

