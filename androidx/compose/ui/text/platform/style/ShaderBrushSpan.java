package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;
import y4.m;

@s0({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,57:1\n159#2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:58\n*E\n"})
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    @l
    private final ShaderBrush a;
    private final float b;
    private long c;
    @m
    private V d;

    public ShaderBrushSpan(@l ShaderBrush shaderBrush0, float f) {
        L.p(shaderBrush0, "shaderBrush");
        super();
        this.a = shaderBrush0;
        this.b = f;
        this.c = 0x7FC000007FC00000L;
    }

    public final float a() {
        return this.b;
    }

    @l
    public final ShaderBrush b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final void d(long v) {
        this.c = v;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint0) {
        L.p(textPaint0, "textPaint");
        AndroidTextPaint_androidKt.a(textPaint0, this.b);
        if(this.c == 0x7FC000007FC00000L) {
            return;
        }
        V v0 = this.d;
        Shader shader0 = v0 == null || !Size.k(((Size)v0.e()).y(), this.c) ? this.a.c(this.c) : ((Shader)v0.f());
        textPaint0.setShader(shader0);
        this.d = r0.a(Size.c(this.c), shader0);
    }
}

