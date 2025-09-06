package kotlin;

public final class x0 {
    public static long a(long v, long v1) {
        if(v1 < 0L) {
            return (v ^ 0x8000000000000000L) >= (v1 ^ 0x8000000000000000L) ? 1L : 0L;
        }
        if(v >= 0L) {
            return v / v1;
        }
        int v2 = 1;
        long v3 = (v >>> 1) / v1 << 1;
        if((v - v3 * v1 ^ 0x8000000000000000L) < (v1 ^ 0x8000000000000000L)) {
            v2 = 0;
        }
        return v3 + ((long)v2);
    }
}

