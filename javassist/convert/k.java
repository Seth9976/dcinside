package javassist.convert;

import javassist.b;
import javassist.bytecode.T;
import javassist.bytecode.c0;
import javassist.bytecode.e;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.l;

public abstract class k implements c0 {
    private k a;

    public k(k k0) {
        this.a = k0;
    }

    public void a() {
    }

    public int b() {
        return 0;
    }

    public int c() [...] // Inlined contents

    public k d() {
        return this.a;
    }

    public void e(t t0, l l0, T t1) throws b {
        this.f(t0, t1.f());
    }

    public void f(t t0, p p0) {
    }

    public abstract int g(l arg1, int arg2, q arg3, t arg4) throws b, e;
}

