package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nBannerSizeKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerSizeKt.kt\ngatewayprotocol/v1/BannerSizeKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class BannerSizeKtKt {
    @l
    @i(name = "-initializebannerSize")
    public static final BannerSize -initializebannerSize(@l Function1 function10) {
        L.p(function10, "block");
        Builder adRequestOuterClass$BannerSize$Builder0 = BannerSize.newBuilder();
        L.o(adRequestOuterClass$BannerSize$Builder0, "newBuilder()");
        Dsl bannerSizeKt$Dsl0 = Dsl.Companion._create(adRequestOuterClass$BannerSize$Builder0);
        function10.invoke(bannerSizeKt$Dsl0);
        return bannerSizeKt$Dsl0._build();
    }

    @l
    public static final BannerSize copy(@l BannerSize adRequestOuterClass$BannerSize0, @l Function1 function10) {
        L.p(adRequestOuterClass$BannerSize0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = adRequestOuterClass$BannerSize0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl bannerSizeKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(bannerSizeKt$Dsl0);
        return bannerSizeKt$Dsl0._build();
    }
}

