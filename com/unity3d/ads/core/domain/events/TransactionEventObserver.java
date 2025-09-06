package com.unity3d.ads.core.domain.events;

import A3.o;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest;
import gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class TransactionEventObserver {
    @l
    private final K defaultDispatcher;
    @l
    private final GatewayClient gatewayClient;
    @l
    private final GetRequestPolicy getRequestPolicy;
    @l
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    @l
    private final ByteStringDataSource iapTransactionStore;
    @l
    private final E isRunning;
    @l
    private final TransactionEventRepository transactionEventRepository;

    public TransactionEventObserver(@l GetUniversalRequestForPayLoad getUniversalRequestForPayLoad0, @l K k0, @l TransactionEventRepository transactionEventRepository0, @l GatewayClient gatewayClient0, @l GetRequestPolicy getRequestPolicy0, @l ByteStringDataSource byteStringDataSource0) {
        L.p(getUniversalRequestForPayLoad0, "getUniversalRequestForPayLoad");
        L.p(k0, "defaultDispatcher");
        L.p(transactionEventRepository0, "transactionEventRepository");
        L.p(gatewayClient0, "gatewayClient");
        L.p(getRequestPolicy0, "getRequestPolicy");
        L.p(byteStringDataSource0, "iapTransactionStore");
        super();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad0;
        this.defaultDispatcher = k0;
        this.transactionEventRepository = transactionEventRepository0;
        this.gatewayClient = gatewayClient0;
        this.getRequestPolicy = getRequestPolicy0;
        this.iapTransactionStore = byteStringDataSource0;
        this.isRunning = W.a(Boolean.FALSE);
    }

    @m
    public final Object invoke(@l d d0) {
        com.unity3d.ads.core.domain.events.TransactionEventObserver.invoke.2 transactionEventObserver$invoke$20 = new o(null) {
            int label;

            {
                TransactionEventObserver.this = transactionEventObserver0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.events.TransactionEventObserver.invoke.2(TransactionEventObserver.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.events.TransactionEventObserver.invoke.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                E e0 = TransactionEventObserver.this.isRunning;
                do {
                    Object object1 = e0.getValue();
                    Boolean boolean0 = (Boolean)object1;
                    boolean0.booleanValue();
                }
                while(!e0.compareAndSet(object1, b.a(true)));
                if(boolean0.booleanValue()) {
                    return S0.a;
                }
                k.U0(k.e1(TransactionEventObserver.this.transactionEventRepository.getTransactionEvents(), new o(null) {
                    Object L$0;
                    int label;

                    {
                        TransactionEventObserver.this = transactionEventObserver0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.unity3d.ads.core.domain.events.TransactionEventObserver.invoke.2.2(TransactionEventObserver.this, d0);
                        d1.L$0 = object0;
                        return d1;
                    }

                    @m
                    public final Object invoke(@l TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0, @m d d0) {
                        return ((com.unity3d.ads.core.domain.events.TransactionEventObserver.invoke.2.2)this.create(transactionEventRequestOuterClass$TransactionEventRequest0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((TransactionEventRequest)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        UniversalRequest universalRequestOuterClass$UniversalRequest0;
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0 = (TransactionEventRequest)this.L$0;
                                Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0 = Payload.newBuilder();
                                L.o(universalRequestOuterClass$UniversalRequest$Payload$Builder0, "newBuilder()");
                                Dsl universalRequestKt$PayloadKt$Dsl0 = Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$Payload$Builder0);
                                universalRequestKt$PayloadKt$Dsl0.setTransactionEventRequest(transactionEventRequestOuterClass$TransactionEventRequest0);
                                Payload universalRequestOuterClass$UniversalRequest$Payload0 = universalRequestKt$PayloadKt$Dsl0._build();
                                this.label = 1;
                                object0 = TransactionEventObserver.this.getUniversalRequestForPayLoad.invoke(universalRequestOuterClass$UniversalRequest$Payload0, this);
                                if(object0 == object1) {
                                    return object1;
                                }
                                goto label_17;
                            }
                            case 1: {
                                f0.n(object0);
                            label_17:
                                universalRequestOuterClass$UniversalRequest0 = (UniversalRequest)object0;
                                RequestPolicy requestPolicy0 = TransactionEventObserver.this.getRequestPolicy.invoke();
                                this.L$0 = universalRequestOuterClass$UniversalRequest0;
                                this.label = 2;
                                object0 = DefaultImpls.request$default(TransactionEventObserver.this.gatewayClient, null, universalRequestOuterClass$UniversalRequest0, requestPolicy0, OperationType.TRANSACTION_EVENT, this, 1, null);
                                if(object0 == object1) {
                                    return object1;
                                }
                                break;
                            }
                            case 2: {
                                universalRequestOuterClass$UniversalRequest0 = (UniversalRequest)this.L$0;
                                f0.n(object0);
                                break;
                            }
                            case 3: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        if(((UniversalResponse)object0).getError() != null) {
                            ByteString byteString0 = universalRequestOuterClass$UniversalRequest0.getSharedData().getTimestamps().getTimestamp().toByteString();
                            L.o(byteString0, "fullRequest.sharedData.t….timestamp.toByteString()");
                            this.L$0 = null;
                            this.label = 3;
                            if(TransactionEventObserver.this.iapTransactionStore.set(byteString0, this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                }), P.a(TransactionEventObserver.this.defaultDispatcher));
                return S0.a;
            }
        };
        Object object0 = i.h(this.defaultDispatcher, transactionEventObserver$invoke$20, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }
}

