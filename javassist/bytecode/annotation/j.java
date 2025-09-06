package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.g;

public class j extends o {
    int c;

    public j(double f, t t0) {
        super('D', t0);
        this.h(f);
    }

    public j(int v, t t0) {
        super('D', t0);
        this.c = v;
    }

    public j(t t0) {
        super('D', t0);
        this.h(0.0);
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.k(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) {
        return Double.TYPE;
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) {
        return this.g();
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.j(this.g());
    }

    public double g() {
        return this.a.E(this.c);
    }

    public void h(double f) {
        this.c = this.a.d(f);
    }

    @Override
    public String toString() {
        return Double.toString(this.g());
    }
}

