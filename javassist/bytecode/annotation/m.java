package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.g;

public class m extends o {
    int c;

    public m(int v, t t0) {
        super('I', t0);
        this.c = v;
    }

    public m(t t0) {
        super('I', t0);
        this.h(0);
    }

    public m(t t0, int v) {
        super('I', t0);
        this.h(v);
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.i(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) {
        return Integer.TYPE;
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) {
        return this.g();
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.l(this.g());
    }

    public int g() {
        return this.a.L(this.c);
    }

    public void h(int v) {
        this.c = this.a.h(v);
    }

    @Override
    public String toString() {
        return Integer.toString(this.g());
    }
}

