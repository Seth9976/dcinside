package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.OffsetSaver.1 extends N implements o {
    public static final SaversKt.OffsetSaver.1 e;

    static {
        SaversKt.OffsetSaver.1.e = new SaversKt.OffsetSaver.1();
    }

    SaversKt.OffsetSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, long v) {
        L.p(saverScope0, "$this$Saver");
        return Offset.l(v, 0x7FC000007FC00000L) ? false : u.s(new Float[]{((Float)SaversKt.y(Offset.p(v))), ((Float)SaversKt.y(Offset.r(v)))});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((Offset)object1).A());
    }
}

