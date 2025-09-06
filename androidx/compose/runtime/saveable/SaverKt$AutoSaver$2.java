package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaverKt.AutoSaver.2 extends N implements Function1 {
    public static final SaverKt.AutoSaver.2 e;

    static {
        SaverKt.AutoSaver.2.e = new SaverKt.AutoSaver.2();
    }

    SaverKt.AutoSaver.2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    @m
    public final Object invoke(@l Object object0) {
        L.p(object0, "it");
        return object0;
    }
}

