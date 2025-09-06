package com.igaworks.ssp;

public class j0 {
    public interface a {
        void a();
    }

    private a a;
    private static j0 b;

    public void a() {
        if(j0.b != null) {
            this.a = null;
            j0.b = null;
        }
    }

    public void a(a j0$a0) {
        this.a = j0$a0;
    }

    public static j0 b() {
        if(j0.b == null) {
            j0.b = new j0();
        }
        return j0.b;
    }

    public void c() {
        a j0$a0 = this.a;
        if(j0$a0 != null) {
            j0$a0.a();
        }
    }
}

