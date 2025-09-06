package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n70#2:424\n55#2,2:426\n55#2,2:429\n1#3:423\n1#3:425\n1#3:428\n1#3:431\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n*L\n213#1:422\n214#1:424\n215#1:426,2\n216#1:429,2\n213#1:423\n214#1:425\n215#1:428\n216#1:431\n*E\n"})
final class SaversKt.ParagraphStyleSaver.2 extends N implements Function1 {
    public static final SaversKt.ParagraphStyleSaver.2 e;

    static {
        SaversKt.ParagraphStyleSaver.2.e = new SaversKt.ParagraphStyleSaver.2();
    }

    SaversKt.ParagraphStyleSaver.2() {
        super(1);
    }

    @m
    public final ParagraphStyle a(@l Object object0) {
        TextUnit textUnit0;
        L.p(object0, "it");
        Object object1 = ((List)object0).get(0);
        TextAlign textAlign0 = object1 == null ? null : ((TextAlign)object1);
        Object object2 = ((List)object0).get(1);
        TextDirection textDirection0 = object2 == null ? null : ((TextDirection)object2);
        Object object3 = ((List)object0).get(2);
        Saver saver0 = SaversKt.s(TextUnit.b);
        if(L.g(object3, Boolean.FALSE)) {
            textUnit0 = null;
        }
        else if(object3 != null) {
            textUnit0 = (TextUnit)saver0.b(object3);
        }
        else {
            textUnit0 = null;
        }
        L.m(textUnit0);
        long v = textUnit0.w();
        Object object4 = ((List)object0).get(3);
        Saver saver1 = SaversKt.r(TextIndent.c);
        if(L.g(object4, Boolean.FALSE)) {
            return new ParagraphStyle(textAlign0, textDirection0, v, null, null, null, null, null, 0xF0, null);
        }
        return object4 == null ? new ParagraphStyle(textAlign0, textDirection0, v, null, null, null, null, null, 0xF0, null) : new ParagraphStyle(textAlign0, textDirection0, v, ((TextIndent)saver1.b(object4)), null, null, null, null, 0xF0, null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

