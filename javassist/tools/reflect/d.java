package javassist.tools.reflect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class d implements Serializable {
    private Class a;
    private Constructor[] b;
    private Method[] c;
    private static final long d = 1L;
    static final String e = "_m_";
    static final int f = 3;
    public static boolean g = false;

    static {
    }

    public d(String[] arr_s) {
        Class class0;
        try {
            class0 = this.a(arr_s[0]);
            this.a = class0;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("not found: " + arr_s[0] + ", useContextClassLoader: " + "false", classNotFoundException0);
        }
        this.b = class0.getConstructors();
        this.c = null;
    }

    // 去混淆评级： 低(20)
    private Class a(String s) throws ClassNotFoundException {
        return d.g ? Thread.currentThread().getContextClassLoader().loadClass(s) : Class.forName(s);
    }

    public final Class b() {
        return this.a;
    }

    public final Method c(int v) {
        return this.g()[v];
    }

    public final int d(String s, Class[] arr_class) throws NoSuchMethodException {
        Method[] arr_method = this.g();
        for(int v = 0; v < arr_method.length; ++v) {
            if(arr_method[v] != null && this.e(v).equals(s) && Arrays.equals(arr_class, arr_method[v].getParameterTypes())) {
                return v;
            }
        }
        throw new NoSuchMethodException("Method " + s + " not found");
    }

    public final String e(int v) {
        String s = this.g()[v].getName();
        int v1;
        for(v1 = 3; true; ++v1) {
            int v2 = s.charAt(v1);
            if(v2 < 0x30 || 57 < v2) {
                break;
            }
        }
        return s.substring(v1 + 1);
    }

    public final Class[] f(int v) {
        return this.g()[v].getParameterTypes();
    }

    public final Method[] g() {
        Method[] arr_method = this.c;
        if(arr_method != null) {
            return arr_method;
        }
        Method[] arr_method1 = this.b().getDeclaredMethods();
        int[] arr_v = new int[arr_method1.length];
        int v2 = 0;
        for(int v1 = 0; v1 < arr_method1.length; ++v1) {
            String s = arr_method1[v1].getName();
            if(s.startsWith("_m_")) {
                int v4 = 0;
                for(int v3 = 3; true; ++v3) {
                    int v5 = s.charAt(v3);
                    if(0x30 > v5 || v5 > 57) {
                        break;
                    }
                    v4 = v4 * 10 + v5 - 0x30;
                }
                arr_v[v1] = v4 + 1;
                if(v4 + 1 > v2) {
                    v2 = v4 + 1;
                }
            }
        }
        this.c = new Method[v2];
        for(int v = 0; v < arr_method1.length; ++v) {
            int v6 = arr_v[v];
            if(v6 > 0) {
                this.c[v6 - 1] = arr_method1[v];
            }
        }
        return this.c;
    }

    public final String getName() {
        return this.a.getName();
    }

    public final Class h(int v) {
        return this.g()[v].getReturnType();
    }

    public static Object i(Object object0, int v, Object[] arr_object) throws Throwable {
        Method[] arr_method = object0.getClass().getMethods();
        for(int v1 = 0; v1 < arr_method.length; ++v1) {
            if(arr_method[v1].getName().startsWith("_m_" + v)) {
                try {
                    return arr_method[v1].invoke(object0, arr_object);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw invocationTargetException0.getTargetException();
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new b(illegalAccessException0);
                }
            }
        }
        throw new b("cannot find a method");
    }

    public final boolean j(Object object0) {
        return this.a.isInstance(object0);
    }

    public final Object k(Object[] arr_object) throws a {
        int v = 0;
        while(v < this.b.length) {
            try {
                return this.b[v].newInstance(arr_object);
            }
            catch(IllegalArgumentException unused_ex) {
                ++v;
            }
            catch(InstantiationException instantiationException0) {
                throw new a(instantiationException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new a(illegalAccessException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new a(invocationTargetException0);
            }
        }
        throw new a("no constructor matches");
    }

    private void l(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        Class class0 = this.a(objectInputStream0.readUTF());
        this.a = class0;
        this.b = class0.getConstructors();
        this.c = null;
    }

    public Object m(String s) {
        try {
            return this.b().getField(s).get(null);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            throw new RuntimeException(noSuchFieldException0.toString());
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0.toString());
        }
    }

    public void n(String s, Object object0) {
        try {
            this.b().getField(s).set(null, object0);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            throw new RuntimeException(noSuchFieldException0.toString());
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0.toString());
        }
    }

    public Object o(int v, Object[] arr_object) throws Throwable {
        try {
            return this.g()[v].invoke(null, arr_object);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw invocationTargetException0.getTargetException();
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new b(illegalAccessException0);
        }
    }

    private void p(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.writeUTF(this.a.getName());
    }
}

