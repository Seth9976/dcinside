package androidx.compose.runtime.saveable;

import A3.o;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaverKt.AutoSaver.1 extends N implements o {
    public static final SaverKt.AutoSaver.1 e;

    static {
        SaverKt.AutoSaver.1.e = new SaverKt.AutoSaver.1();
    }

    SaverKt.AutoSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @m Object object0) {
        L.p(saverScope0, "$this$Saver");
        return object0;
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), object1);
    }
}

