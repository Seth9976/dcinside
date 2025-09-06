package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.reflect.a;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter extends TypeAdapter {
    private final Class a;
    private final TypeAdapter b;
    public static final y c;

    static {
        ArrayTypeAdapter.c = new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, a a0) {
                Type type0 = a0.g();
                if(!(type0 instanceof GenericArrayType) && (!(type0 instanceof Class) || !((Class)type0).isArray())) {
                    return null;
                }
                Type type1 = b.g(type0);
                return new ArrayTypeAdapter(gson0, gson0.t(a.c(type1)), b.k(type1));
            }
        };
    }

    public ArrayTypeAdapter(Gson gson0, TypeAdapter typeAdapter0, Class class0) {
        this.b = new TypeAdapterRuntimeTypeWrapper(gson0, typeAdapter0, class0);
        this.a = class0;
    }

    @Override  // com.google.gson.TypeAdapter
    public Object e(com.google.gson.stream.a a0) throws IOException {
        if(a0.f0() == c.i) {
            a0.T();
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        a0.a();
        while(a0.p()) {
            arrayList0.add(this.b.e(a0));
        }
        a0.i();
        int v = arrayList0.size();
        if(this.a.isPrimitive()) {
            Object object0 = Array.newInstance(this.a, v);
            for(int v1 = 0; v1 < v; ++v1) {
                Array.set(object0, v1, arrayList0.get(v1));
            }
            return object0;
        }
        return arrayList0.toArray(((Object[])Array.newInstance(this.a, v)));
    }

    @Override  // com.google.gson.TypeAdapter
    public void i(d d0, Object object0) throws IOException {
        if(object0 == null) {
            d0.v();
            return;
        }
        d0.c();
        int v = Array.getLength(object0);
        for(int v1 = 0; v1 < v; ++v1) {
            Object object1 = Array.get(object0, v1);
            this.b.i(d0, object1);
        }
        d0.i();
    }
}

