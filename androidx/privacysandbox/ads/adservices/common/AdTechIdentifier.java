package androidx.privacysandbox.ads.adservices.common;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdTechIdentifier {
    @l
    private final String a;

    public AdTechIdentifier(@l String s) {
        L.p(s, "identifier");
        super();
        this.a = s;
    }

    @l
    public final String a() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AdTechIdentifier ? L.g(this.a, ((AdTechIdentifier)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return String.valueOf(this.a);
    }
}

