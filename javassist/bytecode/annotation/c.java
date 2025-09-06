package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.g;

public class c extends o {
    a c;

    public c(a a0, t t0) {
        super('@', t0);
        this.c = a0;
    }

    public c(t t0) {
        this(null, t0);
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.c(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) throws ClassNotFoundException {
        a a0 = this.c;
        if(a0 == null) {
            throw new ClassNotFoundException("no type specified");
        }
        return o.e(classLoader0, a0.g());
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) throws ClassNotFoundException {
        return b.g(classLoader0, this.c(classLoader0), g0, this.c);
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.c();
        this.c.i(d0);
    }

    public a g() {
        return this.c;
    }

    public void h(a a0) {
        this.c = a0;
    }

    @Override
    public String toString() {
        return this.c.toString();
    }
}

