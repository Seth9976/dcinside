package androidx.compose.runtime;

import A3.o;
import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n*L\n1#1,349:1\n1#2:350\n1726#3,3:351\n159#4,4:354\n152#4,4:358\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n280#1:351,3\n298#1:354,4\n321#1:358,4\n*E\n"})
public final class RecomposeScopeImpl implements RecomposeScope, ScopeUpdateScope {
    private int a;
    @m
    private CompositionImpl b;
    @m
    private Anchor c;
    @m
    private o d;
    private int e;
    @m
    private IdentityArrayIntMap f;
    @m
    private IdentityArrayMap g;

    public RecomposeScopeImpl(@m CompositionImpl compositionImpl0) {
        this.b = compositionImpl0;
    }

    public final void A(@m Anchor anchor0) {
        this.c = anchor0;
    }

    public final void B(boolean z) {
        if(z) {
            this.a |= 2;
            return;
        }
        this.a &= -3;
    }

    public final void C(boolean z) {
        if(z) {
            this.a |= 4;
            return;
        }
        this.a &= -5;
    }

    public final void D(boolean z) {
        if(z) {
            this.a |= 8;
            return;
        }
        this.a &= -9;
    }

    private final void E(boolean z) {
        if(z) {
            this.a |= 0x20;
            return;
        }
        this.a &= -33;
    }

    private final void F(boolean z) {
        if(z) {
            this.a |= 16;
            return;
        }
        this.a &= -17;
    }

    public final void G(boolean z) {
        if(z) {
            this.a |= 1;
            return;
        }
        this.a &= -2;
    }

    public final void H(int v) {
        this.e = v;
        this.F(false);
    }

    @Override  // androidx.compose.runtime.ScopeUpdateScope
    public void a(@l o o0) {
        L.p(o0, "block");
        this.d = o0;
    }

    public final void g(@l CompositionImpl compositionImpl0) {
        L.p(compositionImpl0, "composition");
        this.b = compositionImpl0;
    }

    public final void h(@l Composer composer0) {
        S0 s00;
        L.p(composer0, "composer");
        o o0 = this.d;
        if(o0 == null) {
            s00 = null;
        }
        else {
            o0.invoke(composer0, 1);
            s00 = S0.a;
        }
        if(s00 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    @m
    public final Function1 i(int v) {
        IdentityArrayIntMap identityArrayIntMap0 = this.f;
        if(identityArrayIntMap0 != null && !this.q()) {
            int v1 = identityArrayIntMap0.i();
            for(int v2 = 0; v2 < v1; ++v2) {
                L.n(identityArrayIntMap0.g()[v2], "null cannot be cast to non-null type kotlin.Any");
                if(identityArrayIntMap0.k()[v2] != v) {
                    return new Function1(v, identityArrayIntMap0) {
                        final RecomposeScopeImpl e;
                        final int f;
                        final IdentityArrayIntMap g;

                        {
                            this.e = recomposeScopeImpl0;
                            this.f = v;
                            this.g = identityArrayIntMap0;
                            super(1);
                        }

                        public final void a(@l Composition composition0) {
                            L.p(composition0, "composition");
                            if(this.e.e == this.f && L.g(this.g, this.e.f) && composition0 instanceof CompositionImpl) {
                                IdentityArrayIntMap identityArrayIntMap0 = this.g;
                                int v = this.f;
                                RecomposeScopeImpl recomposeScopeImpl0 = this.e;
                                int v1 = identityArrayIntMap0.i();
                                int v3 = 0;
                                for(int v2 = 0; v2 < v1; ++v2) {
                                    Object object0 = identityArrayIntMap0.g()[v2];
                                    L.n(object0, "null cannot be cast to non-null type kotlin.Any");
                                    int v4 = identityArrayIntMap0.k()[v2];
                                    boolean z = v4 != v;
                                    if(z) {
                                        ((CompositionImpl)composition0).R(object0, recomposeScopeImpl0);
                                        DerivedState derivedState0 = object0 instanceof DerivedState ? ((DerivedState)object0) : null;
                                        if(derivedState0 != null) {
                                            ((CompositionImpl)composition0).Q(derivedState0);
                                            IdentityArrayMap identityArrayMap0 = recomposeScopeImpl0.g;
                                            if(identityArrayMap0 != null) {
                                                identityArrayMap0.l(derivedState0);
                                                if(identityArrayMap0.h() == 0) {
                                                    recomposeScopeImpl0.g = null;
                                                }
                                            }
                                        }
                                    }
                                    if(!z) {
                                        if(v3 != v2) {
                                            identityArrayIntMap0.g()[v3] = object0;
                                            identityArrayIntMap0.k()[v3] = v4;
                                        }
                                        ++v3;
                                    }
                                }
                                int v5 = identityArrayIntMap0.i();
                                for(int v6 = v3; v6 < v5; ++v6) {
                                    identityArrayIntMap0.g()[v6] = null;
                                }
                                identityArrayIntMap0.p(v3);
                                if(this.g.i() == 0) {
                                    this.e.f = null;
                                }
                            }
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((Composition)object0));
                            return S0.a;
                        }
                    };
                }
            }
        }
        return null;
    }

    @Override  // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        CompositionImpl compositionImpl0 = this.b;
        if(compositionImpl0 != null) {
            compositionImpl0.L(this, null);
        }
    }

