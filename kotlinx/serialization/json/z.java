package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@k
public final class z {
    @l
    private final Map a;

    @b0
    public z() {
        this.a = new LinkedHashMap();
    }

    @b0
    @l
    public final y a() {
        return new y(this.a);
    }

    @m
    public final kotlinx.serialization.json.l b(@l String s, @l kotlinx.serialization.json.l l0) {
        L.p(s, "key");
        L.p(l0, "element");
        return (kotlinx.serialization.json.l)this.a.put(s, l0);
    }
}

