package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTextFieldValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n55#2,2:202\n55#2,2:205\n1#3:204\n1#3:207\n*S KotlinDebug\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n*L\n168#1:202,2\n169#1:205,2\n168#1:204\n169#1:207\n*E\n"})
final class TextFieldValue.Companion.Saver.2 extends N implements Function1 {
    public static final TextFieldValue.Companion.Saver.2 e;

    static {
        TextFieldValue.Companion.Saver.2.e = new TextFieldValue.Companion.Saver.2();
    }

    TextFieldValue.Companion.Saver.2() {
        super(1);
    }

    @m
    public final TextFieldValue a(@l Object object0) {
        AnnotatedString annotatedString0;
        L.p(object0, "it");
        Object object1 = ((List)object0).get(0);
        Saver saver0 = SaversKt.e();
        TextRange textRange0 = null;
        if(L.g(object1, Boolean.FALSE)) {
            annotatedString0 = null;
        }
        else if(object1 != null) {
            annotatedString0 = (AnnotatedString)saver0.b(object1);
        }
        else {
            annotatedString0 = null;
        }
        L.m(annotatedString0);
        Object object2 = ((List)object0).get(1);
        Saver saver1 = SaversKt.k(TextRange.b);
        if(!L.g(object2, Boolean.FALSE) && object2 != null) {
            textRange0 = (TextRange)saver1.b(object2);
        }
        L.m(textRange0);
        return new TextFieldValue(annotatedString0, textRange0.r(), null, 4, null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

