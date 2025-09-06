package com.unity3d.ads.core.domain;

import A3.o;
import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult.Failure;
import com.unity3d.ads.core.data.model.LoadResult.Success;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse;
import gatewayprotocol.v1.AdRequestOuterClass.BannerSize;
import gatewayprotocol.v1.AdResponseKt.Dsl;
import gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder;
import gatewayprotocol.v1.AdResponseOuterClass.AdResponse;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType;
import gatewayprotocol.v1.ErrorOuterClass.Error;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse;
import gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration;
import kotlin.J;
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

public final class AndroidLoad implements Load {
    @l
    private final AdRepository adRepository;
    @l
    private final K defaultDispatcher;
    @l
    private final GatewayClient gatewayClient;
    @l
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    @l
    private final GetAdRequest getAdRequest;
    @l
    private final GetRequestPolicy getRequestPolicy;
    @l
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    @l
    private final SessionRepository sessionRepository;

    public AndroidLoad(@l K k0, @l GetAdRequest getAdRequest0, @l GetAdPlayerConfigRequest getAdPlayerConfigRequest0, @l GetRequestPolicy getRequestPolicy0, @l HandleGatewayAdResponse handleGatewayAdResponse0, @l SessionRepository sessionRepository0, @l GatewayClient gatewayClient0, @l AdRepository adRepository0) {
        L.p(k0, "defaultDispatcher");
        L.p(getAdRequest0, "getAdRequest");
        L.p(getAdPlayerConfigRequest0, "getAdPlayerConfigRequest");
        L.p(getRequestPolicy0, "getRequestPolicy");
        L.p(handleGatewayAdResponse0, "handleGatewayAdResponse");
        L.p(sessionRepository0, "sessionRepository");
        L.p(gatewayClient0, "gatewayClient");
        L.p(adRepository0, "adRepository");
        super();
        this.defaultDispatcher = k0;
        this.getAdRequest = getAdRequest0;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest0;
        this.getRequestPolicy = getRequestPolicy0;
        this.handleGatewayAdResponse = handleGatewayAdResponse0;
        this.sessionRepository = sessionRepository0;
        this.gatewayClient = gatewayClient0;
        this.adRepository = adRepository0;
    }

    // 去混淆评级： 低(20)
    private final Failure handleGatewayException(UnityAdsNetworkException unityAdsNetworkException0) {
        UnityAdsLoadError unityAds$UnityAdsLoadError0 = unityAdsNetworkException0 instanceof NetworkTimeoutException ? UnityAdsLoadError.TIMEOUT : UnityAdsLoadError.INTERNAL_ERROR;
        String s = unityAdsNetworkException0 instanceof NetworkTimeoutException ? "[UnityAds] Timeout while loading " : "[UnityAds] Internal communication failure";
        return unityAdsNetworkException0 instanceof NetworkTimeoutException ? new Failure(unityAds$UnityAdsLoadError0, s, unityAdsNetworkException0, "timeout", unityAdsNetworkException0.getMessage(), false, 0x20, null) : new Failure(unityAds$UnityAdsLoadError0, s, unityAdsNetworkException0, "gateway", unityAdsNetworkException0.getMessage(), false, 0x20, null);
    }

