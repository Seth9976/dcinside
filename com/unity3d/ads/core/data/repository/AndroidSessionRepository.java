package com.unity3d.ads.core.data.repository;

import A3.o;
import A3.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange;
import com.unity3d.ads.core.data.model.SessionChange.UserConsentChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore;
import com.unity3d.services.core.properties.ClientProperties;
import gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags;
import gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration;
import gatewayprotocol.v1.SessionCountersKt.Dsl;
import gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSessionRepository.kt\ncom/unity3d/ads/core/data/repository/AndroidSessionRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 6 SessionCountersKt.kt\ngatewayprotocol/v1/SessionCountersKtKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n20#2:239\n22#2:243\n47#2,3:244\n50#3:240\n55#3:242\n106#4:241\n198#5,5:247\n230#5,5:252\n198#5,5:257\n230#5,5:262\n230#5,5:267\n230#5,3:272\n233#5,2:277\n230#5,3:279\n233#5,2:284\n230#5,3:286\n233#5,2:291\n230#5,3:293\n233#5,2:298\n230#5,3:300\n233#5,2:305\n230#5,3:307\n233#5,2:312\n230#5,3:314\n233#5,2:319\n230#5,3:321\n233#5,2:326\n230#5,5:328\n230#5,5:333\n230#5,5:338\n230#5,5:343\n230#5,5:348\n230#5,5:353\n230#5,5:358\n230#5,5:363\n230#5,5:368\n214#5,5:373\n230#5,5:378\n214#5,5:383\n232#6:275\n232#6:282\n232#6:289\n232#6:296\n232#6:303\n232#6:310\n232#6:317\n232#6:324\n1#7:276\n1#7:283\n1#7:290\n1#7:297\n1#7:304\n1#7:311\n1#7:318\n1#7:325\n*S KotlinDebug\n*F\n+ 1 AndroidSessionRepository.kt\ncom/unity3d/ads/core/data/repository/AndroidSessionRepository\n*L\n55#1:239\n55#1:243\n55#1:244,3\n55#1:240\n55#1:242\n55#1:241\n64#1:247,5\n65#1:252,5\n76#1:257,5\n81#1:262,5\n86#1:267,5\n89#1:272,3\n89#1:277,2\n95#1:279,3\n95#1:284,2\n101#1:286,3\n101#1:291,2\n107#1:293,3\n107#1:298,2\n113#1:300,3\n113#1:305,2\n119#1:307,3\n119#1:312,2\n125#1:314,3\n125#1:319,2\n131#1:321,3\n131#1:326,2\n137#1:328,5\n143#1:333,5\n149#1:338,5\n155#1:343,5\n163#1:348,5\n168#1:353,5\n181#1:358,5\n186#1:363,5\n191#1:368,5\n206#1:373,5\n226#1:378,5\n237#1:383,5\n90#1:275\n96#1:282\n102#1:289\n108#1:296\n114#1:303\n120#1:310\n126#1:317\n132#1:324\n90#1:276\n96#1:283\n102#1:290\n108#1:297\n114#1:304\n120#1:311\n126#1:318\n132#1:325\n*E\n"})
public final class AndroidSessionRepository implements SessionRepository {
    @l
    private final E _currentState;
    @l
    private E _gameId;
    @l
    private final E _gatewayUrl;
    @l
    private final E _headerBiddingTokenCounter;
    @l
    private final E _initializationState;
    @l
    private final E _isFirstInitAttempt;
    @l
    private final E _isTestModeEnabled;
    @l
    private D _onChange;
    @l
    private final E _sdkConfiguration;
    @l
    private final E _sessionCounters;
    @l
    private final E _sessionId;
    @l
    private final E _sessionToken;
    @l
    private final E _shouldInitialize;
    @l
    private final E _tokenCounters;
    @l
    private final ByteStringDataSource fsmDataSource;
    @l
    private final ByteStringDataSource gatewayCacheDataSource;
    @l
    private final E isInit;
    @l
    private final ByteStringDataSource nativeConfigDataSource;
    @l
    private final I onChange;
    @l
    private final i persistedNativeConfiguration;
    @l
    private final ByteStringDataSource privacyDataSource;
    @l
    private final List scarEligibleFormats;

