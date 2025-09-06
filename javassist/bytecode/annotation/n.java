package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.g;

public class n extends o {
    int c;

    public n(int v, t t0) {
        super('J', t0);
        this.c = v;
    }

    public n(long v, t t0) {
        super('J', t0);
        this.h(v);
    }

    public n(t t0) {
        super('J', t0);
        this.h(0L);
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.b(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) {
        return Long.TYPE;
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) {
        return this.g();
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.n(this.g());
    }

    public long g() {
        return this.a.W(this.c);
    }

    public void h(long v) {
        this.c = this.a.n(v);
    }

    @Override
    public String toString() {
        return Long.toString(this.g());
    }
}

