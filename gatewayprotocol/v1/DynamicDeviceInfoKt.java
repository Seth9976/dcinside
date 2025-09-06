package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

@s0({"SMAP\nDynamicDeviceInfoKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicDeviceInfoKt.kt\ngatewayprotocol/v1/DynamicDeviceInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1533:1\n1#2:1534\n*E\n"})
public final class DynamicDeviceInfoKt {
    public static final class AndroidKt {
        @ProtoDslMarker
        public static final class Dsl {
            public static final class Companion {
                private Companion() {
                }

                public Companion(w w0) {
                }

                @b0
                public final Dsl _create(Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0) {
                    L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0, "builder");
                    return new Dsl(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0, null);
                }
            }

            @l
            public static final Companion Companion;
            @l
            private final Builder _builder;

            static {
                Dsl.Companion = new Companion(null);
            }

            private Dsl(Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0) {
                this._builder = dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0;
            }

            public Dsl(Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0, w w0) {
                this(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0);
            }

            @b0
            public final Android _build() {
                GeneratedMessageLite generatedMessageLite0 = this._builder.build();
                L.o(generatedMessageLite0, "_builder.build()");
                return (Android)generatedMessageLite0;
            }

            public final void clearAdbEnabled() {
                this._builder.clearAdbEnabled();
            }

            public final void clearAirplaneMode() {
                this._builder.clearAirplaneMode();
            }

            public final void clearChargingType() {
                this._builder.clearChargingType();
            }

            public final void clearDeviceElapsedRealtime() {
                this._builder.clearDeviceElapsedRealtime();
            }

            public final void clearDeviceUpTime() {
                this._builder.clearDeviceUpTime();
            }

            public final void clearMaxVolume() {
                this._builder.clearMaxVolume();
            }

            public final void clearNetworkCapabilityTransports() {
                this._builder.clearNetworkCapabilityTransports();
            }

            public final void clearNetworkConnected() {
                this._builder.clearNetworkConnected();
            }

            public final void clearNetworkMetered() {
                this._builder.clearNetworkMetered();
            }

            public final void clearNetworkType() {
                this._builder.clearNetworkType();
            }

            public final void clearSdCardPresent() {
                this._builder.clearSdCardPresent();
            }

            public final void clearStayOnWhilePluggedIn() {
                this._builder.clearStayOnWhilePluggedIn();
            }

            public final void clearTelephonyManagerNetworkType() {
                this._builder.clearTelephonyManagerNetworkType();
            }

