package com.google.common.cache;

import J1.b;
import com.google.common.base.H;
import java.util.AbstractMap.SimpleImmutableEntry;
import o3.a;

@b
@i
public final class z extends AbstractMap.SimpleImmutableEntry {
    private final u a;
    private static final long b;

    private z(@a Object object0, @a Object object1, u u0) {
        super(object0, object1);
        this.a = (u)H.E(u0);
    }

    public static z a(@a Object object0, @a Object object1, u u0) {
        return new z(object0, object1, u0);
    }

    public u b() {
        return this.a;
    }

    public boolean c() {
        return this.a.b();
    }
}

