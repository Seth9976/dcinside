package com.unity3d.ads.adplayer;

import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AndroidShowOptions implements ShowOptions {
    @l
    private final WeakReference activity;
    private final boolean isOfferwallAd;
    private final boolean isScarAd;
    @m
    private final String offerwallPlacementName;
    @m
    private final String placementId;
    @m
    private final String scarAdString;
    @m
    private final String scarAdUnitId;
    @m
    private final String scarQueryId;
    @m
    private final Map unityAdsShowOptions;

    public AndroidShowOptions(@l WeakReference weakReference0, @m Map map0, @m String s, boolean z, @m String s1, @m String s2, @m String s3, boolean z1, @m String s4) {
        L.p(weakReference0, "activity");
        super();
        this.activity = weakReference0;
        this.unityAdsShowOptions = map0;
        this.placementId = s;
        this.isScarAd = z;
        this.scarQueryId = s1;
        this.scarAdString = s2;
        this.scarAdUnitId = s3;
        this.isOfferwallAd = z1;
        this.offerwallPlacementName = s4;
    }

    public AndroidShowOptions(WeakReference weakReference0, Map map0, String s, boolean z, String s1, String s2, String s3, boolean z1, String s4, int v, w w0) {
        this(weakReference0, map0, ((v & 4) == 0 ? s : null), ((v & 8) == 0 ? z : false), ((v & 16) == 0 ? s1 : null), ((v & 0x20) == 0 ? s2 : null), ((v & 0x40) == 0 ? s3 : null), ((v & 0x80) == 0 ? z1 : false), ((v & 0x100) == 0 ? s4 : null));
    }

    @l
    public final WeakReference component1() {
        return this.activity;
    }

    @m
    public final Map component2() {
        return this.unityAdsShowOptions;
    }

    @m
    public final String component3() {
        return this.placementId;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    @m
    public final String component5() {
        return this.scarQueryId;
    }

    @m
    public final String component6() {
        return this.scarAdString;
    }

    @m
    public final String component7() {
        return this.scarAdUnitId;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    @m
    public final String component9() {
        return this.offerwallPlacementName;
    }

    @l
    public final AndroidShowOptions copy(@l WeakReference weakReference0, @m Map map0, @m String s, boolean z, @m String s1, @m String s2, @m String s3, boolean z1, @m String s4) {
        L.p(weakReference0, "activity");
        return new AndroidShowOptions(weakReference0, map0, s, z, s1, s2, s3, z1, s4);
    }

    public static AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions0, WeakReference weakReference0, Map map0, String s, boolean z, String s1, String s2, String s3, boolean z1, String s4, int v, Object object0) {
        WeakReference weakReference1 = (v & 1) == 0 ? weakReference0 : androidShowOptions0.activity;
        Map map1 = (v & 2) == 0 ? map0 : androidShowOptions0.unityAdsShowOptions;
        String s5 = (v & 4) == 0 ? s : androidShowOptions0.placementId;
        boolean z2 = (v & 8) == 0 ? z : androidShowOptions0.isScarAd;
        String s6 = (v & 16) == 0 ? s1 : androidShowOptions0.scarQueryId;
        String s7 = (v & 0x20) == 0 ? s2 : androidShowOptions0.scarAdString;
        String s8 = (v & 0x40) == 0 ? s3 : androidShowOptions0.scarAdUnitId;
        boolean z3 = (v & 0x80) == 0 ? z1 : androidShowOptions0.isOfferwallAd;
        return (v & 0x100) == 0 ? androidShowOptions0.copy(weakReference1, map1, s5, z2, s6, s7, s8, z3, s4) : androidShowOptions0.copy(weakReference1, map1, s5, z2, s6, s7, s8, z3, androidShowOptions0.offerwallPlacementName);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AndroidShowOptions)) {
            return false;
        }
        if(!L.g(this.activity, ((AndroidShowOptions)object0).activity)) {
            return false;
        }
        if(!L.g(this.unityAdsShowOptions, ((AndroidShowOptions)object0).unityAdsShowOptions)) {
            return false;
        }
        if(!L.g(this.placementId, ((AndroidShowOptions)object0).placementId)) {
            return false;
        }
        if(this.isScarAd != ((AndroidShowOptions)object0).isScarAd) {
            return false;
        }
        if(!L.g(this.scarQueryId, ((AndroidShowOptions)object0).scarQueryId)) {
            return false;
        }
        if(!L.g(this.scarAdString, ((AndroidShowOptions)object0).scarAdString)) {
            return false;
        }
        if(!L.g(this.scarAdUnitId, ((AndroidShowOptions)object0).scarAdUnitId)) {
            return false;
        }
        return this.isOfferwallAd == ((AndroidShowOptions)object0).isOfferwallAd ? L.g(this.offerwallPlacementName, ((AndroidShowOptions)object0).offerwallPlacementName) : false;
    }

    @l
    public final WeakReference getActivity() {
        return this.activity;
    }

    @m
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @m
    public final String getPlacementId() {
        return this.placementId;
    }

    @m
    public final String getScarAdString() {
        return this.scarAdString;
    }

    @m
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @m
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @m
    public final Map getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    @Override
    public int hashCode() {
        int v = this.activity.hashCode();
        int v1 = 0;
        int v2 = this.unityAdsShowOptions == null ? 0 : this.unityAdsShowOptions.hashCode();
        int v3 = this.placementId == null ? 0 : this.placementId.hashCode();
        int v4 = this.isScarAd;
        int v5 = 1;
        if(v4) {
            v4 = 1;
        }
        int v6 = this.scarQueryId == null ? 0 : this.scarQueryId.hashCode();
        int v7 = this.scarAdString == null ? 0 : this.scarAdString.hashCode();
        int v8 = this.scarAdUnitId == null ? 0 : this.scarAdUnitId.hashCode();
        if(!this.isOfferwallAd) {
            v5 = false;
        }
        String s = this.offerwallPlacementName;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v5) * 0x1F + v1;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    @Override
    @l
    public String toString() {
        return "AndroidShowOptions(activity=" + this.activity + ", unityAdsShowOptions=" + this.unityAdsShowOptions + ", placementId=" + this.placementId + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdString=" + this.scarAdString + ", scarAdUnitId=" + this.scarAdUnitId + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ')';
    }
}

