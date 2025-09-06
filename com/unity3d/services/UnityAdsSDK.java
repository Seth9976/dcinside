package com.unity3d.services;

import A3.a;
import A3.o;
import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.EmptyParams;
import com.unity3d.services.core.domain.task.InitializeSDK;
import java.util.Map;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nUnityAdsSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnityAdsSDK.kt\ncom/unity3d/services/UnityAdsSDK\n+ 2 IServiceComponent.kt\ncom/unity3d/services/core/di/IServiceComponentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n29#2,5:207\n29#2,5:212\n29#2,5:217\n29#2,5:222\n19#2:227\n29#2,5:228\n19#2:233\n29#2,5:234\n19#2:239\n16#2,4:240\n29#2,5:244\n29#2,5:249\n19#2:254\n29#2,5:255\n29#2,5:260\n29#2,5:265\n29#2,5:271\n29#2,5:276\n29#2,5:281\n19#2:286\n29#2,5:287\n29#2,5:292\n1#3:270\n*S KotlinDebug\n*F\n+ 1 UnityAdsSDK.kt\ncom/unity3d/services/UnityAdsSDK\n*L\n72#1:207,5\n76#1:212,5\n77#1:217,5\n78#1:222,5\n80#1:227\n100#1:228,5\n103#1:233\n104#1:234,5\n114#1:239\n115#1:240,4\n133#1:244,5\n136#1:249,5\n137#1:254\n146#1:255,5\n147#1:260,5\n148#1:265,5\n186#1:271,5\n189#1:276,5\n190#1:281,5\n191#1:286\n200#1:287,5\n203#1:292,5\n*E\n"})
public final class UnityAdsSDK implements IServiceComponent {
    @l
    private final IServiceProvider serviceProvider;

    public UnityAdsSDK() {
        this(null, 1, null);
    }

    public UnityAdsSDK(@l IServiceProvider iServiceProvider0) {
        L.p(iServiceProvider0, "serviceProvider");
        super();
        this.serviceProvider = iServiceProvider0;
    }

    public UnityAdsSDK(IServiceProvider iServiceProvider0, int v, w w0) {
        if((v & 1) != 0) {
            iServiceProvider0 = ServiceProvider.INSTANCE;
        }
        this(iServiceProvider0);
    }

