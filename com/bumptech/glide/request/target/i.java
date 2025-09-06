package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.util.m;

public class i extends Drawable {
    static final class a extends Drawable.ConstantState {
        private final Drawable.ConstantState a;
        final int b;
        final int c;

        a(Drawable.ConstantState drawable$ConstantState0, int v, int v1) {
            this.a = drawable$ConstantState0;
            this.b = v;
            this.c = v1;
        }

        a(a i$a0) {
            this(i$a0.a, i$a0.b, i$a0.c);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new i(this, this.a.newDrawable());
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources0) {
            return new i(this, this.a.newDrawable(resources0));
        }
    }

    private final Matrix a;
    private final RectF b;
    private final RectF c;
    private Drawable d;
    private a e;
    private boolean f;

    public i(Drawable drawable0, int v, int v1) {
        this(new a(drawable0.getConstantState(), v, v1), drawable0);
    }

    i(a i$a0, Drawable drawable0) {
        this.e = (a)m.e(i$a0);
        this.d = (Drawable)m.e(drawable0);
        drawable0.setBounds(0, 0, drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
        this.a = new Matrix();
        this.b = new RectF(0.0f, 0.0f, ((float)drawable0.getIntrinsicWidth()), ((float)drawable0.getIntrinsicHeight()));
        this.c = new RectF();
    }

    private void a() {
        this.a.setRectToRect(this.b, this.c, Matrix.ScaleToFit.CENTER);
    }

    @Override  // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.d.clearColorFilter();
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        canvas0.save();
        canvas0.concat(this.a);
        this.d.draw(canvas0);
        canvas0.restore();
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(19)
    public int getAlpha() {
        return this.d.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.d.getCallback();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.d.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.e;
    }

    @Override  // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.d.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.e.c;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.e.b;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.d.getMinimumHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.d.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.d.getOpacity();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect0) {
        return this.d.getPadding(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.d.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if(!this.f && super.mutate() == this) {
            this.d = this.d.mutate();
            this.e = new a(this.e);
            this.f = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public void scheduleSelf(@NonNull Runnable runnable0, long v) {
        super.scheduleSelf(runnable0, v);
        this.d.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.d.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setBounds(int v, int v1, int v2, int v3) {
        super.setBounds(v, v1, v2, v3);
        this.c.set(((float)v), ((float)v1), ((float)v2), ((float)v3));
        this.a();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setBounds(@NonNull Rect rect0) {
        super.setBounds(rect0);
        this.c.set(rect0);
        this.a();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int v) {
        this.d.setChangingConfigurations(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(int v, @NonNull PorterDuff.Mode porterDuff$Mode0) {
        this.d.setColorFilter(v, porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.d.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z) {
        this.d.setDither(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        return this.d.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Drawable
    public void unscheduleSelf(@NonNull Runnable runnable0) {
        super.unscheduleSelf(runnable0);
        this.d.unscheduleSelf(runnable0);
    }
}

