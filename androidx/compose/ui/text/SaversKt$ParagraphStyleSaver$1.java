package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.ParagraphStyleSaver.1 extends N implements o {
    public static final SaversKt.ParagraphStyleSaver.1 e;

    static {
        SaversKt.ParagraphStyleSaver.1.e = new SaversKt.ParagraphStyleSaver.1();
    }

    SaversKt.ParagraphStyleSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l ParagraphStyle paragraphStyle0) {
        L.p(saverScope0, "$this$Saver");
        L.p(paragraphStyle0, "it");
        return u.s(new Object[]{SaversKt.y(paragraphStyle0.p()), SaversKt.y(paragraphStyle0.r()), SaversKt.z(TextUnit.c(paragraphStyle0.m()), SaversKt.s(TextUnit.b), saverScope0), SaversKt.z(paragraphStyle0.s(), SaversKt.r(TextIndent.c), saverScope0)});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((ParagraphStyle)object1));
    }
}

