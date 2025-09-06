package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest;
import kotlinx.coroutines.flow.I;
import y4.l;

public interface TransactionEventRepository {
    void addTransactionEvent(@l TransactionEventRequest arg1);

    @l
    I getTransactionEvents();
}

