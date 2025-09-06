package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import java.io.File;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AndroidFileFont extends AndroidPreloadedFont {
    @l
    private final File k;
    @m
    private final String l;

    private AndroidFileFont(File file0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0) {
        super(fontWeight0, v, fontVariation$Settings0, null);
        this.k = file0;
        this.j(this.f(null));
    }

    public AndroidFileFont(File file0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, w w0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(file0, fontWeight0, v, fontVariation$Settings0, null);
    }

    public AndroidFileFont(File file0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, w w0) {
        this(file0, fontWeight0, v, fontVariation$Settings0);
    }

    @Override  // androidx.compose.ui.text.font.AndroidPreloadedFont
    @m
    public Typeface f(@m Context context0) {
        return Build.VERSION.SDK_INT < 26 ? Typeface.createFromFile(this.k) : TypefaceBuilderCompat.a.b(this.k, context0, this.e());
    }

    @Override  // androidx.compose.ui.text.font.AndroidPreloadedFont
    @m
    public String g() {
        return this.l;
    }

    @l
    public final File k() {
        return this.k;
    }

    @Override
    @l
    public String toString() {
        return "Font(file=" + this.k + ", weight=" + this.b() + ", style=" + FontStyle.i(this.d()) + ')';
    }
}