            public final void clearUsbConnected() {
                this._builder.clearUsbConnected();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            @i(name = "getAdbEnabled")
            public final boolean getAdbEnabled() {
                return this._builder.getAdbEnabled();
            }

            @i(name = "getAirplaneMode")
            public final boolean getAirplaneMode() {
                return this._builder.getAirplaneMode();
            }

            @i(name = "getChargingType")
            public final int getChargingType() {
                return this._builder.getChargingType();
            }

            @i(name = "getDeviceElapsedRealtime")
            public final long getDeviceElapsedRealtime() {
                return this._builder.getDeviceElapsedRealtime();
            }

            @i(name = "getDeviceUpTime")
            public final long getDeviceUpTime() {
                return this._builder.getDeviceUpTime();
            }

            @i(name = "getMaxVolume")
            public final double getMaxVolume() {
                return this._builder.getMaxVolume();
            }

            @l
            @i(name = "getNetworkCapabilityTransports")
            public final NetworkCapabilityTransports getNetworkCapabilityTransports() {
                NetworkCapabilityTransports networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0 = this._builder.getNetworkCapabilityTransports();
                L.o(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0, "_builder.getNetworkCapabilityTransports()");
                return networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0;
            }

            @i(name = "getNetworkConnected")
            public final boolean getNetworkConnected() {
                return this._builder.getNetworkConnected();
            }

            @i(name = "getNetworkMetered")
            public final boolean getNetworkMetered() {
                return this._builder.getNetworkMetered();
            }

            @i(name = "getNetworkType")
            public final int getNetworkType() {
                return this._builder.getNetworkType();
            }

            @i(name = "getSdCardPresent")
            public final boolean getSdCardPresent() {
                return this._builder.getSdCardPresent();
            }

            @i(name = "getStayOnWhilePluggedIn")
            public final boolean getStayOnWhilePluggedIn() {
                return this._builder.getStayOnWhilePluggedIn();
            }

            @i(name = "getTelephonyManagerNetworkType")
            public final int getTelephonyManagerNetworkType() {
                return this._builder.getTelephonyManagerNetworkType();
            }

            @i(name = "getUsbConnected")
            public final boolean getUsbConnected() {
                return this._builder.getUsbConnected();
            }

            @i(name = "getVolume")
            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasAdbEnabled() {
                return this._builder.hasAdbEnabled();
            }

            public final boolean hasAirplaneMode() {
                return this._builder.hasAirplaneMode();
            }

            public final boolean hasChargingType() {
                return this._builder.hasChargingType();
            }

            public final boolean hasDeviceElapsedRealtime() {
                return this._builder.hasDeviceElapsedRealtime();
            }

            public final boolean hasDeviceUpTime() {
                return this._builder.hasDeviceUpTime();
            }

            public final boolean hasMaxVolume() {
                return this._builder.hasMaxVolume();
            }

            public final boolean hasNetworkCapabilityTransports() {
                return this._builder.hasNetworkCapabilityTransports();
            }

            public final boolean hasNetworkConnected() {
                return this._builder.hasNetworkConnected();
            }

            public final boolean hasNetworkMetered() {
                return this._builder.hasNetworkMetered();
            }

            public final boolean hasNetworkType() {
                return this._builder.hasNetworkType();
            }

            public final boolean hasSdCardPresent() {
                return this._builder.hasSdCardPresent();
            }

            public final boolean hasStayOnWhilePluggedIn() {
                return this._builder.hasStayOnWhilePluggedIn();
            }

            public final boolean hasTelephonyManagerNetworkType() {
                return this._builder.hasTelephonyManagerNetworkType();
            }

            public final boolean hasUsbConnected() {
                return this._builder.hasUsbConnected();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            @i(name = "setAdbEnabled")
            public final void setAdbEnabled(boolean z) {
                this._builder.setAdbEnabled(z);
            }

            @i(name = "setAirplaneMode")
            public final void setAirplaneMode(boolean z) {
                this._builder.setAirplaneMode(z);
            }

            @i(name = "setChargingType")
            public final void setChargingType(int v) {
                this._builder.setChargingType(v);
            }

            @i(name = "setDeviceElapsedRealtime")
            public final void setDeviceElapsedRealtime(long v) {
                this._builder.setDeviceElapsedRealtime(v);
            }

            @i(name = "setDeviceUpTime")
            public final void setDeviceUpTime(long v) {
                this._builder.setDeviceUpTime(v);
            }

            @i(name = "setMaxVolume")
            public final void setMaxVolume(double f) {
                this._builder.setMaxVolume(f);
            }

            @i(name = "setNetworkCapabilityTransports")
            public final void setNetworkCapabilityTransports(@l NetworkCapabilityTransports networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0) {
                L.p(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0, "value");
                this._builder.setNetworkCapabilityTransports(networkCapabilityTransportsOuterClass$NetworkCapabilityTransports0);
            }

            @i(name = "setNetworkConnected")
            public final void setNetworkConnected(boolean z) {
                this._builder.setNetworkConnected(z);
            }

            @i(name = "setNetworkMetered")
            public final void setNetworkMetered(boolean z) {
                this._builder.setNetworkMetered(z);
            }

            @i(name = "setNetworkType")
            public final void setNetworkType(int v) {
                this._builder.setNetworkType(v);
            }

            @i(name = "setSdCardPresent")
            public final void setSdCardPresent(boolean z) {
                this._builder.setSdCardPresent(z);
            }

            @i(name = "setStayOnWhilePluggedIn")
            public final void setStayOnWhilePluggedIn(boolean z) {
                this._builder.setStayOnWhilePluggedIn(z);
            }

            @i(name = "setTelephonyManagerNetworkType")
            public final void setTelephonyManagerNetworkType(int v) {
                this._builder.setTelephonyManagerNetworkType(v);
            }

            @i(name = "setUsbConnected")
            public final void setUsbConnected(boolean z) {
                this._builder.setUsbConnected(z);
            }

            @i(name = "setVolume")
            public final void setVolume(double f) {
                this._builder.setVolume(f);
            }
        }

        @l
        public static final AndroidKt INSTANCE;

        static {
            AndroidKt.INSTANCE = new AndroidKt();
        }
    }

