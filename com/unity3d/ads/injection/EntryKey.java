package com.unity3d.ads.injection;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.reflect.d;
import y4.l;
import y4.m;

public final class EntryKey {
    @l
    private final d instanceClass;
    @l
    private final String named;

    public EntryKey(@l String s, @l d d0) {
        L.p(s, "named");
        L.p(d0, "instanceClass");
        super();
        this.named = s;
        this.instanceClass = d0;
    }

    public EntryKey(String s, d d0, int v, w w0) {
        if((v & 1) != 0) {
            s = "";
        }
        this(s, d0);
    }

    @l
    public final String component1() {
        return this.named;
    }

    @l
    public final d component2() {
        return this.instanceClass;
    }

    @l
    public final EntryKey copy(@l String s, @l d d0) {
        L.p(s, "named");
        L.p(d0, "instanceClass");
        return new EntryKey(s, d0);
    }

    public static EntryKey copy$default(EntryKey entryKey0, String s, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            s = entryKey0.named;
        }
        if((v & 2) != 0) {
            d0 = entryKey0.instanceClass;
        }
        return entryKey0.copy(s, d0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EntryKey)) {
            return false;
        }
        return L.g(this.named, ((EntryKey)object0).named) ? L.g(this.instanceClass, ((EntryKey)object0).instanceClass) : false;
    }

    @l
    public final d getInstanceClass() {
        return this.instanceClass;
    }

    @l
    public final String getNamed() {
        return this.named;
    }

    @Override
    public int hashCode() {
        return this.named.hashCode() * 0x1F + this.instanceClass.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }
}

