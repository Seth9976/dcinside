package rx.internal.util.unsafe;

public final class p {
    private p() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(int v) {
        return (v & v - 1) == 0;
    }

    public static int b(int v) {
        return 1 << 0x20 - Integer.numberOfLeadingZeros(v - 1);
    }
}

