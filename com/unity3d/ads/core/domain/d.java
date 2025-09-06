package com.unity3d.ads.core.domain;

public final class d implements Runnable {
    public final LegacyLoadUseCase a;

    public d(LegacyLoadUseCase legacyLoadUseCase0) {
        this.a = legacyLoadUseCase0;
    }

    @Override
    public final void run() {
        com.unity3d.ads.core.domain.LegacyLoadUseCase.loadSuccess.2.invokeSuspend$lambda$0(this.a);
    }
}

