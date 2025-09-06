package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class OfferwallEventData {
    @m
    private final Integer errorCode;
    @m
    private final String errorMessage;
    @l
    private final OfferwallEvent offerwallEvent;
    @m
    private final String placementName;

    public OfferwallEventData(@l OfferwallEvent offerwallEvent0, @m String s, @m String s1, @m Integer integer0) {
        L.p(offerwallEvent0, "offerwallEvent");
        super();
        this.offerwallEvent = offerwallEvent0;
        this.placementName = s;
        this.errorMessage = s1;
        this.errorCode = integer0;
    }

    public OfferwallEventData(OfferwallEvent offerwallEvent0, String s, String s1, Integer integer0, int v, w w0) {
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        if((v & 8) != 0) {
            integer0 = null;
        }
        this(offerwallEvent0, s, s1, integer0);
    }

    @l
    public final OfferwallEvent component1() {
        return this.offerwallEvent;
    }

    @m
    public final String component2() {
        return this.placementName;
    }

    @m
    public final String component3() {
        return this.errorMessage;
    }

    @m
    public final Integer component4() {
        return this.errorCode;
    }

    @l
    public final OfferwallEventData copy(@l OfferwallEvent offerwallEvent0, @m String s, @m String s1, @m Integer integer0) {
        L.p(offerwallEvent0, "offerwallEvent");
        return new OfferwallEventData(offerwallEvent0, s, s1, integer0);
    }

    public static OfferwallEventData copy$default(OfferwallEventData offerwallEventData0, OfferwallEvent offerwallEvent0, String s, String s1, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            offerwallEvent0 = offerwallEventData0.offerwallEvent;
        }
        if((v & 2) != 0) {
            s = offerwallEventData0.placementName;
        }
        if((v & 4) != 0) {
            s1 = offerwallEventData0.errorMessage;
        }
        if((v & 8) != 0) {
            integer0 = offerwallEventData0.errorCode;
        }
        return offerwallEventData0.copy(offerwallEvent0, s, s1, integer0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OfferwallEventData)) {
            return false;
        }
        if(this.offerwallEvent != ((OfferwallEventData)object0).offerwallEvent) {
            return false;
        }
        if(!L.g(this.placementName, ((OfferwallEventData)object0).placementName)) {
            return false;
        }
        return L.g(this.errorMessage, ((OfferwallEventData)object0).errorMessage) ? L.g(this.errorCode, ((OfferwallEventData)object0).errorCode) : false;
    }

    @m
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @m
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @l
    public final OfferwallEvent getOfferwallEvent() {
        return this.offerwallEvent;
    }

    @m
    public final String getPlacementName() {
        return this.placementName;
    }

    @Override
    public int hashCode() {
        int v = this.offerwallEvent.hashCode();
        int v1 = 0;
        int v2 = this.placementName == null ? 0 : this.placementName.hashCode();
        int v3 = this.errorMessage == null ? 0 : this.errorMessage.hashCode();
        Integer integer0 = this.errorCode;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    @l
    public String toString() {
        return "OfferwallEventData(offerwallEvent=" + this.offerwallEvent + ", placementName=" + this.placementName + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }
}

