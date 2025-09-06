package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import com.google.gson.stream.d;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper extends TypeAdapter {
    private final Gson a;
    private final TypeAdapter b;
    private final Type c;

    TypeAdapterRuntimeTypeWrapper(Gson gson0, TypeAdapter typeAdapter0, Type type0) {
        this.a = gson0;
        this.b = typeAdapter0;
        this.c = type0;
    }

    @Override  // com.google.gson.TypeAdapter
    public Object e(a a0) throws IOException {
        return this.b.e(a0);
    }

    @Override  // com.google.gson.TypeAdapter
    public void i(d d0, Object object0) throws IOException {
        TypeAdapter typeAdapter0 = this.b;
        Type type0 = TypeAdapterRuntimeTypeWrapper.j(this.c, object0);
        if(type0 != this.c) {
            com.google.gson.reflect.a a0 = com.google.gson.reflect.a.c(type0);
            typeAdapter0 = this.a.t(a0);
            if(typeAdapter0 instanceof Adapter && !TypeAdapterRuntimeTypeWrapper.k(this.b)) {
                typeAdapter0 = this.b;
            }
        }
        typeAdapter0.i(d0, object0);
    }

    private static Type j(Type type0, Object object0) {
        return object0 != null && (type0 instanceof Class || type0 instanceof TypeVariable) ? object0.getClass() : type0;
    }

    private static boolean k(TypeAdapter typeAdapter0) {
        while(typeAdapter0 instanceof SerializationDelegatingTypeAdapter) {
            TypeAdapter typeAdapter1 = ((SerializationDelegatingTypeAdapter)typeAdapter0).j();
            if(typeAdapter1 == typeAdapter0) {
                break;
            }
            typeAdapter0 = typeAdapter1;
        }
        return typeAdapter0 instanceof Adapter;
    }
}

