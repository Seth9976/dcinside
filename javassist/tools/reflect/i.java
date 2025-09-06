package javassist.tools.reflect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class i implements Serializable {
    protected d a;
    protected h b;
    protected Method[] c;
    private static final long d = 1L;

    protected i() {
        this.b = null;
        this.a = null;
        this.c = null;
    }

    public i(Object object0, Object[] arr_object) {
        this.b = (h)object0;
        d d0 = ((h)object0).b();
        this.a = d0;
        this.c = d0.g();
    }

    public final d a() {
        return this.a;
    }

    public final String b(int v) {
        String s = this.c[v].getName();
        int v1;
        for(v1 = 3; true; ++v1) {
            int v2 = s.charAt(v1);
            if(v2 < 0x30 || 57 < v2) {
                break;
            }
        }
        return s.substring(v1 + 1);
    }

    public final Object c() {
        return this.b;
    }

    public final Class[] d(int v) {
        return this.c[v].getParameterTypes();
    }

    public final Class e(int v) {
        return this.c[v].getReturnType();
    }

    private void f(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        h h0 = (h)objectInputStream0.readObject();
        this.b = h0;
        d d0 = h0.b();
        this.a = d0;
        this.c = d0.g();
    }

    public final void g(Object object0) {
        this.b = (h)object0;
        d d0 = ((h)object0).b();
        this.a = d0;
        this.c = d0.g();
        this.b.c(this);
    }

    public Object h(String s) {
        Class class0 = this.a().b();
        try {
            return class0.getField(s).get(this.c());
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            throw new RuntimeException(noSuchFieldException0.toString());
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0.toString());
        }
    }

    public void i(String s, Object object0) {
        Class class0 = this.a().b();
        try {
            class0.getField(s).set(this.c(), object0);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            throw new RuntimeException(noSuchFieldException0.toString());
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0.toString());
        }
    }

    public Object j(int v, Object[] arr_object) throws Throwable {
        try {
            return this.c[v].invoke(this.c(), arr_object);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw invocationTargetException0.getTargetException();
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new b(illegalAccessException0);
        }
    }

    private void k(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.writeObject(this.b);
    }
}

