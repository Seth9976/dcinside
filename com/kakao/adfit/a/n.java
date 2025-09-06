package com.kakao.adfit.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.graphics.Point;
import android.net.Uri.Builder;
import android.net.Uri;
import android.view.Display;
import com.kakao.adfit.ads.AdError;
import com.kakao.adfit.ads.AdException;
import com.kakao.adfit.common.matrix.c;
import com.kakao.adfit.m.B;
import com.kakao.adfit.m.d;
import com.kakao.adfit.m.e;
import com.kakao.adfit.m.i;
import com.kakao.adfit.m.k;
import com.kakao.adfit.m.l;
import com.kakao.adfit.m.r;
import com.kakao.adfit.m.u;
import com.kakao.adfit.m.x;
import com.kakao.adfit.m.z;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import org.json.JSONObject;

public final class n {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b {
        private final Uri.Builder a;

        public b(String s) {
            L.p(s, "baseUrl");
            super();
            Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
            L.m(uri$Builder0);
            this.a = uri$Builder0;
        }

        public final void a(String s, String s1) {
            L.p(s, "key");
            Uri.Builder uri$Builder0 = this.a;
            if(s1 == null) {
                return;
            }
            uri$Builder0.appendQueryParameter(s, s1);
        }

        @Override
        public String toString() {
            String s = this.a.toString();
            L.o(s, "builder.toString()");
            return s;
        }
    }

    private final Context a;
    private String b;
    private String c;
    private final String d;
    private final String e;
    private int f;
    private final boolean g;
    private boolean h;
    private Map i;
    private int j;
    private int k;
    private String l;
    private String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private Boolean r;
    public static final a s;
    private static String t;
    private static String u;

    static {
        n.s = new a(null);
    }

    public n(Context context0) {
        L.p(context0, "context");
        super();
        this.a = context0;
        this.d = "android";
        this.e = "3.17.2";
        this.f = 1;
        this.g = k.n();
        this.i = Y.z();
        L.o("com.dcinside.app.android", "context.packageName");
        this.l = "com.dcinside.app.android";
        this.m = x.b(context0);
        this.n = k.i();
        this.o = "Android";
        this.p = com.kakao.adfit.m.w.d();
        this.q = B.a.c(context0);
    }

    public n(com.kakao.adfit.a.b b0) {
        L.p(b0, "config");
        this(b0.getContext());
        this.b(b0.b());
        this.c(b0.g());
        this.a(b0.f());
        this.a(b0.i());
        this.r = (Boolean)b0.e().invoke();
        if(b0.a() > 0) {
            this.j = b0.a();
            this.k = (int)(b0.d() / 1000L);
        }
        if(!b0.c().isEmpty()) {
            this.i = b0.c();
        }
    }

