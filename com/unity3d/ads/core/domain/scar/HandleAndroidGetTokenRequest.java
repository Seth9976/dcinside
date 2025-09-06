package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest;
import gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nHandleAndroidGetTokenRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandleAndroidGetTokenRequest.kt\ncom/unity3d/ads/core/domain/scar/HandleAndroidGetTokenRequest\n+ 2 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n484#2:29\n1#3:30\n*S KotlinDebug\n*F\n+ 1 HandleAndroidGetTokenRequest.kt\ncom/unity3d/ads/core/domain/scar/HandleAndroidGetTokenRequest\n*L\n20#1:29\n20#1:30\n*E\n"})
public final class HandleAndroidGetTokenRequest implements HandleGetTokenRequest {
    @l
    private final GatewayClient gatewayClient;
    @l
    private final GetHbTokenEventRequest getHbTokenEventRequest;
    @l
    private final GetRequestPolicy getRequestPolicy;
    @l
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public HandleAndroidGetTokenRequest(@l GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0, @l GetHbTokenEventRequest getHbTokenEventRequest0, @l GetRequestPolicy getRequestPolicy0, @l GatewayClient gatewayClient0) {
        L.p(getUniversalRequestForPayLoad0, "getUniversalRequestForPayLoad");
        L.p(getHbTokenEventRequest0, "getHbTokenEventRequest");
        L.p(getRequestPolicy0, "getRequestPolicy");
        L.p(gatewayClient0, "gatewayClient");
        super();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad0;
        this.getHbTokenEventRequest = getHbTokenEventRequest0;
        this.getRequestPolicy = getRequestPolicy0;
        this.gatewayClient = gatewayClient0;
    }

    @Override  // com.unity3d.ads.core.domain.scar.HandleGetTokenRequest
    @m
    public Object invoke(@l ByteString byteString0, @l BiddingSignals biddingSignals0, @l d d0) {
        HandleAndroidGetTokenRequest handleAndroidGetTokenRequest0;
        com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest.invoke.1 handleAndroidGetTokenRequest$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest.invoke.1) {
            handleAndroidGetTokenRequest$invoke$10 = (com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest.invoke.1)d0;
            int v = handleAndroidGetTokenRequest$invoke$10.label;
            if((v & 0x80000000) == 0) {
                handleAndroidGetTokenRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
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
                handleAndroidGetTokenRequest$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            handleAndroidGetTokenRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
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
        Object object0 = handleAndroidGetTokenRequest$invoke$10.result;
        Object object1 = b.l();
        switch(handleAndroidGetTokenRequest$invoke$10.label) {
            case 0: {
                f0.n(object0);
                handleAndroidGetTokenRequest$invoke$10.L$0 = this;
                handleAndroidGetTokenRequest$invoke$10.label = 1;
                object0 = this.getHbTokenEventRequest.invoke(byteString0, biddingSignals0, handleAndroidGetTokenRequest$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                handleAndroidGetTokenRequest0 = this;
                goto label_25;
            }
            case 1: {
                handleAndroidGetTokenRequest0 = (HandleAndroidGetTokenRequest)handleAndroidGetTokenRequest$invoke$10.L$0;
                f0.n(object0);
            label_25:
                Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0 = Payload.newBuilder();
                L.o(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "newBuilder()");
                Dsl universalRequestKt$PayloadKt$Dsl0 = Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
                universalRequestKt$PayloadKt$Dsl0.setGetTokenEventRequest(((GetTokenEventRequest)object0));
                Payload universalRequestOuterClass$UniversalRequest$Payload0 = universalRequestKt$PayloadKt$Dsl0._build();
                handleAndroidGetTokenRequest$invoke$10.L$0 = handleAndroidGetTokenRequest0;
                handleAndroidGetTokenRequest$invoke$10.label = 2;
                object0 = handleAndroidGetTokenRequest0.getUniversalRequestForPayLoad.invoke(universalRequestOuterClass$UniversalRequest$Payload0, handleAndroidGetTokenRequest$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                handleAndroidGetTokenRequest0 = (HandleAndroidGetTokenRequest)handleAndroidGetTokenRequest$invoke$10.L$0;
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
        RequestPolicy requestPolicy0 = handleAndroidGetTokenRequest0.getRequestPolicy.invoke();
        handleAndroidGetTokenRequest$invoke$10.L$0 = null;
        handleAndroidGetTokenRequest$invoke$10.label = 3;
        object0 = DefaultImpls.request$default(handleAndroidGetTokenRequest0.gatewayClient, null, ((UniversalRequest)object0), requestPolicy0, null, handleAndroidGetTokenRequest$invoke$10, 9, null);
        return object0 == object1 ? object1 : object0;
    }
}

