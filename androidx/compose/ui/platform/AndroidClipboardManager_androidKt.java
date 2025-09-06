package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,550:1\n33#2,6:551\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n*L\n110#1:551,6\n*E\n"})
public final class AndroidClipboardManager_androidKt {
    private static final int A = 8;
    private static final int B = 5;
    private static final int C = 4;
    private static final int D = 1;
    private static final int E = 1;
    private static final int F = 4;
    private static final int G = 8;
    private static final int H = 4;
    private static final int I = 20;
    @l
    private static final String a = "plain text";
    private static final byte b = 0;
    private static final byte c = 1;
    private static final byte d = 2;
    private static final byte e = 0;
    private static final byte f = 1;
    private static final byte g = 0;
    private static final byte h = 1;
    private static final byte i = 2;
    private static final byte j = 3;
    private static final byte k = 1;
    private static final byte l = 2;
    private static final byte m = 3;
    private static final byte n = 4;
    private static final byte o = 5;
    private static final byte p = 6;
    private static final byte q = 7;
    private static final byte r = 8;
    private static final byte s = 9;
    private static final byte t = 10;
    private static final byte u = 11;
    private static final byte v = 12;
    private static final int w = 1;
    private static final int x = 4;
    private static final int y = 4;
    private static final int z = 8;

    @m
    public static final AnnotatedString a(@m CharSequence charSequence0) {
        if(charSequence0 == null) {
            return null;
        }
        if(!(charSequence0 instanceof Spanned)) {
            return new AnnotatedString(charSequence0.toString(), null, null, 6, null);
        }
        Annotation[] arr_annotation = (Annotation[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), Annotation.class);
        ArrayList arrayList0 = new ArrayList();
        L.o(arr_annotation, "annotations");
        int v1 = kotlin.collections.l.we(arr_annotation);
        if(v1 >= 0) {
            for(int v = 0; true; ++v) {
                Annotation annotation0 = arr_annotation[v];
                if(L.g(annotation0.getKey(), "androidx.compose.text.SpanStyle")) {
                    int v2 = ((Spanned)charSequence0).getSpanStart(annotation0);
                    int v3 = ((Spanned)charSequence0).getSpanEnd(annotation0);
                    String s = annotation0.getValue();
                    L.o(s, "span.value");
                    arrayList0.add(new Range(new DecodeHelper(s).k(), v2, v3));
                }
                if(v == v1) {
                    break;
                }
            }
        }
        return new AnnotatedString(charSequence0.toString(), arrayList0, null, 4, null);
    }

    @l
    public static final CharSequence b(@l AnnotatedString annotatedString0) {
        L.p(annotatedString0, "<this>");
        if(annotatedString0.f().isEmpty()) {
            return annotatedString0.j();
        }
        CharSequence charSequence0 = new SpannableString(annotatedString0.j());
        EncodeHelper encodeHelper0 = new EncodeHelper();
        List list0 = annotatedString0.f();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Range annotatedString$Range0 = (Range)list0.get(v1);
            encodeHelper0.q();
            encodeHelper0.e(((SpanStyle)annotatedString$Range0.a()));
            ((SpannableString)charSequence0).setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeHelper0.p()), annotatedString$Range0.b(), annotatedString$Range0.c(), 33);
        }
        return charSequence0;
    }
}

