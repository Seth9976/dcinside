package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest;
import gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetInitializationRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetInitializationRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationRequest\n+ 2 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n484#2:19\n1#3:20\n*S KotlinDebug\n*F\n+ 1 AndroidGetInitializationRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationRequest\n*L\n12#1:19\n12#1:20\n*E\n"})
public final class AndroidGetInitializationRequest implements GetInitializationRequest {
    @l
    private final GetInitializationRequestPayload getInitializationRequestPayload;
    @l
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetInitializationRequest(@l GetInitializationRequestPayload getInitializationRequestPayload0, @l GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0) {
        L.p(getInitializationRequestPayload0, "getInitializationRequestPayload");
        L.p(getUniversalRequestForPayLoad0, "getUniversalRequestForPayLoad");
        super();
        this.getInitializationRequestPayload = getInitializationRequestPayload0;
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad0;
    }

    @Override  // com.unity3d.ads.core.domain.GetInitializationRequest
    @m
    public Object invoke(@l d d0) {
        AndroidGetInitializationRequest androidGetInitializationRequest0;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequest.invoke.1 androidGetInitializationRequest$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationRequest.invoke.1) {
            androidGetInitializationRequest$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest.invoke.1)d0;
            int v = androidGetInitializationRequest$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetInitializationRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(this);
                    }
                };
            }
            else {
                androidGetInitializationRequest$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetInitializationRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(this);
                }
            };
        }
        Object object0 = androidGetInitializationRequest$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetInitializationRequest$invoke$10.label) {
            case 0: {
                f0.n(object0);
                androidGetInitializationRequest$invoke$10.L$0 = this;
                androidGetInitializationRequest$invoke$10.label = 1;
                object0 = this.getInitializationRequestPayload.invoke(androidGetInitializationRequest$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                androidGetInitializationRequest0 = this;
                break;
            }
            case 1: {
                androidGetInitializationRequest0 = (AndroidGetInitializationRequest)androidGetInitializationRequest$invoke$10.L$0;
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
        Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0 = Payload.newBuilder();
        L.o(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "newBuilder()");
        Dsl universalRequestKt$PayloadKt$Dsl0 = Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
        universalRequestKt$PayloadKt$Dsl0.setInitializationRequest(((InitializationRequest)object0));
        Payload universalRequestOuterClass$UniversalRequest$Payload0 = universalRequestKt$PayloadKt$Dsl0._build();
        androidGetInitializationRequest$invoke$10.L$0 = null;
        androidGetInitializationRequest$invoke$10.label = 2;
        object0 = androidGetInitializationRequest0.getUniversalRequestForPayLoad.invoke(universalRequestOuterClass$UniversalRequest$Payload0, androidGetInitializationRequest$invoke$10);
        return object0 == object1 ? object1 : object0;
    }
}

