package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class d {
    public static class a {
        private final long a;
        private final o b;

        public a(long v, o o0) {
            this.a = v;
            this.b = o0;
        }

        public o a() {
            return this.b;
        }

        public long b() {
            return this.a;
        }
    }

    public static a a(o o0, r r0) throws IOException, b {
        long v = r0.a();
        long v1 = r0.c() + v;
        long v2 = r0.e();
        if(v1 != v2) {
            throw new b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + v1 + ", EoCD start: " + v2);
        }
        if(v < 0x20L) {
            throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: " + v);
        }
        ByteBuffer byteBuffer0 = o0.a(v - 24L, 24);
        ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
        byteBuffer0.order(byteOrder0);
        if(byteBuffer0.getLong(8) != 0x20676953204B5041L || byteBuffer0.getLong(16) != 0x3234206B636F6C42L) {
            throw new b("No APK Signing Block before ZIP Central Directory");
        }
        long v3 = byteBuffer0.getLong(0);
        if(v3 < ((long)byteBuffer0.capacity()) || v3 > 0x7FFFFFF7L) {
            throw new b("APK Signing Block size out of range: " + v3);
        }
        long v4 = (long)(((int)(v3 + 8L)));
        long v5 = v - v4;
        if(v5 < 0L) {
            throw new b("APK Signing Block offset out of range: " + v5);
        }
        ByteBuffer byteBuffer1 = o0.a(v5, 8);
        byteBuffer1.order(byteOrder0);
        long v6 = byteBuffer1.getLong(0);
        if(v6 != v3) {
            throw new b("APK Signing Block sizes in header and footer do not match: " + v6 + " vs " + v3);
        }
        return new a(v5, o0.a(v5, v4));
    }

    public static r a(o o0) throws IOException, q {
        m m0 = n.a(o0);
        if(m0 == null) {
            throw new q("ZIP End of Central Directory record not found");
        }
        Object object0 = m0.a();
        long v = (long)(((Long)m0.b()));
        ((ByteBuffer)object0).order(ByteOrder.LITTLE_ENDIAN);
        long v1 = n.c(((ByteBuffer)object0));
        if(v1 > v) {
            throw new q("ZIP Central Directory start offset out of range: " + v1 + ". ZIP End of Central Directory offset: " + v);
        }
        long v2 = n.d(((ByteBuffer)object0));
        long v3 = v1 + v2;
        if(v3 > v) {
            throw new q("ZIP Central Directory overlaps with End of Central Directory. CD end: " + v3 + ", EoCD start: " + v);
        }
        return new r(v1, v2, n.e(((ByteBuffer)object0)), v, ((ByteBuffer)object0));
    }
}

