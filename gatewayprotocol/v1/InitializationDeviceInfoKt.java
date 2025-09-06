package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class InitializationDeviceInfoKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder initializationRequestOuterClass$InitializationDeviceInfo$Builder0) {
                L.p(initializationRequestOuterClass$InitializationDeviceInfo$Builder0, "builder");
                return new Dsl(initializationRequestOuterClass$InitializationDeviceInfo$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder initializationRequestOuterClass$InitializationDeviceInfo$Builder0) {
            this._builder = initializationRequestOuterClass$InitializationDeviceInfo$Builder0;
        }

        public Dsl(Builder initializationRequestOuterClass$InitializationDeviceInfo$Builder0, w w0) {
            this(initializationRequestOuterClass$InitializationDeviceInfo$Builder0);
        }

        @b0
        public final InitializationDeviceInfo _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (InitializationDeviceInfo)generatedMessageLite0;
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearCurrentUiTheme() {
            this._builder.clearCurrentUiTheme();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearHashedDeviceName() {
            this._builder.clearHashedDeviceName();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLocalList() {
            this._builder.clearLocalList();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearSystemBootTime() {
            this._builder.clearSystemBootTime();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearTrackingAuthStatus() {
            this._builder.clearTrackingAuthStatus();
        }

        @i(name = "getBatteryLevel")
        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        @i(name = "getBatteryStatus")
        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        @l
        @i(name = "getBundleId")
        public final String getBundleId() {
            String s = this._builder.getBundleId();
            L.o(s, "_builder.getBundleId()");
            return s;
        }

        @l
        @i(name = "getConnectionType")
        public final String getConnectionType() {
            String s = this._builder.getConnectionType();
            L.o(s, "_builder.getConnectionType()");
            return s;
        }

        @i(name = "getCurrentUiTheme")
        public final long getCurrentUiTheme() {
            return this._builder.getCurrentUiTheme();
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
        @i(name = "getHashedDeviceName")
        public final String getHashedDeviceName() {
            String s = this._builder.getHashedDeviceName();
            L.o(s, "_builder.getHashedDeviceName()");
            return s;
        }

        @l
        @i(name = "getLanguage")
        public final String getLanguage() {
            String s = this._builder.getLanguage();
            L.o(s, "_builder.getLanguage()");
            return s;
        }

        @l
        @i(name = "getLocalList")
        public final String getLocalList() {
            String s = this._builder.getLocalList();
            L.o(s, "_builder.getLocalList()");
            return s;
        }

        @l
        @i(name = "getNetworkOperator")
        public final String getNetworkOperator() {
            String s = this._builder.getNetworkOperator();
            L.o(s, "_builder.getNetworkOperator()");
            return s;
        }

        @l
        @i(name = "getOsVersion")
        public final String getOsVersion() {
            String s = this._builder.getOsVersion();
            L.o(s, "_builder.getOsVersion()");
            return s;
        }

        @i(name = "getSystemBootTime")
        public final long getSystemBootTime() {
            return this._builder.getSystemBootTime();
        }

        @i(name = "getTotalDiskSpace")
        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        @i(name = "getTotalRamMemory")
        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        @i(name = "getTrackingAuthStatus")
        public final int getTrackingAuthStatus() {
            return this._builder.getTrackingAuthStatus();
        }

        public final boolean hasTrackingAuthStatus() {
            return this._builder.hasTrackingAuthStatus();
        }

        @i(name = "setBatteryLevel")
        public final void setBatteryLevel(double f) {
            this._builder.setBatteryLevel(f);
        }

        @i(name = "setBatteryStatus")
        public final void setBatteryStatus(int v) {
            this._builder.setBatteryStatus(v);
        }

        @i(name = "setBundleId")
        public final void setBundleId(@l String s) {
            L.p(s, "value");
            this._builder.setBundleId(s);
        }

        @i(name = "setConnectionType")
        public final void setConnectionType(@l String s) {
            L.p(s, "value");
            this._builder.setConnectionType(s);
        }

        @i(name = "setCurrentUiTheme")
        public final void setCurrentUiTheme(long v) {
            this._builder.setCurrentUiTheme(v);
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

        @i(name = "setHashedDeviceName")
        public final void setHashedDeviceName(@l String s) {
            L.p(s, "value");
            this._builder.setHashedDeviceName(s);
        }

        @i(name = "setLanguage")
        public final void setLanguage(@l String s) {
            L.p(s, "value");
            this._builder.setLanguage(s);
        }

        @i(name = "setLocalList")
        public final void setLocalList(@l String s) {
            L.p(s, "value");
            this._builder.setLocalList(s);
        }

        @i(name = "setNetworkOperator")
        public final void setNetworkOperator(@l String s) {
            L.p(s, "value");
            this._builder.setNetworkOperator(s);
        }

        @i(name = "setOsVersion")
        public final void setOsVersion(@l String s) {
            L.p(s, "value");
            this._builder.setOsVersion(s);
        }

        @i(name = "setSystemBootTime")
        public final void setSystemBootTime(long v) {
            this._builder.setSystemBootTime(v);
        }

        @i(name = "setTotalDiskSpace")
        public final void setTotalDiskSpace(long v) {
            this._builder.setTotalDiskSpace(v);
        }

        @i(name = "setTotalRamMemory")
        public final void setTotalRamMemory(long v) {
            this._builder.setTotalRamMemory(v);
        }

        @i(name = "setTrackingAuthStatus")
        public final void setTrackingAuthStatus(int v) {
            this._builder.setTrackingAuthStatus(v);
        }
    }

    @l
    public static final InitializationDeviceInfoKt INSTANCE;

    static {
        InitializationDeviceInfoKt.INSTANCE = new InitializationDeviceInfoKt();
    }
}

