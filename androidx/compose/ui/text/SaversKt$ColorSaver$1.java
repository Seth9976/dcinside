package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import kotlin.H0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.ColorSaver.1 extends N implements o {
    public static final SaversKt.ColorSaver.1 e;

    static {
        SaversKt.ColorSaver.1.e = new SaversKt.ColorSaver.1();
    }

    SaversKt.ColorSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, long v) {
        L.p(saverScope0, "$this$Saver");
        return H0.b(v);
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((Color)object1).M());
    }
}

