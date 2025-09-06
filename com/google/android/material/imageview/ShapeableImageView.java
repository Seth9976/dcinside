package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.d;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;
import com.google.android.material.shape.t;

public class ShapeableImageView extends AppCompatImageView implements t {
    @TargetApi(21)
    class a extends ViewOutlineProvider {
        private final Rect a;
        final ShapeableImageView b;

        a() {
            this.a = new Rect();
        }

        @Override  // android.view.ViewOutlineProvider
        public void getOutline(View view0, Outline outline0) {
            if(ShapeableImageView.this.i == null) {
                return;
            }
            if(ShapeableImageView.this.h == null) {
                k k0 = new k(ShapeableImageView.this.i);
                ShapeableImageView.this.h = k0;
            }
            ShapeableImageView.this.b.round(this.a);
            ShapeableImageView.this.h.setBounds(this.a);
            ShapeableImageView.this.h.getOutline(outline0);
        }
    }

    private final q a;
    private final RectF b;
    private final RectF c;
    private final Paint d;
    private final Paint e;
    private final Path f;
    @Nullable
    private ColorStateList g;
    @Nullable
    private k h;
    private p i;
    @Dimension
    private float j;
    private Path k;
    @Dimension
    private int l;
    @Dimension
    private int m;
    @Dimension
    private int n;
    @Dimension
    private int o;
    @Dimension
    private int p;
    @Dimension
    private int q;
    private boolean r;
    private static final int s = 0;
    private static final int t = 0x80000000;

    static {
        ShapeableImageView.s = style.Widget_MaterialComponents_ShapeableImageView;
    }

    public ShapeableImageView(Context context0) {
        this(context0, null, 0);
    }

