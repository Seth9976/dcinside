package com.igaworks.ssp;

public class m0 {
    public interface a {
        void a();

        void b();

        void onPlayCompleted();
    }

    private a a;
    private static m0 b;

    public void a() {
        if(m0.b != null) {
            this.a = null;
            m0.b = null;
        }
    }

    public void a(a m0$a0) {
        this.a = m0$a0;
    }

    public static m0 b() {
        if(m0.b == null) {
            m0.b = new m0();
        }
        return m0.b;
    }

    public a c() {
        return this.a;
    }

    public void d() {
        a m0$a0 = this.a;
        if(m0$a0 != null) {
            m0$a0.b();
        }
    }

    public void e() {
        a m0$a0 = this.a;
        if(m0$a0 != null) {
            m0$a0.a();
        }
    }

    public void f() {
        a m0$a0 = this.a;
        if(m0$a0 != null) {
            m0$a0.onPlayCompleted();
        }
    }
}

