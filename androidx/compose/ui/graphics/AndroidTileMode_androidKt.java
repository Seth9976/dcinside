package androidx.compose.ui.graphics;

import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidTileMode_androidKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[Shader.TileMode.values().length];
            try {
                arr_v[Shader.TileMode.CLAMP.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Shader.TileMode.MIRROR.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Shader.TileMode.REPEAT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    // 去混淆评级： 低(30)
    public static final boolean a(int v) {
        return Build.VERSION.SDK_INT >= 0x1F || !TileMode.h(v, 3);
    }

    @l
    public static final Shader.TileMode b(int v) {
        if(TileMode.h(v, 0)) {
            return Shader.TileMode.CLAMP;
        }
        if(TileMode.h(v, 1)) {
            return Shader.TileMode.REPEAT;
        }
        if(TileMode.h(v, 2)) {
            return Shader.TileMode.MIRROR;
        }
        return !TileMode.h(v, 3) || Build.VERSION.SDK_INT < 0x1F ? Shader.TileMode.CLAMP : TileModeVerificationHelper.a.b();
    }

    public static final int c(@l Shader.TileMode shader$TileMode0) {
        L.p(shader$TileMode0, "<this>");
        switch(WhenMappings.a[shader$TileMode0.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 1;
            }
            default: {
                return Build.VERSION.SDK_INT < 0x1F || shader$TileMode0 != Shader.TileMode.DECAL ? 0 : 3;
            }
        }
    }
}

