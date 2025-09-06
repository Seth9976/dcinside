package com.igaworks.ssp;

public class k0 {
    public interface a {
        void a();
    }

    private a a;
    private static k0 b;

    public void a() {
        if(k0.b != null) {
            this.a = null;
            k0.b = null;
        }
    }

    public void a(a k0$a0) {
        this.a = k0$a0;
    }

    public a b() {
        return this.a;
    }

    public static k0 c() {
        if(k0.b == null) {
            k0.b = new k0();
        }
        return k0.b;
    }

    public void d() {
        a k0$a0 = this.a;
        if(k0$a0 != null) {
            k0$a0.a();
        }
    }
}

