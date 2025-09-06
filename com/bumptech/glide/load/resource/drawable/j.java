package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.resource.gif.c;
import com.bumptech.glide.util.m;

public abstract class j implements r, v {
    protected final Drawable a;

    public j(Drawable drawable0) {
        this.a = (Drawable)m.e(drawable0);
    }

    @NonNull
    public final Drawable b() {
        Drawable.ConstantState drawable$ConstantState0 = this.a.getConstantState();
        return drawable$ConstantState0 == null ? this.a : drawable$ConstantState0.newDrawable();
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Object get() {
        return this.b();
    }

    @Override  // com.bumptech.glide.load.engine.r
    public void initialize() {
        Drawable drawable0 = this.a;
        if(drawable0 instanceof BitmapDrawable) {
            ((BitmapDrawable)drawable0).getBitmap().prepareToDraw();
            return;
        }
        if(drawable0 instanceof c) {
            ((c)drawable0).h().prepareToDraw();
        }
    }
}

