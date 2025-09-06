package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class BrushPainter extends Painter {
    @l
    private final Brush g;
    private float h;
    @m
    private ColorFilter i;

    public BrushPainter(@l Brush brush0) {
        L.p(brush0, "brush");
        super();
        this.g = brush0;
        this.h = 1.0f;
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
        return object0 instanceof BrushPainter ? L.g(this.g, ((BrushPainter)object0).g) : false;
    }

    @Override
    public int hashCode() {
        return this.g.hashCode();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long i() {
        return this.g.b();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected void k(@l DrawScope drawScope0) {
        L.p(drawScope0, "<this>");
        b.J(drawScope0, this.g, 0L, 0L, this.h, null, this.i, 0, 86, null);
    }

    @l
    public final Brush l() {
        return this.g;
    }

    @Override
    @l
    public String toString() {
        return "BrushPainter(brush=" + this.g + ')';
    }
}

