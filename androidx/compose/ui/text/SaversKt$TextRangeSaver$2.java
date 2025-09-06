package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n*L\n329#1:422\n329#1:423\n*E\n"})
final class SaversKt.TextRangeSaver.2 extends N implements Function1 {
    public static final SaversKt.TextRangeSaver.2 e;

    static {
        SaversKt.TextRangeSaver.2.e = new SaversKt.TextRangeSaver.2();
    }

    SaversKt.TextRangeSaver.2() {
        super(1);
    }

    @m
    public final TextRange a(@l Object object0) {
        L.p(object0, "it");
        Object object1 = ((List)object0).get(0);
        Integer integer0 = null;
        Integer integer1 = object1 == null ? null : ((Integer)object1);
        L.m(integer1);
        int v = integer1.intValue();
        Object object2 = ((List)object0).get(1);
        if(object2 != null) {
            integer0 = (Integer)object2;
        }
        L.m(integer0);
        return TextRange.b(TextRangeKt.b(v, integer0.intValue()));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

