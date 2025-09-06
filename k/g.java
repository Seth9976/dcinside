package k;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.core.graphics.ColorUtils;
import codes.side.andcolorpicker.model.e.b;
import codes.side.andcolorpicker.model.e;
import kotlin.jvm.internal.L;
import y4.l;

public final class g implements a {
    private final float[] a;
    private final float[] b;
    private final float[] c;

    public g() {
        this.a = new float[3];
        this.b = new float[3];
        this.c = new float[3];
    }

    @Override  // k.a
    public int a(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        if(!(a0 instanceof e)) {
            throw new IllegalArgumentException("Unsupported color type supplied");
        }
        this.b[b.d.b()] = ((e)a0).g();
        this.b[b.e.b()] = b.e.e();
        this.b[b.f.b()] = b.f.e();
        return ColorUtils.a(this.b);
    }

    @Override  // k.a
    public int b(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        if(!(a0 instanceof e)) {
            throw new IllegalArgumentException("Unsupported color type supplied");
        }
        return ColorUtils.D(this.c(a0), ((e)a0).k());
    }

    @Override  // k.a
    public int c(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        if(!(a0 instanceof e)) {
            throw new IllegalArgumentException("Unsupported color type supplied");
        }
        this.a[b.d.b()] = ((e)a0).g();
        this.a[b.e.b()] = ((e)a0).j();
        this.a[b.f.b()] = ((e)a0).h();
        return ColorUtils.a(this.a);
    }

    @Override  // k.a
    public void d(@l codes.side.andcolorpicker.model.a a0, int v) {
        L.p(a0, "color");
        if(!(a0 instanceof e)) {
            throw new IllegalArgumentException("Unsupported color type supplied");
        }
        float[] arr_f = new float[3];
        ColorUtils.q(v, arr_f);
        ((e)a0).a(new int[]{((int)arr_f[b.d.b()]), ((int)(arr_f[b.e.b()] * 100.0f)), ((int)(arr_f[b.f.b()] * 100.0f)), Color.alpha(v)});
    }

    @ColorInt
    public final int e(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        if(!(a0 instanceof e)) {
            throw new IllegalArgumentException("Unsupported color type supplied");
        }
        this.c[b.d.b()] = ((e)a0).g();
        this.c[b.e.b()] = ((e)a0).j();
        this.c[b.f.b()] = b.f.e();
        return ColorUtils.a(this.c);
    }
}

