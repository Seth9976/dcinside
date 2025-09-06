package kotlinx.serialization.json;

import kotlin.jvm.internal.L;
import kotlinx.serialization.json.internal.a0;
import kotlinx.serialization.modules.f;
import y4.l;

final class r extends b {
    public r(@l h h0, @l f f0) {
        L.p(h0, "configuration");
        L.p(f0, "module");
        super(h0, f0, null);
        this.l();
    }

    private final void l() {
        if(L.g(this.a(), kotlinx.serialization.modules.h.a())) {
            return;
        }
        this.a().a(new a0(this.h().m(), "type"));
    }
}

