package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.InitializationDataKt.Dsl;
import gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder;
import gatewayprotocol.v1.InitializationDataOuterClass.InitializationData;
import gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetInitializationData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetInitializationData.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationData\n+ 2 InitializationDataKt.kt\ngatewayprotocol/v1/InitializationDataKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n10#2:14\n1#3:15\n*S KotlinDebug\n*F\n+ 1 AndroidGetInitializationData.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationData\n*L\n9#1:14\n9#1:15\n*E\n"})
public final class AndroidGetInitializationData implements GetInitializationData {
    @l
    private final GetInitializationRequestPayload getInitializeRequestPayload;
    @l
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetInitializationData(@l GetInitializationRequestPayload getInitializationRequestPayload0, @l GetUniversalRequestSharedData getUniversalRequestSharedData0) {
        L.p(getInitializationRequestPayload0, "getInitializeRequestPayload");
        L.p(getUniversalRequestSharedData0, "getUniversalRequestSharedData");
        super();
        this.getInitializeRequestPayload = getInitializationRequestPayload0;
        this.getUniversalRequestSharedData = getUniversalRequestSharedData0;
    }

    @Override  // com.unity3d.ads.core.domain.GetInitializationData
    @m
    public Object invoke(@l d d0) {
        Dsl initializationDataKt$Dsl6;
        Dsl initializationDataKt$Dsl5;
        Dsl initializationDataKt$Dsl2;
        Dsl initializationDataKt$Dsl1;
        AndroidGetInitializationData androidGetInitializationData0;
        Dsl initializationDataKt$Dsl0;
        com.unity3d.ads.core.domain.AndroidGetInitializationData.invoke.1 androidGetInitializationData$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationData.invoke.1) {
            androidGetInitializationData$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetInitializationData.invoke.1)d0;
            int v = androidGetInitializationData$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetInitializationData$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        return d0.invoke(this);
                    }
                };
            }
            else {
                androidGetInitializationData$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetInitializationData$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                    return d0.invoke(this);
                }
            };
        }
        Object object0 = androidGetInitializationData$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetInitializationData$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder initializationDataOuterClass$InitializationData$Builder0 = InitializationData.newBuilder();
                L.o(initializationDataOuterClass$InitializationData$Builder0, "newBuilder()");
                initializationDataKt$Dsl0 = Dsl.Companion._create(initializationDataOuterClass$InitializationData$Builder0);
                androidGetInitializationData$invoke$10.L$0 = this;
                androidGetInitializationData$invoke$10.L$1 = initializationDataKt$Dsl0;
                androidGetInitializationData$invoke$10.L$2 = initializationDataKt$Dsl0;
                androidGetInitializationData$invoke$10.L$3 = initializationDataKt$Dsl0;
                androidGetInitializationData$invoke$10.label = 1;
                object0 = this.getInitializeRequestPayload.invoke(androidGetInitializationData$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                androidGetInitializationData0 = this;
                initializationDataKt$Dsl1 = initializationDataKt$Dsl0;
                initializationDataKt$Dsl2 = initializationDataKt$Dsl1;
                goto label_36;
            }
            case 1: {
                Dsl initializationDataKt$Dsl3 = (Dsl)androidGetInitializationData$invoke$10.L$3;
                initializationDataKt$Dsl1 = (Dsl)androidGetInitializationData$invoke$10.L$2;
                Dsl initializationDataKt$Dsl4 = (Dsl)androidGetInitializationData$invoke$10.L$1;
                androidGetInitializationData0 = (AndroidGetInitializationData)androidGetInitializationData$invoke$10.L$0;
                f0.n(object0);
                initializationDataKt$Dsl2 = initializationDataKt$Dsl3;
                initializationDataKt$Dsl0 = initializationDataKt$Dsl4;
            label_36:
                initializationDataKt$Dsl2.setInitializationRequest(((InitializationRequest)object0));
                androidGetInitializationData$invoke$10.L$0 = initializationDataKt$Dsl0;
                androidGetInitializationData$invoke$10.L$1 = initializationDataKt$Dsl1;
                androidGetInitializationData$invoke$10.L$2 = null;
                androidGetInitializationData$invoke$10.L$3 = null;
                androidGetInitializationData$invoke$10.label = 2;
                object0 = androidGetInitializationData0.getUniversalRequestSharedData.invoke(androidGetInitializationData$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                initializationDataKt$Dsl5 = initializationDataKt$Dsl0;
                initializationDataKt$Dsl6 = initializationDataKt$Dsl1;
                break;
            }
            case 2: {
                initializationDataKt$Dsl6 = (Dsl)androidGetInitializationData$invoke$10.L$1;
                initializationDataKt$Dsl5 = (Dsl)androidGetInitializationData$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        initializationDataKt$Dsl6.setSharedData(((SharedData)object0));
        return initializationDataKt$Dsl5._build();
    }
}

