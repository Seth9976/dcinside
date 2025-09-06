package androidx.compose.ui.text.style;

import A3.a;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,148:1\n646#2:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n94#1:149\n*E\n"})
final class ColorStyle implements TextForegroundStyle {
    private final long b;

    private ColorStyle(long v) {
        this.b = v;
        if(v == 16L) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    public ColorStyle(long v, w w0) {
        this(v);
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public long a() {
        return this.b;
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public TextForegroundStyle b(TextForegroundStyle textForegroundStyle0) {
        return TextForegroundStyle.-CC.a(this, textForegroundStyle0);
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public TextForegroundStyle c(a a0) {
        return TextForegroundStyle.-CC.b(this, a0);
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    @m
    public Brush d() {
        return null;
    }

    public final long e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ColorStyle ? Color.y(this.b, ((ColorStyle)object0).b) : false;
    }

    @l
    public final ColorStyle f(long v) {
        return new ColorStyle(v, null);
    }

    public static ColorStyle g(ColorStyle colorStyle0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = colorStyle0.b;
        }
        return colorStyle0.f(v);
    }

    public final long h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Color.K(this.b);
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public float i() {
        return Color.A(this.a());
    }

    @Override
    @l
    public String toString() {
        return "ColorStyle(value=" + Color.L(this.b) + ')';
    }
}