    @m
    public final Anchor j() {
        return this.c;
    }

    public final boolean k() {
        return this.d != null;
    }

    @m
    public final CompositionImpl l() {
        return this.b;
    }

    public final boolean m() {
        return (this.a & 2) != 0;
    }

    public final boolean n() {
        return (this.a & 4) != 0;
    }

    public final boolean o() {
        return (this.a & 8) != 0;
    }

    private final boolean p() {
        return (this.a & 0x20) != 0;
    }

    public final boolean q() {
        return (this.a & 16) != 0;
    }

    public final boolean r() {
        return (this.a & 1) != 0;
    }

    public final boolean s() {
        if(this.b != null) {
            return this.c == null ? false : this.c.b();
        }
        return false;
    }

    @l
    public final InvalidationResult t(@m Object object0) {
        CompositionImpl compositionImpl0 = this.b;
        if(compositionImpl0 != null) {
            InvalidationResult invalidationResult0 = compositionImpl0.L(this, object0);
            return invalidationResult0 == null ? InvalidationResult.a : invalidationResult0;
        }
        return InvalidationResult.a;
    }

    public final boolean u() {
        return this.g != null;
    }

    public final boolean v(@m IdentityArraySet identityArraySet0) {
        if(identityArraySet0 == null) {
            return true;
        }
        IdentityArrayMap identityArrayMap0 = this.g;
        if(identityArrayMap0 == null) {
            return true;
        }
        if(identityArraySet0.j()) {
            if(!identityArraySet0.isEmpty()) {
                for(Object object0: identityArraySet0) {
                    if(!(object0 instanceof DerivedState)) {
                        return true;
                    }
                    SnapshotMutationPolicy snapshotMutationPolicy0 = ((DerivedState)object0).a();
                    if(snapshotMutationPolicy0 == null) {
                        snapshotMutationPolicy0 = SnapshotStateKt.w();
                    }
                    if(!snapshotMutationPolicy0.a(((DerivedState)object0).e(), identityArrayMap0.f(((DerivedState)object0)))) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void w(@l Object object0) {
        L.p(object0, "instance");
        if(this.p()) {
            return;
        }
        IdentityArrayIntMap identityArrayIntMap0 = this.f;
        if(identityArrayIntMap0 == null) {
            identityArrayIntMap0 = new IdentityArrayIntMap();
            this.f = identityArrayIntMap0;
        }
        identityArrayIntMap0.a(object0, this.e);
        if(object0 instanceof DerivedState) {
            IdentityArrayMap identityArrayMap0 = this.g;
            if(identityArrayMap0 == null) {
                identityArrayMap0 = new IdentityArrayMap(0, 1, null);
                this.g = identityArrayMap0;
            }
            identityArrayMap0.o(object0, ((DerivedState)object0).e());
        }
    }

    public final void x() {
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void y() {
        CompositionImpl compositionImpl0 = this.b;
        if(compositionImpl0 != null) {
            IdentityArrayIntMap identityArrayIntMap0 = this.f;
            if(identityArrayIntMap0 != null) {
                this.E(true);
                try {
                    int v1 = identityArrayIntMap0.i();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Object object0 = identityArrayIntMap0.g()[v2];
                        L.n(object0, "null cannot be cast to non-null type kotlin.Any");
                        int v3 = identityArrayIntMap0.k()[v2];
                        compositionImpl0.x(object0);
                    }
                }
                finally {
                    this.E(false);
                }
            }
        }
    }

    public final void z() {
        this.F(true);
    }
}

