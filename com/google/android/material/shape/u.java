package com.google.android.material.shape;

import D1.a.a;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public abstract class u {
    boolean a;
    boolean b;
    @Nullable
    p c;
    RectF d;
    final Path e;

    public u() {
        this.a = false;
        this.b = false;
        this.d = new RectF();
        this.e = new Path();
    }

    @NonNull
    public static u a(@NonNull View view0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            return new x(view0);
        }
        return v >= 22 ? new w(view0) : new v();
    }

    abstract void b(@NonNull View arg1);

    public boolean c() {
        return this.a;
    }

    private boolean d() {
        return this.d.left <= this.d.right && this.d.top <= this.d.bottom;
    }

    public void e(@NonNull Canvas canvas0, @NonNull a a$a0) {
        if(this.j() && !this.e.isEmpty()) {
            canvas0.save();
            canvas0.clipPath(this.e);
            a$a0.a(canvas0);
            canvas0.restore();
            return;
        }
        a$a0.a(canvas0);
    }

    public void f(@NonNull View view0, @NonNull RectF rectF0) {
        this.d = rectF0;
        this.k();
        this.b(view0);
    }

    public void g(@NonNull View view0, @NonNull p p0) {
        this.c = p0;
        this.k();
        this.b(view0);
    }

    public void h(@NonNull View view0, boolean z) {
        if(z != this.a) {
            this.a = z;
            this.b(view0);
        }
    }

    public void i(@NonNull View view0, boolean z) {
        this.b = z;
        this.b(view0);
    }

    abstract boolean j();

    private void k() {
        if(this.d() && this.c != null) {
            q.k().d(this.c, 1.0f, this.d, this.e);
        }
    }
}

