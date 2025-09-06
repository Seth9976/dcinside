package javassist.util.proxy;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import java.util.List;
import javassist.bytecode.k;

public class c {
    static class a {
    }

    static abstract class b {
        private b() {
        }

        b(a c$a0) {
        }

        abstract Class a(String arg1, byte[] arg2, int arg3, int arg4, Class arg5, ClassLoader arg6, ProtectionDomain arg7) throws ClassFormatError, javassist.b;
    }

    static class javassist.util.proxy.c.c extends f {
        private javassist.util.proxy.c.c() {
            super(null);
        }

        javassist.util.proxy.c.c(a c$a0) {
        }

        @Override  // javassist.util.proxy.c$f
        Class a(String s, byte[] arr_b, int v, int v1, Class class0, ClassLoader classLoader0, ProtectionDomain protectionDomain0) throws ClassFormatError, javassist.b {
            return class0 == null ? super.a(s, arr_b, v, v1, null, classLoader0, protectionDomain0) : c.b(class0, arr_b);
        }
    }

    static class d extends b {
        private final q a;
        private final MethodHandle b;

        private d() {
            super(null);
            this.a = q.a;
            this.b = this.b();
        }

        d(a c$a0) {
        }

        @Override  // javassist.util.proxy.c$b
        Class a(String s, byte[] arr_b, int v, int v1, Class class0, ClassLoader classLoader0, ProtectionDomain protectionDomain0) throws ClassFormatError {
            if(this.a.b() == c.class) {
                try {
                    return (Class)this.b.invokeWithArguments(new Object[]{classLoader0, s, arr_b, v, v1, protectionDomain0});
                }
                catch(Throwable throwable0) {
                    if(!(throwable0 instanceof RuntimeException)) {
                        throw throwable0 instanceof ClassFormatError ? ((ClassFormatError)throwable0) : new ClassFormatError(throwable0.getMessage());
                    }
                    throw (RuntimeException)throwable0;
                }
            }
            throw new IllegalAccessError("Access denied for caller.");
        }

        private final MethodHandle b() {
            if(c.a != null && this.a.b() != this.getClass()) {
                throw new IllegalAccessError("Access denied for caller.");
            }
            try {
                return q.g(ClassLoader.class, "defineClass", new Class[]{String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class});
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new RuntimeException("cannot initialize", noSuchMethodException0);
            }
        }
    }

    static class e extends b {
        final class javassist.util.proxy.c.e.a {
            private final i a;
            private final MethodHandle b;
            final e c;

            javassist.util.proxy.c.e.a(i q$i0, MethodHandle methodHandle0) {
                this.a = q$i0;
                this.b = methodHandle0;
            }

            Class a(String s, byte[] arr_b, int v, int v1, ClassLoader classLoader0, ProtectionDomain protectionDomain0) throws ClassFormatError {
                try {
                    if(e.this.b.invoke(e.this.a, null) != e.class) {
                        throw new IllegalAccessError("Access denied for caller.");
                    }
                }
                catch(Exception exception0) {
                    throw new RuntimeException("cannot initialize", exception0);
                }
                try {
                    return (Class)this.b.invokeWithArguments(new Object[]{this.a.b, s, arr_b, v, v1, classLoader0, protectionDomain0});
                }
                catch(Throwable throwable0) {
                    if(!(throwable0 instanceof RuntimeException)) {
                        throw throwable0 instanceof ClassFormatError ? ((ClassFormatError)throwable0) : new ClassFormatError(throwable0.getMessage());
                    }
                    throw (RuntimeException)throwable0;
                }
            }
        }

        private final Object a;
        private final Method b;
        private final javassist.util.proxy.c.e.a c;

        e() {
            super(null);
            Class class0;
            this.c = this.d();
            try {
                class0 = null;
                class0 = Class.forName("java.lang.StackWalker");
            }
            catch(ClassNotFoundException unused_ex) {
            }
            if(class0 != null) {
                try {
                    Class class1 = Class.forName("java.lang.StackWalker$Option");
                    this.a = class0.getMethod("getInstance", class1).invoke(null, class1.getEnumConstants()[0]);
                    this.b = class0.getMethod("getCallerClass", null);
                    return;
                }
                catch(Throwable throwable0) {
                    throw new RuntimeException("cannot initialize", throwable0);
                }
            }
            this.a = null;
            this.b = null;
        }