    private final int a(Context context0) {
        switch(u.b(context0)) {
            case 1: {
                switch(u.a(context0)) {
                    case 1: {
                        return 4;
                    }
                    case 2: {
                        return 5;
                    }
                    case 3: {
                        return 6;
                    }
                    case 4: {
                        return 7;
                    }
                    default: {
                        return 3;
                    }
                }
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    static String a(n n0, boolean z, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = "Y";
        }
        if((v & 2) != 0) {
            s1 = "N";
        }
        return n0.a(z, s, s1);
    }

    private final String a(Map map0) {
        if(!map0.isEmpty()) {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = (String)map$Entry0.getKey();
                if(!L.g(s, "ukeyword") && !L.g(s, "exckeywords")) {
                    try {
                        jSONObject0.put(((String)map$Entry0.getKey()), map$Entry0.getValue());
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
            return jSONObject0.length() <= 0 ? null : jSONObject0.toString();
        }
        return null;
    }

    private final String a(boolean z, String s, String s1) {
        return z ? s : s1;
    }

    public final String a() {
        String s5;
        String s = this.b;
        if(s == null) {
            throw new AdException(AdError.SDK_EXCEPTION, "\"baseUrl\" is null");
        }
        String s1 = this.c;
        if(s1 == null) {
            throw new AdException(AdError.UNKNOWN_CLIENT_ID, "\"clientId\" is null");
        }
        Boolean boolean0 = this.r;
        if(boolean0 != null) {
            e e0 = this.d();
            b n$b0 = new b(s);
            n$b0.a("id", s1);
            n$b0.a("sdktype", this.d);
            n$b0.a("sdkver", this.e);
            n$b0.a("cnt", String.valueOf(this.f));
            n$b0.a("test", this.a(this.h, "Y", null));
            n$b0.a("ctag", this.a(this.i));
            n$b0.a("ukeyword", ((String)this.i.get("ukeyword")));
            n$b0.a("exckeywords", ((String)this.i.get("exckeywords")));
            n$b0.a("rfseq", (this.j <= 0 ? null : String.valueOf(this.j)));
            n$b0.a("rfinterval", (this.k <= 0 ? null : String.valueOf(this.k)));
            n$b0.a("appid", this.l);
            n$b0.a("appver", this.m);
            n$b0.a("adid", e0.a());
            n$b0.a("lmt", n.a(this, e0.b(), null, null, 3, null));
            n$b0.a("dev", this.n);
            n$b0.a("os", this.o);
            n$b0.a("osver", this.p);
            n$b0.a("network", this.h());
            n$b0.a("sdkid", this.q);
            n$b0.a("b", this.a(boolean0.booleanValue(), "F", "B"));
            n$b0.a("r", this.a(this.j(), "R", "N"));
            n$b0.a("rwbdt", (this.i() <= 0L ? null : String.valueOf(this.i())));
            n$b0.a("appkey", this.e());
            n$b0.a("appuserid", this.f());
            n$b0.a("accid", this.c());
            n$b0.a("eacid", this.g());
            B b0 = B.a;
            if(!L.g(b0.c(), Boolean.TRUE) && !L.g(b0.b(), Boolean.FALSE)) {
                n$b0.a("appkey", this.e());
                n$b0.a("appuserid", this.f());
                n$b0.a("accid", this.c());
                n$b0.a("eacid", this.g());
            }
            Boolean boolean1 = b0.c();
            if(boolean1 != null) {
                n$b0.a("coppa", n.a(this, boolean1.booleanValue(), null, null, 3, null));
            }
            Boolean boolean2 = b0.b();
            if(boolean2 != null) {
                n$b0.a("gdpr", n.a(this, boolean2.booleanValue(), null, null, 3, null));
            }
            try {
                String s2 = "unknown";
                String s3 = n.t;
                String s4 = n.u;
                if(s3 == null || s4 == null) {
                    L.o("com.dcinside.app.android", "packageName");
                    Signature signature0 = x.b(this.a, "com.dcinside.app.android");
                    if(signature0 != null) {
                        if(s3 == null) {
                            s3 = x.a(signature0, "MD5");
                            if(!L.g(s3, "unknown")) {
                                n.t = s3;
                            }
                        }
                        if(s4 == null) {
                            s4 = x.a(signature0, "SHA-1");
                            if(!L.g(s4, "unknown")) {
                                n.u = s4;
                            }
                        }
                    }
                }
                n$b0.a("apkhash", s3);
                n$b0.a("certificatehash", s4);
                L.o("com.dcinside.app.android", "packageName");
                if(x.d(this.a, "com.dcinside.app.android")) {
                    n$b0.a("appactive", "Y");
                }
                n$b0.a("appinstaller", x.a(this.a, "com.dcinside.app.android"));
                n$b0.a("cpucount", "8");
                n$b0.a("deviceuptime", "13274274");
                n$b0.a("systemtimezone", "Asia/Shanghai");
                if(k.g(this.a)) {
                    n$b0.a("adbenabled", "Y");
                }
                if(k.j(this.a)) {
                    n$b0.a("usbconnected", "Y");
                }
                Intent intent0 = k.b(this.a);
                if(intent0 != null) {
                    float f = k.a(intent0);
                    if(f >= 0.0f) {
                        s5 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{f}, 1));
                        L.o(s5, "format(locale, this, *args)");
                    }
                    else {
                        s5 = "unknown";
                    }
                    n$b0.a("batterylevel", s5);
                    switch(k.b(intent0)) {
                        case 2: {
                            s2 = "charging";
                            break;
                        }
                        case 3: {
                            s2 = "unplugged";
                            break;
                        }
                        case 4: {
                            s2 = "notcharging";
                            break;
                        }
                        case 5: {
                            s2 = "full";
                        }
                    }
                    n$b0.a("batterystate", s2);
                }
                Display display0 = l.a(this.a);
                Point point0 = l.b(display0, null, 2, null);
                n$b0.a("screensize", point0.x + 'x' + point0.y);
                n$b0.a("deviceorientation", String.valueOf(l.a(display0)));
            }
            catch(Throwable throwable0) {
                c.a.a(throwable0);
            }
            String s6 = k.b();
            if(v.v2(this.n, s6, false, 2, null)) {
                n$b0.a("hwv", this.n);
            }
            else {
                n$b0.a("hwv", s6 + ' ' + this.n);
            }
            n$b0.a("language", k.f());
            n$b0.a("make", k.g());
            try {
                n$b0.a("bp", i.a.a(this.a));
                return n$b0.toString();
            }
            catch(Throwable throwable1) {
                c.a.a(throwable1);
                return n$b0.toString();
            }
        }
        throw new AdException(AdError.SDK_EXCEPTION, "\"isForeground\" is null");
    }

    public final void a(int v) {
        this.f = v;
    }

    public final void a(String s) {
        L.p(s, "appId");
    }

    public final void a(boolean z) {
        this.h = z || this.g;
    }

    public final JSONObject b() {
        e e0 = this.d();
        JSONObject jSONObject0 = new JSONObject().put("sdktype", this.d).put("sdkver", this.e).put("test", this.a(this.h, "Y", null)).put("appid", this.l).put("appver", this.m).put("adid", e0.a()).put("lmt", n.a(this, e0.b(), null, null, 3, null)).put("dev", this.n).put("os", this.o).put("osver", this.p).put("network", this.h()).put("sdkid", this.q);
        L.o(jSONObject0, "JSONObject()\n           …     .put(\"sdkid\", sdkId)");
        return jSONObject0;
    }

    public final void b(String s) {
        if(s != null && !v.x3(s) == 1) {
            this.b = s;
        }
    }

    public final String c() {
        return r.a.b();
    }

    public final void c(String s) {
        if(s != null && !v.x3(s) == 1) {
            this.c = s;
        }
    }

    public final e d() {
        if(!L.g(B.a.c(), Boolean.TRUE) && !L.g(B.a.b(), Boolean.FALSE)) {
            if(this.g) {
                return new e("emulator", false);
            }
            e e0 = d.a.b(this.a);
            if(e0.b()) {
                String s = e0.a();
                L.o(s, "info.id");
                return v.x3(s) ? e0 : new e("", true);
            }
            return e0;
        }
        return new e("", true);
    }

    public final String e() {
        return r.a.c();
    }

    public final String f() {
        Long long0 = r.a.d();
        return long0 == null ? null : long0.toString();
    }

    public final String g() {
        return r.a.e();
    }

    public final String h() {
        return String.valueOf(this.a(this.a));
    }

    public final long i() {
        return B.a.b(this.a);
    }

    public final boolean j() {
        return z.c(this.a);
    }
}

