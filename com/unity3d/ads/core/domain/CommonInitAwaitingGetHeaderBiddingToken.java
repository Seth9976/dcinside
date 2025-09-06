package com.unity3d.ads.core.domain;

import A3.o;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.misc.Utilities;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.time.s.b.a;
import kotlinx.coroutines.O;
import kotlinx.coroutines.u1;
import y4.l;
import y4.m;

@s0({"SMAP\nCommonInitAwaitingGetHeaderBiddingToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonInitAwaitingGetHeaderBiddingToken.kt\ncom/unity3d/ads/core/domain/CommonInitAwaitingGetHeaderBiddingToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    @l
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    @l
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    @l
    private final GetInitializationState getInitializationState;
    @m
    private IUnityAdsTokenListener listener;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;
    @m
    private InitializationState startState;
    private final long startTime;

    public CommonInitAwaitingGetHeaderBiddingToken(@l GetHeaderBiddingToken getHeaderBiddingToken0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l GetInitializationState getInitializationState0, @l AwaitInitialization awaitInitialization0, @l SessionRepository sessionRepository0) {
        L.p(getHeaderBiddingToken0, "getHeaderBiddingToken");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(getInitializationState0, "getInitializationState");
        L.p(awaitInitialization0, "awaitInitialization");
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.getHeaderBiddingToken = getHeaderBiddingToken0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.getInitializationState = getInitializationState0;
        this.awaitInitialization = awaitInitialization0;
        this.sessionRepository = sessionRepository0;
        this.startTime = 4206500L;
    }

    private final Object fetchToken(d d0) {
        String s2;
        String s1;
        CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken0;
        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken.1 commonInitAwaitingGetHeaderBiddingToken$fetchToken$10;
        if(d0 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken.1) {
            commonInitAwaitingGetHeaderBiddingToken$fetchToken$10 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken.1)d0;
            int v = commonInitAwaitingGetHeaderBiddingToken$fetchToken$10.label;
            if((v & 0x80000000) == 0) {
                commonInitAwaitingGetHeaderBiddingToken$fetchToken$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.fetchToken(this);
                    }
                };
            }
            else {
                commonInitAwaitingGetHeaderBiddingToken$fetchToken$10.label = v ^ 0x80000000;
            }
        }
        else {
            commonInitAwaitingGetHeaderBiddingToken$fetchToken$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.fetchToken(this);
                }
            };
        }
        Object object0 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$10.result;
        Object object1 = b.l();
        String s = null;
        switch(commonInitAwaitingGetHeaderBiddingToken$fetchToken$10.label) {
            case 0: {
                f0.n(object0);
                try {
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$10.L$0 = this;
                    commonInitAwaitingGetHeaderBiddingToken$fetchToken$10.label = 1;
                    object0 = this.getHeaderBiddingToken.invoke(commonInitAwaitingGetHeaderBiddingToken$fetchToken$10);
                }
                catch(Exception exception0) {
                    commonInitAwaitingGetHeaderBiddingToken0 = this;
                    break;
                }
                if(object0 == object1) {
                    return object1;
                }
                commonInitAwaitingGetHeaderBiddingToken0 = this;
                s1 = null;
                s = (String)object0;
                s2 = null;
                goto label_35;
            }
            case 1: {
                commonInitAwaitingGetHeaderBiddingToken0 = (CommonInitAwaitingGetHeaderBiddingToken)commonInitAwaitingGetHeaderBiddingToken$fetchToken$10.L$0;
                try {
                    f0.n(object0);
                    s1 = null;
                    s = (String)object0;
                    s2 = null;
                    goto label_35;
                }
                catch(Exception exception0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        s2 = ExceptionExtensionsKt.getShortenedStackTrace$default(exception0, 0, 1, null);
        s1 = "uncaught_exception";
    label_35:
        if(s == null) {
            commonInitAwaitingGetHeaderBiddingToken0.tokenFailure(s1, s2);
            return S0.a;
        }
        commonInitAwaitingGetHeaderBiddingToken0.tokenSuccess(s);
        return S0.a;
    }

    @l
    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    @l
    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    @l
    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    @m
    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    @l
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    @l
    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    public final long getStartTime-z9LOYto() {
        return this.startTime;
    }

    @Override  // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    @m
    public Object invoke(@m IUnityAdsTokenListener iUnityAdsTokenListener0, @l d d0) {
        CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken0;
        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke.1 commonInitAwaitingGetHeaderBiddingToken$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke.1) {
            commonInitAwaitingGetHeaderBiddingToken$invoke$10 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke.1)d0;
            int v = commonInitAwaitingGetHeaderBiddingToken$invoke$10.label;
            if((v & 0x80000000) == 0) {
                commonInitAwaitingGetHeaderBiddingToken$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
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
                commonInitAwaitingGetHeaderBiddingToken$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            commonInitAwaitingGetHeaderBiddingToken$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
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
        Object object0 = commonInitAwaitingGetHeaderBiddingToken$invoke$10.result;
        Object object1 = b.l();
        switch(commonInitAwaitingGetHeaderBiddingToken$invoke$10.label) {
            case 0: {
                f0.n(object0);
                this.listener = iUnityAdsTokenListener0;
                this.tokenStart();
                if(iUnityAdsTokenListener0 == null) {
                    this.tokenFailure("listener_null", "IUnityAdsTokenListener is null");
                    return S0.a;
                }
                if(!this.sessionRepository.getShouldInitialize()) {
                    this.tokenFailure("gateway", "!sessionRepository.shouldInitialize");
                    return S0.a;
                }
                long v1 = (long)this.sessionRepository.getNativeConfiguration().getAdOperations().getGetTokenTimeoutMs();
                com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke.2 commonInitAwaitingGetHeaderBiddingToken$invoke$20 = new o(null) {
                    int label;

                    {
                        CommonInitAwaitingGetHeaderBiddingToken.this = commonInitAwaitingGetHeaderBiddingToken0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke.2(CommonInitAwaitingGetHeaderBiddingToken.this, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                if(kotlin.collections.l.s8(new InitializationState[]{InitializationState.NOT_INITIALIZED, InitializationState.INITIALIZING}, DefaultImpls.invoke$default(CommonInitAwaitingGetHeaderBiddingToken.this.getGetInitializationState(), false, 1, null))) {
                                    CommonInitAwaitingGetHeaderBiddingToken.this.didAwaitInit = true;
                                    this.label = 1;
                                    if(com.unity3d.ads.core.domain.AwaitInitialization.DefaultImpls.invoke$default(CommonInitAwaitingGetHeaderBiddingToken.this.getAwaitInitialization(), 0L, this, 1, null) == object1) {
                                        return object1;
                                    }
                                }
                                return S0.a;
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
                };
                commonInitAwaitingGetHeaderBiddingToken$invoke$10.L$0 = this;
                commonInitAwaitingGetHeaderBiddingToken$invoke$10.label = 1;
                if(u1.e(v1, commonInitAwaitingGetHeaderBiddingToken$invoke$20, commonInitAwaitingGetHeaderBiddingToken$invoke$10) == object1) {
                    return object1;
                }
                commonInitAwaitingGetHeaderBiddingToken0 = this;
                break;
            }
            case 1: {
                commonInitAwaitingGetHeaderBiddingToken0 = (CommonInitAwaitingGetHeaderBiddingToken)commonInitAwaitingGetHeaderBiddingToken$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            case 2: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!commonInitAwaitingGetHeaderBiddingToken0.sessionRepository.getShouldInitialize()) {
            commonInitAwaitingGetHeaderBiddingToken0.tokenFailure("gateway", "!sessionRepository.shouldInitialize");
            return S0.a;
        }
        commonInitAwaitingGetHeaderBiddingToken$invoke$10.L$0 = null;
        commonInitAwaitingGetHeaderBiddingToken$invoke$10.label = 2;
        return commonInitAwaitingGetHeaderBiddingToken0.fetchToken(commonInitAwaitingGetHeaderBiddingToken$invoke$10) == object1 ? object1 : S0.a;
    }

    public final void setListener(@m IUnityAdsTokenListener iUnityAdsTokenListener0) {
        this.listener = iUnityAdsTokenListener0;
    }

    private final void tokenFailure(String s, String s1) {
        SendDiagnosticEvent sendDiagnosticEvent0 = this.sendDiagnosticEvent;
        Double double0 = TimeExtensionsKt.elapsedMillis(a.d(this.startTime));
        Map map0 = Y.g();
        map0.put("sync", "false");
        map0.put("state", String.valueOf(this.startState));
        map0.put("complete_state", DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        map0.put("awaited_init", String.valueOf(this.didAwaitInit));
        if(s != null) {
            String s2 = (String)map0.put("reason", s);
        }
        if(s1 != null) {
            map0.put("reason_debug", s1);
        }
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent0, "native_gateway_token_failure_time", double0, Y.d(map0), null, null, 24, null);
        Utilities.wrapCustomerListener(() -> {
            L.p(this, "this$0");
            IUnityAdsTokenListener iUnityAdsTokenListener0 = this.listener;
            if(iUnityAdsTokenListener0 != null) {
                iUnityAdsTokenListener0.onUnityAdsTokenReady(null);
            }
        });
    }

    static void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken0.tokenFailure(s, s1);
    }

    // 检测为 Lambda 实现
    private static final void tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken0) [...]

    private final void tokenStart() {
        this.startState = DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        Map map0 = Y.W(new V[]{r0.a("sync", "false"), r0.a("state", String.valueOf(this.startState))});
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", null, map0, null, null, 26, null);
    }

    private final void tokenSuccess(String s) {
        Double double0 = TimeExtensionsKt.elapsedMillis(a.d(this.startTime));
        Map map0 = Y.W(new V[]{r0.a("sync", "false"), r0.a("state", String.valueOf(this.startState)), r0.a("complete_state", DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), r0.a("awaited_init", String.valueOf(this.didAwaitInit))});
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", double0, map0, null, null, 24, null);
        Utilities.wrapCustomerListener(() -> {
            L.p(this, "this$0");
            L.p(s, "$token");
            IUnityAdsTokenListener iUnityAdsTokenListener0 = this.listener;
            if(iUnityAdsTokenListener0 != null) {
                iUnityAdsTokenListener0.onUnityAdsTokenReady(s);
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken0, String s) [...]
}

