package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.L;
import y4.l;

public final class SnapshotIdSetKt {
    public static final int b(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        int v1 = arr_v.length - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            int v4 = arr_v[v3];
            if(v > v4) {
                v2 = v3 + 1;
                continue;
            }
            if(v < v4) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }

    private static final int c(long v) {
        int v1;
        if((0xFFFFFFFFL & v) == 0L) {
            v1 = 0x20;
            v >>= 0x20;
        }
        else {
            v1 = 0;
        }
        if((0xFFFFL & v) == 0L) {
            v1 += 16;
            v >>= 16;
        }
        if((0xFFL & v) == 0L) {
            v1 += 8;
            v >>= 8;
        }
        if((15L & v) == 0L) {
            v1 += 4;
            v >>= 4;
        }
        if((1L & v) != 0L) {
            return v1;
        }
        if((2L & v) != 0L) {
            return v1 + 1;
        }
        if((4L & v) != 0L) {
            return v1 + 2;
        }
        return (v & 8L) == 0L ? -1 : v1 + 3;
    }
}

