package com.unity3d.ads.core.data.manager;

import A3.o;
import com.google.protobuf.Timestamp;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.X;
import kotlinx.coroutines.f;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import y4.l;
import y4.m;

public final class TransactionEventManager {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    private static final String INAPP = "inapp";
    private static final int dummyOperationId = 42;
    @l
    private final GetTransactionData getTransactionData;
    @l
    private final GetTransactionRequest getTransactionRequest;
    @l
    private final ByteStringDataSource iapTransactionStore;
    @l
    private final O scope;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final StoreMonitor storeMonitor;
    @l
    private final TransactionEventRepository transactionEventRepository;

    static {
        TransactionEventManager.Companion = new Companion(null);
    }

    public TransactionEventManager(@l O o0, @l StoreMonitor storeMonitor0, @l GetTransactionData getTransactionData0, @l GetTransactionRequest getTransactionRequest0, @l TransactionEventRepository transactionEventRepository0, @l ByteStringDataSource byteStringDataSource0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(o0, "scope");
        L.p(storeMonitor0, "storeMonitor");
        L.p(getTransactionData0, "getTransactionData");
        L.p(getTransactionRequest0, "getTransactionRequest");
        L.p(transactionEventRepository0, "transactionEventRepository");
        L.p(byteStringDataSource0, "iapTransactionStore");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.scope = o0;
        this.storeMonitor = storeMonitor0;
        this.getTransactionData = getTransactionData0;
        this.getTransactionRequest = getTransactionRequest0;
        this.transactionEventRepository = transactionEventRepository0;
        this.iapTransactionStore = byteStringDataSource0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    public final void invoke() {
        com.unity3d.ads.core.data.manager.TransactionEventManager.invoke.1 transactionEventManager$invoke$10 = new o(null) {
            Object L$0;
            int label;

            {
                TransactionEventManager.this = transactionEventManager0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.manager.TransactionEventManager.invoke.1(TransactionEventManager.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.data.manager.TransactionEventManager.invoke.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        if(!TransactionEventManager.this.storeMonitor.isInitialized()) {
                            try {
                                this.L$0 = TransactionEventManager.this;
                                this.label = 1;
                                p p0 = new p(b.e(this), 1);
                                p0.c0();
                                com.unity3d.ads.core.data.manager.TransactionEventManager.invoke.1.1.1 transactionEventManager$invoke$1$1$10 = new BillingInitializationListener() {
                                    @Override  // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                                    public void onBillingServiceDisconnected() {
                                        this.tryResumeWithException(new TransactionException("Billing service disconnected"));
                                    }

                                    @Override  // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                                    public void onBillingSetupFinished(@l BillingResultBridge billingResultBridge0) {
                                        L.p(billingResultBridge0, "billingResult");
                                        if(billingResultBridge0.getResponseCode() != BillingResultResponseCode.OK) {
                                            this.tryResumeWithException(new TransactionException("Billing setup failed"));
                                            return;
                                        }
                                        this.tryResume();
                                    }

                                    @Override  // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                                    public void onIsAlreadyInitialized() {
                                        this.tryResume();
                                    }

                                    @Override  // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                                    public void onPurchaseUpdated(@l BillingResultBridge billingResultBridge0, @m List list0) {
                                        L.p(billingResultBridge0, "billingResult");
                                        TransactionEventManager.this.onPurchasesReceived(billingResultBridge0, list0);
                                    }

                                    private final void tryResume() {
                                        if(TransactionEventManager.this.isActive()) {
                                            TransactionEventManager.this.resumeWith(S0.a);
                                        }
                                    }

                                    private final void tryResumeWithException(Exception exception0) {
                                        if(TransactionEventManager.this.isActive()) {
                                            Object object0 = e0.b(f0.a(exception0));
                                            TransactionEventManager.this.resumeWith(object0);
                                        }
                                    }
                                };
                                TransactionEventManager.this.storeMonitor.initialize(transactionEventManager$invoke$1$1$10);
                                Object object2 = p0.x();
                                if(object2 == b.l()) {
                                    h.c(this);
                                }
                                if(object2 == object1) {
                                    return object1;
                                }
                                goto label_18;
                            }
                            catch(Exception unused_ex) {
                                DefaultImpls.invoke$default(TransactionEventManager.this.sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, 30, null);
                                return S0.a;
                            }
                        }
                        return S0.a;
                    }
                    case 1: {
                        TransactionEventManager transactionEventManager0 = (TransactionEventManager)this.L$0;
                        try {
                            f0.n(object0);
                        label_18:
                            a a0 = (BillingResultBridge billingResultBridge0, List list0) -> TransactionEventManager.this.onPurchasesReceived(billingResultBridge0, list0);
                            TransactionEventManager.this.storeMonitor.getPurchases(42, "inapp", a0);
                            return S0.a;
                        }
                        catch(Exception unused_ex) {
                            DefaultImpls.invoke$default(TransactionEventManager.this.sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, 30, null);
                        }
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }

