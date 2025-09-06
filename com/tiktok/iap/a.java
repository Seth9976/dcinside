package com.tiktok.iap;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetailsResponseListener;
import java.util.List;

public final class a implements SkuDetailsResponseListener {
    public final Purchase a;
    public final boolean b;
    public final List c;

    public a(Purchase purchase0, boolean z, List list0) {
        this.a = purchase0;
        this.b = z;
        this.c = list0;
    }

    public final void a(BillingResult billingResult0, List list0) {
        c.d(this.a, this.b, this.c, billingResult0, list0);
    }
}

