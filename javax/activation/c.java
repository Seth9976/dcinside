package javax.activation;

import java.util.Map;
import java.util.WeakHashMap;

public abstract class c {
    private static c a;
    private static Map b;

    static {
        c.b = new WeakHashMap();
    }

    public abstract e a(String arg1);

    public e b(String s, i i0) {
        return this.a(s);
    }

    public abstract b[] c(String arg1);

    public b[] d(String s, i i0) {
        return this.c(s);
    }

    public abstract b e(String arg1, String arg2);

    public b f(String s, String s1, i i0) {
        return this.e(s, s1);
    }

    public static c g() {
        synchronized(c.class) {
            c c0 = c.a;
            if(c0 != null) {
                return c0;
            }
            ClassLoader classLoader0 = s.a();
            c c1 = (c)c.b.get(classLoader0);
            if(c1 == null) {
                c1 = new m();
                c.b.put(classLoader0, c1);
            }
            return c1;
        }
    }

    public String[] h() {
        return null;
    }

    public abstract b[] i(String arg1);

    public b[] j(String s, i i0) {
        return this.i(s);
    }

    public static void k(c c0) {
        synchronized(c.class) {
            SecurityManager securityManager0 = System.getSecurityManager();
            if(securityManager0 != null) {
                try {
                    securityManager0.checkSetFactory();
                }
                catch(SecurityException securityException0) {
                    ClassLoader classLoader0 = c.class.getClassLoader();
                    if(classLoader0 == null || classLoader0.getParent() == null || classLoader0 != c0.getClass().getClassLoader()) {
                        throw securityException0;
                    }
                }
            }
            c.b.remove(s.a());
            c.a = c0;
        }
    }
}

