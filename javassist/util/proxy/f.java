package javassist.util.proxy;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import javassist.bytecode.k;

public class f {
    static class a {
    }

    static abstract class b {
        private b() {
        }

        b(a f$a0) {
        }

        abstract Package a(ClassLoader arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, URL arg9) throws IllegalArgumentException;
    }

    static class c extends b {
        private final q a;
        private final MethodHandle b;

        private c() {
            super(null);
            this.a = q.a;
            this.b = this.b();
        }

        c(a f$a0) {
        }

        @Override  // javassist.util.proxy.f$b
        Package a(ClassLoader classLoader0, String s, String s1, String s2, String s3, String s4, String s5, String s6, URL uRL0) throws IllegalArgumentException {
            if(this.a.b() == f.class) {
                try {
                    return (Package)this.b.invokeWithArguments(new Object[]{classLoader0, s, s1, s2, s3, s4, s5, s6, uRL0});
                }
                catch(Throwable throwable0) {
                    if(throwable0 instanceof IllegalArgumentException) {
                        throw (IllegalArgumentException)throwable0;
                    }
                    if(throwable0 instanceof RuntimeException) {
                        throw (RuntimeException)throwable0;
                    }
                    return null;
                }
            }
            throw new IllegalAccessError("Access denied for caller.");
        }

        private MethodHandle b() {
            if(this.a.b() == this.getClass()) {
                try {
                    return q.g(ClassLoader.class, "definePackage", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class});
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new RuntimeException("cannot initialize", noSuchMethodException0);
                }
            }
            throw new IllegalAccessError("Access denied for caller.");
        }
    }

    static class d extends b {
        private d() {
            super(null);
        }

        d(a f$a0) {
        }

        @Override  // javassist.util.proxy.f$b
        Package a(ClassLoader classLoader0, String s, String s1, String s2, String s3, String s4, String s5, String s6, URL uRL0) throws IllegalArgumentException {
            throw new RuntimeException("define package has been disabled for jigsaw");
        }
    }

    static class e extends b {
        private final q a;
        private final Method b;

        private e() {
            super(null);
            this.a = q.a;
            this.b = this.b();
        }

        e(a f$a0) {
        }

        @Override  // javassist.util.proxy.f$b
        Package a(ClassLoader classLoader0, String s, String s1, String s2, String s3, String s4, String s5, String s6, URL uRL0) throws IllegalArgumentException {
            if(this.a.b() == f.class) {
                try {
                    this.b.setAccessible(true);
                    return (Package)this.b.invoke(classLoader0, s, s1, s2, s3, s4, s5, s6, uRL0);
                }
                catch(Throwable throwable0) {
                    if(throwable0 instanceof InvocationTargetException) {
                        Throwable throwable1 = ((InvocationTargetException)throwable0).getTargetException();
                        if(throwable1 instanceof IllegalArgumentException) {
                            throw (IllegalArgumentException)throwable1;
                        }
                    }
                    if(throwable0 instanceof RuntimeException) {
                        throw (RuntimeException)throwable0;
                    }
                    return null;
                }
            }
            throw new IllegalAccessError("Access denied for caller.");
        }

        private Method b() {
            if(this.a.b() == this.getClass()) {
                try {
                    return q.e(ClassLoader.class, "definePackage", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class});
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new RuntimeException("cannot initialize", noSuchMethodException0);
                }
            }
            throw new IllegalAccessError("Access denied for caller.");
        }
    }

    private static final b a;

    static {
        d f$d0;
        int v = k.y;
        if(v >= 53) {
            f$d0 = new d(null);
        }
        else if(v >= 51) {
            f$d0 = new c(null);
        }
        else {
            f$d0 = new e(null);
        }
        f.a = f$d0;
    }

    public static void a(String s, ClassLoader classLoader0) throws javassist.b {
        try {
            f.a.a(classLoader0, s, null, null, null, null, null, null, null);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        catch(Exception exception0) {
            throw new javassist.b(exception0);
        }
    }
}

