package com.unity3d.ads.datastore;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nUniversalRequestStoreKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniversalRequestStoreKt.kt\ncom/unity3d/ads/datastore/UniversalRequestStoreKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class UniversalRequestStoreKtKt {
    @l
    @i(name = "-initializeuniversalRequestStore")
    public static final UniversalRequestStore -initializeuniversalRequestStore(@l Function1 function10) {
        L.p(function10, "block");
        Builder universalRequestStoreOuterClass$UniversalRequestStore$Builder0 = UniversalRequestStore.newBuilder();
        L.o(universalRequestStoreOuterClass$UniversalRequestStore$Builder0, "newBuilder()");
        Dsl universalRequestStoreKt$Dsl0 = Dsl.Companion._create(universalRequestStoreOuterClass$UniversalRequestStore$Builder0);
        function10.invoke(universalRequestStoreKt$Dsl0);
        return universalRequestStoreKt$Dsl0._build();
    }

    @l
    public static final UniversalRequestStore copy(@l UniversalRequestStore universalRequestStoreOuterClass$UniversalRequestStore0, @l Function1 function10) {
        L.p(universalRequestStoreOuterClass$UniversalRequestStore0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = universalRequestStoreOuterClass$UniversalRequestStore0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl universalRequestStoreKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(universalRequestStoreKt$Dsl0);
        return universalRequestStoreKt$Dsl0._build();
    }
}

