package com.unity3d.services.core.properties;

import kotlin.jvm.internal.L;
import y4.l;

public final class SessionIdReader {
    @l
    public static final SessionIdReader INSTANCE;
    @l
    private static final String sessionId;

    static {
        SessionIdReader.INSTANCE = new SessionIdReader();
        L.o("5c7950f7-7fd4-4cbb-93b3-eb0a542f3c83", "randomUUID().toString()");
        SessionIdReader.sessionId = "5c7950f7-7fd4-4cbb-93b3-eb0a542f3c83";
    }

    @l
    public final String getSessionId() {
        return SessionIdReader.sessionId;
    }
}

