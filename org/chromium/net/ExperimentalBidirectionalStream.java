package org.chromium.net;

public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {
    public static abstract class Builder extends org.chromium.net.BidirectionalStream.Builder {
        @Override  // org.chromium.net.BidirectionalStream$Builder
        public org.chromium.net.BidirectionalStream.Builder addHeader(String s, String s1) {
            return this.addHeader(s, s1);
        }

        public abstract Builder addHeader(String arg1, String arg2);

        public Builder addRequestAnnotation(Object object0) {
            return this;
        }

        @Override  // org.chromium.net.BidirectionalStream$Builder
        public BidirectionalStream build() {
            return this.build();
        }

        public abstract ExperimentalBidirectionalStream build();

        @Override  // org.chromium.net.BidirectionalStream$Builder
        public org.chromium.net.BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
            return this.delayRequestHeadersUntilFirstFlush(z);
        }

        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean arg1);

        @Override  // org.chromium.net.BidirectionalStream$Builder
        public org.chromium.net.BidirectionalStream.Builder setHttpMethod(String s) {
            return this.setHttpMethod(s);
        }

        public abstract Builder setHttpMethod(String arg1);

        @Override  // org.chromium.net.BidirectionalStream$Builder
        public org.chromium.net.BidirectionalStream.Builder setPriority(int v) {
            return this.setPriority(v);
        }

        public abstract Builder setPriority(int arg1);

        public Builder setTrafficStatsTag(int v) {
            return this;
        }

        public Builder setTrafficStatsUid(int v) {
            return this;
        }
    }

}

