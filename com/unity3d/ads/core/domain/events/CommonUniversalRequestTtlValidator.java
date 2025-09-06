package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import kotlin.jvm.internal.L;
import y4.l;

public final class CommonUniversalRequestTtlValidator implements UniversalRequestTtlValidator {
    @Override  // com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator
    public boolean invoke(@l UniversalRequest universalRequestOuterClass$UniversalRequest0, @l RequestPolicy requestPolicy0) {
        L.p(universalRequestOuterClass$UniversalRequest0, "universalRequest");
        L.p(requestPolicy0, "requestPolicy");
        return System.currentTimeMillis() - universalRequestOuterClass$UniversalRequest0.getSharedData().getTimestamps().getTimestamp().getSeconds() * 1000L < ((long)requestPolicy0.getMaxDuration());
    }
}

