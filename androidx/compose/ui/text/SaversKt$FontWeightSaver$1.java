package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.FontWeightSaver.1 extends N implements o {
    public static final SaversKt.FontWeightSaver.1 e;

    static {
        SaversKt.FontWeightSaver.1.e = new SaversKt.FontWeightSaver.1();
    }

    SaversKt.FontWeightSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l FontWeight fontWeight0) {
        L.p(saverScope0, "$this$Saver");
        L.p(fontWeight0, "it");
        return fontWeight0.w();
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((FontWeight)object1));
    }
}

