package javax.activation;

import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class l {
    private static l a;
    private static Map b;

    static {
        l.b = new WeakHashMap();
    }

    public abstract String a(File arg1);

    public abstract String b(String arg1);

    public static l c() {
        synchronized(l.class) {
            l l0 = l.a;
            if(l0 != null) {
                return l0;
            }
            ClassLoader classLoader0 = s.a();
            l l1 = (l)l.b.get(classLoader0);
            if(l1 == null) {
                l1 = new q();
                l.b.put(classLoader0, l1);
            }
            return l1;
        }
    }

    public static void d(l l0) {
        synchronized(l.class) {
            SecurityManager securityManager0 = System.getSecurityManager();
            if(securityManager0 != null) {
                try {
                    securityManager0.checkSetFactory();
                }
                catch(SecurityException securityException0) {
                    ClassLoader classLoader0 = l.class.getClassLoader();
                    if(classLoader0 == null || classLoader0.getParent() == null || classLoader0 != l0.getClass().getClassLoader()) {
                        throw securityException0;
                    }
                }
            }
            l.b.remove(s.a());
            l.a = l0;
        }
    }
}

