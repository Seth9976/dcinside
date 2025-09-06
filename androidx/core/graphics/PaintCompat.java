package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.core.util.Pair;

public final class PaintCompat {
    @RequiresApi(23)
    static class Api23Impl {
        static boolean a(Paint paint0, String s) {
            return paint0.hasGlyph(s);
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static void a(Paint paint0, Object object0) {
            paint0.setBlendMode(((BlendMode)object0));
        }
    }

    private static final String a = "\uDB3F\uDFFD";
    private static final String b = "m";
    private static final ThreadLocal c;

    static {
        PaintCompat.c = new ThreadLocal();
    }

    public static boolean a(Paint paint0, String s) {
        if(Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.a(paint0, s);
        }
        int v = s.length();
        if(v == 1 && Character.isWhitespace(s.charAt(0))) {
            return true;
        }
        float f = paint0.measureText("\uDB3F\uDFFD");
        float f1 = paint0.measureText("m");
        float f2 = paint0.measureText(s);
        float f3 = 0.0f;
        if(f2 == 0.0f) {
            return false;
        }
        if(s.codePointCount(0, s.length()) > 1) {
            if(f2 > f1 * 2.0f) {
                return false;
            }
            for(int v1 = 0; v1 < v; v1 = v2) {
                int v2 = Character.charCount(s.codePointAt(v1)) + v1;
                f3 += paint0.measureText(s, v1, v2);
            }
            if(f2 >= f3) {
                return false;
            }
        }
        if(f2 != f) {
            return true;
        }
        Pair pair0 = PaintCompat.b();
        paint0.getTextBounds("\uDB3F\uDFFD", 0, 2, ((Rect)pair0.a));
        paint0.getTextBounds(s, 0, v, ((Rect)pair0.b));
        return !((Rect)pair0.a).equals(pair0.b);
    }

    private static Pair b() {
        ThreadLocal threadLocal0 = PaintCompat.c;
        Pair pair0 = (Pair)threadLocal0.get();
        if(pair0 == null) {
            pair0 = new Pair(new Rect(), new Rect());
            threadLocal0.set(pair0);
            return pair0;
        }
        ((Rect)pair0.a).setEmpty();
        ((Rect)pair0.b).setEmpty();
        return pair0;
    }

    public static boolean c(Paint paint0, BlendModeCompat blendModeCompat0) {
        PorterDuffXfermode porterDuffXfermode0 = null;
        if(Build.VERSION.SDK_INT >= 29) {
            if(blendModeCompat0 != null) {
                porterDuffXfermode0 = androidx.core.graphics.BlendModeUtils.Api29Impl.a(blendModeCompat0);
            }
            Api29Impl.a(paint0, porterDuffXfermode0);
            return true;
        }
        if(blendModeCompat0 != null) {
            PorterDuff.Mode porterDuff$Mode0 = BlendModeUtils.a(blendModeCompat0);
            if(porterDuff$Mode0 != null) {
                porterDuffXfermode0 = new PorterDuffXfermode(porterDuff$Mode0);
            }
            paint0.setXfermode(porterDuffXfermode0);
            return porterDuff$Mode0 != null;
        }
        paint0.setXfermode(null);
        return true;
    }
}

