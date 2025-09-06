package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetAdPlayerConfigRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetAdPlayerConfigRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetAdPlayerConfigRequest\n+ 2 AdPlayerConfigRequestKt.kt\ngatewayprotocol/v1/AdPlayerConfigRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n*L\n1#1,25:1\n10#2:26\n1#3:27\n1#3:29\n484#4:28\n*S KotlinDebug\n*F\n+ 1 AndroidGetAdPlayerConfigRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetAdPlayerConfigRequest\n*L\n14#1:26\n14#1:27\n20#1:29\n20#1:28\n*E\n"})
public final class AndroidGetAdPlayerConfigRequest implements GetAdPlayerConfigRequest {
    @l
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetAdPlayerConfigRequest(@l GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0) {
        L.p(getUniversalRequestForPayLoad0, "getUniversalRequestForPayLoad");
        super();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad0;
    }

    @Override  // com.unity3d.ads.core.domain.GetAdPlayerConfigRequest
    @m
    public Object invoke(@l String s, @l ByteString byteString0, @l ByteString byteString1, @l d d0) {
        Builder adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0 = AdPlayerConfigRequest.newBuilder();
        L.o(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0, "newBuilder()");
        Dsl adPlayerConfigRequestKt$Dsl0 = Dsl.Companion._create(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0);
        adPlayerConfigRequestKt$Dsl0.setConfigurationToken(byteString1);
        adPlayerConfigRequestKt$Dsl0.setPlacementId(s);
        adPlayerConfigRequestKt$Dsl0.setImpressionOpportunityId(byteString0);
        AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0 = adPlayerConfigRequestKt$Dsl0._build();
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0 = Payload.newBuilder();
        L.o(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl universalRequestKt$PayloadKt$Dsl0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
        universalRequestKt$PayloadKt$Dsl0.setAdPlayerConfigRequest(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0);
        Payload universalRequestOuterClass$UniversalRequest$Payload0 = universalRequestKt$PayloadKt$Dsl0._build();
        return this.getUniversalRequestForPayLoad.invoke(universalRequestOuterClass$UniversalRequest$Payload0, d0);
    }
}

