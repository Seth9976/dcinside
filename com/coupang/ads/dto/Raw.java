package com.coupang.ads.dto;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class Raw implements DTO {
    @m
    private final List values;

    public Raw() {
        this(null, 1, null);
    }

    public Raw(@m List list0) {
        this.values = list0;
    }

    public Raw(List list0, int v, w w0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        this(list0);
    }

    @m
    public final List component1() {
        return this.values;
    }

    @l
    public final Raw copy(@m List list0) {
        return new Raw(list0);
    }

    public static Raw copy$default(Raw raw0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = raw0.values;
        }
        return raw0.copy(list0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Raw ? L.g(this.values, ((Raw)object0).values) : false;
    }

    @m
    public final List getValues() {
        return this.values;
    }

    @Override
    public int hashCode() {
        return this.values == null ? 0 : this.values.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "Raw(values=" + this.values + ')';
    }
}

