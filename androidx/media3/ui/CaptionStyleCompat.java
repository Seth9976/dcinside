package androidx.media3.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class CaptionStyleCompat {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface EdgeType {
    }

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    @Nullable
    public final Typeface f;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 1;
    public static final CaptionStyleCompat m;

    static {
        CaptionStyleCompat.m = new CaptionStyleCompat(-1, 0xFF000000, 0, 0, -1, null);
    }

    public CaptionStyleCompat(int v, int v1, int v2, int v3, int v4, @Nullable Typeface typeface0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = typeface0;
    }

    public static CaptionStyleCompat a(CaptioningManager.CaptionStyle captioningManager$CaptionStyle0) {
        return Util.a < 21 ? new CaptionStyleCompat(captioningManager$CaptionStyle0.foregroundColor, captioningManager$CaptionStyle0.backgroundColor, 0, captioningManager$CaptionStyle0.edgeType, captioningManager$CaptionStyle0.edgeColor, captioningManager$CaptionStyle0.getTypeface()) : CaptionStyleCompat.b(captioningManager$CaptionStyle0);
    }

    // 去混淆评级： 低(20)
    @RequiresApi(21)
    private static CaptionStyleCompat b(CaptioningManager.CaptionStyle captioningManager$CaptionStyle0) {
        int v = captioningManager$CaptionStyle0.hasForegroundColor() ? captioningManager$CaptionStyle0.foregroundColor : CaptionStyleCompat.m.a;
        int v1 = captioningManager$CaptionStyle0.hasBackgroundColor() ? captioningManager$CaptionStyle0.backgroundColor : CaptionStyleCompat.m.b;
        int v2 = captioningManager$CaptionStyle0.hasWindowColor() ? captioningManager$CaptionStyle0.windowColor : CaptionStyleCompat.m.c;
        int v3 = captioningManager$CaptionStyle0.hasEdgeType() ? captioningManager$CaptionStyle0.edgeType : CaptionStyleCompat.m.d;
        return captioningManager$CaptionStyle0.hasEdgeColor() ? new CaptionStyleCompat(v, v1, v2, v3, captioningManager$CaptionStyle0.edgeColor, captioningManager$CaptionStyle0.getTypeface()) : new CaptionStyleCompat(v, v1, v2, v3, CaptionStyleCompat.m.e, captioningManager$CaptionStyle0.getTypeface());
    }
}

