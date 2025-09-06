package androidx.privacysandbox.ads.adservices.customaudience;

import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LeaveCustomAudienceRequest {
    @l
    private final AdTechIdentifier a;
    @l
    private final String b;

    public LeaveCustomAudienceRequest(@l AdTechIdentifier adTechIdentifier0, @l String s) {
        L.p(adTechIdentifier0, "buyer");
        L.p(s, "name");
        super();
        this.a = adTechIdentifier0;
        this.b = s;
    }

    @l
    public final AdTechIdentifier a() {
        return this.a;
    }

    @l
    public final String b() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LeaveCustomAudienceRequest ? L.g(this.a, ((LeaveCustomAudienceRequest)object0).a) && L.g(this.b, ((LeaveCustomAudienceRequest)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.a + ", name=" + this.b;
    }
}

