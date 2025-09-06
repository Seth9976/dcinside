package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nStaticDeviceInfoKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticDeviceInfoKt.kt\ngatewayprotocol/v1/StaticDeviceInfoKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1343:1\n1#2:1344\n*E\n"})
public final class StaticDeviceInfoKtKt {
    @l
    @i(name = "-initializestaticDeviceInfo")
    public static final StaticDeviceInfo -initializestaticDeviceInfo(@l Function1 function10) {
        L.p(function10, "block");
        Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0 = StaticDeviceInfo.newBuilder();
        L.o(staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0, "newBuilder()");
        Dsl staticDeviceInfoKt$Dsl0 = Dsl.Companion._create(staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0);
        function10.invoke(staticDeviceInfoKt$Dsl0);
        return staticDeviceInfoKt$Dsl0._build();
    }

    @l
    public static final Android copy(@l Android staticDeviceInfoOuterClass$StaticDeviceInfo$Android0, @l Function1 function10) {
        L.p(staticDeviceInfoOuterClass$StaticDeviceInfo$Android0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = staticDeviceInfoOuterClass$StaticDeviceInfo$Android0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl staticDeviceInfoKt$AndroidKt$Dsl0 = gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.Companion._create(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder)generatedMessageLite$Builder0));
        function10.invoke(staticDeviceInfoKt$AndroidKt$Dsl0);
        return staticDeviceInfoKt$AndroidKt$Dsl0._build();
    }

    @l
    public static final Ios copy(@l Ios staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0, @l Function1 function10) {
        L.p(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl staticDeviceInfoKt$IosKt$Dsl0 = gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion._create(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder)generatedMessageLite$Builder0));
        function10.invoke(staticDeviceInfoKt$IosKt$Dsl0);
        return staticDeviceInfoKt$IosKt$Dsl0._build();
    }

    @l
    public static final StaticDeviceInfo copy(@l StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0, @l Function1 function10) {
        L.p(staticDeviceInfoOuterClass$StaticDeviceInfo0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = staticDeviceInfoOuterClass$StaticDeviceInfo0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl staticDeviceInfoKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(staticDeviceInfoKt$Dsl0);
        return staticDeviceInfoKt$Dsl0._build();
    }

    @m
    public static final Android getAndroidOrNull(@l StaticDeviceInfoOrBuilder staticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder0) {
        L.p(staticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder0, "<this>");
        return staticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder0.hasAndroid() ? staticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder0.getAndroid() : null;
    }

    @m
    public static final Ios getIosOrNull(@l StaticDeviceInfoOrBuilder staticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder0) {
        L.p(staticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder0, "<this>");
        return staticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder0.hasIos() ? staticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder0.getIos() : null;
    }
}

