package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class SessionCountersKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder sessionCountersOuterClass$SessionCounters$Builder0) {
                L.p(sessionCountersOuterClass$SessionCounters$Builder0, "builder");
                return new Dsl(sessionCountersOuterClass$SessionCounters$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder sessionCountersOuterClass$SessionCounters$Builder0) {
            this._builder = sessionCountersOuterClass$SessionCounters$Builder0;
        }

        public Dsl(Builder sessionCountersOuterClass$SessionCounters$Builder0, w w0) {
            this(sessionCountersOuterClass$SessionCounters$Builder0);
        }

        @b0
        public final SessionCounters _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (SessionCounters)generatedMessageLite0;
        }

        public final void clearBannerImpressions() {
            this._builder.clearBannerImpressions();
        }

        public final void clearBannerLoadRequests() {
            this._builder.clearBannerLoadRequests();
        }

        public final void clearBannerRequestsAdm() {
            this._builder.clearBannerRequestsAdm();
        }

        public final void clearFocusChangeCount() {
            this._builder.clearFocusChangeCount();
        }

        public final void clearGlobalAdsFocusChangeCount() {
            this._builder.clearGlobalAdsFocusChangeCount();
        }

        public final void clearGlobalAdsFocusTime() {
            this._builder.clearGlobalAdsFocusTime();
        }

        public final void clearLoadRequests() {
            this._builder.clearLoadRequests();
        }

        public final void clearLoadRequestsAdm() {
            this._builder.clearLoadRequestsAdm();
        }

        @i(name = "getBannerImpressions")
        public final int getBannerImpressions() {
            return this._builder.getBannerImpressions();
        }

        @i(name = "getBannerLoadRequests")
        public final int getBannerLoadRequests() {
            return this._builder.getBannerLoadRequests();
        }

        @i(name = "getBannerRequestsAdm")
        public final int getBannerRequestsAdm() {
            return this._builder.getBannerRequestsAdm();
        }

        @i(name = "getFocusChangeCount")
        public final int getFocusChangeCount() {
            return this._builder.getFocusChangeCount();
        }

        @i(name = "getGlobalAdsFocusChangeCount")
        public final int getGlobalAdsFocusChangeCount() {
            return this._builder.getGlobalAdsFocusChangeCount();
        }

        @i(name = "getGlobalAdsFocusTime")
        public final int getGlobalAdsFocusTime() {
            return this._builder.getGlobalAdsFocusTime();
        }

        @i(name = "getLoadRequests")
        public final int getLoadRequests() {
            return this._builder.getLoadRequests();
        }

        @i(name = "getLoadRequestsAdm")
        public final int getLoadRequestsAdm() {
            return this._builder.getLoadRequestsAdm();
        }

        @i(name = "setBannerImpressions")
        public final void setBannerImpressions(int v) {
            this._builder.setBannerImpressions(v);
        }

        @i(name = "setBannerLoadRequests")
        public final void setBannerLoadRequests(int v) {
            this._builder.setBannerLoadRequests(v);
        }

        @i(name = "setBannerRequestsAdm")
        public final void setBannerRequestsAdm(int v) {
            this._builder.setBannerRequestsAdm(v);
        }

        @i(name = "setFocusChangeCount")
        public final void setFocusChangeCount(int v) {
            this._builder.setFocusChangeCount(v);
        }

        @i(name = "setGlobalAdsFocusChangeCount")
        public final void setGlobalAdsFocusChangeCount(int v) {
            this._builder.setGlobalAdsFocusChangeCount(v);
        }

        @i(name = "setGlobalAdsFocusTime")
        public final void setGlobalAdsFocusTime(int v) {
            this._builder.setGlobalAdsFocusTime(v);
        }

        @i(name = "setLoadRequests")
        public final void setLoadRequests(int v) {
            this._builder.setLoadRequests(v);
        }

        @i(name = "setLoadRequestsAdm")
        public final void setLoadRequestsAdm(int v) {
            this._builder.setLoadRequestsAdm(v);
        }
    }

    @l
    public static final SessionCountersKt INSTANCE;

    static {
        SessionCountersKt.INSTANCE = new SessionCountersKt();
    }
}

