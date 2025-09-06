package androidx.privacysandbox.ads.adservices.topics;

import j..util.Objects;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class GetTopicsResponse {
    @l
    private final List a;

    public GetTopicsResponse(@l List list0) {
        L.p(list0, "topics");
        super();
        this.a = list0;
    }

    @l
    public final List a() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GetTopicsResponse)) {
            return false;
        }
        return this.a.size() == ((GetTopicsResponse)object0).a.size() ? L.g(new HashSet(this.a), new HashSet(((GetTopicsResponse)object0).a)) : false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    @Override
    @l
    public String toString() {
        return "Topics=" + this.a;
    }
}

