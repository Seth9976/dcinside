package javassist.bytecode.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import javassist.E;
import javassist.bytecode.T;
import javassist.g;

public class b implements InvocationHandler {
    private a a;
    private g b;
    private ClassLoader c;
    private transient Class d;
    private transient int e;
    private static final String f = "java.lang.annotation.Annotation";
    private static Method g;

    static {
        try {
            b.g = Annotation.class.getMethod("annotationType", null);
        }
        catch(Exception unused_ex) {
        }
    }

    private b(a a0, g g0, ClassLoader classLoader0) {
        this.e = 0x80000000;
        this.a = a0;
        this.b = g0;
        this.c = classLoader0;
    }

    private static int a(Object object0) {
        if(object0 == null) {
            return 0;
        }
        int v = 1;
        for(int v1 = 0; v1 < ((Object[])object0).length; ++v1) {
            Object object1 = ((Object[])object0)[v1];
            v = v * 0x1F + (object1 == null ? 0 : object1.hashCode());
        }
        return v;
    }

    private boolean b(Object object0) throws Exception {
        if(object0 == null) {
            return false;
        }
        if(object0 instanceof Proxy) {
            InvocationHandler invocationHandler0 = Proxy.getInvocationHandler(object0);
            if(invocationHandler0 instanceof b) {
                return this.a.equals(((b)invocationHandler0).a);
            }
        }
        Class class0 = (Class)b.g.invoke(object0, null);
        if(!this.d().equals(class0)) {
            return false;
        }
        Method[] arr_method = this.d.getDeclaredMethods();
        int v = 0;
        while(v < arr_method.length) {
            String s = arr_method[v].getName();
            o o0 = this.a.f(s);
            try {
                Object object1 = o0 == null ? null : o0.d(this.c, this.b, arr_method[v]);
                if(object1 == null) {
                    object1 = this.e(s, arr_method[v]);
                }
                Object object2 = arr_method[v].invoke(object0, null);
                goto label_24;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception exception0) {
                throw new RuntimeException("Error retrieving value " + s + " for annotation " + this.a.g(), exception0);
            }
            throw runtimeException0;
        label_24:
            if(object1 == null && object2 != null) {
                return false;
            }
            if(object1 != null && !object1.equals(object2)) {
                return false;
            }
            ++v;
        }
        return true;
    }

    public a c() {
        return this.a;
    }

    private Class d() {
        if(this.d == null) {
            String s = this.a.g();
            try {
                this.d = this.c.loadClass(s);
                return this.d;
            }
            catch(ClassNotFoundException classNotFoundException0) {
                NoClassDefFoundError noClassDefFoundError0 = new NoClassDefFoundError("Error loading annotation class: " + s);
                noClassDefFoundError0.setStackTrace(classNotFoundException0.getStackTrace());
                throw noClassDefFoundError0;
            }
        }
        return this.d;
    }

    private Object e(String s, Method method0) throws ClassNotFoundException, RuntimeException {
        String s1 = this.a.g();
        g g0 = this.b;
        if(g0 != null) {
            try {
                T t0 = g0.s(s1).u().q(s);
                if(t0 != null) {
                    javassist.bytecode.b b0 = (javassist.bytecode.b)t0.d("AnnotationDefault");
                    if(b0 != null) {
                        return b0.t().d(this.c, this.b, method0);
                    }
                }
            }
            catch(E unused_ex) {
                throw new RuntimeException("cannot find a class file: " + s1);
            }
        }
        throw new RuntimeException("no default value: " + s1 + "." + s + "()");
    }

    public String f() {
        return this.a.g();
    }

    public static Object g(ClassLoader classLoader0, Class class0, g g0, a a0) throws IllegalArgumentException {
        b b0 = new b(a0, g0, classLoader0);
        return Proxy.newProxyInstance(classLoader0, new Class[]{class0}, b0);
    }

    @Override
    public int hashCode() {
        int v2;
        Object object0;
        if(this.e == 0x80000000) {
            this.d();
            Method[] arr_method = this.d.getDeclaredMethods();
            int v = 0;
            int v1 = 0;
            while(v < arr_method.length) {
                String s = arr_method[v].getName();
                o o0 = this.a.f(s);
                try {
                    object0 = o0 == null ? null : o0.d(this.c, this.b, arr_method[v]);
                    if(object0 == null) {
                        object0 = this.e(s, arr_method[v]);
                    }
                    goto label_17;
                }
                catch(RuntimeException runtimeException0) {
                }
                catch(Exception exception0) {
                    throw new RuntimeException("Error retrieving value " + s + " for annotation " + this.a.g(), exception0);
                }
                throw runtimeException0;
            label_17:
                if(object0 == null) {
                    v2 = 0;
                }
                else if(object0.getClass().isArray()) {
                    v2 = b.a(object0);
                }
                else {
                    v2 = object0.hashCode();
                }
                v1 += s.hashCode() * 0x7F ^ v2;
                ++v;
            }
            this.e = v1;
        }
        return this.e;
    }

    @Override
    public Object invoke(Object object0, Method method0, Object[] arr_object) throws Throwable {
        String s = method0.getName();
        Class class0 = method0.getDeclaringClass();
        if(Object.class == class0) {
            if("equals".equals(s)) {
                return Boolean.valueOf(this.b(arr_object[0]));
            }
            if("toString".equals(s)) {
                return this.a.toString();
            }
            if("hashCode".equals(s)) {
                return this.hashCode();
            }
        }
        else if("annotationType".equals(s) && method0.getParameterTypes().length == 0) {
            return this.d();
        }
        o o0 = this.a.f(s);
        return o0 == null ? this.e(s, method0) : o0.d(this.c, this.b, method0);
    }
}

