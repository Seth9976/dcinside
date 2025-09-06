package com.bykv.vk.openvk.preload.geckox.c;

import com.bykv.vk.openvk.preload.a.d.b;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.m;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;

public final class a extends r {
    @Override  // com.bykv.vk.openvk.preload.a.r
    public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
        b b0 = a0.f();
        boolean z = true;
        switch(com.bykv.vk.openvk.preload.geckox.c.a.1.a[b0.ordinal()]) {
            case 1: {
                return Boolean.valueOf(a0.i());
            }
            case 2: {
                a0.j();
                return null;
            }
            case 3: {
                if(a0.m() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            default: {
                throw new m("Expected BOOLEAN or NUMBER but was " + b0);
            }
        }
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final void a(c c0, Object object0) throws IOException {
        if(((Boolean)object0) == null) {
            c0.h();
            return;
        }
        c0.a(((Boolean)object0));
    }

    final class com.bykv.vk.openvk.preload.geckox.c.a.1 {
        static final int[] a;

        static {
            int[] arr_v = new int[b.a().length];
            com.bykv.vk.openvk.preload.geckox.c.a.1.a = arr_v;
            try {
                arr_v[b.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.geckox.c.a.1.a[b.i.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.geckox.c.a.1.a[b.g.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

