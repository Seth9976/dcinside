package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;

public class ColorProtection extends Protection {
    private final ColorDrawable r;
    private boolean s;
    @ColorInt
    private int t;

    public ColorProtection(int v) {
        super(v);
        this.r = new ColorDrawable();
        this.t = 0;
    }

    public ColorProtection(int v, @ColorInt int v1) {
        this(v);
        this.E(v1);
    }

    @ColorInt
    public int D() {
        return this.t;
    }

    public void E(@ColorInt int v) {
        this.s = true;
        this.F(v);
    }

    private void F(@ColorInt int v) {
        if(this.t != v) {
            this.t = v;
            this.r.setColor(v);
            this.u(this.r);
        }
    }

    @Override  // androidx.core.view.insets.Protection
    void g(@ColorInt int v) {
        if(!this.s) {
            this.F(v);
        }
    }

    @Override  // androidx.core.view.insets.Protection
    boolean q() {
        return true;
    }
}

