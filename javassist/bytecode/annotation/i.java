package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.g;

public class i extends o {
    int c;

    public i(int v, t t0) {
        super('c', t0);
        this.c = v;
    }

    public i(String s, t t0) {
        super('c', t0);
        this.h(s);
    }

    public i(t t0) {
        super('c', t0);
        this.h("java.lang.Class");
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.e(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) throws ClassNotFoundException {
        return o.e(classLoader0, "java.lang.Class");
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) throws ClassNotFoundException {
        String s = this.g();
        if(s.equals("void")) {
            return Void.TYPE;
        }
        if(s.equals("int")) {
            return Integer.TYPE;
        }
        if(s.equals("byte")) {
            return Byte.TYPE;
        }
        if(s.equals("long")) {
            return Long.TYPE;
        }
        if(s.equals("double")) {
            return Double.TYPE;
        }
        if(s.equals("float")) {
            return Float.TYPE;
        }
        if(s.equals("char")) {
            return Character.TYPE;
        }
        if(s.equals("short")) {
            return Short.TYPE;
        }
        return s.equals("boolean") ? Boolean.TYPE : o.e(classLoader0, s);
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        d0.f(this.a.p0(this.c));
    }

    // 去混淆评级： 低(20)
    public String g() {
        return "jebdyn.dexdec.irsb.Object_18f4ef0b@5f7dcf94";
    }

    public void h(String s) {
        String s1 = w.n(s);
        this.c = this.a.x(s1);
    }

    @Override
    public String toString() {
        return this.g().replace('$', '.') + ".class";
    }
}

