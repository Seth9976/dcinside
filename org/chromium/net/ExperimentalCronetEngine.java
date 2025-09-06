package org.chromium.net;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class ExperimentalCronetEngine extends CronetEngine {
    public static class Builder extends org.chromium.net.CronetEngine.Builder {
        public Builder(Context context0) {
            super(context0);
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder0) {
            super(iCronetEngineBuilder0);
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.CronetEngine.Builder addPublicKeyPins(String s, Set set0, boolean z, Date date0) {
            return this.addPublicKeyPins(s, set0, z, date0);
        }

        public Builder addPublicKeyPins(String s, Set set0, boolean z, Date date0) {
            super.addPublicKeyPins(s, set0, z, date0);
            return this;
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.CronetEngine.Builder addQuicHint(String s, int v, int v1) {
            return this.addQuicHint(s, v, v1);
        }

        public Builder addQuicHint(String s, int v, int v1) {
            super.addQuicHint(s, v, v1);
            return this;
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public CronetEngine build() {
            return this.build();
        }

        public ExperimentalCronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.CronetEngine.Builder enableHttp2(boolean z) {
            return this.enableHttp2(z);
        }

        public Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.CronetEngine.Builder enableHttpCache(int v, long v1) {
            return this.enableHttpCache(v, v1);
        }

        public Builder enableHttpCache(int v, long v1) {
            super.enableHttpCache(v, v1);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean z) {
            return this;
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.CronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            return this.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.CronetEngine.Builder enableQuic(boolean z) {
            return this.enableQuic(z);
        }

        public Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.CronetEngine.Builder enableSdch(boolean z) {
            return this;
        }

        public Builder enableSdch(boolean z) [...] // Inlined contents

        @VisibleForTesting
        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public Builder setExperimentalOptions(String s) {
            this.mBuilderDelegate.setExperimentalOptions(s);
            return this;
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.CronetEngine.Builder setLibraryLoader(LibraryLoader cronetEngine$Builder$LibraryLoader0) {
            return this.setLibraryLoader(cronetEngine$Builder$LibraryLoader0);
        }

        public Builder setLibraryLoader(LibraryLoader cronetEngine$Builder$LibraryLoader0) {
            super.setLibraryLoader(cronetEngine$Builder$LibraryLoader0);
            return this;
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.CronetEngine.Builder setStoragePath(String s) {
            return this.setStoragePath(s);
        }

        public Builder setStoragePath(String s) {
            super.setStoragePath(s);
            return this;
        }

        public Builder setThreadPriority(int v) {
            return this;
        }

        @Override  // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.CronetEngine.Builder setUserAgent(String s) {
            return this.setUserAgent(s);
        }

        public Builder setUserAgent(String s) {
            super.setUserAgent(s);
            return this;
        }
    }

    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN;

    public void addRequestFinishedListener(Listener requestFinishedInfo$Listener0) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener0) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener0) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z1, boolean z2) {
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String arg1, Callback arg2, Executor arg3);

    public abstract org.chromium.net.ExperimentalUrlRequest.Builder newUrlRequestBuilder(String arg1, org.chromium.net.UrlRequest.Callback arg2, Executor arg3);

    @Override  // org.chromium.net.CronetEngine
    public org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(String s, org.chromium.net.UrlRequest.Callback urlRequest$Callback0, Executor executor0) {
        return this.newUrlRequestBuilder(s, urlRequest$Callback0, executor0);
    }

    public URLConnection openConnection(URL uRL0, Proxy proxy0) throws IOException {
        return (URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection(proxy0));
    }

    public void removeRequestFinishedListener(Listener requestFinishedInfo$Listener0) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener0) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener0) {
    }

    public void startNetLogToDisk(String s, boolean z, int v) {
    }
}

