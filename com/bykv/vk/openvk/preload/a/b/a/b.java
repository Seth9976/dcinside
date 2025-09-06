package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.b.h;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class b implements s {
    static final class a extends r {
        private final r a;
        private final h b;

        public a(d d0, Type type0, r r0, h h0) {
            this.a = new l(d0, r0, type0);
            this.b = h0;
        }

        @Override  // com.bykv.vk.openvk.preload.a.r
        public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
            if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                a0.j();
                return null;
            }
            Collection collection0 = (Collection)this.b.a();
            a0.a();
            while(a0.e()) {
                collection0.add(this.a.a(a0));
            }
            a0.b();
            return collection0;
        }

        @Override  // com.bykv.vk.openvk.preload.a.r
        public final void a(c c0, Object object0) throws IOException {
            if(((Collection)object0) == null) {
                c0.h();
                return;
            }
            c0.d();
            for(Object object1: ((Collection)object0)) {
                this.a.a(c0, object1);
            }
            c0.e();
        }
    }

    private final com.bykv.vk.openvk.preload.a.b.b a;

    public b(com.bykv.vk.openvk.preload.a.b.b b0) {
        this.a = b0;
    }

    @Override  // com.bykv.vk.openvk.preload.a.s
    public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
        Type type0 = a0.b();
        Class class0 = a0.a();
        if(!Collection.class.isAssignableFrom(class0)) {
            return null;
        }
        Type type1 = com.bykv.vk.openvk.preload.a.b.a.a(type0, class0);
        return new a(d0, type1, d0.a(com.bykv.vk.openvk.preload.a.c.a.a(type1)), this.a.a(a0));
    }
}

