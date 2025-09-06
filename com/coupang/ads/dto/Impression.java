package com.coupang.ads.dto;

import J.c;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class Impression implements DTO {
    @m
    private final String impressionUrl;
    @l
    private MutableLiveData state;

    public Impression() {
        this(null, null, 3, null);
    }

    public Impression(@m String s, @l MutableLiveData mutableLiveData0) {
        L.p(mutableLiveData0, "state");
        super();
        this.impressionUrl = s;
        this.state = mutableLiveData0;
    }

    public Impression(String s, MutableLiveData mutableLiveData0, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            mutableLiveData0 = new MutableLiveData(c.a);
        }
        this(s, mutableLiveData0);
    }

    @m
    public final String component1() {
        return this.impressionUrl;
    }

    @l
    public final MutableLiveData component2() {
        return this.state;
    }

    @l
    public final Impression copy(@m String s, @l MutableLiveData mutableLiveData0) {
        L.p(mutableLiveData0, "state");
        return new Impression(s, mutableLiveData0);
    }

    public static Impression copy$default(Impression impression0, String s, MutableLiveData mutableLiveData0, int v, Object object0) {
        if((v & 1) != 0) {
            s = impression0.impressionUrl;
        }
        if((v & 2) != 0) {
            mutableLiveData0 = impression0.state;
        }
        return impression0.copy(s, mutableLiveData0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Impression)) {
            return false;
        }
        return L.g(this.impressionUrl, ((Impression)object0).impressionUrl) ? L.g(this.state, ((Impression)object0).state) : false;
    }

    @m
    public final String getImpressionUrl() {
        return this.impressionUrl;
    }

    @l
    public final MutableLiveData getState() {
        return this.state;
    }

    @Override
    public int hashCode() {
        return this.impressionUrl == null ? this.state.hashCode() : this.impressionUrl.hashCode() * 0x1F + this.state.hashCode();
    }

    public final void setState(@l MutableLiveData mutableLiveData0) {
        L.p(mutableLiveData0, "<set-?>");
        this.state = mutableLiveData0;
    }

    @Override
    @l
    public String toString() {
        return "Impression(impressionUrl=" + this.impressionUrl + ", state=" + this.state + ')';
    }
}

