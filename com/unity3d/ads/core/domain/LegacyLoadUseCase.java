package com.unity3d.ads.core.domain;

import A3.o;
import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.LoadResult.Failure;
import com.unity3d.ads.core.data.model.LoadResult.Success;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder;
import gatewayprotocol.v1.AdRequestOuterClass.BannerSize;
import gatewayprotocol.v1.BannerSizeKt.Dsl;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup;
import java.util.Map;
import java.util.UUID;
import kotlin.J;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import kotlin.time.r;
import kotlin.time.s.b.a;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import kotlinx.coroutines.u1;
import org.json.JSONObject;
import y4.l;
import y4.m;

@s0({"SMAP\nLegacyLoadUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyLoadUseCase.kt\ncom/unity3d/ads/core/domain/LegacyLoadUseCase\n+ 2 BannerSizeKt.kt\ngatewayprotocol/v1/BannerSizeKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n10#2:281\n1#3:282\n*S KotlinDebug\n*F\n+ 1 LegacyLoadUseCase.kt\ncom/unity3d/ads/core/domain/LegacyLoadUseCase\n*L\n188#1:281\n188#1:282\n*E\n"})
public final class LegacyLoadUseCase {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String KEY_AD_MARKUP = "adMarkup";
    @l
    public static final String KEY_OBJECT_ID = "objectId";
    @m
    private String adMarkup;
    @l
    private final AdRepository adRepository;
    @l
    private final AwaitInitialization awaitInitialization;
    @l
    private final K dispatcher;
    @l
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    @m
    private IUnityAdsLoadListener listener;
    @l
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    @m
    private ByteString opportunity;
    @m
    private String placement;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;
    @m
    private r startTime;

    static {
        LegacyLoadUseCase.Companion = new Companion(null);
    }

    public LegacyLoadUseCase(@l K k0, @l Load load0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l GetInitializationState getInitializationState0, @l AwaitInitialization awaitInitialization0, @l SessionRepository sessionRepository0, @l AdRepository adRepository0) {
        L.p(k0, "dispatcher");
        L.p(load0, "load");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(getInitializationState0, "getInitializationState");
        L.p(awaitInitialization0, "awaitInitialization");
        L.p(sessionRepository0, "sessionRepository");
        L.p(adRepository0, "adRepository");
        super();
        this.dispatcher = k0;
        this.load = load0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.getInitializationState = getInitializationState0;
        this.awaitInitialization = awaitInitialization0;
        this.sessionRepository = sessionRepository0;
        this.adRepository = adRepository0;
    }

    public static final Object access$loadFailure(LegacyLoadUseCase legacyLoadUseCase0, Failure loadResult$Failure0, d d0) {
        return legacyLoadUseCase0.loadFailure(loadResult$Failure0, d0);
    }

    public static final Object access$loadSuccess(LegacyLoadUseCase legacyLoadUseCase0, AdObject adObject0, d d0) {
        return legacyLoadUseCase0.loadSuccess(adObject0, d0);
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions0) {
        JSONObject jSONObject0 = unityAdsLoadOptions0.getData();
        if(jSONObject0 != null) {
            Object object0 = jSONObject0.opt("adMarkup");
            return object0 == null ? null : object0.toString();
        }
        return null;
    }

    // 去混淆评级： 低(20)
    private final DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final BannerSize getBannerSize(UnityBannerSize unityBannerSize0) {
        if(unityBannerSize0 != null) {
            Builder adRequestOuterClass$BannerSize$Builder0 = BannerSize.newBuilder();
            L.o(adRequestOuterClass$BannerSize$Builder0, "newBuilder()");
            Dsl bannerSizeKt$Dsl0 = Dsl.Companion._create(adRequestOuterClass$BannerSize$Builder0);
            bannerSizeKt$Dsl0.setWidth(unityBannerSize0.getWidth());
            bannerSizeKt$Dsl0.setHeight(unityBannerSize0.getHeight());
            return bannerSizeKt$Dsl0._build();
        }
        return null;
    }

