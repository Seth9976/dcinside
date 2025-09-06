package javassist.util.proxy;

import j..util.Objects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javassist.bytecode.k;

class q extends SecurityManager {
    class i {
        final Class a;
        final Object b;
        final Map c;
        final q d;

        i(Class class0, Object object0) {
            this.c = new HashMap();
            this.a = class0;
            this.b = object0;
            Method[] arr_method = class0.getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                String s = method0.getName();
                if(this.c.containsKey(s)) {
                    String s2 = method0.getName();
                    if(((List)this.c.get(s2)).size() == 1) {
                        String s3 = method0.getName();
                        String s4 = method0.getName();
                        ArrayList arrayList0 = new ArrayList(((Collection)this.c.get(s4)));
                        this.c.put(s3, arrayList0);
                    }
                    String s5 = method0.getName();
                    ((List)this.c.get(s5)).add(method0);
                }
                else {
                    String s1 = method0.getName();
                    List list0 = Collections.singletonList(method0);
                    this.c.put(s1, list0);
                }
            }
        }

        public Object a(String s, Object[] arr_object) {
            try {
                return this.b(s, arr_object).invoke(this.b, arr_object);
            }
            catch(Throwable throwable0) {
                throwable0.printStackTrace();
                return null;
            }
        }

        private Method b(String s, Object[] arr_object) {
            return (Method)((List)this.c.get(s)).get(0);
        }
    }

    public static final q a;

    static {
        q.a = new q();
    }

    static void a(i q$i0) {
        try {
            if(k.y < 53) {
                return;
            }
            Class class0 = Class.forName("jdk.internal.module.IllegalAccessLogger");
            q$i0.a("putObjectVolatile", new Object[]{class0, q$i0.a("staticFieldOffset", new Object[]{class0.getDeclaredField("logger")}), null});
        }
        catch(Exception unused_ex) {
        }
    }

    public Class b() {
        return this.getClassContext()[2];
    }

    static Constructor c(Class class0, Class[] arr_class) throws NoSuchMethodException {
        class e implements PrivilegedExceptionAction {
            final Class a;
            final Class[] b;

            e(Class class0, Class[] arr_class) {
                this.b = arr_class;
                super();
            }

            public Constructor a() throws Exception {
                return this.a.getDeclaredConstructor(this.b);
            }

            @Override
            public Object run() throws Exception {
                return this.a();
            }
        }

        if(System.getSecurityManager() == null) {
            return class0.getDeclaredConstructor(arr_class);
        }
        try {
            return (Constructor)AccessController.doPrivileged(new e(class0, arr_class));
        }
        catch(PrivilegedActionException privilegedActionException0) {
            if(privilegedActionException0.getCause() instanceof NoSuchMethodException) {
                throw (NoSuchMethodException)privilegedActionException0.getCause();
            }
            throw new RuntimeException(privilegedActionException0.getCause());
        }
    }

    static Constructor[] d(Class class0) {
        class b implements PrivilegedAction {
            final Class a;

            b(Class class0) {
            }

            public Constructor[] a() {
                return this.a.getDeclaredConstructors();
            }

            @Override
            public Object run() {
                return this.a();
            }
        }

        return System.getSecurityManager() == null ? class0.getDeclaredConstructors() : ((Constructor[])AccessController.doPrivileged(new b(class0)));
    }

    static Method e(Class class0, String s, Class[] arr_class) throws NoSuchMethodException {
        class d implements PrivilegedExceptionAction {
            final Class a;
            final String b;
            final Class[] c;

            d(Class class0, String s, Class[] arr_class) {
                this.b = s;
                this.c = arr_class;
                super();
            }

            public Method a() throws Exception {
                return this.a.getDeclaredMethod(this.b, this.c);
            }

            @Override
            public Object run() throws Exception {
                return this.a();
            }
        }

        if(System.getSecurityManager() == null) {
            return class0.getDeclaredMethod(s, arr_class);
        }
        try {
            return (Method)AccessController.doPrivileged(new d(class0, s, arr_class));
        }
        catch(PrivilegedActionException privilegedActionException0) {
            if(privilegedActionException0.getCause() instanceof NoSuchMethodException) {
                throw (NoSuchMethodException)privilegedActionException0.getCause();
            }
            throw new RuntimeException(privilegedActionException0.getCause());
        }
    }

    static Method[] f(Class class0) {
        class a implements PrivilegedAction {
            final Class a;

            a(Class class0) {
            }

            public Method[] a() {
                return this.a.getDeclaredMethods();
            }

            @Override
            public Object run() {
                return this.a();
            }
        }

        return System.getSecurityManager() == null ? class0.getDeclaredMethods() : ((Method[])AccessController.doPrivileged(new a(class0)));
    }

    static MethodHandle g(Class class0, String s, Class[] arr_class) throws NoSuchMethodException {
        class c implements PrivilegedExceptionAction {
            final Class a;
            final String b;
            final Class[] c;

            c(Class class0, String s, Class[] arr_class) {
                this.b = s;
                this.c = arr_class;
                super();
            }

            public MethodHandle a() throws IllegalAccessException, NoSuchMethodException, SecurityException {
                Method method0 = this.a.getDeclaredMethod(this.b, this.c);
                method0.setAccessible(true);
                MethodHandle methodHandle0 = MethodHandles.lookup().unreflect(method0);
                method0.setAccessible(false);
                return methodHandle0;
            }

            @Override
            public Object run() throws Exception {
                return this.a();
            }
        }

        try {
            return p.a(AccessController.doPrivileged(new c(class0, s, arr_class)));
        }
        catch(PrivilegedActionException privilegedActionException0) {
            if(privilegedActionException0.getCause() instanceof NoSuchMethodException) {
                throw (NoSuchMethodException)privilegedActionException0.getCause();
            }
            throw new RuntimeException(privilegedActionException0.getCause());
        }
    }

    static i h() throws ClassNotFoundException {
        class h implements PrivilegedExceptionAction {
            h() {
                super();
            }

            public i a() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
                Class class0 = Class.forName("sun.misc.Unsafe");
                Field field0 = class0.getDeclaredField("theUnsafe");
                field0.setAccessible(true);
                Objects.requireNonNull(q.a);
                Object object0 = field0.get(null);
                i q$i0 = new i(q.a, class0, object0);
                field0.setAccessible(false);
                q.a(q$i0);
                return q$i0;
            }

            @Override
            public Object run() throws Exception {
                return this.a();
            }
        }

        try {
            return (i)AccessController.doPrivileged(new h());
        }
        catch(PrivilegedActionException privilegedActionException0) {
            if(privilegedActionException0.getCause() instanceof ClassNotFoundException) {
                throw (ClassNotFoundException)privilegedActionException0.getCause();
            }
            if(privilegedActionException0.getCause() instanceof NoSuchFieldException) {
                throw new ClassNotFoundException("No such instance.", privilegedActionException0.getCause());
            }
            if(!(!(privilegedActionException0.getCause() instanceof IllegalAccessException) && !(privilegedActionException0.getCause() instanceof SecurityException))) {
                throw new ClassNotFoundException("Security denied access.", privilegedActionException0.getCause());
            }
            throw new RuntimeException(privilegedActionException0.getCause());
        }
    }

    static void i(Field field0, Object object0, Object object1) throws IllegalAccessException {
        class g implements PrivilegedExceptionAction {
            final Field a;
            final Object b;
            final Object c;

            g(Field field0, Object object0, Object object1) {
                this.b = object0;
                this.c = object1;
                super();
            }

            public Void a() throws Exception {
                this.a.set(this.b, this.c);
                return null;
            }

            @Override
            public Object run() throws Exception {
                return this.a();
            }
        }

        if(System.getSecurityManager() == null) {
            field0.set(object0, object1);
            return;
        }
        try {
            AccessController.doPrivileged(new g(field0, object0, object1));
            return;
        }
        catch(PrivilegedActionException privilegedActionException0) {
            if(privilegedActionException0.getCause() instanceof NoSuchMethodException) {
                throw (IllegalAccessException)privilegedActionException0.getCause();
            }
            throw new RuntimeException(privilegedActionException0.getCause());
        }
    }

    static void j(AccessibleObject accessibleObject0, boolean z) {
        class f implements PrivilegedAction {
            final AccessibleObject a;
            final boolean b;

            f(AccessibleObject accessibleObject0, boolean z) {
                this.b = z;
                super();
            }

            public Void a() {
                this.a.setAccessible(this.b);
                return null;
            }

            @Override
            public Object run() {
                return this.a();
            }
        }

        if(System.getSecurityManager() == null) {
            accessibleObject0.setAccessible(z);
            return;
        }
        AccessController.doPrivileged(new f(accessibleObject0, z));
    }
}

