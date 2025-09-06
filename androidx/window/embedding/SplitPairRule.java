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
public final class SplitPairRule extends SplitRule {
    private final boolean e;
    private final boolean f;
    private final boolean g;
    @l
    private final Set h;

    public SplitPairRule(@l Set set0, boolean z, boolean z1, boolean z2, int v, int v1, float f, int v2) {
        L.p(set0, "filters");
        super(v, v1, f, v2);
        this.e = z;
        this.f = z1;
        this.g = z2;
        this.h = u.a6(set0);
    }

    public SplitPairRule(Set set0, boolean z, boolean z1, boolean z2, int v, int v1, float f, int v2, int v3, w w0) {
        this(set0, ((v3 & 2) == 0 ? z : false), ((v3 & 4) == 0 ? z1 : true), ((v3 & 8) == 0 ? z2 : false), ((v3 & 16) == 0 ? v : 0), ((v3 & 0x20) == 0 ? v1 : 0), ((v3 & 0x40) == 0 ? f : 0.5f), ((v3 & 0x80) == 0 ? v2 : 3));
    }

    @Override  // androidx.window.embedding.SplitRule
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SplitPairRule)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        if(!L.g(this.h, ((SplitPairRule)object0).h)) {
            return false;
        }
        if(this.e != ((SplitPairRule)object0).e) {
            return false;
        }
        return this.f == ((SplitPairRule)object0).f ? this.g == ((SplitPairRule)object0).g : false;
    }

    public final boolean f() {
        return this.g;
    }

    @l
    public final Set g() {
        return this.h;
    }

    public final boolean h() {
        return this.e;
    }

    @Override  // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((super.hashCode() * 0x1F + this.h.hashCode()) * 0x1F + c.a(this.e)) * 0x1F + c.a(this.f)) * 0x1F + c.a(this.g);
    }

    public final boolean i() {
        return this.f;
    }

    @l
    public final SplitPairRule j(@l SplitPairFilter splitPairFilter0) {
        L.p(splitPairFilter0, "filter");
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        linkedHashSet0.addAll(this.h);
        linkedHashSet0.add(splitPairFilter0);
        return new SplitPairRule(u.a6(linkedHashSet0), this.e, this.f, this.g, this.d(), this.c(), this.e(), this.b());
    }
}

