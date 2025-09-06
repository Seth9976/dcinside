package com.bykv.vk.openvk.preload.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g extends i implements Iterable {
    private final List a;

    public g() {
        this.a = new ArrayList();
    }

    @Override  // com.bykv.vk.openvk.preload.a.i
    public final Number a() {
        if(this.a.size() != 1) {
            throw new IllegalStateException();
        }
        return ((i)this.a.get(0)).a();
    }

    public final void a(i i0) {
        if(i0 == null) {
            i0 = k.a;
        }
        this.a.add(i0);
    }

    @Override  // com.bykv.vk.openvk.preload.a.i
    public final String b() {
        if(this.a.size() != 1) {
            throw new IllegalStateException();
        }
        return ((i)this.a.get(0)).b();
    }

    @Override  // com.bykv.vk.openvk.preload.a.i
    public final boolean c() {
        if(this.a.size() != 1) {
            throw new IllegalStateException();
        }
        return ((i)this.a.get(0)).c();
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this || object0 instanceof g && ((g)object0).a.equals(this.a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }
}

