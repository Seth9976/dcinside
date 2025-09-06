package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.J;
import kotlin.h0;
import kotlin.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.s0;
import kotlin.r;
import kotlin.sequences.m;
import kotlin.sequences.p;
import y4.l;
import z3.b;

@s0({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1557#3:232\n1628#3,3:233\n1557#3:236\n1628#3,3:237\n1557#3:240\n1628#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class B {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[v.values().length];
            try {
                arr_v[v.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[v.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[v.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @r
    private static final Type c(s s0, boolean z) {
        g g0 = s0.p();
        if(g0 instanceof t) {
            return new A(((t)g0));
        }
        if(!(g0 instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + s0);
        }
        Type type0 = z ? b.g(((d)g0)) : b.e(((d)g0));
        List list0 = s0.c();
        if(list0.isEmpty()) {
            return type0;
        }
        if(((Class)type0).isArray()) {
            if(((Class)type0).getComponentType().isPrimitive()) {
                return type0;
            }
            u u0 = (u)kotlin.collections.u.k5(list0);
            if(u0 == null) {
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + s0);
            }
            v v0 = u0.a();
            s s1 = u0.b();
            switch((v0 == null ? -1 : a.a[v0.ordinal()])) {
                case -1: 
                case 1: {
                    break;
                }
                case 2: 
                case 3: {
                    L.m(s1);
                    Type type1 = B.d(s1, false, 1, null);
                    if(!(type1 instanceof Class)) {
                        return new kotlin.reflect.a(type1);
                    }
                    break;
                }
                default: {
                    throw new J();
                }
            }
            return type0;
        }
        return B.e(((Class)type0), list0);
    }

    static Type d(s s0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return B.c(s0, z);
    }

    @r
    private static final Type e(Class class0, List list0) {
        Class class1 = class0.getDeclaringClass();
        if(class1 == null) {
            ArrayList arrayList0 = new ArrayList(kotlin.collections.u.b0(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(B.g(((u)object0)));
            }
            return new x(class0, null, arrayList0);
        }
        if(Modifier.isStatic(class0.getModifiers())) {
            ArrayList arrayList1 = new ArrayList(kotlin.collections.u.b0(list0, 10));
            for(Object object1: list0) {
                arrayList1.add(B.g(((u)object1)));
            }
            return new x(class0, class1, arrayList1);
        }
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        Type type0 = B.e(class1, list0.subList(arr_typeVariable.length, list0.size()));
        Iterable iterable0 = list0.subList(0, arr_typeVariable.length);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.u.b0(iterable0, 10));
        for(Object object2: iterable0) {
            arrayList2.add(B.g(((u)object2)));
        }
        return new x(class0, type0, arrayList2);
    }

    @l
    public static final Type f(@l s s0) {
        L.p(s0, "<this>");
        if(s0 instanceof M) {
            Type type0 = ((M)s0).f();
            return type0 == null ? B.d(s0, false, 1, null) : type0;
        }
        return B.d(s0, false, 1, null);
    }

    private static final Type g(u u0) {
        v v0 = u0.h();
        if(v0 == null) {
            return C.c.a();
        }
        s s0 = u0.g();
        L.m(s0);
        switch(v0) {
            case 1: {
                return new C(null, B.c(s0, true));
            }
            case 2: {
                return B.c(s0, true);
            }
            case 3: {
                return new C(B.c(s0, true), null);
            }
            default: {
                throw new J();
            }
        }
    }

    @h0(version = "1.4")
    @h
    @r
    public static void h(s s0) {
    }

    @r
    private static void i(u u0) {
    }

    private static final String j(Type type0) {
        final class kotlin.reflect.B.b extends H implements Function1 {
            public static final kotlin.reflect.B.b a;

            static {
                kotlin.reflect.B.b.a = new kotlin.reflect.B.b();
            }

            kotlin.reflect.B.b() {
                super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
            }

            public final Class a(Class class0) {
                L.p(class0, "p0");
                return class0.getComponentType();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Class)object0));
            }
        }

        String s;
        if(type0 instanceof Class) {
            if(((Class)type0).isArray()) {
                m m0 = p.n(type0, kotlin.reflect.B.b.a);
                s = ((Class)p.f1(m0)).getName() + kotlin.text.v.h2("[]", p.g0(m0));
            }
            else {
                s = ((Class)type0).getName();
            }
            L.m(s);
            return s;
        }
        return type0.toString();
    }
}

