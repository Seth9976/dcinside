package com.unity3d.ads.core.domain;

import A3.o;
import com.unity3d.ads.UnityAds.UnityAdsInitializationError;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse;
import gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import kotlin.time.r;
import kotlin.time.s.b.a;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import kotlinx.coroutines.u1;
import y4.l;
import y4.m;

public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    @l
    public static final String MSG_NETWORK = "Network";
    @l
    public static final String MSG_TIMEOUT = "Timeout";
    @l
    public static final String MSG_UNKNOWN = "Initialization failure";
    @l
    private final CleanAssets cleanAssets;
    @l
    private final K defaultDispatcher;
    @l
    private final DiagnosticEventRepository diagnosticEventRepository;
    @l
    private final EventObservers eventObservers;
    @l
    private final GatewayClient gatewayClient;
    @l
    private final GetGameId getGameId;
    @l
    private final GetInitializationRequest getInitializeRequest;
    @l
    private final GetRequestPolicy getRequestPolicy;
    @l
    private final AndroidHandleFocusCounters handleFocusCounters;
    @l
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    @l
    private final InitializeOMSDK initializeOM;
    @l
    private final ConfigurationReader legacyConfigurationReader;
    @l
    private final SDKPropertiesManager sdkPropertiesManager;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;
    @l
    private final StorageManager storageManager;
    @l
    private final TriggerInitializeListener triggerInitializeListener;

    static {
        AndroidInitializeBoldSDK.Companion = new Companion(null);
    }

    public AndroidInitializeBoldSDK(@l K k0, @l InitializeOMSDK initializeOMSDK0, @l GetInitializationRequest getInitializationRequest0, @l GetRequestPolicy getRequestPolicy0, @l CleanAssets cleanAssets0, @l HandleGatewayInitializationResponse handleGatewayInitializationResponse0, @l GatewayClient gatewayClient0, @l SessionRepository sessionRepository0, @l EventObservers eventObservers0, @l TriggerInitializeListener triggerInitializeListener0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l DiagnosticEventRepository diagnosticEventRepository0, @l StorageManager storageManager0, @l ConfigurationReader configurationReader0, @l SDKPropertiesManager sDKPropertiesManager0, @l GetGameId getGameId0, @l AndroidHandleFocusCounters androidHandleFocusCounters0) {
        L.p(k0, "defaultDispatcher");
        L.p(initializeOMSDK0, "initializeOM");
        L.p(getInitializationRequest0, "getInitializeRequest");
        L.p(getRequestPolicy0, "getRequestPolicy");
        L.p(cleanAssets0, "cleanAssets");
        L.p(handleGatewayInitializationResponse0, "handleGatewayInitializationResponse");
        L.p(gatewayClient0, "gatewayClient");
        L.p(sessionRepository0, "sessionRepository");
        L.p(eventObservers0, "eventObservers");
        L.p(triggerInitializeListener0, "triggerInitializeListener");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(diagnosticEventRepository0, "diagnosticEventRepository");
        L.p(storageManager0, "storageManager");
        L.p(configurationReader0, "legacyConfigurationReader");
        L.p(sDKPropertiesManager0, "sdkPropertiesManager");
        L.p(getGameId0, "getGameId");
        L.p(androidHandleFocusCounters0, "handleFocusCounters");
        super();
        this.defaultDispatcher = k0;
        this.initializeOM = initializeOMSDK0;
        this.getInitializeRequest = getInitializationRequest0;
        this.getRequestPolicy = getRequestPolicy0;
        this.cleanAssets = cleanAssets0;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse0;
        this.gatewayClient = gatewayClient0;
        this.sessionRepository = sessionRepository0;
        this.eventObservers = eventObservers0;
        this.triggerInitializeListener = triggerInitializeListener0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.diagnosticEventRepository = diagnosticEventRepository0;
        this.storageManager = storageManager0;
        this.legacyConfigurationReader = configurationReader0;
        this.sdkPropertiesManager = sDKPropertiesManager0;
        this.getGameId = getGameId0;
        this.handleFocusCounters = androidHandleFocusCounters0;
    }

    private final void checkCanInitialize() {
        if(!this.sessionRepository.getShouldInitialize()) {
            throw new InitializationException("Gateway communication failure", null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
        }
        String s = this.getGameId.invoke();
        if((s == null ? null : v.b1(s)) == null) {
            throw new InitializationException("gameId \"" + s + "\" should be a number.", null, "invalid_game_id", s, 2, null);
        }
    }

    private final Map getTags(InitializationException initializationException0, String s, boolean z) {
        Map map0 = Y.g();
        map0.put("operation", OperationType.INITIALIZATION.toString());
        map0.put("reason", initializationException0.getReason());
        map0.put("source", s);
        map0.put("is_retry", String.valueOf(z));
        if(initializationException0.getReasonDebug() != null) {
            map0.put("reason_debug", initializationException0.getReasonDebug());
        }
        return Y.d(map0);
    }

    private final Object handleResponse(UniversalResponse universalResponseOuterClass$UniversalResponse0, d d0) {
        if(!universalResponseOuterClass$UniversalResponse0.hasError()) {
            if(!universalResponseOuterClass$UniversalResponse0.hasPayload()) {
                throw new InitializationException("Gateway communication failure", null, "gateway", "No payload", 2, null);
            }
            if(!universalResponseOuterClass$UniversalResponse0.getPayload().hasInitializationResponse()) {
                throw new InitializationException("Gateway communication failure", null, "gateway", "No initialization response", 2, null);
            }
            InitializationResponse initializationResponseOuterClass$InitializationResponse0 = universalResponseOuterClass$UniversalResponse0.getPayload().getInitializationResponse();
            L.o(initializationResponseOuterClass$InitializationResponse0, "response.payload.initializationResponse");
            Object object0 = this.handleGatewayInitializationResponse.invoke(initializationResponseOuterClass$InitializationResponse0, d0);
            return object0 == b.l() ? object0 : S0.a;
        }
        this.sessionRepository.setShouldInitialize(false);
        throw new InitializationException("Gateway communication failure", null, "gateway", universalResponseOuterClass$UniversalResponse0.getError().getErrorText(), 2, null);
    }

    private final void initializationFailure(r r0, InitializationException initializationException0, String s, boolean z) {
        DeviceLog.debug(("Unity Ads Initialization Failure: " + initializationException0.getMessage()));
        Double double0 = TimeExtensionsKt.elapsedMillis(r0);
        Map map0 = this.getTags(initializationException0, s, z);
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", double0, map0, null, null, 24, null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(UnityAdsInitializationError.INTERNAL_ERROR, initializationException0.getMessage());
        this.setupDiagnosticEvents();
    }

    private final Object initializationStart(String s, boolean z, d d0) {
        DeviceLog.debug("Unity Ads Initialization Start");
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        Map map0 = Y.W(new V[]{r0.a("source", s), r0.a("is_retry", String.valueOf(z))});
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", null, map0, null, null, 26, null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object object0 = this.eventObservers.invoke(d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final Object initializationSuccess(r r0, String s, boolean z, d d0) {
        AndroidInitializeBoldSDK androidInitializeBoldSDK1;
        AndroidInitializeBoldSDK androidInitializeBoldSDK0;
        com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess.1 androidInitializeBoldSDK$initializationSuccess$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess.1) {
            androidInitializeBoldSDK$initializationSuccess$10 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess.1)d0;
            int v = androidInitializeBoldSDK$initializationSuccess$10.label;
            if((v & 0x80000000) == 0) {
                androidInitializeBoldSDK$initializationSuccess$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.initializationSuccess(null, null, false, this);
                    }
                };
            }
            else {
                androidInitializeBoldSDK$initializationSuccess$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidInitializeBoldSDK$initializationSuccess$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.initializationSuccess(null, null, false, this);
                }
            };
        }
        Object object0 = androidInitializeBoldSDK$initializationSuccess$10.result;
        Object object1 = b.l();
        switch(androidInitializeBoldSDK$initializationSuccess$10.label) {
            case 0: {
                f0.n(object0);
                DeviceLog.debug("Unity Ads Initialization Success");
                Double double0 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(r0));
                Map map0 = Y.W(new V[]{r0.a("source", s), r0.a("is_retry", String.valueOf(z))});
                DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_success_time", double0, map0, null, null, 24, null);
                this.storageManager.hasInitialized();
                androidInitializeBoldSDK$initializationSuccess$10.L$0 = this;
                androidInitializeBoldSDK$initializationSuccess$10.label = 1;
                if(this.initializeOM.invoke(androidInitializeBoldSDK$initializationSuccess$10) == object1) {
                    return object1;
                }
                androidInitializeBoldSDK0 = this;
                goto label_27;
            }
            case 1: {
                androidInitializeBoldSDK0 = (AndroidInitializeBoldSDK)androidInitializeBoldSDK$initializationSuccess$10.L$0;
                f0.n(object0);
            label_27:
                androidInitializeBoldSDK$initializationSuccess$10.L$0 = androidInitializeBoldSDK0;
                androidInitializeBoldSDK$initializationSuccess$10.label = 2;
                if(androidInitializeBoldSDK0.cleanAssets.invoke(androidInitializeBoldSDK$initializationSuccess$10) == object1) {
                    return object1;
                }
                androidInitializeBoldSDK1 = androidInitializeBoldSDK0;
                goto label_35;
            }
            case 2: {
                androidInitializeBoldSDK1 = (AndroidInitializeBoldSDK)androidInitializeBoldSDK$initializationSuccess$10.L$0;
                f0.n(object0);
            label_35:
                androidInitializeBoldSDK1.handleFocusCounters.invoke();
                androidInitializeBoldSDK$initializationSuccess$10.L$0 = androidInitializeBoldSDK1;
                androidInitializeBoldSDK$initializationSuccess$10.label = 3;
                if(androidInitializeBoldSDK1.sessionRepository.persistNativeConfiguration(androidInitializeBoldSDK$initializationSuccess$10) == object1) {
                    return object1;
                }
                break;
            }
            case 3: {
                androidInitializeBoldSDK1 = (AndroidInitializeBoldSDK)androidInitializeBoldSDK$initializationSuccess$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        androidInitializeBoldSDK1.legacyConfigurationReader.getCurrentConfiguration().deleteFromDisk();
        androidInitializeBoldSDK1.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
        androidInitializeBoldSDK1.sdkPropertiesManager.setInitialized(true);
        androidInitializeBoldSDK1.triggerInitializeListener.success();
        androidInitializeBoldSDK1.setupDiagnosticEvents();
        return S0.a;
    }

    @Override  // com.unity3d.ads.core.domain.InitializeBoldSDK
    @m
    public Object invoke(@l String s, @l d d0) {
        com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.invoke.2 androidInitializeBoldSDK$invoke$20 = new o(s, null) {
            final String $source;
            int I$0;
            long J$0;
            int label;

            {
                AndroidInitializeBoldSDK.this = androidInitializeBoldSDK0;
                this.$source = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.invoke.2(AndroidInitializeBoldSDK.this, this.$source, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.invoke.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                long v;
                Object object1 = b.l();
                boolean z = false;
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        v = 0x300A0CL;
                        boolean z1 = AndroidInitializeBoldSDK.this.sessionRepository.isFirstInitAttempt();
                        int v1 = !z1;
                        try {
                            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.invoke.2.1 androidInitializeBoldSDK$invoke$2$10 = new o(this.$source, !z1, null) {
                                final boolean $isRetry;
                                final String $source;
                                int label;

                                {
                                    AndroidInitializeBoldSDK.this = androidInitializeBoldSDK0;
                                    this.$source = s;
                                    this.$isRetry = z;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    return new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.invoke.2.1(AndroidInitializeBoldSDK.this, this.$source, this.$isRetry, d0);
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((O)object0), ((d)object1));
                                }

                                @m
                                public final Object invoke(@l O o0, @m d d0) {
                                    return ((com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.invoke.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    Object object1 = b.l();
                                    switch(this.label) {
                                        case 0: {
                                            f0.n(object0);
                                            this.label = 1;
                                            if(AndroidInitializeBoldSDK.this.initializationStart(this.$source, this.$isRetry, this) == object1) {
                                                return object1;
                                            }
                                        label_15:
                                            AndroidInitializeBoldSDK.this.checkCanInitialize();
                                            this.label = 2;
                                            object0 = AndroidInitializeBoldSDK.this.getInitializeRequest.invoke(this);
                                            if(object0 == object1) {
                                                return object1;
                                            }
                                        label_20:
                                            RequestPolicy requestPolicy0 = AndroidInitializeBoldSDK.this.getRequestPolicy.invoke();
                                            this.label = 3;
                                            object0 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(AndroidInitializeBoldSDK.this.gatewayClient, null, ((UniversalRequest)object0), requestPolicy0, OperationType.INITIALIZATION, this, 1, null);
                                            if(object0 == object1) {
                                                return object1;
                                            }
                                            break;
                                        }
                                        case 1: {
                                            f0.n(object0);
                                            goto label_15;
                                        }
                                        case 2: {
                                            f0.n(object0);
                                            goto label_20;
                                        }
                                        case 3: {
                                            f0.n(object0);
                                            break;
                                        }
                                        case 4: {
                                            f0.n(object0);
                                            return S0.a;
                                        }
                                        default: {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                    }
                                    this.label = 4;
                                    return AndroidInitializeBoldSDK.this.handleResponse(((UniversalResponse)object0), this) == object1 ? object1 : S0.a;
                                }
                            };
                            this.J$0 = 0x300A0CL;
                            this.I$0 = v1;
                            this.label = 1;
                            if(u1.c(120000L, androidInitializeBoldSDK$invoke$2$10, this) == object1) {
                                return object1;
                            label_16:
                                v1 = this.I$0;
                                v = this.J$0;
                                f0.n(object0);
                            }
                            break;
                        }
                        catch(Exception exception0) {
                            goto label_21;
                        }
                    }
                    case 1: {
                        goto label_16;
                    label_21:
                        InitializationException initializationException0 = InitializationException.Companion.parseFrom(exception0);
                        if(exception0 instanceof GatewayException) {
                            AndroidInitializeBoldSDK.this.sessionRepository.setShouldInitialize(false);
                        }
                        AndroidInitializeBoldSDK androidInitializeBoldSDK0 = AndroidInitializeBoldSDK.this;
                        a s$b$a0 = a.d(v);
                        String s = this.$source;
                        if(v1 != 0) {
                            z = true;
                        }
                        androidInitializeBoldSDK0.initializationFailure(s$b$a0, initializationException0, s, z);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                AndroidInitializeBoldSDK androidInitializeBoldSDK1 = AndroidInitializeBoldSDK.this;
                a s$b$a1 = a.d(v);
                String s1 = this.$source;
                if(v1 != 0) {
                    z = true;
                }
                this.label = 2;
                return androidInitializeBoldSDK1.initializationSuccess(s$b$a1, s1, z, this) == object1 ? object1 : S0.a;
            }
        };
        Object object0 = i.h(this.defaultDispatcher, androidInitializeBoldSDK$invoke$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final void setupDiagnosticEvents() {
        DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0 = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        L.o(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0, "config");
        this.diagnosticEventRepository.configure(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0);
    }
}

