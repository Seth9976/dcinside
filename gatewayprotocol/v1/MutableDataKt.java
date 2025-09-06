package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;

public final class MutableDataKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder mutableDataOuterClass$MutableData$Builder0) {
                L.p(mutableDataOuterClass$MutableData$Builder0, "builder");
                return new Dsl(mutableDataOuterClass$MutableData$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder mutableDataOuterClass$MutableData$Builder0) {
            this._builder = mutableDataOuterClass$MutableData$Builder0;
        }

        public Dsl(Builder mutableDataOuterClass$MutableData$Builder0, w w0) {
            this(mutableDataOuterClass$MutableData$Builder0);
        }

        @b0
        public final MutableData _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (MutableData)generatedMessageLite0;
        }

        public final void clearAllowedPii() {
            this._builder.clearAllowedPii();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearCurrentState() {
            this._builder.clearCurrentState();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearPrivacyFsm() {
            this._builder.clearPrivacyFsm();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        @l
        @i(name = "getAllowedPii")
        public final AllowedPii getAllowedPii() {
            AllowedPii allowedPiiOuterClass$AllowedPii0 = this._builder.getAllowedPii();
            L.o(allowedPiiOuterClass$AllowedPii0, "_builder.getAllowedPii()");
            return allowedPiiOuterClass$AllowedPii0;
        }

        @m
        public final AllowedPii getAllowedPiiOrNull(@l Dsl mutableDataKt$Dsl0) {
            L.p(mutableDataKt$Dsl0, "<this>");
            return MutableDataKtKt.getAllowedPiiOrNull(mutableDataKt$Dsl0._builder);
        }

        @l
        @i(name = "getCache")
        public final ByteString getCache() {
            ByteString byteString0 = this._builder.getCache();
            L.o(byteString0, "_builder.getCache()");
            return byteString0;
        }

        @l
        @i(name = "getCurrentState")
        public final ByteString getCurrentState() {
            ByteString byteString0 = this._builder.getCurrentState();
            L.o(byteString0, "_builder.getCurrentState()");
            return byteString0;
        }

        @l
        @i(name = "getPrivacy")
        public final ByteString getPrivacy() {
            ByteString byteString0 = this._builder.getPrivacy();
            L.o(byteString0, "_builder.getPrivacy()");
            return byteString0;
        }

        @l
        @i(name = "getPrivacyFsm")
        public final ByteString getPrivacyFsm() {
            ByteString byteString0 = this._builder.getPrivacyFsm();
            L.o(byteString0, "_builder.getPrivacyFsm()");
            return byteString0;
        }

        @l
        @i(name = "getSessionCounters")
        public final SessionCounters getSessionCounters() {
            SessionCounters sessionCountersOuterClass$SessionCounters0 = this._builder.getSessionCounters();
            L.o(sessionCountersOuterClass$SessionCounters0, "_builder.getSessionCounters()");
            return sessionCountersOuterClass$SessionCounters0;
        }

        @m
        public final SessionCounters getSessionCountersOrNull(@l Dsl mutableDataKt$Dsl0) {
            L.p(mutableDataKt$Dsl0, "<this>");
            return MutableDataKtKt.getSessionCountersOrNull(mutableDataKt$Dsl0._builder);
        }

        @l
        @i(name = "getSessionToken")
        public final ByteString getSessionToken() {
            ByteString byteString0 = this._builder.getSessionToken();
            L.o(byteString0, "_builder.getSessionToken()");
            return byteString0;
        }

        public final boolean hasAllowedPii() {
            return this._builder.hasAllowedPii();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasCurrentState() {
            return this._builder.hasCurrentState();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasPrivacyFsm() {
            return this._builder.hasPrivacyFsm();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasSessionToken() {
            return this._builder.hasSessionToken();
        }

        @i(name = "setAllowedPii")
        public final void setAllowedPii(@l AllowedPii allowedPiiOuterClass$AllowedPii0) {
            L.p(allowedPiiOuterClass$AllowedPii0, "value");
            this._builder.setAllowedPii(allowedPiiOuterClass$AllowedPii0);
        }

        @i(name = "setCache")
        public final void setCache(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setCache(byteString0);
        }

        @i(name = "setCurrentState")
        public final void setCurrentState(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setCurrentState(byteString0);
        }

        @i(name = "setPrivacy")
        public final void setPrivacy(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setPrivacy(byteString0);
        }

        @i(name = "setPrivacyFsm")
        public final void setPrivacyFsm(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setPrivacyFsm(byteString0);
        }

        @i(name = "setSessionCounters")
        public final void setSessionCounters(@l SessionCounters sessionCountersOuterClass$SessionCounters0) {
            L.p(sessionCountersOuterClass$SessionCounters0, "value");
            this._builder.setSessionCounters(sessionCountersOuterClass$SessionCounters0);
        }

        @i(name = "setSessionToken")
        public final void setSessionToken(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setSessionToken(byteString0);
        }
    }

    @l
    public static final MutableDataKt INSTANCE;

    static {
        MutableDataKt.INSTANCE = new MutableDataKt();
    }
}

