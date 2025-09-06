package com.google.protobuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nApiKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiKt.kt\ncom/google/protobuf/ApiKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,332:1\n1#2:333\n*E\n"})
public final class ApiKtKt {
    @l
    @i(name = "-initializeapi")
    public static final Api -initializeapi(@l Function1 function10) {
        L.p(function10, "block");
        Builder api$Builder0 = Api.newBuilder();
        L.o(api$Builder0, "newBuilder()");
        Dsl apiKt$Dsl0 = Dsl.Companion._create(api$Builder0);
        function10.invoke(apiKt$Dsl0);
        return apiKt$Dsl0._build();
    }

    @l
    public static final Api copy(@l Api api0, @l Function1 function10) {
        L.p(api0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = api0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl apiKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(apiKt$Dsl0);
        return apiKt$Dsl0._build();
    }

    @m
    public static final SourceContext getSourceContextOrNull(@l ApiOrBuilder apiOrBuilder0) {
        L.p(apiOrBuilder0, "<this>");
        return apiOrBuilder0.hasSourceContext() ? apiOrBuilder0.getSourceContext() : null;
    }
}

