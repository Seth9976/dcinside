package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public abstract class Utf8 {
    static class DecodeUtil {
        static void a(byte b, byte b1, byte b2, byte b3, char[] arr_c, int v) throws IllegalArgumentException {
            if(DecodeUtil.f(b1) || (b << 28) + (b1 + 0x70) >> 30 != 0 || DecodeUtil.f(b2) || DecodeUtil.f(b3)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int v1 = (b & 7) << 18 | (b1 & 0x3F) << 12 | (b2 & 0x3F) << 6 | b3 & 0x3F;
            arr_c[v] = (char)((v1 >>> 10) + 0xD7C0);
            arr_c[v + 1] = (char)((v1 & 0x3FF) + 0xDC00);
        }

        static void b(byte b, char[] arr_c, int v) {
            arr_c[v] = (char)b;
        }

        static void c(byte b, byte b1, byte b2, char[] arr_c, int v) throws IllegalArgumentException {
            if(DecodeUtil.f(b1) || b == 0xFFFFFFE0 && b1 < 0xFFFFFFA0 || b == -19 && b1 >= 0xFFFFFFA0 || DecodeUtil.f(b2)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            arr_c[v] = (char)((b & 15) << 12 | (b1 & 0x3F) << 6 | b2 & 0x3F);
        }

        static void d(byte b, byte b1, char[] arr_c, int v) throws IllegalArgumentException {
            if(b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if(DecodeUtil.f(b1)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            arr_c[v] = (char)((b & 0x1F) << 6 | b1 & 0x3F);
        }

        private static char e(int v) [...] // Inlined contents

        private static boolean f(byte b) {
            return b > -65;
        }

        static boolean g(byte b) {
            return b >= 0;
        }

        static boolean h(byte b) {
            return b < -16;
        }

        static boolean i(byte b) {
            return b < 0xFFFFFFE0;
        }

        private static char j(int v) [...] // Inlined contents

        private static int k(byte b) [...] // Inlined contents
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int v, int v1) {
            super("Unpaired surrogate at index " + v + " of " + v1);
        }
    }

    private static Utf8 a;

    public abstract String a(ByteBuffer arg1, int arg2, int arg3);

    public abstract void b(CharSequence arg1, ByteBuffer arg2);

    public abstract int c(CharSequence arg1);

    public static Utf8 d() {
        if(Utf8.a == null) {
            Utf8.a = new Utf8Safe();
        }
        return Utf8.a;
    }

    public static void e(Utf8 utf80) {
        Utf8.a = utf80;
    }
}

