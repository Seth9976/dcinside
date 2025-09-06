package javassist.util.proxy;

import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

class r implements Serializable {
    private String a;
    private String[] b;
    private byte[] c;
    private i d;
    private static final long e = 1L;

    r(Class class0, byte[] arr_b, i i0) {
        this.c = arr_b;
        this.d = i0;
        this.a = class0.getSuperclass().getName();
        Class[] arr_class = class0.getInterfaces();
        this.b = new String[arr_class.length - 1];
        for(int v = 0; v < arr_class.length; ++v) {
            String s = arr_class[v].getName();
            if(!s.equals("javassist.util.proxy.l") && !s.equals("javassist.util.proxy.j")) {
                this.b[v] = s;
            }
        }
    }

    protected Class a(String s) throws ClassNotFoundException {
        class a implements PrivilegedExceptionAction {
            final String a;
            final r b;

            a(String s) {
                this.a = s;
                super();
            }

            public Class a() throws Exception {
                ClassLoader classLoader0 = Thread.currentThread().getContextClassLoader();
                return Class.forName(this.a, true, classLoader0);
            }

            @Override
            public Object run() throws Exception {
                return this.a();
            }
        }

        try {
            return (Class)AccessController.doPrivileged(new a(this, s));
        }
        catch(PrivilegedActionException privilegedActionException0) {
            throw new RuntimeException("cannot load the class: " + s, privilegedActionException0.getException());
        }
    }

    Object b() throws ObjectStreamException {
        try {
            int v = this.b.length;
            Class[] arr_class = new Class[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_class[v1] = this.a(this.b[v1]);
            }
            k k0 = new k();
            k0.n0(this.a(this.a));
            k0.m0(arr_class);
            j j0 = (j)k0.t(this.c).getConstructor(null).newInstance(null);
            j0.a(this.d);
            return j0;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new InvalidClassException(invocationTargetException0.getMessage());
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new InvalidClassException(classNotFoundException0.getMessage());
        }
        catch(InstantiationException instantiationException0) {
            throw new InvalidObjectException(instantiationException0.getMessage());
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new InvalidClassException(illegalAccessException0.getMessage());
        }
        throw new InvalidClassException(noSuchMethodException0.getMessage());
    }
}

