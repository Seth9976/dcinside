package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Sdk {
    public static final class MetricBatch extends GeneratedMessageLite implements b {
        public static final class a extends Builder implements b {
            private a() {
                super(MetricBatch.DEFAULT_INSTANCE);
            }

            a(com.vungle.ads.internal.protos.Sdk.a sdk$a0) {
            }

            public a addAllMetrics(Iterable iterable0) {
                this.copyOnWrite();
                ((MetricBatch)this.instance).addAllMetrics(iterable0);
                return this;
            }

            public a addMetrics(int v, com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a0) {
                this.copyOnWrite();
                ((MetricBatch)this.instance).addMetrics(v, ((SDKMetric)sdk$SDKMetric$a0.build()));
                return this;
            }

            public a addMetrics(int v, SDKMetric sdk$SDKMetric0) {
                this.copyOnWrite();
                ((MetricBatch)this.instance).addMetrics(v, sdk$SDKMetric0);
                return this;
            }

            public a addMetrics(com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a0) {
                this.copyOnWrite();
                ((MetricBatch)this.instance).addMetrics(((SDKMetric)sdk$SDKMetric$a0.build()));
                return this;
            }

            public a addMetrics(SDKMetric sdk$SDKMetric0) {
                this.copyOnWrite();
                ((MetricBatch)this.instance).addMetrics(sdk$SDKMetric0);
                return this;
            }

            public a clearMetrics() {
                this.copyOnWrite();
                ((MetricBatch)this.instance).clearMetrics();
                return this;
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$b
            public SDKMetric getMetrics(int v) {
                return ((MetricBatch)this.instance).getMetrics(v);
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$b
            public int getMetricsCount() {
                return ((MetricBatch)this.instance).getMetricsCount();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$b
            public List getMetricsList() {
                return DesugarCollections.unmodifiableList(((MetricBatch)this.instance).getMetricsList());
            }

            public a removeMetrics(int v) {
                this.copyOnWrite();
                ((MetricBatch)this.instance).removeMetrics(v);
                return this;
            }

            public a setMetrics(int v, com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a0) {
                this.copyOnWrite();
                ((MetricBatch)this.instance).setMetrics(v, ((SDKMetric)sdk$SDKMetric$a0.build()));
                return this;
            }

            public a setMetrics(int v, SDKMetric sdk$SDKMetric0) {
                this.copyOnWrite();
                ((MetricBatch)this.instance).setMetrics(v, sdk$SDKMetric0);
                return this;
            }
        }

        private static final MetricBatch DEFAULT_INSTANCE = null;
        public static final int METRICS_FIELD_NUMBER = 1;
        private static volatile Parser PARSER;
        private ProtobufList metrics_;

        static {
            MetricBatch sdk$MetricBatch0 = new MetricBatch();
            MetricBatch.DEFAULT_INSTANCE = sdk$MetricBatch0;
            GeneratedMessageLite.registerDefaultInstance(MetricBatch.class, sdk$MetricBatch0);
        }

        private MetricBatch() {
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllMetrics(Iterable iterable0) {
            this.ensureMetricsIsMutable();
            AbstractMessageLite.addAll(iterable0, this.metrics_);
        }

        private void addMetrics(int v, SDKMetric sdk$SDKMetric0) {
            sdk$SDKMetric0.getClass();
            this.ensureMetricsIsMutable();
            this.metrics_.add(v, sdk$SDKMetric0);
        }

        private void addMetrics(SDKMetric sdk$SDKMetric0) {
            sdk$SDKMetric0.getClass();
            this.ensureMetricsIsMutable();
            this.metrics_.add(sdk$SDKMetric0);
        }

        private void clearMetrics() {
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new MetricBatch();
                }
                case 2: {
                    return new a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(MetricBatch.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"metrics_", SDKMetric.class});
                }
                case 4: {
                    return MetricBatch.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = MetricBatch.PARSER;
                    if(parser0 == null) {
                        Class class0 = MetricBatch.class;
                        synchronized(class0) {
                            parser0 = MetricBatch.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(MetricBatch.DEFAULT_INSTANCE);
                                MetricBatch.PARSER = parser0;
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

        private void ensureMetricsIsMutable() {
            ProtobufList internal$ProtobufList0 = this.metrics_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.metrics_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static MetricBatch getDefaultInstance() {
            return MetricBatch.DEFAULT_INSTANCE;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$b
        public SDKMetric getMetrics(int v) {
            return (SDKMetric)this.metrics_.get(v);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$b
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$b
        public List getMetricsList() {
            return this.metrics_;
        }

        public e getMetricsOrBuilder(int v) {
            return (e)this.metrics_.get(v);
        }

        public List getMetricsOrBuilderList() {
            return this.metrics_;
        }

        public static a newBuilder() {
            return (a)MetricBatch.DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MetricBatch sdk$MetricBatch0) {
            return (a)MetricBatch.DEFAULT_INSTANCE.createBuilder(sdk$MetricBatch0);
        }

        public static MetricBatch parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (MetricBatch)GeneratedMessageLite.parseDelimitedFrom(MetricBatch.DEFAULT_INSTANCE, inputStream0);
        }

        public static MetricBatch parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MetricBatch)GeneratedMessageLite.parseDelimitedFrom(MetricBatch.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static MetricBatch parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (MetricBatch)GeneratedMessageLite.parseFrom(MetricBatch.DEFAULT_INSTANCE, byteString0);
        }

        public static MetricBatch parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MetricBatch)GeneratedMessageLite.parseFrom(MetricBatch.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static MetricBatch parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (MetricBatch)GeneratedMessageLite.parseFrom(MetricBatch.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static MetricBatch parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MetricBatch)GeneratedMessageLite.parseFrom(MetricBatch.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static MetricBatch parseFrom(InputStream inputStream0) throws IOException {
            return (MetricBatch)GeneratedMessageLite.parseFrom(MetricBatch.DEFAULT_INSTANCE, inputStream0);
        }

        public static MetricBatch parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MetricBatch)GeneratedMessageLite.parseFrom(MetricBatch.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static MetricBatch parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (MetricBatch)GeneratedMessageLite.parseFrom(MetricBatch.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static MetricBatch parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MetricBatch)GeneratedMessageLite.parseFrom(MetricBatch.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static MetricBatch parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (MetricBatch)GeneratedMessageLite.parseFrom(MetricBatch.DEFAULT_INSTANCE, arr_b);
        }

        public static MetricBatch parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MetricBatch)GeneratedMessageLite.parseFrom(MetricBatch.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return MetricBatch.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeMetrics(int v) {
            this.ensureMetricsIsMutable();
            this.metrics_.remove(v);
        }

        private void setMetrics(int v, SDKMetric sdk$SDKMetric0) {
            sdk$SDKMetric0.getClass();
            this.ensureMetricsIsMutable();
            this.metrics_.set(v, sdk$SDKMetric0);
        }
    }

    public static final class SDKError extends GeneratedMessageLite implements d {
        public static final class com.vungle.ads.internal.protos.Sdk.SDKError.a extends Builder implements d {
            private com.vungle.ads.internal.protos.Sdk.SDKError.a() {
                super(SDKError.DEFAULT_INSTANCE);
            }

            com.vungle.ads.internal.protos.Sdk.SDKError.a(com.vungle.ads.internal.protos.Sdk.a sdk$a0) {
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearAdSource() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearAdSource();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearAt() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearAt();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearConnectionType() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearConnectionType();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearConnectionTypeDetail() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearConnectionTypeDetail();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearConnectionTypeDetailAndroid() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearConnectionTypeDetailAndroid();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearCreativeId() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearCreativeId();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearEventId() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearEventId();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearIsHbPlacement() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearIsHbPlacement();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearIsLowDataModeEnabled() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearIsLowDataModeEnabled();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearMake() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearMake();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearMessage() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearMessage();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearModel() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearModel();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearOs() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearOs();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearOsVersion() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearOsVersion();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearPlacementReferenceId() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearPlacementReferenceId();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearPlacementType() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearPlacementType();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearReason() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearReason();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a clearSessionId() {
                this.copyOnWrite();
                ((SDKError)this.instance).clearSessionId();
                return this;
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getAdSource() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getAdSourceBytes() {
                return ((SDKError)this.instance).getAdSourceBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public long getAt() {
                return ((SDKError)this.instance).getAt();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getConnectionType() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getConnectionTypeBytes() {
                return ((SDKError)this.instance).getConnectionTypeBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getConnectionTypeDetail() {
                return ((SDKError)this.instance).getConnectionTypeDetail();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getConnectionTypeDetailAndroid() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getConnectionTypeDetailAndroidBytes() {
                return ((SDKError)this.instance).getConnectionTypeDetailAndroidBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getConnectionTypeDetailBytes() {
                return ((SDKError)this.instance).getConnectionTypeDetailBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getCreativeId() {
                return ((SDKError)this.instance).getCreativeId();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getCreativeIdBytes() {
                return ((SDKError)this.instance).getCreativeIdBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getEventId() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getEventIdBytes() {
                return ((SDKError)this.instance).getEventIdBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public long getIsHbPlacement() {
                return ((SDKError)this.instance).getIsHbPlacement();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public boolean getIsLowDataModeEnabled() {
                return ((SDKError)this.instance).getIsLowDataModeEnabled();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getMake() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getMakeBytes() {
                return ((SDKError)this.instance).getMakeBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getMessage() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getMessageBytes() {
                return ((SDKError)this.instance).getMessageBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getModel() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getModelBytes() {
                return ((SDKError)this.instance).getModelBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getOs() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getOsBytes() {
                return ((SDKError)this.instance).getOsBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getOsVersion() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getOsVersionBytes() {
                return ((SDKError)this.instance).getOsVersionBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getPlacementReferenceId() {
                return ((SDKError)this.instance).getPlacementReferenceId();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getPlacementReferenceIdBytes() {
                return ((SDKError)this.instance).getPlacementReferenceIdBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getPlacementType() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getPlacementTypeBytes() {
                return ((SDKError)this.instance).getPlacementTypeBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public com.vungle.ads.internal.protos.Sdk.SDKError.b getReason() {
                return ((SDKError)this.instance).getReason();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public int getReasonValue() {
                return ((SDKError)this.instance).getReasonValue();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public String getSessionId() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$d
            public ByteString getSessionIdBytes() {
                return ((SDKError)this.instance).getSessionIdBytes();
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setAdSource(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setAdSource(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setAdSourceBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setAdSourceBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setAt(long v) {
                this.copyOnWrite();
                ((SDKError)this.instance).setAt(v);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setConnectionType(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setConnectionType(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setConnectionTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setConnectionTypeBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setConnectionTypeDetail(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setConnectionTypeDetail(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setConnectionTypeDetailAndroid(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setConnectionTypeDetailAndroid(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setConnectionTypeDetailAndroidBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setConnectionTypeDetailAndroidBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setConnectionTypeDetailBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setConnectionTypeDetailBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setCreativeId(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setCreativeId(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setCreativeIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setCreativeIdBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setEventId(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setEventId(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setEventIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setEventIdBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setIsHbPlacement(long v) {
                this.copyOnWrite();
                ((SDKError)this.instance).setIsHbPlacement(v);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setIsLowDataModeEnabled(boolean z) {
                this.copyOnWrite();
                ((SDKError)this.instance).setIsLowDataModeEnabled(z);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setMake(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setMake(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setMakeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setMakeBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setMessage(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setMessage(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setMessageBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setMessageBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setModel(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setModel(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setModelBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setModelBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setOs(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setOs(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setOsBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setOsBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setOsVersion(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setOsVersion(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setOsVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setOsVersionBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setPlacementReferenceId(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setPlacementReferenceId(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setPlacementReferenceIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setPlacementReferenceIdBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setPlacementType(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setPlacementType(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setPlacementTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setPlacementTypeBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setReason(com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setReason(sdk$SDKError$b0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setReasonValue(int v) {
                this.copyOnWrite();
                ((SDKError)this.instance).setReasonValue(v);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setSessionId(String s) {
                this.copyOnWrite();
                ((SDKError)this.instance).setSessionId(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKError.a setSessionIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKError)this.instance).setSessionIdBytes(byteString0);
                return this;
            }
        }

        public static enum com.vungle.ads.internal.protos.Sdk.SDKError.b implements EnumLite {
            class com.vungle.ads.internal.protos.Sdk.SDKError.b.a implements EnumLiteMap {
                com.vungle.ads.internal.protos.Sdk.SDKError.b.a() {
                    super();
                }

                @Override  // com.google.protobuf.Internal$EnumLiteMap
                public EnumLite findValueByNumber(int v) {
                    return this.findValueByNumber(v);
                }

                public com.vungle.ads.internal.protos.Sdk.SDKError.b findValueByNumber(int v) {
                    return com.vungle.ads.internal.protos.Sdk.SDKError.b.forNumber(v);
                }
            }

            static final class com.vungle.ads.internal.protos.Sdk.SDKError.b.b implements EnumVerifier {
                static final EnumVerifier INSTANCE;

                static {
                    com.vungle.ads.internal.protos.Sdk.SDKError.b.b.INSTANCE = new com.vungle.ads.internal.protos.Sdk.SDKError.b.b();
                }

                @Override  // com.google.protobuf.Internal$EnumVerifier
                public boolean isInRange(int v) {
                    return com.vungle.ads.internal.protos.Sdk.SDKError.b.forNumber(v) != null;
                }
            }

            UNKNOWN_ERROR(0),
            INVALID_APP_ID(2),
            CURRENTLY_INITIALIZING(3),
            ALREADY_INITIALIZED(4),
            SDK_NOT_INITIALIZED(6),
            USER_AGENT_ERROR(7),
            API_REQUEST_ERROR(101),
            API_RESPONSE_DATA_ERROR(102),
            API_RESPONSE_DECODE_ERROR(103),
            API_FAILED_STATUS_CODE(104),
            INVALID_TEMPLATE_URL(105),
            INVALID_REQUEST_BUILDER_ERROR(106),
            TEMPLATE_UNZIP_ERROR(109),
            INVALID_CTA_URL(110),
            INVALID_ASSET_URL(0x6F),
            ASSET_REQUEST_ERROR(0x70),
            ASSET_RESPONSE_DATA_ERROR(0x71),
            ASSET_WRITE_ERROR(0x72),
            INVALID_INDEX_URL(0x73),
            GZIP_ENCODE_ERROR(0x74),
            ASSET_FAILED_STATUS_CODE(0x75),
            PROTOBUF_SERIALIZATION_ERROR(0x76),
            JSON_ENCODE_ERROR(0x77),
            TPAT_ERROR(0x79),
            INVALID_ADS_ENDPOINT(0x7A),
            INVALID_RI_ENDPOINT(0x7B),
            INVALID_LOG_ERROR_ENDPOINT(0x7C),
            INVALID_METRICS_ENDPOINT(0x7D),
            ASSET_FAILED_INSUFFICIENT_SPACE(0x7E),
            ASSET_FAILED_MAX_SPACE_EXCEEDED(0x7F),
            INVALID_TPAT_KEY(0x80),
            EMPTY_TPAT_ERROR(0x81),
            MRAID_DOWNLOAD_JS_ERROR(130),
            MRAID_JS_WRITE_FAILED(0x83),
            OMSDK_DOWNLOAD_JS_ERROR(0x84),
            OMSDK_JS_WRITE_FAILED(0x85),
            STORE_REGION_CODE_ERROR(0x86),
            INVALID_CONFIG_RESPONSE(0x87),
            PRIVACY_URL_ERROR(0x88),
            TPAT_RETRY_FAILED(0x89),
            CONFIG_REFRESH_FAILED(0x8A),
            INVALID_EVENT_ID_ERROR(200),
            INVALID_PLACEMENT_ID(201),
            AD_CONSUMED(202),
            AD_IS_LOADING(203),
            AD_ALREADY_LOADED(204),
            AD_IS_PLAYING(205),
            AD_ALREADY_FAILED(206),
            PLACEMENT_AD_TYPE_MISMATCH(0xCF),
            INVALID_BID_PAYLOAD(0xD0),
            INVALID_JSON_BID_PAYLOAD(209),
            AD_NOT_LOADED(210),
            PLACEMENT_SLEEP(0xD4),
            INVALID_ADUNIT_BID_PAYLOAD(0xD5),
            INVALID_GZIP_BID_PAYLOAD(0xD6),
            AD_RESPONSE_EMPTY(0xD7),
            AD_RESPONSE_INVALID_TEMPLATE_TYPE(0xD8),
            AD_RESPONSE_TIMED_OUT(0xD9),
            MRAID_JS_DOES_NOT_EXIST(0xDA),
            MRAID_JS_COPY_FAILED(0xDB),
            AD_RESPONSE_RETRY_AFTER(220),
            AD_LOAD_FAIL_RETRY_AFTER(0xDD),
            INVALID_WATERFALL_PLACEMENT_ID(0xDE),
            STALE_CACHED_RESPONSE(0xDF),
            AD_NO_FILL(10001),
            AD_LOAD_TOO_FREQUENTLY(10002),
            AD_SERVER_ERROR(20001),
            AD_PUBLISHER_MISMATCH(30001),
            AD_INTERNAL_INTEGRATION_ERROR(30002),
            CONFIG_NOT_FOUND_ERROR(30003),
            MRAID_ERROR(301),
            INVALID_IFA_STATUS(302),
            AD_EXPIRED(304),
            MRAID_BRIDGE_ERROR(305),
            AD_EXPIRED_ON_PLAY(307),
            AD_WIN_NOTIFICATION_ERROR(308),
            ASSET_FAILED_TO_DELETE(309),
            AD_HTML_FAILED_TO_LOAD(310),
            MRAID_JS_CALL_EMPTY(311),
            DEEPLINK_OPEN_FAILED(312),
            EVALUATE_JAVASCRIPT_FAILED(313),
            LINK_COMMAND_OPEN_FAILED(314),
            JSON_PARAMS_ENCODE_ERROR(315),
            GENERATE_JSON_DATA_ERROR(316),
            AD_CLOSED_TEMPLATE_ERROR(317),
            AD_CLOSED_MISSING_HEARTBEAT(318),
            SILENT_MODE_MONITOR_ERROR(0x13F),
            WEBVIEW_ERROR(320),
            CONCURRENT_PLAYBACK_UNSUPPORTED(400),
            BANNER_VIEW_INVALID_SIZE(500),
            NATIVE_ASSET_ERROR(600),
            WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE(2000),
            WEB_VIEW_FAILED_NAVIGATION(2001),
            STORE_KIT_LOAD_ERROR(2002),
            OMSDK_COPY_ERROR(2003),
            STORE_OVERLAY_LOAD_ERROR(2004),
            REACHABILITY_INITIALIZATION_FAILED(2005),
            UNKNOWN_RADIO_ACCESS_TECHNOLOGY(2006),
            STORE_KIT_PRESENTATION_ERROR(2007),
            STORE_OVERLAY_PRESENTATION_ERROR(2008),
            INVALID_PLAY_PARAMETER(2009),
            OUT_OF_MEMORY(3001),
            UNRECOGNIZED(-1);

            public static final int AD_ALREADY_FAILED_VALUE = 206;
            public static final int AD_ALREADY_LOADED_VALUE = 204;
            public static final int AD_CLOSED_MISSING_HEARTBEAT_VALUE = 318;
            public static final int AD_CLOSED_TEMPLATE_ERROR_VALUE = 317;
            public static final int AD_CONSUMED_VALUE = 202;
            public static final int AD_EXPIRED_ON_PLAY_VALUE = 307;
            public static final int AD_EXPIRED_VALUE = 304;
            public static final int AD_HTML_FAILED_TO_LOAD_VALUE = 310;
            public static final int AD_INTERNAL_INTEGRATION_ERROR_VALUE = 30002;
            public static final int AD_IS_LOADING_VALUE = 203;
            public static final int AD_IS_PLAYING_VALUE = 205;
            public static final int AD_LOAD_FAIL_RETRY_AFTER_VALUE = 0xDD;
            public static final int AD_LOAD_TOO_FREQUENTLY_VALUE = 10002;
            public static final int AD_NOT_LOADED_VALUE = 210;
            public static final int AD_NO_FILL_VALUE = 10001;
            public static final int AD_PUBLISHER_MISMATCH_VALUE = 30001;
            public static final int AD_RESPONSE_EMPTY_VALUE = 0xD7;
            public static final int AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE = 0xD8;
            public static final int AD_RESPONSE_RETRY_AFTER_VALUE = 220;
            public static final int AD_RESPONSE_TIMED_OUT_VALUE = 0xD9;
            public static final int AD_SERVER_ERROR_VALUE = 20001;
            public static final int AD_WIN_NOTIFICATION_ERROR_VALUE = 308;
            public static final int ALREADY_INITIALIZED_VALUE = 4;
            public static final int API_FAILED_STATUS_CODE_VALUE = 104;
            public static final int API_REQUEST_ERROR_VALUE = 101;
            public static final int API_RESPONSE_DATA_ERROR_VALUE = 102;
            public static final int API_RESPONSE_DECODE_ERROR_VALUE = 103;
            public static final int ASSET_FAILED_INSUFFICIENT_SPACE_VALUE = 0x7E;
            public static final int ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE = 0x7F;
            public static final int ASSET_FAILED_STATUS_CODE_VALUE = 0x75;
            public static final int ASSET_FAILED_TO_DELETE_VALUE = 309;
            public static final int ASSET_REQUEST_ERROR_VALUE = 0x70;
            public static final int ASSET_RESPONSE_DATA_ERROR_VALUE = 0x71;
            public static final int ASSET_WRITE_ERROR_VALUE = 0x72;
            public static final int BANNER_VIEW_INVALID_SIZE_VALUE = 500;
            public static final int CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE = 400;
            public static final int CONFIG_NOT_FOUND_ERROR_VALUE = 30003;
            public static final int CONFIG_REFRESH_FAILED_VALUE = 0x8A;
            public static final int CURRENTLY_INITIALIZING_VALUE = 3;
            public static final int DEEPLINK_OPEN_FAILED_VALUE = 312;
            public static final int EMPTY_TPAT_ERROR_VALUE = 0x81;
            public static final int EVALUATE_JAVASCRIPT_FAILED_VALUE = 313;
            public static final int GENERATE_JSON_DATA_ERROR_VALUE = 316;
            public static final int GZIP_ENCODE_ERROR_VALUE = 0x74;
            public static final int INVALID_ADS_ENDPOINT_VALUE = 0x7A;
            public static final int INVALID_ADUNIT_BID_PAYLOAD_VALUE = 0xD5;
            public static final int INVALID_APP_ID_VALUE = 2;
            public static final int INVALID_ASSET_URL_VALUE = 0x6F;
            public static final int INVALID_BID_PAYLOAD_VALUE = 0xD0;
            public static final int INVALID_CONFIG_RESPONSE_VALUE = 0x87;
            public static final int INVALID_CTA_URL_VALUE = 110;
            public static final int INVALID_EVENT_ID_ERROR_VALUE = 200;
            public static final int INVALID_GZIP_BID_PAYLOAD_VALUE = 0xD6;
            public static final int INVALID_IFA_STATUS_VALUE = 302;
            public static final int INVALID_INDEX_URL_VALUE = 0x73;
            public static final int INVALID_JSON_BID_PAYLOAD_VALUE = 209;
            public static final int INVALID_LOG_ERROR_ENDPOINT_VALUE = 0x7C;
            public static final int INVALID_METRICS_ENDPOINT_VALUE = 0x7D;
            public static final int INVALID_PLACEMENT_ID_VALUE = 201;
            public static final int INVALID_PLAY_PARAMETER_VALUE = 2009;
            public static final int INVALID_REQUEST_BUILDER_ERROR_VALUE = 106;
            public static final int INVALID_RI_ENDPOINT_VALUE = 0x7B;
            public static final int INVALID_TEMPLATE_URL_VALUE = 105;
            public static final int INVALID_TPAT_KEY_VALUE = 0x80;
            public static final int INVALID_WATERFALL_PLACEMENT_ID_VALUE = 0xDE;
            public static final int JSON_ENCODE_ERROR_VALUE = 0x77;
            public static final int JSON_PARAMS_ENCODE_ERROR_VALUE = 315;
            public static final int LINK_COMMAND_OPEN_FAILED_VALUE = 314;
            public static final int MRAID_BRIDGE_ERROR_VALUE = 305;
            public static final int MRAID_DOWNLOAD_JS_ERROR_VALUE = 130;
            public static final int MRAID_ERROR_VALUE = 301;
            public static final int MRAID_JS_CALL_EMPTY_VALUE = 311;
            public static final int MRAID_JS_COPY_FAILED_VALUE = 0xDB;
            public static final int MRAID_JS_DOES_NOT_EXIST_VALUE = 0xDA;
            public static final int MRAID_JS_WRITE_FAILED_VALUE = 0x83;
            public static final int NATIVE_ASSET_ERROR_VALUE = 600;
            public static final int OMSDK_COPY_ERROR_VALUE = 2003;
            public static final int OMSDK_DOWNLOAD_JS_ERROR_VALUE = 0x84;
            public static final int OMSDK_JS_WRITE_FAILED_VALUE = 0x85;
            public static final int OUT_OF_MEMORY_VALUE = 3001;
            public static final int PLACEMENT_AD_TYPE_MISMATCH_VALUE = 0xCF;
            public static final int PLACEMENT_SLEEP_VALUE = 0xD4;
            public static final int PRIVACY_URL_ERROR_VALUE = 0x88;
            public static final int PROTOBUF_SERIALIZATION_ERROR_VALUE = 0x76;
            public static final int REACHABILITY_INITIALIZATION_FAILED_VALUE = 2005;
            public static final int SDK_NOT_INITIALIZED_VALUE = 6;
            public static final int SILENT_MODE_MONITOR_ERROR_VALUE = 0x13F;
            public static final int STALE_CACHED_RESPONSE_VALUE = 0xDF;
            public static final int STORE_KIT_LOAD_ERROR_VALUE = 2002;
            public static final int STORE_KIT_PRESENTATION_ERROR_VALUE = 2007;
            public static final int STORE_OVERLAY_LOAD_ERROR_VALUE = 2004;
            public static final int STORE_OVERLAY_PRESENTATION_ERROR_VALUE = 2008;
            public static final int STORE_REGION_CODE_ERROR_VALUE = 0x86;
            public static final int TEMPLATE_UNZIP_ERROR_VALUE = 109;
            public static final int TPAT_ERROR_VALUE = 0x79;
            public static final int TPAT_RETRY_FAILED_VALUE = 0x89;
            public static final int UNKNOWN_ERROR_VALUE = 0;
            public static final int UNKNOWN_RADIO_ACCESS_TECHNOLOGY_VALUE = 2006;
            public static final int USER_AGENT_ERROR_VALUE = 7;
            public static final int WEBVIEW_ERROR_VALUE = 320;
            public static final int WEB_VIEW_FAILED_NAVIGATION_VALUE = 2001;
            public static final int WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE_VALUE = 2000;
            private static final EnumLiteMap internalValueMap;
            private final int value;

            private static com.vungle.ads.internal.protos.Sdk.SDKError.b[] $values() [...] // Inlined contents

            static {
                com.vungle.ads.internal.protos.Sdk.SDKError.b.internalValueMap = new com.vungle.ads.internal.protos.Sdk.SDKError.b.a();
            }

            private com.vungle.ads.internal.protos.Sdk.SDKError.b(int v1) {
                this.value = v1;
            }

            public static com.vungle.ads.internal.protos.Sdk.SDKError.b forNumber(int v) {
                switch(v) {
                    case 0: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.UNKNOWN_ERROR;
                    }
                    case 2: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_APP_ID;
                    }
                    case 3: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.CURRENTLY_INITIALIZING;
                    }
                    case 4: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.ALREADY_INITIALIZED;
                    }
                    case 6: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.SDK_NOT_INITIALIZED;
                    }
                    case 7: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.USER_AGENT_ERROR;
                    }
                    case 101: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.API_REQUEST_ERROR;
                    }
                    case 102: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.API_RESPONSE_DATA_ERROR;
                    }
                    case 103: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.API_RESPONSE_DECODE_ERROR;
                    }
                    case 104: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.API_FAILED_STATUS_CODE;
                    }
                    case 105: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_TEMPLATE_URL;
                    }
                    case 106: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_REQUEST_BUILDER_ERROR;
                    }
                    case 109: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.TEMPLATE_UNZIP_ERROR;
                    }
                    case 110: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_CTA_URL;
                    }
                    case 0x6F: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_ASSET_URL;
                    }
                    case 0x70: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_REQUEST_ERROR;
                    }
                    case 0x71: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_RESPONSE_DATA_ERROR;
                    }
                    case 0x72: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_WRITE_ERROR;
                    }
                    case 0x73: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_INDEX_URL;
                    }
                    case 0x74: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.GZIP_ENCODE_ERROR;
                    }
                    case 0x75: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_FAILED_STATUS_CODE;
                    }
                    case 0x76: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.PROTOBUF_SERIALIZATION_ERROR;
                    }
                    case 0x77: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.JSON_ENCODE_ERROR;
                    }
                    case 0x79: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_ERROR;
                    }
                    case 0x7A: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_ADS_ENDPOINT;
                    }
                    case 0x7B: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_RI_ENDPOINT;
                    }
                    case 0x7C: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_LOG_ERROR_ENDPOINT;
                    }
                    case 0x7D: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_METRICS_ENDPOINT;
                    }
                    case 0x7E: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE;
                    }
                    case 0x7F: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED;
                    }
                    case 0x80: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_TPAT_KEY;
                    }
                    case 0x81: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.EMPTY_TPAT_ERROR;
                    }
                    case 130: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_DOWNLOAD_JS_ERROR;
                    }
                    case 0x83: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_JS_WRITE_FAILED;
                    }
                    case 0x84: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.OMSDK_DOWNLOAD_JS_ERROR;
                    }
                    case 0x85: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.OMSDK_JS_WRITE_FAILED;
                    }
                    case 0x86: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.STORE_REGION_CODE_ERROR;
                    }
                    case 0x87: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_CONFIG_RESPONSE;
                    }
                    case 0x88: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.PRIVACY_URL_ERROR;
                    }
                    case 0x89: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_RETRY_FAILED;
                    }
                    case 0x8A: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.CONFIG_REFRESH_FAILED;
                    }
                    case 200: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_EVENT_ID_ERROR;
                    }
                    case 201: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_PLACEMENT_ID;
                    }
                    case 202: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_CONSUMED;
                    }
                    case 203: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_IS_LOADING;
                    }
                    case 204: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_ALREADY_LOADED;
                    }
                    case 205: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_IS_PLAYING;
                    }
                    case 206: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_ALREADY_FAILED;
                    }
                    case 0xCF: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.PLACEMENT_AD_TYPE_MISMATCH;
                    }
                    case 0xD0: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_BID_PAYLOAD;
                    }
                    case 209: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_JSON_BID_PAYLOAD;
                    }
                    case 210: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_NOT_LOADED;
                    }
                    case 0xD4: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.PLACEMENT_SLEEP;
                    }
                    case 0xD5: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_ADUNIT_BID_PAYLOAD;
                    }
                    case 0xD6: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_GZIP_BID_PAYLOAD;
                    }
                    case 0xD7: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_RESPONSE_EMPTY;
                    }
                    case 0xD8: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_RESPONSE_INVALID_TEMPLATE_TYPE;
                    }
                    case 0xD9: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_RESPONSE_TIMED_OUT;
                    }
                    case 0xDA: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_JS_DOES_NOT_EXIST;
                    }
                    case 0xDB: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_JS_COPY_FAILED;
                    }
                    case 220: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_RESPONSE_RETRY_AFTER;
                    }
                    case 0xDD: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_LOAD_FAIL_RETRY_AFTER;
                    }
                    case 0xDE: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_WATERFALL_PLACEMENT_ID;
                    }
                    case 0xDF: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.STALE_CACHED_RESPONSE;
                    }
                    case 301: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_ERROR;
                    }
                    case 302: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_IFA_STATUS;
                    }
                    case 304: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_EXPIRED;
                    }
                    case 305: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_BRIDGE_ERROR;
                    }
                    case 307: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_EXPIRED_ON_PLAY;
                    }
                    case 308: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_WIN_NOTIFICATION_ERROR;
                    }
                    case 309: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.ASSET_FAILED_TO_DELETE;
                    }
                    case 310: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_HTML_FAILED_TO_LOAD;
                    }
                    case 311: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_JS_CALL_EMPTY;
                    }
                    case 312: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.DEEPLINK_OPEN_FAILED;
                    }
                    case 313: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.EVALUATE_JAVASCRIPT_FAILED;
                    }
                    case 314: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.LINK_COMMAND_OPEN_FAILED;
                    }
                    case 315: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.JSON_PARAMS_ENCODE_ERROR;
                    }
                    case 316: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.GENERATE_JSON_DATA_ERROR;
                    }
                    case 317: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_CLOSED_TEMPLATE_ERROR;
                    }
                    case 318: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_CLOSED_MISSING_HEARTBEAT;
                    }
                    case 0x13F: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.SILENT_MODE_MONITOR_ERROR;
                    }
                    case 320: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.WEBVIEW_ERROR;
                    }
                    case 400: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.CONCURRENT_PLAYBACK_UNSUPPORTED;
                    }
                    case 500: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.BANNER_VIEW_INVALID_SIZE;
                    }
                    case 600: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.NATIVE_ASSET_ERROR;
                    }
                    case 2000: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE;
                    }
                    case 2001: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.WEB_VIEW_FAILED_NAVIGATION;
                    }
                    case 2002: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.STORE_KIT_LOAD_ERROR;
                    }
                    case 2003: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.OMSDK_COPY_ERROR;
                    }
                    case 2004: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.STORE_OVERLAY_LOAD_ERROR;
                    }
                    case 2005: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.REACHABILITY_INITIALIZATION_FAILED;
                    }
                    case 2006: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.UNKNOWN_RADIO_ACCESS_TECHNOLOGY;
                    }
                    case 2007: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.STORE_KIT_PRESENTATION_ERROR;
                    }
                    case 2008: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.STORE_OVERLAY_PRESENTATION_ERROR;
                    }
                    case 2009: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.INVALID_PLAY_PARAMETER;
                    }
                    case 3001: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.OUT_OF_MEMORY;
                    }
                    case 10001: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_NO_FILL;
                    }
                    case 10002: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_LOAD_TOO_FREQUENTLY;
                    }
                    case 20001: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_SERVER_ERROR;
                    }
                    case 30001: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_PUBLISHER_MISMATCH;
                    }
                    case 30002: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_INTERNAL_INTEGRATION_ERROR;
                    }
                    case 30003: {
                        return com.vungle.ads.internal.protos.Sdk.SDKError.b.CONFIG_NOT_FOUND_ERROR;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Override  // com.google.protobuf.Internal$EnumLite
            public final int getNumber() {
                if(this == com.vungle.ads.internal.protos.Sdk.SDKError.b.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                }
                return this.value;
            }

            public static EnumLiteMap internalGetValueMap() {
                return com.vungle.ads.internal.protos.Sdk.SDKError.b.internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return com.vungle.ads.internal.protos.Sdk.SDKError.b.b.INSTANCE;
            }

            @Deprecated
            public static com.vungle.ads.internal.protos.Sdk.SDKError.b valueOf(int v) {
                return com.vungle.ads.internal.protos.Sdk.SDKError.b.forNumber(v);
            }
        }

        public static final int ADSOURCE_FIELD_NUMBER = 16;
        public static final int AT_FIELD_NUMBER = 1;
        public static final int CONNECTIONTYPEDETAILANDROID_FIELD_NUMBER = 101;
        public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 10;
        public static final int CONNECTIONTYPE_FIELD_NUMBER = 9;
        public static final int CREATIVEID_FIELD_NUMBER = 12;
        private static final SDKError DEFAULT_INSTANCE = null;
        public static final int EVENTID_FIELD_NUMBER = 4;
        public static final int ISHBPLACEMENT_FIELD_NUMBER = 14;
        public static final int ISLOWDATAMODEENABLED_FIELD_NUMBER = 201;
        public static final int MAKE_FIELD_NUMBER = 5;
        public static final int MESSAGE_FIELD_NUMBER = 3;
        public static final int MODEL_FIELD_NUMBER = 6;
        public static final int OSVERSION_FIELD_NUMBER = 8;
        public static final int OS_FIELD_NUMBER = 7;
        private static volatile Parser PARSER = null;
        public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 11;
        public static final int PLACEMENTTYPE_FIELD_NUMBER = 15;
        public static final int REASON_FIELD_NUMBER = 2;
        public static final int SESSIONID_FIELD_NUMBER = 13;
        private String adSource_;
        private long at_;
        private String connectionTypeDetailAndroid_;
        private String connectionTypeDetail_;
        private String connectionType_;
        private String creativeId_;
        private String eventId_;
        private long isHbPlacement_;
        private boolean isLowDataModeEnabled_;
        private String make_;
        private String message_;
        private String model_;
        private String osVersion_;
        private String os_;
        private String placementReferenceId_;
        private String placementType_;
        private int reason_;
        private String sessionId_;

        static {
            SDKError sdk$SDKError0 = new SDKError();
            SDKError.DEFAULT_INSTANCE = sdk$SDKError0;
            GeneratedMessageLite.registerDefaultInstance(SDKError.class, sdk$SDKError0);
        }

        private SDKError() {
            this.message_ = "";
            this.eventId_ = "";
            this.make_ = "";
            this.model_ = "";
            this.os_ = "";
            this.osVersion_ = "";
            this.connectionType_ = "";
            this.connectionTypeDetail_ = "";
            this.placementReferenceId_ = "";
            this.creativeId_ = "";
            this.sessionId_ = "";
            this.placementType_ = "";
            this.adSource_ = "";
            this.connectionTypeDetailAndroid_ = "";
        }

        private void clearAdSource() {
            this.adSource_ = "";
        }

        private void clearAt() {
            this.at_ = 0L;
        }

        private void clearConnectionType() {
            this.connectionType_ = "";
        }

        private void clearConnectionTypeDetail() {
            this.connectionTypeDetail_ = "";
        }

        private void clearConnectionTypeDetailAndroid() {
            this.connectionTypeDetailAndroid_ = "";
        }

        private void clearCreativeId() {
            this.creativeId_ = "";
        }

        private void clearEventId() {
            this.eventId_ = "";
        }

        private void clearIsHbPlacement() {
            this.isHbPlacement_ = 0L;
        }

        private void clearIsLowDataModeEnabled() {
            this.isLowDataModeEnabled_ = false;
        }

        private void clearMake() {
            this.make_ = "";
        }

        private void clearMessage() {
            this.message_ = "";
        }

        private void clearModel() {
            this.model_ = "";
        }

        private void clearOs() {
            this.os_ = "";
        }

        private void clearOsVersion() {
            this.osVersion_ = "";
        }

        private void clearPlacementReferenceId() {
            this.placementReferenceId_ = "";
        }

        private void clearPlacementType() {
            this.placementType_ = "";
        }

        private void clearReason() {
            this.reason_ = 0;
        }

        private void clearSessionId() {
            this.sessionId_ = "";
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new SDKError();
                }
                case 2: {
                    return new com.vungle.ads.internal.protos.Sdk.SDKError.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(SDKError.DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001É\u0012\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000BȈ\fȈ\rȈ\u000E\u0002\u000FȈ\u0010ȈeȈÉ\u0007", new Object[]{"at_", "reason_", "message_", "eventId_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "sessionId_", "isHbPlacement_", "placementType_", "adSource_", "connectionTypeDetailAndroid_", "isLowDataModeEnabled_"});
                }
                case 4: {
                    return SDKError.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = SDKError.PARSER;
                    if(parser0 == null) {
                        Class class0 = SDKError.class;
                        synchronized(class0) {
                            parser0 = SDKError.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(SDKError.DEFAULT_INSTANCE);
                                SDKError.PARSER = parser0;
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

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getAdSource() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getAdSourceBytes() {
            return ByteString.copyFromUtf8(this.adSource_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public long getAt() {
            return this.at_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getConnectionType() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getConnectionTypeBytes() {
            return ByteString.copyFromUtf8(this.connectionType_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getConnectionTypeDetail() {
            return this.connectionTypeDetail_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getConnectionTypeDetailAndroid() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getConnectionTypeDetailAndroidBytes() {
            return ByteString.copyFromUtf8(this.connectionTypeDetailAndroid_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getConnectionTypeDetailBytes() {
            return ByteString.copyFromUtf8(this.connectionTypeDetail_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getCreativeId() {
            return this.creativeId_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getCreativeIdBytes() {
            return ByteString.copyFromUtf8(this.creativeId_);
        }

        public static SDKError getDefaultInstance() {
            return SDKError.DEFAULT_INSTANCE;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getEventId() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getEventIdBytes() {
            return ByteString.copyFromUtf8(this.eventId_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public long getIsHbPlacement() {
            return this.isHbPlacement_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public boolean getIsLowDataModeEnabled() {
            return this.isLowDataModeEnabled_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getMake() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getMakeBytes() {
            return ByteString.copyFromUtf8(this.make_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getMessage() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getModel() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getOs() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getOsBytes() {
            return ByteString.copyFromUtf8(this.os_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getOsVersion() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getPlacementReferenceId() {
            return this.placementReferenceId_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getPlacementReferenceIdBytes() {
            return ByteString.copyFromUtf8(this.placementReferenceId_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getPlacementType() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getPlacementTypeBytes() {
            return ByteString.copyFromUtf8(this.placementType_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public com.vungle.ads.internal.protos.Sdk.SDKError.b getReason() {
            com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0 = com.vungle.ads.internal.protos.Sdk.SDKError.b.forNumber(this.reason_);
            return sdk$SDKError$b0 == null ? com.vungle.ads.internal.protos.Sdk.SDKError.b.UNRECOGNIZED : sdk$SDKError$b0;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public int getReasonValue() {
            return this.reason_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public String getSessionId() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$d
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        public static com.vungle.ads.internal.protos.Sdk.SDKError.a newBuilder() {
            return (com.vungle.ads.internal.protos.Sdk.SDKError.a)SDKError.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.vungle.ads.internal.protos.Sdk.SDKError.a newBuilder(SDKError sdk$SDKError0) {
            return (com.vungle.ads.internal.protos.Sdk.SDKError.a)SDKError.DEFAULT_INSTANCE.createBuilder(sdk$SDKError0);
        }

        public static SDKError parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (SDKError)GeneratedMessageLite.parseDelimitedFrom(SDKError.DEFAULT_INSTANCE, inputStream0);
        }

        public static SDKError parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SDKError)GeneratedMessageLite.parseDelimitedFrom(SDKError.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static SDKError parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (SDKError)GeneratedMessageLite.parseFrom(SDKError.DEFAULT_INSTANCE, byteString0);
        }

        public static SDKError parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SDKError)GeneratedMessageLite.parseFrom(SDKError.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static SDKError parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (SDKError)GeneratedMessageLite.parseFrom(SDKError.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static SDKError parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SDKError)GeneratedMessageLite.parseFrom(SDKError.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static SDKError parseFrom(InputStream inputStream0) throws IOException {
            return (SDKError)GeneratedMessageLite.parseFrom(SDKError.DEFAULT_INSTANCE, inputStream0);
        }

        public static SDKError parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SDKError)GeneratedMessageLite.parseFrom(SDKError.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static SDKError parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (SDKError)GeneratedMessageLite.parseFrom(SDKError.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static SDKError parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SDKError)GeneratedMessageLite.parseFrom(SDKError.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static SDKError parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (SDKError)GeneratedMessageLite.parseFrom(SDKError.DEFAULT_INSTANCE, arr_b);
        }

        public static SDKError parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SDKError)GeneratedMessageLite.parseFrom(SDKError.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return SDKError.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdSource(String s) {
            s.getClass();
            this.adSource_ = s;
        }

        private void setAdSourceBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.adSource_ = byteString0.toStringUtf8();
        }

        private void setAt(long v) {
            this.at_ = v;
        }

        private void setConnectionType(String s) {
            s.getClass();
            this.connectionType_ = s;
        }

        private void setConnectionTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.connectionType_ = byteString0.toStringUtf8();
        }

        private void setConnectionTypeDetail(String s) {
            s.getClass();
            this.connectionTypeDetail_ = s;
        }

        private void setConnectionTypeDetailAndroid(String s) {
            s.getClass();
            this.connectionTypeDetailAndroid_ = s;
        }

        private void setConnectionTypeDetailAndroidBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.connectionTypeDetailAndroid_ = byteString0.toStringUtf8();
        }

        private void setConnectionTypeDetailBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.connectionTypeDetail_ = byteString0.toStringUtf8();
        }

        private void setCreativeId(String s) {
            s.getClass();
            this.creativeId_ = s;
        }

        private void setCreativeIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.creativeId_ = byteString0.toStringUtf8();
        }

        private void setEventId(String s) {
            s.getClass();
            this.eventId_ = s;
        }

        private void setEventIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.eventId_ = byteString0.toStringUtf8();
        }

        private void setIsHbPlacement(long v) {
            this.isHbPlacement_ = v;
        }

        private void setIsLowDataModeEnabled(boolean z) {
            this.isLowDataModeEnabled_ = z;
        }

        private void setMake(String s) {
            s.getClass();
            this.make_ = s;
        }

        private void setMakeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.make_ = byteString0.toStringUtf8();
        }

        private void setMessage(String s) {
            s.getClass();
            this.message_ = s;
        }

        private void setMessageBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.message_ = byteString0.toStringUtf8();
        }

        private void setModel(String s) {
            s.getClass();
            this.model_ = s;
        }

        private void setModelBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.model_ = byteString0.toStringUtf8();
        }

        private void setOs(String s) {
            s.getClass();
            this.os_ = s;
        }

        private void setOsBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.os_ = byteString0.toStringUtf8();
        }

        private void setOsVersion(String s) {
            s.getClass();
            this.osVersion_ = s;
        }

        private void setOsVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.osVersion_ = byteString0.toStringUtf8();
        }

        private void setPlacementReferenceId(String s) {
            s.getClass();
            this.placementReferenceId_ = s;
        }

        private void setPlacementReferenceIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.placementReferenceId_ = byteString0.toStringUtf8();
        }

        private void setPlacementType(String s) {
            s.getClass();
            this.placementType_ = s;
        }

        private void setPlacementTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.placementType_ = byteString0.toStringUtf8();
        }

        private void setReason(com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0) {
            this.reason_ = sdk$SDKError$b0.getNumber();
        }

        private void setReasonValue(int v) {
            this.reason_ = v;
        }

        private void setSessionId(String s) {
            s.getClass();
            this.sessionId_ = s;
        }

        private void setSessionIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.sessionId_ = byteString0.toStringUtf8();
        }
    }

    public static final class SDKErrorBatch extends GeneratedMessageLite implements c {
        public static final class com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a extends Builder implements c {
            private com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a() {
                super(SDKErrorBatch.DEFAULT_INSTANCE);
            }

            com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a(com.vungle.ads.internal.protos.Sdk.a sdk$a0) {
            }

            public com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a addAllErrors(Iterable iterable0) {
                this.copyOnWrite();
                ((SDKErrorBatch)this.instance).addAllErrors(iterable0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a addErrors(int v, com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a0) {
                this.copyOnWrite();
                ((SDKErrorBatch)this.instance).addErrors(v, ((SDKError)sdk$SDKError$a0.build()));
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a addErrors(int v, SDKError sdk$SDKError0) {
                this.copyOnWrite();
                ((SDKErrorBatch)this.instance).addErrors(v, sdk$SDKError0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a addErrors(com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a0) {
                this.copyOnWrite();
                ((SDKErrorBatch)this.instance).addErrors(((SDKError)sdk$SDKError$a0.build()));
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a addErrors(SDKError sdk$SDKError0) {
                this.copyOnWrite();
                ((SDKErrorBatch)this.instance).addErrors(sdk$SDKError0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a clearErrors() {
                this.copyOnWrite();
                ((SDKErrorBatch)this.instance).clearErrors();
                return this;
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$c
            public SDKError getErrors(int v) {
                return ((SDKErrorBatch)this.instance).getErrors(v);
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$c
            public int getErrorsCount() {
                return ((SDKErrorBatch)this.instance).getErrorsCount();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$c
            public List getErrorsList() {
                return DesugarCollections.unmodifiableList(((SDKErrorBatch)this.instance).getErrorsList());
            }

            public com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a removeErrors(int v) {
                this.copyOnWrite();
                ((SDKErrorBatch)this.instance).removeErrors(v);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a setErrors(int v, com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a0) {
                this.copyOnWrite();
                ((SDKErrorBatch)this.instance).setErrors(v, ((SDKError)sdk$SDKError$a0.build()));
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a setErrors(int v, SDKError sdk$SDKError0) {
                this.copyOnWrite();
                ((SDKErrorBatch)this.instance).setErrors(v, sdk$SDKError0);
                return this;
            }
        }

        private static final SDKErrorBatch DEFAULT_INSTANCE = null;
        public static final int ERRORS_FIELD_NUMBER = 1;
        private static volatile Parser PARSER;
        private ProtobufList errors_;

        static {
            SDKErrorBatch sdk$SDKErrorBatch0 = new SDKErrorBatch();
            SDKErrorBatch.DEFAULT_INSTANCE = sdk$SDKErrorBatch0;
            GeneratedMessageLite.registerDefaultInstance(SDKErrorBatch.class, sdk$SDKErrorBatch0);
        }

        private SDKErrorBatch() {
            this.errors_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllErrors(Iterable iterable0) {
            this.ensureErrorsIsMutable();
            AbstractMessageLite.addAll(iterable0, this.errors_);
        }

        private void addErrors(int v, SDKError sdk$SDKError0) {
            sdk$SDKError0.getClass();
            this.ensureErrorsIsMutable();
            this.errors_.add(v, sdk$SDKError0);
        }

        private void addErrors(SDKError sdk$SDKError0) {
            sdk$SDKError0.getClass();
            this.ensureErrorsIsMutable();
            this.errors_.add(sdk$SDKError0);
        }

        private void clearErrors() {
            this.errors_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new SDKErrorBatch();
                }
                case 2: {
                    return new com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(SDKErrorBatch.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"errors_", SDKError.class});
                }
                case 4: {
                    return SDKErrorBatch.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = SDKErrorBatch.PARSER;
                    if(parser0 == null) {
                        Class class0 = SDKErrorBatch.class;
                        synchronized(class0) {
                            parser0 = SDKErrorBatch.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(SDKErrorBatch.DEFAULT_INSTANCE);
                                SDKErrorBatch.PARSER = parser0;
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

        private void ensureErrorsIsMutable() {
            ProtobufList internal$ProtobufList0 = this.errors_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.errors_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static SDKErrorBatch getDefaultInstance() {
            return SDKErrorBatch.DEFAULT_INSTANCE;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$c
        public SDKError getErrors(int v) {
            return (SDKError)this.errors_.get(v);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$c
        public int getErrorsCount() {
            return this.errors_.size();
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$c
        public List getErrorsList() {
            return this.errors_;
        }

        public d getErrorsOrBuilder(int v) {
            return (d)this.errors_.get(v);
        }

        public List getErrorsOrBuilderList() {
            return this.errors_;
        }

        public static com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a newBuilder() {
            return (com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a)SDKErrorBatch.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a newBuilder(SDKErrorBatch sdk$SDKErrorBatch0) {
            return (com.vungle.ads.internal.protos.Sdk.SDKErrorBatch.a)SDKErrorBatch.DEFAULT_INSTANCE.createBuilder(sdk$SDKErrorBatch0);
        }

        public static SDKErrorBatch parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (SDKErrorBatch)GeneratedMessageLite.parseDelimitedFrom(SDKErrorBatch.DEFAULT_INSTANCE, inputStream0);
        }

        public static SDKErrorBatch parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SDKErrorBatch)GeneratedMessageLite.parseDelimitedFrom(SDKErrorBatch.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static SDKErrorBatch parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (SDKErrorBatch)GeneratedMessageLite.parseFrom(SDKErrorBatch.DEFAULT_INSTANCE, byteString0);
        }

        public static SDKErrorBatch parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SDKErrorBatch)GeneratedMessageLite.parseFrom(SDKErrorBatch.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static SDKErrorBatch parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (SDKErrorBatch)GeneratedMessageLite.parseFrom(SDKErrorBatch.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static SDKErrorBatch parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SDKErrorBatch)GeneratedMessageLite.parseFrom(SDKErrorBatch.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static SDKErrorBatch parseFrom(InputStream inputStream0) throws IOException {
            return (SDKErrorBatch)GeneratedMessageLite.parseFrom(SDKErrorBatch.DEFAULT_INSTANCE, inputStream0);
        }

        public static SDKErrorBatch parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SDKErrorBatch)GeneratedMessageLite.parseFrom(SDKErrorBatch.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static SDKErrorBatch parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (SDKErrorBatch)GeneratedMessageLite.parseFrom(SDKErrorBatch.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static SDKErrorBatch parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SDKErrorBatch)GeneratedMessageLite.parseFrom(SDKErrorBatch.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static SDKErrorBatch parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (SDKErrorBatch)GeneratedMessageLite.parseFrom(SDKErrorBatch.DEFAULT_INSTANCE, arr_b);
        }

        public static SDKErrorBatch parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SDKErrorBatch)GeneratedMessageLite.parseFrom(SDKErrorBatch.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return SDKErrorBatch.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeErrors(int v) {
            this.ensureErrorsIsMutable();
            this.errors_.remove(v);
        }

        private void setErrors(int v, SDKError sdk$SDKError0) {
            sdk$SDKError0.getClass();
            this.ensureErrorsIsMutable();
            this.errors_.set(v, sdk$SDKError0);
        }
    }

    public static final class SDKMetric extends GeneratedMessageLite implements e {
        public static final class com.vungle.ads.internal.protos.Sdk.SDKMetric.a extends Builder implements e {
            private com.vungle.ads.internal.protos.Sdk.SDKMetric.a() {
                super(SDKMetric.DEFAULT_INSTANCE);
            }

            com.vungle.ads.internal.protos.Sdk.SDKMetric.a(com.vungle.ads.internal.protos.Sdk.a sdk$a0) {
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearAdSource() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearAdSource();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearConnectionType() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearConnectionType();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearConnectionTypeDetail() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearConnectionTypeDetail();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearCreativeId() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearCreativeId();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearEventId() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearEventId();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearIsHbPlacement() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearIsHbPlacement();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearIsLowDataModeEnabled() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearIsLowDataModeEnabled();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearMake() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearMake();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearMeta() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearMeta();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearModel() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearModel();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearOs() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearOs();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearOsVersion() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearOsVersion();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearPlacementReferenceId() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearPlacementReferenceId();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearPlacementType() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearPlacementType();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearSessionId() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearSessionId();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearType() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearType();
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a clearValue() {
                this.copyOnWrite();
                ((SDKMetric)this.instance).clearValue();
                return this;
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getAdSource() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getAdSourceBytes() {
                return ((SDKMetric)this.instance).getAdSourceBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getConnectionType() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getConnectionTypeBytes() {
                return ((SDKMetric)this.instance).getConnectionTypeBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getConnectionTypeDetail() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getConnectionTypeDetailBytes() {
                return ((SDKMetric)this.instance).getConnectionTypeDetailBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getCreativeId() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getCreativeIdBytes() {
                return ((SDKMetric)this.instance).getCreativeIdBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getEventId() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getEventIdBytes() {
                return ((SDKMetric)this.instance).getEventIdBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public long getIsHbPlacement() {
                return ((SDKMetric)this.instance).getIsHbPlacement();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public boolean getIsLowDataModeEnabled() {
                return ((SDKMetric)this.instance).getIsLowDataModeEnabled();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getMake() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getMakeBytes() {
                return ((SDKMetric)this.instance).getMakeBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getMeta() {
                return ((SDKMetric)this.instance).getMeta();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getMetaBytes() {
                return ((SDKMetric)this.instance).getMetaBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getModel() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getModelBytes() {
                return ((SDKMetric)this.instance).getModelBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getOs() {
                return ((SDKMetric)this.instance).getOs();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getOsBytes() {
                return ((SDKMetric)this.instance).getOsBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getOsVersion() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getOsVersionBytes() {
                return ((SDKMetric)this.instance).getOsVersionBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getPlacementReferenceId() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getPlacementReferenceIdBytes() {
                return ((SDKMetric)this.instance).getPlacementReferenceIdBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getPlacementType() {
                return ((SDKMetric)this.instance).getPlacementType();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getPlacementTypeBytes() {
                return ((SDKMetric)this.instance).getPlacementTypeBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public String getSessionId() {
                return "";
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public ByteString getSessionIdBytes() {
                return ((SDKMetric)this.instance).getSessionIdBytes();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public com.vungle.ads.internal.protos.Sdk.SDKMetric.b getType() {
                return ((SDKMetric)this.instance).getType();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public int getTypeValue() {
                return ((SDKMetric)this.instance).getTypeValue();
            }

            @Override  // com.vungle.ads.internal.protos.Sdk$e
            public long getValue() {
                return ((SDKMetric)this.instance).getValue();
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setAdSource(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setAdSource(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setAdSourceBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setAdSourceBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setConnectionType(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setConnectionType(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setConnectionTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setConnectionTypeBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setConnectionTypeDetail(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setConnectionTypeDetail(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setConnectionTypeDetailBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setConnectionTypeDetailBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setCreativeId(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setCreativeId(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setCreativeIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setCreativeIdBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setEventId(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setEventId(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setEventIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setEventIdBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setIsHbPlacement(long v) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setIsHbPlacement(v);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setIsLowDataModeEnabled(boolean z) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setIsLowDataModeEnabled(z);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setMake(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setMake(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setMakeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setMakeBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setMeta(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setMeta(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setMetaBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setMetaBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setModel(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setModel(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setModelBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setModelBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setOs(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setOs(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setOsBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setOsBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setOsVersion(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setOsVersion(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setOsVersionBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setOsVersionBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setPlacementReferenceId(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setPlacementReferenceId(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setPlacementReferenceIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setPlacementReferenceIdBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setPlacementType(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setPlacementType(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setPlacementTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setPlacementTypeBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setSessionId(String s) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setSessionId(s);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setSessionIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setSessionIdBytes(byteString0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setType(com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setType(sdk$SDKMetric$b0);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setTypeValue(int v) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setTypeValue(v);
                return this;
            }

            public com.vungle.ads.internal.protos.Sdk.SDKMetric.a setValue(long v) {
                this.copyOnWrite();
                ((SDKMetric)this.instance).setValue(v);
                return this;
            }
        }

        public static enum com.vungle.ads.internal.protos.Sdk.SDKMetric.b implements EnumLite {
            class com.vungle.ads.internal.protos.Sdk.SDKMetric.b.a implements EnumLiteMap {
                com.vungle.ads.internal.protos.Sdk.SDKMetric.b.a() {
                    super();
                }

                @Override  // com.google.protobuf.Internal$EnumLiteMap
                public EnumLite findValueByNumber(int v) {
                    return this.findValueByNumber(v);
                }

                public com.vungle.ads.internal.protos.Sdk.SDKMetric.b findValueByNumber(int v) {
                    return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.forNumber(v);
                }
            }

            static final class com.vungle.ads.internal.protos.Sdk.SDKMetric.b.b implements EnumVerifier {
                static final EnumVerifier INSTANCE;

                static {
                    com.vungle.ads.internal.protos.Sdk.SDKMetric.b.b.INSTANCE = new com.vungle.ads.internal.protos.Sdk.SDKMetric.b.b();
                }

                @Override  // com.google.protobuf.Internal$EnumVerifier
                public boolean isInRange(int v) {
                    return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.forNumber(v) != null;
                }
            }

            UNKNOWN_METRIC_TYPE(0),
            AD_REQUEST_TO_RESPONSE_DURATION_MS(1),
            AD_RESPONSE_TO_SHOW_DURATION_MS(2),
            AD_SHOW_TO_DISPLAY_DURATION_MS(3),
            AD_DISPLAY_TO_CLICK_DURATION_MS(4),
            IOS_STORE_KIT_LOAD_TIME_MS(5),
            INIT_REQUEST_TO_RESPONSE_DURATION_MS(6),
            ASSET_DOWNLOAD_DURATION_MS(7),
            LOCAL_ASSETS_USED(8),
            REMOTE_ASSETS_USED(9),
            TEMPLATE_DOWNLOAD_DURATION_MS(10),
            AD_REQUEST_TO_CALLBACK_DURATION_MS(11),
            AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS(12),
            ASSET_FILE_SIZE(13),
            USER_AGENT_LOAD_DURATION_MS(14),
            TEMPLATE_ZIP_SIZE(15),
            CACHED_ASSETS_USED(16),
            LOAD_AD_API(17),
            TPAT_FIRED(18),
            TPAT_SUCCESS(19),
            WIN_NOTIF_FIRED(20),
            WIN_NOTIF_SUCCESS(21),
            @Deprecated
            AD_EXPIRED_BEFORE_PLAY(22),
            PLAY_AD_API(23),
            AD_LOAD_FAIL(24),
            VIEW_NOT_VISIBLE_ON_PLAY(25),
            MRAID_DOWNLOAD_JS_RETRY_SUCCESS(26),
            OMSDK_DOWNLOAD_JS_RETRY_SUCCESS(27),
            PRIVACY_URL_OPENED(28),
            NOTIFICATION_REDIRECT(29),
            AD_PLAY_RESET_ON_DEINIT(30),
            TEMPLATE_HTML_SIZE(0x1F),
            CONFIG_LOADED_FROM_INIT(0x20),
            CONFIG_LOADED_FROM_AD_LOAD(33),
            CONFIG_LOADED_FROM_ADM_LOAD(34),
            @Deprecated
            AD_SHOW_TO_PRESENT_DURATION_MS(35),
            AD_SHOW_TO_FAIL_DURATION_MS(36),
            AD_PRESENT_TO_DISPLAY_DURATION_MS(37),
            BID_TOKEN_REQUESTED(38),
            BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS(39),
            BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS(40),
            AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS(41),
            AD_SHOW_TO_CLOSE_DURATION_MS(42),
            AD_LOAD_TO_CALLBACK_DURATION_MS(43),
            AD_LOAD_TO_CALLBACK_ADO_DURATION_MS(44),
            SDK_INIT_API(45),
            AD_START_EVENT(46),
            AD_CLICK_EVENT(0x2F),
            AD_SHOW_TO_VALIDATION_DURATION_MS(0x30),
            AD_VALIDATION_TO_PRESENT_DURATION_MS(49),
            AD_LEAVE_APPLICATION(50),
            AD_REWARD_USER(51),
            AD_REQUIRED_DOWNLOAD_DURATION_MS(52),
            AD_OPTIONAL_DOWNLOAD_DURATION_MS(53),
            SKOVERLAY_PRESENTED_FOR_AD(2000),
            SAFARI_PRESENTED_FOR_AD(2001),
            STORE_KIT_PRESENTED_FOR_AD(2002),
            STORE_KIT_NOT_READY(2003),
            LAUNCH_STORE_KIT_REQUEST(2004),
            LAUNCH_SKOVERLAY_REQUEST(2005),
            LAUNCH_SAFARI_REQUEST(2006),
            IDFV_RESTRICTED(2007),
            NOTIFICATION_WAIT_FOR_CONNECTIVITY(2008),
            IDFV_VALUE_CHANGED(2009),
            AD_WILL_CLOSE(2010),
            HARDWARE_ACCELERATE_DISABLED(3001),
            BANNER_AUTO_REDIRECT(3002),
            UNRECOGNIZED(-1);

            public static final int AD_CLICK_EVENT_VALUE = 0x2F;
            public static final int AD_DISPLAY_TO_CLICK_DURATION_MS_VALUE = 4;
            @Deprecated
            public static final int AD_EXPIRED_BEFORE_PLAY_VALUE = 22;
            public static final int AD_LEAVE_APPLICATION_VALUE = 50;
            public static final int AD_LOAD_FAIL_VALUE = 24;
            public static final int AD_LOAD_TO_CALLBACK_ADO_DURATION_MS_VALUE = 44;
            public static final int AD_LOAD_TO_CALLBACK_DURATION_MS_VALUE = 43;
            public static final int AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS_VALUE = 41;
            public static final int AD_OPTIONAL_DOWNLOAD_DURATION_MS_VALUE = 53;
            public static final int AD_PLAY_RESET_ON_DEINIT_VALUE = 30;
            public static final int AD_PRESENT_TO_DISPLAY_DURATION_MS_VALUE = 37;
            public static final int AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS_VALUE = 12;
            public static final int AD_REQUEST_TO_CALLBACK_DURATION_MS_VALUE = 11;
            public static final int AD_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 1;
            public static final int AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE = 52;
            public static final int AD_RESPONSE_TO_SHOW_DURATION_MS_VALUE = 2;
            public static final int AD_REWARD_USER_VALUE = 51;
            public static final int AD_SHOW_TO_CLOSE_DURATION_MS_VALUE = 42;
            public static final int AD_SHOW_TO_DISPLAY_DURATION_MS_VALUE = 3;
            public static final int AD_SHOW_TO_FAIL_DURATION_MS_VALUE = 36;
            @Deprecated
            public static final int AD_SHOW_TO_PRESENT_DURATION_MS_VALUE = 35;
            public static final int AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE = 0x30;
            public static final int AD_START_EVENT_VALUE = 46;
            public static final int AD_VALIDATION_TO_PRESENT_DURATION_MS_VALUE = 49;
            public static final int AD_WILL_CLOSE_VALUE = 2010;
            public static final int ASSET_DOWNLOAD_DURATION_MS_VALUE = 7;
            public static final int ASSET_FILE_SIZE_VALUE = 13;
            public static final int BANNER_AUTO_REDIRECT_VALUE = 3002;
            public static final int BID_TOKEN_REQUESTED_VALUE = 38;
            public static final int BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS_VALUE = 40;
            public static final int BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 39;
            public static final int CACHED_ASSETS_USED_VALUE = 16;
            public static final int CONFIG_LOADED_FROM_ADM_LOAD_VALUE = 34;
            public static final int CONFIG_LOADED_FROM_AD_LOAD_VALUE = 33;
            public static final int CONFIG_LOADED_FROM_INIT_VALUE = 0x20;
            public static final int HARDWARE_ACCELERATE_DISABLED_VALUE = 3001;
            public static final int IDFV_RESTRICTED_VALUE = 2007;
            public static final int IDFV_VALUE_CHANGED_VALUE = 2009;
            public static final int INIT_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 6;
            public static final int IOS_STORE_KIT_LOAD_TIME_MS_VALUE = 5;
            public static final int LAUNCH_SAFARI_REQUEST_VALUE = 2006;
            public static final int LAUNCH_SKOVERLAY_REQUEST_VALUE = 2005;
            public static final int LAUNCH_STORE_KIT_REQUEST_VALUE = 2004;
            public static final int LOAD_AD_API_VALUE = 17;
            public static final int LOCAL_ASSETS_USED_VALUE = 8;
            public static final int MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 26;
            public static final int NOTIFICATION_REDIRECT_VALUE = 29;
            public static final int NOTIFICATION_WAIT_FOR_CONNECTIVITY_VALUE = 2008;
            public static final int OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 27;
            public static final int PLAY_AD_API_VALUE = 23;
            public static final int PRIVACY_URL_OPENED_VALUE = 28;
            public static final int REMOTE_ASSETS_USED_VALUE = 9;
            public static final int SAFARI_PRESENTED_FOR_AD_VALUE = 2001;
            public static final int SDK_INIT_API_VALUE = 45;
            public static final int SKOVERLAY_PRESENTED_FOR_AD_VALUE = 2000;
            public static final int STORE_KIT_NOT_READY_VALUE = 2003;
            public static final int STORE_KIT_PRESENTED_FOR_AD_VALUE = 2002;
            public static final int TEMPLATE_DOWNLOAD_DURATION_MS_VALUE = 10;
            public static final int TEMPLATE_HTML_SIZE_VALUE = 0x1F;
            public static final int TEMPLATE_ZIP_SIZE_VALUE = 15;
            public static final int TPAT_FIRED_VALUE = 18;
            public static final int TPAT_SUCCESS_VALUE = 19;
            public static final int UNKNOWN_METRIC_TYPE_VALUE = 0;
            public static final int USER_AGENT_LOAD_DURATION_MS_VALUE = 14;
            public static final int VIEW_NOT_VISIBLE_ON_PLAY_VALUE = 25;
            public static final int WIN_NOTIF_FIRED_VALUE = 20;
            public static final int WIN_NOTIF_SUCCESS_VALUE = 21;
            private static final EnumLiteMap internalValueMap;
            private final int value;

            private static com.vungle.ads.internal.protos.Sdk.SDKMetric.b[] $values() [...] // Inlined contents

            static {
                com.vungle.ads.internal.protos.Sdk.SDKMetric.b.internalValueMap = new com.vungle.ads.internal.protos.Sdk.SDKMetric.b.a();
            }

            private com.vungle.ads.internal.protos.Sdk.SDKMetric.b(int v1) {
                this.value = v1;
            }

            public static com.vungle.ads.internal.protos.Sdk.SDKMetric.b forNumber(int v) {
                switch(v) {
                    case 0: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.UNKNOWN_METRIC_TYPE;
                    }
                    case 1: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_REQUEST_TO_RESPONSE_DURATION_MS;
                    }
                    case 2: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_RESPONSE_TO_SHOW_DURATION_MS;
                    }
                    case 3: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_SHOW_TO_DISPLAY_DURATION_MS;
                    }
                    case 4: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_DISPLAY_TO_CLICK_DURATION_MS;
                    }
                    case 5: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.IOS_STORE_KIT_LOAD_TIME_MS;
                    }
                    case 6: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.INIT_REQUEST_TO_RESPONSE_DURATION_MS;
                    }
                    case 7: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.ASSET_DOWNLOAD_DURATION_MS;
                    }
                    case 8: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.LOCAL_ASSETS_USED;
                    }
                    case 9: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.REMOTE_ASSETS_USED;
                    }
                    case 10: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.TEMPLATE_DOWNLOAD_DURATION_MS;
                    }
                    case 11: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_REQUEST_TO_CALLBACK_DURATION_MS;
                    }
                    case 12: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS;
                    }
                    case 13: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.ASSET_FILE_SIZE;
                    }
                    case 14: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.USER_AGENT_LOAD_DURATION_MS;
                    }
                    case 15: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.TEMPLATE_ZIP_SIZE;
                    }
                    case 16: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.CACHED_ASSETS_USED;
                    }
                    case 17: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.LOAD_AD_API;
                    }
                    case 18: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.TPAT_FIRED;
                    }
                    case 19: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.TPAT_SUCCESS;
                    }
                    case 20: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.WIN_NOTIF_FIRED;
                    }
                    case 21: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.WIN_NOTIF_SUCCESS;
                    }
                    case 22: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_EXPIRED_BEFORE_PLAY;
                    }
                    case 23: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.PLAY_AD_API;
                    }
                    case 24: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_LOAD_FAIL;
                    }
                    case 25: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.VIEW_NOT_VISIBLE_ON_PLAY;
                    }
                    case 26: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.MRAID_DOWNLOAD_JS_RETRY_SUCCESS;
                    }
                    case 27: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.OMSDK_DOWNLOAD_JS_RETRY_SUCCESS;
                    }
                    case 28: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.PRIVACY_URL_OPENED;
                    }
                    case 29: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.NOTIFICATION_REDIRECT;
                    }
                    case 30: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_PLAY_RESET_ON_DEINIT;
                    }
                    case 0x1F: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.TEMPLATE_HTML_SIZE;
                    }
                    case 0x20: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.CONFIG_LOADED_FROM_INIT;
                    }
                    case 33: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.CONFIG_LOADED_FROM_AD_LOAD;
                    }
                    case 34: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.CONFIG_LOADED_FROM_ADM_LOAD;
                    }
                    case 35: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_SHOW_TO_PRESENT_DURATION_MS;
                    }
                    case 36: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_SHOW_TO_FAIL_DURATION_MS;
                    }
                    case 37: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_PRESENT_TO_DISPLAY_DURATION_MS;
                    }
                    case 38: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.BID_TOKEN_REQUESTED;
                    }
                    case 39: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS;
                    }
                    case 40: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS;
                    }
                    case 41: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS;
                    }
                    case 42: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_SHOW_TO_CLOSE_DURATION_MS;
                    }
                    case 43: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_LOAD_TO_CALLBACK_DURATION_MS;
                    }
                    case 44: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS;
                    }
                    case 45: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.SDK_INIT_API;
                    }
                    case 46: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_START_EVENT;
                    }
                    case 0x2F: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_CLICK_EVENT;
                    }
                    case 0x30: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_SHOW_TO_VALIDATION_DURATION_MS;
                    }
                    case 49: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_VALIDATION_TO_PRESENT_DURATION_MS;
                    }
                    case 50: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_LEAVE_APPLICATION;
                    }
                    case 51: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_REWARD_USER;
                    }
                    case 52: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_REQUIRED_DOWNLOAD_DURATION_MS;
                    }
                    case 53: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_OPTIONAL_DOWNLOAD_DURATION_MS;
                    }
                    case 2000: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.SKOVERLAY_PRESENTED_FOR_AD;
                    }
                    case 2001: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.SAFARI_PRESENTED_FOR_AD;
                    }
                    case 2002: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.STORE_KIT_PRESENTED_FOR_AD;
                    }
                    case 2003: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.STORE_KIT_NOT_READY;
                    }
                    case 2004: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.LAUNCH_STORE_KIT_REQUEST;
                    }
                    case 2005: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.LAUNCH_SKOVERLAY_REQUEST;
                    }
                    case 2006: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.LAUNCH_SAFARI_REQUEST;
                    }
                    case 2007: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.IDFV_RESTRICTED;
                    }
                    case 2008: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.NOTIFICATION_WAIT_FOR_CONNECTIVITY;
                    }
                    case 2009: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.IDFV_VALUE_CHANGED;
                    }
                    case 2010: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.AD_WILL_CLOSE;
                    }
                    case 3001: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.HARDWARE_ACCELERATE_DISABLED;
                    }
                    case 3002: {
                        return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.BANNER_AUTO_REDIRECT;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Override  // com.google.protobuf.Internal$EnumLite
            public final int getNumber() {
                if(this == com.vungle.ads.internal.protos.Sdk.SDKMetric.b.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                }
                return this.value;
            }

            public static EnumLiteMap internalGetValueMap() {
                return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.b.INSTANCE;
            }

            @Deprecated
            public static com.vungle.ads.internal.protos.Sdk.SDKMetric.b valueOf(int v) {
                return com.vungle.ads.internal.protos.Sdk.SDKMetric.b.forNumber(v);
            }
        }

        public static final int ADSOURCE_FIELD_NUMBER = 16;
        public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 9;
        public static final int CONNECTIONTYPE_FIELD_NUMBER = 8;
        public static final int CREATIVEID_FIELD_NUMBER = 11;
        private static final SDKMetric DEFAULT_INSTANCE = null;
        public static final int EVENTID_FIELD_NUMBER = 12;
        public static final int ISHBPLACEMENT_FIELD_NUMBER = 14;
        public static final int ISLOWDATAMODEENABLED_FIELD_NUMBER = 201;
        public static final int MAKE_FIELD_NUMBER = 4;
        public static final int META_FIELD_NUMBER = 3;
        public static final int MODEL_FIELD_NUMBER = 5;
        public static final int OSVERSION_FIELD_NUMBER = 7;
        public static final int OS_FIELD_NUMBER = 6;
        private static volatile Parser PARSER = null;
        public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 10;
        public static final int PLACEMENTTYPE_FIELD_NUMBER = 15;
        public static final int SESSIONID_FIELD_NUMBER = 13;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String adSource_;
        private String connectionTypeDetail_;
        private String connectionType_;
        private String creativeId_;
        private String eventId_;
        private long isHbPlacement_;
        private boolean isLowDataModeEnabled_;
        private String make_;
        private String meta_;
        private String model_;
        private String osVersion_;
        private String os_;
        private String placementReferenceId_;
        private String placementType_;
        private String sessionId_;
        private int type_;
        private long value_;

        static {
            SDKMetric sdk$SDKMetric0 = new SDKMetric();
            SDKMetric.DEFAULT_INSTANCE = sdk$SDKMetric0;
            GeneratedMessageLite.registerDefaultInstance(SDKMetric.class, sdk$SDKMetric0);
        }

        private SDKMetric() {
            this.meta_ = "";
            this.make_ = "";
            this.model_ = "";
            this.os_ = "";
            this.osVersion_ = "";
            this.connectionType_ = "";
            this.connectionTypeDetail_ = "";
            this.placementReferenceId_ = "";
            this.creativeId_ = "";
            this.eventId_ = "";
            this.sessionId_ = "";
            this.placementType_ = "";
            this.adSource_ = "";
        }

        private void clearAdSource() {
            this.adSource_ = "";
        }

        private void clearConnectionType() {
            this.connectionType_ = "";
        }

        private void clearConnectionTypeDetail() {
            this.connectionTypeDetail_ = "";
        }

        private void clearCreativeId() {
            this.creativeId_ = "";
        }

        private void clearEventId() {
            this.eventId_ = "";
        }

        private void clearIsHbPlacement() {
            this.isHbPlacement_ = 0L;
        }

        private void clearIsLowDataModeEnabled() {
            this.isLowDataModeEnabled_ = false;
        }

        private void clearMake() {
            this.make_ = SDKMetric.getDefaultInstance().getMake();
        }

        private void clearMeta() {
            this.meta_ = "";
        }

        private void clearModel() {
            this.model_ = "";
        }

        private void clearOs() {
            this.os_ = "";
        }

        private void clearOsVersion() {
            this.osVersion_ = "";
        }

        private void clearPlacementReferenceId() {
            this.placementReferenceId_ = "";
        }

        private void clearPlacementType() {
            this.placementType_ = "";
        }

        private void clearSessionId() {
            this.sessionId_ = "";
        }

        private void clearType() {
            this.type_ = 0;
        }

        private void clearValue() {
            this.value_ = 0L;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new SDKMetric();
                }
                case 2: {
                    return new com.vungle.ads.internal.protos.Sdk.SDKMetric.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(SDKMetric.DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001É\u0011\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000BȈ\fȈ\rȈ\u000E\u0002\u000FȈ\u0010ȈÉ\u0007", new Object[]{"type_", "value_", "meta_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "eventId_", "sessionId_", "isHbPlacement_", "placementType_", "adSource_", "isLowDataModeEnabled_"});
                }
                case 4: {
                    return SDKMetric.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = SDKMetric.PARSER;
                    if(parser0 == null) {
                        Class class0 = SDKMetric.class;
                        synchronized(class0) {
                            parser0 = SDKMetric.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(SDKMetric.DEFAULT_INSTANCE);
                                SDKMetric.PARSER = parser0;
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

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getAdSource() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getAdSourceBytes() {
            return ByteString.copyFromUtf8(this.adSource_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getConnectionType() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getConnectionTypeBytes() {
            return ByteString.copyFromUtf8(this.connectionType_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getConnectionTypeDetail() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getConnectionTypeDetailBytes() {
            return ByteString.copyFromUtf8(this.connectionTypeDetail_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getCreativeId() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getCreativeIdBytes() {
            return ByteString.copyFromUtf8(this.creativeId_);
        }

        public static SDKMetric getDefaultInstance() {
            return SDKMetric.DEFAULT_INSTANCE;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getEventId() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getEventIdBytes() {
            return ByteString.copyFromUtf8(this.eventId_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public long getIsHbPlacement() {
            return this.isHbPlacement_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public boolean getIsLowDataModeEnabled() {
            return this.isLowDataModeEnabled_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getMake() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getMakeBytes() {
            return ByteString.copyFromUtf8(this.make_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getMeta() {
            return this.meta_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getMetaBytes() {
            return ByteString.copyFromUtf8(this.meta_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getModel() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getOs() {
            return this.os_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getOsBytes() {
            return ByteString.copyFromUtf8(this.os_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getOsVersion() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getPlacementReferenceId() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getPlacementReferenceIdBytes() {
            return ByteString.copyFromUtf8(this.placementReferenceId_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getPlacementType() {
            return this.placementType_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getPlacementTypeBytes() {
            return ByteString.copyFromUtf8(this.placementType_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public String getSessionId() [...] // 潜在的解密器

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public ByteString getSessionIdBytes() {
            return ByteString.copyFromUtf8(this.sessionId_);
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public com.vungle.ads.internal.protos.Sdk.SDKMetric.b getType() {
            com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0 = com.vungle.ads.internal.protos.Sdk.SDKMetric.b.forNumber(this.type_);
            return sdk$SDKMetric$b0 == null ? com.vungle.ads.internal.protos.Sdk.SDKMetric.b.UNRECOGNIZED : sdk$SDKMetric$b0;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public int getTypeValue() {
            return this.type_;
        }

        @Override  // com.vungle.ads.internal.protos.Sdk$e
        public long getValue() {
            return this.value_;
        }

        public static com.vungle.ads.internal.protos.Sdk.SDKMetric.a newBuilder() {
            return (com.vungle.ads.internal.protos.Sdk.SDKMetric.a)SDKMetric.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.vungle.ads.internal.protos.Sdk.SDKMetric.a newBuilder(SDKMetric sdk$SDKMetric0) {
            return (com.vungle.ads.internal.protos.Sdk.SDKMetric.a)SDKMetric.DEFAULT_INSTANCE.createBuilder(sdk$SDKMetric0);
        }

        public static SDKMetric parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (SDKMetric)GeneratedMessageLite.parseDelimitedFrom(SDKMetric.DEFAULT_INSTANCE, inputStream0);
        }

        public static SDKMetric parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SDKMetric)GeneratedMessageLite.parseDelimitedFrom(SDKMetric.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static SDKMetric parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (SDKMetric)GeneratedMessageLite.parseFrom(SDKMetric.DEFAULT_INSTANCE, byteString0);
        }

        public static SDKMetric parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SDKMetric)GeneratedMessageLite.parseFrom(SDKMetric.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static SDKMetric parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (SDKMetric)GeneratedMessageLite.parseFrom(SDKMetric.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static SDKMetric parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SDKMetric)GeneratedMessageLite.parseFrom(SDKMetric.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static SDKMetric parseFrom(InputStream inputStream0) throws IOException {
            return (SDKMetric)GeneratedMessageLite.parseFrom(SDKMetric.DEFAULT_INSTANCE, inputStream0);
        }

        public static SDKMetric parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SDKMetric)GeneratedMessageLite.parseFrom(SDKMetric.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static SDKMetric parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (SDKMetric)GeneratedMessageLite.parseFrom(SDKMetric.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static SDKMetric parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SDKMetric)GeneratedMessageLite.parseFrom(SDKMetric.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static SDKMetric parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (SDKMetric)GeneratedMessageLite.parseFrom(SDKMetric.DEFAULT_INSTANCE, arr_b);
        }

        public static SDKMetric parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SDKMetric)GeneratedMessageLite.parseFrom(SDKMetric.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return SDKMetric.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdSource(String s) {
            s.getClass();
            this.adSource_ = s;
        }

        private void setAdSourceBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.adSource_ = byteString0.toStringUtf8();
        }

        private void setConnectionType(String s) {
            s.getClass();
            this.connectionType_ = s;
        }

        private void setConnectionTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.connectionType_ = byteString0.toStringUtf8();
        }

        private void setConnectionTypeDetail(String s) {
            s.getClass();
            this.connectionTypeDetail_ = s;
        }

        private void setConnectionTypeDetailBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.connectionTypeDetail_ = byteString0.toStringUtf8();
        }

        private void setCreativeId(String s) {
            s.getClass();
            this.creativeId_ = s;
        }

        private void setCreativeIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.creativeId_ = byteString0.toStringUtf8();
        }

        private void setEventId(String s) {
            s.getClass();
            this.eventId_ = s;
        }

        private void setEventIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.eventId_ = byteString0.toStringUtf8();
        }

        private void setIsHbPlacement(long v) {
            this.isHbPlacement_ = v;
        }

        private void setIsLowDataModeEnabled(boolean z) {
            this.isLowDataModeEnabled_ = z;
        }

        private void setMake(String s) {
            s.getClass();
            this.make_ = s;
        }

        private void setMakeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.make_ = byteString0.toStringUtf8();
        }

        private void setMeta(String s) {
            s.getClass();
            this.meta_ = s;
        }

        private void setMetaBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.meta_ = byteString0.toStringUtf8();
        }

        private void setModel(String s) {
            s.getClass();
            this.model_ = s;
        }

        private void setModelBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.model_ = byteString0.toStringUtf8();
        }

        private void setOs(String s) {
            s.getClass();
            this.os_ = s;
        }

        private void setOsBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.os_ = byteString0.toStringUtf8();
        }

        private void setOsVersion(String s) {
            s.getClass();
            this.osVersion_ = s;
        }

        private void setOsVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.osVersion_ = byteString0.toStringUtf8();
        }

        private void setPlacementReferenceId(String s) {
            s.getClass();
            this.placementReferenceId_ = s;
        }

        private void setPlacementReferenceIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.placementReferenceId_ = byteString0.toStringUtf8();
        }

        private void setPlacementType(String s) {
            s.getClass();
            this.placementType_ = s;
        }

        private void setPlacementTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.placementType_ = byteString0.toStringUtf8();
        }

        private void setSessionId(String s) {
            s.getClass();
            this.sessionId_ = s;
        }

        private void setSessionIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.sessionId_ = byteString0.toStringUtf8();
        }

        private void setType(com.vungle.ads.internal.protos.Sdk.SDKMetric.b sdk$SDKMetric$b0) {
            this.type_ = sdk$SDKMetric$b0.getNumber();
        }

        private void setTypeValue(int v) {
            this.type_ = v;
        }

        private void setValue(long v) {
            this.value_ = v;
        }
    }

    static class com.vungle.ads.internal.protos.Sdk.a {
        static final int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            com.vungle.ads.internal.protos.Sdk.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.vungle.ads.internal.protos.Sdk.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.vungle.ads.internal.protos.Sdk.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.vungle.ads.internal.protos.Sdk.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.vungle.ads.internal.protos.Sdk.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.vungle.ads.internal.protos.Sdk.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.vungle.ads.internal.protos.Sdk.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public interface b extends MessageLiteOrBuilder {
        SDKMetric getMetrics(int arg1);

        int getMetricsCount();

        List getMetricsList();
    }

    public interface c extends MessageLiteOrBuilder {
        SDKError getErrors(int arg1);

        int getErrorsCount();

        List getErrorsList();
    }

    public interface d extends MessageLiteOrBuilder {
        String getAdSource();

        ByteString getAdSourceBytes();

        long getAt();

        String getConnectionType();

        ByteString getConnectionTypeBytes();

        String getConnectionTypeDetail();

        String getConnectionTypeDetailAndroid();

        ByteString getConnectionTypeDetailAndroidBytes();

        ByteString getConnectionTypeDetailBytes();

        String getCreativeId();

        ByteString getCreativeIdBytes();

        String getEventId();

        ByteString getEventIdBytes();

        long getIsHbPlacement();

        boolean getIsLowDataModeEnabled();

        String getMake();

        ByteString getMakeBytes();

        String getMessage();

        ByteString getMessageBytes();

        String getModel();

        ByteString getModelBytes();

        String getOs();

        ByteString getOsBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        String getPlacementReferenceId();

        ByteString getPlacementReferenceIdBytes();

        String getPlacementType();

        ByteString getPlacementTypeBytes();

        com.vungle.ads.internal.protos.Sdk.SDKError.b getReason();

        int getReasonValue();

        String getSessionId();

        ByteString getSessionIdBytes();
    }

    public interface e extends MessageLiteOrBuilder {
        String getAdSource();

        ByteString getAdSourceBytes();

        String getConnectionType();

        ByteString getConnectionTypeBytes();

        String getConnectionTypeDetail();

        ByteString getConnectionTypeDetailBytes();

        String getCreativeId();

        ByteString getCreativeIdBytes();

        String getEventId();

        ByteString getEventIdBytes();

        long getIsHbPlacement();

        boolean getIsLowDataModeEnabled();

        String getMake();

        ByteString getMakeBytes();

        String getMeta();

        ByteString getMetaBytes();

        String getModel();

        ByteString getModelBytes();

        String getOs();

        ByteString getOsBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        String getPlacementReferenceId();

        ByteString getPlacementReferenceIdBytes();

        String getPlacementType();

        ByteString getPlacementTypeBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        com.vungle.ads.internal.protos.Sdk.SDKMetric.b getType();

        int getTypeValue();

        long getValue();
    }

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

