package pl.droidsonroids.gif;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.io.IOException;

public class k {
    private final GifInfoHandle a;

    public k(m m0, @Nullable i i0) throws IOException {
        if(i0 == null) {
            i0 = new i();
        }
        GifInfoHandle gifInfoHandle0 = m0.c();
        this.a = gifInfoHandle0;
        gifInfoHandle0.K(i0.a, i0.b);
        gifInfoHandle0.t();
    }

    public int a() {
        return this.a.d();
    }

    public int b() {
        return this.a.g();
    }

    public int c(@IntRange(from = 0L) int v) {
        return this.a.h(v);
    }

    public int d() {
        return this.a.i();
    }

    public int e() {
        return this.a.n();
    }

    public int f() {
        return this.a.q();
    }

    @Override
    protected final void finalize() throws Throwable {
        try {
            this.i();
        }
        finally {
            super.finalize();
        }
    }

    public void g(int v, int v1) {
        this.a.r(v, v1);
    }

    public void h(int v, int v1) {
        this.a.s(v, v1);
    }

    public void i() {
        GifInfoHandle gifInfoHandle0 = this.a;
        if(gifInfoHandle0 != null) {
            gifInfoHandle0.A();
        }
    }

    public void j(@IntRange(from = 0L) int v) {
        this.a.H(v);
    }

    public void k(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        this.a.L(f);
    }

    public void l() {
        this.a.M();
    }

    public void m() {
        this.a.N();
    }
}

