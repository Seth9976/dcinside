package com.fasterxml.jackson.core.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class b implements Comparable {
    protected final Type a;

    protected b() {
        Type type0 = this.getClass().getGenericSuperclass();
        if(type0 instanceof Class) {
            throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
        }
        this.a = ((ParameterizedType)type0).getActualTypeArguments()[0];
    }

    public int a(b b0) {
        return 0;
    }

    public Type b() {
        return this.a;
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((b)object0));
    }
}

