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

final class SaversKt.TextIndentSaver.1 extends N implements o {
    public static final SaversKt.TextIndentSaver.1 e;

    static {
        SaversKt.TextIndentSaver.1.e = new SaversKt.TextIndentSaver.1();
    }

    SaversKt.TextIndentSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l TextIndent textIndent0) {
        L.p(saverScope0, "$this$Saver");
        L.p(textIndent0, "it");
        return u.s(new Object[]{SaversKt.z(TextUnit.c(textIndent0.d()), SaversKt.s(TextUnit.b), saverScope0), SaversKt.z(TextUnit.c(textIndent0.e()), SaversKt.s(TextUnit.b), saverScope0)});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((TextIndent)object1));
    }
}

