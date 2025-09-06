package com.google.common.reflect;

import com.google.common.base.H;
import com.google.common.base.I;
import com.google.common.base.y;
import com.google.common.collect.D3;
import com.google.common.collect.O2;
import com.google.common.collect.Q2;
import com.google.common.collect.V1;
import com.google.common.collect.a3;
import com.google.common.collect.c4;
import com.google.common.collect.r2;
import com.google.common.collect.u5;
import j..util.Objects;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o3.a;

@d
public abstract class q extends m implements Serializable {
    static class e {
        private final Type[] a;
        private final boolean b;

        e(Type[] arr_type, boolean z) {
            this.a = arr_type;
            this.b = z;
        }

        boolean a(Type type0) {
            Type[] arr_type = this.a;
            for(int v = 0; v < arr_type.length; ++v) {
                boolean z = q.V(arr_type[v]).L(type0);
                boolean z1 = this.b;
                if(z == z1) {
                    return z1;
                }
            }
            return !this.b;
        }

        boolean b(Type type0) {
            q q0 = q.V(type0);
            Type[] arr_type = this.a;
            for(int v = 0; v < arr_type.length; ++v) {
                boolean z = q0.L(arr_type[v]);
                boolean z1 = this.b;
                if(z == z1) {
                    return z1;
                }
            }
            return !this.b;
        }
    }

    final class f extends k {
        @a
        private transient a3 d;
        final q e;
        private static final long f;

        private f() {
        }

        f(com.google.common.reflect.q.a q$a0) {
        }

        private Object A0() {
            return q.this.F().w0();
        }

        @Override  // com.google.common.reflect.q$k
        protected Object K() {
            return this.s0();
        }

        @Override  // com.google.common.reflect.q$k
        protected Collection M() {
            return this.s0();
        }

        @Override  // com.google.common.reflect.q$k
        protected Set s0() {
            a3 a30 = this.d;
            if(a30 == null) {
                a30 = V1.u(i.a.a().d(q.this)).o(j.a).J();
                this.d = a30;
            }
            return a30;
        }

        @Override  // com.google.common.reflect.q$k
        public k w0() {
            return this;
        }

        @Override  // com.google.common.reflect.q$k
        public k y0() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override  // com.google.common.reflect.q$k
        public Set z0() {
            return a3.u(i.b.a().c(q.this.z()));
        }
    }

    final class g extends k {
        private final transient k d;
        @a
        private transient a3 e;
        final q f;
        private static final long g;

        g(k q$k0) {
            this.d = q$k0;
        }

        private Object A0() {
            return q.this.F().y0();
        }

        @Override  // com.google.common.reflect.q$k
        protected Object K() {
            return this.s0();
        }

        @Override  // com.google.common.reflect.q$k
        protected Collection M() {
            return this.s0();
        }

        @Override  // com.google.common.reflect.q$k
        protected Set s0() {
            a3 a30 = this.e;
            if(a30 == null) {
                a30 = V1.u(this.d).o(j.b).J();
                this.e = a30;
            }
            return a30;
        }

        @Override  // com.google.common.reflect.q$k
        public k w0() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override  // com.google.common.reflect.q$k
        public k y0() {
            return this;
        }

        @Override  // com.google.common.reflect.q$k
        public Set z0() {
            a3 a30 = q.this.z();
            return V1.u(i.b.c(a30)).o(new r()).J();
        }
    }

    static final class h extends q {
        private static final long e;

        h(Type type0) {
            super(type0, null);
        }
    }

    static abstract class i {
        class com.google.common.reflect.q.i.a extends i {
            com.google.common.reflect.q.i.a() {
                super(null);
            }

            @Override  // com.google.common.reflect.q$i
            Iterable e(Object object0) {
                return this.i(((q)object0));
            }

            @Override  // com.google.common.reflect.q$i
            Class f(Object object0) {
                return this.j(((q)object0));
            }

