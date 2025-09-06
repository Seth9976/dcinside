package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdSelectionOutcome {
    private final long a;
    @l
    private final Uri b;

    public AdSelectionOutcome(long v, @l Uri uri0) {
        L.p(uri0, "renderUri");
        super();
        this.a = v;
        this.b = uri0;
    }

    public final long a() {
        return this.a;
    }

    @l
    public final Uri b() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AdSelectionOutcome ? this.a == ((AdSelectionOutcome)object0).a && L.g(this.b, ((AdSelectionOutcome)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return ((int)(this.a ^ this.a >>> 0x20)) * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.a + ", renderUri=" + this.b;
    }
}

