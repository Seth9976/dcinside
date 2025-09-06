package androidx.compose.ui.graphics;

import android.graphics.BlendModeColorFilter;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import y4.l;

@RequiresApi(29)
final class BlendModeColorFilterHelper {
    @l
    public static final BlendModeColorFilterHelper a;

    static {
        BlendModeColorFilterHelper.a = new BlendModeColorFilterHelper();
    }

    @DoNotInline
    @l
    public final BlendModeColorFilter a(long v, int v1) {
        return a0.a(ColorKt.r(v), AndroidBlendMode_androidKt.b(v1));
    }
}