            @Override  // com.google.common.reflect.q$i
            @a
            Object g(Object object0) {
                return this.k(((q)object0));
            }

            Iterable i(q q0) {
                return q0.s();
            }

            Class j(q q0) {
                return q0.y();
            }

            @a
            q k(q q0) {
                return q0.u();
            }
        }

        class b extends i {
            b() {
                super(null);
            }

            @Override  // com.google.common.reflect.q$i
            Iterable e(Object object0) {
                return this.i(((Class)object0));
            }

            @Override  // com.google.common.reflect.q$i
            Class f(Object object0) {
                return this.j(((Class)object0));
            }

            @Override  // com.google.common.reflect.q$i
            @a
            Object g(Object object0) {
                return this.k(((Class)object0));
            }

            Iterable i(Class class0) {
                return Arrays.asList(class0.getInterfaces());
            }

            Class j(Class class0) {
                return class0;
            }

            @a
            Class k(Class class0) {
                return class0.getSuperclass();
            }
        }

        static class com.google.common.reflect.q.i.e extends i {
            private final i c;

            com.google.common.reflect.q.i.e(i q$i0) {
                super(null);
                this.c = q$i0;
            }

            @Override  // com.google.common.reflect.q$i
            Iterable e(Object object0) {
                return this.c.e(object0);
            }

            @Override  // com.google.common.reflect.q$i
            Class f(Object object0) {
                return this.c.f(object0);
            }

            @Override  // com.google.common.reflect.q$i
            @a
            Object g(Object object0) {
                return this.c.g(object0);
            }
        }

        static final i a;
        static final i b;

        static {
            i.a = new com.google.common.reflect.q.i.a();
            i.b = new b();
        }

        private i() {
        }

        i(com.google.common.reflect.q.a q$a0) {
        }

        final i a() {
            class c extends com.google.common.reflect.q.i.e {
                c(i q$i1) {
                    super(q$i1);
                }

                @Override  // com.google.common.reflect.q$i
                O2 c(Iterable iterable0) {
                    com.google.common.collect.O2.a o2$a0 = O2.n();
                    for(Object object0: iterable0) {
                        if(!this.f(object0).isInterface()) {
                            o2$a0.j(object0);
                        }
                    }
                    return super.c(o2$a0.n());
                }

                @Override  // com.google.common.reflect.q$i$e
                Iterable e(Object object0) {
                    return a3.B();
                }
            }

            return new c(this, this);
        }

        @O1.a
        private int b(Object object0, Map map0) {
            Integer integer0 = (Integer)map0.get(object0);
            if(integer0 != null) {
                return (int)integer0;
            }
            int v = this.f(object0).isInterface();
            for(Object object1: this.e(object0)) {
                v = Math.max(v, this.b(object1, map0));
            }
            Object object2 = this.g(object0);
            if(object2 != null) {
                v = Math.max(v, this.b(object2, map0));
            }
            map0.put(object0, ((int)(v + 1)));
            return v + 1;
        }

        O2 c(Iterable iterable0) {
            HashMap hashMap0 = D3.Y();
            for(Object object0: iterable0) {
                this.b(object0, hashMap0);
            }
            return i.h(hashMap0, c4.K().P());
        }

        final O2 d(Object object0) {
            return this.c(O2.B(object0));
        }

        abstract Iterable e(Object arg1);

        abstract Class f(Object arg1);

        @a
        abstract Object g(Object arg1);

        private static O2 h(Map map0, Comparator comparator0) {
            class com.google.common.reflect.q.i.d extends c4 {
                final Comparator c;
                final Map d;

                com.google.common.reflect.q.i.d(Comparator comparator0, Map map0) {
                    this.d = map0;
                    super();
                }

                @Override  // com.google.common.collect.c4
                public int compare(Object object0, Object object1) {
                    Object object2 = this.d.get(object0);
                    Objects.requireNonNull(object2);
                    Object object3 = this.d.get(object1);
                    Objects.requireNonNull(object3);
                    return this.c.compare(object2, object3);
                }
            }

            return new com.google.common.reflect.q.i.d(comparator0, map0).w(map0.keySet());
        }
    }

