package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.h;
import kotlinx.serialization.k;
import y4.l;

public final class v0 {
    @h
    public static final void a(@l int[] arr_v, @l int[] arr_v1, @l f f0) {
        L.p(arr_v, "seenArray");
        L.p(arr_v1, "goldenMaskArray");
        L.p(f0, "descriptor");
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_v1.length; ++v) {
            int v1 = arr_v1[v] & ~arr_v[v];
            if(v1 != 0) {
                for(int v2 = 0; v2 < 0x20; ++v2) {
                    if((v1 & 1) != 0) {
                        arrayList0.add(f0.f(v * 0x20 + v2));
                    }
                    v1 >>>= 1;
                }
            }
        }
        throw new k(arrayList0, f0.h());
    }

    @h
    public static final void b(int v, int v1, @l f f0) {
        L.p(f0, "descriptor");
        ArrayList arrayList0 = new ArrayList();
        int v2 = ~v & v1;
        for(int v3 = 0; v3 < 0x20; ++v3) {
            if((v2 & 1) != 0) {
                arrayList0.add(f0.f(v3));
            }
            v2 >>>= 1;
        }
        throw new k(arrayList0, f0.h());
    }
}

