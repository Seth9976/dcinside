package kotlin;

public final class w0 {
    public static long a(long v, long v1) {
        if(v1 < 0L) {
            return (v ^ 0x8000000000000000L) >= (0x8000000000000000L ^ v1) ? v - v1 : v;
        }
        if(v >= 0L) {
            return v % v1;
        }
        long v2 = v - ((v >>> 1) / v1 << 1) * v1;
        if((v2 ^ 0x8000000000000000L) < (0x8000000000000000L ^ v1)) {
            v1 = 0L;
        }
        return v2 - v1;
    }
}

