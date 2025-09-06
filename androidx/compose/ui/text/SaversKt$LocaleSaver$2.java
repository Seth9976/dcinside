package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.LocaleSaver.2 extends N implements Function1 {
    public static final SaversKt.LocaleSaver.2 e;

    static {
        SaversKt.LocaleSaver.2.e = new SaversKt.LocaleSaver.2();
    }

    SaversKt.LocaleSaver.2() {
        super(1);
    }

    @m
    public final Locale a(@l Object object0) {
        L.p(object0, "it");
        return new Locale(((String)object0));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

