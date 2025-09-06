package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class AlignmentLineProvider {
    @StabilityInferred(parameters = 0)
    public static final class Block extends AlignmentLineProvider {
        @l
        private final Function1 a;
        public static final int b;

        static {
        }

        public Block(@l Function1 function10) {
            L.p(function10, "lineProviderBlock");
            super(null);
            this.a = function10;
        }

        @Override  // androidx.compose.foundation.layout.AlignmentLineProvider
        public int a(@l Placeable placeable0) {
            L.p(placeable0, "placeable");
            return ((Number)this.a.invoke(placeable0)).intValue();
        }

        @l
        public final Function1 b() {
            return this.a;
        }

        @l
        public final Block c(@l Function1 function10) {
            L.p(function10, "lineProviderBlock");
            return new Block(function10);
        }

        public static Block d(Block alignmentLineProvider$Block0, Function1 function10, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = alignmentLineProvider$Block0.a;
            }
            return alignmentLineProvider$Block0.c(function10);
        }

        @l
        public final Function1 e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Block ? L.g(this.a, ((Block)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Block(lineProviderBlock=" + this.a + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Value extends AlignmentLineProvider {
        @l
        private final AlignmentLine a;
        public static final int b;

        static {
        }

        public Value(@l AlignmentLine alignmentLine0) {
            L.p(alignmentLine0, "alignmentLine");
            super(null);
            this.a = alignmentLine0;
        }

        @Override  // androidx.compose.foundation.layout.AlignmentLineProvider
        public int a(@l Placeable placeable0) {
            L.p(placeable0, "placeable");
            return placeable0.v(this.a);
        }

        @l
        public final AlignmentLine b() {
            return this.a;
        }

        @l
        public final Value c(@l AlignmentLine alignmentLine0) {
            L.p(alignmentLine0, "alignmentLine");
            return new Value(alignmentLine0);
        }

        public static Value d(Value alignmentLineProvider$Value0, AlignmentLine alignmentLine0, int v, Object object0) {
            if((v & 1) != 0) {
                alignmentLine0 = alignmentLineProvider$Value0.a;
            }
            return alignmentLineProvider$Value0.c(alignmentLine0);
        }

        @l
        public final AlignmentLine e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Value ? L.g(this.a, ((Value)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Value(alignmentLine=" + this.a + ')';
        }
    }

    private AlignmentLineProvider() {
    }

    public AlignmentLineProvider(w w0) {
    }

    public abstract int a(@l Placeable arg1);
}

