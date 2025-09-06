package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class CommonGetGameId implements GetGameId {
    @l
    private final SessionRepository sessionRepository;

    public CommonGetGameId(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.sessionRepository = sessionRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetGameId
    @m
    public String invoke() {
        return this.sessionRepository.getGameId();
    }
}

