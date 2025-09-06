package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.IntList;
import com.google.protobuf.Internal.ListAdapter.Converter;
import com.google.protobuf.Internal.ListAdapter;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class NativeConfigurationOuterClass {
    public static final class AdOperationsConfiguration extends GeneratedMessageLite implements AdOperationsConfigurationOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AdOperationsConfigurationOrBuilder {
            private Builder() {
                super(AdOperationsConfiguration.DEFAULT_INSTANCE);
            }

            Builder(a nativeConfigurationOuterClass$a0) {
            }

            public Builder clearGetTokenTimeoutMs() {
                this.copyOnWrite();
                ((AdOperationsConfiguration)this.instance).clearGetTokenTimeoutMs();
                return this;
            }

            public Builder clearLoadTimeoutMs() {
                this.copyOnWrite();
                ((AdOperationsConfiguration)this.instance).clearLoadTimeoutMs();
                return this;
            }

            public Builder clearShowTimeoutMs() {
                this.copyOnWrite();
                ((AdOperationsConfiguration)this.instance).clearShowTimeoutMs();
                return this;
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfigurationOrBuilder
            public int getGetTokenTimeoutMs() {
                return ((AdOperationsConfiguration)this.instance).getGetTokenTimeoutMs();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfigurationOrBuilder
            public int getLoadTimeoutMs() {
                return ((AdOperationsConfiguration)this.instance).getLoadTimeoutMs();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfigurationOrBuilder
            public int getShowTimeoutMs() {
                return ((AdOperationsConfiguration)this.instance).getShowTimeoutMs();
            }

            public Builder setGetTokenTimeoutMs(int v) {
                this.copyOnWrite();
                ((AdOperationsConfiguration)this.instance).setGetTokenTimeoutMs(v);
                return this;
            }

            public Builder setLoadTimeoutMs(int v) {
                this.copyOnWrite();
                ((AdOperationsConfiguration)this.instance).setLoadTimeoutMs(v);
                return this;
            }

            public Builder setShowTimeoutMs(int v) {
                this.copyOnWrite();
                ((AdOperationsConfiguration)this.instance).setShowTimeoutMs(v);
                return this;
            }
        }

        private static final AdOperationsConfiguration DEFAULT_INSTANCE = null;
        public static final int GET_TOKEN_TIMEOUT_MS_FIELD_NUMBER = 3;
        public static final int LOAD_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int SHOW_TIMEOUT_MS_FIELD_NUMBER = 2;
        private int getTokenTimeoutMs_;
        private int loadTimeoutMs_;
        private int showTimeoutMs_;

        static {
            AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration0 = new AdOperationsConfiguration();
            AdOperationsConfiguration.DEFAULT_INSTANCE = nativeConfigurationOuterClass$AdOperationsConfiguration0;
            GeneratedMessageLite.registerDefaultInstance(AdOperationsConfiguration.class, nativeConfigurationOuterClass$AdOperationsConfiguration0);
        }

        private void clearGetTokenTimeoutMs() {
            this.getTokenTimeoutMs_ = 0;
        }

        private void clearLoadTimeoutMs() {
            this.loadTimeoutMs_ = 0;
        }

        private void clearShowTimeoutMs() {
            this.showTimeoutMs_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new AdOperationsConfiguration();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(AdOperationsConfiguration.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"loadTimeoutMs_", "showTimeoutMs_", "getTokenTimeoutMs_"});
                }
                case 4: {
                    return AdOperationsConfiguration.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = AdOperationsConfiguration.PARSER;
                    if(parser0 == null) {
                        Class class0 = AdOperationsConfiguration.class;
                        synchronized(class0) {
                            parser0 = AdOperationsConfiguration.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(AdOperationsConfiguration.DEFAULT_INSTANCE);
                                AdOperationsConfiguration.PARSER = parser0;
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

        public static AdOperationsConfiguration getDefaultInstance() {
            return AdOperationsConfiguration.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfigurationOrBuilder
        public int getGetTokenTimeoutMs() {
            return this.getTokenTimeoutMs_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfigurationOrBuilder
        public int getLoadTimeoutMs() {
            return this.loadTimeoutMs_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfigurationOrBuilder
        public int getShowTimeoutMs() {
            return this.showTimeoutMs_;
        }

        public static Builder newBuilder() {
            return (Builder)AdOperationsConfiguration.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration0) {
            return (Builder)AdOperationsConfiguration.DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$AdOperationsConfiguration0);
        }

        public static AdOperationsConfiguration parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseDelimitedFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdOperationsConfiguration parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseDelimitedFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdOperationsConfiguration parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, byteString0);
        }

        public static AdOperationsConfiguration parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static AdOperationsConfiguration parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static AdOperationsConfiguration parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static AdOperationsConfiguration parseFrom(InputStream inputStream0) throws IOException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdOperationsConfiguration parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdOperationsConfiguration parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static AdOperationsConfiguration parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static AdOperationsConfiguration parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, arr_b);
        }

        public static AdOperationsConfiguration parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration)GeneratedMessageLite.parseFrom(AdOperationsConfiguration.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return AdOperationsConfiguration.DEFAULT_INSTANCE.getParserForType();
        }

        private void setGetTokenTimeoutMs(int v) {
            this.getTokenTimeoutMs_ = v;
        }

        private void setLoadTimeoutMs(int v) {
            this.loadTimeoutMs_ = v;
        }

        private void setShowTimeoutMs(int v) {
            this.showTimeoutMs_ = v;
        }
    }

    public interface AdOperationsConfigurationOrBuilder extends MessageLiteOrBuilder {
        int getGetTokenTimeoutMs();

        int getLoadTimeoutMs();

        int getShowTimeoutMs();
    }

    public static final class CachedAssetsConfiguration extends GeneratedMessageLite implements CachedAssetsConfigurationOrBuilder {
        public static final class gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements CachedAssetsConfigurationOrBuilder {
            private gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder() {
                super(CachedAssetsConfiguration.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder(a nativeConfigurationOuterClass$a0) {
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder clearMaxCachedAssetAgeMs() {
                this.copyOnWrite();
                ((CachedAssetsConfiguration)this.instance).clearMaxCachedAssetAgeMs();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder clearMaxCachedAssetSizeMb() {
                this.copyOnWrite();
                ((CachedAssetsConfiguration)this.instance).clearMaxCachedAssetSizeMb();
                return this;
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$CachedAssetsConfigurationOrBuilder
            public long getMaxCachedAssetAgeMs() {
                return ((CachedAssetsConfiguration)this.instance).getMaxCachedAssetAgeMs();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$CachedAssetsConfigurationOrBuilder
            public int getMaxCachedAssetSizeMb() {
                return ((CachedAssetsConfiguration)this.instance).getMaxCachedAssetSizeMb();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder setMaxCachedAssetAgeMs(long v) {
                this.copyOnWrite();
                ((CachedAssetsConfiguration)this.instance).setMaxCachedAssetAgeMs(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder setMaxCachedAssetSizeMb(int v) {
                this.copyOnWrite();
                ((CachedAssetsConfiguration)this.instance).setMaxCachedAssetSizeMb(v);
                return this;
            }
        }

        private static final CachedAssetsConfiguration DEFAULT_INSTANCE = null;
        public static final int MAX_CACHED_ASSET_AGE_MS_FIELD_NUMBER = 1;
        public static final int MAX_CACHED_ASSET_SIZE_MB_FIELD_NUMBER = 2;
        private static volatile Parser PARSER;
        private long maxCachedAssetAgeMs_;
        private int maxCachedAssetSizeMb_;

        static {
            CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0 = new CachedAssetsConfiguration();
            CachedAssetsConfiguration.DEFAULT_INSTANCE = nativeConfigurationOuterClass$CachedAssetsConfiguration0;
            GeneratedMessageLite.registerDefaultInstance(CachedAssetsConfiguration.class, nativeConfigurationOuterClass$CachedAssetsConfiguration0);
        }

        private void clearMaxCachedAssetAgeMs() {
            this.maxCachedAssetAgeMs_ = 0L;
        }

        private void clearMaxCachedAssetSizeMb() {
            this.maxCachedAssetSizeMb_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new CachedAssetsConfiguration();
                }
                case 2: {
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(CachedAssetsConfiguration.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"maxCachedAssetAgeMs_", "maxCachedAssetSizeMb_"});
                }
                case 4: {
                    return CachedAssetsConfiguration.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = CachedAssetsConfiguration.PARSER;
                    if(parser0 == null) {
                        Class class0 = CachedAssetsConfiguration.class;
                        synchronized(class0) {
                            parser0 = CachedAssetsConfiguration.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(CachedAssetsConfiguration.DEFAULT_INSTANCE);
                                CachedAssetsConfiguration.PARSER = parser0;
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

        public static CachedAssetsConfiguration getDefaultInstance() {
            return CachedAssetsConfiguration.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$CachedAssetsConfigurationOrBuilder
        public long getMaxCachedAssetAgeMs() {
            return this.maxCachedAssetAgeMs_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$CachedAssetsConfigurationOrBuilder
        public int getMaxCachedAssetSizeMb() {
            return this.maxCachedAssetSizeMb_;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder newBuilder() {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder)CachedAssetsConfiguration.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder newBuilder(CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0) {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder)CachedAssetsConfiguration.DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$CachedAssetsConfiguration0);
        }

        public static CachedAssetsConfiguration parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseDelimitedFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, inputStream0);
        }

        public static CachedAssetsConfiguration parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseDelimitedFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static CachedAssetsConfiguration parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, byteString0);
        }

        public static CachedAssetsConfiguration parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static CachedAssetsConfiguration parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static CachedAssetsConfiguration parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static CachedAssetsConfiguration parseFrom(InputStream inputStream0) throws IOException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, inputStream0);
        }

        public static CachedAssetsConfiguration parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static CachedAssetsConfiguration parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static CachedAssetsConfiguration parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static CachedAssetsConfiguration parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, arr_b);
        }

        public static CachedAssetsConfiguration parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration)GeneratedMessageLite.parseFrom(CachedAssetsConfiguration.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return CachedAssetsConfiguration.DEFAULT_INSTANCE.getParserForType();
        }

        private void setMaxCachedAssetAgeMs(long v) {
            this.maxCachedAssetAgeMs_ = v;
        }

        private void setMaxCachedAssetSizeMb(int v) {
            this.maxCachedAssetSizeMb_ = v;
        }
    }

    public interface CachedAssetsConfigurationOrBuilder extends MessageLiteOrBuilder {
        long getMaxCachedAssetAgeMs();

        int getMaxCachedAssetSizeMb();
    }

    public static final class DiagnosticEventsConfiguration extends GeneratedMessageLite implements DiagnosticEventsConfigurationOrBuilder {
        public static final class gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements DiagnosticEventsConfigurationOrBuilder {
            private gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder() {
                super(DiagnosticEventsConfiguration.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder(a nativeConfigurationOuterClass$a0) {
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllAllowedEvents(Iterable iterable0) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).addAllAllowedEvents(iterable0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllAllowedEventsValue(Iterable iterable0) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).addAllAllowedEventsValue(iterable0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllBlockedEvents(Iterable iterable0) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).addAllBlockedEvents(iterable0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllBlockedEventsValue(Iterable iterable0) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).addAllBlockedEventsValue(iterable0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllowedEvents(DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).addAllowedEvents(diagnosticEventRequestOuterClass$DiagnosticEventType0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addAllowedEventsValue(int v) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).addAllowedEventsValue(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addBlockedEvents(DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).addBlockedEvents(diagnosticEventRequestOuterClass$DiagnosticEventType0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder addBlockedEventsValue(int v) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).addBlockedEventsValue(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearAllowedEvents() {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).clearAllowedEvents();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearBlockedEvents() {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).clearBlockedEvents();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearEnabled() {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).clearEnabled();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearMaxBatchIntervalMs() {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).clearMaxBatchIntervalMs();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearMaxBatchSize() {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).clearMaxBatchSize();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearSeverity() {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).clearSeverity();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder clearTtmEnabled() {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).clearTtmEnabled();
                return this;
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public DiagnosticEventType getAllowedEvents(int v) {
                return ((DiagnosticEventsConfiguration)this.instance).getAllowedEvents(v);
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public int getAllowedEventsCount() {
                return ((DiagnosticEventsConfiguration)this.instance).getAllowedEventsCount();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public List getAllowedEventsList() {
                return ((DiagnosticEventsConfiguration)this.instance).getAllowedEventsList();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public int getAllowedEventsValue(int v) {
                return ((DiagnosticEventsConfiguration)this.instance).getAllowedEventsValue(v);
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public List getAllowedEventsValueList() {
                return DesugarCollections.unmodifiableList(((DiagnosticEventsConfiguration)this.instance).getAllowedEventsValueList());
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public DiagnosticEventType getBlockedEvents(int v) {
                return ((DiagnosticEventsConfiguration)this.instance).getBlockedEvents(v);
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public int getBlockedEventsCount() {
                return ((DiagnosticEventsConfiguration)this.instance).getBlockedEventsCount();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public List getBlockedEventsList() {
                return ((DiagnosticEventsConfiguration)this.instance).getBlockedEventsList();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public int getBlockedEventsValue(int v) {
                return ((DiagnosticEventsConfiguration)this.instance).getBlockedEventsValue(v);
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public List getBlockedEventsValueList() {
                return DesugarCollections.unmodifiableList(((DiagnosticEventsConfiguration)this.instance).getBlockedEventsValueList());
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public boolean getEnabled() {
                return ((DiagnosticEventsConfiguration)this.instance).getEnabled();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public int getMaxBatchIntervalMs() {
                return ((DiagnosticEventsConfiguration)this.instance).getMaxBatchIntervalMs();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public int getMaxBatchSize() {
                return ((DiagnosticEventsConfiguration)this.instance).getMaxBatchSize();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public DiagnosticEventsSeverity getSeverity() {
                return ((DiagnosticEventsConfiguration)this.instance).getSeverity();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public int getSeverityValue() {
                return ((DiagnosticEventsConfiguration)this.instance).getSeverityValue();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
            public boolean getTtmEnabled() {
                return ((DiagnosticEventsConfiguration)this.instance).getTtmEnabled();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setAllowedEvents(int v, DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).setAllowedEvents(v, diagnosticEventRequestOuterClass$DiagnosticEventType0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setAllowedEventsValue(int v, int v1) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).setAllowedEventsValue(v, v1);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setBlockedEvents(int v, DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).setBlockedEvents(v, diagnosticEventRequestOuterClass$DiagnosticEventType0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setBlockedEventsValue(int v, int v1) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).setBlockedEventsValue(v, v1);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setEnabled(boolean z) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).setEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setMaxBatchIntervalMs(int v) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).setMaxBatchIntervalMs(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setMaxBatchSize(int v) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).setMaxBatchSize(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setSeverity(DiagnosticEventsSeverity diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).setSeverity(diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setSeverityValue(int v) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).setSeverityValue(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder setTtmEnabled(boolean z) {
                this.copyOnWrite();
                ((DiagnosticEventsConfiguration)this.instance).setTtmEnabled(z);
                return this;
            }
        }

        class gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.a implements Converter {
            gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.a() {
                super();
            }

            public DiagnosticEventType a(Integer integer0) {
                DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0 = DiagnosticEventType.forNumber(((int)integer0));
                return diagnosticEventRequestOuterClass$DiagnosticEventType0 == null ? DiagnosticEventType.UNRECOGNIZED : diagnosticEventRequestOuterClass$DiagnosticEventType0;
            }

            @Override  // com.google.protobuf.Internal$ListAdapter$Converter
            public Object convert(Object object0) {
                return this.a(((Integer)object0));
            }
        }

        class b implements Converter {
            b() {
                super();
            }

            public DiagnosticEventType a(Integer integer0) {
                DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0 = DiagnosticEventType.forNumber(((int)integer0));
                return diagnosticEventRequestOuterClass$DiagnosticEventType0 == null ? DiagnosticEventType.UNRECOGNIZED : diagnosticEventRequestOuterClass$DiagnosticEventType0;
            }

            @Override  // com.google.protobuf.Internal$ListAdapter$Converter
            public Object convert(Object object0) {
                return this.a(((Integer)object0));
            }
        }

        public static final int ALLOWED_EVENTS_FIELD_NUMBER = 6;
        public static final int BLOCKED_EVENTS_FIELD_NUMBER = 7;
        private static final DiagnosticEventsConfiguration DEFAULT_INSTANCE = null;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAX_BATCH_INTERVAL_MS_FIELD_NUMBER = 3;
        public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int SEVERITY_FIELD_NUMBER = 5;
        public static final int TTM_ENABLED_FIELD_NUMBER = 4;
        private int allowedEventsMemoizedSerializedSize;
        private IntList allowedEvents_;
        private static final Converter allowedEvents_converter_;
        private int blockedEventsMemoizedSerializedSize;
        private IntList blockedEvents_;
        private static final Converter blockedEvents_converter_;
        private boolean enabled_;
        private int maxBatchIntervalMs_;
        private int maxBatchSize_;
        private int severity_;
        private boolean ttmEnabled_;

        static {
            DiagnosticEventsConfiguration.allowedEvents_converter_ = new gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.a();
            DiagnosticEventsConfiguration.blockedEvents_converter_ = new b();
            DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0 = new DiagnosticEventsConfiguration();
            DiagnosticEventsConfiguration.DEFAULT_INSTANCE = nativeConfigurationOuterClass$DiagnosticEventsConfiguration0;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEventsConfiguration.class, nativeConfigurationOuterClass$DiagnosticEventsConfiguration0);
        }

        private DiagnosticEventsConfiguration() {
            this.allowedEvents_ = GeneratedMessageLite.emptyIntList();
            this.blockedEvents_ = GeneratedMessageLite.emptyIntList();
        }

        private void addAllAllowedEvents(Iterable iterable0) {
            this.ensureAllowedEventsIsMutable();
            for(Object object0: iterable0) {
                this.allowedEvents_.addInt(((DiagnosticEventType)object0).getNumber());
            }
        }

        private void addAllAllowedEventsValue(Iterable iterable0) {
            this.ensureAllowedEventsIsMutable();
            for(Object object0: iterable0) {
                this.allowedEvents_.addInt(((int)(((Integer)object0))));
            }
        }

        private void addAllBlockedEvents(Iterable iterable0) {
            this.ensureBlockedEventsIsMutable();
            for(Object object0: iterable0) {
                this.blockedEvents_.addInt(((DiagnosticEventType)object0).getNumber());
            }
        }

        private void addAllBlockedEventsValue(Iterable iterable0) {
            this.ensureBlockedEventsIsMutable();
            for(Object object0: iterable0) {
                this.blockedEvents_.addInt(((int)(((Integer)object0))));
            }
        }

        private void addAllowedEvents(DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            diagnosticEventRequestOuterClass$DiagnosticEventType0.getClass();
            this.ensureAllowedEventsIsMutable();
            this.allowedEvents_.addInt(diagnosticEventRequestOuterClass$DiagnosticEventType0.getNumber());
        }

        private void addAllowedEventsValue(int v) {
            this.ensureAllowedEventsIsMutable();
            this.allowedEvents_.addInt(v);
        }

        private void addBlockedEvents(DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            diagnosticEventRequestOuterClass$DiagnosticEventType0.getClass();
            this.ensureBlockedEventsIsMutable();
            this.blockedEvents_.addInt(diagnosticEventRequestOuterClass$DiagnosticEventType0.getNumber());
        }

        private void addBlockedEventsValue(int v) {
            this.ensureBlockedEventsIsMutable();
            this.blockedEvents_.addInt(v);
        }

        private void clearAllowedEvents() {
            this.allowedEvents_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearBlockedEvents() {
            this.blockedEvents_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearEnabled() {
            this.enabled_ = false;
        }

        private void clearMaxBatchIntervalMs() {
            this.maxBatchIntervalMs_ = 0;
        }

        private void clearMaxBatchSize() {
            this.maxBatchSize_ = 0;
        }

        private void clearSeverity() {
            this.severity_ = 0;
        }

        private void clearTtmEnabled() {
            this.ttmEnabled_ = false;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new DiagnosticEventsConfiguration();
                }
                case 2: {
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006,\u0007,", new Object[]{"enabled_", "maxBatchSize_", "maxBatchIntervalMs_", "ttmEnabled_", "severity_", "allowedEvents_", "blockedEvents_"});
                }
                case 4: {
                    return DiagnosticEventsConfiguration.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = DiagnosticEventsConfiguration.PARSER;
                    if(parser0 == null) {
                        Class class0 = DiagnosticEventsConfiguration.class;
                        synchronized(class0) {
                            parser0 = DiagnosticEventsConfiguration.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(DiagnosticEventsConfiguration.DEFAULT_INSTANCE);
                                DiagnosticEventsConfiguration.PARSER = parser0;
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

        private void ensureAllowedEventsIsMutable() {
            IntList internal$IntList0 = this.allowedEvents_;
            if(!internal$IntList0.isModifiable()) {
                this.allowedEvents_ = GeneratedMessageLite.mutableCopy(internal$IntList0);
            }
        }

        private void ensureBlockedEventsIsMutable() {
            IntList internal$IntList0 = this.blockedEvents_;
            if(!internal$IntList0.isModifiable()) {
                this.blockedEvents_ = GeneratedMessageLite.mutableCopy(internal$IntList0);
            }
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public DiagnosticEventType getAllowedEvents(int v) {
            DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0 = DiagnosticEventType.forNumber(this.allowedEvents_.getInt(v));
            return diagnosticEventRequestOuterClass$DiagnosticEventType0 == null ? DiagnosticEventType.UNRECOGNIZED : diagnosticEventRequestOuterClass$DiagnosticEventType0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public int getAllowedEventsCount() {
            return this.allowedEvents_.size();
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public List getAllowedEventsList() {
            return new ListAdapter(this.allowedEvents_, DiagnosticEventsConfiguration.allowedEvents_converter_);
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public int getAllowedEventsValue(int v) {
            return this.allowedEvents_.getInt(v);
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public List getAllowedEventsValueList() {
            return this.allowedEvents_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public DiagnosticEventType getBlockedEvents(int v) {
            DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0 = DiagnosticEventType.forNumber(this.blockedEvents_.getInt(v));
            return diagnosticEventRequestOuterClass$DiagnosticEventType0 == null ? DiagnosticEventType.UNRECOGNIZED : diagnosticEventRequestOuterClass$DiagnosticEventType0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public int getBlockedEventsCount() {
            return this.blockedEvents_.size();
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public List getBlockedEventsList() {
            return new ListAdapter(this.blockedEvents_, DiagnosticEventsConfiguration.blockedEvents_converter_);
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public int getBlockedEventsValue(int v) {
            return this.blockedEvents_.getInt(v);
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public List getBlockedEventsValueList() {
            return this.blockedEvents_;
        }

        public static DiagnosticEventsConfiguration getDefaultInstance() {
            return DiagnosticEventsConfiguration.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public int getMaxBatchIntervalMs() {
            return this.maxBatchIntervalMs_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public int getMaxBatchSize() {
            return this.maxBatchSize_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public DiagnosticEventsSeverity getSeverity() {
            DiagnosticEventsSeverity diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0 = DiagnosticEventsSeverity.forNumber(this.severity_);
            return diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0 == null ? DiagnosticEventsSeverity.UNRECOGNIZED : diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public int getSeverityValue() {
            return this.severity_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
        public boolean getTtmEnabled() {
            return this.ttmEnabled_;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder() {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder)DiagnosticEventsConfiguration.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder(DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0) {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder)DiagnosticEventsConfiguration.DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0);
        }

        public static DiagnosticEventsConfiguration parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseDelimitedFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, inputStream0);
        }

        public static DiagnosticEventsConfiguration parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseDelimitedFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, byteString0);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static DiagnosticEventsConfiguration parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static DiagnosticEventsConfiguration parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static DiagnosticEventsConfiguration parseFrom(InputStream inputStream0) throws IOException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, inputStream0);
        }

        public static DiagnosticEventsConfiguration parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static DiagnosticEventsConfiguration parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, arr_b);
        }

        public static DiagnosticEventsConfiguration parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration)GeneratedMessageLite.parseFrom(DiagnosticEventsConfiguration.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return DiagnosticEventsConfiguration.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAllowedEvents(int v, DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            diagnosticEventRequestOuterClass$DiagnosticEventType0.getClass();
            this.ensureAllowedEventsIsMutable();
            this.allowedEvents_.setInt(v, diagnosticEventRequestOuterClass$DiagnosticEventType0.getNumber());
        }

        private void setAllowedEventsValue(int v, int v1) {
            this.ensureAllowedEventsIsMutable();
            this.allowedEvents_.setInt(v, v1);
        }

        private void setBlockedEvents(int v, DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            diagnosticEventRequestOuterClass$DiagnosticEventType0.getClass();
            this.ensureBlockedEventsIsMutable();
            this.blockedEvents_.setInt(v, diagnosticEventRequestOuterClass$DiagnosticEventType0.getNumber());
        }

        private void setBlockedEventsValue(int v, int v1) {
            this.ensureBlockedEventsIsMutable();
            this.blockedEvents_.setInt(v, v1);
        }

        private void setEnabled(boolean z) {
            this.enabled_ = z;
        }

        private void setMaxBatchIntervalMs(int v) {
            this.maxBatchIntervalMs_ = v;
        }

        private void setMaxBatchSize(int v) {
            this.maxBatchSize_ = v;
        }

        private void setSeverity(DiagnosticEventsSeverity diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0) {
            this.severity_ = diagnosticEventRequestOuterClass$DiagnosticEventsSeverity0.getNumber();
        }

        private void setSeverityValue(int v) {
            this.severity_ = v;
        }

        private void setTtmEnabled(boolean z) {
            this.ttmEnabled_ = z;
        }
    }

    public interface DiagnosticEventsConfigurationOrBuilder extends MessageLiteOrBuilder {
        DiagnosticEventType getAllowedEvents(int arg1);

        int getAllowedEventsCount();

        List getAllowedEventsList();

        int getAllowedEventsValue(int arg1);

        List getAllowedEventsValueList();

        DiagnosticEventType getBlockedEvents(int arg1);

        int getBlockedEventsCount();

        List getBlockedEventsList();

        int getBlockedEventsValue(int arg1);

        List getBlockedEventsValueList();

        boolean getEnabled();

        int getMaxBatchIntervalMs();

        int getMaxBatchSize();

        DiagnosticEventsSeverity getSeverity();

        int getSeverityValue();

        boolean getTtmEnabled();
    }

    public static final class FeatureFlags extends GeneratedMessageLite implements FeatureFlagsOrBuilder {
        public static final class gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements FeatureFlagsOrBuilder {
            private gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder() {
                super(FeatureFlags.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder(a nativeConfigurationOuterClass$a0) {
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearAppSheetBugCheckEnabled() {
                this.copyOnWrite();
                ((FeatureFlags)this.instance).clearAppSheetBugCheckEnabled();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearBoldSdkNextSessionEnabled() {
                this.copyOnWrite();
                ((FeatureFlags)this.instance).clearBoldSdkNextSessionEnabled();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearOpenglGpuEnabled() {
                this.copyOnWrite();
                ((FeatureFlags)this.instance).clearOpenglGpuEnabled();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearOpportunityIdPlacementValidation() {
                this.copyOnWrite();
                ((FeatureFlags)this.instance).clearOpportunityIdPlacementValidation();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder clearRecoverTerminatedWebviews() {
                this.copyOnWrite();
                ((FeatureFlags)this.instance).clearRecoverTerminatedWebviews();
                return this;
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
            public boolean getAppSheetBugCheckEnabled() {
                return ((FeatureFlags)this.instance).getAppSheetBugCheckEnabled();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
            public boolean getBoldSdkNextSessionEnabled() {
                return ((FeatureFlags)this.instance).getBoldSdkNextSessionEnabled();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
            public boolean getOpenglGpuEnabled() {
                return ((FeatureFlags)this.instance).getOpenglGpuEnabled();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
            public boolean getOpportunityIdPlacementValidation() {
                return ((FeatureFlags)this.instance).getOpportunityIdPlacementValidation();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
            public boolean getRecoverTerminatedWebviews() {
                return ((FeatureFlags)this.instance).getRecoverTerminatedWebviews();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setAppSheetBugCheckEnabled(boolean z) {
                this.copyOnWrite();
                ((FeatureFlags)this.instance).setAppSheetBugCheckEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setBoldSdkNextSessionEnabled(boolean z) {
                this.copyOnWrite();
                ((FeatureFlags)this.instance).setBoldSdkNextSessionEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setOpenglGpuEnabled(boolean z) {
                this.copyOnWrite();
                ((FeatureFlags)this.instance).setOpenglGpuEnabled(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setOpportunityIdPlacementValidation(boolean z) {
                this.copyOnWrite();
                ((FeatureFlags)this.instance).setOpportunityIdPlacementValidation(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder setRecoverTerminatedWebviews(boolean z) {
                this.copyOnWrite();
                ((FeatureFlags)this.instance).setRecoverTerminatedWebviews(z);
                return this;
            }
        }

        public static final int APP_SHEET_BUG_CHECK_ENABLED_FIELD_NUMBER = 4;
        public static final int BOLD_SDK_NEXT_SESSION_ENABLED_FIELD_NUMBER = 3;
        private static final FeatureFlags DEFAULT_INSTANCE = null;
        public static final int OPENGL_GPU_ENABLED_FIELD_NUMBER = 1;
        public static final int OPPORTUNITY_ID_PLACEMENT_VALIDATION_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int RECOVER_TERMINATED_WEBVIEWS_FIELD_NUMBER = 5;
        private boolean appSheetBugCheckEnabled_;
        private boolean boldSdkNextSessionEnabled_;
        private boolean openglGpuEnabled_;
        private boolean opportunityIdPlacementValidation_;
        private boolean recoverTerminatedWebviews_;

        static {
            FeatureFlags nativeConfigurationOuterClass$FeatureFlags0 = new FeatureFlags();
            FeatureFlags.DEFAULT_INSTANCE = nativeConfigurationOuterClass$FeatureFlags0;
            GeneratedMessageLite.registerDefaultInstance(FeatureFlags.class, nativeConfigurationOuterClass$FeatureFlags0);
        }

        private void clearAppSheetBugCheckEnabled() {
            this.appSheetBugCheckEnabled_ = false;
        }

        private void clearBoldSdkNextSessionEnabled() {
            this.boldSdkNextSessionEnabled_ = false;
        }

        private void clearOpenglGpuEnabled() {
            this.openglGpuEnabled_ = false;
        }

        private void clearOpportunityIdPlacementValidation() {
            this.opportunityIdPlacementValidation_ = false;
        }

        private void clearRecoverTerminatedWebviews() {
            this.recoverTerminatedWebviews_ = false;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new FeatureFlags();
                }
                case 2: {
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(FeatureFlags.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"openglGpuEnabled_", "opportunityIdPlacementValidation_", "boldSdkNextSessionEnabled_", "appSheetBugCheckEnabled_", "recoverTerminatedWebviews_"});
                }
                case 4: {
                    return FeatureFlags.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = FeatureFlags.PARSER;
                    if(parser0 == null) {
                        Class class0 = FeatureFlags.class;
                        synchronized(class0) {
                            parser0 = FeatureFlags.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(FeatureFlags.DEFAULT_INSTANCE);
                                FeatureFlags.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
        public boolean getAppSheetBugCheckEnabled() {
            return this.appSheetBugCheckEnabled_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
        public boolean getBoldSdkNextSessionEnabled() {
            return this.boldSdkNextSessionEnabled_;
        }

        public static FeatureFlags getDefaultInstance() {
            return FeatureFlags.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
        public boolean getOpenglGpuEnabled() {
            return this.openglGpuEnabled_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
        public boolean getOpportunityIdPlacementValidation() {
            return this.opportunityIdPlacementValidation_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
        public boolean getRecoverTerminatedWebviews() {
            return this.recoverTerminatedWebviews_;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder() {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder)FeatureFlags.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder(FeatureFlags nativeConfigurationOuterClass$FeatureFlags0) {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder)FeatureFlags.DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$FeatureFlags0);
        }

        public static FeatureFlags parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (FeatureFlags)GeneratedMessageLite.parseDelimitedFrom(FeatureFlags.DEFAULT_INSTANCE, inputStream0);
        }

        public static FeatureFlags parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FeatureFlags)GeneratedMessageLite.parseDelimitedFrom(FeatureFlags.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FeatureFlags parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (FeatureFlags)GeneratedMessageLite.parseFrom(FeatureFlags.DEFAULT_INSTANCE, byteString0);
        }

        public static FeatureFlags parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FeatureFlags)GeneratedMessageLite.parseFrom(FeatureFlags.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static FeatureFlags parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (FeatureFlags)GeneratedMessageLite.parseFrom(FeatureFlags.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static FeatureFlags parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FeatureFlags)GeneratedMessageLite.parseFrom(FeatureFlags.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static FeatureFlags parseFrom(InputStream inputStream0) throws IOException {
            return (FeatureFlags)GeneratedMessageLite.parseFrom(FeatureFlags.DEFAULT_INSTANCE, inputStream0);
        }

        public static FeatureFlags parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FeatureFlags)GeneratedMessageLite.parseFrom(FeatureFlags.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FeatureFlags parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (FeatureFlags)GeneratedMessageLite.parseFrom(FeatureFlags.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static FeatureFlags parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FeatureFlags)GeneratedMessageLite.parseFrom(FeatureFlags.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static FeatureFlags parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (FeatureFlags)GeneratedMessageLite.parseFrom(FeatureFlags.DEFAULT_INSTANCE, arr_b);
        }

        public static FeatureFlags parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FeatureFlags)GeneratedMessageLite.parseFrom(FeatureFlags.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return FeatureFlags.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAppSheetBugCheckEnabled(boolean z) {
            this.appSheetBugCheckEnabled_ = z;
        }

        private void setBoldSdkNextSessionEnabled(boolean z) {
            this.boldSdkNextSessionEnabled_ = z;
        }

        private void setOpenglGpuEnabled(boolean z) {
            this.openglGpuEnabled_ = z;
        }

        private void setOpportunityIdPlacementValidation(boolean z) {
            this.opportunityIdPlacementValidation_ = z;
        }

        private void setRecoverTerminatedWebviews(boolean z) {
            this.recoverTerminatedWebviews_ = z;
        }
    }

    public interface FeatureFlagsOrBuilder extends MessageLiteOrBuilder {
        boolean getAppSheetBugCheckEnabled();

        boolean getBoldSdkNextSessionEnabled();

        boolean getOpenglGpuEnabled();

        boolean getOpportunityIdPlacementValidation();

        boolean getRecoverTerminatedWebviews();
    }

    public static final class NativeConfiguration extends GeneratedMessageLite implements NativeConfigurationOrBuilder {
        public static final class gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements NativeConfigurationOrBuilder {
            private gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder() {
                super(NativeConfiguration.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder(a nativeConfigurationOuterClass$a0) {
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAdditionalStorePackages(String s) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).addAdditionalStorePackages(s);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAdditionalStorePackagesBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).addAdditionalStorePackagesBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAllAdditionalStorePackages(Iterable iterable0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).addAllAdditionalStorePackages(iterable0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addAllObservableAndroidActivities(Iterable iterable0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).addAllObservableAndroidActivities(iterable0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder addObservableAndroidActivities(ByteString byteString0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).addObservableAndroidActivities(byteString0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearAdOperations() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearAdOperations();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearAdPolicy() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearAdPolicy();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearAdditionalStorePackages() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearAdditionalStorePackages();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearCachedAssetsConfiguration() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearCachedAssetsConfiguration();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearDiagnosticEvents() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearDiagnosticEvents();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearEnableIapEvent() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearEnableIapEvent();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearEnableOm() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearEnableOm();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearFeatureFlags() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearFeatureFlags();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearInitPolicy() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearInitPolicy();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearObservableAndroidActivities() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearObservableAndroidActivities();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearOperativeEventPolicy() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearOperativeEventPolicy();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder clearOtherPolicy() {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).clearOtherPolicy();
                return this;
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public AdOperationsConfiguration getAdOperations() {
                return ((NativeConfiguration)this.instance).getAdOperations();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public RequestPolicy getAdPolicy() {
                return ((NativeConfiguration)this.instance).getAdPolicy();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public String getAdditionalStorePackages(int v) {
                return ((NativeConfiguration)this.instance).getAdditionalStorePackages(v);
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public ByteString getAdditionalStorePackagesBytes(int v) {
                return ((NativeConfiguration)this.instance).getAdditionalStorePackagesBytes(v);
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public int getAdditionalStorePackagesCount() {
                return ((NativeConfiguration)this.instance).getAdditionalStorePackagesCount();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public List getAdditionalStorePackagesList() {
                return DesugarCollections.unmodifiableList(((NativeConfiguration)this.instance).getAdditionalStorePackagesList());
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public CachedAssetsConfiguration getCachedAssetsConfiguration() {
                return ((NativeConfiguration)this.instance).getCachedAssetsConfiguration();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public DiagnosticEventsConfiguration getDiagnosticEvents() {
                return ((NativeConfiguration)this.instance).getDiagnosticEvents();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public boolean getEnableIapEvent() {
                return ((NativeConfiguration)this.instance).getEnableIapEvent();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public boolean getEnableOm() {
                return ((NativeConfiguration)this.instance).getEnableOm();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public FeatureFlags getFeatureFlags() {
                return ((NativeConfiguration)this.instance).getFeatureFlags();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public RequestPolicy getInitPolicy() {
                return ((NativeConfiguration)this.instance).getInitPolicy();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public ByteString getObservableAndroidActivities(int v) {
                return ((NativeConfiguration)this.instance).getObservableAndroidActivities(v);
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public int getObservableAndroidActivitiesCount() {
                return ((NativeConfiguration)this.instance).getObservableAndroidActivitiesCount();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public List getObservableAndroidActivitiesList() {
                return DesugarCollections.unmodifiableList(((NativeConfiguration)this.instance).getObservableAndroidActivitiesList());
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public RequestPolicy getOperativeEventPolicy() {
                return ((NativeConfiguration)this.instance).getOperativeEventPolicy();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public RequestPolicy getOtherPolicy() {
                return ((NativeConfiguration)this.instance).getOtherPolicy();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public boolean hasAdOperations() {
                return ((NativeConfiguration)this.instance).hasAdOperations();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public boolean hasAdPolicy() {
                return ((NativeConfiguration)this.instance).hasAdPolicy();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public boolean hasCachedAssetsConfiguration() {
                return ((NativeConfiguration)this.instance).hasCachedAssetsConfiguration();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public boolean hasDiagnosticEvents() {
                return ((NativeConfiguration)this.instance).hasDiagnosticEvents();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public boolean hasFeatureFlags() {
                return ((NativeConfiguration)this.instance).hasFeatureFlags();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public boolean hasInitPolicy() {
                return ((NativeConfiguration)this.instance).hasInitPolicy();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public boolean hasOperativeEventPolicy() {
                return ((NativeConfiguration)this.instance).hasOperativeEventPolicy();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
            public boolean hasOtherPolicy() {
                return ((NativeConfiguration)this.instance).hasOtherPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeAdOperations(AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).mergeAdOperations(nativeConfigurationOuterClass$AdOperationsConfiguration0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeAdPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).mergeAdPolicy(nativeConfigurationOuterClass$RequestPolicy0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeCachedAssetsConfiguration(CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).mergeCachedAssetsConfiguration(nativeConfigurationOuterClass$CachedAssetsConfiguration0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeDiagnosticEvents(DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).mergeDiagnosticEvents(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeFeatureFlags(FeatureFlags nativeConfigurationOuterClass$FeatureFlags0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).mergeFeatureFlags(nativeConfigurationOuterClass$FeatureFlags0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeInitPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).mergeInitPolicy(nativeConfigurationOuterClass$RequestPolicy0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeOperativeEventPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).mergeOperativeEventPolicy(nativeConfigurationOuterClass$RequestPolicy0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder mergeOtherPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).mergeOtherPolicy(nativeConfigurationOuterClass$RequestPolicy0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdOperations(Builder nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setAdOperations(((AdOperationsConfiguration)nativeConfigurationOuterClass$AdOperationsConfiguration$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdOperations(AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setAdOperations(nativeConfigurationOuterClass$AdOperationsConfiguration0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder nativeConfigurationOuterClass$RequestPolicy$Builder0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setAdPolicy(((RequestPolicy)nativeConfigurationOuterClass$RequestPolicy$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setAdPolicy(nativeConfigurationOuterClass$RequestPolicy0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setAdditionalStorePackages(int v, String s) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setAdditionalStorePackages(v, s);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setCachedAssetsConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setCachedAssetsConfiguration(((CachedAssetsConfiguration)nativeConfigurationOuterClass$CachedAssetsConfiguration$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setCachedAssetsConfiguration(CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setCachedAssetsConfiguration(nativeConfigurationOuterClass$CachedAssetsConfiguration0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDiagnosticEvents(gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setDiagnosticEvents(((DiagnosticEventsConfiguration)nativeConfigurationOuterClass$DiagnosticEventsConfiguration$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setDiagnosticEvents(DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setDiagnosticEvents(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setEnableIapEvent(boolean z) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setEnableIapEvent(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setEnableOm(boolean z) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setEnableOm(z);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setFeatureFlags(gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder nativeConfigurationOuterClass$FeatureFlags$Builder0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setFeatureFlags(((FeatureFlags)nativeConfigurationOuterClass$FeatureFlags$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setFeatureFlags(FeatureFlags nativeConfigurationOuterClass$FeatureFlags0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setFeatureFlags(nativeConfigurationOuterClass$FeatureFlags0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setInitPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder nativeConfigurationOuterClass$RequestPolicy$Builder0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setInitPolicy(((RequestPolicy)nativeConfigurationOuterClass$RequestPolicy$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setInitPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setInitPolicy(nativeConfigurationOuterClass$RequestPolicy0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setObservableAndroidActivities(int v, ByteString byteString0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setObservableAndroidActivities(v, byteString0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOperativeEventPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder nativeConfigurationOuterClass$RequestPolicy$Builder0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setOperativeEventPolicy(((RequestPolicy)nativeConfigurationOuterClass$RequestPolicy$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOperativeEventPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setOperativeEventPolicy(nativeConfigurationOuterClass$RequestPolicy0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOtherPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder nativeConfigurationOuterClass$RequestPolicy$Builder0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setOtherPolicy(((RequestPolicy)nativeConfigurationOuterClass$RequestPolicy$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder setOtherPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
                this.copyOnWrite();
                ((NativeConfiguration)this.instance).setOtherPolicy(nativeConfigurationOuterClass$RequestPolicy0);
                return this;
            }
        }

        public static final int ADDITIONAL_STORE_PACKAGES_FIELD_NUMBER = 10;
        public static final int AD_OPERATIONS_FIELD_NUMBER = 6;
        public static final int AD_POLICY_FIELD_NUMBER = 3;
        public static final int CACHED_ASSETS_CONFIGURATION_FIELD_NUMBER = 11;
        private static final NativeConfiguration DEFAULT_INSTANCE = null;
        public static final int DIAGNOSTIC_EVENTS_FIELD_NUMBER = 1;
        public static final int ENABLE_IAP_EVENT_FIELD_NUMBER = 8;
        public static final int ENABLE_OM_FIELD_NUMBER = 9;
        public static final int FEATURE_FLAGS_FIELD_NUMBER = 7;
        public static final int INIT_POLICY_FIELD_NUMBER = 2;
        public static final int OBSERVABLE_ANDROID_ACTIVITIES_FIELD_NUMBER = 12;
        public static final int OPERATIVE_EVENT_POLICY_FIELD_NUMBER = 4;
        public static final int OTHER_POLICY_FIELD_NUMBER = 5;
        private static volatile Parser PARSER;
        private AdOperationsConfiguration adOperations_;
        private RequestPolicy adPolicy_;
        private ProtobufList additionalStorePackages_;
        private int bitField0_;
        private CachedAssetsConfiguration cachedAssetsConfiguration_;
        private DiagnosticEventsConfiguration diagnosticEvents_;
        private boolean enableIapEvent_;
        private boolean enableOm_;
        private FeatureFlags featureFlags_;
        private RequestPolicy initPolicy_;
        private ProtobufList observableAndroidActivities_;
        private RequestPolicy operativeEventPolicy_;
        private RequestPolicy otherPolicy_;

        static {
            NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0 = new NativeConfiguration();
            NativeConfiguration.DEFAULT_INSTANCE = nativeConfigurationOuterClass$NativeConfiguration0;
            GeneratedMessageLite.registerDefaultInstance(NativeConfiguration.class, nativeConfigurationOuterClass$NativeConfiguration0);
        }

        private NativeConfiguration() {
            this.additionalStorePackages_ = GeneratedMessageLite.emptyProtobufList();
            this.observableAndroidActivities_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAdditionalStorePackages(String s) {
            s.getClass();
            this.ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.add(s);
        }

        private void addAdditionalStorePackagesBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.add(byteString0.toStringUtf8());
        }

        private void addAllAdditionalStorePackages(Iterable iterable0) {
            this.ensureAdditionalStorePackagesIsMutable();
            AbstractMessageLite.addAll(iterable0, this.additionalStorePackages_);
        }

        private void addAllObservableAndroidActivities(Iterable iterable0) {
            this.ensureObservableAndroidActivitiesIsMutable();
            AbstractMessageLite.addAll(iterable0, this.observableAndroidActivities_);
        }

        private void addObservableAndroidActivities(ByteString byteString0) {
            byteString0.getClass();
            this.ensureObservableAndroidActivitiesIsMutable();
            this.observableAndroidActivities_.add(byteString0);
        }

        private void clearAdOperations() {
            this.adOperations_ = null;
            this.bitField0_ &= -33;
        }

        private void clearAdPolicy() {
            this.adPolicy_ = null;
            this.bitField0_ &= -5;
        }

        private void clearAdditionalStorePackages() {
            this.additionalStorePackages_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearCachedAssetsConfiguration() {
            this.cachedAssetsConfiguration_ = null;
            this.bitField0_ &= 0xFFFFFF7F;
        }

        private void clearDiagnosticEvents() {
            this.diagnosticEvents_ = null;
            this.bitField0_ &= -2;
        }

        private void clearEnableIapEvent() {
            this.enableIapEvent_ = false;
        }

        private void clearEnableOm() {
            this.enableOm_ = false;
        }

        private void clearFeatureFlags() {
            this.featureFlags_ = null;
            this.bitField0_ &= -65;
        }

        private void clearInitPolicy() {
            this.initPolicy_ = null;
            this.bitField0_ &= -3;
        }

        private void clearObservableAndroidActivities() {
            this.observableAndroidActivities_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearOperativeEventPolicy() {
            this.operativeEventPolicy_ = null;
            this.bitField0_ &= -9;
        }

        private void clearOtherPolicy() {
            this.otherPolicy_ = null;
            this.bitField0_ &= -17;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new NativeConfiguration();
                }
                case 2: {
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(NativeConfiguration.DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b\u0007\t\u0007\nȚ\u000Bဉ\u0007\f\u001C", new Object[]{"bitField0_", "diagnosticEvents_", "initPolicy_", "adPolicy_", "operativeEventPolicy_", "otherPolicy_", "adOperations_", "featureFlags_", "enableIapEvent_", "enableOm_", "additionalStorePackages_", "cachedAssetsConfiguration_", "observableAndroidActivities_"});
                }
                case 4: {
                    return NativeConfiguration.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = NativeConfiguration.PARSER;
                    if(parser0 == null) {
                        Class class0 = NativeConfiguration.class;
                        synchronized(class0) {
                            parser0 = NativeConfiguration.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(NativeConfiguration.DEFAULT_INSTANCE);
                                NativeConfiguration.PARSER = parser0;
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

        private void ensureAdditionalStorePackagesIsMutable() {
            ProtobufList internal$ProtobufList0 = this.additionalStorePackages_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.additionalStorePackages_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureObservableAndroidActivitiesIsMutable() {
            ProtobufList internal$ProtobufList0 = this.observableAndroidActivities_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.observableAndroidActivities_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public AdOperationsConfiguration getAdOperations() {
            return this.adOperations_ == null ? AdOperationsConfiguration.getDefaultInstance() : this.adOperations_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public RequestPolicy getAdPolicy() {
            return this.adPolicy_ == null ? RequestPolicy.getDefaultInstance() : this.adPolicy_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public String getAdditionalStorePackages(int v) {
            return (String)this.additionalStorePackages_.get(v);
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public ByteString getAdditionalStorePackagesBytes(int v) {
            return ByteString.copyFromUtf8(((String)this.additionalStorePackages_.get(v)));
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public int getAdditionalStorePackagesCount() {
            return this.additionalStorePackages_.size();
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public List getAdditionalStorePackagesList() {
            return this.additionalStorePackages_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public CachedAssetsConfiguration getCachedAssetsConfiguration() {
            return this.cachedAssetsConfiguration_ == null ? CachedAssetsConfiguration.getDefaultInstance() : this.cachedAssetsConfiguration_;
        }

        public static NativeConfiguration getDefaultInstance() {
            return NativeConfiguration.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public DiagnosticEventsConfiguration getDiagnosticEvents() {
            return this.diagnosticEvents_ == null ? DiagnosticEventsConfiguration.getDefaultInstance() : this.diagnosticEvents_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public boolean getEnableIapEvent() {
            return this.enableIapEvent_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public boolean getEnableOm() {
            return this.enableOm_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public FeatureFlags getFeatureFlags() {
            return this.featureFlags_ == null ? FeatureFlags.getDefaultInstance() : this.featureFlags_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public RequestPolicy getInitPolicy() {
            return this.initPolicy_ == null ? RequestPolicy.getDefaultInstance() : this.initPolicy_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public ByteString getObservableAndroidActivities(int v) {
            return (ByteString)this.observableAndroidActivities_.get(v);
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public int getObservableAndroidActivitiesCount() {
            return this.observableAndroidActivities_.size();
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public List getObservableAndroidActivitiesList() {
            return this.observableAndroidActivities_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public RequestPolicy getOperativeEventPolicy() {
            return this.operativeEventPolicy_ == null ? RequestPolicy.getDefaultInstance() : this.operativeEventPolicy_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public RequestPolicy getOtherPolicy() {
            return this.otherPolicy_ == null ? RequestPolicy.getDefaultInstance() : this.otherPolicy_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public boolean hasAdOperations() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public boolean hasAdPolicy() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public boolean hasCachedAssetsConfiguration() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public boolean hasDiagnosticEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public boolean hasFeatureFlags() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public boolean hasInitPolicy() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public boolean hasOperativeEventPolicy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
        public boolean hasOtherPolicy() {
            return (this.bitField0_ & 16) != 0;
        }

        private void mergeAdOperations(AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration0) {
            nativeConfigurationOuterClass$AdOperationsConfiguration0.getClass();
            this.adOperations_ = this.adOperations_ == null || this.adOperations_ == AdOperationsConfiguration.getDefaultInstance() ? nativeConfigurationOuterClass$AdOperationsConfiguration0 : ((AdOperationsConfiguration)((Builder)AdOperationsConfiguration.newBuilder(this.adOperations_).mergeFrom(nativeConfigurationOuterClass$AdOperationsConfiguration0)).buildPartial());
            this.bitField0_ |= 0x20;
        }

        private void mergeAdPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            nativeConfigurationOuterClass$RequestPolicy0.getClass();
            this.adPolicy_ = this.adPolicy_ == null || this.adPolicy_ == RequestPolicy.getDefaultInstance() ? nativeConfigurationOuterClass$RequestPolicy0 : ((RequestPolicy)((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder)RequestPolicy.newBuilder(this.adPolicy_).mergeFrom(nativeConfigurationOuterClass$RequestPolicy0)).buildPartial());
            this.bitField0_ |= 4;
        }

        private void mergeCachedAssetsConfiguration(CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0) {
            nativeConfigurationOuterClass$CachedAssetsConfiguration0.getClass();
            this.cachedAssetsConfiguration_ = this.cachedAssetsConfiguration_ == null || this.cachedAssetsConfiguration_ == CachedAssetsConfiguration.getDefaultInstance() ? nativeConfigurationOuterClass$CachedAssetsConfiguration0 : ((CachedAssetsConfiguration)((gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder)CachedAssetsConfiguration.newBuilder(this.cachedAssetsConfiguration_).mergeFrom(nativeConfigurationOuterClass$CachedAssetsConfiguration0)).buildPartial());
            this.bitField0_ |= 0x80;
        }

        private void mergeDiagnosticEvents(DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0) {
            nativeConfigurationOuterClass$DiagnosticEventsConfiguration0.getClass();
            this.diagnosticEvents_ = this.diagnosticEvents_ == null || this.diagnosticEvents_ == DiagnosticEventsConfiguration.getDefaultInstance() ? nativeConfigurationOuterClass$DiagnosticEventsConfiguration0 : ((DiagnosticEventsConfiguration)((gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder)DiagnosticEventsConfiguration.newBuilder(this.diagnosticEvents_).mergeFrom(nativeConfigurationOuterClass$DiagnosticEventsConfiguration0)).buildPartial());
            this.bitField0_ |= 1;
        }

        private void mergeFeatureFlags(FeatureFlags nativeConfigurationOuterClass$FeatureFlags0) {
            nativeConfigurationOuterClass$FeatureFlags0.getClass();
            this.featureFlags_ = this.featureFlags_ == null || this.featureFlags_ == FeatureFlags.getDefaultInstance() ? nativeConfigurationOuterClass$FeatureFlags0 : ((FeatureFlags)((gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags.Builder)FeatureFlags.newBuilder(this.featureFlags_).mergeFrom(nativeConfigurationOuterClass$FeatureFlags0)).buildPartial());
            this.bitField0_ |= 0x40;
        }

        private void mergeInitPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            nativeConfigurationOuterClass$RequestPolicy0.getClass();
            this.initPolicy_ = this.initPolicy_ == null || this.initPolicy_ == RequestPolicy.getDefaultInstance() ? nativeConfigurationOuterClass$RequestPolicy0 : ((RequestPolicy)((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder)RequestPolicy.newBuilder(this.initPolicy_).mergeFrom(nativeConfigurationOuterClass$RequestPolicy0)).buildPartial());
            this.bitField0_ |= 2;
        }

        private void mergeOperativeEventPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            nativeConfigurationOuterClass$RequestPolicy0.getClass();
            this.operativeEventPolicy_ = this.operativeEventPolicy_ == null || this.operativeEventPolicy_ == RequestPolicy.getDefaultInstance() ? nativeConfigurationOuterClass$RequestPolicy0 : ((RequestPolicy)((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder)RequestPolicy.newBuilder(this.operativeEventPolicy_).mergeFrom(nativeConfigurationOuterClass$RequestPolicy0)).buildPartial());
            this.bitField0_ |= 8;
        }

        private void mergeOtherPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            nativeConfigurationOuterClass$RequestPolicy0.getClass();
            this.otherPolicy_ = this.otherPolicy_ == null || this.otherPolicy_ == RequestPolicy.getDefaultInstance() ? nativeConfigurationOuterClass$RequestPolicy0 : ((RequestPolicy)((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder)RequestPolicy.newBuilder(this.otherPolicy_).mergeFrom(nativeConfigurationOuterClass$RequestPolicy0)).buildPartial());
            this.bitField0_ |= 16;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder() {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder)NativeConfiguration.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder(NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0) {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder)NativeConfiguration.DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$NativeConfiguration0);
        }

        public static NativeConfiguration parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (NativeConfiguration)GeneratedMessageLite.parseDelimitedFrom(NativeConfiguration.DEFAULT_INSTANCE, inputStream0);
        }

        public static NativeConfiguration parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (NativeConfiguration)GeneratedMessageLite.parseDelimitedFrom(NativeConfiguration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static NativeConfiguration parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (NativeConfiguration)GeneratedMessageLite.parseFrom(NativeConfiguration.DEFAULT_INSTANCE, byteString0);
        }

        public static NativeConfiguration parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (NativeConfiguration)GeneratedMessageLite.parseFrom(NativeConfiguration.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static NativeConfiguration parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (NativeConfiguration)GeneratedMessageLite.parseFrom(NativeConfiguration.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static NativeConfiguration parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (NativeConfiguration)GeneratedMessageLite.parseFrom(NativeConfiguration.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static NativeConfiguration parseFrom(InputStream inputStream0) throws IOException {
            return (NativeConfiguration)GeneratedMessageLite.parseFrom(NativeConfiguration.DEFAULT_INSTANCE, inputStream0);
        }

        public static NativeConfiguration parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (NativeConfiguration)GeneratedMessageLite.parseFrom(NativeConfiguration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static NativeConfiguration parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (NativeConfiguration)GeneratedMessageLite.parseFrom(NativeConfiguration.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static NativeConfiguration parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (NativeConfiguration)GeneratedMessageLite.parseFrom(NativeConfiguration.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static NativeConfiguration parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (NativeConfiguration)GeneratedMessageLite.parseFrom(NativeConfiguration.DEFAULT_INSTANCE, arr_b);
        }

        public static NativeConfiguration parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (NativeConfiguration)GeneratedMessageLite.parseFrom(NativeConfiguration.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return NativeConfiguration.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdOperations(AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration0) {
            nativeConfigurationOuterClass$AdOperationsConfiguration0.getClass();
            this.adOperations_ = nativeConfigurationOuterClass$AdOperationsConfiguration0;
            this.bitField0_ |= 0x20;
        }

        private void setAdPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            nativeConfigurationOuterClass$RequestPolicy0.getClass();
            this.adPolicy_ = nativeConfigurationOuterClass$RequestPolicy0;
            this.bitField0_ |= 4;
        }

        private void setAdditionalStorePackages(int v, String s) {
            s.getClass();
            this.ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.set(v, s);
        }

        private void setCachedAssetsConfiguration(CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0) {
            nativeConfigurationOuterClass$CachedAssetsConfiguration0.getClass();
            this.cachedAssetsConfiguration_ = nativeConfigurationOuterClass$CachedAssetsConfiguration0;
            this.bitField0_ |= 0x80;
        }

        private void setDiagnosticEvents(DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration0) {
            nativeConfigurationOuterClass$DiagnosticEventsConfiguration0.getClass();
            this.diagnosticEvents_ = nativeConfigurationOuterClass$DiagnosticEventsConfiguration0;
            this.bitField0_ |= 1;
        }

        private void setEnableIapEvent(boolean z) {
            this.enableIapEvent_ = z;
        }

        private void setEnableOm(boolean z) {
            this.enableOm_ = z;
        }

        private void setFeatureFlags(FeatureFlags nativeConfigurationOuterClass$FeatureFlags0) {
            nativeConfigurationOuterClass$FeatureFlags0.getClass();
            this.featureFlags_ = nativeConfigurationOuterClass$FeatureFlags0;
            this.bitField0_ |= 0x40;
        }

        private void setInitPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            nativeConfigurationOuterClass$RequestPolicy0.getClass();
            this.initPolicy_ = nativeConfigurationOuterClass$RequestPolicy0;
            this.bitField0_ |= 2;
        }

        private void setObservableAndroidActivities(int v, ByteString byteString0) {
            byteString0.getClass();
            this.ensureObservableAndroidActivitiesIsMutable();
            this.observableAndroidActivities_.set(v, byteString0);
        }

        private void setOperativeEventPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            nativeConfigurationOuterClass$RequestPolicy0.getClass();
            this.operativeEventPolicy_ = nativeConfigurationOuterClass$RequestPolicy0;
            this.bitField0_ |= 8;
        }

        private void setOtherPolicy(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            nativeConfigurationOuterClass$RequestPolicy0.getClass();
            this.otherPolicy_ = nativeConfigurationOuterClass$RequestPolicy0;
            this.bitField0_ |= 16;
        }
    }

    public interface NativeConfigurationOrBuilder extends MessageLiteOrBuilder {
        AdOperationsConfiguration getAdOperations();

        RequestPolicy getAdPolicy();

        String getAdditionalStorePackages(int arg1);

        ByteString getAdditionalStorePackagesBytes(int arg1);

        int getAdditionalStorePackagesCount();

        List getAdditionalStorePackagesList();

        CachedAssetsConfiguration getCachedAssetsConfiguration();

        DiagnosticEventsConfiguration getDiagnosticEvents();

        boolean getEnableIapEvent();

        boolean getEnableOm();

        FeatureFlags getFeatureFlags();

        RequestPolicy getInitPolicy();

        ByteString getObservableAndroidActivities(int arg1);

        int getObservableAndroidActivitiesCount();

        List getObservableAndroidActivitiesList();

        RequestPolicy getOperativeEventPolicy();

        RequestPolicy getOtherPolicy();

        boolean hasAdOperations();

        boolean hasAdPolicy();

        boolean hasCachedAssetsConfiguration();

        boolean hasDiagnosticEvents();

        boolean hasFeatureFlags();

        boolean hasInitPolicy();

        boolean hasOperativeEventPolicy();

        boolean hasOtherPolicy();
    }

    public static final class RequestPolicy extends GeneratedMessageLite implements RequestPolicyOrBuilder {
        public static final class gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements RequestPolicyOrBuilder {
            private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder() {
                super(RequestPolicy.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder(a nativeConfigurationOuterClass$a0) {
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder clearRetryPolicy() {
                this.copyOnWrite();
                ((RequestPolicy)this.instance).clearRetryPolicy();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder clearTimeoutPolicy() {
                this.copyOnWrite();
                ((RequestPolicy)this.instance).clearTimeoutPolicy();
                return this;
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestPolicyOrBuilder
            public RequestRetryPolicy getRetryPolicy() {
                return ((RequestPolicy)this.instance).getRetryPolicy();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestPolicyOrBuilder
            public RequestTimeoutPolicy getTimeoutPolicy() {
                return ((RequestPolicy)this.instance).getTimeoutPolicy();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestPolicyOrBuilder
            public boolean hasRetryPolicy() {
                return ((RequestPolicy)this.instance).hasRetryPolicy();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestPolicyOrBuilder
            public boolean hasTimeoutPolicy() {
                return ((RequestPolicy)this.instance).hasTimeoutPolicy();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder mergeRetryPolicy(RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy0) {
                this.copyOnWrite();
                ((RequestPolicy)this.instance).mergeRetryPolicy(nativeConfigurationOuterClass$RequestRetryPolicy0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder mergeTimeoutPolicy(RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy0) {
                this.copyOnWrite();
                ((RequestPolicy)this.instance).mergeTimeoutPolicy(nativeConfigurationOuterClass$RequestTimeoutPolicy0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder nativeConfigurationOuterClass$RequestRetryPolicy$Builder0) {
                this.copyOnWrite();
                ((RequestPolicy)this.instance).setRetryPolicy(((RequestRetryPolicy)nativeConfigurationOuterClass$RequestRetryPolicy$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setRetryPolicy(RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy0) {
                this.copyOnWrite();
                ((RequestPolicy)this.instance).setRetryPolicy(nativeConfigurationOuterClass$RequestRetryPolicy0);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0) {
                this.copyOnWrite();
                ((RequestPolicy)this.instance).setTimeoutPolicy(((RequestTimeoutPolicy)nativeConfigurationOuterClass$RequestTimeoutPolicy$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder setTimeoutPolicy(RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy0) {
                this.copyOnWrite();
                ((RequestPolicy)this.instance).setTimeoutPolicy(nativeConfigurationOuterClass$RequestTimeoutPolicy0);
                return this;
            }
        }

        private static final RequestPolicy DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int RETRY_POLICY_FIELD_NUMBER = 1;
        public static final int TIMEOUT_POLICY_FIELD_NUMBER = 2;
        private int bitField0_;
        private RequestRetryPolicy retryPolicy_;
        private RequestTimeoutPolicy timeoutPolicy_;

        static {
            RequestPolicy nativeConfigurationOuterClass$RequestPolicy0 = new RequestPolicy();
            RequestPolicy.DEFAULT_INSTANCE = nativeConfigurationOuterClass$RequestPolicy0;
            GeneratedMessageLite.registerDefaultInstance(RequestPolicy.class, nativeConfigurationOuterClass$RequestPolicy0);
        }

        private void clearRetryPolicy() {
            this.retryPolicy_ = null;
            this.bitField0_ &= -2;
        }

        private void clearTimeoutPolicy() {
            this.timeoutPolicy_ = null;
            this.bitField0_ &= -3;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new RequestPolicy();
                }
                case 2: {
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(RequestPolicy.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "retryPolicy_", "timeoutPolicy_"});
                }
                case 4: {
                    return RequestPolicy.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = RequestPolicy.PARSER;
                    if(parser0 == null) {
                        Class class0 = RequestPolicy.class;
                        synchronized(class0) {
                            parser0 = RequestPolicy.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(RequestPolicy.DEFAULT_INSTANCE);
                                RequestPolicy.PARSER = parser0;
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

        public static RequestPolicy getDefaultInstance() {
            return RequestPolicy.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestPolicyOrBuilder
        public RequestRetryPolicy getRetryPolicy() {
            return this.retryPolicy_ == null ? RequestRetryPolicy.getDefaultInstance() : this.retryPolicy_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestPolicyOrBuilder
        public RequestTimeoutPolicy getTimeoutPolicy() {
            return this.timeoutPolicy_ == null ? RequestTimeoutPolicy.getDefaultInstance() : this.timeoutPolicy_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestPolicyOrBuilder
        public boolean hasRetryPolicy() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestPolicyOrBuilder
        public boolean hasTimeoutPolicy() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeRetryPolicy(RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy0) {
            nativeConfigurationOuterClass$RequestRetryPolicy0.getClass();
            this.retryPolicy_ = this.retryPolicy_ == null || this.retryPolicy_ == RequestRetryPolicy.getDefaultInstance() ? nativeConfigurationOuterClass$RequestRetryPolicy0 : ((RequestRetryPolicy)((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder)RequestRetryPolicy.newBuilder(this.retryPolicy_).mergeFrom(nativeConfigurationOuterClass$RequestRetryPolicy0)).buildPartial());
            this.bitField0_ |= 1;
        }

        private void mergeTimeoutPolicy(RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy0) {
            nativeConfigurationOuterClass$RequestTimeoutPolicy0.getClass();
            this.timeoutPolicy_ = this.timeoutPolicy_ == null || this.timeoutPolicy_ == RequestTimeoutPolicy.getDefaultInstance() ? nativeConfigurationOuterClass$RequestTimeoutPolicy0 : ((RequestTimeoutPolicy)((gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder)RequestTimeoutPolicy.newBuilder(this.timeoutPolicy_).mergeFrom(nativeConfigurationOuterClass$RequestTimeoutPolicy0)).buildPartial());
            this.bitField0_ |= 2;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder() {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder)RequestPolicy.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder(RequestPolicy nativeConfigurationOuterClass$RequestPolicy0) {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.Builder)RequestPolicy.DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$RequestPolicy0);
        }

        public static RequestPolicy parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (RequestPolicy)GeneratedMessageLite.parseDelimitedFrom(RequestPolicy.DEFAULT_INSTANCE, inputStream0);
        }

        public static RequestPolicy parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (RequestPolicy)GeneratedMessageLite.parseDelimitedFrom(RequestPolicy.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static RequestPolicy parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (RequestPolicy)GeneratedMessageLite.parseFrom(RequestPolicy.DEFAULT_INSTANCE, byteString0);
        }

        public static RequestPolicy parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (RequestPolicy)GeneratedMessageLite.parseFrom(RequestPolicy.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static RequestPolicy parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (RequestPolicy)GeneratedMessageLite.parseFrom(RequestPolicy.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static RequestPolicy parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (RequestPolicy)GeneratedMessageLite.parseFrom(RequestPolicy.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static RequestPolicy parseFrom(InputStream inputStream0) throws IOException {
            return (RequestPolicy)GeneratedMessageLite.parseFrom(RequestPolicy.DEFAULT_INSTANCE, inputStream0);
        }

        public static RequestPolicy parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (RequestPolicy)GeneratedMessageLite.parseFrom(RequestPolicy.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static RequestPolicy parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (RequestPolicy)GeneratedMessageLite.parseFrom(RequestPolicy.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static RequestPolicy parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (RequestPolicy)GeneratedMessageLite.parseFrom(RequestPolicy.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static RequestPolicy parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (RequestPolicy)GeneratedMessageLite.parseFrom(RequestPolicy.DEFAULT_INSTANCE, arr_b);
        }

        public static RequestPolicy parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (RequestPolicy)GeneratedMessageLite.parseFrom(RequestPolicy.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return RequestPolicy.DEFAULT_INSTANCE.getParserForType();
        }

        private void setRetryPolicy(RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy0) {
            nativeConfigurationOuterClass$RequestRetryPolicy0.getClass();
            this.retryPolicy_ = nativeConfigurationOuterClass$RequestRetryPolicy0;
            this.bitField0_ |= 1;
        }

        private void setTimeoutPolicy(RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy0) {
            nativeConfigurationOuterClass$RequestTimeoutPolicy0.getClass();
            this.timeoutPolicy_ = nativeConfigurationOuterClass$RequestTimeoutPolicy0;
            this.bitField0_ |= 2;
        }
    }

    public interface RequestPolicyOrBuilder extends MessageLiteOrBuilder {
        RequestRetryPolicy getRetryPolicy();

        RequestTimeoutPolicy getTimeoutPolicy();

        boolean hasRetryPolicy();

        boolean hasTimeoutPolicy();
    }

    public static final class RequestRetryPolicy extends GeneratedMessageLite implements RequestRetryPolicyOrBuilder {
        public static final class gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements RequestRetryPolicyOrBuilder {
            private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder() {
                super(RequestRetryPolicy.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder(a nativeConfigurationOuterClass$a0) {
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearMaxDuration() {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).clearMaxDuration();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryJitterPct() {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).clearRetryJitterPct();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryMaxInterval() {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).clearRetryMaxInterval();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryScalingFactor() {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).clearRetryScalingFactor();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearRetryWaitBase() {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).clearRetryWaitBase();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder clearShouldStoreLocally() {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).clearShouldStoreLocally();
                return this;
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
            public int getMaxDuration() {
                return ((RequestRetryPolicy)this.instance).getMaxDuration();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
            public float getRetryJitterPct() {
                return ((RequestRetryPolicy)this.instance).getRetryJitterPct();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
            public int getRetryMaxInterval() {
                return ((RequestRetryPolicy)this.instance).getRetryMaxInterval();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
            public float getRetryScalingFactor() {
                return ((RequestRetryPolicy)this.instance).getRetryScalingFactor();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
            public int getRetryWaitBase() {
                return ((RequestRetryPolicy)this.instance).getRetryWaitBase();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
            public boolean getShouldStoreLocally() {
                return ((RequestRetryPolicy)this.instance).getShouldStoreLocally();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setMaxDuration(int v) {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).setMaxDuration(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryJitterPct(float f) {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).setRetryJitterPct(f);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryMaxInterval(int v) {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).setRetryMaxInterval(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryScalingFactor(float f) {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).setRetryScalingFactor(f);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setRetryWaitBase(int v) {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).setRetryWaitBase(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder setShouldStoreLocally(boolean z) {
                this.copyOnWrite();
                ((RequestRetryPolicy)this.instance).setShouldStoreLocally(z);
                return this;
            }
        }

        private static final RequestRetryPolicy DEFAULT_INSTANCE = null;
        public static final int MAX_DURATION_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int RETRY_JITTER_PCT_FIELD_NUMBER = 4;
        public static final int RETRY_MAX_INTERVAL_FIELD_NUMBER = 3;
        public static final int RETRY_SCALING_FACTOR_FIELD_NUMBER = 5;
        public static final int RETRY_WAIT_BASE_FIELD_NUMBER = 2;
        public static final int SHOULD_STORE_LOCALLY_FIELD_NUMBER = 6;
        private int maxDuration_;
        private float retryJitterPct_;
        private int retryMaxInterval_;
        private float retryScalingFactor_;
        private int retryWaitBase_;
        private boolean shouldStoreLocally_;

        static {
            RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy0 = new RequestRetryPolicy();
            RequestRetryPolicy.DEFAULT_INSTANCE = nativeConfigurationOuterClass$RequestRetryPolicy0;
            GeneratedMessageLite.registerDefaultInstance(RequestRetryPolicy.class, nativeConfigurationOuterClass$RequestRetryPolicy0);
        }

        private void clearMaxDuration() {
            this.maxDuration_ = 0;
        }

        private void clearRetryJitterPct() {
            this.retryJitterPct_ = 0.0f;
        }

        private void clearRetryMaxInterval() {
            this.retryMaxInterval_ = 0;
        }

        private void clearRetryScalingFactor() {
            this.retryScalingFactor_ = 0.0f;
        }

        private void clearRetryWaitBase() {
            this.retryWaitBase_ = 0;
        }

        private void clearShouldStoreLocally() {
            this.shouldStoreLocally_ = false;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new RequestRetryPolicy();
                }
                case 2: {
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(RequestRetryPolicy.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0001\u0005\u0001\u0006\u0007", new Object[]{"maxDuration_", "retryWaitBase_", "retryMaxInterval_", "retryJitterPct_", "retryScalingFactor_", "shouldStoreLocally_"});
                }
                case 4: {
                    return RequestRetryPolicy.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = RequestRetryPolicy.PARSER;
                    if(parser0 == null) {
                        Class class0 = RequestRetryPolicy.class;
                        synchronized(class0) {
                            parser0 = RequestRetryPolicy.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(RequestRetryPolicy.DEFAULT_INSTANCE);
                                RequestRetryPolicy.PARSER = parser0;
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

        public static RequestRetryPolicy getDefaultInstance() {
            return RequestRetryPolicy.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public int getMaxDuration() {
            return this.maxDuration_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public float getRetryJitterPct() {
            return this.retryJitterPct_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public int getRetryMaxInterval() {
            return this.retryMaxInterval_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public float getRetryScalingFactor() {
            return this.retryScalingFactor_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public int getRetryWaitBase() {
            return this.retryWaitBase_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public boolean getShouldStoreLocally() {
            return this.shouldStoreLocally_;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder() {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder)RequestRetryPolicy.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder(RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy0) {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.Builder)RequestRetryPolicy.DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$RequestRetryPolicy0);
        }

        public static RequestRetryPolicy parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseDelimitedFrom(RequestRetryPolicy.DEFAULT_INSTANCE, inputStream0);
        }

        public static RequestRetryPolicy parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseDelimitedFrom(RequestRetryPolicy.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static RequestRetryPolicy parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseFrom(RequestRetryPolicy.DEFAULT_INSTANCE, byteString0);
        }

        public static RequestRetryPolicy parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseFrom(RequestRetryPolicy.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static RequestRetryPolicy parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseFrom(RequestRetryPolicy.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static RequestRetryPolicy parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseFrom(RequestRetryPolicy.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static RequestRetryPolicy parseFrom(InputStream inputStream0) throws IOException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseFrom(RequestRetryPolicy.DEFAULT_INSTANCE, inputStream0);
        }

        public static RequestRetryPolicy parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseFrom(RequestRetryPolicy.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static RequestRetryPolicy parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseFrom(RequestRetryPolicy.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static RequestRetryPolicy parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseFrom(RequestRetryPolicy.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static RequestRetryPolicy parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseFrom(RequestRetryPolicy.DEFAULT_INSTANCE, arr_b);
        }

        public static RequestRetryPolicy parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy)GeneratedMessageLite.parseFrom(RequestRetryPolicy.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return RequestRetryPolicy.DEFAULT_INSTANCE.getParserForType();
        }

        private void setMaxDuration(int v) {
            this.maxDuration_ = v;
        }

        private void setRetryJitterPct(float f) {
            this.retryJitterPct_ = f;
        }

        private void setRetryMaxInterval(int v) {
            this.retryMaxInterval_ = v;
        }

        private void setRetryScalingFactor(float f) {
            this.retryScalingFactor_ = f;
        }

        private void setRetryWaitBase(int v) {
            this.retryWaitBase_ = v;
        }

        private void setShouldStoreLocally(boolean z) {
            this.shouldStoreLocally_ = z;
        }
    }

    public interface RequestRetryPolicyOrBuilder extends MessageLiteOrBuilder {
        int getMaxDuration();

        float getRetryJitterPct();

        int getRetryMaxInterval();

        float getRetryScalingFactor();

        int getRetryWaitBase();

        boolean getShouldStoreLocally();
    }

    public static final class RequestTimeoutPolicy extends GeneratedMessageLite implements RequestTimeoutPolicyOrBuilder {
        public static final class gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements RequestTimeoutPolicyOrBuilder {
            private gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder() {
                super(RequestTimeoutPolicy.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder(a nativeConfigurationOuterClass$a0) {
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearConnectTimeoutMs() {
                this.copyOnWrite();
                ((RequestTimeoutPolicy)this.instance).clearConnectTimeoutMs();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearOverallTimeoutMs() {
                this.copyOnWrite();
                ((RequestTimeoutPolicy)this.instance).clearOverallTimeoutMs();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearReadTimeoutMs() {
                this.copyOnWrite();
                ((RequestTimeoutPolicy)this.instance).clearReadTimeoutMs();
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder clearWriteTimeoutMs() {
                this.copyOnWrite();
                ((RequestTimeoutPolicy)this.instance).clearWriteTimeoutMs();
                return this;
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
            public int getConnectTimeoutMs() {
                return ((RequestTimeoutPolicy)this.instance).getConnectTimeoutMs();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
            public int getOverallTimeoutMs() {
                return ((RequestTimeoutPolicy)this.instance).getOverallTimeoutMs();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
            public int getReadTimeoutMs() {
                return ((RequestTimeoutPolicy)this.instance).getReadTimeoutMs();
            }

            @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
            public int getWriteTimeoutMs() {
                return ((RequestTimeoutPolicy)this.instance).getWriteTimeoutMs();
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setConnectTimeoutMs(int v) {
                this.copyOnWrite();
                ((RequestTimeoutPolicy)this.instance).setConnectTimeoutMs(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setOverallTimeoutMs(int v) {
                this.copyOnWrite();
                ((RequestTimeoutPolicy)this.instance).setOverallTimeoutMs(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setReadTimeoutMs(int v) {
                this.copyOnWrite();
                ((RequestTimeoutPolicy)this.instance).setReadTimeoutMs(v);
                return this;
            }

            public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder setWriteTimeoutMs(int v) {
                this.copyOnWrite();
                ((RequestTimeoutPolicy)this.instance).setWriteTimeoutMs(v);
                return this;
            }
        }

        public static final int CONNECT_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static final RequestTimeoutPolicy DEFAULT_INSTANCE = null;
        public static final int OVERALL_TIMEOUT_MS_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int READ_TIMEOUT_MS_FIELD_NUMBER = 2;
        public static final int WRITE_TIMEOUT_MS_FIELD_NUMBER = 3;
        private int connectTimeoutMs_;
        private int overallTimeoutMs_;
        private int readTimeoutMs_;
        private int writeTimeoutMs_;

        static {
            RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy0 = new RequestTimeoutPolicy();
            RequestTimeoutPolicy.DEFAULT_INSTANCE = nativeConfigurationOuterClass$RequestTimeoutPolicy0;
            GeneratedMessageLite.registerDefaultInstance(RequestTimeoutPolicy.class, nativeConfigurationOuterClass$RequestTimeoutPolicy0);
        }

        private void clearConnectTimeoutMs() {
            this.connectTimeoutMs_ = 0;
        }

        private void clearOverallTimeoutMs() {
            this.overallTimeoutMs_ = 0;
        }

        private void clearReadTimeoutMs() {
            this.readTimeoutMs_ = 0;
        }

        private void clearWriteTimeoutMs() {
            this.writeTimeoutMs_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new RequestTimeoutPolicy();
                }
                case 2: {
                    return new gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(RequestTimeoutPolicy.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"connectTimeoutMs_", "readTimeoutMs_", "writeTimeoutMs_", "overallTimeoutMs_"});
                }
                case 4: {
                    return RequestTimeoutPolicy.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = RequestTimeoutPolicy.PARSER;
                    if(parser0 == null) {
                        Class class0 = RequestTimeoutPolicy.class;
                        synchronized(class0) {
                            parser0 = RequestTimeoutPolicy.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(RequestTimeoutPolicy.DEFAULT_INSTANCE);
                                RequestTimeoutPolicy.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
        public int getConnectTimeoutMs() {
            return this.connectTimeoutMs_;
        }

        public static RequestTimeoutPolicy getDefaultInstance() {
            return RequestTimeoutPolicy.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
        public int getOverallTimeoutMs() {
            return this.overallTimeoutMs_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
        public int getReadTimeoutMs() {
            return this.readTimeoutMs_;
        }

        @Override  // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
        public int getWriteTimeoutMs() {
            return this.writeTimeoutMs_;
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder() {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder)RequestTimeoutPolicy.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder(RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy0) {
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder)RequestTimeoutPolicy.DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$RequestTimeoutPolicy0);
        }

        public static RequestTimeoutPolicy parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseDelimitedFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, inputStream0);
        }

        public static RequestTimeoutPolicy parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseDelimitedFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static RequestTimeoutPolicy parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, byteString0);
        }

        public static RequestTimeoutPolicy parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static RequestTimeoutPolicy parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static RequestTimeoutPolicy parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static RequestTimeoutPolicy parseFrom(InputStream inputStream0) throws IOException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, inputStream0);
        }

        public static RequestTimeoutPolicy parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static RequestTimeoutPolicy parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static RequestTimeoutPolicy parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static RequestTimeoutPolicy parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, arr_b);
        }

        public static RequestTimeoutPolicy parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy)GeneratedMessageLite.parseFrom(RequestTimeoutPolicy.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return RequestTimeoutPolicy.DEFAULT_INSTANCE.getParserForType();
        }

        private void setConnectTimeoutMs(int v) {
            this.connectTimeoutMs_ = v;
        }

        private void setOverallTimeoutMs(int v) {
            this.overallTimeoutMs_ = v;
        }

        private void setReadTimeoutMs(int v) {
            this.readTimeoutMs_ = v;
        }

        private void setWriteTimeoutMs(int v) {
            this.writeTimeoutMs_ = v;
        }
    }

    public interface RequestTimeoutPolicyOrBuilder extends MessageLiteOrBuilder {
        int getConnectTimeoutMs();

        int getOverallTimeoutMs();

        int getReadTimeoutMs();

        int getWriteTimeoutMs();
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