            // 检测为 Lambda 实现
            private static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager0, BillingResultBridge billingResultBridge0, List list0) [...]
        };
        k.f(this.scope, null, null, transactionEventManager$invoke$10, 3, null);
    }

    private final void onPurchasesReceived(BillingResultBridge billingResultBridge0, List list0) {
        if(billingResultBridge0.getResponseCode() == BillingResultResponseCode.OK && list0 != null && !list0.isEmpty()) {
            com.unity3d.ads.core.data.manager.TransactionEventManager.onPurchasesReceived.1 transactionEventManager$onPurchasesReceived$10 = new o(this, null) {
                final List $purchases;
                int I$0;
                int I$1;
                long J$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                {
                    this.$purchases = list0;
                    TransactionEventManager.this = transactionEventManager0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.unity3d.ads.core.data.manager.TransactionEventManager.onPurchasesReceived.1(this.$purchases, TransactionEventManager.this, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.unity3d.ads.core.data.manager.TransactionEventManager.onPurchasesReceived.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object7;
                    int v;
                    TransactionEventManager transactionEventManager0;
                    List list1;
                    Iterator iterator1;
                    List list0;
                    Object object1 = b.l();
                    switch(this.label) {
                        case 0: {
                            f0.n(object0);
                            list0 = new ArrayList();
                            ArrayList arrayList0 = new ArrayList(u.b0(this.$purchases, 10));
                            for(Object object2: this.$purchases) {
                                PurchaseBridge purchaseBridge0 = (PurchaseBridge)object2;
                                arrayList0.add(z.c(null, 1, null));
                            }
                            iterator1 = this.$purchases.iterator();
                            list1 = arrayList0;
                            transactionEventManager0 = TransactionEventManager.this;
                            v = 0;
                            goto label_38;
                        }
                        case 1: {
                            long v1 = this.J$0;
                            int v2 = this.I$1;
                            int v3 = this.I$0;
                            PurchaseBridge purchaseBridge1 = (PurchaseBridge)this.L$4;
                            iterator1 = (Iterator)this.L$3;
                            transactionEventManager0 = (TransactionEventManager)this.L$2;
                            list1 = (List)this.L$1;
                            List list2 = (List)this.L$0;
                            f0.n(object0);
                            PurchaseBridge purchaseBridge2 = purchaseBridge1;
                            List list3 = list2;
                            long v4 = v1;
                            Object object3 = object0;
                            while(true) {
                                v = v3;
                                if(((float)Timestamp.parseFrom(((ByteStringStore)object3).getData()).getSeconds()) < ((float)v4) / 1000.0f) {
                                    Object object4 = purchaseBridge2.getOriginalJson().get("productId");
                                    L.n(object4, "null cannot be cast to non-null type kotlin.String");
                                    transactionEventManager0.storeMonitor.getSkuDetails(42, "inapp", u.k(((String)object4)), (BillingResultBridge billingResultBridge0, List list2) -> {
                                        if(list2 != null && billingResultBridge0.getResponseCode() == BillingResultResponseCode.OK) {
                                            ArrayList arrayList0 = new ArrayList(u.b0(list2, 10));
                                            for(Object object0: list2) {
                                                arrayList0.add(transactionEventManager0.getTransactionData.invoke(purchaseBridge2, ((SkuDetailsBridge)object0)));
                                            }
                                            list3.addAll(arrayList0);
                                            ((x)list1.get(v2)).Q(S0.a);
                                            return;
                                        }
                                        ((x)list1.get(v2)).Q(S0.a);
                                    });
                                }
                                else {
                                    ((x)list1.get(v2)).Q(S0.a);
                                }
                                list0 = list3;
                            label_38:
                                if(!iterator1.hasNext()) {
                                    break;
                                }
                                Object object5 = iterator1.next();
                                v3 = v + 1;
                                if(v < 0) {
                                    u.Z();
                                }
                                Object object6 = ((PurchaseBridge)object5).getOriginalJson().get("purchaseTime");
                                L.n(object6, "null cannot be cast to non-null type kotlin.Long");
                                long v5 = (long)(((Long)object6));
                                this.L$0 = list0;
                                this.L$1 = list1;
                                this.L$2 = transactionEventManager0;
                                this.L$3 = iterator1;
                                this.L$4 = (PurchaseBridge)object5;
                                this.I$0 = v3;
                                this.I$1 = v;
                                this.J$0 = v5;
                                this.label = 1;
                                object3 = transactionEventManager0.iapTransactionStore.get(this);
                                if(object3 == object1) {
                                    return object1;
                                }
                                purchaseBridge2 = (PurchaseBridge)object5;
                                v4 = v5;
                                list3 = list0;
                                v2 = v;
                            }
                            x[] arr_x = (x[])list1.toArray(new x[0]);
                            X[] arr_x1 = (X[])Arrays.copyOf(arr_x, arr_x.length);
                            this.L$0 = list0;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 2;
                            if(f.b(arr_x1, this) == object1) {
                                return object1;
                            }
                            goto label_75;
                        }
                        case 2: {
                            list0 = (List)this.L$0;
                            f0.n(object0);
                        label_75:
                            if(!list0.isEmpty()) {
                                this.L$0 = null;
                                this.label = 3;
                                object7 = TransactionEventManager.this.getTransactionRequest.invoke(list0, this);
                                if(object7 == object1) {
                                    return object1;
                                }
                                TransactionEventManager.this.transactionEventRepository.addTransactionEvent(((TransactionEventRequest)object7));
                                return S0.a;
                            }
                            return S0.a;
                        }
                        case 3: {
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    f0.n(object0);
                    object7 = object0;
                    TransactionEventManager.this.transactionEventRepository.addTransactionEvent(((TransactionEventRequest)object7));
                    return S0.a;
                }

                // 检测为 Lambda 实现
                private static final void invokeSuspend$lambda$3$lambda$2(List list0, int v, List list1, TransactionEventManager transactionEventManager0, PurchaseBridge purchaseBridge0, BillingResultBridge billingResultBridge0, List list2) [...]
            };
            k.f(this.scope, null, null, transactionEventManager$onPurchasesReceived$10, 3, null);
        }
    }
}

