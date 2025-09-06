package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.L;
import y4.l;

public final class ByteStringsKt {
    public static final byte get(@l ByteString byteString0, int v) {
        L.p(byteString0, "<this>");
        return byteString0.byteAt(v);
    }

    public static final boolean isNotEmpty(@l ByteString byteString0) {
        L.p(byteString0, "<this>");
        return !byteString0.isEmpty();
    }

    @l
    public static final ByteString plus(@l ByteString byteString0, @l ByteString byteString1) {
        L.p(byteString0, "<this>");
        L.p(byteString1, "other");
        ByteString byteString2 = byteString0.concat(byteString1);
        L.o(byteString2, "concat(other)");
        return byteString2;
    }

    @l
    public static final ByteString toByteString(@l ByteBuffer byteBuffer0) {
        L.p(byteBuffer0, "<this>");
        ByteString byteString0 = ByteString.copyFrom(byteBuffer0);
        L.o(byteString0, "copyFrom(this)");
        return byteString0;
    }

    @l
    public static final ByteString toByteString(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        ByteString byteString0 = ByteString.copyFrom(arr_b);
        L.o(byteString0, "copyFrom(this)");
        return byteString0;
    }

    @l
    public static final ByteString toByteStringUtf8(@l String s) {
        L.p(s, "<this>");
        ByteString byteString0 = ByteString.copyFromUtf8(s);
        L.o(byteString0, "copyFromUtf8(this)");
        return byteString0;
    }
}

