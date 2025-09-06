package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class NetworkTimeoutException extends UnityAdsNetworkException {
    public NetworkTimeoutException(@l String s, @l OperationType operationType0, @m Integer integer0, @m String s1, @m String s2, @m Integer integer1, @m String s3) {
        L.p(s, "message");
        L.p(operationType0, "type");
        super(s, operationType0, integer0, s1, s2, integer1, s3);
    }

    public NetworkTimeoutException(String s, OperationType operationType0, Integer integer0, String s1, String s2, Integer integer1, String s3, int v, w w0) {
        this(s, ((v & 2) == 0 ? operationType0 : OperationType.UNKNOWN), ((v & 4) == 0 ? integer0 : null), ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? integer1 : null), ((v & 0x40) == 0 ? s3 : null));
    }
}

