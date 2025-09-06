package org.ccil.cowan.tagsoup;

public class d {
    private e a;
    private a b;
    private d c;
    private boolean d;

    public d(e e0, boolean z) {
        this.a = e0;
        this.b = z ? new a(e0.a()) : new a();
        this.c = null;
        this.d = false;
    }

    public void a() {
        for(int v = this.b.getLength() - 1; v >= 0; --v) {
            if(this.b.getType(v).equals("ID") || this.b.getQName(v).equals("name")) {
                this.b.e(v);
            }
        }
    }

    public a b() {
        return this.b;
    }

    public boolean c(d d0) {
        return this.a.b(d0.a);
    }

    public void d() {
        for(int v = this.b.getLength() - 1; v >= 0; --v) {
            String s = this.b.getLocalName(v);
            if(this.b.getValue(v) == null || s == null || s.length() == 0) {
                this.b.e(v);
            }
        }
    }

    public int e() {
        return this.a.c();
    }

    public boolean f() {
        return this.d;
    }

    public String g() {
        return this.a.d();
    }

    public int h() {
        return this.a.f();
    }

    public int i() {
        return this.a.g();
    }

    public String j() {
        return this.a.h();
    }

    public String k() {
        return this.a.i();
    }

    public d l() {
        return this.c;
    }

    public e m() {
        return this.a.l();
    }

    public void n() {
        this.d = true;
    }

    public void o(String s, String s1, String s2) {
        this.a.o(this.b, s, s1, s2);
    }

    public void p(d d0) {
        this.c = d0;
    }

    public e q() {
        return this.a;
    }
}

