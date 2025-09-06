package androidx.compose.ui.text.style;

import A3.a;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ShaderBrush;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class BrushStyle implements TextForegroundStyle {
    @l
    private final ShaderBrush b;
    private final float c;

    public BrushStyle(@l ShaderBrush shaderBrush0, float f) {
        L.p(shaderBrush0, "value");
        super();
        this.b = shaderBrush0;
        this.c = f;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public long a() {
        return 16L;
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
    @l
    public Brush d() {
        return this.b;
    }

    @l
    public final ShaderBrush e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BrushStyle)) {
            return false;
        }
        return L.g(this.b, ((BrushStyle)object0).b) ? Float.compare(this.i(), ((BrushStyle)object0).i()) == 0 : false;
    }

    public final float f() {
        return this.i();
    }

    @l
    public final BrushStyle g(@l ShaderBrush shaderBrush0, float f) {
        L.p(shaderBrush0, "value");
        return new BrushStyle(shaderBrush0, f);
    }

    public static BrushStyle h(BrushStyle brushStyle0, ShaderBrush shaderBrush0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            shaderBrush0 = brushStyle0.b;
        }
        if((v & 2) != 0) {
            f = brushStyle0.i();
        }
        return brushStyle0.g(shaderBrush0, f);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() * 0x1F + Float.floatToIntBits(this.i());
    }

    @Override  // androidx.compose.ui.text.style.TextForegroundStyle
    public float i() {
        return this.c;
    }

    @l
    public final ShaderBrush j() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "BrushStyle(value=" + this.b + ", alpha=" + this.i() + ')';
    }
}

