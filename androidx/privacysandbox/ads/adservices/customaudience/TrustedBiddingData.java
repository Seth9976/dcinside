package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class TrustedBiddingData {
    @l
    private final Uri a;
    @l
    private final List b;

    public TrustedBiddingData(@l Uri uri0, @l List list0) {
        L.p(uri0, "trustedBiddingUri");
        L.p(list0, "trustedBiddingKeys");
        super();
        this.a = uri0;
        this.b = list0;
    }

    @l
    public final List a() {
        return this.b;
    }

    @l
    public final Uri b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TrustedBiddingData ? L.g(this.a, ((TrustedBiddingData)object0).a) && L.g(this.b, ((TrustedBiddingData)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.a + " trustedBiddingKeys=" + this.b;
    }
}

