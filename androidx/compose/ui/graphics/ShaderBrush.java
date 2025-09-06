package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n1#2:656\n*E\n"})
public abstract class ShaderBrush extends Brush {
    @m
    private Shader c;
    private long d;

    public ShaderBrush() {
        super(null);
        this.d = 0x7FC000007FC00000L;
    }

    @Override  // androidx.compose.ui.graphics.Brush
    public final void a(long v, @l Paint paint0, float f) {
        L.p(paint0, "p");
        Shader shader0 = this.c;
        if(shader0 == null || !Size.k(this.d, v)) {
            shader0 = this.c(v);
            this.c = shader0;
            this.d = v;
        }
        if(!Color.y(paint0.a(), 0xFF00000000000000L)) {
            paint0.g(0xFF00000000000000L);
        }
        if(!L.g(paint0.m(), shader0)) {
            paint0.y(shader0);
        }
        if(paint0.i() != f) {
            paint0.j(f);
        }
    }

    @l
    public abstract Shader c(long arg1);
}

