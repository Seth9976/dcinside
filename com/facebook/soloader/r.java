package com.facebook.soloader;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

public final class r {
    @g
    public static class a extends UnsatisfiedLinkError {
        a(String s) {
            super(s);
        }
    }

    public interface b {
        public static final String a = "x86";
        public static final String b = "armeabi-v7a";
        public static final String c = "x86_64";
        public static final String d = "arm64-v8a";

    }

    private static final String a = "MinElf";
    public static final int b = 0x464C457F;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 5;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 0xFFFF;

    // 去混淆评级： 低(20)
    public static String[] a(j j0) throws IOException {
        return j0 instanceof k ? r.d(((k)j0)) : r.c(j0);
    }

    public static String[] b(File file0) throws IOException {
        try(k k0 = new k(file0)) {
            return r.a(k0);
        }
    }

    private static String[] c(j j0) throws IOException {
        long v17;
        long v16;
        long v14;
        long v7;
        boolean z = true;
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        long v = r.h(j0, byteBuffer0, 0L);
        if(v != 0x464C457FL) {
            throw new a("file is not ELF: magic is 0x" + Long.toHexString(v) + ", it should be " + "464c457f");
        }
        if(r.i(j0, byteBuffer0, 4L) != 1) {
            z = false;
        }
        if(r.i(j0, byteBuffer0, 5L) == 2) {
            byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        }
        long v1 = z ? r.h(j0, byteBuffer0, 28L) : r.e(j0, byteBuffer0, 0x20L);
        long v2 = z ? ((long)r.g(j0, byteBuffer0, 44L)) : ((long)r.g(j0, byteBuffer0, 56L));
        int v3 = r.g(j0, byteBuffer0, (z ? 42L : 54L));
        if(v2 == 0xFFFFL) {
            long v4 = z ? r.h(j0, byteBuffer0, 0x20L) : r.e(j0, byteBuffer0, 40L);
            v2 = z ? r.h(j0, byteBuffer0, v4 + 28L) : r.h(j0, byteBuffer0, v4 + 44L);
        }
        long v5 = v1;
        for(long v6 = 0L; true; ++v6) {
            v7 = 0L;
            if(v6 >= v2) {
                break;
            }
            if(r.h(j0, byteBuffer0, v5) == 2L) {
                if(z) {
                    v7 = r.h(j0, byteBuffer0, v5 + 4L);
                    break;
                }
                v7 = r.e(j0, byteBuffer0, v5 + 8L);
                break;
            }
            v5 += (long)v3;
        }
        if(v7 == 0L) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long v8 = v7;
        int v9 = 0;
        long v10 = 0L;
        do {
            long v11 = z ? r.h(j0, byteBuffer0, v8) : r.e(j0, byteBuffer0, v8);
            if(v11 == 1L) {
                if(v9 == 0x7FFFFFFF) {
                    throw new a("malformed DT_NEEDED section");
                }
                ++v9;
            }
            else if(v11 == 5L) {
                v10 = z ? r.h(j0, byteBuffer0, v8 + 4L) : r.e(j0, byteBuffer0, v8 + 8L);
            }
            v8 += (z ? 8L : 16L);
        }
        while(v11 != 0L);
        if(v10 == 0L) {
            throw new a("Dynamic section string-table not found");
        }
        long v12 = v1;
        int v13 = 0;
        while(true) {
            v14 = 0L;
            if(((long)v13) >= v2) {
                break;
            }
            if(r.h(j0, byteBuffer0, v12) == 1L) {
                long v15 = z ? r.h(j0, byteBuffer0, v12 + 8L) : r.e(j0, byteBuffer0, v12 + 16L);
                if(z) {
                    v16 = v2;
                    v17 = r.h(j0, byteBuffer0, v12 + 20L);
                }
                else {
                    v16 = v2;
                    v17 = r.e(j0, byteBuffer0, v12 + 40L);
                }
                if(v15 <= v10 && v10 < v17 + v15) {
                    v14 = (z ? r.h(j0, byteBuffer0, v12 + 4L) : r.e(j0, byteBuffer0, v12 + 8L)) + (v10 - v15);
                    break;
                }
            }
            else {
                v16 = v2;
            }
            v12 += (long)v3;
            ++v13;
            v2 = v16;
        }
        if(v14 == 0L) {
            throw new a("did not find file offset of DT_STRTAB table");
        }
        String[] arr_s = new String[v9];
        long v18 = v7;
        int v19 = 0;
        do {
            long v20 = z ? r.h(j0, byteBuffer0, v18) : r.e(j0, byteBuffer0, v18);
            if(v20 == 1L) {
                arr_s[v19] = r.f(j0, byteBuffer0, (z ? r.h(j0, byteBuffer0, v18 + 4L) : r.e(j0, byteBuffer0, v18 + 8L)) + v14);
                if(v19 == 0x7FFFFFFF) {
                    throw new a("malformed DT_NEEDED section");
                }
                ++v19;
            }
            v18 += (z ? 8L : 16L);
        }
        while(v20 != 0L);
        if(v19 != v9) {
            throw new a("malformed DT_NEEDED section");
        }
        return arr_s;
    }

    private static String[] d(k k0) throws IOException {
        int v = 0;
        while(true) {
            try {
                return r.c(k0);
            }
            catch(ClosedByInterruptException closedByInterruptException0) {
            }
            ++v;
            if(v > 4) {
                break;
            }
            Thread.interrupted();
            p.d("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", closedByInterruptException0);
            k0.a();
        }
        throw closedByInterruptException0;
    }

    private static long e(j j0, ByteBuffer byteBuffer0, long v) throws IOException {
        r.j(j0, byteBuffer0, 8, v);
        return byteBuffer0.getLong();
    }

    private static String f(j j0, ByteBuffer byteBuffer0, long v) throws IOException {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v1;
        while((v1 = r.i(j0, byteBuffer0, v)) != 0) {
            stringBuilder0.append(((char)v1));
            ++v;
        }
        return stringBuilder0.toString();
    }

    private static int g(j j0, ByteBuffer byteBuffer0, long v) throws IOException {
        r.j(j0, byteBuffer0, 2, v);
        return byteBuffer0.getShort() & 0xFFFF;
    }

    private static long h(j j0, ByteBuffer byteBuffer0, long v) throws IOException {
        r.j(j0, byteBuffer0, 4, v);
        return ((long)byteBuffer0.getInt()) & 0xFFFFFFFFL;
    }

    private static short i(j j0, ByteBuffer byteBuffer0, long v) throws IOException {
        r.j(j0, byteBuffer0, 1, v);
        return (short)(byteBuffer0.get() & 0xFF);
    }

    private static void j(j j0, ByteBuffer byteBuffer0, int v, long v1) throws IOException {
        byteBuffer0.position(0);
        byteBuffer0.limit(v);
        while(byteBuffer0.remaining() > 0) {
            int v2 = j0.y(byteBuffer0, v1);
            if(v2 == -1) {
                break;
            }
            v1 += (long)v2;
        }
        if(byteBuffer0.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer0.position(0);
    }
}

