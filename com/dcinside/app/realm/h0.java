package com.dcinside.app.realm;

import com.dcinside.app.type.m;
import com.dcinside.app.util.uk;
import io.realm.P2;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import org.jsoup.nodes.f;
import org.jsoup.nodes.o;
import y4.l;

public class h0 extends d1 implements P2 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final o a(@l h0 h00, @l f f0) {
            int v;
            L.p(h00, "item");
            L.p(f0, "doc");
            String s = h00.V5();
            String s1 = h00.Q5();
            String s2 = h00.T5();
            if(s2 == null) {
                v = 0;
            }
            else {
                Integer integer0 = v.b1(s2);
                v = integer0 == null ? 0 : ((int)integer0);
            }
            String s3 = uk.TG(s1, v, m.d.b(s1));
            o o0 = f0.j3("a").L0("style", "color:inherit;text-decoration:inherit;").L0("href", s3).I0("· ").I0(s);
            L.o(o0, "appendText(...)");
            return o0;
        }
    }

    @y4.m
    private String d;
    @y4.m
    private String e;
    @y4.m
    private String f;
    @y4.m
    private String g;
    @y4.m
    private String h;
    private long i;
    private long j;
    @l
    public static final a k;

    static {
        h0.k = new a(null);
    }

    public h0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.P2
    public long K1() {
        return this.i;
    }

    @y4.m
    public String Q5() {
        return this.a();
    }

    @y4.m
    public String R5() {
        return this.j();
    }

    @y4.m
    public String S5() {
        return this.f();
    }

    @y4.m
    public String T5() {
        return this.g();
    }

    public long U5() {
        return this.b0();
    }

    @Override  // io.realm.P2
    public void V(long v) {
        this.j = v;
    }

    @y4.m
    public String V5() {
        return this.k();
    }

    public long W5() {
        return this.K1();
    }

    public void X5(@y4.m String s) {
        this.b(s);
    }

    @Override  // io.realm.P2
    public void Y4(long v) {
        this.i = v;
    }

    public void Y5(@y4.m String s) {
        this.h(s);
    }

    public void Z5(@y4.m String s) {
        this.e(s);
    }

    @Override  // io.realm.P2
    public String a() {
        return this.d;
    }

    @Override  // io.realm.P2
    public void a0(String s) {
        this.f = s;
    }

    public void a6(@y4.m String s) {
        this.a0(s);
    }

    @Override  // io.realm.P2
    public void b(String s) {
        this.d = s;
    }

    @Override  // io.realm.P2
    public long b0() {
        return this.j;
    }

    public void b6(long v) {
        this.V(v);
    }

    public void c6(@y4.m String s) {
        this.l(s);
    }

    public void d6(long v) {
        this.Y4(v);
    }

    @Override  // io.realm.P2
    public void e(String s) {
        this.h = s;
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!L.g(this.getClass(), (object0 == null ? null : object0.getClass()))) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.dcinside.app.realm.PostSeriesItem");
        if(!L.g(this.Q5(), ((h0)object0).Q5())) {
            return false;
        }
        if(!L.g(this.R5(), ((h0)object0).R5())) {
            return false;
        }
        if(!L.g(this.T5(), ((h0)object0).T5())) {
            return false;
        }
        if(!L.g(this.V5(), ((h0)object0).V5())) {
            return false;
        }
        if(!L.g(this.S5(), ((h0)object0).S5())) {
            return false;
        }
        return this.W5() == ((h0)object0).W5() ? this.U5() == ((h0)object0).U5() : false;
    }

    @Override  // io.realm.P2
    public String f() {
        return this.h;
    }

    @Override  // io.realm.P2
    public String g() {
        return this.f;
    }

    @Override  // io.realm.P2
    public void h(String s) {
        this.e = s;
    }

    @Override
    public int hashCode() {
        String s = this.Q5();
        int v = 0;
        int v1 = s == null ? 0 : s.hashCode();
        String s1 = this.R5();
        int v2 = s1 == null ? 0 : s1.hashCode();
        String s2 = this.T5();
        int v3 = s2 == null ? 0 : s2.hashCode();
        String s3 = this.V5();
        int v4 = s3 == null ? 0 : s3.hashCode();
        String s4 = this.S5();
        if(s4 != null) {
            v = s4.hashCode();
        }
        return (((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v) * 0x1F + androidx.collection.a.a(this.W5())) * 0x1F + androidx.collection.a.a(this.U5());
    }

    @Override  // io.realm.P2
    public String j() {
        return this.e;
    }

    @Override  // io.realm.P2
    public String k() {
        return this.g;
    }

    @Override  // io.realm.P2
    public void l(String s) {
        this.g = s;
    }
}

