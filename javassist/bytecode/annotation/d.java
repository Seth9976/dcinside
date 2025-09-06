package javassist.bytecode.annotation;

import java.io.IOException;
import java.io.OutputStream;
import javassist.bytecode.g;
import javassist.bytecode.t;

public class d {
    protected OutputStream a;
    private t b;

    public d(OutputStream outputStream0, t t0) {
        this.a = outputStream0;
        this.b = t0;
    }

    public void a(int v, int v1) throws IOException {
        this.y(v);
        this.y(v1);
    }

    public void b(String s, int v) throws IOException {
        this.a(this.b.x(s), v);
    }

    public void c() throws IOException {
        this.a.write(0x40);
    }

    public void d(int v) throws IOException {
        this.a.write(91);
        this.y(v);
    }

    public void e(int v) throws IOException {
        this.a.write(99);
        this.y(v);
    }

    public void f(String s) throws IOException {
        this.e(this.b.x(s));
    }

    public void g() throws IOException {
        this.a.close();
    }

    public void h(byte b) throws IOException {
        this.m(66, this.b.h(((int)b)));
    }

    public void i(char c) throws IOException {
        this.m(67, this.b.h(((int)c)));
    }

    public void j(double f) throws IOException {
        this.m(68, this.b.d(f));
    }

    public void k(float f) throws IOException {
        this.m(70, this.b.g(f));
    }

    public void l(int v) throws IOException {
        this.m(73, this.b.h(v));
    }

    public void m(int v, int v1) throws IOException {
        this.a.write(v);
        this.y(v1);
    }

    public void n(long v) throws IOException {
        this.m(74, this.b.n(v));
    }

    public void o(String s) throws IOException {
        this.m(0x73, this.b.x(s));
    }

    public void p(short v) throws IOException {
        this.m(83, this.b.h(((int)v)));
    }

    public void q(boolean z) throws IOException {
        this.m(90, this.b.h(((int)z)));
    }

    public void r(int v, int v1) throws IOException {
        this.a.write(101);
        this.y(v);
        this.y(v1);
    }

    public void s(String s, String s1) throws IOException {
        this.r(this.b.x(s), this.b.x(s1));
    }

    public t t() {
        return this.b;
    }

    public void u(int v) throws IOException {
        this.y(v);
    }

    public void v(String s) throws IOException {
        this.u(this.b.x(s));
    }

    public void w(int v) throws IOException {
        this.y(v);
    }

    public void x(int v) throws IOException {
        this.a.write(v);
    }

    protected void y(int v) throws IOException {
        byte[] arr_b = new byte[2];
        g.e(v, arr_b, 0);
        this.a.write(arr_b);
    }
}

