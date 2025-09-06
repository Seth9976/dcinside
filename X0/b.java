package x0;

import android.util.Log;
import k1.n.a;
import k1.n;

@n(a.a)
public class b implements c {
    private String a;
    private int b;
    public static final b c;

    static {
        b.c = new b();
    }

    private b() {
        this.a = "unknown";
        this.b = 5;
    }

    @Override  // x0.c
    public void a(String s, String s1) {
        this.r(6, s, s1);
    }

    @Override  // x0.c
    public void b(String s, String s1) {
        this.r(3, s, s1);
    }

    @Override  // x0.c
    public void c(String s, String s1) {
        this.r(4, s, s1);
    }

    @Override  // x0.c
    public void d(String s, String s1) {
        this.r(2, s, s1);
    }

    @Override  // x0.c
    public int e() {
        return this.b;
    }

    @Override  // x0.c
    public void e(String s, String s1, Throwable throwable0) {
        this.s(6, s, s1, throwable0);
    }

    @Override  // x0.c
    public void f(String s, String s1, Throwable throwable0) {
        this.s(3, s, s1, throwable0);
    }

    @Override  // x0.c
    public void g(String s, String s1, Throwable throwable0) {
        this.s(4, s, s1, throwable0);
    }

    @Override  // x0.c
    public void h(String s, String s1) {
        this.r(6, s, s1);
    }

    @Override  // x0.c
    public void i(int v, String s, String s1) {
        this.r(v, s, s1);
    }

    @Override  // x0.c
    public void j(String s, String s1, Throwable throwable0) {
        this.s(2, s, s1, throwable0);
    }

    @Override  // x0.c
    public void k(String s, String s1, Throwable throwable0) {
        this.s(6, s, s1, throwable0);
    }

    @Override  // x0.c
    public boolean l(int v) {
        return this.b <= v;
    }

    @Override  // x0.c
    public void m(int v) {
        this.b = v;
    }

    public static b n() {
        return b.c;
    }

    private static String o(String s, Throwable throwable0) {
        return s + '\n' + b.p(throwable0);
    }

    private static String p(Throwable throwable0) {
        return throwable0 == null ? "" : Log.getStackTraceString(throwable0);
    }

    private String q(String s) {
        return this.a == null ? s : this.a + ":" + s;
    }

    private void r(int v, String s, String s1) {
        Log.println(v, this.q(s), s1);
    }

    private void s(int v, String s, String s1, Throwable throwable0) {
        Log.println(v, this.q(s), b.o(s1, throwable0));
    }

    public void t(String s) {
        this.a = s;
    }

    @Override  // x0.c
    public void w(String s, String s1) {
        this.r(5, s, s1);
    }

    @Override  // x0.c
    public void w(String s, String s1, Throwable throwable0) {
        this.s(5, s, s1, throwable0);
    }
}

