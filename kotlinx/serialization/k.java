package kotlinx.serialization;

import java.util.List;
import kotlin.b0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@f
public final class k extends v {
    @l
    private final List a;

    @b0
    public k(@l String s) {
        L.p(s, "missingField");
        this(u.k(s), "Field \'" + s + "\' is required, but it was missing", null);
    }

    public k(@l String s, @l String s1) {
        L.p(s, "missingField");
        L.p(s1, "serialName");
        this(u.k(s), "Field \'" + s + "\' is required for type with serial name \'" + s1 + "\', but it was missing", null);
    }

    public k(@l List list0, @l String s) {
        L.p(list0, "missingFields");
        L.p(s, "serialName");
        this(list0, (list0.size() == 1 ? "Field \'" + ((String)list0.get(0)) + "\' is required for type with serial name \'" + s + "\', but it was missing" : "Fields " + list0 + " are required for type with serial name \'" + s + "\', but they were missing"), null);
    }

    public k(@l List list0, @m String s, @m Throwable throwable0) {
        L.p(list0, "missingFields");
        super(s, throwable0);
        this.a = list0;
    }

    @l
    public final List a() {
        return this.a;
    }
}

