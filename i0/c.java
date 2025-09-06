package I0;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import com.facebook.fresco.animation.backend.a;
import com.facebook.fresco.animation.backend.c.b;
import com.facebook.fresco.vito.options.g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import s3.e;
import y4.l;
import y4.m;

public final class c implements a, b {
    public static final class I0.c.a {
        private I0.c.a() {
        }

        public I0.c.a(w w0) {
        }
    }

    public interface I0.c.b {
        void a(@l c arg1, int arg2);

        void b(@l c arg1, int arg2, int arg3);

        void c(@l c arg1, int arg2);
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(s3.a.a)
    public @interface I0.c.c {
    }

    @l
    private static final Class A = null;
    @l
    private final com.facebook.imagepipeline.bitmaps.e c;
    @l
    private final d d;
    @l
    private final com.facebook.fresco.animation.backend.d e;
    @l
    private final I0.e f;
    private final boolean g;
    @m
    private final com.facebook.fresco.animation.bitmap.preparation.a h;
    @m
    private final com.facebook.fresco.animation.bitmap.preparation.b i;
    @m
    private final float[] j;
    @l
    private final Bitmap.Config k;
    @l
    private final Paint l;
    @m
    private Rect m;
    private int n;
    private int o;
    @l
    private final Path p;
    @l
    private final Matrix q;
    private int r;
    @m
    private I0.c.b s;
    @m
    private com.facebook.fresco.animation.backend.a.a t;
    @l
    public static final I0.c.a u = null;
    public static final int v = -1;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = 3;

    static {
        c.u = new I0.c.a(null);
        c.A = c.class;
    }

    public c(@l com.facebook.imagepipeline.bitmaps.e e0, @l d d0, @l com.facebook.fresco.animation.backend.d d1, @l I0.e e1, boolean z, @m com.facebook.fresco.animation.bitmap.preparation.a a0, @m com.facebook.fresco.animation.bitmap.preparation.b b0, @m g g0) {
        L.p(e0, "platformBitmapFactory");
        float[] arr_f;
        L.p(d0, "bitmapFrameCache");
        L.p(d1, "animationInformation");
        L.p(e1, "bitmapFrameRenderer");
        super();
        this.c = e0;
        this.d = d0;
        this.e = d1;
        this.f = e1;
        this.g = z;
        this.h = a0;
        this.i = b0;
        if(g0 == null) {
            arr_f = null;
        }
        else if(g0.r() == 0.0f) {
            arr_f = g0.q();
        }
        else {
            arr_f = new float[8];
            kotlin.collections.l.S1(arr_f, g0.r(), 0, 0, 6, null);
        }
        this.j = arr_f;
        this.k = Bitmap.Config.ARGB_8888;
        this.l = new Paint(6);
        this.p = new Path();
        this.q = new Matrix();
        this.r = -1;
        this.A();
    }

    public c(com.facebook.imagepipeline.bitmaps.e e0, d d0, com.facebook.fresco.animation.backend.d d1, I0.e e1, boolean z, com.facebook.fresco.animation.bitmap.preparation.a a0, com.facebook.fresco.animation.bitmap.preparation.b b0, g g0, int v, w w0) {
        this(e0, d0, d1, e1, z, a0, b0, ((v & 0x80) == 0 ? g0 : null));
    }

    private final void A() {
        int v = this.f.d();
        this.n = v;
        int v1 = -1;
        if(v == -1) {
            this.n = this.m == null ? -1 : this.m.width();
        }
        int v2 = this.f.e();
        this.o = v2;
        if(v2 == -1) {
            Rect rect0 = this.m;
            if(rect0 != null) {
                v1 = rect0.height();
            }
            this.o = v1;
        }
    }

