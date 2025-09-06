package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {
    @l
    private final ResourceLoader a;
    @l
    private final Context b;
    @l
    private final Object c;

    public DelegatingFontLoaderForBridgeUsage(@l ResourceLoader font$ResourceLoader0, @l Context context0) {
        L.p(font$ResourceLoader0, "loader");
        L.p(context0, "context");
        super();
        this.a = font$ResourceLoader0;
        this.b = context0;
        this.c = new Object();
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @l
    public Object a() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @m
    public Object b(@l Font font0, @l d d0) {
        return font0 instanceof AndroidFont ? ((AndroidFont)font0).a().b(this.b, ((AndroidFont)font0), d0) : this.a.a(font0);
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @m
    public Object c(@l Font font0) {
        L.p(font0, "font");
        return font0 instanceof AndroidFont ? ((AndroidFont)font0).a().a(this.b, ((AndroidFont)font0)) : this.a.a(font0);
    }

    @l
    public final ResourceLoader d() {
        return this.a;
    }
}

