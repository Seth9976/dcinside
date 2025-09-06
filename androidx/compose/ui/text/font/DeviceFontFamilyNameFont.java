package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class DeviceFontFamilyNameFont extends AndroidFont {
    @l
    private final String g;
    @l
    private final FontWeight h;
    private final int i;

    private DeviceFontFamilyNameFont(String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0) {
        super(1, NamedFontLoader.a, fontVariation$Settings0, null);
        this.g = s;
        this.h = fontWeight0;
        this.i = v;
    }

    public DeviceFontFamilyNameFont(String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, w w0) {
        this(s, fontWeight0, v, fontVariation$Settings0);
    }

    @Override  // androidx.compose.ui.text.font.Font
    @l
    public FontWeight b() {
        return this.h;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public int d() {
        return this.i;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        if(!DeviceFontFamilyName.d(this.g, ((DeviceFontFamilyNameFont)object0).g)) {
            return false;
        }
        if(!L.g(this.b(), ((DeviceFontFamilyNameFont)object0).b())) {
            return false;
        }
        return FontStyle.f(this.d(), ((DeviceFontFamilyNameFont)object0).d()) ? L.g(this.e(), ((DeviceFontFamilyNameFont)object0).e()) : false;
    }

    @m
    public final Typeface f(@l Context context0) {
        L.p(context0, "context");
        return PlatformTypefacesKt.a().c(this.g, this.b(), this.d(), this.e(), context0);
    }

    @Override
    public int hashCode() {
        return ((DeviceFontFamilyName.f(this.g) * 0x1F + this.b().hashCode()) * 0x1F + this.d()) * 0x1F + this.e().hashCode();
    }

    @Override
    @l
    public String toString() {
        return "Font(familyName=\"" + ("DeviceFontFamilyName(name=" + this.g + ')') + "\", weight=" + this.b() + ", style=" + FontStyle.i(this.d()) + ')';
    }
}

