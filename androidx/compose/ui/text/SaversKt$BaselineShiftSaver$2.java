package androidx.compose.ui.text;

import androidx.compose.ui.text.style.BaselineShift;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.BaselineShiftSaver.2 extends N implements Function1 {
    public static final SaversKt.BaselineShiftSaver.2 e;

    static {
        SaversKt.BaselineShiftSaver.2.e = new SaversKt.BaselineShiftSaver.2();
    }

    SaversKt.BaselineShiftSaver.2() {
        super(1);
    }

    @m
    public final BaselineShift a(@l Object object0) {
        L.p(object0, "it");
        return BaselineShift.d(BaselineShift.e(((float)(((Float)object0)))));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

