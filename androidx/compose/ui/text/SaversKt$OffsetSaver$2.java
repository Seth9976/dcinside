package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n*L\n394#1:422\n394#1:423\n*E\n"})
final class SaversKt.OffsetSaver.2 extends N implements Function1 {
    public static final SaversKt.OffsetSaver.2 e;

    static {
        SaversKt.OffsetSaver.2.e = new SaversKt.OffsetSaver.2();
    }

    SaversKt.OffsetSaver.2() {
        super(1);
    }

    @m
    public final Offset a(@l Object object0) {
        L.p(object0, "it");
        if(L.g(object0, Boolean.FALSE)) {
            return Offset.d(0x7FC000007FC00000L);
        }
        Object object1 = ((List)object0).get(0);
        Float float0 = null;
        Float float1 = object1 == null ? null : ((Float)object1);
        L.m(float1);
        float f = float1.floatValue();
        Object object2 = ((List)object0).get(1);
        if(object2 != null) {
            float0 = (Float)object2;
        }
        L.m(float0);
        return Offset.d(OffsetKt.a(f, float0.floatValue()));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

