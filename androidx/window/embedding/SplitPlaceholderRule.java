package androidx.window.embedding;

import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalWindowApi
public final class SplitPlaceholderRule extends SplitRule {
    @l
    private final Intent e;
    @l
    private final Set f;

    public SplitPlaceholderRule(@l Set set0, @l Intent intent0, int v, int v1, float f, int v2) {
        L.p(set0, "filters");
        L.p(intent0, "placeholderIntent");
        super(v, v1, f, v2);
        this.e = intent0;
        this.f = u.a6(set0);
    }

    public SplitPlaceholderRule(Set set0, Intent intent0, int v, int v1, float f, int v2, int v3, w w0) {
        this(set0, intent0, ((v3 & 4) == 0 ? v : 0), ((v3 & 8) == 0 ? v1 : 0), ((v3 & 16) == 0 ? f : 0.5f), ((v3 & 0x20) == 0 ? v2 : 3));
    }

    @Override  // androidx.window.embedding.SplitRule
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SplitPlaceholderRule)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        return L.g(this.f, ((SplitPlaceholderRule)object0).f) ? L.g(this.e, ((SplitPlaceholderRule)object0).e) : false;
    }

    @l
    public final Set f() {
        return this.f;
    }

    @l
    public final Intent g() {
        return this.e;
    }

    @l
    public final SplitPlaceholderRule h(@l ActivityFilter activityFilter0) {
        L.p(activityFilter0, "filter");
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        linkedHashSet0.addAll(this.f);
        linkedHashSet0.add(activityFilter0);
        return new SplitPlaceholderRule(u.a6(linkedHashSet0), this.e, this.d(), this.c(), this.e(), this.b());
    }

    @Override  // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (super.hashCode() * 0x1F + this.f.hashCode()) * 0x1F + this.e.hashCode();
    }
}

