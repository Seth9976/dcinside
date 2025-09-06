package com.bumptech.glide.integration.webp.decoder;

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
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.n;
import com.bumptech.glide.util.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class l extends Drawable implements Animatable, Animatable2Compat, b {
    static class a extends Drawable.ConstantState {
        final e a;
        final q b;

        public a(e e0, q q0) {
            this.a = e0;
            this.b = q0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            return new l(this);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
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

    public l(Context context0, j j0, e e0, n n0, int v, int v1, Bitmap bitmap0) {
        this(new a(e0, new q(c.e(context0), j0, v, v1, n0, bitmap0)));
    }

    l(a l$a0) {
        this.g = -1;
        this.e = true;
        this.a = (a)m.e(l$a0);
        this.v(0);
    }

    @VisibleForTesting
    l(q q0, e e0, Paint paint0) {
        this(new a(e0, q0));
        this.i = paint0;
    }

    @Override  // com.bumptech.glide.integration.webp.decoder.q$b
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
            this.stop();
            this.q();
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
    public void draw(Canvas canvas0) {
        if(this.p()) {
            return;
        }
        if(this.h) {
            Gravity.apply(0x77, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.getBounds(), this.g());
            this.h = false;
        }
        canvas0.drawBitmap(this.a.b.c(), null, this.g(), this.n());
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void e() {
        List list0 = this.k;
        if(list0 != null) {
            list0.clear();
        }
    }

    public ByteBuffer f() {
        return this.a.b.b();
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
        return this.a.b.i();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.b.m();
    }

    @Override  // android.graphics.drawable.Drawable
    @Deprecated
    public int getOpacity() {
        return -2;
    }

    public Bitmap h() {
        return this.a.b.e();
    }

    public int i() {
        return this.a.b.f();
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b;
    }

    public int j() {
        return this.a.b.d();
    }

    public n k() {
        return this.a.b.h();
    }

    public int l() {
        return this.a.b.j();
    }

    public int m() {
        return this.g;
    }

    private Paint n() {
        if(this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    public int o() {
        return this.a.b.l();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.h = true;
    }

    boolean p() {
        return this.d;
    }

    private void q() {
        List list0 = this.k;
        if(list0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((AnimationCallback)this.k.get(v1)).b(this);
            }
        }
    }

    public void r() {
        this.d = true;
        this.a.b.a();
    }

    private void s() {
        this.f = 0;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.n().setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.n().setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        m.b(!this.d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View\'s visibility.");
        this.e = z;
        if(!z) {
            this.y();
            return super.setVisible(false, z1);
        }
        if(this.c) {
            this.x();
        }
        return super.setVisible(true, z1);
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        this.c = true;
        this.s();
        if(this.e) {
            this.x();
        }
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.c = false;
        this.y();
    }

    public void t(n n0, Bitmap bitmap0) {
        this.a.b.q(n0, bitmap0);
    }

    void u(boolean z) {
    }

    public void v(int v) {
        int v1 = -1;
        if(v <= 0 && (v != -1 && v != 0)) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to LOOP_FOREVER, or equal to LOOP_INTRINSIC");
        }
        if(v == 0) {
            int v2 = this.a.b.j();
            if(v2 != 0) {
                v1 = v2;
            }
            this.g = v1;
            return;
        }
        this.g = v;
    }

    public void w() {
        m.b(!this.b, "You cannot restart a currently running animation.");
        this.a.b.r();
        this.start();
    }

    private void x() {
        m.b(!this.d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if(this.a.b.f() == 1) {
            this.invalidateSelf();
            return;
        }
        if(!this.b) {
            this.b = true;
            this.a.b.v(this);
            this.invalidateSelf();
        }
    }

    private void y() {
        this.b = false;
        this.a.b.w(this);
    }
}

