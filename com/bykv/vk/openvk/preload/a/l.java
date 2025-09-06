package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.b.g;
import java.util.Set;

public final class l extends i {
    private final g a;

    public l() {
        this.a = new g();
    }

    public final void a(String s, i i0) {
        g g0 = this.a;
        if(i0 == null) {
            i0 = k.a;
        }
        g0.put(s, i0);
    }

    public final Set d() {
        return this.a.entrySet();
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this || object0 instanceof l && ((l)object0).a.equals(this.a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

