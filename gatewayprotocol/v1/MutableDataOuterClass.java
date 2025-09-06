package gatewayprotocol.v1;

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

public final class MutableDataOuterClass {
    public static final class MutableData extends GeneratedMessageLite implements MutableDataOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements MutableDataOrBuilder {
            private Builder() {
                super(MutableData.DEFAULT_INSTANCE);
            }

            Builder(a mutableDataOuterClass$a0) {
            }

            public Builder clearAllowedPii() {
                this.copyOnWrite();
                ((MutableData)this.instance).clearAllowedPii();
                return this;
            }

            public Builder clearCache() {
                this.copyOnWrite();
                ((MutableData)this.instance).clearCache();
                return this;
            }

            public Builder clearCurrentState() {
                this.copyOnWrite();
                ((MutableData)this.instance).clearCurrentState();
                return this;
            }

            public Builder clearPrivacy() {
                this.copyOnWrite();
                ((MutableData)this.instance).clearPrivacy();
                return this;
            }

            public Builder clearPrivacyFsm() {
                this.copyOnWrite();
                ((MutableData)this.instance).clearPrivacyFsm();
                return this;
            }

            public Builder clearSessionCounters() {
                this.copyOnWrite();
                ((MutableData)this.instance).clearSessionCounters();
                return this;
            }

