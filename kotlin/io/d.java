package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.i;

@i(name = "ConsoleKt")
public final class d {
    @f
    private static final void a(byte b) {
        System.out.print(b);
    }

    @f
    private static final void b(char c) {
        System.out.print(c);
    }

    @f
    private static final void c(double f) {
        System.out.print(f);
    }

    @f
    private static final void d(float f) {
        System.out.print(f);
    }

    @f
    private static final void e(int v) {
        System.out.print(v);
    }

    @f
    private static final void f(long v) {
        System.out.print(v);
    }

    @f
    private static final void g(Object object0) {
        System.out.print(object0);
    }

    @f
    private static final void h(short v) {
        System.out.print(v);
    }

    @f
    private static final void i(boolean z) {
        System.out.print(z);
    }

    @f
    private static final void j(char[] arr_c) {
        L.p(arr_c, "message");
        System.out.print(arr_c);
    }

    @f
    private static final void k() {
        System.out.println();
    }

    @f
    private static final void l(byte b) {
        System.out.println(b);
    }

    @f
    private static final void m(char c) {
        System.out.println(c);
    }

    @f
    private static final void n(double f) {
        System.out.println(f);
    }

    @f
    private static final void o(float f) {
        System.out.println(f);
    }

    @f
    private static final void p(int v) {
        System.out.println(v);
    }

    @f
    private static final void q(long v) {
        System.out.println(v);
    }

    @f
    private static final void r(Object object0) {
        System.out.println(object0);
    }

    @f
    private static final void s(short v) {
        System.out.println(v);
    }

    @f
    private static final void t(boolean z) {
        System.out.println(z);
    }

    @f
    private static final void u(char[] arr_c) {
        L.p(arr_c, "message");
        System.out.println(arr_c);
    }

    @m
    public static final String v() {
        InputStream inputStream0 = System.in;
        L.o(inputStream0, "in");
        Charset charset0 = Charset.defaultCharset();
        L.o(charset0, "defaultCharset(...)");
        return r.a.d(inputStream0, charset0);
    }

    @h0(version = "1.6")
    @l
    public static final String w() {
        String s = d.x();
        if(s == null) {
            throw new v("EOF has already been reached");
        }
        return s;
    }

    @h0(version = "1.6")
    @m
    public static final String x() {
        return d.v();
    }
}

