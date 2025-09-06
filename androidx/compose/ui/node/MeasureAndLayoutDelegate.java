package androidx.compose.ui.node;

import A3.a;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,557:1\n390#1,8:565\n399#1,5:584\n390#1,14:589\n390#1,14:614\n1182#2:558\n1161#2,2:559\n1182#2:561\n1161#2,2:562\n100#3:564\n100#3:573\n91#3,10:574\n460#4,11:603\n728#4,2:628\n460#4,11:630\n460#4,11:641\n460#4,11:653\n163#5:652\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n327#1:565,8\n327#1:584,5\n347#1:589,14\n370#1:614,14\n63#1:558\n63#1:559,2\n84#1:561\n84#1:562,2\n48#1:564\n328#1:573\n329#1:574,10\n359#1:603,11\n406#1:628,2\n410#1:630,11\n452#1:641,11\n499#1:653,11\n499#1:652\n*E\n"})
public final class MeasureAndLayoutDelegate {
    @StabilityInferred(parameters = 0)
    public static final class PostponedRequest {
        @l
        private final LayoutNode a;
        private final boolean b;
        private final boolean c;
        public static final int d = 8;

        static {
        }

        public PostponedRequest(@l LayoutNode layoutNode0, boolean z, boolean z1) {
            L.p(layoutNode0, "node");
            super();
            this.a = layoutNode0;
            this.b = z;
            this.c = z1;
        }

        @l
        public final LayoutNode a() {
            return this.a;
        }

        public final boolean b() {
            return this.c;
        }

