package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.K;
import kotlinx.coroutines.flow.k;
import y4.l;

public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    @l
    private final D _transactionEvents;
    @l
    private final I transactionEvents;

    public AndroidTransactionEventRepository() {
        D d0 = K.a(10, 10, i.b);
        this._transactionEvents = d0;
        this.transactionEvents = k.l(d0);
    }

    @Override  // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(@l TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0) {
        L.p(transactionEventRequestOuterClass$TransactionEventRequest0, "transactionEventRequest");
        this._transactionEvents.d(transactionEventRequestOuterClass$TransactionEventRequest0);
    }

    @Override  // com.unity3d.ads.core.data.repository.TransactionEventRepository
    @l
    public I getTransactionEvents() {
        return this.transactionEvents;
    }
}

