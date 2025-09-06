package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import j..time.Instant;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class CustomAudience {
    public static final class Builder {
        @l
        private AdTechIdentifier a;
        @l
        private String b;
        @l
        private Uri c;
        @l
        private Uri d;
        @l
        private List e;
        @m
        private Instant f;
        @m
        private Instant g;
        @m
        private AdSelectionSignals h;
        @m
        private TrustedBiddingData i;

        public Builder(@l AdTechIdentifier adTechIdentifier0, @l String s, @l Uri uri0, @l Uri uri1, @l List list0) {
            L.p(adTechIdentifier0, "buyer");
            L.p(s, "name");
            L.p(uri0, "dailyUpdateUri");
            L.p(uri1, "biddingLogicUri");
            L.p(list0, "ads");
            super();
            this.a = adTechIdentifier0;
            this.b = s;
            this.c = uri0;
            this.d = uri1;
            this.e = list0;
        }

        @l
        public final CustomAudience a() {
            return new CustomAudience(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @l
        public final Builder b(@l Instant instant0) {
            L.p(instant0, "activationTime");
            this.f = instant0;
            return this;
        }

        @l
        public final Builder c(@l List list0) {
            L.p(list0, "ads");
            this.e = list0;
            return this;
        }

        @l
        public final Builder d(@l Uri uri0) {
            L.p(uri0, "biddingLogicUri");
            this.d = uri0;
            return this;
        }

        @l
        public final Builder e(@l AdTechIdentifier adTechIdentifier0) {
            L.p(adTechIdentifier0, "buyer");
            this.a = adTechIdentifier0;
            return this;
        }

        @l
        public final Builder f(@l Uri uri0) {
            L.p(uri0, "dailyUpdateUri");
            this.c = uri0;
            return this;
        }

        @l
        public final Builder g(@l Instant instant0) {
            L.p(instant0, "expirationTime");
            this.g = instant0;
            return this;
        }

        @l
        public final Builder h(@l String s) {
            L.p(s, "name");
            this.b = s;
            return this;
        }

        @l
        public final Builder i(@l TrustedBiddingData trustedBiddingData0) {
            L.p(trustedBiddingData0, "trustedBiddingSignals");
            this.i = trustedBiddingData0;
            return this;
        }

        @l
        public final Builder j(@l AdSelectionSignals adSelectionSignals0) {
            L.p(adSelectionSignals0, "userBiddingSignals");
            this.h = adSelectionSignals0;
            return this;
        }
    }

    @l
    private final AdTechIdentifier a;
    @l
    private final String b;
    @l
    private final Uri c;
    @l
    private final Uri d;
    @l
    private final List e;
    @m
    private final Instant f;
    @m
    private final Instant g;
    @m
    private final AdSelectionSignals h;
    @m
    private final TrustedBiddingData i;

    public CustomAudience(@l AdTechIdentifier adTechIdentifier0, @l String s, @l Uri uri0, @l Uri uri1, @l List list0, @m Instant instant0, @m Instant instant1, @m AdSelectionSignals adSelectionSignals0, @m TrustedBiddingData trustedBiddingData0) {
        L.p(adTechIdentifier0, "buyer");
        L.p(s, "name");
        L.p(uri0, "dailyUpdateUri");
        L.p(uri1, "biddingLogicUri");
        L.p(list0, "ads");
        super();
        this.a = adTechIdentifier0;
        this.b = s;
        this.c = uri0;
        this.d = uri1;
        this.e = list0;
        this.f = instant0;
        this.g = instant1;
        this.h = adSelectionSignals0;
        this.i = trustedBiddingData0;
    }

    public CustomAudience(AdTechIdentifier adTechIdentifier0, String s, Uri uri0, Uri uri1, List list0, Instant instant0, Instant instant1, AdSelectionSignals adSelectionSignals0, TrustedBiddingData trustedBiddingData0, int v, w w0) {
        this(adTechIdentifier0, s, uri0, uri1, list0, ((v & 0x20) == 0 ? instant0 : null), ((v & 0x40) == 0 ? instant1 : null), ((v & 0x80) == 0 ? adSelectionSignals0 : null), ((v & 0x100) == 0 ? trustedBiddingData0 : null));
    }

    @m
    public final Instant a() {
        return this.f;
    }

    @l
    public final List b() {
        return this.e;
    }

    @l
    public final Uri c() {
        return this.d;
    }

    @l
    public final AdTechIdentifier d() {
        return this.a;
    }

    @l
    public final Uri e() {
        return this.c;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof CustomAudience ? L.g(this.a, ((CustomAudience)object0).a) && L.g(this.b, ((CustomAudience)object0).b) && L.g(this.f, ((CustomAudience)object0).f) && L.g(this.g, ((CustomAudience)object0).g) && L.g(this.c, ((CustomAudience)object0).c) && L.g(this.h, ((CustomAudience)object0).h) && L.g(this.i, ((CustomAudience)object0).i) && L.g(this.e, ((CustomAudience)object0).e) : false;
    }

    @m
    public final Instant f() {
        return this.g;
    }

    @l
    public final String g() {
        return this.b;
    }

    @m
    public final TrustedBiddingData h() {
        return this.i;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = 0;
        int v3 = this.f == null ? 0 : this.f.hashCode();
        int v4 = this.g == null ? 0 : this.g.hashCode();
        int v5 = this.c.hashCode();
        int v6 = this.h == null ? 0 : this.h.hashCode();
        TrustedBiddingData trustedBiddingData0 = this.i;
        if(trustedBiddingData0 != null) {
            v2 = trustedBiddingData0.hashCode();
        }
        return (((((((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v2) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @m
    public final AdSelectionSignals i() {
        return this.h;
    }

    @Override
    @l
    public String toString() {
        return "CustomAudience: buyer=" + this.d + ", activationTime=" + this.f + ", expirationTime=" + this.g + ", dailyUpdateUri=" + this.c + ", userBiddingSignals=" + this.h + ", trustedBiddingSignals=" + this.i + ", biddingLogicUri=" + this.d + ", ads=" + this.e;
    }
}

