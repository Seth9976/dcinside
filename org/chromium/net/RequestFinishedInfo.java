package org.chromium.net;

import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.Executor;

public abstract class RequestFinishedInfo {
    public static abstract class Listener {
        private final Executor mExecutor;

        public Listener(Executor executor0) {
            if(executor0 == null) {
                throw new IllegalStateException("Executor must not be null");
            }
            this.mExecutor = executor0;
        }

        public Executor getExecutor() {
            return this.mExecutor;
        }

        public abstract void onRequestFinished(RequestFinishedInfo arg1);
    }

    public static abstract class Metrics {
        @Nullable
        public abstract Date getConnectEnd();

        @Nullable
        public abstract Date getConnectStart();

        @Nullable
        public abstract Date getDnsEnd();

        @Nullable
        public abstract Date getDnsStart();

        @Nullable
        public abstract Date getPushEnd();

        @Nullable
        public abstract Date getPushStart();

        @Nullable
        public abstract Long getReceivedByteCount();

        @Nullable
        public abstract Date getRequestEnd();

        @Nullable
        public abstract Date getRequestStart();

        @Nullable
        public abstract Date getResponseStart();

        @Nullable
        public abstract Date getSendingEnd();

        @Nullable
        public abstract Date getSendingStart();

        @Nullable
        public abstract Long getSentByteCount();

        public abstract boolean getSocketReused();

        @Nullable
        public abstract Date getSslEnd();

        @Nullable
        public abstract Date getSslStart();

        @Nullable
        public abstract Long getTotalTimeMs();

        @Nullable
        public abstract Long getTtfbMs();
    }

    public static final int CANCELED = 2;
    public static final int FAILED = 1;
    public static final int SUCCEEDED;

    public abstract Collection getAnnotations();

    @Nullable
    public abstract CronetException getException();

    public abstract int getFinishedReason();

    public abstract Metrics getMetrics();

    @Nullable
    public abstract UrlResponseInfo getResponseInfo();

    public abstract String getUrl();
}

