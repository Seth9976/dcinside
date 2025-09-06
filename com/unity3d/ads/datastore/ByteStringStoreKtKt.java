package com.unity3d.ads.datastore;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nByteStringStoreKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteStringStoreKt.kt\ncom/unity3d/ads/datastore/ByteStringStoreKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class ByteStringStoreKtKt {
    @l
    @i(name = "-initializebyteStringStore")
    public static final ByteStringStore -initializebyteStringStore(@l Function1 function10) {
        L.p(function10, "block");
        Builder byteStringStoreOuterClass$ByteStringStore$Builder0 = ByteStringStore.newBuilder();
        L.o(byteStringStoreOuterClass$ByteStringStore$Builder0, "newBuilder()");
        Dsl byteStringStoreKt$Dsl0 = Dsl.Companion._create(byteStringStoreOuterClass$ByteStringStore$Builder0);
        function10.invoke(byteStringStoreKt$Dsl0);
        return byteStringStoreKt$Dsl0._build();
    }

    @l
    public static final ByteStringStore copy(@l ByteStringStore byteStringStoreOuterClass$ByteStringStore0, @l Function1 function10) {
        L.p(byteStringStoreOuterClass$ByteStringStore0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = byteStringStoreOuterClass$ByteStringStore0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl byteStringStoreKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(byteStringStoreKt$Dsl0);
        return byteStringStoreKt$Dsl0._build();
    }
}

