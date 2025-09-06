package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.k;
import com.facebook.imagepipeline.image.e;
import com.facebook.imagepipeline.image.g;
import com.facebook.imagepipeline.systrace.b;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class com.facebook.drawee.backends.pipeline.a implements c1.a {
    private final Resources a;
    @h
    private final c1.a b;
    @h
    private final c1.a c;

    public com.facebook.drawee.backends.pipeline.a(Resources resources0, @h c1.a a0) {
        this(resources0, a0, null);
    }

    public com.facebook.drawee.backends.pipeline.a(Resources resources0, @h c1.a a0, @h c1.a a1) {
        this.a = resources0;
        this.b = a0;
        this.c = a1;
    }

    private static boolean a(g g0) {
        switch(g0.A0()) {
            case 0: 
            case 1: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    @Override  // c1.a
    @h
    public Drawable b(e e0) {
        Drawable drawable3;
        Drawable drawable2;
        Drawable drawable1;
        Drawable drawable0;
        try {
            if(b.e()) {
                b.a("DefaultDrawableFactory#createDrawable");
            }
            if(!(e0 instanceof g)) {
                if(this.b != null && this.b.c(e0)) {
                    drawable0 = this.b.b(e0);
                    goto label_5;
                }
                goto label_8;
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
            goto label_22;
        }
    label_5:
        if(b.e()) {
            b.c();
        }
        return drawable0;
        try {
        label_8:
            if(this.c != null && this.c.c(e0)) {
                drawable1 = this.c.b(e0);
                goto label_10;
            }
            goto label_13;
        }
        catch(Throwable throwable0) {
            goto label_22;
        }
    label_10:
        if(b.e()) {
            b.c();
        }
        return drawable1;
    label_13:
        if(b.e()) {
            b.c();
        }
        return null;
        try {
        label_16:
            Bitmap bitmap0 = ((g)e0).D3();
            drawable2 = new BitmapDrawable(this.a, bitmap0);
            if(com.facebook.drawee.backends.pipeline.a.d(((g)e0)) || com.facebook.drawee.backends.pipeline.a.a(((g)e0))) {
                drawable3 = new k(drawable2, ((g)e0).k3(), ((g)e0).A0());
                goto label_25;
            }
            goto label_28;
        }
        catch(Throwable throwable0) {
        }
    label_22:
        if(b.e()) {
            b.c();
        }
        throw throwable0;
    label_25:
        if(b.e()) {
            b.c();
        }
        return drawable3;
    label_28:
        if(b.e()) {
            b.c();
        }
        return drawable2;
    }

    @Override  // c1.a
    public boolean c(e e0) {
        return true;
    }

    private static boolean d(g g0) {
        switch(g0.k3()) {
            case -1: 
            case 0: {
                return false;
            }
            default: {
                return true;
            }
        }
    }
}

