package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AdObject {
    @m
    private final AdPlayer adPlayer;
    @l
    private final DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;
    @l
    private final UnityAdsLoadOptions loadOptions;
    @m
    private String offerwallPlacementName;
    @l
    private final ByteString opportunityId;
    @l
    private final String placementId;
    @m
    private String playerServerId;
    @m
    private String scarAdString;
    @m
    private String scarAdUnitId;
    @m
    private String scarQueryId;
    @l
    private ByteString trackingToken;

    public AdObject(@l ByteString byteString0, @l String s, @l ByteString byteString1, boolean z, @m String s1, @m String s2, @m String s3, boolean z1, @m String s4, @m AdPlayer adPlayer0, @m String s5, @l UnityAdsLoadOptions unityAdsLoadOptions0, boolean z2, @l DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0) {
        L.p(byteString0, "opportunityId");
        L.p(s, "placementId");
        L.p(byteString1, "trackingToken");
        L.p(unityAdsLoadOptions0, "loadOptions");
        L.p(diagnosticEventRequestOuterClass$DiagnosticAdType0, "adType");
        super();
        this.opportunityId = byteString0;
        this.placementId = s;
        this.trackingToken = byteString1;
        this.isScarAd = z;
        this.scarQueryId = s1;
        this.scarAdUnitId = s2;
        this.scarAdString = s3;
        this.isOfferwallAd = z1;
        this.offerwallPlacementName = s4;
        this.adPlayer = adPlayer0;
        this.playerServerId = s5;
        this.loadOptions = unityAdsLoadOptions0;
        this.isHeaderBidding = z2;
        this.adType = diagnosticEventRequestOuterClass$DiagnosticAdType0;
    }

    public AdObject(ByteString byteString0, String s, ByteString byteString1, boolean z, String s1, String s2, String s3, boolean z1, String s4, AdPlayer adPlayer0, String s5, UnityAdsLoadOptions unityAdsLoadOptions0, boolean z2, DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0, int v, w w0) {
        this(byteString0, s, byteString1, ((v & 8) == 0 ? z : false), ((v & 16) == 0 ? s1 : null), ((v & 0x20) == 0 ? s2 : null), ((v & 0x40) == 0 ? s3 : null), ((v & 0x80) == 0 ? z1 : false), ((v & 0x100) == 0 ? s4 : null), ((v & 0x200) == 0 ? adPlayer0 : null), ((v & 0x400) == 0 ? s5 : null), unityAdsLoadOptions0, z2, diagnosticEventRequestOuterClass$DiagnosticAdType0);
    }

    @l
    public final ByteString component1() {
        return this.opportunityId;
    }

    @m
    public final AdPlayer component10() {
        return this.adPlayer;
    }

    @m
    public final String component11() {
        return this.playerServerId;
    }

    @l
    public final UnityAdsLoadOptions component12() {
        return this.loadOptions;
    }

    public final boolean component13() {
        return this.isHeaderBidding;
    }

    @l
    public final DiagnosticAdType component14() {
        return this.adType;
    }

    @l
    public final String component2() {
        return this.placementId;
    }

    @l
    public final ByteString component3() {
        return this.trackingToken;
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
        return this.scarAdUnitId;
    }

    @m
    public final String component7() {
        return this.scarAdString;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    @m
    public final String component9() {
        return this.offerwallPlacementName;
    }

    @l
    public final AdObject copy(@l ByteString byteString0, @l String s, @l ByteString byteString1, boolean z, @m String s1, @m String s2, @m String s3, boolean z1, @m String s4, @m AdPlayer adPlayer0, @m String s5, @l UnityAdsLoadOptions unityAdsLoadOptions0, boolean z2, @l DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0) {
        L.p(byteString0, "opportunityId");
        L.p(s, "placementId");
        L.p(byteString1, "trackingToken");
        L.p(unityAdsLoadOptions0, "loadOptions");
        L.p(diagnosticEventRequestOuterClass$DiagnosticAdType0, "adType");
        return new AdObject(byteString0, s, byteString1, z, s1, s2, s3, z1, s4, adPlayer0, s5, unityAdsLoadOptions0, z2, diagnosticEventRequestOuterClass$DiagnosticAdType0);
    }

    public static AdObject copy$default(AdObject adObject0, ByteString byteString0, String s, ByteString byteString1, boolean z, String s1, String s2, String s3, boolean z1, String s4, AdPlayer adPlayer0, String s5, UnityAdsLoadOptions unityAdsLoadOptions0, boolean z2, DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0, int v, Object object0) {
        ByteString byteString2 = (v & 1) == 0 ? byteString0 : adObject0.opportunityId;
        String s6 = (v & 2) == 0 ? s : adObject0.placementId;
        ByteString byteString3 = (v & 4) == 0 ? byteString1 : adObject0.trackingToken;
        boolean z3 = (v & 8) == 0 ? z : adObject0.isScarAd;
        String s7 = (v & 16) == 0 ? s1 : adObject0.scarQueryId;
        String s8 = (v & 0x20) == 0 ? s2 : adObject0.scarAdUnitId;
        String s9 = (v & 0x40) == 0 ? s3 : adObject0.scarAdString;
        boolean z4 = (v & 0x80) == 0 ? z1 : adObject0.isOfferwallAd;
        String s10 = (v & 0x100) == 0 ? s4 : adObject0.offerwallPlacementName;
        AdPlayer adPlayer1 = (v & 0x200) == 0 ? adPlayer0 : adObject0.adPlayer;
        String s11 = (v & 0x400) == 0 ? s5 : adObject0.playerServerId;
        UnityAdsLoadOptions unityAdsLoadOptions1 = (v & 0x800) == 0 ? unityAdsLoadOptions0 : adObject0.loadOptions;
        boolean z5 = (v & 0x1000) == 0 ? z2 : adObject0.isHeaderBidding;
        return (v & 0x2000) == 0 ? adObject0.copy(byteString2, s6, byteString3, z3, s7, s8, s9, z4, s10, adPlayer1, s11, unityAdsLoadOptions1, z5, diagnosticEventRequestOuterClass$DiagnosticAdType0) : adObject0.copy(byteString2, s6, byteString3, z3, s7, s8, s9, z4, s10, adPlayer1, s11, unityAdsLoadOptions1, z5, adObject0.adType);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AdObject)) {
            return false;
        }
        if(!L.g(this.opportunityId, ((AdObject)object0).opportunityId)) {
            return false;
        }
        if(!L.g(this.placementId, ((AdObject)object0).placementId)) {
            return false;
        }
        if(!L.g(this.trackingToken, ((AdObject)object0).trackingToken)) {
            return false;
        }
        if(this.isScarAd != ((AdObject)object0).isScarAd) {
            return false;
        }
        if(!L.g(this.scarQueryId, ((AdObject)object0).scarQueryId)) {
            return false;
        }
        if(!L.g(this.scarAdUnitId, ((AdObject)object0).scarAdUnitId)) {
            return false;
        }
        if(!L.g(this.scarAdString, ((AdObject)object0).scarAdString)) {
            return false;
        }
        if(this.isOfferwallAd != ((AdObject)object0).isOfferwallAd) {
            return false;
        }
        if(!L.g(this.offerwallPlacementName, ((AdObject)object0).offerwallPlacementName)) {
            return false;
        }
        if(!L.g(this.adPlayer, ((AdObject)object0).adPlayer)) {
            return false;
        }
        if(!L.g(this.playerServerId, ((AdObject)object0).playerServerId)) {
            return false;
        }
        if(!L.g(this.loadOptions, ((AdObject)object0).loadOptions)) {
            return false;
        }
        return this.isHeaderBidding == ((AdObject)object0).isHeaderBidding ? this.adType == ((AdObject)object0).adType : false;
    }

    @m
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @l
    public final DiagnosticAdType getAdType() {
        return this.adType;
    }

    @l
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @m
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @l
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @l
    public final String getPlacementId() {
        return this.placementId;
    }

    @m
    public final String getPlayerServerId() {
        return this.playerServerId;
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

    @l
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    @Override
    public int hashCode() {
        int v = this.opportunityId.hashCode();
        int v1 = this.placementId.hashCode();
        int v2 = this.trackingToken.hashCode();
        int v3 = this.isScarAd;
        int v4 = 1;
        if(v3) {
            v3 = 1;
        }
        int v5 = 0;
        int v6 = this.scarQueryId == null ? 0 : this.scarQueryId.hashCode();
        int v7 = this.scarAdUnitId == null ? 0 : this.scarAdUnitId.hashCode();
        int v8 = this.scarAdString == null ? 0 : this.scarAdString.hashCode();
        int v9 = this.isOfferwallAd;
        if(v9) {
            v9 = 1;
        }
        int v10 = this.offerwallPlacementName == null ? 0 : this.offerwallPlacementName.hashCode();
        int v11 = this.adPlayer == null ? 0 : this.adPlayer.hashCode();
        String s = this.playerServerId;
        if(s != null) {
            v5 = s.hashCode();
        }
        int v12 = this.loadOptions.hashCode();
        if(!this.isHeaderBidding) {
            v4 = false;
        }
        return ((((((((((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v5) * 0x1F + v12) * 0x1F + v4) * 0x1F + this.adType.hashCode();
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setOfferwallAd(boolean z) {
        this.isOfferwallAd = z;
    }

    public final void setOfferwallPlacementName(@m String s) {
        this.offerwallPlacementName = s;
    }

    public final void setPlayerServerId(@m String s) {
        this.playerServerId = s;
    }

    public final void setScarAd(boolean z) {
        this.isScarAd = z;
    }

    public final void setScarAdString(@m String s) {
        this.scarAdString = s;
    }

    public final void setScarAdUnitId(@m String s) {
        this.scarAdUnitId = s;
    }

    public final void setScarQueryId(@m String s) {
        this.scarQueryId = s;
    }

    public final void setTrackingToken(@l ByteString byteString0) {
        L.p(byteString0, "<set-?>");
        this.trackingToken = byteString0;
    }

    @Override
    @l
    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ')';
    }
}

