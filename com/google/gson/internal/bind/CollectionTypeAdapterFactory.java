package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.internal.j;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements y {
    static final class Adapter extends TypeAdapter {
        private final TypeAdapter a;
        private final j b;

        public Adapter(Gson gson0, Type type0, TypeAdapter typeAdapter0, j j0) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson0, typeAdapter0, type0);
            this.b = j0;
        }

        @Override  // com.google.gson.TypeAdapter
        public Object e(a a0) throws IOException {
            return this.j(a0);
        }

        @Override  // com.google.gson.TypeAdapter
        public void i(d d0, Object object0) throws IOException {
            this.k(d0, ((Collection)object0));
        }

        public Collection j(a a0) throws IOException {
            if(a0.f0() == c.i) {
                a0.T();
                return null;
            }
            Collection collection0 = (Collection)this.b.a();
            a0.a();
            while(a0.p()) {
                collection0.add(this.a.e(a0));
            }
            a0.i();
            return collection0;
        }

        public void k(d d0, Collection collection0) throws IOException {
            if(collection0 == null) {
                d0.v();
                return;
            }
            d0.c();
            for(Object object0: collection0) {
                this.a.i(d0, object0);
            }
            d0.i();
        }
    }

    private final com.google.gson.internal.c a;

    public CollectionTypeAdapterFactory(com.google.gson.internal.c c0) {
        this.a = c0;
    }

    @Override  // com.google.gson.y
    public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
        Type type0 = a0.g();
        Class class0 = a0.f();
        if(!Collection.class.isAssignableFrom(class0)) {
            return null;
        }
        Type type1 = b.h(type0, class0);
        return new Adapter(gson0, type1, gson0.t(com.google.gson.reflect.a.c(type1)), this.a.b(a0));
    }
}

