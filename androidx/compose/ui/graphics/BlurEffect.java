package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class BlurEffect extends RenderEffect {
    @m
    private final RenderEffect b;
    private final float c;
    private final float d;
    private final int e;

    private BlurEffect(RenderEffect renderEffect0, float f, float f1, int v) {
        super(null);
        this.b = renderEffect0;
        this.c = f;
        this.d = f1;
        this.e = v;
    }

    public BlurEffect(RenderEffect renderEffect0, float f, float f1, int v, int v1, w w0) {
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(renderEffect0, f, ((v1 & 4) == 0 ? f1 : f), v, null);
    }

    public BlurEffect(RenderEffect renderEffect0, float f, float f1, int v, w w0) {
        this(renderEffect0, f, f1, v);
    }

    @Override  // androidx.compose.ui.graphics.RenderEffect
    @RequiresApi(0x1F)
    @l
    protected android.graphics.RenderEffect b() {
        return RenderEffectVerificationHelper.a.a(this.b, this.c, this.d, this.e);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlurEffect)) {
            return false;
        }
        return this.c == ((BlurEffect)object0).c && this.d == ((BlurEffect)object0).d && TileMode.h(this.e, ((BlurEffect)object0).e) ? L.g(this.b, ((BlurEffect)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.b == null ? (Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + this.e : ((this.b.hashCode() * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + this.e;
    }

    @Override
    @l
    public String toString() {
        return "BlurEffect(renderEffect=" + this.b + ", radiusX=" + this.c + ", radiusY=" + this.d + ", edgeTreatment=" + TileMode.j(this.e) + ')';
    }
}

