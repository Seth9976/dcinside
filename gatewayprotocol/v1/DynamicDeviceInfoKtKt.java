package gatewayprotocol.v1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nDynamicDeviceInfoKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicDeviceInfoKt.kt\ngatewayprotocol/v1/DynamicDeviceInfoKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1533:1\n1#2:1534\n*E\n"})
public final class DynamicDeviceInfoKtKt {
    @l
    @i(name = "-initializedynamicDeviceInfo")
    public static final DynamicDeviceInfo -initializedynamicDeviceInfo(@l Function1 function10) {
        L.p(function10, "block");
        Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0 = DynamicDeviceInfo.newBuilder();
        L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0, "newBuilder()");
        Dsl dynamicDeviceInfoKt$Dsl0 = Dsl.Companion._create(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0);
        function10.invoke(dynamicDeviceInfoKt$Dsl0);
        return dynamicDeviceInfoKt$Dsl0._build();
    }

    @l
    public static final Android copy(@l Android dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0, @l Function1 function10) {
        L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl dynamicDeviceInfoKt$AndroidKt$Dsl0 = gatewayprotocol.v1.DynamicDeviceInfoKt.AndroidKt.Dsl.Companion._create(((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder)generatedMessageLite$Builder0));
        function10.invoke(dynamicDeviceInfoKt$AndroidKt$Dsl0);
        return dynamicDeviceInfoKt$AndroidKt$Dsl0._build();
    }

    @l
    public static final Ios copy(@l Ios dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0, @l Function1 function10) {
        L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl dynamicDeviceInfoKt$IosKt$Dsl0 = gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion._create(((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder)generatedMessageLite$Builder0));
        function10.invoke(dynamicDeviceInfoKt$IosKt$Dsl0);
        return dynamicDeviceInfoKt$IosKt$Dsl0._build();
    }

    @l
    public static final DynamicDeviceInfo copy(@l DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0, @l Function1 function10) {
        L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0, "<this>");
        L.p(function10, "block");
        com.google.protobuf.GeneratedMessageLite.Builder generatedMessageLite$Builder0 = dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.toBuilder();
        L.o(generatedMessageLite$Builder0, "this.toBuilder()");
        Dsl dynamicDeviceInfoKt$Dsl0 = Dsl.Companion._create(((Builder)generatedMessageLite$Builder0));
        function10.invoke(dynamicDeviceInfoKt$Dsl0);
        return dynamicDeviceInfoKt$Dsl0._build();
    }

    @m
    public static final Android getAndroidOrNull(@l DynamicDeviceInfoOrBuilder dynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder0) {
        L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder0, "<this>");
        return dynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder0.hasAndroid() ? dynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder0.getAndroid() : null;
    }

    @m
    public static final Ios getIosOrNull(@l DynamicDeviceInfoOrBuilder dynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder0) {
        L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder0, "<this>");
        return dynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder0.hasIos() ? dynamicDeviceInfoOuterClass$DynamicDeviceInfoOrBuilder0.getIos() : null;
    }

    @m
    public static final NetworkCapabilityTransports getNetworkCapabilityTransportsOrNull(@l AndroidOrBuilder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder0) {
        L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder0, "<this>");
        return dynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder0.hasNetworkCapabilityTransports() ? dynamicDeviceInfoOuterClass$DynamicDeviceInfo$AndroidOrBuilder0.getNetworkCapabilityTransports() : null;
    }
}

