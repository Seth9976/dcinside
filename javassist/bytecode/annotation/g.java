package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;

public class g extends o {
    int c;

    public g(byte b, t t0) {
        super('B', t0);
        this.h(b);
    }

    public g(int v, t t0) {
        super('B', t0);
        this.c = v;
    }

    public g(t t0) {
        super('B', t0);
        this.h(0);
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.g(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) {
        return Byte.TYPE;
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, javassist.g g0, Method method0) {
        return this.g();
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.h(this.g());
    }

    public byte g() {
        return (byte)this.a.L(this.c);
    }

    public void h(byte b) {
        this.c = this.a.h(((int)b));
    }

    @Override
    public String toString() {
        return Byte.toString(this.g());
    }
}

