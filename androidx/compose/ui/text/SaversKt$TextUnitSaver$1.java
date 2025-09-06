package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.TextUnitSaver.1 extends N implements o {
    public static final SaversKt.TextUnitSaver.1 e;

    static {
        SaversKt.TextUnitSaver.1.e = new SaversKt.TextUnitSaver.1();
    }

    SaversKt.TextUnitSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, long v) {
        L.p(saverScope0, "$this$Saver");
        return u.s(new Object[]{TextUnit.n(v), SaversKt.y(TextUnitType.d(TextUnit.m(v)))});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((TextUnit)object1).w());
    }
}

