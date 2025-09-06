package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore;
import gatewayprotocol.v1.AdRequestKt.Dsl;
import gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder;
import gatewayprotocol.v1.AdRequestOuterClass.AdRequest;
import gatewayprotocol.v1.AdRequestOuterClass.AdRequestType;
import gatewayprotocol.v1.AdRequestOuterClass.BannerSize;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetAdRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetAdRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetAdRequest\n+ 2 AdRequestKt.kt\ngatewayprotocol/v1/AdRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n*L\n1#1,59:1\n10#2:60\n1#3:61\n1#3:62\n1#3:64\n484#4:63\n*S KotlinDebug\n*F\n+ 1 AndroidGetAdRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetAdRequest\n*L\n31#1:60\n31#1:61\n52#1:64\n52#1:63\n*E\n"})
public final class AndroidGetAdRequest implements GetAdRequest {
    @l
    private final CampaignRepository campaignRepository;
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    @l
    private final SessionRepository sessionRepository;
    @l
    private final TcfRepository tcfRepository;
    @l
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    public AndroidGetAdRequest(@l GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0, @l SessionRepository sessionRepository0, @l DeviceInfoRepository deviceInfoRepository0, @l CampaignRepository campaignRepository0, @l WebviewConfigurationDataSource webviewConfigurationDataSource0, @l TcfRepository tcfRepository0) {
        L.p(getUniversalRequestForPayLoad0, "getUniversalRequestForPayLoad");
        L.p(sessionRepository0, "sessionRepository");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(campaignRepository0, "campaignRepository");
        L.p(webviewConfigurationDataSource0, "webViewConfigurationDataSource");
        L.p(tcfRepository0, "tcfRepository");
        super();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad0;
        this.sessionRepository = sessionRepository0;
        this.deviceInfoRepository = deviceInfoRepository0;
        this.campaignRepository = campaignRepository0;
        this.webViewConfigurationDataSource = webviewConfigurationDataSource0;
        this.tcfRepository = tcfRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetAdRequest
    @m
    public Object invoke(@l String s, @l ByteString byteString0, @m BannerSize adRequestOuterClass$BannerSize0, @l d d0) {
        AndroidGetAdRequest androidGetAdRequest1;
        Dsl adRequestKt$Dsl6;
        BannerSize adRequestOuterClass$BannerSize2;
        Dsl adRequestKt$Dsl5;
        Dsl adRequestKt$Dsl4;
        Dsl adRequestKt$Dsl2;
        String s1;
        Dsl adRequestKt$Dsl1;
        AndroidGetAdRequest androidGetAdRequest0;
        BannerSize adRequestOuterClass$BannerSize1;
        ByteString byteString1;
        Dsl adRequestKt$Dsl0;
        com.unity3d.ads.core.domain.AndroidGetAdRequest.invoke.1 androidGetAdRequest$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetAdRequest.invoke.1) {
            androidGetAdRequest$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetAdRequest.invoke.1)d0;
            int v = androidGetAdRequest$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetAdRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, null, null, this);
                    }
                };
            }
            else {
                androidGetAdRequest$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetAdRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                Object L$5;
                Object L$6;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, null, null, this);
                }
            };
        }
        Object object0 = androidGetAdRequest$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetAdRequest$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder adRequestOuterClass$AdRequest$Builder0 = AdRequest.newBuilder();
                L.o(adRequestOuterClass$AdRequest$Builder0, "newBuilder()");
                adRequestKt$Dsl0 = Dsl.Companion._create(adRequestOuterClass$AdRequest$Builder0);
                adRequestKt$Dsl0.setSessionCounters(this.sessionRepository.getSessionCounters());
                androidGetAdRequest$invoke$10.L$0 = this;
                androidGetAdRequest$invoke$10.L$1 = s;
                byteString1 = byteString0;
                androidGetAdRequest$invoke$10.L$2 = byteString1;
                adRequestOuterClass$BannerSize1 = adRequestOuterClass$BannerSize0;
                androidGetAdRequest$invoke$10.L$3 = adRequestOuterClass$BannerSize1;
                androidGetAdRequest$invoke$10.L$4 = adRequestKt$Dsl0;
                androidGetAdRequest$invoke$10.L$5 = adRequestKt$Dsl0;
                androidGetAdRequest$invoke$10.L$6 = adRequestKt$Dsl0;
                androidGetAdRequest$invoke$10.label = 1;
                object0 = this.deviceInfoRepository.staticDeviceInfo(androidGetAdRequest$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                androidGetAdRequest0 = this;
                adRequestKt$Dsl1 = adRequestKt$Dsl0;
                s1 = s;
                adRequestKt$Dsl2 = adRequestKt$Dsl1;
                goto label_48;
            }
            case 1: {
                adRequestKt$Dsl0 = (Dsl)androidGetAdRequest$invoke$10.L$6;
                adRequestKt$Dsl2 = (Dsl)androidGetAdRequest$invoke$10.L$5;
                Dsl adRequestKt$Dsl3 = (Dsl)androidGetAdRequest$invoke$10.L$4;
                adRequestOuterClass$BannerSize1 = (BannerSize)androidGetAdRequest$invoke$10.L$3;
                ByteString byteString2 = (ByteString)androidGetAdRequest$invoke$10.L$2;
                s1 = (String)androidGetAdRequest$invoke$10.L$1;
                androidGetAdRequest0 = (AndroidGetAdRequest)androidGetAdRequest$invoke$10.L$0;
                f0.n(object0);
                adRequestKt$Dsl1 = adRequestKt$Dsl3;
                byteString1 = byteString2;
            label_48:
                adRequestKt$Dsl0.setStaticDeviceInfo(((StaticDeviceInfo)object0));
                adRequestKt$Dsl2.setDynamicDeviceInfo(androidGetAdRequest0.deviceInfoRepository.getDynamicDeviceInfo());
                adRequestKt$Dsl2.setImpressionOpportunityId(byteString1);
                adRequestKt$Dsl2.setPlacementId(s1);
                adRequestKt$Dsl2.setRequestImpressionConfiguration(true);
                androidGetAdRequest$invoke$10.L$0 = androidGetAdRequest0;
                androidGetAdRequest$invoke$10.L$1 = adRequestOuterClass$BannerSize1;
                androidGetAdRequest$invoke$10.L$2 = adRequestKt$Dsl1;
                androidGetAdRequest$invoke$10.L$3 = adRequestKt$Dsl2;
                androidGetAdRequest$invoke$10.L$4 = adRequestKt$Dsl2;
                androidGetAdRequest$invoke$10.L$5 = null;
                androidGetAdRequest$invoke$10.L$6 = null;
                androidGetAdRequest$invoke$10.label = 2;
                object0 = androidGetAdRequest0.webViewConfigurationDataSource.get(androidGetAdRequest$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                adRequestKt$Dsl4 = adRequestKt$Dsl2;
                adRequestKt$Dsl5 = adRequestKt$Dsl4;
                adRequestOuterClass$BannerSize2 = adRequestOuterClass$BannerSize1;
                adRequestKt$Dsl6 = adRequestKt$Dsl1;
                androidGetAdRequest1 = androidGetAdRequest0;
                break;
            }
            case 2: {
                adRequestKt$Dsl4 = (Dsl)androidGetAdRequest$invoke$10.L$4;
                adRequestKt$Dsl5 = (Dsl)androidGetAdRequest$invoke$10.L$3;
                adRequestKt$Dsl6 = (Dsl)androidGetAdRequest$invoke$10.L$2;
                adRequestOuterClass$BannerSize2 = (BannerSize)androidGetAdRequest$invoke$10.L$1;
                androidGetAdRequest1 = (AndroidGetAdRequest)androidGetAdRequest$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            case 3: {
                f0.n(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        adRequestKt$Dsl4.setWebviewVersion(((WebViewConfigurationStore)object0).getVersion());
        adRequestKt$Dsl5.setCampaignState(androidGetAdRequest1.campaignRepository.getCampaignState());
        if(adRequestOuterClass$BannerSize2 == null) {
            adRequestKt$Dsl5.setAdRequestType(AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
        }
        else {
            adRequestKt$Dsl5.setAdRequestType(AdRequestType.AD_REQUEST_TYPE_BANNER);
            adRequestKt$Dsl5.setBannerSize(adRequestOuterClass$BannerSize2);
        }
        String s2 = androidGetAdRequest1.tcfRepository.getTcfString();
        if(s2 != null) {
            adRequestKt$Dsl5.setTcf(ByteStringsKt.toByteStringUtf8(s2));
        }
        AdRequest adRequestOuterClass$AdRequest0 = adRequestKt$Dsl6._build();
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0 = Payload.newBuilder();
        L.o(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl universalRequestKt$PayloadKt$Dsl0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
        universalRequestKt$PayloadKt$Dsl0.setAdRequest(adRequestOuterClass$AdRequest0);
        Payload universalRequestOuterClass$UniversalRequest$Payload0 = universalRequestKt$PayloadKt$Dsl0._build();
        androidGetAdRequest$invoke$10.L$0 = null;
        androidGetAdRequest$invoke$10.L$1 = null;
        androidGetAdRequest$invoke$10.L$2 = null;
        androidGetAdRequest$invoke$10.L$3 = null;
        androidGetAdRequest$invoke$10.L$4 = null;
        androidGetAdRequest$invoke$10.label = 3;
        object0 = androidGetAdRequest1.getUniversalRequestForPayLoad.invoke(universalRequestOuterClass$UniversalRequest$Payload0, androidGetAdRequest$invoke$10);
        return object0 == object1 ? object1 : object0;
    }
}

