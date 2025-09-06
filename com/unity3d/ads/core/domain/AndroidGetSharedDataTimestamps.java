package com.unity3d.ads.core.domain;

import android.os.SystemClock;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import gatewayprotocol.v1.TimestampsKt.Dsl;
import gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder;
import gatewayprotocol.v1.TimestampsOuterClass.Timestamps;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidGetSharedDataTimestamps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetSharedDataTimestamps.kt\ncom/unity3d/ads/core/domain/AndroidGetSharedDataTimestamps\n+ 2 TimestampsKt.kt\ngatewayprotocol/v1/TimestampsKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n10#2:21\n1#3:22\n*S KotlinDebug\n*F\n+ 1 AndroidGetSharedDataTimestamps.kt\ncom/unity3d/ads/core/domain/AndroidGetSharedDataTimestamps\n*L\n13#1:21\n13#1:22\n*E\n"})
public final class AndroidGetSharedDataTimestamps implements GetSharedDataTimestamps {
    @Override  // com.unity3d.ads.core.domain.GetSharedDataTimestamps
    @l
    public Timestamps invoke() {
        Builder timestampsOuterClass$Timestamps$Builder0 = Timestamps.newBuilder();
        L.o(timestampsOuterClass$Timestamps$Builder0, "newBuilder()");
        Dsl timestampsKt$Dsl0 = Dsl.Companion._create(timestampsOuterClass$Timestamps$Builder0);
        timestampsKt$Dsl0.setTimestamp(TimestampExtensionsKt.fromMillis(System.currentTimeMillis()));
        timestampsKt$Dsl0.setSessionTimestamp(SystemClock.elapsedRealtime());
        return timestampsKt$Dsl0._build();
    }
}

