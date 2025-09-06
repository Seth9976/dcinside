package k;

import androidx.core.graphics.ColorUtils;
import codes.side.andcolorpicker.model.f;
import kotlin.K;
import kotlin.jvm.internal.L;
import y4.l;

public final class h implements a {
    @Override  // k.a
    public int a(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        throw new K("An operation is not implemented: Not yet implemented");
    }

    @Override  // k.a
    public int b(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        if(!(a0 instanceof f)) {
            throw new IllegalArgumentException("Unsupported color type supplied");
        }
        return ColorUtils.b(((f)a0).k(), ((f)a0).g(), ((f)a0).j());
    }

    @Override  // k.a
    public int c(@l codes.side.andcolorpicker.model.a a0) {
        L.p(a0, "color");
        throw new K("An operation is not implemented: Not yet implemented");
    }

    @Override  // k.a
    public void d(@l codes.side.andcolorpicker.model.a a0, int v) {
        L.p(a0, "color");
        if(a0 instanceof f) {
            throw new K("An operation is not implemented: Not yet implemented");
        }
        throw new IllegalArgumentException("Unsupported color type supplied");
    }
}

