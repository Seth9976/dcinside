package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.f.a;
import com.bumptech.glide.request.transition.f;

public abstract class j extends r implements a {
    @Nullable
    private Animatable j;

    public j(ImageView imageView0) {
        super(imageView0);
    }

    @Deprecated
    public j(ImageView imageView0, boolean z) {
        super(imageView0, z);
    }

    @Override  // com.bumptech.glide.request.target.r
    public void B(@Nullable Drawable drawable0) {
        super.B(drawable0);
        Animatable animatable0 = this.j;
        if(animatable0 != null) {
            animatable0.stop();
        }
        this.n(null);
        this.a(drawable0);
    }

    @Override  // com.bumptech.glide.request.target.p
    public void C(@NonNull Object object0, @Nullable f f0) {
        if(f0 != null && f0.a(object0, this)) {
            this.l(object0);
            return;
        }
        this.n(object0);
    }

    @Override  // com.bumptech.glide.request.target.r
    public void D(@Nullable Drawable drawable0) {
        super.D(drawable0);
        this.n(null);
        this.a(drawable0);
    }

    @Override  // com.bumptech.glide.request.target.b
    public void F(@Nullable Drawable drawable0) {
        super.F(drawable0);
        this.n(null);
        this.a(drawable0);
    }

    @Override  // com.bumptech.glide.request.transition.f$a
    public void a(Drawable drawable0) {
        ((ImageView)this.b).setImageDrawable(drawable0);
    }

    @Override  // com.bumptech.glide.request.transition.f$a
    @Nullable
    public Drawable b() {
        return ((ImageView)this.b).getDrawable();
    }

    private void l(@Nullable Object object0) {
        if(object0 instanceof Animatable) {
            this.j = (Animatable)object0;
            ((Animatable)object0).start();
            return;
        }
        this.j = null;
    }

    protected abstract void m(@Nullable Object arg1);

    private void n(@Nullable Object object0) {
        this.m(object0);
        this.l(object0);
    }

    @Override  // com.bumptech.glide.request.target.b
    public void onStart() {
        Animatable animatable0 = this.j;
        if(animatable0 != null) {
            animatable0.start();
        }
    }

    @Override  // com.bumptech.glide.request.target.b
    public void onStop() {
        Animatable animatable0 = this.j;
        if(animatable0 != null) {
            animatable0.stop();
        }
    }
}

