package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nLayoutIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1855#2,2:172\n*S KotlinDebug\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n*L\n142#1:172,2\n*E\n"})
public final class LayoutIntrinsicsKt {
    public static final float c(@l CharSequence charSequence0, @l TextPaint textPaint0) {
        L.p(charSequence0, "text");
        L.p(textPaint0, "paint");
        BreakIterator breakIterator0 = BreakIterator.getLineInstance(textPaint0.getTextLocale());
        breakIterator0.setText(new CharSequenceCharacterIterator(charSequence0, 0, charSequence0.length()));
        PriorityQueue priorityQueue0 = new PriorityQueue(10, (V v0, V v1) -> ((Number)v0.f()).intValue() - ((Number)v0.e()).intValue() - (((Number)v1.f()).intValue() - ((Number)v1.e()).intValue()));
        int v = breakIterator0.next();
        for(int v1 = 0; v != -1; v1 = v3) {
            if(priorityQueue0.size() < 10) {
                priorityQueue0.add(new V(v1, v));
            }
            else {
                V v2 = (V)priorityQueue0.peek();
                if(v2 != null && ((Number)v2.f()).intValue() - ((Number)v2.e()).intValue() < v - v1) {
                    priorityQueue0.poll();
                    priorityQueue0.add(new V(v1, v));
                }
            }
            int v3 = v;
            v = breakIterator0.next();
        }
        float f = 0.0f;
        for(Object object0: priorityQueue0) {
            f = Math.max(f, Layout.getDesiredWidth(charSequence0, ((Number)((V)object0).a()).intValue(), ((Number)((V)object0).b()).intValue(), textPaint0));
        }
        return f;
    }

    // 检测为 Lambda 实现
    private static final int d(V v0, V v1) [...]

    // 去混淆评级： 低(30)
    private static final boolean e(float f, CharSequence charSequence0, TextPaint textPaint0) {
        return f != 0.0f && (charSequence0 instanceof Spanned && (SpannedExtensionsKt.a(((Spanned)charSequence0), LetterSpacingSpanPx.class) || SpannedExtensionsKt.a(((Spanned)charSequence0), LetterSpacingSpanEm.class)) || textPaint0.getLetterSpacing() != 0.0f);
    }
}

