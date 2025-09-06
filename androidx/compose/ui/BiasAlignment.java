package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.math.b;
import y4.l;
import y4.m;

@Immutable
public final class BiasAlignment implements Alignment {
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
            return layoutDirection0 == LayoutDirection.a ? b.L0(((float)(v1 - v)) / 2.0f * (this.a + 1.0f)) : b.L0(((float)(v1 - v)) / 2.0f * (-1.0f * this.a + 1.0f));
        }

        private final float b() {
            return this.a;
        }

        @l
        public final Horizontal c(float f) {
            return new Horizontal(f);
        }

        public static Horizontal d(Horizontal biasAlignment$Horizontal0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = biasAlignment$Horizontal0.a;
            }
            return biasAlignment$Horizontal0.c(f);
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

    @Immutable
    public static final class Vertical implements androidx.compose.ui.Alignment.Vertical {
        private final float a;
        public static final int b;

        static {
        }

        public Vertical(float f) {
            this.a = f;
        }

        @Override  // androidx.compose.ui.Alignment$Vertical
        public int a(int v, int v1) {
            return b.L0(((float)(v1 - v)) / 2.0f * (this.a + 1.0f));
        }

        private final float b() {
            return this.a;
        }

        @l
        public final Vertical c(float f) {
            return new Vertical(f);
        }

        public static Vertical d(Vertical biasAlignment$Vertical0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = biasAlignment$Vertical0.a;
            }
            return biasAlignment$Vertical0.c(f);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Vertical ? Float.compare(this.a, ((Vertical)object0).a) == 0 : false;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        @Override
        @l
        public String toString() {
            return "Vertical(bias=" + this.a + ')';
        }
    }

    private final float b;
    private final float c;
    public static final int d;

    static {
    }

    public BiasAlignment(float f, float f1) {
        this.b = f;
        this.c = f1;
    }

    @Override  // androidx.compose.ui.Alignment
    public long a(long v, long v1, @l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "layoutDirection");
        return layoutDirection0 == LayoutDirection.a ? IntOffsetKt.a(b.L0(((float)(((int)(v1 >> 0x20)) - ((int)(v >> 0x20)))) / 2.0f * (this.b + 1.0f)), b.L0(((float)(((int)(v1 & 0xFFFFFFFFL)) - ((int)(v & 0xFFFFFFFFL)))) / 2.0f * (this.c + 1.0f))) : IntOffsetKt.a(b.L0(((float)(((int)(v1 >> 0x20)) - ((int)(v >> 0x20)))) / 2.0f * (-1.0f * this.b + 1.0f)), b.L0(((float)(((int)(v1 & 0xFFFFFFFFL)) - ((int)(v & 0xFFFFFFFFL)))) / 2.0f * (this.c + 1.0f)));
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    @l
    public final BiasAlignment d(float f, float f1) {
        return new BiasAlignment(f, f1);
    }

    public static BiasAlignment e(BiasAlignment biasAlignment0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = biasAlignment0.b;
        }
        if((v & 2) != 0) {
            f1 = biasAlignment0.c;
        }
        return biasAlignment0.d(f, f1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BiasAlignment)) {
            return false;
        }
        return Float.compare(this.b, ((BiasAlignment)object0).b) == 0 ? Float.compare(this.c, ((BiasAlignment)object0).c) == 0 : false;
    }

    public final float f() {
        return this.b;
    }

    public final float g() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.b) * 0x1F + Float.floatToIntBits(this.c);
    }

    @Override
    @l
    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.b + ", verticalBias=" + this.c + ')';
    }
}

