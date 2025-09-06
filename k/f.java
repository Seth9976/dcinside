package k;

import android.graphics.Color;
import codes.side.andcolorpicker.model.c;
import kotlin.K;
import kotlin.jvm.internal.L;
import y4.l;

public final class f implements a {
    @Override  // k.a
    public int a(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        throw new K("An operation is not implemented: Not yet implemented");
    }

    @Override  // k.a
    public int b(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        if(!(a0 instanceof c)) {
            throw new IllegalArgumentException("Unsupported color type supplied");
        }
        return Color.rgb(((int)((1.0f - ((c)a0).g()) * 255.0f * (1.0f - ((c)a0).h()))), ((int)((1.0f - ((c)a0).j()) * 255.0f * (1.0f - ((c)a0).h()))), ((int)((1.0f - ((c)a0).k()) * 255.0f * (1.0f - ((c)a0).h()))));
    }

    @Override  // k.a
    public int c(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        throw new K("An operation is not implemented: Not yet implemented");
    }

    @Override  // k.a
    public void d(@l codes.side.andcolorpicker.model.a a0, int v) {
        L.p(a0, "color");
        if(!(a0 instanceof c)) {
            throw new IllegalArgumentException("Unsupported color type supplied");
        }
        float f = ((float)Color.red(v)) / 255.0f;
        float f1 = ((float)Color.green(v)) / 255.0f;
        float f2 = ((float)Color.blue(v)) / 255.0f;
        Float float0 = kotlin.collections.l.Nk(new Float[]{f, f1, f2});
        if(float0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        float f3 = float0.floatValue();
        float f4 = 1.0f - (1.0f - f3);
        ((c)a0).a(new int[]{((int)((1.0f - f - (1.0f - f3)) / f4 * 100.0f)), ((int)((1.0f - f1 - (1.0f - f3)) / f4 * 100.0f)), ((int)((1.0f - f2 - (1.0f - f3)) / f4 * 100.0f)), ((int)((1.0f - f3) * 100.0f))});
    }
}

