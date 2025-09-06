package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.d.b;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a extends r {
    public static final s a;
    private final Class b;
    private final r c;

    static {
        a.a = new s() {
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
                Type type0 = a0.b();
                if(!(type0 instanceof GenericArrayType) && (!(type0 instanceof Class) || !((Class)type0).isArray())) {
                    return null;
                }
                Type type1 = com.bykv.vk.openvk.preload.a.b.a.d(type0);
                return new a(d0, d0.a(com.bykv.vk.openvk.preload.a.c.a.a(type1)), com.bykv.vk.openvk.preload.a.b.a.b(type1));
            }
        };
    }

    public a(d d0, r r0, Class class0) {
        this.c = new l(d0, r0, class0);
        this.b = class0;
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
        if(a0.f() == b.i) {
            a0.j();
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        a0.a();
        while(a0.e()) {
            arrayList0.add(this.c.a(a0));
        }
        a0.b();
        int v = arrayList0.size();
        Object object0 = Array.newInstance(this.b, v);
        for(int v1 = 0; v1 < v; ++v1) {
            Array.set(object0, v1, arrayList0.get(v1));
        }
        return object0;
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final void a(c c0, Object object0) throws IOException {
        if(object0 == null) {
            c0.h();
            return;
        }
        c0.d();
        int v = Array.getLength(object0);
        for(int v1 = 0; v1 < v; ++v1) {
            Object object1 = Array.get(object0, v1);
            this.c.a(c0, object1);
        }
        c0.e();
    }
}

