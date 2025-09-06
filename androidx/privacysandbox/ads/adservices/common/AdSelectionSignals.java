package androidx.privacysandbox.ads.adservices.common;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdSelectionSignals {
    @l
    private final String a;

    public AdSelectionSignals(@l String s) {
        L.p(s, "signals");
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
        return object0 instanceof AdSelectionSignals ? L.g(this.a, ((AdSelectionSignals)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AdSelectionSignals: " + this.a;
    }
}

