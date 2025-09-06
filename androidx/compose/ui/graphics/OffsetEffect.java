package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class OffsetEffect extends RenderEffect {
    @m
    private final RenderEffect b;
    private final long c;

    private OffsetEffect(RenderEffect renderEffect0, long v) {
        super(null);
        this.b = renderEffect0;
        this.c = v;
    }

    public OffsetEffect(RenderEffect renderEffect0, long v, w w0) {
        this(renderEffect0, v);
    }

    @Override  // androidx.compose.ui.graphics.RenderEffect
    @RequiresApi(0x1F)
    @l
    protected android.graphics.RenderEffect b() {
        return RenderEffectVerificationHelper.a.b(this.b, this.c);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OffsetEffect)) {
            return false;
        }
        return L.g(this.b, ((OffsetEffect)object0).b) ? Offset.l(this.c, ((OffsetEffect)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return this.b == null ? Offset.s(this.c) : this.b.hashCode() * 0x1F + Offset.s(this.c);
    }

    @Override
    @l
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.b + ", offset=" + Offset.y(this.c) + ')';
    }
}

