package com.tiktok;

import N2.a;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tiktok.appevents.C;
import com.tiktok.appevents.p;
import com.tiktok.appevents.u;
import com.tiktok.appevents.x;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class b {
    public interface com.tiktok.b.b {
        void a(Thread arg1, Throwable arg2);
    }

    public interface c {
        void a(int arg1);

        void b(int arg1, boolean arg2);
    }

    public static enum d {
        NONE,
        INFO,
        WARN,
        DEBUG;

        public boolean a() {
            return this != d.a;
        }
    }

    public interface e {
        void a(int arg1);
    }

    public interface f {
        void a(int arg1, int arg2, int arg3, int arg4, int arg5);
    }

    public interface g {
        void a(int arg1);

        void b(int arg1, int arg2);
    }

    public static class h {
        private final Application a;
        private String b;
        private String c;
        private String[] d;
        private BigInteger e;
        private int f;
        private d g;
        private boolean h;
        private boolean i;
        private boolean j;
        private final List k;
        private boolean l;
        private boolean m;
        private boolean n;
        private boolean o;

        public h(Context context0) {
            this.b = "";
            this.c = "";
            this.d = new String[]{""};
            this.e = new BigInteger("0");
            this.f = 15;
            this.g = d.a;
            this.h = true;
            this.i = true;
            this.j = true;
            this.l = false;
            this.m = false;
            this.n = false;
            this.o = false;
            if(context0 == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            this.a = (Application)context0.getApplicationContext();
            this.k = new ArrayList();
        }

        public h A() {
            this.o = true;
            return this;
        }

        public h B() {
            this.n = true;
            return this;
        }

        public boolean C() {
            return this.o;
        }

        public h D() {
            this.m = true;
            return this;
        }

        public h E(String s) {
            if(!TextUtils.isEmpty(s)) {
                this.b = s;
            }
            return this;
        }

        public h F(int v) {
            if(v < 0) {
                throw new RuntimeException("Invalid Flush interval");
            }
            this.f = v;
            return this;
        }

        public h G(d b$d0) {
            this.g = b$d0;
            return this;
        }

        public h H(String s) {
            try {
                this.c = s;
                this.d = s.replace(" ", "").split(",");
                this.e = new BigInteger(this.d[0]);
            }
            catch(Throwable unused_ex) {
            }
            return this;
        }

        public h t() {
            this.i = false;
            return this;
        }

        public h u() {
            this.h = false;
            return this;
        }

        public h v() {
            this.j = false;
            return this;
        }

        public h w() {
            this.k.add(com.tiktok.util.d.b.b);
            return this;
        }

        public h x() {
            this.k.add(com.tiktok.util.d.b.d);
            return this;
        }

        public h y() {
            this.l = true;
            return this;
        }

        public h z() {
            this.k.add(com.tiktok.util.d.b.c);
            return this;
        }
    }

    public interface i {
        void fail(int arg1, String arg2);

        void success();
    }

    static final String a = "com.tiktok.b";
    static volatile b b = null;
    public static volatile boolean c = false;
    static p d = null;
    private static final AtomicBoolean e = null;
    private static Boolean f = null;
    private static String g = null;
    private static String h = null;
    private static d i = null;
    private static AtomicBoolean j = null;
    private static AtomicBoolean k = null;
    private static AtomicBoolean l = null;
    private static AtomicBoolean m = null;
    private static String n = null;
    private static h o = null;
    private static com.tiktok.util.f p = null;
    private static final String q = null;
    private static com.tiktok.b.b r = null;
    public static final int s = -2;
    public static c t;
    public static e u;
    public static f v;
    public static g w;

    static {
        b.e = new AtomicBoolean(false);
        b.f = Boolean.TRUE;
        b.g = "v1.2";
        b.h = "analytics.us.tiktok.com";
        b.i = d.b;
        b.k = new AtomicBoolean(false);
        b.l = new AtomicBoolean(false);
        b.m = new AtomicBoolean(false);
        b.n = "";
        b.q = "1d73e21e-18e9-4c55-9bd9-b2b8264f52d6";
    }

    private b(@NonNull h b$h0) {
        d b$d0 = b$h0.g;
        b.i = b$d0;
        b.p = new com.tiktok.util.f("com.tiktok.b", b$d0);
        if(TextUtils.isEmpty(b$h0.b) || !com.tiktok.util.b.a(b$h0.b)) {
            b$h0.b = "";
            b.p.f("Invalid App Id!", new Object[0]);
        }
        if(b$h0.c == null || !com.tiktok.util.b.b(b$h0.c)) {
            b$h0.c = "";
            b$h0.d = new String[]{""};
            b$h0.e = new BigInteger("0");
            b.p.f("Invalid TikTok App Id!", new Object[0]);
        }
        b.p.c("appId: %s, TTAppId: %s, autoIapTrack: %s", new Object[]{b$h0.b, b$h0.c, Boolean.valueOf(b$h0.o)});
        b.o = b$h0;
        b.j = new AtomicBoolean(b$h0.j);
        b.k.set(b$h0.m);
        if(b.k.get()) {
            b.n = this.d(b$h0);
        }
        b.l.set(b$h0.n);
    }

    public static Boolean A() {
        return Boolean.valueOf(b.k.get());
    }

    public static Boolean B() {
        return Boolean.valueOf(b.l.get());
    }

    public static boolean C() {
        return b.b != null && b.m.get();
    }

    public static boolean D() {
        if(b.p == null) {
            return false;
        }
        Boolean boolean0 = b.q();
        if(!boolean0.booleanValue()) {
            b.p.c("Global switch is off, ignore all operations", new Object[0]);
        }
        return boolean0.booleanValue();
    }

    public static void E() {
        try {
            long v = System.currentTimeMillis();
            b.d.H();
            JSONObject jSONObject0 = com.tiktok.util.g.c(v).put("latency", System.currentTimeMillis() - v);
            b.d.I("logout", jSONObject0, null);
        }
        catch(Exception unused_ex) {
        }
    }

    public static boolean F() [...] // 潜在的解密器

    public static void G(String s) {
        b.g = s;
    }

    public static void H(String s) {
        b.h = s;
    }

    public static void I() {
        b.e.set(true);
    }

    public static void J(com.tiktok.b.b b$b0) {
        b.r = b$b0;
    }

    public static void K(Boolean boolean0) {
        b.f = boolean0;
    }

    public static void L(e b$e0, c b$c0, f b$f0, g b$g0) {
        if(b$e0 != null) {
            b.u = b$e0;
        }
        if(b$c0 != null) {
            b.t = b$c0;
        }
        if(b$f0 != null) {
            b.v = b$f0;
        }
        if(b$g0 != null) {
            b.w = b$g0;
        }
        b.g();
    }

    public static void M() {
        if(b.d == null) {
            return;
        }
        if(!b.j.get()) {
            b.j.set(true);
            b.d.u();
        }
    }

    @Deprecated
    public static void N(String s) {
        p p0 = b.d;
        if(p0 == null) {
            return;
        }
        p0.O(s, null);
    }

    @Deprecated
    public static void O(String s, String s1) {
        p p0 = b.d;
        if(p0 == null) {
            return;
        }
        p0.P(s, null, s1);
    }

    @Deprecated
    public static void P(String s, @Nullable JSONObject jSONObject0) {
        p p0 = b.d;
        if(p0 == null) {
            return;
        }
        p0.P(s, jSONObject0, "");
    }

    @Deprecated
    public static void Q(String s, @Nullable JSONObject jSONObject0, String s1) {
        p p0 = b.d;
        if(p0 == null) {
            return;
        }
        p0.P(s, jSONObject0, s1);
    }

    public static void R(x x0) {
        b.S(Collections.singletonList(x0));
    }

    public static void S(List list0) {
        p p0 = b.d;
        if(p0 == null) {
            return;
        }
        p0.R(list0);
    }

    public static void T(a a0) {
        p p0 = b.d;
        if(p0 == null) {
            return;
        }
        p0.O(a0.toString(), null);
    }

    public static void U(a a0, String s) {
        p p0 = b.d;
        if(p0 == null) {
            return;
        }
        p0.P(a0.toString(), null, s);
    }

    public static void V(N2.b b0) {
        p p0 = b.d;
        if(p0 == null) {
            return;
        }
        p0.P(b0.b, b0.a, b0.c);
    }

    // 去混淆评级： 低(20)
    public static boolean a() [...] // 潜在的解密器

    public static void b() {
        p p0 = b.d;
        if(p0 == null) {
            return;
        }
        p0.n();
    }

    public static void c() {
        throw new RuntimeException("force crash from sdk");
    }

    private String d(@NonNull h b$h0) {
        return b$h0 == null || b$h0.c == null ? "" : b$h0.c.toString();
    }

    public static void e() {
        b.b = null;
        b.u = null;
        b.t = null;
        b.v = null;
        b.w = null;
        p p0 = b.d;
        if(p0 != null) {
            p0.p();
        }
    }

    public static boolean f() [...] // 潜在的解密器

    public static void g() {
        p p0 = b.d;
        if(p0 == null) {
            return;
        }
        p0.u();
    }

    public static String h() [...] // 潜在的解密器

    public static String i() [...] // 潜在的解密器

    public static p j() {
        StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
        return u.e(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement, 3, arr_stackTraceElement.length))) ? b.d : null;
    }

    public static String k() [...] // 潜在的解密器

    public static Application l() {
        return b.b == null ? null : b.o.a;
    }

    public static com.tiktok.b.b m() {
        return b.r;
    }

    public static BigInteger n() {
        return b.o == null ? new BigInteger("0") : b.o.e;
    }

    public static d o() {
        return b.i;
    }

    public static boolean p() {
        return b.j.get();
    }

    public static Boolean q() {
        return b.f;
    }

    public static String r() [...] // 潜在的解密器

    public static String s() [...] // 潜在的解密器

    public static String[] t() {
        return b.o == null ? new String[0] : b.o.d;
    }

    public static String u() {
        return b.n;
    }

    public static void v(String s, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
        try {
            long v = System.currentTimeMillis();
            if(!b.d.w(s, s1, s2, s3)) {
                return;
            }
            boolean z = false;
            JSONObject jSONObject0 = com.tiktok.util.g.c(v).put("latency", System.currentTimeMillis() - v).put("extid", s != null).put("username", s1 != null).put("phone", s2 != null);
            if(s3 != null) {
                z = true;
            }
            JSONObject jSONObject1 = jSONObject0.put("email", z);
            b.d.I("identify", jSONObject1, null);
        }
        catch(Exception unused_ex) {
        }
    }

    public static void w(h b$h0) {
        b.x(b$h0, null);
    }

    public static void x(h b$h0, i b$i0) {
        static final class com.tiktok.b.a implements Thread.UncaughtExceptionHandler {
            final Thread.UncaughtExceptionHandler a;

            com.tiktok.b.a(Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
                this.a = thread$UncaughtExceptionHandler0;
                super();
            }

            @Override
            public void uncaughtException(@NonNull Thread thread0, @NonNull Throwable throwable0) {
                if(u.d(throwable0)) {
                    u.b("com.tiktok.b", throwable0, 3);
                }
                if(b.m() != null) {
                    b.m().a(thread0, throwable0);
                }
                Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = this.a;
                if(thread$UncaughtExceptionHandler0 != null) {
                    thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
                }
            }
        }

        long v;
        if(b.b == null && b$h0 != null) {
            try {
                v = System.currentTimeMillis();
                Thread.setDefaultUncaughtExceptionHandler(new com.tiktok.b.a(Thread.getDefaultUncaughtExceptionHandler()));
            }
            catch(Exception unused_ex) {
            }
            b.b = new b(b$h0);
            C.c(b.l(), false);
            p p0 = new p(b$h0.h, b$h0.k, b$h0.f, b$h0.l);
            b.d = p0;
            p0.x(v, b$i0, b.m);
            if(b$h0.o) {
                com.tiktok.iap.c.g();
            }
            try {
                JSONObject jSONObject0 = com.tiktok.util.g.c(null).put("latency", System.currentTimeMillis() - v);
                b.d.I("init_end", jSONObject0, null);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public static boolean y() [...] // 潜在的解密器

    public static Boolean z() {
        return Boolean.valueOf(b.e.get());
    }
}

