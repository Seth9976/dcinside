package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nMixinKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MixinKt.kt\ncom/google/protobuf/MixinKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class MixinKtKt {
    @l
    @i(name = "-initializemixin")
    public static final Mixin -initializemixin(@l Function1 function10) {
        L.p(function10, "block");
        Builder mixin$Builder0 = Mixin.newBuilder();
        L.o(mixin$Builder0, "newBuilder()");
        Dsl mixinKt$Dsl0 = Dsl.Companion._create(mixin$Builder0);
        function10.invoke(mixinKt$Dsl0);
        return mixinKt$Dsl0._build();
    }

    @l
    public static final Mixin copy(@l Mixin mixin0, @l Function1 function10) {
        L.p(mixin0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = mixin0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl mixinKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(mixinKt$Dsl0);
        return mixinKt$Dsl0._build();
    }
}

