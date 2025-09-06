package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.h;
import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;

public final class k extends r {
    final class a {
        a() {
            this(0);
        }

        private a(byte b) {
        }
    }

    private final o a;
    private final h b;
    private d c;
    private final com.bykv.vk.openvk.preload.a.c.a d;
    private final s e;
    private r f;

    public k(o o0, h h0, d d0, com.bykv.vk.openvk.preload.a.c.a a0, s s0) {
        new a();
        this.a = o0;
        this.b = h0;
        this.c = d0;
        this.d = a0;
        this.e = s0;
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
        if(this.b == null) {
            return this.b().a(a0);
        }
        return com.bykv.vk.openvk.preload.geckox.h.a.a(a0) instanceof com.bykv.vk.openvk.preload.a.k ? null : this.b.a();
    }

    @Override  // com.bykv.vk.openvk.preload.a.r
    public final void a(c c0, Object object0) throws IOException {
        o o0 = this.a;
        if(o0 == null) {
            this.b().a(c0, object0);
            return;
        }
        if(object0 == null) {
            c0.h();
            return;
        }
        com.bykv.vk.openvk.preload.geckox.h.a.a(o0.a(), c0);
    }

    private r b() {
        r r0 = this.f;
        if(r0 != null) {
            return r0;
        }
        r r1 = this.c.a(this.e, this.d);
        this.f = r1;
        return r1;
    }
}

