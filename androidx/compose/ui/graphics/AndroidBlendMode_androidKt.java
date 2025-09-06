package androidx.compose.ui.graphics;

import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import y4.l;

public final class AndroidBlendMode_androidKt {
    // 去混淆评级： 低(30)
    public static final boolean a(int v) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.G(v, 3) || AndroidBlendMode_androidKt.c(v) != PorterDuff.Mode.SRC_OVER;
    }

    @RequiresApi(29)
    @l
    public static final android.graphics.BlendMode b(int v) {
        if(BlendMode.G(v, 0)) {
            return android.graphics.BlendMode.CLEAR;
        }
        if(BlendMode.G(v, 1)) {
            return android.graphics.BlendMode.SRC;
        }
        if(BlendMode.G(v, 2)) {
            return android.graphics.BlendMode.DST;
        }
        if(BlendMode.G(v, 3)) {
            return android.graphics.BlendMode.SRC_OVER;
        }
        if(BlendMode.G(v, 4)) {
            return android.graphics.BlendMode.DST_OVER;
        }
        if(BlendMode.G(v, 5)) {
            return android.graphics.BlendMode.SRC_IN;
        }
        if(BlendMode.G(v, 6)) {
            return android.graphics.BlendMode.DST_IN;
        }
        if(BlendMode.G(v, 7)) {
            return android.graphics.BlendMode.SRC_OUT;
        }
        if(BlendMode.G(v, 8)) {
            return android.graphics.BlendMode.DST_OUT;
        }
        if(BlendMode.G(v, 9)) {
            return android.graphics.BlendMode.SRC_ATOP;
        }
        if(BlendMode.G(v, 10)) {
            return android.graphics.BlendMode.DST_ATOP;
        }
        if(BlendMode.G(v, 11)) {
            return android.graphics.BlendMode.XOR;
        }
        if(BlendMode.G(v, 12)) {
            return android.graphics.BlendMode.PLUS;
        }
        if(BlendMode.G(v, 13)) {
            return android.graphics.BlendMode.MODULATE;
        }
        if(BlendMode.G(v, 14)) {
            return android.graphics.BlendMode.SCREEN;
        }
        if(BlendMode.G(v, 15)) {
            return android.graphics.BlendMode.OVERLAY;
        }
        if(BlendMode.G(v, 16)) {
            return android.graphics.BlendMode.DARKEN;
        }
        if(BlendMode.G(v, 17)) {
            return android.graphics.BlendMode.LIGHTEN;
        }
        if(BlendMode.G(v, 18)) {
            return android.graphics.BlendMode.COLOR_DODGE;
        }
        if(BlendMode.G(v, 19)) {
            return android.graphics.BlendMode.COLOR_BURN;
        }
        if(BlendMode.G(v, 20)) {
            return android.graphics.BlendMode.HARD_LIGHT;
        }
        if(BlendMode.G(v, 21)) {
            return android.graphics.BlendMode.SOFT_LIGHT;
        }
        if(BlendMode.G(v, 22)) {
            return android.graphics.BlendMode.DIFFERENCE;
        }
        if(BlendMode.G(v, 23)) {
            return android.graphics.BlendMode.EXCLUSION;
        }
        if(BlendMode.G(v, 24)) {
            return android.graphics.BlendMode.MULTIPLY;
        }
        if(BlendMode.G(v, 25)) {
            return android.graphics.BlendMode.HUE;
        }
        if(BlendMode.G(v, 26)) {
            return android.graphics.BlendMode.SATURATION;
        }
        if(BlendMode.G(v, 27)) {
            return android.graphics.BlendMode.COLOR;
        }
        return BlendMode.G(v, 28) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    @l
    public static final PorterDuff.Mode c(int v) {
        if(BlendMode.G(v, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        if(BlendMode.G(v, 1)) {
            return PorterDuff.Mode.SRC;
        }
        if(BlendMode.G(v, 2)) {
            return PorterDuff.Mode.DST;
        }
        if(BlendMode.G(v, 3)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if(BlendMode.G(v, 4)) {
            return PorterDuff.Mode.DST_OVER;
        }
        if(BlendMode.G(v, 5)) {
            return PorterDuff.Mode.SRC_IN;
        }
        if(BlendMode.G(v, 6)) {
            return PorterDuff.Mode.DST_IN;
        }
        if(BlendMode.G(v, 7)) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if(BlendMode.G(v, 8)) {
            return PorterDuff.Mode.DST_OUT;
        }
        if(BlendMode.G(v, 9)) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if(BlendMode.G(v, 10)) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if(BlendMode.G(v, 11)) {
            return PorterDuff.Mode.XOR;
        }
        if(BlendMode.G(v, 12)) {
            return PorterDuff.Mode.ADD;
        }
        if(BlendMode.G(v, 14)) {
            return PorterDuff.Mode.SCREEN;
        }
        if(BlendMode.G(v, 15)) {
            return PorterDuff.Mode.OVERLAY;
        }
        if(BlendMode.G(v, 16)) {
            return PorterDuff.Mode.DARKEN;
        }
        if(BlendMode.G(v, 17)) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return BlendMode.G(v, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}

