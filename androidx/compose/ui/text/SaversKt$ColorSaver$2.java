package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import kotlin.H0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.ColorSaver.2 extends N implements Function1 {
    public static final SaversKt.ColorSaver.2 e;

    static {
        SaversKt.ColorSaver.2.e = new SaversKt.ColorSaver.2();
    }

    SaversKt.ColorSaver.2() {
        super(1);
    }

    @m
    public final Color a(@l Object object0) {
        L.p(object0, "it");
        return Color.n(Color.t(((H0)object0).l0()));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

