package androidx.compose.foundation;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class ScrollState.Companion.Saver.1 extends N implements o {
    public static final ScrollState.Companion.Saver.1 e;

    static {
        ScrollState.Companion.Saver.1.e = new ScrollState.Companion.Saver.1();
    }

    ScrollState.Companion.Saver.1() {
        super(2);
    }

    @m
    public final Integer a(@l SaverScope saverScope0, @l ScrollState scrollState0) {
        L.p(saverScope0, "$this$Saver");
        L.p(scrollState0, "it");
        return scrollState0.o();
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((ScrollState)object1));
    }
}

