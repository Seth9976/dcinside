package com.facebook.imagepipeline.cache;

import java.util.LinkedHashSet;
import p3.d;
import y4.l;

@d
public final class e {
    private final int a;
    @l
    private final LinkedHashSet b;

    public e(int v) {
        this.a = v;
        this.b = new LinkedHashSet(v);
    }

    public final boolean a(Object object0) {
        synchronized(this) {
            if(this.b.size() == this.a) {
                Object object1 = this.b.iterator().next();
                this.b.remove(object1);
            }
            this.b.remove(object0);
            return this.b.add(object0);
        }
    }

    public final boolean b(Object object0) {
        synchronized(this) {
            return this.b.contains(object0);
        }
    }
}