    static abstract enum j implements I {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.reflect.q.j.a extends j {
            com.google.common.reflect.q.j.a(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.base.I
            public boolean apply(Object object0) {
                return this.b(((q)object0));
            }

            // 去混淆评级： 低(20)
            public boolean b(q q0) {
                return !(q0.a instanceof TypeVariable) && !(q0.a instanceof WildcardType);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.reflect.q.j.b extends j {
            com.google.common.reflect.q.j.b(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.base.I
            public boolean apply(Object object0) {
                return this.b(((q)object0));
            }

            public boolean b(q q0) {
                return q0.y().isInterface();
            }
        }

        IGNORE_TYPE_VARIABLE_OR_WILDCARD /* 警告！未生成枚举子类：com.google.common.reflect.q$j$a */,
        INTERFACE_ONLY /* 警告！未生成枚举子类：com.google.common.reflect.q$j$b */;

        private j() {
        }

        j(com.google.common.reflect.q.a q$a0) {
            this();
        }

        private static j[] a() [...] // Inlined contents
    }

    public class k extends r2 implements Serializable {
        @a
        private transient a3 a;
        final q b;
        private static final long c;

        @Override  // com.google.common.collect.r2
        protected Object K() {
            return this.s0();
        }

        @Override  // com.google.common.collect.r2
        protected Collection M() {
            return this.s0();
        }

        @Override  // com.google.common.collect.r2
        protected Set s0() {
            a3 a30 = this.a;
            if(a30 == null) {
                a30 = V1.u(i.a.d(q.this)).o(j.a).J();
                this.a = a30;
            }
            return a30;
        }

        public k w0() {
            return new f(q.this, null);
        }

        public k y0() {
            return new g(q.this, this);
        }

        public Set z0() {
            a3 a30 = q.this.z();
            return a3.u(i.b.c(a30));
        }
    }

    private final Type a;
    @P1.b
    @a
    private transient o b;
    @P1.b
    @a
    private transient o c;
    private static final long d = 0x327B23B1BEFE387CL;

    protected q() {
        Type type0 = this.a();
        this.a = type0;
        H.x0(!(type0 instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", type0);
    }

    protected q(Class class0) {
        Type type0 = super.a();
        if(type0 instanceof Class) {
            this.a = type0;
            return;
        }
        this.a = o.d(class0).j(type0);
    }

    private q(Type type0) {
        this.a = (Type)H.E(type0);
    }

    q(Type type0, com.google.common.reflect.q.a q$a0) {
        this(type0);
    }

    public final q A(Class class0) {
        H.u(!(this.a instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type0 = this.a;
        if(type0 instanceof WildcardType) {
            return this.B(class0, ((WildcardType)type0).getLowerBounds());
        }
        if(this.H()) {
            return this.o(class0);
        }
        H.y(this.y().isAssignableFrom(class0), "%s isn\'t a subclass of %s", class0, this);
        q q0 = q.V(this.Z(class0));
        H.y(q0.K(this), "%s does not appear to be a subtype of %s", q0, this);
        return q0;
    }

    private q B(Class class0, Type[] arr_type) {
        if(arr_type.length <= 0) {
            throw new IllegalArgumentException(class0 + " isn\'t a subclass of " + this);
        }
        return q.V(arr_type[0]).A(class0);
    }

    public final q C(Class class0) {
        H.y(this.a0(class0), "%s is not a super class of %s", class0, this);
        Type type0 = this.a;
        if(type0 instanceof TypeVariable) {
            return this.D(class0, ((TypeVariable)type0).getBounds());
        }
        if(type0 instanceof WildcardType) {
            return this.D(class0, ((WildcardType)type0).getUpperBounds());
        }
        return class0.isArray() ? this.p(class0) : this.X(q.b0(class0).a);
    }

    private q D(Class class0, Type[] arr_type) {
        for(int v = 0; v < arr_type.length; ++v) {
            q q0 = q.V(arr_type[v]);
            if(q0.L(class0)) {
                return q0.C(class0);
            }
        }
        throw new IllegalArgumentException(class0 + " isn\'t a super type of " + this);
    }

    public final Type E() {
        return this.a;
    }

    public final k F() {
        return new k(this);
    }

    private boolean G(Type type0, TypeVariable typeVariable0) {
        if(this.a.equals(type0)) {
            return true;
        }
        if(type0 instanceof WildcardType) {
            WildcardType wildcardType0 = q.j(typeVariable0, ((WildcardType)type0));
            return q.n(wildcardType0.getUpperBounds()).b(this.a) && q.n(wildcardType0.getLowerBounds()).a(this.a);
        }
        return q.l(this.a).equals(q.l(type0));
    }

    public final boolean H() {
        return this.q() != null;
    }

    private boolean I(Type type0) {
        for(Object object0: this.F()) {
            Type type1 = ((q)object0).x();
            if(type1 != null && q.V(type1).L(type0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public final boolean J() {
        return this.a instanceof Class && ((Class)this.a).isPrimitive();
    }

    public final boolean K(q q0) {
        return this.L(q0.E());
    }

    public final boolean L(Type type0) {
        H.E(type0);
        if(type0 instanceof WildcardType) {
            return q.f(((WildcardType)type0).getLowerBounds()).b(this.a);
        }
        Type type1 = this.a;
        if(type1 instanceof WildcardType) {
            return q.f(((WildcardType)type1).getUpperBounds()).a(type0);
        }
        if(type1 instanceof TypeVariable) {
            return type1.equals(type0) || q.f(((TypeVariable)this.a).getBounds()).a(type0);
        }
        if(type1 instanceof GenericArrayType) {
            return q.V(type0).Q(((GenericArrayType)this.a));
        }
        if(type0 instanceof Class) {
            return this.a0(((Class)type0));
        }
        if(type0 instanceof ParameterizedType) {
            return this.N(((ParameterizedType)type0));
        }
        return type0 instanceof GenericArrayType ? this.M(((GenericArrayType)type0)) : false;
    }

    private boolean M(GenericArrayType genericArrayType0) {
        Type type0 = this.a;
        if(type0 instanceof Class) {
            return ((Class)type0).isArray() ? q.U(((Class)type0).getComponentType()).L(genericArrayType0.getGenericComponentType()) : false;
        }
        return type0 instanceof GenericArrayType ? q.V(((GenericArrayType)type0).getGenericComponentType()).L(genericArrayType0.getGenericComponentType()) : false;
    }

    private boolean N(ParameterizedType parameterizedType0) {
        Class class0 = q.V(parameterizedType0).y();
        if(!this.a0(class0)) {
            return false;
        }
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        Type[] arr_type = parameterizedType0.getActualTypeArguments();
        for(int v = 0; v < arr_typeVariable.length; ++v) {
            if(!q.V(this.r().j(arr_typeVariable[v])).G(arr_type[v], arr_typeVariable[v])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class)parameterizedType0.getRawType()).getModifiers()) || parameterizedType0.getOwnerType() == null || this.I(parameterizedType0.getOwnerType());
    }

    public final boolean O(q q0) {
        return q0.L(this.E());
    }

    public final boolean P(Type type0) {
        return q.V(type0).L(this.E());
    }

    private boolean Q(GenericArrayType genericArrayType0) {
        Type type0 = this.a;
        if(type0 instanceof Class) {
            return ((Class)type0).isArray() ? q.V(genericArrayType0.getGenericComponentType()).L(((Class)type0).getComponentType()) : ((Class)type0).isAssignableFrom(Object[].class);
        }
        return type0 instanceof GenericArrayType ? q.V(genericArrayType0.getGenericComponentType()).L(((GenericArrayType)this.a).getGenericComponentType()) : false;
    }

    private boolean R() {
        return com.google.common.primitives.q.c().contains(this.a);
    }

    public final com.google.common.reflect.g S(Method method0) {
        class com.google.common.reflect.q.a extends com.google.common.reflect.g.b {
            final q e;

            com.google.common.reflect.q.a(Method method0) {
                super(method0);
            }

            @Override  // com.google.common.reflect.g$b
            Type[] d() {
                return q.this.r().l(super.d());
            }

            @Override  // com.google.common.reflect.g$b
            Type[] e() {
                return q.this.w().l(super.e());
            }

            @Override  // com.google.common.reflect.g$b
            Type f() {
                return q.this.r().j(super.f());
            }

            @Override  // com.google.common.reflect.g
            public q g() {
                return q.this;
            }

            @Override  // com.google.common.reflect.g
            public String toString() {
                return this.g() + "." + super.toString();
            }
        }

        H.y(this.a0(method0.getDeclaringClass()), "%s not declared by %s", method0, this);
        return new com.google.common.reflect.q.a(this, method0);
    }

    private static Type T(Type type0) {
        return com.google.common.reflect.t.d.b.c(type0);
    }

    public static q U(Class class0) {
        return new h(class0);
    }

    public static q V(Type type0) {
        return new h(type0);
    }

    @O1.a
    final q W() {
        class com.google.common.reflect.q.c extends s {
            final q b;

            @Override  // com.google.common.reflect.s
            void c(GenericArrayType genericArrayType0) {
                this.a(new Type[]{genericArrayType0.getGenericComponentType()});
            }

            @Override  // com.google.common.reflect.s
            void d(ParameterizedType parameterizedType0) {
                this.a(parameterizedType0.getActualTypeArguments());
                this.a(new Type[]{parameterizedType0.getOwnerType()});
            }

            @Override  // com.google.common.reflect.s
            void e(TypeVariable typeVariable0) {
                throw new IllegalArgumentException(q.this.a + "contains a type variable and is not safe for the operation");
            }

            @Override  // com.google.common.reflect.s
            void f(WildcardType wildcardType0) {
                this.a(wildcardType0.getLowerBounds());
                this.a(wildcardType0.getUpperBounds());
            }
        }

        new com.google.common.reflect.q.c(this).a(new Type[]{this.a});
        return this;
    }

    private q X(Type type0) {
        q q0 = q.V(this.r().j(type0));
        q0.c = this.c;
        q0.b = this.b;
        return q0;
    }

    public final q Y(Type type0) {
        H.E(type0);
        return q.V(this.w().j(type0));
    }

    private Type Z(Class class0) {
        if(this.a instanceof Class && (class0.getTypeParameters().length == 0 || this.y().getTypeParameters().length != 0)) {
            return class0;
        }
        q q0 = q.b0(class0);
        q q1 = q0.C(this.y());
        return new o().n(q1.a, this.a).j(q0.a);
    }

    private boolean a0(Class class0) {
        u5 u50 = this.z().i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            if(class0.isAssignableFrom(((Class)object0))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @J1.e
    static q b0(Class class0) {
        if(class0.isArray()) {
            return q.V(t.j(q.b0(class0.getComponentType()).a));
        }
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        Type type0 = !class0.isMemberClass() || Modifier.isStatic(class0.getModifiers()) ? null : q.b0(class0.getEnclosingClass()).a;
        return arr_typeVariable.length > 0 || type0 != null && type0 != class0.getEnclosingClass() ? q.V(t.m(type0, class0, arr_typeVariable)) : q.U(class0);
    }

    // 去混淆评级： 低(20)
    public final q c0() {
        return this.R() ? q.U(com.google.common.primitives.q.e(((Class)this.a))) : this;
    }

    public final q e0(n n0, q q0) {
        return new h(new o().o(Q2.w(new com.google.common.reflect.o.d(n0.a), q0.a)).j(this.a));
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@a Object object0) {
        return object0 instanceof q ? this.a.equals(((q)object0).a) : false;
    }

    private static e f(Type[] arr_type) {
        return new e(arr_type, true);
    }

    public final q f0(n n0, Class class0) {
        return this.e0(n0, q.U(class0));
    }

    @a
    private q g(Type type0) {
        q q0 = q.V(type0);
        return q0.y().isInterface() ? null : q0;
    }

    // 去混淆评级： 低(20)
    public final q g0() {
        return this.J() ? q.U(com.google.common.primitives.q.f(((Class)this.a))) : this;
    }

    private O2 h(Type[] arr_type) {
        com.google.common.collect.O2.a o2$a0 = O2.n();
        for(int v = 0; v < arr_type.length; ++v) {
            q q0 = q.V(arr_type[v]);
            if(q0.y().isInterface()) {
                o2$a0.j(q0);
            }
        }
        return o2$a0.n();
    }

    protected Object h0() {
        return q.V(new o().j(this.a));
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    private static Type i(TypeVariable typeVariable0, Type type0) {
        return type0 instanceof WildcardType ? q.j(typeVariable0, ((WildcardType)type0)) : q.l(type0);
    }

    private static WildcardType j(TypeVariable typeVariable0, WildcardType wildcardType0) {
        Type[] arr_type = typeVariable0.getBounds();
        ArrayList arrayList0 = new ArrayList();
        Type[] arr_type1 = wildcardType0.getUpperBounds();
        for(int v = 0; v < arr_type1.length; ++v) {
            Type type0 = arr_type1[v];
            if(!q.f(arr_type).a(type0)) {
                arrayList0.add(q.l(type0));
            }
        }
        return new com.google.common.reflect.t.i(wildcardType0.getLowerBounds(), ((Type[])arrayList0.toArray(new Type[0])));
    }

    private static ParameterizedType k(ParameterizedType parameterizedType0) {
        Class class0 = (Class)parameterizedType0.getRawType();
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        Type[] arr_type = parameterizedType0.getActualTypeArguments();
        for(int v = 0; v < arr_type.length; ++v) {
            arr_type[v] = q.i(arr_typeVariable[v], arr_type[v]);
        }
        return t.m(parameterizedType0.getOwnerType(), class0, arr_type);
    }

    private static Type l(Type type0) {
        if(type0 instanceof ParameterizedType) {
            return q.k(((ParameterizedType)type0));
        }
        return type0 instanceof GenericArrayType ? t.j(q.l(((GenericArrayType)type0).getGenericComponentType())) : type0;
    }

    public final com.google.common.reflect.g m(Constructor constructor0) {
        class com.google.common.reflect.q.b extends com.google.common.reflect.g.a {
            final q e;

            com.google.common.reflect.q.b(Constructor constructor0) {
                super(constructor0);
            }

            @Override  // com.google.common.reflect.g$a
            Type[] d() {
                return q.this.r().l(super.d());
            }

            @Override  // com.google.common.reflect.g$a
            Type[] e() {
                return q.this.w().l(super.e());
            }

            @Override  // com.google.common.reflect.g$a
            Type f() {
                return q.this.r().j(super.f());
            }

            @Override  // com.google.common.reflect.g
            public q g() {
                return q.this;
            }

            @Override  // com.google.common.reflect.g
            public String toString() {
                return this.g() + "(" + y.p(", ").n(this.e()) + ")";
            }
        }

        H.y(constructor0.getDeclaringClass() == this.y(), "%s not declared by %s", constructor0, this.y());
        return new com.google.common.reflect.q.b(this, constructor0);
    }

    private static e n(Type[] arr_type) {
        return new e(arr_type, false);
    }

    private q o(Class class0) {
        Class class1 = class0.getComponentType();
        if(class1 == null) {
            throw new IllegalArgumentException(class0 + " does not appear to be a subtype of " + this);
        }
        q q0 = this.q();
        Objects.requireNonNull(q0);
        return q.V(q.T(q0.A(class1).a));
    }

    private q p(Class class0) {
        q q0 = this.q();
        if(q0 == null) {
            throw new IllegalArgumentException(class0 + " isn\'t a super type of " + this);
        }
        Class class1 = class0.getComponentType();
        Objects.requireNonNull(class1);
        return q.V(q.T(q0.C(class1).a));
    }

    @a
    public final q q() {
        Type type0 = t.i(this.a);
        return type0 == null ? null : q.V(type0);
    }

    private o r() {
        o o0 = this.c;
        if(o0 == null) {
            o0 = o.d(this.a);
            this.c = o0;
        }
        return o0;
    }

    final O2 s() {
        Type type0 = this.a;
        if(type0 instanceof TypeVariable) {
            return this.h(((TypeVariable)type0).getBounds());
        }
        if(type0 instanceof WildcardType) {
            return this.h(((WildcardType)type0).getUpperBounds());
        }
        com.google.common.collect.O2.a o2$a0 = O2.n();
        Type[] arr_type = this.y().getGenericInterfaces();
        for(int v = 0; v < arr_type.length; ++v) {
            o2$a0.j(this.X(arr_type[v]));
        }
        return o2$a0.n();
    }

    @Override
    public String toString() {
        return t.s(this.a);
    }

    @a
    final q u() {
        Type type0 = this.a;
        if(type0 instanceof TypeVariable) {
            return this.g(((TypeVariable)type0).getBounds()[0]);
        }
        if(type0 instanceof WildcardType) {
            return this.g(((WildcardType)type0).getUpperBounds()[0]);
        }
        Type type1 = this.y().getGenericSuperclass();
        return type1 == null ? null : this.X(type1);
    }

    private o w() {
        o o0 = this.b;
        if(o0 == null) {
            o0 = o.f(this.a);
            this.b = o0;
        }
        return o0;
    }

    @a
    private Type x() {
        Type type0 = this.a;
        if(type0 instanceof ParameterizedType) {
            return ((ParameterizedType)type0).getOwnerType();
        }
        return type0 instanceof Class ? ((Class)type0).getEnclosingClass() : null;
    }

    public final Class y() {
        return this.z().i().next();
    }

    private a3 z() {
        class com.google.common.reflect.q.d extends s {
            final com.google.common.collect.a3.a b;

            com.google.common.reflect.q.d(com.google.common.collect.a3.a a3$a0) {
                this.b = a3$a0;
                super();
            }

            @Override  // com.google.common.reflect.s
            void b(Class class0) {
                this.b.j(class0);
            }

            @Override  // com.google.common.reflect.s
            void c(GenericArrayType genericArrayType0) {
                Class class0 = t.h(q.V(genericArrayType0.getGenericComponentType()).y());
                this.b.j(class0);
            }

            @Override  // com.google.common.reflect.s
            void d(ParameterizedType parameterizedType0) {
                Class class0 = (Class)parameterizedType0.getRawType();
                this.b.j(class0);
            }

            @Override  // com.google.common.reflect.s
            void e(TypeVariable typeVariable0) {
                this.a(typeVariable0.getBounds());
            }

            @Override  // com.google.common.reflect.s
            void f(WildcardType wildcardType0) {
                this.a(wildcardType0.getUpperBounds());
            }
        }

        com.google.common.collect.a3.a a3$a0 = a3.n();
        new com.google.common.reflect.q.d(this, a3$a0).a(new Type[]{this.a});
        return a3$a0.o();
    }
}

