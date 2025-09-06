package com.unity3d.ads.gatewayclient;

import y4.l;
import y4.m;

public final class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int overallTimeout;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final float retryScalingFactor;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    public RequestPolicy(int v, int v1, int v2, float f, float f1, int v3, int v4, int v5, int v6, boolean z) {
        this.maxDuration = v;
        this.retryMaxInterval = v1;
        this.retryWaitBase = v2;
        this.retryJitterPct = f;
        this.retryScalingFactor = f1;
        this.connectTimeout = v3;
        this.readTimeout = v4;
        this.writeTimeout = v5;
        this.overallTimeout = v6;
        this.shouldStoreLocally = z;
    }

    public final int component1() {
        return this.maxDuration;
    }

    public final boolean component10() {
        return this.shouldStoreLocally;
    }

    public final int component2() {
        return this.retryMaxInterval;
    }

    public final int component3() {
        return this.retryWaitBase;
    }

    public final float component4() {
        return this.retryJitterPct;
    }

    public final float component5() {
        return this.retryScalingFactor;
    }

    public final int component6() {
        return this.connectTimeout;
    }

    public final int component7() {
        return this.readTimeout;
    }

    public final int component8() {
        return this.writeTimeout;
    }

    public final int component9() {
        return this.overallTimeout;
    }

    @l
    public final RequestPolicy copy(int v, int v1, int v2, float f, float f1, int v3, int v4, int v5, int v6, boolean z) {
        return new RequestPolicy(v, v1, v2, f, f1, v3, v4, v5, v6, z);
    }

    public static RequestPolicy copy$default(RequestPolicy requestPolicy0, int v, int v1, int v2, float f, float f1, int v3, int v4, int v5, int v6, boolean z, int v7, Object object0) {
        int v8 = (v7 & 1) == 0 ? v : requestPolicy0.maxDuration;
        int v9 = (v7 & 2) == 0 ? v1 : requestPolicy0.retryMaxInterval;
        int v10 = (v7 & 4) == 0 ? v2 : requestPolicy0.retryWaitBase;
        float f2 = (v7 & 8) == 0 ? f : requestPolicy0.retryJitterPct;
        float f3 = (v7 & 16) == 0 ? f1 : requestPolicy0.retryScalingFactor;
        int v11 = (v7 & 0x20) == 0 ? v3 : requestPolicy0.connectTimeout;
        int v12 = (v7 & 0x40) == 0 ? v4 : requestPolicy0.readTimeout;
        int v13 = (v7 & 0x80) == 0 ? v5 : requestPolicy0.writeTimeout;
        int v14 = (v7 & 0x100) == 0 ? v6 : requestPolicy0.overallTimeout;
        return (v7 & 0x200) == 0 ? requestPolicy0.copy(v8, v9, v10, f2, f3, v11, v12, v13, v14, z) : requestPolicy0.copy(v8, v9, v10, f2, f3, v11, v12, v13, v14, requestPolicy0.shouldStoreLocally);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RequestPolicy)) {
            return false;
        }
        if(this.maxDuration != ((RequestPolicy)object0).maxDuration) {
            return false;
        }
        if(this.retryMaxInterval != ((RequestPolicy)object0).retryMaxInterval) {
            return false;
        }
        if(this.retryWaitBase != ((RequestPolicy)object0).retryWaitBase) {
            return false;
        }
        if(Float.compare(this.retryJitterPct, ((RequestPolicy)object0).retryJitterPct) != 0) {
            return false;
        }
        if(Float.compare(this.retryScalingFactor, ((RequestPolicy)object0).retryScalingFactor) != 0) {
            return false;
        }
        if(this.connectTimeout != ((RequestPolicy)object0).connectTimeout) {
            return false;
        }
        if(this.readTimeout != ((RequestPolicy)object0).readTimeout) {
            return false;
        }
        if(this.writeTimeout != ((RequestPolicy)object0).writeTimeout) {
            return false;
        }
        return this.overallTimeout == ((RequestPolicy)object0).overallTimeout ? this.shouldStoreLocally == ((RequestPolicy)object0).shouldStoreLocally : false;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getOverallTimeout() {
        return this.overallTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final float getRetryScalingFactor() {
        return this.retryScalingFactor;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    @Override
    public int hashCode() {
        int v = ((((((((this.maxDuration * 0x1F + this.retryMaxInterval) * 0x1F + this.retryWaitBase) * 0x1F + Float.floatToIntBits(this.retryJitterPct)) * 0x1F + Float.floatToIntBits(this.retryScalingFactor)) * 0x1F + this.connectTimeout) * 0x1F + this.readTimeout) * 0x1F + this.writeTimeout) * 0x1F + this.overallTimeout) * 0x1F;
        int v1 = this.shouldStoreLocally;
        if(v1) {
            v1 = 1;
        }
        return v + v1;
    }

    @Override
    @l
    public String toString() {
        return "RequestPolicy(maxDuration=" + this.maxDuration + ", retryMaxInterval=" + this.retryMaxInterval + ", retryWaitBase=" + this.retryWaitBase + ", retryJitterPct=" + this.retryJitterPct + ", retryScalingFactor=" + this.retryScalingFactor + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", overallTimeout=" + this.overallTimeout + ", shouldStoreLocally=" + this.shouldStoreLocally + ')';
    }
}

