package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.n;
import com.bumptech.glide.util.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class c extends Drawable implements Animatable, Animatable2Compat, b {
    static final class a extends Drawable.ConstantState {
        @VisibleForTesting
        final g a;

        a(g g0) {
            this.a = g0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources0) {
            return this.newDrawable();
        }
    }

    private final a a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private Paint i;
    private Rect j;
    private List k;
    public static final int l = -1;
    public static final int m = 0;
    private static final int n = 0x77;

    @Deprecated
    public c(Context context0, com.bumptech.glide.gifdecoder.a a0, e e0, n n0, int v, int v1, Bitmap bitmap0) {
        this(context0, a0, n0, v, v1, bitmap0);
    }

    public c(Context context0, com.bumptech.glide.gifdecoder.a a0, n n0, int v, int v1, Bitmap bitmap0) {
        this(new a(new g(com.bumptech.glide.c.e(context0), a0, v, v1, n0, bitmap0)));
    }

    c(a c$a0) {
        this.e = true;
        this.g = -1;
        this.a = (a)m.e(c$a0);
    }

    @VisibleForTesting
    c(g g0, Paint paint0) {
        this(new a(g0));
        this.i = paint0;
    }

    @Override  // com.bumptech.glide.load.resource.gif.g$b
    public void a() {
        if(this.c() == null) {
            this.stop();
            this.invalidateSelf();
            return;
        }
        this.invalidateSelf();
        if(this.j() == this.i() - 1) {
            ++this.f;
        }
        if(this.g != -1 && this.f >= this.g) {
            this.o();
            this.stop();
        }
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean b(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        return this.k == null || animatable2Compat$AnimationCallback0 == null ? false : this.k.remove(animatable2Compat$AnimationCallback0);
    }

    private Drawable.Callback c() {
        Drawable.Callback drawable$Callback0;
        for(drawable$Callback0 = this.getCallback(); drawable$Callback0 instanceof Drawable; drawable$Callback0 = ((Drawable)drawable$Callback0).getCallback()) {
        }
        return drawable$Callback0;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void d(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        if(animatable2Compat$AnimationCallback0 == null) {
            return;
        }
        if(this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(animatable2Compat$AnimationCallback0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        if(this.d) {
            return;
        }
        if(this.h) {
            Gravity.apply(0x77, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.getBounds(), this.g());
            this.h = false;
        }
        canvas0.drawBitmap(this.a.a.c(), null, this.g(), this.l());
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void e() {
        List list0 = this.k;
        if(list0 != null) {
            list0.clear();
        }
    }

    public ByteBuffer f() {
        return this.a.a.b();
    }

    private Rect g() {
        if(this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.a.i();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.a.m();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public Bitmap h() {
        return this.a.a.e();
    }

    public int i() {
        return this.a.a.f();
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b;
    }

    public int j() {
        return this.a.a.d();
    }

    public n k() {
        return this.a.a.h();
    }

    private Paint l() {
        if(this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    public int m() {
        return this.a.a.l();
    }

    boolean n() {
        return this.d;
    }

    private void o() {
        List list0 = this.k;
        if(list0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((AnimationCallback)this.k.get(v1)).b(this);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.h = true;
    }

    public void p() {
        this.d = true;
        this.a.a.a();
    }

    private void q() {
        this.f = 0;
    }

    public void r(n n0, Bitmap bitmap0) {
        this.a.a.q(n0, bitmap0);
    }

    void s(boolean z) {
        this.b = z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.l().setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.l().setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        m.b(!this.d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View\'s visibility.");
        this.e = z;
        if(!z) {
            this.w();
            return super.setVisible(false, z1);
        }
        if(this.c) {
            this.v();
        }
        return super.setVisible(true, z1);
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        this.c = true;
        this.q();
        if(this.e) {
            this.v();
        }
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.c = false;
        this.w();
    }

    public void t(int v) {
        int v1 = -1;
        if(v <= 0 && (v != -1 && v != 0)) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if(v == 0) {
            int v2 = this.a.a.j();
            if(v2 != 0) {
                v1 = v2;
            }
            this.g = v1;
            return;
        }
        this.g = v;
    }

    public void u() {
        m.b(!this.b, "You cannot restart a currently running animation.");
        this.a.a.r();
        this.start();
    }

    private void v() {
        m.b(!this.d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if(this.a.a.f() == 1) {
            this.invalidateSelf();
            return;
        }
        if(!this.b) {
            this.b = true;
            this.a.a.v(this);
            this.invalidateSelf();
        }
    }

    private void w() {
        this.b = false;
        this.a.a.w(this);
    }
}

