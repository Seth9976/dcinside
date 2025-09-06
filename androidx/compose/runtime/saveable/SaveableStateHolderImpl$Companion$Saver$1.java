package androidx.compose.runtime.saveable;

import A3.o;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaveableStateHolderImpl.Companion.Saver.1 extends N implements o {
    public static final SaveableStateHolderImpl.Companion.Saver.1 e;

    static {
        SaveableStateHolderImpl.Companion.Saver.1.e = new SaveableStateHolderImpl.Companion.Saver.1();
    }

    SaveableStateHolderImpl.Companion.Saver.1() {
        super(2);
    }

    @m
    public final Map a(@l SaverScope saverScope0, @l SaveableStateHolderImpl saveableStateHolderImpl0) {
        L.p(saverScope0, "$this$Saver");
        L.p(saveableStateHolderImpl0, "it");
        return saveableStateHolderImpl0.h();
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((SaveableStateHolderImpl)object1));
    }
}