    private final void incrementLoadRequestAdmCount(boolean z) {
        if(z) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
            return;
        }
        this.sessionRepository.incrementLoadRequestAdmCount();
    }

    private final void incrementLoadRequestCount(boolean z) {
        if(z) {
            this.sessionRepository.incrementBannerLoadRequestCount();
            return;
        }
        this.sessionRepository.incrementLoadRequestCount();
    }

    @Override  // com.unity3d.ads.core.domain.Load
    @m
    public Object invoke(@l Context context0, @l String s, @l ByteString byteString0, @l HeaderBiddingAdMarkup headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0, @m BannerSize adRequestOuterClass$BannerSize0, @l UnityAdsLoadOptions unityAdsLoadOptions0, @l d d0) {
        com.unity3d.ads.core.domain.AndroidLoad.invoke.2 androidLoad$invoke$20 = new o(adRequestOuterClass$BannerSize0, headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0, s, byteString0, unityAdsLoadOptions0, context0, null) {
            final BannerSize $bannerSize;
            final Context $context;
            final HeaderBiddingAdMarkup $headerBiddingAdMarkup;
            final UnityAdsLoadOptions $loadOptions;
            final ByteString $opportunityId;
            final String $placement;
            int I$0;
            Object L$0;
            int label;

            {
                AndroidLoad.this = androidLoad0;
                this.$bannerSize = adRequestOuterClass$BannerSize0;
                this.$headerBiddingAdMarkup = headerBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup0;
                this.$placement = s;
                this.$opportunityId = byteString0;
                this.$loadOptions = unityAdsLoadOptions0;
                this.$context = context0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.AndroidLoad.invoke.2(AndroidLoad.this, this.$bannerSize, this.$headerBiddingAdMarkup, this.$placement, this.$opportunityId, this.$loadOptions, this.$context, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.AndroidLoad.invoke.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object5;
                AdResponse adResponseOuterClass$AdResponse0;
                DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType4;
                int v;
                DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType1;
                Object object2;
                DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType2;
                Object object3;
                Object object1 = b.l();
                try {
                    switch(this.label) {
                        case 0: {
                            goto label_3;
                        }
                        case 1: {
                            goto label_31;
                        }
                        case 2: {
                            goto label_47;
                        }
                        case 3: {
                            goto label_53;
                        }
                        case 4: {
                            goto label_68;
                        }
                        case 5: {
                            goto label_107;
                        }
                        case 6: {
                            goto label_117;
                        }
                    }
                }
                catch(UnityAdsNetworkException unityAdsNetworkException0) {
                    return AndroidLoad.this.handleGatewayException(unityAdsNetworkException0);
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            label_3:
                f0.n(object0);
                try {
                    if(!AndroidLoad.this.sessionRepository.isSdkInitialized()) {
                        return new Failure(UnityAdsLoadError.INITIALIZE_FAILED, null, null, "not_initialized", null, false, 54, null);
                    }
                    boolean z = this.$bannerSize != null;
                    DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0 = z ? DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
                    if(this.$headerBiddingAdMarkup.getAdData().isEmpty()) {
                        AndroidLoad.this.incrementLoadRequestCount(z);
                        this.L$0 = diagnosticEventRequestOuterClass$DiagnosticAdType0;
                        this.I$0 = false;
                        this.label = 1;
                        object3 = AndroidLoad.this.getAdRequest.invoke(this.$placement, this.$opportunityId, this.$bannerSize, this);
                        if(object3 == object1) {
                            return object1;
                        }
                        diagnosticEventRequestOuterClass$DiagnosticAdType2 = diagnosticEventRequestOuterClass$DiagnosticAdType0;
                        v = false;
                        goto label_37;
                    }
                    else {
                        AndroidLoad.this.incrementLoadRequestAdmCount(z);
                        ByteString byteString0 = this.$headerBiddingAdMarkup.getConfigurationToken();
                        L.o(byteString0, "headerBiddingAdMarkup.configurationToken");
                        this.L$0 = diagnosticEventRequestOuterClass$DiagnosticAdType0;
                        this.I$0 = true;
                        this.label = 3;
                        object2 = AndroidLoad.this.getAdPlayerConfigRequest.invoke(this.$placement, this.$opportunityId, byteString0, this);
                        if(object2 == object1) {
                            return object1;
                        }
                        diagnosticEventRequestOuterClass$DiagnosticAdType1 = diagnosticEventRequestOuterClass$DiagnosticAdType0;
                        v = true;
                        goto label_59;
                    }
                    goto label_101;
                }
                catch(UnityAdsNetworkException unityAdsNetworkException0) {
                    return AndroidLoad.this.handleGatewayException(unityAdsNetworkException0);
                }
            label_31:
                int v1 = this.I$0;
                DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType3 = (DiagnosticAdType)this.L$0;
                try {
                    f0.n(object0);
                    v = v1;
                    diagnosticEventRequestOuterClass$DiagnosticAdType2 = diagnosticEventRequestOuterClass$DiagnosticAdType3;
                    object3 = object0;
                label_37:
                    RequestPolicy requestPolicy0 = AndroidLoad.this.getRequestPolicy.invoke();
                    this.L$0 = diagnosticEventRequestOuterClass$DiagnosticAdType2;
                    this.I$0 = v;
                    this.label = 2;
                    Object object4 = DefaultImpls.request$default(AndroidLoad.this.gatewayClient, null, ((UniversalRequest)object3), requestPolicy0, OperationType.LOAD, this, 1, null);
                    if(object4 == object1) {
                        return object1;
                    }
                    diagnosticEventRequestOuterClass$DiagnosticAdType4 = diagnosticEventRequestOuterClass$DiagnosticAdType2;
                    adResponseOuterClass$AdResponse0 = ((UniversalResponse)object4).getPayload().getAdResponse();
                    goto label_101;
                }
                catch(UnityAdsNetworkException unityAdsNetworkException0) {
                    return AndroidLoad.this.handleGatewayException(unityAdsNetworkException0);
                }
            label_47:
                int v2 = this.I$0;
                diagnosticEventRequestOuterClass$DiagnosticAdType4 = (DiagnosticAdType)this.L$0;
                try {
                    f0.n(object0);
                    v = v2;
                    adResponseOuterClass$AdResponse0 = ((UniversalResponse)object0).getPayload().getAdResponse();
                    goto label_101;
                }
                catch(UnityAdsNetworkException unityAdsNetworkException0) {
                    return AndroidLoad.this.handleGatewayException(unityAdsNetworkException0);
                }
            label_53:
                int v3 = this.I$0;
                DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType5 = (DiagnosticAdType)this.L$0;
                try {
                    f0.n(object0);
                    v = v3;
                    diagnosticEventRequestOuterClass$DiagnosticAdType1 = diagnosticEventRequestOuterClass$DiagnosticAdType5;
                    object2 = object0;
                label_59:
                    RequestPolicy requestPolicy1 = AndroidLoad.this.getRequestPolicy.invoke();
                    this.L$0 = diagnosticEventRequestOuterClass$DiagnosticAdType1;
                    this.I$0 = v;
                    this.label = 4;
                    object5 = DefaultImpls.request$default(AndroidLoad.this.gatewayClient, null, ((UniversalRequest)object2), requestPolicy1, OperationType.LOAD_HEADER_BIDDING, this, 1, null);
                    if(object5 == object1) {
                        return object1;
                    }
                    diagnosticEventRequestOuterClass$DiagnosticAdType4 = diagnosticEventRequestOuterClass$DiagnosticAdType1;
                    goto label_73;
                }
                catch(UnityAdsNetworkException unityAdsNetworkException0) {
                    return AndroidLoad.this.handleGatewayException(unityAdsNetworkException0);
                }
            label_68:
                int v4 = this.I$0;
                diagnosticEventRequestOuterClass$DiagnosticAdType4 = (DiagnosticAdType)this.L$0;
                try {
                    f0.n(object0);
                    v = v4;
                    object5 = object0;
                label_73:
                    if(((UniversalResponse)object5).hasError()) {
                        return new Failure(UnityAdsLoadError.INTERNAL_ERROR, "Internal error", null, "gateway", "", false, 36, null);
                    }
                    AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0 = ((UniversalResponse)object5).getPayload().getAdPlayerConfigResponse();
                    Builder adResponseOuterClass$AdResponse$Builder0 = AdResponse.newBuilder();
                    L.o(adResponseOuterClass$AdResponse$Builder0, "newBuilder()");
                    Dsl adResponseKt$Dsl0 = Dsl.Companion._create(adResponseOuterClass$AdResponse$Builder0);
                    ByteString byteString1 = this.$headerBiddingAdMarkup.getAdData();
                    L.o(byteString1, "headerBiddingAdMarkup.adData");
                    adResponseKt$Dsl0.setAdData(byteString1);
                    adResponseKt$Dsl0.setAdDataVersion(this.$headerBiddingAdMarkup.getAdDataVersion());
                    ByteString byteString2 = adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0.getTrackingToken();
                    L.o(byteString2, "response.trackingToken");
                    adResponseKt$Dsl0.setTrackingToken(byteString2);
                    ByteString byteString3 = adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0.getImpressionConfiguration();
                    L.o(byteString3, "response.impressionConfiguration");
                    adResponseKt$Dsl0.setImpressionConfiguration(byteString3);
                    adResponseKt$Dsl0.setImpressionConfigurationVersion(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0.getImpressionConfigurationVersion());
                    WebViewConfiguration webviewConfiguration$WebViewConfiguration0 = adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0.getWebviewConfiguration();
                    L.o(webviewConfiguration$WebViewConfiguration0, "response.webviewConfiguration");
                    adResponseKt$Dsl0.setWebviewConfiguration(webviewConfiguration$WebViewConfiguration0);
                    ByteString byteString4 = adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0.getAdDataRefreshToken();
                    L.o(byteString4, "response.adDataRefreshToken");
                    adResponseKt$Dsl0.setAdDataRefreshToken(byteString4);
                    if(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0.hasError()) {
                        Error errorOuterClass$Error0 = adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0.getError();
                        L.o(errorOuterClass$Error0, "response.error");
                        adResponseKt$Dsl0.setError(errorOuterClass$Error0);
                    }
                    adResponseOuterClass$AdResponse0 = adResponseKt$Dsl0._build();
                label_101:
                    L.o(adResponseOuterClass$AdResponse0, "response");
                    this.L$0 = null;
                    this.label = 5;
                    Object object6 = AndroidLoad.this.handleGatewayAdResponse.invoke(this.$loadOptions, this.$opportunityId, adResponseOuterClass$AdResponse0, this.$context, this.$placement, diagnosticEventRequestOuterClass$DiagnosticAdType4, v != 0, this);
                    if(object6 == object1) {
                        return object1;
                    label_107:
                        f0.n(object0);
                        object6 = object0;
                    }
                    if(!(((LoadResult)object6) instanceof Success)) {
                        goto label_114;
                    }
                    this.label = 6;
                    Object object7 = AndroidLoad.this.adRepository.getAd(this.$opportunityId, this);
                    if(object7 == object1) {
                        return object1;
                    label_114:
                        if(!(((LoadResult)object6) instanceof Failure)) {
                            throw new J();
                        }
                        return (LoadResult)object6;
                    label_117:
                        f0.n(object0);
                        object7 = object0;
                    }
                    return ((AdObject)object7) == null ? new Failure(UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Ad not found", null, "ad_object_not_found", null, false, 52, null) : new Success(((AdObject)object7));
                }
                catch(UnityAdsNetworkException unityAdsNetworkException0) {
                    return AndroidLoad.this.handleGatewayException(unityAdsNetworkException0);
                }
            }
        };
        return i.h(this.defaultDispatcher, androidLoad$invoke$20, d0);
    }
}

