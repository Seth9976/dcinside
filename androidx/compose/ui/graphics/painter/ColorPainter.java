package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class ColorPainter extends Painter {
    private final long g;
    private float h;
    @m
    private ColorFilter i;
    private final long j;

    private ColorPainter(long v) {
        this.g = v;
        this.h = 1.0f;
        this.j = 0x7FC000007FC00000L;
    }

    public ColorPainter(long v, w w0) {
        this(v);
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float f) {
        this.h = f;
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(@m ColorFilter colorFilter0) {
        this.i = colorFilter0;
        return true;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ColorPainter ? Color.y(this.g, ((ColorPainter)object0).g) : false;
    }

    @Override
    public int hashCode() {
        return Color.K(this.g);
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long i() {
        return this.j;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected void k(@l DrawScope drawScope0) {
        L.p(drawScope0, "<this>");
        b.K(drawScope0, this.g, 0L, 0L, this.h, null, this.i, 0, 86, null);
    }

    public final long l() {
        return this.g;
    }

    @Override
    @l
    public String toString() {
        return "ColorPainter(color=" + Color.L(this.g) + ')';
    }
}

