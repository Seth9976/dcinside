package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit.Companion;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n1#3:424\n1#3:427\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n*L\n295#1:422,2\n296#1:425,2\n295#1:424\n296#1:427\n*E\n"})
final class SaversKt.TextIndentSaver.2 extends N implements Function1 {
    public static final SaversKt.TextIndentSaver.2 e;

    static {
        SaversKt.TextIndentSaver.2.e = new SaversKt.TextIndentSaver.2();
    }

    SaversKt.TextIndentSaver.2() {
        super(1);
    }

    @m
    public final TextIndent a(@l Object object0) {
        TextUnit textUnit1;
        L.p(object0, "it");
        Object object1 = ((List)object0).get(0);
        Companion textUnit$Companion0 = TextUnit.b;
        Saver saver0 = SaversKt.s(textUnit$Companion0);
        TextUnit textUnit0 = null;
        if(L.g(object1, Boolean.FALSE)) {
            textUnit1 = null;
        }
        else if(object1 != null) {
            textUnit1 = (TextUnit)saver0.b(object1);
        }
        else {
            textUnit1 = null;
        }
        L.m(textUnit1);
        long v = textUnit1.w();
        Object object2 = ((List)object0).get(1);
        Saver saver1 = SaversKt.s(textUnit$Companion0);
        if(!L.g(object2, Boolean.FALSE) && object2 != null) {
            textUnit0 = (TextUnit)saver1.b(object2);
        }
        L.m(textUnit0);
        return new TextIndent(v, textUnit0.w(), null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

