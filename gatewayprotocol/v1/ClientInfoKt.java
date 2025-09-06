package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class ClientInfoKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder clientInfoOuterClass$ClientInfo$Builder0) {
                L.p(clientInfoOuterClass$ClientInfo$Builder0, "builder");
                return new Dsl(clientInfoOuterClass$ClientInfo$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder clientInfoOuterClass$ClientInfo$Builder0) {
            this._builder = clientInfoOuterClass$ClientInfo$Builder0;
        }

        public Dsl(Builder clientInfoOuterClass$ClientInfo$Builder0, w w0) {
            this(clientInfoOuterClass$ClientInfo$Builder0);
        }

        @b0
        public final ClientInfo _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (ClientInfo)generatedMessageLite0;
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOfferwallVersion() {
            this._builder.clearOfferwallVersion();
        }

        public final void clearOmidPartnerVersion() {
            this._builder.clearOmidPartnerVersion();
        }

        public final void clearOmidVersion() {
            this._builder.clearOmidVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearScarVersionName() {
            this._builder.clearScarVersionName();
        }

        public final void clearSdkDevelopmentPlatform() {
            this._builder.clearSdkDevelopmentPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearTest() {
            this._builder.clearTest();
        }

        @l
        @i(name = "getCustomMediationName")
        public final String getCustomMediationName() {
            String s = this._builder.getCustomMediationName();
            L.o(s, "_builder.getCustomMediationName()");
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
        @i(name = "getOfferwallVersion")
        public final String getOfferwallVersion() {
            String s = this._builder.getOfferwallVersion();
            L.o(s, "_builder.getOfferwallVersion()");
            return s;
        }

        @l
        @i(name = "getOmidPartnerVersion")
        public final String getOmidPartnerVersion() {
            String s = this._builder.getOmidPartnerVersion();
            L.o(s, "_builder.getOmidPartnerVersion()");
            return s;
        }

        @l
        @i(name = "getOmidVersion")
        public final String getOmidVersion() {
            String s = this._builder.getOmidVersion();
            L.o(s, "_builder.getOmidVersion()");
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

        @l
        @i(name = "getScarVersionName")
        public final String getScarVersionName() {
            String s = this._builder.getScarVersionName();
            L.o(s, "_builder.getScarVersionName()");
            return s;
        }

        @l
        @i(name = "getSdkDevelopmentPlatform")
        public final String getSdkDevelopmentPlatform() {
            String s = this._builder.getSdkDevelopmentPlatform();
            L.o(s, "_builder.getSdkDevelopmentPlatform()");
            return s;
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

        @i(name = "getTest")
        public final boolean getTest() {
            return this._builder.getTest();
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasOfferwallVersion() {
            return this._builder.hasOfferwallVersion();
        }

        public final boolean hasOmidPartnerVersion() {
            return this._builder.hasOmidPartnerVersion();
        }

        public final boolean hasOmidVersion() {
            return this._builder.hasOmidVersion();
        }

        public final boolean hasScarVersionName() {
            return this._builder.hasScarVersionName();
        }

        public final boolean hasSdkDevelopmentPlatform() {
            return this._builder.hasSdkDevelopmentPlatform();
        }

        @i(name = "setCustomMediationName")
        public final void setCustomMediationName(@l String s) {
            L.p(s, "value");
            this._builder.setCustomMediationName(s);
        }

        @i(name = "setGameId")
        public final void setGameId(@l String s) {
            L.p(s, "value");
            this._builder.setGameId(s);
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

        @i(name = "setOfferwallVersion")
        public final void setOfferwallVersion(@l String s) {
            L.p(s, "value");
            this._builder.setOfferwallVersion(s);
        }

        @i(name = "setOmidPartnerVersion")
        public final void setOmidPartnerVersion(@l String s) {
            L.p(s, "value");
            this._builder.setOmidPartnerVersion(s);
        }

        @i(name = "setOmidVersion")
        public final void setOmidVersion(@l String s) {
            L.p(s, "value");
            this._builder.setOmidVersion(s);
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

        @i(name = "setScarVersionName")
        public final void setScarVersionName(@l String s) {
            L.p(s, "value");
            this._builder.setScarVersionName(s);
        }

        @i(name = "setSdkDevelopmentPlatform")
        public final void setSdkDevelopmentPlatform(@l String s) {
            L.p(s, "value");
            this._builder.setSdkDevelopmentPlatform(s);
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

        @i(name = "setTest")
        public final void setTest(boolean z) {
            this._builder.setTest(z);
        }
    }

    @l
    public static final ClientInfoKt INSTANCE;

    static {
        ClientInfoKt.INSTANCE = new ClientInfoKt();
    }
}

