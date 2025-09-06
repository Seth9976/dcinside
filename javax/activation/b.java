package javax.activation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class b {
    static final class a {
        static final Method a;

        static {
            Method method0 = null;
            try {
                method0 = Class.forName("java.beans.Beans").getDeclaredMethod("instantiate", ClassLoader.class, String.class);
            }
            catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
            }
            a.a = method0;
        }

        static Object a(ClassLoader classLoader0, String s) throws IOException, ClassNotFoundException {
            static final class javax.activation.b.a.a implements PrivilegedAction {
                @Override
                public Object run() {
                    try {
                        return ClassLoader.getSystemClassLoader();
                    }
                    catch(SecurityException unused_ex) {
                        return null;
                    }
                }
            }

            Method method0 = a.a;
            if(method0 != null) {
                try {
                    return method0.invoke(null, classLoader0, s);
                }
                catch(InvocationTargetException | IllegalAccessException unused_ex) {
                    return null;
                }
            }
            SecurityManager securityManager0 = System.getSecurityManager();
            if(securityManager0 != null) {
                String s1 = s.replace('/', '.');
                if(s1.startsWith("[")) {
                    int v = s1.lastIndexOf(91);
                    if(v + 2 > 1 && v + 2 < s1.length()) {
                        s1 = s1.substring(v + 2);
                    }
                }
                int v1 = s1.lastIndexOf(46);
                if(v1 != -1) {
                    securityManager0.checkPackageAccess(s1.substring(0, v1));
                }
            }
            if(classLoader0 == null) {
                classLoader0 = (ClassLoader)AccessController.doPrivileged(new javax.activation.b.a.a());
            }
            Class class0 = Class.forName(s, true, classLoader0);
            try {
                return class0.newInstance();
            }
            catch(Exception exception0) {
                throw new ClassNotFoundException(class0 + ": " + exception0, exception0);
            }
        }
    }

    private String a;
    private String b;

    public b(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public Object c(g g0, ClassLoader classLoader0) throws IOException, ClassNotFoundException {
        Object object0 = a.a(classLoader0, this.b);
        if(object0 != null) {
            if(object0 instanceof d) {
                ((d)object0).a(this.a, g0);
                return object0;
            }
            if(object0 instanceof Externalizable && g0 != null) {
                InputStream inputStream0 = g0.l();
                if(inputStream0 != null) {
                    ((Externalizable)object0).readExternal(new ObjectInputStream(inputStream0));
                }
            }
        }
        return object0;
    }
}

