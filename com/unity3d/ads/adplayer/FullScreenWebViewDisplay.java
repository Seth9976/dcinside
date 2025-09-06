package com.unity3d.ads.adplayer;

import A3.a;
import A3.o;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent.DefaultImpls;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import java.util.Map;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.h0;
import org.json.JSONObject;
import y4.l;
import y4.m;

@s0({"SMAP\nFullScreenWebViewDisplay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullScreenWebViewDisplay.kt\ncom/unity3d/ads/adplayer/FullScreenWebViewDisplay\n+ 2 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,115:1\n29#2,5:116\n29#2,5:127\n1#3:121\n20#4:122\n22#4:126\n50#5:123\n55#5:125\n106#6:124\n*S KotlinDebug\n*F\n+ 1 FullScreenWebViewDisplay.kt\ncom/unity3d/ads/adplayer/FullScreenWebViewDisplay\n*L\n30#1:116,5\n99#1:127,5\n58#1:122\n58#1:126\n58#1:123\n58#1:125\n58#1:124\n*E\n"})
public final class FullScreenWebViewDisplay extends ComponentActivity implements IServiceComponent {
    @l
    private String opportunityId;
    @m
    private Map showOptions;

    public FullScreenWebViewDisplay() {
        this.opportunityId = "";
    }

    @Override  // com.unity3d.services.core.di.IServiceComponent
    @l
    public IServiceProvider getServiceProvider() {
        return DefaultImpls.getServiceProvider(this);
    }

