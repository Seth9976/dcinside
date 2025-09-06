package javassist.bytecode;

public class g {
    static void a(byte[] arr_b, int v, byte[] arr_b1, int v1) {
        arr_b1[v1] = arr_b[v];
        arr_b1[v1 + 1] = arr_b[v + 1];
        arr_b1[v1 + 2] = arr_b[v + 2];
        arr_b1[v1 + 3] = arr_b[v + 3];
    }

    public static int b(byte[] arr_b, int v) {
        return arr_b[v + 3] & 0xFF | (arr_b[v] << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }

    public static int c(byte[] arr_b, int v) {
        return arr_b[v + 1] & 0xFF | arr_b[v] << 8;
    }

    public static int d(byte[] arr_b, int v) {
        return arr_b[v + 1] & 0xFF | (arr_b[v] & 0xFF) << 8;
    }

    public static void e(int v, byte[] arr_b, int v1) {
        arr_b[v1] = (byte)(v >>> 8);
        arr_b[v1 + 1] = (byte)v;
    }

    public static void f(int v, byte[] arr_b, int v1) {
        arr_b[v1] = (byte)(v >>> 24);
        arr_b[v1 + 1] = (byte)(v >>> 16);
        arr_b[v1 + 2] = (byte)(v >>> 8);
        arr_b[v1 + 3] = (byte)v;
    }
}