    private final boolean B(int v, Bitmap bitmap0, float f, float f1) {
        if(this.j == null) {
            return false;
        }
        if(v == this.r) {
            return true;
        }
        BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)this.n), ((float)this.o));
        RectF rectF1 = new RectF(0.0f, 0.0f, f, f1);
        this.q.setRectToRect(rectF0, rectF1, Matrix.ScaleToFit.FILL);
        bitmapShader0.setLocalMatrix(this.q);
        this.l.setShader(bitmapShader0);
        RectF rectF2 = new RectF(0.0f, 0.0f, f, f1);
        this.p.addRoundRect(rectF2, this.j, Path.Direction.CW);
        this.r = v;
        return true;
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int a() {
        return this.e.a();
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int b() {
        return this.e.b();
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int c() {
        return this.e.c();
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void clear() {
        if(this.g) {
            com.facebook.fresco.animation.bitmap.preparation.a a0 = this.h;
            if(a0 != null) {
                a0.c();
            }
        }
        else {
            this.d.clear();
        }
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public int d() {
        return this.n;
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public int e() {
        return this.o;
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void f(@m Rect rect0) {
        this.m = rect0;
        this.f.f(rect0);
        this.A();
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void g(@m ColorFilter colorFilter0) {
        this.l.setColorFilter(colorFilter0);
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int h() {
        return this.e.h();
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void i(@m com.facebook.fresco.animation.backend.a.a a$a0) {
        this.t = a$a0;
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void j() {
        if(this.g) {
        label_8:
            com.facebook.fresco.animation.bitmap.preparation.a a2 = this.h;
            if(a2 != null) {
                a2.a(this.e.m(), this.e.h(), () -> {
                    L.p(this, "this$0");
                    com.facebook.fresco.animation.backend.a.a a$a0 = this.t;
                    if(a$a0 != null) {
                        a$a0.a();
                    }
                    return S0.a;
                });
            }
        }
        else {
            com.facebook.fresco.animation.bitmap.preparation.b b0 = this.i;
            if(b0 == null) {
                goto label_8;
            }
            else {
                com.facebook.fresco.animation.bitmap.preparation.a a0 = this.h;
                if(a0 != null) {
                    I0.a a1 = () -> {
                        L.p(this, "this$0");
                        com.facebook.fresco.animation.backend.a.a a$a0 = this.t;
                        if(a$a0 != null) {
                            a$a0.a();
                        }
                        return S0.a;
                    };
                    a0.d(b0, this.d, this, 0, a1);
                }
            }
        }
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int k(int v) {
        return this.e.k(v);
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void l(@IntRange(from = 0L, to = 0xFFL) int v) {
        this.l.setAlpha(v);
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int m() {
        return this.e.m();
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public boolean n(@l Drawable drawable0, @l Canvas canvas0, int v) {
        L.p(drawable0, "parent");
        L.p(canvas0, "canvas");
        I0.c.b c$b0 = this.s;
        if(c$b0 != null) {
            c$b0.c(this, v);
        }
        boolean z = this.t(canvas0, v, 0);
        if(!z) {
            I0.c.b c$b1 = this.s;
            if(c$b1 != null) {
                c$b1.a(this, v);
            }
        }
        if(!this.g) {
            com.facebook.fresco.animation.bitmap.preparation.b b0 = this.i;
            if(b0 != null) {
                com.facebook.fresco.animation.bitmap.preparation.a a0 = this.h;
                if(a0 != null) {
                    com.facebook.fresco.animation.bitmap.preparation.a.a.f(a0, b0, this.d, this, v, null, 16, null);
                }
            }
        }
        return z;
    }

    @Override  // com.facebook.fresco.animation.backend.c$b
    public void o() {
        if(this.g) {
            com.facebook.fresco.animation.bitmap.preparation.a a0 = this.h;
            if(a0 != null) {
                a0.onStop();
            }
        }
        else {
            this.clear();
        }
    }

    private final void r(int v, Bitmap bitmap0, Canvas canvas0) {
        Rect rect0 = this.m;
        if(rect0 == null) {
            canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, this.l);
            return;
        }
        if(this.B(v, bitmap0, ((float)rect0.width()), ((float)rect0.height()))) {
            canvas0.drawPath(this.p, this.l);
            return;
        }
        canvas0.drawBitmap(bitmap0, null, rect0, this.l);
    }

    private final boolean s(int v, com.facebook.common.references.a a0, Canvas canvas0, int v1) {
        if(a0 != null && com.facebook.common.references.a.s(a0)) {
            Object object0 = a0.n();
            L.o(object0, "get(...)");
            this.r(v, ((Bitmap)object0), canvas0);
            if(v1 != 3 && !this.g) {
                this.d.B(v, a0, v1);
            }
            I0.c.b c$b0 = this.s;
            if(c$b0 != null) {
                c$b0.b(this, v, v1);
            }
            return true;
        }
        return false;
    }

    private final boolean t(Canvas canvas0, int v, int v1) {
        boolean z1;
        com.facebook.common.references.a a1;
        int v2;
        boolean z;
        com.facebook.common.references.a a0 = null;
        try {
            z = false;
            v2 = 1;
            if(this.g) {
                a1 = this.h == null ? null : this.h.b(v, canvas0.getWidth(), canvas0.getHeight());
                goto label_5;
            }
            goto label_20;
        }
        catch(Throwable throwable0) {
            com.facebook.common.references.a.j(a0);
            throw throwable0;
        }
        try {
        label_5:
            if(a1 != null && a1.q()) {
                Object object0 = a1.n();
                L.o(object0, "get(...)");
                this.r(v, ((Bitmap)object0), canvas0);
                goto label_9;
            }
            goto label_11;
        }
        catch(Throwable throwable0) {
            a0 = a1;
            com.facebook.common.references.a.j(a0);
            throw throwable0;
        }
    label_9:
        com.facebook.common.references.a.j(a1);
        return true;
    label_11:
        com.facebook.fresco.animation.bitmap.preparation.a a2 = this.h;
        if(a2 == null) {
        label_18:
            com.facebook.common.references.a.j(a1);
            return false;
            try {
            label_20:
                switch(v1) {
                    case 0: {
                        a0 = this.d.E(v);
                        z1 = this.s(v, a0, canvas0, 0);
                        goto label_50;
                    }
                    case 1: {
                        goto label_26;
                    }
                    case 2: {
                        a0 = this.c.e(this.n, this.o, this.k);
                        goto label_38;
                    }
                    case 3: {
                        a0 = this.d.C(v);
                        z1 = this.s(v, a0, canvas0, 3);
                        v2 = -1;
                        goto label_50;
                    }
                }
            }
            catch(Throwable throwable0) {
                com.facebook.common.references.a.j(a0);
                throw throwable0;
            }
            com.facebook.common.references.a.j(null);
            return false;
            try {
                a0 = this.d.E(v);
                z1 = this.s(v, a0, canvas0, 0);
                goto label_50;
            label_26:
                a0 = this.d.I(v, this.n, this.o);
                if(this.x(v, a0) && this.s(v, a0, canvas0, 1)) {
                    z = true;
                }
                z1 = z;
                v2 = 2;
                goto label_50;
            }
            catch(Throwable throwable0) {
                com.facebook.common.references.a.j(a0);
                throw throwable0;
            }
            com.facebook.common.references.a.j(null);
            return false;
            try {
            label_38:
                if(this.x(v, a0) && this.s(v, a0, canvas0, 2)) {
                    z = true;
                }
                z1 = z;
                v2 = 3;
                goto label_50;
            }
            catch(Throwable throwable0) {
            }
        }
        else {
            try {
                a2.a(canvas0.getWidth(), canvas0.getHeight(), null);
                goto label_18;
            }
            catch(Throwable throwable0) {
                a0 = a1;
            }
        }
        com.facebook.common.references.a.j(a0);
        throw throwable0;
    label_50:
        com.facebook.common.references.a.j(a0);
        return z1 || v2 == -1 ? z1 : this.t(canvas0, v, v2);
    }

    @m
    public final float[] u() {
        return this.j;
    }

    // 检测为 Lambda 实现
    private static final S0 v(c c0) [...]

    // 检测为 Lambda 实现
    private static final S0 w(c c0) [...]

    private final boolean x(int v, com.facebook.common.references.a a0) {
        if(a0 != null && a0.q()) {
            Object object0 = a0.n();
            L.o(object0, "get(...)");
            boolean z = this.f.g(v, ((Bitmap)object0));
            if(!z) {
                com.facebook.common.references.a.j(a0);
            }
            return z;
        }
        return false;
    }

    public final void y(@m I0.c.b c$b0) {
        this.s = c$b0;
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public int z() {
        return this.d.z();
    }
}

