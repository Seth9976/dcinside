package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.TextRangeSaver.1 extends N implements o {
    public static final SaversKt.TextRangeSaver.1 e;

    static {
        SaversKt.TextRangeSaver.1.e = new SaversKt.TextRangeSaver.1();
    }

    SaversKt.TextRangeSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, long v) {
        L.p(saverScope0, "$this$Saver");
        return u.s(new Integer[]{((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL))});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((TextRange)object1).r());
    }
}

