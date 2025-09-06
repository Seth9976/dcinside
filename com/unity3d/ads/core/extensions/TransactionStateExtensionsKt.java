package com.unity3d.ads.core.extensions;

import gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState;
import y4.l;

public final class TransactionStateExtensionsKt {
    @l
    public static final TransactionState fromPurchaseState(int v) {
        switch(v) {
            case 0: {
                return TransactionState.TRANSACTION_STATE_PURCHASED;
            }
            case 1: {
                return TransactionState.TRANSACTION_STATE_UNSPECIFIED;
            }
            case 2: {
                return TransactionState.TRANSACTION_STATE_PENDING;
            }
            default: {
                return TransactionState.UNRECOGNIZED;
            }
        }
    }
}

