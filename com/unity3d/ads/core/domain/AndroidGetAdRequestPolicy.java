package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidGetAdRequestPolicy implements GetRequestPolicy {
    @l
    private final SessionRepository sessionRepository;

    public AndroidGetAdRequestPolicy(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.sessionRepository = sessionRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetRequestPolicy
    @l
    public RequestPolicy invoke() {
        return new RequestPolicy(this.sessionRepository.getNativeConfiguration().getAdPolicy().getRetryPolicy().getMaxDuration(), this.sessionRepository.getNativeConfiguration().getAdPolicy().getRetryPolicy().getRetryMaxInterval(), this.sessionRepository.getNativeConfiguration().getAdPolicy().getRetryPolicy().getRetryWaitBase(), this.sessionRepository.getNativeConfiguration().getAdPolicy().getRetryPolicy().getRetryJitterPct(), this.sessionRepository.getNativeConfiguration().getAdPolicy().getRetryPolicy().getRetryScalingFactor(), this.sessionRepository.getNativeConfiguration().getAdPolicy().getTimeoutPolicy().getConnectTimeoutMs(), this.sessionRepository.getNativeConfiguration().getAdPolicy().getTimeoutPolicy().getReadTimeoutMs(), this.sessionRepository.getNativeConfiguration().getAdPolicy().getTimeoutPolicy().getWriteTimeoutMs(), this.sessionRepository.getNativeConfiguration().getAdPolicy().getTimeoutPolicy().getOverallTimeoutMs(), this.sessionRepository.getNativeConfiguration().getAdPolicy().getRetryPolicy().getShouldStoreLocally());
    }
}

