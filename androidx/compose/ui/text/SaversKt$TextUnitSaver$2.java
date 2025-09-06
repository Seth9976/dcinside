package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n*L\n374#1:422\n374#1:423\n*E\n"})
final class SaversKt.TextUnitSaver.2 extends N implements Function1 {
    public static final SaversKt.TextUnitSaver.2 e;

    static {
        SaversKt.TextUnitSaver.2.e = new SaversKt.TextUnitSaver.2();
    }

    SaversKt.TextUnitSaver.2() {
        super(1);
    }

    @m
    public final TextUnit a(@l Object object0) {
        L.p(object0, "it");
        Object object1 = ((List)object0).get(0);
        TextUnitType textUnitType0 = null;
        Float float0 = object1 == null ? null : ((Float)object1);
        L.m(float0);
        float f = float0.floatValue();
        Object object2 = ((List)object0).get(1);
        if(object2 != null) {
            textUnitType0 = (TextUnitType)object2;
        }
        L.m(textUnitType0);
        return TextUnit.c(TextUnitKt.a(f, textUnitType0.j()));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

