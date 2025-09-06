package com.coupang.ads.tools;

import J.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.coupang.ads.clog.b;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.Impression;
import com.coupang.ads.e;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import y4.l;
import y4.m;

public final class h {
    public static final void a(@l AdsProduct adsProduct0, @l Context context0) {
        S0 s00;
        L.p(adsProduct0, "<this>");
        L.p(context0, "context");
        String s = e.a.b(adsProduct0);
        if(s != null) {
            try {
                Intent intent0 = new Intent();
                intent0.setAction("android.intent.action.VIEW");
                intent0.setData(Uri.parse(s));
                if(!(context0 instanceof Activity)) {
                    intent0.addFlags(0x10000000);
                }
                context0.startActivity(intent0);
                s00 = S0.a;
            }
            catch(Throwable throwable0) {
                s00 = e0.b(f0.a(throwable0));
            }
            S0 s01 = (S0)com.coupang.ads.tools.l.a(s00, "jumpCoupang");
        }
    }

    public static final void b(@l AdsProductPage adsProductPage0, @l Context context0) {
        S0 s00;
        L.p(adsProductPage0, "<this>");
        L.p(context0, "context");
        String s = adsProductPage0.getOptOut();
        if(s != null) {
            if(s.length() <= 0) {
                s = null;
            }
            if(s != null) {
                try {
                    Intent intent0 = new Intent();
                    intent0.setAction("android.intent.action.VIEW");
                    intent0.setData(Uri.parse(s));
                    if(!(context0 instanceof Activity)) {
                        intent0.addFlags(0x10000000);
                    }
                    context0.startActivity(intent0);
                    s00 = S0.a;
                }
                catch(Throwable throwable0) {
                    s00 = e0.b(f0.a(throwable0));
                }
                S0 s01 = (S0)com.coupang.ads.tools.l.a(s00, "optOut");
            }
        }
    }

    public static final void c(@l Impression impression0) {
        public static final class a implements Callback {
            final Impression a;

            a(Impression impression0) {
                this.a = impression0;
                super();
            }

            @Override  // okhttp3.Callback
            public void onFailure(@l Call call0, @l IOException iOException0) {
                L.p(call0, "call");
                L.p(iOException0, "e");
                b.a.b("impression.send", "onFailure", iOException0);
                this.a.getState().o(c.d);
            }

            @Override  // okhttp3.Callback
            public void onResponse(@l Call call0, @l Response response0) {
                L.p(call0, "call");
                L.p(response0, "response");
                b.a.a("impression.send", "onResponse");
                this.a.getState().o(c.c);
            }
        }

        L.p(impression0, "<this>");
        if(impression0.getState().f() == c.a) {
            String s = impression0.getImpressionUrl();
            if(s != null) {
                if(s.length() <= 0) {
                    s = null;
                }
                if(s != null) {
                    impression0.getState().r(c.b);
                    b.a.a("impression.send", s);
                    a h$a0 = new a(impression0);
                    e.a.c(s, h$a0);
                }
            }
        }
    }

    public static final void d(@l AdsProductPage adsProductPage0) {
        L.p(adsProductPage0, "<this>");
        h.e(adsProductPage0);
        ArrayList arrayList0 = adsProductPage0.getAdsProductList();
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                h.f(((AdsProduct)object0));
            }
        }
    }

    public static final void e(@l AdsProductPage adsProductPage0) {
        L.p(adsProductPage0, "<this>");
        b.a.a("sendBaseImpression", "AdsProductPage(adsProductList=null, loadingImpressionUrl=null, baseImpression=null, optOut=null, creativeTemplate=null)");
        Impression impression0 = adsProductPage0.getBaseImpression();
        if(impression0 != null) {
            h.c(impression0);
        }
    }

    public static final void f(@l AdsProduct adsProduct0) {
        L.p(adsProduct0, "<this>");
        b.a.a("sendImpression", "AdsProduct(requestId=null, title=null, imageMainPath=null, price=null, ratingAverage=null, ratingCount=null, clickUrl=null, impression=null, winnerVendorId=null, groupId=null, itemId=null, eventId=null, rocketBadge=null, orgPrice=null)");
        Impression impression0 = adsProduct0.getImpression();
        if(impression0 != null) {
            h.c(impression0);
        }
    }

    public static final void g(@m String s) {
        if(s != null) {
            if(s.length() <= 0) {
                s = null;
            }
            if(s != null) {
                b.a.a("impression", "sendLoadImpression" + s);
                e.d(e.a, s, null, 2, null);
            }
        }
    }
}

