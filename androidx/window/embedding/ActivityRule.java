package androidx.window.embedding;

import androidx.compose.foundation.c;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalWindowApi
public final class ActivityRule extends EmbeddingRule {
    private final boolean a;
    @l
    private final Set b;

    public ActivityRule(@l Set set0, boolean z) {
        L.p(set0, "filters");
        super();
        this.a = z;
        this.b = u.a6(set0);
    }

    public ActivityRule(Set set0, boolean z, int v, w w0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(set0, z);
    }

    public final boolean a() {
        return this.a;
    }

    @l
    public final Set b() {
        return this.b;
    }

    @l
    public final ActivityRule c(@l ActivityFilter activityFilter0) {
        L.p(activityFilter0, "filter");
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        linkedHashSet0.addAll(this.b);
        linkedHashSet0.add(activityFilter0);
        return new ActivityRule(u.a6(linkedHashSet0), this.a);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ActivityRule)) {
            return false;
        }
        return L.g(this.b, ((ActivityRule)object0).b) ? this.a == ((ActivityRule)object0).a : false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() * 0x1F + c.a(this.a);
    }
}

