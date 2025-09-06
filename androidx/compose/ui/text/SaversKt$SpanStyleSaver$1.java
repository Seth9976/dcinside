package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.SpanStyleSaver.1 extends N implements o {
    public static final SaversKt.SpanStyleSaver.1 e;

    static {
        SaversKt.SpanStyleSaver.1.e = new SaversKt.SpanStyleSaver.1();
    }

    SaversKt.SpanStyleSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l SpanStyle spanStyle0) {
        L.p(saverScope0, "$this$Saver");
        L.p(spanStyle0, "it");
        return u.s(new Object[]{SaversKt.z(Color.n(spanStyle0.o()), SaversKt.i(Color.b), saverScope0), SaversKt.z(TextUnit.c(spanStyle0.t()), SaversKt.s(TextUnit.b), saverScope0), SaversKt.z(spanStyle0.w(), SaversKt.l(FontWeight.b), saverScope0), SaversKt.y(spanStyle0.u()), SaversKt.y(spanStyle0.v()), -1, SaversKt.y(spanStyle0.s()), SaversKt.z(TextUnit.c(spanStyle0.x()), SaversKt.s(TextUnit.b), saverScope0), SaversKt.z(spanStyle0.l(), SaversKt.o(BaselineShift.b), saverScope0), SaversKt.z(spanStyle0.D(), SaversKt.q(TextGeometricTransform.c), saverScope0), SaversKt.z(spanStyle0.y(), SaversKt.n(LocaleList.c), saverScope0), SaversKt.z(Color.n(spanStyle0.k()), SaversKt.i(Color.b), saverScope0), SaversKt.z(spanStyle0.B(), SaversKt.p(TextDecoration.b), saverScope0), SaversKt.z(spanStyle0.A(), SaversKt.j(Shadow.d), saverScope0)});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((SpanStyle)object1));
    }
}

