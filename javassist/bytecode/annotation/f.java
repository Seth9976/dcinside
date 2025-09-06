package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.g;

public class f extends o {
    int c;

    public f(int v, t t0) {
        super('Z', t0);
        this.c = v;
    }

    public f(t t0) {
        super('Z', t0);
        this.h(false);
    }

    public f(boolean z, t t0) {
        super('Z', t0);
        this.h(z);
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.f(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) {
        return Boolean.TYPE;
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) {
        return Boolean.valueOf(this.g());
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.q(this.g());
    }

    public boolean g() {
        return this.a.L(this.c) != 0;
    }

    public void h(boolean z) {
        this.c = this.a.h(((int)z));
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return this.g() ? "true" : "false";
    }
}

