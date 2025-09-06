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

@s0({"SMAP\nStaticDeviceInfoKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticDeviceInfoKt.kt\ngatewayprotocol/v1/StaticDeviceInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1343:1\n1#2:1344\n*E\n"})
public final class StaticDeviceInfoKt {
    public static final class AndroidKt {
        @ProtoDslMarker
        public static final class Dsl {
            public static final class Companion {
                private Companion() {
                }

                public Companion(w w0) {
                }

                @b0
                public final Dsl _create(Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0) {
                    L.p(staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0, "builder");
                    return new Dsl(staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0, null);
                }
            }

            @l
            public static final Companion Companion;
            @l
            private final Builder _builder;

            static {
                Dsl.Companion = new Companion(null);
            }

            private Dsl(Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0) {
                this._builder = staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0;
            }

            public Dsl(Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0, w w0) {
                this(staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0);
            }

            @b0
            public final Android _build() {
                GeneratedMessageLite generatedMessageLite0 = this._builder.build();
                L.o(generatedMessageLite0, "_builder.build()");
                return (Android)generatedMessageLite0;
            }

            public final void clearAndroidFingerprint() {
                this._builder.clearAndroidFingerprint();
            }

            public final void clearApiLevel() {
                this._builder.clearApiLevel();
            }

            public final void clearApkDeveloperSigningCertificateHash() {
                this._builder.clearApkDeveloperSigningCertificateHash();
            }

            public final void clearAppInstaller() {
                this._builder.clearAppInstaller();
            }

            public final void clearBuildBoard() {
                this._builder.clearBuildBoard();
            }

            public final void clearBuildBootloader() {
                this._builder.clearBuildBootloader();
            }

            public final void clearBuildBrand() {
                this._builder.clearBuildBrand();
            }

            public final void clearBuildDevice() {
                this._builder.clearBuildDevice();
            }

            public final void clearBuildDisplay() {
                this._builder.clearBuildDisplay();
            }

            public final void clearBuildFingerprint() {
                this._builder.clearBuildFingerprint();
            }

            public final void clearBuildHardware() {
                this._builder.clearBuildHardware();
            }

            public final void clearBuildHost() {
                this._builder.clearBuildHost();
            }

            public final void clearBuildId() {
                this._builder.clearBuildId();
            }

            public final void clearBuildProduct() {
                this._builder.clearBuildProduct();
            }

            public final void clearExtensionVersion() {
                this._builder.clearExtensionVersion();
            }

            public final void clearPhoneType() {
                this._builder.clearPhoneType();
            }

            public final void clearSimOperator() {
                this._builder.clearSimOperator();
            }

            public final void clearVersionCode() {
                this._builder.clearVersionCode();
            }

            @l
            @i(name = "getAndroidFingerprint")
            public final String getAndroidFingerprint() {
                String s = this._builder.getAndroidFingerprint();
                L.o(s, "_builder.getAndroidFingerprint()");
                return s;
            }

            @i(name = "getApiLevel")
            public final int getApiLevel() {
                return this._builder.getApiLevel();
            }

            @l
            @i(name = "getApkDeveloperSigningCertificateHash")
            public final String getApkDeveloperSigningCertificateHash() {
                String s = this._builder.getApkDeveloperSigningCertificateHash();
                L.o(s, "_builder.getApkDeveloperSigningCertificateHash()");
                return s;
            }

            @l
            @i(name = "getAppInstaller")
            public final String getAppInstaller() {
                String s = this._builder.getAppInstaller();
                L.o(s, "_builder.getAppInstaller()");
                return s;
            }

            @l
            @i(name = "getBuildBoard")
            public final String getBuildBoard() {
                String s = this._builder.getBuildBoard();
                L.o(s, "_builder.getBuildBoard()");
                return s;
            }

            @l
            @i(name = "getBuildBootloader")
            public final String getBuildBootloader() {
                String s = this._builder.getBuildBootloader();
                L.o(s, "_builder.getBuildBootloader()");
                return s;
            }

            @l
            @i(name = "getBuildBrand")
            public final String getBuildBrand() {
                String s = this._builder.getBuildBrand();
                L.o(s, "_builder.getBuildBrand()");
                return s;
            }

