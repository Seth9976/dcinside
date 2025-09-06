package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaveableStateHolderImpl.Companion.Saver.2 extends N implements Function1 {
    public static final SaveableStateHolderImpl.Companion.Saver.2 e;

    static {
        SaveableStateHolderImpl.Companion.Saver.2.e = new SaveableStateHolderImpl.Companion.Saver.2();
    }

    SaveableStateHolderImpl.Companion.Saver.2() {
        super(1);
    }

    @m
    public final SaveableStateHolderImpl a(@l Map map0) {
        L.p(map0, "it");
        return new SaveableStateHolderImpl(map0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((Map)object0));
    }
}

