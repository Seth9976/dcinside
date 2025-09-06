package androidx.core.splashscreen;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class MaskedDrawable extends Drawable {
    @l
    private final Drawable a;
    private final float b;
    @l
    private final Path c;

    public MaskedDrawable(@l Drawable drawable0, float f) {
        L.p(drawable0, "drawable");
        super();
        this.a = drawable0;
        this.b = f;
        Path path0 = new Path();
        path0.addCircle(0.0f, 0.0f, f / 2.0f, Path.Direction.CW);
        this.c = path0;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        canvas0.clipPath(this.c);
        this.a.draw(canvas0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.getOpacity();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(@l Rect rect0) {
        L.p(rect0, "bounds");
        super.onBoundsChange(rect0);
        this.a.setBounds(rect0);
        float f = rect0.exactCenterX();
        float f1 = rect0.exactCenterY();
        this.c.offset(f, f1);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@m ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
    }
}

