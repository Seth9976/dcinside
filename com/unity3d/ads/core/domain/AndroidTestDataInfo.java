package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import gatewayprotocol.v1.TestDataKt.Dsl;
import gatewayprotocol.v1.TestDataOuterClass.TestData.Builder;
import gatewayprotocol.v1.TestDataOuterClass.TestData;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidTestDataInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTestDataInfo.kt\ncom/unity3d/ads/core/domain/AndroidTestDataInfo\n+ 2 TestDataKt.kt\ngatewayprotocol/v1/TestDataKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n10#2:19\n1#3:20\n1#3:21\n*S KotlinDebug\n*F\n+ 1 AndroidTestDataInfo.kt\ncom/unity3d/ads/core/domain/AndroidTestDataInfo\n*L\n10#1:19\n10#1:20\n*E\n"})
public final class AndroidTestDataInfo implements GetTestDataInfo {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String EXCHANGE_TEST_MODE = "ExchangeTestMode";
    @l
    private final AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    static {
        AndroidTestDataInfo.Companion = new Companion(null);
    }

    public AndroidTestDataInfo(@l AndroidManifestIntPropertyReader androidManifestIntPropertyReader0) {
        L.p(androidManifestIntPropertyReader0, "androidManifestIntPropertyReader");
        super();
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader0;
    }

    @Override  // com.unity3d.ads.core.domain.GetTestDataInfo
    @m
    public TestData invoke() {
        Builder testDataOuterClass$TestData$Builder0 = TestData.newBuilder();
        L.o(testDataOuterClass$TestData$Builder0, "newBuilder()");
        Dsl testDataKt$Dsl0 = Dsl.Companion._create(testDataOuterClass$TestData$Builder0);
        Integer integer0 = this.androidManifestIntPropertyReader.getPropertyByName("ExchangeTestMode");
        if(integer0 != null) {
            testDataKt$Dsl0.setForceExchangeTestMode(integer0.intValue());
        }
        TestData testDataOuterClass$TestData0 = testDataKt$Dsl0._build();
        return testDataOuterClass$TestData0.hasForceExchangeTestMode() ? testDataOuterClass$TestData0 : null;
    }
}