            @l
            @i(name = "getBuildDevice")
            public final String getBuildDevice() {
                String s = this._builder.getBuildDevice();
                L.o(s, "_builder.getBuildDevice()");
                return s;
            }

            @l
            @i(name = "getBuildDisplay")
            public final String getBuildDisplay() {
                String s = this._builder.getBuildDisplay();
                L.o(s, "_builder.getBuildDisplay()");
                return s;
            }

            @l
            @i(name = "getBuildFingerprint")
            public final String getBuildFingerprint() {
                String s = this._builder.getBuildFingerprint();
                L.o(s, "_builder.getBuildFingerprint()");
                return s;
            }

            @l
            @i(name = "getBuildHardware")
            public final String getBuildHardware() {
                String s = this._builder.getBuildHardware();
                L.o(s, "_builder.getBuildHardware()");
                return s;
            }

            @l
            @i(name = "getBuildHost")
            public final String getBuildHost() {
                String s = this._builder.getBuildHost();
                L.o(s, "_builder.getBuildHost()");
                return s;
            }

            @l
            @i(name = "getBuildId")
            public final String getBuildId() {
                String s = this._builder.getBuildId();
                L.o(s, "_builder.getBuildId()");
                return s;
            }

            @l
            @i(name = "getBuildProduct")
            public final String getBuildProduct() {
                String s = this._builder.getBuildProduct();
                L.o(s, "_builder.getBuildProduct()");
                return s;
            }

            @i(name = "getExtensionVersion")
            public final int getExtensionVersion() {
                return this._builder.getExtensionVersion();
            }

            @i(name = "getPhoneType")
            public final int getPhoneType() {
                return this._builder.getPhoneType();
            }

            @l
            @i(name = "getSimOperator")
            public final String getSimOperator() {
                String s = this._builder.getSimOperator();
                L.o(s, "_builder.getSimOperator()");
                return s;
            }

            @i(name = "getVersionCode")
            public final int getVersionCode() {
                return this._builder.getVersionCode();
            }

            public final boolean hasAndroidFingerprint() {
                return this._builder.hasAndroidFingerprint();
            }

            public final boolean hasApiLevel() {
                return this._builder.hasApiLevel();
            }

            public final boolean hasApkDeveloperSigningCertificateHash() {
                return this._builder.hasApkDeveloperSigningCertificateHash();
            }

            public final boolean hasAppInstaller() {
                return this._builder.hasAppInstaller();
            }

            public final boolean hasBuildBoard() {
                return this._builder.hasBuildBoard();
            }

            public final boolean hasBuildBootloader() {
                return this._builder.hasBuildBootloader();
            }

            public final boolean hasBuildBrand() {
                return this._builder.hasBuildBrand();
            }

            public final boolean hasBuildDevice() {
                return this._builder.hasBuildDevice();
            }

            public final boolean hasBuildDisplay() {
                return this._builder.hasBuildDisplay();
            }

            public final boolean hasBuildFingerprint() {
                return this._builder.hasBuildFingerprint();
            }

            public final boolean hasBuildHardware() {
                return this._builder.hasBuildHardware();
            }

            public final boolean hasBuildHost() {
                return this._builder.hasBuildHost();
            }

            public final boolean hasBuildId() {
                return this._builder.hasBuildId();
            }

            public final boolean hasBuildProduct() {
                return this._builder.hasBuildProduct();
            }

            public final boolean hasExtensionVersion() {
                return this._builder.hasExtensionVersion();
            }

            public final boolean hasPhoneType() {
                return this._builder.hasPhoneType();
            }

            public final boolean hasSimOperator() {
                return this._builder.hasSimOperator();
            }

            public final boolean hasVersionCode() {
                return this._builder.hasVersionCode();
            }

            @i(name = "setAndroidFingerprint")
            public final void setAndroidFingerprint(@l String s) {
                L.p(s, "value");
                this._builder.setAndroidFingerprint(s);
            }

            @i(name = "setApiLevel")
            public final void setApiLevel(int v) {
                this._builder.setApiLevel(v);
            }

            @i(name = "setApkDeveloperSigningCertificateHash")
            public final void setApkDeveloperSigningCertificateHash(@l String s) {
                L.p(s, "value");
                this._builder.setApkDeveloperSigningCertificateHash(s);
            }

