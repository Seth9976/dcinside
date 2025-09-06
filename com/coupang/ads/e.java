package com.coupang.ads;

import com.coupang.ads.clog.b;
import com.coupang.ads.dto.AdsProduct;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import kotlin.S0;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import kotlin.text.v;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.Response;
import y4.l;
import y4.m;

public final class e {
    public static final class a implements Callback {
        @Override  // okhttp3.Callback
        public void onFailure(@l Call call0, @l IOException iOException0) {
            L.p(call0, "call");
            L.p(iOException0, "e");
            b.a.d("CoupangUtil", "defaultCallback onFailure", iOException0);
        }

        @Override  // okhttp3.Callback
        public void onResponse(@l Call call0, @l Response response0) {
            L.p(call0, "call");
            L.p(response0, "response");
            b.a.a("CoupangUtil", "defaultCallback onResponse " + response0);
        }
    }

    @l
    public static final e a = null;
    @l
    public static final String b = "CoupangUtil";
    @l
    private static final a c;

    static {
        e.a = new e();
        e.c = new a();
    }

    @m
    public final String a(@l String s) {
        L.p(s, "str");
        DecimalFormat decimalFormat0 = new DecimalFormat(",###");
        try {
            return (String)com.coupang.ads.tools.l.a(e0.b(decimalFormat0.format(Double.parseDouble(s))), "addComma");
        }
        catch(Throwable throwable0) {
            return (String)com.coupang.ads.tools.l.a(e0.b(f0.a(throwable0)), "addComma");
        }
    }

    @m
    public final String b(@m AdsProduct adsProduct0) {
        if(adsProduct0 != null) {
            String s = adsProduct0.getClickUrl();
            if(s != null) {
                if(v.v2(s, "https", false, 2, null)) {
                    return s;
                }
                return s.length() <= 0 ? null : "https://link.coupang.com/re/AFFSDP?lptag=" + com.coupang.ads.a.o.b().c() + "&pageKey=" + adsProduct0.getGroupId() + "&itemId=" + adsProduct0.getItemId() + "&vendorItemId=" + adsProduct0.getWinnerVendorId() + "&traceid=" + adsProduct0.getEventId() + "&impressionid=" + adsProduct0.getRequestId() + "&clickbeacon=" + e.a.e(s);
            }
        }
        return null;
    }

    public final void c(@l String s, @m Callback callback0) {
        S0 s00;
        L.p(s, "url");
        try {
            Request request0 = new Builder().url(s).build();
            L.o(request0, "Builder()\n              …\n                .build()");
            Call call0 = com.coupang.ads.a.o.b().l().c().newCall(request0);
            L.o(call0, "AdsContext.context.httpC…tpClient.newCall(request)");
            if(callback0 == null) {
                callback0 = e.c;
            }
            FirebasePerfOkHttpClient.enqueue(call0, callback0);
            s00 = S0.a;
        }
        catch(Throwable throwable0) {
            s00 = e0.b(f0.a(throwable0));
        }
        com.coupang.ads.tools.l.a(s00, "sendEvent");
    }

    public static void d(e e0, String s, Callback callback0, int v, Object object0) {
        if((v & 2) != 0) {
            callback0 = null;
        }
        e0.c(s, callback0);
    }

    private final String e(String s) {
        try {
            byte[] arr_b = s.getBytes(f.b);
            L.o(arr_b, "this as java.lang.String).getBytes(charset)");
            Charset charset0 = Charset.forName("UTF-8");
            L.o(charset0, "forName(\"UTF-8\")");
            return (String)com.coupang.ads.tools.l.a(e0.b(URLEncoder.encode(new String(arr_b, charset0), "UTF-8")), "toURLEncoded");
        }
        catch(Throwable throwable0) {
            return (String)com.coupang.ads.tools.l.a(e0.b(f0.a(throwable0)), "toURLEncoded");
        }
    }
}

