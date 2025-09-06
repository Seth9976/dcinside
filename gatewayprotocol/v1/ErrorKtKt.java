package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nErrorKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorKt.kt\ngatewayprotocol/v1/ErrorKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class ErrorKtKt {
    @l
    @i(name = "-initializeerror")
    public static final Error -initializeerror(@l Function1 function10) {
        L.p(function10, "block");
        Builder errorOuterClass$Error$Builder0 = Error.newBuilder();
        L.o(errorOuterClass$Error$Builder0, "newBuilder()");
        Dsl errorKt$Dsl0 = Dsl.Companion._create(errorOuterClass$Error$Builder0);
        function10.invoke(errorKt$Dsl0);
        return errorKt$Dsl0._build();
    }

    @l
    public static final Error copy(@l Error errorOuterClass$Error0, @l Function1 function10) {
        L.p(errorOuterClass$Error0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = errorOuterClass$Error0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl errorKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(errorKt$Dsl0);
        return errorKt$Dsl0._build();
    }
}

