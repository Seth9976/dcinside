package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.ShadowSaver.1 extends N implements o {
    public static final SaversKt.ShadowSaver.1 e;

    static {
        SaversKt.ShadowSaver.1.e = new SaversKt.ShadowSaver.1();
    }

    SaversKt.ShadowSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l Shadow shadow0) {
        L.p(saverScope0, "$this$Saver");
        L.p(shadow0, "it");
        return u.s(new Object[]{SaversKt.z(Color.n(shadow0.f()), SaversKt.i(Color.b), saverScope0), SaversKt.z(Offset.d(shadow0.h()), SaversKt.h(Offset.b), saverScope0), SaversKt.y(shadow0.d())});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((Shadow)object1));
    }
}

