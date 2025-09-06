package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import y4.l;

@k
public final class d {
    @l
    private final List a;

    @b0
    public d() {
        this.a = new ArrayList();
    }

    public final boolean a(@l kotlinx.serialization.json.l l0) {
        L.p(l0, "element");
        this.a.add(l0);
        return true;
    }

    @b0
    @l
    public final c b() {
        return new c(this.a);
    }
}

