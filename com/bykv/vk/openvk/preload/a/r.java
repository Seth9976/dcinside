package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.d.a;
import com.bykv.vk.openvk.preload.a.d.b;
import com.bykv.vk.openvk.preload.a.d.c;
import java.io.IOException;

public abstract class r {
    public final r a() {
        return new r() {
            private r a;

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(a a0) throws IOException {
                if(a0.f() == b.i) {
                    a0.j();
                    return null;
                }
                return r.this.a(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                if(object0 == null) {
                    c0.h();
                    return;
                }
                r.this.a(c0, object0);
            }
        };
    }

    public abstract Object a(a arg1) throws IOException;

    public abstract void a(c arg1, Object arg2) throws IOException;
}