    @ProtoDslMarker
    public static final class gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl {
        public static final class gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion {
            private gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion() {
            }

            public gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion(w w0) {
            }

            @b0
            public final gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl _create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0) {
                L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0, "builder");
                return new gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0, null);
            }
        }

        @l
        public static final gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion Companion;
        @l
        private final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder _builder;

        static {
            gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion = new gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl.Companion(null);
        }

        private gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0) {
            this._builder = dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0;
        }

        public gatewayprotocol.v1.DynamicDeviceInfoKt.Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0, w w0) {
            this(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0);
        }

        @b0
        public final DynamicDeviceInfo _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (DynamicDeviceInfo)generatedMessageLite0;
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppActive() {
            this._builder.clearAppActive();
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearFreeDiskSpace() {
            this._builder.clearFreeDiskSpace();
        }

        public final void clearFreeRamMemory() {
            this._builder.clearFreeRamMemory();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLimitedOpenAdTracking() {
            this._builder.clearLimitedOpenAdTracking();
        }

        public final void clearLimitedTracking() {
            this._builder.clearLimitedTracking();
        }

        public final void clearLowPowerMode() {
            this._builder.clearLowPowerMode();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearNetworkOperatorName() {
            this._builder.clearNetworkOperatorName();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final void clearTimeZone() {
            this._builder.clearTimeZone();
        }

        public final void clearTimeZoneOffset() {
            this._builder.clearTimeZoneOffset();
        }

        public final void clearUserId() {
            this._builder.clearUserId();
        }

        public final void clearWiredHeadset() {
            this._builder.clearWiredHeadset();
        }

        @l
        @i(name = "getAndroid")
        public final Android getAndroid() {
            Android dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0 = this._builder.getAndroid();
            L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0, "_builder.getAndroid()");
            return dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0;
        }

        @i(name = "getAppActive")
        public final boolean getAppActive() {
            return this._builder.getAppActive();
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
        @i(name = "getConnectionType")
        public final ConnectionType getConnectionType() {
            ConnectionType dynamicDeviceInfoOuterClass$ConnectionType0 = this._builder.getConnectionType();
            L.o(dynamicDeviceInfoOuterClass$ConnectionType0, "_builder.getConnectionType()");
            return dynamicDeviceInfoOuterClass$ConnectionType0;
        }

        @i(name = "getConnectionTypeValue")
        public final int getConnectionTypeValue() {
            return this._builder.getConnectionTypeValue();
        }

        @i(name = "getFreeDiskSpace")
        public final long getFreeDiskSpace() {
            return this._builder.getFreeDiskSpace();
        }

        @i(name = "getFreeRamMemory")
        public final long getFreeRamMemory() {
            return this._builder.getFreeRamMemory();
        }

        @l
        @i(name = "getIos")
        public final Ios getIos() {
            Ios dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0 = this._builder.getIos();
            L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0, "_builder.getIos()");
            return dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0;
        }

        @l
        @i(name = "getLanguage")
        public final String getLanguage() {
            String s = this._builder.getLanguage();
            L.o(s, "_builder.getLanguage()");
            return s;
        }

        @i(name = "getLimitedOpenAdTracking")
        public final boolean getLimitedOpenAdTracking() {
            return this._builder.getLimitedOpenAdTracking();
        }

        @i(name = "getLimitedTracking")
        public final boolean getLimitedTracking() {
            return this._builder.getLimitedTracking();
        }

        @i(name = "getLowPowerMode")
        public final boolean getLowPowerMode() {
            return this._builder.getLowPowerMode();
        }

        @l
        @i(name = "getNetworkOperator")
        public final String getNetworkOperator() {
            String s = this._builder.getNetworkOperator();
            L.o(s, "_builder.getNetworkOperator()");
            return s;
        }

        @l
        @i(name = "getNetworkOperatorName")
        public final String getNetworkOperatorName() {
            String s = this._builder.getNetworkOperatorName();
            L.o(s, "_builder.getNetworkOperatorName()");
            return s;
        }

        @l
        @i(name = "getPlatformSpecificCase")
        public final PlatformSpecificCase getPlatformSpecificCase() {
            PlatformSpecificCase dynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase0 = this._builder.getPlatformSpecificCase();
            L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase0, "_builder.getPlatformSpecificCase()");
            return dynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase0;
        }

        @i(name = "getScreenHeight")
        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        @i(name = "getScreenWidth")
        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        @l
        @i(name = "getTimeZone")
        public final String getTimeZone() {
            String s = this._builder.getTimeZone();
            L.o(s, "_builder.getTimeZone()");
            return s;
        }

        @i(name = "getTimeZoneOffset")
        public final long getTimeZoneOffset() {
            return this._builder.getTimeZoneOffset();
        }

        @l
        @i(name = "getUserId")
        public final String getUserId() {
            String s = this._builder.getUserId();
            L.o(s, "_builder.getUserId()");
            return s;
        }

        @i(name = "getWiredHeadset")
        public final boolean getWiredHeadset() {
            return this._builder.getWiredHeadset();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppActive() {
            return this._builder.hasAppActive();
        }

        public final boolean hasBatteryLevel() {
            return this._builder.hasBatteryLevel();
        }

        public final boolean hasBatteryStatus() {
            return this._builder.hasBatteryStatus();
        }

        public final boolean hasConnectionType() {
            return this._builder.hasConnectionType();
        }

        public final boolean hasFreeDiskSpace() {
            return this._builder.hasFreeDiskSpace();
        }

        public final boolean hasFreeRamMemory() {
            return this._builder.hasFreeRamMemory();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasLanguage() {
            return this._builder.hasLanguage();
        }

        public final boolean hasLimitedOpenAdTracking() {
            return this._builder.hasLimitedOpenAdTracking();
        }

        public final boolean hasLimitedTracking() {
            return this._builder.hasLimitedTracking();
        }

        public final boolean hasLowPowerMode() {
            return this._builder.hasLowPowerMode();
        }

        public final boolean hasNetworkOperator() {
            return this._builder.hasNetworkOperator();
        }

        public final boolean hasNetworkOperatorName() {
            return this._builder.hasNetworkOperatorName();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTimeZone() {
            return this._builder.hasTimeZone();
        }

        public final boolean hasTimeZoneOffset() {
            return this._builder.hasTimeZoneOffset();
        }

        public final boolean hasUserId() {
            return this._builder.hasUserId();
        }

        public final boolean hasWiredHeadset() {
            return this._builder.hasWiredHeadset();
        }

        @i(name = "setAndroid")
        public final void setAndroid(@l Android dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0) {
            L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0, "value");
            this._builder.setAndroid(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android0);
        }

        @i(name = "setAppActive")
        public final void setAppActive(boolean z) {
            this._builder.setAppActive(z);
        }

        @i(name = "setBatteryLevel")
        public final void setBatteryLevel(double f) {
            this._builder.setBatteryLevel(f);
        }

        @i(name = "setBatteryStatus")
        public final void setBatteryStatus(int v) {
            this._builder.setBatteryStatus(v);
        }

        @i(name = "setConnectionType")
        public final void setConnectionType(@l ConnectionType dynamicDeviceInfoOuterClass$ConnectionType0) {
            L.p(dynamicDeviceInfoOuterClass$ConnectionType0, "value");
            this._builder.setConnectionType(dynamicDeviceInfoOuterClass$ConnectionType0);
        }

        @i(name = "setConnectionTypeValue")
        public final void setConnectionTypeValue(int v) {
            this._builder.setConnectionTypeValue(v);
        }

        @i(name = "setFreeDiskSpace")
        public final void setFreeDiskSpace(long v) {
            this._builder.setFreeDiskSpace(v);
        }

        @i(name = "setFreeRamMemory")
        public final void setFreeRamMemory(long v) {
            this._builder.setFreeRamMemory(v);
        }

        @i(name = "setIos")
        public final void setIos(@l Ios dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0) {
            L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0, "value");
            this._builder.setIos(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios0);
        }

        @i(name = "setLanguage")
        public final void setLanguage(@l String s) {
            L.p(s, "value");
            this._builder.setLanguage(s);
        }

        @i(name = "setLimitedOpenAdTracking")
        public final void setLimitedOpenAdTracking(boolean z) {
            this._builder.setLimitedOpenAdTracking(z);
        }

        @i(name = "setLimitedTracking")
        public final void setLimitedTracking(boolean z) {
            this._builder.setLimitedTracking(z);
        }

        @i(name = "setLowPowerMode")
        public final void setLowPowerMode(boolean z) {
            this._builder.setLowPowerMode(z);
        }

        @i(name = "setNetworkOperator")
        public final void setNetworkOperator(@l String s) {
            L.p(s, "value");
            this._builder.setNetworkOperator(s);
        }

        @i(name = "setNetworkOperatorName")
        public final void setNetworkOperatorName(@l String s) {
            L.p(s, "value");
            this._builder.setNetworkOperatorName(s);
        }

        @i(name = "setScreenHeight")
        public final void setScreenHeight(int v) {
            this._builder.setScreenHeight(v);
        }

        @i(name = "setScreenWidth")
        public final void setScreenWidth(int v) {
            this._builder.setScreenWidth(v);
        }

        @i(name = "setTimeZone")
        public final void setTimeZone(@l String s) {
            L.p(s, "value");
            this._builder.setTimeZone(s);
        }

        @i(name = "setTimeZoneOffset")
        public final void setTimeZoneOffset(long v) {
            this._builder.setTimeZoneOffset(v);
        }

        @i(name = "setUserId")
        public final void setUserId(@l String s) {
            L.p(s, "value");
            this._builder.setUserId(s);
        }

        @i(name = "setWiredHeadset")
        public final void setWiredHeadset(boolean z) {
            this._builder.setWiredHeadset(z);
        }
    }

    public static final class IosKt {
        @ProtoDslMarker
        public static final class gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl {
            public static final class gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion {
                private gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion() {
                }

                public gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion(w w0) {
                }

                @b0
                public final gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl _create(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0) {
                    L.p(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0, "builder");
                    return new gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0, null);
                }
            }

            public static final class LocaleListProxy extends DslProxy {
            }

            public static final class NwPathInterfacesProxy extends DslProxy {
            }

            @l
            public static final gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion Companion;
            @l
            private final gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder _builder;

            static {
                gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion = new gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion(null);
            }

            private gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0) {
                this._builder = dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0;
            }

            public gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0, w w0) {
                this(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0);
            }

            @b0
            public final Ios _build() {
                GeneratedMessageLite generatedMessageLite0 = this._builder.build();
                L.o(generatedMessageLite0, "_builder.build()");
                return (Ios)generatedMessageLite0;
            }

            @i(name = "addAllLocaleList")
            public final void addAllLocaleList(DslList dslList0, Iterable iterable0) {
                L.p(dslList0, "<this>");
                L.p(iterable0, "values");
                this._builder.addAllLocaleList(iterable0);
            }

            @i(name = "addAllNwPathInterfaces")
            public final void addAllNwPathInterfaces(DslList dslList0, Iterable iterable0) {
                L.p(dslList0, "<this>");
                L.p(iterable0, "values");
                this._builder.addAllNwPathInterfaces(iterable0);
            }

            @i(name = "addLocaleList")
            public final void addLocaleList(DslList dslList0, String s) {
                L.p(dslList0, "<this>");
                L.p(s, "value");
                this._builder.addLocaleList(s);
            }

            @i(name = "addNwPathInterfaces")
            public final void addNwPathInterfaces(DslList dslList0, String s) {
                L.p(dslList0, "<this>");
                L.p(s, "value");
                this._builder.addNwPathInterfaces(s);
            }

            public final void clearCurrentRadioAccessTechnology() {
                this._builder.clearCurrentRadioAccessTechnology();
            }

            public final void clearCurrentUiTheme() {
                this._builder.clearCurrentUiTheme();
            }

            public final void clearDeviceName() {
                this._builder.clearDeviceName();
            }

            public final void clearDeviceUpTimeWithSleep() {
                this._builder.clearDeviceUpTimeWithSleep();
            }

            public final void clearDeviceUpTimeWithoutSleep() {
                this._builder.clearDeviceUpTimeWithoutSleep();
            }

            @i(name = "clearLocaleList")
            public final void clearLocaleList(DslList dslList0) {
                L.p(dslList0, "<this>");
                this._builder.clearLocaleList();
            }

            public final void clearNetworkReachabilityFlags() {
                this._builder.clearNetworkReachabilityFlags();
            }

            @i(name = "clearNwPathInterfaces")
            public final void clearNwPathInterfaces(DslList dslList0) {
                L.p(dslList0, "<this>");
                this._builder.clearNwPathInterfaces();
            }

            public final void clearTrackingAuthStatus() {
                this._builder.clearTrackingAuthStatus();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            @l
            @i(name = "getCurrentRadioAccessTechnology")
            public final String getCurrentRadioAccessTechnology() {
                String s = this._builder.getCurrentRadioAccessTechnology();
                L.o(s, "_builder.getCurrentRadioAccessTechnology()");
                return s;
            }

            @i(name = "getCurrentUiTheme")
            public final int getCurrentUiTheme() {
                return this._builder.getCurrentUiTheme();
            }

            @l
            @i(name = "getDeviceName")
            public final String getDeviceName() {
                String s = this._builder.getDeviceName();
                L.o(s, "_builder.getDeviceName()");
                return s;
            }

            @i(name = "getDeviceUpTimeWithSleep")
            public final long getDeviceUpTimeWithSleep() {
                return this._builder.getDeviceUpTimeWithSleep();
            }

            @i(name = "getDeviceUpTimeWithoutSleep")
            public final long getDeviceUpTimeWithoutSleep() {
                return this._builder.getDeviceUpTimeWithoutSleep();
            }

            @l
            public final DslList getLocaleList() {
                List list0 = this._builder.getLocaleListList();
                L.o(list0, "_builder.getLocaleListList()");
                return new DslList(list0);
            }

            @i(name = "getNetworkReachabilityFlags")
            public final int getNetworkReachabilityFlags() {
                return this._builder.getNetworkReachabilityFlags();
            }

            @l
            public final DslList getNwPathInterfaces() {
                List list0 = this._builder.getNwPathInterfacesList();
                L.o(list0, "_builder.getNwPathInterfacesList()");
                return new DslList(list0);
            }

            @i(name = "getTrackingAuthStatus")
            public final int getTrackingAuthStatus() {
                return this._builder.getTrackingAuthStatus();
            }

            @i(name = "getVolume")
            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasCurrentRadioAccessTechnology() {
                return this._builder.hasCurrentRadioAccessTechnology();
            }

            public final boolean hasCurrentUiTheme() {
                return this._builder.hasCurrentUiTheme();
            }

            public final boolean hasDeviceName() {
                return this._builder.hasDeviceName();
            }

            public final boolean hasDeviceUpTimeWithSleep() {
                return this._builder.hasDeviceUpTimeWithSleep();
            }

            public final boolean hasDeviceUpTimeWithoutSleep() {
                return this._builder.hasDeviceUpTimeWithoutSleep();
            }

            public final boolean hasNetworkReachabilityFlags() {
                return this._builder.hasNetworkReachabilityFlags();
            }

            public final boolean hasTrackingAuthStatus() {
                return this._builder.hasTrackingAuthStatus();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            @i(name = "plusAssignAllLocaleList")
            public final void plusAssignAllLocaleList(DslList dslList0, Iterable iterable0) {
                L.p(dslList0, "<this>");
                L.p(iterable0, "values");
                this.addAllLocaleList(dslList0, iterable0);
            }

            @i(name = "plusAssignAllNwPathInterfaces")
            public final void plusAssignAllNwPathInterfaces(DslList dslList0, Iterable iterable0) {
                L.p(dslList0, "<this>");
                L.p(iterable0, "values");
                this.addAllNwPathInterfaces(dslList0, iterable0);
            }

            @i(name = "plusAssignLocaleList")
            public final void plusAssignLocaleList(DslList dslList0, String s) {
                L.p(dslList0, "<this>");
                L.p(s, "value");
                this.addLocaleList(dslList0, s);
            }

            @i(name = "plusAssignNwPathInterfaces")
            public final void plusAssignNwPathInterfaces(DslList dslList0, String s) {
                L.p(dslList0, "<this>");
                L.p(s, "value");
                this.addNwPathInterfaces(dslList0, s);
            }

            @i(name = "setCurrentRadioAccessTechnology")
            public final void setCurrentRadioAccessTechnology(@l String s) {
                L.p(s, "value");
                this._builder.setCurrentRadioAccessTechnology(s);
            }

            @i(name = "setCurrentUiTheme")
            public final void setCurrentUiTheme(int v) {
                this._builder.setCurrentUiTheme(v);
            }

            @i(name = "setDeviceName")
            public final void setDeviceName(@l String s) {
                L.p(s, "value");
                this._builder.setDeviceName(s);
            }

            @i(name = "setDeviceUpTimeWithSleep")
            public final void setDeviceUpTimeWithSleep(long v) {
                this._builder.setDeviceUpTimeWithSleep(v);
            }

            @i(name = "setDeviceUpTimeWithoutSleep")
            public final void setDeviceUpTimeWithoutSleep(long v) {
                this._builder.setDeviceUpTimeWithoutSleep(v);
            }

            @i(name = "setLocaleList")
            public final void setLocaleList(DslList dslList0, int v, String s) {
                L.p(dslList0, "<this>");
                L.p(s, "value");
                this._builder.setLocaleList(v, s);
            }

            @i(name = "setNetworkReachabilityFlags")
            public final void setNetworkReachabilityFlags(int v) {
                this._builder.setNetworkReachabilityFlags(v);
            }

            @i(name = "setNwPathInterfaces")
            public final void setNwPathInterfaces(DslList dslList0, int v, String s) {
                L.p(dslList0, "<this>");
                L.p(s, "value");
                this._builder.setNwPathInterfaces(v, s);
            }

            @i(name = "setTrackingAuthStatus")
            public final void setTrackingAuthStatus(int v) {
                this._builder.setTrackingAuthStatus(v);
            }

            @i(name = "setVolume")
            public final void setVolume(double f) {
                this._builder.setVolume(f);
            }
        }

        @l
        public static final IosKt INSTANCE;

        static {
            IosKt.INSTANCE = new IosKt();
        }
    }

    @l
    public static final DynamicDeviceInfoKt INSTANCE;

    @l
    @i(name = "-initializeandroid")
    public final Android -initializeandroid(@l Function1 function10) {
        L.p(function10, "block");
        Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0 = Android.newBuilder();
        L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0, "newBuilder()");
        Dsl dynamicDeviceInfoKt$AndroidKt$Dsl0 = Dsl.Companion._create(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder0);
        function10.invoke(dynamicDeviceInfoKt$AndroidKt$Dsl0);
        return dynamicDeviceInfoKt$AndroidKt$Dsl0._build();
    }

    @l
    @i(name = "-initializeios")
    public final Ios -initializeios(@l Function1 function10) {
        L.p(function10, "block");
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0 = Ios.newBuilder();
        L.o(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0, "newBuilder()");
        gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl dynamicDeviceInfoKt$IosKt$Dsl0 = gatewayprotocol.v1.DynamicDeviceInfoKt.IosKt.Dsl.Companion._create(dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder0);
        function10.invoke(dynamicDeviceInfoKt$IosKt$Dsl0);
        return dynamicDeviceInfoKt$IosKt$Dsl0._build();
    }

    static {
        DynamicDeviceInfoKt.INSTANCE = new DynamicDeviceInfoKt();
    }
}

