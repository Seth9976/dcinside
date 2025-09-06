package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import gatewayprotocol.v1.OperativeEventRequestKt.Dsl;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nGetOperativeEventRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetOperativeEventRequest.kt\ncom/unity3d/ads/core/domain/events/GetOperativeEventRequest\n+ 2 OperativeEventRequestKt.kt\ngatewayprotocol/v1/OperativeEventRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n10#2:41\n1#3:42\n1#3:43\n*S KotlinDebug\n*F\n+ 1 GetOperativeEventRequest.kt\ncom/unity3d/ads/core/domain/events/GetOperativeEventRequest\n*L\n27#1:41\n27#1:42\n*E\n"})
public final class GetOperativeEventRequest {
    @l
    private final CampaignRepository campaignRepository;
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final GetByteStringId generateByteStringId;
    @l
    private final SessionRepository sessionRepository;

    public GetOperativeEventRequest(@l GetByteStringId getByteStringId0, @l DeviceInfoRepository deviceInfoRepository0, @l SessionRepository sessionRepository0, @l CampaignRepository campaignRepository0) {
        L.p(getByteStringId0, "generateByteStringId");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(sessionRepository0, "sessionRepository");
        L.p(campaignRepository0, "campaignRepository");
        super();
        this.generateByteStringId = getByteStringId0;
        this.deviceInfoRepository = deviceInfoRepository0;
        this.sessionRepository = sessionRepository0;
        this.campaignRepository = campaignRepository0;
    }

    @m
    public final Object invoke(@l OperativeEventType operativeEventRequestOuterClass$OperativeEventType0, @l ByteString byteString0, @l ByteString byteString1, @l ByteString byteString2, @m String s, @l d d0) {
        Dsl operativeEventRequestKt$Dsl3;
        Dsl operativeEventRequestKt$Dsl2;
        Dsl operativeEventRequestKt$Dsl1;
        GetOperativeEventRequest getOperativeEventRequest0;
        com.unity3d.ads.core.domain.events.GetOperativeEventRequest.invoke.1 getOperativeEventRequest$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventRequest.invoke.1) {
            getOperativeEventRequest$invoke$10 = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest.invoke.1)d0;
            int v = getOperativeEventRequest$invoke$10.label;
            if((v & 0x80000000) == 0) {
                getOperativeEventRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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
                getOperativeEventRequest$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            getOperativeEventRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
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
        Object object0 = getOperativeEventRequest$invoke$10.result;
        Object object1 = b.l();
        switch(getOperativeEventRequest$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder operativeEventRequestOuterClass$OperativeEventRequest$Builder0 = OperativeEventRequest.newBuilder();
                L.o(operativeEventRequestOuterClass$OperativeEventRequest$Builder0, "newBuilder()");
                Dsl operativeEventRequestKt$Dsl0 = Dsl.Companion._create(operativeEventRequestOuterClass$OperativeEventRequest$Builder0);
                operativeEventRequestKt$Dsl0.setEventId(this.generateByteStringId.invoke());
                operativeEventRequestKt$Dsl0.setEventType(operativeEventRequestOuterClass$OperativeEventType0);
                operativeEventRequestKt$Dsl0.setImpressionOpportunityId(byteString1);
                operativeEventRequestKt$Dsl0.setTrackingToken(byteString0);
                operativeEventRequestKt$Dsl0.setAdditionalData(byteString2);
                if(s != null) {
                    operativeEventRequestKt$Dsl0.setSid(s);
                }
                operativeEventRequestKt$Dsl0.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                getOperativeEventRequest$invoke$10.L$0 = this;
                getOperativeEventRequest$invoke$10.L$1 = operativeEventRequestKt$Dsl0;
                getOperativeEventRequest$invoke$10.L$2 = operativeEventRequestKt$Dsl0;
                getOperativeEventRequest$invoke$10.L$3 = operativeEventRequestKt$Dsl0;
                getOperativeEventRequest$invoke$10.label = 1;
                Object object2 = this.deviceInfoRepository.staticDeviceInfo(getOperativeEventRequest$invoke$10);
                if(object2 == object1) {
                    return object1;
                }
                getOperativeEventRequest0 = this;
                operativeEventRequestKt$Dsl1 = operativeEventRequestKt$Dsl0;
                operativeEventRequestKt$Dsl2 = operativeEventRequestKt$Dsl1;
                object0 = object2;
                operativeEventRequestKt$Dsl3 = operativeEventRequestKt$Dsl2;
                break;
            }
            case 1: {
                operativeEventRequestKt$Dsl3 = (Dsl)getOperativeEventRequest$invoke$10.L$3;
                operativeEventRequestKt$Dsl1 = (Dsl)getOperativeEventRequest$invoke$10.L$2;
                operativeEventRequestKt$Dsl2 = (Dsl)getOperativeEventRequest$invoke$10.L$1;
                getOperativeEventRequest0 = (GetOperativeEventRequest)getOperativeEventRequest$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        operativeEventRequestKt$Dsl3.setStaticDeviceInfo(((StaticDeviceInfo)object0));
        operativeEventRequestKt$Dsl1.setSessionCounters(getOperativeEventRequest0.sessionRepository.getSessionCounters());
        operativeEventRequestKt$Dsl1.setCampaignState(getOperativeEventRequest0.campaignRepository.getCampaignState());
        return operativeEventRequestKt$Dsl2._build();
    }
}

