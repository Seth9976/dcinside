package androidx.compose.ui.text.android;

import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class StaticLayoutFactory {
    @l
    public static final StaticLayoutFactory a;
    @l
    private static final StaticLayoutFactoryImpl b;

    static {
        StaticLayoutFactory.a = new StaticLayoutFactory();
        StaticLayoutFactory23 staticLayoutFactory230 = Build.VERSION.SDK_INT >= 23 ? new StaticLayoutFactory23() : new StaticLayoutFactoryDefault();
        StaticLayoutFactory.b = staticLayoutFactory230;
    }

    @l
    public final StaticLayout a(@l CharSequence charSequence0, int v, int v1, @l TextPaint textPaint0, int v2, @l TextDirectionHeuristic textDirectionHeuristic0, @l Layout.Alignment layout$Alignment0, @IntRange(from = 0L) int v3, @m TextUtils.TruncateAt textUtils$TruncateAt0, @IntRange(from = 0L) int v4, @FloatRange(from = 0.0) float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int v8, int v9, @m int[] arr_v, @m int[] arr_v1) {
        L.p(charSequence0, "text");
        L.p(textPaint0, "paint");
        L.p(textDirectionHeuristic0, "textDir");
        L.p(layout$Alignment0, "alignment");
        StaticLayoutParams staticLayoutParams0 = new StaticLayoutParams(charSequence0, v, v1, textPaint0, v2, textDirectionHeuristic0, layout$Alignment0, v3, textUtils$TruncateAt0, v4, f, f1, v5, z, z1, v6, v7, v8, v9, arr_v, arr_v1);
        return StaticLayoutFactory.b.a(staticLayoutParams0);
    }

    public static StaticLayout b(StaticLayoutFactory staticLayoutFactory0, CharSequence charSequence0, int v, int v1, TextPaint textPaint0, int v2, TextDirectionHeuristic textDirectionHeuristic0, Layout.Alignment layout$Alignment0, int v3, TextUtils.TruncateAt textUtils$TruncateAt0, int v4, float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int v8, int v9, int[] arr_v, int[] arr_v1, int v10, Object object0) {
        int v11 = (v10 & 2) == 0 ? v : 0;
        int v12 = (v10 & 4) == 0 ? v1 : charSequence0.length();
        TextDirectionHeuristic textDirectionHeuristic1 = (v10 & 0x20) == 0 ? textDirectionHeuristic0 : LayoutCompat.a.b();
        Layout.Alignment layout$Alignment1 = (v10 & 0x40) == 0 ? layout$Alignment0 : LayoutCompat.a.a();
        int v13 = (v10 & 0x80) == 0 ? v3 : 0x7FFFFFFF;
        TextUtils.TruncateAt textUtils$TruncateAt1 = (v10 & 0x100) == 0 ? textUtils$TruncateAt0 : null;
        int v14 = (v10 & 0x200) == 0 ? v4 : v2;
        float f2 = (v10 & 0x400) == 0 ? f : 1.0f;
        float f3 = (v10 & 0x800) == 0 ? f1 : 0.0f;
        int v15 = (v10 & 0x1000) == 0 ? v5 : 0;
        boolean z2 = (v10 & 0x2000) == 0 ? z : false;
        boolean z3 = (v10 & 0x4000) == 0 ? z1 : true;
        int v16 = (0x8000 & v10) == 0 ? v6 : 0;
        int v17 = (0x10000 & v10) == 0 ? v7 : 0;
        int v18 = (0x20000 & v10) == 0 ? v8 : 0;
        int v19 = (0x40000 & v10) == 0 ? v9 : 0;
        int[] arr_v2 = (0x80000 & v10) == 0 ? arr_v : null;
        return (v10 & 0x100000) == 0 ? staticLayoutFactory0.a(charSequence0, v11, v12, textPaint0, v2, textDirectionHeuristic1, layout$Alignment1, v13, textUtils$TruncateAt1, v14, f2, f3, v15, z2, z3, v16, v17, v18, v19, arr_v2, arr_v1) : staticLayoutFactory0.a(charSequence0, v11, v12, textPaint0, v2, textDirectionHeuristic1, layout$Alignment1, v13, textUtils$TruncateAt1, v14, f2, f3, v15, z2, z3, v16, v17, v18, v19, arr_v2, null);
    }

    public final boolean c(@l StaticLayout staticLayout0, boolean z) {
        L.p(staticLayout0, "layout");
        return StaticLayoutFactory.b.b(staticLayout0, z);
    }
}

