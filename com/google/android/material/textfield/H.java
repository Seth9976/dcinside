package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.shape.k.d;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;

class h extends k {
    static class a {
    }

    static final class b extends d {
        @NonNull
        private final RectF w;

        private b(@NonNull p p0, @NonNull RectF rectF0) {
            super(p0, null);
            this.w = rectF0;
        }

        b(p p0, RectF rectF0, a h$a0) {
            this(p0, rectF0);
        }

        private b(@NonNull b h$b0) {
            super(h$b0);
            this.w = h$b0.w;
        }

        b(b h$b0, a h$a0) {
            this(h$b0);
        }

        @Override  // com.google.android.material.shape.k$d
        @NonNull
        public Drawable newDrawable() {
            Drawable drawable0 = h.S0(this);
            ((k)drawable0).invalidateSelf();
            return drawable0;
        }
    }

    static class c extends h {
        private Paint F;
        private int G;

        c(@NonNull b h$b0) {
            super(h$b0, null);
        }

        private Paint X0() {
            if(this.F == null) {
                Paint paint0 = new Paint(1);
                this.F = paint0;
                paint0.setStyle(Paint.Style.FILL_AND_STROKE);
                this.F.setColor(-1);
                this.F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            return this.F;
        }

        private void Y0(@NonNull Canvas canvas0) {
            if(!this.b1(this.getCallback())) {
                canvas0.restoreToCount(this.G);
            }
        }

        private void Z0(@NonNull Canvas canvas0) {
            Drawable.Callback drawable$Callback0 = this.getCallback();
            if(!this.b1(drawable$Callback0)) {
                this.a1(canvas0);
            }
            else if(((View)drawable$Callback0).getLayerType() != 2) {
                ((View)drawable$Callback0).setLayerType(2, null);
            }
        }

        private void a1(@NonNull Canvas canvas0) {
            this.G = canvas0.saveLayer(0.0f, 0.0f, ((float)canvas0.getWidth()), ((float)canvas0.getHeight()), null);
        }

        private boolean b1(Drawable.Callback drawable$Callback0) {
            return drawable$Callback0 instanceof View;
        }

        @Override  // com.google.android.material.shape.k
        public void draw(@NonNull Canvas canvas0) {
            this.Z0(canvas0);
            super.draw(canvas0);
            this.Y0(canvas0);
        }

        @Override  // com.google.android.material.shape.k
        protected void t(@NonNull Canvas canvas0) {
            super.t(canvas0);
            canvas0.drawRect(this.E.w, this.X0());
        }
    }

    @TargetApi(18)
    static class com.google.android.material.textfield.h.d extends h {
        com.google.android.material.textfield.h.d(@NonNull b h$b0) {
            super(h$b0, null);
        }

        @Override  // com.google.android.material.shape.k
        protected void t(@NonNull Canvas canvas0) {
            if(this.E.w.isEmpty()) {
                super.t(canvas0);
                return;
            }
            canvas0.save();
            if(Build.VERSION.SDK_INT >= 26) {
                canvas0.clipOutRect(this.E.w);
            }
            else {
                canvas0.clipRect(this.E.w, Region.Op.DIFFERENCE);
            }
            super.t(canvas0);
            canvas0.restore();
        }
    }

    @NonNull
    b E;

    private h(@NonNull b h$b0) {
        super(h$b0);
        this.E = h$b0;
    }

    h(b h$b0, a h$a0) {
        this(h$b0);
    }

    static h R0(@Nullable p p0) {
        if(p0 == null) {
            p0 = new p();
        }
        return h.S0(new b(p0, new RectF(), null));
    }

    private static h S0(@NonNull b h$b0) {
        return new com.google.android.material.textfield.h.d(h$b0);
    }

    boolean T0() {
        return !this.E.w.isEmpty();
    }

    void U0() {
        this.V0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void V0(float f, float f1, float f2, float f3) {
        if(f != this.E.w.left || f1 != this.E.w.top || f2 != this.E.w.right || f3 != this.E.w.bottom) {
            this.E.w.set(f, f1, f2, f3);
            this.invalidateSelf();
        }
    }

    void W0(@NonNull RectF rectF0) {
        this.V0(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
    }

    @Override  // com.google.android.material.shape.k
    @NonNull
    public Drawable mutate() {
        this.E = new b(this.E, null);
        return this;
    }
}

