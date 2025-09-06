package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.g;

public class k extends o {
    int c;
    int d;

    public k(int v, int v1, t t0) {
        super('e', t0);
        this.c = v;
        this.d = v1;
    }

    public k(t t0) {
        super('e', t0);
        this.d = 0;
        this.c = 0;
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.d(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) throws ClassNotFoundException {
        return o.e(classLoader0, this.g());
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) throws ClassNotFoundException {
        try {
            return this.c(classLoader0).getField(this.h()).get(null);
        }
        catch(NoSuchFieldException unused_ex) {
            throw new ClassNotFoundException(this.g() + "." + this.h());
        }
        catch(IllegalAccessException unused_ex) {
            throw new ClassNotFoundException(this.g() + "." + this.h());
        }
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.s(this.a.p0(this.c), this.h());
    }

    public String g() {
        return w.w(this.a.p0(this.c));
    }

    public String h() {
        return this.a.p0(this.d);
    }

    public void i(String s) {
        this.c = this.a.x(w.n(s));
    }

    public void j(String s) {
        this.d = this.a.x(s);
    }

    @Override
    public String toString() {
        return this.g() + "." + this.h();
    }
}

