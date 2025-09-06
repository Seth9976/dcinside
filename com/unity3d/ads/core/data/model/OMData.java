package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class OMData {
    @l
    private final String partnerName;
    @l
    private final String partnerVersion;
    @l
    private final String version;

    public OMData(@l String s, @l String s1, @l String s2) {
        L.p(s, "version");
        L.p(s1, "partnerName");
        L.p(s2, "partnerVersion");
        super();
        this.version = s;
        this.partnerName = s1;
        this.partnerVersion = s2;
    }

    @l
    public final String component1() {
        return this.version;
    }

    @l
    public final String component2() {
        return this.partnerName;
    }

    @l
    public final String component3() {
        return this.partnerVersion;
    }

    @l
    public final OMData copy(@l String s, @l String s1, @l String s2) {
        L.p(s, "version");
        L.p(s1, "partnerName");
        L.p(s2, "partnerVersion");
        return new OMData(s, s1, s2);
    }

    public static OMData copy$default(OMData oMData0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = oMData0.version;
        }
        if((v & 2) != 0) {
            s1 = oMData0.partnerName;
        }
        if((v & 4) != 0) {
            s2 = oMData0.partnerVersion;
        }
        return oMData0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OMData)) {
            return false;
        }
        if(!L.g(this.version, ((OMData)object0).version)) {
            return false;
        }
        return L.g(this.partnerName, ((OMData)object0).partnerName) ? L.g(this.partnerVersion, ((OMData)object0).partnerVersion) : false;
    }

    @l
    public final String getPartnerName() {
        return this.partnerName;
    }

    @l
    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    @l
    public final String getVersion() {
        return this.version;
    }

    @Override
    public int hashCode() {
        return (this.version.hashCode() * 0x1F + this.partnerName.hashCode()) * 0x1F + this.partnerVersion.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "OMData(version=" + this.version + ", partnerName=" + this.partnerName + ", partnerVersion=" + this.partnerVersion + ')';
    }
}

