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

public final class TestDataOuterClass {
    public static final class TestData extends GeneratedMessageLite implements TestDataOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements TestDataOrBuilder {
            private Builder() {
                super(TestData.DEFAULT_INSTANCE);
            }

            Builder(a testDataOuterClass$a0) {
            }

            public Builder clearForceCampaignId() {
                this.copyOnWrite();
                ((TestData)this.instance).clearForceCampaignId();
                return this;
            }

            public Builder clearForceCountry() {
                this.copyOnWrite();
                ((TestData)this.instance).clearForceCountry();
                return this;
            }

            public Builder clearForceCountrySubdivision() {
                this.copyOnWrite();
                ((TestData)this.instance).clearForceCountrySubdivision();
                return this;
            }

            public Builder clearForceExchangeTestMode() {
                this.copyOnWrite();
                ((TestData)this.instance).clearForceExchangeTestMode();
                return this;
            }

            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public String getForceCampaignId() {
                return ((TestData)this.instance).getForceCampaignId();
            }

            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public ByteString getForceCampaignIdBytes() {
                return ((TestData)this.instance).getForceCampaignIdBytes();
            }

            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public String getForceCountry() {
                return ((TestData)this.instance).getForceCountry();
            }

            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public ByteString getForceCountryBytes() {
                return ((TestData)this.instance).getForceCountryBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public String getForceCountrySubdivision() {
                return "";
            }

            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public ByteString getForceCountrySubdivisionBytes() {
                return ((TestData)this.instance).getForceCountrySubdivisionBytes();
            }

            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public int getForceExchangeTestMode() {
                return ((TestData)this.instance).getForceExchangeTestMode();
            }

            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public boolean hasForceCampaignId() {
                return ((TestData)this.instance).hasForceCampaignId();
            }

            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public boolean hasForceCountry() {
                return ((TestData)this.instance).hasForceCountry();
            }

            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public boolean hasForceCountrySubdivision() {
                return ((TestData)this.instance).hasForceCountrySubdivision();
            }

            @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
            public boolean hasForceExchangeTestMode() {
                return ((TestData)this.instance).hasForceExchangeTestMode();
            }

            public Builder setForceCampaignId(String s) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCampaignId(s);
                return this;
            }

            public Builder setForceCampaignIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCampaignIdBytes(byteString0);
                return this;
            }

