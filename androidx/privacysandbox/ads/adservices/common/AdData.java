package androidx.privacysandbox.ads.adservices.common;

import android.net.Uri;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdData {
    @l
    private final Uri a;
    @l
    private final String b;

    public AdData(@l Uri uri0, @l String s) {
        L.p(uri0, "renderUri");
        L.p(s, "metadata");
        super();
        this.a = uri0;
        this.b = s;
    }

    @l
    public final String a() {
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
        return object0 instanceof AdData ? L.g(this.a, ((AdData)object0).a) && L.g(this.b, ((AdData)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AdData: renderUri=" + this.a + ", metadata=\'" + this.b + '\'';
    }
}

