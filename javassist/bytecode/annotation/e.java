package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import javassist.bytecode.t;
import javassist.g;

public class e extends o {
    o c;
    o[] d;

    public e(o o0, t t0) {
        super('[', t0);
        this.c = o0;
        this.d = null;
    }

    public e(t t0) {
        super('[', t0);
        this.c = null;
        this.d = null;
    }

    @Override  // javassist.bytecode.annotation.o
    public void a(p p0) {
        p0.h(this);
    }

    @Override  // javassist.bytecode.annotation.o
    Class c(ClassLoader classLoader0) throws ClassNotFoundException {
        o o0 = this.c;
        if(o0 == null) {
            throw new ClassNotFoundException("no array type specified");
        }
        return Array.newInstance(o0.c(classLoader0), 0).getClass();
    }

    @Override  // javassist.bytecode.annotation.o
    Object d(ClassLoader classLoader0, g g0, Method method0) throws ClassNotFoundException {
        Class class0;
        o[] arr_o = this.d;
        if(arr_o == null) {
            throw new ClassNotFoundException("no array elements found: " + method0.getName());
        }
        o o0 = this.c;
        if(o0 == null) {
            class0 = method0.getReturnType().getComponentType();
            if(class0 == null || arr_o.length > 0) {
                throw new ClassNotFoundException("broken array type: " + method0.getName());
            }
        }
        else {
            class0 = o0.c(classLoader0);
        }
        Object object0 = Array.newInstance(class0, arr_o.length);
        for(int v = 0; v < arr_o.length; ++v) {
            Array.set(object0, v, this.d[v].d(classLoader0, g0, method0));
        }
        return object0;
    }

    @Override  // javassist.bytecode.annotation.o
    public void f(d d0) throws IOException {
        int v1 = this.d == null ? 0 : this.d.length;
        d0.d(v1);
        for(int v = 0; v < v1; ++v) {
            this.d[v].f(d0);
        }
    }

    public o g() {
        return this.c;
    }

    public o[] h() {
        return this.d;
    }

    public void i(o[] arr_o) {
        this.d = arr_o;
        if(arr_o != null && arr_o.length > 0) {
            this.c = arr_o[0];
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer("{");
        if(this.d != null) {
            int v = 0;
            while(true) {
                o[] arr_o = this.d;
                if(v >= arr_o.length) {
                    break;
                }
                stringBuffer0.append(arr_o[v].toString());
                ++v;
                if(v < this.d.length) {
                    stringBuffer0.append(", ");
                }
            }
        }
        stringBuffer0.append("}");
        return stringBuffer0.toString();
    }
}

