package com.google.gson.internal;

import j..util.Objects;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class b {
    static final class a implements Serializable, GenericArrayType {
        private final Type a;
        private static final long b;

        public a(Type type0) {
            Objects.requireNonNull(type0);
            this.a = b.b(type0);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof GenericArrayType && b.f(this, ((GenericArrayType)object0));
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
            return b.t(this.a) + "[]";
        }
    }

    static final class com.google.gson.internal.b.b implements Serializable, ParameterizedType {
        private final Type a;
        private final Type b;
        private final Type[] c;
        private static final long d;

        public com.google.gson.internal.b.b(Type type0, Type type1, Type[] arr_type) {
            boolean z = true;
            super();
            Objects.requireNonNull(type1);
            if(type1 instanceof Class) {
                if(type0 == null && (!Modifier.isStatic(((Class)type1).getModifiers()) && ((Class)type1).getEnclosingClass() != null)) {
                    z = false;
                }
                com.google.gson.internal.a.a(z);
            }
            this.a = type0 == null ? null : b.b(type0);
            this.b = b.b(type1);
            Type[] arr_type1 = (Type[])arr_type.clone();
            this.c = arr_type1;
            for(int v = 0; v < arr_type1.length; ++v) {
                Objects.requireNonNull(this.c[v]);
                b.c(this.c[v]);
                this.c[v] = b.b(this.c[v]);
            }
        }

        private static int a(Object object0) {
            return object0 == null ? 0 : object0.hashCode();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof ParameterizedType && b.f(this, ((ParameterizedType)object0));
        }

        @Override
        public Type[] getActualTypeArguments() {
            return (Type[])this.c.clone();
        }

        @Override
        public Type getOwnerType() {
            return this.a;
        }

        @Override
        public Type getRawType() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(this.c) ^ this.b.hashCode() ^ com.google.gson.internal.b.b.a(this.a);
        }

        @Override
        public String toString() {
            if(this.c.length == 0) {
                return b.t(this.b);
            }
            StringBuilder stringBuilder0 = new StringBuilder((this.c.length + 1) * 30);
            stringBuilder0.append(b.t(this.b));
            stringBuilder0.append("<");
            stringBuilder0.append(b.t(this.c[0]));
            for(int v = 1; v < this.c.length; ++v) {
                stringBuilder0.append(", ");
                stringBuilder0.append(b.t(this.c[v]));
            }
            stringBuilder0.append(">");
            return stringBuilder0.toString();
        }
    }

    static final class c implements Serializable, WildcardType {
        private final Type a;
        private final Type b;
        private static final long c;

        public c(Type[] arr_type, Type[] arr_type1) {
            boolean z = true;
            com.google.gson.internal.a.a(arr_type1.length <= 1);
            com.google.gson.internal.a.a(arr_type.length == 1);
            if(arr_type1.length == 1) {
                Objects.requireNonNull(arr_type1[0]);
                b.c(arr_type1[0]);
                Class class0 = Object.class;
                if(arr_type[0] != class0) {
                    z = false;
                }
                com.google.gson.internal.a.a(z);
                this.b = b.b(arr_type1[0]);
                this.a = class0;
                return;
            }
            Objects.requireNonNull(arr_type[0]);
            b.c(arr_type[0]);
            this.b = null;
            this.a = b.b(arr_type[0]);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof WildcardType && b.f(this, ((WildcardType)object0));
        }

        @Override
        public Type[] getLowerBounds() {
            return this.b == null ? b.a : new Type[]{this.b};
        }

        @Override
        public Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        @Override
        public int hashCode() {
            return this.b == null ? 1 ^ this.a.hashCode() + 0x1F : this.b.hashCode() + 0x1F ^ this.a.hashCode() + 0x1F;
        }

        @Override
        public String toString() {
            if(this.b != null) {
                return "? super " + b.t(this.b);
            }
            return this.a == Object.class ? "?" : "? extends " + b.t(this.a);
        }
    }

    static final Type[] a;
    static final boolean b;

    static {
        b.a = new Type[0];
    }

    private b() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType a(Type type0) {
        return new a(type0);
    }

    public static Type b(Type type0) {
        if(type0 instanceof Class) {
            return ((Class)type0).isArray() ? new a(b.b(((Class)type0).getComponentType())) : ((Class)type0);
        }
        if(type0 instanceof ParameterizedType) {
            return new com.google.gson.internal.b.b(((ParameterizedType)type0).getOwnerType(), ((ParameterizedType)type0).getRawType(), ((ParameterizedType)type0).getActualTypeArguments());
        }
        if(type0 instanceof GenericArrayType) {
            return new a(((GenericArrayType)type0).getGenericComponentType());
        }
        return type0 instanceof WildcardType ? new c(((WildcardType)type0).getUpperBounds(), ((WildcardType)type0).getLowerBounds()) : type0;
    }

    static void c(Type type0) {
        com.google.gson.internal.a.a(!(type0 instanceof Class) || !((Class)type0).isPrimitive());
    }

    private static Class d(TypeVariable typeVariable0) {
        GenericDeclaration genericDeclaration0 = typeVariable0.getGenericDeclaration();
        return genericDeclaration0 instanceof Class ? ((Class)genericDeclaration0) : null;
    }

    private static boolean e(Object object0, Object object1) {
        return Objects.equals(object0, object1);
    }

    public static boolean f(Type type0, Type type1) {
        if(type0 == type1) {
            return true;
        }
        if(type0 instanceof Class) {
            return type0.equals(type1);
        }
        if(type0 instanceof ParameterizedType) {
            return type1 instanceof ParameterizedType ? b.e(((ParameterizedType)type0).getOwnerType(), ((ParameterizedType)type1).getOwnerType()) && ((ParameterizedType)type0).getRawType().equals(((ParameterizedType)type1).getRawType()) && Arrays.equals(((ParameterizedType)type0).getActualTypeArguments(), ((ParameterizedType)type1).getActualTypeArguments()) : false;
        }
        if(type0 instanceof GenericArrayType) {
            return type1 instanceof GenericArrayType ? b.f(((GenericArrayType)type0).getGenericComponentType(), ((GenericArrayType)type1).getGenericComponentType()) : false;
        }
        if(type0 instanceof WildcardType) {
            return type1 instanceof WildcardType ? Arrays.equals(((WildcardType)type0).getUpperBounds(), ((WildcardType)type1).getUpperBounds()) && Arrays.equals(((WildcardType)type0).getLowerBounds(), ((WildcardType)type1).getLowerBounds()) : false;
        }
        return type0 instanceof TypeVariable && type1 instanceof TypeVariable ? ((TypeVariable)type0).getGenericDeclaration() == ((TypeVariable)type1).getGenericDeclaration() && ((TypeVariable)type0).getName().equals(((TypeVariable)type1).getName()) : false;
    }

    public static Type g(Type type0) {
        return type0 instanceof GenericArrayType ? ((GenericArrayType)type0).getGenericComponentType() : ((Class)type0).getComponentType();
    }

    public static Type h(Type type0, Class class0) {
        Type type1 = b.l(type0, class0, Collection.class);
        return type1 instanceof ParameterizedType ? ((ParameterizedType)type1).getActualTypeArguments()[0] : Object.class;
    }

    private static Type i(Type type0, Class class0, Class class1) {
        if(class1 == class0) {
            return type0;
        }
        if(class1.isInterface()) {
            Class[] arr_class = class0.getInterfaces();
            for(int v = 0; v < arr_class.length; ++v) {
                Class class2 = arr_class[v];
                if(class2 == class1) {
                    return class0.getGenericInterfaces()[v];
                }
                if(class1.isAssignableFrom(class2)) {
                    return b.i(class0.getGenericInterfaces()[v], arr_class[v], class1);
                }
            }
        }
        if(!class0.isInterface()) {
            while(class0 != Object.class) {
                Class class3 = class0.getSuperclass();
                if(class3 == class1) {
                    return class0.getGenericSuperclass();
                }
                if(class1.isAssignableFrom(class3)) {
                    return b.i(class0.getGenericSuperclass(), class3, class1);
                }
                class0 = class3;
            }
        }
        return class1;
    }

    public static Type[] j(Type type0, Class class0) {
        if(type0 == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type type1 = b.l(type0, class0, Map.class);
        return type1 instanceof ParameterizedType ? ((ParameterizedType)type1).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class k(Type type0) {
        if(type0 instanceof Class) {
            return (Class)type0;
        }
        if(type0 instanceof ParameterizedType) {
            Type type1 = ((ParameterizedType)type0).getRawType();
            com.google.gson.internal.a.a(type1 instanceof Class);
            return (Class)type1;
        }
        if(type0 instanceof GenericArrayType) {
            return Array.newInstance(b.k(((GenericArrayType)type0).getGenericComponentType()), 0).getClass();
        }
        if(type0 instanceof TypeVariable) {
            return Object.class;
        }
        if(!(type0 instanceof WildcardType)) {
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type0 + "> is of type " + (type0 == null ? "null" : type0.getClass().getName()));
        }
        return b.k(((WildcardType)type0).getUpperBounds()[0]);
    }

    private static Type l(Type type0, Class class0, Class class1) {
        if(type0 instanceof WildcardType) {
            type0 = ((WildcardType)type0).getUpperBounds()[0];
        }
        com.google.gson.internal.a.a(class1.isAssignableFrom(class0));
        return b.o(type0, class0, b.i(type0, class0, class1));
    }

    private static int m(Object[] arr_object, Object object0) {
        for(int v = 0; v < arr_object.length; ++v) {
            if(object0.equals(arr_object[v])) {
                return v;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType n(Type type0, Type type1, Type[] arr_type) {
        return new com.google.gson.internal.b.b(type0, type1, arr_type);
    }

    public static Type o(Type type0, Class class0, Type type1) {
        return b.p(type0, class0, type1, new HashMap());
    }

    private static Type p(Type type0, Class class0, Type type1, Map map0) {
        TypeVariable typeVariable0 = null;
        do {
            if(!(type1 instanceof TypeVariable)) {
                goto label_13;
            }
            TypeVariable typeVariable1 = (TypeVariable)type1;
            Type type2 = (Type)map0.get(typeVariable1);
            if(type2 != null) {
                return type2 == Void.TYPE ? type1 : type2;
            }
            map0.put(typeVariable1, Void.TYPE);
            if(typeVariable0 == null) {
                typeVariable0 = typeVariable1;
            }
            type1 = b.q(type0, class0, typeVariable1);
        }
        while(type1 != typeVariable1);
        goto label_60;
    label_13:
        if(type1 instanceof Class && ((Class)type1).isArray()) {
            Class class1 = ((Class)type1).getComponentType();
            Type type3 = b.p(type0, class0, class1, map0);
            type1 = b.e(class1, type3) ? ((Class)type1) : b.a(type3);
        }
        else if(type1 instanceof GenericArrayType) {
            type1 = (GenericArrayType)type1;
            Type type4 = ((GenericArrayType)type1).getGenericComponentType();
            Type type5 = b.p(type0, class0, type4, map0);
            if(!b.e(type4, type5)) {
                type1 = b.a(type5);
            }
        }
        else if(type1 instanceof ParameterizedType) {
            type1 = (ParameterizedType)type1;
            Type type6 = ((ParameterizedType)type1).getOwnerType();
            Type type7 = b.p(type0, class0, type6, map0);
            int v1 = !b.e(type7, type6);
            Type[] arr_type = ((ParameterizedType)type1).getActualTypeArguments();
            int v2 = arr_type.length;
            for(int v = 0; v < v2; ++v) {
                Type type8 = b.p(type0, class0, arr_type[v], map0);
                if(!b.e(type8, arr_type[v])) {
                    if(v1 == 0) {
                        arr_type = (Type[])arr_type.clone();
                        v1 = 1;
                    }
                    arr_type[v] = type8;
                }
            }
            if(v1 != 0) {
                type1 = b.n(type7, ((ParameterizedType)type1).getRawType(), arr_type);
            }
        }
        else if(type1 instanceof WildcardType) {
            type1 = (WildcardType)type1;
            Type[] arr_type1 = ((WildcardType)type1).getLowerBounds();
            Type[] arr_type2 = ((WildcardType)type1).getUpperBounds();
            if(arr_type1.length == 1) {
                Type type9 = b.p(type0, class0, arr_type1[0], map0);
                if(type9 != arr_type1[0]) {
                    type1 = b.s(type9);
                }
            }
            else if(arr_type2.length == 1) {
                Type type10 = b.p(type0, class0, arr_type2[0], map0);
                if(type10 != arr_type2[0]) {
                    type1 = b.r(type10);
                }
            }
        }
    label_60:
        if(typeVariable0 != null) {
            map0.put(typeVariable0, type1);
        }
        return type1;
    }

    private static Type q(Type type0, Class class0, TypeVariable typeVariable0) {
        Class class1 = b.d(typeVariable0);
        if(class1 == null) {
            return typeVariable0;
        }
        Type type1 = b.i(type0, class0, class1);
        return type1 instanceof ParameterizedType ? ((ParameterizedType)type1).getActualTypeArguments()[b.m(class1.getTypeParameters(), typeVariable0)] : typeVariable0;
    }

    // 去混淆评级： 低(20)
    public static WildcardType r(Type type0) {
        return type0 instanceof WildcardType ? new c(((WildcardType)type0).getUpperBounds(), b.a) : new c(new Type[]{type0}, b.a);
    }

    public static WildcardType s(Type type0) {
        if(type0 instanceof WildcardType) {
            Type[] arr_type = ((WildcardType)type0).getLowerBounds();
            return new c(new Type[]{Object.class}, arr_type);
        }
        return new c(new Type[]{Object.class}, new Type[]{type0});
    }

    // 去混淆评级： 低(20)
    public static String t(Type type0) {
        return type0 instanceof Class ? ((Class)type0).getName() : type0.toString();
    }
}