    private final HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String s) {
        if(s != null && !v.x3(s)) {
            try {
                return HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(s, false, 1, null).toByteArray());
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
        return HeaderBiddingAdMarkup.getDefaultInstance();
    }

    private final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions0) {
        JSONObject jSONObject0 = unityAdsLoadOptions0.getData();
        if(jSONObject0 != null) {
            Object object0 = jSONObject0.opt("objectId");
            return object0 == null ? null : object0.toString();
        }
        return null;
    }

    private final Map getTags(String s, String s1) {
        Map map0 = Y.j0(new V[]{r0.a("state", DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), r0.a("operation", OperationType.LOAD.toString())});
        if(s != null && s.length() != 0) {
            map0.put("reason", s);
        }
        if(s1 != null && s1.length() != 0) {
            map0.put("reason_debug", s1);
        }
        return map0;
    }

    static Map getTags$default(LegacyLoadUseCase legacyLoadUseCase0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        return legacyLoadUseCase0.getTags(s, s1);
    }

    private final AdObject getTmpAdObject(boolean z) {
        UnityAdsLoadOptions unityAdsLoadOptions2;
        ByteString byteString0;
        UnityAdsLoadOptions unityAdsLoadOptions0 = this.loadOptions;
        if(unityAdsLoadOptions0 == null) {
            L.S("loadOptions");
            unityAdsLoadOptions0 = null;
        }
        String s = this.getOpportunityId(unityAdsLoadOptions0);
        if(s == null) {
            byteString0 = ByteString.EMPTY;
        }
        else {
            UUID uUID0 = UUID.fromString(s);
            L.o(uUID0, "fromString(tmpOpportunityId)");
            byteString0 = ProtobufExtensionsKt.toByteString(uUID0);
        }
        String s1 = this.placement == null ? "" : this.placement;
        ByteString byteString1 = ByteString.EMPTY;
        UnityAdsLoadOptions unityAdsLoadOptions1 = this.loadOptions;
        if(unityAdsLoadOptions1 == null) {
            L.S("loadOptions");
            unityAdsLoadOptions2 = null;
        }
        else {
            unityAdsLoadOptions2 = unityAdsLoadOptions1;
        }
        boolean z1 = this.isHeaderBidding;
        DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0 = this.getAdType();
        L.o(byteString0, "tmpOpportunityByteString");
        L.o(byteString1, "EMPTY");
        return new AdObject(byteString0, s1, byteString1, z, null, null, null, false, null, null, null, unityAdsLoadOptions2, z1, diagnosticEventRequestOuterClass$DiagnosticAdType0, 0x5F0, null);
    }

    static AdObject getTmpAdObject$default(LegacyLoadUseCase legacyLoadUseCase0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return legacyLoadUseCase0.getTmpAdObject(z);
    }

    @m
    public final Object invoke(@l Context context0, @m String s, @l UnityAdsLoadOptions unityAdsLoadOptions0, @m IUnityAdsLoadListener iUnityAdsLoadListener0, @m UnityBannerSize unityBannerSize0, @l d d0) {
        LegacyLoadUseCase legacyLoadUseCase0;
        com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke.1 legacyLoadUseCase$invoke$10;
        String s1 = s;
        if(d0 instanceof com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke.1) {
            legacyLoadUseCase$invoke$10 = (com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke.1)d0;
            int v = legacyLoadUseCase$invoke$10.label;
            if((v & 0x80000000) == 0) {
                legacyLoadUseCase$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, null, null, null, null, this);
                    }
                };
            }
            else {
                legacyLoadUseCase$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            legacyLoadUseCase$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, null, null, null, null, this);
                }
            };
        }
        Object object0 = legacyLoadUseCase$invoke$10.result;
        Object object1 = b.l();
        switch(legacyLoadUseCase$invoke$10.label) {
            case 0: {
                f0.n(object0);
                DeviceLog.debug(("Unity Ads Load Start for placement " + s1));
                long v1 = (long)this.sessionRepository.getNativeConfiguration().getAdOperations().getLoadTimeoutMs();
                BannerSize adRequestOuterClass$BannerSize0 = this.getBannerSize(unityBannerSize0);
                this.loadOptions = unityAdsLoadOptions0;
                String s2 = this.getAdMarkup(unityAdsLoadOptions0);
                this.adMarkup = s2;
                this.isHeaderBidding = (s2 == null || v.x3(s2) ? 1 : 0) ^ 1;
                this.isBanner = unityBannerSize0 != null;
                this.listener = iUnityAdsLoadListener0;
                this.placement = s1;
                this.startTime = this.loadStart();
                try {
                    com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke.loadResult.1 legacyLoadUseCase$invoke$loadResult$10 = new o(this, unityAdsLoadOptions0, context0, adRequestOuterClass$BannerSize0, null) {
                        public final class WhenMappings {
                            public static final int[] $EnumSwitchMapping$0;

                            static {
                                int[] arr_v = new int[InitializationState.values().length];
                                try {
                                    arr_v[InitializationState.INITIALIZED.ordinal()] = 1;
                                }
                                catch(NoSuchFieldError unused_ex) {
                                }
                                try {
                                    arr_v[InitializationState.FAILED.ordinal()] = 2;
                                }
                                catch(NoSuchFieldError unused_ex) {
                                }
                                try {
                                    arr_v[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
                                }
                                catch(NoSuchFieldError unused_ex) {
                                }
                                try {
                                    arr_v[InitializationState.INITIALIZING.ordinal()] = 4;
                                }
                                catch(NoSuchFieldError unused_ex) {
                                }
                                WhenMappings.$EnumSwitchMapping$0 = arr_v;
                            }
                        }

                        final Context $context;
                        final BannerSize $gatewayBannerSize;
                        final UnityAdsLoadOptions $loadOptions;
                        final String $placement;
                        Object L$0;
                        Object L$1;
                        int label;

                        {
                            this.$placement = s;
                            LegacyLoadUseCase.this = legacyLoadUseCase0;
                            this.$loadOptions = unityAdsLoadOptions0;
                            this.$context = context0;
                            this.$gatewayBannerSize = adRequestOuterClass$BannerSize0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke.loadResult.1(this.$placement, LegacyLoadUseCase.this, this.$loadOptions, this.$context, this.$gatewayBannerSize, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke.loadResult.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object2;
                            ByteString byteString1;
                            HeaderBiddingAdMarkup headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup1;
                            Object object3;
                            ByteString byteString2;
                            Object object1 = b.l();
                            switch(this.label) {
                                case 0: {
                                    f0.n(object0);
                                    if(this.$placement == null) {
                                        return new Failure(UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null", null, "placement_null", null, false, 52, null);
                                    }
                                    String s = LegacyLoadUseCase.this.getOpportunityId(this.$loadOptions);
                                    if(s == null) {
                                        return new Failure(UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Object ID cannot be null", null, "no_opportunity_id", null, false, 52, null);
                                    }
                                    UUID uUID0 = UUID.fromString(s);
                                    L.o(uUID0, "fromString(opportunityId)");
                                    byteString2 = ProtobufExtensionsKt.toByteString(uUID0);
                                    LegacyLoadUseCase.this.opportunity = byteString2;
                                    this.L$0 = byteString2;
                                    this.label = 1;
                                    object3 = LegacyLoadUseCase.this.adRepository.hasOpportunityId(byteString2, this);
                                    if(object3 == object1) {
                                        return object1;
                                    }
                                    break;
                                }
                                case 1: {
                                    byteString2 = (ByteString)this.L$0;
                                    f0.n(object0);
                                    object3 = object0;
                                    break;
                                }
                                case 2: {
                                    f0.n(object0);
                                    return (LoadResult)object0;
                                }
                                case 3: {
                                    HeaderBiddingAdMarkup headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0 = (HeaderBiddingAdMarkup)this.L$1;
                                    ByteString byteString0 = (ByteString)this.L$0;
                                    f0.n(object0);
                                    headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup1 = headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0;
                                    byteString1 = byteString0;
                                    object2 = object0;
                                    goto label_55;
                                }
                                case 4: {
                                    f0.n(object0);
                                    return (LoadResult)object0;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            if(((Boolean)object3).booleanValue()) {
                                new Failure(UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Object ID already used", null, "opportunity_id_used", null, false, 52, null);
                            }
                            HeaderBiddingAdMarkup headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup2 = LegacyLoadUseCase.this.getHeaderBiddingAdMarkup(LegacyLoadUseCase.this.adMarkup);
                            if(headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup2 == null) {
                                return new Failure(UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Could not parse Ad Markup", null, "invalid_admarkup", null, false, 52, null);
                            }
                            switch(DefaultImpls.invoke$default(LegacyLoadUseCase.this.getInitializationState, false, 1, null)) {
                                case 1: {
                                    this.L$0 = null;
                                    this.label = 2;
                                    Object object4 = LegacyLoadUseCase.this.load.invoke(this.$context, this.$placement, byteString2, headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup2, this.$gatewayBannerSize, this.$loadOptions, this);
                                    return object4 == object1 ? object1 : ((LoadResult)object4);
                                }
                                case 2: 
                                case 3: {
                                    return new Failure(UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK not initialized", null, "not_initialized", null, false, 52, null);
                                }
                                case 4: {
                                    this.L$0 = byteString2;
                                    this.L$1 = headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup2;
                                    this.label = 3;
                                    object2 = com.unity3d.ads.core.domain.AwaitInitialization.DefaultImpls.invoke$default(LegacyLoadUseCase.this.awaitInitialization, 0L, this, 1, null);
                                    if(object2 == object1) {
                                        return object1;
                                    }
                                    byteString1 = byteString2;
                                    headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup1 = headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup2;
                                    break;
                                }
                                default: {
                                    throw new J();
                                }
                            }
                        label_55:
                            switch((((InitializationState)object2) == null ? -1 : WhenMappings.$EnumSwitchMapping$0[((InitializationState)object2).ordinal()])) {
                                case 1: {
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.label = 4;
                                    Object object5 = LegacyLoadUseCase.this.load.invoke(this.$context, this.$placement, byteString1, headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup1, this.$gatewayBannerSize, this.$loadOptions, this);
                                    return object5 == object1 ? object1 : ((LoadResult)object5);
                                }
                                case 2: {
                                    return new Failure(UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK not initialized", null, "not_initialized", null, false, 52, null);
                                }
                                default: {
                                    return new Failure(UnityAdsLoadError.TIMEOUT, "[UnityAds] Timeout while loading " + this.$placement, null, "timeout_initialization", null, false, 52, null);
                                }
                            }
                        }
                    };
                    legacyLoadUseCase$invoke$10.L$0 = this;
                    legacyLoadUseCase$invoke$10.L$1 = s1;
                    legacyLoadUseCase$invoke$10.label = 1;
                    object0 = u1.e(v1, legacyLoadUseCase$invoke$loadResult$10, legacyLoadUseCase$invoke$10);
                }
                catch(Throwable throwable0) {
                    legacyLoadUseCase0 = this;
                    goto label_66;
                }
                if(object0 == object1) {
                    return object1;
                }
                legacyLoadUseCase0 = this;
                break;
            }
            case 1: {
                s1 = (String)legacyLoadUseCase$invoke$10.L$1;
                legacyLoadUseCase0 = (LegacyLoadUseCase)legacyLoadUseCase$invoke$10.L$0;
                try {
                    f0.n(object0);
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_66;
                }
            }
            case 2: {
                legacyLoadUseCase0 = (LegacyLoadUseCase)legacyLoadUseCase$invoke$10.L$0;
                try {
                label_19:
                    f0.n(object0);
                    return S0.a;
                }
                catch(Throwable throwable0) {
                    goto label_66;
                }
            }
            case 3: {
                legacyLoadUseCase0 = (LegacyLoadUseCase)legacyLoadUseCase$invoke$10.L$0;
                goto label_19;
            }
            case 4: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            LoadResult loadResult0 = (LoadResult)object0;
            if(loadResult0 == null) {
                loadResult0 = new Failure(UnityAdsLoadError.TIMEOUT, "[UnityAds] Timeout while loading " + s1, null, "timeout", null, false, 52, null);
            }
            if(loadResult0 instanceof Success) {
                AdObject adObject0 = ((Success)loadResult0).getAdObject();
                legacyLoadUseCase$invoke$10.L$0 = legacyLoadUseCase0;
                legacyLoadUseCase$invoke$10.L$1 = null;
                legacyLoadUseCase$invoke$10.label = 2;
                if(legacyLoadUseCase0.loadSuccess(adObject0, legacyLoadUseCase$invoke$10) == object1) {
                    return object1;
                }
            }
            else if(loadResult0 instanceof Failure) {
                legacyLoadUseCase$invoke$10.L$0 = legacyLoadUseCase0;
                legacyLoadUseCase$invoke$10.L$1 = null;
                legacyLoadUseCase$invoke$10.label = 3;
                if(legacyLoadUseCase0.loadFailure(((Failure)loadResult0), legacyLoadUseCase$invoke$10) == object1) {
                    return object1;
                }
            }
            return S0.a;
        }
        catch(Throwable throwable0) {
        }
    label_66:
        String s3 = ExceptionExtensionsKt.getShortenedStackTrace$default(throwable0, 0, 1, null);
        Failure loadResult$Failure0 = new Failure(UnityAdsLoadError.INTERNAL_ERROR, "Internal error", throwable0, "uncaught_exception", s3, false, 0x20, null);
        legacyLoadUseCase$invoke$10.L$0 = null;
        legacyLoadUseCase$invoke$10.L$1 = null;
        legacyLoadUseCase$invoke$10.label = 4;
        return legacyLoadUseCase0.loadFailure(loadResult$Failure0, legacyLoadUseCase$invoke$10) == object1 ? object1 : S0.a;
    }

    public static Object invoke$default(LegacyLoadUseCase legacyLoadUseCase0, Context context0, String s, UnityAdsLoadOptions unityAdsLoadOptions0, IUnityAdsLoadListener iUnityAdsLoadListener0, UnityBannerSize unityBannerSize0, d d0, int v, Object object0) {
        if((v & 16) != 0) {
            unityBannerSize0 = null;
        }
        return legacyLoadUseCase0.invoke(context0, s, unityAdsLoadOptions0, iUnityAdsLoadListener0, unityBannerSize0, d0);
    }

    private final Object loadFailure(Failure loadResult$Failure0, d d0) {
        DeviceLog.debug(("Unity Ads Load Failure for placement: " + this.placement + " reason: " + loadResult$Failure0.getError() + " :: " + loadResult$Failure0.getMessage()));
        Double double0 = this.startTime == null ? null : kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(this.startTime));
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_failure_time", double0, this.getTags(loadResult$Failure0.getReason(), loadResult$Failure0.getReasonDebug()), null, this.getTmpAdObject(loadResult$Failure0.isScarAd()), 8, null);
        com.unity3d.ads.core.domain.LegacyLoadUseCase.loadFailure.2 legacyLoadUseCase$loadFailure$20 = new o(loadResult$Failure0, null) {
            final Failure $loadResult;
            int label;

            {
                LegacyLoadUseCase.this = legacyLoadUseCase0;
                this.$loadResult = loadResult$Failure0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.LegacyLoadUseCase.loadFailure.2(LegacyLoadUseCase.this, this.$loadResult, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.LegacyLoadUseCase.loadFailure.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Utilities.wrapCustomerListener(() -> {
                    IUnityAdsLoadListener iUnityAdsLoadListener0 = LegacyLoadUseCase.this.listener;
                    if(iUnityAdsLoadListener0 != null) {
                        iUnityAdsLoadListener0.onUnityAdsFailedToLoad(LegacyLoadUseCase.this.placement, this.$loadResult.getError(), this.$loadResult.getMessage());
                    }
                });
                return S0.a;
            }

            // 检测为 Lambda 实现
            private static final void invokeSuspend$lambda$0(LegacyLoadUseCase legacyLoadUseCase0, Failure loadResult$Failure0) [...]
        };
        Object object0 = i.h(this.dispatcher, legacyLoadUseCase$loadFailure$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final r loadStart() {
        Map map0 = LegacyLoadUseCase.getTags$default(this, null, null, 3, null);
        AdObject adObject0 = LegacyLoadUseCase.getTmpAdObject$default(this, false, 1, null);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, map0, null, adObject0, 10, null);
        return a.d(2760600L);
    }

    private final Object loadSuccess(AdObject adObject0, d d0) {
        DeviceLog.debug(("Unity Ads Load Success for placement: " + this.placement));
        Double double0 = this.startTime == null ? null : kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(this.startTime));
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_success_time", double0, LegacyLoadUseCase.getTags$default(this, null, null, 3, null), null, adObject0, 8, null);
        com.unity3d.ads.core.domain.LegacyLoadUseCase.loadSuccess.2 legacyLoadUseCase$loadSuccess$20 = new o(null) {
            int label;

            {
                LegacyLoadUseCase.this = legacyLoadUseCase0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.LegacyLoadUseCase.loadSuccess.2(LegacyLoadUseCase.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.LegacyLoadUseCase.loadSuccess.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Utilities.wrapCustomerListener(() -> {
                    IUnityAdsLoadListener iUnityAdsLoadListener0 = LegacyLoadUseCase.this.listener;
                    if(iUnityAdsLoadListener0 != null) {
                        iUnityAdsLoadListener0.onUnityAdsAdLoaded(LegacyLoadUseCase.this.placement);
                    }
                });
                return S0.a;
            }

            // 检测为 Lambda 实现
            private static final void invokeSuspend$lambda$0(LegacyLoadUseCase legacyLoadUseCase0) [...]
        };
        Object object0 = i.h(this.dispatcher, legacyLoadUseCase$loadSuccess$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

