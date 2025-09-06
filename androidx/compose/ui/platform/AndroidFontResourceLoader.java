package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

@k(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @c0(expression = "PlatformFontLoader", imports = {}))
public final class AndroidFontResourceLoader implements ResourceLoader {
    @l
    private final Context a;

    public AndroidFontResourceLoader(@l Context context0) {
        L.p(context0, "context");
        super();
        this.a = context0;
    }

    @Override  // androidx.compose.ui.text.font.Font$ResourceLoader
    public Object a(Font font0) {
        return this.b(font0);
    }

    @k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @c0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @l
    public Typeface b(@l Font font0) {
        L.p(font0, "font");
        if(!(font0 instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font0);
        }
        if(Build.VERSION.SDK_INT >= 26) {
            int v = ((ResourceFont)font0).i();
            return AndroidFontResourceLoaderHelper.a.a(this.a, v);
        }
        int v1 = ((ResourceFont)font0).i();
        Typeface typeface0 = ResourcesCompat.j(this.a, v1);
        L.m(typeface0);
        L.o(typeface0, "{\n                    Re…esId)!!\n                }");
        return typeface0;
    }
}

