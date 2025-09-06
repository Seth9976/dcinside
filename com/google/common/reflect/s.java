package com.google.common.reflect;

import com.google.common.collect.D4;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

@d
abstract class s {
    private final Set a;

    s() {
        this.a = D4.u();
    }

    public final void a(Type[] arr_type) {
        for(int v = 0; v < arr_type.length; ++v) {
            Type type0 = arr_type[v];
            if(type0 != null && this.a.add(type0)) {
                try {
                    if(type0 instanceof TypeVariable) {
                        this.e(((TypeVariable)type0));
                    }
                    else if(type0 instanceof WildcardType) {
                        this.f(((WildcardType)type0));
                    }
                    else if(type0 instanceof ParameterizedType) {
                        this.d(((ParameterizedType)type0));
                    }
                    else if(type0 instanceof Class) {
                        this.b(((Class)type0));
                    }
                    else {
                        if(!(type0 instanceof GenericArrayType)) {
                            throw new AssertionError("Unknown type: " + type0);
                        }
                        this.c(((GenericArrayType)type0));
                    }
                    continue;
                }
                catch(Throwable throwable0) {
                }
                this.a.remove(type0);
                throw throwable0;
            }
        }
    }

    void b(Class class0) {
    }

    void c(GenericArrayType genericArrayType0) {
    }

    void d(ParameterizedType parameterizedType0) {
    }

    void e(TypeVariable typeVariable0) {
    }

    void f(WildcardType wildcardType0) {
    }
}

