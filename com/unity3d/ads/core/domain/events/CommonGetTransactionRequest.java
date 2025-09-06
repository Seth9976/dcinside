package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import gatewayprotocol.v1.TransactionEventRequestKt.Dsl;
import gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType;
import gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder;
import gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nCommonGetTransactionRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonGetTransactionRequest.kt\ncom/unity3d/ads/core/domain/events/CommonGetTransactionRequest\n+ 2 TransactionEventRequestKt.kt\ngatewayprotocol/v1/TransactionEventRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n10#2:23\n1#3:24\n*S KotlinDebug\n*F\n+ 1 CommonGetTransactionRequest.kt\ncom/unity3d/ads/core/domain/events/CommonGetTransactionRequest\n*L\n13#1:23\n13#1:24\n*E\n"})
public final class CommonGetTransactionRequest implements GetTransactionRequest {
    @l
    private final DeviceInfoRepository deviceInfoRepository;

    public CommonGetTransactionRequest(@l DeviceInfoRepository deviceInfoRepository0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        super();
        this.deviceInfoRepository = deviceInfoRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.events.GetTransactionRequest
    @m
    public Object invoke(@l List list0, @l d d0) {
        CommonGetTransactionRequest commonGetTransactionRequest0;
        Dsl transactionEventRequestKt$Dsl3;
        Dsl transactionEventRequestKt$Dsl2;
        Dsl transactionEventRequestKt$Dsl1;
        List list1;
        com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.invoke.1 commonGetTransactionRequest$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.invoke.1) {
            commonGetTransactionRequest$invoke$10 = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.invoke.1)d0;
            int v = commonGetTransactionRequest$invoke$10.label;
            if((v & 0x80000000) == 0) {
                commonGetTransactionRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
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
                commonGetTransactionRequest$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            commonGetTransactionRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
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
        Object object0 = commonGetTransactionRequest$invoke$10.result;
        Object object1 = b.l();
        switch(commonGetTransactionRequest$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder transactionEventRequestOuterClass$TransactionEventRequest$Builder0 = TransactionEventRequest.newBuilder();
                L.o(transactionEventRequestOuterClass$TransactionEventRequest$Builder0, "newBuilder()");
                Dsl transactionEventRequestKt$Dsl0 = Dsl.Companion._create(transactionEventRequestOuterClass$TransactionEventRequest$Builder0);
                commonGetTransactionRequest$invoke$10.L$0 = this;
                commonGetTransactionRequest$invoke$10.L$1 = list0;
                commonGetTransactionRequest$invoke$10.L$2 = transactionEventRequestKt$Dsl0;
                commonGetTransactionRequest$invoke$10.L$3 = transactionEventRequestKt$Dsl0;
                commonGetTransactionRequest$invoke$10.L$4 = transactionEventRequestKt$Dsl0;
                commonGetTransactionRequest$invoke$10.label = 1;
                Object object2 = this.deviceInfoRepository.staticDeviceInfo(commonGetTransactionRequest$invoke$10);
                if(object2 == object1) {
                    return object1;
                }
                list1 = list0;
                transactionEventRequestKt$Dsl1 = transactionEventRequestKt$Dsl0;
                transactionEventRequestKt$Dsl2 = transactionEventRequestKt$Dsl1;
                transactionEventRequestKt$Dsl3 = transactionEventRequestKt$Dsl2;
                object0 = object2;
                commonGetTransactionRequest0 = this;
                break;
            }
            case 1: {
                transactionEventRequestKt$Dsl1 = (Dsl)commonGetTransactionRequest$invoke$10.L$4;
                transactionEventRequestKt$Dsl2 = (Dsl)commonGetTransactionRequest$invoke$10.L$3;
                transactionEventRequestKt$Dsl3 = (Dsl)commonGetTransactionRequest$invoke$10.L$2;
                list1 = (List)commonGetTransactionRequest$invoke$10.L$1;
                commonGetTransactionRequest0 = (CommonGetTransactionRequest)commonGetTransactionRequest$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        transactionEventRequestKt$Dsl1.setStaticDeviceInfo(((StaticDeviceInfo)object0));
        transactionEventRequestKt$Dsl2.setDynamicDeviceInfo(commonGetTransactionRequest0.deviceInfoRepository.getDynamicDeviceInfo());
        transactionEventRequestKt$Dsl2.setAppStore(StoreType.STORE_TYPE_GOOGLE_PLAY);
        transactionEventRequestKt$Dsl2.addAllTransactionData(transactionEventRequestKt$Dsl2.getTransactionData(), list1);
        return transactionEventRequestKt$Dsl3._build();
    }
}

