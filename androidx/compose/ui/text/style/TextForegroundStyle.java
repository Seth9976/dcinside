package androidx.compose.ui.text.style;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.J;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

public interface TextForegroundStyle {
    @s0({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,148:1\n646#2:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n77#1:149\n*E\n"})
    public static final class Companion {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }

        @l
        public final TextForegroundStyle a(@m Brush brush0, float f) {
            if(brush0 == null) {
                return Unspecified.b;
            }
            if(brush0 instanceof SolidColor) {
                return this.b(TextDrawStyleKt.c(((SolidColor)brush0).c(), f));
            }
            if(!(brush0 instanceof ShaderBrush)) {
                throw new J();
            }
            return new BrushStyle(((ShaderBrush)brush0), f);
        }

        @l
        public final TextForegroundStyle b(long v) {
            return v != 16L ? new ColorStyle(v, null) : Unspecified.b;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Unspecified implements TextForegroundStyle {
        @l
        public static final Unspecified b;
        public static final int c;

        static {
            Unspecified.b = new Unspecified();
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
        @m
        public Brush d() {
            return null;
        }

        @Override  // androidx.compose.ui.text.style.TextForegroundStyle
        public float i() {
            return NaNf;
        }
    }

    @l
    public static final Companion a;

    static {
        TextForegroundStyle.a = Companion.a;
    }

    long a();

    @l
    TextForegroundStyle b(@l TextForegroundStyle arg1);

    @l
    TextForegroundStyle c(@l a arg1);

    @m
    Brush d();

    float i();
}