            @i(name = "setAppInstaller")
            public final void setAppInstaller(@l String s) {
                L.p(s, "value");
                this._builder.setAppInstaller(s);
            }

            @i(name = "setBuildBoard")
            public final void setBuildBoard(@l String s) {
                L.p(s, "value");
                this._builder.setBuildBoard(s);
            }

            @i(name = "setBuildBootloader")
            public final void setBuildBootloader(@l String s) {
                L.p(s, "value");
                this._builder.setBuildBootloader(s);
            }

            @i(name = "setBuildBrand")
            public final void setBuildBrand(@l String s) {
                L.p(s, "value");
                this._builder.setBuildBrand(s);
            }

            @i(name = "setBuildDevice")
            public final void setBuildDevice(@l String s) {
                L.p(s, "value");
                this._builder.setBuildDevice(s);
            }

            @i(name = "setBuildDisplay")
            public final void setBuildDisplay(@l String s) {
                L.p(s, "value");
                this._builder.setBuildDisplay(s);
            }

            @i(name = "setBuildFingerprint")
            public final void setBuildFingerprint(@l String s) {
                L.p(s, "value");
                this._builder.setBuildFingerprint(s);
            }

            @i(name = "setBuildHardware")
            public final void setBuildHardware(@l String s) {
                L.p(s, "value");
                this._builder.setBuildHardware(s);
            }

            @i(name = "setBuildHost")
            public final void setBuildHost(@l String s) {
                L.p(s, "value");
                this._builder.setBuildHost(s);
            }

            @i(name = "setBuildId")
            public final void setBuildId(@l String s) {
                L.p(s, "value");
                this._builder.setBuildId(s);
            }

            @i(name = "setBuildProduct")
            public final void setBuildProduct(@l String s) {
                L.p(s, "value");
                this._builder.setBuildProduct(s);
            }

            @i(name = "setExtensionVersion")
            public final void setExtensionVersion(int v) {
                this._builder.setExtensionVersion(v);
            }

            @i(name = "setPhoneType")
            public final void setPhoneType(int v) {
                this._builder.setPhoneType(v);
            }

            @i(name = "setSimOperator")
            public final void setSimOperator(@l String s) {
                L.p(s, "value");
                this._builder.setSimOperator(s);
            }

            @i(name = "setVersionCode")
            public final void setVersionCode(int v) {
                this._builder.setVersionCode(v);
            }
        }

        @l
        public static final AndroidKt INSTANCE;

        static {
            AndroidKt.INSTANCE = new AndroidKt();
        }
    }

    @ProtoDslMarker
    public static final class gatewayprotocol.v1.StaticDeviceInfoKt.Dsl {
        public static final class gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion {
            private gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion() {
            }

            public gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion(w w0) {
            }

            @b0
            public final gatewayprotocol.v1.StaticDeviceInfoKt.Dsl _create(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0) {
                L.p(staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0, "builder");
                return new gatewayprotocol.v1.StaticDeviceInfoKt.Dsl(staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0, null);
            }
        }

        public static final class StoresProxy extends DslProxy {
        }

        @l
        public static final gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion Companion;
        @l
        private final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder _builder;

        static {
            gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion = new gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion(null);
        }

        private gatewayprotocol.v1.StaticDeviceInfoKt.Dsl(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0) {
            this._builder = staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0;
        }

        public gatewayprotocol.v1.StaticDeviceInfoKt.Dsl(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0, w w0) {
            this(staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0);
        }

        @b0
        public final StaticDeviceInfo _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (StaticDeviceInfo)generatedMessageLite0;
        }

        @i(name = "addAllStores")
        public final void addAllStores(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this._builder.addAllStores(iterable0);
        }

