package androidx.compose.ui.text.font;

import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class DelegatingFontLoaderForDeprecatedUsage implements PlatformFontLoader {
    @l
    private final ResourceLoader a;
    @l
    private final Object b;

    public DelegatingFontLoaderForDeprecatedUsage(@l ResourceLoader font$ResourceLoader0) {
        L.p(font$ResourceLoader0, "loader");
        super();
        this.a = font$ResourceLoader0;
        this.b = new Object();
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @l
    public Object a() {
        return this.b;
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @m
    public Object b(@l Font font0, @l d d0) {
        return this.a.a(font0);
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @l
    public Object c(@l Font font0) {
        L.p(font0, "font");
        return this.a.a(font0);
    }

    @l
    public final ResourceLoader d() {
        return this.a;
    }
}

