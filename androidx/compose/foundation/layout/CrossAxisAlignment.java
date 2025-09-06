package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public abstract class CrossAxisAlignment {
    static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {
        @l
        private final AlignmentLineProvider e;

        public AlignmentLineCrossAxisAlignment(@l AlignmentLineProvider alignmentLineProvider0) {
            L.p(alignmentLineProvider0, "alignmentLineProvider");
            super(null);
            this.e = alignmentLineProvider0;
        }

        @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
        public int d(int v, @l LayoutDirection layoutDirection0, @l Placeable placeable0, int v1) {
            L.p(layoutDirection0, "layoutDirection");
            L.p(placeable0, "placeable");
            int v2 = this.e.a(placeable0);
            if(v2 != 0x80000000) {
                int v3 = v1 - v2;
                return layoutDirection0 == LayoutDirection.b ? v - v3 : v3;
            }
            return 0;
        }

        @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
        @l
        public Integer e(@l Placeable placeable0) {
            L.p(placeable0, "placeable");
            return this.e.a(placeable0);
        }

        @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
        public boolean f() {
            return true;
        }

        @l
        public final AlignmentLineProvider g() {
            return this.e;
        }
    }

    static final class CenterCrossAxisAlignment extends CrossAxisAlignment {
        @l
        public static final CenterCrossAxisAlignment e;

        static {
            CenterCrossAxisAlignment.e = new CenterCrossAxisAlignment();
        }

        private CenterCrossAxisAlignment() {
            super(null);
        }

        @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
        public int d(int v, @l LayoutDirection layoutDirection0, @l Placeable placeable0, int v1) {
            L.p(layoutDirection0, "layoutDirection");
            L.p(placeable0, "placeable");
            return v / 2;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final CrossAxisAlignment a(@l AlignmentLine alignmentLine0) {
            L.p(alignmentLine0, "alignmentLine");
            return new AlignmentLineCrossAxisAlignment(new Value(alignmentLine0));
        }

        @l
        public final CrossAxisAlignment b(@l AlignmentLineProvider alignmentLineProvider0) {
            L.p(alignmentLineProvider0, "alignmentLineProvider");
            return new AlignmentLineCrossAxisAlignment(alignmentLineProvider0);
        }

        @l
        public final CrossAxisAlignment c() {
            return CrossAxisAlignment.b;
        }

        @Stable
        public static void d() {
        }

        @l
        public final CrossAxisAlignment e() {
            return CrossAxisAlignment.d;
        }

        @Stable
        public static void f() {
        }

        @l
        public final CrossAxisAlignment g() {
            return CrossAxisAlignment.c;
        }

        @Stable
        public static void h() {
        }

        @l
        public final CrossAxisAlignment i(@l Horizontal alignment$Horizontal0) {
            L.p(alignment$Horizontal0, "horizontal");
            return new HorizontalCrossAxisAlignment(alignment$Horizontal0);
        }

        @l
        public final CrossAxisAlignment j(@l Vertical alignment$Vertical0) {
            L.p(alignment$Vertical0, "vertical");
            return new VerticalCrossAxisAlignment(alignment$Vertical0);
        }
    }

    static final class EndCrossAxisAlignment extends CrossAxisAlignment {
        @l
        public static final EndCrossAxisAlignment e;

        static {
            EndCrossAxisAlignment.e = new EndCrossAxisAlignment();
        }

        private EndCrossAxisAlignment() {
            super(null);
        }

        @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
        public int d(int v, @l LayoutDirection layoutDirection0, @l Placeable placeable0, int v1) {
            L.p(layoutDirection0, "layoutDirection");
            L.p(placeable0, "placeable");
            return layoutDirection0 == LayoutDirection.a ? v : 0;
        }
    }

    static final class HorizontalCrossAxisAlignment extends CrossAxisAlignment {
        @l
        private final Horizontal e;

        public HorizontalCrossAxisAlignment(@l Horizontal alignment$Horizontal0) {
            L.p(alignment$Horizontal0, "horizontal");
            super(null);
            this.e = alignment$Horizontal0;
        }

        @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
        public int d(int v, @l LayoutDirection layoutDirection0, @l Placeable placeable0, int v1) {
            L.p(layoutDirection0, "layoutDirection");
            L.p(placeable0, "placeable");
            return this.e.a(0, v, layoutDirection0);
        }

        @l
        public final Horizontal g() {
            return this.e;
        }
    }

    static final class StartCrossAxisAlignment extends CrossAxisAlignment {
        @l
        public static final StartCrossAxisAlignment e;

        static {
            StartCrossAxisAlignment.e = new StartCrossAxisAlignment();
        }

        private StartCrossAxisAlignment() {
            super(null);
        }

        @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
        public int d(int v, @l LayoutDirection layoutDirection0, @l Placeable placeable0, int v1) {
            L.p(layoutDirection0, "layoutDirection");
            L.p(placeable0, "placeable");
            return layoutDirection0 == LayoutDirection.a ? 0 : v;
        }
    }

    static final class VerticalCrossAxisAlignment extends CrossAxisAlignment {
        @l
        private final Vertical e;

        public VerticalCrossAxisAlignment(@l Vertical alignment$Vertical0) {
            L.p(alignment$Vertical0, "vertical");
            super(null);
            this.e = alignment$Vertical0;
        }

        @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
        public int d(int v, @l LayoutDirection layoutDirection0, @l Placeable placeable0, int v1) {
            L.p(layoutDirection0, "layoutDirection");
            L.p(placeable0, "placeable");
            return this.e.a(0, v);
        }

        @l
        public final Vertical g() {
            return this.e;
        }
    }

    @l
    public static final Companion a;
    @l
    private static final CrossAxisAlignment b;
    @l
    private static final CrossAxisAlignment c;
    @l
    private static final CrossAxisAlignment d;

    static {
        CrossAxisAlignment.a = new Companion(null);
        CrossAxisAlignment.b = CenterCrossAxisAlignment.e;
        CrossAxisAlignment.c = StartCrossAxisAlignment.e;
        CrossAxisAlignment.d = EndCrossAxisAlignment.e;
    }

    private CrossAxisAlignment() {
    }

    public CrossAxisAlignment(w w0) {
    }

    public abstract int d(int arg1, @l LayoutDirection arg2, @l Placeable arg3, int arg4);

    @m
    public Integer e(@l Placeable placeable0) {
        L.p(placeable0, "placeable");
        return null;
    }

    public boolean f() {
        return false;
    }
}

