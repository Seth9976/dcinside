package androidx.compose.ui.graphics;

import android.graphics.Shader.TileMode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import y4.l;

@RequiresApi(0x1F)
final class TileModeVerificationHelper {
    @l
    public static final TileModeVerificationHelper a;

    static {
        TileModeVerificationHelper.a = new TileModeVerificationHelper();
    }

    // 去混淆评级： 低(20)
    @DoNotInline
    public final int a() [...] // 潜在的解密器

    @DoNotInline
    @l
    public final Shader.TileMode b() {
        return Shader.TileMode.DECAL;
    }
}

