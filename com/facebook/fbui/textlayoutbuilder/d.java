package com.facebook.fbui.textlayoutbuilder;

import G0.a;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.core.text.TextDirectionHeuristicCompat;
import java.lang.reflect.Field;

class d {
    private static final String a = " …";

    public static boolean a(StaticLayout staticLayout0) {
        Class class0 = StaticLayout.class;
        int v = staticLayout0.getLineStart(0);
        int v1 = staticLayout0.getLineCount();
        int v2 = 0;
        while(v2 < v1) {
            int v3 = staticLayout0.getLineEnd(v2);
            if(v3 < v) {
                try {
                    Field field0 = class0.getDeclaredField("mLines");
                    field0.setAccessible(true);
                    Field field1 = class0.getDeclaredField("mColumns");
                    field1.setAccessible(true);
                    int[] arr_v = (int[])field0.get(staticLayout0);
                    int v4 = field1.getInt(staticLayout0);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        int v6 = v4 * v2 + v5;
                        d.e(arr_v, v6, v6 + v4);
                    }
                    return false;
                }
                catch(Exception unused_ex) {
                }
                break;
            }
            ++v2;
            v = v3;
        }
        return true;
    }

    private static StaticLayout b(CharSequence charSequence0, int v, int v1, TextPaint textPaint0, int v2, Layout.Alignment layout$Alignment0, float f, float f1, boolean z, TextUtils.TruncateAt textUtils$TruncateAt0, int v3, int v4, TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        try {
            return a.a(charSequence0, v, v1, textPaint0, v2, layout$Alignment0, f, f1, z, textUtils$TruncateAt0, v3, v4, textDirectionHeuristicCompat0);
        }
        catch(LinkageError unused_ex) {
            return d.c(charSequence0, v, v1, textPaint0, v2, layout$Alignment0, f, f1, z, textUtils$TruncateAt0, v3);
        }
    }

    private static StaticLayout c(CharSequence charSequence0, int v, int v1, TextPaint textPaint0, int v2, Layout.Alignment layout$Alignment0, float f, float f1, boolean z, TextUtils.TruncateAt textUtils$TruncateAt0, int v3) {
        return new StaticLayout(charSequence0, v, v1, textPaint0, v2, layout$Alignment0, f, f1, z, textUtils$TruncateAt0, v3);
    }

    public static StaticLayout d(CharSequence charSequence0, int v, int v1, TextPaint textPaint0, int v2, Layout.Alignment layout$Alignment0, float f, float f1, boolean z, TextUtils.TruncateAt textUtils$TruncateAt0, int v3, int v4, TextDirectionHeuristicCompat textDirectionHeuristicCompat0, int v5, int v6, int v7, int[] arr_v, int[] arr_v1, boolean z1) {
        int v8 = Build.VERSION.SDK_INT;
        if(v8 >= 23) {
            StaticLayout.Builder staticLayout$Builder0 = StaticLayout.Builder.obtain(charSequence0, v, v1, textPaint0, v2).setAlignment(layout$Alignment0).setLineSpacing(f1, f).setIncludePad(z).setEllipsize(textUtils$TruncateAt0).setEllipsizedWidth(v3).setMaxLines(v4).setTextDirection(a.b(textDirectionHeuristicCompat0)).setBreakStrategy(v5).setHyphenationFrequency(v6).setIndents(arr_v, arr_v1);
            if(v8 >= 26) {
                staticLayout$Builder0.setJustificationMode(v7);
            }
            if(v8 >= 28) {
                staticLayout$Builder0.setUseLineSpacingFromFallbacks(z1);
            }
            return staticLayout$Builder0.build();
        }
        StaticLayout staticLayout0 = d.b(charSequence0, v, v1, textPaint0, v2, layout$Alignment0, f, f1, z, textUtils$TruncateAt0, v3, v4, textDirectionHeuristicCompat0);
        if(v4 > 0) {
            StaticLayout staticLayout1 = staticLayout0;
            for(int v9 = v1; staticLayout1.getLineCount() > v4; v9 = v11) {
                int v10 = staticLayout1.getLineStart(v4);
                if(v10 >= v9) {
                    break;
                }
                int v11;
                for(v11 = v10; v11 > v && Character.isSpace(charSequence0.charAt(v11 - 1)); --v11) {
                }
                StaticLayout staticLayout2 = d.b(charSequence0, v, v11, textPaint0, v2, layout$Alignment0, f, f1, z, textUtils$TruncateAt0, v3, v4, textDirectionHeuristicCompat0);
                if(staticLayout2.getLineCount() >= v4 && staticLayout2.getEllipsisCount(v4 - 1) == 0) {
                    String s = charSequence0.subSequence(v, v11) + " …";
                    staticLayout2 = d.b(s, 0, s.length(), textPaint0, v2, layout$Alignment0, f, f1, z, textUtils$TruncateAt0, v3, v4, textDirectionHeuristicCompat0);
                }
                staticLayout1 = staticLayout2;
            }
            staticLayout0 = staticLayout1;
        }
        while(!d.a(staticLayout0)) {
        }
        return staticLayout0;
    }

    private static void e(int[] arr_v, int v, int v1) {
        int v2 = arr_v[v];
        arr_v[v] = arr_v[v1];
        arr_v[v1] = v2;
    }
}

