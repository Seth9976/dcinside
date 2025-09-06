package com.unity3d.ads.core.extensions;

import android.util.Base64;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import y4.l;

public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    @l
    public static final ByteString fromBase64(@l String s, boolean z) {
        L.p(s, "<this>");
        ByteString byteString0 = ByteString.copyFrom(Base64.decode(s, (z ? 10 : 2)));
        L.o(byteString0, "copyFrom(android.util.Base64.decode(this, flag))");
        return byteString0;
    }

    public static ByteString fromBase64$default(String s, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return ProtobufExtensionsKt.fromBase64(s, z);
    }

    @l
    public static final String toBase64(@l ByteString byteString0, boolean z) {
        L.p(byteString0, "<this>");
        String s = Base64.encodeToString(byteString0.toByteArray(), (z ? 10 : 2));
        L.o(s, "encodeToString(this.toByteArray(), flag)");
        return s;
    }

    public static String toBase64$default(ByteString byteString0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return ProtobufExtensionsKt.toBase64(byteString0, z);
    }

    @l
    public static final ByteString toByteString(@l UUID uUID0) {
        L.p(uUID0, "<this>");
        ByteString byteString0 = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uUID0.getMostSignificantBits()).putLong(uUID0.getLeastSignificantBits()).array());
        L.o(byteString0, "copyFrom(bytes.array())");
        return byteString0;
    }

    @l
    public static final ByteString toISO8859ByteString(@l String s) {
        L.p(s, "<this>");
        byte[] arr_b = s.getBytes(f.g);
        L.o(arr_b, "this as java.lang.String).getBytes(charset)");
        ByteString byteString0 = ByteString.copyFrom(arr_b);
        L.o(byteString0, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return byteString0;
    }

    @l
    public static final String toISO8859String(@l ByteString byteString0) {
        L.p(byteString0, "<this>");
        String s = byteString0.toString(f.g);
        L.o(s, "this.toString(Charsets.ISO_8859_1)");
        return s;
    }

    @l
    public static final UUID toUUID(@l ByteString byteString0) {
        L.p(byteString0, "<this>");
        ByteBuffer byteBuffer0 = byteString0.asReadOnlyByteBuffer();
        L.o(byteBuffer0, "this.asReadOnlyByteBuffer()");
        if(byteBuffer0.remaining() == 36) {
            UUID uUID0 = UUID.fromString(byteString0.toStringUtf8());
            L.o(uUID0, "fromString(uuidString)");
            return uUID0;
        }
        if(byteBuffer0.remaining() != 16) {
            throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
        }
        return new UUID(byteBuffer0.getLong(), byteBuffer0.getLong());
    }
}

