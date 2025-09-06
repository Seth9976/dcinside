package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.OpenAdvertisingId;
import gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii;
import gatewayprotocol.v1.PiiKt.Dsl;
import gatewayprotocol.v1.PiiOuterClass.Pii.Builder;
import gatewayprotocol.v1.PiiOuterClass.Pii;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import y4.l;

@s0({"SMAP\nAndroidPrivacyDeviceInfoDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPrivacyDeviceInfoDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidPrivacyDeviceInfoDataSource\n+ 2 PiiKt.kt\ngatewayprotocol/v1/PiiKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n10#2:46\n1#3:47\n*S KotlinDebug\n*F\n+ 1 AndroidPrivacyDeviceInfoDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidPrivacyDeviceInfoDataSource\n*L\n28#1:46\n28#1:47\n*E\n"})
public final class AndroidPrivacyDeviceInfoDataSource implements PrivacyDeviceInfoDataSource {
    @l
    private final Context context;
    @l
    private final E idfaInitialized;

    public AndroidPrivacyDeviceInfoDataSource(@l Context context0) {
        L.p(context0, "context");
        super();
        this.context = context0;
        this.idfaInitialized = W.a(Boolean.FALSE);
    }

    @Override  // com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource
    @l
    public Pii fetch(@l AllowedPii allowedPiiOuterClass$AllowedPii0) {
        L.p(allowedPiiOuterClass$AllowedPii0, "allowed");
        if(!((Boolean)this.idfaInitialized.getValue()).booleanValue()) {
            this.idfaInitialized.setValue(Boolean.TRUE);
            AdvertisingId.init(this.context);
            OpenAdvertisingId.init(this.context);
        }
        Builder piiOuterClass$Pii$Builder0 = Pii.newBuilder();
        L.o(piiOuterClass$Pii$Builder0, "newBuilder()");
        Dsl piiKt$Dsl0 = Dsl.Companion._create(piiOuterClass$Pii$Builder0);
        boolean z = !allowedPiiOuterClass$AllowedPii0.getIdfa();
        return piiKt$Dsl0._build();
    }

    private final String getAdvertisingTrackingId() [...] // 潜在的解密器

    private final String getOpenAdvertisingTrackingId() [...] // 潜在的解密器
}

