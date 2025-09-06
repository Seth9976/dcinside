package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.g;

public class s extends o {
    int c;

    public s(int v, t t0) {
        super('s', t0);
        this.c = v;
    }

    public s(String s, t t0) {
        super('s', t0);
        this.h(s);
    }

    public s(t t0) {
        super('s', t0);
        this.h("");
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.l(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) {
        return String.class;
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) {
        return this.g();
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.o(this.g());
    }

    public String g() {
        return this.a.p0(this.c);
    }

    public void h(String s) {
        this.c = this.a.x(s);
    }

    @Override
    public String toString() {
        return "\"" + this.g() + "\"";
    }
}

