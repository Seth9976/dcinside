package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.f;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1195:1\n1#2:1196\n*E\n"})
public final class ProgressBarRangeInfo {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final ProgressBarRangeInfo a() {
            return ProgressBarRangeInfo.f;
        }
    }

    private final float a;
    @l
    private final f b;
    private final int c;
    @l
    public static final Companion d;
    public static final int e;
    @l
    private static final ProgressBarRangeInfo f;

    static {
        ProgressBarRangeInfo.d = new Companion(null);
        ProgressBarRangeInfo.f = new ProgressBarRangeInfo(0.0f, s.e(0.0f, 0.0f), 0, 4, null);
    }

    public ProgressBarRangeInfo(float f, @l f f1, int v) {
        L.p(f1, "range");
        super();
        this.a = f;
        this.b = f1;
        this.c = v;
        if(Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public ProgressBarRangeInfo(float f, f f1, int v, int v1, w w0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(f, f1, v);
    }

    public final float b() {
        return this.a;
    }

    @l
    public final f c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ProgressBarRangeInfo)) {
            return false;
        }
        return this.a == ((ProgressBarRangeInfo)object0).a && L.g(this.b, ((ProgressBarRangeInfo)object0).b) ? this.c == ((ProgressBarRangeInfo)object0).c : false;
    }

    @Override
    public int hashCode() {
        return (Float.floatToIntBits(this.a) * 0x1F + this.b.hashCode()) * 0x1F + this.c;
    }

    @Override
    @l
    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=" + this.c + ')';
    }
}

