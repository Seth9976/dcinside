package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.c.a;
import com.bykv.vk.openvk.preload.a.d.b;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.util.ArrayList;

public final class g extends r {
    public static final s a;
    private final d b;

    static {
        g.a = new s() {
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, a a0) {
                return a0.a() == Object.class ? new g(d0) : null;
            }
        };
    }

    g(d d0) {
        this.b = d0;
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
        switch(com.bykv.vk.openvk.preload.a.b.a.g.2.a[a0.f().ordinal()]) {
            case 1: {
                ArrayList arrayList0 = new ArrayList();
                a0.a();
                while(a0.e()) {
                    arrayList0.add(this.a(a0));
                }
                a0.b();
                return arrayList0;
            }
            case 2: {
                com.bykv.vk.openvk.preload.a.b.g g0 = new com.bykv.vk.openvk.preload.a.b.g();
                a0.c();
                while(a0.e()) {
                    g0.put(a0.g(), this.a(a0));
                }
                a0.d();
                return g0;
            }
            case 3: {
                return a0.h();
            }
            case 4: {
                return a0.k();
            }
            case 5: {
                return Boolean.valueOf(a0.i());
            }
            case 6: {
                a0.j();
                return null;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final void a(c c0, Object object0) throws IOException {
        if(object0 == null) {
            c0.h();
            return;
        }
        Class class0 = object0.getClass();
        r r0 = this.b.a(class0);
        if(r0 instanceof g) {
            c0.f();
            c0.g();
            return;
        }
        r0.a(c0, object0);
    }

    final class com.bykv.vk.openvk.preload.a.b.a.g.2 {
        static final int[] a;

        static {
            int[] arr_v = new int[b.a().length];
            com.bykv.vk.openvk.preload.a.b.a.g.2.a = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.g.2.a[b.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.g.2.a[b.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.g.2.a[b.g.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.g.2.a[b.h.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.g.2.a[b.i.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

