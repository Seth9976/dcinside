package androidx.privacysandbox.ads.adservices.adselection;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ReportImpressionRequest {
    private final long a;
    @l
    private final AdSelectionConfig b;

    public ReportImpressionRequest(long v, @l AdSelectionConfig adSelectionConfig0) {
        L.p(adSelectionConfig0, "adSelectionConfig");
        super();
        this.a = v;
        this.b = adSelectionConfig0;
    }

    @l
    public final AdSelectionConfig a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ReportImpressionRequest ? this.a == ((ReportImpressionRequest)object0).a && L.g(this.b, ((ReportImpressionRequest)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return ((int)(this.a ^ this.a >>> 0x20)) * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.a + ", adSelectionConfig=" + this.b;
    }
}

