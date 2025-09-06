package com.unity3d.ads.core.extensions;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import kotlin.jvm.internal.L;
import y4.l;

public final class TimestampExtensionsKt {
    public static final long duration(long v) {
        return System.nanoTime() - v;
    }

    @l
    public static final Timestamp fromMillis(long v) {
        GeneratedMessageLite generatedMessageLite0 = Timestamp.newBuilder().setSeconds(v / 1000L).setNanos(((int)(v % 1000L * 1000000L))).build();
        L.o(generatedMessageLite0, "newBuilder().setSeconds(…000000).toInt())).build()");
        return (Timestamp)generatedMessageLite0;
    }
}

