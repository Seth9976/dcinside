package androidx.compose.ui.graphics;

import android.graphics.Paint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(29)
public final class WrapperVerificationHelperMethods {
    @l
    public static final WrapperVerificationHelperMethods a;

    static {
        WrapperVerificationHelperMethods.a = new WrapperVerificationHelperMethods();
    }

    @DoNotInline
    public final void a(@l Paint paint0, int v) {
        L.p(paint0, "paint");
        paint0.setBlendMode(AndroidBlendMode_androidKt.b(v));
    }
}

