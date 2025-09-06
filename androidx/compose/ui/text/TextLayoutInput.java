package androidx.compose.ui.text;

import androidx.compose.foundation.c;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class TextLayoutInput {
    @l
    private final AnnotatedString a;
    @l
    private final TextStyle b;
    @l
    private final List c;
    private final int d;
    private final boolean e;
    private final int f;
    @l
    private final Density g;
    @l
    private final LayoutDirection h;
    @l
    private final Resolver i;
    private final long j;
    @m
    private ResourceLoader k;
    public static final int l = 8;

    static {
    }

    private TextLayoutInput(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, long v2) {
        this(annotatedString0, textStyle0, list0, v, z, v1, density0, layoutDirection0, font$ResourceLoader0, DelegatingFontLoaderForDeprecatedUsage_androidKt.a(font$ResourceLoader0), v2);
    }

    @k(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @c0(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public TextLayoutInput(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, long v2, w w0) {
        this(annotatedString0, textStyle0, list0, v, z, v1, density0, layoutDirection0, font$ResourceLoader0, v2);
    }

    private TextLayoutInput(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, Resolver fontFamily$Resolver0, long v2) {
        this.a = annotatedString0;
        this.b = textStyle0;
        this.c = list0;
        this.d = v;
        this.e = z;
        this.f = v1;
        this.g = density0;
        this.h = layoutDirection0;
        this.i = fontFamily$Resolver0;
        this.j = v2;
        this.k = font$ResourceLoader0;
    }

    private TextLayoutInput(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, Resolver fontFamily$Resolver0, long v2) {
        this(annotatedString0, textStyle0, list0, v, z, v1, density0, layoutDirection0, null, fontFamily$Resolver0, v2);
    }

    public TextLayoutInput(AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, Resolver fontFamily$Resolver0, long v2, w w0) {
        this(annotatedString0, textStyle0, list0, v, z, v1, density0, layoutDirection0, fontFamily$Resolver0, v2);
    }

    @k(message = "Font.ResourceLoader is deprecated", replaceWith = @c0(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    @l
    public final TextLayoutInput a(@l AnnotatedString annotatedString0, @l TextStyle textStyle0, @l List list0, int v, boolean z, int v1, @l Density density0, @l LayoutDirection layoutDirection0, @l ResourceLoader font$ResourceLoader0, long v2) {
        L.p(annotatedString0, "text");
        L.p(textStyle0, "style");
        L.p(list0, "placeholders");
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        L.p(font$ResourceLoader0, "resourceLoader");
        return new TextLayoutInput(annotatedString0, textStyle0, list0, v, z, v1, density0, layoutDirection0, font$ResourceLoader0, this.i, v2);
    }

    public static TextLayoutInput b(TextLayoutInput textLayoutInput0, AnnotatedString annotatedString0, TextStyle textStyle0, List list0, int v, boolean z, int v1, Density density0, LayoutDirection layoutDirection0, ResourceLoader font$ResourceLoader0, long v2, int v3, Object object0) {
        AnnotatedString annotatedString1 = (v3 & 1) == 0 ? annotatedString0 : textLayoutInput0.a;
        TextStyle textStyle1 = (v3 & 2) == 0 ? textStyle0 : textLayoutInput0.b;
        List list1 = (v3 & 4) == 0 ? list0 : textLayoutInput0.c;
        int v4 = (v3 & 8) == 0 ? v : textLayoutInput0.d;
        boolean z1 = (v3 & 16) == 0 ? z : textLayoutInput0.e;
        int v5 = (v3 & 0x20) == 0 ? v1 : textLayoutInput0.f;
        Density density1 = (v3 & 0x40) == 0 ? density0 : textLayoutInput0.g;
        LayoutDirection layoutDirection1 = (v3 & 0x80) == 0 ? layoutDirection0 : textLayoutInput0.h;
        ResourceLoader font$ResourceLoader1 = (v3 & 0x100) == 0 ? font$ResourceLoader0 : textLayoutInput0.j();
        return (v3 & 0x200) == 0 ? textLayoutInput0.a(annotatedString1, textStyle1, list1, v4, z1, v5, density1, layoutDirection1, font$ResourceLoader1, v2) : textLayoutInput0.a(annotatedString1, textStyle1, list1, v4, z1, v5, density1, layoutDirection1, font$ResourceLoader1, textLayoutInput0.j);
    }

    public final long c() {
        return this.j;
    }

    @l
    public final Density d() {
        return this.g;
    }

    @l
    public final Resolver e() {
        return this.i;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextLayoutInput)) {
            return false;
        }
        if(!L.g(this.a, ((TextLayoutInput)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((TextLayoutInput)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((TextLayoutInput)object0).c)) {
            return false;
        }
        if(this.d != ((TextLayoutInput)object0).d) {
            return false;
        }
        if(this.e != ((TextLayoutInput)object0).e) {
            return false;
        }
        if(!TextOverflow.g(this.f, ((TextLayoutInput)object0).f)) {
            return false;
        }
        if(!L.g(this.g, ((TextLayoutInput)object0).g)) {
            return false;
        }
        if(this.h != ((TextLayoutInput)object0).h) {
            return false;
        }
        return L.g(this.i, ((TextLayoutInput)object0).i) ? Constraints.g(this.j, ((TextLayoutInput)object0).j) : false;
    }

    @l
    public final LayoutDirection f() {
        return this.h;
    }

    public final int g() {
        return this.d;
    }

    public final int h() {
        return this.f;
    }

    @Override
    public int hashCode() {
        return ((((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d) * 0x1F + c.a(this.e)) * 0x1F + this.f) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode()) * 0x1F + this.i.hashCode()) * 0x1F + Constraints.t(this.j);
    }

    @l
    public final List i() {
        return this.c;
    }

    @l
    public final ResourceLoader j() {
        return this.k == null ? DeprecatedBridgeFontResourceLoader.b.a(this.i) : this.k;
    }

    @k(message = "Replaced with FontFamily.Resolver", replaceWith = @c0(expression = "fontFamilyResolver", imports = {}))
    public static void k() {
    }

    public final boolean l() {
        return this.e;
    }

    @l
    public final TextStyle m() {
        return this.b;
    }

    @l
    public final AnnotatedString n() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "TextLayoutInput(text=" + this.a + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + TextOverflow.i(this.f) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + Constraints.w(this.j) + ')';
    }
}

