package com.google.common.reflect;

import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.y;
import com.google.common.collect.D3;
import com.google.common.collect.Q2;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@d
public final class o {
    static final class b extends s {
        private final Map b;

        private b() {
            this.b = D3.Y();
        }

        @Override  // com.google.common.reflect.s
        void b(Class class0) {
            this.a(new Type[]{class0.getGenericSuperclass()});
            this.a(class0.getGenericInterfaces());
        }

        @Override  // com.google.common.reflect.s
        void d(ParameterizedType parameterizedType0) {
            Class class0 = (Class)parameterizedType0.getRawType();
            TypeVariable[] arr_typeVariable = class0.getTypeParameters();
            Type[] arr_type = parameterizedType0.getActualTypeArguments();
            H.g0(arr_typeVariable.length == arr_type.length);
            for(int v = 0; v < arr_typeVariable.length; ++v) {
                this.h(new com.google.common.reflect.o.d(arr_typeVariable[v]), arr_type[v]);
            }
            this.a(new Type[]{class0});
            this.a(new Type[]{parameterizedType0.getOwnerType()});
        }

        @Override  // com.google.common.reflect.s
        void e(TypeVariable typeVariable0) {
            this.a(typeVariable0.getBounds());
        }

        @Override  // com.google.common.reflect.s
        void f(WildcardType wildcardType0) {
            this.a(wildcardType0.getUpperBounds());
        }

        static Q2 g(Type type0) {
            H.E(type0);
            b o$b0 = new b();
            o$b0.a(new Type[]{type0});
            return Q2.g(o$b0.b);
        }

        private void h(com.google.common.reflect.o.d o$d0, Type type0) {
            if(this.b.containsKey(o$d0)) {
                return;
            }
            for(Type type1 = type0; type1 != null; type1 = (Type)this.b.get(o$d2)) {
                if(o$d0.a(type1)) {
                    while(type0 != null) {
                        com.google.common.reflect.o.d o$d1 = com.google.common.reflect.o.d.c(type0);
                        type0 = (Type)this.b.remove(o$d1);
                    }
                    return;
                }
                com.google.common.reflect.o.d o$d2 = com.google.common.reflect.o.d.c(type1);
            }
            this.b.put(o$d0, type0);
        }
    }

    static class c {
        private final Q2 a;

        c() {
            this.a = Q2.u();
        }

        private c(Q2 q20) {
            this.a = q20;
        }

        final Type a(TypeVariable typeVariable0) {
            class a extends c {
                final TypeVariable b;
                final c c;

                a(TypeVariable typeVariable0, c o$c1) {
                    this.b = typeVariable0;
                    this.c = o$c1;
                    super();
                }

                @Override  // com.google.common.reflect.o$c
                public Type b(TypeVariable typeVariable0, c o$c0) {
                    return typeVariable0.getGenericDeclaration().equals(this.b.getGenericDeclaration()) ? typeVariable0 : this.c.b(typeVariable0, o$c0);
                }
            }

            return this.b(typeVariable0, new a(this, typeVariable0, this));
        }

        Type b(TypeVariable typeVariable0, c o$c0) {
            com.google.common.reflect.o.d o$d0 = new com.google.common.reflect.o.d(typeVariable0);
            Type type0 = (Type)this.a.get(o$d0);
            if(type0 == null) {
                Type[] arr_type = typeVariable0.getBounds();
                if(arr_type.length == 0) {
                    return typeVariable0;
                }
                Type[] arr_type1 = new o(o$c0, null).k(arr_type);
                return !e.a || !Arrays.equals(arr_type, arr_type1) ? t.k(typeVariable0.getGenericDeclaration(), typeVariable0.getName(), arr_type1) : typeVariable0;
            }
            return new o(o$c0, null).j(type0);
        }

        final c c(Map map0) {
            com.google.common.collect.Q2.b q2$b0 = Q2.b();
            q2$b0.l(this.a);
            for(Object object0: map0.entrySet()) {
                com.google.common.reflect.o.d o$d0 = (com.google.common.reflect.o.d)((Map.Entry)object0).getKey();
                Type type0 = (Type)((Map.Entry)object0).getValue();
                H.u(!o$d0.a(type0), "Type variable %s bound to itself", o$d0);
                q2$b0.i(o$d0, type0);
            }
            return new c(q2$b0.d());
        }
    }

    static final class com.google.common.reflect.o.d {
        private final TypeVariable a;

        com.google.common.reflect.o.d(TypeVariable typeVariable0) {
            this.a = (TypeVariable)H.E(typeVariable0);
        }

        // 去混淆评级： 低(20)
        boolean a(Type type0) {
            return type0 instanceof TypeVariable ? this.b(((TypeVariable)type0)) : false;
        }

        // 去混淆评级： 低(20)
        private boolean b(TypeVariable typeVariable0) {
            return this.a.getGenericDeclaration().equals(typeVariable0.getGenericDeclaration()) && this.a.getName().equals(typeVariable0.getName());
        }