        public final boolean c() {
            return this.b;
        }
    }

    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[LayoutState.values().length];
            try {
                arr_v[LayoutState.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutState.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final LayoutNode a;
    @l
    private final DepthSortedSet b;
    private boolean c;
    @l
    private final OnPositionedDispatcher d;
    @l
    private final MutableVector e;
    private long f;
    @l
    private final MutableVector g;
    @m
    private Constraints h;
    @m
    private final LayoutTreeConsistencyChecker i;

    public MeasureAndLayoutDelegate(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "root");
        super();
        this.a = layoutNode0;
        this.b = new DepthSortedSet(false);
        this.d = new OnPositionedDispatcher();
        this.e = new MutableVector(new OnLayoutCompletedListener[16], 0);
        this.f = 1L;
        this.g = new MutableVector(new PostponedRequest[16], 0);
        this.i = null;
    }

    public static boolean A(MeasureAndLayoutDelegate measureAndLayoutDelegate0, LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate0.z(layoutNode0, z);
    }

    public final void B(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        this.d.c(layoutNode0);
    }

    public final boolean C(@l LayoutNode layoutNode0, boolean z) {
        L.p(layoutNode0, "layoutNode");
        switch(layoutNode0.m0()) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker1 = this.i;
                if(layoutTreeConsistencyChecker1 != null) {
                    layoutTreeConsistencyChecker1.a();
                }
                break;
            }
            case 5: {
                if(z || !layoutNode0.t0() && !layoutNode0.l0()) {
                    goto label_8;
                }
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.i;
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.a();
                    return false;
                label_8:
                    layoutNode0.d1();
                    if(layoutNode0.u()) {
                        LayoutNode layoutNode1 = layoutNode0.C0();
                        if((layoutNode1 == null || !layoutNode1.l0()) && (layoutNode1 == null || !layoutNode1.t0())) {
                            this.b.a(layoutNode0);
                        }
                    }
                    return !this.c;
                }
                break;
            }
            default: {
                throw new J();
            }
        }
        return false;
    }

    public static boolean D(MeasureAndLayoutDelegate measureAndLayoutDelegate0, LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate0.C(layoutNode0, z);
    }

    public final boolean E(@l LayoutNode layoutNode0, boolean z) {
        L.p(layoutNode0, "layoutNode");
        switch(layoutNode0.m0()) {
            case 1: 
            case 2: {
                break;
            }
            case 3: 
            case 4: {
                PostponedRequest measureAndLayoutDelegate$PostponedRequest0 = new PostponedRequest(layoutNode0, false, z);
                this.g.b(measureAndLayoutDelegate$PostponedRequest0);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.i;
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.a();
                    return false;
                }
                break;
            }
            case 5: {
                if(!layoutNode0.t0() || z) {
                    layoutNode0.g1();
                    if(layoutNode0.u() || this.i(layoutNode0)) {
                        LayoutNode layoutNode1 = layoutNode0.C0();
                        if(layoutNode1 == null || !layoutNode1.t0()) {
                            this.b.a(layoutNode0);
                        }
                    }
                    return !this.c;
                }
                break;
            }
            default: {
                throw new J();
            }
        }
        return false;
    }

    public static boolean F(MeasureAndLayoutDelegate measureAndLayoutDelegate0, LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate0.E(layoutNode0, z);
    }

    public final void G(long v) {
        if(!(this.h == null ? false : Constraints.g(this.h.x(), v))) {
            if(this.c) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.h = Constraints.b(v);
            this.a.g1();
            this.b.a(this.a);
        }
    }

    private final void c() {
        MutableVector mutableVector0 = this.e;
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                ((OnLayoutCompletedListener)arr_object[v1]).s();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        this.e.l();
    }

    public final void d(boolean z) {
        if(z) {
            this.d.d(this.a);
        }
        this.d.a();
    }

    public static void e(MeasureAndLayoutDelegate measureAndLayoutDelegate0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate0.d(z);
    }

    private final boolean f(LayoutNode layoutNode0, Constraints constraints0) {
        if(layoutNode0.r0() == null) {
            return false;
        }
        boolean z = constraints0 == null ? LayoutNode.b1(layoutNode0, null, 1, null) : layoutNode0.a1(constraints0);
        LayoutNode layoutNode1 = layoutNode0.C0();
        if(z && layoutNode1 != null) {
            if(layoutNode1.r0() == null) {
                MeasureAndLayoutDelegate.F(this, layoutNode1, false, 2, null);
                return z;
            }
            if(layoutNode0.v0() == UsageByParent.a) {
                MeasureAndLayoutDelegate.A(this, layoutNode1, false, 2, null);
                return z;
            }
            if(layoutNode0.v0() == UsageByParent.b) {
                MeasureAndLayoutDelegate.y(this, layoutNode1, false, 2, null);
            }
        }
        return z;
    }

    private final boolean g(LayoutNode layoutNode0, Constraints constraints0) {
        boolean z = constraints0 == null ? LayoutNode.r1(layoutNode0, null, 1, null) : layoutNode0.q1(constraints0);
        LayoutNode layoutNode1 = layoutNode0.C0();
        if(z && layoutNode1 != null) {
            if(layoutNode0.u0() == UsageByParent.a) {
                MeasureAndLayoutDelegate.F(this, layoutNode1, false, 2, null);
                return z;
            }
            if(layoutNode0.u0() == UsageByParent.b) {
                MeasureAndLayoutDelegate.D(this, layoutNode1, false, 2, null);
            }
        }
        return z;
    }

    public final void h(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        if(this.b.d()) {
            return;
        }
        if(!this.c) {
            throw new IllegalStateException("Check failed.");
        }
        if(layoutNode0.t0()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MutableVector mutableVector0 = layoutNode0.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                if(layoutNode1.t0() && this.b.h(layoutNode1)) {
                    this.v(layoutNode1);
                }
                if(!layoutNode1.t0()) {
                    this.h(layoutNode1);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        if(layoutNode0.t0() && this.b.h(layoutNode0)) {
            this.v(layoutNode0);
        }
    }

    // 去混淆评级： 低(20)
    private final boolean i(LayoutNode layoutNode0) {
        return layoutNode0.t0() && this.l(layoutNode0);
    }

    private final boolean j(LayoutNode layoutNode0) {
        if(layoutNode0.n0()) {
            if(layoutNode0.v0() == UsageByParent.a) {
                return true;
            }
            AlignmentLinesOwner alignmentLinesOwner0 = layoutNode0.k0().t();
            if(alignmentLinesOwner0 != null) {
                AlignmentLines alignmentLines0 = alignmentLinesOwner0.k();
                return alignmentLines0 != null && alignmentLines0.l();
            }
        }
        return false;
    }

    public final boolean k() {
        return !this.b.d();
    }

    private final boolean l(LayoutNode layoutNode0) {
        return layoutNode0.u0() == UsageByParent.a || layoutNode0.k0().l().k().l();
    }

    public final long m() {
        if(!this.c) {
            throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.f;
    }

    public final boolean n(@m a a0) {
        boolean z1;
        boolean z = false;
        if(!this.a.o() || !this.a.u() || this.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(this.h != null) {
            try {
                this.c = true;
                if(this.b.d()) {
                    z1 = false;
                }
                else {
                    DepthSortedSet depthSortedSet0 = this.b;
                    z1 = false;
                    while(!depthSortedSet0.d()) {
                        LayoutNode layoutNode0 = depthSortedSet0.f();
                        if(layoutNode0 == this.a && this.v(layoutNode0)) {
                            z1 = true;
                        }
                    }
                    if(a0 != null) {
                        a0.invoke();
                    }
                }
            }
            finally {
                this.c = false;
            }
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.i;
            if(layoutTreeConsistencyChecker0 != null) {
                layoutTreeConsistencyChecker0.a();
            }
            z = z1;
        }
        this.c();
        return z;
    }

    public static boolean o(MeasureAndLayoutDelegate measureAndLayoutDelegate0, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            a0 = null;
        }
        return measureAndLayoutDelegate0.n(a0);
    }

    public final void p(@l LayoutNode layoutNode0, long v) {
        L.p(layoutNode0, "layoutNode");
        if(L.g(layoutNode0, this.a) || !this.a.o() || !this.a.u() || this.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(this.h != null) {
            try {
                this.c = true;
                this.b.h(layoutNode0);
                boolean z = this.f(layoutNode0, Constraints.b(v));
                this.g(layoutNode0, Constraints.b(v));
                if((z || layoutNode0.n0()) && L.g(layoutNode0.Z0(), Boolean.TRUE)) {
                    layoutNode0.c1();
                }
                if(layoutNode0.l0() && layoutNode0.u()) {
                    layoutNode0.u1();
                    this.d.c(layoutNode0);
                }
            }
            finally {
                this.c = false;
            }
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.i;
            if(layoutTreeConsistencyChecker0 != null) {
                layoutTreeConsistencyChecker0.a();
            }
        }
        this.c();
    }

    public final void q() {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0;
        if(!this.a.o() || !this.a.u() || this.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(this.h != null) {
            try {
                this.c = true;
                this.t(this.a);
                this.c = false;
                layoutTreeConsistencyChecker0 = this.i;
            }
            catch(Throwable throwable0) {
                this.c = false;
                throw throwable0;
            }
            if(layoutTreeConsistencyChecker0 != null) {
                layoutTreeConsistencyChecker0.a();
            }
        }
    }

    public final void r(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "node");
        this.b.h(layoutNode0);
    }

    private final void s(a a0) {
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0;
        if(!this.a.o() || !this.a.u() || this.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(this.h != null) {
            try {
                this.c = true;
                a0.invoke();
                this.c = false;
                layoutTreeConsistencyChecker0 = this.i;
            }
            catch(Throwable throwable0) {
                this.c = false;
                throw throwable0;
            }
            if(layoutTreeConsistencyChecker0 != null) {
                layoutTreeConsistencyChecker0.a();
            }
        }
    }

    private final void t(LayoutNode layoutNode0) {
        this.w(layoutNode0);
        MutableVector mutableVector0 = layoutNode0.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                if(this.l(layoutNode1)) {
                    this.t(layoutNode1);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        this.w(layoutNode0);
    }

    public final void u(@l OnLayoutCompletedListener owner$OnLayoutCompletedListener0) {
        L.p(owner$OnLayoutCompletedListener0, "listener");
        this.e.b(owner$OnLayoutCompletedListener0);
    }

    private final boolean v(LayoutNode layoutNode0) {
        boolean z1;
        boolean z;
        Constraints constraints0;
        int v = 0;
        if(layoutNode0.u() || this.i(layoutNode0) || L.g(layoutNode0.Z0(), Boolean.TRUE) || this.j(layoutNode0) || layoutNode0.V()) {
            if(layoutNode0.o0() || layoutNode0.t0()) {
                if(layoutNode0 == this.a) {
                    constraints0 = this.h;
                    L.m(constraints0);
                }
                else {
                    constraints0 = null;
                }
                z1 = layoutNode0.o0() ? this.f(layoutNode0, constraints0) : false;
                z = this.g(layoutNode0, constraints0);
            }
            else {
                z = false;
                z1 = false;
            }
            if((z1 || layoutNode0.n0()) && L.g(layoutNode0.Z0(), Boolean.TRUE)) {
                layoutNode0.c1();
            }
            if(layoutNode0.l0() && layoutNode0.u()) {
                if(layoutNode0 == this.a) {
                    layoutNode0.o1(0, 0);
                }
                else {
                    layoutNode0.u1();
                }
                this.d.c(layoutNode0);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.i;
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.a();
                }
            }
            if(this.g.O()) {
                MutableVector mutableVector0 = this.g;
                int v1 = mutableVector0.J();
                if(v1 > 0) {
                    Object[] arr_object = mutableVector0.F();
                    while(true) {
                        PostponedRequest measureAndLayoutDelegate$PostponedRequest0 = (PostponedRequest)arr_object[v];
                        if(measureAndLayoutDelegate$PostponedRequest0.a().o()) {
                            if(measureAndLayoutDelegate$PostponedRequest0.c()) {
                                this.z(measureAndLayoutDelegate$PostponedRequest0.a(), measureAndLayoutDelegate$PostponedRequest0.b());
                            }
                            else {
                                this.E(measureAndLayoutDelegate$PostponedRequest0.a(), measureAndLayoutDelegate$PostponedRequest0.b());
                            }
                        }
                        ++v;
                        if(v >= v1) {
                            break;
                        }
                    }
                }
                this.g.l();
            }
            v = z;
        }
        return v != 0;
    }

    private final void w(LayoutNode layoutNode0) {
        Constraints constraints0;
        if(!layoutNode0.t0() && !layoutNode0.o0()) {
            return;
        }
        if(layoutNode0 == this.a) {
            constraints0 = this.h;
            L.m(constraints0);
        }
        else {
            constraints0 = null;
        }
        if(layoutNode0.o0()) {
            this.f(layoutNode0, constraints0);
        }
        this.g(layoutNode0, constraints0);
    }

    public final boolean x(@l LayoutNode layoutNode0, boolean z) {
        L.p(layoutNode0, "layoutNode");
        switch(layoutNode0.m0()) {
            case 1: 
            case 3: {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker1 = this.i;
                if(layoutTreeConsistencyChecker1 != null) {
                    layoutTreeConsistencyChecker1.a();
                }
                break;
            }
            case 2: 
            case 4: 
            case 5: {
                if(!layoutNode0.o0() && !layoutNode0.n0() || z) {
                    goto label_8;
                }
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.i;
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.a();
                    return false;
                label_8:
                    layoutNode0.e1();
                    layoutNode0.d1();
                    if(L.g(layoutNode0.Z0(), Boolean.TRUE)) {
                        LayoutNode layoutNode1 = layoutNode0.C0();
                        if((layoutNode1 == null || !layoutNode1.o0()) && (layoutNode1 == null || !layoutNode1.n0())) {
                            this.b.a(layoutNode0);
                        }
                    }
                    return !this.c;
                }
                break;
            }
            default: {
                throw new J();
            }
        }
        return false;
    }

    public static boolean y(MeasureAndLayoutDelegate measureAndLayoutDelegate0, LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate0.x(layoutNode0, z);
    }

    public final boolean z(@l LayoutNode layoutNode0, boolean z) {
        L.p(layoutNode0, "layoutNode");
        if(layoutNode0.r0() == null) {
            throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout");
        }
        switch(layoutNode0.m0()) {
            case 1: {
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                PostponedRequest measureAndLayoutDelegate$PostponedRequest0 = new PostponedRequest(layoutNode0, true, z);
                this.g.b(measureAndLayoutDelegate$PostponedRequest0);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.i;
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.a();
                }
                break;
            }
            case 5: {
                if(!layoutNode0.o0() || z) {
                    layoutNode0.f1();
                    layoutNode0.g1();
                    if(L.g(layoutNode0.Z0(), Boolean.TRUE) || this.j(layoutNode0)) {
                        LayoutNode layoutNode1 = layoutNode0.C0();
                        if(layoutNode1 == null || !layoutNode1.o0()) {
                            this.b.a(layoutNode0);
                        }
                    }
                    return !this.c;
                }
                break;
            }
            default: {
                throw new J();
            }
        }
        return false;
    }
}

