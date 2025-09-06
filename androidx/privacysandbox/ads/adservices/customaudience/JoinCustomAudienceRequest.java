package androidx.privacysandbox.ads.adservices.customaudience;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class JoinCustomAudienceRequest {
    @l
    private final CustomAudience a;

    public JoinCustomAudienceRequest(@l CustomAudience customAudience0) {
        L.p(customAudience0, "customAudience");
        super();
        this.a = customAudience0;
    }

    @l
    public final CustomAudience a() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof JoinCustomAudienceRequest ? L.g(this.a, ((JoinCustomAudienceRequest)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.a;
    }
}

