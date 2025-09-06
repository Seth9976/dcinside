package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalComposeUiApi
final class NodeMeasuringIntrinsics {
    static final class DefaultIntrinsicMeasurable implements Measurable {
        @l
        private final IntrinsicMeasurable a;
        @l
        private final IntrinsicMinMax b;
        @l
        private final IntrinsicWidthHeight c;

        public DefaultIntrinsicMeasurable(@l IntrinsicMeasurable intrinsicMeasurable0, @l IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax0, @l IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight0) {
            L.p(intrinsicMeasurable0, "measurable");
            L.p(nodeMeasuringIntrinsics$IntrinsicMinMax0, "minMax");
            L.p(nodeMeasuringIntrinsics$IntrinsicWidthHeight0, "widthHeight");
            super();
            this.a = intrinsicMeasurable0;
            this.b = nodeMeasuringIntrinsics$IntrinsicMinMax0;
            this.c = nodeMeasuringIntrinsics$IntrinsicWidthHeight0;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int D0(int v) {
            return this.a.D0(v);
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int S0(int v) {
            return this.a.S0(v);
        }

        @l
        public final IntrinsicMeasurable a() {
            return this.a;
        }

        @l
        public final IntrinsicMinMax b() {
            return this.b;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        @m
        public Object c() {
            return this.a.c();
        }

        @l
        public final IntrinsicWidthHeight d() {
            return this.c;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int g(int v) {
            return this.a.g(v);
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
        public int h1(int v) {
            return this.a.h1(v);
        }

        @Override  // androidx.compose.ui.layout.Measurable
        @l
        public Placeable r1(long v) {
            if(this.c == IntrinsicWidthHeight.a) {
                if(this.b == IntrinsicMinMax.b) {
                    int v1 = Constraints.o(v);
                    return new EmptyPlaceable(this.a.h1(v1), Constraints.o(v));
                }
                int v2 = Constraints.o(v);
                return new EmptyPlaceable(this.a.S0(v2), Constraints.o(v));
            }
            if(this.b == IntrinsicMinMax.b) {
                int v3 = Constraints.p(v);
                return new EmptyPlaceable(Constraints.p(v), this.a.g(v3));
            }
            int v4 = Constraints.p(v);
            return new EmptyPlaceable(Constraints.p(v), this.a.D0(v4));
        }
    }

    static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int v, int v1) {
            this.Q1(IntSizeKt.a(v, v1));
        }

        @Override  // androidx.compose.ui.layout.Placeable
        protected void O1(long v, float f, @m Function1 function10) {
        }

        @Override  // androidx.compose.ui.layout.Measured
        public int v(@l AlignmentLine alignmentLine0) {
            L.p(alignmentLine0, "alignmentLine");
            return 0x80000000;
        }
    }

    static enum IntrinsicMinMax {
        Min,
        Max;

        private static final IntrinsicMinMax[] a() [...] // Inlined contents
    }

    static enum IntrinsicWidthHeight {
        Width,
        Height;

        private static final IntrinsicWidthHeight[] a() [...] // Inlined contents
    }

    @l
    public static final NodeMeasuringIntrinsics a;

    static {
        NodeMeasuringIntrinsics.a = new NodeMeasuringIntrinsics();
    }

    public final int a(@l LayoutModifierNode layoutModifierNode0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(layoutModifierNode0, "node");
        L.p(intrinsicMeasureScope0, "instrinsicMeasureScope");
        L.p(intrinsicMeasurable0, "intrinsicMeasurable");
        DefaultIntrinsicMeasurable nodeMeasuringIntrinsics$DefaultIntrinsicMeasurable0 = new DefaultIntrinsicMeasurable(intrinsicMeasurable0, IntrinsicMinMax.b, IntrinsicWidthHeight.b);
        long v1 = ConstraintsKt.b(0, v, 0, 0, 13, null);
        return layoutModifierNode0.h(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), nodeMeasuringIntrinsics$DefaultIntrinsicMeasurable0, v1).getHeight();
    }

    public final int b(@l LayoutModifierNode layoutModifierNode0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(layoutModifierNode0, "node");
        L.p(intrinsicMeasureScope0, "instrinsicMeasureScope");
        L.p(intrinsicMeasurable0, "intrinsicMeasurable");
        DefaultIntrinsicMeasurable nodeMeasuringIntrinsics$DefaultIntrinsicMeasurable0 = new DefaultIntrinsicMeasurable(intrinsicMeasurable0, IntrinsicMinMax.b, IntrinsicWidthHeight.a);
        long v1 = ConstraintsKt.b(0, 0, 0, v, 7, null);
        return layoutModifierNode0.h(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), nodeMeasuringIntrinsics$DefaultIntrinsicMeasurable0, v1).getWidth();
    }

    public final int c(@l LayoutModifierNode layoutModifierNode0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(layoutModifierNode0, "node");
        L.p(intrinsicMeasureScope0, "instrinsicMeasureScope");
        L.p(intrinsicMeasurable0, "intrinsicMeasurable");
        DefaultIntrinsicMeasurable nodeMeasuringIntrinsics$DefaultIntrinsicMeasurable0 = new DefaultIntrinsicMeasurable(intrinsicMeasurable0, IntrinsicMinMax.a, IntrinsicWidthHeight.b);
        long v1 = ConstraintsKt.b(0, v, 0, 0, 13, null);
        return layoutModifierNode0.h(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), nodeMeasuringIntrinsics$DefaultIntrinsicMeasurable0, v1).getHeight();
    }

    public final int d(@l LayoutModifierNode layoutModifierNode0, @l IntrinsicMeasureScope intrinsicMeasureScope0, @l IntrinsicMeasurable intrinsicMeasurable0, int v) {
        L.p(layoutModifierNode0, "node");
        L.p(intrinsicMeasureScope0, "instrinsicMeasureScope");
        L.p(intrinsicMeasurable0, "intrinsicMeasurable");
        DefaultIntrinsicMeasurable nodeMeasuringIntrinsics$DefaultIntrinsicMeasurable0 = new DefaultIntrinsicMeasurable(intrinsicMeasurable0, IntrinsicMinMax.a, IntrinsicWidthHeight.a);
        long v1 = ConstraintsKt.b(0, 0, 0, v, 7, null);
        return layoutModifierNode0.h(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), nodeMeasuringIntrinsics$DefaultIntrinsicMeasurable0, v1).getWidth();
    }
}

