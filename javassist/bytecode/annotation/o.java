package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.g;

public abstract class o {
    t a;
    char b;

    o(char c, t t0) {
        this.a = t0;
        this.b = c;
    }

    public abstract void a(p arg1);

    private static String b(String s) {
        int v = s.indexOf("[]");
        if(v != -1) {
            StringBuffer stringBuffer0 = new StringBuffer(w.n(s.substring(0, v)));
            while(v != -1) {
                stringBuffer0.insert(0, "[");
                v = s.indexOf("[]", v + 1);
            }
            return stringBuffer0.toString().replace('/', '.');
        }
        return s;
    }

    abstract Class c(ClassLoader arg1) throws ClassNotFoundException;

    abstract Object d(ClassLoader arg1, g arg2, Method arg3) throws ClassNotFoundException;

    static Class e(ClassLoader classLoader0, String s) throws ClassNotFoundException, q {
        try {
            return Class.forName(o.b(s), true, classLoader0);
        }
        catch(LinkageError linkageError0) {
            throw new q(s, linkageError0);
        }
    }

    public abstract void f(d arg1) throws IOException;
}

