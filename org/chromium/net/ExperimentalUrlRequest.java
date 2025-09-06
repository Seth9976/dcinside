package org.chromium.net;

import java.util.concurrent.Executor;

public abstract class ExperimentalUrlRequest extends UrlRequest {
    public static abstract class Builder extends org.chromium.net.UrlRequest.Builder {
        public abstract Builder addHeader(String arg1, String arg2);

        @Override  // org.chromium.net.UrlRequest$Builder
        public org.chromium.net.UrlRequest.Builder addHeader(String s, String s1) {
            return this.addHeader(s, s1);
        }

        public Builder addRequestAnnotation(Object object0) {
            return this;
        }

        public abstract Builder allowDirectExecutor();

        @Override  // org.chromium.net.UrlRequest$Builder
        public org.chromium.net.UrlRequest.Builder allowDirectExecutor() {
            return this.allowDirectExecutor();
        }

        public abstract ExperimentalUrlRequest build();

        @Override  // org.chromium.net.UrlRequest$Builder
        public UrlRequest build() {
            return this.build();
        }

        public abstract Builder disableCache();

        @Override  // org.chromium.net.UrlRequest$Builder
        public org.chromium.net.UrlRequest.Builder disableCache() {
            return this.disableCache();
        }

        public Builder disableConnectionMigration() {
            return this;
        }

        public abstract Builder setHttpMethod(String arg1);

        @Override  // org.chromium.net.UrlRequest$Builder
        public org.chromium.net.UrlRequest.Builder setHttpMethod(String s) {
            return this.setHttpMethod(s);
        }

        public abstract Builder setPriority(int arg1);

        @Override  // org.chromium.net.UrlRequest$Builder
        public org.chromium.net.UrlRequest.Builder setPriority(int v) {
            return this.setPriority(v);
        }

        public Builder setRequestFinishedListener(Listener requestFinishedInfo$Listener0) {
            return this;
        }

        public Builder setTrafficStatsTag(int v) {
            return this;
        }

        public Builder setTrafficStatsUid(int v) {
            return this;
        }

        public abstract Builder setUploadDataProvider(UploadDataProvider arg1, Executor arg2);

        @Override  // org.chromium.net.UrlRequest$Builder
        public org.chromium.net.UrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider0, Executor executor0) {
            return this.setUploadDataProvider(uploadDataProvider0, executor0);
        }
    }

}

