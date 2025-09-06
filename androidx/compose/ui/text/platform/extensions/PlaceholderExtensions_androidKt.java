package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
public final class PlaceholderExtensions_androidKt {
    private static final int a(long v) {
        long v1 = TextUnit.m(v);
        if(TextUnitType.g(v1, 0x100000000L)) {
            return 0;
        }
        return TextUnitType.g(v1, 0x200000000L) ? 1 : 2;
    }

    private static void b(long v) {
    }

    private static final int c(int v) {
        if(PlaceholderVerticalAlign.k(v, 1)) {
            return 0;
        }
        if(PlaceholderVerticalAlign.k(v, 2)) {
            return 1;
        }
        if(PlaceholderVerticalAlign.k(v, 3)) {
            return 2;
        }
        if(PlaceholderVerticalAlign.k(v, 4)) {
            return 3;
        }
        if(PlaceholderVerticalAlign.k(v, 5)) {
            return 4;
        }
        if(PlaceholderVerticalAlign.k(v, 6)) {
            return 5;
        }
        if(!PlaceholderVerticalAlign.k(v, 7)) {
            throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
        }
        return 6;
    }

    private static void d(int v) {
    }

    private static final void e(Spannable spannable0, Placeholder placeholder0, int v, int v1, Density density0) {
        Object[] arr_object = spannable0.getSpans(v, v1, EmojiSpan.class);
        L.o(arr_object, "getSpans(start, end, EmojiSpan::class.java)");
        for(int v2 = 0; v2 < arr_object.length; ++v2) {
            spannable0.removeSpan(((EmojiSpan)arr_object[v2]));
        }
        SpannableExtensions_androidKt.t(spannable0, new PlaceholderSpan(TextUnit.n(placeholder0.e()), PlaceholderExtensions_androidKt.a(placeholder0.e()), TextUnit.n(placeholder0.c()), PlaceholderExtensions_androidKt.a(placeholder0.c()), density0.w1() * density0.getDensity(), PlaceholderExtensions_androidKt.c(placeholder0.d())), v, v1);
    }

    public static final void f(@l Spannable spannable0, @l List list0, @l Density density0) {
        L.p(spannable0, "<this>");
        L.p(list0, "placeholders");
        L.p(density0, "density");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Range annotatedString$Range0 = (Range)list0.get(v1);
            PlaceholderExtensions_androidKt.e(spannable0, ((Placeholder)annotatedString$Range0.a()), annotatedString$Range0.b(), annotatedString$Range0.c(), density0);
        }
    }
}

