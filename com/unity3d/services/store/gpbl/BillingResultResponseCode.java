package com.unity3d.services.store.gpbl;

import androidx.annotation.NonNull;

public enum BillingResultResponseCode {
    UNKNOWN(-100),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    NETWORK_ERROR(12);

    private final int _responseCode;

    private static BillingResultResponseCode[] $values() [...] // Inlined contents

    private BillingResultResponseCode(int v1) {
        this._responseCode = v1;
    }

    @NonNull
    public static BillingResultResponseCode fromResponseCode(int v) {
        BillingResultResponseCode[] arr_billingResultResponseCode = BillingResultResponseCode.values();
        for(int v1 = 0; v1 < arr_billingResultResponseCode.length; ++v1) {
            BillingResultResponseCode billingResultResponseCode0 = arr_billingResultResponseCode[v1];
            if(billingResultResponseCode0.getResponseCode() == v) {
                return billingResultResponseCode0;
            }
        }
        return BillingResultResponseCode.UNKNOWN;
    }

    public int getResponseCode() {
        return this._responseCode;
    }
}

