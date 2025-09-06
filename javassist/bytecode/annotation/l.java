package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.g;

public class l extends o {
    int c;

    public l(float f, t t0) {
        super('F', t0);
        this.h(f);
    }

    public l(int v, t t0) {
        super('F', t0);
        this.c = v;
    }

    public l(t t0) {
        super('F', t0);
        this.h(0.0f);
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.a(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) {
        return Float.TYPE;
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) {
        return this.g();
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.k(this.g());
    }

    public float g() {
        return this.a.K(this.c);
    }

    public void h(float f) {
        this.c = this.a.g(f);
    }

    @Override
    public String toString() {
        return Float.toString(this.g());
    }
}

