package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.L;
import s3.a;
import s3.e;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class LayoutCompat {
    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface BreakStrategy {
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface HyphenationFrequency {
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface JustificationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface LineBreakStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface LineBreakWordStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface TextDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface TextLayoutAlignment {
    }

    public static final int A = 0;
    public static final int B = 2;
    public static final float C = 1.0f;
    public static final float D = 0.0f;
    public static final boolean E = false;
    public static final int F = 0x7FFFFFFF;
    public static final int G = 0;
    public static final int H = 0;
    public static final int I = 0;
    public static final int J = 0;
    public static final int K = 0;
    public static final boolean L = true;
    @l
    private static final Layout.Alignment M = null;
    @l
    private static final TextDirectionHeuristic N = null;
    public static final int O = 0;
    @l
    public static final LayoutCompat a = null;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 3;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    public static final int z = 5;

    static {
        LayoutCompat.a = new LayoutCompat();
        LayoutCompat.M = Layout.Alignment.ALIGN_NORMAL;
        TextDirectionHeuristic textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        L.o(textDirectionHeuristic0, "FIRSTSTRONG_LTR");
        LayoutCompat.N = textDirectionHeuristic0;
        LayoutCompat.O = 8;
    }

    @l
    public final Layout.Alignment a() {
        return LayoutCompat.M;
    }

    @l
    public final TextDirectionHeuristic b() {
        return LayoutCompat.N;
    }
}

