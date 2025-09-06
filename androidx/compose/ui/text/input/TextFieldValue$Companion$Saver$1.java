package androidx.compose.ui.text.input;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class TextFieldValue.Companion.Saver.1 extends N implements o {
    public static final TextFieldValue.Companion.Saver.1 e;

    static {
        TextFieldValue.Companion.Saver.1.e = new TextFieldValue.Companion.Saver.1();
    }

    TextFieldValue.Companion.Saver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l TextFieldValue textFieldValue0) {
        L.p(saverScope0, "$this$Saver");
        L.p(textFieldValue0, "it");
        return u.s(new Object[]{SaversKt.z(textFieldValue0.f(), SaversKt.e(), saverScope0), SaversKt.z(TextRange.b(textFieldValue0.h()), SaversKt.k(TextRange.b), saverScope0)});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((TextFieldValue)object1));
    }
}

