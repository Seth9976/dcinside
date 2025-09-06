package com.bykv.vk.openvk.preload.b.b;

import com.bykv.vk.openvk.preload.b.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b extends a {
    private List a;

    public b(a[] arr_a) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList0;
        copyOnWriteArrayList0.addAll(Arrays.asList(arr_a));
    }

    public final void a(a a0) {
        if(a0 == null) {
            return;
        }
        this.a.add(a0);
    }

    @Override  // com.bykv.vk.openvk.preload.b.b.a
    public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0) {
        for(Object object0: this.a) {
            a a0 = (a)object0;
            if(a0 != null) {
                a0.a(b0, d0);
            }
        }
    }

    @Override  // com.bykv.vk.openvk.preload.b.b.a
    public final void a(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
        for(Object object0: this.a) {
            a a0 = (a)object0;
            if(a0 != null) {
                a0.a(b0, d0, throwable0);
            }
        }
    }

    @Override  // com.bykv.vk.openvk.preload.b.b.a
    public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0) {
        for(Object object0: this.a) {
            a a0 = (a)object0;
            if(a0 != null) {
                a0.b(b0, d0);
            }
        }
    }

    @Override  // com.bykv.vk.openvk.preload.b.b.a
    public final void b(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
        for(Object object0: this.a) {
            a a0 = (a)object0;
            if(a0 != null) {
                a0.b(b0, d0, throwable0);
            }
        }
    }

    @Override  // com.bykv.vk.openvk.preload.b.b.a
    public final void c(com.bykv.vk.openvk.preload.b.b b0, d d0) {
        for(Object object0: this.a) {
            a a0 = (a)object0;
            if(a0 != null) {
                a0.c(b0, d0);
            }
        }
    }

    @Override  // com.bykv.vk.openvk.preload.b.b.a
    public final void c(com.bykv.vk.openvk.preload.b.b b0, d d0, Throwable throwable0) {
        for(Object object0: this.a) {
            a a0 = (a)object0;
            if(a0 != null) {
                a0.c(b0, d0, throwable0);
            }
        }
    }
}

