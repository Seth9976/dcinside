package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.TextDecorationSaver.1 extends N implements o {
    public static final SaversKt.TextDecorationSaver.1 e;

    static {
        SaversKt.TextDecorationSaver.1.e = new SaversKt.TextDecorationSaver.1();
    }

    SaversKt.TextDecorationSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l TextDecoration textDecoration0) {
        L.p(saverScope0, "$this$Saver");
        L.p(textDecoration0, "it");
        return textDecoration0.e();
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((TextDecoration)object1));
    }
}

