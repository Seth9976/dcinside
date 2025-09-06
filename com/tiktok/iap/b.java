package com.tiktok.iap;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import java.util.List;

public final class b implements PurchasesUpdatedListener {
    public final void a(BillingResult billingResult0, List list0) {
        c.e(billingResult0, list0);
    }
}

