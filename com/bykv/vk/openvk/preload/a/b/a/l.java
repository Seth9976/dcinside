package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.d.a;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class l extends r {
    private final d a;
    private final r b;
    private final Type c;

    l(d d0, r r0, Type type0) {
        this.a = d0;
        this.b = r0;
        this.c = type0;
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final Object a(a a0) throws IOException {
        return this.b.a(a0);
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final void a(c c0, Object object0) throws IOException {
        r r0 = this.b;
        Type type0 = this.c;
        if(object0 != null && (type0 == Object.class || type0 instanceof TypeVariable || type0 instanceof Class)) {
            type0 = object0.getClass();
        }
        if(type0 != this.c) {
            com.bykv.vk.openvk.preload.a.c.a a0 = com.bykv.vk.openvk.preload.a.c.a.a(type0);
            r0 = this.a.a(a0);
            if(r0 instanceof com.bykv.vk.openvk.preload.a.b.a.h.a) {
                r r1 = this.b;
                if(!(r1 instanceof com.bykv.vk.openvk.preload.a.b.a.h.a)) {
                    r0 = r1;
                }
            }
        }
        r0.a(c0, object0);
    }
}

