package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class AndroidPreloadedFont extends AndroidFont {
    @l
    private final FontWeight g;
    private final int h;
    private boolean i;
    @m
    private Typeface j;

    private AndroidPreloadedFont(FontWeight fontWeight0, int v, Settings fontVariation$Settings0) {
        super(0, AndroidPreloadedFontTypefaceLoader.a, fontVariation$Settings0, null);
        this.g = fontWeight0;
        this.h = v;
    }

    public AndroidPreloadedFont(FontWeight fontWeight0, int v, Settings fontVariation$Settings0, w w0) {
        this(fontWeight0, v, fontVariation$Settings0);
    }

    @Override  // androidx.compose.ui.text.font.Font
    @l
    public final FontWeight b() {
        return this.g;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public final int d() {
        return this.h;
    }

    @m
    public abstract Typeface f(@m Context arg1);

    @m
    public abstract String g();

    @m
    public final Typeface h() {
        return this.j;
    }

    @m
    public final Typeface i(@l Context context0) {
        L.p(context0, "context");
        if(!this.i && this.j == null) {
            this.j = this.f(context0);
        }
        this.i = true;
        return this.j;
    }

    public final void j(@m Typeface typeface0) {
        this.j = typeface0;
    }
}

