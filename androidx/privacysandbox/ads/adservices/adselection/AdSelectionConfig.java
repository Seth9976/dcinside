package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdSelectionConfig {
    @l
    private final AdTechIdentifier a;
    @l
    private final Uri b;
    @l
    private final List c;
    @l
    private final AdSelectionSignals d;
    @l
    private final AdSelectionSignals e;
    @l
    private final Map f;
    @l
    private final Uri g;

    public AdSelectionConfig(@l AdTechIdentifier adTechIdentifier0, @l Uri uri0, @l List list0, @l AdSelectionSignals adSelectionSignals0, @l AdSelectionSignals adSelectionSignals1, @l Map map0, @l Uri uri1) {
        L.p(adTechIdentifier0, "seller");
        L.p(uri0, "decisionLogicUri");
        L.p(list0, "customAudienceBuyers");
        L.p(adSelectionSignals0, "adSelectionSignals");
        L.p(adSelectionSignals1, "sellerSignals");
        L.p(map0, "perBuyerSignals");
        L.p(uri1, "trustedScoringSignalsUri");
        super();
        this.a = adTechIdentifier0;
        this.b = uri0;
        this.c = list0;
        this.d = adSelectionSignals0;
        this.e = adSelectionSignals1;
        this.f = map0;
        this.g = uri1;
    }

    @l
    public final AdSelectionSignals a() {
        return this.d;
    }

    @l
    public final List b() {
        return this.c;
    }

    @l
    public final Uri c() {
        return this.b;
    }

    @l
    public final Map d() {
        return this.f;
    }

    @l
    public final AdTechIdentifier e() {
        return this.a;
    }

    // 去混淆评级： 低(26)
    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AdSelectionConfig ? L.g(this.a, ((AdSelectionConfig)object0).a) && L.g(this.b, ((AdSelectionConfig)object0).b) && L.g(this.c, ((AdSelectionConfig)object0).c) && L.g(this.d, ((AdSelectionConfig)object0).d) && L.g(this.e, ((AdSelectionConfig)object0).e) && L.g(this.f, ((AdSelectionConfig)object0).f) && L.g(this.g, ((AdSelectionConfig)object0).g) : false;
    }

    @l
    public final AdSelectionSignals f() {
        return this.e;
    }

    @l
    public final Uri g() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return (((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AdSelectionConfig: seller=" + this.a + ", decisionLogicUri=\'" + this.b + "\', customAudienceBuyers=" + this.c + ", adSelectionSignals=" + this.d + ", sellerSignals=" + this.e + ", perBuyerSignals=" + this.f + ", trustedScoringSignalsUri=" + this.g;
    }
}

