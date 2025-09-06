package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.b;
import com.google.gson.i;
import com.google.gson.internal.c;
import com.google.gson.r;
import com.google.gson.reflect.a;
import com.google.gson.y;

public final class JsonAdapterAnnotationTypeAdapterFactory implements y {
    private final c a;

    public JsonAdapterAnnotationTypeAdapterFactory(c c0) {
        this.a = c0;
    }

    @Override  // com.google.gson.y
    public TypeAdapter a(Gson gson0, a a0) {
        b b0 = (b)a0.f().getAnnotation(b.class);
        return b0 == null ? null : this.b(this.a, gson0, a0, b0);
    }

    TypeAdapter b(c c0, Gson gson0, a a0, b b0) {
        TypeAdapter typeAdapter0;
        Object object0 = c0.b(a.b(b0.value())).a();
        boolean z = b0.nullSafe();
        if(object0 instanceof TypeAdapter) {
            typeAdapter0 = (TypeAdapter)object0;
            return typeAdapter0 == null || !z ? typeAdapter0 : typeAdapter0.d();
        }
        if(object0 instanceof y) {
            typeAdapter0 = ((y)object0).a(gson0, a0);
            return typeAdapter0 == null || !z ? typeAdapter0 : typeAdapter0.d();
        }
        if(!(object0 instanceof r) && !(object0 instanceof i)) {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + object0.getClass().getName() + " as a @JsonAdapter for " + a0.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        return new TreeTypeAdapter((object0 instanceof r ? ((r)object0) : null), (object0 instanceof i ? ((i)object0) : null), gson0, a0, null, z);
    }
}

