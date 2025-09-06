package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class InitializationRequestKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder initializationRequestOuterClass$InitializationRequest$Builder0) {
                L.p(initializationRequestOuterClass$InitializationRequest$Builder0, "builder");
                return new Dsl(initializationRequestOuterClass$InitializationRequest$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder initializationRequestOuterClass$InitializationRequest$Builder0) {
            this._builder = initializationRequestOuterClass$InitializationRequest$Builder0;
        }

        public Dsl(Builder initializationRequestOuterClass$InitializationRequest$Builder0, w w0) {
            this(initializationRequestOuterClass$InitializationRequest$Builder0);
        }

        @b0
        public final InitializationRequest _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (InitializationRequest)generatedMessageLite0;
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        @l
        @i(name = "getAnalyticsUserId")
        public final String getAnalyticsUserId() {
            String s = this._builder.getAnalyticsUserId();
            L.o(s, "_builder.getAnalyticsUserId()");
            return s;
        }

        @l
        @i(name = "getAuid")
        public final ByteString getAuid() {
            ByteString byteString0 = this._builder.getAuid();
            L.o(byteString0, "_builder.getAuid()");
            return byteString0;
        }

        @l
        @i(name = "getAuidString")
        public final String getAuidString() {
            String s = this._builder.getAuidString();
            L.o(s, "_builder.getAuidString()");
            return s;
        }

        @l
        @i(name = "getCache")
        public final ByteString getCache() {
            ByteString byteString0 = this._builder.getCache();
            L.o(byteString0, "_builder.getCache()");
            return byteString0;
        }

        @l
        @i(name = "getClientInfo")
        public final ClientInfo getClientInfo() {
            ClientInfo clientInfoOuterClass$ClientInfo0 = this._builder.getClientInfo();
            L.o(clientInfoOuterClass$ClientInfo0, "_builder.getClientInfo()");
            return clientInfoOuterClass$ClientInfo0;
        }

        @l
        @i(name = "getDeviceInfo")
        public final InitializationDeviceInfo getDeviceInfo() {
            InitializationDeviceInfo initializationRequestOuterClass$InitializationDeviceInfo0 = this._builder.getDeviceInfo();
            L.o(initializationRequestOuterClass$InitializationDeviceInfo0, "_builder.getDeviceInfo()");
            return initializationRequestOuterClass$InitializationDeviceInfo0;
        }

        @l
        @i(name = "getIdfi")
        public final String getIdfi() {
            String s = this._builder.getIdfi();
            L.o(s, "_builder.getIdfi()");
            return s;
        }

        @i(name = "getIsFirstInit")
        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        @l
        @i(name = "getLegacyFlowUserConsent")
        public final String getLegacyFlowUserConsent() {
            String s = this._builder.getLegacyFlowUserConsent();
            L.o(s, "_builder.getLegacyFlowUserConsent()");
            return s;
        }

        @l
        @i(name = "getPrivacy")
        public final ByteString getPrivacy() {
            ByteString byteString0 = this._builder.getPrivacy();
            L.o(byteString0, "_builder.getPrivacy()");
            return byteString0;
        }

        @l
        @i(name = "getSessionId")
        public final ByteString getSessionId() {
            ByteString byteString0 = this._builder.getSessionId();
            L.o(byteString0, "_builder.getSessionId()");
            return byteString0;
        }

        @l
        @i(name = "getUadsInitBlob")
        public final ByteString getUadsInitBlob() {
            ByteString byteString0 = this._builder.getUadsInitBlob();
            L.o(byteString0, "_builder.getUadsInitBlob()");
            return byteString0;
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        @i(name = "setAnalyticsUserId")
        public final void setAnalyticsUserId(@l String s) {
            L.p(s, "value");
            this._builder.setAnalyticsUserId(s);
        }

        @i(name = "setAuid")
        public final void setAuid(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setAuid(byteString0);
        }

        @i(name = "setAuidString")
        public final void setAuidString(@l String s) {
            L.p(s, "value");
            this._builder.setAuidString(s);
        }

        @i(name = "setCache")
        public final void setCache(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setCache(byteString0);
        }

        @i(name = "setClientInfo")
        public final void setClientInfo(@l ClientInfo clientInfoOuterClass$ClientInfo0) {
            L.p(clientInfoOuterClass$ClientInfo0, "value");
            this._builder.setClientInfo(clientInfoOuterClass$ClientInfo0);
        }

        @i(name = "setDeviceInfo")
        public final void setDeviceInfo(@l InitializationDeviceInfo initializationRequestOuterClass$InitializationDeviceInfo0) {
            L.p(initializationRequestOuterClass$InitializationDeviceInfo0, "value");
            this._builder.setDeviceInfo(initializationRequestOuterClass$InitializationDeviceInfo0);
        }

        @i(name = "setIdfi")
        public final void setIdfi(@l String s) {
            L.p(s, "value");
            this._builder.setIdfi(s);
        }

        @i(name = "setIsFirstInit")
        public final void setIsFirstInit(boolean z) {
            this._builder.setIsFirstInit(z);
        }

        @i(name = "setLegacyFlowUserConsent")
        public final void setLegacyFlowUserConsent(@l String s) {
            L.p(s, "value");
            this._builder.setLegacyFlowUserConsent(s);
        }

        @i(name = "setPrivacy")
        public final void setPrivacy(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setPrivacy(byteString0);
        }

        @i(name = "setSessionId")
        public final void setSessionId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setSessionId(byteString0);
        }

        @i(name = "setUadsInitBlob")
        public final void setUadsInitBlob(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setUadsInitBlob(byteString0);
        }
    }

    @l
    public static final InitializationRequestKt INSTANCE;

    static {
        InitializationRequestKt.INSTANCE = new InitializationRequestKt();
    }
}

