package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public abstract class Placeable implements Measured {
    @StabilityInferred(parameters = 0)
    @s0({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,421:1\n318#1,2:422\n335#1:424\n336#1:426\n321#1,2:427\n335#1,2:429\n327#1:431\n318#1,2:432\n335#1:434\n336#1:436\n321#1,2:437\n335#1,2:439\n327#1:441\n335#1:442\n336#1:444\n335#1:445\n336#1:447\n318#1,2:448\n335#1:450\n336#1:452\n321#1,2:453\n335#1,2:455\n327#1:457\n318#1,2:458\n335#1:460\n336#1:462\n321#1,2:463\n335#1,2:465\n327#1:467\n335#1:468\n336#1:470\n335#1:471\n336#1:473\n335#1:474\n336#1:476\n335#1:477\n336#1:479\n86#2:425\n86#2:435\n86#2:443\n86#2:446\n86#2:451\n86#2:461\n86#2:469\n86#2:472\n86#2:475\n86#2:478\n86#2:480\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n184#1:422,2\n184#1:424\n184#1:426\n184#1:427,2\n184#1:429,2\n184#1:431\n200#1:432,2\n200#1:434\n200#1:436\n200#1:437,2\n200#1:439,2\n200#1:441\n212#1:442\n212#1:444\n224#1:445\n224#1:447\n247#1:448,2\n247#1:450\n247#1:452\n247#1:453,2\n247#1:455,2\n247#1:457\n271#1:458,2\n271#1:460\n271#1:462\n271#1:463,2\n271#1:465,2\n271#1:467\n291#1:468\n291#1:470\n310#1:471\n310#1:473\n319#1:474\n319#1:476\n321#1:477\n321#1:479\n184#1:425\n200#1:435\n212#1:443\n224#1:446\n247#1:451\n271#1:461\n291#1:469\n310#1:472\n319#1:475\n321#1:478\n335#1:480\n*E\n"})
    public static abstract class PlacementScope {
        public static final class Companion extends PlacementScope {
            private Companion() {
            }

            public Companion(w w0) {
            }

            // 去混淆评级： 低(20)
            public static final int I(Companion placeable$PlacementScope$Companion0) [...] // 潜在的解密器

            private final boolean J(LookaheadCapablePlaceable lookaheadCapablePlaceable0) {
                if(lookaheadCapablePlaceable0 == null) {
                    PlacementScope.e = null;
                    PlacementScope.f = null;
                    return false;
                }
                boolean z = lookaheadCapablePlaceable0.b2();
                LookaheadCapablePlaceable lookaheadCapablePlaceable1 = lookaheadCapablePlaceable0.Y1();
                if(lookaheadCapablePlaceable1 != null && lookaheadCapablePlaceable1.b2()) {
                    lookaheadCapablePlaceable0.e2(true);
                }
                PlacementScope.f = lookaheadCapablePlaceable0.M0().k0();
                if(!lookaheadCapablePlaceable0.b2() && !lookaheadCapablePlaceable0.c2()) {
                    PlacementScope.e = lookaheadCapablePlaceable0.V1();
                    return z;
                }
                PlacementScope.e = null;
                return z;
            }

            public final void K(int v, @l LayoutDirection layoutDirection0, @m LookaheadCapablePlaceable lookaheadCapablePlaceable0, @l Function1 function10) {
                L.p(layoutDirection0, "parentLayoutDirection");
                L.p(function10, "block");
                LayoutCoordinates layoutCoordinates0 = PlacementScope.e;
                LayoutDirection layoutDirection1 = PlacementScope.a.m();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = PlacementScope.f;
                PlacementScope.d = v;
                PlacementScope.c = layoutDirection0;
                boolean z = this.J(lookaheadCapablePlaceable0);
                function10.invoke(this);
                if(lookaheadCapablePlaceable0 != null) {
                    lookaheadCapablePlaceable0.e2(z);
                }
                PlacementScope.d = 0;
                PlacementScope.c = layoutDirection1;
                PlacementScope.e = layoutCoordinates0;
                PlacementScope.f = layoutNodeLayoutDelegate0;
            }

            @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
            @m
            public LayoutCoordinates k() {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = PlacementScope.f;
                if(layoutNodeLayoutDelegate0 != null) {
                    layoutNodeLayoutDelegate0.N(true);
                }
                return PlacementScope.e;
            }

            @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
            @ExperimentalComposeUiApi
            public static void l() {
            }

            @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
            @l
            protected LayoutDirection m() {
                return PlacementScope.c;
            }

            // 去混淆评级： 低(20)
            @Override  // androidx.compose.ui.layout.Placeable$PlacementScope
            protected int n() [...] // 潜在的解密器
        }

        @l
        public static final Companion a;
        public static final int b;
        @l
        private static LayoutDirection c;
        private static int d;
        @m
        private static LayoutCoordinates e;
        @m
        private static LayoutNodeLayoutDelegate f;

        static {
            PlacementScope.a = new Companion(null);
            PlacementScope.c = LayoutDirection.a;
        }

        public final void A(@l Placeable placeable0, long v, float f, @l Function1 function10) {
            L.p(placeable0, "$this$placeRelativeWithLayer");
            L.p(function10, "layerBlock");
            if(this.m() != LayoutDirection.a && this.n() != 0) {
                long v1 = IntOffsetKt.a(this.n() - placeable0.N1() - ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                long v2 = placeable0.J1();
                placeable0.O1(IntOffsetKt.a(((int)(v1 >> 0x20)) + ((int)(v2 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)) + ((int)(v2 & 0xFFFFFFFFL))), f, function10);
                return;
            }
            long v3 = placeable0.J1();
            placeable0.O1(IntOffsetKt.a(((int)(v >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL))), f, function10);
        }

        public static void B(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, Function1 function10, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if((v1 & 4) != 0) {
                function10 = PlaceableKt.a;
            }
            placeable$PlacementScope0.A(placeable0, v, ((v1 & 2) == 0 ? f : 0.0f), function10);
        }

        public final void C(@l Placeable placeable0, int v, int v1, float f, @l Function1 function10) {
            L.p(placeable0, "<this>");
            L.p(function10, "layerBlock");
            long v2 = IntOffsetKt.a(v, v1);
            long v3 = placeable0.J1();
            placeable0.O1(IntOffsetKt.a(((int)(v2 >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL))), f, function10);
        }

        public static void D(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, Function1 function10, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if((v2 & 8) != 0) {
                function10 = PlaceableKt.a;
            }
            placeable$PlacementScope0.C(placeable0, v, v1, ((v2 & 4) == 0 ? f : 0.0f), function10);
        }

        public final void E(@l Placeable placeable0, long v, float f, @l Function1 function10) {
            L.p(placeable0, "$this$placeWithLayer");
            L.p(function10, "layerBlock");
            long v1 = placeable0.J1();
            placeable0.O1(IntOffsetKt.a(((int)(v >> 0x20)) + ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL))), f, function10);
        }

        public static void F(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, Function1 function10, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if((v1 & 4) != 0) {
                function10 = PlaceableKt.a;
            }
            placeable$PlacementScope0.E(placeable0, v, ((v1 & 2) == 0 ? f : 0.0f), function10);
        }

        public static final int e() [...] // 潜在的解密器

        @ExperimentalComposeUiApi
        @m
        public LayoutCoordinates k() {
            return null;
        }

        @ExperimentalComposeUiApi
        public static void l() {
        }

        @l
        protected abstract LayoutDirection m();

        protected abstract int n();

        public final void o(@l Placeable placeable0, int v, int v1, float f) {
            L.p(placeable0, "<this>");
            long v2 = IntOffsetKt.a(v, v1);
            long v3 = placeable0.J1();
            placeable0.O1(IntOffsetKt.a(((int)(v2 >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL))), f, null);
        }

        public static void p(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if((v2 & 4) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.o(placeable0, v, v1, f);
        }

        public final void q(@l Placeable placeable0, long v, float f) {
            L.p(placeable0, "$this$place");
            long v1 = placeable0.J1();
            placeable0.O1(IntOffsetKt.a(((int)(v >> 0x20)) + ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL))), f, null);
        }

        public static void r(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.q(placeable0, v, f);
        }

        public final void s(@l Placeable placeable0, long v, float f, @m Function1 function10) {
            L.p(placeable0, "$this$placeApparentToRealOffset");
            long v1 = placeable0.J1();
            placeable0.O1(IntOffsetKt.a(((int)(v >> 0x20)) + ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL))), f, function10);
        }

        public final void t(@l Placeable placeable0, long v, float f, @m Function1 function10) {
            L.p(placeable0, "$this$placeAutoMirrored");
            if(this.m() != LayoutDirection.a && this.n() != 0) {
                long v1 = IntOffsetKt.a(this.n() - placeable0.N1() - ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                long v2 = placeable0.J1();
                placeable0.O1(IntOffsetKt.a(((int)(v1 >> 0x20)) + ((int)(v2 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)) + ((int)(v2 & 0xFFFFFFFFL))), f, function10);
                return;
            }
            long v3 = placeable0.J1();
            placeable0.O1(IntOffsetKt.a(((int)(v >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL))), f, function10);
        }

        public final void u(@l Placeable placeable0, int v, int v1, float f) {
            L.p(placeable0, "<this>");
            long v2 = IntOffsetKt.a(v, v1);
            if(this.m() != LayoutDirection.a && this.n() != 0) {
                long v3 = IntOffsetKt.a(this.n() - placeable0.N1() - ((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)));
                long v4 = placeable0.J1();
                placeable0.O1(IntOffsetKt.a(((int)(v3 >> 0x20)) + ((int)(v4 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) + ((int)(v4 & 0xFFFFFFFFL))), f, null);
                return;
            }
            long v5 = placeable0.J1();
            placeable0.O1(IntOffsetKt.a(((int)(v2 >> 0x20)) + ((int)(v5 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v5 & 0xFFFFFFFFL))), f, null);
        }

        public static void v(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if((v2 & 4) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.u(placeable0, v, v1, f);
        }

        public final void w(@l Placeable placeable0, long v, float f) {
            L.p(placeable0, "$this$placeRelative");
            if(this.m() != LayoutDirection.a && this.n() != 0) {
                long v1 = IntOffsetKt.a(this.n() - placeable0.N1() - ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                long v2 = placeable0.J1();
                placeable0.O1(IntOffsetKt.a(IntOffset.m(v1) + IntOffset.m(v2), v1 + v2), f, null);
                return;
            }
            long v3 = placeable0.J1();
            placeable0.O1(IntOffsetKt.a(IntOffset.m(v) + IntOffset.m(v3), v + v3), f, null);
        }

        public static void x(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.w(placeable0, v, f);
        }

        public final void y(@l Placeable placeable0, int v, int v1, float f, @l Function1 function10) {
            L.p(placeable0, "<this>");
            L.p(function10, "layerBlock");
            long v2 = IntOffsetKt.a(v, v1);
            if(this.m() != LayoutDirection.a && this.n() != 0) {
                long v3 = IntOffsetKt.a(this.n() - placeable0.N1() - ((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)));
                long v4 = placeable0.J1();
                placeable0.O1(IntOffsetKt.a(((int)(v3 >> 0x20)) + ((int)(v4 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) + ((int)(v4 & 0xFFFFFFFFL))), f, function10);
                return;
            }
            long v5 = placeable0.J1();
            placeable0.O1(IntOffsetKt.a(((int)(v2 >> 0x20)) + ((int)(v5 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v5 & 0xFFFFFFFFL))), f, function10);
        }

        public static void z(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, Function1 function10, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if((v2 & 8) != 0) {
                function10 = PlaceableKt.a;
            }
            placeable$PlacementScope0.y(placeable0, v, v1, ((v2 & 4) == 0 ? f : 0.0f), function10);
        }
    }

    private int a;
    private int b;
    private long c;
    private long d;
    public static final int e = 8;

    static {
    }

    public Placeable() {
        this.c = 0L;
        this.d = 3L;
    }

    protected final long J1() {
        return IntOffsetKt.a((this.a - ((int)(this.c >> 0x20))) / 2, (this.b - ((int)(this.c & 0xFFFFFFFFL))) / 2);
    }

    public final int K1() {
        return this.b;
    }

    protected final long L1() {
        return this.c;
    }

    protected final long M1() {
        return this.d;
    }

    public final int N1() {
        return this.a;
    }

    protected abstract void O1(long arg1, float arg2, @m Function1 arg3);

    private final void P1() {
        this.a = s.I(((int)(this.c >> 0x20)), Constraints.r(this.d), Constraints.p(this.d));
        this.b = s.I(((int)(this.c & 0xFFFFFFFFL)), Constraints.q(this.d), Constraints.o(this.d));
    }

    protected final void Q1(long v) {
        if(!IntSize.h(this.c, v)) {
            this.c = v;
            this.P1();
        }
    }

    protected final void R1(long v) {
        if(!Constraints.g(this.d, v)) {
            this.d = v;
            this.P1();
        }
    }

    @Override  // androidx.compose.ui.layout.Measured
    public Object c() {
        return null;
    }

    @Override  // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return (int)(this.c & 0xFFFFFFFFL);
    }

    @Override  // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return (int)(this.c >> 0x20);
    }
}

