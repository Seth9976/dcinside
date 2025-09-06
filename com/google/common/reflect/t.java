package com.google.common.reflect;

import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.J;
import com.google.common.base.y;
import com.google.common.collect.O2;
import com.google.common.collect.Q2;
import com.google.common.collect.p3;
import com.google.common.collect.u5;
import j..util.Objects;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@d
final class t {
    static abstract enum b {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class a extends b {
            a(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.reflect.t$b
            @o3.a
            Class c(Class class0) {
                return class0.getEnclosingClass();
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class c extends b {
            c(String s, int v) {
                super(null);
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.common.reflect.t$b
            @o3.a
            Class c(Class class0) {
                return class0.isLocalClass() ? null : class0.getEnclosingClass();
            }
        }

        OWNED_BY_ENCLOSING_CLASS /* 警告！未生成枚举子类：com.google.common.reflect.t$b$a */,
        LOCAL_CLASS_HAS_NO_OWNER /* 警告！未生成枚举子类：com.google.common.reflect.t$b$c */;

        static final b c;

        static {
            new com.google.common.reflect.t.b.d();
            ParameterizedType parameterizedType0 = (ParameterizedType)com.google.common.reflect.t.b.d.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType0);
            b[] arr_t$b = b.values();
            for(int v = 0; v < arr_t$b.length; ++v) {
                b t$b0 = arr_t$b[v];
                if(t$b0.c(com.google.common.reflect.t.b.b.class) == parameterizedType0.getOwnerType()) {
                    b.c = t$b0;
                    return;
                }
            }
            throw new AssertionError();
        }

        private b() {
        }

        b(com.google.common.reflect.t.a t$a0) {
            this();
        }

        private static b[] a() [...] // Inlined contents

        private static b b() [...] // Inlined contents

        @o3.a
        abstract Class c(Class arg1);
    }

    static final class com.google.common.reflect.t.c implements Serializable, GenericArrayType {
        private final Type a;
        private static final long b;

        com.google.common.reflect.t.c(Type type0) {
            this.a = com.google.common.reflect.t.d.e.f(type0);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof GenericArrayType ? B.a(this.getGenericComponentType(), ((GenericArrayType)object0).getGenericComponentType()) : false;
        }

        @Override
        public Type getGenericComponentType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public String toString() {
            return t.s(this.a) + "[]";
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    static abstract class com.google.common.reflect.t.d extends Enum {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.reflect.t.d.a extends com.google.common.reflect.t.d {
            com.google.common.reflect.t.d.a(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.reflect.t$d
            Type c(Type type0) {
                return this.g(type0);
            }

            @Override  // com.google.common.reflect.t$d
            Type f(Type type0) {
                H.E(type0);
                return type0 instanceof Class && ((Class)type0).isArray() ? new com.google.common.reflect.t.c(((Class)type0).getComponentType()) : type0;
            }

            GenericArrayType g(Type type0) {
                return new com.google.common.reflect.t.c(type0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.reflect.t.d.b extends com.google.common.reflect.t.d {
            com.google.common.reflect.t.d.b(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.reflect.t$d
            Type c(Type type0) {
                return type0 instanceof Class ? t.h(((Class)type0)) : new com.google.common.reflect.t.c(type0);
            }

            @Override  // com.google.common.reflect.t$d
            Type f(Type type0) {
                return (Type)H.E(type0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.reflect.t.d.c extends com.google.common.reflect.t.d {
            com.google.common.reflect.t.d.c(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.reflect.t$d
            Type c(Type type0) {
                return com.google.common.reflect.t.d.b.c(type0);
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.common.reflect.t$d
            String d(Type type0) {
                return type0.getTypeName();
            }

            @Override  // com.google.common.reflect.t$d
            Type f(Type type0) {
                return com.google.common.reflect.t.d.b.f(type0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.reflect.t.d.d extends com.google.common.reflect.t.d {
            com.google.common.reflect.t.d.d(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.reflect.t$d
            boolean b() {
                return false;
            }

            @Override  // com.google.common.reflect.t$d
            Type c(Type type0) {
                return com.google.common.reflect.t.d.c.c(type0);
            }

            @Override  // com.google.common.reflect.t$d
            String d(Type type0) {
                return com.google.common.reflect.t.d.c.d(type0);
            }

            @Override  // com.google.common.reflect.t$d
            Type f(Type type0) {
                return com.google.common.reflect.t.d.c.f(type0);
            }
        }

        class e extends m {
            e() {
                super();
            }
        }

        class f extends m {
            f() {
                super();
            }
        }

        public static final enum com.google.common.reflect.t.d a;
        public static final enum com.google.common.reflect.t.d b;
        public static final enum com.google.common.reflect.t.d c;
        public static final enum com.google.common.reflect.t.d d;
        static final com.google.common.reflect.t.d e;
        private static final com.google.common.reflect.t.d[] f;

        static {
            com.google.common.reflect.t.d.a t$d$a0 = new com.google.common.reflect.t.d.a("JAVA6", 0);
            com.google.common.reflect.t.d.a = t$d$a0;
            com.google.common.reflect.t.d.b t$d$b0 = new com.google.common.reflect.t.d.b("JAVA7", 1);
            com.google.common.reflect.t.d.b = t$d$b0;
            com.google.common.reflect.t.d.c t$d$c0 = new com.google.common.reflect.t.d.c("JAVA8", 2);
            com.google.common.reflect.t.d.c = t$d$c0;
            com.google.common.reflect.t.d.d t$d$d0 = new com.google.common.reflect.t.d.d("JAVA9", 3);
            com.google.common.reflect.t.d.d = t$d$d0;
            com.google.common.reflect.t.d.f = new com.google.common.reflect.t.d[]{com.google.common.reflect.t.d.a, com.google.common.reflect.t.d.b, com.google.common.reflect.t.d.c, com.google.common.reflect.t.d.d};
            if(AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if(new e().a().toString().contains("java.util.Map.java.util.Map")) {
                    com.google.common.reflect.t.d.e = t$d$c0;
                    return;
                }
                com.google.common.reflect.t.d.e = t$d$d0;
                return;
            }
            if(new f().a() instanceof Class) {
                com.google.common.reflect.t.d.e = t$d$b0;
                return;
            }
            com.google.common.reflect.t.d.e = t$d$a0;
        }

        private com.google.common.reflect.t.d(String s, int v) {
            super(s, v);
        }

        com.google.common.reflect.t.d(String s, int v, com.google.common.reflect.t.a t$a0) {
            this(s, v);
        }

        private static com.google.common.reflect.t.d[] a() [...] // Inlined contents

        boolean b() {
            return true;
        }

        abstract Type c(Type arg1);

        String d(Type type0) {
            return t.s(type0);
        }

        final O2 e(Type[] arr_type) {
            com.google.common.collect.O2.a o2$a0 = O2.n();
            for(int v = 0; v < arr_type.length; ++v) {
                o2$a0.j(this.f(arr_type[v]));
            }
            return o2$a0.n();
        }

        abstract Type f(Type arg1);

        public static com.google.common.reflect.t.d valueOf(String s) {
            return (com.google.common.reflect.t.d)Enum.valueOf(com.google.common.reflect.t.d.class, s);
        }

        public static com.google.common.reflect.t.d[] values() {
            return (com.google.common.reflect.t.d[])com.google.common.reflect.t.d.f.clone();
        }
    }

    static final class com.google.common.reflect.t.e {
        static final boolean a;

        static {
            com.google.common.reflect.t.e.a = !com.google.common.reflect.t.e.class.getTypeParameters()[0].equals(t.k(com.google.common.reflect.t.e.class, "X", new Type[0]));
        }
    }

    static final class com.google.common.reflect.t.f implements Serializable, ParameterizedType {
        @o3.a
        private final Type a;
        private final O2 b;
        private final Class c;
        private static final long d;

        com.google.common.reflect.t.f(@o3.a Type type0, Class class0, Type[] arr_type) {
            H.E(class0);
            H.d(arr_type.length == class0.getTypeParameters().length);
            t.f(arr_type, "type parameter");
            this.a = type0;
            this.c = class0;
            this.b = com.google.common.reflect.t.d.e.e(arr_type);
        }

        // 去混淆评级： 低(40)
        @Override
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof ParameterizedType ? this.getRawType().equals(((ParameterizedType)object0).getRawType()) && B.a(this.getOwnerType(), ((ParameterizedType)object0).getOwnerType()) && Arrays.equals(this.getActualTypeArguments(), ((ParameterizedType)object0).getActualTypeArguments()) : false;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return t.r(this.b);
        }

        @Override
        @o3.a
        public Type getOwnerType() {
            return this.a;
        }

        @Override
        public Type getRawType() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return this.a == null ? this.b.hashCode() ^ this.c.hashCode() : this.a.hashCode() ^ this.b.hashCode() ^ this.c.hashCode();
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a != null) {
                com.google.common.reflect.t.d t$d0 = com.google.common.reflect.t.d.e;
                if(t$d0.b()) {
                    stringBuilder0.append(t$d0.d(this.a));
                    stringBuilder0.append('.');
                }
            }
            stringBuilder0.append(this.c.getName());
            stringBuilder0.append('<');
            Objects.requireNonNull(com.google.common.reflect.t.d.e);
            u u0 = new u(com.google.common.reflect.t.d.e);
            stringBuilder0.append(t.a.k(p3.T(this.b, u0)));
            stringBuilder0.append('>');
            return stringBuilder0.toString();
        }
    }

    static final class g {
        private final GenericDeclaration a;
        private final String b;
        private final O2 c;

        g(GenericDeclaration genericDeclaration0, String s, Type[] arr_type) {
            t.f(arr_type, "bound for type variable");
            this.a = (GenericDeclaration)H.E(genericDeclaration0);
            this.b = (String)H.E(s);
            this.c = O2.x(arr_type);
        }

        public Type[] a() {
            return t.r(this.c);
        }

        public GenericDeclaration b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public String d() {
            return this.b;
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(com.google.common.reflect.t.e.a) {
                if(object0 != null && Proxy.isProxyClass(object0.getClass()) && Proxy.getInvocationHandler(object0) instanceof h) {
                    g t$g0 = ((h)Proxy.getInvocationHandler(object0)).a;
                    return this.b.equals(t$g0.c()) && this.a.equals(t$g0.b()) && this.c.equals(t$g0.c);
                }
                return false;
            }
            if(object0 instanceof TypeVariable) {
                String s = ((TypeVariable)object0).getName();
                if(this.b.equals(s)) {
                    GenericDeclaration genericDeclaration0 = ((TypeVariable)object0).getGenericDeclaration();
                    return this.a.equals(genericDeclaration0);
                }
                return false;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override
        public String toString() {
            return this.b;
        }
    }

    static final class h implements InvocationHandler {
        private final g a;
        private static final Q2 b;

        static {
            com.google.common.collect.Q2.b q2$b0 = Q2.b();
            Class class0 = g.class;
            Method[] arr_method = class0.getMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                if(method0.getDeclaringClass().equals(class0)) {
                    try {
                        method0.setAccessible(true);
                    }
                    catch(AccessControlException unused_ex) {
                    }
                    q2$b0.i(method0.getName(), method0);
                }
            }
            h.b = q2$b0.c();
        }

        h(g t$g0) {
            this.a = t$g0;
        }

        @Override
        @o3.a
        public Object invoke(Object object0, Method method0, @o3.a Object[] arr_object) throws Throwable {
            String s = method0.getName();
            Method method1 = (Method)h.b.get(s);
            if(method1 != null) {
                try {
                    return method1.invoke(this.a, arr_object);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw invocationTargetException0.getCause();
                }
            }
            throw new UnsupportedOperationException(s);
        }
    }

    static final class i implements Serializable, WildcardType {
        private final O2 a;
        private final O2 b;
        private static final long c;

        i(Type[] arr_type, Type[] arr_type1) {
            t.f(arr_type, "lower bound for wildcard");
            t.f(arr_type1, "upper bound for wildcard");
            this.a = com.google.common.reflect.t.d.e.e(arr_type);
            this.b = com.google.common.reflect.t.d.e.e(arr_type1);
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 instanceof WildcardType) {
                List list0 = Arrays.asList(((WildcardType)object0).getLowerBounds());
                if(this.a.equals(list0)) {
                    List list1 = Arrays.asList(((WildcardType)object0).getUpperBounds());
                    return this.b.equals(list1);
                }
            }
            return false;
        }

        @Override
        public Type[] getLowerBounds() {
            return t.r(this.a);
        }

        @Override
        public Type[] getUpperBounds() {
            return t.r(this.b);
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("?");
            u5 u50 = this.a.i();
            while(u50.hasNext()) {
                Object object0 = u50.next();
                stringBuilder0.append(" super ");
                stringBuilder0.append(com.google.common.reflect.t.d.e.d(((Type)object0)));
            }
            for(Object object1: t.g(this.b)) {
                stringBuilder0.append(" extends ");
                stringBuilder0.append(com.google.common.reflect.t.d.e.d(((Type)object1)));
            }
            return stringBuilder0.toString();
        }
    }

    private static final y a;

    static {
        t.a = y.p(", ").s("null");
    }

    private static void f(Type[] arr_type, String s) {
        for(int v = 0; v < arr_type.length; ++v) {
            Type type0 = arr_type[v];
            if(type0 instanceof Class) {
                H.y(!((Class)type0).isPrimitive(), "Primitive type \'%s\' used as %s", ((Class)type0), s);
            }
        }
    }

    private static Iterable g(Iterable iterable0) {
        return p3.o(iterable0, J.q(J.m(Object.class)));
    }

    static Class h(Class class0) {
        return Array.newInstance(class0, 0).getClass();
    }

    @o3.a
    static Type i(Type type0) {
        class com.google.common.reflect.t.a extends s {
            final AtomicReference b;

            com.google.common.reflect.t.a(AtomicReference atomicReference0) {
            }

            @Override  // com.google.common.reflect.s
            void b(Class class0) {
                this.b.set(class0.getComponentType());
            }

            @Override  // com.google.common.reflect.s
            void c(GenericArrayType genericArrayType0) {
                Type type0 = genericArrayType0.getGenericComponentType();
                this.b.set(type0);
            }

            @Override  // com.google.common.reflect.s
            void e(TypeVariable typeVariable0) {
                Type type0 = t.p(typeVariable0.getBounds());
                this.b.set(type0);
            }

            @Override  // com.google.common.reflect.s
            void f(WildcardType wildcardType0) {
                Type type0 = t.p(wildcardType0.getUpperBounds());
                this.b.set(type0);
            }
        }

        H.E(type0);
        AtomicReference atomicReference0 = new AtomicReference();
        new com.google.common.reflect.t.a(atomicReference0).a(new Type[]{type0});
        return (Type)atomicReference0.get();
    }

    static Type j(Type type0) {
        if(type0 instanceof WildcardType) {
            Type[] arr_type = ((WildcardType)type0).getLowerBounds();
            boolean z = true;
            H.e(arr_type.length <= 1, "Wildcard cannot have more than one lower bounds.");
            if(arr_type.length == 1) {
                return t.q(t.j(arr_type[0]));
            }
            Type[] arr_type1 = ((WildcardType)type0).getUpperBounds();
            if(arr_type1.length != 1) {
                z = false;
            }
            H.e(z, "Wildcard should have only one upper bound.");
            return t.o(t.j(arr_type1[0]));
        }
        return com.google.common.reflect.t.d.e.c(type0);
    }

    static TypeVariable k(GenericDeclaration genericDeclaration0, String s, Type[] arr_type) {
        if(arr_type.length == 0) {
            arr_type = new Type[]{Object.class};
        }
        return t.n(genericDeclaration0, s, arr_type);
    }

    static ParameterizedType l(Class class0, Type[] arr_type) {
        return new com.google.common.reflect.t.f(b.c.c(class0), class0, arr_type);
    }

    static ParameterizedType m(@o3.a Type type0, Class class0, Type[] arr_type) {
        if(type0 == null) {
            return t.l(class0, arr_type);
        }
        H.E(arr_type);
        H.u(class0.getEnclosingClass() != null, "Owner type for unenclosed %s", class0);
        return new com.google.common.reflect.t.f(type0, class0, arr_type);
    }

    private static TypeVariable n(GenericDeclaration genericDeclaration0, String s, Type[] arr_type) {
        h t$h0 = new h(new g(genericDeclaration0, s, arr_type));
        return (TypeVariable)l.d(TypeVariable.class, t$h0);
    }

    @J1.e
    static WildcardType o(Type type0) {
        return new i(new Type[0], new Type[]{type0});
    }

    @o3.a
    private static Type p(Type[] arr_type) {
        for(int v = 0; v < arr_type.length; ++v) {
            Type type0 = t.i(arr_type[v]);
            if(type0 != null) {
                return type0 instanceof Class && ((Class)type0).isPrimitive() ? ((Class)type0) : t.o(type0);
            }
        }
        return null;
    }

    @J1.e
    static WildcardType q(Type type0) {
        return new i(new Type[]{type0}, new Type[]{Object.class});
    }

    private static Type[] r(Collection collection0) {
        return (Type[])collection0.toArray(new Type[0]);
    }

    // 去混淆评级： 低(20)
    static String s(Type type0) {
        return type0 instanceof Class ? ((Class)type0).getName() : type0.toString();
    }
}

