package k;

import android.graphics.Color;
import codes.side.andcolorpicker.model.h;
import kotlin.K;
import kotlin.jvm.internal.L;
import y4.l;

public final class i implements a {
    @Override  // k.a
    public int a(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        throw new K("An operation is not implemented: Not yet implemented");
    }

    @Override  // k.a
    public int b(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        if(!(a0 instanceof h)) {
            throw new IllegalArgumentException("Unsupported color type supplied");
        }
        return Color.argb(((h)a0).k(), ((h)a0).n(), ((h)a0).m(), ((h)a0).l());
    }

    @Override  // k.a
    public int c(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        throw new K("An operation is not implemented: Not yet implemented");
    }

    @Override  // k.a
    public void d(@l codes.side.andcolorpicker.model.a a0, int v) {
        L.p(a0, "color");
        if(!(a0 instanceof h)) {
            throw new IllegalArgumentException("Unsupported color type supplied");
        }
        ((h)a0).a(new int[]{Color.alpha(v), Color.red(v), Color.green(v), Color.blue(v)});
    }
}