        @Override  // javassist.util.proxy.c$b
        Class a(String s, byte[] arr_b, int v, int v1, Class class0, ClassLoader classLoader0, ProtectionDomain protectionDomain0) throws ClassFormatError {
            try {
                if(this.b.invoke(this.a, null) != c.class) {
                    throw new IllegalAccessError("Access denied for caller.");
                }
            }
            catch(Exception exception0) {
                throw new RuntimeException("cannot initialize", exception0);
            }
            return this.c.a(s, arr_b, v, v1, classLoader0, protectionDomain0);
        }

        private final javassist.util.proxy.c.e.a d() {
            try {
                if(c.a != null && this.b.invoke(this.a, null) != this.getClass()) {
                    throw new IllegalAccessError("Access denied for caller.");
                }
            }
            catch(Exception exception0) {
                throw new RuntimeException("cannot initialize", exception0);
            }
            try {
                i q$i0 = q.h();
                List list0 = (List)q$i0.c.get("defineClass");
                return list0 == null ? null : new javassist.util.proxy.c.e.a(this, q$i0, MethodHandles.lookup().unreflect(((Method)list0.get(0))));
            }
            catch(Throwable throwable0) {
                throw new RuntimeException("cannot initialize", throwable0);
            }
        }
    }

    static class f extends b {
        private final Method a;
        private final q b;

        private f() {
            super(null);
            this.a = this.b();
            this.b = q.a;
        }

        f(a c$a0) {
        }

        @Override  // javassist.util.proxy.c$b
        Class a(String s, byte[] arr_b, int v, int v1, Class class0, ClassLoader classLoader0, ProtectionDomain protectionDomain0) throws ClassFormatError, javassist.b {
            Class class1 = this.b.b();
            if(class1 != c.class && class1 != this.getClass()) {
                throw new IllegalAccessError("Access denied for caller.");
            }
            try {
                q.j(this.a, true);
                return (Class)this.a.invoke(classLoader0, s, arr_b, v, v1, protectionDomain0);
            }
            catch(Throwable throwable0) {
                if(throwable0 instanceof ClassFormatError) {
                    throw (ClassFormatError)throwable0;
                }
                if(throwable0 instanceof RuntimeException) {
                    throw (RuntimeException)throwable0;
                }
                throw new javassist.b(throwable0);
            }
        }

        private final Method b() {
            if(c.a != null && this.b.b() != this.getClass()) {
                throw new IllegalAccessError("Access denied for caller.");
            }
            try {
                return q.e(ClassLoader.class, "defineClass", new Class[]{String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class});
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new RuntimeException("cannot initialize", noSuchMethodException0);
            }
        }
    }

    private static final b a;

    static {
        f c$f0;
        int v = k.y;
        if(v > 54) {
            c$f0 = new javassist.util.proxy.c.c(null);
        }
        else if(v >= 53) {
            c$f0 = new e();
        }
        else if(v >= 51) {
            c$f0 = new d(null);
        }
        else {
            c$f0 = new f(null);
        }
        c.a = c$f0;
    }

    public static Class b(Class class0, byte[] arr_b) throws javassist.b {
        try {
            c.class.getModule().addReads(class0.getModule());
            return MethodHandles.privateLookupIn(class0, MethodHandles.lookup()).defineClass(arr_b);
        }
        catch(IllegalAccessException | IllegalArgumentException illegalAccessException0) {
            throw new javassist.b(illegalAccessException0.getMessage() + ": " + class0.getName() + " has no permission to define the class");
        }
    }

    public static Class c(String s, Class class0, ClassLoader classLoader0, ProtectionDomain protectionDomain0, byte[] arr_b) throws javassist.b {
        try {
            return c.a.a(s, arr_b, 0, arr_b.length, class0, classLoader0, protectionDomain0);
        }
        catch(RuntimeException runtimeException0) {
            throw runtimeException0;
        }
        catch(javassist.b b0) {
            throw b0;
        }
        catch(ClassFormatError classFormatError0) {
            Throwable throwable0 = classFormatError0.getCause();
            if(throwable0 != null) {
                classFormatError0 = throwable0;
            }
            throw new javassist.b(classFormatError0);
        }
        catch(Exception exception0) {
            throw new javassist.b(exception0);
        }
    }

    public static Class d(MethodHandles.Lookup methodHandles$Lookup0, byte[] arr_b) throws javassist.b {
        try {
            return methodHandles$Lookup0.defineClass(arr_b);
        }
        catch(IllegalAccessException | IllegalArgumentException illegalAccessException0) {
            throw new javassist.b(illegalAccessException0.getMessage());
        }
    }

    static Class e(String s, byte[] arr_b) throws javassist.b {
        try {
            return MethodHandles.lookup().dropLookupMode(2).defineClass(arr_b);
        }
        catch(Throwable throwable0) {
            throw new javassist.b(throwable0);
        }
    }
}

