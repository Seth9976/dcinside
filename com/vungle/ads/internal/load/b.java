package com.vungle.ads.internal.load;

import com.vungle.ads.b1;
import com.vungle.ads.internal.model.e;
import java.io.Serializable;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class b implements Serializable {
    @m
    private final e adMarkup;
    @l
    private final com.vungle.ads.internal.model.m placement;
    @m
    private final b1 requestAdSize;

    public b(@l com.vungle.ads.internal.model.m m0, @m e e0, @m b1 b10) {
        L.p(m0, "placement");
        super();
        this.placement = m0;
        this.adMarkup = e0;
        this.requestAdSize = b10;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!L.g(b.class, class0) || !L.g(this.placement.getReferenceId(), ((b)object0).placement.getReferenceId())) {
                return false;
            }
            if(!L.g(this.requestAdSize, ((b)object0).requestAdSize)) {
                return false;
            }
            e e0 = ((b)object0).adMarkup;
            return this.adMarkup == null ? e0 == null : L.g(this.adMarkup, e0);
        }
        return false;
    }

    @m
    public final e getAdMarkup() {
        return this.adMarkup;
    }

    @l
    public final com.vungle.ads.internal.model.m getPlacement() {
        return this.placement;
    }

    @m
    public final b1 getRequestAdSize() {
        return this.requestAdSize;
    }

    @Override
    public int hashCode() {
        int v = this.placement.getReferenceId().hashCode();
        int v1 = 0;
        int v2 = this.requestAdSize == null ? 0 : this.requestAdSize.hashCode();
        e e0 = this.adMarkup;
        if(e0 != null) {
            v1 = e0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    @l
    public String toString() {
        return "AdRequest{placementId=\'" + this.placement.getReferenceId() + "\', adMarkup=" + this.adMarkup + ", requestAdSize=" + this.requestAdSize + '}';
    }
}