        // 去混淆评级： 低(20)
        @o3.a
        static com.google.common.reflect.o.d c(Type type0) {
            return type0 instanceof TypeVariable ? new com.google.common.reflect.o.d(((TypeVariable)type0)) : null;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof com.google.common.reflect.o.d ? this.b(((com.google.common.reflect.o.d)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return B.b(new Object[]{this.a.getGenericDeclaration(), this.a.getName()});
        }

        @Override
        public String toString() {
            return this.a.toString();
        }
    }

    static class com.google.common.reflect.o.e {
        private final AtomicInteger a;
        static final com.google.common.reflect.o.e b;

        static {
            com.google.common.reflect.o.e.b = new com.google.common.reflect.o.e();
        }

        private com.google.common.reflect.o.e() {
            this(new AtomicInteger());
        }

        private com.google.common.reflect.o.e(AtomicInteger atomicInteger0) {
            this.a = atomicInteger0;
        }

        com.google.common.reflect.o.e(AtomicInteger atomicInteger0, com.google.common.reflect.o.a o$a0) {
            this(atomicInteger0);
        }

        final Type a(Type type0) {
            H.E(type0);
            if(type0 instanceof Class) {
                return type0;
            }
            if(type0 instanceof TypeVariable) {
                return type0;
            }
            if(type0 instanceof GenericArrayType) {
                return t.j(this.e().a(((GenericArrayType)type0).getGenericComponentType()));
            }
            if(type0 instanceof ParameterizedType) {
                Class class0 = (Class)((ParameterizedType)type0).getRawType();
                TypeVariable[] arr_typeVariable = class0.getTypeParameters();
                Type[] arr_type = ((ParameterizedType)type0).getActualTypeArguments();
                for(int v = 0; v < arr_type.length; ++v) {
                    arr_type[v] = this.d(arr_typeVariable[v]).a(arr_type[v]);
                }
                return t.m(this.e().c(((ParameterizedType)type0).getOwnerType()), class0, arr_type);
            }
            if(!(type0 instanceof WildcardType)) {
                throw new AssertionError("must have been one of the known types");
            }
            return ((WildcardType)type0).getLowerBounds().length == 0 ? this.b(((WildcardType)type0).getUpperBounds()) : type0;
        }

        TypeVariable b(Type[] arr_type) {
            return t.k(com.google.common.reflect.o.e.class, "capture#" + this.a.incrementAndGet() + "-of ? extends " + y.o('&').n(arr_type), arr_type);
        }

        @o3.a
        private Type c(@o3.a Type type0) {
            return type0 == null ? null : this.a(type0);
        }

        private com.google.common.reflect.o.e d(TypeVariable typeVariable0) {
            class com.google.common.reflect.o.e.a extends com.google.common.reflect.o.e {
                final TypeVariable c;

                com.google.common.reflect.o.e.a(AtomicInteger atomicInteger0, TypeVariable typeVariable0) {
                    this.c = typeVariable0;
                    super(atomicInteger0, null);
                }

                @Override  // com.google.common.reflect.o$e
                TypeVariable b(Type[] arr_type) {
                    LinkedHashSet linkedHashSet0 = new LinkedHashSet(Arrays.asList(arr_type));
                    linkedHashSet0.addAll(Arrays.asList(this.c.getBounds()));
                    if(linkedHashSet0.size() > 1) {
                        linkedHashSet0.remove(Object.class);
                    }
                    return super.b(((Type[])linkedHashSet0.toArray(new Type[0])));
                }
            }

            return new com.google.common.reflect.o.e.a(this, this.a, typeVariable0);
        }

        private com.google.common.reflect.o.e e() {
            return new com.google.common.reflect.o.e(this.a);
        }
    }

    private final c a;

    public o() {
        this.a = new c();
    }

    private o(c o$c0) {
        this.a = o$c0;
    }

    o(c o$c0, com.google.common.reflect.o.a o$a0) {
        this(o$c0);
    }

    static o d(Type type0) {
        return new o().o(b.g(type0));
    }

    private static Object e(Class class0, Object object0) {
        try {
            return class0.cast(object0);
        }
        catch(ClassCastException unused_ex) {
            throw new IllegalArgumentException(object0 + " is not a " + class0.getSimpleName());
        }
    }

    static o f(Type type0) {
        Type type1 = com.google.common.reflect.o.e.b.a(type0);
        return new o().o(b.g(type1));
    }

    private static void g(Map map0, Type type0, Type type1) {
        class com.google.common.reflect.o.a extends s {
            final Map b;
            final Type c;

            com.google.common.reflect.o.a(Map map0, Type type0) {
                this.c = type0;
                super();
            }

            @Override  // com.google.common.reflect.s
            void b(Class class0) {
                if(!(this.c instanceof WildcardType)) {
                    throw new IllegalArgumentException("No type mapping from " + class0 + " to " + this.c);
                }
            }

            @Override  // com.google.common.reflect.s
            void c(GenericArrayType genericArrayType0) {
                Type type0 = this.c;
                if(type0 instanceof WildcardType) {
                    return;
                }
                Type type1 = t.i(type0);
                H.u(type1 != null, "%s is not an array type.", this.c);
                Type type2 = genericArrayType0.getGenericComponentType();
                o.g(this.b, type2, type1);
            }

            @Override  // com.google.common.reflect.s
            void d(ParameterizedType parameterizedType0) {
                Type type0 = this.c;
                if(type0 instanceof WildcardType) {
                    return;
                }
                ParameterizedType parameterizedType1 = (ParameterizedType)o.e(ParameterizedType.class, type0);
                if(parameterizedType0.getOwnerType() != null && parameterizedType1.getOwnerType() != null) {
                    Type type1 = parameterizedType0.getOwnerType();
                    Type type2 = parameterizedType1.getOwnerType();
                    o.g(this.b, type1, type2);
                }
                H.y(parameterizedType0.getRawType().equals(parameterizedType1.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType0, this.c);
                Type[] arr_type = parameterizedType0.getActualTypeArguments();
                Type[] arr_type1 = parameterizedType1.getActualTypeArguments();
                H.y(arr_type.length == arr_type1.length, "%s not compatible with %s", parameterizedType0, parameterizedType1);
                for(int v = 0; v < arr_type.length; ++v) {
                    o.g(this.b, arr_type[v], arr_type1[v]);
                }
            }

            @Override  // com.google.common.reflect.s
            void e(TypeVariable typeVariable0) {
                com.google.common.reflect.o.d o$d0 = new com.google.common.reflect.o.d(typeVariable0);
                this.b.put(o$d0, this.c);
            }

            @Override  // com.google.common.reflect.s
            void f(WildcardType wildcardType0) {
                Type type0 = this.c;
                if(!(type0 instanceof WildcardType)) {
                    return;
                }
                Type[] arr_type = wildcardType0.getUpperBounds();
                Type[] arr_type1 = ((WildcardType)type0).getUpperBounds();
                Type[] arr_type2 = wildcardType0.getLowerBounds();
                Type[] arr_type3 = ((WildcardType)type0).getLowerBounds();
                H.y(arr_type.length == arr_type1.length && arr_type2.length == arr_type3.length, "Incompatible type: %s vs. %s", wildcardType0, this.c);
                for(int v1 = 0; v1 < arr_type.length; ++v1) {
                    o.g(this.b, arr_type[v1], arr_type1[v1]);
                }
                for(int v = 0; v < arr_type2.length; ++v) {
                    o.g(this.b, arr_type2[v], arr_type3[v]);
                }
            }
        }

        if(type0.equals(type1)) {
            return;
        }
        new com.google.common.reflect.o.a(map0, type1).a(new Type[]{type0});
    }

    private Type h(GenericArrayType genericArrayType0) {
        return t.j(this.j(genericArrayType0.getGenericComponentType()));
    }

    private ParameterizedType i(ParameterizedType parameterizedType0) {
        Type type0 = parameterizedType0.getOwnerType();
        return type0 == null ? t.m(null, ((Class)this.j(parameterizedType0.getRawType())), this.k(parameterizedType0.getActualTypeArguments())) : t.m(this.j(type0), ((Class)this.j(parameterizedType0.getRawType())), this.k(parameterizedType0.getActualTypeArguments()));
    }

    public Type j(Type type0) {
        H.E(type0);
        if(type0 instanceof TypeVariable) {
            return this.a.a(((TypeVariable)type0));
        }
        if(type0 instanceof ParameterizedType) {
            return this.i(((ParameterizedType)type0));
        }
        if(type0 instanceof GenericArrayType) {
            return this.h(((GenericArrayType)type0));
        }
        return type0 instanceof WildcardType ? this.m(((WildcardType)type0)) : type0;
    }

    private Type[] k(Type[] arr_type) {
        Type[] arr_type1 = new Type[arr_type.length];
        for(int v = 0; v < arr_type.length; ++v) {
            arr_type1[v] = this.j(arr_type[v]);
        }
        return arr_type1;
    }

    Type[] l(Type[] arr_type) {
        for(int v = 0; v < arr_type.length; ++v) {
            arr_type[v] = this.j(arr_type[v]);
        }
        return arr_type;
    }

    private WildcardType m(WildcardType wildcardType0) {
        Type[] arr_type = wildcardType0.getLowerBounds();
        Type[] arr_type1 = wildcardType0.getUpperBounds();
        return new i(this.k(arr_type), this.k(arr_type1));
    }

    public o n(Type type0, Type type1) {
        HashMap hashMap0 = D3.Y();
        o.g(hashMap0, ((Type)H.E(type0)), ((Type)H.E(type1)));
        return this.o(hashMap0);
    }

    o o(Map map0) {
        return new o(this.a.c(map0));
    }
}

