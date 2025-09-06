package com.unity3d.ads.adplayer;

import A3.o;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.N;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.W0;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@SuppressLint({"ClickableViewAccessibility"})
@s0({"SMAP\nAndroidWebViewContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidWebViewContainer.kt\ncom/unity3d/ads/adplayer/AndroidWebViewContainer\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,116:1\n20#2:117\n22#2:121\n50#3:118\n55#3:120\n106#4:119\n*S KotlinDebug\n*F\n+ 1 AndroidWebViewContainer.kt\ncom/unity3d/ads/adplayer/AndroidWebViewContainer\n*L\n36#1:117\n36#1:121\n36#1:118\n36#1:120\n36#1:119\n*E\n"})
public final class AndroidWebViewContainer implements WebViewContainer {
    @l
    private final E _lastInputEvent;
    @l
    private final U lastInputEvent;
    @l
    private final O scope;
    @l
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    @l
    private final WebView webView;
    @l
    private final AndroidWebViewClient webViewClient;

    public AndroidWebViewContainer(@l WebView webView0, @l AndroidWebViewClient androidWebViewClient0, @l SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics0, @l K k0, @l K k1, @l O o0) {
        L.p(webView0, "webView");
        L.p(androidWebViewClient0, "webViewClient");
        L.p(sendWebViewClientErrorDiagnostics0, "sendWebViewClientErrorDiagnostics");
        L.p(k0, "mainDispatcher");
        L.p(k1, "defaultDispatcher");
        L.p(o0, "adPlayerScope");
        super();
        this.webView = webView0;
        this.webViewClient = androidWebViewClient0;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics0;
        O o1 = P.m(P.m(o0, k0), new N("AndroidWebViewContainer"));
        this.scope = o1;
        E e0 = W.a(null);
        this._lastInputEvent = e0;
        this.lastInputEvent = k.m(e0);
        k.U0(k.e1(new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.AndroidWebViewContainer.special..inlined.filter.1.2 androidWebViewContainer$special$$inlined$filter$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.AndroidWebViewContainer.special..inlined.filter.1.2.1 androidWebViewContainer$special$$inlined$filter$1$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.special..inlined.filter.1.2.1) {
                            androidWebViewContainer$special$$inlined$filter$1$2$10 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.special..inlined.filter.1.2.1)d0;
                            int v = androidWebViewContainer$special$$inlined$filter$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                androidWebViewContainer$special$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
                                    Object L$1;
                                    int label;
                                    Object result;

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        this.result = object0;
                                        this.label |= 0x80000000;
                                        return d0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                androidWebViewContainer$special$$inlined$filter$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            androidWebViewContainer$special$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                Object L$0;
                                Object L$1;
                                int label;
                                Object result;

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    this.result = object0;
                                    this.label |= 0x80000000;
                                    return d0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = androidWebViewContainer$special$$inlined$filter$1$2$10.result;
                        Object object2 = b.l();
                        switch(androidWebViewContainer$special$$inlined$filter$1$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(((Boolean)object0).booleanValue()) {
                                    androidWebViewContainer$special$$inlined$filter$1$2$10.label = 1;
                                    if(j0.emit(object0, androidWebViewContainer$special$$inlined$filter$1$2$10) == object2) {
                                        return object2;
                                    }
                                }
                                return S0.a;
                            }
                            case 1: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(androidWebViewContainer$special$$inlined$filter$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }, new o(null) {
            int label;

            {
                AndroidWebViewContainer.this = androidWebViewContainer0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.AndroidWebViewContainer.2(AndroidWebViewContainer.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Boolean)object0).booleanValue(), ((d)object1));
            }

            @m
            public final Object invoke(boolean z, @m d d0) {
                return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.2)this.create(Boolean.valueOf(z), d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        return AndroidWebViewContainer.this.onRenderProcessGone(this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }), P.m(o1, k1));
        webView0.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
            L.p(this, "this$0");
            switch(motionEvent0.getActionMasked()) {
                case 0: 
                case 1: 
                case 5: 
                case 6: {
                    this._lastInputEvent.setValue(motionEvent0);
                    return false;
                }
                default: {
                    return false;
                }
            }
        });
    }

    // 检测为 Lambda 实现
    private static final boolean _init_$lambda$1(AndroidWebViewContainer androidWebViewContainer0, View view0, MotionEvent motionEvent0) [...]

    @Override  // com.unity3d.ads.adplayer.WebViewContainer
    @m
    public Object addJavascriptInterface(@l WebViewBridge webViewBridge0, @l String s, @l d d0) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface.1 androidWebViewContainer$addJavascriptInterface$10;
        if(d0 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface.1) {
            androidWebViewContainer$addJavascriptInterface$10 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface.1)d0;
            int v = androidWebViewContainer$addJavascriptInterface$10.label;
            if((v & 0x80000000) == 0) {
                androidWebViewContainer$addJavascriptInterface$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.addJavascriptInterface(null, null, this);
                    }
                };
            }
            else {
                androidWebViewContainer$addJavascriptInterface$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidWebViewContainer$addJavascriptInterface$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.addJavascriptInterface(null, null, this);
                }
            };
        }
        Object object0 = androidWebViewContainer$addJavascriptInterface$10.result;
        Object object1 = b.l();
        switch(androidWebViewContainer$addJavascriptInterface$10.label) {
            case 0: {
                f0.n(object0);
                try {
                    g g0 = this.scope.getCoroutineContext();
                    com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface.2 androidWebViewContainer$addJavascriptInterface$20 = new o(s, webViewBridge0, null) {
                        final String $name;
                        final WebViewBridge $webViewBridgeInterface;
                        int label;

                        {
                            AndroidWebViewContainer.this = androidWebViewContainer0;
                            this.$name = s;
                            this.$webViewBridgeInterface = webViewBridge0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface.2(AndroidWebViewContainer.this, this.$name, this.$webViewBridgeInterface, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface.2)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            if(this.label != 0) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                            f0.n(object0);
                            com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface.2.wrapper.1 androidWebViewContainer$addJavascriptInterface$2$wrapper$10 = new WebViewBridgeInterface() {
                                @Override  // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                                @JavascriptInterface
                                public void handleCallback(@l String s, @l String s1, @l String s2) {
                                    L.p(s, "callbackId");
                                    L.p(s1, "callbackStatus");
                                    L.p(s2, "rawParameters");
                                    this.$webViewBridgeInterface.handleCallback(s, s1, s2);
                                }

                                @Override  // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                                @JavascriptInterface
                                public void handleInvocation(@l String s) {
                                    L.p(s, "message");
                                    this.$webViewBridgeInterface.handleInvocation(s);
                                }
                            };
                            AndroidWebViewContainer.this.getWebView().addJavascriptInterface(androidWebViewContainer$addJavascriptInterface$2$wrapper$10, this.$name);
                            return S0.a;
                        }
                    };
                    androidWebViewContainer$addJavascriptInterface$10.label = 1;
                    if(kotlinx.coroutines.i.h(g0, androidWebViewContainer$addJavascriptInterface$20, androidWebViewContainer$addJavascriptInterface$10) == object1) {
                        return object1;
                    }
                }
                catch(CancellationException unused_ex) {
                }
                return S0.a;
            }
            case 1: {
                try {
                    f0.n(object0);
                }
                catch(CancellationException unused_ex) {
                }
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // com.unity3d.ads.adplayer.WebViewContainer
    @m
    public Object destroy(@l d d0) {
        AndroidWebViewContainer androidWebViewContainer0;
        com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy.1 androidWebViewContainer$destroy$10;
        if(d0 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy.1) {
            androidWebViewContainer$destroy$10 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy.1)d0;
            int v = androidWebViewContainer$destroy$10.label;
            if((v & 0x80000000) == 0) {
                androidWebViewContainer$destroy$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.destroy(this);
                    }
                };
            }
            else {
                androidWebViewContainer$destroy$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidWebViewContainer$destroy$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.destroy(this);
                }
            };
        }
        Object object0 = androidWebViewContainer$destroy$10.result;
        Object object1 = b.l();
        switch(androidWebViewContainer$destroy$10.label) {
            case 0: {
                f0.n(object0);
                g g0 = this.scope.getCoroutineContext().plus(W0.a);
                com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy.2 androidWebViewContainer$destroy$20 = new o(null) {
                    int label;

                    {
                        AndroidWebViewContainer.this = androidWebViewContainer0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy.2(AndroidWebViewContainer.this, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        ViewParent viewParent0 = AndroidWebViewContainer.this.getWebView().getParent();
                        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
                        if(viewGroup0 != null) {
                            viewGroup0.removeView(AndroidWebViewContainer.this.getWebView());
                        }
                        AndroidWebViewContainer.this.getWebView().destroy();
                        return S0.a;
                    }
                };
                androidWebViewContainer$destroy$10.L$0 = this;
                androidWebViewContainer$destroy$10.label = 1;
                if(kotlinx.coroutines.i.h(g0, androidWebViewContainer$destroy$20, androidWebViewContainer$destroy$10) == object1) {
                    return object1;
                }
                androidWebViewContainer0 = this;
                break;
            }
            case 1: {
                androidWebViewContainer0 = (AndroidWebViewContainer)androidWebViewContainer$destroy$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        P.f(androidWebViewContainer0.scope, null, 1, null);
        return S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.WebViewContainer
    @m
    public Object evaluateJavascript(@l String s, @l d d0) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript.1 androidWebViewContainer$evaluateJavascript$10;
        if(d0 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript.1) {
            androidWebViewContainer$evaluateJavascript$10 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript.1)d0;
            int v = androidWebViewContainer$evaluateJavascript$10.label;
            if((v & 0x80000000) == 0) {
                androidWebViewContainer$evaluateJavascript$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.evaluateJavascript(null, this);
                    }
                };
            }
            else {
                androidWebViewContainer$evaluateJavascript$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidWebViewContainer$evaluateJavascript$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.evaluateJavascript(null, this);
                }
            };
        }
        Object object0 = androidWebViewContainer$evaluateJavascript$10.result;
        Object object1 = b.l();
        switch(androidWebViewContainer$evaluateJavascript$10.label) {
            case 0: {
                f0.n(object0);
                try {
                    g g0 = this.scope.getCoroutineContext();
                    com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript.2 androidWebViewContainer$evaluateJavascript$20 = new o(s, null) {
                        final String $script;
                        int label;

                        {
                            AndroidWebViewContainer.this = androidWebViewContainer0;
                            this.$script = s;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript.2(AndroidWebViewContainer.this, this.$script, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript.2)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            if(this.label != 0) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                            f0.n(object0);
                            AndroidWebViewContainer.this.getWebView().evaluateJavascript("javascript:" + this.$script, null);
                            return S0.a;
                        }
                    };
                    androidWebViewContainer$evaluateJavascript$10.label = 1;
                    if(kotlinx.coroutines.i.h(g0, androidWebViewContainer$evaluateJavascript$20, androidWebViewContainer$evaluateJavascript$10) == object1) {
                        return object1;
                    }
                }
                catch(CancellationException unused_ex) {
                }
                return S0.a;
            }
            case 1: {
                try {
                    f0.n(object0);
                }
                catch(CancellationException unused_ex) {
                }
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // com.unity3d.ads.adplayer.WebViewContainer
    @l
    public U getLastInputEvent() {
        return this.lastInputEvent;
    }

    @l
    public final O getScope() {
        return this.scope;
    }

    @l
    public final WebView getWebView() {
        return this.webView;
    }

    @l
    public final E get_lastInputEvent() {
        return this._lastInputEvent;
    }

    @Override  // com.unity3d.ads.adplayer.WebViewContainer
    @m
    public Object loadUrl(@l String s, @l d d0) {
        List list0;
        AndroidWebViewContainer androidWebViewContainer1;
        AndroidWebViewContainer androidWebViewContainer0;
        com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl.1 androidWebViewContainer$loadUrl$10;
        if(d0 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl.1) {
            androidWebViewContainer$loadUrl$10 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl.1)d0;
            int v = androidWebViewContainer$loadUrl$10.label;
            if((v & 0x80000000) == 0) {
                androidWebViewContainer$loadUrl$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.loadUrl(null, this);
                    }
                };
            }
            else {
                androidWebViewContainer$loadUrl$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidWebViewContainer$loadUrl$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.loadUrl(null, this);
                }
            };
        }
        Object object0 = androidWebViewContainer$loadUrl$10.result;
        Object object1 = b.l();
        switch(androidWebViewContainer$loadUrl$10.label) {
            case 0: {
                f0.n(object0);
                g g0 = this.scope.getCoroutineContext();
                com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl.2 androidWebViewContainer$loadUrl$20 = new o(s, null) {
                    final String $url;
                    int label;

                    {
                        AndroidWebViewContainer.this = androidWebViewContainer0;
                        this.$url = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl.2(AndroidWebViewContainer.this, this.$url, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        AndroidWebViewContainer.this.getWebView().loadUrl(this.$url);
                        return S0.a;
                    }
                };
                androidWebViewContainer$loadUrl$10.L$0 = this;
                androidWebViewContainer$loadUrl$10.label = 1;
                if(kotlinx.coroutines.i.h(g0, androidWebViewContainer$loadUrl$20, androidWebViewContainer$loadUrl$10) == object1) {
                    return object1;
                }
                androidWebViewContainer0 = this;
                goto label_24;
            }
            case 1: {
                androidWebViewContainer0 = (AndroidWebViewContainer)androidWebViewContainer$loadUrl$10.L$0;
                f0.n(object0);
            label_24:
                androidWebViewContainer$loadUrl$10.L$0 = androidWebViewContainer0;
                androidWebViewContainer$loadUrl$10.label = 2;
                object0 = androidWebViewContainer0.webViewClient.getOnLoadFinished().o(androidWebViewContainer$loadUrl$10);
                if(object0 == object1) {
                    return object1;
                }
                goto label_31;
            }
            case 2: {
                androidWebViewContainer0 = (AndroidWebViewContainer)androidWebViewContainer$loadUrl$10.L$0;
                f0.n(object0);
            label_31:
                if(!((List)object0).isEmpty()) {
                    androidWebViewContainer$loadUrl$10.L$0 = androidWebViewContainer0;
                    androidWebViewContainer$loadUrl$10.L$1 = (List)object0;
                    androidWebViewContainer$loadUrl$10.label = 3;
                    if(androidWebViewContainer0.destroy(androidWebViewContainer$loadUrl$10) == object1) {
                        return object1;
                    }
                    androidWebViewContainer1 = androidWebViewContainer0;
                    list0 = (List)object0;
                    break;
                }
                return S0.a;
            }
            case 3: {
                list0 = (List)androidWebViewContainer$loadUrl$10.L$1;
                androidWebViewContainer1 = (AndroidWebViewContainer)androidWebViewContainer$loadUrl$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        androidWebViewContainer1.sendWebViewClientErrorDiagnostics.invoke(list0);
        throw new LoadWebViewError(list0);
    }

    private final Object onRenderProcessGone(d d0) {
        AndroidWebViewContainer androidWebViewContainer0;
        com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone.1 androidWebViewContainer$onRenderProcessGone$10;
        if(d0 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone.1) {
            androidWebViewContainer$onRenderProcessGone$10 = (com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone.1)d0;
            int v = androidWebViewContainer$onRenderProcessGone$10.label;
            if((v & 0x80000000) == 0) {
                androidWebViewContainer$onRenderProcessGone$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.onRenderProcessGone(this);
                    }
                };
            }
            else {
                androidWebViewContainer$onRenderProcessGone$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidWebViewContainer$onRenderProcessGone$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.onRenderProcessGone(this);
                }
            };
        }
        Object object0 = androidWebViewContainer$onRenderProcessGone$10.result;
        Object object1 = b.l();
        switch(androidWebViewContainer$onRenderProcessGone$10.label) {
            case 0: {
                f0.n(object0);
                androidWebViewContainer$onRenderProcessGone$10.L$0 = this;
                androidWebViewContainer$onRenderProcessGone$10.label = 1;
                if(this.destroy(androidWebViewContainer$onRenderProcessGone$10) == object1) {
                    return object1;
                }
                androidWebViewContainer0 = this;
                break;
            }
            case 1: {
                androidWebViewContainer0 = (AndroidWebViewContainer)androidWebViewContainer$onRenderProcessGone$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        List list0 = u.k(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null));
        androidWebViewContainer0.sendWebViewClientErrorDiagnostics.invoke(list0);
        return S0.a;
    }
}

