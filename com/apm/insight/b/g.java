package com.apm.insight.b;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.p;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {
    static final class a {
        long a;
        long b;
        long c;
        boolean d;
        int e;
        StackTraceElement[] f;

        private a() {
        }

        a(byte b) {
        }
    }

    static final class b {
        a a;
        private int b;

        final void a(a g$a0) {
            throw null;
        }
    }

    public interface c {
    }

    public static final class d {
    }

    public static final class e {
        public long a;
        long b;
        long c;
        int d;
        int e;
        long f;
        long g;
        String h;
        public String i;
        private String j;
        private d k;

        public final JSONObject a() {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("msg", g.a(this.h));
                jSONObject0.put("cpuDuration", this.g);
                jSONObject0.put("duration", this.f);
                jSONObject0.put("type", this.d);
                jSONObject0.put("count", this.e);
                jSONObject0.put("messageCount", this.e);
                jSONObject0.put("lastDuration", this.b - this.c);
                jSONObject0.put("start", this.a);
                jSONObject0.put("end", this.b);
                jSONObject0.put("block_uuid", null);
                jSONObject0.put("sblock_uuid", null);
                jSONObject0.put("belong_frame", false);
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
            }
            return jSONObject0;
        }

        final void b() {
            this.d = -1;
            this.e = -1;
            this.f = -1L;
            this.h = null;
            this.j = null;
            this.k = null;
            this.i = null;
        }
    }

    static final class f {
        private int a;
        private int b;
        private e c;
        private List d;

        f(int v) {
            this.d = new ArrayList();
            this.a = v;
        }

        final e a(int v) {
            e g$e0 = this.c;
            if(g$e0 != null) {
                g$e0.d = v;
                this.c = null;
                return g$e0;
            }
            g$e0 = new e();
            g$e0.d = v;
            return g$e0;
        }

        final List a() {
            List list0 = new ArrayList();
            int v = 0;
            if(this.d.size() == this.a) {
                for(int v1 = this.b; v1 < this.d.size(); ++v1) {
                    list0.add(((e)this.d.get(v1)));
                }
                while(v < this.b - 1) {
                    list0.add(((e)this.d.get(v)));
                    ++v;
                }
                return list0;
            }
            while(v < this.d.size()) {
                list0.add(this.d.get(v));
                ++v;
            }
            return list0;
        }

        final void a(e g$e0) {
            int v = this.a;
            if(this.d.size() < v) {
                this.d.add(g$e0);
                this.b = this.d.size();
                return;
            }
            int v1 = this.b % v;
            this.b = v1;
            e g$e1 = (e)this.d.set(v1, g$e0);
            g$e1.b();
            this.c = g$e1;
            ++this.b;
        }
    }

    private c a;
    private int b;
    private volatile int c;
    private int d;
    private int e;
    private f f;
    private long g;
    private long h;
    private int i;
    private long j;
    private String k;
    private String l;
    private com.apm.insight.b.e m;
    private volatile boolean n;
    private boolean o;
    private final p p;
    private volatile boolean q;
    private static int r = 2;
    private Runnable s;

    static {
    }

    public g() {
        this(0);
    }

    private g(byte b) {
        this.b = 0;
        this.c = 0;
        this.d = 100;
        this.e = 200;
        this.g = -1L;
        this.h = -1L;
        this.i = -1;
        this.j = -1L;
        this.n = false;
        this.o = false;
        this.q = false;
        this.s = new Runnable() {
            private long a;
            private long b;
            private int c;
            private int d;
            private int e;
            private g f;

            {
                this.a = 0L;
                this.c = -1;
                this.d = 0;
                this.e = 0;
            }

            @Override
            public final void run() {
                SystemClock.uptimeMillis();
                throw new NullPointerException();
            }
        };
        this.a = new c() {
            private g a;

        };
        this.p = null;
    }

    static int a(g g0) {
        return g0.c;
    }

    public static String a(String s) {
        String s2;
        String s1;
        if(TextUtils.isEmpty(s)) {
            return "unknown message";
        }
        try {
            String[] arr_s = s.split(":");
            s1 = arr_s.length == 2 ? arr_s[1] : "";
            if(!s.contains("{") || !s.contains("}")) {
                goto label_10;
            }
            else {
                s2 = s.split("\\{")[0];
                s = s2 + s.split("\\}")[1];
            }
            goto label_11;
        }
        catch(Throwable unused_ex) {
            return s;
        }
        try {
            s = s2 + s.split("\\}")[1];
            goto label_11;
        label_10:
            s2 = s;
        label_11:
            if(s.contains("@")) {
                String[] arr_s1 = s.split("@");
                if(arr_s1.length > 1) {
                    s = arr_s1[0];
                }
            }
            if(s.contains("(") && s.contains(")") && !s.endsWith(" null")) {
                String[] arr_s2 = s.split("\\(");
                if(arr_s2.length > 1) {
                    s = arr_s2[1];
                }
                s = s.replace(")", "");
            }
            if(s.startsWith(" ")) {
                s = s.replace(" ", "");
            }
            return s + s1;
        }
        catch(Throwable unused_ex) {
        }
        return s2;
    }

    private void a(int v, long v1, String s) {
        this.a(v, v1, s, true);
    }

    private void a(int v, long v1, String s, boolean z) {
        this.o = true;
        e g$e0 = this.f.a(v);
        g$e0.f = v1 - this.g;
        if(z) {
            long v2 = SystemClock.currentThreadTimeMillis();
            g$e0.g = v2 - this.j;
            this.j = v2;
        }
        else {
            g$e0.g = -1L;
        }
        g$e0.e = this.b;
        g$e0.h = s;
        g$e0.i = this.k;
        g$e0.a = this.g;
        g$e0.b = v1;
        g$e0.c = this.h;
        this.f.a(g$e0);
        this.b = 0;
        this.g = v1;
    }

    static void a(g g0, boolean z, long v) {
        g0.c = g0.c + 1 & 0xFFFF;
        g0.o = false;
        if(g0.g < 0L) {
            g0.g = v;
        }
        if(g0.h < 0L) {
            g0.h = v;
        }
        if(g0.i < 0) {
            g0.i = Process.myTid();
            g0.j = SystemClock.currentThreadTimeMillis();
        }
        int v1 = g0.e;
        if(v - g0.g > ((long)v1)) {
            long v2 = g0.h;
            if(v - v2 <= ((long)v1)) {
                g0.a(9, v, g0.l);
            }
            else if(!z) {
                if(g0.b != 0) {
                    g0.a(9, v2, g0.k, false);
                }
                g0.a(8, v, g0.l, true);
            }
            else if(g0.b == 0) {
                g0.a(1, v, "no message running");
            }
            else {
                g0.a(9, v2, g0.k);
                g0.a(1, v, "no message running", false);
            }
        }
        g0.h = v;
    }

    public final e a(long v) {
        e g$e0 = new e();
        g$e0.h = this.l;
        g$e0.i = this.k;
        g$e0.f = v - this.h;
        g$e0.g = -this.j;
        g$e0.e = this.b;
        return g$e0;
    }

    public final void a() {
        if(this.n) {
            return;
        }
        this.n = true;
        this.d = 100;
        this.e = 300;
        this.f = new f(100);
        this.m = new com.apm.insight.b.e() {
            private g d;

            @Override  // com.apm.insight.b.e
            public final void a(String s) {
                g.this.q = true;
                g.this.l = s;
                super.a(s);
                g.a(g.this, true, com.apm.insight.b.e.a);
            }

            @Override  // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override  // com.apm.insight.b.e
            public final void b(String s) {
                super.b(s);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.a);
                g.this.k = g.this.l;
                g.this.l = "no message running";
                g.this.q = false;
            }
        };
        h.a();
        h.a(this.m);
        j.a(j.a());
    }

    static boolean b(g g0) {
        return g0.q;
    }

    public final JSONArray b() {
        JSONArray jSONArray0 = new JSONArray();
        try {
            int v = 0;
            for(Object object0: this.f.a()) {
                e g$e0 = (e)object0;
                if(g$e0 != null) {
                    ++v;
                    jSONArray0.put(g$e0.a().put("id", v));
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return jSONArray0;
    }

    static b c() [...] // Inlined contents

    static Runnable c(g g0) {
        return g0.s;
    }

    static int d() {
        return g.r;
    }

    static int d(g g0) {
        int v = g0.b;
        g0.b = v + 1;
        return v;
    }

    static p e() [...] // Inlined contents
}

