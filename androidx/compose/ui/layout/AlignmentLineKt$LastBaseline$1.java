package androidx.compose.ui.layout;

import A3.o;
import kotlin.jvm.internal.H;
import kotlin.math.b;
import y4.l;

final class AlignmentLineKt.LastBaseline.1 extends H implements o {
    public static final AlignmentLineKt.LastBaseline.1 a;

    static {
        AlignmentLineKt.LastBaseline.1.a = new AlignmentLineKt.LastBaseline.1();
    }

    AlignmentLineKt.LastBaseline.1() {
        super(2, b.class, "max", "max(II)I", 1);
    }

    @l
    public final Integer a(int v, int v1) {
        return Math.max(v, v1);
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((Number)object0).intValue(), ((Number)object1).intValue());
    }
}

