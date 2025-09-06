package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class CommonSetGameId implements SetGameId {
    @l
    private final SessionRepository sessionRepository;

    public CommonSetGameId(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.sessionRepository = sessionRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.SetGameId
    public void invoke(@m String s) {
        this.sessionRepository.setGameId(s);
    }
}

