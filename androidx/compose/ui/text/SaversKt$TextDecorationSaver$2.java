package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.TextDecorationSaver.2 extends N implements Function1 {
    public static final SaversKt.TextDecorationSaver.2 e;

    static {
        SaversKt.TextDecorationSaver.2.e = new SaversKt.TextDecorationSaver.2();
    }

    SaversKt.TextDecorationSaver.2() {
        super(1);
    }

    @m
    public final TextDecoration a(@l Object object0) {
        L.p(object0, "it");
        return new TextDecoration(((int)(((Integer)object0))));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

