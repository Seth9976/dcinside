package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.g;

public class r extends o {
    int c;

    public r(int v, t t0) {
        super('S', t0);
        this.c = v;
    }

    public r(t t0) {
        super('S', t0);
        this.h(0);
    }

    public r(short v, t t0) {
        super('S', t0);
        this.h(v);
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.j(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) {
        return Short.TYPE;
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) {
        return this.g();
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.p(this.g());
    }

    public short g() {
        return (short)this.a.L(this.c);
    }

    public void h(short v) {
        this.c = this.a.h(((int)v));
    }

    @Override
    public String toString() {
        return Short.toString(this.g());
    }
}

