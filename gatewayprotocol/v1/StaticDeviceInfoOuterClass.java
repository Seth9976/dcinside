package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class StaticDeviceInfoOuterClass {
    public static final class StaticDeviceInfo extends GeneratedMessageLite implements StaticDeviceInfoOrBuilder {
        public static final class Android extends GeneratedMessageLite implements AndroidOrBuilder {
            public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AndroidOrBuilder {
                private Builder() {
                    super(Android.DEFAULT_INSTANCE);
                }

                Builder(a staticDeviceInfoOuterClass$a0) {
                }

                public Builder clearAndroidFingerprint() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearAndroidFingerprint();
                    return this;
                }

                public Builder clearApiLevel() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearApiLevel();
                    return this;
                }

                public Builder clearApkDeveloperSigningCertificateHash() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearApkDeveloperSigningCertificateHash();
                    return this;
                }

                public Builder clearAppInstaller() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearAppInstaller();
                    return this;
                }

                public Builder clearBuildBoard() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildBoard();
                    return this;
                }

                public Builder clearBuildBootloader() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildBootloader();
                    return this;
                }

                public Builder clearBuildBrand() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildBrand();
                    return this;
                }

                public Builder clearBuildDevice() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildDevice();
                    return this;
                }

                public Builder clearBuildDisplay() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildDisplay();
                    return this;
                }

                public Builder clearBuildFingerprint() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildFingerprint();
                    return this;
                }

                public Builder clearBuildHardware() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildHardware();
                    return this;
                }

                public Builder clearBuildHost() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildHost();
                    return this;
                }

                public Builder clearBuildId() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildId();
                    return this;
                }

                public Builder clearBuildProduct() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearBuildProduct();
                    return this;
                }

                public Builder clearExtensionVersion() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearExtensionVersion();
                    return this;
                }

                public Builder clearPhoneType() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearPhoneType();
                    return this;
                }

                public Builder clearSimOperator() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearSimOperator();
                    return this;
                }

                public Builder clearVersionCode() {
                    this.copyOnWrite();
                    ((Android)this.instance).clearVersionCode();
                    return this;
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getAndroidFingerprint() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getAndroidFingerprintBytes() {
                    return ((Android)this.instance).getAndroidFingerprintBytes();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public int getApiLevel() {
                    return ((Android)this.instance).getApiLevel();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getApkDeveloperSigningCertificateHash() {
                    return ((Android)this.instance).getApkDeveloperSigningCertificateHash();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getApkDeveloperSigningCertificateHashBytes() {
                    return ((Android)this.instance).getApkDeveloperSigningCertificateHashBytes();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getAppInstaller() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getAppInstallerBytes() {
                    return ((Android)this.instance).getAppInstallerBytes();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getBuildBoard() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getBuildBoardBytes() {
                    return ((Android)this.instance).getBuildBoardBytes();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getBuildBootloader() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getBuildBootloaderBytes() {
                    return ((Android)this.instance).getBuildBootloaderBytes();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getBuildBrand() {
                    return ((Android)this.instance).getBuildBrand();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getBuildBrandBytes() {
                    return ((Android)this.instance).getBuildBrandBytes();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getBuildDevice() {
                    return ((Android)this.instance).getBuildDevice();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getBuildDeviceBytes() {
                    return ((Android)this.instance).getBuildDeviceBytes();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getBuildDisplay() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getBuildDisplayBytes() {
                    return ((Android)this.instance).getBuildDisplayBytes();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getBuildFingerprint() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getBuildFingerprintBytes() {
                    return ((Android)this.instance).getBuildFingerprintBytes();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getBuildHardware() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getBuildHardwareBytes() {
                    return ((Android)this.instance).getBuildHardwareBytes();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getBuildHost() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getBuildHostBytes() {
                    return ((Android)this.instance).getBuildHostBytes();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getBuildId() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getBuildIdBytes() {
                    return ((Android)this.instance).getBuildIdBytes();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getBuildProduct() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getBuildProductBytes() {
                    return ((Android)this.instance).getBuildProductBytes();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public int getExtensionVersion() {
                    return ((Android)this.instance).getExtensionVersion();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public int getPhoneType() {
                    return ((Android)this.instance).getPhoneType();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public String getSimOperator() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public ByteString getSimOperatorBytes() {
                    return ((Android)this.instance).getSimOperatorBytes();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public int getVersionCode() {
                    return ((Android)this.instance).getVersionCode();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasAndroidFingerprint() {
                    return ((Android)this.instance).hasAndroidFingerprint();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasApiLevel() {
                    return ((Android)this.instance).hasApiLevel();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasApkDeveloperSigningCertificateHash() {
                    return ((Android)this.instance).hasApkDeveloperSigningCertificateHash();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasAppInstaller() {
                    return ((Android)this.instance).hasAppInstaller();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasBuildBoard() {
                    return ((Android)this.instance).hasBuildBoard();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasBuildBootloader() {
                    return ((Android)this.instance).hasBuildBootloader();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasBuildBrand() {
                    return ((Android)this.instance).hasBuildBrand();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasBuildDevice() {
                    return ((Android)this.instance).hasBuildDevice();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasBuildDisplay() {
                    return ((Android)this.instance).hasBuildDisplay();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasBuildFingerprint() {
                    return ((Android)this.instance).hasBuildFingerprint();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasBuildHardware() {
                    return ((Android)this.instance).hasBuildHardware();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasBuildHost() {
                    return ((Android)this.instance).hasBuildHost();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasBuildId() {
                    return ((Android)this.instance).hasBuildId();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasBuildProduct() {
                    return ((Android)this.instance).hasBuildProduct();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasExtensionVersion() {
                    return ((Android)this.instance).hasExtensionVersion();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasPhoneType() {
                    return ((Android)this.instance).hasPhoneType();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasSimOperator() {
                    return ((Android)this.instance).hasSimOperator();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
                public boolean hasVersionCode() {
                    return ((Android)this.instance).hasVersionCode();
                }

                public Builder setAndroidFingerprint(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setAndroidFingerprint(s);
                    return this;
                }

                public Builder setAndroidFingerprintBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setAndroidFingerprintBytes(byteString0);
                    return this;
                }

                public Builder setApiLevel(int v) {
                    this.copyOnWrite();
                    ((Android)this.instance).setApiLevel(v);
                    return this;
                }

                public Builder setApkDeveloperSigningCertificateHash(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setApkDeveloperSigningCertificateHash(s);
                    return this;
                }

                public Builder setApkDeveloperSigningCertificateHashBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setApkDeveloperSigningCertificateHashBytes(byteString0);
                    return this;
                }

                public Builder setAppInstaller(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setAppInstaller(s);
                    return this;
                }

                public Builder setAppInstallerBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setAppInstallerBytes(byteString0);
                    return this;
                }

                public Builder setBuildBoard(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBoard(s);
                    return this;
                }

                public Builder setBuildBoardBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBoardBytes(byteString0);
                    return this;
                }

                public Builder setBuildBootloader(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBootloader(s);
                    return this;
                }

                public Builder setBuildBootloaderBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBootloaderBytes(byteString0);
                    return this;
                }

                public Builder setBuildBrand(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBrand(s);
                    return this;
                }

                public Builder setBuildBrandBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildBrandBytes(byteString0);
                    return this;
                }

                public Builder setBuildDevice(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildDevice(s);
                    return this;
                }

                public Builder setBuildDeviceBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildDeviceBytes(byteString0);
                    return this;
                }

                public Builder setBuildDisplay(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildDisplay(s);
                    return this;
                }

                public Builder setBuildDisplayBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildDisplayBytes(byteString0);
                    return this;
                }

                public Builder setBuildFingerprint(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildFingerprint(s);
                    return this;
                }

                public Builder setBuildFingerprintBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildFingerprintBytes(byteString0);
                    return this;
                }

                public Builder setBuildHardware(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildHardware(s);
                    return this;
                }

                public Builder setBuildHardwareBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildHardwareBytes(byteString0);
                    return this;
                }

                public Builder setBuildHost(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildHost(s);
                    return this;
                }

                public Builder setBuildHostBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildHostBytes(byteString0);
                    return this;
                }

                public Builder setBuildId(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildId(s);
                    return this;
                }

                public Builder setBuildIdBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildIdBytes(byteString0);
                    return this;
                }

                public Builder setBuildProduct(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildProduct(s);
                    return this;
                }

                public Builder setBuildProductBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setBuildProductBytes(byteString0);
                    return this;
                }

                public Builder setExtensionVersion(int v) {
                    this.copyOnWrite();
                    ((Android)this.instance).setExtensionVersion(v);
                    return this;
                }

                public Builder setPhoneType(int v) {
                    this.copyOnWrite();
                    ((Android)this.instance).setPhoneType(v);
                    return this;
                }

                public Builder setSimOperator(String s) {
                    this.copyOnWrite();
                    ((Android)this.instance).setSimOperator(s);
                    return this;
                }

                public Builder setSimOperatorBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Android)this.instance).setSimOperatorBytes(byteString0);
                    return this;
                }

                public Builder setVersionCode(int v) {
                    this.copyOnWrite();
                    ((Android)this.instance).setVersionCode(v);
                    return this;
                }
            }

            public static final int ANDROID_FINGERPRINT_FIELD_NUMBER = 3;
            public static final int API_LEVEL_FIELD_NUMBER = 1;
            public static final int APK_DEVELOPER_SIGNING_CERTIFICATE_HASH_FIELD_NUMBER = 5;
            public static final int APP_INSTALLER_FIELD_NUMBER = 4;
            public static final int BUILD_BOARD_FIELD_NUMBER = 6;
            public static final int BUILD_BOOTLOADER_FIELD_NUMBER = 13;
            public static final int BUILD_BRAND_FIELD_NUMBER = 7;
            public static final int BUILD_DEVICE_FIELD_NUMBER = 8;
            public static final int BUILD_DISPLAY_FIELD_NUMBER = 9;
            public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 10;
            public static final int BUILD_HARDWARE_FIELD_NUMBER = 11;
            public static final int BUILD_HOST_FIELD_NUMBER = 12;
            public static final int BUILD_ID_FIELD_NUMBER = 15;
            public static final int BUILD_PRODUCT_FIELD_NUMBER = 14;
            private static final Android DEFAULT_INSTANCE = null;
            public static final int EXTENSION_VERSION_FIELD_NUMBER = 16;
            private static volatile Parser PARSER = null;
            public static final int PHONE_TYPE_FIELD_NUMBER = 17;
            public static final int SIM_OPERATOR_FIELD_NUMBER = 18;
            public static final int VERSION_CODE_FIELD_NUMBER = 2;
            private String androidFingerprint_;
            private int apiLevel_;
            private String apkDeveloperSigningCertificateHash_;
            private String appInstaller_;
            private int bitField0_;
            private String buildBoard_;
            private String buildBootloader_;
            private String buildBrand_;
            private String buildDevice_;
            private String buildDisplay_;
            private String buildFingerprint_;
            private String buildHardware_;
            private String buildHost_;
            private String buildId_;
            private String buildProduct_;
            private int extensionVersion_;
            private int phoneType_;
            private String simOperator_;
            private int versionCode_;

            static {
                Android staticDeviceInfoOuterClass$StaticDeviceInfo$Android0 = new Android();
                Android.DEFAULT_INSTANCE = staticDeviceInfoOuterClass$StaticDeviceInfo$Android0;
                GeneratedMessageLite.registerDefaultInstance(Android.class, staticDeviceInfoOuterClass$StaticDeviceInfo$Android0);
            }

            private Android() {
                this.androidFingerprint_ = "";
                this.appInstaller_ = "";
                this.apkDeveloperSigningCertificateHash_ = "";
                this.buildBoard_ = "";
                this.buildBrand_ = "";
                this.buildDevice_ = "";
                this.buildDisplay_ = "";
                this.buildFingerprint_ = "";
                this.buildHardware_ = "";
                this.buildHost_ = "";
                this.buildBootloader_ = "";
                this.buildProduct_ = "";
                this.buildId_ = "";
                this.simOperator_ = "";
            }

            private void clearAndroidFingerprint() {
                this.bitField0_ &= -5;
                this.androidFingerprint_ = "";
            }

            private void clearApiLevel() {
                this.bitField0_ &= -2;
                this.apiLevel_ = 0;
            }

            private void clearApkDeveloperSigningCertificateHash() {
                this.bitField0_ &= -17;
                this.apkDeveloperSigningCertificateHash_ = "";
            }

            private void clearAppInstaller() {
                this.bitField0_ &= -9;
                this.appInstaller_ = "";
            }

            private void clearBuildBoard() {
                this.bitField0_ &= -33;
                this.buildBoard_ = "";
            }

            private void clearBuildBootloader() {
                this.bitField0_ &= 0xFFFFEFFF;
                this.buildBootloader_ = "";
            }

            private void clearBuildBrand() {
                this.bitField0_ &= -65;
                this.buildBrand_ = "";
            }

            private void clearBuildDevice() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.buildDevice_ = Android.getDefaultInstance().getBuildDevice();
            }

            private void clearBuildDisplay() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.buildDisplay_ = "";
            }

            private void clearBuildFingerprint() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.buildFingerprint_ = "";
            }

            private void clearBuildHardware() {
                this.bitField0_ &= 0xFFFFFBFF;
                this.buildHardware_ = "";
            }

            private void clearBuildHost() {
                this.bitField0_ &= 0xFFFFF7FF;
                this.buildHost_ = "";
            }

            private void clearBuildId() {
                this.bitField0_ &= 0xFFFFBFFF;
                this.buildId_ = "";
            }

            private void clearBuildProduct() {
                this.bitField0_ &= 0xFFFFDFFF;
                this.buildProduct_ = Android.getDefaultInstance().getBuildProduct();
            }

            private void clearExtensionVersion() {
                this.bitField0_ &= 0xFFFF7FFF;
                this.extensionVersion_ = 0;
            }

            private void clearPhoneType() {
                this.bitField0_ &= 0xFFFEFFFF;
                this.phoneType_ = 0;
            }

            private void clearSimOperator() {
                this.bitField0_ &= 0xFFFDFFFF;
                this.simOperator_ = Android.getDefaultInstance().getSimOperator();
            }

            private void clearVersionCode() {
                this.bitField0_ &= -3;
                this.versionCode_ = 0;
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new Android();
                    }
                    case 2: {
                        return new Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(Android.DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000Bለ\n\fለ\u000B\rለ\f\u000Eለ\r\u000Fለ\u000E\u0010ဋ\u000F\u0011င\u0010\u0012ለ\u0011", new Object[]{"bitField0_", "apiLevel_", "versionCode_", "androidFingerprint_", "appInstaller_", "apkDeveloperSigningCertificateHash_", "buildBoard_", "buildBrand_", "buildDevice_", "buildDisplay_", "buildFingerprint_", "buildHardware_", "buildHost_", "buildBootloader_", "buildProduct_", "buildId_", "extensionVersion_", "phoneType_", "simOperator_"});
                    }
                    case 4: {
                        return Android.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = Android.PARSER;
                        if(parser0 == null) {
                            Class class0 = Android.class;
                            synchronized(class0) {
                                parser0 = Android.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(Android.DEFAULT_INSTANCE);
                                    Android.PARSER = parser0;
                                }
                            }
                        }
                        return parser0;
                    }
                    case 6: {
                        return (byte)1;
                    }
                    case 7: {
                        return null;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getAndroidFingerprint() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getAndroidFingerprintBytes() {
                return ByteString.copyFromUtf8(this.androidFingerprint_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public int getApiLevel() {
                return this.apiLevel_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getApkDeveloperSigningCertificateHash() {
                return this.apkDeveloperSigningCertificateHash_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getApkDeveloperSigningCertificateHashBytes() {
                return ByteString.copyFromUtf8(this.apkDeveloperSigningCertificateHash_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getAppInstaller() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getAppInstallerBytes() {
                return ByteString.copyFromUtf8(this.appInstaller_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getBuildBoard() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getBuildBoardBytes() {
                return ByteString.copyFromUtf8(this.buildBoard_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getBuildBootloader() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getBuildBootloaderBytes() {
                return ByteString.copyFromUtf8(this.buildBootloader_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getBuildBrand() {
                return this.buildBrand_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getBuildBrandBytes() {
                return ByteString.copyFromUtf8(this.buildBrand_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getBuildDevice() {
                return this.buildDevice_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getBuildDeviceBytes() {
                return ByteString.copyFromUtf8(this.buildDevice_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getBuildDisplay() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getBuildDisplayBytes() {
                return ByteString.copyFromUtf8(this.buildDisplay_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getBuildFingerprint() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getBuildFingerprintBytes() {
                return ByteString.copyFromUtf8(this.buildFingerprint_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getBuildHardware() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getBuildHardwareBytes() {
                return ByteString.copyFromUtf8(this.buildHardware_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getBuildHost() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getBuildHostBytes() {
                return ByteString.copyFromUtf8(this.buildHost_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getBuildId() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getBuildIdBytes() {
                return ByteString.copyFromUtf8(this.buildId_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getBuildProduct() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getBuildProductBytes() {
                return ByteString.copyFromUtf8(this.buildProduct_);
            }

            public static Android getDefaultInstance() {
                return Android.DEFAULT_INSTANCE;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public int getExtensionVersion() {
                return this.extensionVersion_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public int getPhoneType() {
                return this.phoneType_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public String getSimOperator() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public ByteString getSimOperatorBytes() {
                return ByteString.copyFromUtf8(this.simOperator_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public int getVersionCode() {
                return this.versionCode_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasAndroidFingerprint() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasApiLevel() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasApkDeveloperSigningCertificateHash() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasAppInstaller() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasBuildBoard() {
                return (this.bitField0_ & 0x20) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasBuildBootloader() {
                return (this.bitField0_ & 0x1000) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasBuildBrand() {
                return (this.bitField0_ & 0x40) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasBuildDevice() {
                return (this.bitField0_ & 0x80) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasBuildDisplay() {
                return (this.bitField0_ & 0x100) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasBuildFingerprint() {
                return (this.bitField0_ & 0x200) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasBuildHardware() {
                return (this.bitField0_ & 0x400) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasBuildHost() {
                return (this.bitField0_ & 0x800) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasBuildId() {
                return (this.bitField0_ & 0x4000) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasBuildProduct() {
                return (this.bitField0_ & 0x2000) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasExtensionVersion() {
                return (this.bitField0_ & 0x8000) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasPhoneType() {
                return (this.bitField0_ & 0x10000) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasSimOperator() {
                return (this.bitField0_ & 0x20000) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$AndroidOrBuilder
            public boolean hasVersionCode() {
                return (this.bitField0_ & 2) != 0;
            }

            public static Builder newBuilder() {
                return (Builder)Android.DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Android staticDeviceInfoOuterClass$StaticDeviceInfo$Android0) {
                return (Builder)Android.DEFAULT_INSTANCE.createBuilder(staticDeviceInfoOuterClass$StaticDeviceInfo$Android0);
            }

            public static Android parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (Android)GeneratedMessageLite.parseDelimitedFrom(Android.DEFAULT_INSTANCE, inputStream0);
            }

            public static Android parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Android)GeneratedMessageLite.parseDelimitedFrom(Android.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Android parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, byteString0);
            }

            public static Android parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static Android parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static Android parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static Android parseFrom(InputStream inputStream0) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, inputStream0);
            }

            public static Android parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Android parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static Android parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static Android parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, arr_b);
            }

            public static Android parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Android)GeneratedMessageLite.parseFrom(Android.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return Android.DEFAULT_INSTANCE.getParserForType();
            }

            private void setAndroidFingerprint(String s) {
                s.getClass();
                this.bitField0_ |= 4;
                this.androidFingerprint_ = s;
            }

            private void setAndroidFingerprintBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.androidFingerprint_ = byteString0.toStringUtf8();
                this.bitField0_ |= 4;
            }

            private void setApiLevel(int v) {
                this.bitField0_ |= 1;
                this.apiLevel_ = v;
            }

            private void setApkDeveloperSigningCertificateHash(String s) {
                s.getClass();
                this.bitField0_ |= 16;
                this.apkDeveloperSigningCertificateHash_ = s;
            }

            private void setApkDeveloperSigningCertificateHashBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.apkDeveloperSigningCertificateHash_ = byteString0.toStringUtf8();
                this.bitField0_ |= 16;
            }

            private void setAppInstaller(String s) {
                s.getClass();
                this.bitField0_ |= 8;
                this.appInstaller_ = s;
            }

            private void setAppInstallerBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.appInstaller_ = byteString0.toStringUtf8();
                this.bitField0_ |= 8;
            }

            private void setBuildBoard(String s) {
                s.getClass();
                this.bitField0_ |= 0x20;
                this.buildBoard_ = s;
            }

            private void setBuildBoardBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.buildBoard_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x20;
            }

            private void setBuildBootloader(String s) {
                s.getClass();
                this.bitField0_ |= 0x1000;
                this.buildBootloader_ = s;
            }

            private void setBuildBootloaderBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.buildBootloader_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x1000;
            }

            private void setBuildBrand(String s) {
                s.getClass();
                this.bitField0_ |= 0x40;
                this.buildBrand_ = s;
            }

            private void setBuildBrandBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.buildBrand_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x40;
            }

            private void setBuildDevice(String s) {
                s.getClass();
                this.bitField0_ |= 0x80;
                this.buildDevice_ = s;
            }

            private void setBuildDeviceBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.buildDevice_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x80;
            }

            private void setBuildDisplay(String s) {
                s.getClass();
                this.bitField0_ |= 0x100;
                this.buildDisplay_ = s;
            }

            private void setBuildDisplayBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.buildDisplay_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x100;
            }

            private void setBuildFingerprint(String s) {
                s.getClass();
                this.bitField0_ |= 0x200;
                this.buildFingerprint_ = s;
            }

            private void setBuildFingerprintBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.buildFingerprint_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x200;
            }

            private void setBuildHardware(String s) {
                s.getClass();
                this.bitField0_ |= 0x400;
                this.buildHardware_ = s;
            }

            private void setBuildHardwareBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.buildHardware_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x400;
            }

            private void setBuildHost(String s) {
                s.getClass();
                this.bitField0_ |= 0x800;
                this.buildHost_ = s;
            }

            private void setBuildHostBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.buildHost_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x800;
            }

            private void setBuildId(String s) {
                s.getClass();
                this.bitField0_ |= 0x4000;
                this.buildId_ = s;
            }

            private void setBuildIdBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.buildId_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x4000;
            }

            private void setBuildProduct(String s) {
                s.getClass();
                this.bitField0_ |= 0x2000;
                this.buildProduct_ = s;
            }

            private void setBuildProductBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.buildProduct_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x2000;
            }

            private void setExtensionVersion(int v) {
                this.bitField0_ |= 0x8000;
                this.extensionVersion_ = v;
            }

            private void setPhoneType(int v) {
                this.bitField0_ |= 0x10000;
                this.phoneType_ = v;
            }

            private void setSimOperator(String s) {
                s.getClass();
                this.bitField0_ |= 0x20000;
                this.simOperator_ = s;
            }

            private void setSimOperatorBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.simOperator_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x20000;
            }

            private void setVersionCode(int v) {
                this.bitField0_ |= 2;
                this.versionCode_ = v;
            }
        }

        public interface AndroidOrBuilder extends MessageLiteOrBuilder {
            String getAndroidFingerprint();

            ByteString getAndroidFingerprintBytes();

            int getApiLevel();

            String getApkDeveloperSigningCertificateHash();

            ByteString getApkDeveloperSigningCertificateHashBytes();

            String getAppInstaller();

            ByteString getAppInstallerBytes();

            String getBuildBoard();

            ByteString getBuildBoardBytes();

            String getBuildBootloader();

            ByteString getBuildBootloaderBytes();

            String getBuildBrand();

            ByteString getBuildBrandBytes();

            String getBuildDevice();

            ByteString getBuildDeviceBytes();

            String getBuildDisplay();

            ByteString getBuildDisplayBytes();

            String getBuildFingerprint();

            ByteString getBuildFingerprintBytes();

            String getBuildHardware();

            ByteString getBuildHardwareBytes();

            String getBuildHost();

            ByteString getBuildHostBytes();

            String getBuildId();

            ByteString getBuildIdBytes();

            String getBuildProduct();

            ByteString getBuildProductBytes();

            int getExtensionVersion();

            int getPhoneType();

            String getSimOperator();

            ByteString getSimOperatorBytes();

            int getVersionCode();

            boolean hasAndroidFingerprint();

            boolean hasApiLevel();

            boolean hasApkDeveloperSigningCertificateHash();

            boolean hasAppInstaller();

            boolean hasBuildBoard();

            boolean hasBuildBootloader();

            boolean hasBuildBrand();

            boolean hasBuildDevice();

            boolean hasBuildDisplay();

            boolean hasBuildFingerprint();

            boolean hasBuildHardware();

            boolean hasBuildHost();

            boolean hasBuildId();

            boolean hasBuildProduct();

            boolean hasExtensionVersion();

            boolean hasPhoneType();

            boolean hasSimOperator();

            boolean hasVersionCode();
        }

        public static final class gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements StaticDeviceInfoOrBuilder {
            private gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder() {
                super(StaticDeviceInfo.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder(a staticDeviceInfoOuterClass$a0) {
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder addAllStores(Iterable iterable0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).addAllStores(iterable0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder addStores(String s) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).addStores(s);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder addStoresBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).addStoresBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearAndroid() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearAndroid();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearAppDebuggable() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearAppDebuggable();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearBundleId() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearBundleId();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearBundleVersion() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearBundleVersion();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearCpuCount() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearCpuCount();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearCpuModel() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearCpuModel();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearDeviceMake() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearDeviceMake();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearDeviceModel() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearDeviceModel();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearGpuModel() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearGpuModel();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearIos() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearIos();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearMadeWithUnity() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearMadeWithUnity();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearOsVersion() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearOsVersion();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearPlatformSpecific() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearPlatformSpecific();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearRooted() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearRooted();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearScreenDensity() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearScreenDensity();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearScreenHeight() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearScreenHeight();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearScreenSize() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearScreenSize();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearScreenWidth() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearScreenWidth();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearStores() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearStores();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearTotalDiskSpace() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearTotalDiskSpace();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearTotalRamMemory() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearTotalRamMemory();
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder clearWebviewUa() {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).clearWebviewUa();
                return this;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public Android getAndroid() {
                return ((StaticDeviceInfo)this.instance).getAndroid();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean getAppDebuggable() {
                return ((StaticDeviceInfo)this.instance).getAppDebuggable();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public String getBundleId() {
                return ((StaticDeviceInfo)this.instance).getBundleId();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public ByteString getBundleIdBytes() {
                return ((StaticDeviceInfo)this.instance).getBundleIdBytes();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public String getBundleVersion() {
                return ((StaticDeviceInfo)this.instance).getBundleVersion();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public ByteString getBundleVersionBytes() {
                return ((StaticDeviceInfo)this.instance).getBundleVersionBytes();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public long getCpuCount() {
                return ((StaticDeviceInfo)this.instance).getCpuCount();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public String getCpuModel() {
                return ((StaticDeviceInfo)this.instance).getCpuModel();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public ByteString getCpuModelBytes() {
                return ((StaticDeviceInfo)this.instance).getCpuModelBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public String getDeviceMake() {
                return "";
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public ByteString getDeviceMakeBytes() {
                return ((StaticDeviceInfo)this.instance).getDeviceMakeBytes();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public String getDeviceModel() {
                return ((StaticDeviceInfo)this.instance).getDeviceModel();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public ByteString getDeviceModelBytes() {
                return ((StaticDeviceInfo)this.instance).getDeviceModelBytes();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public String getGpuModel() {
                return ((StaticDeviceInfo)this.instance).getGpuModel();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public ByteString getGpuModelBytes() {
                return ((StaticDeviceInfo)this.instance).getGpuModelBytes();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public Ios getIos() {
                return ((StaticDeviceInfo)this.instance).getIos();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean getMadeWithUnity() {
                return ((StaticDeviceInfo)this.instance).getMadeWithUnity();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public String getOsVersion() {
                return ((StaticDeviceInfo)this.instance).getOsVersion();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public ByteString getOsVersionBytes() {
                return ((StaticDeviceInfo)this.instance).getOsVersionBytes();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public PlatformSpecificCase getPlatformSpecificCase() {
                return ((StaticDeviceInfo)this.instance).getPlatformSpecificCase();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean getRooted() {
                return ((StaticDeviceInfo)this.instance).getRooted();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public int getScreenDensity() {
                return ((StaticDeviceInfo)this.instance).getScreenDensity();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public int getScreenHeight() {
                return ((StaticDeviceInfo)this.instance).getScreenHeight();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public int getScreenSize() {
                return ((StaticDeviceInfo)this.instance).getScreenSize();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public int getScreenWidth() {
                return ((StaticDeviceInfo)this.instance).getScreenWidth();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public String getStores(int v) {
                return ((StaticDeviceInfo)this.instance).getStores(v);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public ByteString getStoresBytes(int v) {
                return ((StaticDeviceInfo)this.instance).getStoresBytes(v);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public int getStoresCount() {
                return ((StaticDeviceInfo)this.instance).getStoresCount();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public List getStoresList() {
                return DesugarCollections.unmodifiableList(((StaticDeviceInfo)this.instance).getStoresList());
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public long getTotalDiskSpace() {
                return ((StaticDeviceInfo)this.instance).getTotalDiskSpace();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public long getTotalRamMemory() {
                return ((StaticDeviceInfo)this.instance).getTotalRamMemory();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public String getWebviewUa() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public ByteString getWebviewUaBytes() {
                return ((StaticDeviceInfo)this.instance).getWebviewUaBytes();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasAndroid() {
                return ((StaticDeviceInfo)this.instance).hasAndroid();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasAppDebuggable() {
                return ((StaticDeviceInfo)this.instance).hasAppDebuggable();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasBundleId() {
                return ((StaticDeviceInfo)this.instance).hasBundleId();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasBundleVersion() {
                return ((StaticDeviceInfo)this.instance).hasBundleVersion();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasCpuCount() {
                return ((StaticDeviceInfo)this.instance).hasCpuCount();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasCpuModel() {
                return ((StaticDeviceInfo)this.instance).hasCpuModel();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasDeviceMake() {
                return ((StaticDeviceInfo)this.instance).hasDeviceMake();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasDeviceModel() {
                return ((StaticDeviceInfo)this.instance).hasDeviceModel();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasGpuModel() {
                return ((StaticDeviceInfo)this.instance).hasGpuModel();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasIos() {
                return ((StaticDeviceInfo)this.instance).hasIos();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasMadeWithUnity() {
                return ((StaticDeviceInfo)this.instance).hasMadeWithUnity();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasOsVersion() {
                return ((StaticDeviceInfo)this.instance).hasOsVersion();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasRooted() {
                return ((StaticDeviceInfo)this.instance).hasRooted();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasScreenDensity() {
                return ((StaticDeviceInfo)this.instance).hasScreenDensity();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasScreenHeight() {
                return ((StaticDeviceInfo)this.instance).hasScreenHeight();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasScreenSize() {
                return ((StaticDeviceInfo)this.instance).hasScreenSize();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasScreenWidth() {
                return ((StaticDeviceInfo)this.instance).hasScreenWidth();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasTotalDiskSpace() {
                return ((StaticDeviceInfo)this.instance).hasTotalDiskSpace();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasTotalRamMemory() {
                return ((StaticDeviceInfo)this.instance).hasTotalRamMemory();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
            public boolean hasWebviewUa() {
                return ((StaticDeviceInfo)this.instance).hasWebviewUa();
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder mergeAndroid(Android staticDeviceInfoOuterClass$StaticDeviceInfo$Android0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).mergeAndroid(staticDeviceInfoOuterClass$StaticDeviceInfo$Android0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder mergeIos(Ios staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).mergeIos(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setAndroid(Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setAndroid(((Android)staticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setAndroid(Android staticDeviceInfoOuterClass$StaticDeviceInfo$Android0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setAndroid(staticDeviceInfoOuterClass$StaticDeviceInfo$Android0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setAppDebuggable(boolean z) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setAppDebuggable(z);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setBundleId(String s) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setBundleId(s);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setBundleIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setBundleIdBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setBundleVersion(String s) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setBundleVersion(s);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setBundleVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setBundleVersionBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setCpuCount(long v) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setCpuCount(v);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setCpuModel(String s) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setCpuModel(s);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setCpuModelBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setCpuModelBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setDeviceMake(String s) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setDeviceMake(s);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setDeviceMakeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setDeviceMakeBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setDeviceModel(String s) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setDeviceModel(s);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setDeviceModelBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setDeviceModelBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setGpuModel(String s) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setGpuModel(s);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setGpuModelBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setGpuModelBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setIos(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setIos(((Ios)staticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setIos(Ios staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setIos(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setMadeWithUnity(boolean z) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setMadeWithUnity(z);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setOsVersion(String s) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setOsVersion(s);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setOsVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setOsVersionBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setRooted(boolean z) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setRooted(z);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setScreenDensity(int v) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setScreenDensity(v);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setScreenHeight(int v) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setScreenHeight(v);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setScreenSize(int v) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setScreenSize(v);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setScreenWidth(int v) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setScreenWidth(v);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setStores(int v, String s) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setStores(v, s);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setTotalDiskSpace(long v) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setTotalDiskSpace(v);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setTotalRamMemory(long v) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setTotalRamMemory(v);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setWebviewUa(String s) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setWebviewUa(s);
                return this;
            }

            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder setWebviewUaBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((StaticDeviceInfo)this.instance).setWebviewUaBytes(byteString0);
                return this;
            }
        }

        public static final class Ios extends GeneratedMessageLite implements IosOrBuilder {
            public static final class gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements IosOrBuilder {
                private gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder() {
                    super(Ios.DEFAULT_INSTANCE);
                }

                gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder(a staticDeviceInfoOuterClass$a0) {
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder addAllSkadnetworkId(Iterable iterable0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addAllSkadnetworkId(iterable0);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder addSkadnetworkId(String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addSkadnetworkId(s);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder addSkadnetworkIdBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).addSkadnetworkIdBytes(byteString0);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearBuiltSdkVersion() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearBuiltSdkVersion();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearCanMakePayments() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearCanMakePayments();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearScreenScale() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearScreenScale();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearSimulator() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearSimulator();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearSkadnetworkId() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearSkadnetworkId();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearSystemBootTime() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearSystemBootTime();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearXcodeBuildVersion() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearXcodeBuildVersion();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearXcodeSdkBuildVersion() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearXcodeSdkBuildVersion();
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder clearXcodeVersion() {
                    this.copyOnWrite();
                    ((Ios)this.instance).clearXcodeVersion();
                    return this;
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public String getBuiltSdkVersion() {
                    return ((Ios)this.instance).getBuiltSdkVersion();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public ByteString getBuiltSdkVersionBytes() {
                    return ((Ios)this.instance).getBuiltSdkVersionBytes();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public boolean getCanMakePayments() {
                    return ((Ios)this.instance).getCanMakePayments();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public int getScreenScale() {
                    return ((Ios)this.instance).getScreenScale();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public boolean getSimulator() {
                    return ((Ios)this.instance).getSimulator();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public String getSkadnetworkId(int v) {
                    return ((Ios)this.instance).getSkadnetworkId(v);
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public ByteString getSkadnetworkIdBytes(int v) {
                    return ((Ios)this.instance).getSkadnetworkIdBytes(v);
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public int getSkadnetworkIdCount() {
                    return ((Ios)this.instance).getSkadnetworkIdCount();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public List getSkadnetworkIdList() {
                    return DesugarCollections.unmodifiableList(((Ios)this.instance).getSkadnetworkIdList());
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public long getSystemBootTime() {
                    return ((Ios)this.instance).getSystemBootTime();
                }

                // 去混淆评级： 低(20)
                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public String getXcodeBuildVersion() {
                    return "";
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public ByteString getXcodeBuildVersionBytes() {
                    return ((Ios)this.instance).getXcodeBuildVersionBytes();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public String getXcodeSdkBuildVersion() {
                    return ((Ios)this.instance).getXcodeSdkBuildVersion();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public ByteString getXcodeSdkBuildVersionBytes() {
                    return ((Ios)this.instance).getXcodeSdkBuildVersionBytes();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public String getXcodeVersion() {
                    return ((Ios)this.instance).getXcodeVersion();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public ByteString getXcodeVersionBytes() {
                    return ((Ios)this.instance).getXcodeVersionBytes();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public boolean hasBuiltSdkVersion() {
                    return ((Ios)this.instance).hasBuiltSdkVersion();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public boolean hasCanMakePayments() {
                    return ((Ios)this.instance).hasCanMakePayments();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public boolean hasScreenScale() {
                    return ((Ios)this.instance).hasScreenScale();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public boolean hasSimulator() {
                    return ((Ios)this.instance).hasSimulator();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public boolean hasSystemBootTime() {
                    return ((Ios)this.instance).hasSystemBootTime();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public boolean hasXcodeBuildVersion() {
                    return ((Ios)this.instance).hasXcodeBuildVersion();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public boolean hasXcodeSdkBuildVersion() {
                    return ((Ios)this.instance).hasXcodeSdkBuildVersion();
                }

                @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
                public boolean hasXcodeVersion() {
                    return ((Ios)this.instance).hasXcodeVersion();
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setBuiltSdkVersion(String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setBuiltSdkVersion(s);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setBuiltSdkVersionBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setBuiltSdkVersionBytes(byteString0);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setCanMakePayments(boolean z) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setCanMakePayments(z);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setScreenScale(int v) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setScreenScale(v);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setSimulator(boolean z) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setSimulator(z);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setSkadnetworkId(int v, String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setSkadnetworkId(v, s);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setSystemBootTime(long v) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setSystemBootTime(v);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeBuildVersion(String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeBuildVersion(s);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeBuildVersionBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeBuildVersionBytes(byteString0);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeSdkBuildVersion(String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeSdkBuildVersion(s);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeSdkBuildVersionBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeSdkBuildVersionBytes(byteString0);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeVersion(String s) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeVersion(s);
                    return this;
                }

                public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder setXcodeVersionBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Ios)this.instance).setXcodeVersionBytes(byteString0);
                    return this;
                }
            }

            public static final int BUILT_SDK_VERSION_FIELD_NUMBER = 3;
            public static final int CAN_MAKE_PAYMENTS_FIELD_NUMBER = 6;
            private static final Ios DEFAULT_INSTANCE = null;
            private static volatile Parser PARSER = null;
            public static final int SCREEN_SCALE_FIELD_NUMBER = 5;
            public static final int SIMULATOR_FIELD_NUMBER = 2;
            public static final int SKADNETWORK_ID_FIELD_NUMBER = 4;
            public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 1;
            public static final int XCODE_BUILD_VERSION_FIELD_NUMBER = 8;
            public static final int XCODE_SDK_BUILD_VERSION_FIELD_NUMBER = 9;
            public static final int XCODE_VERSION_FIELD_NUMBER = 7;
            private int bitField0_;
            private String builtSdkVersion_;
            private boolean canMakePayments_;
            private int screenScale_;
            private boolean simulator_;
            private ProtobufList skadnetworkId_;
            private long systemBootTime_;
            private String xcodeBuildVersion_;
            private String xcodeSdkBuildVersion_;
            private String xcodeVersion_;

            static {
                Ios staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0 = new Ios();
                Ios.DEFAULT_INSTANCE = staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0;
                GeneratedMessageLite.registerDefaultInstance(Ios.class, staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0);
            }

            private Ios() {
                this.builtSdkVersion_ = "";
                this.skadnetworkId_ = GeneratedMessageLite.emptyProtobufList();
                this.xcodeVersion_ = "";
                this.xcodeBuildVersion_ = "";
                this.xcodeSdkBuildVersion_ = "";
            }

            private void addAllSkadnetworkId(Iterable iterable0) {
                this.ensureSkadnetworkIdIsMutable();
                AbstractMessageLite.addAll(iterable0, this.skadnetworkId_);
            }

            private void addSkadnetworkId(String s) {
                s.getClass();
                this.ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.add(s);
            }

            private void addSkadnetworkIdBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.add(byteString0.toStringUtf8());
            }

            private void clearBuiltSdkVersion() {
                this.bitField0_ &= -5;
                this.builtSdkVersion_ = "";
            }

            private void clearCanMakePayments() {
                this.bitField0_ &= -17;
                this.canMakePayments_ = false;
            }

            private void clearScreenScale() {
                this.bitField0_ &= -9;
                this.screenScale_ = 0;
            }

            private void clearSimulator() {
                this.bitField0_ &= -3;
                this.simulator_ = false;
            }

            private void clearSkadnetworkId() {
                this.skadnetworkId_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearSystemBootTime() {
                this.bitField0_ &= -2;
                this.systemBootTime_ = 0L;
            }

            private void clearXcodeBuildVersion() {
                this.bitField0_ &= -65;
                this.xcodeBuildVersion_ = Ios.getDefaultInstance().getXcodeBuildVersion();
            }

            private void clearXcodeSdkBuildVersion() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.xcodeSdkBuildVersion_ = "";
            }

            private void clearXcodeVersion() {
                this.bitField0_ &= -33;
                this.xcodeVersion_ = Ios.getDefaultInstance().getXcodeVersion();
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new Ios();
                    }
                    case 2: {
                        return new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(Ios.DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004Ț\u0005ဋ\u0003\u0006ဇ\u0004\u0007ለ\u0005\bለ\u0006\tለ\u0007", new Object[]{"bitField0_", "systemBootTime_", "simulator_", "builtSdkVersion_", "skadnetworkId_", "screenScale_", "canMakePayments_", "xcodeVersion_", "xcodeBuildVersion_", "xcodeSdkBuildVersion_"});
                    }
                    case 4: {
                        return Ios.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = Ios.PARSER;
                        if(parser0 == null) {
                            Class class0 = Ios.class;
                            synchronized(class0) {
                                parser0 = Ios.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(Ios.DEFAULT_INSTANCE);
                                    Ios.PARSER = parser0;
                                }
                            }
                        }
                        return parser0;
                    }
                    case 6: {
                        return (byte)1;
                    }
                    case 7: {
                        return null;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }

            private void ensureSkadnetworkIdIsMutable() {
                ProtobufList internal$ProtobufList0 = this.skadnetworkId_;
                if(!internal$ProtobufList0.isModifiable()) {
                    this.skadnetworkId_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
                }
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public String getBuiltSdkVersion() {
                return this.builtSdkVersion_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public ByteString getBuiltSdkVersionBytes() {
                return ByteString.copyFromUtf8(this.builtSdkVersion_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public boolean getCanMakePayments() {
                return this.canMakePayments_;
            }

            public static Ios getDefaultInstance() {
                return Ios.DEFAULT_INSTANCE;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public int getScreenScale() {
                return this.screenScale_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public boolean getSimulator() {
                return this.simulator_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public String getSkadnetworkId(int v) {
                return (String)this.skadnetworkId_.get(v);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public ByteString getSkadnetworkIdBytes(int v) {
                return ByteString.copyFromUtf8(((String)this.skadnetworkId_.get(v)));
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public int getSkadnetworkIdCount() {
                return this.skadnetworkId_.size();
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public List getSkadnetworkIdList() {
                return this.skadnetworkId_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public long getSystemBootTime() {
                return this.systemBootTime_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public String getXcodeBuildVersion() [...] // 潜在的解密器

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public ByteString getXcodeBuildVersionBytes() {
                return ByteString.copyFromUtf8(this.xcodeBuildVersion_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public String getXcodeSdkBuildVersion() {
                return this.xcodeSdkBuildVersion_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public ByteString getXcodeSdkBuildVersionBytes() {
                return ByteString.copyFromUtf8(this.xcodeSdkBuildVersion_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public String getXcodeVersion() {
                return this.xcodeVersion_;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public ByteString getXcodeVersionBytes() {
                return ByteString.copyFromUtf8(this.xcodeVersion_);
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public boolean hasBuiltSdkVersion() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public boolean hasCanMakePayments() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public boolean hasScreenScale() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public boolean hasSimulator() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public boolean hasSystemBootTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public boolean hasXcodeBuildVersion() {
                return (this.bitField0_ & 0x40) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public boolean hasXcodeSdkBuildVersion() {
                return (this.bitField0_ & 0x80) != 0;
            }

            @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$IosOrBuilder
            public boolean hasXcodeVersion() {
                return (this.bitField0_ & 0x20) != 0;
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder newBuilder() {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder)Ios.DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder newBuilder(Ios staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0) {
                return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder)Ios.DEFAULT_INSTANCE.createBuilder(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0);
            }

            public static Ios parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (Ios)GeneratedMessageLite.parseDelimitedFrom(Ios.DEFAULT_INSTANCE, inputStream0);
            }

            public static Ios parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Ios)GeneratedMessageLite.parseDelimitedFrom(Ios.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Ios parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, byteString0);
            }

            public static Ios parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static Ios parseFrom(InputStream inputStream0) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, inputStream0);
            }

            public static Ios parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static Ios parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, arr_b);
            }

            public static Ios parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Ios)GeneratedMessageLite.parseFrom(Ios.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return Ios.DEFAULT_INSTANCE.getParserForType();
            }

            private void setBuiltSdkVersion(String s) {
                s.getClass();
                this.bitField0_ |= 4;
                this.builtSdkVersion_ = s;
            }

            private void setBuiltSdkVersionBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.builtSdkVersion_ = byteString0.toStringUtf8();
                this.bitField0_ |= 4;
            }

            private void setCanMakePayments(boolean z) {
                this.bitField0_ |= 16;
                this.canMakePayments_ = z;
            }

            private void setScreenScale(int v) {
                this.bitField0_ |= 8;
                this.screenScale_ = v;
            }

            private void setSimulator(boolean z) {
                this.bitField0_ |= 2;
                this.simulator_ = z;
            }

            private void setSkadnetworkId(int v, String s) {
                s.getClass();
                this.ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.set(v, s);
            }

            private void setSystemBootTime(long v) {
                this.bitField0_ |= 1;
                this.systemBootTime_ = v;
            }

            private void setXcodeBuildVersion(String s) {
                s.getClass();
                this.bitField0_ |= 0x40;
                this.xcodeBuildVersion_ = s;
            }

            private void setXcodeBuildVersionBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.xcodeBuildVersion_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x40;
            }

            private void setXcodeSdkBuildVersion(String s) {
                s.getClass();
                this.bitField0_ |= 0x80;
                this.xcodeSdkBuildVersion_ = s;
            }

            private void setXcodeSdkBuildVersionBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.xcodeSdkBuildVersion_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x80;
            }

            private void setXcodeVersion(String s) {
                s.getClass();
                this.bitField0_ |= 0x20;
                this.xcodeVersion_ = s;
            }

            private void setXcodeVersionBytes(ByteString byteString0) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString0);
                this.xcodeVersion_ = byteString0.toStringUtf8();
                this.bitField0_ |= 0x20;
            }
        }

        public interface IosOrBuilder extends MessageLiteOrBuilder {
            String getBuiltSdkVersion();

            ByteString getBuiltSdkVersionBytes();

            boolean getCanMakePayments();

            int getScreenScale();

            boolean getSimulator();

            String getSkadnetworkId(int arg1);

            ByteString getSkadnetworkIdBytes(int arg1);

            int getSkadnetworkIdCount();

            List getSkadnetworkIdList();

            long getSystemBootTime();

            String getXcodeBuildVersion();

            ByteString getXcodeBuildVersionBytes();

            String getXcodeSdkBuildVersion();

            ByteString getXcodeSdkBuildVersionBytes();

            String getXcodeVersion();

            ByteString getXcodeVersionBytes();

            boolean hasBuiltSdkVersion();

            boolean hasCanMakePayments();

            boolean hasScreenScale();

            boolean hasSimulator();

            boolean hasSystemBootTime();

            boolean hasXcodeBuildVersion();

            boolean hasXcodeSdkBuildVersion();

            boolean hasXcodeVersion();
        }

        public static enum PlatformSpecificCase {
            ANDROID(19),
            IOS(20),
            PLATFORMSPECIFIC_NOT_SET(0);

            private final int value;

            private static PlatformSpecificCase[] $values() [...] // Inlined contents

            private PlatformSpecificCase(int v1) {
                this.value = v1;
            }

            public static PlatformSpecificCase forNumber(int v) {
                switch(v) {
                    case 0: {
                        return PlatformSpecificCase.PLATFORMSPECIFIC_NOT_SET;
                    }
                    case 19: {
                        return PlatformSpecificCase.ANDROID;
                    }
                    case 20: {
                        return PlatformSpecificCase.IOS;
                    }
                    default: {
                        return null;
                    }
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PlatformSpecificCase valueOf(int v) {
                return PlatformSpecificCase.forNumber(v);
            }
        }

        public static final int ANDROID_FIELD_NUMBER = 19;
        public static final int APP_DEBUGGABLE_FIELD_NUMBER = 3;
        public static final int BUNDLE_ID_FIELD_NUMBER = 1;
        public static final int BUNDLE_VERSION_FIELD_NUMBER = 2;
        public static final int CPU_COUNT_FIELD_NUMBER = 17;
        public static final int CPU_MODEL_FIELD_NUMBER = 16;
        private static final StaticDeviceInfo DEFAULT_INSTANCE = null;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 6;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 7;
        public static final int GPU_MODEL_FIELD_NUMBER = 18;
        public static final int IOS_FIELD_NUMBER = 20;
        public static final int MADE_WITH_UNITY_FIELD_NUMBER = 21;
        public static final int OS_VERSION_FIELD_NUMBER = 5;
        private static volatile Parser PARSER = null;
        public static final int ROOTED_FIELD_NUMBER = 4;
        public static final int SCREEN_DENSITY_FIELD_NUMBER = 9;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 11;
        public static final int SCREEN_SIZE_FIELD_NUMBER = 12;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 10;
        public static final int STORES_FIELD_NUMBER = 13;
        public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 14;
        public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 15;
        public static final int WEBVIEW_UA_FIELD_NUMBER = 8;
        private boolean appDebuggable_;
        private int bitField0_;
        private String bundleId_;
        private String bundleVersion_;
        private long cpuCount_;
        private String cpuModel_;
        private String deviceMake_;
        private String deviceModel_;
        private String gpuModel_;
        private boolean madeWithUnity_;
        private String osVersion_;
        private int platformSpecificCase_;
        private Object platformSpecific_;
        private boolean rooted_;
        private int screenDensity_;
        private int screenHeight_;
        private int screenSize_;
        private int screenWidth_;
        private ProtobufList stores_;
        private long totalDiskSpace_;
        private long totalRamMemory_;
        private String webviewUa_;

        static {
            StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0 = new StaticDeviceInfo();
            StaticDeviceInfo.DEFAULT_INSTANCE = staticDeviceInfoOuterClass$StaticDeviceInfo0;
            GeneratedMessageLite.registerDefaultInstance(StaticDeviceInfo.class, staticDeviceInfoOuterClass$StaticDeviceInfo0);
        }

        private StaticDeviceInfo() {
            this.platformSpecificCase_ = 0;
            this.bundleId_ = "";
            this.bundleVersion_ = "";
            this.osVersion_ = "";
            this.deviceMake_ = "";
            this.deviceModel_ = "";
            this.webviewUa_ = "";
            this.stores_ = GeneratedMessageLite.emptyProtobufList();
            this.cpuModel_ = "";
            this.gpuModel_ = "";
        }

        private void addAllStores(Iterable iterable0) {
            this.ensureStoresIsMutable();
            AbstractMessageLite.addAll(iterable0, this.stores_);
        }

        private void addStores(String s) {
            s.getClass();
            this.ensureStoresIsMutable();
            this.stores_.add(s);
        }

        private void addStoresBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.ensureStoresIsMutable();
            this.stores_.add(byteString0.toStringUtf8());
        }

        private void clearAndroid() {
            if(this.platformSpecificCase_ == 19) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        private void clearAppDebuggable() {
            this.bitField0_ &= -5;
            this.appDebuggable_ = false;
        }

        private void clearBundleId() {
            this.bitField0_ &= -2;
            this.bundleId_ = StaticDeviceInfo.getDefaultInstance().getBundleId();
        }

        private void clearBundleVersion() {
            this.bitField0_ &= -3;
            this.bundleVersion_ = "";
        }

        private void clearCpuCount() {
            this.bitField0_ &= 0xFFFF7FFF;
            this.cpuCount_ = 0L;
        }

        private void clearCpuModel() {
            this.bitField0_ &= 0xFFFFBFFF;
            this.cpuModel_ = StaticDeviceInfo.getDefaultInstance().getCpuModel();
        }

        private void clearDeviceMake() {
            this.bitField0_ &= -33;
            this.deviceMake_ = StaticDeviceInfo.getDefaultInstance().getDeviceMake();
        }

        private void clearDeviceModel() {
            this.bitField0_ &= -65;
            this.deviceModel_ = StaticDeviceInfo.getDefaultInstance().getDeviceModel();
        }

        private void clearGpuModel() {
            this.bitField0_ &= 0xFFFEFFFF;
            this.gpuModel_ = StaticDeviceInfo.getDefaultInstance().getGpuModel();
        }

        private void clearIos() {
            if(this.platformSpecificCase_ == 20) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        private void clearMadeWithUnity() {
            this.bitField0_ &= 0xFFFDFFFF;
            this.madeWithUnity_ = false;
        }

        private void clearOsVersion() {
            this.bitField0_ &= -17;
            this.osVersion_ = StaticDeviceInfo.getDefaultInstance().getOsVersion();
        }

        private void clearPlatformSpecific() {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }

        private void clearRooted() {
            this.bitField0_ &= -9;
            this.rooted_ = false;
        }

        private void clearScreenDensity() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.screenDensity_ = 0;
        }

        private void clearScreenHeight() {
            this.bitField0_ &= 0xFFFFFBFF;
            this.screenHeight_ = 0;
        }

        private void clearScreenSize() {
            this.bitField0_ &= 0xFFFFF7FF;
            this.screenSize_ = 0;
        }

        private void clearScreenWidth() {
            this.bitField0_ &= 0xFFFFFDFF;
            this.screenWidth_ = 0;
        }

        private void clearStores() {
            this.stores_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearTotalDiskSpace() {
            this.bitField0_ &= 0xFFFFEFFF;
            this.totalDiskSpace_ = 0L;
        }

        private void clearTotalRamMemory() {
            this.bitField0_ &= 0xFFFFDFFF;
            this.totalRamMemory_ = 0L;
        }

        private void clearWebviewUa() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.webviewUa_ = "";
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new StaticDeviceInfo();
                }
                case 2: {
                    return new gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(StaticDeviceInfo.DEFAULT_INSTANCE, "\u0000\u0015\u0001\u0001\u0001\u0015\u0015\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tဋ\b\nဋ\t\u000Bဋ\n\fဋ\u000B\rȚ\u000Eဂ\f\u000Fဂ\r\u0010ለ\u000E\u0011ဂ\u000F\u0012ለ\u0010\u0013<\u0000\u0014<\u0000\u0015ဇ\u0011", new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "bundleId_", "bundleVersion_", "appDebuggable_", "rooted_", "osVersion_", "deviceMake_", "deviceModel_", "webviewUa_", "screenDensity_", "screenWidth_", "screenHeight_", "screenSize_", "stores_", "totalDiskSpace_", "totalRamMemory_", "cpuModel_", "cpuCount_", "gpuModel_", Android.class, Ios.class, "madeWithUnity_"});
                }
                case 4: {
                    return StaticDeviceInfo.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = StaticDeviceInfo.PARSER;
                    if(parser0 == null) {
                        Class class0 = StaticDeviceInfo.class;
                        synchronized(class0) {
                            parser0 = StaticDeviceInfo.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(StaticDeviceInfo.DEFAULT_INSTANCE);
                                StaticDeviceInfo.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return (byte)1;
                }
                case 7: {
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureStoresIsMutable() {
            ProtobufList internal$ProtobufList0 = this.stores_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.stores_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public Android getAndroid() {
            return this.platformSpecificCase_ == 19 ? ((Android)this.platformSpecific_) : Android.getDefaultInstance();
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean getAppDebuggable() {
            return this.appDebuggable_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public String getBundleId() {
            return this.bundleId_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public ByteString getBundleIdBytes() {
            return ByteString.copyFromUtf8(this.bundleId_);
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public String getBundleVersion() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public ByteString getBundleVersionBytes() {
            return ByteString.copyFromUtf8(this.bundleVersion_);
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public long getCpuCount() {
            return this.cpuCount_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public String getCpuModel() {
            return this.cpuModel_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public ByteString getCpuModelBytes() {
            return ByteString.copyFromUtf8(this.cpuModel_);
        }

        public static StaticDeviceInfo getDefaultInstance() {
            return StaticDeviceInfo.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public String getDeviceMake() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8(this.deviceMake_);
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public String getDeviceModel() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public String getGpuModel() {
            return this.gpuModel_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public ByteString getGpuModelBytes() {
            return ByteString.copyFromUtf8(this.gpuModel_);
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public Ios getIos() {
            return this.platformSpecificCase_ == 20 ? ((Ios)this.platformSpecific_) : Ios.getDefaultInstance();
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean getMadeWithUnity() {
            return this.madeWithUnity_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public String getOsVersion() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public PlatformSpecificCase getPlatformSpecificCase() {
            return PlatformSpecificCase.forNumber(this.platformSpecificCase_);
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean getRooted() {
            return this.rooted_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public int getScreenDensity() {
            return this.screenDensity_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public int getScreenHeight() {
            return this.screenHeight_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public int getScreenSize() {
            return this.screenSize_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public int getScreenWidth() {
            return this.screenWidth_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public String getStores(int v) {
            return (String)this.stores_.get(v);
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public ByteString getStoresBytes(int v) {
            return ByteString.copyFromUtf8(((String)this.stores_.get(v)));
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public int getStoresCount() {
            return this.stores_.size();
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public List getStoresList() {
            return this.stores_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public long getTotalDiskSpace() {
            return this.totalDiskSpace_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public long getTotalRamMemory() {
            return this.totalRamMemory_;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public String getWebviewUa() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public ByteString getWebviewUaBytes() {
            return ByteString.copyFromUtf8(this.webviewUa_);
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasAndroid() {
            return this.platformSpecificCase_ == 19;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasAppDebuggable() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasBundleId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasBundleVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasCpuCount() {
            return (this.bitField0_ & 0x8000) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasCpuModel() {
            return (this.bitField0_ & 0x4000) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasDeviceMake() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasDeviceModel() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasGpuModel() {
            return (this.bitField0_ & 0x10000) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasIos() {
            return this.platformSpecificCase_ == 20;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasMadeWithUnity() {
            return (this.bitField0_ & 0x20000) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasOsVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasRooted() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasScreenDensity() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasScreenHeight() {
            return (this.bitField0_ & 0x400) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasScreenSize() {
            return (this.bitField0_ & 0x800) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasScreenWidth() {
            return (this.bitField0_ & 0x200) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasTotalDiskSpace() {
            return (this.bitField0_ & 0x1000) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasTotalRamMemory() {
            return (this.bitField0_ & 0x2000) != 0;
        }

        @Override  // gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder
        public boolean hasWebviewUa() {
            return (this.bitField0_ & 0x80) != 0;
        }

        private void mergeAndroid(Android staticDeviceInfoOuterClass$StaticDeviceInfo$Android0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo$Android0.getClass();
            this.platformSpecific_ = this.platformSpecificCase_ != 19 || this.platformSpecific_ == Android.getDefaultInstance() ? staticDeviceInfoOuterClass$StaticDeviceInfo$Android0 : ((Builder)Android.newBuilder(((Android)this.platformSpecific_)).mergeFrom(staticDeviceInfoOuterClass$StaticDeviceInfo$Android0)).buildPartial();
            this.platformSpecificCase_ = 19;
        }

        private void mergeIos(Ios staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0.getClass();
            this.platformSpecific_ = this.platformSpecificCase_ != 20 || this.platformSpecific_ == Ios.getDefaultInstance() ? staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0 : ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder)Ios.newBuilder(((Ios)this.platformSpecific_)).mergeFrom(staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0)).buildPartial();
            this.platformSpecificCase_ = 20;
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder() {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder)StaticDeviceInfo.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            return (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder)StaticDeviceInfo.DEFAULT_INSTANCE.createBuilder(staticDeviceInfoOuterClass$StaticDeviceInfo0);
        }

        public static StaticDeviceInfo parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseDelimitedFrom(StaticDeviceInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static StaticDeviceInfo parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseDelimitedFrom(StaticDeviceInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static StaticDeviceInfo parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom(StaticDeviceInfo.DEFAULT_INSTANCE, byteString0);
        }

        public static StaticDeviceInfo parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom(StaticDeviceInfo.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static StaticDeviceInfo parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom(StaticDeviceInfo.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static StaticDeviceInfo parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom(StaticDeviceInfo.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static StaticDeviceInfo parseFrom(InputStream inputStream0) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom(StaticDeviceInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static StaticDeviceInfo parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom(StaticDeviceInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static StaticDeviceInfo parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom(StaticDeviceInfo.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static StaticDeviceInfo parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom(StaticDeviceInfo.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static StaticDeviceInfo parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom(StaticDeviceInfo.DEFAULT_INSTANCE, arr_b);
        }

        public static StaticDeviceInfo parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo)GeneratedMessageLite.parseFrom(StaticDeviceInfo.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return StaticDeviceInfo.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAndroid(Android staticDeviceInfoOuterClass$StaticDeviceInfo$Android0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo$Android0.getClass();
            this.platformSpecific_ = staticDeviceInfoOuterClass$StaticDeviceInfo$Android0;
            this.platformSpecificCase_ = 19;
        }

        private void setAppDebuggable(boolean z) {
            this.bitField0_ |= 4;
            this.appDebuggable_ = z;
        }

        private void setBundleId(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.bundleId_ = s;
        }

        private void setBundleIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.bundleId_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setBundleVersion(String s) {
            s.getClass();
            this.bitField0_ |= 2;
            this.bundleVersion_ = s;
        }

        private void setBundleVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.bundleVersion_ = byteString0.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setCpuCount(long v) {
            this.bitField0_ |= 0x8000;
            this.cpuCount_ = v;
        }

        private void setCpuModel(String s) {
            s.getClass();
            this.bitField0_ |= 0x4000;
            this.cpuModel_ = s;
        }

        private void setCpuModelBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.cpuModel_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x4000;
        }

        private void setDeviceMake(String s) {
            s.getClass();
            this.bitField0_ |= 0x20;
            this.deviceMake_ = s;
        }

        private void setDeviceMakeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.deviceMake_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x20;
        }

        private void setDeviceModel(String s) {
            s.getClass();
            this.bitField0_ |= 0x40;
            this.deviceModel_ = s;
        }

        private void setDeviceModelBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.deviceModel_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x40;
        }

        private void setGpuModel(String s) {
            s.getClass();
            this.bitField0_ |= 0x10000;
            this.gpuModel_ = s;
        }

        private void setGpuModelBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.gpuModel_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x10000;
        }

        private void setIos(Ios staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0.getClass();
            this.platformSpecific_ = staticDeviceInfoOuterClass$StaticDeviceInfo$Ios0;
            this.platformSpecificCase_ = 20;
        }

        private void setMadeWithUnity(boolean z) {
            this.bitField0_ |= 0x20000;
            this.madeWithUnity_ = z;
        }

        private void setOsVersion(String s) {
            s.getClass();
            this.bitField0_ |= 16;
            this.osVersion_ = s;
        }

        private void setOsVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.osVersion_ = byteString0.toStringUtf8();
            this.bitField0_ |= 16;
        }

        private void setRooted(boolean z) {
            this.bitField0_ |= 8;
            this.rooted_ = z;
        }

        private void setScreenDensity(int v) {
            this.bitField0_ |= 0x100;
            this.screenDensity_ = v;
        }

        private void setScreenHeight(int v) {
            this.bitField0_ |= 0x400;
            this.screenHeight_ = v;
        }

        private void setScreenSize(int v) {
            this.bitField0_ |= 0x800;
            this.screenSize_ = v;
        }

        private void setScreenWidth(int v) {
            this.bitField0_ |= 0x200;
            this.screenWidth_ = v;
        }

        private void setStores(int v, String s) {
            s.getClass();
            this.ensureStoresIsMutable();
            this.stores_.set(v, s);
        }

        private void setTotalDiskSpace(long v) {
            this.bitField0_ |= 0x1000;
            this.totalDiskSpace_ = v;
        }

        private void setTotalRamMemory(long v) {
            this.bitField0_ |= 0x2000;
            this.totalRamMemory_ = v;
        }

        private void setWebviewUa(String s) {
            s.getClass();
            this.bitField0_ |= 0x80;
            this.webviewUa_ = s;
        }

        private void setWebviewUaBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.webviewUa_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x80;
        }
    }

    public interface StaticDeviceInfoOrBuilder extends MessageLiteOrBuilder {
        Android getAndroid();

        boolean getAppDebuggable();

        String getBundleId();

        ByteString getBundleIdBytes();

        String getBundleVersion();

        ByteString getBundleVersionBytes();

        long getCpuCount();

        String getCpuModel();

        ByteString getCpuModelBytes();

        String getDeviceMake();

        ByteString getDeviceMakeBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getGpuModel();

        ByteString getGpuModelBytes();

        Ios getIos();

        boolean getMadeWithUnity();

        String getOsVersion();

        ByteString getOsVersionBytes();

        PlatformSpecificCase getPlatformSpecificCase();

        boolean getRooted();

        int getScreenDensity();

        int getScreenHeight();

        int getScreenSize();

        int getScreenWidth();

        String getStores(int arg1);

        ByteString getStoresBytes(int arg1);

        int getStoresCount();

        List getStoresList();

        long getTotalDiskSpace();

        long getTotalRamMemory();

        String getWebviewUa();

        ByteString getWebviewUaBytes();

        boolean hasAndroid();

        boolean hasAppDebuggable();

        boolean hasBundleId();

        boolean hasBundleVersion();

        boolean hasCpuCount();

        boolean hasCpuModel();

        boolean hasDeviceMake();

        boolean hasDeviceModel();

        boolean hasGpuModel();

        boolean hasIos();

        boolean hasMadeWithUnity();

        boolean hasOsVersion();

        boolean hasRooted();

        boolean hasScreenDensity();

        boolean hasScreenHeight();

        boolean hasScreenSize();

        boolean hasScreenWidth();

        boolean hasTotalDiskSpace();

        boolean hasTotalRamMemory();

        boolean hasWebviewUa();
    }

    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

