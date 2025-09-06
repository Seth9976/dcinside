package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import kotlin.jvm.internal.L;
import y4.l;

public final class GetOtherRequestPolicy implements GetRequestPolicy {
    @l
    private final SessionRepository sessionRepository;

    public GetOtherRequestPolicy(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.sessionRepository = sessionRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetRequestPolicy
    @l
    public RequestPolicy invoke() {
        return new RequestPolicy(this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getMaxDuration(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryMaxInterval(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryWaitBase(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryJitterPct(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryScalingFactor(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getConnectTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getReadTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getWriteTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getOverallTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getShouldStoreLocally());
    }
}

