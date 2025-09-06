package androidx.compose.ui.node;

import A3.a;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

public final class OwnerSnapshotObserver {
    @l
    private final SnapshotStateObserver a;
    @l
    private final Function1 b;
    @l
    private final Function1 c;
    @l
    private final Function1 d;
    @l
    private final Function1 e;
    @l
    private final Function1 f;
    @l
    private final Function1 g;

    public OwnerSnapshotObserver(@l Function1 function10) {
        L.p(function10, "onChangedExecutor");
        super();
        this.a = new SnapshotStateObserver(function10);
        this.b = androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadMeasure.1.e;
        this.c = androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1.e;
        this.d = androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1.e;
        this.e = androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifier.1.e;
        this.f = androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifierInLookahead.1.e;
        this.g = androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadLayout.1.e;

        final class androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1 extends N implements Function1 {
            public static final androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1 e;

            static {
                androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1.e = new androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1();
            }

            androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1() {
                super(1);
            }

            public final void a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "layoutNode");
                if(layoutNode0.H()) {
                    LayoutNode.A1(layoutNode0, false, 1, null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutNode)object0));
                return S0.a;
            }
        }


        final class androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifier.1 extends N implements Function1 {
            public static final androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifier.1 e;

            static {
                androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifier.1.e = new androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifier.1();
            }

            androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifier.1() {
                super(1);
            }

            public final void a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "layoutNode");
                if(layoutNode0.H()) {
                    LayoutNode.A1(layoutNode0, false, 1, null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutNode)object0));
                return S0.a;
            }
        }


        final class androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifierInLookahead.1 extends N implements Function1 {
            public static final androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifierInLookahead.1 e;

            static {
                androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifierInLookahead.1.e = new androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifierInLookahead.1();
            }

            androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayoutModifierInLookahead.1() {
                super(1);
            }

            public final void a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "layoutNode");
                if(layoutNode0.H()) {
                    LayoutNode.w1(layoutNode0, false, 1, null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutNode)object0));
                return S0.a;
            }
        }


        final class androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadLayout.1 extends N implements Function1 {
            public static final androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadLayout.1 e;

            static {
                androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadLayout.1.e = new androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadLayout.1();
            }

            androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadLayout.1() {
                super(1);
            }

            public final void a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "layoutNode");
                if(layoutNode0.H()) {
                    LayoutNode.w1(layoutNode0, false, 1, null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutNode)object0));
                return S0.a;
            }
        }


        final class androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadMeasure.1 extends N implements Function1 {
            public static final androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadMeasure.1 e;

            static {
                androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadMeasure.1.e = new androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadMeasure.1();
            }

            androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLookaheadMeasure.1() {
                super(1);
            }

            public final void a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "layoutNode");
                if(layoutNode0.H()) {
                    LayoutNode.y1(layoutNode0, false, 1, null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutNode)object0));
                return S0.a;
            }
        }


        final class androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1 extends N implements Function1 {
            public static final androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1 e;

            static {
                androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1.e = new androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1();
            }

            androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1() {
                super(1);
            }

            public final void a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "layoutNode");
                if(layoutNode0.H()) {
                    LayoutNode.C1(layoutNode0, false, 1, null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutNode)object0));
                return S0.a;
            }
        }

    }

    public final void a(@l Object object0) {
        L.p(object0, "target");
        this.a.l(object0);
    }

    public final void b() {
        this.a.m(androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1.e);

        final class androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1 extends N implements Function1 {
            public static final androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1 e;

            static {
                androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1.e = new androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1();
            }

            androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1() {
                super(1);
            }

            @l
            public final Boolean a(@l Object object0) {
                L.p(object0, "it");
                return Boolean.valueOf(!((OwnerScope)object0).H());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }

    }

    public final void c(@l LayoutNode layoutNode0, boolean z, @l a a0) {
        L.p(layoutNode0, "node");
        L.p(a0, "block");
        if(z && layoutNode0.r0() != null) {
            this.i(layoutNode0, this.f, a0);
            return;
        }
        this.i(layoutNode0, this.e, a0);
    }

    public static void d(OwnerSnapshotObserver ownerSnapshotObserver0, LayoutNode layoutNode0, boolean z, a a0, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver0.c(layoutNode0, z, a0);
    }

    public final void e(@l LayoutNode layoutNode0, boolean z, @l a a0) {
        L.p(layoutNode0, "node");
        L.p(a0, "block");
        if(z && layoutNode0.r0() != null) {
            this.i(layoutNode0, this.g, a0);
            return;
        }
        this.i(layoutNode0, this.d, a0);
    }

    public static void f(OwnerSnapshotObserver ownerSnapshotObserver0, LayoutNode layoutNode0, boolean z, a a0, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver0.e(layoutNode0, z, a0);
    }

    public final void g(@l LayoutNode layoutNode0, boolean z, @l a a0) {
        L.p(layoutNode0, "node");
        L.p(a0, "block");
        if(z && layoutNode0.r0() != null) {
            this.i(layoutNode0, this.b, a0);
            return;
        }
        this.i(layoutNode0, this.c, a0);
    }

    public static void h(OwnerSnapshotObserver ownerSnapshotObserver0, LayoutNode layoutNode0, boolean z, a a0, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver0.g(layoutNode0, z, a0);
    }

    public final void i(@l OwnerScope ownerScope0, @l Function1 function10, @l a a0) {
        L.p(ownerScope0, "target");
        L.p(function10, "onChanged");
        L.p(a0, "block");
        this.a.r(ownerScope0, function10, a0);
    }

    public final void j() {
        this.a.v();
    }

    public final void k() {
        this.a.w();
        this.a.k();
    }
}

