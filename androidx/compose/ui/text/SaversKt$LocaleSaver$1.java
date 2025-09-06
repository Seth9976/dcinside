package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.LocaleSaver.1 extends N implements o {
    public static final SaversKt.LocaleSaver.1 e;

    static {
        SaversKt.LocaleSaver.1.e = new SaversKt.LocaleSaver.1();
    }

    SaversKt.LocaleSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l Locale locale0) {
        L.p(saverScope0, "$this$Saver");
        L.p(locale0, "it");
        return locale0.e();
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((Locale)object1));
    }
}

