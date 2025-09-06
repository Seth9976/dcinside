package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class LimitedSessionTokenKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder universalRequestOuterClass$LimitedSessionToken$Builder0) {
                L.p(universalRequestOuterClass$LimitedSessionToken$Builder0, "builder");
                return new Dsl(universalRequestOuterClass$LimitedSessionToken$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder universalRequestOuterClass$LimitedSessionToken$Builder0) {
            this._builder = universalRequestOuterClass$LimitedSessionToken$Builder0;
        }

        public Dsl(Builder universalRequestOuterClass$LimitedSessionToken$Builder0, w w0) {
            this(universalRequestOuterClass$LimitedSessionToken$Builder0);
        }

        @b0
        public final LimitedSessionToken _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (LimitedSessionToken)generatedMessageLite0;
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        @l
        @i(name = "getCustomMediationName")
        public final String getCustomMediationName() {
            String s = this._builder.getCustomMediationName();
            L.o(s, "_builder.getCustomMediationName()");
            return s;
        }

        @l
        @i(name = "getDeviceMake")
        public final String getDeviceMake() {
            String s = this._builder.getDeviceMake();
            L.o(s, "_builder.getDeviceMake()");
            return s;
        }

        @l
        @i(name = "getDeviceModel")
        public final String getDeviceModel() {
            String s = this._builder.getDeviceModel();
            L.o(s, "_builder.getDeviceModel()");
            return s;
        }

        @l
        @i(name = "getGameId")
        public final String getGameId() {
            String s = this._builder.getGameId();
            L.o(s, "_builder.getGameId()");
            return s;
        }

        @l
        @i(name = "getIdfi")
        public final String getIdfi() {
            String s = this._builder.getIdfi();
            L.o(s, "_builder.getIdfi()");
            return s;
        }

        @l
        @i(name = "getMediationProvider")
        public final MediationProvider getMediationProvider() {
            MediationProvider clientInfoOuterClass$MediationProvider0 = this._builder.getMediationProvider();
            L.o(clientInfoOuterClass$MediationProvider0, "_builder.getMediationProvider()");
            return clientInfoOuterClass$MediationProvider0;
        }

        @i(name = "getMediationProviderValue")
        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        @l
        @i(name = "getMediationVersion")
        public final String getMediationVersion() {
            String s = this._builder.getMediationVersion();
            L.o(s, "_builder.getMediationVersion()");
            return s;
        }

        @l
        @i(name = "getOsVersion")
        public final String getOsVersion() {
            String s = this._builder.getOsVersion();
            L.o(s, "_builder.getOsVersion()");
            return s;
        }

        @l
        @i(name = "getPlatform")
        public final Platform getPlatform() {
            Platform clientInfoOuterClass$Platform0 = this._builder.getPlatform();
            L.o(clientInfoOuterClass$Platform0, "_builder.getPlatform()");
            return clientInfoOuterClass$Platform0;
        }

        @i(name = "getPlatformValue")
        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        @i(name = "getSdkVersion")
        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        @l
        @i(name = "getSdkVersionName")
        public final String getSdkVersionName() {
            String s = this._builder.getSdkVersionName();
            L.o(s, "_builder.getSdkVersionName()");
            return s;
        }

        @l
        @i(name = "getSessionId")
        public final ByteString getSessionId() {
            ByteString byteString0 = this._builder.getSessionId();
            L.o(byteString0, "_builder.getSessionId()");
            return byteString0;
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasSessionId() {
            return this._builder.hasSessionId();
        }

        @i(name = "setCustomMediationName")
        public final void setCustomMediationName(@l String s) {
            L.p(s, "value");
            this._builder.setCustomMediationName(s);
        }

        @i(name = "setDeviceMake")
        public final void setDeviceMake(@l String s) {
            L.p(s, "value");
            this._builder.setDeviceMake(s);
        }

        @i(name = "setDeviceModel")
        public final void setDeviceModel(@l String s) {
            L.p(s, "value");
            this._builder.setDeviceModel(s);
        }

        @i(name = "setGameId")
        public final void setGameId(@l String s) {
            L.p(s, "value");
            this._builder.setGameId(s);
        }

        @i(name = "setIdfi")
        public final void setIdfi(@l String s) {
            L.p(s, "value");
            this._builder.setIdfi(s);
        }

        @i(name = "setMediationProvider")
        public final void setMediationProvider(@l MediationProvider clientInfoOuterClass$MediationProvider0) {
            L.p(clientInfoOuterClass$MediationProvider0, "value");
            this._builder.setMediationProvider(clientInfoOuterClass$MediationProvider0);
        }

        @i(name = "setMediationProviderValue")
        public final void setMediationProviderValue(int v) {
            this._builder.setMediationProviderValue(v);
        }

        @i(name = "setMediationVersion")
        public final void setMediationVersion(@l String s) {
            L.p(s, "value");
            this._builder.setMediationVersion(s);
        }

        @i(name = "setOsVersion")
        public final void setOsVersion(@l String s) {
            L.p(s, "value");
            this._builder.setOsVersion(s);
        }

        @i(name = "setPlatform")
        public final void setPlatform(@l Platform clientInfoOuterClass$Platform0) {
            L.p(clientInfoOuterClass$Platform0, "value");
            this._builder.setPlatform(clientInfoOuterClass$Platform0);
        }

        @i(name = "setPlatformValue")
        public final void setPlatformValue(int v) {
            this._builder.setPlatformValue(v);
        }

        @i(name = "setSdkVersion")
        public final void setSdkVersion(int v) {
            this._builder.setSdkVersion(v);
        }

        @i(name = "setSdkVersionName")
        public final void setSdkVersionName(@l String s) {
            L.p(s, "value");
            this._builder.setSdkVersionName(s);
        }

        @i(name = "setSessionId")
        public final void setSessionId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setSessionId(byteString0);
        }
    }

    @l
    public static final LimitedSessionTokenKt INSTANCE;

    static {
        LimitedSessionTokenKt.INSTANCE = new LimitedSessionTokenKt();
    }
}

