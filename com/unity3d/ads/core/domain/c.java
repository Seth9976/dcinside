package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.LoadResult.Failure;

public final class c implements Runnable {
    public final LegacyLoadUseCase a;
    public final Failure b;

    public c(LegacyLoadUseCase legacyLoadUseCase0, Failure loadResult$Failure0) {
        this.a = legacyLoadUseCase0;
        this.b = loadResult$Failure0;
    }

    @Override
    public final void run() {
        com.unity3d.ads.core.domain.LegacyLoadUseCase.loadFailure.2.invokeSuspend$lambda$0(this.a, this.b);
    }
}

