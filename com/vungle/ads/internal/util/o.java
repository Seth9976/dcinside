package com.vungle.ads.internal.util;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class o {
    @m
    private String adSource;
    @m
    private String creativeId;
    @m
    private String eventId;
    @m
    private String placementRefId;

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(o.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.vungle.ads.internal.util.LogEntry");
        if(!L.g(this.placementRefId, ((o)object0).placementRefId)) {
            return false;
        }
        if(!L.g(this.creativeId, ((o)object0).creativeId)) {
            return false;
        }
        return L.g(this.eventId, ((o)object0).eventId) ? L.g(this.adSource, ((o)object0).adSource) : false;
    }

    @m
    public final String getAdSource$vungle_ads_release() {
        return this.adSource;
    }

    @m
    public final String getCreativeId$vungle_ads_release() {
        return this.creativeId;
    }

    @m
    public final String getEventId$vungle_ads_release() {
        return this.eventId;
    }

    @m
    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.placementRefId == null ? 0 : this.placementRefId.hashCode();
        int v2 = this.creativeId == null ? 0 : this.creativeId.hashCode();
        int v3 = this.eventId == null ? 0 : this.eventId.hashCode();
        String s = this.adSource;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    public final void setAdSource$vungle_ads_release(@m String s) {
        this.adSource = s;
    }

    public final void setCreativeId$vungle_ads_release(@m String s) {
        this.creativeId = s;
    }

    public final void setEventId$vungle_ads_release(@m String s) {
        this.eventId = s;
    }

    public final void setPlacementRefId$vungle_ads_release(@m String s) {
        this.placementRefId = s;
    }

    @Override
    @l
    public String toString() {
        return "LogEntry(placementRefId=" + this.placementRefId + ", creativeId=" + this.creativeId + ", eventId=" + this.eventId + ", adSource=" + this.adSource + ')';
    }
}

