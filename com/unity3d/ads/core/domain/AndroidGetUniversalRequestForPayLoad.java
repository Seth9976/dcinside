package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.UniversalRequestKt.Dsl;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetUniversalRequestForPayLoad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetUniversalRequestForPayLoad.kt\ncom/unity3d/ads/core/domain/AndroidGetUniversalRequestForPayLoad\n+ 2 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n10#2:19\n1#3:20\n*S KotlinDebug\n*F\n+ 1 AndroidGetUniversalRequestForPayLoad.kt\ncom/unity3d/ads/core/domain/AndroidGetUniversalRequestForPayLoad\n*L\n13#1:19\n13#1:20\n*E\n"})
public final class AndroidGetUniversalRequestForPayLoad implements GetUniversalRequestForPayLoad {
    @l
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetUniversalRequestForPayLoad(@l GetUniversalRequestSharedData getUniversalRequestSharedData0) {
        L.p(getUniversalRequestSharedData0, "getUniversalRequestSharedData");
        super();
        this.getUniversalRequestSharedData = getUniversalRequestSharedData0;
    }

    @Override  // com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad
    @m
    public Object invoke(@l Payload universalRequestOuterClass$UniversalRequest$Payload0, @l d d0) {
        Dsl universalRequestKt$Dsl3;
        Payload universalRequestOuterClass$UniversalRequest$Payload1;
        Dsl universalRequestKt$Dsl2;
        Dsl universalRequestKt$Dsl1;
        com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.invoke.1 androidGetUniversalRequestForPayLoad$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.invoke.1) {
            androidGetUniversalRequestForPayLoad$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.invoke.1)d0;
            int v = androidGetUniversalRequestForPayLoad$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetUniversalRequestForPayLoad$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        return d0.invoke(null, this);
                    }
                };
            }
            else {
                androidGetUniversalRequestForPayLoad$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetUniversalRequestForPayLoad$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                    return d0.invoke(null, this);
                }
            };
        }
        Object object0 = androidGetUniversalRequestForPayLoad$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetUniversalRequestForPayLoad$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder universalRequestOuterClass$UniversalRequest$Builder0 = UniversalRequest.newBuilder();
                L.o(universalRequestOuterClass$UniversalRequest$Builder0, "newBuilder()");
                Dsl universalRequestKt$Dsl0 = Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Builder0);
                androidGetUniversalRequestForPayLoad$invoke$10.L$0 = universalRequestOuterClass$UniversalRequest$Payload0;
                androidGetUniversalRequestForPayLoad$invoke$10.L$1 = universalRequestKt$Dsl0;
                androidGetUniversalRequestForPayLoad$invoke$10.L$2 = universalRequestKt$Dsl0;
                androidGetUniversalRequestForPayLoad$invoke$10.L$3 = universalRequestKt$Dsl0;
                androidGetUniversalRequestForPayLoad$invoke$10.label = 1;
                Object object2 = this.getUniversalRequestSharedData.invoke(androidGetUniversalRequestForPayLoad$invoke$10);
                if(object2 == object1) {
                    return object1;
                }
                universalRequestKt$Dsl1 = universalRequestKt$Dsl0;
                universalRequestKt$Dsl2 = universalRequestKt$Dsl1;
                object0 = object2;
                universalRequestOuterClass$UniversalRequest$Payload1 = universalRequestOuterClass$UniversalRequest$Payload0;
                universalRequestKt$Dsl3 = universalRequestKt$Dsl2;
                break;
            }
            case 1: {
                universalRequestKt$Dsl3 = (Dsl)androidGetUniversalRequestForPayLoad$invoke$10.L$3;
                universalRequestKt$Dsl1 = (Dsl)androidGetUniversalRequestForPayLoad$invoke$10.L$2;
                universalRequestKt$Dsl2 = (Dsl)androidGetUniversalRequestForPayLoad$invoke$10.L$1;
                universalRequestOuterClass$UniversalRequest$Payload1 = (Payload)androidGetUniversalRequestForPayLoad$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        universalRequestKt$Dsl3.setSharedData(((SharedData)object0));
        universalRequestKt$Dsl1.setPayload(universalRequestOuterClass$UniversalRequest$Payload1);
        return universalRequestKt$Dsl2._build();
    }
}

