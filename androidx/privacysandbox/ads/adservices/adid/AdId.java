package androidx.privacysandbox.ads.adservices.adid;

import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AdId {
    @l
    private final String a;
    private final boolean b;

    public AdId(@l String s, boolean z) {
        L.p(s, "adId");
        super();
        this.a = s;
        this.b = z;
    }

    public AdId(String s, boolean z, int v, w w0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(s, z);
    }

    @l
    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AdId ? L.g(this.a, ((AdId)object0).a) && this.b == ((AdId)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + c.a(this.b);
    }

    @Override
    @l
    public String toString() {
        return "AdId: adId=" + this.a + ", isLimitAdTrackingEnabled=" + this.b;
    }
}

