package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.b.b;
import com.bykv.vk.openvk.preload.a.c.a;
import com.bykv.vk.openvk.preload.a.h;
import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;

public final class d implements s {
    private final b a;

    public d(b b0) {
        this.a = b0;
    }

    static r a(b b0, com.bykv.vk.openvk.preload.a.d d0, a a0, com.bykv.vk.openvk.preload.a.a.a a1) {
        r r0;
        h h0 = null;
        Object object0 = b0.a(a.a(a1.a())).a();
        if(object0 instanceof r) {
            r0 = (r)object0;
            return r0 == null || !a1.b() ? r0 : r0.a();
        }
        if(object0 instanceof s) {
            r0 = ((s)object0).a(d0, a0);
            return r0 == null || !a1.b() ? r0 : r0.a();
        }
        if(!(object0 instanceof o) && !(object0 instanceof h)) {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + object0.getClass().getName() + " as a @JsonAdapter for " + a0.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if(object0 instanceof h) {
            h0 = (h)object0;
        }
        r0 = new k((object0 instanceof o ? ((o)object0) : null), h0, d0, a0, null);
        return r0 == null || !a1.b() ? r0 : r0.a();
    }

    @Override  // com.bykv.vk.openvk.preload.a.s
    public final r a(com.bykv.vk.openvk.preload.a.d d0, a a0) {
        com.bykv.vk.openvk.preload.a.a.a a1 = (com.bykv.vk.openvk.preload.a.a.a)a0.a().getAnnotation(com.bykv.vk.openvk.preload.a.a.a.class);
        return a1 == null ? null : d.a(this.a, d0, a0, a1);
    }
}

