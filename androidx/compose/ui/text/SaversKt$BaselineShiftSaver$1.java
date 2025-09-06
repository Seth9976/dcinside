package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.BaselineShift;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.BaselineShiftSaver.1 extends N implements o {
    public static final SaversKt.BaselineShiftSaver.1 e;

    static {
        SaversKt.BaselineShiftSaver.1.e = new SaversKt.BaselineShiftSaver.1();
    }

    SaversKt.BaselineShiftSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, float f) {
        L.p(saverScope0, "$this$Saver");
        return f;
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((BaselineShift)object1).k());
    }
}

