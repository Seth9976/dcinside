package k2;

import com.google.firebase.h;
import com.google.firebase.installations.j;
import kotlin.jvm.internal.L;
import n2.b;
import y4.l;

public final class a {
    @l
    public static final j a(@l b b0) {
        L.p(b0, "<this>");
        j j0 = j.u();
        L.o(j0, "getInstance()");
        return j0;
    }

    @l
    public static final j b(@l b b0, @l h h0) {
        L.p(b0, "<this>");
        L.p(h0, "app");
        j j0 = j.v(h0);
        L.o(j0, "getInstance(app)");
        return j0;
    }
}

