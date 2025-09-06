package com.google.gson.reflect;

import com.google.gson.internal.b;
import j..util.Objects;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class a {
    private final Class a;
    private final Type b;
    private final int c;

    protected a() {
        Type type0 = this.h();
        this.b = type0;
        this.a = b.k(type0);
        this.c = type0.hashCode();
    }

    private a(Type type0) {
        Objects.requireNonNull(type0);
        Type type1 = b.b(type0);
        this.b = type1;
        this.a = b.k(type1);
        this.c = type1.hashCode();
    }

    private static AssertionError a(Type type0, Class[] arr_class) {
        StringBuilder stringBuilder0 = new StringBuilder("Unexpected type. Expected one of: ");
        for(int v = 0; v < arr_class.length; ++v) {
            stringBuilder0.append(arr_class[v].getName());
            stringBuilder0.append(", ");
        }
        stringBuilder0.append("but got: ");
        stringBuilder0.append(type0.getClass().getName());
        stringBuilder0.append(", for type token: ");
        stringBuilder0.append(type0.toString());
        stringBuilder0.append('.');
        return new AssertionError(stringBuilder0.toString());
    }

    public static a b(Class class0) {
        return new a(class0);
    }

    public static a c(Type type0) {
        return new a(type0);
    }

    public static a d(Type type0) {
        return new a(b.a(type0));
    }

    public static a e(Type type0, Type[] arr_type) {
        Objects.requireNonNull(type0);
        Objects.requireNonNull(arr_type);
        if(!(type0 instanceof Class)) {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + type0);
        }
        TypeVariable[] arr_typeVariable = ((Class)type0).getTypeParameters();
        if(arr_type.length != arr_typeVariable.length) {
            throw new IllegalArgumentException(((Class)type0).getName() + " requires " + arr_typeVariable.length + " type arguments, but got " + arr_type.length);
        }
        for(int v = 0; v < arr_typeVariable.length; ++v) {
            Type type1 = arr_type[v];
            Class class0 = b.k(type1);
            TypeVariable typeVariable0 = arr_typeVariable[v];
            Type[] arr_type1 = typeVariable0.getBounds();
            for(int v1 = 0; v1 < arr_type1.length; ++v1) {
                if(!b.k(arr_type1[v1]).isAssignableFrom(class0)) {
                    throw new IllegalArgumentException("Type argument " + type1 + " does not satisfy bounds for type variable " + typeVariable0 + " declared by " + type0);
                }
            }
        }
        return new a(b.n(null, type0, arr_type));
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a && b.f(this.b, ((a)object0).b);
    }

    public final Class f() {
        return this.a;
    }

    public final Type g() {
        return this.b;
    }

    private Type h() {
        Type type0 = this.getClass().getGenericSuperclass();
        Class class0 = a.class;
        if(!(type0 instanceof ParameterizedType)) {
            throw type0 == class0 ? new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.") : new IllegalStateException("Must only create direct subclasses of TypeToken");
        }
        if(((ParameterizedType)type0).getRawType() != class0) {
            throw new IllegalStateException("Must only create direct subclasses of TypeToken");
        }
        return b.b(((ParameterizedType)type0).getActualTypeArguments()[0]);
    }

    @Override
    public final int hashCode() {
        return this.c;
    }

    @Deprecated
    public boolean i(a a0) {
        return this.k(a0.g());
    }

    @Deprecated
    public boolean j(Class class0) {
        return this.k(class0);
    }

    @Deprecated
    public boolean k(Type type0) {
        if(type0 == null) {
            return false;
        }
        if(this.b.equals(type0)) {
            return true;
        }
        Type type1 = this.b;
        if(type1 instanceof Class) {
            Class class0 = b.k(type0);
            return this.a.isAssignableFrom(class0);
        }
        if(type1 instanceof ParameterizedType) {
            return a.m(type0, ((ParameterizedType)type1), new HashMap());
        }
        if(!(type1 instanceof GenericArrayType)) {
            throw a.a(type1, new Class[]{Class.class, ParameterizedType.class, GenericArrayType.class});
        }
        Class class1 = b.k(type0);
        return this.a.isAssignableFrom(class1) && a.l(type0, ((GenericArrayType)this.b));
    }

    private static boolean l(Type type0, GenericArrayType genericArrayType0) {
        Type type1 = genericArrayType0.getGenericComponentType();
        if(type1 instanceof ParameterizedType) {
            if(type0 instanceof GenericArrayType) {
                return a.m(((GenericArrayType)type0).getGenericComponentType(), ((ParameterizedType)type1), new HashMap());
            }
            if(type0 instanceof Class) {
                for(type0 = (Class)type0; ((Class)type0).isArray(); type0 = ((Class)type0).getComponentType()) {
                }
            }
            return a.m(type0, ((ParameterizedType)type1), new HashMap());
        }
        return true;
    }

    private static boolean m(Type type0, ParameterizedType parameterizedType0, Map map0) {
        if(type0 == null) {
            return false;
        }
        if(parameterizedType0.equals(type0)) {
            return true;
        }
        Class class0 = b.k(type0);
        ParameterizedType parameterizedType1 = type0 instanceof ParameterizedType ? ((ParameterizedType)type0) : null;
        if(parameterizedType1 != null) {
            Type[] arr_type = parameterizedType1.getActualTypeArguments();
            TypeVariable[] arr_typeVariable = class0.getTypeParameters();
            for(int v1 = 0; v1 < arr_type.length; ++v1) {
                Type type1 = arr_type[v1];
                TypeVariable typeVariable0 = arr_typeVariable[v1];
                while(type1 instanceof TypeVariable) {
                    type1 = (Type)map0.get(((TypeVariable)type1).getName());
                }
                map0.put(typeVariable0.getName(), type1);
            }
            if(a.o(parameterizedType1, parameterizedType0, map0)) {
                return true;
            }
        }
        Type[] arr_type1 = class0.getGenericInterfaces();
        for(int v = 0; v < arr_type1.length; ++v) {
            if(a.m(arr_type1[v], parameterizedType0, new HashMap(map0))) {
                return true;
            }
        }
        return a.m(class0.getGenericSuperclass(), parameterizedType0, new HashMap(map0));
    }

    // 去混淆评级： 低(30)
    private static boolean n(Type type0, Type type1, Map map0) {
        return type1.equals(type0) || type0 instanceof TypeVariable && type1.equals(map0.get(((TypeVariable)type0).getName()));
    }

    private static boolean o(ParameterizedType parameterizedType0, ParameterizedType parameterizedType1, Map map0) {
        if(parameterizedType0.getRawType().equals(parameterizedType1.getRawType())) {
            Type[] arr_type = parameterizedType0.getActualTypeArguments();
            Type[] arr_type1 = parameterizedType1.getActualTypeArguments();
            for(int v = 0; v < arr_type.length; ++v) {
                if(!a.n(arr_type[v], arr_type1[v], map0)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final String toString() {
        return b.t(this.b);
    }
}

