package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import y4.l;

public interface UniversalRequestTtlValidator {
    boolean invoke(@l UniversalRequest arg1, @l RequestPolicy arg2);
}

