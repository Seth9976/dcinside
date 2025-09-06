package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.annotation.k;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class h {
    public static final class a {
        public final Constructor a;
        private transient Annotation[] b;
        private transient Annotation[][] c;
        private int d;

        public a(Constructor constructor0) {
            this.d = -1;
            this.a = constructor0;
        }

        public Constructor a() {
            return this.a;
        }

        public Annotation[] b() {
            Annotation[] arr_annotation = this.b;
            if(arr_annotation == null) {
                arr_annotation = this.a.getDeclaredAnnotations();
                this.b = arr_annotation;
            }
            return arr_annotation;
        }

        public Class c() {
            return this.a.getDeclaringClass();
        }

        public int d() {
            int v = this.d;
            if(v < 0) {
                v = this.a.getParameterCount();
                this.d = v;
            }
            return v;
        }

        public Annotation[][] e() {
            Annotation[][] arr2_annotation = this.c;
            if(arr2_annotation == null) {
                arr2_annotation = this.a.getParameterAnnotations();
                this.c = arr2_annotation;
            }
            return arr2_annotation;
        }
    }

    static class b {
        private final Field a;
        private final Field b;
        private final String c;
        private final String d;
        static final b e;

        static {
            b.e = new b();
        }

        private b() {
            String s1;
            String s;
            Field field1;
            Class class0 = Class.class;
            super();
            Field field0 = null;
            try {
                field1 = b.d(EnumSet.class, "elementType", class0);
                s = null;
            }
            catch(Exception exception0) {
                s = exception0.toString();
                field1 = null;
            }
            try {
                this.a = field1;
                this.c = s;
                field0 = b.d(EnumMap.class, "keyType", class0);
                s1 = null;
            }
            catch(Exception exception1) {
                s1 = exception1.toString();
            }
            this.b = field0;
            this.d = s1;
        }

        public Class a(EnumMap enumMap0) {
            Field field0 = this.b;
            if(field0 == null) {
                throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + this.d);
            }
            return (Class)this.c(enumMap0, field0);
        }

        public Class b(EnumSet enumSet0) {
            Field field0 = this.a;
            if(field0 == null) {
                throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + this.c);
            }
            return (Class)this.c(enumSet0, field0);
        }

        private Object c(Object object0, Field field0) {
            try {
                return field0.get(object0);
            }
            catch(Exception exception0) {
                throw new IllegalArgumentException(exception0);
            }
        }

        private static Field d(Class class0, String s, Class class1) throws Exception {
            Field[] arr_field = class0.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(s.equals(field0.getName()) && field0.getType() == class1) {
                    field0.setAccessible(true);
                    return field0;
                }
            }
            throw new IllegalStateException(String.format("No field named \'%s\' in class \'%s\'", s, class0.getName()));
        }
    }

    private static final Class a;
    private static final Annotation[] b;
    private static final a[] c;
    private static final Iterator d;

    static {
        h.a = Object.class;
        h.b = new Annotation[0];
        h.c = new a[0];
        h.d = Collections.emptyIterator();
    }

    public static List A(m m0, Class class0, boolean z) {
        if(m0 != null && !m0.j(class0) && !m0.j(Object.class)) {
            List list0 = new ArrayList(8);
            h.b(m0, class0, list0, z);
            return list0;
        }
        return Collections.emptyList();
    }

    public static void A0(Throwable throwable0, String s) {
        h.t0(h.P(throwable0), s);
    }

    @Deprecated
    public static List B(Class class0, Class class1) {
        return h.C(class0, class1, new ArrayList(8));
    }

    public static void B0(Class class0, Object object0, String s) {
        if(object0.getClass() != class0) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method \'%s\'", object0.getClass().getName(), class0.getName(), s));
        }
    }

    @Deprecated
    public static List C(Class class0, Class class1, List list0) {
        h.a(class0, class1, list0, false);
        return list0;
    }

    public static Class C0(Class class0) {
        if(class0 == Integer.TYPE) {
            return Integer.class;
        }
        if(class0 == Long.TYPE) {
            return Long.class;
        }
        if(class0 == Boolean.TYPE) {
            return Boolean.class;
        }
        if(class0 == Double.TYPE) {
            return Double.class;
        }
        if(class0 == Float.TYPE) {
            return Float.class;
        }
        if(class0 == Byte.TYPE) {
            return Byte.class;
        }
        if(class0 == Short.TYPE) {
            return Short.class;
        }
        if(class0 != Character.TYPE) {
            throw new IllegalArgumentException("Class " + class0.getName() + " is not a primitive type");
        }
        return Character.class;
    }

    public static String D(Object object0) {
        if(object0 == null) {
            return "unknown";
        }
        return object0 instanceof Class ? h.l0(((Class)object0)) : h.l0(object0.getClass());
    }

    public static Method[] E(Class class0) {
        Class class1;
        try {
            return class0.getDeclaredMethods();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            ClassLoader classLoader0 = Thread.currentThread().getContextClassLoader();
            if(classLoader0 == null) {
                return h.c(class0, noClassDefFoundError0);
            }
            try {
                class1 = classLoader0.loadClass(class0.getName());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                noClassDefFoundError0.addSuppressed(classNotFoundException0);
                return h.c(class0, noClassDefFoundError0);
            }
            try {
                return class1.getDeclaredMethods();
            }
            catch(Exception exception1) {
                return h.c(class0, exception1);
            }
        }
        catch(Exception exception0) {
            return h.c(class0, exception0);
        }
    }

    public static a[] F(Class class0) {
        if(!class0.isInterface() && !h.f0(class0)) {
            Constructor[] arr_constructor = class0.getDeclaredConstructors();
            a[] arr_h$a = new a[arr_constructor.length];
            for(int v = 0; v < arr_constructor.length; ++v) {
                arr_h$a[v] = new a(arr_constructor[v]);
            }
            return arr_h$a;
        }
        return h.c;
    }

    @Deprecated
    public static Field[] G(Class class0) {
        return class0.getDeclaredFields();
    }

    @Deprecated
    public static Method[] H(Class class0) {
        return class0.getDeclaredMethods();
    }

    // 去混淆评级： 低(20)
    public static Class I(Class class0) {
        return h.f0(class0) ? null : class0.getDeclaringClass();
    }

    // 去混淆评级： 低(20)
    public static Class J(Class class0) {
        return h.f0(class0) ? null : class0.getEnclosingClass();
    }

    public static Type[] K(Class class0) {
        return class0.getGenericInterfaces();
    }

    public static Type L(Class class0) {
        return class0.getGenericSuperclass();
    }

    // 去混淆评级： 中等(170)
    public static int M() {
        return 0;
    }

    public static Class N(Class class0) {
        if(!Modifier.isStatic(class0.getModifiers())) {
            try {
                return h.S(class0) ? null : h.J(class0);
            }
            catch(SecurityException unused_ex) {
            }
        }
        return null;
    }

    @Deprecated
    public static String O(Class class0) {
        Package package0 = class0.getPackage();
        return package0 == null ? null : package0.getName();
    }

    public static Throwable P(Throwable throwable0) {
        while(throwable0.getCause() != null) {
            throwable0 = throwable0.getCause();
        }
        return throwable0;
    }

    public static String Q(m m0) {
        return m0 == null ? "[null]" : '`' + m0.w() + '`';
    }

    public static boolean R(Object object0, Class class0) {
        return object0 != null && object0.getClass() == class0;
    }

    public static boolean S(Class class0) {
        return !h.f0(class0) && class0.getEnclosingMethod() != null;
    }

    @Deprecated
    public static boolean T(Method method0) {
        if(Modifier.isStatic(method0.getModifiers())) {
            return false;
        }
        return method0.getParameterTypes().length == 0 ? Void.TYPE != method0.getReturnType() : false;
    }

    public static boolean U(Class class0) {
        return class0 == Void.class || class0 == Void.TYPE || class0 == k.class;
    }

    public static boolean V(Class class0) {
        if(class0.isArray()) {
            return true;
        }
        return Collection.class.isAssignableFrom(class0) ? true : Map.class.isAssignableFrom(class0);
    }

    public static boolean W(Class class0) {
        return (class0.getModifiers() & 0x600) == 0;
    }

    public static boolean X(Member member0) {
        return (member0.getModifiers() & 0x600) == 0;
    }

    public static boolean Y(Class class0) {
        return Enum.class.isAssignableFrom(class0);
    }

    public static boolean Z() {
        try {
            if(h.M() >= 17) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            n.c(throwable0);
            System.err.println("Failed to determine JDK major version, assuming pre-JDK-17; problem: " + throwable0);
        }
        return false;
    }

    private static void a(Class class0, Class class1, Collection collection0, boolean z) {
        if(class0 != class1 && class0 != null && class0 != Object.class) {
            if(z) {
                if(collection0.contains(class0)) {
                    return;
                }
                collection0.add(class0);
            }
            Class[] arr_class = h.d(class0);
            for(int v = 0; v < arr_class.length; ++v) {
                h.a(arr_class[v], class1, collection0, true);
            }
            h.a(class0.getSuperclass(), class1, collection0, true);
        }
    }

    public static boolean a0(Class class0) {
        String s = class0.getName();
        return s.startsWith("java.") || s.startsWith("javax.");
    }

    private static void b(m m0, Class class0, Collection collection0, boolean z) {
        if(m0 == null) {
            return;
        }
        Class class1 = m0.g();
        if(class1 != class0 && class1 != Object.class) {
            if(z) {
                if(collection0.contains(m0)) {
                    return;
                }
                collection0.add(m0);
            }
            for(Object object0: m0.M()) {
                h.b(((m)object0), class0, collection0, true);
            }
            h.b(m0.Q(), class0, collection0, true);
        }
    }

    public static boolean b0(Class class0) {
        return class0.getAnnotation(com.fasterxml.jackson.databind.annotation.b.class) != null;
    }

    private static Method[] c(Class class0, Throwable throwable0) throws IllegalArgumentException {
        throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", class0.getName(), throwable0.getClass().getName(), throwable0.getMessage()), throwable0);
    }

    public static boolean c0(Object object0) {
        return object0 == null || h.b0(object0.getClass());
    }

    private static Class[] d(Class class0) {
        return class0.getInterfaces();
    }

    public static String d0(Class class0, boolean z) {
        try {
            boolean z1 = Modifier.isStatic(class0.getModifiers());
            if(!z1 && h.S(class0)) {
                return "local/anonymous";
            }
            if(!z && !z1 && h.J(class0) != null) {
                return "non-static member class";
            }
        }
        catch(SecurityException | NullPointerException unused_ex) {
        }
        return null;
    }

    public static String e(String s) {
        return s == null ? "[null]" : '\'' + s + '\'';
    }

    public static boolean e0(Class class0) {
        return !Modifier.isStatic(class0.getModifiers()) && h.J(class0) != null;
    }

    public static String f(String s) {
        return s == null ? "[null]" : '`' + s + '`';
    }

    public static boolean f0(Class class0) {
        return class0 == h.a || class0.isPrimitive();
    }

    public static String g(Class class0) {
        if(class0.isAnnotation()) {
            return "annotation";
        }
        if(class0.isArray()) {
            return "array";
        }
        if(Enum.class.isAssignableFrom(class0)) {
            return "enum";
        }
        return class0.isPrimitive() ? "primitive" : null;
    }

    public static boolean g0(Class class0) {
        String s = class0.getName();
        return s.startsWith("net.sf.cglib.proxy.") || s.startsWith("org.hibernate.proxy.");
    }

    @Deprecated
    public static void h(Member member0) {
        h.i(member0, false);
    }

    public static boolean h0(Class class0) {
        Class class1 = class0.getSuperclass();
        return class1 != null && "com.android.tools.r8.RecordTag".equals(class1.getName());
    }

    public static void i(Member member0, boolean z) {
        AccessibleObject accessibleObject0 = (AccessibleObject)member0;
        try {
            Class class0 = member0.getDeclaringClass();
            if(!Modifier.isPublic(member0.getModifiers()) || !Modifier.isPublic(class0.getModifiers()) || z && !h.a0(class0)) {
                accessibleObject0.setAccessible(true);
                return;
            label_6:
                goto label_10;
            }
            return;
        }
        catch(SecurityException securityException0) {
        }
        catch(RuntimeException runtimeException0) {
            goto label_6;
        }
        if(!accessibleObject0.isAccessible()) {
            throw new IllegalArgumentException("Cannot access " + member0 + " (from class " + member0.getDeclaringClass().getName() + "; failed to set access: " + securityException0.getMessage());
        label_10:
            if("InaccessibleObjectException".equals(runtimeException0.getClass().getSimpleName())) {
                throw new IllegalArgumentException(String.format("Failed to call `setAccess()` on %s \'%s\' (of class %s) due to `%s`, problem: %s", member0.getClass().getSimpleName(), member0.getName(), h.l0(member0.getDeclaringClass()), runtimeException0.getClass().getName(), runtimeException0.getMessage()), runtimeException0);
            }
            throw runtimeException0;
        }
        return;
    }

    public static String i0(B b0) {
        return b0 == null ? "[null]" : h.e(b0.d());
    }

    public static String j(Object object0) {
        if(object0 == null) {
            return "[null]";
        }
        return object0 instanceof Class ? h.l0(((Class)object0)) : h.l0(object0.getClass());
    }

    public static String j0(String s) {
        return s == null ? "[null]" : h.e(s);
    }

    public static Class k(Object object0) {
        return object0 == null ? null : object0.getClass();
    }

    public static String k0(y y0) {
        return y0 == null ? "[null]" : h.e(y0.getName());
    }

    public static void l(com.fasterxml.jackson.core.k k0, Closeable closeable0, Exception exception0) throws IOException {
        if(k0 != null) {
            k0.d0(com.fasterxml.jackson.core.k.b.d);
            try {
                k0.close();
            }
            catch(Exception exception1) {
                exception0.addSuppressed(exception1);
            }
        }
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(Exception exception2) {
                exception0.addSuppressed(exception2);
            }
        }
        h.w0(exception0);
        h.x0(exception0);
        throw new RuntimeException(exception0);
    }

    public static String l0(Class class0) {
        if(class0 == null) {
            return "[null]";
        }
        int v = 0;
        while(class0.isArray()) {
            ++v;
            class0 = class0.getComponentType();
        }
        String s = class0.isPrimitive() ? class0.getSimpleName() : class0.getName();
        if(v > 0) {
            StringBuilder stringBuilder0 = new StringBuilder(s);
            do {
                stringBuilder0.append("[]");
                --v;
            }
            while(v > 0);
            s = stringBuilder0.toString();
        }
        return h.f(s);
    }

    public static void m(com.fasterxml.jackson.core.k k0, Exception exception0) throws IOException {
        k0.d0(com.fasterxml.jackson.core.k.b.d);
        try {
            k0.close();
        }
        catch(Exception exception1) {
            exception0.addSuppressed(exception1);
        }
        h.w0(exception0);
        h.x0(exception0);
        throw new RuntimeException(exception0);
    }

    public static Object m0(Object object0, Object object1) {
        return object0 == null ? object1 : object0;
    }

    public static Object n(Class class0, boolean z) throws IllegalArgumentException {
        Constructor constructor0 = h.s(class0, z);
        if(constructor0 != null) {
            try {
                return constructor0.newInstance(null);
            }
            catch(Exception exception0) {
                h.A0(exception0, "Failed to instantiate class " + class0.getName() + ", problem: " + exception0.getMessage());
                return null;
            }
        }
        throw new IllegalArgumentException("Class " + class0.getName() + " has no default (no arg) constructor");
    }

    public static String n0(String s) {
        return s == null ? "" : s;
    }

    public static Object o(Class class0) {
        if(class0 == Integer.TYPE) {
            return 0;
        }
        if(class0 == Long.TYPE) {
            return 0L;
        }
        if(class0 == Boolean.TYPE) {
            return false;
        }
        if(class0 == Double.TYPE) {
            return 0.0;
        }
        if(class0 == Float.TYPE) {
            return 0.0f;
        }
        if(class0 == Byte.TYPE) {
            return (byte)0;
        }
        if(class0 == Short.TYPE) {
            return (short)0;
        }
        if(class0 != Character.TYPE) {
            throw new IllegalArgumentException("Class " + class0.getName() + " is not a primitive type");
        }
        return Character.valueOf('\u0000');
    }

    public static String o0(Object object0) {
        return object0 == null ? null : object0.toString();
    }

    public static Iterator p() {
        return h.d;
    }

    public static Class p0(Class class0) {
        if(class0.isPrimitive()) {
            return class0;
        }
        if(class0 == Integer.class) {
            return Integer.TYPE;
        }
        if(class0 == Long.class) {
            return Long.TYPE;
        }
        if(class0 == Boolean.class) {
            return Boolean.TYPE;
        }
        if(class0 == Double.class) {
            return Double.TYPE;
        }
        if(class0 == Float.class) {
            return Float.TYPE;
        }
        if(class0 == Byte.class) {
            return Byte.TYPE;
        }
        if(class0 == Short.class) {
            return Short.TYPE;
        }
        return class0 == Character.class ? Character.TYPE : null;
    }

    public static String q(Throwable throwable0) {
        if(throwable0 instanceof f) {
            return ((f)throwable0).b();
        }
        return !(throwable0 instanceof InvocationTargetException) || throwable0.getCause() == null ? throwable0.getMessage() : throwable0.getCause().getMessage();
    }

    public static String q0(Object object0, String s) {
        return object0 == null ? s : String.format("\"%s\"", object0);
    }

    // 去混淆评级： 低(20)
    public static Annotation[] r(Class class0) {
        return h.f0(class0) ? h.b : class0.getDeclaredAnnotations();
    }

    public static Class r0(m m0) {
        return m0 == null ? null : m0.g();
    }

    public static Constructor s(Class class0, boolean z) throws IllegalArgumentException {
        try {
            Constructor constructor0 = class0.getDeclaredConstructor(null);
            if(z) {
                h.i(constructor0, true);
                return constructor0;
            }
            if(!Modifier.isPublic(constructor0.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + class0.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return constructor0;
        }
        catch(NoSuchMethodException unused_ex) {
            return null;
        }
        catch(Exception exception0) {
        }
        h.A0(exception0, "Failed to find default constructor of class " + class0.getName() + ", problem: " + exception0.getMessage());
        return null;
    }

    public static void s0(Throwable throwable0) {
        h.t0(throwable0, throwable0.getMessage());
    }

    public static Class t(Class class0) {
        return class0.getSuperclass() == Enum.class ? class0 : class0.getSuperclass();
    }

    public static void t0(Throwable throwable0, String s) {
        h.x0(throwable0);
        h.v0(throwable0);
        throw new IllegalArgumentException(s, throwable0);
    }

    public static Class u(Enum enum0) {
        return enum0.getDeclaringClass();
    }

    // 去混淆评级： 低(20)
    public static Object u0(com.fasterxml.jackson.databind.h h0, IOException iOException0) throws o {
        throw iOException0 instanceof o ? ((o)iOException0) : o.p(h0, iOException0.getMessage()).A(iOException0);
    }

    public static Class v(EnumMap enumMap0) {
        if(!enumMap0.isEmpty()) {
            Object object0 = enumMap0.keySet().iterator().next();
            return h.u(((Enum)object0));
        }
        return b.e.a(enumMap0);
    }

    public static Throwable v0(Throwable throwable0) {
        if(throwable0 instanceof Error) {
            throw (Error)throwable0;
        }
        return throwable0;
    }

    public static Class w(EnumSet enumSet0) {
        if(!enumSet0.isEmpty()) {
            Object object0 = enumSet0.iterator().next();
            return h.u(((Enum)object0));
        }
        return b.e.b(enumSet0);
    }

    public static Throwable w0(Throwable throwable0) throws IOException {
        if(throwable0 instanceof IOException) {
            throw (IOException)throwable0;
        }
        return throwable0;
    }

    public static Enum x(Class class0, Class class1) {
        Field[] arr_field = class0.getDeclaredFields();
        for(int v = 0; v < arr_field.length; ++v) {
            Field field0 = arr_field[v];
            if(field0.isEnumConstant() && field0.getAnnotation(class1) != null) {
                String s = field0.getName();
                Enum[] arr_enum = (Enum[])class0.getEnumConstants();
                for(int v1 = 0; v1 < arr_enum.length; ++v1) {
                    Enum enum0 = arr_enum[v1];
                    if(s.equals(enum0.name())) {
                        return enum0;
                    }
                }
            }
        }
        return null;
    }

    public static Throwable x0(Throwable throwable0) {
        if(throwable0 instanceof RuntimeException) {
            throw (RuntimeException)throwable0;
        }
        return throwable0;
    }

    public static List y(Class class0, Class class1, boolean z) {
        if(class0 != null && class0 != class1 && class0 != Object.class) {
            List list0 = new ArrayList(8);
            h.a(class0, class1, list0, z);
            return list0;
        }
        return Collections.emptyList();
    }

    public static Throwable y0(Throwable throwable0) throws IOException {
        return h.w0(h.P(throwable0));
    }

    public static List z(Class class0, Class class1, boolean z) {
        List list0 = new ArrayList(8);
        if(class0 != null && class0 != class1) {
            if(z) {
                list0.add(class0);
            }
            while(true) {
                class0 = class0.getSuperclass();
                if(class0 == null || class0 == class1) {
                    break;
                }
                list0.add(class0);
            }
        }
        return list0;
    }

    public static void z0(Throwable throwable0) {
        h.s0(h.P(throwable0));
    }
}