            public Builder setForceCountry(String s) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCountry(s);
                return this;
            }

            public Builder setForceCountryBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCountryBytes(byteString0);
                return this;
            }

            public Builder setForceCountrySubdivision(String s) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCountrySubdivision(s);
                return this;
            }

            public Builder setForceCountrySubdivisionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceCountrySubdivisionBytes(byteString0);
                return this;
            }

            public Builder setForceExchangeTestMode(int v) {
                this.copyOnWrite();
                ((TestData)this.instance).setForceExchangeTestMode(v);
                return this;
            }
        }

        private static final TestData DEFAULT_INSTANCE = null;
        public static final int FORCE_CAMPAIGN_ID_FIELD_NUMBER = 1;
        public static final int FORCE_COUNTRY_FIELD_NUMBER = 2;
        public static final int FORCE_COUNTRY_SUBDIVISION_FIELD_NUMBER = 3;
        public static final int FORCE_EXCHANGE_TEST_MODE_FIELD_NUMBER = 4;
        private static volatile Parser PARSER;
        private int bitField0_;
        private String forceCampaignId_;
        private String forceCountrySubdivision_;
        private String forceCountry_;
        private int forceExchangeTestMode_;

        static {
            TestData testDataOuterClass$TestData0 = new TestData();
            TestData.DEFAULT_INSTANCE = testDataOuterClass$TestData0;
            GeneratedMessageLite.registerDefaultInstance(TestData.class, testDataOuterClass$TestData0);
        }

        private TestData() {
            this.forceCampaignId_ = "";
            this.forceCountry_ = "";
            this.forceCountrySubdivision_ = "";
        }

        private void clearForceCampaignId() {
            this.bitField0_ &= -2;
            this.forceCampaignId_ = "";
        }

        private void clearForceCountry() {
            this.bitField0_ &= -3;
            this.forceCountry_ = "";
        }

        private void clearForceCountrySubdivision() {
            this.bitField0_ &= -5;
            this.forceCountrySubdivision_ = "";
        }

        private void clearForceExchangeTestMode() {
            this.bitField0_ &= -9;
            this.forceExchangeTestMode_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new TestData();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(TestData.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "forceCampaignId_", "forceCountry_", "forceCountrySubdivision_", "forceExchangeTestMode_"});
                }
                case 4: {
                    return TestData.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = TestData.PARSER;
                    if(parser0 == null) {
                        Class class0 = TestData.class;
                        synchronized(class0) {
                            parser0 = TestData.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(TestData.DEFAULT_INSTANCE);
                                TestData.PARSER = parser0;
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

        public static TestData getDefaultInstance() {
            return TestData.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public String getForceCampaignId() {
            return this.forceCampaignId_;
        }

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public ByteString getForceCampaignIdBytes() {
            return ByteString.copyFromUtf8(this.forceCampaignId_);
        }

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public String getForceCountry() {
            return this.forceCountry_;
        }

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public ByteString getForceCountryBytes() {
            return ByteString.copyFromUtf8(this.forceCountry_);
        }

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public String getForceCountrySubdivision() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public ByteString getForceCountrySubdivisionBytes() {
            return ByteString.copyFromUtf8(this.forceCountrySubdivision_);
        }

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public int getForceExchangeTestMode() {
            return this.forceExchangeTestMode_;
        }

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public boolean hasForceCampaignId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public boolean hasForceCountry() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public boolean hasForceCountrySubdivision() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.TestDataOuterClass$TestDataOrBuilder
        public boolean hasForceExchangeTestMode() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder() {
            return (Builder)TestData.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TestData testDataOuterClass$TestData0) {
            return (Builder)TestData.DEFAULT_INSTANCE.createBuilder(testDataOuterClass$TestData0);
        }

        public static TestData parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (TestData)GeneratedMessageLite.parseDelimitedFrom(TestData.DEFAULT_INSTANCE, inputStream0);
        }

        public static TestData parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TestData)GeneratedMessageLite.parseDelimitedFrom(TestData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static TestData parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom(TestData.DEFAULT_INSTANCE, byteString0);
        }

        public static TestData parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom(TestData.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static TestData parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (TestData)GeneratedMessageLite.parseFrom(TestData.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static TestData parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TestData)GeneratedMessageLite.parseFrom(TestData.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static TestData parseFrom(InputStream inputStream0) throws IOException {
            return (TestData)GeneratedMessageLite.parseFrom(TestData.DEFAULT_INSTANCE, inputStream0);
        }

        public static TestData parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TestData)GeneratedMessageLite.parseFrom(TestData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static TestData parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom(TestData.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static TestData parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom(TestData.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static TestData parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom(TestData.DEFAULT_INSTANCE, arr_b);
        }

        public static TestData parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TestData)GeneratedMessageLite.parseFrom(TestData.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return TestData.DEFAULT_INSTANCE.getParserForType();
        }

        private void setForceCampaignId(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.forceCampaignId_ = s;
        }

        private void setForceCampaignIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.forceCampaignId_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setForceCountry(String s) {
            s.getClass();
            this.bitField0_ |= 2;
            this.forceCountry_ = s;
        }

        private void setForceCountryBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.forceCountry_ = byteString0.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setForceCountrySubdivision(String s) {
            s.getClass();
            this.bitField0_ |= 4;
            this.forceCountrySubdivision_ = s;
        }

        private void setForceCountrySubdivisionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.forceCountrySubdivision_ = byteString0.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setForceExchangeTestMode(int v) {
            this.bitField0_ |= 8;
            this.forceExchangeTestMode_ = v;
        }
    }

    public interface TestDataOrBuilder extends MessageLiteOrBuilder {
        String getForceCampaignId();

        ByteString getForceCampaignIdBytes();

        String getForceCountry();

        ByteString getForceCountryBytes();

        String getForceCountrySubdivision();

        ByteString getForceCountrySubdivisionBytes();

        int getForceExchangeTestMode();

        boolean hasForceCampaignId();

        boolean hasForceCountry();

        boolean hasForceCountrySubdivision();

        boolean hasForceExchangeTestMode();
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

