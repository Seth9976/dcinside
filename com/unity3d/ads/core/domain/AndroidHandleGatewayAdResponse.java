package com.unity3d.ads.core.domain;

import A3.o;
import android.content.Context;
import android.util.Base64;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.model.LoadEvent.Error;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult.Failure;
import com.unity3d.ads.core.data.model.LoadResult.Success;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.AdResponseOuterClass.AdResponse;
import gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii;
import gatewayprotocol.v1.CampaignStateOuterClass.Campaign;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType;
import gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType;
import java.net.URI;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.text.f;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.W0;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidHandleGatewayAdResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidHandleGatewayAdResponse.kt\ncom/unity3d/ads/core/domain/AndroidHandleGatewayAdResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OperativeEventErrorDataKt.kt\ngatewayprotocol/v1/OperativeEventErrorDataKtKt\n*L\n1#1,208:1\n1#2:209\n1#2:211\n10#3:210\n*S KotlinDebug\n*F\n+ 1 AndroidHandleGatewayAdResponse.kt\ncom/unity3d/ads/core/domain/AndroidHandleGatewayAdResponse\n*L\n195#1:211\n195#1:210\n*E\n"})
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    @l
    private final AdPlayerScope adPlayerScope;
    @l
    private final AdRepository adRepository;
    @l
    private final CampaignRepository campaignRepository;
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final GetAdPlayer getAdPlayer;
    @l
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    @l
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    @l
    private final GetOperativeEventApi getOperativeEventApi;
    @l
    private final GetWebViewBridgeUseCase getWebViewBridge;
    @l
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidHandleGatewayAdResponse(@l AdRepository adRepository0, @l AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase0, @l GetWebViewBridgeUseCase getWebViewBridgeUseCase0, @l DeviceInfoRepository deviceInfoRepository0, @l HandleInvocationsFromAdViewer handleInvocationsFromAdViewer0, @l CampaignRepository campaignRepository0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l GetOperativeEventApi getOperativeEventApi0, @l GetLatestWebViewConfiguration getLatestWebViewConfiguration0, @l AdPlayerScope adPlayerScope0, @l GetAdPlayer getAdPlayer0) {
        L.p(adRepository0, "adRepository");
        L.p(androidGetWebViewContainerUseCase0, "getWebViewContainerUseCase");
        L.p(getWebViewBridgeUseCase0, "getWebViewBridge");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(handleInvocationsFromAdViewer0, "getHandleInvocationsFromAdViewer");
        L.p(campaignRepository0, "campaignRepository");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(getOperativeEventApi0, "getOperativeEventApi");
        L.p(getLatestWebViewConfiguration0, "getLatestWebViewConfiguration");
        L.p(adPlayerScope0, "adPlayerScope");
        L.p(getAdPlayer0, "getAdPlayer");
        super();
        this.adRepository = adRepository0;
        this.getWebViewContainerUseCase = androidGetWebViewContainerUseCase0;
        this.getWebViewBridge = getWebViewBridgeUseCase0;
        this.deviceInfoRepository = deviceInfoRepository0;
        this.getHandleInvocationsFromAdViewer = handleInvocationsFromAdViewer0;
        this.campaignRepository = campaignRepository0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.getOperativeEventApi = getOperativeEventApi0;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration0;
        this.adPlayerScope = adPlayerScope0;
        this.getAdPlayer = getAdPlayer0;
    }

    private final Object cleanup(Throwable throwable0, ByteString byteString0, AdResponse adResponseOuterClass$AdResponse0, AdPlayer adPlayer0, d d0) {
        AdPlayer adPlayer1;
        String s;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup.1 androidHandleGatewayAdResponse$cleanup$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup.1) {
            androidHandleGatewayAdResponse$cleanup$10 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup.1)d0;
            int v = androidHandleGatewayAdResponse$cleanup$10.label;
            if((v & 0x80000000) == 0) {
                androidHandleGatewayAdResponse$cleanup$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.cleanup(null, null, null, null, this);
                    }
                };
            }
            else {
                androidHandleGatewayAdResponse$cleanup$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidHandleGatewayAdResponse$cleanup$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.cleanup(null, null, null, null, this);
                }
            };
        }
        Object object0 = androidHandleGatewayAdResponse$cleanup$10.result;
        Object object1 = b.l();
        switch(androidHandleGatewayAdResponse$cleanup$10.label) {
            case 0: {
                f0.n(object0);
                Builder operativeEventRequestOuterClass$OperativeEventErrorData$Builder0 = OperativeEventErrorData.newBuilder();
                L.o(operativeEventRequestOuterClass$OperativeEventErrorData$Builder0, "newBuilder()");
                Dsl operativeEventErrorDataKt$Dsl0 = Dsl.Companion._create(operativeEventRequestOuterClass$OperativeEventErrorData$Builder0);
                operativeEventErrorDataKt$Dsl0.setErrorType(OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
                Throwable throwable1 = throwable0.getCause();
                if(throwable1 == null) {
                label_24:
                    s = throwable0.getMessage();
                    if(s == null) {
                        s = "";
                    }
                }
                else {
                    s = throwable1.getMessage();
                    if(s == null) {
                        goto label_24;
                    }
                }
                operativeEventErrorDataKt$Dsl0.setMessage(s);
                OperativeEventErrorData operativeEventRequestOuterClass$OperativeEventErrorData0 = operativeEventErrorDataKt$Dsl0._build();
                ByteString byteString1 = adResponseOuterClass$AdResponse0.getTrackingToken();
                L.o(byteString1, "response.trackingToken");
                ByteString byteString2 = operativeEventRequestOuterClass$OperativeEventErrorData0.toByteString();
                L.o(byteString2, "operativeEventErrorData.toByteString()");
                adPlayer1 = adPlayer0;
                androidHandleGatewayAdResponse$cleanup$10.L$0 = adPlayer1;
                androidHandleGatewayAdResponse$cleanup$10.label = 1;
                if(GetOperativeEventApi.invoke$default(this.getOperativeEventApi, OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR, byteString0, byteString1, byteString2, null, androidHandleGatewayAdResponse$cleanup$10, 16, null) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                AdPlayer adPlayer2 = (AdPlayer)androidHandleGatewayAdResponse$cleanup$10.L$0;
                f0.n(object0);
                adPlayer1 = adPlayer2;
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
        if(adPlayer1 != null) {
            androidHandleGatewayAdResponse$cleanup$10.L$0 = null;
            androidHandleGatewayAdResponse$cleanup$10.label = 2;
            return adPlayer1.destroy(androidHandleGatewayAdResponse$cleanup$10) == object1 ? object1 : S0.a;
        }
        return S0.a;
    }

    @Override  // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    @m
    public Object invoke(@l UnityAdsLoadOptions unityAdsLoadOptions0, @l ByteString byteString0, @l AdResponse adResponseOuterClass$AdResponse0, @l Context context0, @l String s, @l DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0, boolean z, @l d d0) {
        Throwable throwable0;
        LoadEvent loadEvent1;
        AdObject adObject2;
        h l0$h2;
        LoadEvent loadEvent0;
        AdResponse adResponseOuterClass$AdResponse4;
        ByteString byteString6;
        AdObject adObject1;
        ByteString byteString5;
        String s12;
        I i0;
        AdObject adObject0;
        AndroidWebViewContainer androidWebViewContainer0;
        String s9;
        String s8;
        String s7;
        boolean z3;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType2;
        Object object3;
        String s6;
        String s5;
        URI uRI0;
        String s4;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse1;
        DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType1;
        String s2;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse0;
        Object object2;
        boolean z1;
        AdResponse adResponseOuterClass$AdResponse1;
        ByteString byteString1;
        UnityAdsLoadOptions unityAdsLoadOptions1;
        List list0;
        Integer integer0;
        String s1;
        h l0$h0;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.1 androidHandleGatewayAdResponse$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.1) {
            androidHandleGatewayAdResponse$invoke$10 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.1)d0;
            int v = androidHandleGatewayAdResponse$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidHandleGatewayAdResponse$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    Object L$7;
                    Object L$8;
                    boolean Z$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, null, null, null, null, null, false, this);
                    }
                };
            }
            else {
                androidHandleGatewayAdResponse$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidHandleGatewayAdResponse$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                Object L$5;
                Object L$6;
                Object L$7;
                Object L$8;
                boolean Z$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, null, null, null, null, null, false, this);
                }
            };
        }
        Object object0 = androidHandleGatewayAdResponse$invoke$10.result;
        Object object1 = b.l();
        switch(androidHandleGatewayAdResponse$invoke$10.label) {
            case 0: {
                f0.n(object0);
                l0$h0 = new h();
                try {
                    if(!adResponseOuterClass$AdResponse0.hasError()) {
                        if(!adResponseOuterClass$AdResponse0.getAdData().isEmpty()) {
                            s1 = adResponseOuterClass$AdResponse0.getWebviewConfiguration().getEntryPoint();
                            integer0 = kotlin.coroutines.jvm.internal.b.f(adResponseOuterClass$AdResponse0.getWebviewConfiguration().getVersion());
                            list0 = adResponseOuterClass$AdResponse0.getWebviewConfiguration().getAdditionalFilesList();
                            androidHandleGatewayAdResponse$invoke$10.L$0 = this;
                            unityAdsLoadOptions1 = unityAdsLoadOptions0;
                            androidHandleGatewayAdResponse$invoke$10.L$1 = unityAdsLoadOptions1;
                            byteString1 = byteString0;
                            androidHandleGatewayAdResponse$invoke$10.L$2 = byteString1;
                            adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse0;
                            goto label_31;
                        }
                        return new Failure(UnityAdsLoadError.NO_FILL, "[UnityAds] No fill", null, "no_fill", null, false, 52, null);
                    }
                    goto label_51;
                }
                catch(CancellationException cancellationException0) {
                    byteString1 = byteString0;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse0;
                    object2 = object1;
                    androidHandleGatewayAdResponse0 = this;
                    goto label_282;
                }
                try {
                label_31:
                    androidHandleGatewayAdResponse$invoke$10.L$3 = adResponseOuterClass$AdResponse1;
                    androidHandleGatewayAdResponse$invoke$10.L$4 = s;
                    androidHandleGatewayAdResponse$invoke$10.L$5 = diagnosticEventRequestOuterClass$DiagnosticAdType0;
                    androidHandleGatewayAdResponse$invoke$10.L$6 = l0$h0;
                    z1 = z;
                    androidHandleGatewayAdResponse$invoke$10.Z$0 = z1;
                    androidHandleGatewayAdResponse$invoke$10.label = 1;
                    object0 = this.getLatestWebViewConfiguration.invoke(s1, integer0, list0, androidHandleGatewayAdResponse$invoke$10);
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    androidHandleGatewayAdResponse0 = this;
                    goto label_282;
                }
                if(object0 == object1) {
                    return object1;
                }
                s2 = s;
                diagnosticEventRequestOuterClass$DiagnosticAdType1 = diagnosticEventRequestOuterClass$DiagnosticAdType0;
                androidHandleGatewayAdResponse1 = this;
                goto label_75;
                try {
                    return new Failure(UnityAdsLoadError.NO_FILL, "[UnityAds] No fill", null, "no_fill", null, false, 52, null);
                label_51:
                    String s3 = adResponseOuterClass$AdResponse0.getError().getErrorText();
                    return new Failure(UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", null, "gateway", s3, false, 36, null);
                }
                catch(CancellationException cancellationException0) {
                    byteString1 = byteString0;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse0;
                    androidHandleGatewayAdResponse0 = this;
                    object2 = object1;
                    goto label_282;
                }
            }
            case 1: {
                boolean z2 = androidHandleGatewayAdResponse$invoke$10.Z$0;
                l0$h0 = (h)androidHandleGatewayAdResponse$invoke$10.L$6;
                diagnosticEventRequestOuterClass$DiagnosticAdType1 = (DiagnosticAdType)androidHandleGatewayAdResponse$invoke$10.L$5;
                s2 = (String)androidHandleGatewayAdResponse$invoke$10.L$4;
                AdResponse adResponseOuterClass$AdResponse2 = (AdResponse)androidHandleGatewayAdResponse$invoke$10.L$3;
                byteString1 = (ByteString)androidHandleGatewayAdResponse$invoke$10.L$2;
                UnityAdsLoadOptions unityAdsLoadOptions2 = (UnityAdsLoadOptions)androidHandleGatewayAdResponse$invoke$10.L$1;
                androidHandleGatewayAdResponse1 = (AndroidHandleGatewayAdResponse)androidHandleGatewayAdResponse$invoke$10.L$0;
                try {
                    f0.n(object0);
                    z1 = z2;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse2;
                    unityAdsLoadOptions1 = unityAdsLoadOptions2;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse2;
                    androidHandleGatewayAdResponse0 = androidHandleGatewayAdResponse1;
                    goto label_282;
                }
                try {
                label_75:
                    if(((WebViewConfiguration)object0).getEntryPoint().length() == 0) {
                        return new Failure(UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", null, "no_webview_entry_point", null, false, 52, null);
                    }
                    s4 = SdkProperties.getConfigUrl();
                    L.o(s4, "it");
                    if(!v.N1("https://configv2.unityads.unity3d.com/webview/4.14.1/release/config.json", ".html", false, 2, null)) {
                        s4 = null;
                    }
                    if(s4 == null) {
                        s4 = ((WebViewConfiguration)object0).getEntryPoint();
                    }
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    androidHandleGatewayAdResponse0 = androidHandleGatewayAdResponse1;
                    goto label_282;
                }
                try {
                    uRI0 = new URI(s4);
                }
                catch(Throwable unused_ex) {
                    try {
                        object2 = object1;
                        return new Failure(UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", null, "invalid_url", s4, false, 36, null);
                    }
                    catch(CancellationException cancellationException0) {
                        androidHandleGatewayAdResponse0 = androidHandleGatewayAdResponse1;
                        goto label_282;
                    }
                }
                try {
                    s5 = v.D5(s4, "?", null, 2, null) + ("?platform=android&" + uRI0.getQuery());
                    s6 = Base64.encodeToString(adResponseOuterClass$AdResponse1.getImpressionConfiguration().toByteArray(), 2);
                    androidHandleGatewayAdResponse$invoke$10.L$0 = androidHandleGatewayAdResponse1;
                    androidHandleGatewayAdResponse$invoke$10.L$1 = unityAdsLoadOptions1;
                    androidHandleGatewayAdResponse$invoke$10.L$2 = byteString1;
                    androidHandleGatewayAdResponse$invoke$10.L$3 = adResponseOuterClass$AdResponse1;
                    androidHandleGatewayAdResponse$invoke$10.L$4 = s2;
                    androidHandleGatewayAdResponse$invoke$10.L$5 = diagnosticEventRequestOuterClass$DiagnosticAdType1;
                    androidHandleGatewayAdResponse$invoke$10.L$6 = l0$h0;
                    androidHandleGatewayAdResponse$invoke$10.L$7 = s5;
                    androidHandleGatewayAdResponse$invoke$10.L$8 = s6;
                    androidHandleGatewayAdResponse$invoke$10.Z$0 = z1;
                    androidHandleGatewayAdResponse$invoke$10.label = 2;
                    object3 = androidHandleGatewayAdResponse1.getWebViewContainerUseCase.invoke(androidHandleGatewayAdResponse1.adPlayerScope, androidHandleGatewayAdResponse$invoke$10);
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    androidHandleGatewayAdResponse0 = androidHandleGatewayAdResponse1;
                    goto label_282;
                }
                if(object3 == object1) {
                    return object1;
                }
                diagnosticEventRequestOuterClass$DiagnosticAdType2 = diagnosticEventRequestOuterClass$DiagnosticAdType1;
                unityAdsLoadOptions3 = unityAdsLoadOptions1;
                z3 = z1;
                s7 = s6;
                s8 = s5;
                object0 = object3;
                s9 = s2;
                androidHandleGatewayAdResponse0 = androidHandleGatewayAdResponse1;
                goto label_147;
            }
            case 2: {
                boolean z4 = androidHandleGatewayAdResponse$invoke$10.Z$0;
                s7 = (String)androidHandleGatewayAdResponse$invoke$10.L$8;
                String s10 = (String)androidHandleGatewayAdResponse$invoke$10.L$7;
                h l0$h1 = (h)androidHandleGatewayAdResponse$invoke$10.L$6;
                DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType3 = (DiagnosticAdType)androidHandleGatewayAdResponse$invoke$10.L$5;
                String s11 = (String)androidHandleGatewayAdResponse$invoke$10.L$4;
                AdResponse adResponseOuterClass$AdResponse3 = (AdResponse)androidHandleGatewayAdResponse$invoke$10.L$3;
                ByteString byteString2 = (ByteString)androidHandleGatewayAdResponse$invoke$10.L$2;
                UnityAdsLoadOptions unityAdsLoadOptions4 = (UnityAdsLoadOptions)androidHandleGatewayAdResponse$invoke$10.L$1;
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse2 = (AndroidHandleGatewayAdResponse)androidHandleGatewayAdResponse$invoke$10.L$0;
                try {
                    f0.n(object0);
                    z3 = z4;
                    s8 = s10;
                    diagnosticEventRequestOuterClass$DiagnosticAdType2 = diagnosticEventRequestOuterClass$DiagnosticAdType3;
                    s9 = s11;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse3;
                    byteString1 = byteString2;
                    unityAdsLoadOptions3 = unityAdsLoadOptions4;
                    androidHandleGatewayAdResponse0 = androidHandleGatewayAdResponse2;
                    l0$h0 = l0$h1;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    androidHandleGatewayAdResponse0 = androidHandleGatewayAdResponse2;
                    l0$h0 = l0$h1;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse3;
                    byteString1 = byteString2;
                    goto label_282;
                }
                try {
                label_147:
                    androidWebViewContainer0 = (AndroidWebViewContainer)object0;
                    WebViewBridge webViewBridge0 = androidHandleGatewayAdResponse0.getWebViewBridge.invoke(androidWebViewContainer0, androidHandleGatewayAdResponse0.adPlayerScope);
                    l0$h0.a = androidHandleGatewayAdResponse0.getAdPlayer.invoke(webViewBridge0, androidWebViewContainer0, byteString1);
                    k.U0(k.e1(androidHandleGatewayAdResponse0.deviceInfoRepository.getAllowedPii(), new o(null) {
                        final h $adPlayer;
                        Object L$0;
                        int label;

                        {
                            this.$adPlayer = l0$h0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.2(this.$adPlayer, d0);
                            d1.L$0 = object0;
                            return d1;
                        }

                        @m
                        public final Object invoke(@l AllowedPii allowedPiiOuterClass$AllowedPii0, @m d d0) {
                            return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.2)this.create(allowedPiiOuterClass$AllowedPii0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((AllowedPii)object0), ((d)object1));
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.label) {
                                case 0: {
                                    f0.n(object0);
                                    AllowedPii allowedPiiOuterClass$AllowedPii0 = (AllowedPii)this.L$0;
                                    AdPlayer adPlayer0 = (AdPlayer)this.$adPlayer.a;
                                    byte[] arr_b = allowedPiiOuterClass$AllowedPii0.toByteArray();
                                    L.o(arr_b, "it.toByteArray()");
                                    this.label = 1;
                                    return adPlayer0.onAllowedPiiChange(arr_b, this) == object1 ? object1 : S0.a;
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
                    }), ((AdPlayer)l0$h0.a).getScope());
                    k.U0(k.e1(((AdPlayer)l0$h0.a).getUpdateCampaignState(), new o(byteString1, s9, null) {
                        final ByteString $opportunityId;
                        final String $placementId;
                        Object L$0;
                        int label;

                        {
                            AndroidHandleGatewayAdResponse.this = androidHandleGatewayAdResponse0;
                            this.$opportunityId = byteString0;
                            this.$placementId = s;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.3(AndroidHandleGatewayAdResponse.this, this.$opportunityId, this.$placementId, d0);
                            d1.L$0 = object0;
                            return d1;
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((V)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l V v0, @m d d0) {
                            return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.3)this.create(v0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Campaign campaignStateOuterClass$Campaign1;
                            if(this.label != 0) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                            f0.n(object0);
                            V v0 = (V)this.L$0;
                            byte[] arr_b = (byte[])v0.a();
                            int v1 = ((Number)v0.b()).intValue();
                            Campaign campaignStateOuterClass$Campaign0 = AndroidHandleGatewayAdResponse.this.campaignRepository.getCampaign(this.$opportunityId);
                            if(campaignStateOuterClass$Campaign0 == null) {
                            label_14:
                                gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder campaignStateOuterClass$Campaign$Builder0 = Campaign.newBuilder();
                                L.o(campaignStateOuterClass$Campaign$Builder0, "newBuilder()");
                                gatewayprotocol.v1.CampaignKt.Dsl campaignKt$Dsl1 = gatewayprotocol.v1.CampaignKt.Dsl.Companion._create(campaignStateOuterClass$Campaign$Builder0);
                                campaignKt$Dsl1.setData(ProtobufExtensionsKt.fromBase64$default(new String(arr_b, f.b), false, 1, null));
                                campaignKt$Dsl1.setDataVersion(v1);
                                campaignKt$Dsl1.setPlacementId(this.$placementId);
                                campaignKt$Dsl1.setImpressionOpportunityId(this.$opportunityId);
                                campaignStateOuterClass$Campaign1 = campaignKt$Dsl1._build();
                            }
                            else {
                                com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = campaignStateOuterClass$Campaign0.toBuilder();
                                L.o(generatedMessageLite$Builder0, "this.toBuilder()");
                                gatewayprotocol.v1.CampaignKt.Dsl campaignKt$Dsl0 = gatewayprotocol.v1.CampaignKt.Dsl.Companion._create(((gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder)generatedMessageLite$Builder0));
                                campaignKt$Dsl0.setData(ProtobufExtensionsKt.fromBase64$default(new String(arr_b, f.b), false, 1, null));
                                campaignKt$Dsl0.setDataVersion(v1);
                                campaignStateOuterClass$Campaign1 = campaignKt$Dsl0._build();
                                if(campaignStateOuterClass$Campaign1 == null) {
                                    goto label_14;
                                }
                            }
                            AndroidHandleGatewayAdResponse.this.campaignRepository.setCampaign(this.$opportunityId, campaignStateOuterClass$Campaign1);
                            return S0.a;
                        }
                    }), ((AdPlayer)l0$h0.a).getScope());
                    ByteString byteString3 = adResponseOuterClass$AdResponse1.getTrackingToken();
                    AdPlayer adPlayer0 = (AdPlayer)l0$h0.a;
                    L.o(byteString3, "trackingToken");
                    adObject0 = new AdObject(byteString1, s9, byteString3, false, null, null, null, false, null, adPlayer0, null, unityAdsLoadOptions3, z3, diagnosticEventRequestOuterClass$DiagnosticAdType2, 0x5F8, null);
                    DefaultImpls.invoke$default(androidHandleGatewayAdResponse0.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObject0, 14, null);
                    i0 = webViewBridge0.getOnInvocation();
                    ByteString byteString4 = adResponseOuterClass$AdResponse1.getAdData();
                    L.o(byteString4, "response.adData");
                    s12 = ProtobufExtensionsKt.toBase64$default(byteString4, false, 1, null);
                    byteString5 = adResponseOuterClass$AdResponse1.getAdDataRefreshToken();
                    L.o(byteString5, "response.adDataRefreshToken");
                    goto label_167;
                }
                catch(CancellationException cancellationException0) {
                }
                object2 = object1;
                goto label_282;
                try {
                label_167:
                    String s13 = ProtobufExtensionsKt.toBase64$default(byteString5, false, 1, null);
                    L.o(s7, "base64ImpressionConfiguration");
                    com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.4 androidHandleGatewayAdResponse$invoke$40 = new Function1(s8, null) {
                        final String $webViewUrl;
                        final AndroidWebViewContainer $webviewContainer;
                        int label;

                        {
                            this.$webviewContainer = androidWebViewContainer0;
                            this.$webViewUrl = s;
                            super(1, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@l d d0) {
                            return new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.4(this.$webviewContainer, this.$webViewUrl, d0);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.invoke(((d)object0));
                        }

                        @m
                        public final Object invoke(@m d d0) {
                            return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.4)this.create(d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.label) {
                                case 0: {
                                    f0.n(object0);
                                    this.label = 1;
                                    return this.$webviewContainer.loadUrl(this.$webViewUrl, this) == object1 ? object1 : S0.a;
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
                    androidHandleGatewayAdResponse$invoke$10.L$0 = androidHandleGatewayAdResponse0;
                    androidHandleGatewayAdResponse$invoke$10.L$1 = byteString1;
                    androidHandleGatewayAdResponse$invoke$10.L$2 = adResponseOuterClass$AdResponse1;
                    androidHandleGatewayAdResponse$invoke$10.L$3 = l0$h0;
                    androidHandleGatewayAdResponse$invoke$10.L$4 = adObject0;
                    androidHandleGatewayAdResponse$invoke$10.L$5 = null;
                    androidHandleGatewayAdResponse$invoke$10.L$6 = null;
                    androidHandleGatewayAdResponse$invoke$10.L$7 = null;
                    androidHandleGatewayAdResponse$invoke$10.L$8 = null;
                    androidHandleGatewayAdResponse$invoke$10.label = 3;
                    object2 = object1;
                    object0 = androidHandleGatewayAdResponse0.getHandleInvocationsFromAdViewer.invoke(i0, s12, s13, s7, adObject0, androidHandleGatewayAdResponse$invoke$40, androidHandleGatewayAdResponse$invoke$10);
                    object2 = object1;
                }
                catch(CancellationException cancellationException0) {
                    goto label_282;
                }
                if(object0 == object2) {
                    return object2;
                }
                adObject1 = adObject0;
                byteString6 = byteString1;
                goto label_199;
            }
            case 3: {
                adObject1 = (AdObject)androidHandleGatewayAdResponse$invoke$10.L$4;
                l0$h0 = (h)androidHandleGatewayAdResponse$invoke$10.L$3;
                adResponseOuterClass$AdResponse4 = (AdResponse)androidHandleGatewayAdResponse$invoke$10.L$2;
                byteString6 = (ByteString)androidHandleGatewayAdResponse$invoke$10.L$1;
                androidHandleGatewayAdResponse0 = (AndroidHandleGatewayAdResponse)androidHandleGatewayAdResponse$invoke$10.L$0;
                try {
                    f0.n(object0);
                    object2 = object1;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse4;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse4;
                    goto label_281;
                }
                try {
                label_199:
                    k.U0(((i)object0), ((AdPlayer)l0$h0.a).getScope());
                    i i1 = ((AdPlayer)l0$h0.a).getOnLoadEvent();
                    androidHandleGatewayAdResponse$invoke$10.L$0 = androidHandleGatewayAdResponse0;
                    androidHandleGatewayAdResponse$invoke$10.L$1 = byteString6;
                    androidHandleGatewayAdResponse$invoke$10.L$2 = adResponseOuterClass$AdResponse1;
                    androidHandleGatewayAdResponse$invoke$10.L$3 = l0$h0;
                    androidHandleGatewayAdResponse$invoke$10.L$4 = adObject1;
                    androidHandleGatewayAdResponse$invoke$10.label = 4;
                    object0 = k.H1(i1, androidHandleGatewayAdResponse$invoke$10);
                    if(object0 == object2) {
                        return object2;
                    }
                    goto label_218;
                }
                catch(CancellationException cancellationException0) {
                    goto label_281;
                }
            }
            case 4: {
                adObject1 = (AdObject)androidHandleGatewayAdResponse$invoke$10.L$4;
                l0$h0 = (h)androidHandleGatewayAdResponse$invoke$10.L$3;
                adResponseOuterClass$AdResponse4 = (AdResponse)androidHandleGatewayAdResponse$invoke$10.L$2;
                byteString6 = (ByteString)androidHandleGatewayAdResponse$invoke$10.L$1;
                androidHandleGatewayAdResponse0 = (AndroidHandleGatewayAdResponse)androidHandleGatewayAdResponse$invoke$10.L$0;
                try {
                    f0.n(object0);
                    object2 = object1;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse4;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse4;
                    goto label_281;
                }
                try {
                label_218:
                    loadEvent0 = (LoadEvent)object0;
                    if(loadEvent0 instanceof Error) {
                        goto label_229;
                    }
                    androidHandleGatewayAdResponse0.campaignRepository.setLoadTimestamp(byteString6);
                    androidHandleGatewayAdResponse$invoke$10.L$0 = androidHandleGatewayAdResponse0;
                    androidHandleGatewayAdResponse$invoke$10.L$1 = byteString6;
                    androidHandleGatewayAdResponse$invoke$10.L$2 = adResponseOuterClass$AdResponse1;
                    androidHandleGatewayAdResponse$invoke$10.L$3 = l0$h0;
                    androidHandleGatewayAdResponse$invoke$10.L$4 = adObject1;
                    androidHandleGatewayAdResponse$invoke$10.label = 6;
                    if(androidHandleGatewayAdResponse0.adRepository.addAd(byteString6, adObject1, androidHandleGatewayAdResponse$invoke$10) == object2) {
                        return object2;
                    label_229:
                        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.5 androidHandleGatewayAdResponse$invoke$50 = new o(loadEvent0, byteString6, adResponseOuterClass$AdResponse1, l0$h0, null) {
                            final h $adPlayer;
                            final LoadEvent $loadEvent;
                            final ByteString $opportunityId;
                            final AdResponse $response;
                            int label;

                            {
                                AndroidHandleGatewayAdResponse.this = androidHandleGatewayAdResponse0;
                                this.$loadEvent = loadEvent0;
                                this.$opportunityId = byteString0;
                                this.$response = adResponseOuterClass$AdResponse0;
                                this.$adPlayer = l0$h0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.5(AndroidHandleGatewayAdResponse.this, this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.5)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.label) {
                                    case 0: {
                                        f0.n(object0);
                                        java.lang.Error error0 = new java.lang.Error(((Error)this.$loadEvent).getMessage());
                                        this.label = 1;
                                        return AndroidHandleGatewayAdResponse.this.cleanup(error0, this.$opportunityId, this.$response, ((AdPlayer)this.$adPlayer.a), this) == object1 ? object1 : S0.a;
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
                        androidHandleGatewayAdResponse$invoke$10.L$0 = androidHandleGatewayAdResponse0;
                        androidHandleGatewayAdResponse$invoke$10.L$1 = byteString6;
                        androidHandleGatewayAdResponse$invoke$10.L$2 = adResponseOuterClass$AdResponse1;
                        androidHandleGatewayAdResponse$invoke$10.L$3 = l0$h0;
                        androidHandleGatewayAdResponse$invoke$10.L$4 = adObject1;
                        androidHandleGatewayAdResponse$invoke$10.L$5 = loadEvent0;
                        androidHandleGatewayAdResponse$invoke$10.label = 5;
                        if(kotlinx.coroutines.i.h(W0.a, androidHandleGatewayAdResponse$invoke$50, androidHandleGatewayAdResponse$invoke$10) == object2) {
                            return object2;
                        }
                        l0$h2 = l0$h0;
                        adObject2 = adObject1;
                        loadEvent1 = loadEvent0;
                        return new Failure(UnityAdsLoadError.INTERNAL_ERROR, "Internal error", null, "adviewer", ((Error)loadEvent1).getMessage(), adObject2.isScarAd(), 4, null);
                    }
                    return new Success(adObject1);
                }
                catch(CancellationException cancellationException0) {
                    goto label_281;
                }
                return object2;
            }
            case 5: {
                loadEvent1 = (LoadEvent)androidHandleGatewayAdResponse$invoke$10.L$5;
                adObject2 = (AdObject)androidHandleGatewayAdResponse$invoke$10.L$4;
                l0$h2 = (h)androidHandleGatewayAdResponse$invoke$10.L$3;
                AdResponse adResponseOuterClass$AdResponse5 = (AdResponse)androidHandleGatewayAdResponse$invoke$10.L$2;
                ByteString byteString7 = (ByteString)androidHandleGatewayAdResponse$invoke$10.L$1;
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse3 = (AndroidHandleGatewayAdResponse)androidHandleGatewayAdResponse$invoke$10.L$0;
                try {
                    object2 = object1;
                    f0.n(object0);
                    object2 = object1;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse5;
                    byteString6 = byteString7;
                    androidHandleGatewayAdResponse0 = androidHandleGatewayAdResponse3;
                }
                catch(CancellationException cancellationException0) {
                    l0$h0 = l0$h2;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse5;
                    byteString1 = byteString7;
                    androidHandleGatewayAdResponse0 = androidHandleGatewayAdResponse3;
                    goto label_282;
                }
                try {
                    return new Failure(UnityAdsLoadError.INTERNAL_ERROR, "Internal error", null, "adviewer", ((Error)loadEvent1).getMessage(), adObject2.isScarAd(), 4, null);
                }
                catch(CancellationException cancellationException0) {
                    l0$h0 = l0$h2;
                    goto label_281;
                }
            }
            case 6: {
                adObject1 = (AdObject)androidHandleGatewayAdResponse$invoke$10.L$4;
                l0$h0 = (h)androidHandleGatewayAdResponse$invoke$10.L$3;
                adResponseOuterClass$AdResponse4 = (AdResponse)androidHandleGatewayAdResponse$invoke$10.L$2;
                byteString6 = (ByteString)androidHandleGatewayAdResponse$invoke$10.L$1;
                androidHandleGatewayAdResponse0 = (AndroidHandleGatewayAdResponse)androidHandleGatewayAdResponse$invoke$10.L$0;
                try {
                    f0.n(object0);
                    object2 = object1;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse4;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object1;
                    adResponseOuterClass$AdResponse1 = adResponseOuterClass$AdResponse4;
                    goto label_281;
                }
                try {
                    return new Success(adObject1);
                }
                catch(CancellationException cancellationException0) {
                }
            label_281:
                byteString1 = byteString6;
            label_282:
                com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.6 androidHandleGatewayAdResponse$invoke$60 = new o(cancellationException0, byteString1, adResponseOuterClass$AdResponse1, l0$h0, null) {
                    final h $adPlayer;
                    final ByteString $opportunityId;
                    final AdResponse $response;
                    final CancellationException $t;
                    int label;

                    {
                        AndroidHandleGatewayAdResponse.this = androidHandleGatewayAdResponse0;
                        this.$t = cancellationException0;
                        this.$opportunityId = byteString0;
                        this.$response = adResponseOuterClass$AdResponse0;
                        this.$adPlayer = l0$h0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.6(AndroidHandleGatewayAdResponse.this, this.$t, this.$opportunityId, this.$response, this.$adPlayer, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke.6)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                this.label = 1;
                                return AndroidHandleGatewayAdResponse.this.cleanup(this.$t, this.$opportunityId, this.$response, ((AdPlayer)this.$adPlayer.a), this) == object1 ? object1 : S0.a;
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
                androidHandleGatewayAdResponse$invoke$10.L$0 = cancellationException0;
                androidHandleGatewayAdResponse$invoke$10.L$1 = null;
                androidHandleGatewayAdResponse$invoke$10.L$2 = null;
                androidHandleGatewayAdResponse$invoke$10.L$3 = null;
                androidHandleGatewayAdResponse$invoke$10.L$4 = null;
                androidHandleGatewayAdResponse$invoke$10.L$5 = null;
                androidHandleGatewayAdResponse$invoke$10.L$6 = null;
                androidHandleGatewayAdResponse$invoke$10.L$7 = null;
                androidHandleGatewayAdResponse$invoke$10.L$8 = null;
                androidHandleGatewayAdResponse$invoke$10.label = 7;
                if(kotlinx.coroutines.i.h(W0.a, androidHandleGatewayAdResponse$invoke$60, androidHandleGatewayAdResponse$invoke$10) == object2) {
                    return object2;
                }
                throwable0 = cancellationException0;
                goto label_299;
            }
            case 7: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throwable0 = (CancellationException)androidHandleGatewayAdResponse$invoke$10.L$0;
        f0.n(object0);
    label_299:
        Throwable throwable1 = throwable0.getCause();
        if(throwable1 != null) {
            throwable0 = throwable1;
        }
        throw throwable0;
    }
}

