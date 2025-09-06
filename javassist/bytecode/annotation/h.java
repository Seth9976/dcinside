package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.g;

public class h extends o {
    int c;

    public h(char c, t t0) {
        super('C', t0);
        this.h(c);
    }

    public h(int v, t t0) {
        super('C', t0);
        this.c = v;
    }

    public h(t t0) {
        super('C', t0);
        this.h('\u0000');
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.m(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) {
        return Character.TYPE;
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) {
        return Character.valueOf(this.g());
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.i(this.g());
    }

    public char g() {
        return (char)this.a.L(this.c);
    }

    public void h(char c) {
        this.c = this.a.h(((int)c));
    }

    @Override
    public String toString() {
        return Character.toString(this.g());
    }
}