    private final void listenToAdPlayerEvents() {
        k.U0(k.e1(new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay.listenToAdPlayerEvents..inlined.filter.1.2 fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay.listenToAdPlayerEvents..inlined.filter.1.2.1 fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.FullScreenWebViewDisplay.listenToAdPlayerEvents..inlined.filter.1.2.1) {
                            fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$10 = (com.unity3d.ads.adplayer.FullScreenWebViewDisplay.listenToAdPlayerEvents..inlined.filter.1.2.1)d0;
                            int v = fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$10.result;
                        Object object2 = b.l();
                        switch(fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = FullScreenWebViewDisplay.this;
                                if(L.g(((DisplayMessage)object0).getOpportunityId(), FullScreenWebViewDisplay.this.opportunityId)) {
                                    fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$10.label = 1;
                                    if(j0.emit(object0, fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$10) == object2) {
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
                Object object0 = this.collect(fullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }, new o(null) {
            Object L$0;
            int label;

            {
                FullScreenWebViewDisplay.this = fullScreenWebViewDisplay0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay.listenToAdPlayerEvents.2(FullScreenWebViewDisplay.this, d0);
                d1.L$0 = object0;
                return d1;
            }

            @m
            public final Object invoke(@l DisplayMessage displayMessage0, @m d d0) {
                return ((com.unity3d.ads.adplayer.FullScreenWebViewDisplay.listenToAdPlayerEvents.2)this.create(displayMessage0, d0)).invokeSuspend(S0.a);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((DisplayMessage)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                DisplayMessage displayMessage0 = (DisplayMessage)this.L$0;
                if(displayMessage0 instanceof DisplayFinishRequest) {
                    FullScreenWebViewDisplay.this.finish();
                    return S0.a;
                }
                if(displayMessage0 instanceof WebViewInstanceResponse) {
                    WebView webView0 = ((WebViewInstanceResponse)displayMessage0).getWebView();
                    FullScreenWebViewDisplay.this.loadWebView(webView0);
                    return S0.a;
                }
                if(displayMessage0 instanceof SetOrientation) {
                    int v = ((SetOrientation)displayMessage0).getOrientation();
                    FullScreenWebViewDisplay.this.setRequestedOrientation(v);
                }
                return S0.a;
            }
        }), LifecycleOwnerKt.a(this));
    }

    private final void loadWebView(WebView webView0) {
        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), null, null, new o(webView0, null) {
            final WebView $webView;
            int label;

            {
                FullScreenWebViewDisplay.this = fullScreenWebViewDisplay0;
                this.$webView = webView0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.FullScreenWebViewDisplay.loadWebView.1(FullScreenWebViewDisplay.this, this.$webView, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.FullScreenWebViewDisplay.loadWebView.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        FullScreenWebViewDisplay.this.setContentView(this.$webView);
                        D d0 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        DisplayReady displayMessage$DisplayReady0 = new DisplayReady(FullScreenWebViewDisplay.this.opportunityId, FullScreenWebViewDisplay.this.showOptions);
                        this.label = 1;
                        return d0.emit(displayMessage$DisplayReady0, this) == object1 ? object1 : S0.a;
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
        }, 3, null);
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onCreate..inlined.inject.default.1 fullScreenWebViewDisplay$onCreate$$inlined$inject$default$10 = new a("") {
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
                kotlin.reflect.d d0 = m0.d(SendDiagnosticEvent.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        kotlin.D d0 = E.c(H.c, fullScreenWebViewDisplay$onCreate$$inlined$inject$default$10);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(FullScreenWebViewDisplay.onCreate$lambda$0(d0), "native_show_ad_viewer_fullscreen_intent_creation_starts", null, null, null, null, 30, null);
        String s = this.getIntent().getStringExtra("opportunityId");
        if(s == null) {
            this.setResult(0);
            this.finish();
            kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), null, null, new o(null) {
                final FullScreenWebViewDisplay $this_run;
                int label;

                {
                    this.$this_run = fullScreenWebViewDisplay0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onCreate.1.1(this.$this_run, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onCreate.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.label) {
                        case 0: {
                            f0.n(object0);
                            D d0 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                            DisplayError displayMessage$DisplayError0 = new DisplayError(this.$this_run.opportunityId, "Opportunity ID not found");
                            this.label = 1;
                            return d0.emit(displayMessage$DisplayError0, this) == object1 ? object1 : S0.a;
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
            }, 3, null);
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(FullScreenWebViewDisplay.onCreate$lambda$0(d0), "native_show_ad_viewer_fullscreen_intent_creation_fails", null, null, null, null, 30, null);
            return;
        }
        this.opportunityId = s;
        boolean z = this.getIntent().hasExtra("orientation");
        if((z ? Boolean.valueOf(z) : null) != null) {
            this.setRequestedOrientation(this.getIntent().getIntExtra("orientation", -1));
        }
        String s1 = this.getIntent().getStringExtra("showOptions");
        this.showOptions = s1 == null ? null : JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(s1));
        this.listenToAdPlayerEvents();
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(FullScreenWebViewDisplay.onCreate$lambda$0(d0), "native_show_ad_viewer_fullscreen_intent_creation_success_time", null, null, null, null, 30, null);
        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), null, null, new o(null) {
            int label;

            {
                FullScreenWebViewDisplay.this = fullScreenWebViewDisplay0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onCreate.5(FullScreenWebViewDisplay.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onCreate.5)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        D d0 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        WebViewInstanceRequest displayMessage$WebViewInstanceRequest0 = new WebViewInstanceRequest(FullScreenWebViewDisplay.this.opportunityId);
                        this.label = 1;
                        return d0.emit(displayMessage$WebViewInstanceRequest0, this) == object1 ? object1 : S0.a;
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
        }, 3, null);
    }

    private static final SendDiagnosticEvent onCreate$lambda$0(kotlin.D d0) {
        return (SendDiagnosticEvent)d0.getValue();
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onDestroy..inlined.inject.default.1 fullScreenWebViewDisplay$onDestroy$$inlined$inject$default$10 = new a("") {
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
                kotlin.reflect.d d0 = m0.d(SendDiagnosticEvent.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(FullScreenWebViewDisplay.onDestroy$lambda$6(E.c(H.c, fullScreenWebViewDisplay$onDestroy$$inlined$inject$default$10)), "native_show_ad_viewer_fullscreen_intent_destroyed", null, null, null, null, 30, null);
        kotlinx.coroutines.k.f(P.a(h0.e()), null, null, new o(null) {
            int label;

            {
                FullScreenWebViewDisplay.this = fullScreenWebViewDisplay0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onDestroy.1(FullScreenWebViewDisplay.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onDestroy.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        D d0 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        DisplayDestroyed displayMessage$DisplayDestroyed0 = new DisplayDestroyed(FullScreenWebViewDisplay.this.opportunityId);
                        this.label = 1;
                        return d0.emit(displayMessage$DisplayDestroyed0, this) == object1 ? object1 : S0.a;
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
        }, 3, null);
    }

    private static final SendDiagnosticEvent onDestroy$lambda$6(kotlin.D d0) {
        return (SendDiagnosticEvent)d0.getValue();
    }

    @Override  // android.app.Activity
    public boolean onKeyDown(int v, @m KeyEvent keyEvent0) {
        return v == 4;
    }

    @Override  // android.app.Activity
    protected void onPause() {
        super.onPause();
        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), null, null, new o(null) {
            int label;

            {
                FullScreenWebViewDisplay.this = fullScreenWebViewDisplay0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onPause.1(FullScreenWebViewDisplay.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onPause.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        D d0 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        VisibilityChanged displayMessage$VisibilityChanged0 = new VisibilityChanged(FullScreenWebViewDisplay.this.opportunityId, false);
                        this.label = 1;
                        return d0.emit(displayMessage$VisibilityChanged0, this) == object1 ? object1 : S0.a;
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
        }, 3, null);
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), null, null, new o(null) {
            int label;

            {
                FullScreenWebViewDisplay.this = fullScreenWebViewDisplay0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onResume.1(FullScreenWebViewDisplay.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onResume.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        D d0 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        VisibilityChanged displayMessage$VisibilityChanged0 = new VisibilityChanged(FullScreenWebViewDisplay.this.opportunityId, true);
                        this.label = 1;
                        return d0.emit(displayMessage$VisibilityChanged0, this) == object1 ? object1 : S0.a;
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
        }, 3, null);
    }

    @Override  // android.app.Activity
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        kotlinx.coroutines.k.f(LifecycleOwnerKt.a(this), null, null, new o(z, null) {
            final boolean $hasFocus;
            int label;

            {
                FullScreenWebViewDisplay.this = fullScreenWebViewDisplay0;
                this.$hasFocus = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onWindowFocusChanged.1(FullScreenWebViewDisplay.this, this.$hasFocus, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.FullScreenWebViewDisplay.onWindowFocusChanged.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        D d0 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        FocusChanged displayMessage$FocusChanged0 = new FocusChanged(FullScreenWebViewDisplay.this.opportunityId, this.$hasFocus);
                        this.label = 1;
                        return d0.emit(displayMessage$FocusChanged0, this) == object1 ? object1 : S0.a;
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
        }, 3, null);
    }
}

