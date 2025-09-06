package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetInitializationCompletedRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetInitializationCompletedRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationCompletedRequest\n+ 2 InitializationCompletedEventRequestKt.kt\ngatewayprotocol/v1/InitializationCompletedEventRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n*L\n1#1,26:1\n10#2:27\n1#3:28\n1#3:30\n484#4:29\n*S KotlinDebug\n*F\n+ 1 AndroidGetInitializationCompletedRequest.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationCompletedRequest\n*L\n15#1:27\n15#1:28\n20#1:30\n20#1:29\n*E\n"})
public final class AndroidGetInitializationCompletedRequest implements GetInitializationCompletedRequest {
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetInitializationCompletedRequest(@l GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0, @l DeviceInfoRepository deviceInfoRepository0) {
        L.p(getUniversalRequestForPayLoad0, "getUniversalRequestForPayLoad");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        super();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad0;
        this.deviceInfoRepository = deviceInfoRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    @m
    public Object invoke(@l d d0) {
        Dsl initializationCompletedEventRequestKt$Dsl2;
        Dsl initializationCompletedEventRequestKt$Dsl1;
        AndroidGetInitializationCompletedRequest androidGetInitializationCompletedRequest0;
        Dsl initializationCompletedEventRequestKt$Dsl0;
        com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.invoke.1 androidGetInitializationCompletedRequest$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.invoke.1) {
            androidGetInitializationCompletedRequest$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.invoke.1)d0;
            int v = androidGetInitializationCompletedRequest$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetInitializationCompletedRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                androidGetInitializationCompletedRequest$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetInitializationCompletedRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = androidGetInitializationCompletedRequest$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetInitializationCompletedRequest$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0 = InitializationCompletedEventRequest.newBuilder();
                L.o(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0, "newBuilder()");
                initializationCompletedEventRequestKt$Dsl0 = Dsl.Companion._create(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0);
                androidGetInitializationCompletedRequest$invoke$10.L$0 = this;
                androidGetInitializationCompletedRequest$invoke$10.L$1 = initializationCompletedEventRequestKt$Dsl0;
                androidGetInitializationCompletedRequest$invoke$10.L$2 = initializationCompletedEventRequestKt$Dsl0;
                androidGetInitializationCompletedRequest$invoke$10.L$3 = initializationCompletedEventRequestKt$Dsl0;
                androidGetInitializationCompletedRequest$invoke$10.label = 1;
                object0 = this.deviceInfoRepository.staticDeviceInfo(androidGetInitializationCompletedRequest$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                androidGetInitializationCompletedRequest0 = this;
                initializationCompletedEventRequestKt$Dsl1 = initializationCompletedEventRequestKt$Dsl0;
                initializationCompletedEventRequestKt$Dsl2 = initializationCompletedEventRequestKt$Dsl1;
                break;
            }
            case 1: {
                initializationCompletedEventRequestKt$Dsl0 = (Dsl)androidGetInitializationCompletedRequest$invoke$10.L$3;
                initializationCompletedEventRequestKt$Dsl1 = (Dsl)androidGetInitializationCompletedRequest$invoke$10.L$2;
                initializationCompletedEventRequestKt$Dsl2 = (Dsl)androidGetInitializationCompletedRequest$invoke$10.L$1;
                androidGetInitializationCompletedRequest0 = (AndroidGetInitializationCompletedRequest)androidGetInitializationCompletedRequest$invoke$10.L$0;
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
        initializationCompletedEventRequestKt$Dsl0.setStaticDeviceInfo(((StaticDeviceInfo)object0));
        initializationCompletedEventRequestKt$Dsl1.setDynamicDeviceInfo(androidGetInitializationCompletedRequest0.deviceInfoRepository.getDynamicDeviceInfo());
        InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0 = initializationCompletedEventRequestKt$Dsl2._build();
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0 = Payload.newBuilder();
        L.o(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl universalRequestKt$PayloadKt$Dsl0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
        universalRequestKt$PayloadKt$Dsl0.setInitializationCompletedEventRequest(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0);
        Payload universalRequestOuterClass$UniversalRequest$Payload0 = universalRequestKt$PayloadKt$Dsl0._build();
        androidGetInitializationCompletedRequest$invoke$10.L$0 = null;
        androidGetInitializationCompletedRequest$invoke$10.L$1 = null;
        androidGetInitializationCompletedRequest$invoke$10.L$2 = null;
        androidGetInitializationCompletedRequest$invoke$10.L$3 = null;
        androidGetInitializationCompletedRequest$invoke$10.label = 2;
        object0 = androidGetInitializationCompletedRequest0.getUniversalRequestForPayLoad.invoke(universalRequestOuterClass$UniversalRequest$Payload0, androidGetInitializationCompletedRequest$invoke$10);
        return object0 == object1 ? object1 : object0;
    }
}

