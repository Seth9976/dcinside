package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AdDataRefreshRequestKt.Dsl;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetAdDataRefreshRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetAdDataRefreshRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetAdDataRefreshRequest\n+ 2 AdDataRefreshRequestKt.kt\ngatewayprotocol/v1/AdDataRefreshRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n*L\n1#1,36:1\n10#2:37\n1#3:38\n1#3:40\n484#4:39\n*S KotlinDebug\n*F\n+ 1 AndroidGetAdDataRefreshRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetAdDataRefreshRequest\n*L\n23#1:37\n23#1:38\n31#1:40\n31#1:39\n*E\n"})
public final class AndroidGetAdDataRefreshRequest implements GetAdDataRefreshRequest {
    @l
    private final CampaignRepository campaignRepository;
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    @l
    private final SessionRepository sessionRepository;

    public AndroidGetAdDataRefreshRequest(@l GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0, @l SessionRepository sessionRepository0, @l DeviceInfoRepository deviceInfoRepository0, @l CampaignRepository campaignRepository0) {
        L.p(getUniversalRequestForPayLoad0, "getUniversalRequestForPayLoad");
        L.p(sessionRepository0, "sessionRepository");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(campaignRepository0, "campaignRepository");
        super();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad0;
        this.sessionRepository = sessionRepository0;
        this.deviceInfoRepository = deviceInfoRepository0;
        this.campaignRepository = campaignRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetAdDataRefreshRequest
    @m
    public Object invoke(@l ByteString byteString0, @l ByteString byteString1, @l d d0) {
        Dsl adDataRefreshRequestKt$Dsl3;
        Dsl adDataRefreshRequestKt$Dsl2;
        Dsl adDataRefreshRequestKt$Dsl1;
        ByteString byteString3;
        ByteString byteString2;
        AndroidGetAdDataRefreshRequest androidGetAdDataRefreshRequest0;
        com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.invoke.1 androidGetAdDataRefreshRequest$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.invoke.1) {
            androidGetAdDataRefreshRequest$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest.invoke.1)d0;
            int v = androidGetAdDataRefreshRequest$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetAdDataRefreshRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, null, this);
                    }
                };
            }
            else {
                androidGetAdDataRefreshRequest$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetAdDataRefreshRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                Object L$5;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, null, this);
                }
            };
        }
        Object object0 = androidGetAdDataRefreshRequest$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetAdDataRefreshRequest$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0 = AdDataRefreshRequest.newBuilder();
                L.o(adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0, "newBuilder()");
                Dsl adDataRefreshRequestKt$Dsl0 = Dsl.Companion._create(adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0);
                adDataRefreshRequestKt$Dsl0.setSessionCounters(this.sessionRepository.getSessionCounters());
                androidGetAdDataRefreshRequest$invoke$10.L$0 = this;
                androidGetAdDataRefreshRequest$invoke$10.L$1 = byteString0;
                androidGetAdDataRefreshRequest$invoke$10.L$2 = byteString1;
                androidGetAdDataRefreshRequest$invoke$10.L$3 = adDataRefreshRequestKt$Dsl0;
                androidGetAdDataRefreshRequest$invoke$10.L$4 = adDataRefreshRequestKt$Dsl0;
                androidGetAdDataRefreshRequest$invoke$10.L$5 = adDataRefreshRequestKt$Dsl0;
                androidGetAdDataRefreshRequest$invoke$10.label = 1;
                Object object2 = this.deviceInfoRepository.staticDeviceInfo(androidGetAdDataRefreshRequest$invoke$10);
                if(object2 == object1) {
                    return object1;
                }
                androidGetAdDataRefreshRequest0 = this;
                byteString2 = byteString0;
                byteString3 = byteString1;
                adDataRefreshRequestKt$Dsl1 = adDataRefreshRequestKt$Dsl0;
                adDataRefreshRequestKt$Dsl2 = adDataRefreshRequestKt$Dsl1;
                object0 = object2;
                adDataRefreshRequestKt$Dsl3 = adDataRefreshRequestKt$Dsl2;
                break;
            }
            case 1: {
                adDataRefreshRequestKt$Dsl1 = (Dsl)androidGetAdDataRefreshRequest$invoke$10.L$5;
                adDataRefreshRequestKt$Dsl2 = (Dsl)androidGetAdDataRefreshRequest$invoke$10.L$4;
                adDataRefreshRequestKt$Dsl3 = (Dsl)androidGetAdDataRefreshRequest$invoke$10.L$3;
                byteString3 = (ByteString)androidGetAdDataRefreshRequest$invoke$10.L$2;
                byteString2 = (ByteString)androidGetAdDataRefreshRequest$invoke$10.L$1;
                androidGetAdDataRefreshRequest0 = (AndroidGetAdDataRefreshRequest)androidGetAdDataRefreshRequest$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            case 2: {
                f0.n(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        adDataRefreshRequestKt$Dsl1.setStaticDeviceInfo(((StaticDeviceInfo)object0));
        adDataRefreshRequestKt$Dsl2.setDynamicDeviceInfo(androidGetAdDataRefreshRequest0.deviceInfoRepository.getDynamicDeviceInfo());
        adDataRefreshRequestKt$Dsl2.setImpressionOpportunityId(byteString2);
        adDataRefreshRequestKt$Dsl2.setCampaignState(androidGetAdDataRefreshRequest0.campaignRepository.getCampaignState());
        if(!byteString3.isEmpty()) {
            adDataRefreshRequestKt$Dsl2.setAdDataRefreshToken(byteString3);
        }
        AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest0 = adDataRefreshRequestKt$Dsl3._build();
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0 = Payload.newBuilder();
        L.o(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl universalRequestKt$PayloadKt$Dsl0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
        universalRequestKt$PayloadKt$Dsl0.setAdDataRefreshRequest(adDataRefreshRequestOuterClass$AdDataRefreshRequest0);
        Payload universalRequestOuterClass$UniversalRequest$Payload0 = universalRequestKt$PayloadKt$Dsl0._build();
        androidGetAdDataRefreshRequest$invoke$10.L$0 = null;
        androidGetAdDataRefreshRequest$invoke$10.L$1 = null;
        androidGetAdDataRefreshRequest$invoke$10.L$2 = null;
        androidGetAdDataRefreshRequest$invoke$10.L$3 = null;
        androidGetAdDataRefreshRequest$invoke$10.L$4 = null;
        androidGetAdDataRefreshRequest$invoke$10.L$5 = null;
        androidGetAdDataRefreshRequest$invoke$10.label = 2;
        object0 = androidGetAdDataRefreshRequest0.getUniversalRequestForPayLoad.invoke(universalRequestOuterClass$UniversalRequest$Payload0, androidGetAdDataRefreshRequest$invoke$10);
        return object0 == object1 ? object1 : object0;
    }
}

