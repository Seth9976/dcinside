package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ClientInfoOuterClass {
    public static final class ClientInfo extends GeneratedMessageLite implements ClientInfoOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements ClientInfoOrBuilder {
            private Builder() {
                super(ClientInfo.DEFAULT_INSTANCE);
            }

            Builder(a clientInfoOuterClass$a0) {
            }

            public Builder clearCustomMediationName() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearCustomMediationName();
                return this;
            }

            public Builder clearGameId() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearGameId();
                return this;
            }

            public Builder clearMediationProvider() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearMediationProvider();
                return this;
            }

            public Builder clearMediationVersion() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearMediationVersion();
                return this;
            }

            public Builder clearOfferwallVersion() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearOfferwallVersion();
                return this;
            }

            public Builder clearOmidPartnerVersion() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearOmidPartnerVersion();
                return this;
            }

            public Builder clearOmidVersion() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearOmidVersion();
                return this;
            }

            public Builder clearPlatform() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearPlatform();
                return this;
            }

            public Builder clearScarVersionName() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearScarVersionName();
                return this;
            }

            public Builder clearSdkDevelopmentPlatform() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearSdkDevelopmentPlatform();
                return this;
            }

            public Builder clearSdkVersion() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearSdkVersion();
                return this;
            }

            public Builder clearSdkVersionName() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearSdkVersionName();
                return this;
            }

            public Builder clearTest() {
                this.copyOnWrite();
                ((ClientInfo)this.instance).clearTest();
                return this;
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public String getCustomMediationName() {
                return ((ClientInfo)this.instance).getCustomMediationName();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public ByteString getCustomMediationNameBytes() {
                return ((ClientInfo)this.instance).getCustomMediationNameBytes();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public String getGameId() {
                return ((ClientInfo)this.instance).getGameId();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public ByteString getGameIdBytes() {
                return ((ClientInfo)this.instance).getGameIdBytes();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public MediationProvider getMediationProvider() {
                return ((ClientInfo)this.instance).getMediationProvider();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public int getMediationProviderValue() {
                return ((ClientInfo)this.instance).getMediationProviderValue();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public String getMediationVersion() {
                return ((ClientInfo)this.instance).getMediationVersion();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public ByteString getMediationVersionBytes() {
                return ((ClientInfo)this.instance).getMediationVersionBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public String getOfferwallVersion() {
                return "";
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public ByteString getOfferwallVersionBytes() {
                return ((ClientInfo)this.instance).getOfferwallVersionBytes();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public String getOmidPartnerVersion() {
                return ((ClientInfo)this.instance).getOmidPartnerVersion();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public ByteString getOmidPartnerVersionBytes() {
                return ((ClientInfo)this.instance).getOmidPartnerVersionBytes();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public String getOmidVersion() {
                return ((ClientInfo)this.instance).getOmidVersion();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public ByteString getOmidVersionBytes() {
                return ((ClientInfo)this.instance).getOmidVersionBytes();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public Platform getPlatform() {
                return ((ClientInfo)this.instance).getPlatform();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public int getPlatformValue() {
                return ((ClientInfo)this.instance).getPlatformValue();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public String getScarVersionName() {
                return "";
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public ByteString getScarVersionNameBytes() {
                return ((ClientInfo)this.instance).getScarVersionNameBytes();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public String getSdkDevelopmentPlatform() {
                return ((ClientInfo)this.instance).getSdkDevelopmentPlatform();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public ByteString getSdkDevelopmentPlatformBytes() {
                return ((ClientInfo)this.instance).getSdkDevelopmentPlatformBytes();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public int getSdkVersion() {
                return ((ClientInfo)this.instance).getSdkVersion();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public String getSdkVersionName() {
                return "";
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public ByteString getSdkVersionNameBytes() {
                return ((ClientInfo)this.instance).getSdkVersionNameBytes();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public boolean getTest() {
                return ((ClientInfo)this.instance).getTest();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public boolean hasCustomMediationName() {
                return ((ClientInfo)this.instance).hasCustomMediationName();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public boolean hasMediationVersion() {
                return ((ClientInfo)this.instance).hasMediationVersion();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public boolean hasOfferwallVersion() {
                return ((ClientInfo)this.instance).hasOfferwallVersion();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public boolean hasOmidPartnerVersion() {
                return ((ClientInfo)this.instance).hasOmidPartnerVersion();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public boolean hasOmidVersion() {
                return ((ClientInfo)this.instance).hasOmidVersion();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public boolean hasScarVersionName() {
                return ((ClientInfo)this.instance).hasScarVersionName();
            }

            @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
            public boolean hasSdkDevelopmentPlatform() {
                return ((ClientInfo)this.instance).hasSdkDevelopmentPlatform();
            }

            public Builder setCustomMediationName(String s) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setCustomMediationName(s);
                return this;
            }

            public Builder setCustomMediationNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setCustomMediationNameBytes(byteString0);
                return this;
            }

            public Builder setGameId(String s) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setGameId(s);
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setGameIdBytes(byteString0);
                return this;
            }

            public Builder setMediationProvider(MediationProvider clientInfoOuterClass$MediationProvider0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setMediationProvider(clientInfoOuterClass$MediationProvider0);
                return this;
            }

            public Builder setMediationProviderValue(int v) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setMediationProviderValue(v);
                return this;
            }

            public Builder setMediationVersion(String s) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setMediationVersion(s);
                return this;
            }

            public Builder setMediationVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setMediationVersionBytes(byteString0);
                return this;
            }

            public Builder setOfferwallVersion(String s) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setOfferwallVersion(s);
                return this;
            }

            public Builder setOfferwallVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setOfferwallVersionBytes(byteString0);
                return this;
            }

            public Builder setOmidPartnerVersion(String s) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setOmidPartnerVersion(s);
                return this;
            }

            public Builder setOmidPartnerVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setOmidPartnerVersionBytes(byteString0);
                return this;
            }

            public Builder setOmidVersion(String s) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setOmidVersion(s);
                return this;
            }

            public Builder setOmidVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setOmidVersionBytes(byteString0);
                return this;
            }

            public Builder setPlatform(Platform clientInfoOuterClass$Platform0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setPlatform(clientInfoOuterClass$Platform0);
                return this;
            }

            public Builder setPlatformValue(int v) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setPlatformValue(v);
                return this;
            }

            public Builder setScarVersionName(String s) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setScarVersionName(s);
                return this;
            }

            public Builder setScarVersionNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setScarVersionNameBytes(byteString0);
                return this;
            }

            public Builder setSdkDevelopmentPlatform(String s) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setSdkDevelopmentPlatform(s);
                return this;
            }

            public Builder setSdkDevelopmentPlatformBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setSdkDevelopmentPlatformBytes(byteString0);
                return this;
            }

            public Builder setSdkVersion(int v) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setSdkVersion(v);
                return this;
            }

            public Builder setSdkVersionName(String s) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setSdkVersionName(s);
                return this;
            }

            public Builder setSdkVersionNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setSdkVersionNameBytes(byteString0);
                return this;
            }

            public Builder setTest(boolean z) {
                this.copyOnWrite();
                ((ClientInfo)this.instance).setTest(z);
                return this;
            }
        }

        public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 7;
        private static final ClientInfo DEFAULT_INSTANCE = null;
        public static final int GAME_ID_FIELD_NUMBER = 3;
        public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 6;
        public static final int MEDIATION_VERSION_FIELD_NUMBER = 8;
        public static final int OFFERWALL_VERSION_FIELD_NUMBER = 13;
        public static final int OMID_PARTNER_VERSION_FIELD_NUMBER = 9;
        public static final int OMID_VERSION_FIELD_NUMBER = 10;
        private static volatile Parser PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 5;
        public static final int SCAR_VERSION_NAME_FIELD_NUMBER = 12;
        public static final int SDK_DEVELOPMENT_PLATFORM_FIELD_NUMBER = 11;
        public static final int SDK_VERSION_FIELD_NUMBER = 1;
        public static final int SDK_VERSION_NAME_FIELD_NUMBER = 2;
        public static final int TEST_FIELD_NUMBER = 4;
        private int bitField0_;
        private String customMediationName_;
        private String gameId_;
        private int mediationProvider_;
        private String mediationVersion_;
        private String offerwallVersion_;
        private String omidPartnerVersion_;
        private String omidVersion_;
        private int platform_;
        private String scarVersionName_;
        private String sdkDevelopmentPlatform_;
        private String sdkVersionName_;
        private int sdkVersion_;
        private boolean test_;

        static {
            ClientInfo clientInfoOuterClass$ClientInfo0 = new ClientInfo();
            ClientInfo.DEFAULT_INSTANCE = clientInfoOuterClass$ClientInfo0;
            GeneratedMessageLite.registerDefaultInstance(ClientInfo.class, clientInfoOuterClass$ClientInfo0);
        }

        private ClientInfo() {
            this.sdkVersionName_ = "";
            this.gameId_ = "";
            this.customMediationName_ = "";
            this.mediationVersion_ = "";
            this.omidPartnerVersion_ = "";
            this.omidVersion_ = "";
            this.sdkDevelopmentPlatform_ = "";
            this.scarVersionName_ = "";
            this.offerwallVersion_ = "";
        }

        private void clearCustomMediationName() {
            this.bitField0_ &= -2;
            this.customMediationName_ = "";
        }

        private void clearGameId() {
            this.gameId_ = "";
        }

        private void clearMediationProvider() {
            this.mediationProvider_ = 0;
        }

        private void clearMediationVersion() {
            this.bitField0_ &= -3;
            this.mediationVersion_ = "";
        }

        private void clearOfferwallVersion() {
            this.bitField0_ &= -65;
            this.offerwallVersion_ = "";
        }

        private void clearOmidPartnerVersion() {
            this.bitField0_ &= -5;
            this.omidPartnerVersion_ = "";
        }

        private void clearOmidVersion() {
            this.bitField0_ &= -9;
            this.omidVersion_ = "";
        }

        private void clearPlatform() {
            this.platform_ = 0;
        }

        private void clearScarVersionName() {
            this.bitField0_ &= -33;
            this.scarVersionName_ = "";
        }

        private void clearSdkDevelopmentPlatform() {
            this.bitField0_ &= -17;
            this.sdkDevelopmentPlatform_ = "";
        }

        private void clearSdkVersion() {
            this.sdkVersion_ = 0;
        }

        private void clearSdkVersionName() {
            this.sdkVersionName_ = "";
        }

        private void clearTest() {
            this.test_ = false;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new ClientInfo();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(ClientInfo.DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\u000B\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\f\u0006\f\u0007ለ\u0000\bለ\u0001\tለ\u0002\nለ\u0003\u000Bለ\u0004\fለ\u0005\rለ\u0006", new Object[]{"bitField0_", "sdkVersion_", "sdkVersionName_", "gameId_", "test_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_", "omidPartnerVersion_", "omidVersion_", "sdkDevelopmentPlatform_", "scarVersionName_", "offerwallVersion_"});
                }
                case 4: {
                    return ClientInfo.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = ClientInfo.PARSER;
                    if(parser0 == null) {
                        Class class0 = ClientInfo.class;
                        synchronized(class0) {
                            parser0 = ClientInfo.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(ClientInfo.DEFAULT_INSTANCE);
                                ClientInfo.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public String getCustomMediationName() {
            return this.customMediationName_;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public ByteString getCustomMediationNameBytes() {
            return ByteString.copyFromUtf8(this.customMediationName_);
        }

        public static ClientInfo getDefaultInstance() {
            return ClientInfo.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public String getGameId() {
            return this.gameId_;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public ByteString getGameIdBytes() {
            return ByteString.copyFromUtf8(this.gameId_);
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public MediationProvider getMediationProvider() {
            MediationProvider clientInfoOuterClass$MediationProvider0 = MediationProvider.forNumber(this.mediationProvider_);
            return clientInfoOuterClass$MediationProvider0 == null ? MediationProvider.UNRECOGNIZED : clientInfoOuterClass$MediationProvider0;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public int getMediationProviderValue() {
            return this.mediationProvider_;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public String getMediationVersion() {
            return this.mediationVersion_;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public ByteString getMediationVersionBytes() {
            return ByteString.copyFromUtf8(this.mediationVersion_);
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public String getOfferwallVersion() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public ByteString getOfferwallVersionBytes() {
            return ByteString.copyFromUtf8(this.offerwallVersion_);
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public String getOmidPartnerVersion() {
            return this.omidPartnerVersion_;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public ByteString getOmidPartnerVersionBytes() {
            return ByteString.copyFromUtf8(this.omidPartnerVersion_);
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public String getOmidVersion() {
            return this.omidVersion_;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public ByteString getOmidVersionBytes() {
            return ByteString.copyFromUtf8(this.omidVersion_);
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public Platform getPlatform() {
            Platform clientInfoOuterClass$Platform0 = Platform.forNumber(this.platform_);
            return clientInfoOuterClass$Platform0 == null ? Platform.UNRECOGNIZED : clientInfoOuterClass$Platform0;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public int getPlatformValue() {
            return this.platform_;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public String getScarVersionName() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public ByteString getScarVersionNameBytes() {
            return ByteString.copyFromUtf8(this.scarVersionName_);
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public String getSdkDevelopmentPlatform() {
            return this.sdkDevelopmentPlatform_;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public ByteString getSdkDevelopmentPlatformBytes() {
            return ByteString.copyFromUtf8(this.sdkDevelopmentPlatform_);
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public int getSdkVersion() {
            return this.sdkVersion_;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public String getSdkVersionName() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public ByteString getSdkVersionNameBytes() {
            return ByteString.copyFromUtf8(this.sdkVersionName_);
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public boolean getTest() {
            return this.test_;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public boolean hasCustomMediationName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public boolean hasMediationVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public boolean hasOfferwallVersion() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public boolean hasOmidPartnerVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public boolean hasOmidVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public boolean hasScarVersionName() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // gatewayprotocol.v1.ClientInfoOuterClass$ClientInfoOrBuilder
        public boolean hasSdkDevelopmentPlatform() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder() {
            return (Builder)ClientInfo.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ClientInfo clientInfoOuterClass$ClientInfo0) {
            return (Builder)ClientInfo.DEFAULT_INSTANCE.createBuilder(clientInfoOuterClass$ClientInfo0);
        }

        public static ClientInfo parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (ClientInfo)GeneratedMessageLite.parseDelimitedFrom(ClientInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static ClientInfo parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ClientInfo)GeneratedMessageLite.parseDelimitedFrom(ClientInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static ClientInfo parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (ClientInfo)GeneratedMessageLite.parseFrom(ClientInfo.DEFAULT_INSTANCE, byteString0);
        }

        public static ClientInfo parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ClientInfo)GeneratedMessageLite.parseFrom(ClientInfo.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static ClientInfo parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (ClientInfo)GeneratedMessageLite.parseFrom(ClientInfo.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static ClientInfo parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ClientInfo)GeneratedMessageLite.parseFrom(ClientInfo.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static ClientInfo parseFrom(InputStream inputStream0) throws IOException {
            return (ClientInfo)GeneratedMessageLite.parseFrom(ClientInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static ClientInfo parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ClientInfo)GeneratedMessageLite.parseFrom(ClientInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static ClientInfo parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (ClientInfo)GeneratedMessageLite.parseFrom(ClientInfo.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static ClientInfo parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ClientInfo)GeneratedMessageLite.parseFrom(ClientInfo.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static ClientInfo parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (ClientInfo)GeneratedMessageLite.parseFrom(ClientInfo.DEFAULT_INSTANCE, arr_b);
        }

        public static ClientInfo parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ClientInfo)GeneratedMessageLite.parseFrom(ClientInfo.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return ClientInfo.DEFAULT_INSTANCE.getParserForType();
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

        private void setGameId(String s) {
            s.getClass();
            this.gameId_ = s;
        }

        private void setGameIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.gameId_ = byteString0.toStringUtf8();
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

        private void setOfferwallVersion(String s) {
            s.getClass();
            this.bitField0_ |= 0x40;
            this.offerwallVersion_ = s;
        }

        private void setOfferwallVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.offerwallVersion_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x40;
        }

        private void setOmidPartnerVersion(String s) {
            s.getClass();
            this.bitField0_ |= 4;
            this.omidPartnerVersion_ = s;
        }

        private void setOmidPartnerVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.omidPartnerVersion_ = byteString0.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setOmidVersion(String s) {
            s.getClass();
            this.bitField0_ |= 8;
            this.omidVersion_ = s;
        }

        private void setOmidVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.omidVersion_ = byteString0.toStringUtf8();
            this.bitField0_ |= 8;
        }

        private void setPlatform(Platform clientInfoOuterClass$Platform0) {
            this.platform_ = clientInfoOuterClass$Platform0.getNumber();
        }

        private void setPlatformValue(int v) {
            this.platform_ = v;
        }

        private void setScarVersionName(String s) {
            s.getClass();
            this.bitField0_ |= 0x20;
            this.scarVersionName_ = s;
        }

        private void setScarVersionNameBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.scarVersionName_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x20;
        }

        private void setSdkDevelopmentPlatform(String s) {
            s.getClass();
            this.bitField0_ |= 16;
            this.sdkDevelopmentPlatform_ = s;
        }

        private void setSdkDevelopmentPlatformBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.sdkDevelopmentPlatform_ = byteString0.toStringUtf8();
            this.bitField0_ |= 16;
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

        private void setTest(boolean z) {
            this.test_ = z;
        }
    }

    public interface ClientInfoOrBuilder extends MessageLiteOrBuilder {
        String getCustomMediationName();

        ByteString getCustomMediationNameBytes();

        String getGameId();

        ByteString getGameIdBytes();

        MediationProvider getMediationProvider();

        int getMediationProviderValue();

        String getMediationVersion();

        ByteString getMediationVersionBytes();

        String getOfferwallVersion();

        ByteString getOfferwallVersionBytes();

        String getOmidPartnerVersion();

        ByteString getOmidPartnerVersionBytes();

        String getOmidVersion();

        ByteString getOmidVersionBytes();

        Platform getPlatform();

        int getPlatformValue();

        String getScarVersionName();

        ByteString getScarVersionNameBytes();

        String getSdkDevelopmentPlatform();

        ByteString getSdkDevelopmentPlatformBytes();

        int getSdkVersion();

        String getSdkVersionName();

        ByteString getSdkVersionNameBytes();

        boolean getTest();

        boolean hasCustomMediationName();

        boolean hasMediationVersion();

        boolean hasOfferwallVersion();

        boolean hasOmidPartnerVersion();

        boolean hasOmidVersion();

        boolean hasScarVersionName();

        boolean hasSdkDevelopmentPlatform();
    }

    public static enum MediationProvider implements EnumLite {
        class gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.a implements EnumLiteMap {
            gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.a() {
                super();
            }

            public MediationProvider a(int v) {
                return MediationProvider.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                b.a = new b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return MediationProvider.forNumber(v) != null;
            }
        }

        MEDIATION_PROVIDER_UNSPECIFIED(0),
        MEDIATION_PROVIDER_CUSTOM(1),
        MEDIATION_PROVIDER_ADMOB(2),
        MEDIATION_PROVIDER_MAX(3),
        MEDIATION_PROVIDER_LEVELPLAY(4),
        UNRECOGNIZED(-1);

        public static final int MEDIATION_PROVIDER_ADMOB_VALUE = 2;
        public static final int MEDIATION_PROVIDER_CUSTOM_VALUE = 1;
        public static final int MEDIATION_PROVIDER_LEVELPLAY_VALUE = 4;
        public static final int MEDIATION_PROVIDER_MAX_VALUE = 3;
        public static final int MEDIATION_PROVIDER_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static MediationProvider[] $values() [...] // Inlined contents

        static {
            MediationProvider.internalValueMap = new gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.a();
        }

        private MediationProvider(int v1) {
            this.value = v1;
        }

        public static MediationProvider forNumber(int v) {
            switch(v) {
                case 0: {
                    return MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
                }
                case 1: {
                    return MediationProvider.MEDIATION_PROVIDER_CUSTOM;
                }
                case 2: {
                    return MediationProvider.MEDIATION_PROVIDER_ADMOB;
                }
                case 3: {
                    return MediationProvider.MEDIATION_PROVIDER_MAX;
                }
                case 4: {
                    return MediationProvider.MEDIATION_PROVIDER_LEVELPLAY;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == MediationProvider.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return MediationProvider.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Deprecated
        public static MediationProvider valueOf(int v) {
            return MediationProvider.forNumber(v);
        }
    }

    public static enum Platform implements EnumLite {
        class gatewayprotocol.v1.ClientInfoOuterClass.Platform.a implements EnumLiteMap {
            gatewayprotocol.v1.ClientInfoOuterClass.Platform.a() {
                super();
            }

            public Platform a(int v) {
                return Platform.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class gatewayprotocol.v1.ClientInfoOuterClass.Platform.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                gatewayprotocol.v1.ClientInfoOuterClass.Platform.b.a = new gatewayprotocol.v1.ClientInfoOuterClass.Platform.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return Platform.forNumber(v) != null;
            }
        }

        PLATFORM_UNSPECIFIED(0),
        PLATFORM_ANDROID(1),
        PLATFORM_IOS(2),
        UNRECOGNIZED(-1);

        public static final int PLATFORM_ANDROID_VALUE = 1;
        public static final int PLATFORM_IOS_VALUE = 2;
        public static final int PLATFORM_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static Platform[] $values() [...] // Inlined contents

        static {
            Platform.internalValueMap = new gatewayprotocol.v1.ClientInfoOuterClass.Platform.a();
        }

        private Platform(int v1) {
            this.value = v1;
        }

        public static Platform forNumber(int v) {
            switch(v) {
                case 0: {
                    return Platform.PLATFORM_UNSPECIFIED;
                }
                case 1: {
                    return Platform.PLATFORM_ANDROID;
                }
                case 2: {
                    return Platform.PLATFORM_IOS;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == Platform.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return Platform.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.ClientInfoOuterClass.Platform.b.a;
        }

        @Deprecated
        public static Platform valueOf(int v) {
            return Platform.forNumber(v);
        }
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