    public AndroidSessionRepository(@l ByteStringDataSource byteStringDataSource0, @l ByteStringDataSource byteStringDataSource1, @l ByteStringDataSource byteStringDataSource2, @l ByteStringDataSource byteStringDataSource3, @l NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0, @l K k0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(byteStringDataSource0, "gatewayCacheDataSource");
        L.p(byteStringDataSource1, "privacyDataSource");
        L.p(byteStringDataSource2, "fsmDataSource");
        L.p(byteStringDataSource3, "nativeConfigDataSource");
        L.p(nativeConfigurationOuterClass$NativeConfiguration0, "defaultNativeConfiguration");
        L.p(k0, "dispatcher");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.gatewayCacheDataSource = byteStringDataSource0;
        this.privacyDataSource = byteStringDataSource1;
        this.fsmDataSource = byteStringDataSource2;
        this.nativeConfigDataSource = byteStringDataSource3;
        E e0 = W.a(nativeConfigurationOuterClass$NativeConfiguration0);
        this._sdkConfiguration = e0;
        E e1 = W.a(Boolean.FALSE);
        this.isInit = e1;
        String s = null;
        k.f(P.a(k0), null, null, new o(sendDiagnosticEvent0, null) {
            final SendDiagnosticEvent $sendDiagnosticEvent;
            int label;

            {
                AndroidSessionRepository.this = androidSessionRepository0;
                this.$sendDiagnosticEvent = sendDiagnosticEvent0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.repository.AndroidSessionRepository.1(AndroidSessionRepository.this, this.$sendDiagnosticEvent, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.data.repository.AndroidSessionRepository.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        try {
                            this.label = 1;
                            object0 = AndroidSessionRepository.this.nativeConfigDataSource.get(this);
                            if(object0 == object1) {
                                return object1;
                            label_8:
                                f0.n(object0);
                            }
                            ByteString byteString0 = ((ByteStringStore)object0).getData();
                            if(!byteString0.isEmpty()) {
                                NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0 = NativeConfiguration.parseFrom(byteString0);
                                L.o(nativeConfigurationOuterClass$NativeConfiguration0, "parseFrom(data)");
                                AndroidSessionRepository.this._sdkConfiguration.setValue(nativeConfigurationOuterClass$NativeConfiguration0);
                            }
                            goto label_17;
                        }
                        catch(Exception exception0) {
                            break;
                        }
                    }
                    case 1: {
                        goto label_8;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                DefaultImpls.invoke$default(this.$sendDiagnosticEvent, "native_initialize_missed_native_parsing", null, Y.k(r0.a("debugReason", (exception0.getMessage() == null ? "unknown" : exception0.getMessage()))), null, null, 26, null);
            label_17:
                AndroidSessionRepository.this.isInit.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                return S0.a;
            }
        }, 3, null);
        this.persistedNativeConfiguration = new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.core.data.repository.AndroidSessionRepository.special..inlined.map.1.2 androidSessionRepository$special$$inlined$map$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository.special..inlined.map.1.2.1 androidSessionRepository$special$$inlined$map$1$2$10;
                        if(d0 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.special..inlined.map.1.2.1) {
                            androidSessionRepository$special$$inlined$map$1$2$10 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.special..inlined.map.1.2.1)d0;
                            int v = androidSessionRepository$special$$inlined$map$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                androidSessionRepository$special$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
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
                                androidSessionRepository$special$$inlined$map$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            androidSessionRepository$special$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                Object L$0;
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
                        Object object1 = androidSessionRepository$special$$inlined$map$1$2$10.result;
                        Object object2 = b.l();
                        switch(androidSessionRepository$special$$inlined$map$1$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                androidSessionRepository$special$$inlined$map$1$2$10.label = 1;
                                return this.$this_unsafeFlow.emit(((V)object0).e(), androidSessionRepository$special$$inlined$map$1$2$10) == object2 ? object2 : S0.a;
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(androidSessionRepository$special$$inlined$map$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        };
        this.scarEligibleFormats = new ArrayList();
        D d0 = kotlinx.coroutines.flow.K.b(0, 0, null, 7, null);
        this._onChange = d0;
        this.onChange = kotlinx.coroutines.flow.k.l(d0);
        String s1 = ClientProperties.getGameId();
        if(s1 != null) {
            s = s1;
        }
        this._gameId = W.a(s);
        UUID uUID0 = UUID.randomUUID();
        L.o(uUID0, "randomUUID()");
        this._sessionId = W.a(ProtobufExtensionsKt.toByteString(uUID0));
        this._isTestModeEnabled = W.a(Boolean.FALSE);
        GeneratedMessageLite generatedMessageLite0 = SessionCounters.newBuilder().build();
        L.o(generatedMessageLite0, "newBuilder().build()");
        this._sessionCounters = W.a(generatedMessageLite0);
        this._tokenCounters = W.a(new TokenCounters(0, 0, 0));
        L.o(ByteString.EMPTY, "EMPTY");
        this._sessionToken = W.a(ByteString.EMPTY);
        L.o(ByteString.EMPTY, "EMPTY");
        this._currentState = W.a(ByteString.EMPTY);
        this._gatewayUrl = W.a("https://gateway.unityads.unity3d.com/v1");
        this._initializationState = W.a(InitializationState.NOT_INITIALIZED);
        this._headerBiddingTokenCounter = W.a(0);
        this._shouldInitialize = W.a(Boolean.TRUE);
        this._isFirstInitAttempt = W.a(Boolean.TRUE);

        @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        final class com.unity3d.ads.core.data.repository.AndroidSessionRepository.persistedNativeConfiguration.1 extends kotlin.coroutines.jvm.internal.o implements p {
            Object L$0;
            boolean Z$0;
            int label;

            com.unity3d.ads.core.data.repository.AndroidSessionRepository.persistedNativeConfiguration.1(d d0) {
                super(3, d0);
            }

            @m
            public final Object invoke(@l NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0, boolean z, @m d d0) {
                com.unity3d.ads.core.data.repository.AndroidSessionRepository.persistedNativeConfiguration.1 androidSessionRepository$persistedNativeConfiguration$10 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository.persistedNativeConfiguration.1(d0);
                androidSessionRepository$persistedNativeConfiguration$10.L$0 = nativeConfigurationOuterClass$NativeConfiguration0;
                androidSessionRepository$persistedNativeConfiguration$10.Z$0 = z;
                return androidSessionRepository$persistedNativeConfiguration$10.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((NativeConfiguration)object0), ((Boolean)object1).booleanValue(), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return r0.a(((NativeConfiguration)this.L$0), kotlin.coroutines.jvm.internal.b.a(this.Z$0));
            }
        }


        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.unity3d.ads.core.data.repository.AndroidSessionRepository.special..inlined.filter.1 implements i {
            public com.unity3d.ads.core.data.repository.AndroidSessionRepository.special..inlined.filter.1(i i0) {
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.core.data.repository.AndroidSessionRepository.special..inlined.filter.1.2 androidSessionRepository$special$$inlined$filter$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository.special..inlined.filter.1.2.1 androidSessionRepository$special$$inlined$filter$1$2$10;
                        if(d0 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.special..inlined.filter.1.2.1) {
                            androidSessionRepository$special$$inlined$filter$1$2$10 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.special..inlined.filter.1.2.1)d0;
                            int v = androidSessionRepository$special$$inlined$filter$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                androidSessionRepository$special$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                androidSessionRepository$special$$inlined$filter$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            androidSessionRepository$special$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = androidSessionRepository$special$$inlined$filter$1$2$10.result;
                        Object object2 = b.l();
                        switch(androidSessionRepository$special$$inlined$filter$1$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(((Boolean)((V)object0).f()).booleanValue()) {
                                    androidSessionRepository$special$$inlined$filter$1$2$10.label = 1;
                                    if(j0.emit(object0, androidSessionRepository$special$$inlined$filter$1$2$10) == object2) {
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(androidSessionRepository$special$$inlined$filter$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }

    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int v) {
        E e0 = this._sessionCounters;
        do {
            Object object0 = e0.getValue();
            Builder generatedMessageLite$Builder0 = ((SessionCounters)object0).toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            Dsl sessionCountersKt$Dsl0 = Dsl.Companion._create(((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)generatedMessageLite$Builder0));
            sessionCountersKt$Dsl0.setGlobalAdsFocusTime(sessionCountersKt$Dsl0.getGlobalAdsFocusTime() + v);
        }
        while(!e0.compareAndSet(object0, sessionCountersKt$Dsl0._build()));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public FeatureFlags getFeatureFlags() {
        FeatureFlags nativeConfigurationOuterClass$FeatureFlags0 = this.getNativeConfiguration().getFeatureFlags();
        L.o(nativeConfigurationOuterClass$FeatureFlags0, "nativeConfiguration.featureFlags");
        return nativeConfigurationOuterClass$FeatureFlags0;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @m
    public String getGameId() {
        String s1;
        E e0 = this._gameId;
        do {
            Object object0 = e0.getValue();
            String s = (String)object0;
            s1 = ClientProperties.getGameId() == null ? null : ClientProperties.getGameId();
        }
        while(!e0.compareAndSet(object0, s1));
        return s1;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @m
    public Object getGatewayCache(@l d d0) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache.1 androidSessionRepository$getGatewayCache$10;
        if(d0 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache.1) {
            androidSessionRepository$getGatewayCache$10 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache.1)d0;
            int v = androidSessionRepository$getGatewayCache$10.label;
            if((v & 0x80000000) == 0) {
                androidSessionRepository$getGatewayCache$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.getGatewayCache(this);
                    }
                };
            }
            else {
                androidSessionRepository$getGatewayCache$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidSessionRepository$getGatewayCache$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.getGatewayCache(this);
                }
            };
        }
        Object object0 = androidSessionRepository$getGatewayCache$10.result;
        Object object1 = b.l();
        switch(androidSessionRepository$getGatewayCache$10.label) {
            case 0: {
                f0.n(object0);
                androidSessionRepository$getGatewayCache$10.label = 1;
                object0 = this.gatewayCacheDataSource.get(androidSessionRepository$getGatewayCache$10);
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
        ByteString byteString0 = ((ByteStringStore)object0).getData();
        L.o(byteString0, "gatewayCacheDataSource.get().data");
        return byteString0;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public ByteString getGatewayState() {
        return (ByteString)this._currentState.getValue();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public String getGatewayUrl() {
        return (String)this._gatewayUrl.getValue();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        Number number0;
        E e0 = this._headerBiddingTokenCounter;
        do {
            Object object0 = e0.getValue();
            number0 = (Number)object0;
        }
        while(!e0.compareAndSet(object0, ((int)(number0.intValue() + 1))));
        return number0.intValue();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public InitializationState getInitializationState() {
        return (InitializationState)this._initializationState.getValue();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public NativeConfiguration getNativeConfiguration() {
        return ((Boolean)this.isInit.getValue()).booleanValue() ? ((NativeConfiguration)this._sdkConfiguration.getValue()) : ((NativeConfiguration)kotlinx.coroutines.j.b(null, new o(null) {
            int label;

            {
                AndroidSessionRepository.this = androidSessionRepository0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.repository.AndroidSessionRepository.nativeConfiguration.1(AndroidSessionRepository.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.data.repository.AndroidSessionRepository.nativeConfiguration.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        object0 = kotlinx.coroutines.flow.k.v0(AndroidSessionRepository.this.persistedNativeConfiguration, this);
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
        }, 1, null));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public i getObserveInitializationState() {
        return this._initializationState;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public I getOnChange() {
        return this.onChange;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @m
    public Object getPrivacy(@l d d0) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy.1 androidSessionRepository$getPrivacy$10;
        if(d0 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy.1) {
            androidSessionRepository$getPrivacy$10 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy.1)d0;
            int v = androidSessionRepository$getPrivacy$10.label;
            if((v & 0x80000000) == 0) {
                androidSessionRepository$getPrivacy$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.getPrivacy(this);
                    }
                };
            }
            else {
                androidSessionRepository$getPrivacy$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidSessionRepository$getPrivacy$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.getPrivacy(this);
                }
            };
        }
        Object object0 = androidSessionRepository$getPrivacy$10.result;
        Object object1 = b.l();
        switch(androidSessionRepository$getPrivacy$10.label) {
            case 0: {
                f0.n(object0);
                androidSessionRepository$getPrivacy$10.label = 1;
                object0 = this.privacyDataSource.get(androidSessionRepository$getPrivacy$10);
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
        ByteString byteString0 = ((ByteStringStore)object0).getData();
        L.o(byteString0, "privacyDataSource.get().data");
        return byteString0;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @m
    public Object getPrivacyFsm(@l d d0) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm.1 androidSessionRepository$getPrivacyFsm$10;
        if(d0 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm.1) {
            androidSessionRepository$getPrivacyFsm$10 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm.1)d0;
            int v = androidSessionRepository$getPrivacyFsm$10.label;
            if((v & 0x80000000) == 0) {
                androidSessionRepository$getPrivacyFsm$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.getPrivacyFsm(this);
                    }
                };
            }
            else {
                androidSessionRepository$getPrivacyFsm$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidSessionRepository$getPrivacyFsm$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.getPrivacyFsm(this);
                }
            };
        }
        Object object0 = androidSessionRepository$getPrivacyFsm$10.result;
        Object object1 = b.l();
        switch(androidSessionRepository$getPrivacyFsm$10.label) {
            case 0: {
                f0.n(object0);
                androidSessionRepository$getPrivacyFsm$10.label = 1;
                object0 = this.fsmDataSource.get(androidSessionRepository$getPrivacyFsm$10);
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
        ByteString byteString0 = ((ByteStringStore)object0).getData();
        L.o(byteString0, "fsmDataSource.get().data");
        return byteString0;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public List getScarEligibleFormats() {
        return this.scarEligibleFormats;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public SessionCounters getSessionCounters() {
        return (SessionCounters)this._sessionCounters.getValue();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public ByteString getSessionId() {
        return (ByteString)this._sessionId.getValue();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public ByteString getSessionToken() {
        return (ByteString)this._sessionToken.getValue();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return ((Boolean)this._shouldInitialize.getValue()).booleanValue();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @l
    public TokenCounters getTokenCounters() {
        return (TokenCounters)this._tokenCounters.getValue();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        E e0 = this._sessionCounters;
        do {
            Object object0 = e0.getValue();
            Builder generatedMessageLite$Builder0 = ((SessionCounters)object0).toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            Dsl sessionCountersKt$Dsl0 = Dsl.Companion._create(((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)generatedMessageLite$Builder0));
            sessionCountersKt$Dsl0.setBannerImpressions(sessionCountersKt$Dsl0.getBannerImpressions() + 1);
        }
        while(!e0.compareAndSet(object0, sessionCountersKt$Dsl0._build()));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        E e0 = this._sessionCounters;
        do {
            Object object0 = e0.getValue();
            Builder generatedMessageLite$Builder0 = ((SessionCounters)object0).toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            Dsl sessionCountersKt$Dsl0 = Dsl.Companion._create(((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)generatedMessageLite$Builder0));
            sessionCountersKt$Dsl0.setBannerRequestsAdm(sessionCountersKt$Dsl0.getBannerRequestsAdm() + 1);
        }
        while(!e0.compareAndSet(object0, sessionCountersKt$Dsl0._build()));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        E e0 = this._sessionCounters;
        do {
            Object object0 = e0.getValue();
            Builder generatedMessageLite$Builder0 = ((SessionCounters)object0).toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            Dsl sessionCountersKt$Dsl0 = Dsl.Companion._create(((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)generatedMessageLite$Builder0));
            sessionCountersKt$Dsl0.setBannerLoadRequests(sessionCountersKt$Dsl0.getBannerLoadRequests() + 1);
        }
        while(!e0.compareAndSet(object0, sessionCountersKt$Dsl0._build()));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        E e0 = this._sessionCounters;
        do {
            Object object0 = e0.getValue();
            Builder generatedMessageLite$Builder0 = ((SessionCounters)object0).toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            Dsl sessionCountersKt$Dsl0 = Dsl.Companion._create(((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)generatedMessageLite$Builder0));
            sessionCountersKt$Dsl0.setFocusChangeCount(sessionCountersKt$Dsl0.getFocusChangeCount() + 1);
        }
        while(!e0.compareAndSet(object0, sessionCountersKt$Dsl0._build()));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        E e0 = this._sessionCounters;
        do {
            Object object0 = e0.getValue();
            Builder generatedMessageLite$Builder0 = ((SessionCounters)object0).toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            Dsl sessionCountersKt$Dsl0 = Dsl.Companion._create(((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)generatedMessageLite$Builder0));
            sessionCountersKt$Dsl0.setGlobalAdsFocusChangeCount(sessionCountersKt$Dsl0.getGlobalAdsFocusChangeCount() + 1);
        }
        while(!e0.compareAndSet(object0, sessionCountersKt$Dsl0._build()));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        E e0 = this._sessionCounters;
        do {
            Object object0 = e0.getValue();
            Builder generatedMessageLite$Builder0 = ((SessionCounters)object0).toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            Dsl sessionCountersKt$Dsl0 = Dsl.Companion._create(((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)generatedMessageLite$Builder0));
            sessionCountersKt$Dsl0.setLoadRequestsAdm(sessionCountersKt$Dsl0.getLoadRequestsAdm() + 1);
        }
        while(!e0.compareAndSet(object0, sessionCountersKt$Dsl0._build()));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        E e0 = this._sessionCounters;
        do {
            Object object0 = e0.getValue();
            Builder generatedMessageLite$Builder0 = ((SessionCounters)object0).toBuilder();
            L.o(generatedMessageLite$Builder0, "this.toBuilder()");
            Dsl sessionCountersKt$Dsl0 = Dsl.Companion._create(((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)generatedMessageLite$Builder0));
            sessionCountersKt$Dsl0.setLoadRequests(sessionCountersKt$Dsl0.getLoadRequests() + 1);
        }
        while(!e0.compareAndSet(object0, sessionCountersKt$Dsl0._build()));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        E e0 = this._tokenCounters;
        do {
            Object object0 = e0.getValue();
        }
        while(!e0.compareAndSet(object0, TokenCounters.copy$default(((TokenCounters)object0), ((TokenCounters)object0).getSeq() + 1, 0, 0, 6, null)));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        E e0 = this._tokenCounters;
        do {
            Object object0 = e0.getValue();
        }
        while(!e0.compareAndSet(object0, TokenCounters.copy$default(((TokenCounters)object0), 0, 0, ((TokenCounters)object0).getStarts() + 1, 3, null)));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        E e0 = this._tokenCounters;
        do {
            Object object0 = e0.getValue();
        }
        while(!e0.compareAndSet(object0, TokenCounters.copy$default(((TokenCounters)object0), 0, ((TokenCounters)object0).getWins() + 1, 0, 5, null)));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return this.getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        Boolean boolean0;
        E e0 = this._isFirstInitAttempt;
        do {
            Object object0 = e0.getValue();
            boolean0 = (Boolean)object0;
            boolean0.booleanValue();
        }
        while(!e0.compareAndSet(object0, Boolean.FALSE));
        return boolean0.booleanValue();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return this.getNativeConfiguration().getEnableOm();
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return this.getInitializationState() == InitializationState.INITIALIZED;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        E e0 = this._isTestModeEnabled;
        do {
            Object object0 = e0.getValue();
            ((Boolean)object0).booleanValue();
        }
        while(!e0.compareAndSet(object0, Boolean.FALSE));
        return false;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @m
    public Object persistNativeConfiguration(@l d d0) {
        ByteString byteString0 = this.getNativeConfiguration().toByteString();
        L.o(byteString0, "nativeConfiguration.toByteString()");
        Object object0 = this.nativeConfigDataSource.set(byteString0, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        E e0 = this._tokenCounters;
        do {
            Object object0 = e0.getValue();
            TokenCounters tokenCounters0 = (TokenCounters)object0;
        }
        while(!e0.compareAndSet(object0, new TokenCounters(0, 0, 0)));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(@m String s) {
        E e0 = this._gameId;
        do {
            Object object0 = e0.getValue();
            String s1 = (String)object0;
            ClientProperties.setGameId(s);
        }
        while(!e0.compareAndSet(object0, s));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @m
    public Object setGatewayCache(@l ByteString byteString0, @l d d0) {
        Object object0 = this.gatewayCacheDataSource.set(byteString0, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(@l ByteString byteString0) {
        L.p(byteString0, "value");
        E e0 = this._currentState;
        do {
            Object object0 = e0.getValue();
            ByteString byteString1 = (ByteString)object0;
        }
        while(!e0.compareAndSet(object0, byteString0));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(@l String s) {
        L.p(s, "value");
        E e0 = this._gatewayUrl;
        do {
            Object object0 = e0.getValue();
            String s1 = (String)object0;
        }
        while(!e0.compareAndSet(object0, s));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(@l InitializationState initializationState0) {
        L.p(initializationState0, "value");
        E e0 = this._initializationState;
        do {
            Object object0 = e0.getValue();
            InitializationState initializationState1 = (InitializationState)object0;
        }
        while(!e0.compareAndSet(object0, initializationState0));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(@l NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0) {
        L.p(nativeConfigurationOuterClass$NativeConfiguration0, "value");
        E e0 = this._sdkConfiguration;
        do {
            Object object0 = e0.getValue();
            NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration1 = (NativeConfiguration)object0;
        }
        while(!e0.compareAndSet(object0, nativeConfigurationOuterClass$NativeConfiguration0));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @m
    public Object setPrivacy(@l ByteString byteString0, @l d d0) {
        AndroidSessionRepository androidSessionRepository0;
        com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy.1 androidSessionRepository$setPrivacy$10;
        if(d0 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy.1) {
            androidSessionRepository$setPrivacy$10 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy.1)d0;
            int v = androidSessionRepository$setPrivacy$10.label;
            if((v & 0x80000000) == 0) {
                androidSessionRepository$setPrivacy$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.setPrivacy(null, this);
                    }
                };
            }
            else {
                androidSessionRepository$setPrivacy$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidSessionRepository$setPrivacy$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.setPrivacy(null, this);
                }
            };
        }
        Object object0 = androidSessionRepository$setPrivacy$10.result;
        Object object1 = b.l();
        switch(androidSessionRepository$setPrivacy$10.label) {
            case 0: {
                f0.n(object0);
                androidSessionRepository$setPrivacy$10.L$0 = this;
                androidSessionRepository$setPrivacy$10.L$1 = byteString0;
                androidSessionRepository$setPrivacy$10.label = 1;
                if(this.privacyDataSource.set(byteString0, androidSessionRepository$setPrivacy$10) == object1) {
                    return object1;
                }
                androidSessionRepository0 = this;
                break;
            }
            case 1: {
                byteString0 = (ByteString)androidSessionRepository$setPrivacy$10.L$1;
                androidSessionRepository0 = (AndroidSessionRepository)androidSessionRepository$setPrivacy$10.L$0;
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
        D d1 = androidSessionRepository0._onChange;
        UserConsentChange sessionChange$UserConsentChange0 = new UserConsentChange(byteString0);
        androidSessionRepository$setPrivacy$10.L$0 = null;
        androidSessionRepository$setPrivacy$10.L$1 = null;
        androidSessionRepository$setPrivacy$10.label = 2;
        return d1.emit(sessionChange$UserConsentChange0, androidSessionRepository$setPrivacy$10) == object1 ? object1 : S0.a;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    @m
    public Object setPrivacyFsm(@l ByteString byteString0, @l d d0) {
        AndroidSessionRepository androidSessionRepository0;
        com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm.1 androidSessionRepository$setPrivacyFsm$10;
        if(d0 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm.1) {
            androidSessionRepository$setPrivacyFsm$10 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm.1)d0;
            int v = androidSessionRepository$setPrivacyFsm$10.label;
            if((v & 0x80000000) == 0) {
                androidSessionRepository$setPrivacyFsm$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.setPrivacyFsm(null, this);
                    }
                };
            }
            else {
                androidSessionRepository$setPrivacyFsm$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidSessionRepository$setPrivacyFsm$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.setPrivacyFsm(null, this);
                }
            };
        }
        Object object0 = androidSessionRepository$setPrivacyFsm$10.result;
        Object object1 = b.l();
        switch(androidSessionRepository$setPrivacyFsm$10.label) {
            case 0: {
                f0.n(object0);
                androidSessionRepository$setPrivacyFsm$10.L$0 = this;
                androidSessionRepository$setPrivacyFsm$10.L$1 = byteString0;
                androidSessionRepository$setPrivacyFsm$10.label = 1;
                if(this.fsmDataSource.set(byteString0, androidSessionRepository$setPrivacyFsm$10) == object1) {
                    return object1;
                }
                androidSessionRepository0 = this;
                break;
            }
            case 1: {
                byteString0 = (ByteString)androidSessionRepository$setPrivacyFsm$10.L$1;
                androidSessionRepository0 = (AndroidSessionRepository)androidSessionRepository$setPrivacyFsm$10.L$0;
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
        D d1 = androidSessionRepository0._onChange;
        PrivacyFsmChange sessionChange$PrivacyFsmChange0 = new PrivacyFsmChange(byteString0);
        androidSessionRepository$setPrivacyFsm$10.L$0 = null;
        androidSessionRepository$setPrivacyFsm$10.L$1 = null;
        androidSessionRepository$setPrivacyFsm$10.label = 2;
        return d1.emit(sessionChange$PrivacyFsmChange0, androidSessionRepository$setPrivacyFsm$10) == object1 ? object1 : S0.a;
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(@l SessionCounters sessionCountersOuterClass$SessionCounters0) {
        L.p(sessionCountersOuterClass$SessionCounters0, "value");
        E e0 = this._sessionCounters;
        do {
            Object object0 = e0.getValue();
            SessionCounters sessionCountersOuterClass$SessionCounters1 = (SessionCounters)object0;
        }
        while(!e0.compareAndSet(object0, sessionCountersOuterClass$SessionCounters0));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(@l ByteString byteString0) {
        L.p(byteString0, "value");
        E e0 = this._sessionToken;
        do {
            Object object0 = e0.getValue();
            ByteString byteString1 = (ByteString)object0;
        }
        while(!e0.compareAndSet(object0, byteString0));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z) {
        E e0 = this._shouldInitialize;
        do {
            Object object0 = e0.getValue();
            ((Boolean)object0).booleanValue();
        }
        while(!e0.compareAndSet(object0, Boolean.valueOf(z)));
    }

    @Override  // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(@l TokenCounters tokenCounters0) {
        L.p(tokenCounters0, "value");
        E e0 = this._tokenCounters;
        do {
            Object object0 = e0.getValue();
            TokenCounters tokenCounters1 = (TokenCounters)object0;
        }
        while(!e0.compareAndSet(object0, tokenCounters0));
    }
}

