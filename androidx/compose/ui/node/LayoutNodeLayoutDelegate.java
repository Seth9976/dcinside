package androidx.compose.ui.node;

import A3.a;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable.PlacementScope.Companion;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1237:1\n1#2:1238\n*E\n"})
public final class LayoutNodeLayoutDelegate {
    @s0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1237:1\n685#1:1252\n686#1,2:1261\n1161#2,2:1238\n163#3:1240\n163#3:1253\n163#3:1279\n163#3:1291\n460#4,11:1241\n460#4,7:1254\n467#4,4:1263\n460#4,11:1280\n460#4,11:1292\n33#5,6:1267\n33#5,6:1273\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n750#1:1252\n750#1:1261,2\n668#1:1238,2\n685#1:1240\n750#1:1253\n1020#1:1279\n1049#1:1291\n685#1:1241,11\n750#1:1254,7\n750#1:1263,4\n1020#1:1280,11\n1049#1:1292,11\n776#1:1267,6\n802#1:1273,6\n*E\n"})
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        public final class WhenMappings {
            public static final int[] a;
            public static final int[] b;

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
                    arr_v[LayoutState.c.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LayoutState.d.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                WhenMappings.a = arr_v;
                int[] arr_v1 = new int[UsageByParent.values().length];
                try {
                    arr_v1[UsageByParent.a.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v1[UsageByParent.b.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                WhenMappings.b = arr_v1;
            }
        }

        @l
        private final LookaheadScope f;
        private boolean g;
        private boolean h;
        private boolean i;
        @m
        private Constraints j;
        private long k;
        private boolean l;
        private boolean m;
        @l
        private final AlignmentLines n;
        @l
        private final MutableVector o;
        private boolean p;
        private boolean q;
        @m
        private Object r;
        final LayoutNodeLayoutDelegate s;

        public LookaheadPassDelegate(@l LookaheadScope lookaheadScope0) {
            L.p(lookaheadScope0, "lookaheadScope");
            this.s = layoutNodeLayoutDelegate0;
            super();
            this.f = lookaheadScope0;
            this.k = 0L;
            this.l = true;
            this.n = new LookaheadAlignmentLines(this);
            this.o = new MutableVector(new Measurable[16], 0);
            this.p = true;
            this.q = true;
            this.r = layoutNodeLayoutDelegate0.x().c();
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int D0(int v) {
            this.e2();
            LookaheadDelegate lookaheadDelegate0 = this.s.z().I2();
            L.m(lookaheadDelegate0);
            return lookaheadDelegate0.D0(v);
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public NodeCoordinator G0() {
            return this.s.a.e0();
        }

        @Override  // androidx.compose.ui.layout.Placeable
        protected void O1(long v, float f, @m Function1 function10) {
            this.s.b = LayoutState.d;
            this.h = true;
            if(!IntOffset.j(v, this.k)) {
                this.c2();
            }
            this.k().w(false);
            Owner owner0 = LayoutNodeKt.b(this.s.a);
            this.s.N(false);
            OwnerSnapshotObserver ownerSnapshotObserver0 = owner0.getSnapshotObserver();
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.placeAt.1 layoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$10 = new a(v) {
                final LayoutNodeLayoutDelegate e;
                final long f;

                {
                    this.e = layoutNodeLayoutDelegate0;
                    this.f = v;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    LookaheadDelegate lookaheadDelegate0 = this.e.z().I2();
                    L.m(lookaheadDelegate0);
                    PlacementScope.r(PlacementScope.a, lookaheadDelegate0, this.f, 0.0f, 2, null);
                }
            };
            OwnerSnapshotObserver.d(ownerSnapshotObserver0, this.s.a, false, layoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$10, 2, null);
            this.k = v;
            this.s.b = LayoutState.e;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int S0(int v) {
            this.e2();
            LookaheadDelegate lookaheadDelegate0 = this.s.z().I2();
            L.m(lookaheadDelegate0);
            return lookaheadDelegate0.S0(v);
        }

        private final void U1(Function1 function10) {
            MutableVector mutableVector0 = this.s.a.I0();
            int v = mutableVector0.J();
            if(v > 0) {
                Object[] arr_object = mutableVector0.F();
                int v1 = 0;
                while(true) {
                    LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = ((LayoutNode)arr_object[v1]).k0().w();
                    L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                    function10.invoke(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        @l
        public final List V1() {
            this.s.a.a0();
            if(!this.p) {
                return this.o.k();
            }
            LayoutNodeLayoutDelegateKt.b(this.s.a, this.o, androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.childMeasurables.2.e);
            this.p = false;
            return this.o.k();

            final class androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.childMeasurables.2 extends N implements Function1 {
                public static final androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.childMeasurables.2 e;

                static {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.childMeasurables.2.e = new androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.childMeasurables.2();
                }

                androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.childMeasurables.2() {
                    super(1);
                }

                @l
                public final Measurable a(@l LayoutNode layoutNode0) {
                    L.p(layoutNode0, "it");
                    Measurable measurable0 = layoutNode0.k0().w();
                    L.m(measurable0);
                    return measurable0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((LayoutNode)object0));
                }
            }

        }

        public final boolean W1() {
            return this.p;
        }

        public final boolean X1() {
            return this.g;
        }

        @m
        public final Constraints Y1() {
            return this.j;
        }

        public final void Z1(boolean z) {
            LayoutNode layoutNode0 = this.s.a.C0();
            UsageByParent layoutNode$UsageByParent0 = this.s.a.j0();
            if(layoutNode0 != null && layoutNode$UsageByParent0 != UsageByParent.c) {
                while(layoutNode0.j0() == layoutNode$UsageByParent0) {
                    LayoutNode layoutNode1 = layoutNode0.C0();
                    if(layoutNode1 == null) {
                        break;
                    }
                    layoutNode0 = layoutNode1;
                }
                switch(layoutNode$UsageByParent0) {
                    case 1: {
                        layoutNode0.x1(z);
                        break;
                    }
                    case 2: {
                        layoutNode0.v1(z);
                        return;
                    }
                    default: {
                        throw new IllegalStateException("Intrinsics isn\'t used by the parent");
                    }
                }
            }
        }

        public final void a2() {
            this.q = true;
        }

        private final void b2() {
            int v = 0;
            this.l2(false);
            MutableVector mutableVector0 = this.s.a.I0();
            int v1 = mutableVector0.J();
            if(v1 > 0) {
                Object[] arr_object = mutableVector0.F();
                while(true) {
                    LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = ((LayoutNode)arr_object[v]).k0().w();
                    L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                    layoutNodeLayoutDelegate$LookaheadPassDelegate0.b2();
                    ++v;
                    if(v >= v1) {
                        break;
                    }
                }
            }
        }

        @Override  // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.IntrinsicMeasurable
        @m
        public Object c() {
            return this.r;
        }

        public final void c2() {
            if(this.s.m() > 0) {
                List list0 = this.s.a.a0();
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    LayoutNode layoutNode0 = (LayoutNode)list0.get(v1);
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0.k0();
                    if(layoutNodeLayoutDelegate0.n() && !layoutNodeLayoutDelegate0.r()) {
                        LayoutNode.w1(layoutNode0, false, 1, null);
                    }
                    LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNodeLayoutDelegate0.w();
                    if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
                        layoutNodeLayoutDelegate$LookaheadPassDelegate0.c2();
                    }
                }
            }
        }

        private final void d2() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = this.s;
            MutableVector mutableVector0 = this.s.a.I0();
            int v = mutableVector0.J();
            if(v > 0) {
                Object[] arr_object = mutableVector0.F();
                int v1 = 0;
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                    if(layoutNode0.o0() && layoutNode0.v0() == UsageByParent.a) {
                        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNode0.k0().w();
                        L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                        Constraints constraints0 = this.Y1();
                        L.m(constraints0);
                        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0.g2(constraints0.x())) {
                            LayoutNode.y1(layoutNodeLayoutDelegate0.a, false, 1, null);
                        }
                    }
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public Map e() {
            if(!this.g) {
                if(this.s.s() == LayoutState.b) {
                    this.k().x(true);
                    if(this.k().g()) {
                        this.s.F();
                    }
                }
                else {
                    this.k().w(true);
                }
            }
            LookaheadDelegate lookaheadDelegate0 = this.G0().I2();
            if(lookaheadDelegate0 != null) {
                lookaheadDelegate0.e2(true);
            }
            this.r0();
            LookaheadDelegate lookaheadDelegate1 = this.G0().I2();
            if(lookaheadDelegate1 != null) {
                lookaheadDelegate1.e2(false);
            }
            return this.k().h();
        }

        private final void e2() {
            UsageByParent layoutNode$UsageByParent0;
            LayoutNode.y1(this.s.a, false, 1, null);
            LayoutNode layoutNode0 = this.s.a.C0();
            if(layoutNode0 != null && this.s.a.j0() == UsageByParent.c) {
                LayoutNode layoutNode1 = this.s.a;
                switch(layoutNode0.m0()) {
                    case 2: {
                        layoutNode$UsageByParent0 = UsageByParent.a;
                        break;
                    }
                    case 3: {
                        layoutNode$UsageByParent0 = UsageByParent.b;
                        break;
                    }
                    default: {
                        layoutNode$UsageByParent0 = layoutNode0.j0();
                    }
                }
                layoutNode1.K1(layoutNode$UsageByParent0);
            }
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void f() {
            LayoutNode.y1(this.s.a, false, 1, null);
        }

        public final void f2() {
            if(!this.u()) {
                this.l2(true);
                if(!this.m) {
                    this.i2();
                }
            }
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int g(int v) {
            this.e2();
            LookaheadDelegate lookaheadDelegate0 = this.s.z().I2();
            L.m(lookaheadDelegate0);
            return lookaheadDelegate0.g(v);
        }

        public final boolean g2(long v) {
            LayoutNode layoutNode0 = this.s.a.C0();
            this.s.a.G1(this.s.a.W() || layoutNode0 != null && layoutNode0.W());
            if(!this.s.a.o0() && (this.j == null ? false : Constraints.g(this.j.x(), v))) {
                return false;
            }
            this.j = Constraints.b(v);
            this.k().x(false);
            this.u1(androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.remeasure.1.e);
            this.i = true;
            LookaheadDelegate lookaheadDelegate0 = this.s.z().I2();
            if(lookaheadDelegate0 == null) {
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
            }
            long v1 = IntSizeKt.a(lookaheadDelegate0.N1(), lookaheadDelegate0.K1());
            this.s.J(v);
            this.Q1(IntSizeKt.a(lookaheadDelegate0.N1(), lookaheadDelegate0.K1()));
            return ((int)(v1 >> 0x20)) != lookaheadDelegate0.N1() || ((int)(v1 & 0xFFFFFFFFL)) != lookaheadDelegate0.K1();

            final class androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.remeasure.1 extends N implements Function1 {
                public static final androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.remeasure.1 e;

                static {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.remeasure.1.e = new androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.remeasure.1();
                }

                androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.remeasure.1() {
                    super(1);
                }

                public final void a(@l AlignmentLinesOwner alignmentLinesOwner0) {
                    L.p(alignmentLinesOwner0, "it");
                    alignmentLinesOwner0.k().z(false);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((AlignmentLinesOwner)object0));
                    return S0.a;
                }
            }

        }

        @Override  // androidx.compose.ui.layout.Placeable
        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate0 = this.s.z().I2();
            L.m(lookaheadDelegate0);
            return lookaheadDelegate0.getMeasuredHeight();
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate0 = this.s.z().I2();
            L.m(lookaheadDelegate0);
            return lookaheadDelegate0.getMeasuredWidth();
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @m
        public AlignmentLinesOwner h() {
            LayoutNode layoutNode0 = this.s.a.C0();
            if(layoutNode0 != null) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0.k0();
                return layoutNodeLayoutDelegate0 == null ? null : layoutNodeLayoutDelegate0.t();
            }
            return null;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int h1(int v) {
            this.e2();
            LookaheadDelegate lookaheadDelegate0 = this.s.z().I2();
            L.m(lookaheadDelegate0);
            return lookaheadDelegate0.h1(v);
        }

        public final void h2() {
            if(!this.h) {
                throw new IllegalStateException("Check failed.");
            }
            this.O1(this.k, 0.0f, null);
        }

        private final void i2() {
            MutableVector mutableVector0 = this.s.a.I0();
            int v = mutableVector0.J();
            if(v > 0) {
                Object[] arr_object = mutableVector0.F();
                int v1 = 0;
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                    layoutNode0.D1(layoutNode0);
                    LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = layoutNode0.k0().w();
                    L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                    layoutNodeLayoutDelegate$LookaheadPassDelegate0.i2();
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        public final void j2(boolean z) {
            this.p = z;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public AlignmentLines k() {
            return this.n;
        }

        public final void k2(boolean z) {
            this.g = z;
        }

        public void l2(boolean z) {
            this.l = z;
        }

        private final void m2(LayoutNode layoutNode0) {
            UsageByParent layoutNode$UsageByParent0;
            LayoutNode layoutNode1 = layoutNode0.C0();
            if(layoutNode1 != null) {
                if(layoutNode0.v0() != UsageByParent.c && !layoutNode0.W()) {
                    throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode0.v0() + ". Parent state " + layoutNode1.m0() + '.').toString());
                }
                switch(layoutNode1.m0()) {
                    case 1: 
                    case 2: {
                        layoutNode$UsageByParent0 = UsageByParent.a;
                        break;
                    }
                    case 3: 
                    case 4: {
                        layoutNode$UsageByParent0 = UsageByParent.b;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Measurable could be only measured from the parent\'s measure or layout block. Parents state is " + layoutNode1.m0());
                    }
                }
                layoutNode0.O1(layoutNode$UsageByParent0);
                return;
            }
            layoutNode0.O1(UsageByParent.c);
        }

        public final boolean n2() {
            if(!this.q) {
                return false;
            }
            this.q = false;
            LookaheadDelegate lookaheadDelegate0 = this.s.z().I2();
            L.m(lookaheadDelegate0);
            boolean z = L.g(this.c(), lookaheadDelegate0.c());
            LookaheadDelegate lookaheadDelegate1 = this.s.z().I2();
            L.m(lookaheadDelegate1);
            this.r = lookaheadDelegate1.c();
            return !z;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void r0() {
            this.k().s();
            if(this.s.u()) {
                this.d2();
            }
            LookaheadDelegate lookaheadDelegate0 = this.G0().I2();
            L.m(lookaheadDelegate0);
            if(this.s.h || !this.g && !lookaheadDelegate0.b2() && this.s.u()) {
                this.s.g = false;
                this.s.b = LayoutState.d;
                OwnerSnapshotObserver ownerSnapshotObserver0 = LayoutNodeKt.b(this.s.a).getSnapshotObserver();
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1 layoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$10 = new a(this.s, lookaheadDelegate0) {
                    final LookaheadPassDelegate e;
                    final LayoutNodeLayoutDelegate f;
                    final LookaheadDelegate g;

                    {
                        this.e = layoutNodeLayoutDelegate$LookaheadPassDelegate0;
                        this.f = layoutNodeLayoutDelegate0;
                        this.g = lookaheadDelegate0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        MutableVector mutableVector0 = this.e.s.a.I0();
                        int v = mutableVector0.J();
                        int v1 = 0;
                        if(v > 0) {
                            Object[] arr_object = mutableVector0.F();
                            int v2 = 0;
                            while(true) {
                                LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = ((LayoutNode)arr_object[v2]).k0().w();
                                L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                                layoutNodeLayoutDelegate$LookaheadPassDelegate0.m = layoutNodeLayoutDelegate$LookaheadPassDelegate0.u();
                                layoutNodeLayoutDelegate$LookaheadPassDelegate0.l2(false);
                                ++v2;
                                if(v2 >= v) {
                                    break;
                                }
                            }
                        }
                        MutableVector mutableVector1 = this.f.a.I0();
                        int v3 = mutableVector1.J();
                        if(v3 > 0) {
                            Object[] arr_object1 = mutableVector1.F();
                            int v4 = 0;
                            while(true) {
                                LayoutNode layoutNode0 = (LayoutNode)arr_object1[v4];
                                if(layoutNode0.v0() == UsageByParent.b) {
                                    layoutNode0.O1(UsageByParent.c);
                                }
                                ++v4;
                                if(v4 >= v3) {
                                    break;
                                }
                            }
                        }
                        this.e.u1(androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.3.e);
                        this.g.X1().l();
                        this.e.u1(androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.4.e);
                        MutableVector mutableVector2 = this.e.s.a.I0();
                        int v5 = mutableVector2.J();
                        if(v5 > 0) {
                            Object[] arr_object2 = mutableVector2.F();
                            while(true) {
                                LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate1 = ((LayoutNode)arr_object2[v1]).k0().w();
                                L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate1);
                                if(!layoutNodeLayoutDelegate$LookaheadPassDelegate1.u()) {
                                    layoutNodeLayoutDelegate$LookaheadPassDelegate1.b2();
                                }
                                ++v1;
                                if(v1 >= v5) {
                                    break;
                                }
                            }
                        }

                        final class androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.3 extends N implements Function1 {
                            public static final androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.3 e;

                            static {
                                androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.3.e = new androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.3();
                            }

                            androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.3() {
                                super(1);
                            }

                            public final void a(@l AlignmentLinesOwner alignmentLinesOwner0) {
                                L.p(alignmentLinesOwner0, "child");
                                alignmentLinesOwner0.k().y(false);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((AlignmentLinesOwner)object0));
                                return S0.a;
                            }
                        }


                        final class androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.4 extends N implements Function1 {
                            public static final androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.4 e;

                            static {
                                androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.4.e = new androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.4();
                            }

                            androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.layoutChildren.1.4() {
                                super(1);
                            }

                            public final void a(@l AlignmentLinesOwner alignmentLinesOwner0) {
                                L.p(alignmentLinesOwner0, "child");
                                alignmentLinesOwner0.k().v(alignmentLinesOwner0.k().o());
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((AlignmentLinesOwner)object0));
                                return S0.a;
                            }
                        }

                    }
                };
                OwnerSnapshotObserver.f(ownerSnapshotObserver0, this.s.a, false, layoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$10, 2, null);
                this.s.b = this.s.s();
                if(this.s.n() && lookaheadDelegate0.b2()) {
                    this.requestLayout();
                }
                this.s.h = false;
            }
            if(this.k().o()) {
                this.k().v(true);
            }
            if(this.k().g() && this.k().l()) {
                this.k().r();
            }
        }

        @Override  // androidx.compose.ui.layout.Measurable
        @l
        public Placeable r1(long v) {
            this.m2(this.s.a);
            if(this.s.a.j0() == UsageByParent.c) {
                this.s.a.K();
            }
            this.g2(v);
            return this;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.w1(this.s.a, false, 1, null);
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean u() {
            return this.l;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void u1(@l Function1 function10) {
            L.p(function10, "block");
            List list0 = this.s.a.a0();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                AlignmentLinesOwner alignmentLinesOwner0 = ((LayoutNode)list0.get(v1)).k0().t();
                L.m(alignmentLinesOwner0);
                function10.invoke(alignmentLinesOwner0);
            }
        }

        @Override  // androidx.compose.ui.layout.Measured
        public int v(@l AlignmentLine alignmentLine0) {
            L.p(alignmentLine0, "alignmentLine");
            LayoutNode layoutNode0 = this.s.a.C0();
            LayoutState layoutNode$LayoutState0 = null;
            if((layoutNode0 == null ? null : layoutNode0.m0()) == LayoutState.b) {
                this.k().z(true);
            }
            else {
                LayoutNode layoutNode1 = this.s.a.C0();
                if(layoutNode1 != null) {
                    layoutNode$LayoutState0 = layoutNode1.m0();
                }
                if(layoutNode$LayoutState0 == LayoutState.d) {
                    this.k().y(true);
                }
            }
            this.g = true;
            LookaheadDelegate lookaheadDelegate0 = this.s.z().I2();
            L.m(lookaheadDelegate0);
            int v = lookaheadDelegate0.v(alignmentLine0);
            this.g = false;
            return v;
        }
    }

    @s0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n1161#2,2:1238\n33#3,6:1240\n33#3,6:1246\n163#4:1252\n460#5,11:1253\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n235#1:1238,2\n548#1:1240,6\n574#1:1246,6\n609#1:1252\n609#1:1253,11\n*E\n"})
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        public final class androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings {
            public static final int[] a;
            public static final int[] b;

            static {
                int[] arr_v = new int[LayoutState.values().length];
                try {
                    arr_v[LayoutState.a.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LayoutState.c.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.a = arr_v;
                int[] arr_v1 = new int[UsageByParent.values().length];
                try {
                    arr_v1[UsageByParent.a.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v1[UsageByParent.b.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.b = arr_v1;
            }
        }

        private boolean f;
        private boolean g;
        private boolean h;
        private long i;
        @m
        private Function1 j;
        private float k;
        private boolean l;
        @m
        private Object m;
        @l
        private final AlignmentLines n;
        @l
        private final MutableVector o;
        private boolean p;
        final LayoutNodeLayoutDelegate q;

        public MeasurePassDelegate() {
            this.i = 0L;
            this.l = true;
            this.n = new LayoutNodeAlignmentLines(this);
            this.o = new MutableVector(new Measurable[16], 0);
            this.p = true;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int D0(int v) {
            this.a2();
            return LayoutNodeLayoutDelegate.this.z().D0(v);
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public NodeCoordinator G0() {
            return LayoutNodeLayoutDelegate.this.a.e0();
        }

        @Override  // androidx.compose.ui.layout.Placeable
        protected void O1(long v, float f, @m Function1 function10) {
            if(!IntOffset.j(v, this.i)) {
                this.Y1();
            }
            if(LayoutNodeLayoutDelegate.this.C(LayoutNodeLayoutDelegate.this.a)) {
                LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = LayoutNodeLayoutDelegate.this.w();
                L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                PlacementScope.p(PlacementScope.a, layoutNodeLayoutDelegate$LookaheadPassDelegate0, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)), 0.0f, 4, null);
            }
            LayoutNodeLayoutDelegate.this.b = LayoutState.c;
            this.b2(v, f, function10);
            LayoutNodeLayoutDelegate.this.b = LayoutState.e;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int S0(int v) {
            this.a2();
            return LayoutNodeLayoutDelegate.this.z().S0(v);
        }

        @l
        public final List S1() {
            LayoutNodeLayoutDelegate.this.a.U1();
            if(!this.p) {
                return this.o.k();
            }
            LayoutNodeLayoutDelegateKt.b(LayoutNodeLayoutDelegate.this.a, this.o, androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.childMeasurables.1.e);
            this.p = false;
            return this.o.k();

            final class androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.childMeasurables.1 extends N implements Function1 {
                public static final androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.childMeasurables.1 e;

                static {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.childMeasurables.1.e = new androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.childMeasurables.1();
                }

                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.childMeasurables.1() {
                    super(1);
                }

                @l
                public final Measurable a(@l LayoutNode layoutNode0) {
                    L.p(layoutNode0, "it");
                    return layoutNode0.k0().x();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((LayoutNode)object0));
                }
            }

        }

        public final boolean T1() {
            return this.p;
        }

        public final boolean U1() {
            return this.h;
        }

        // 去混淆评级： 低(20)
        @m
        public final Constraints V1() {
            return this.f ? Constraints.b(this.M1()) : null;
        }

        public final void W1(boolean z) {
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.C0();
            UsageByParent layoutNode$UsageByParent0 = LayoutNodeLayoutDelegate.this.a.j0();
            if(layoutNode0 != null && layoutNode$UsageByParent0 != UsageByParent.c) {
                while(layoutNode0.j0() == layoutNode$UsageByParent0) {
                    LayoutNode layoutNode1 = layoutNode0.C0();
                    if(layoutNode1 == null) {
                        break;
                    }
                    layoutNode0 = layoutNode1;
                }
                switch(layoutNode$UsageByParent0) {
                    case 1: {
                        layoutNode0.B1(z);
                        break;
                    }
                    case 2: {
                        layoutNode0.z1(z);
                        return;
                    }
                    default: {
                        throw new IllegalStateException("Intrinsics isn\'t used by the parent");
                    }
                }
            }
        }

        public final void X1() {
            this.l = true;
        }

        public final void Y1() {
            if(LayoutNodeLayoutDelegate.this.m() > 0) {
                List list0 = LayoutNodeLayoutDelegate.this.a.a0();
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    LayoutNode layoutNode0 = (LayoutNode)list0.get(v1);
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0.k0();
                    if(layoutNodeLayoutDelegate0.n() && !layoutNodeLayoutDelegate0.r()) {
                        LayoutNode.A1(layoutNode0, false, 1, null);
                    }
                    layoutNodeLayoutDelegate0.x().Y1();
                }
            }
        }

        private final void Z1() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = LayoutNodeLayoutDelegate.this;
            MutableVector mutableVector0 = LayoutNodeLayoutDelegate.this.a.I0();
            int v = mutableVector0.J();
            if(v > 0) {
                Object[] arr_object = mutableVector0.F();
                int v1 = 0;
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                    if(layoutNode0.t0() && layoutNode0.u0() == UsageByParent.a && LayoutNode.r1(layoutNode0, null, 1, null)) {
                        LayoutNode.C1(layoutNodeLayoutDelegate0.a, false, 1, null);
                    }
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
        }

        private final void a2() {
            UsageByParent layoutNode$UsageByParent0;
            LayoutNode.C1(LayoutNodeLayoutDelegate.this.a, false, 1, null);
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.C0();
            if(layoutNode0 != null && LayoutNodeLayoutDelegate.this.a.j0() == UsageByParent.c) {
                LayoutNode layoutNode1 = LayoutNodeLayoutDelegate.this.a;
                switch(layoutNode0.m0()) {
                    case 1: {
                        layoutNode$UsageByParent0 = UsageByParent.a;
                        break;
                    }
                    case 2: {
                        layoutNode$UsageByParent0 = UsageByParent.b;
                        break;
                    }
                    default: {
                        layoutNode$UsageByParent0 = layoutNode0.j0();
                    }
                }
                layoutNode1.K1(layoutNode$UsageByParent0);
            }
        }

        private final void b2(long v, float f, Function1 function10) {
            this.i = v;
            this.k = f;
            this.j = function10;
            this.g = true;
            this.k().w(false);
            LayoutNodeLayoutDelegate.this.N(false);
            OwnerSnapshotObserver ownerSnapshotObserver0 = LayoutNodeKt.b(LayoutNodeLayoutDelegate.this.a).getSnapshotObserver();
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.placeOuterCoordinator.1 layoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$10 = new a(LayoutNodeLayoutDelegate.this, v, f) {
                final Function1 e;
                final LayoutNodeLayoutDelegate f;
                final long g;
                final float h;

                {
                    this.e = function10;
                    this.f = layoutNodeLayoutDelegate0;
                    this.g = v;
                    this.h = f;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    Companion placeable$PlacementScope$Companion0 = PlacementScope.a;
                    Function1 function10 = this.e;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = this.f;
                    long v = this.g;
                    float f = this.h;
                    if(function10 == null) {
                        placeable$PlacementScope$Companion0.q(layoutNodeLayoutDelegate0.z(), v, f);
                        return;
                    }
                    placeable$PlacementScope$Companion0.E(layoutNodeLayoutDelegate0.z(), v, f, function10);
                }
            };
            ownerSnapshotObserver0.c(LayoutNodeLayoutDelegate.this.a, false, layoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$10);
        }

        @Override  // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.IntrinsicMeasurable
        @m
        public Object c() {
            return this.m;
        }

        public final boolean c2(long v) {
            Owner owner0 = LayoutNodeKt.b(LayoutNodeLayoutDelegate.this.a);
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.C0();
            boolean z = true;
            LayoutNodeLayoutDelegate.this.a.G1(LayoutNodeLayoutDelegate.this.a.W() || layoutNode0 != null && layoutNode0.W());
            if(!LayoutNodeLayoutDelegate.this.a.t0() && Constraints.g(this.M1(), v)) {
                owner0.t(LayoutNodeLayoutDelegate.this.a);
                LayoutNodeLayoutDelegate.this.a.F1();
                return false;
            }
            this.k().x(false);
            this.u1(androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.remeasure.1.e);
            this.f = true;
            long v1 = LayoutNodeLayoutDelegate.this.z().a();
            this.R1(v);
            LayoutNodeLayoutDelegate.this.K(v);
            if(IntSize.h(LayoutNodeLayoutDelegate.this.z().a(), v1) && LayoutNodeLayoutDelegate.this.z().N1() == this.N1() && LayoutNodeLayoutDelegate.this.z().K1() == this.K1()) {
                z = false;
            }
            this.Q1(IntSizeKt.a(LayoutNodeLayoutDelegate.this.z().N1(), LayoutNodeLayoutDelegate.this.z().K1()));
            return z;

            final class androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.remeasure.1 extends N implements Function1 {
                public static final androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.remeasure.1 e;

                static {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.remeasure.1.e = new androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.remeasure.1();
                }

                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.remeasure.1() {
                    super(1);
                }

                public final void a(@l AlignmentLinesOwner alignmentLinesOwner0) {
                    L.p(alignmentLinesOwner0, "it");
                    alignmentLinesOwner0.k().z(false);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((AlignmentLinesOwner)object0));
                    return S0.a;
                }
            }

        }

        public final void d2() {
            if(!this.g) {
                throw new IllegalStateException("Check failed.");
            }
            this.b2(this.i, this.k, this.j);
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public Map e() {
            if(!this.h) {
                if(LayoutNodeLayoutDelegate.this.s() == LayoutState.a) {
                    this.k().x(true);
                    if(this.k().g()) {
                        LayoutNodeLayoutDelegate.this.E();
                    }
                }
                else {
                    this.k().w(true);
                }
            }
            this.G0().e2(true);
            this.r0();
            this.G0().e2(false);
            return this.k().h();
        }

        public final void e2(boolean z) {
            this.p = z;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void f() {
            LayoutNode.C1(LayoutNodeLayoutDelegate.this.a, false, 1, null);
        }

        public final void f2(boolean z) {
            this.h = z;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int g(int v) {
            this.a2();
            return LayoutNodeLayoutDelegate.this.z().g(v);
        }

        private final void g2(LayoutNode layoutNode0) {
            UsageByParent layoutNode$UsageByParent0;
            LayoutNode layoutNode1 = layoutNode0.C0();
            if(layoutNode1 != null) {
                if(layoutNode0.u0() != UsageByParent.c && !layoutNode0.W()) {
                    throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode0.u0() + ". Parent state " + layoutNode1.m0() + '.').toString());
                }
                switch(layoutNode1.m0()) {
                    case 1: {
                        layoutNode$UsageByParent0 = UsageByParent.a;
                        break;
                    }
                    case 2: {
                        layoutNode$UsageByParent0 = UsageByParent.b;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Measurable could be only measured from the parent\'s measure or layout block. Parents state is " + layoutNode1.m0());
                    }
                }
                layoutNode0.N1(layoutNode$UsageByParent0);
                return;
            }
            layoutNode0.N1(UsageByParent.c);
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.z().getMeasuredHeight();
        }

        @Override  // androidx.compose.ui.layout.Placeable
        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.z().getMeasuredWidth();
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @m
        public AlignmentLinesOwner h() {
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.C0();
            if(layoutNode0 != null) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0.k0();
                return layoutNodeLayoutDelegate0 == null ? null : layoutNodeLayoutDelegate0.l();
            }
            return null;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int h1(int v) {
            this.a2();
            return LayoutNodeLayoutDelegate.this.z().h1(v);
        }

        public final boolean h2() {
            if(!this.l) {
                return false;
            }
            this.l = false;
            boolean z = L.g(this.c(), LayoutNodeLayoutDelegate.this.z().c());
            this.m = LayoutNodeLayoutDelegate.this.z().c();
            return !z;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public AlignmentLines k() {
            return this.n;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void r0() {
            this.k().s();
            if(LayoutNodeLayoutDelegate.this.r()) {
                this.Z1();
            }
            if(LayoutNodeLayoutDelegate.this.e || !this.h && !this.G0().b2() && LayoutNodeLayoutDelegate.this.r()) {
                LayoutNodeLayoutDelegate.this.d = false;
                LayoutNodeLayoutDelegate.this.b = LayoutState.c;
                LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a;
                LayoutNodeKt.b(layoutNode0).getSnapshotObserver().e(layoutNode0, false, new a(this, layoutNode0) {
                    final LayoutNodeLayoutDelegate e;
                    final MeasurePassDelegate f;
                    final LayoutNode g;

                    {
                        this.e = layoutNodeLayoutDelegate0;
                        this.f = layoutNodeLayoutDelegate$MeasurePassDelegate0;
                        this.g = layoutNode0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.a.J();
                        this.f.u1(androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.1.e);
                        this.g.e0().X1().l();
                        this.e.a.I();
                        this.f.u1(androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.2.e);

                        final class androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.1 extends N implements Function1 {
                            public static final androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.1 e;

                            static {
                                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.1.e = new androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.1();
                            }

                            androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.1() {
                                super(1);
                            }

                            public final void a(@l AlignmentLinesOwner alignmentLinesOwner0) {
                                L.p(alignmentLinesOwner0, "it");
                                alignmentLinesOwner0.k().o();
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((AlignmentLinesOwner)object0));
                                return S0.a;
                            }
                        }


                        final class androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.2 extends N implements Function1 {
                            public static final androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.2 e;

                            static {
                                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.2.e = new androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.2();
                            }

                            androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.layoutChildren.1.1.2() {
                                super(1);
                            }

                            public final void a(@l AlignmentLinesOwner alignmentLinesOwner0) {
                                L.p(alignmentLinesOwner0, "it");
                                alignmentLinesOwner0.k().v(alignmentLinesOwner0.k().o());
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((AlignmentLinesOwner)object0));
                                return S0.a;
                            }
                        }

                    }
                });
                LayoutNodeLayoutDelegate.this.b = LayoutNodeLayoutDelegate.this.s();
                if(this.G0().b2() && LayoutNodeLayoutDelegate.this.n()) {
                    this.requestLayout();
                }
                LayoutNodeLayoutDelegate.this.e = false;
            }
            if(this.k().o()) {
                this.k().v(true);
            }
            if(this.k().g() && this.k().l()) {
                this.k().r();
            }
        }

        @Override  // androidx.compose.ui.layout.Measurable
        @l
        public Placeable r1(long v) {
            UsageByParent layoutNode$UsageByParent0 = UsageByParent.c;
            if(LayoutNodeLayoutDelegate.this.a.j0() == layoutNode$UsageByParent0) {
                LayoutNodeLayoutDelegate.this.a.K();
            }
            if(LayoutNodeLayoutDelegate.this.C(LayoutNodeLayoutDelegate.this.a)) {
                this.f = true;
                this.R1(v);
                LayoutNodeLayoutDelegate.this.a.O1(layoutNode$UsageByParent0);
                LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = LayoutNodeLayoutDelegate.this.w();
                L.m(layoutNodeLayoutDelegate$LookaheadPassDelegate0);
                layoutNodeLayoutDelegate$LookaheadPassDelegate0.r1(v);
            }
            this.g2(LayoutNodeLayoutDelegate.this.a);
            this.c2(v);
            return this;
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.A1(LayoutNodeLayoutDelegate.this.a, false, 1, null);
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean u() {
            return LayoutNodeLayoutDelegate.this.a.u();
        }

        @Override  // androidx.compose.ui.node.AlignmentLinesOwner
        public void u1(@l Function1 function10) {
            L.p(function10, "block");
            List list0 = LayoutNodeLayoutDelegate.this.a.a0();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                function10.invoke(((LayoutNode)list0.get(v1)).k0().l());
            }
        }

        @Override  // androidx.compose.ui.layout.Measured
        public int v(@l AlignmentLine alignmentLine0) {
            L.p(alignmentLine0, "alignmentLine");
            LayoutNode layoutNode0 = LayoutNodeLayoutDelegate.this.a.C0();
            LayoutState layoutNode$LayoutState0 = null;
            if((layoutNode0 == null ? null : layoutNode0.m0()) == LayoutState.a) {
                this.k().z(true);
            }
            else {
                LayoutNode layoutNode1 = LayoutNodeLayoutDelegate.this.a.C0();
                if(layoutNode1 != null) {
                    layoutNode$LayoutState0 = layoutNode1.m0();
                }
                if(layoutNode$LayoutState0 == LayoutState.c) {
                    this.k().y(true);
                }
            }
            this.h = true;
            int v = LayoutNodeLayoutDelegate.this.z().v(alignmentLine0);
            this.h = false;
            return v;
        }
    }

    @l
    private final LayoutNode a;
    @l
    private LayoutState b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    @l
    private final MeasurePassDelegate k;
    @m
    private LookaheadPassDelegate l;

    public LayoutNodeLayoutDelegate(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        super();
        this.a = layoutNode0;
        this.b = LayoutState.e;
        this.k = new MeasurePassDelegate(this);
    }

    public final int A() {
        return this.k.N1();
    }

    public final void B() {
        this.k.X1();
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.l;
        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
            layoutNodeLayoutDelegate$LookaheadPassDelegate0.a2();
        }
    }

    private final boolean C(LayoutNode layoutNode0) {
        LookaheadScope lookaheadScope0 = layoutNode0.r0();
        return lookaheadScope0 == null ? L.g(null, layoutNode0) : L.g(lookaheadScope0.a(), layoutNode0);
    }

    public final void D() {
        this.k.e2(true);
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.l;
        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
            layoutNodeLayoutDelegate$LookaheadPassDelegate0.j2(true);
        }
    }

    public final void E() {
        this.d = true;
        this.e = true;
    }

    public final void F() {
        this.g = true;
        this.h = true;
    }

    public final void G() {
        this.f = true;
    }

    public final void H() {
        this.c = true;
    }

    public final void I(@m LookaheadScope lookaheadScope0) {
        this.l = lookaheadScope0 == null ? null : new LookaheadPassDelegate(this, lookaheadScope0);
    }

    private final void J(long v) {
        this.b = LayoutState.b;
        this.f = false;
        OwnerSnapshotObserver ownerSnapshotObserver0 = LayoutNodeKt.b(this.a).getSnapshotObserver();
        androidx.compose.ui.node.LayoutNodeLayoutDelegate.performLookaheadMeasure.1 layoutNodeLayoutDelegate$performLookaheadMeasure$10 = new a(v) {
            final LayoutNodeLayoutDelegate e;
            final long f;

            {
                this.e = layoutNodeLayoutDelegate0;
                this.f = v;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                LookaheadDelegate lookaheadDelegate0 = this.e.z().I2();
                L.m(lookaheadDelegate0);
                lookaheadDelegate0.r1(this.f);
            }
        };
        OwnerSnapshotObserver.h(ownerSnapshotObserver0, this.a, false, layoutNodeLayoutDelegate$performLookaheadMeasure$10, 2, null);
        this.F();
        if(this.C(this.a)) {
            this.E();
        }
        else {
            this.H();
        }
        this.b = LayoutState.e;
    }

    private final void K(long v) {
        LayoutState layoutNode$LayoutState0 = LayoutState.e;
        if(this.b != layoutNode$LayoutState0) {
            throw new IllegalStateException("layout state is not idle before measure starts");
        }
        this.b = LayoutState.a;
        this.c = false;
        OwnerSnapshotObserver ownerSnapshotObserver0 = LayoutNodeKt.b(this.a).getSnapshotObserver();
        androidx.compose.ui.node.LayoutNodeLayoutDelegate.performMeasure.2 layoutNodeLayoutDelegate$performMeasure$20 = new a(v) {
            final LayoutNodeLayoutDelegate e;
            final long f;

            {
                this.e = layoutNodeLayoutDelegate0;
                this.f = v;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.z().r1(this.f);
            }
        };
        ownerSnapshotObserver0.g(this.a, false, layoutNodeLayoutDelegate$performMeasure$20);
        if(this.b == LayoutState.a) {
            this.E();
            this.b = layoutNode$LayoutState0;
        }
    }

    public final void L() {
        this.k.k().t();
        LookaheadPassDelegate layoutNodeLayoutDelegate$LookaheadPassDelegate0 = this.l;
        if(layoutNodeLayoutDelegate$LookaheadPassDelegate0 != null) {
            AlignmentLines alignmentLines0 = layoutNodeLayoutDelegate$LookaheadPassDelegate0.k();
            if(alignmentLines0 != null) {
                alignmentLines0.t();
            }
        }
    }

    public final void M(int v) {
        int v1 = this.j;
        this.j = v;
        if((v1 == 0 ? 1 : 0) != (v == 0 ? 1 : 0)) {
            LayoutNode layoutNode0 = this.a.C0();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0 == null ? null : layoutNode0.k0();
            if(layoutNodeLayoutDelegate0 != null) {
                if(v == 0) {
                    layoutNodeLayoutDelegate0.M(layoutNodeLayoutDelegate0.j - 1);
                    return;
                }
                layoutNodeLayoutDelegate0.M(layoutNodeLayoutDelegate0.j + 1);
            }
        }
    }

    public final void N(boolean z) {
        if(this.i != z) {
            this.i = z;
            if(z) {
                this.M(this.j + 1);
                return;
            }
            this.M(this.j - 1);
        }
    }

    public final void O() {
        if(this.k.h2()) {
            LayoutNode layoutNode0 = this.a.C0();
            if(layoutNode0 != null) {
                LayoutNode.C1(layoutNode0, false, 1, null);
            }
        }
        if(this.l != null && this.l.n2()) {
            if(this.C(this.a)) {
                LayoutNode layoutNode1 = this.a.C0();
                if(layoutNode1 != null) {
                    LayoutNode.C1(layoutNode1, false, 1, null);
                }
            }
            else {
                LayoutNode layoutNode2 = this.a.C0();
                if(layoutNode2 != null) {
                    LayoutNode.y1(layoutNode2, false, 1, null);
                }
            }
        }
    }

    @l
    public final AlignmentLinesOwner l() {
        return this.k;
    }

    public final int m() {
        return this.j;
    }

    public final boolean n() {
        return this.i;
    }

    public final int o() {
        return this.k.K1();
    }

    @m
    public final Constraints p() {
        return this.k.V1();
    }

    @m
    public final Constraints q() {
        return this.l == null ? null : this.l.Y1();
    }

    public final boolean r() {
        return this.d;
    }

    @l
    public final LayoutState s() {
        return this.b;
    }

    @m
    public final AlignmentLinesOwner t() {
        return this.l;
    }

    public final boolean u() {
        return this.g;
    }

    public final boolean v() {
        return this.f;
    }

    @m
    public final LookaheadPassDelegate w() {
        return this.l;
    }

    @l
    public final MeasurePassDelegate x() {
        return this.k;
    }

    public final boolean y() {
        return this.c;
    }

    @l
    public final NodeCoordinator z() {
        return this.a.x0().q();
    }
}

