package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import y4.l;
import y4.m;

public final class BitmapPainter extends Painter {
    @l
    private final ImageBitmap g;
    private final long h;
    private final long i;
    private int j;
    private final long k;
    private float l;
    @m
    private ColorFilter m;

    private BitmapPainter(ImageBitmap imageBitmap0, long v, long v1) {
        this.g = imageBitmap0;
        this.h = v;
        this.i = v1;
        this.j = 1;
        this.k = this.n(v, v1);
        this.l = 1.0f;
    }

    public BitmapPainter(ImageBitmap imageBitmap0, long v, long v1, int v2, w w0) {
        if((v2 & 2) != 0) {
            v = 0L;
        }
        if((v2 & 4) != 0) {
            v1 = IntSizeKt.a(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        }
        this(imageBitmap0, v, v1, null);
    }

    public BitmapPainter(ImageBitmap imageBitmap0, long v, long v1, w w0) {
        this(imageBitmap0, v, v1);
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float f) {
        this.l = f;
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(@m ColorFilter colorFilter0) {
        this.m = colorFilter0;
        return true;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BitmapPainter)) {
            return false;
        }
        if(!L.g(this.g, ((BitmapPainter)object0).g)) {
            return false;
        }
        if(!IntOffset.j(this.h, ((BitmapPainter)object0).h)) {
            return false;
        }
        return IntSize.h(this.i, ((BitmapPainter)object0).i) ? FilterQuality.h(this.j, ((BitmapPainter)object0).j) : false;
    }

    @Override
    public int hashCode() {
        return ((this.g.hashCode() * 0x1F + IntOffset.p(this.h)) * 0x1F + IntSize.n(this.i)) * 0x1F + this.j;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long i() {
        return IntSizeKt.f(this.k);
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected void k(@l DrawScope drawScope0) {
        L.p(drawScope0, "<this>");
        long v = IntSizeKt.a(b.L0(Size.t(drawScope0.b())), b.L0(Size.m(drawScope0.b())));
        androidx.compose.ui.graphics.drawscope.b.z(drawScope0, this.g, this.h, this.i, 0L, v, this.l, null, this.m, 0, this.j, 328, null);
    }

    public final int l() {
        return this.j;
    }

    public final void m(int v) {
        this.j = v;
    }

    private final long n(long v, long v1) {
        if(((int)(v >> 0x20)) < 0 || ((int)(v & 0xFFFFFFFFL)) < 0 || ((int)(v1 >> 0x20)) < 0 || ((int)(v1 & 0xFFFFFFFFL)) < 0 || ((int)(v1 >> 0x20)) > this.g.getWidth() || ((int)(v1 & 0xFFFFFFFFL)) > this.g.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return v1;
    }

    @Override
    @l
    public String toString() {
        return "BitmapPainter(image=" + this.g + ", srcOffset=" + IntOffset.u(this.h) + ", srcSize=" + IntSize.p(this.i) + ", filterQuality=" + FilterQuality.k(this.j) + ')';
    }
}

