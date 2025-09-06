package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path.Op;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;

class j {
    private final Path a;
    private final Path b;
    private final Path c;
    private final q d;
    private p e;

    j() {
        this.a = new Path();
        this.b = new Path();
        this.c = new Path();
        this.d = q.k();
    }

    void a(Canvas canvas0) {
        if(Build.VERSION.SDK_INT >= 23) {
            canvas0.clipPath(this.a);
            return;
        }
        canvas0.clipPath(this.b);
        canvas0.clipPath(this.c, Region.Op.UNION);
    }

    void b(float f, p p0, p p1, RectF rectF0, RectF rectF1, RectF rectF2, e l$e0) {
        p p2 = v.q(p0, p1, rectF0, rectF2, l$e0.d(), l$e0.c(), f);
        this.e = p2;
        this.d.d(p2, 1.0f, rectF1, this.b);
        this.d.d(this.e, 1.0f, rectF2, this.c);
        if(Build.VERSION.SDK_INT >= 23) {
            this.a.op(this.b, this.c, Path.Op.UNION);
        }
    }

    p c() {
        return this.e;
    }

    Path d() {
        return this.a;
    }
}

