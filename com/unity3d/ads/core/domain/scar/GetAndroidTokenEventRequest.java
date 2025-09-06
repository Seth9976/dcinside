package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestKt.Dsl;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nGetAndroidTokenEventRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetAndroidTokenEventRequest.kt\ncom/unity3d/ads/core/domain/scar/GetAndroidTokenEventRequest\n+ 2 GetTokenEventRequestKt.kt\ngatewayprotocol/v1/GetTokenEventRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n10#2:28\n1#3:29\n*S KotlinDebug\n*F\n+ 1 GetAndroidTokenEventRequest.kt\ncom/unity3d/ads/core/domain/scar/GetAndroidTokenEventRequest\n*L\n14#1:28\n14#1:29\n*E\n"})
public final class GetAndroidTokenEventRequest implements GetHbTokenEventRequest {
    @Override  // com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest
    @m
    public Object invoke(@l ByteString byteString0, @l BiddingSignals biddingSignals0, @l d d0) {
        Builder getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0 = GetTokenEventRequest.newBuilder();
        L.o(getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0, "newBuilder()");
        Dsl getTokenEventRequestKt$Dsl0 = Dsl.Companion._create(getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0);
        getTokenEventRequestKt$Dsl0.setTokenId(byteString0);
        String s = biddingSignals0.getRvSignal();
        if(s != null) {
            L.o(s, "it");
            getTokenEventRequestKt$Dsl0.setRewarded(ByteStringsKt.toByteStringUtf8(s));
        }
        String s1 = biddingSignals0.getInterstitialSignal();
        if(s1 != null) {
            L.o(s1, "it");
            getTokenEventRequestKt$Dsl0.setInterstitial(ByteStringsKt.toByteStringUtf8(s1));
        }
        String s2 = biddingSignals0.getBannerSignal();
        if(s2 != null) {
            L.o(s2, "it");
            getTokenEventRequestKt$Dsl0.setBanner(ByteStringsKt.toByteStringUtf8(s2));
        }
        return getTokenEventRequestKt$Dsl0._build();
    }
}

