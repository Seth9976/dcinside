package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface GatewayClient {
    public static final class DefaultImpls {
        public static Object request$default(GatewayClient gatewayClient0, String s, UniversalRequest universalRequestOuterClass$UniversalRequest0, RequestPolicy requestPolicy0, OperationType operationType0, d d0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
            if((v & 1) != 0) {
                s = "https://gateway.unityads.unity3d.com/v1";
            }
            if((v & 8) != 0) {
                operationType0 = OperationType.UNKNOWN;
            }
            return gatewayClient0.request(s, universalRequestOuterClass$UniversalRequest0, requestPolicy0, operationType0, d0);
        }
    }

    @m
    Object request(@l String arg1, @l UniversalRequest arg2, @l RequestPolicy arg3, @l OperationType arg4, @l d arg5);
}

