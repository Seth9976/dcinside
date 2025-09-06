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

public final class SessionCountersOuterClass {
    public static final class SessionCounters extends GeneratedMessageLite implements SessionCountersOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements SessionCountersOrBuilder {
            private Builder() {
                super(SessionCounters.DEFAULT_INSTANCE);
            }

            Builder(a sessionCountersOuterClass$a0) {
            }

            public Builder clearBannerImpressions() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearBannerImpressions();
                return this;
            }

            public Builder clearBannerLoadRequests() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearBannerLoadRequests();
                return this;
            }

            public Builder clearBannerRequestsAdm() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearBannerRequestsAdm();
                return this;
            }

            public Builder clearFocusChangeCount() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearFocusChangeCount();
                return this;
            }

            public Builder clearGlobalAdsFocusChangeCount() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearGlobalAdsFocusChangeCount();
                return this;
            }

            public Builder clearGlobalAdsFocusTime() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearGlobalAdsFocusTime();
                return this;
            }

            public Builder clearLoadRequests() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearLoadRequests();
                return this;
            }

            public Builder clearLoadRequestsAdm() {
                this.copyOnWrite();
                ((SessionCounters)this.instance).clearLoadRequestsAdm();
                return this;
            }

            @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
            public int getBannerImpressions() {
                return ((SessionCounters)this.instance).getBannerImpressions();
            }

            @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
            public int getBannerLoadRequests() {
                return ((SessionCounters)this.instance).getBannerLoadRequests();
            }

            @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
            public int getBannerRequestsAdm() {
                return ((SessionCounters)this.instance).getBannerRequestsAdm();
            }

            @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
            public int getFocusChangeCount() {
                return ((SessionCounters)this.instance).getFocusChangeCount();
            }

            @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
            public int getGlobalAdsFocusChangeCount() {
                return ((SessionCounters)this.instance).getGlobalAdsFocusChangeCount();
            }

            @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
            public int getGlobalAdsFocusTime() {
                return ((SessionCounters)this.instance).getGlobalAdsFocusTime();
            }

            @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
            public int getLoadRequests() {
                return ((SessionCounters)this.instance).getLoadRequests();
            }

            @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
            public int getLoadRequestsAdm() {
                return ((SessionCounters)this.instance).getLoadRequestsAdm();
            }

            public Builder setBannerImpressions(int v) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setBannerImpressions(v);
                return this;
            }

            public Builder setBannerLoadRequests(int v) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setBannerLoadRequests(v);
                return this;
            }

            public Builder setBannerRequestsAdm(int v) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setBannerRequestsAdm(v);
                return this;
            }

            public Builder setFocusChangeCount(int v) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setFocusChangeCount(v);
                return this;
            }

            public Builder setGlobalAdsFocusChangeCount(int v) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setGlobalAdsFocusChangeCount(v);
                return this;
            }

            public Builder setGlobalAdsFocusTime(int v) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setGlobalAdsFocusTime(v);
                return this;
            }

            public Builder setLoadRequests(int v) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setLoadRequests(v);
                return this;
            }

            public Builder setLoadRequestsAdm(int v) {
                this.copyOnWrite();
                ((SessionCounters)this.instance).setLoadRequestsAdm(v);
                return this;
            }
        }

        public static final int BANNER_IMPRESSIONS_FIELD_NUMBER = 5;
        public static final int BANNER_LOAD_REQUESTS_FIELD_NUMBER = 3;
        public static final int BANNER_REQUESTS_ADM_FIELD_NUMBER = 4;
        private static final SessionCounters DEFAULT_INSTANCE = null;
        public static final int FOCUS_CHANGE_COUNT_FIELD_NUMBER = 8;
        public static final int GLOBAL_ADS_FOCUS_CHANGE_COUNT_FIELD_NUMBER = 7;
        public static final int GLOBAL_ADS_FOCUS_TIME_FIELD_NUMBER = 6;
        public static final int LOAD_REQUESTS_ADM_FIELD_NUMBER = 2;
        public static final int LOAD_REQUESTS_FIELD_NUMBER = 1;
        private static volatile Parser PARSER;
        private int bannerImpressions_;
        private int bannerLoadRequests_;
        private int bannerRequestsAdm_;
        private int focusChangeCount_;
        private int globalAdsFocusChangeCount_;
        private int globalAdsFocusTime_;
        private int loadRequestsAdm_;
        private int loadRequests_;

        static {
            SessionCounters sessionCountersOuterClass$SessionCounters0 = new SessionCounters();
            SessionCounters.DEFAULT_INSTANCE = sessionCountersOuterClass$SessionCounters0;
            GeneratedMessageLite.registerDefaultInstance(SessionCounters.class, sessionCountersOuterClass$SessionCounters0);
        }

        private void clearBannerImpressions() {
            this.bannerImpressions_ = 0;
        }

        private void clearBannerLoadRequests() {
            this.bannerLoadRequests_ = 0;
        }

        private void clearBannerRequestsAdm() {
            this.bannerRequestsAdm_ = 0;
        }

        private void clearFocusChangeCount() {
            this.focusChangeCount_ = 0;
        }

        private void clearGlobalAdsFocusChangeCount() {
            this.globalAdsFocusChangeCount_ = 0;
        }

        private void clearGlobalAdsFocusTime() {
            this.globalAdsFocusTime_ = 0;
        }

        private void clearLoadRequests() {
            this.loadRequests_ = 0;
        }

        private void clearLoadRequestsAdm() {
            this.loadRequestsAdm_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new SessionCounters();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(SessionCounters.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004", new Object[]{"loadRequests_", "loadRequestsAdm_", "bannerLoadRequests_", "bannerRequestsAdm_", "bannerImpressions_", "globalAdsFocusTime_", "globalAdsFocusChangeCount_", "focusChangeCount_"});
                }
                case 4: {
                    return SessionCounters.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = SessionCounters.PARSER;
                    if(parser0 == null) {
                        Class class0 = SessionCounters.class;
                        synchronized(class0) {
                            parser0 = SessionCounters.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(SessionCounters.DEFAULT_INSTANCE);
                                SessionCounters.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
        public int getBannerImpressions() {
            return this.bannerImpressions_;
        }

        @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
        public int getBannerLoadRequests() {
            return this.bannerLoadRequests_;
        }

        @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
        public int getBannerRequestsAdm() {
            return this.bannerRequestsAdm_;
        }

        public static SessionCounters getDefaultInstance() {
            return SessionCounters.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
        public int getFocusChangeCount() {
            return this.focusChangeCount_;
        }

        @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
        public int getGlobalAdsFocusChangeCount() {
            return this.globalAdsFocusChangeCount_;
        }

        @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
        public int getGlobalAdsFocusTime() {
            return this.globalAdsFocusTime_;
        }

        @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
        public int getLoadRequests() {
            return this.loadRequests_;
        }

        @Override  // gatewayprotocol.v1.SessionCountersOuterClass$SessionCountersOrBuilder
        public int getLoadRequestsAdm() {
            return this.loadRequestsAdm_;
        }

        public static Builder newBuilder() {
            return (Builder)SessionCounters.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(SessionCounters sessionCountersOuterClass$SessionCounters0) {
            return (Builder)SessionCounters.DEFAULT_INSTANCE.createBuilder(sessionCountersOuterClass$SessionCounters0);
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseDelimitedFrom(SessionCounters.DEFAULT_INSTANCE, inputStream0);
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseDelimitedFrom(SessionCounters.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static SessionCounters parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom(SessionCounters.DEFAULT_INSTANCE, byteString0);
        }

        public static SessionCounters parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom(SessionCounters.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseFrom(SessionCounters.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseFrom(SessionCounters.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static SessionCounters parseFrom(InputStream inputStream0) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseFrom(SessionCounters.DEFAULT_INSTANCE, inputStream0);
        }

        public static SessionCounters parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SessionCounters)GeneratedMessageLite.parseFrom(SessionCounters.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom(SessionCounters.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom(SessionCounters.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static SessionCounters parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom(SessionCounters.DEFAULT_INSTANCE, arr_b);
        }

        public static SessionCounters parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SessionCounters)GeneratedMessageLite.parseFrom(SessionCounters.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return SessionCounters.DEFAULT_INSTANCE.getParserForType();
        }

        private void setBannerImpressions(int v) {
            this.bannerImpressions_ = v;
        }

        private void setBannerLoadRequests(int v) {
            this.bannerLoadRequests_ = v;
        }

        private void setBannerRequestsAdm(int v) {
            this.bannerRequestsAdm_ = v;
        }

        private void setFocusChangeCount(int v) {
            this.focusChangeCount_ = v;
        }

        private void setGlobalAdsFocusChangeCount(int v) {
            this.globalAdsFocusChangeCount_ = v;
        }

        private void setGlobalAdsFocusTime(int v) {
            this.globalAdsFocusTime_ = v;
        }

        private void setLoadRequests(int v) {
            this.loadRequests_ = v;
        }

        private void setLoadRequestsAdm(int v) {
            this.loadRequestsAdm_ = v;
        }
    }

    public interface SessionCountersOrBuilder extends MessageLiteOrBuilder {
        int getBannerImpressions();

        int getBannerLoadRequests();

        int getBannerRequestsAdm();

        int getFocusChangeCount();

        int getGlobalAdsFocusChangeCount();

        int getGlobalAdsFocusTime();

        int getLoadRequests();

        int getLoadRequestsAdm();
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