        @i(name = "addStores")
        public final void addStores(DslList dslList0, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this._builder.addStores(s);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppDebuggable() {
            this._builder.clearAppDebuggable();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final void clearCpuCount() {
            this._builder.clearCpuCount();
        }

        public final void clearCpuModel() {
            this._builder.clearCpuModel();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGpuModel() {
            this._builder.clearGpuModel();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearMadeWithUnity() {
            this._builder.clearMadeWithUnity();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearRooted() {
            this._builder.clearRooted();
        }

        public final void clearScreenDensity() {
            this._builder.clearScreenDensity();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenSize() {
            this._builder.clearScreenSize();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        @i(name = "clearStores")
        public final void clearStores(DslList dslList0) {
            L.p(dslList0, "<this>");
            this._builder.clearStores();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearWebviewUa() {
            this._builder.clearWebviewUa();
        }

        @l
        @i(name = "getAndroid")
        public final Android getAndroid() {
            Android staticDeviceInfoOuterClass$StaticDeviceInfo$Android0 = this._builder.getAndroid();
            L.o(staticDeviceInfoOuterClass$StaticDeviceInfo$Android0, "_builder.getAndroid()");
            return staticDeviceInfoOuterClass$StaticDeviceInfo$Android0;
        }

        @i(name = "getAppDebuggable")
        public final boolean getAppDebuggable() {
            return this._builder.getAppDebuggable();
        }

        @l
        @i(name = "getBundleId")
        public final String getBundleId() {
            String s = this._builder.getBundleId();
            L.o(s, "_builder.getBundleId()");
            return s;
        }

        @l
        @i(name = "getBundleVersion")
        public final String getBundleVersion() {
            String s = this._builder.getBundleVersion();
            L.o(s, "_builder.getBundleVersion()");
            return s;
        }

        @i(name = "getCpuCount")
        public final long getCpuCount() {
            return this._builder.getCpuCount();
        }

        @l
        @i(name = "getCpuModel")
        public final String getCpuModel() {
            String s = this._builder.getCpuModel();
            L.o(s, "_builder.getCpuModel()");
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
        @i(name = "getGpuModel")
        public final String getGpuModel() {
            String s = this._builder.getGpuModel();
            L.o(s, "_builder.getGpuModel()");
            return s;
        }

        @l
        @i(name = "getIos")
        public final Ios getIos() {
            Ios staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0 = this._builder.getIos();
            L.o(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0, "_builder.getIos()");
            return staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0;
        }

        @i(name = "getMadeWithUnity")
        public final boolean getMadeWithUnity() {
            return this._builder.getMadeWithUnity();
        }

        @l
        @i(name = "getOsVersion")
        public final String getOsVersion() {
            String s = this._builder.getOsVersion();
            L.o(s, "_builder.getOsVersion()");
            return s;
        }

        @l
        @i(name = "getPlatformSpecificCase")
        public final PlatformSpecificCase getPlatformSpecificCase() {
            PlatformSpecificCase staticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase0 = this._builder.getPlatformSpecificCase();
            L.o(staticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase0, "_builder.getPlatformSpecificCase()");
            return staticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase0;
        }

        @i(name = "getRooted")
        public final boolean getRooted() {
            return this._builder.getRooted();
        }

        @i(name = "getScreenDensity")
        public final int getScreenDensity() {
            return this._builder.getScreenDensity();
        }

        @i(name = "getScreenHeight")
        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        @i(name = "getScreenSize")
        public final int getScreenSize() {
            return this._builder.getScreenSize();
        }

        @i(name = "getScreenWidth")
        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        @l
        public final DslList getStores() {
            List list0 = this._builder.getStoresList();
            L.o(list0, "_builder.getStoresList()");
            return new DslList(list0);
        }

        @i(name = "getTotalDiskSpace")
        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        @i(name = "getTotalRamMemory")
        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        // 去混淆评级： 低(30)
        @l
        @i(name = "getWebviewUa")
        public final String getWebviewUa() {
            L.o("", "_builder.getWebviewUa()");
            return "";
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppDebuggable() {
            return this._builder.hasAppDebuggable();
        }

        public final boolean hasBundleId() {
            return this._builder.hasBundleId();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean hasCpuCount() {
            return this._builder.hasCpuCount();
        }

        public final boolean hasCpuModel() {
            return this._builder.hasCpuModel();
        }

        public final boolean hasDeviceMake() {
            return this._builder.hasDeviceMake();
        }

        public final boolean hasDeviceModel() {
            return this._builder.hasDeviceModel();
        }

        public final boolean hasGpuModel() {
            return this._builder.hasGpuModel();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasMadeWithUnity() {
            return this._builder.hasMadeWithUnity();
        }

        public final boolean hasOsVersion() {
            return this._builder.hasOsVersion();
        }

        public final boolean hasRooted() {
            return this._builder.hasRooted();
        }

        public final boolean hasScreenDensity() {
            return this._builder.hasScreenDensity();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenSize() {
            return this._builder.hasScreenSize();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTotalDiskSpace() {
            return this._builder.hasTotalDiskSpace();
        }

        public final boolean hasTotalRamMemory() {
            return this._builder.hasTotalRamMemory();
        }

        public final boolean hasWebviewUa() {
            return this._builder.hasWebviewUa();
        }

        @i(name = "plusAssignAllStores")
        public final void plusAssignAllStores(DslList dslList0, Iterable iterable0) {
            L.p(dslList0, "<this>");
            L.p(iterable0, "values");
            this.addAllStores(dslList0, iterable0);
        }

        @i(name = "plusAssignStores")
        public final void plusAssignStores(DslList dslList0, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this.addStores(dslList0, s);
        }

        @i(name = "setAndroid")
        public final void setAndroid(@l Android staticDeviceInfoOuterClass$StaticDeviceInfo$Android0) {
            L.p(staticDeviceInfoOuterClass$StaticDeviceInfo$Android0, "value");
            this._builder.setAndroid(staticDeviceInfoOuterClass$StaticDeviceInfo$Android0);
        }

        @i(name = "setAppDebuggable")
        public final void setAppDebuggable(boolean z) {
            this._builder.setAppDebuggable(z);
        }

        @i(name = "setBundleId")
        public final void setBundleId(@l String s) {
            L.p(s, "value");
            this._builder.setBundleId(s);
        }

        @i(name = "setBundleVersion")
        public final void setBundleVersion(@l String s) {
            L.p(s, "value");
            this._builder.setBundleVersion(s);
        }

        @i(name = "setCpuCount")
        public final void setCpuCount(long v) {
            this._builder.setCpuCount(v);
        }

        @i(name = "setCpuModel")
        public final void setCpuModel(@l String s) {
            L.p(s, "value");
            this._builder.setCpuModel(s);
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

        @i(name = "setGpuModel")
        public final void setGpuModel(@l String s) {
            L.p(s, "value");
            this._builder.setGpuModel(s);
        }

        @i(name = "setIos")
        public final void setIos(@l Ios staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0) {
            L.p(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0, "value");
            this._builder.setIos(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0);
        }

        @i(name = "setMadeWithUnity")
        public final void setMadeWithUnity(boolean z) {
            this._builder.setMadeWithUnity(z);
        }

        @i(name = "setOsVersion")
        public final void setOsVersion(@l String s) {
            L.p(s, "value");
            this._builder.setOsVersion(s);
        }

        @i(name = "setRooted")
        public final void setRooted(boolean z) {
            this._builder.setRooted(z);
        }

        @i(name = "setScreenDensity")
        public final void setScreenDensity(int v) {
            this._builder.setScreenDensity(v);
        }

        @i(name = "setScreenHeight")
        public final void setScreenHeight(int v) {
            this._builder.setScreenHeight(v);
        }

        @i(name = "setScreenSize")
        public final void setScreenSize(int v) {
            this._builder.setScreenSize(v);
        }

        @i(name = "setScreenWidth")
        public final void setScreenWidth(int v) {
            this._builder.setScreenWidth(v);
        }

        @i(name = "setStores")
        public final void setStores(DslList dslList0, int v, String s) {
            L.p(dslList0, "<this>");
            L.p(s, "value");
            this._builder.setStores(v, s);
        }

        @i(name = "setTotalDiskSpace")
        public final void setTotalDiskSpace(long v) {
            this._builder.setTotalDiskSpace(v);
        }

        @i(name = "setTotalRamMemory")
        public final void setTotalRamMemory(long v) {
            this._builder.setTotalRamMemory(v);
        }

        @i(name = "setWebviewUa")
        public final void setWebviewUa(@l String s) {
            L.p(s, "value");
            this._builder.setWebviewUa(s);
        }
    }

    public static final class IosKt {
        @ProtoDslMarker
        public static final class gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl {
            public static final class gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion {
                private gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion() {
                }

                public gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion(w w0) {
                }

                @b0
                public final gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl _create(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0) {
                    L.p(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0, "builder");
                    return new gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0, null);
                }
            }

            public static final class SkadnetworkIdProxy extends DslProxy {
            }

            @l
            public static final gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion Companion;
            @l
            private final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder _builder;

            static {
                gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion = new gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion(null);
            }

            private gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0) {
                this._builder = staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0;
            }

            public gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0, w w0) {
                this(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0);
            }

            @b0
            public final Ios _build() {
                GeneratedMessageLite generatedMessageLite0 = this._builder.build();
                L.o(generatedMessageLite0, "_builder.build()");
                return (Ios)generatedMessageLite0;
            }

            @i(name = "addAllSkadnetworkId")
            public final void addAllSkadnetworkId(DslList dslList0, Iterable iterable0) {
                L.p(dslList0, "<this>");
                L.p(iterable0, "values");
                this._builder.addAllSkadnetworkId(iterable0);
            }

            @i(name = "addSkadnetworkId")
            public final void addSkadnetworkId(DslList dslList0, String s) {
                L.p(dslList0, "<this>");
                L.p(s, "value");
                this._builder.addSkadnetworkId(s);
            }

            public final void clearBuiltSdkVersion() {
                this._builder.clearBuiltSdkVersion();
            }

            public final void clearCanMakePayments() {
                this._builder.clearCanMakePayments();
            }

            public final void clearScreenScale() {
                this._builder.clearScreenScale();
            }

            public final void clearSimulator() {
                this._builder.clearSimulator();
            }

            @i(name = "clearSkadnetworkId")
            public final void clearSkadnetworkId(DslList dslList0) {
                L.p(dslList0, "<this>");
                this._builder.clearSkadnetworkId();
            }

            public final void clearSystemBootTime() {
                this._builder.clearSystemBootTime();
            }

            public final void clearXcodeBuildVersion() {
                this._builder.clearXcodeBuildVersion();
            }

            public final void clearXcodeSdkBuildVersion() {
                this._builder.clearXcodeSdkBuildVersion();
            }

            public final void clearXcodeVersion() {
                this._builder.clearXcodeVersion();
            }

            @l
            @i(name = "getBuiltSdkVersion")
            public final String getBuiltSdkVersion() {
                String s = this._builder.getBuiltSdkVersion();
                L.o(s, "_builder.getBuiltSdkVersion()");
                return s;
            }

            @i(name = "getCanMakePayments")
            public final boolean getCanMakePayments() {
                return this._builder.getCanMakePayments();
            }

            @i(name = "getScreenScale")
            public final int getScreenScale() {
                return this._builder.getScreenScale();
            }

            @i(name = "getSimulator")
            public final boolean getSimulator() {
                return this._builder.getSimulator();
            }

            @l
            public final DslList getSkadnetworkId() {
                List list0 = this._builder.getSkadnetworkIdList();
                L.o(list0, "_builder.getSkadnetworkIdList()");
                return new DslList(list0);
            }

            @i(name = "getSystemBootTime")
            public final long getSystemBootTime() {
                return this._builder.getSystemBootTime();
            }

            @l
            @i(name = "getXcodeBuildVersion")
            public final String getXcodeBuildVersion() {
                String s = this._builder.getXcodeBuildVersion();
                L.o(s, "_builder.getXcodeBuildVersion()");
                return s;
            }

            @l
            @i(name = "getXcodeSdkBuildVersion")
            public final String getXcodeSdkBuildVersion() {
                String s = this._builder.getXcodeSdkBuildVersion();
                L.o(s, "_builder.getXcodeSdkBuildVersion()");
                return s;
            }

            @l
            @i(name = "getXcodeVersion")
            public final String getXcodeVersion() {
                String s = this._builder.getXcodeVersion();
                L.o(s, "_builder.getXcodeVersion()");
                return s;
            }

            public final boolean hasBuiltSdkVersion() {
                return this._builder.hasBuiltSdkVersion();
            }

            public final boolean hasCanMakePayments() {
                return this._builder.hasCanMakePayments();
            }

            public final boolean hasScreenScale() {
                return this._builder.hasScreenScale();
            }

            public final boolean hasSimulator() {
                return this._builder.hasSimulator();
            }

            public final boolean hasSystemBootTime() {
                return this._builder.hasSystemBootTime();
            }

            public final boolean hasXcodeBuildVersion() {
                return this._builder.hasXcodeBuildVersion();
            }

            public final boolean hasXcodeSdkBuildVersion() {
                return this._builder.hasXcodeSdkBuildVersion();
            }

            public final boolean hasXcodeVersion() {
                return this._builder.hasXcodeVersion();
            }

            @i(name = "plusAssignAllSkadnetworkId")
            public final void plusAssignAllSkadnetworkId(DslList dslList0, Iterable iterable0) {
                L.p(dslList0, "<this>");
                L.p(iterable0, "values");
                this.addAllSkadnetworkId(dslList0, iterable0);
            }

            @i(name = "plusAssignSkadnetworkId")
            public final void plusAssignSkadnetworkId(DslList dslList0, String s) {
                L.p(dslList0, "<this>");
                L.p(s, "value");
                this.addSkadnetworkId(dslList0, s);
            }

            @i(name = "setBuiltSdkVersion")
            public final void setBuiltSdkVersion(@l String s) {
                L.p(s, "value");
                this._builder.setBuiltSdkVersion(s);
            }

            @i(name = "setCanMakePayments")
            public final void setCanMakePayments(boolean z) {
                this._builder.setCanMakePayments(z);
            }

            @i(name = "setScreenScale")
            public final void setScreenScale(int v) {
                this._builder.setScreenScale(v);
            }

            @i(name = "setSimulator")
            public final void setSimulator(boolean z) {
                this._builder.setSimulator(z);
            }

            @i(name = "setSkadnetworkId")
            public final void setSkadnetworkId(DslList dslList0, int v, String s) {
                L.p(dslList0, "<this>");
                L.p(s, "value");
                this._builder.setSkadnetworkId(v, s);
            }

            @i(name = "setSystemBootTime")
            public final void setSystemBootTime(long v) {
                this._builder.setSystemBootTime(v);
            }

            @i(name = "setXcodeBuildVersion")
            public final void setXcodeBuildVersion(@l String s) {
                L.p(s, "value");
                this._builder.setXcodeBuildVersion(s);
            }

            @i(name = "setXcodeSdkBuildVersion")
            public final void setXcodeSdkBuildVersion(@l String s) {
                L.p(s, "value");
                this._builder.setXcodeSdkBuildVersion(s);
            }

            @i(name = "setXcodeVersion")
            public final void setXcodeVersion(@l String s) {
                L.p(s, "value");
                this._builder.setXcodeVersion(s);
            }
        }

        @l
        public static final IosKt INSTANCE;

        static {
            IosKt.INSTANCE = new IosKt();
        }
    }

    @l
    public static final StaticDeviceInfoKt INSTANCE;

    @l
    @i(name = "-initializeandroid")
    public final Android -initializeandroid(@l Function1 function10) {
        L.p(function10, "block");
        Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0 = Android.newBuilder();
        L.o(staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0, "newBuilder()");
        Dsl staticDeviceInfoKt$AndroidKt$Dsl0 = Dsl.Companion._create(staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0);
        function10.invoke(staticDeviceInfoKt$AndroidKt$Dsl0);
        return staticDeviceInfoKt$AndroidKt$Dsl0._build();
    }

    @l
    @i(name = "-initializeios")
    public final Ios -initializeios(@l Function1 function10) {
        L.p(function10, "block");
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0 = Ios.newBuilder();
        L.o(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0, "newBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl staticDeviceInfoKt$IosKt$Dsl0 = gatewayprotocol.v1.StaticDeviceInfoKt.IosKt.Dsl.Companion._create(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0);
        function10.invoke(staticDeviceInfoKt$IosKt$Dsl0);
        return staticDeviceInfoKt$IosKt$Dsl0._build();
    }

    static {
        StaticDeviceInfoKt.INSTANCE = new StaticDeviceInfoKt();
    }
}

