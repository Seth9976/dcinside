package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent;
import gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration;
import kotlinx.coroutines.flow.I;
import y4.l;

public interface DiagnosticEventRepository {
    void addDiagnosticEvent(@l DiagnosticEvent arg1);

    void clear();

    void configure(@l DiagnosticEventsConfiguration arg1);

    void flush();

    @l
    I getDiagnosticEvents();
}

