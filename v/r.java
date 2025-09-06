package V;

import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;

public final class r {
    @c("key")
    @l
    private final String a;
    @c("value")
    @l
    private final Map b;

    public r(@l String s, @l Map map0) {
        L.p(s, "key");
        L.p(map0, "value");
        super();
        this.a = s;
        this.b = map0;
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final Map b() {
        return this.b;
    }
}

