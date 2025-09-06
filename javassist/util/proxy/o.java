package javassist.util.proxy;

import java.io.InvalidClassException;
import java.io.Serializable;
import java.lang.reflect.Method;

public class o {
    static class a implements Serializable, i {
        private static final long a = 1L;

        @Override  // javassist.util.proxy.i
        public Object a(Object object0, Method method0, Method method1, Object[] arr_object) throws Exception {
            return method1.invoke(object0, arr_object);
        }
    }

    public static i a;

    static {
        o.a = new a();
    }

    private static void a(Class class0, String s, String s1) {
        throw new RuntimeException("not found " + s + ":" + s1 + " in " + class0.getName());
    }

    public static void b(Class class0, String s, String s1, int v, String s2, Method[] arr_method) {
        arr_method[v + 1] = s1 == null ? null : o.d(class0, s1, s2);
        arr_method[v] = o.g(class0, s, s2);
    }

    @Deprecated
    public static void c(Object object0, String s, String s1, int v, String s2, Method[] arr_method) {
        arr_method[v + 1] = s1 == null ? null : o.e(object0, s1, s2);
        arr_method[v] = o.h(object0, s, s2);
    }

    public static Method d(Class class0, String s, String s1) {
        Method method0 = o.f(class0, s, s1);
        if(method0 == null) {
            o.a(class0, s, s1);
        }
        return method0;
    }

    @Deprecated
    public static Method e(Object object0, String s, String s1) {
        Method method0 = o.f(object0.getClass(), s, s1);
        if(method0 == null) {
            o.a(object0.getClass(), s, s1);
        }
        return method0;
    }

    private static Method f(Class class0, String s, String s1) {
        Method[] arr_method = q.f(class0);
        for(int v = 0; v < arr_method.length; ++v) {
            if(arr_method[v].getName().equals(s) && o.l(arr_method[v]).equals(s1)) {
                return arr_method[v];
            }
        }
        return null;
    }

    public static Method g(Class class0, String s, String s1) {
        Method method0 = o.i(class0.getSuperclass(), s, s1);
        if(method0 == null) {
            method0 = o.o(class0, s, s1);
        }
        if(method0 == null) {
            o.a(class0, s, s1);
        }
        return method0;
    }

    public static Method h(Object object0, String s, String s1) {
        return o.g(object0.getClass(), s, s1);
    }

    private static Method i(Class class0, String s, String s1) {
        Method method0 = o.f(class0, s, s1);
        if(method0 != null) {
            return method0;
        }
        Class class1 = class0.getSuperclass();
        if(class1 != null) {
            Method method1 = o.i(class1, s, s1);
            return method1 == null ? o.o(class0, s, s1) : method1;
        }
        return o.o(class0, s, s1);
    }

    private static void j(StringBuffer stringBuffer0, Class class0) {
        if(class0.isArray()) {
            stringBuffer0.append('[');
            o.j(stringBuffer0, class0.getComponentType());
            return;
        }
        if(class0.isPrimitive()) {
            if(class0 == Void.TYPE) {
                stringBuffer0.append('V');
                return;
            }
            if(class0 == Integer.TYPE) {
                stringBuffer0.append('I');
                return;
            }
            if(class0 == Byte.TYPE) {
                stringBuffer0.append('B');
                return;
            }
            if(class0 == Long.TYPE) {
                stringBuffer0.append('J');
                return;
            }
            if(class0 == Double.TYPE) {
                stringBuffer0.append('D');
                return;
            }
            if(class0 == Float.TYPE) {
                stringBuffer0.append('F');
                return;
            }
            if(class0 == Character.TYPE) {
                stringBuffer0.append('C');
                return;
            }
            if(class0 == Short.TYPE) {
                stringBuffer0.append('S');
                return;
            }
            if(class0 != Boolean.TYPE) {
                throw new RuntimeException("bad type: " + class0.getName());
            }
            stringBuffer0.append('Z');
            return;
        }
        stringBuffer0.append('L');
        stringBuffer0.append(class0.getName().replace('.', '/'));
        stringBuffer0.append(';');
    }

    public static String k(String s, Class class0) {
        StringBuffer stringBuffer0 = new StringBuffer(s);
        o.j(stringBuffer0, class0);
        return stringBuffer0.toString();
    }

    public static String l(Method method0) {
        return o.m(method0.getParameterTypes(), method0.getReturnType());
    }

    public static String m(Class[] arr_class, Class class0) {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append('(');
        for(int v = 0; v < arr_class.length; ++v) {
            o.j(stringBuffer0, arr_class[v]);
        }
        stringBuffer0.append(')');
        if(class0 != null) {
            o.j(stringBuffer0, class0);
        }
        return stringBuffer0.toString();
    }

    public static r n(Object object0) throws InvalidClassException {
        i i0;
        Class class0 = object0.getClass();
        if(object0 instanceof l) {
            i0 = ((l)object0).getHandler();
            return new r(class0, k.C(class0), i0);
        }
        if(object0 instanceof j) {
            i0 = k.D(((j)object0));
            return new r(class0, k.C(class0), i0);
        }
        return new r(class0, k.C(class0), null);
    }

    private static Method o(Class class0, String s, String s1) {
        Class[] arr_class = class0.getInterfaces();
        for(int v = 0; v < arr_class.length; ++v) {
            Method method0 = o.i(arr_class[v], s, s1);
            if(method0 != null) {
                return method0;
            }
        }
        return null;
    }
}

