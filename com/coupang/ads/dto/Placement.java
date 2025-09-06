package com.coupang.ads.dto;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class Placement implements DTO {
    @m
    private final String id;
    @m
    private final String name;

    public Placement() {
        this(null, null, 3, null);
    }

    public Placement(@m String s, @m String s1) {
        this.name = s;
        this.id = s1;
    }

    public Placement(String s, String s1, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        this(s, s1);
    }

    @m
    public final String component1() {
        return this.name;
    }

    @m
    public final String component2() {
        return this.id;
    }

    @l
    public final Placement copy(@m String s, @m String s1) {
        return new Placement(s, s1);
    }

    public static Placement copy$default(Placement placement0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = placement0.name;
        }
        if((v & 2) != 0) {
            s1 = placement0.id;
        }
        return placement0.copy(s, s1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Placement)) {
            return false;
        }
        return L.g(this.name, ((Placement)object0).name) ? L.g(this.id, ((Placement)object0).id) : false;
    }

    @m
    public final String getId() {
        return this.id;
    }

    @m
    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.name == null ? 0 : this.name.hashCode();
        String s = this.id;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "Placement(name=" + this.name + ", id=" + this.id + ')';
    }
}

