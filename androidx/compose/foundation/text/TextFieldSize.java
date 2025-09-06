package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;

final class TextFieldSize {
    @l
    private LayoutDirection a;
    @l
    private Density b;
    @l
    private Resolver c;
    @l
    private TextStyle d;
    @l
    private Object e;
    private long f;

    public TextFieldSize(@l LayoutDirection layoutDirection0, @l Density density0, @l Resolver fontFamily$Resolver0, @l TextStyle textStyle0, @l Object object0) {
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        L.p(textStyle0, "resolvedStyle");
        L.p(object0, "typeface");
        super();
        this.a = layoutDirection0;
        this.b = density0;
        this.c = fontFamily$Resolver0;
        this.d = textStyle0;
        this.e = object0;
        this.f = this.a();
    }

    private final long a() {
        return TextFieldDelegateKt.b(this.d, this.b, this.c, null, 0, 24, null);
    }

    @l
    public final Density b() {
        return this.b;
    }

    @l
    public final Resolver c() {
        return this.c;
    }

    @l
    public final LayoutDirection d() {
        return this.a;
    }

    public final long e() {
        return this.f;
    }

    @l
    public final TextStyle f() {
        return this.d;
    }

    @l
    public final Object g() {
        return this.e;
    }

    public final void h(@l Density density0) {
        L.p(density0, "<set-?>");
        this.b = density0;
    }

    public final void i(@l Resolver fontFamily$Resolver0) {
        L.p(fontFamily$Resolver0, "<set-?>");
        this.c = fontFamily$Resolver0;
    }

    public final void j(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "<set-?>");
        this.a = layoutDirection0;
    }

    public final void k(@l TextStyle textStyle0) {
        L.p(textStyle0, "<set-?>");
        this.d = textStyle0;
    }

    public final void l(@l Object object0) {
        L.p(object0, "<set-?>");
        this.e = object0;
    }

    public final void m(@l LayoutDirection layoutDirection0, @l Density density0, @l Resolver fontFamily$Resolver0, @l TextStyle textStyle0, @l Object object0) {
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        L.p(textStyle0, "resolvedStyle");
        L.p(object0, "typeface");
        if(layoutDirection0 != this.a || !L.g(density0, this.b) || !L.g(fontFamily$Resolver0, this.c) || !L.g(textStyle0, this.d) || !L.g(object0, this.e)) {
            this.a = layoutDirection0;
            this.b = density0;
            this.c = fontFamily$Resolver0;
            this.d = textStyle0;
            this.e = object0;
            this.f = this.a();
        }
    }
}

