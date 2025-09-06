package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

@RequiresApi(22)
class w extends u {
    private boolean f;
    private float g;

    w(@NonNull View view0) {
        this.f = false;
        this.g = 0.0f;
        this.o(view0);
    }

    @Override  // com.google.android.material.shape.u
    void b(@NonNull View view0) {
        this.g = this.n();
        this.f = this.p() || this.q();
        view0.setClipToOutline(!this.j());
        if(this.j()) {
            view0.invalidate();
            return;
        }
        view0.invalidateOutline();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.shape.u
    boolean j() {
        return !this.f || this.a;
    }

    @VisibleForTesting
    float m() {
        return this.g;
    }

    private float n() {
        p p0 = this.c;
        if(p0 != null) {
            return this.d == null ? 0.0f : p0.f.a(this.d);
        }
        return 0.0f;
    }

    @DoNotInline
    private void o(View view0) {
        class a extends ViewOutlineProvider {
            final w a;

            @Override  // android.view.ViewOutlineProvider
            public void getOutline(View view0, Outline outline0) {
                if(w.this.c != null && !w.this.d.isEmpty()) {
                    outline0.setRoundRect(((int)w.this.d.left), ((int)w.this.d.top), ((int)w.this.d.right), ((int)w.this.d.bottom), w.this.g);
                }
            }
        }

        view0.setOutlineProvider(new a(this));
    }

    private boolean p() {
        if(!this.d.isEmpty()) {
            return this.c == null ? false : this.c.u(this.d);
        }
        return false;
    }

    private boolean q() {
        if(!this.d.isEmpty() && (this.c != null && this.b && !this.c.u(this.d) && w.r(this.c))) {
            float f = this.c.r().a(this.d);
            float f1 = this.c.t().a(this.d);
            float f2 = this.c.j().a(this.d);
            float f3 = this.c.l().a(this.d);
            int v = Float.compare(f, 0.0f);
            if(v == 0 && f2 == 0.0f && f1 == f3) {
                this.d.set(this.d.left - f1, this.d.top, this.d.right, this.d.bottom);
                this.g = f1;
                return true;
            }
            if(v == 0 && f1 == 0.0f && f2 == f3) {
                this.d.set(this.d.left, this.d.top - f2, this.d.right, this.d.bottom);
                this.g = f2;
                return true;
            }
            if(f1 == 0.0f && f3 == 0.0f && f == f2) {
                this.d.set(this.d.left, this.d.top, this.d.right + f, this.d.bottom);
                this.g = f;
                return true;
            }
            if(f2 == 0.0f && f3 == 0.0f && f == f1) {
                this.d.set(this.d.left, this.d.top, this.d.right, this.d.bottom + f);
                this.g = f;
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(40)
    private static boolean r(p p0) {
        return p0.q() instanceof o && p0.s() instanceof o && p0.i() instanceof o && p0.k() instanceof o;
    }
}

