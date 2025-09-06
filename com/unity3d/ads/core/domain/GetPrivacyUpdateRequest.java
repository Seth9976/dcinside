package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.PrivacyUpdateRequestKt.Dsl;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nGetPrivacyUpdateRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetPrivacyUpdateRequest.kt\ncom/unity3d/ads/core/domain/GetPrivacyUpdateRequest\n+ 2 PrivacyUpdateRequestKt.kt\ngatewayprotocol/v1/PrivacyUpdateRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n*L\n1#1,28:1\n10#2:29\n1#3:30\n1#3:32\n484#4:31\n*S KotlinDebug\n*F\n+ 1 GetPrivacyUpdateRequest.kt\ncom/unity3d/ads/core/domain/GetPrivacyUpdateRequest\n*L\n17#1:29\n17#1:30\n22#1:32\n22#1:31\n*E\n"})
public final class GetPrivacyUpdateRequest {
    @l
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public GetPrivacyUpdateRequest(@l GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0) {
        L.p(getUniversalRequestForPayLoad0, "getUniversalRequestForPayLoad");
        super();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad0;
    }

    @m
    public final Object invoke(int v, @l ByteString byteString0, @l d d0) {
        Builder privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0 = PrivacyUpdateRequest.newBuilder();
        L.o(privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0, "newBuilder()");
        Dsl privacyUpdateRequestKt$Dsl0 = Dsl.Companion._create(privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0);
        privacyUpdateRequestKt$Dsl0.setVersion(v);
        privacyUpdateRequestKt$Dsl0.setContent(byteString0);
        PrivacyUpdateRequest privacyUpdateRequestOuterClass$PrivacyUpdateRequest0 = privacyUpdateRequestKt$Dsl0._build();
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0 = Payload.newBuilder();
        L.o(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl universalRequestKt$PayloadKt$Dsl0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
        universalRequestKt$PayloadKt$Dsl0.setPrivacyUpdateRequest(privacyUpdateRequestOuterClass$PrivacyUpdateRequest0);
        Payload universalRequestOuterClass$UniversalRequest$Payload0 = universalRequestKt$PayloadKt$Dsl0._build();
        return this.getUniversalRequestForPayLoad.invoke(universalRequestOuterClass$UniversalRequest$Payload0, d0);
    }
}

