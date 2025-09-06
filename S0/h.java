package S0;

import kotlin.jvm.internal.L;
import y4.l;

public class h implements j {
    @l
    private final g a;

    public h(@l g g0) {
        L.p(g0, "perfDataListener");
        super();
        this.a = g0;
    }

    @Override  // S0.j
    public void a(@l S0.l l0, @l e e0) {
        L.p(l0, "state");
        L.p(e0, "imageLoadStatus");
        f f0 = l0.l0();
        this.a.b(f0, e0);
    }

    @Override  // S0.j
    public void b(@l S0.l l0, @l v v0) {
        L.p(l0, "state");
        L.p(v0, "visibilityState");
        f f0 = l0.l0();
        this.a.a(f0, v0);
    }
}

