package androidx.compose.ui.text.font;

import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    private final int b;

    public AndroidFontResolveInterceptor(int v) {
        this.b = v;
    }

    @Override  // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public FontFamily a(FontFamily fontFamily0) {
        return fontFamily0;
    }

    @Override  // androidx.compose.ui.text.font.PlatformResolveInterceptor
    @l
    public FontWeight b(@l FontWeight fontWeight0) {
        L.p(fontWeight0, "fontWeight");
        return this.b == 0 || this.b == 0x7FFFFFFF ? fontWeight0 : new FontWeight(s.I(fontWeight0.w() + this.b, 1, 1000));
    }

    @Override  // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public int c(int v) {
        return v;
    }

    @Override  // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public int d(int v) {
        return v;
    }

    private final int e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AndroidFontResolveInterceptor ? this.b == ((AndroidFontResolveInterceptor)object0).b : false;
    }

    @l
    public final AndroidFontResolveInterceptor f(int v) {
        return new AndroidFontResolveInterceptor(v);
    }

    public static AndroidFontResolveInterceptor g(AndroidFontResolveInterceptor androidFontResolveInterceptor0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = androidFontResolveInterceptor0.b;
        }
        return androidFontResolveInterceptor0.f(v);
    }

    @Override
    public int hashCode() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.b + ')';
    }
}

