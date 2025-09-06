package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.math.b;
import y4.l;
import y4.m;

@Immutable
public final class BiasAbsoluteAlignment implements Alignment {
    @Immutable
    public static final class Horizontal implements androidx.compose.ui.Alignment.Horizontal {
        private final float a;
        public static final int b;

        static {
        }

        public Horizontal(float f) {
            this.a = f;
        }

        @Override  // androidx.compose.ui.Alignment$Horizontal
        public int a(int v, int v1, @l LayoutDirection layoutDirection0) {
            L.p(layoutDirection0, "layoutDirection");
            return b.L0(((float)(v1 - v)) / 2.0f * (this.a + 1.0f));
        }

        private final float b() {
            return this.a;
        }

        @l
        public final Horizontal c(float f) {
            return new Horizontal(f);
        }

        public static Horizontal d(Horizontal biasAbsoluteAlignment$Horizontal0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = biasAbsoluteAlignment$Horizontal0.a;
            }
            return biasAbsoluteAlignment$Horizontal0.c(f);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Horizontal ? Float.compare(this.a, ((Horizontal)object0).a) == 0 : false;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        @Override
        @l
        public String toString() {
            return "Horizontal(bias=" + this.a + ')';
        }
    }

    private final float b;
    private final float c;
    public static final int d;

    static {
    }

    public BiasAbsoluteAlignment(float f, float f1) {
        this.b = f;
        this.c = f1;
    }

    @Override  // androidx.compose.ui.Alignment
    public long a(long v, long v1, @l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "layoutDirection");
        long v2 = IntSizeKt.a(((int)(v1 >> 0x20)) - ((int)(v >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)) - ((int)(v & 0xFFFFFFFFL)));
        return IntOffsetKt.a(b.L0(((float)(((int)(v2 >> 0x20)))) / 2.0f * (this.b + 1.0f)), b.L0(((float)(((int)(v2 & 0xFFFFFFFFL)))) / 2.0f * (this.c + 1.0f)));
    }

    private final float b() {
        return this.b;
    }

    private final float c() {
        return this.c;
    }

    @l
    public final BiasAbsoluteAlignment d(float f, float f1) {
        return new BiasAbsoluteAlignment(f, f1);
    }

    public static BiasAbsoluteAlignment e(BiasAbsoluteAlignment biasAbsoluteAlignment0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = biasAbsoluteAlignment0.b;
        }
        if((v & 2) != 0) {
            f1 = biasAbsoluteAlignment0.c;
        }
        return biasAbsoluteAlignment0.d(f, f1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        return Float.compare(this.b, ((BiasAbsoluteAlignment)object0).b) == 0 ? Float.compare(this.c, ((BiasAbsoluteAlignment)object0).c) == 0 : false;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.b) * 0x1F + Float.floatToIntBits(this.c);
    }

    @Override
    @l
    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.b + ", verticalBias=" + this.c + ')';
    }
}

