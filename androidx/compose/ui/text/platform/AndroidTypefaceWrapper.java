package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidTypefaceWrapper implements AndroidTypeface {
    @l
    private final Typeface a;
    @m
    private final FontFamily b;

    public AndroidTypefaceWrapper(@l Typeface typeface0) {
        L.p(typeface0, "typeface");
        super();
        this.a = typeface0;
    }

    @Override  // androidx.compose.ui.text.font.Typeface
    @m
    public FontFamily a() {
        return this.b;
    }

    @Override  // androidx.compose.ui.text.platform.AndroidTypeface
    @l
    public Typeface b(@l FontWeight fontWeight0, int v, int v1) {
        L.p(fontWeight0, "fontWeight");
        return this.a;
    }

    @l
    public final Typeface c() {
        return this.a;
    }
}