    public ShapeableImageView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ShapeableImageView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, ShapeableImageView.s), attributeSet0, v);
        this.a = q.k();
        this.f = new Path();
        this.r = false;
        Context context1 = this.getContext();
        Paint paint0 = new Paint();
        this.e = paint0;
        paint0.setAntiAlias(true);
        paint0.setColor(-1);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.b = new RectF();
        this.c = new RectF();
        this.k = new Path();
        TypedArray typedArray0 = context1.obtainStyledAttributes(attributeSet0, styleable.ShapeableImageView, v, ShapeableImageView.s);
        this.setLayerType(2, null);
        this.g = d.a(context1, typedArray0, styleable.ShapeableImageView_strokeColor);
        this.j = (float)typedArray0.getDimensionPixelSize(styleable.ShapeableImageView_strokeWidth, 0);
        int v1 = typedArray0.getDimensionPixelSize(styleable.ShapeableImageView_contentPadding, 0);
        this.m = v1;
        this.n = v1;
        this.o = v1;
        this.l = typedArray0.getDimensionPixelSize(styleable.ShapeableImageView_contentPaddingLeft, v1);
        this.m = typedArray0.getDimensionPixelSize(styleable.ShapeableImageView_contentPaddingTop, v1);
        this.n = typedArray0.getDimensionPixelSize(styleable.ShapeableImageView_contentPaddingRight, v1);
        this.o = typedArray0.getDimensionPixelSize(styleable.ShapeableImageView_contentPaddingBottom, v1);
        this.p = typedArray0.getDimensionPixelSize(styleable.ShapeableImageView_contentPaddingStart, 0x80000000);
        this.q = typedArray0.getDimensionPixelSize(styleable.ShapeableImageView_contentPaddingEnd, 0x80000000);
        typedArray0.recycle();
        Paint paint1 = new Paint();
        this.d = paint1;
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setAntiAlias(true);
        this.i = p.e(context1, attributeSet0, v, ShapeableImageView.s).m();
        this.setOutlineProvider(new a(this));
    }

    private void g(Canvas canvas0) {
        if(this.g == null) {
            return;
        }
        this.d.setStrokeWidth(this.j);
        int v = this.g.getColorForState(this.getDrawableState(), this.g.getDefaultColor());
        if(this.j > 0.0f && v != 0) {
            this.d.setColor(v);
            canvas0.drawPath(this.f, this.d);
        }
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.o;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int v = this.q;
        if(v != 0x80000000) {
            return v;
        }
        return this.i() ? this.l : this.n;
    }

    @Dimension
    public int getContentPaddingLeft() {
        if(this.h()) {
            if(this.i()) {
                int v = this.q;
                if(v != 0x80000000) {
                    return v;
                }
            }
            if(!this.i()) {
                return this.p == 0x80000000 ? this.l : this.p;
            }
        }
        return this.l;
    }

    @Dimension
    public int getContentPaddingRight() {
        if(this.h()) {
            if(this.i()) {
                int v = this.p;
                if(v != 0x80000000) {
                    return v;
                }
            }
            if(!this.i()) {
                return this.q == 0x80000000 ? this.n : this.q;
            }
        }
        return this.n;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int v = this.p;
        if(v != 0x80000000) {
            return v;
        }
        return this.i() ? this.n : this.l;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.m;
    }

    @Override  // android.view.View
    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - this.getContentPaddingBottom();
    }

    @Override  // android.view.View
    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - this.getContentPaddingEnd();
    }

    @Override  // android.view.View
    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - this.getContentPaddingLeft();
    }

    @Override  // android.view.View
    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - this.getContentPaddingRight();
    }

    @Override  // android.view.View
    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - this.getContentPaddingStart();
    }

    @Override  // android.view.View
    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - this.getContentPaddingTop();
    }

    @Override  // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.i;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.g;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.j;
    }

    private boolean h() {
        return this.p != 0x80000000 || this.q != 0x80000000;
    }

    private boolean i() {
        return this.getLayoutDirection() == 1;
    }

    public void j(@Dimension int v, @Dimension int v1, @Dimension int v2, @Dimension int v3) {
        this.p = 0x80000000;
        this.q = 0x80000000;
        super.setPadding(super.getPaddingLeft() - this.l + v, super.getPaddingTop() - this.m + v1, super.getPaddingRight() - this.n + v2, super.getPaddingBottom() - this.o + v3);
        this.l = v;
        this.m = v1;
        this.n = v2;
        this.o = v3;
    }

    @RequiresApi(17)
    public void k(@Dimension int v, @Dimension int v1, @Dimension int v2, @Dimension int v3) {
        super.setPaddingRelative(super.getPaddingStart() - this.getContentPaddingStart() + v, super.getPaddingTop() - this.m + v1, super.getPaddingEnd() - this.getContentPaddingEnd() + v2, super.getPaddingBottom() - this.o + v3);
        this.l = this.i() ? v2 : v;
        this.m = v1;
        if(!this.i()) {
            v = v2;
        }
        this.n = v;
        this.o = v3;
    }

    private void l(int v, int v1) {
        float f = (float)this.getPaddingLeft();
        float f1 = (float)this.getPaddingTop();
        int v2 = this.getPaddingRight();
        int v3 = this.getPaddingBottom();
        this.b.set(f, f1, ((float)(v - v2)), ((float)(v1 - v3)));
        this.a.d(this.i, 1.0f, this.b, this.f);
        this.k.rewind();
        this.k.addPath(this.f);
        this.c.set(0.0f, 0.0f, ((float)v), ((float)v1));
        this.k.addRect(this.c, Path.Direction.CCW);
    }

    @Override  // android.widget.ImageView
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        canvas0.drawPath(this.k, this.e);
        this.g(canvas0);
    }

    @Override  // android.widget.ImageView
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.r) {
            return;
        }
        if(!this.isLayoutDirectionResolved()) {
            return;
        }
        this.r = true;
        if(!this.isPaddingRelative() && !this.h()) {
            this.setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            return;
        }
        this.setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.l(v, v1);
    }

    @Override  // android.view.View
    public void setPadding(@Dimension int v, @Dimension int v1, @Dimension int v2, @Dimension int v3) {
        super.setPadding(v + this.getContentPaddingLeft(), v1 + this.getContentPaddingTop(), v2 + this.getContentPaddingRight(), v3 + this.getContentPaddingBottom());
    }

    @Override  // android.view.View
    public void setPaddingRelative(@Dimension int v, @Dimension int v1, @Dimension int v2, @Dimension int v3) {
        super.setPaddingRelative(v + this.getContentPaddingStart(), v1 + this.getContentPaddingTop(), v2 + this.getContentPaddingEnd(), v3 + this.getContentPaddingBottom());
    }

    @Override  // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p p0) {
        this.i = p0;
        k k0 = this.h;
        if(k0 != null) {
            k0.setShapeAppearanceModel(p0);
        }
        this.l(this.getWidth(), this.getHeight());
        this.invalidate();
        this.invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList0) {
        this.g = colorStateList0;
        this.invalidate();
    }

    public void setStrokeColorResource(@ColorRes int v) {
        this.setStrokeColor(AppCompatResources.a(this.getContext(), v));
    }

    public void setStrokeWidth(@Dimension float f) {
        if(this.j != f) {
            this.j = f;
            this.invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int v) {
        this.setStrokeWidth(((float)this.getResources().getDimensionPixelSize(v)));
    }
}

