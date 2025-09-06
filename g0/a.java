package G0;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;

public class a {
    public static StaticLayout a(CharSequence charSequence0, int v, int v1, TextPaint textPaint0, int v2, Layout.Alignment layout$Alignment0, float f, float f1, boolean z, TextUtils.TruncateAt textUtils$TruncateAt0, int v3, int v4, TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        try {
            return new StaticLayout(charSequence0, v, v1, textPaint0, v2, layout$Alignment0, a.b(textDirectionHeuristicCompat0), f, f1, z, textUtils$TruncateAt0, v3, v4);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(!illegalArgumentException0.getMessage().contains("utext_close")) {
                throw illegalArgumentException0;
            }
            return new StaticLayout(charSequence0, v, v1, textPaint0, v2, layout$Alignment0, a.b(textDirectionHeuristicCompat0), f, f1, z, textUtils$TruncateAt0, v3, v4);
        }
    }

    public static TextDirectionHeuristic b(TextDirectionHeuristicCompat textDirectionHeuristicCompat0) {
        if(textDirectionHeuristicCompat0 == TextDirectionHeuristicsCompat.a) {
            return TextDirectionHeuristics.LTR;
        }
        if(textDirectionHeuristicCompat0 == TextDirectionHeuristicsCompat.b) {
            return TextDirectionHeuristics.RTL;
        }
        if(textDirectionHeuristicCompat0 == TextDirectionHeuristicsCompat.c) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if(textDirectionHeuristicCompat0 == TextDirectionHeuristicsCompat.d) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if(textDirectionHeuristicCompat0 == TextDirectionHeuristicsCompat.e) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        return textDirectionHeuristicCompat0 == TextDirectionHeuristicsCompat.f ? TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }
}