    private final Object fetchToken(String s, d d0) {
        String s3;
        String s2;
        String s1;
        com.unity3d.services.UnityAdsSDK.fetchToken..inlined.inject.default.1 unityAdsSDK$fetchToken$$inlined$inject$default$10 = new a("") {
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
                kotlin.reflect.d d0 = m0.d(GetHeaderBiddingToken.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        D d1 = E.c(H.c, unityAdsSDK$fetchToken$$inlined$inject$default$10);
        com.unity3d.services.UnityAdsSDK.fetchToken..inlined.inject.default.2 unityAdsSDK$fetchToken$$inlined$inject$default$20 = new a("") {
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
                kotlin.reflect.d d0 = m0.d(GetInitializationState.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        D d2 = E.c(H.c, unityAdsSDK$fetchToken$$inlined$inject$default$20);
        com.unity3d.services.UnityAdsSDK.fetchToken..inlined.inject.default.3 unityAdsSDK$fetchToken$$inlined$inject$default$30 = new a("") {
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
        D d3 = E.c(H.c, unityAdsSDK$fetchToken$$inlined$inject$default$30);
        DefaultImpls.invoke$default(UnityAdsSDK.fetchToken$lambda$10(d3), "native_gateway_token_started", null, Y.W(new V[]{r0.a("sync", s), r0.a("state", com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(UnityAdsSDK.fetchToken$lambda$9(d2), false, 1, null).toString())}), null, null, 26, null);
        if(com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(UnityAdsSDK.fetchToken$lambda$9(d2), false, 1, null) == InitializationState.INITIALIZED) {
            try {
                s1 = "uncaught_exception";
                s3 = (String)j.b(null, new o(null) {
                    final D $getHeaderBiddingToken$delegate;
                    int label;

                    {
                        this.$getHeaderBiddingToken$delegate = d0;
                        super(2, d1);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.services.UnityAdsSDK.fetchToken.token.1(this.$getHeaderBiddingToken$delegate, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.services.UnityAdsSDK.fetchToken.token.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                GetHeaderBiddingToken getHeaderBiddingToken0 = UnityAdsSDK.fetchToken$lambda$8(this.$getHeaderBiddingToken$delegate);
                                this.label = 1;
                                object0 = getHeaderBiddingToken0.invoke(this);
                                return object0 == object1 ? object1 : object0;
                            }
                            case 1: {
                                f0.n(object0);
                                return object0;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                }, 1, null);
                s1 = null;
                s2 = null;
            }
            catch(Exception exception0) {
                s2 = ExceptionExtensionsKt.getShortenedStackTrace$default(exception0, 0, 1, null);
                s3 = null;
            }
        }
        else {
            s1 = "not_initialized";
            s2 = null;
            s3 = null;
        }
        SendDiagnosticEvent sendDiagnosticEvent0 = UnityAdsSDK.fetchToken$lambda$10(d3);
        Double double0 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(kotlin.time.s.b.a.d(3593900L)));
        Map map0 = Y.g();
        map0.put("sync", s);
        map0.put("state", com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(UnityAdsSDK.fetchToken$lambda$9(d2), false, 1, null).toString());
        if(s1 != null) {
            String s4 = (String)map0.put("reason", s1);
        }
        if(s2 != null) {
            map0.put("reason_debug", s2);
        }
        DefaultImpls.invoke$default(sendDiagnosticEvent0, (s3 == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time"), double0, Y.d(map0), null, null, 24, null);
        return s3;
    }

    private static final SendDiagnosticEvent fetchToken$lambda$10(D d0) {
        return (SendDiagnosticEvent)d0.getValue();
    }

    private static final GetHeaderBiddingToken fetchToken$lambda$8(D d0) {
        return (GetHeaderBiddingToken)d0.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$9(D d0) {
        return (GetInitializationState)d0.getValue();
    }

    @l
    public final I0 finishOMIDSession(@l String s) {
        L.p(s, "opportunityId");
        H h0 = H.c;
        if(!UnityAdsSDK.finishOMIDSession$lambda$14(E.c(h0, new a("") {
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
                kotlin.reflect.d d0 = m0.d(AlternativeFlowReader.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        })).invoke()) {
            I0 i00 = O0.c(null, 1, null);
            ((A)i00).a();
            return i00;
        }
        D d0 = E.c(h0, new a("") {
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
                kotlin.reflect.d d0 = m0.d(GetAdObject.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        });
        D d1 = E.c(h0, new a("") {
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
                kotlin.reflect.d d0 = m0.d(OmFinishSession.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        });
        O o0 = (O)this.getServiceProvider().getRegistry().getService("omid_scope", m0.d(O.class));
        return k.f(o0, null, null, new o(o0, d0, d1, null) {
            final D $getAdObject$delegate;
            final D $omFinishSession$delegate;
            final O $omidScope;
            final String $opportunityId;
            int label;

            {
                this.$opportunityId = s;
                this.$omidScope = o0;
                this.$getAdObject$delegate = d0;
                this.$omFinishSession$delegate = d1;
                super(2, d2);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.UnityAdsSDK.finishOMIDSession.2(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.UnityAdsSDK.finishOMIDSession.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        GetAdObject getAdObject0 = UnityAdsSDK.finishOMIDSession$lambda$16(this.$getAdObject$delegate);
                        this.label = 1;
                        object0 = getAdObject0.invoke(this.$opportunityId, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        goto label_10;
                    }
                    case 1: {
                        f0.n(object0);
                    label_10:
                        if(((AdObject)object0) != null) {
                            OmFinishSession omFinishSession0 = UnityAdsSDK.finishOMIDSession$lambda$17(this.$omFinishSession$delegate);
                            this.label = 2;
                            if(omFinishSession0.invoke(((AdObject)object0), this) == object1) {
                                return object1;
                            }
                        }
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                P.f(this.$omidScope, null, 1, null);
                return S0.a;
            }
        }, 3, null);
    }

    private static final AlternativeFlowReader finishOMIDSession$lambda$14(D d0) {
        return (AlternativeFlowReader)d0.getValue();
    }

    private static final GetAdObject finishOMIDSession$lambda$16(D d0) {
        return (GetAdObject)d0.getValue();
    }

    private static final OmFinishSession finishOMIDSession$lambda$17(D d0) {
        return (OmFinishSession)d0.getValue();
    }

    @Override  // com.unity3d.services.core.di.IServiceComponent
    @l
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    @m
    public final String getToken() {
        return (String)j.b(null, new o(null) {
            int label;

            {
                UnityAdsSDK.this = unityAdsSDK0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.UnityAdsSDK.getToken.1(UnityAdsSDK.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.UnityAdsSDK.getToken.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        object0 = UnityAdsSDK.this.fetchToken("true", this);
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 1, null);
    }

    @l
    public final I0 getToken(@m IUnityAdsTokenListener iUnityAdsTokenListener0) {
        com.unity3d.services.UnityAdsSDK.getToken..inlined.inject.default.1 unityAdsSDK$getToken$$inlined$inject$default$10 = new a("") {
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
                kotlin.reflect.d d0 = m0.d(GetGameId.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        this.initialize(UnityAdsSDK.getToken$lambda$6(E.c(H.c, unityAdsSDK$getToken$$inlined$inject$default$10)).invoke(), "get_token");
        com.unity3d.services.UnityAdsSDK.getToken..inlined.inject.default.2 unityAdsSDK$getToken$$inlined$inject$default$20 = new a("") {
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
                kotlin.reflect.d d0 = m0.d(GetAsyncHeaderBiddingToken.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        D d0 = E.c(H.c, unityAdsSDK$getToken$$inlined$inject$default$20);
        Object object0 = this.getServiceProvider().getRegistry().getService("get_token_scope", m0.d(O.class));
        return k.f(((O)object0), null, null, new o(((O)object0), d0, null) {
            final D $getAsyncHeaderBiddingToken$delegate;
            final O $getTokenScope;
            final IUnityAdsTokenListener $listener;
            int label;

            {
                this.$listener = iUnityAdsTokenListener0;
                this.$getTokenScope = o0;
                this.$getAsyncHeaderBiddingToken$delegate = d0;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.UnityAdsSDK.getToken.2(this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.UnityAdsSDK.getToken.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        GetAsyncHeaderBiddingToken getAsyncHeaderBiddingToken0 = UnityAdsSDK.getToken$lambda$7(this.$getAsyncHeaderBiddingToken$delegate);
                        this.label = 1;
                        if(getAsyncHeaderBiddingToken0.invoke(this.$listener, this) == object1) {
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
                P.f(this.$getTokenScope, null, 1, null);
                return S0.a;
            }
        }, 3, null);
    }

    private static final GetGameId getToken$lambda$6(D d0) {
        return (GetGameId)d0.getValue();
    }

    private static final GetAsyncHeaderBiddingToken getToken$lambda$7(D d0) {
        return (GetAsyncHeaderBiddingToken)d0.getValue();
    }

    @l
    public final I0 initialize(@m String s, @l String s1) {
        synchronized(this) {
            L.p(s1, "source");
            H h0 = H.c;
            if(!UnityAdsSDK.initialize$lambda$0(E.c(h0, new a("") {
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
                    kotlin.reflect.d d0 = m0.d(ShouldAllowInitialization.class);
                    return iServicesRegistry0.getService(this.$named, d0);
                }
            })).invoke(s)) {
                return O0.c(null, 1, null);
            }
            D d0 = E.c(h0, new a("") {
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
                    kotlin.reflect.d d0 = m0.d(AlternativeFlowReader.class);
                    return iServicesRegistry0.getService(this.$named, d0);
                }
            });
            D d1 = E.c(h0, new a("") {
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
                    kotlin.reflect.d d0 = m0.d(InitializeSDK.class);
                    return iServicesRegistry0.getService(this.$named, d0);
                }
            });
            D d2 = E.c(h0, new a("") {
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
                    kotlin.reflect.d d0 = m0.d(InitializeBoldSDK.class);
                    return iServicesRegistry0.getService(this.$named, d0);
                }
            });
            O o0 = (O)this.getServiceProvider().getRegistry().getService("init_scope", m0.d(O.class));
            return k.f(o0, null, null, new o(o0, d0, d2, d1, null) {
                final D $alternativeFlowReader$delegate;
                final O $initScope;
                final D $initializeBoldSDK$delegate;
                final D $initializeSDK$delegate;
                final String $source;
                int label;

                {
                    this.$source = s;
                    this.$initScope = o0;
                    this.$alternativeFlowReader$delegate = d0;
                    this.$initializeBoldSDK$delegate = d1;
                    this.$initializeSDK$delegate = d2;
                    super(2, d3);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.unity3d.services.UnityAdsSDK.initialize.1(this.$source, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.unity3d.services.UnityAdsSDK.initialize.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.label) {
                        case 0: {
                            f0.n(object0);
                            if(UnityAdsSDK.initialize$lambda$1(this.$alternativeFlowReader$delegate).invoke()) {
                                InitializeBoldSDK initializeBoldSDK0 = UnityAdsSDK.initialize$lambda$3(this.$initializeBoldSDK$delegate);
                                this.label = 1;
                                if(initializeBoldSDK0.invoke(this.$source, this) == object1) {
                                    return object1;
                                }
                            }
                            else {
                                InitializeSDK initializeSDK0 = UnityAdsSDK.initialize$lambda$2(this.$initializeSDK$delegate);
                                this.label = 2;
                                if(initializeSDK0.invoke-gIAlu-s(EmptyParams.INSTANCE, this) == object1) {
                                    return object1;
                                }
                            }
                            break;
                        }
                        case 1: {
                            f0.n(object0);
                            break;
                        }
                        case 2: {
                            f0.n(object0);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    P.f(this.$initScope, null, 1, null);
                    return S0.a;
                }
            }, 3, null);
        }
    }

    public static I0 initialize$default(UnityAdsSDK unityAdsSDK0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = "api";
        }
        return unityAdsSDK0.initialize(s, s1);
    }

    private static final ShouldAllowInitialization initialize$lambda$0(D d0) {
        return (ShouldAllowInitialization)d0.getValue();
    }

    private static final AlternativeFlowReader initialize$lambda$1(D d0) {
        return (AlternativeFlowReader)d0.getValue();
    }

    private static final InitializeSDK initialize$lambda$2(D d0) {
        return (InitializeSDK)d0.getValue();
    }

    private static final InitializeBoldSDK initialize$lambda$3(D d0) {
        return (InitializeBoldSDK)d0.getValue();
    }

    @l
    public final I0 load(@m String s, @l UnityAdsLoadOptions unityAdsLoadOptions0, @m IUnityAdsLoadListener iUnityAdsLoadListener0, @m UnityBannerSize unityBannerSize0) {
        L.p(unityAdsLoadOptions0, "loadOptions");
        com.unity3d.services.UnityAdsSDK.load..inlined.inject.default.1 unityAdsSDK$load$$inlined$inject$default$10 = new a("") {
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
                kotlin.reflect.d d0 = m0.d(GetGameId.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        this.initialize(UnityAdsSDK.load$lambda$4(E.c(H.c, unityAdsSDK$load$$inlined$inject$default$10)).invoke(), "load");
        Object object0 = this.getServiceProvider().getRegistry().getService("load_scope", m0.d(O.class));
        com.unity3d.services.UnityAdsSDK.load..inlined.inject.default.2 unityAdsSDK$load$$inlined$inject$default$20 = new a("") {
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
                kotlin.reflect.d d0 = m0.d(Context.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        };
        return k.f(((O)object0), null, null, new o(s, unityAdsLoadOptions0, iUnityAdsLoadListener0, unityBannerSize0, ((O)object0), E.c(H.c, unityAdsSDK$load$$inlined$inject$default$20), null) {
            final UnityBannerSize $bannerSize;
            final D $context$delegate;
            final IUnityAdsLoadListener $listener;
            final UnityAdsLoadOptions $loadOptions;
            final O $loadScope;
            final String $placementId;
            int label;

            {
                UnityAdsSDK.this = unityAdsSDK0;
                this.$placementId = s;
                this.$loadOptions = unityAdsLoadOptions0;
                this.$listener = iUnityAdsLoadListener0;
                this.$bannerSize = unityBannerSize0;
                this.$loadScope = o0;
                this.$context$delegate = d0;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.UnityAdsSDK.load.1(UnityAdsSDK.this, this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.UnityAdsSDK.load.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = UnityAdsSDK.this.getServiceProvider().getRegistry().getService("", m0.d(LegacyLoadUseCase.class));
                        Context context0 = UnityAdsSDK.load$lambda$5(this.$context$delegate);
                        this.label = 1;
                        if(((LegacyLoadUseCase)object2).invoke(context0, this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this) == object1) {
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
                P.f(this.$loadScope, null, 1, null);
                return S0.a;
            }
        }, 3, null);
    }

    public static I0 load$default(UnityAdsSDK unityAdsSDK0, String s, UnityAdsLoadOptions unityAdsLoadOptions0, IUnityAdsLoadListener iUnityAdsLoadListener0, UnityBannerSize unityBannerSize0, int v, Object object0) {
        if((v & 8) != 0) {
            unityBannerSize0 = null;
        }
        return unityAdsSDK0.load(s, unityAdsLoadOptions0, iUnityAdsLoadListener0, unityBannerSize0);
    }

    private static final GetGameId load$lambda$4(D d0) {
        return (GetGameId)d0.getValue();
    }

    private static final Context load$lambda$5(D d0) {
        return (Context)d0.getValue();
    }

    public final void sendBannerDestroyed() {
        H h0 = H.c;
        if(!UnityAdsSDK.sendBannerDestroyed$lambda$18(E.c(h0, new a("") {
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
                kotlin.reflect.d d0 = m0.d(AlternativeFlowReader.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        })).invoke()) {
            return;
        }
        DefaultImpls.invoke$default(UnityAdsSDK.sendBannerDestroyed$lambda$19(E.c(h0, new a("") {
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
        })), "native_banner_destroyed", null, null, null, null, 30, null);
    }

    private static final AlternativeFlowReader sendBannerDestroyed$lambda$18(D d0) {
        return (AlternativeFlowReader)d0.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$19(D d0) {
        return (SendDiagnosticEvent)d0.getValue();
    }

    @l
    public final I0 show(@l Activity activity0, @m String s, @m UnityAdsShowOptions unityAdsShowOptions0, @l Listeners listeners0) {
        L.p(activity0, "activity");
        L.p(listeners0, "listener");
        O o0 = (O)this.getServiceProvider().getRegistry().getService("show_scope", m0.d(O.class));
        return k.f(o0, null, null, new o(activity0, s, unityAdsShowOptions0, listeners0, o0, null) {
            final Activity $activity;
            final Listeners $listener;
            final String $placementId;
            final LegacyShowUseCase $showBoldSDK;
            final UnityAdsShowOptions $showOptions;
            final O $showScope;
            int label;

            {
                this.$showBoldSDK = legacyShowUseCase0;
                this.$activity = activity0;
                this.$placementId = s;
                this.$showOptions = unityAdsShowOptions0;
                this.$listener = listeners0;
                this.$showScope = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.UnityAdsSDK.show.1(this.$showBoldSDK, this.$activity, this.$placementId, this.$showOptions, this.$listener, this.$showScope, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.UnityAdsSDK.show.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        if(this.$showBoldSDK.invoke(this.$activity, this.$placementId, this.$showOptions, this.$listener, this) == object1) {
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
                P.f(this.$showScope, null, 1, null);
                return S0.a;
            }
        }, 3, null);
    }
}

