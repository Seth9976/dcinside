package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class InitializationRequestOuterClass {
    public static final class InitializationDeviceInfo extends GeneratedMessageLite implements InitializationDeviceInfoOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements InitializationDeviceInfoOrBuilder {
            private Builder() {
                super(InitializationDeviceInfo.DEFAULT_INSTANCE);
            }

            Builder(a initializationRequestOuterClass$a0) {
            }

            public Builder clearBatteryLevel() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearBatteryLevel();
                return this;
            }

            public Builder clearBatteryStatus() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearBatteryStatus();
                return this;
            }

            public Builder clearBundleId() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearBundleId();
                return this;
            }

            public Builder clearConnectionType() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearConnectionType();
                return this;
            }

            public Builder clearCurrentUiTheme() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearCurrentUiTheme();
                return this;
            }

            public Builder clearDeviceMake() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearDeviceMake();
                return this;
            }

            public Builder clearDeviceModel() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearHashedDeviceName() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearHashedDeviceName();
                return this;
            }

            public Builder clearLanguage() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearLanguage();
                return this;
            }

            public Builder clearLocalList() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearLocalList();
                return this;
            }

            public Builder clearNetworkOperator() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearNetworkOperator();
                return this;
            }

            public Builder clearOsVersion() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearOsVersion();
                return this;
            }

            public Builder clearSystemBootTime() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearSystemBootTime();
                return this;
            }

            public Builder clearTotalDiskSpace() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearTotalDiskSpace();
                return this;
            }

            public Builder clearTotalRamMemory() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearTotalRamMemory();
                return this;
            }

            public Builder clearTrackingAuthStatus() {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).clearTrackingAuthStatus();
                return this;
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public double getBatteryLevel() {
                return ((InitializationDeviceInfo)this.instance).getBatteryLevel();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public int getBatteryStatus() {
                return ((InitializationDeviceInfo)this.instance).getBatteryStatus();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public String getBundleId() {
                return ((InitializationDeviceInfo)this.instance).getBundleId();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public ByteString getBundleIdBytes() {
                return ((InitializationDeviceInfo)this.instance).getBundleIdBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public String getConnectionType() {
                return "";
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public ByteString getConnectionTypeBytes() {
                return ((InitializationDeviceInfo)this.instance).getConnectionTypeBytes();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public long getCurrentUiTheme() {
                return ((InitializationDeviceInfo)this.instance).getCurrentUiTheme();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public String getDeviceMake() {
                return ((InitializationDeviceInfo)this.instance).getDeviceMake();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public ByteString getDeviceMakeBytes() {
                return ((InitializationDeviceInfo)this.instance).getDeviceMakeBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public String getDeviceModel() {
                return "";
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public ByteString getDeviceModelBytes() {
                return ((InitializationDeviceInfo)this.instance).getDeviceModelBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public String getHashedDeviceName() {
                return "";
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public ByteString getHashedDeviceNameBytes() {
                return ((InitializationDeviceInfo)this.instance).getHashedDeviceNameBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public String getLanguage() {
                return "";
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public ByteString getLanguageBytes() {
                return ((InitializationDeviceInfo)this.instance).getLanguageBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public String getLocalList() {
                return "";
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public ByteString getLocalListBytes() {
                return ((InitializationDeviceInfo)this.instance).getLocalListBytes();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public String getNetworkOperator() {
                return ((InitializationDeviceInfo)this.instance).getNetworkOperator();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public ByteString getNetworkOperatorBytes() {
                return ((InitializationDeviceInfo)this.instance).getNetworkOperatorBytes();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public String getOsVersion() {
                return ((InitializationDeviceInfo)this.instance).getOsVersion();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public ByteString getOsVersionBytes() {
                return ((InitializationDeviceInfo)this.instance).getOsVersionBytes();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public long getSystemBootTime() {
                return ((InitializationDeviceInfo)this.instance).getSystemBootTime();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public long getTotalDiskSpace() {
                return ((InitializationDeviceInfo)this.instance).getTotalDiskSpace();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public long getTotalRamMemory() {
                return ((InitializationDeviceInfo)this.instance).getTotalRamMemory();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public int getTrackingAuthStatus() {
                return ((InitializationDeviceInfo)this.instance).getTrackingAuthStatus();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
            public boolean hasTrackingAuthStatus() {
                return ((InitializationDeviceInfo)this.instance).hasTrackingAuthStatus();
            }

            public Builder setBatteryLevel(double f) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setBatteryLevel(f);
                return this;
            }

            public Builder setBatteryStatus(int v) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setBatteryStatus(v);
                return this;
            }

            public Builder setBundleId(String s) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setBundleId(s);
                return this;
            }

            public Builder setBundleIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setBundleIdBytes(byteString0);
                return this;
            }

            public Builder setConnectionType(String s) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setConnectionType(s);
                return this;
            }

            public Builder setConnectionTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setConnectionTypeBytes(byteString0);
                return this;
            }

            public Builder setCurrentUiTheme(long v) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setCurrentUiTheme(v);
                return this;
            }

            public Builder setDeviceMake(String s) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setDeviceMake(s);
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setDeviceMakeBytes(byteString0);
                return this;
            }

            public Builder setDeviceModel(String s) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setDeviceModel(s);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setDeviceModelBytes(byteString0);
                return this;
            }

            public Builder setHashedDeviceName(String s) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setHashedDeviceName(s);
                return this;
            }

            public Builder setHashedDeviceNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setHashedDeviceNameBytes(byteString0);
                return this;
            }

            public Builder setLanguage(String s) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setLanguage(s);
                return this;
            }

            public Builder setLanguageBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setLanguageBytes(byteString0);
                return this;
            }

            public Builder setLocalList(String s) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setLocalList(s);
                return this;
            }

            public Builder setLocalListBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setLocalListBytes(byteString0);
                return this;
            }

            public Builder setNetworkOperator(String s) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setNetworkOperator(s);
                return this;
            }

            public Builder setNetworkOperatorBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setNetworkOperatorBytes(byteString0);
                return this;
            }

            public Builder setOsVersion(String s) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setOsVersion(s);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setOsVersionBytes(byteString0);
                return this;
            }

            public Builder setSystemBootTime(long v) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setSystemBootTime(v);
                return this;
            }

            public Builder setTotalDiskSpace(long v) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setTotalDiskSpace(v);
                return this;
            }

            public Builder setTotalRamMemory(long v) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setTotalRamMemory(v);
                return this;
            }

            public Builder setTrackingAuthStatus(int v) {
                this.copyOnWrite();
                ((InitializationDeviceInfo)this.instance).setTrackingAuthStatus(v);
                return this;
            }
        }

        public static final int BATTERY_LEVEL_FIELD_NUMBER = 11;
        public static final int BATTERY_STATUS_FIELD_NUMBER = 12;
        public static final int BUNDLE_ID_FIELD_NUMBER = 1;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 16;
        public static final int CURRENT_UI_THEME_FIELD_NUMBER = 9;
        private static final InitializationDeviceInfo DEFAULT_INSTANCE = null;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 2;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
        public static final int HASHED_DEVICE_NAME_FIELD_NUMBER = 8;
        public static final int LANGUAGE_FIELD_NUMBER = 14;
        public static final int LOCAL_LIST_FIELD_NUMBER = 15;
        public static final int NETWORK_OPERATOR_FIELD_NUMBER = 10;
        public static final int OS_VERSION_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 13;
        public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 6;
        public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 7;
        public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 5;
        private double batteryLevel_;
        private int batteryStatus_;
        private int bitField0_;
        private String bundleId_;
        private String connectionType_;
        private long currentUiTheme_;
        private String deviceMake_;
        private String deviceModel_;
        private String hashedDeviceName_;
        private String language_;
        private String localList_;
        private String networkOperator_;
        private String osVersion_;
        private long systemBootTime_;
        private long totalDiskSpace_;
        private long totalRamMemory_;
        private int trackingAuthStatus_;

        static {
            InitializationDeviceInfo initializationRequestOuterClass$InitializationDeviceInfo0 = new InitializationDeviceInfo();
            InitializationDeviceInfo.DEFAULT_INSTANCE = initializationRequestOuterClass$InitializationDeviceInfo0;
            GeneratedMessageLite.registerDefaultInstance(InitializationDeviceInfo.class, initializationRequestOuterClass$InitializationDeviceInfo0);
        }

        private InitializationDeviceInfo() {
            this.bundleId_ = "";
            this.deviceMake_ = "";
            this.deviceModel_ = "";
            this.osVersion_ = "";
            this.hashedDeviceName_ = "";
            this.networkOperator_ = "";
            this.language_ = "";
            this.localList_ = "";
            this.connectionType_ = "";
        }

        private void clearBatteryLevel() {
            this.batteryLevel_ = 0.0;
        }

        private void clearBatteryStatus() {
            this.batteryStatus_ = 0;
        }

        private void clearBundleId() {
            this.bundleId_ = "";
        }

        private void clearConnectionType() {
            this.connectionType_ = "";
        }

        private void clearCurrentUiTheme() {
            this.currentUiTheme_ = 0L;
        }

        private void clearDeviceMake() {
            this.deviceMake_ = "";
        }

        private void clearDeviceModel() {
            this.deviceModel_ = "";
        }

        private void clearHashedDeviceName() {
            this.hashedDeviceName_ = "";
        }

        private void clearLanguage() {
            this.language_ = "";
        }

        private void clearLocalList() {
            this.localList_ = "";
        }

        private void clearNetworkOperator() {
            this.networkOperator_ = "";
        }

        private void clearOsVersion() {
            this.osVersion_ = "";
        }

        private void clearSystemBootTime() {
            this.systemBootTime_ = 0L;
        }

        private void clearTotalDiskSpace() {
            this.totalDiskSpace_ = 0L;
        }

        private void clearTotalRamMemory() {
            this.totalRamMemory_ = 0L;
        }

        private void clearTrackingAuthStatus() {
            this.bitField0_ &= -2;
            this.trackingAuthStatus_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new InitializationDeviceInfo();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(InitializationDeviceInfo.DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005င\u0000\u0006\u0002\u0007\u0002\bȈ\t\u0002\nȈ\u000B\u0000\f\u0004\r\u0002\u000EȈ\u000FȈ\u0010Ȉ", new Object[]{"bitField0_", "bundleId_", "deviceMake_", "deviceModel_", "osVersion_", "trackingAuthStatus_", "totalDiskSpace_", "totalRamMemory_", "hashedDeviceName_", "currentUiTheme_", "networkOperator_", "batteryLevel_", "batteryStatus_", "systemBootTime_", "language_", "localList_", "connectionType_"});
                }
                case 4: {
                    return InitializationDeviceInfo.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = InitializationDeviceInfo.PARSER;
                    if(parser0 == null) {
                        Class class0 = InitializationDeviceInfo.class;
                        synchronized(class0) {
                            parser0 = InitializationDeviceInfo.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(InitializationDeviceInfo.DEFAULT_INSTANCE);
                                InitializationDeviceInfo.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public double getBatteryLevel() {
            return this.batteryLevel_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public int getBatteryStatus() {
            return this.batteryStatus_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public String getBundleId() {
            return this.bundleId_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public ByteString getBundleIdBytes() {
            return ByteString.copyFromUtf8(this.bundleId_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public String getConnectionType() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public ByteString getConnectionTypeBytes() {
            return ByteString.copyFromUtf8(this.connectionType_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public long getCurrentUiTheme() {
            return this.currentUiTheme_;
        }

        public static InitializationDeviceInfo getDefaultInstance() {
            return InitializationDeviceInfo.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8(this.deviceMake_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public String getDeviceModel() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public String getHashedDeviceName() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public ByteString getHashedDeviceNameBytes() {
            return ByteString.copyFromUtf8(this.hashedDeviceName_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public String getLanguage() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public String getLocalList() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public ByteString getLocalListBytes() {
            return ByteString.copyFromUtf8(this.localList_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public String getNetworkOperator() {
            return this.networkOperator_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public ByteString getNetworkOperatorBytes() {
            return ByteString.copyFromUtf8(this.networkOperator_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public long getSystemBootTime() {
            return this.systemBootTime_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public long getTotalDiskSpace() {
            return this.totalDiskSpace_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public long getTotalRamMemory() {
            return this.totalRamMemory_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public int getTrackingAuthStatus() {
            return this.trackingAuthStatus_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationDeviceInfoOrBuilder
        public boolean hasTrackingAuthStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder() {
            return (Builder)InitializationDeviceInfo.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InitializationDeviceInfo initializationRequestOuterClass$InitializationDeviceInfo0) {
            return (Builder)InitializationDeviceInfo.DEFAULT_INSTANCE.createBuilder(initializationRequestOuterClass$InitializationDeviceInfo0);
        }

        public static InitializationDeviceInfo parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseDelimitedFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static InitializationDeviceInfo parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseDelimitedFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static InitializationDeviceInfo parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, byteString0);
        }

        public static InitializationDeviceInfo parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static InitializationDeviceInfo parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static InitializationDeviceInfo parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static InitializationDeviceInfo parseFrom(InputStream inputStream0) throws IOException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static InitializationDeviceInfo parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static InitializationDeviceInfo parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static InitializationDeviceInfo parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static InitializationDeviceInfo parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, arr_b);
        }

        public static InitializationDeviceInfo parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationDeviceInfo)GeneratedMessageLite.parseFrom(InitializationDeviceInfo.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return InitializationDeviceInfo.DEFAULT_INSTANCE.getParserForType();
        }

        private void setBatteryLevel(double f) {
            this.batteryLevel_ = f;
        }

        private void setBatteryStatus(int v) {
            this.batteryStatus_ = v;
        }

        private void setBundleId(String s) {
            s.getClass();
            this.bundleId_ = s;
        }

        private void setBundleIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.bundleId_ = byteString0.toStringUtf8();
        }

        private void setConnectionType(String s) {
            s.getClass();
            this.connectionType_ = s;
        }

        private void setConnectionTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.connectionType_ = byteString0.toStringUtf8();
        }

        private void setCurrentUiTheme(long v) {
            this.currentUiTheme_ = v;
        }

        private void setDeviceMake(String s) {
            s.getClass();
            this.deviceMake_ = s;
        }

        private void setDeviceMakeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.deviceMake_ = byteString0.toStringUtf8();
        }

        private void setDeviceModel(String s) {
            s.getClass();
            this.deviceModel_ = s;
        }

        private void setDeviceModelBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.deviceModel_ = byteString0.toStringUtf8();
        }

        private void setHashedDeviceName(String s) {
            s.getClass();
            this.hashedDeviceName_ = s;
        }

        private void setHashedDeviceNameBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.hashedDeviceName_ = byteString0.toStringUtf8();
        }

        private void setLanguage(String s) {
            s.getClass();
            this.language_ = s;
        }

        private void setLanguageBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.language_ = byteString0.toStringUtf8();
        }

        private void setLocalList(String s) {
            s.getClass();
            this.localList_ = s;
        }

        private void setLocalListBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.localList_ = byteString0.toStringUtf8();
        }

        private void setNetworkOperator(String s) {
            s.getClass();
            this.networkOperator_ = s;
        }

        private void setNetworkOperatorBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.networkOperator_ = byteString0.toStringUtf8();
        }

        private void setOsVersion(String s) {
            s.getClass();
            this.osVersion_ = s;
        }

        private void setOsVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.osVersion_ = byteString0.toStringUtf8();
        }

        private void setSystemBootTime(long v) {
            this.systemBootTime_ = v;
        }

        private void setTotalDiskSpace(long v) {
            this.totalDiskSpace_ = v;
        }

        private void setTotalRamMemory(long v) {
            this.totalRamMemory_ = v;
        }

        private void setTrackingAuthStatus(int v) {
            this.bitField0_ |= 1;
            this.trackingAuthStatus_ = v;
        }
    }

    public interface InitializationDeviceInfoOrBuilder extends MessageLiteOrBuilder {
        double getBatteryLevel();

        int getBatteryStatus();

        String getBundleId();

        ByteString getBundleIdBytes();

        String getConnectionType();

        ByteString getConnectionTypeBytes();

        long getCurrentUiTheme();

        String getDeviceMake();

        ByteString getDeviceMakeBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getHashedDeviceName();

        ByteString getHashedDeviceNameBytes();

        String getLanguage();

        ByteString getLanguageBytes();

        String getLocalList();

        ByteString getLocalListBytes();

        String getNetworkOperator();

        ByteString getNetworkOperatorBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        long getSystemBootTime();

        long getTotalDiskSpace();

        long getTotalRamMemory();

        int getTrackingAuthStatus();

        boolean hasTrackingAuthStatus();
    }

    public static final class InitializationRequest extends GeneratedMessageLite implements InitializationRequestOrBuilder {
        public static final class gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements InitializationRequestOrBuilder {
            private gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder() {
                super(InitializationRequest.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder(a initializationRequestOuterClass$a0) {
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearAnalyticsUserId() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearAnalyticsUserId();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearAuid() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearAuid();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearAuidString() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearAuidString();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearCache() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearCache();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearClientInfo() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearClientInfo();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearDeviceInfo() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearDeviceInfo();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearIdfi() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearIdfi();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearIsFirstInit() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearIsFirstInit();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearLegacyFlowUserConsent() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearLegacyFlowUserConsent();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearPrivacy() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearPrivacy();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearSessionId() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearSessionId();
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder clearUadsInitBlob() {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).clearUadsInitBlob();
                return this;
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public String getAnalyticsUserId() {
                return ((InitializationRequest)this.instance).getAnalyticsUserId();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public ByteString getAnalyticsUserIdBytes() {
                return ((InitializationRequest)this.instance).getAnalyticsUserIdBytes();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public ByteString getAuid() {
                return ((InitializationRequest)this.instance).getAuid();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public String getAuidString() {
                return ((InitializationRequest)this.instance).getAuidString();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public ByteString getAuidStringBytes() {
                return ((InitializationRequest)this.instance).getAuidStringBytes();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public ByteString getCache() {
                return ((InitializationRequest)this.instance).getCache();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public ClientInfo getClientInfo() {
                return ((InitializationRequest)this.instance).getClientInfo();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public InitializationDeviceInfo getDeviceInfo() {
                return ((InitializationRequest)this.instance).getDeviceInfo();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public String getIdfi() {
                return "";
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public ByteString getIdfiBytes() {
                return ((InitializationRequest)this.instance).getIdfiBytes();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public boolean getIsFirstInit() {
                return ((InitializationRequest)this.instance).getIsFirstInit();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public String getLegacyFlowUserConsent() {
                return ((InitializationRequest)this.instance).getLegacyFlowUserConsent();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public ByteString getLegacyFlowUserConsentBytes() {
                return ((InitializationRequest)this.instance).getLegacyFlowUserConsentBytes();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public ByteString getPrivacy() {
                return ((InitializationRequest)this.instance).getPrivacy();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public ByteString getSessionId() {
                return ((InitializationRequest)this.instance).getSessionId();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public ByteString getUadsInitBlob() {
                return ((InitializationRequest)this.instance).getUadsInitBlob();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public boolean hasAnalyticsUserId() {
                return ((InitializationRequest)this.instance).hasAnalyticsUserId();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public boolean hasAuid() {
                return ((InitializationRequest)this.instance).hasAuid();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public boolean hasAuidString() {
                return ((InitializationRequest)this.instance).hasAuidString();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public boolean hasCache() {
                return ((InitializationRequest)this.instance).hasCache();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public boolean hasClientInfo() {
                return ((InitializationRequest)this.instance).hasClientInfo();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public boolean hasDeviceInfo() {
                return ((InitializationRequest)this.instance).hasDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public boolean hasLegacyFlowUserConsent() {
                return ((InitializationRequest)this.instance).hasLegacyFlowUserConsent();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public boolean hasPrivacy() {
                return ((InitializationRequest)this.instance).hasPrivacy();
            }

            @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
            public boolean hasUadsInitBlob() {
                return ((InitializationRequest)this.instance).hasUadsInitBlob();
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder mergeClientInfo(ClientInfo clientInfoOuterClass$ClientInfo0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).mergeClientInfo(clientInfoOuterClass$ClientInfo0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder mergeDeviceInfo(InitializationDeviceInfo initializationRequestOuterClass$InitializationDeviceInfo0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).mergeDeviceInfo(initializationRequestOuterClass$InitializationDeviceInfo0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setAnalyticsUserId(String s) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setAnalyticsUserId(s);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setAnalyticsUserIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setAnalyticsUserIdBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setAuid(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setAuid(byteString0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setAuidString(String s) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setAuidString(s);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setAuidStringBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setAuidStringBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setCache(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setCache(byteString0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clientInfoOuterClass$ClientInfo$Builder0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setClientInfo(((ClientInfo)clientInfoOuterClass$ClientInfo$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setClientInfo(ClientInfo clientInfoOuterClass$ClientInfo0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setClientInfo(clientInfoOuterClass$ClientInfo0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setDeviceInfo(Builder initializationRequestOuterClass$InitializationDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setDeviceInfo(((InitializationDeviceInfo)initializationRequestOuterClass$InitializationDeviceInfo$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setDeviceInfo(InitializationDeviceInfo initializationRequestOuterClass$InitializationDeviceInfo0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setDeviceInfo(initializationRequestOuterClass$InitializationDeviceInfo0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setIdfi(String s) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setIdfi(s);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setIdfiBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setIdfiBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setIsFirstInit(boolean z) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setIsFirstInit(z);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setLegacyFlowUserConsent(String s) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setLegacyFlowUserConsent(s);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setLegacyFlowUserConsentBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setLegacyFlowUserConsentBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setPrivacy(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setPrivacy(byteString0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setSessionId(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setSessionId(byteString0);
                return this;
            }

            public gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder setUadsInitBlob(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationRequest)this.instance).setUadsInitBlob(byteString0);
                return this;
            }
        }

        public static final int ANALYTICS_USER_ID_FIELD_NUMBER = 8;
        public static final int AUID_FIELD_NUMBER = 7;
        public static final int AUID_STRING_FIELD_NUMBER = 11;
        public static final int CACHE_FIELD_NUMBER = 5;
        public static final int CLIENT_INFO_FIELD_NUMBER = 1;
        private static final InitializationRequest DEFAULT_INSTANCE = null;
        public static final int DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int IDFI_FIELD_NUMBER = 3;
        public static final int IS_FIRST_INIT_FIELD_NUMBER = 10;
        public static final int LEGACY_FLOW_USER_CONSENT_FIELD_NUMBER = 6;
        private static volatile Parser PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 4;
        public static final int UADS_INIT_BLOB_FIELD_NUMBER = 12;
        private String analyticsUserId_;
        private String auidString_;
        private ByteString auid_;
        private int bitField0_;
        private ByteString cache_;
        private ClientInfo clientInfo_;
        private InitializationDeviceInfo deviceInfo_;
        private String idfi_;
        private boolean isFirstInit_;
        private String legacyFlowUserConsent_;
        private ByteString privacy_;
        private ByteString sessionId_;
        private ByteString uadsInitBlob_;

        static {
            InitializationRequest initializationRequestOuterClass$InitializationRequest0 = new InitializationRequest();
            InitializationRequest.DEFAULT_INSTANCE = initializationRequestOuterClass$InitializationRequest0;
            GeneratedMessageLite.registerDefaultInstance(InitializationRequest.class, initializationRequestOuterClass$InitializationRequest0);
        }

        private InitializationRequest() {
            this.privacy_ = ByteString.EMPTY;
            this.idfi_ = "";
            this.sessionId_ = ByteString.EMPTY;
            this.cache_ = ByteString.EMPTY;
            this.legacyFlowUserConsent_ = "";
            this.auid_ = ByteString.EMPTY;
            this.analyticsUserId_ = "";
            this.auidString_ = "";
            this.uadsInitBlob_ = ByteString.EMPTY;
        }

        private void clearAnalyticsUserId() {
            this.bitField0_ &= -33;
            this.analyticsUserId_ = "";
        }

        private void clearAuid() {
            this.bitField0_ &= -17;
            this.auid_ = InitializationRequest.getDefaultInstance().getAuid();
        }

        private void clearAuidString() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.auidString_ = InitializationRequest.getDefaultInstance().getAuidString();
        }

        private void clearCache() {
            this.bitField0_ &= -5;
            this.cache_ = InitializationRequest.getDefaultInstance().getCache();
        }

        private void clearClientInfo() {
            this.clientInfo_ = null;
            this.bitField0_ &= -2;
        }

        private void clearDeviceInfo() {
            this.deviceInfo_ = null;
            this.bitField0_ &= -65;
        }

        private void clearIdfi() {
            this.idfi_ = "";
        }

        private void clearIsFirstInit() {
            this.isFirstInit_ = false;
        }

        private void clearLegacyFlowUserConsent() {
            this.bitField0_ &= -9;
            this.legacyFlowUserConsent_ = "";
        }

        private void clearPrivacy() {
            this.bitField0_ &= -3;
            this.privacy_ = InitializationRequest.getDefaultInstance().getPrivacy();
        }

        private void clearSessionId() {
            this.sessionId_ = InitializationRequest.getDefaultInstance().getSessionId();
        }

        private void clearUadsInitBlob() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.uadsInitBlob_ = InitializationRequest.getDefaultInstance().getUadsInitBlob();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new InitializationRequest();
                }
                case 2: {
                    return new gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(InitializationRequest.DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003Ȉ\u0004\n\u0005ည\u0002\u0006ለ\u0003\u0007ည\u0004\bለ\u0005\tဉ\u0006\n\u0007\u000Bለ\u0007\fည\b", new Object[]{"bitField0_", "clientInfo_", "privacy_", "idfi_", "sessionId_", "cache_", "legacyFlowUserConsent_", "auid_", "analyticsUserId_", "deviceInfo_", "isFirstInit_", "auidString_", "uadsInitBlob_"});
                }
                case 4: {
                    return InitializationRequest.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = InitializationRequest.PARSER;
                    if(parser0 == null) {
                        Class class0 = InitializationRequest.class;
                        synchronized(class0) {
                            parser0 = InitializationRequest.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(InitializationRequest.DEFAULT_INSTANCE);
                                InitializationRequest.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public String getAnalyticsUserId() {
            return this.analyticsUserId_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public ByteString getAnalyticsUserIdBytes() {
            return ByteString.copyFromUtf8(this.analyticsUserId_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public ByteString getAuid() {
            return this.auid_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public String getAuidString() {
            return this.auidString_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public ByteString getAuidStringBytes() {
            return ByteString.copyFromUtf8(this.auidString_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public ByteString getCache() {
            return this.cache_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public ClientInfo getClientInfo() {
            return this.clientInfo_ == null ? ClientInfo.getDefaultInstance() : this.clientInfo_;
        }

        public static InitializationRequest getDefaultInstance() {
            return InitializationRequest.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public InitializationDeviceInfo getDeviceInfo() {
            return this.deviceInfo_ == null ? InitializationDeviceInfo.getDefaultInstance() : this.deviceInfo_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public String getIdfi() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public ByteString getIdfiBytes() {
            return ByteString.copyFromUtf8(this.idfi_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public boolean getIsFirstInit() {
            return this.isFirstInit_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public String getLegacyFlowUserConsent() {
            return this.legacyFlowUserConsent_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public ByteString getLegacyFlowUserConsentBytes() {
            return ByteString.copyFromUtf8(this.legacyFlowUserConsent_);
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public ByteString getPrivacy() {
            return this.privacy_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public ByteString getSessionId() {
            return this.sessionId_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public ByteString getUadsInitBlob() {
            return this.uadsInitBlob_;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public boolean hasAnalyticsUserId() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public boolean hasAuid() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public boolean hasAuidString() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public boolean hasCache() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public boolean hasClientInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public boolean hasDeviceInfo() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public boolean hasLegacyFlowUserConsent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public boolean hasPrivacy() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequestOrBuilder
        public boolean hasUadsInitBlob() {
            return (this.bitField0_ & 0x100) != 0;
        }

        private void mergeClientInfo(ClientInfo clientInfoOuterClass$ClientInfo0) {
            clientInfoOuterClass$ClientInfo0.getClass();
            this.clientInfo_ = this.clientInfo_ == null || this.clientInfo_ == ClientInfo.getDefaultInstance() ? clientInfoOuterClass$ClientInfo0 : ((ClientInfo)((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder)ClientInfo.newBuilder(this.clientInfo_).mergeFrom(clientInfoOuterClass$ClientInfo0)).buildPartial());
            this.bitField0_ |= 1;
        }

        private void mergeDeviceInfo(InitializationDeviceInfo initializationRequestOuterClass$InitializationDeviceInfo0) {
            initializationRequestOuterClass$InitializationDeviceInfo0.getClass();
            this.deviceInfo_ = this.deviceInfo_ == null || this.deviceInfo_ == InitializationDeviceInfo.getDefaultInstance() ? initializationRequestOuterClass$InitializationDeviceInfo0 : ((InitializationDeviceInfo)((Builder)InitializationDeviceInfo.newBuilder(this.deviceInfo_).mergeFrom(initializationRequestOuterClass$InitializationDeviceInfo0)).buildPartial());
            this.bitField0_ |= 0x40;
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder newBuilder() {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder)InitializationRequest.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder newBuilder(InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
            return (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder)InitializationRequest.DEFAULT_INSTANCE.createBuilder(initializationRequestOuterClass$InitializationRequest0);
        }

        public static InitializationRequest parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (InitializationRequest)GeneratedMessageLite.parseDelimitedFrom(InitializationRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static InitializationRequest parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationRequest)GeneratedMessageLite.parseDelimitedFrom(InitializationRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static InitializationRequest parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (InitializationRequest)GeneratedMessageLite.parseFrom(InitializationRequest.DEFAULT_INSTANCE, byteString0);
        }

        public static InitializationRequest parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationRequest)GeneratedMessageLite.parseFrom(InitializationRequest.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static InitializationRequest parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (InitializationRequest)GeneratedMessageLite.parseFrom(InitializationRequest.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static InitializationRequest parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationRequest)GeneratedMessageLite.parseFrom(InitializationRequest.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static InitializationRequest parseFrom(InputStream inputStream0) throws IOException {
            return (InitializationRequest)GeneratedMessageLite.parseFrom(InitializationRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static InitializationRequest parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationRequest)GeneratedMessageLite.parseFrom(InitializationRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static InitializationRequest parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (InitializationRequest)GeneratedMessageLite.parseFrom(InitializationRequest.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static InitializationRequest parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationRequest)GeneratedMessageLite.parseFrom(InitializationRequest.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static InitializationRequest parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (InitializationRequest)GeneratedMessageLite.parseFrom(InitializationRequest.DEFAULT_INSTANCE, arr_b);
        }

        public static InitializationRequest parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationRequest)GeneratedMessageLite.parseFrom(InitializationRequest.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return InitializationRequest.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAnalyticsUserId(String s) {
            s.getClass();
            this.bitField0_ |= 0x20;
            this.analyticsUserId_ = s;
        }

        private void setAnalyticsUserIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.analyticsUserId_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x20;
        }

        private void setAuid(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 16;
            this.auid_ = byteString0;
        }

        private void setAuidString(String s) {
            s.getClass();
            this.bitField0_ |= 0x80;
            this.auidString_ = s;
        }

        private void setAuidStringBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.auidString_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x80;
        }

        private void setCache(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 4;
            this.cache_ = byteString0;
        }

        private void setClientInfo(ClientInfo clientInfoOuterClass$ClientInfo0) {
            clientInfoOuterClass$ClientInfo0.getClass();
            this.clientInfo_ = clientInfoOuterClass$ClientInfo0;
            this.bitField0_ |= 1;
        }

        private void setDeviceInfo(InitializationDeviceInfo initializationRequestOuterClass$InitializationDeviceInfo0) {
            initializationRequestOuterClass$InitializationDeviceInfo0.getClass();
            this.deviceInfo_ = initializationRequestOuterClass$InitializationDeviceInfo0;
            this.bitField0_ |= 0x40;
        }

        private void setIdfi(String s) {
            s.getClass();
            this.idfi_ = s;
        }

        private void setIdfiBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.idfi_ = byteString0.toStringUtf8();
        }

        private void setIsFirstInit(boolean z) {
            this.isFirstInit_ = z;
        }

        private void setLegacyFlowUserConsent(String s) {
            s.getClass();
            this.bitField0_ |= 8;
            this.legacyFlowUserConsent_ = s;
        }

        private void setLegacyFlowUserConsentBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.legacyFlowUserConsent_ = byteString0.toStringUtf8();
            this.bitField0_ |= 8;
        }

        private void setPrivacy(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 2;
            this.privacy_ = byteString0;
        }

        private void setSessionId(ByteString byteString0) {
            byteString0.getClass();
            this.sessionId_ = byteString0;
        }

        private void setUadsInitBlob(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 0x100;
            this.uadsInitBlob_ = byteString0;
        }
    }

    public interface InitializationRequestOrBuilder extends MessageLiteOrBuilder {
        String getAnalyticsUserId();

        ByteString getAnalyticsUserIdBytes();

        ByteString getAuid();

        String getAuidString();

        ByteString getAuidStringBytes();

        ByteString getCache();

        ClientInfo getClientInfo();

        InitializationDeviceInfo getDeviceInfo();

        String getIdfi();

        ByteString getIdfiBytes();

        boolean getIsFirstInit();

        String getLegacyFlowUserConsent();

        ByteString getLegacyFlowUserConsentBytes();

        ByteString getPrivacy();

        ByteString getSessionId();

        ByteString getUadsInitBlob();

        boolean hasAnalyticsUserId();

        boolean hasAuid();

        boolean hasAuidString();

        boolean hasCache();

        boolean hasClientInfo();

        boolean hasDeviceInfo();

        boolean hasLegacyFlowUserConsent();

        boolean hasPrivacy();

        boolean hasUadsInitBlob();
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

