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
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UniversalRequestOuterClass {
    public static final class LimitedSessionToken extends GeneratedMessageLite implements LimitedSessionTokenOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements LimitedSessionTokenOrBuilder {
            private Builder() {
                super(LimitedSessionToken.DEFAULT_INSTANCE);
            }

            Builder(a universalRequestOuterClass$a0) {
            }

            public Builder clearCustomMediationName() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearCustomMediationName();
                return this;
            }

            public Builder clearDeviceMake() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearDeviceMake();
                return this;
            }

            public Builder clearDeviceModel() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearGameId() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearGameId();
                return this;
            }

            public Builder clearIdfi() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearIdfi();
                return this;
            }

            public Builder clearMediationProvider() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearMediationProvider();
                return this;
            }

            public Builder clearMediationVersion() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearMediationVersion();
                return this;
            }

            public Builder clearOsVersion() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearOsVersion();
                return this;
            }

            public Builder clearPlatform() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearPlatform();
                return this;
            }

            public Builder clearSdkVersion() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearSdkVersion();
                return this;
            }

            public Builder clearSdkVersionName() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearSdkVersionName();
                return this;
            }

            public Builder clearSessionId() {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).clearSessionId();
                return this;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public String getCustomMediationName() {
                return ((LimitedSessionToken)this.instance).getCustomMediationName();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public ByteString getCustomMediationNameBytes() {
                return ((LimitedSessionToken)this.instance).getCustomMediationNameBytes();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public String getDeviceMake() {
                return ((LimitedSessionToken)this.instance).getDeviceMake();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public ByteString getDeviceMakeBytes() {
                return ((LimitedSessionToken)this.instance).getDeviceMakeBytes();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public String getDeviceModel() {
                return ((LimitedSessionToken)this.instance).getDeviceModel();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public ByteString getDeviceModelBytes() {
                return ((LimitedSessionToken)this.instance).getDeviceModelBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public String getGameId() {
                return "";
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public ByteString getGameIdBytes() {
                return ((LimitedSessionToken)this.instance).getGameIdBytes();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public String getIdfi() {
                return ((LimitedSessionToken)this.instance).getIdfi();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public ByteString getIdfiBytes() {
                return ((LimitedSessionToken)this.instance).getIdfiBytes();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public MediationProvider getMediationProvider() {
                return ((LimitedSessionToken)this.instance).getMediationProvider();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public int getMediationProviderValue() {
                return ((LimitedSessionToken)this.instance).getMediationProviderValue();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public String getMediationVersion() {
                return ((LimitedSessionToken)this.instance).getMediationVersion();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public ByteString getMediationVersionBytes() {
                return ((LimitedSessionToken)this.instance).getMediationVersionBytes();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public String getOsVersion() {
                return ((LimitedSessionToken)this.instance).getOsVersion();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public ByteString getOsVersionBytes() {
                return ((LimitedSessionToken)this.instance).getOsVersionBytes();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public Platform getPlatform() {
                return ((LimitedSessionToken)this.instance).getPlatform();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public int getPlatformValue() {
                return ((LimitedSessionToken)this.instance).getPlatformValue();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public int getSdkVersion() {
                return ((LimitedSessionToken)this.instance).getSdkVersion();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public String getSdkVersionName() {
                return "";
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public ByteString getSdkVersionNameBytes() {
                return ((LimitedSessionToken)this.instance).getSdkVersionNameBytes();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public ByteString getSessionId() {
                return ((LimitedSessionToken)this.instance).getSessionId();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public boolean hasCustomMediationName() {
                return ((LimitedSessionToken)this.instance).hasCustomMediationName();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public boolean hasMediationVersion() {
                return ((LimitedSessionToken)this.instance).hasMediationVersion();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
            public boolean hasSessionId() {
                return ((LimitedSessionToken)this.instance).hasSessionId();
            }

            public Builder setCustomMediationName(String s) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setCustomMediationName(s);
                return this;
            }

            public Builder setCustomMediationNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setCustomMediationNameBytes(byteString0);
                return this;
            }

            public Builder setDeviceMake(String s) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setDeviceMake(s);
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setDeviceMakeBytes(byteString0);
                return this;
            }

            public Builder setDeviceModel(String s) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setDeviceModel(s);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setDeviceModelBytes(byteString0);
                return this;
            }

            public Builder setGameId(String s) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setGameId(s);
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setGameIdBytes(byteString0);
                return this;
            }

            public Builder setIdfi(String s) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setIdfi(s);
                return this;
            }

            public Builder setIdfiBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setIdfiBytes(byteString0);
                return this;
            }

            public Builder setMediationProvider(MediationProvider clientInfoOuterClass$MediationProvider0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setMediationProvider(clientInfoOuterClass$MediationProvider0);
                return this;
            }

            public Builder setMediationProviderValue(int v) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setMediationProviderValue(v);
                return this;
            }

            public Builder setMediationVersion(String s) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setMediationVersion(s);
                return this;
            }

            public Builder setMediationVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setMediationVersionBytes(byteString0);
                return this;
            }

            public Builder setOsVersion(String s) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setOsVersion(s);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setOsVersionBytes(byteString0);
                return this;
            }

            public Builder setPlatform(Platform clientInfoOuterClass$Platform0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setPlatform(clientInfoOuterClass$Platform0);
                return this;
            }

            public Builder setPlatformValue(int v) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setPlatformValue(v);
                return this;
            }

            public Builder setSdkVersion(int v) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setSdkVersion(v);
                return this;
            }

            public Builder setSdkVersionName(String s) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setSdkVersionName(s);
                return this;
            }

            public Builder setSdkVersionNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setSdkVersionNameBytes(byteString0);
                return this;
            }

            public Builder setSessionId(ByteString byteString0) {
                this.copyOnWrite();
                ((LimitedSessionToken)this.instance).setSessionId(byteString0);
                return this;
            }
        }

        public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 11;
        private static final LimitedSessionToken DEFAULT_INSTANCE = null;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 1;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 2;
        public static final int GAME_ID_FIELD_NUMBER = 8;
        public static final int IDFI_FIELD_NUMBER = 4;
        public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 10;
        public static final int MEDIATION_VERSION_FIELD_NUMBER = 12;
        public static final int OS_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 9;
        public static final int SDK_VERSION_FIELD_NUMBER = 5;
        public static final int SDK_VERSION_NAME_FIELD_NUMBER = 7;
        public static final int SESSION_ID_FIELD_NUMBER = 13;
        private int bitField0_;
        private String customMediationName_;
        private String deviceMake_;
        private String deviceModel_;
        private String gameId_;
        private String idfi_;
        private int mediationProvider_;
        private String mediationVersion_;
        private String osVersion_;
        private int platform_;
        private String sdkVersionName_;
        private int sdkVersion_;
        private ByteString sessionId_;

        static {
            LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0 = new LimitedSessionToken();
            LimitedSessionToken.DEFAULT_INSTANCE = universalRequestOuterClass$LimitedSessionToken0;
            GeneratedMessageLite.registerDefaultInstance(LimitedSessionToken.class, universalRequestOuterClass$LimitedSessionToken0);
        }

        private LimitedSessionToken() {
            this.deviceMake_ = "";
            this.deviceModel_ = "";
            this.osVersion_ = "";
            this.idfi_ = "";
            this.sdkVersionName_ = "";
            this.gameId_ = "";
            this.customMediationName_ = "";
            this.mediationVersion_ = "";
            this.sessionId_ = ByteString.EMPTY;
        }

        private void clearCustomMediationName() {
            this.bitField0_ &= -2;
            this.customMediationName_ = LimitedSessionToken.getDefaultInstance().getCustomMediationName();
        }

        private void clearDeviceMake() {
            this.deviceMake_ = LimitedSessionToken.getDefaultInstance().getDeviceMake();
        }

        private void clearDeviceModel() {
            this.deviceModel_ = LimitedSessionToken.getDefaultInstance().getDeviceModel();
        }

        private void clearGameId() {
            this.gameId_ = "";
        }

        private void clearIdfi() {
            this.idfi_ = LimitedSessionToken.getDefaultInstance().getIdfi();
        }

        private void clearMediationProvider() {
            this.mediationProvider_ = 0;
        }

        private void clearMediationVersion() {
            this.bitField0_ &= -3;
            this.mediationVersion_ = LimitedSessionToken.getDefaultInstance().getMediationVersion();
        }

        private void clearOsVersion() {
            this.osVersion_ = LimitedSessionToken.getDefaultInstance().getOsVersion();
        }

        private void clearPlatform() {
            this.platform_ = 0;
        }

        private void clearSdkVersion() {
            this.sdkVersion_ = 0;
        }

        private void clearSdkVersionName() {
            this.sdkVersionName_ = LimitedSessionToken.getDefaultInstance().getSdkVersionName();
        }

        private void clearSessionId() {
            this.bitField0_ &= -5;
            this.sessionId_ = LimitedSessionToken.getDefaultInstance().getSessionId();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new LimitedSessionToken();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(LimitedSessionToken.DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000B\u0007Ȉ\bȈ\t\f\n\f\u000Bለ\u0000\fለ\u0001\rည\u0002", new Object[]{"bitField0_", "deviceMake_", "deviceModel_", "osVersion_", "idfi_", "sdkVersion_", "sdkVersionName_", "gameId_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_", "sessionId_"});
                }
                case 4: {
                    return LimitedSessionToken.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = LimitedSessionToken.PARSER;
                    if(parser0 == null) {
                        Class class0 = LimitedSessionToken.class;
                        synchronized(class0) {
                            parser0 = LimitedSessionToken.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(LimitedSessionToken.DEFAULT_INSTANCE);
                                LimitedSessionToken.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public String getCustomMediationName() {
            return this.customMediationName_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public ByteString getCustomMediationNameBytes() {
            return ByteString.copyFromUtf8(this.customMediationName_);
        }

        public static LimitedSessionToken getDefaultInstance() {
            return LimitedSessionToken.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8(this.deviceMake_);
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public String getGameId() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public ByteString getGameIdBytes() {
            return ByteString.copyFromUtf8(this.gameId_);
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public String getIdfi() {
            return this.idfi_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public ByteString getIdfiBytes() {
            return ByteString.copyFromUtf8(this.idfi_);
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public MediationProvider getMediationProvider() {
            MediationProvider clientInfoOuterClass$MediationProvider0 = MediationProvider.forNumber(this.mediationProvider_);
            return clientInfoOuterClass$MediationProvider0 == null ? MediationProvider.UNRECOGNIZED : clientInfoOuterClass$MediationProvider0;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public int getMediationProviderValue() {
            return this.mediationProvider_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public String getMediationVersion() {
            return this.mediationVersion_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public ByteString getMediationVersionBytes() {
            return ByteString.copyFromUtf8(this.mediationVersion_);
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public Platform getPlatform() {
            Platform clientInfoOuterClass$Platform0 = Platform.forNumber(this.platform_);
            return clientInfoOuterClass$Platform0 == null ? Platform.UNRECOGNIZED : clientInfoOuterClass$Platform0;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public int getPlatformValue() {
            return this.platform_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public int getSdkVersion() {
            return this.sdkVersion_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public String getSdkVersionName() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public ByteString getSdkVersionNameBytes() {
            return ByteString.copyFromUtf8(this.sdkVersionName_);
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public ByteString getSessionId() {
            return this.sessionId_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public boolean hasCustomMediationName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public boolean hasMediationVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionTokenOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder() {
            return (Builder)LimitedSessionToken.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
            return (Builder)LimitedSessionToken.DEFAULT_INSTANCE.createBuilder(universalRequestOuterClass$LimitedSessionToken0);
        }

        public static LimitedSessionToken parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseDelimitedFrom(LimitedSessionToken.DEFAULT_INSTANCE, inputStream0);
        }

        public static LimitedSessionToken parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseDelimitedFrom(LimitedSessionToken.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static LimitedSessionToken parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom(LimitedSessionToken.DEFAULT_INSTANCE, byteString0);
        }

        public static LimitedSessionToken parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom(LimitedSessionToken.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static LimitedSessionToken parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom(LimitedSessionToken.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static LimitedSessionToken parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom(LimitedSessionToken.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static LimitedSessionToken parseFrom(InputStream inputStream0) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom(LimitedSessionToken.DEFAULT_INSTANCE, inputStream0);
        }

        public static LimitedSessionToken parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom(LimitedSessionToken.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static LimitedSessionToken parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom(LimitedSessionToken.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static LimitedSessionToken parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom(LimitedSessionToken.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static LimitedSessionToken parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom(LimitedSessionToken.DEFAULT_INSTANCE, arr_b);
        }

        public static LimitedSessionToken parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (LimitedSessionToken)GeneratedMessageLite.parseFrom(LimitedSessionToken.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return LimitedSessionToken.DEFAULT_INSTANCE.getParserForType();
        }

        private void setCustomMediationName(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.customMediationName_ = s;
        }

        private void setCustomMediationNameBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.customMediationName_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
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

        private void setGameId(String s) {
            s.getClass();
            this.gameId_ = s;
        }

        private void setGameIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.gameId_ = byteString0.toStringUtf8();
        }

        private void setIdfi(String s) {
            s.getClass();
            this.idfi_ = s;
        }

        private void setIdfiBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.idfi_ = byteString0.toStringUtf8();
        }

        private void setMediationProvider(MediationProvider clientInfoOuterClass$MediationProvider0) {
            this.mediationProvider_ = clientInfoOuterClass$MediationProvider0.getNumber();
        }

        private void setMediationProviderValue(int v) {
            this.mediationProvider_ = v;
        }

        private void setMediationVersion(String s) {
            s.getClass();
            this.bitField0_ |= 2;
            this.mediationVersion_ = s;
        }

        private void setMediationVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.mediationVersion_ = byteString0.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setOsVersion(String s) {
            s.getClass();
            this.osVersion_ = s;
        }

        private void setOsVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.osVersion_ = byteString0.toStringUtf8();
        }

        private void setPlatform(Platform clientInfoOuterClass$Platform0) {
            this.platform_ = clientInfoOuterClass$Platform0.getNumber();
        }

        private void setPlatformValue(int v) {
            this.platform_ = v;
        }

        private void setSdkVersion(int v) {
            this.sdkVersion_ = v;
        }

        private void setSdkVersionName(String s) {
            s.getClass();
            this.sdkVersionName_ = s;
        }

        private void setSdkVersionNameBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.sdkVersionName_ = byteString0.toStringUtf8();
        }

        private void setSessionId(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 4;
            this.sessionId_ = byteString0;
        }
    }

    public interface LimitedSessionTokenOrBuilder extends MessageLiteOrBuilder {
        String getCustomMediationName();

        ByteString getCustomMediationNameBytes();

        String getDeviceMake();

        ByteString getDeviceMakeBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getGameId();

        ByteString getGameIdBytes();

        String getIdfi();

        ByteString getIdfiBytes();

        MediationProvider getMediationProvider();

        int getMediationProviderValue();

        String getMediationVersion();

        ByteString getMediationVersionBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        Platform getPlatform();

        int getPlatformValue();

        int getSdkVersion();

        String getSdkVersionName();

        ByteString getSdkVersionNameBytes();

        ByteString getSessionId();

        boolean hasCustomMediationName();

        boolean hasMediationVersion();

        boolean hasSessionId();
    }

    public static final class UniversalRequest extends GeneratedMessageLite implements UniversalRequestOrBuilder {
        public static final class gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements UniversalRequestOrBuilder {
            private gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder() {
                super(UniversalRequest.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder(a universalRequestOuterClass$a0) {
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder clearPayload() {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).clearPayload();
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder clearSharedData() {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).clearSharedData();
                return this;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequestOrBuilder
            public Payload getPayload() {
                return ((UniversalRequest)this.instance).getPayload();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequestOrBuilder
            public SharedData getSharedData() {
                return ((UniversalRequest)this.instance).getSharedData();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequestOrBuilder
            public boolean hasPayload() {
                return ((UniversalRequest)this.instance).hasPayload();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequestOrBuilder
            public boolean hasSharedData() {
                return ((UniversalRequest)this.instance).hasSharedData();
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder mergePayload(Payload universalRequestOuterClass$UniversalRequest$Payload0) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).mergePayload(universalRequestOuterClass$UniversalRequest$Payload0);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder mergeSharedData(SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).mergeSharedData(universalRequestOuterClass$UniversalRequest$SharedData0);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder setPayload(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder universalRequestOuterClass$UniversalRequest$Payload$Builder0) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).setPayload(((Payload)universalRequestOuterClass$UniversalRequest$Payload$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder setPayload(Payload universalRequestOuterClass$UniversalRequest$Payload0) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).setPayload(universalRequestOuterClass$UniversalRequest$Payload0);
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder setSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder universalRequestOuterClass$UniversalRequest$SharedData$Builder0) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).setSharedData(((SharedData)universalRequestOuterClass$UniversalRequest$SharedData$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder setSharedData(SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
                this.copyOnWrite();
                ((UniversalRequest)this.instance).setSharedData(universalRequestOuterClass$UniversalRequest$SharedData0);
                return this;
            }
        }

        public static final class Payload extends GeneratedMessageLite implements PayloadOrBuilder {
            public static final class gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements PayloadOrBuilder {
                private gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder() {
                    super(Payload.DEFAULT_INSTANCE);
                }

                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder(a universalRequestOuterClass$a0) {
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearAdDataRefreshRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdDataRefreshRequest();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearAdPlayerConfigRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdPlayerConfigRequest();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearAdRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdRequest();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearDiagnosticEventRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearDiagnosticEventRequest();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearGetTokenEventRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearGetTokenEventRequest();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearInitializationCompletedEventRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearInitializationCompletedEventRequest();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearInitializationRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearInitializationRequest();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearOperativeEvent() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearOperativeEvent();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearPrivacyUpdateRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearPrivacyUpdateRequest();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearTransactionEventRequest() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearTransactionEventRequest();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder clearValue() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearValue();
                    return this;
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public AdDataRefreshRequest getAdDataRefreshRequest() {
                    return ((Payload)this.instance).getAdDataRefreshRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public AdPlayerConfigRequest getAdPlayerConfigRequest() {
                    return ((Payload)this.instance).getAdPlayerConfigRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public AdRequest getAdRequest() {
                    return ((Payload)this.instance).getAdRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public DiagnosticEventRequest getDiagnosticEventRequest() {
                    return ((Payload)this.instance).getDiagnosticEventRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public GetTokenEventRequest getGetTokenEventRequest() {
                    return ((Payload)this.instance).getGetTokenEventRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                    return ((Payload)this.instance).getInitializationCompletedEventRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public InitializationRequest getInitializationRequest() {
                    return ((Payload)this.instance).getInitializationRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public OperativeEventRequest getOperativeEvent() {
                    return ((Payload)this.instance).getOperativeEvent();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public PrivacyUpdateRequest getPrivacyUpdateRequest() {
                    return ((Payload)this.instance).getPrivacyUpdateRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public TransactionEventRequest getTransactionEventRequest() {
                    return ((Payload)this.instance).getTransactionEventRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public ValueCase getValueCase() {
                    return ((Payload)this.instance).getValueCase();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public boolean hasAdDataRefreshRequest() {
                    return ((Payload)this.instance).hasAdDataRefreshRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public boolean hasAdPlayerConfigRequest() {
                    return ((Payload)this.instance).hasAdPlayerConfigRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public boolean hasAdRequest() {
                    return ((Payload)this.instance).hasAdRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public boolean hasDiagnosticEventRequest() {
                    return ((Payload)this.instance).hasDiagnosticEventRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public boolean hasGetTokenEventRequest() {
                    return ((Payload)this.instance).hasGetTokenEventRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public boolean hasInitializationCompletedEventRequest() {
                    return ((Payload)this.instance).hasInitializationCompletedEventRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public boolean hasInitializationRequest() {
                    return ((Payload)this.instance).hasInitializationRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public boolean hasOperativeEvent() {
                    return ((Payload)this.instance).hasOperativeEvent();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public boolean hasPrivacyUpdateRequest() {
                    return ((Payload)this.instance).hasPrivacyUpdateRequest();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
                public boolean hasTransactionEventRequest() {
                    return ((Payload)this.instance).hasTransactionEventRequest();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeAdDataRefreshRequest(AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdDataRefreshRequest(adDataRefreshRequestOuterClass$AdDataRefreshRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeAdPlayerConfigRequest(AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdPlayerConfigRequest(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeAdRequest(AdRequest adRequestOuterClass$AdRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdRequest(adRequestOuterClass$AdRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeDiagnosticEventRequest(DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeDiagnosticEventRequest(diagnosticEventRequestOuterClass$DiagnosticEventRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeGetTokenEventRequest(GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeGetTokenEventRequest(getTokenEventRequestOuterClass$GetTokenEventRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeInitializationCompletedEventRequest(InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeInitializationCompletedEventRequest(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeInitializationRequest(InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeInitializationRequest(initializationRequestOuterClass$InitializationRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeOperativeEvent(OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeOperativeEvent(operativeEventRequestOuterClass$OperativeEventRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergePrivacyUpdateRequest(PrivacyUpdateRequest privacyUpdateRequestOuterClass$PrivacyUpdateRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergePrivacyUpdateRequest(privacyUpdateRequestOuterClass$PrivacyUpdateRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder mergeTransactionEventRequest(TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeTransactionEventRequest(transactionEventRequestOuterClass$TransactionEventRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdDataRefreshRequest(gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdDataRefreshRequest(((AdDataRefreshRequest)adDataRefreshRequestOuterClass$AdDataRefreshRequest$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdDataRefreshRequest(AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdDataRefreshRequest(adDataRefreshRequestOuterClass$AdDataRefreshRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdPlayerConfigRequest(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdPlayerConfigRequest(((AdPlayerConfigRequest)adPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdPlayerConfigRequest(AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdPlayerConfigRequest(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdRequest(gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder adRequestOuterClass$AdRequest$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdRequest(((AdRequest)adRequestOuterClass$AdRequest$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setAdRequest(AdRequest adRequestOuterClass$AdRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdRequest(adRequestOuterClass$AdRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setDiagnosticEventRequest(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setDiagnosticEventRequest(((DiagnosticEventRequest)diagnosticEventRequestOuterClass$DiagnosticEventRequest$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setDiagnosticEventRequest(DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setDiagnosticEventRequest(diagnosticEventRequestOuterClass$DiagnosticEventRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setGetTokenEventRequest(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setGetTokenEventRequest(((GetTokenEventRequest)getTokenEventRequestOuterClass$GetTokenEventRequest$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setGetTokenEventRequest(GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setGetTokenEventRequest(getTokenEventRequestOuterClass$GetTokenEventRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setInitializationCompletedEventRequest(gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationCompletedEventRequest(((InitializationCompletedEventRequest)initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setInitializationCompletedEventRequest(InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationCompletedEventRequest(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder initializationRequestOuterClass$InitializationRequest$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationRequest(((InitializationRequest)initializationRequestOuterClass$InitializationRequest$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setInitializationRequest(InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationRequest(initializationRequestOuterClass$InitializationRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setOperativeEvent(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder operativeEventRequestOuterClass$OperativeEventRequest$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setOperativeEvent(((OperativeEventRequest)operativeEventRequestOuterClass$OperativeEventRequest$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setOperativeEvent(OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setOperativeEvent(operativeEventRequestOuterClass$OperativeEventRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setPrivacyUpdateRequest(gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setPrivacyUpdateRequest(((PrivacyUpdateRequest)privacyUpdateRequestOuterClass$PrivacyUpdateRequest$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setPrivacyUpdateRequest(PrivacyUpdateRequest privacyUpdateRequestOuterClass$PrivacyUpdateRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setPrivacyUpdateRequest(privacyUpdateRequestOuterClass$PrivacyUpdateRequest0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setTransactionEventRequest(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder transactionEventRequestOuterClass$TransactionEventRequest$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setTransactionEventRequest(((TransactionEventRequest)transactionEventRequestOuterClass$TransactionEventRequest$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder setTransactionEventRequest(TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setTransactionEventRequest(transactionEventRequestOuterClass$TransactionEventRequest0);
                    return this;
                }
            }

            public static enum ValueCase {
                INITIALIZATION_REQUEST(2),
                AD_REQUEST(3),
                OPERATIVE_EVENT(4),
                DIAGNOSTIC_EVENT_REQUEST(5),
                AD_PLAYER_CONFIG_REQUEST(6),
                GET_TOKEN_EVENT_REQUEST(7),
                PRIVACY_UPDATE_REQUEST(8),
                AD_DATA_REFRESH_REQUEST(9),
                INITIALIZATION_COMPLETED_EVENT_REQUEST(10),
                TRANSACTION_EVENT_REQUEST(11),
                VALUE_NOT_SET(0);

                private final int value;

                private static ValueCase[] $values() [...] // Inlined contents

                private ValueCase(int v1) {
                    this.value = v1;
                }

                public static ValueCase forNumber(int v) {
                    if(v != 0) {
                        switch(v) {
                            case 2: {
                                return ValueCase.INITIALIZATION_REQUEST;
                            }
                            case 3: {
                                return ValueCase.AD_REQUEST;
                            }
                            case 4: {
                                return ValueCase.OPERATIVE_EVENT;
                            }
                            case 5: {
                                return ValueCase.DIAGNOSTIC_EVENT_REQUEST;
                            }
                            case 6: {
                                return ValueCase.AD_PLAYER_CONFIG_REQUEST;
                            }
                            case 7: {
                                return ValueCase.GET_TOKEN_EVENT_REQUEST;
                            }
                            case 8: {
                                return ValueCase.PRIVACY_UPDATE_REQUEST;
                            }
                            case 9: {
                                return ValueCase.AD_DATA_REFRESH_REQUEST;
                            }
                            case 10: {
                                return ValueCase.INITIALIZATION_COMPLETED_EVENT_REQUEST;
                            }
                            case 11: {
                                return ValueCase.TRANSACTION_EVENT_REQUEST;
                            }
                            default: {
                                return null;
                            }
                        }
                    }
                    return ValueCase.VALUE_NOT_SET;
                }

                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static ValueCase valueOf(int v) {
                    return ValueCase.forNumber(v);
                }
            }

            public static final int AD_DATA_REFRESH_REQUEST_FIELD_NUMBER = 9;
            public static final int AD_PLAYER_CONFIG_REQUEST_FIELD_NUMBER = 6;
            public static final int AD_REQUEST_FIELD_NUMBER = 3;
            private static final Payload DEFAULT_INSTANCE = null;
            public static final int DIAGNOSTIC_EVENT_REQUEST_FIELD_NUMBER = 5;
            public static final int GET_TOKEN_EVENT_REQUEST_FIELD_NUMBER = 7;
            public static final int INITIALIZATION_COMPLETED_EVENT_REQUEST_FIELD_NUMBER = 10;
            public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 2;
            public static final int OPERATIVE_EVENT_FIELD_NUMBER = 4;
            private static volatile Parser PARSER = null;
            public static final int PRIVACY_UPDATE_REQUEST_FIELD_NUMBER = 8;
            public static final int TRANSACTION_EVENT_REQUEST_FIELD_NUMBER = 11;
            private int valueCase_;
            private Object value_;

            static {
                Payload universalRequestOuterClass$UniversalRequest$Payload0 = new Payload();
                Payload.DEFAULT_INSTANCE = universalRequestOuterClass$UniversalRequest$Payload0;
                GeneratedMessageLite.registerDefaultInstance(Payload.class, universalRequestOuterClass$UniversalRequest$Payload0);
            }

            private Payload() {
                this.valueCase_ = 0;
            }

            private void clearAdDataRefreshRequest() {
                if(this.valueCase_ == 9) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdPlayerConfigRequest() {
                if(this.valueCase_ == 6) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdRequest() {
                if(this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearDiagnosticEventRequest() {
                if(this.valueCase_ == 5) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearGetTokenEventRequest() {
                if(this.valueCase_ == 7) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearInitializationCompletedEventRequest() {
                if(this.valueCase_ == 10) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearInitializationRequest() {
                if(this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearOperativeEvent() {
                if(this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearPrivacyUpdateRequest() {
                if(this.valueCase_ == 8) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearTransactionEventRequest() {
                if(this.valueCase_ == 11) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new Payload();
                    }
                    case 2: {
                        return new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(Payload.DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0002\u000B\n\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000B<\u0000", new Object[]{"value_", "valueCase_", InitializationRequest.class, AdRequest.class, OperativeEventRequest.class, DiagnosticEventRequest.class, AdPlayerConfigRequest.class, GetTokenEventRequest.class, PrivacyUpdateRequest.class, AdDataRefreshRequest.class, InitializationCompletedEventRequest.class, TransactionEventRequest.class});
                    }
                    case 4: {
                        return Payload.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = Payload.PARSER;
                        if(parser0 == null) {
                            Class class0 = Payload.class;
                            synchronized(class0) {
                                parser0 = Payload.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(Payload.DEFAULT_INSTANCE);
                                    Payload.PARSER = parser0;
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

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public AdDataRefreshRequest getAdDataRefreshRequest() {
                return this.valueCase_ == 9 ? ((AdDataRefreshRequest)this.value_) : AdDataRefreshRequest.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public AdPlayerConfigRequest getAdPlayerConfigRequest() {
                return this.valueCase_ == 6 ? ((AdPlayerConfigRequest)this.value_) : AdPlayerConfigRequest.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public AdRequest getAdRequest() {
                return this.valueCase_ == 3 ? ((AdRequest)this.value_) : AdRequest.getDefaultInstance();
            }

            public static Payload getDefaultInstance() {
                return Payload.DEFAULT_INSTANCE;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public DiagnosticEventRequest getDiagnosticEventRequest() {
                return this.valueCase_ == 5 ? ((DiagnosticEventRequest)this.value_) : DiagnosticEventRequest.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public GetTokenEventRequest getGetTokenEventRequest() {
                return this.valueCase_ == 7 ? ((GetTokenEventRequest)this.value_) : GetTokenEventRequest.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                return this.valueCase_ == 10 ? ((InitializationCompletedEventRequest)this.value_) : InitializationCompletedEventRequest.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public InitializationRequest getInitializationRequest() {
                return this.valueCase_ == 2 ? ((InitializationRequest)this.value_) : InitializationRequest.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public OperativeEventRequest getOperativeEvent() {
                return this.valueCase_ == 4 ? ((OperativeEventRequest)this.value_) : OperativeEventRequest.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public PrivacyUpdateRequest getPrivacyUpdateRequest() {
                return this.valueCase_ == 8 ? ((PrivacyUpdateRequest)this.value_) : PrivacyUpdateRequest.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public TransactionEventRequest getTransactionEventRequest() {
                return this.valueCase_ == 11 ? ((TransactionEventRequest)this.value_) : TransactionEventRequest.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public boolean hasAdDataRefreshRequest() {
                return this.valueCase_ == 9;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public boolean hasAdPlayerConfigRequest() {
                return this.valueCase_ == 6;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public boolean hasAdRequest() {
                return this.valueCase_ == 3;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public boolean hasDiagnosticEventRequest() {
                return this.valueCase_ == 5;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public boolean hasGetTokenEventRequest() {
                return this.valueCase_ == 7;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public boolean hasInitializationCompletedEventRequest() {
                return this.valueCase_ == 10;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public boolean hasInitializationRequest() {
                return this.valueCase_ == 2;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public boolean hasOperativeEvent() {
                return this.valueCase_ == 4;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public boolean hasPrivacyUpdateRequest() {
                return this.valueCase_ == 8;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder
            public boolean hasTransactionEventRequest() {
                return this.valueCase_ == 11;
            }

            private void mergeAdDataRefreshRequest(AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest0) {
                adDataRefreshRequestOuterClass$AdDataRefreshRequest0.getClass();
                this.value_ = this.valueCase_ != 9 || this.value_ == AdDataRefreshRequest.getDefaultInstance() ? adDataRefreshRequestOuterClass$AdDataRefreshRequest0 : ((gatewayprotocol.v1.AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder)AdDataRefreshRequest.newBuilder(((AdDataRefreshRequest)this.value_)).mergeFrom(adDataRefreshRequestOuterClass$AdDataRefreshRequest0)).buildPartial();
                this.valueCase_ = 9;
            }

            private void mergeAdPlayerConfigRequest(AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0) {
                adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0.getClass();
                this.value_ = this.valueCase_ != 6 || this.value_ == AdPlayerConfigRequest.getDefaultInstance() ? adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0 : ((gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder)AdPlayerConfigRequest.newBuilder(((AdPlayerConfigRequest)this.value_)).mergeFrom(adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0)).buildPartial();
                this.valueCase_ = 6;
            }

            private void mergeAdRequest(AdRequest adRequestOuterClass$AdRequest0) {
                adRequestOuterClass$AdRequest0.getClass();
                this.value_ = this.valueCase_ != 3 || this.value_ == AdRequest.getDefaultInstance() ? adRequestOuterClass$AdRequest0 : ((gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder)AdRequest.newBuilder(((AdRequest)this.value_)).mergeFrom(adRequestOuterClass$AdRequest0)).buildPartial();
                this.valueCase_ = 3;
            }

            private void mergeDiagnosticEventRequest(DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest0) {
                diagnosticEventRequestOuterClass$DiagnosticEventRequest0.getClass();
                this.value_ = this.valueCase_ != 5 || this.value_ == DiagnosticEventRequest.getDefaultInstance() ? diagnosticEventRequestOuterClass$DiagnosticEventRequest0 : ((gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder)DiagnosticEventRequest.newBuilder(((DiagnosticEventRequest)this.value_)).mergeFrom(diagnosticEventRequestOuterClass$DiagnosticEventRequest0)).buildPartial();
                this.valueCase_ = 5;
            }

            private void mergeGetTokenEventRequest(GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest0) {
                getTokenEventRequestOuterClass$GetTokenEventRequest0.getClass();
                this.value_ = this.valueCase_ != 7 || this.value_ == GetTokenEventRequest.getDefaultInstance() ? getTokenEventRequestOuterClass$GetTokenEventRequest0 : ((gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder)GetTokenEventRequest.newBuilder(((GetTokenEventRequest)this.value_)).mergeFrom(getTokenEventRequestOuterClass$GetTokenEventRequest0)).buildPartial();
                this.valueCase_ = 7;
            }

            private void mergeInitializationCompletedEventRequest(InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0) {
                initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0.getClass();
                this.value_ = this.valueCase_ != 10 || this.value_ == InitializationCompletedEventRequest.getDefaultInstance() ? initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0 : ((gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder)InitializationCompletedEventRequest.newBuilder(((InitializationCompletedEventRequest)this.value_)).mergeFrom(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0)).buildPartial();
                this.valueCase_ = 10;
            }

            private void mergeInitializationRequest(InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
                initializationRequestOuterClass$InitializationRequest0.getClass();
                this.value_ = this.valueCase_ != 2 || this.value_ == InitializationRequest.getDefaultInstance() ? initializationRequestOuterClass$InitializationRequest0 : ((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder)InitializationRequest.newBuilder(((InitializationRequest)this.value_)).mergeFrom(initializationRequestOuterClass$InitializationRequest0)).buildPartial();
                this.valueCase_ = 2;
            }

            private void mergeOperativeEvent(OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest0) {
                operativeEventRequestOuterClass$OperativeEventRequest0.getClass();
                this.value_ = this.valueCase_ != 4 || this.value_ == OperativeEventRequest.getDefaultInstance() ? operativeEventRequestOuterClass$OperativeEventRequest0 : ((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder)OperativeEventRequest.newBuilder(((OperativeEventRequest)this.value_)).mergeFrom(operativeEventRequestOuterClass$OperativeEventRequest0)).buildPartial();
                this.valueCase_ = 4;
            }

            private void mergePrivacyUpdateRequest(PrivacyUpdateRequest privacyUpdateRequestOuterClass$PrivacyUpdateRequest0) {
                privacyUpdateRequestOuterClass$PrivacyUpdateRequest0.getClass();
                this.value_ = this.valueCase_ != 8 || this.value_ == PrivacyUpdateRequest.getDefaultInstance() ? privacyUpdateRequestOuterClass$PrivacyUpdateRequest0 : ((gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder)PrivacyUpdateRequest.newBuilder(((PrivacyUpdateRequest)this.value_)).mergeFrom(privacyUpdateRequestOuterClass$PrivacyUpdateRequest0)).buildPartial();
                this.valueCase_ = 8;
            }

            private void mergeTransactionEventRequest(TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0) {
                transactionEventRequestOuterClass$TransactionEventRequest0.getClass();
                this.value_ = this.valueCase_ != 11 || this.value_ == TransactionEventRequest.getDefaultInstance() ? transactionEventRequestOuterClass$TransactionEventRequest0 : ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder)TransactionEventRequest.newBuilder(((TransactionEventRequest)this.value_)).mergeFrom(transactionEventRequestOuterClass$TransactionEventRequest0)).buildPartial();
                this.valueCase_ = 11;
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder() {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder)Payload.DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder(Payload universalRequestOuterClass$UniversalRequest$Payload0) {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder)Payload.DEFAULT_INSTANCE.createBuilder(universalRequestOuterClass$UniversalRequest$Payload0);
            }

            public static Payload parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (Payload)GeneratedMessageLite.parseDelimitedFrom(Payload.DEFAULT_INSTANCE, inputStream0);
            }

            public static Payload parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Payload)GeneratedMessageLite.parseDelimitedFrom(Payload.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Payload parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, byteString0);
            }

            public static Payload parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static Payload parseFrom(InputStream inputStream0) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, inputStream0);
            }

            public static Payload parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static Payload parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, arr_b);
            }

            public static Payload parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return Payload.DEFAULT_INSTANCE.getParserForType();
            }

            private void setAdDataRefreshRequest(AdDataRefreshRequest adDataRefreshRequestOuterClass$AdDataRefreshRequest0) {
                adDataRefreshRequestOuterClass$AdDataRefreshRequest0.getClass();
                this.value_ = adDataRefreshRequestOuterClass$AdDataRefreshRequest0;
                this.valueCase_ = 9;
            }

            private void setAdPlayerConfigRequest(AdPlayerConfigRequest adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0) {
                adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0.getClass();
                this.value_ = adPlayerConfigRequestOuterClass$AdPlayerConfigRequest0;
                this.valueCase_ = 6;
            }

            private void setAdRequest(AdRequest adRequestOuterClass$AdRequest0) {
                adRequestOuterClass$AdRequest0.getClass();
                this.value_ = adRequestOuterClass$AdRequest0;
                this.valueCase_ = 3;
            }

            private void setDiagnosticEventRequest(DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest0) {
                diagnosticEventRequestOuterClass$DiagnosticEventRequest0.getClass();
                this.value_ = diagnosticEventRequestOuterClass$DiagnosticEventRequest0;
                this.valueCase_ = 5;
            }

            private void setGetTokenEventRequest(GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest0) {
                getTokenEventRequestOuterClass$GetTokenEventRequest0.getClass();
                this.value_ = getTokenEventRequestOuterClass$GetTokenEventRequest0;
                this.valueCase_ = 7;
            }

            private void setInitializationCompletedEventRequest(InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0) {
                initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0.getClass();
                this.value_ = initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0;
                this.valueCase_ = 10;
            }

            private void setInitializationRequest(InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
                initializationRequestOuterClass$InitializationRequest0.getClass();
                this.value_ = initializationRequestOuterClass$InitializationRequest0;
                this.valueCase_ = 2;
            }

            private void setOperativeEvent(OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest0) {
                operativeEventRequestOuterClass$OperativeEventRequest0.getClass();
                this.value_ = operativeEventRequestOuterClass$OperativeEventRequest0;
                this.valueCase_ = 4;
            }

            private void setPrivacyUpdateRequest(PrivacyUpdateRequest privacyUpdateRequestOuterClass$PrivacyUpdateRequest0) {
                privacyUpdateRequestOuterClass$PrivacyUpdateRequest0.getClass();
                this.value_ = privacyUpdateRequestOuterClass$PrivacyUpdateRequest0;
                this.valueCase_ = 8;
            }

            private void setTransactionEventRequest(TransactionEventRequest transactionEventRequestOuterClass$TransactionEventRequest0) {
                transactionEventRequestOuterClass$TransactionEventRequest0.getClass();
                this.value_ = transactionEventRequestOuterClass$TransactionEventRequest0;
                this.valueCase_ = 11;
            }
        }

        public interface PayloadOrBuilder extends MessageLiteOrBuilder {
            AdDataRefreshRequest getAdDataRefreshRequest();

            AdPlayerConfigRequest getAdPlayerConfigRequest();

            AdRequest getAdRequest();

            DiagnosticEventRequest getDiagnosticEventRequest();

            GetTokenEventRequest getGetTokenEventRequest();

            InitializationCompletedEventRequest getInitializationCompletedEventRequest();

            InitializationRequest getInitializationRequest();

            OperativeEventRequest getOperativeEvent();

            PrivacyUpdateRequest getPrivacyUpdateRequest();

            TransactionEventRequest getTransactionEventRequest();

            ValueCase getValueCase();

            boolean hasAdDataRefreshRequest();

            boolean hasAdPlayerConfigRequest();

            boolean hasAdRequest();

            boolean hasDiagnosticEventRequest();

            boolean hasGetTokenEventRequest();

            boolean hasInitializationCompletedEventRequest();

            boolean hasInitializationRequest();

            boolean hasOperativeEvent();

            boolean hasPrivacyUpdateRequest();

            boolean hasTransactionEventRequest();
        }

        public static final class SharedData extends GeneratedMessageLite implements SharedDataOrBuilder {
            public static final class gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements SharedDataOrBuilder {
                private gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder() {
                    super(SharedData.DEFAULT_INSTANCE);
                }

                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder(a universalRequestOuterClass$a0) {
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearAppStartTime() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearAppStartTime();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearCurrentState() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearCurrentState();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearDeveloperConsent() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearDeveloperConsent();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearLimitedSessionToken() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearLimitedSessionToken();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearPii() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearPii();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearSdkStartTime() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearSdkStartTime();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearSessionToken() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearSessionToken();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearTestData() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearTestData();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearTimestamps() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearTimestamps();
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder clearWebviewVersion() {
                    this.copyOnWrite();
                    ((SharedData)this.instance).clearWebviewVersion();
                    return this;
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public Timestamp getAppStartTime() {
                    return ((SharedData)this.instance).getAppStartTime();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public ByteString getCurrentState() {
                    return ((SharedData)this.instance).getCurrentState();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public DeveloperConsent getDeveloperConsent() {
                    return ((SharedData)this.instance).getDeveloperConsent();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public LimitedSessionToken getLimitedSessionToken() {
                    return ((SharedData)this.instance).getLimitedSessionToken();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public Pii getPii() {
                    return ((SharedData)this.instance).getPii();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public Timestamp getSdkStartTime() {
                    return ((SharedData)this.instance).getSdkStartTime();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public ByteString getSessionToken() {
                    return ((SharedData)this.instance).getSessionToken();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public TestData getTestData() {
                    return ((SharedData)this.instance).getTestData();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public Timestamps getTimestamps() {
                    return ((SharedData)this.instance).getTimestamps();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public int getWebviewVersion() {
                    return ((SharedData)this.instance).getWebviewVersion();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public boolean hasAppStartTime() {
                    return ((SharedData)this.instance).hasAppStartTime();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public boolean hasCurrentState() {
                    return ((SharedData)this.instance).hasCurrentState();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public boolean hasDeveloperConsent() {
                    return ((SharedData)this.instance).hasDeveloperConsent();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public boolean hasLimitedSessionToken() {
                    return ((SharedData)this.instance).hasLimitedSessionToken();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public boolean hasPii() {
                    return ((SharedData)this.instance).hasPii();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public boolean hasSdkStartTime() {
                    return ((SharedData)this.instance).hasSdkStartTime();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public boolean hasSessionToken() {
                    return ((SharedData)this.instance).hasSessionToken();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public boolean hasTestData() {
                    return ((SharedData)this.instance).hasTestData();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public boolean hasTimestamps() {
                    return ((SharedData)this.instance).hasTimestamps();
                }

                @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
                public boolean hasWebviewVersion() {
                    return ((SharedData)this.instance).hasWebviewVersion();
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeAppStartTime(Timestamp timestamp0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeAppStartTime(timestamp0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeDeveloperConsent(DeveloperConsent developerConsentOuterClass$DeveloperConsent0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeDeveloperConsent(developerConsentOuterClass$DeveloperConsent0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeLimitedSessionToken(LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeLimitedSessionToken(universalRequestOuterClass$LimitedSessionToken0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergePii(Pii piiOuterClass$Pii0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergePii(piiOuterClass$Pii0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeSdkStartTime(Timestamp timestamp0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeSdkStartTime(timestamp0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeTestData(TestData testDataOuterClass$TestData0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeTestData(testDataOuterClass$TestData0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder mergeTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).mergeTimestamps(timestampsOuterClass$Timestamps0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setAppStartTime(com.google.protobuf.Timestamp.Builder timestamp$Builder0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setAppStartTime(((Timestamp)timestamp$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setAppStartTime(Timestamp timestamp0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setAppStartTime(timestamp0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setCurrentState(ByteString byteString0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setCurrentState(byteString0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setDeveloperConsent(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder developerConsentOuterClass$DeveloperConsent$Builder0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setDeveloperConsent(((DeveloperConsent)developerConsentOuterClass$DeveloperConsent$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setDeveloperConsent(DeveloperConsent developerConsentOuterClass$DeveloperConsent0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setDeveloperConsent(developerConsentOuterClass$DeveloperConsent0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setLimitedSessionToken(Builder universalRequestOuterClass$LimitedSessionToken$Builder0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setLimitedSessionToken(((LimitedSessionToken)universalRequestOuterClass$LimitedSessionToken$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setLimitedSessionToken(LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setLimitedSessionToken(universalRequestOuterClass$LimitedSessionToken0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setPii(gatewayprotocol.v1.PiiOuterClass.Pii.Builder piiOuterClass$Pii$Builder0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setPii(((Pii)piiOuterClass$Pii$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setPii(Pii piiOuterClass$Pii0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setPii(piiOuterClass$Pii0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setSdkStartTime(com.google.protobuf.Timestamp.Builder timestamp$Builder0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setSdkStartTime(((Timestamp)timestamp$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setSdkStartTime(Timestamp timestamp0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setSdkStartTime(timestamp0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setSessionToken(ByteString byteString0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setSessionToken(byteString0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData.Builder testDataOuterClass$TestData$Builder0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setTestData(((TestData)testDataOuterClass$TestData$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setTestData(TestData testDataOuterClass$TestData0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setTestData(testDataOuterClass$TestData0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder timestampsOuterClass$Timestamps$Builder0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setTimestamps(((Timestamps)timestampsOuterClass$Timestamps$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setTimestamps(timestampsOuterClass$Timestamps0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder setWebviewVersion(int v) {
                    this.copyOnWrite();
                    ((SharedData)this.instance).setWebviewVersion(v);
                    return this;
                }
            }

            public static final int APP_START_TIME_FIELD_NUMBER = 8;
            public static final int CURRENT_STATE_FIELD_NUMBER = 6;
            private static final SharedData DEFAULT_INSTANCE = null;
            public static final int DEVELOPER_CONSENT_FIELD_NUMBER = 4;
            public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 10;
            private static volatile Parser PARSER = null;
            public static final int PII_FIELD_NUMBER = 3;
            public static final int SDK_START_TIME_FIELD_NUMBER = 9;
            public static final int SESSION_TOKEN_FIELD_NUMBER = 1;
            public static final int TEST_DATA_FIELD_NUMBER = 7;
            public static final int TIMESTAMPS_FIELD_NUMBER = 2;
            public static final int WEBVIEW_VERSION_FIELD_NUMBER = 5;
            private Timestamp appStartTime_;
            private int bitField0_;
            private ByteString currentState_;
            private DeveloperConsent developerConsent_;
            private LimitedSessionToken limitedSessionToken_;
            private Pii pii_;
            private Timestamp sdkStartTime_;
            private ByteString sessionToken_;
            private TestData testData_;
            private Timestamps timestamps_;
            private int webviewVersion_;

            static {
                SharedData universalRequestOuterClass$UniversalRequest$SharedData0 = new SharedData();
                SharedData.DEFAULT_INSTANCE = universalRequestOuterClass$UniversalRequest$SharedData0;
                GeneratedMessageLite.registerDefaultInstance(SharedData.class, universalRequestOuterClass$UniversalRequest$SharedData0);
            }

            private SharedData() {
                this.sessionToken_ = ByteString.EMPTY;
                this.currentState_ = ByteString.EMPTY;
            }

            private void clearAppStartTime() {
                this.appStartTime_ = null;
                this.bitField0_ &= 0xFFFFFF7F;
            }

            private void clearCurrentState() {
                this.bitField0_ &= -33;
                this.currentState_ = SharedData.getDefaultInstance().getCurrentState();
            }

            private void clearDeveloperConsent() {
                this.developerConsent_ = null;
                this.bitField0_ &= -9;
            }

            private void clearLimitedSessionToken() {
                this.limitedSessionToken_ = null;
                this.bitField0_ &= 0xFFFFFDFF;
            }

            private void clearPii() {
                this.pii_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSdkStartTime() {
                this.sdkStartTime_ = null;
                this.bitField0_ &= 0xFFFFFEFF;
            }

            private void clearSessionToken() {
                this.bitField0_ &= -2;
                this.sessionToken_ = SharedData.getDefaultInstance().getSessionToken();
            }

            private void clearTestData() {
                this.testData_ = null;
                this.bitField0_ &= -65;
            }

            private void clearTimestamps() {
                this.timestamps_ = null;
                this.bitField0_ &= -3;
            }

            private void clearWebviewVersion() {
                this.bitField0_ &= -17;
                this.webviewVersion_ = 0;
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new SharedData();
                    }
                    case 2: {
                        return new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(SharedData.DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ည\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t", new Object[]{"bitField0_", "sessionToken_", "timestamps_", "pii_", "developerConsent_", "webviewVersion_", "currentState_", "testData_", "appStartTime_", "sdkStartTime_", "limitedSessionToken_"});
                    }
                    case 4: {
                        return SharedData.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = SharedData.PARSER;
                        if(parser0 == null) {
                            Class class0 = SharedData.class;
                            synchronized(class0) {
                                parser0 = SharedData.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(SharedData.DEFAULT_INSTANCE);
                                    SharedData.PARSER = parser0;
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

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public Timestamp getAppStartTime() {
                return this.appStartTime_ == null ? Timestamp.getDefaultInstance() : this.appStartTime_;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public ByteString getCurrentState() {
                return this.currentState_;
            }

            public static SharedData getDefaultInstance() {
                return SharedData.DEFAULT_INSTANCE;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public DeveloperConsent getDeveloperConsent() {
                return this.developerConsent_ == null ? DeveloperConsent.getDefaultInstance() : this.developerConsent_;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public LimitedSessionToken getLimitedSessionToken() {
                return this.limitedSessionToken_ == null ? LimitedSessionToken.getDefaultInstance() : this.limitedSessionToken_;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public Pii getPii() {
                return this.pii_ == null ? Pii.getDefaultInstance() : this.pii_;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public Timestamp getSdkStartTime() {
                return this.sdkStartTime_ == null ? Timestamp.getDefaultInstance() : this.sdkStartTime_;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public ByteString getSessionToken() {
                return this.sessionToken_;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public TestData getTestData() {
                return this.testData_ == null ? TestData.getDefaultInstance() : this.testData_;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public Timestamps getTimestamps() {
                return this.timestamps_ == null ? Timestamps.getDefaultInstance() : this.timestamps_;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public int getWebviewVersion() {
                return this.webviewVersion_;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public boolean hasAppStartTime() {
                return (this.bitField0_ & 0x80) != 0;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public boolean hasCurrentState() {
                return (this.bitField0_ & 0x20) != 0;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public boolean hasDeveloperConsent() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public boolean hasLimitedSessionToken() {
                return (this.bitField0_ & 0x200) != 0;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public boolean hasPii() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public boolean hasSdkStartTime() {
                return (this.bitField0_ & 0x100) != 0;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public boolean hasSessionToken() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public boolean hasTestData() {
                return (this.bitField0_ & 0x40) != 0;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public boolean hasTimestamps() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder
            public boolean hasWebviewVersion() {
                return (this.bitField0_ & 16) != 0;
            }

            private void mergeAppStartTime(Timestamp timestamp0) {
                timestamp0.getClass();
                this.appStartTime_ = this.appStartTime_ == null || this.appStartTime_ == Timestamp.getDefaultInstance() ? timestamp0 : ((Timestamp)((com.google.protobuf.Timestamp.Builder)Timestamp.newBuilder(this.appStartTime_).mergeFrom(timestamp0)).buildPartial());
                this.bitField0_ |= 0x80;
            }

            private void mergeDeveloperConsent(DeveloperConsent developerConsentOuterClass$DeveloperConsent0) {
                developerConsentOuterClass$DeveloperConsent0.getClass();
                this.developerConsent_ = this.developerConsent_ == null || this.developerConsent_ == DeveloperConsent.getDefaultInstance() ? developerConsentOuterClass$DeveloperConsent0 : ((DeveloperConsent)((gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder)DeveloperConsent.newBuilder(this.developerConsent_).mergeFrom(developerConsentOuterClass$DeveloperConsent0)).buildPartial());
                this.bitField0_ |= 8;
            }

            private void mergeLimitedSessionToken(LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
                universalRequestOuterClass$LimitedSessionToken0.getClass();
                this.limitedSessionToken_ = this.limitedSessionToken_ == null || this.limitedSessionToken_ == LimitedSessionToken.getDefaultInstance() ? universalRequestOuterClass$LimitedSessionToken0 : ((LimitedSessionToken)((Builder)LimitedSessionToken.newBuilder(this.limitedSessionToken_).mergeFrom(universalRequestOuterClass$LimitedSessionToken0)).buildPartial());
                this.bitField0_ |= 0x200;
            }

            private void mergePii(Pii piiOuterClass$Pii0) {
                piiOuterClass$Pii0.getClass();
                this.pii_ = this.pii_ == null || this.pii_ == Pii.getDefaultInstance() ? piiOuterClass$Pii0 : ((Pii)((gatewayprotocol.v1.PiiOuterClass.Pii.Builder)Pii.newBuilder(this.pii_).mergeFrom(piiOuterClass$Pii0)).buildPartial());
                this.bitField0_ |= 4;
            }

            private void mergeSdkStartTime(Timestamp timestamp0) {
                timestamp0.getClass();
                this.sdkStartTime_ = this.sdkStartTime_ == null || this.sdkStartTime_ == Timestamp.getDefaultInstance() ? timestamp0 : ((Timestamp)((com.google.protobuf.Timestamp.Builder)Timestamp.newBuilder(this.sdkStartTime_).mergeFrom(timestamp0)).buildPartial());
                this.bitField0_ |= 0x100;
            }

            private void mergeTestData(TestData testDataOuterClass$TestData0) {
                testDataOuterClass$TestData0.getClass();
                this.testData_ = this.testData_ == null || this.testData_ == TestData.getDefaultInstance() ? testDataOuterClass$TestData0 : ((TestData)((gatewayprotocol.v1.TestDataOuterClass.TestData.Builder)TestData.newBuilder(this.testData_).mergeFrom(testDataOuterClass$TestData0)).buildPartial());
                this.bitField0_ |= 0x40;
            }

            private void mergeTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
                timestampsOuterClass$Timestamps0.getClass();
                this.timestamps_ = this.timestamps_ == null || this.timestamps_ == Timestamps.getDefaultInstance() ? timestampsOuterClass$Timestamps0 : ((Timestamps)((gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder)Timestamps.newBuilder(this.timestamps_).mergeFrom(timestampsOuterClass$Timestamps0)).buildPartial());
                this.bitField0_ |= 2;
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder newBuilder() {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder)SharedData.DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder newBuilder(SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
                return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder)SharedData.DEFAULT_INSTANCE.createBuilder(universalRequestOuterClass$UniversalRequest$SharedData0);
            }

            public static SharedData parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (SharedData)GeneratedMessageLite.parseDelimitedFrom(SharedData.DEFAULT_INSTANCE, inputStream0);
            }

            public static SharedData parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (SharedData)GeneratedMessageLite.parseDelimitedFrom(SharedData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static SharedData parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom(SharedData.DEFAULT_INSTANCE, byteString0);
            }

            public static SharedData parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom(SharedData.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static SharedData parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (SharedData)GeneratedMessageLite.parseFrom(SharedData.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static SharedData parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (SharedData)GeneratedMessageLite.parseFrom(SharedData.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static SharedData parseFrom(InputStream inputStream0) throws IOException {
                return (SharedData)GeneratedMessageLite.parseFrom(SharedData.DEFAULT_INSTANCE, inputStream0);
            }

            public static SharedData parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (SharedData)GeneratedMessageLite.parseFrom(SharedData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static SharedData parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom(SharedData.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static SharedData parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom(SharedData.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static SharedData parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom(SharedData.DEFAULT_INSTANCE, arr_b);
            }

            public static SharedData parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (SharedData)GeneratedMessageLite.parseFrom(SharedData.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return SharedData.DEFAULT_INSTANCE.getParserForType();
            }

            private void setAppStartTime(Timestamp timestamp0) {
                timestamp0.getClass();
                this.appStartTime_ = timestamp0;
                this.bitField0_ |= 0x80;
            }

            private void setCurrentState(ByteString byteString0) {
                byteString0.getClass();
                this.bitField0_ |= 0x20;
                this.currentState_ = byteString0;
            }

            private void setDeveloperConsent(DeveloperConsent developerConsentOuterClass$DeveloperConsent0) {
                developerConsentOuterClass$DeveloperConsent0.getClass();
                this.developerConsent_ = developerConsentOuterClass$DeveloperConsent0;
                this.bitField0_ |= 8;
            }

            private void setLimitedSessionToken(LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
                universalRequestOuterClass$LimitedSessionToken0.getClass();
                this.limitedSessionToken_ = universalRequestOuterClass$LimitedSessionToken0;
                this.bitField0_ |= 0x200;
            }

            private void setPii(Pii piiOuterClass$Pii0) {
                piiOuterClass$Pii0.getClass();
                this.pii_ = piiOuterClass$Pii0;
                this.bitField0_ |= 4;
            }

            private void setSdkStartTime(Timestamp timestamp0) {
                timestamp0.getClass();
                this.sdkStartTime_ = timestamp0;
                this.bitField0_ |= 0x100;
            }

            private void setSessionToken(ByteString byteString0) {
                byteString0.getClass();
                this.bitField0_ |= 1;
                this.sessionToken_ = byteString0;
            }

            private void setTestData(TestData testDataOuterClass$TestData0) {
                testDataOuterClass$TestData0.getClass();
                this.testData_ = testDataOuterClass$TestData0;
                this.bitField0_ |= 0x40;
            }

            private void setTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
                timestampsOuterClass$Timestamps0.getClass();
                this.timestamps_ = timestampsOuterClass$Timestamps0;
                this.bitField0_ |= 2;
            }

            private void setWebviewVersion(int v) {
                this.bitField0_ |= 16;
                this.webviewVersion_ = v;
            }
        }

        public interface SharedDataOrBuilder extends MessageLiteOrBuilder {
            Timestamp getAppStartTime();

            ByteString getCurrentState();

            DeveloperConsent getDeveloperConsent();

            LimitedSessionToken getLimitedSessionToken();

            Pii getPii();

            Timestamp getSdkStartTime();

            ByteString getSessionToken();

            TestData getTestData();

            Timestamps getTimestamps();

            int getWebviewVersion();

            boolean hasAppStartTime();

            boolean hasCurrentState();

            boolean hasDeveloperConsent();

            boolean hasLimitedSessionToken();

            boolean hasPii();

            boolean hasSdkStartTime();

            boolean hasSessionToken();

            boolean hasTestData();

            boolean hasTimestamps();

            boolean hasWebviewVersion();
        }

        private static final UniversalRequest DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        public static final int SHARED_DATA_FIELD_NUMBER = 1;
        private int bitField0_;
        private Payload payload_;
        private SharedData sharedData_;

        static {
            UniversalRequest universalRequestOuterClass$UniversalRequest0 = new UniversalRequest();
            UniversalRequest.DEFAULT_INSTANCE = universalRequestOuterClass$UniversalRequest0;
            GeneratedMessageLite.registerDefaultInstance(UniversalRequest.class, universalRequestOuterClass$UniversalRequest0);
        }

        private void clearPayload() {
            this.payload_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSharedData() {
            this.sharedData_ = null;
            this.bitField0_ &= -2;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new UniversalRequest();
                }
                case 2: {
                    return new gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(UniversalRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "sharedData_", "payload_"});
                }
                case 4: {
                    return UniversalRequest.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = UniversalRequest.PARSER;
                    if(parser0 == null) {
                        Class class0 = UniversalRequest.class;
                        synchronized(class0) {
                            parser0 = UniversalRequest.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(UniversalRequest.DEFAULT_INSTANCE);
                                UniversalRequest.PARSER = parser0;
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

        public static UniversalRequest getDefaultInstance() {
            return UniversalRequest.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequestOrBuilder
        public Payload getPayload() {
            return this.payload_ == null ? Payload.getDefaultInstance() : this.payload_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequestOrBuilder
        public SharedData getSharedData() {
            return this.sharedData_ == null ? SharedData.getDefaultInstance() : this.sharedData_;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequestOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequestOrBuilder
        public boolean hasSharedData() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergePayload(Payload universalRequestOuterClass$UniversalRequest$Payload0) {
            universalRequestOuterClass$UniversalRequest$Payload0.getClass();
            this.payload_ = this.payload_ == null || this.payload_ == Payload.getDefaultInstance() ? universalRequestOuterClass$UniversalRequest$Payload0 : ((Payload)((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder)Payload.newBuilder(this.payload_).mergeFrom(universalRequestOuterClass$UniversalRequest$Payload0)).buildPartial());
            this.bitField0_ |= 2;
        }

        private void mergeSharedData(SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
            universalRequestOuterClass$UniversalRequest$SharedData0.getClass();
            this.sharedData_ = this.sharedData_ == null || this.sharedData_ == SharedData.getDefaultInstance() ? universalRequestOuterClass$UniversalRequest$SharedData0 : ((SharedData)((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder)SharedData.newBuilder(this.sharedData_).mergeFrom(universalRequestOuterClass$UniversalRequest$SharedData0)).buildPartial());
            this.bitField0_ |= 1;
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder newBuilder() {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder)UniversalRequest.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder newBuilder(UniversalRequest universalRequestOuterClass$UniversalRequest0) {
            return (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder)UniversalRequest.DEFAULT_INSTANCE.createBuilder(universalRequestOuterClass$UniversalRequest0);
        }

        public static UniversalRequest parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseDelimitedFrom(UniversalRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static UniversalRequest parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseDelimitedFrom(UniversalRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static UniversalRequest parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom(UniversalRequest.DEFAULT_INSTANCE, byteString0);
        }

        public static UniversalRequest parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom(UniversalRequest.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static UniversalRequest parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom(UniversalRequest.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static UniversalRequest parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom(UniversalRequest.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static UniversalRequest parseFrom(InputStream inputStream0) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom(UniversalRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static UniversalRequest parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom(UniversalRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static UniversalRequest parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom(UniversalRequest.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static UniversalRequest parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom(UniversalRequest.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static UniversalRequest parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom(UniversalRequest.DEFAULT_INSTANCE, arr_b);
        }

        public static UniversalRequest parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UniversalRequest)GeneratedMessageLite.parseFrom(UniversalRequest.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return UniversalRequest.DEFAULT_INSTANCE.getParserForType();
        }

        private void setPayload(Payload universalRequestOuterClass$UniversalRequest$Payload0) {
            universalRequestOuterClass$UniversalRequest$Payload0.getClass();
            this.payload_ = universalRequestOuterClass$UniversalRequest$Payload0;
            this.bitField0_ |= 2;
        }

        private void setSharedData(SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
            universalRequestOuterClass$UniversalRequest$SharedData0.getClass();
            this.sharedData_ = universalRequestOuterClass$UniversalRequest$SharedData0;
            this.bitField0_ |= 1;
        }
    }

    public interface UniversalRequestOrBuilder extends MessageLiteOrBuilder {
        Payload getPayload();

        SharedData getSharedData();

        boolean hasPayload();

        boolean hasSharedData();
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

