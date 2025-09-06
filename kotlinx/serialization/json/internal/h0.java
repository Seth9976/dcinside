package kotlinx.serialization.json.internal;

import P3.a;
import java.util.Set;
import kotlin.D0;
import kotlin.H0;
import kotlin.N0;
import kotlin.collections.k0;
import kotlin.jvm.internal.L;
import kotlin.z0;
import kotlinx.serialization.descriptors.f;
import y4.l;

public final class h0 {
    @l
    private static final Set a;

    static {
        h0.a = k0.u(new f[]{a.x(D0.b).getDescriptor(), a.y(H0.b).getDescriptor(), a.w(z0.b).getDescriptor(), a.z(N0.b).getDescriptor()});
    }

    private static void a() {
    }

    public static final boolean b(@l f f0) {
        L.p(f0, "<this>");
        return f0.isInline() && h0.a.contains(f0);
    }
}

