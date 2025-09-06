package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.K;
import kotlinx.coroutines.flow.k;
import y4.l;

public final class OperativeEventRepository {
    @l
    private final D _operativeEvents;
    @l
    private final I operativeEvents;

    public OperativeEventRepository() {
        D d0 = K.a(10, 10, i.b);
        this._operativeEvents = d0;
        this.operativeEvents = k.l(d0);
    }

    public final void addOperativeEvent(@l OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest0) {
        L.p(operativeEventRequestOuterClass$OperativeEventRequest0, "operativeEventRequest");
        this._operativeEvents.d(operativeEventRequestOuterClass$OperativeEventRequest0);
    }

    @l
    public final I getOperativeEvents() {
        return this.operativeEvents;
    }
}

