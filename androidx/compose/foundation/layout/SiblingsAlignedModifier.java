package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class SiblingsAlignedModifier extends InspectorValueInfo implements ParentDataModifier {
    public static final class WithAlignmentLine extends SiblingsAlignedModifier {
        @l
        private final AlignmentLine d;

        public WithAlignmentLine(@l AlignmentLine alignmentLine0, @l Function1 function10) {
            L.p(alignmentLine0, "alignmentLine");
            L.p(function10, "inspectorInfo");
            super(function10, null);
            this.d = alignmentLine0;
        }

        @Override  // androidx.compose.foundation.layout.SiblingsAlignedModifier
        @l
        public Object E(@l Density density0, @m Object object0) {
            L.p(density0, "<this>");
            RowColumnParentData rowColumnParentData0 = object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
            if(rowColumnParentData0 == null) {
                rowColumnParentData0 = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            Value alignmentLineProvider$Value0 = new Value(this.d);
            rowColumnParentData0.i(CrossAxisAlignment.a.b(alignmentLineProvider$Value0));
            return rowColumnParentData0;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            WithAlignmentLine siblingsAlignedModifier$WithAlignmentLine0 = object0 instanceof WithAlignmentLine ? ((WithAlignmentLine)object0) : null;
            return siblingsAlignedModifier$WithAlignmentLine0 == null ? false : L.g(this.d, siblingsAlignedModifier$WithAlignmentLine0.d);
        }

        @Override
        public int hashCode() {
            return this.d.hashCode();
        }

        @l
        public final AlignmentLine j() {
            return this.d;
        }

        @Override
        @l
        public String toString() {
            return "WithAlignmentLine(line=" + this.d + ')';
        }
    }

    public static final class WithAlignmentLineBlock extends SiblingsAlignedModifier {
        @l
        private final Function1 d;

        public WithAlignmentLineBlock(@l Function1 function10, @l Function1 function11) {
            L.p(function10, "block");
            L.p(function11, "inspectorInfo");
            super(function11, null);
            this.d = function10;
        }

        @Override  // androidx.compose.foundation.layout.SiblingsAlignedModifier
        @l
        public Object E(@l Density density0, @m Object object0) {
            L.p(density0, "<this>");
            RowColumnParentData rowColumnParentData0 = object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
            if(rowColumnParentData0 == null) {
                rowColumnParentData0 = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            Block alignmentLineProvider$Block0 = new Block(this.d);
            rowColumnParentData0.i(CrossAxisAlignment.a.b(alignmentLineProvider$Block0));
            return rowColumnParentData0;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            WithAlignmentLineBlock siblingsAlignedModifier$WithAlignmentLineBlock0 = object0 instanceof WithAlignmentLineBlock ? ((WithAlignmentLineBlock)object0) : null;
            return siblingsAlignedModifier$WithAlignmentLineBlock0 == null ? false : L.g(this.d, siblingsAlignedModifier$WithAlignmentLineBlock0.d);
        }

        @Override
        public int hashCode() {
            return this.d.hashCode();
        }

        @l
        public final Function1 j() {
            return this.d;
        }

        @Override
        @l
        public String toString() {
            return "WithAlignmentLineBlock(block=" + this.d + ')';
        }
    }

    private SiblingsAlignedModifier(Function1 function10) {
        super(function10);
    }

    public SiblingsAlignedModifier(Function1 function10, w w0) {
        this(function10);
    }

    @Override  // androidx.compose.ui.layout.ParentDataModifier
    @m
    public abstract Object E(@l Density arg1, @m Object arg2);

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

