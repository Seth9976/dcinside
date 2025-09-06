package com.bykv.vk.openvk.preload.a.b;

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
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class a {
    static final class com.bykv.vk.openvk.preload.a.b.a.a implements Serializable, GenericArrayType {
        private final Type a;

        public com.bykv.vk.openvk.preload.a.b.a.a(Type type0) {
            this.a = a.a(type0);
        }

        // 去混淆评级： 低(20)
        @Override
        public final boolean equals(Object object0) {
            return object0 instanceof GenericArrayType && a.a(this, ((GenericArrayType)object0));
        }

        @Override
        public final Type getGenericComponentType() {
            return this.a;
        }

        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public final String toString() {
            return a.c(this.a) + "[]";
        }
    }

    static final class b implements Serializable, ParameterizedType {
        private final Type a;
        private final Type b;
        private final Type[] c;

        public b(Type type0, Type type1, Type[] arr_type) {
            boolean z = true;
            super();
            if(type1 instanceof Class) {
                if(type0 == null && (!Modifier.isStatic(((Class)type1).getModifiers()) && ((Class)type1).getEnclosingClass() != null)) {
                    z = false;
                }
                com.bykv.vk.openvk.preload.falconx.a.a.a(z);
            }
            this.a = type0 == null ? null : a.a(type0);
            this.b = a.a(type1);
            Type[] arr_type1 = (Type[])arr_type.clone();
            this.c = arr_type1;
            for(int v = 0; v < arr_type1.length; ++v) {
                com.bykv.vk.openvk.preload.falconx.a.a.a(this.c[v]);
                a.e(this.c[v]);
                this.c[v] = a.a(this.c[v]);
            }
        }

        // 去混淆评级： 低(20)
        @Override
        public final boolean equals(Object object0) {
            return object0 instanceof ParameterizedType && a.a(this, ((ParameterizedType)object0));
        }

        @Override
        public final Type[] getActualTypeArguments() {
            return (Type[])this.c.clone();
        }

        @Override
        public final Type getOwnerType() {
            return this.a;
        }

        @Override
        public final Type getRawType() {
            return this.b;
        }

        @Override
        public final int hashCode() {
            return Arrays.hashCode(this.c) ^ this.b.hashCode() ^ a.a(this.a);
        }

        @Override
        public final String toString() {
            if(this.c.length == 0) {
                return a.c(this.b);
            }
            StringBuilder stringBuilder0 = new StringBuilder((this.c.length + 1) * 30);
            stringBuilder0.append(a.c(this.b));
            stringBuilder0.append("<");
            stringBuilder0.append(a.c(this.c[0]));
            for(int v = 1; v < this.c.length; ++v) {
                stringBuilder0.append(", ");
                stringBuilder0.append(a.c(this.c[v]));
            }
            stringBuilder0.append(">");
            return stringBuilder0.toString();
        }
    }

    static final class c implements Serializable, WildcardType {
        private final Type a;
        private final Type b;

        public c(Type[] arr_type, Type[] arr_type1) {
            boolean z = true;
            com.bykv.vk.openvk.preload.falconx.a.a.a(arr_type1.length <= 1);
            com.bykv.vk.openvk.preload.falconx.a.a.a(arr_type.length == 1);
            if(arr_type1.length == 1) {
                com.bykv.vk.openvk.preload.falconx.a.a.a(arr_type1[0]);
                a.e(arr_type1[0]);
                Class class0 = Object.class;
                if(arr_type[0] != class0) {
                    z = false;
                }
                com.bykv.vk.openvk.preload.falconx.a.a.a(z);
                this.b = a.a(arr_type1[0]);
                this.a = class0;
                return;
            }
            com.bykv.vk.openvk.preload.falconx.a.a.a(arr_type[0]);
            a.e(arr_type[0]);
            this.b = null;
            this.a = a.a(arr_type[0]);
        }

        // 去混淆评级： 低(20)
        @Override
        public final boolean equals(Object object0) {
            return object0 instanceof WildcardType && a.a(this, ((WildcardType)object0));
        }

        @Override
        public final Type[] getLowerBounds() {
            return this.b == null ? a.a : new Type[]{this.b};
        }

        @Override
        public final Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        @Override
        public final int hashCode() {
            return this.b == null ? 1 ^ this.a.hashCode() + 0x1F : this.b.hashCode() + 0x1F ^ this.a.hashCode() + 0x1F;
        }

        @Override
        public final String toString() {
            if(this.b != null) {
                return "? super " + a.c(this.b);
            }
            return this.a == Object.class ? "?" : "? extends " + a.c(this.a);
        }
    }

    static final Type[] a;

    static {
        a.a = new Type[0];
    }

    static int a(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    public static Type a(Type type0) {
        if(type0 instanceof Class) {
            return ((Class)type0).isArray() ? new com.bykv.vk.openvk.preload.a.b.a.a(a.a(((Class)type0).getComponentType())) : ((Class)type0);
        }
        if(type0 instanceof ParameterizedType) {
            return new b(((ParameterizedType)type0).getOwnerType(), ((ParameterizedType)type0).getRawType(), ((ParameterizedType)type0).getActualTypeArguments());
        }
        if(type0 instanceof GenericArrayType) {
            return new com.bykv.vk.openvk.preload.a.b.a.a(((GenericArrayType)type0).getGenericComponentType());
        }
        return type0 instanceof WildcardType ? new c(((WildcardType)type0).getUpperBounds(), ((WildcardType)type0).getLowerBounds()) : type0;
    }

    public static Type a(Type type0, Class class0) {
        Type type1 = a.b(type0, class0, Collection.class);
        if(type1 instanceof WildcardType) {
            type1 = ((WildcardType)type1).getUpperBounds()[0];
        }
        return type1 instanceof ParameterizedType ? ((ParameterizedType)type1).getActualTypeArguments()[0] : Object.class;
    }

    private static Type a(Type type0, Class class0, Class class1) {
        Class class3;
        Type type1;
    alab1:
        while(true) {
            if(class1 == class0) {
                return type0;
            }
            if(class1.isInterface()) {
                Class[] arr_class = class0.getInterfaces();
                int v = 0;
                while(v < arr_class.length) {
                    Class class2 = arr_class[v];
                    if(class2 == class1) {
                        return class0.getGenericInterfaces()[v];
                    }
                    if(class1.isAssignableFrom(class2)) {
                        type1 = class0.getGenericInterfaces()[v];
                        class3 = arr_class[v];
                        goto label_24;
                    }
                    ++v;
                }
            }
            if(class0.isInterface()) {
                break;
            }
            while(true) {
                if(class0 == Object.class) {
                    break alab1;
                }
                class3 = class0.getSuperclass();
                if(class3 == class1) {
                    return class0.getGenericSuperclass();
                }
                if(class1.isAssignableFrom(class3)) {
                    type1 = class0.getGenericSuperclass();
                label_24:
                    class0 = class3;
                    type0 = type1;
                    break;
                }
                class0 = class3;
            }
        }
        return class1;
    }

    public static Type a(Type type0, Class class0, Type type1) {
        return a.a(type0, class0, type1, new HashSet());
    }

    private static Type a(Type type0, Class class0, Type type1, Collection collection0) {
        while(type1 instanceof TypeVariable) {
            TypeVariable typeVariable0 = (TypeVariable)type1;
            if(collection0.contains(typeVariable0)) {
                return type1;
            }
            collection0.add(typeVariable0);
            GenericDeclaration genericDeclaration0 = typeVariable0.getGenericDeclaration();
            Class class1 = genericDeclaration0 instanceof Class ? ((Class)genericDeclaration0) : null;
            if(class1 != null) {
                Type type2 = a.a(type0, class0, class1);
                if(type2 instanceof ParameterizedType) {
                    TypeVariable[] arr_typeVariable = class1.getTypeParameters();
                    int v1 = 0;
                    while(v1 < arr_typeVariable.length) {
                        if(typeVariable0.equals(arr_typeVariable[v1])) {
                            type1 = ((ParameterizedType)type2).getActualTypeArguments()[v1];
                            goto label_21;
                        }
                        ++v1;
                    }
                    throw new NoSuchElementException();
                }
            }
            type1 = typeVariable0;
        label_21:
            if(type1 == typeVariable0) {
                return type1;
            }
            if(false) {
                break;
            }
        }
        if(type1 instanceof Class && ((Class)type1).isArray()) {
            Class class2 = ((Class)type1).getComponentType();
            Type type3 = a.a(type0, class0, class2, collection0);
            return class2 == type3 ? ((Class)type1) : a.f(type3);
        }
        if(type1 instanceof GenericArrayType) {
            Type type4 = ((GenericArrayType)type1).getGenericComponentType();
            Type type5 = a.a(type0, class0, type4, collection0);
            return type4 == type5 ? ((GenericArrayType)type1) : a.f(type5);
        }
        if(type1 instanceof ParameterizedType) {
            Type type6 = ((ParameterizedType)type1).getOwnerType();
            Type type7 = a.a(type0, class0, type6, collection0);
            boolean z = type7 != type6;
            Type[] arr_type = ((ParameterizedType)type1).getActualTypeArguments();
            int v2 = arr_type.length;
            for(int v = 0; v < v2; ++v) {
                Type type8 = a.a(type0, class0, arr_type[v], collection0);
                if(type8 != arr_type[v]) {
                    if(!z) {
                        arr_type = (Type[])arr_type.clone();
                        z = true;
                    }
                    arr_type[v] = type8;
                }
            }
            return z ? new b(type7, ((ParameterizedType)type1).getRawType(), arr_type) : ((ParameterizedType)type1);
        }
        if(type1 instanceof WildcardType) {
            type1 = (WildcardType)type1;
            Type[] arr_type1 = ((WildcardType)type1).getLowerBounds();
            Type[] arr_type2 = ((WildcardType)type1).getUpperBounds();
            if(arr_type1.length == 1) {
                Type type9 = a.a(type0, class0, arr_type1[0], collection0);
                if(type9 != arr_type1[0]) {
                    if(type9 instanceof WildcardType) {
                        Type[] arr_type3 = ((WildcardType)type9).getLowerBounds();
                        return new c(new Type[]{Object.class}, arr_type3);
                    }
                    return new c(new Type[]{Object.class}, new Type[]{type9});
                }
            }
            else if(arr_type2.length == 1) {
                Type type10 = a.a(type0, class0, arr_type2[0], collection0);
                if(type10 != arr_type2[0]) {
                    return type10 instanceof WildcardType ? new c(((WildcardType)type10).getUpperBounds(), a.a) : new c(new Type[]{type10}, a.a);
                }
            }
        }
        return type1;
    }

    public static boolean a(Type type0, Type type1) {
        while(true) {
            if(type0 == type1) {
                return true;
            }
            if(type0 instanceof Class) {
                return type0.equals(type1);
            }
            if(type0 instanceof ParameterizedType) {
                if(!(type1 instanceof ParameterizedType)) {
                    return false;
                }
                Type type2 = ((ParameterizedType)type0).getOwnerType();
                Type type3 = ((ParameterizedType)type1).getOwnerType();
                return (type2 == type3 || type2 != null && type2.equals(type3)) && ((ParameterizedType)type0).getRawType().equals(((ParameterizedType)type1).getRawType()) && Arrays.equals(((ParameterizedType)type0).getActualTypeArguments(), ((ParameterizedType)type1).getActualTypeArguments());
            }
            if(!(type0 instanceof GenericArrayType)) {
                break;
            }
            if(!(type1 instanceof GenericArrayType)) {
                return false;
            }
            type0 = ((GenericArrayType)type0).getGenericComponentType();
            type1 = ((GenericArrayType)type1).getGenericComponentType();
        }
        if(type0 instanceof WildcardType) {
            return type1 instanceof WildcardType ? Arrays.equals(((WildcardType)type0).getUpperBounds(), ((WildcardType)type1).getUpperBounds()) && Arrays.equals(((WildcardType)type0).getLowerBounds(), ((WildcardType)type1).getLowerBounds()) : false;
        }
        return type0 instanceof TypeVariable && type1 instanceof TypeVariable ? ((TypeVariable)type0).getGenericDeclaration() == ((TypeVariable)type1).getGenericDeclaration() && ((TypeVariable)type0).getName().equals(((TypeVariable)type1).getName()) : false;
    }

    public static Class b(Type type0) {
        while(true) {
            if(type0 instanceof Class) {
                return (Class)type0;
            }
            if(type0 instanceof ParameterizedType) {
                Type type1 = ((ParameterizedType)type0).getRawType();
                com.bykv.vk.openvk.preload.falconx.a.a.a(type1 instanceof Class);
                return (Class)type1;
            }
            if(type0 instanceof GenericArrayType) {
                return Array.newInstance(a.b(((GenericArrayType)type0).getGenericComponentType()), 0).getClass();
            }
            if(type0 instanceof TypeVariable) {
                return Object.class;
            }
            if(!(type0 instanceof WildcardType)) {
                break;
            }
            type0 = ((WildcardType)type0).getUpperBounds()[0];
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type0 + "> is of type " + (type0 == null ? "null" : type0.getClass().getName()));
    }

    private static Type b(Type type0, Class class0, Class class1) {
        if(type0 instanceof WildcardType) {
            type0 = ((WildcardType)type0).getUpperBounds()[0];
        }
        com.bykv.vk.openvk.preload.falconx.a.a.a(class1.isAssignableFrom(class0));
        return a.a(type0, class0, a.a(type0, class0, class1));
    }

    public static Type[] b(Type type0, Class class0) {
        if(type0 == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type type1 = a.b(type0, class0, Map.class);
        return type1 instanceof ParameterizedType ? ((ParameterizedType)type1).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    // 去混淆评级： 低(20)
    public static String c(Type type0) {
        return type0 instanceof Class ? ((Class)type0).getName() : type0.toString();
    }

    public static Type d(Type type0) {
        return type0 instanceof GenericArrayType ? ((GenericArrayType)type0).getGenericComponentType() : ((Class)type0).getComponentType();
    }

    static void e(Type type0) {
        com.bykv.vk.openvk.preload.falconx.a.a.a(!(type0 instanceof Class) || !((Class)type0).isPrimitive());
    }

    private static GenericArrayType f(Type type0) {
        return new com.bykv.vk.openvk.preload.a.b.a.a(type0);
    }
}

