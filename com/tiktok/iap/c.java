package com.tiktok.iap;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams.Builder;
import com.android.billingclient.api.SkuDetailsParams;
import com.tiktok.appevents.p;
import com.tiktok.appevents.x;
import com.tiktok.b;
import com.tiktok.util.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class c {
    private static Context a = null;
    private static BillingClient b = null;
    static final String c = "com.tiktok.iap.c";
    private static final f d;

    static {
        c.d = new f("com.tiktok.iap.c", b.o());
    }

    private static void d(Purchase purchase0, boolean z, List list0, BillingResult billingResult0, List list1) {
        if(billingResult0 != null && billingResult0.getResponseCode() == 0 && list1 != null) {
            if(list1.size() > 0) {
                ArrayList arrayList0 = new ArrayList();
                try {
                    for(Object object0: list1) {
                        x x0 = new x(new JSONObject(purchase0.getOriginalJson()), new JSONObject(((SkuDetails)object0).getOriginalJson()));
                        x0.g(true);
                        arrayList0.add(x0);
                    }
                    b.S(arrayList0);
                    return;
                }
                catch(Throwable throwable0) {
                }
                c.d.b(throwable0, "query Sku And Track google play purchase error", new Object[0]);
                return;
            }
            if(z) {
                c.f(list0, purchase0, false);
                return;
            }
            c.h(list0, purchase0);
            return;
        }
        c.h(list0, purchase0);
    }

    private static void e(BillingResult billingResult0, List list0) {
        if(p.s && billingResult0 != null && billingResult0.getResponseCode() == 0 && list0 != null) {
            for(Object object0: list0) {
                Purchase purchase0 = (Purchase)object0;
                if(purchase0 != null) {
                    ArrayList arrayList0 = purchase0.getSkus();
                    if(arrayList0 != null && arrayList0.size() != 0) {
                        c.f(arrayList0, purchase0, true);
                    }
                }
            }
            return;
        }
        if(billingResult0.getResponseCode() == 1) {
            c.d.c("user canceled", new Object[0]);
            return;
        }
        Object[] arr_object = {billingResult0.getDebugMessage()};
        c.d.c("otherErr : %s", arr_object);
    }

    private static void f(List list0, Purchase purchase0, boolean z) {
        try {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                String s = (String)object0;
                if(s != null && !s.isEmpty()) {
                    arrayList0.add(s);
                }
            }
            SkuDetailsParams.Builder skuDetailsParams$Builder0 = SkuDetailsParams.newBuilder();
            if(z) {
                skuDetailsParams$Builder0.setSkusList(arrayList0).setType("inapp");
            }
            else {
                skuDetailsParams$Builder0.setSkusList(arrayList0).setType("subs");
            }
            c.b.querySkuDetailsAsync(skuDetailsParams$Builder0.build(), new a(purchase0, z, list0));
            return;
        }
        catch(Throwable throwable0) {
        }
        c.d.b(throwable0, "query Sku And Track error", new Object[0]);
    }

    public static void g() {
        try {
            if(b.l() == null) {
                return;
            }
            c.a = b.l();
            com.tiktok.iap.b b0 = new com.tiktok.iap.b();
            c.b = BillingClient.newBuilder(c.a).setListener(b0).enablePendingPurchases().build();
            c.i();
        }
        catch(Throwable throwable0) {
            c.d.b(throwable0, "register Iap track error", new Object[0]);
        }
    }

    private static void h(List list0, Purchase purchase0) {
        try {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: list0) {
                String s = (String)object0;
                if(s != null && !s.isEmpty()) {
                    jSONArray0.put(new JSONObject().put("quantity", purchase0.getQuantity()).put("content_id", s));
                }
            }
            b.P("Purchase", new JSONObject().put("contents", jSONArray0));
            return;
        }
        catch(Throwable throwable0) {
        }
        c.d.b(throwable0, "Track Purchase error", new Object[0]);
    }

    public static void i() {
        static final class com.tiktok.iap.c.a implements BillingClientStateListener {
            public void a() {
                c.d.c("billing service disconnected", new Object[0]);
            }

            public void b(@NonNull BillingResult billingResult0) {
                if(billingResult0.getResponseCode() == 0) {
                    c.d.c("billing setup finished", new Object[0]);
                    return;
                }
                c.d.c("billing setup error %s", new Object[]{billingResult0.getDebugMessage()});
            }
        }

        try {
            if(c.b != null && !c.b.isReady()) {
                c.b.startConnection(new com.tiktok.iap.c.a());
            }
        }
        catch(Throwable throwable0) {
            c.d.b(throwable0, "start billing client connection error", new Object[0]);
        }
    }
}

