package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

@RequiresApi(29)
final class Paint29 {
    @l
    public static final Paint29 a;

    static {
        Paint29.a = new Paint29();
    }

    @DoNotInline
    @n
    public static final void a(@l Paint paint0, @l CharSequence charSequence0, int v, int v1, @l Rect rect0) {
        L.p(paint0, "paint");
        L.p(charSequence0, "text");
        L.p(rect0, "rect");
        paint0.getTextBounds(charSequence0, v, v1, rect0);
    }
}