            public Builder clearSessionToken() {
                this.copyOnWrite();
                ((MutableData)this.instance).clearSessionToken();
                return this;
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public AllowedPii getAllowedPii() {
                return ((MutableData)this.instance).getAllowedPii();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public ByteString getCache() {
                return ((MutableData)this.instance).getCache();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public ByteString getCurrentState() {
                return ((MutableData)this.instance).getCurrentState();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public ByteString getPrivacy() {
                return ((MutableData)this.instance).getPrivacy();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public ByteString getPrivacyFsm() {
                return ((MutableData)this.instance).getPrivacyFsm();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public SessionCounters getSessionCounters() {
                return ((MutableData)this.instance).getSessionCounters();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public ByteString getSessionToken() {
                return ((MutableData)this.instance).getSessionToken();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public boolean hasAllowedPii() {
                return ((MutableData)this.instance).hasAllowedPii();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public boolean hasCache() {
                return ((MutableData)this.instance).hasCache();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public boolean hasCurrentState() {
                return ((MutableData)this.instance).hasCurrentState();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public boolean hasPrivacy() {
                return ((MutableData)this.instance).hasPrivacy();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public boolean hasPrivacyFsm() {
                return ((MutableData)this.instance).hasPrivacyFsm();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public boolean hasSessionCounters() {
                return ((MutableData)this.instance).hasSessionCounters();
            }

            @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
            public boolean hasSessionToken() {
                return ((MutableData)this.instance).hasSessionToken();
            }

            public Builder mergeAllowedPii(AllowedPii allowedPiiOuterClass$AllowedPii0) {
                this.copyOnWrite();
                ((MutableData)this.instance).mergeAllowedPii(allowedPiiOuterClass$AllowedPii0);
                return this;
            }

            public Builder mergeSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
                this.copyOnWrite();
                ((MutableData)this.instance).mergeSessionCounters(sessionCountersOuterClass$SessionCounters0);
                return this;
            }

            public Builder setAllowedPii(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder allowedPiiOuterClass$AllowedPii$Builder0) {
                this.copyOnWrite();
                ((MutableData)this.instance).setAllowedPii(((AllowedPii)allowedPiiOuterClass$AllowedPii$Builder0.build()));
                return this;
            }

            public Builder setAllowedPii(AllowedPii allowedPiiOuterClass$AllowedPii0) {
                this.copyOnWrite();
                ((MutableData)this.instance).setAllowedPii(allowedPiiOuterClass$AllowedPii0);
                return this;
            }

            public Builder setCache(ByteString byteString0) {
                this.copyOnWrite();
                ((MutableData)this.instance).setCache(byteString0);
                return this;
            }

            public Builder setCurrentState(ByteString byteString0) {
                this.copyOnWrite();
                ((MutableData)this.instance).setCurrentState(byteString0);
                return this;
            }

            public Builder setPrivacy(ByteString byteString0) {
                this.copyOnWrite();
                ((MutableData)this.instance).setPrivacy(byteString0);
                return this;
            }

            public Builder setPrivacyFsm(ByteString byteString0) {
                this.copyOnWrite();
                ((MutableData)this.instance).setPrivacyFsm(byteString0);
                return this;
            }

            public Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder sessionCountersOuterClass$SessionCounters$Builder0) {
                this.copyOnWrite();
                ((MutableData)this.instance).setSessionCounters(((SessionCounters)sessionCountersOuterClass$SessionCounters$Builder0.build()));
                return this;
            }

            public Builder setSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
                this.copyOnWrite();
                ((MutableData)this.instance).setSessionCounters(sessionCountersOuterClass$SessionCounters0);
                return this;
            }

            public Builder setSessionToken(ByteString byteString0) {
                this.copyOnWrite();
                ((MutableData)this.instance).setSessionToken(byteString0);
                return this;
            }
        }

        public static final int ALLOWED_PII_FIELD_NUMBER = 13;
        public static final int CACHE_FIELD_NUMBER = 14;
        public static final int CURRENT_STATE_FIELD_NUMBER = 1;
        private static final MutableData DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 11;
        public static final int PRIVACY_FSM_FIELD_NUMBER = 15;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 12;
        public static final int SESSION_TOKEN_FIELD_NUMBER = 10;
        private AllowedPii allowedPii_;
        private int bitField0_;
        private ByteString cache_;
        private ByteString currentState_;
        private ByteString privacyFsm_;
        private ByteString privacy_;
        private SessionCounters sessionCounters_;
        private ByteString sessionToken_;

        static {
            MutableData mutableDataOuterClass$MutableData0 = new MutableData();
            MutableData.DEFAULT_INSTANCE = mutableDataOuterClass$MutableData0;
            GeneratedMessageLite.registerDefaultInstance(MutableData.class, mutableDataOuterClass$MutableData0);
        }

        private MutableData() {
            this.currentState_ = ByteString.EMPTY;
            this.sessionToken_ = ByteString.EMPTY;
            this.privacy_ = ByteString.EMPTY;
            this.cache_ = ByteString.EMPTY;
            this.privacyFsm_ = ByteString.EMPTY;
        }

        private void clearAllowedPii() {
            this.allowedPii_ = null;
            this.bitField0_ &= -17;
        }

        private void clearCache() {
            this.bitField0_ &= -33;
            this.cache_ = MutableData.getDefaultInstance().getCache();
        }

        private void clearCurrentState() {
            this.bitField0_ &= -2;
            this.currentState_ = MutableData.getDefaultInstance().getCurrentState();
        }

        private void clearPrivacy() {
            this.bitField0_ &= -5;
            this.privacy_ = MutableData.getDefaultInstance().getPrivacy();
        }

        private void clearPrivacyFsm() {
            this.bitField0_ &= -65;
            this.privacyFsm_ = MutableData.getDefaultInstance().getPrivacyFsm();
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -9;
        }

        private void clearSessionToken() {
            this.bitField0_ &= -3;
            this.sessionToken_ = MutableData.getDefaultInstance().getSessionToken();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new MutableData();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(MutableData.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u000F\u0007\u0000\u0000\u0000\u0001ည\u0000\nည\u0001\u000Bည\u0002\fဉ\u0003\rဉ\u0004\u000Eည\u0005\u000Fည\u0006", new Object[]{"bitField0_", "currentState_", "sessionToken_", "privacy_", "sessionCounters_", "allowedPii_", "cache_", "privacyFsm_"});
                }
                case 4: {
                    return MutableData.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = MutableData.PARSER;
                    if(parser0 == null) {
                        Class class0 = MutableData.class;
                        synchronized(class0) {
                            parser0 = MutableData.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(MutableData.DEFAULT_INSTANCE);
                                MutableData.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public AllowedPii getAllowedPii() {
            return this.allowedPii_ == null ? AllowedPii.getDefaultInstance() : this.allowedPii_;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public ByteString getCache() {
            return this.cache_;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public ByteString getCurrentState() {
            return this.currentState_;
        }

        public static MutableData getDefaultInstance() {
            return MutableData.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public ByteString getPrivacy() {
            return this.privacy_;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public ByteString getPrivacyFsm() {
            return this.privacyFsm_;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public SessionCounters getSessionCounters() {
            return this.sessionCounters_ == null ? SessionCounters.getDefaultInstance() : this.sessionCounters_;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public ByteString getSessionToken() {
            return this.sessionToken_;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public boolean hasAllowedPii() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public boolean hasCache() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public boolean hasCurrentState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public boolean hasPrivacy() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public boolean hasPrivacyFsm() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public boolean hasSessionCounters() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.MutableDataOuterClass$MutableDataOrBuilder
        public boolean hasSessionToken() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeAllowedPii(AllowedPii allowedPiiOuterClass$AllowedPii0) {
            allowedPiiOuterClass$AllowedPii0.getClass();
            this.allowedPii_ = this.allowedPii_ == null || this.allowedPii_ == AllowedPii.getDefaultInstance() ? allowedPiiOuterClass$AllowedPii0 : ((AllowedPii)((gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder)AllowedPii.newBuilder(this.allowedPii_).mergeFrom(allowedPiiOuterClass$AllowedPii0)).buildPartial());
            this.bitField0_ |= 16;
        }

        private void mergeSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
            sessionCountersOuterClass$SessionCounters0.getClass();
            this.sessionCounters_ = this.sessionCounters_ == null || this.sessionCounters_ == SessionCounters.getDefaultInstance() ? sessionCountersOuterClass$SessionCounters0 : ((SessionCounters)((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCountersOuterClass$SessionCounters0)).buildPartial());
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder)MutableData.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MutableData mutableDataOuterClass$MutableData0) {
            return (Builder)MutableData.DEFAULT_INSTANCE.createBuilder(mutableDataOuterClass$MutableData0);
        }

        public static MutableData parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (MutableData)GeneratedMessageLite.parseDelimitedFrom(MutableData.DEFAULT_INSTANCE, inputStream0);
        }

        public static MutableData parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MutableData)GeneratedMessageLite.parseDelimitedFrom(MutableData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static MutableData parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (MutableData)GeneratedMessageLite.parseFrom(MutableData.DEFAULT_INSTANCE, byteString0);
        }

        public static MutableData parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MutableData)GeneratedMessageLite.parseFrom(MutableData.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static MutableData parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (MutableData)GeneratedMessageLite.parseFrom(MutableData.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static MutableData parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MutableData)GeneratedMessageLite.parseFrom(MutableData.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static MutableData parseFrom(InputStream inputStream0) throws IOException {
            return (MutableData)GeneratedMessageLite.parseFrom(MutableData.DEFAULT_INSTANCE, inputStream0);
        }

        public static MutableData parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MutableData)GeneratedMessageLite.parseFrom(MutableData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static MutableData parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (MutableData)GeneratedMessageLite.parseFrom(MutableData.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static MutableData parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MutableData)GeneratedMessageLite.parseFrom(MutableData.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static MutableData parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (MutableData)GeneratedMessageLite.parseFrom(MutableData.DEFAULT_INSTANCE, arr_b);
        }

        public static MutableData parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MutableData)GeneratedMessageLite.parseFrom(MutableData.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return MutableData.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAllowedPii(AllowedPii allowedPiiOuterClass$AllowedPii0) {
            allowedPiiOuterClass$AllowedPii0.getClass();
            this.allowedPii_ = allowedPiiOuterClass$AllowedPii0;
            this.bitField0_ |= 16;
        }

        private void setCache(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 0x20;
            this.cache_ = byteString0;
        }

        private void setCurrentState(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 1;
            this.currentState_ = byteString0;
        }

        private void setPrivacy(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 4;
            this.privacy_ = byteString0;
        }

        private void setPrivacyFsm(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 0x40;
            this.privacyFsm_ = byteString0;
        }

        private void setSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
            sessionCountersOuterClass$SessionCounters0.getClass();
            this.sessionCounters_ = sessionCountersOuterClass$SessionCounters0;
            this.bitField0_ |= 8;
        }

        private void setSessionToken(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 2;
            this.sessionToken_ = byteString0;
        }
    }

    public interface MutableDataOrBuilder extends MessageLiteOrBuilder {
        AllowedPii getAllowedPii();

        ByteString getCache();

        ByteString getCurrentState();

        ByteString getPrivacy();

        ByteString getPrivacyFsm();

        SessionCounters getSessionCounters();

        ByteString getSessionToken();

        boolean hasAllowedPii();

        boolean hasCache();

        boolean hasCurrentState();

        boolean hasPrivacy();

        boolean hasPrivacyFsm();

        boolean hasSessionCounters();

        boolean hasSessionToken();
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

