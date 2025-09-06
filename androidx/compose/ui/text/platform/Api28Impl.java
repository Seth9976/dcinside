package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(28)
final class Api28Impl {
    @l
    public static final Api28Impl a;

    static {
        Api28Impl.a = new Api28Impl();
    }

    @DoNotInline
    @l
    public final TypefaceSpan a(@l Typeface typeface0) {
        L.p(typeface0, "typeface");
        return new TypefaceSpan(typeface0);
    }
}

