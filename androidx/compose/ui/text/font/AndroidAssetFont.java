package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AndroidAssetFont extends AndroidPreloadedFont {
    @l
    private final AssetManager k;
    @l
    private final String l;
    @l
    private final String m;

    private AndroidAssetFont(AssetManager assetManager0, String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0) {
        super(fontWeight0, v, fontVariation$Settings0, null);
        this.k = assetManager0;
        this.l = s;
        this.j(this.f(null));
        this.m = "asset:" + s;
    }

    public AndroidAssetFont(AssetManager assetManager0, String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, w w0) {
        if((v1 & 4) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(assetManager0, s, fontWeight0, v, fontVariation$Settings0, null);
    }

    public AndroidAssetFont(AssetManager assetManager0, String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, w w0) {
        this(assetManager0, s, fontWeight0, v, fontVariation$Settings0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AndroidAssetFont)) {
            return false;
        }
        return L.g(this.l, ((AndroidAssetFont)object0).l) ? L.g(this.e(), ((AndroidAssetFont)object0).e()) : false;
    }

    @Override  // androidx.compose.ui.text.font.AndroidPreloadedFont
    @m
    public Typeface f(@m Context context0) {
        return Build.VERSION.SDK_INT < 26 ? Typeface.createFromAsset(this.k, this.l) : TypefaceBuilderCompat.a.a(this.k, this.l, context0, this.e());
    }

    @Override  // androidx.compose.ui.text.font.AndroidPreloadedFont
    @l
    public String g() {
        return this.m;
    }

    @Override
    public int hashCode() {
        return this.l.hashCode() * 0x1F + this.e().hashCode();
    }

    @l
    public final AssetManager k() {
        return this.k;
    }

    @l
    public final String l() {
        return this.l;
    }

    @Override
    @l
    public String toString() {
        return "Font(assetManager, path=" + this.l + ", weight=" + this.b() + ", style=" + FontStyle.i(this.d()) + ')';
    }
}

