package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.L;
import y4.l;
import z3.f;

public class m {
    @l
    @f
    public final Y a;
    private boolean b;

    public m(@l Y y0) {
        L.p(y0, "writer");
        super();
        this.a = y0;
        this.b = true;
    }

    public final boolean a() {
        return this.b;
    }

    public void b() {
        this.b = true;
    }

    public void c() {
        this.b = false;
    }

    public void d(byte b) {
        this.a.writeLong(((long)b));
    }

    public final void e(char c) {
        this.a.a(c);
    }

    public void f(double f) {
        this.a.c(String.valueOf(f));
    }

    public void g(float f) {
        this.a.c(String.valueOf(f));
    }

    public void h(int v) {
        this.a.writeLong(((long)v));
    }

    public void i(long v) {
        this.a.writeLong(v);
    }

    public final void j(@l String s) {
        L.p(s, "v");
        this.a.c(s);
    }

    public void k(short v) {
        this.a.writeLong(((long)v));
    }

    public void l(boolean z) {
        this.a.c(String.valueOf(z));
    }

    public final void m(@l String s) {
        L.p(s, "value");
        this.a.b(s);
    }

    protected final void n(boolean z) {
        this.b = z;
    }

    public void o() {
    }

    public void p() {
    }
}

