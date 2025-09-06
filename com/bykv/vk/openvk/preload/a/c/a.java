package com.bykv.vk.openvk.preload.a.c;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class a {
    private Class a;
    private Type b;
    private int c;

    protected a() {
        Type type0 = this.getClass().getGenericSuperclass();
        if(type0 instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type type1 = com.bykv.vk.openvk.preload.a.b.a.a(((ParameterizedType)type0).getActualTypeArguments()[0]);
        this.b = type1;
        this.a = com.bykv.vk.openvk.preload.a.b.a.b(type1);
        this.c = this.b.hashCode();
    }

    private a(Type type0) {
        Type type1 = com.bykv.vk.openvk.preload.a.b.a.a(((Type)com.bykv.vk.openvk.preload.falconx.a.a.a(type0)));
        this.b = type1;
        this.a = com.bykv.vk.openvk.preload.a.b.a.b(type1);
        this.c = this.b.hashCode();
    }

    public static a a(Class class0) {
        return new a(class0);
    }

    public static a a(Type type0) {
        return new a(type0);
    }

    public final Class a() {
        return this.a;
    }

    public final Type b() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a && com.bykv.vk.openvk.preload.a.b.a.a(this.b, ((a)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.c;
    }

    @Override
    public final String toString() {
        return com.bykv.vk.openvk.preload.a.b.a.c(this.b);
    }
}

