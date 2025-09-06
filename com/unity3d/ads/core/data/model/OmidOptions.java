package com.unity3d.ads.core.data.model;

import com.iab.omid.library.unity3d.adsession.f;
import com.iab.omid.library.unity3d.adsession.j;
import com.iab.omid.library.unity3d.adsession.l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.m;

public final class OmidOptions {
    @m
    private final f creativeType;
    @m
    private final String customReferenceData;
    @m
    private final l impressionOwner;
    @m
    private final j impressionType;
    private final boolean isolateVerificationScripts;
    @m
    private final l mediaEventsOwner;
    @m
    private final l videoEventsOwner;

    public OmidOptions() {
        this(false, null, null, null, null, null, null, 0x7F, null);
    }

    public OmidOptions(boolean z, @m l l0, @m l l1, @m String s, @m j j0, @m f f0, @m l l2) {
        this.isolateVerificationScripts = z;
        this.impressionOwner = l0;
        this.videoEventsOwner = l1;
        this.customReferenceData = s;
        this.impressionType = j0;
        this.creativeType = f0;
        this.mediaEventsOwner = l2;
    }

    public OmidOptions(boolean z, l l0, l l1, String s, j j0, f f0, l l2, int v, w w0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z, ((v & 2) == 0 ? l0 : null), ((v & 4) == 0 ? l1 : null), ((v & 8) == 0 ? s : null), ((v & 16) == 0 ? j0 : null), ((v & 0x20) == 0 ? f0 : null), ((v & 0x40) == 0 ? l2 : null));
    }

    public final boolean component1() {
        return this.isolateVerificationScripts;
    }

    @m
    public final l component2() {
        return this.impressionOwner;
    }

    @m
    public final l component3() {
        return this.videoEventsOwner;
    }

    @m
    public final String component4() {
        return this.customReferenceData;
    }

    @m
    public final j component5() {
        return this.impressionType;
    }

    @m
    public final f component6() {
        return this.creativeType;
    }

    @m
    public final l component7() {
        return this.mediaEventsOwner;
    }

    @y4.l
    public final OmidOptions copy(boolean z, @m l l0, @m l l1, @m String s, @m j j0, @m f f0, @m l l2) {
        return new OmidOptions(z, l0, l1, s, j0, f0, l2);
    }

    public static OmidOptions copy$default(OmidOptions omidOptions0, boolean z, l l0, l l1, String s, j j0, f f0, l l2, int v, Object object0) {
        if((v & 1) != 0) {
            z = omidOptions0.isolateVerificationScripts;
        }
        if((v & 2) != 0) {
            l0 = omidOptions0.impressionOwner;
        }
        if((v & 4) != 0) {
            l1 = omidOptions0.videoEventsOwner;
        }
        if((v & 8) != 0) {
            s = omidOptions0.customReferenceData;
        }
        if((v & 16) != 0) {
            j0 = omidOptions0.impressionType;
        }
        if((v & 0x20) != 0) {
            f0 = omidOptions0.creativeType;
        }
        if((v & 0x40) != 0) {
            l2 = omidOptions0.mediaEventsOwner;
        }
        return omidOptions0.copy(z, l0, l1, s, j0, f0, l2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OmidOptions)) {
            return false;
        }
        if(this.isolateVerificationScripts != ((OmidOptions)object0).isolateVerificationScripts) {
            return false;
        }
        if(this.impressionOwner != ((OmidOptions)object0).impressionOwner) {
            return false;
        }
        if(this.videoEventsOwner != ((OmidOptions)object0).videoEventsOwner) {
            return false;
        }
        if(!L.g(this.customReferenceData, ((OmidOptions)object0).customReferenceData)) {
            return false;
        }
        if(this.impressionType != ((OmidOptions)object0).impressionType) {
            return false;
        }
        return this.creativeType == ((OmidOptions)object0).creativeType ? this.mediaEventsOwner == ((OmidOptions)object0).mediaEventsOwner : false;
    }

    @m
    public final f getCreativeType() {
        return this.creativeType;
    }

    @m
    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    @m
    public final l getImpressionOwner() {
        return this.impressionOwner;
    }

    @m
    public final j getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    @m
    public final l getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    @m
    public final l getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    @Override
    public int hashCode() {
        int v = this.isolateVerificationScripts;
        if(v) {
            v = 1;
        }
        int v1 = 0;
        int v2 = this.impressionOwner == null ? 0 : this.impressionOwner.hashCode();
        int v3 = this.videoEventsOwner == null ? 0 : this.videoEventsOwner.hashCode();
        int v4 = this.customReferenceData == null ? 0 : this.customReferenceData.hashCode();
        int v5 = this.impressionType == null ? 0 : this.impressionType.hashCode();
        int v6 = this.creativeType == null ? 0 : this.creativeType.hashCode();
        l l0 = this.mediaEventsOwner;
        if(l0 != null) {
            v1 = l0.hashCode();
        }
        return (((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v1;
    }

    @Override
    @y4.l
    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }
}

