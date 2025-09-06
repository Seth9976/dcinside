package com.facebook.drawee.generic;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.drawee.drawable.h;
import com.facebook.drawee.drawable.w;
import com.facebook.drawee.drawable.x;
import k1.n.a;
import k1.n;

@n(a.a)
public class d extends h implements w {
    @VisibleForTesting
    @o3.h
    Drawable e;
    @o3.h
    private x f;

    public d(Drawable drawable0) {
        super(drawable0);
        this.e = null;
    }

    public void A(@o3.h Drawable drawable0) {
        this.e = drawable0;
        this.invalidateSelf();
    }

    @Override  // com.facebook.drawee.drawable.h
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas0) {
        if(!this.isVisible()) {
            return;
        }
        x x0 = this.f;
        if(x0 != null) {
            x0.onDraw();
        }
        super.draw(canvas0);
        Drawable drawable0 = this.e;
        if(drawable0 != null) {
            drawable0.setBounds(this.getBounds());
            this.e.draw(canvas0);
        }
    }

    @Override  // com.facebook.drawee.drawable.h
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override  // com.facebook.drawee.drawable.h
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override  // com.facebook.drawee.drawable.h
    public boolean setVisible(boolean z, boolean z1) {
        x x0 = this.f;
        if(x0 != null) {
            x0.i(z);
        }
        return super.setVisible(z, z1);
    }

    @Override  // com.facebook.drawee.drawable.w
    public void t(@o3.h x x0) {
        this.f = x0;
    }
}

