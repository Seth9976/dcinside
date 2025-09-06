package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class Invalidation {
    @l
    private final RecomposeScopeImpl a;
    private final int b;
    @m
    private IdentityArraySet c;

    public Invalidation(@l RecomposeScopeImpl recomposeScopeImpl0, int v, @m IdentityArraySet identityArraySet0) {
        L.p(recomposeScopeImpl0, "scope");
        super();
        this.a = recomposeScopeImpl0;
        this.b = v;
        this.c = identityArraySet0;
    }

    @m
    public final IdentityArraySet a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    @l
    public final RecomposeScopeImpl c() {
        return this.a;
    }

    public final boolean d() {
        return this.a.v(this.c);
    }

    public final void e(@m IdentityArraySet identityArraySet0) {
        this.c = identityArraySet0;
    }
}

