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
import com.google.protobuf.Internal.IntList;
import com.google.protobuf.Internal.ListAdapter.Converter;
import com.google.protobuf.Internal.ListAdapter;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat.FieldType;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public final class DiagnosticEventRequestOuterClass {
    public static enum DiagnosticAdType implements EnumLite {
        class a implements EnumLiteMap {
            a() {
                super();
            }

            public DiagnosticAdType a(int v) {
                return DiagnosticAdType.forNumber(v);
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
                return DiagnosticAdType.forNumber(v) != null;
            }
        }

        DIAGNOSTIC_AD_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_AD_TYPE_FULLSCREEN(1),
        DIAGNOSTIC_AD_TYPE_BANNER(2),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_AD_TYPE_BANNER_VALUE = 2;
        public static final int DIAGNOSTIC_AD_TYPE_FULLSCREEN_VALUE = 1;
        public static final int DIAGNOSTIC_AD_TYPE_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static DiagnosticAdType[] $values() [...] // Inlined contents

        static {
            DiagnosticAdType.internalValueMap = new a();
        }

        private DiagnosticAdType(int v1) {
            this.value = v1;
        }

        public static DiagnosticAdType forNumber(int v) {
            switch(v) {
                case 0: {
                    return DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED;
                }
                case 1: {
                    return DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
                }
                case 2: {
                    return DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == DiagnosticAdType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return DiagnosticAdType.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Deprecated
        public static DiagnosticAdType valueOf(int v) {
            return DiagnosticAdType.forNumber(v);
        }
    }

    public static final class DiagnosticEvent extends GeneratedMessageLite implements DiagnosticEventOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements DiagnosticEventOrBuilder {
            private Builder() {
                super(DiagnosticEvent.DEFAULT_INSTANCE);
            }

            Builder(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a diagnosticEventRequestOuterClass$a0) {
            }

            public Builder clearAdType() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).clearAdType();
                return this;
            }

            public Builder clearCustomEventType() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).clearCustomEventType();
                return this;
            }

            public Builder clearEventId() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).clearEventId();
                return this;
            }

            public Builder clearEventType() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).clearEventType();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearIntTags() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).getMutableIntTagsMap().clear();
                return this;
            }

            public Builder clearIsHeaderBidding() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).clearIsHeaderBidding();
                return this;
            }

            public Builder clearPlacementId() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).clearPlacementId();
                return this;
            }

            public Builder clearStringTags() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).getMutableStringTagsMap().clear();
                return this;
            }

            public Builder clearTimeValue() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).clearTimeValue();
                return this;
            }

            public Builder clearTimestamps() {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).clearTimestamps();
                return this;
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public boolean containsIntTags(String s) {
                s.getClass();
                return ((DiagnosticEvent)this.instance).getIntTagsMap().containsKey(s);
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public boolean containsStringTags(String s) {
                s.getClass();
                return ((DiagnosticEvent)this.instance).getStringTagsMap().containsKey(s);
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public DiagnosticAdType getAdType() {
                return ((DiagnosticEvent)this.instance).getAdType();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public int getAdTypeValue() {
                return ((DiagnosticEvent)this.instance).getAdTypeValue();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public String getCustomEventType() {
                return ((DiagnosticEvent)this.instance).getCustomEventType();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public ByteString getCustomEventTypeBytes() {
                return ((DiagnosticEvent)this.instance).getCustomEventTypeBytes();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public int getEventId() {
                return ((DiagnosticEvent)this.instance).getEventId();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public DiagnosticEventType getEventType() {
                return ((DiagnosticEvent)this.instance).getEventType();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public int getEventTypeValue() {
                return ((DiagnosticEvent)this.instance).getEventTypeValue();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((DiagnosticEvent)this.instance).getImpressionOpportunityId();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            @Deprecated
            public Map getIntTags() {
                return this.getIntTagsMap();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public int getIntTagsCount() {
                return ((DiagnosticEvent)this.instance).getIntTagsMap().size();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public Map getIntTagsMap() {
                return DesugarCollections.unmodifiableMap(((DiagnosticEvent)this.instance).getIntTagsMap());
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public int getIntTagsOrDefault(String s, int v) {
                s.getClass();
                Map map0 = ((DiagnosticEvent)this.instance).getIntTagsMap();
                return map0.containsKey(s) ? ((int)(((Integer)map0.get(s)))) : v;
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public int getIntTagsOrThrow(String s) {
                s.getClass();
                Map map0 = ((DiagnosticEvent)this.instance).getIntTagsMap();
                if(!map0.containsKey(s)) {
                    throw new IllegalArgumentException();
                }
                return (int)(((Integer)map0.get(s)));
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public boolean getIsHeaderBidding() {
                return ((DiagnosticEvent)this.instance).getIsHeaderBidding();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public String getPlacementId() {
                return ((DiagnosticEvent)this.instance).getPlacementId();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public ByteString getPlacementIdBytes() {
                return ((DiagnosticEvent)this.instance).getPlacementIdBytes();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            @Deprecated
            public Map getStringTags() {
                return this.getStringTagsMap();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public int getStringTagsCount() {
                return ((DiagnosticEvent)this.instance).getStringTagsMap().size();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public Map getStringTagsMap() {
                return DesugarCollections.unmodifiableMap(((DiagnosticEvent)this.instance).getStringTagsMap());
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public String getStringTagsOrDefault(String s, String s1) {
                s.getClass();
                Map map0 = ((DiagnosticEvent)this.instance).getStringTagsMap();
                return map0.containsKey(s) ? ((String)map0.get(s)) : s1;
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public String getStringTagsOrThrow(String s) {
                s.getClass();
                Map map0 = ((DiagnosticEvent)this.instance).getStringTagsMap();
                if(!map0.containsKey(s)) {
                    throw new IllegalArgumentException();
                }
                return (String)map0.get(s);
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public double getTimeValue() {
                return ((DiagnosticEvent)this.instance).getTimeValue();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public Timestamps getTimestamps() {
                return ((DiagnosticEvent)this.instance).getTimestamps();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public boolean hasAdType() {
                return ((DiagnosticEvent)this.instance).hasAdType();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public boolean hasCustomEventType() {
                return ((DiagnosticEvent)this.instance).hasCustomEventType();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public boolean hasImpressionOpportunityId() {
                return ((DiagnosticEvent)this.instance).hasImpressionOpportunityId();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public boolean hasIsHeaderBidding() {
                return ((DiagnosticEvent)this.instance).hasIsHeaderBidding();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public boolean hasPlacementId() {
                return ((DiagnosticEvent)this.instance).hasPlacementId();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public boolean hasTimeValue() {
                return ((DiagnosticEvent)this.instance).hasTimeValue();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
            public boolean hasTimestamps() {
                return ((DiagnosticEvent)this.instance).hasTimestamps();
            }

            public Builder mergeTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).mergeTimestamps(timestampsOuterClass$Timestamps0);
                return this;
            }

            public Builder putAllIntTags(Map map0) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).getMutableIntTagsMap().putAll(map0);
                return this;
            }

            public Builder putAllStringTags(Map map0) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).getMutableStringTagsMap().putAll(map0);
                return this;
            }

            public Builder putIntTags(String s, int v) {
                s.getClass();
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).getMutableIntTagsMap().put(s, v);
                return this;
            }

            public Builder putStringTags(String s, String s1) {
                s.getClass();
                s1.getClass();
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).getMutableStringTagsMap().put(s, s1);
                return this;
            }

            public Builder removeIntTags(String s) {
                s.getClass();
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).getMutableIntTagsMap().remove(s);
                return this;
            }

            public Builder removeStringTags(String s) {
                s.getClass();
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).getMutableStringTagsMap().remove(s);
                return this;
            }

            public Builder setAdType(DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setAdType(diagnosticEventRequestOuterClass$DiagnosticAdType0);
                return this;
            }

            public Builder setAdTypeValue(int v) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setAdTypeValue(v);
                return this;
            }

            public Builder setCustomEventType(String s) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setCustomEventType(s);
                return this;
            }

            public Builder setCustomEventTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setCustomEventTypeBytes(byteString0);
                return this;
            }

            public Builder setEventId(int v) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setEventId(v);
                return this;
            }

            public Builder setEventType(DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setEventType(diagnosticEventRequestOuterClass$DiagnosticEventType0);
                return this;
            }

            public Builder setEventTypeValue(int v) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setEventTypeValue(v);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString0) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setImpressionOpportunityId(byteString0);
                return this;
            }

            public Builder setIsHeaderBidding(boolean z) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setIsHeaderBidding(z);
                return this;
            }

            public Builder setPlacementId(String s) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setPlacementId(s);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setPlacementIdBytes(byteString0);
                return this;
            }

            public Builder setTimeValue(double f) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setTimeValue(f);
                return this;
            }

            public Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder timestampsOuterClass$Timestamps$Builder0) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setTimestamps(((Timestamps)timestampsOuterClass$Timestamps$Builder0.build()));
                return this;
            }

            public Builder setTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
                this.copyOnWrite();
                ((DiagnosticEvent)this.instance).setTimestamps(timestampsOuterClass$Timestamps0);
                return this;
            }
        }

        static final class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.a {
            static final MapEntryLite a;

            static {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.a.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.UINT32, 0);
            }
        }

        static final class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.b {
            static final MapEntryLite a;

            static {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.b.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.STRING, "");
            }
        }

        public static final int AD_TYPE_FIELD_NUMBER = 10;
        public static final int CUSTOM_EVENT_TYPE_FIELD_NUMBER = 2;
        private static final DiagnosticEvent DEFAULT_INSTANCE = null;
        public static final int EVENT_ID_FIELD_NUMBER = 7;
        public static final int EVENT_TYPE_FIELD_NUMBER = 1;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 8;
        public static final int INT_TAGS_FIELD_NUMBER = 6;
        public static final int IS_HEADER_BIDDING_FIELD_NUMBER = 11;
        private static volatile Parser PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 9;
        public static final int STRING_TAGS_FIELD_NUMBER = 5;
        public static final int TIMESTAMPS_FIELD_NUMBER = 3;
        public static final int TIME_VALUE_FIELD_NUMBER = 4;
        private int adType_;
        private int bitField0_;
        private String customEventType_;
        private int eventId_;
        private int eventType_;
        private ByteString impressionOpportunityId_;
        private MapFieldLite intTags_;
        private boolean isHeaderBidding_;
        private String placementId_;
        private MapFieldLite stringTags_;
        private double timeValue_;
        private Timestamps timestamps_;

        static {
            DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0 = new DiagnosticEvent();
            DiagnosticEvent.DEFAULT_INSTANCE = diagnosticEventRequestOuterClass$DiagnosticEvent0;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEvent.class, diagnosticEventRequestOuterClass$DiagnosticEvent0);
        }

        private DiagnosticEvent() {
            this.stringTags_ = MapFieldLite.emptyMapField();
            this.intTags_ = MapFieldLite.emptyMapField();
            this.customEventType_ = "";
            this.impressionOpportunityId_ = ByteString.EMPTY;
            this.placementId_ = "";
        }

        private void clearAdType() {
            this.bitField0_ &= -33;
            this.adType_ = 0;
        }

        private void clearCustomEventType() {
            this.bitField0_ &= -2;
            this.customEventType_ = "";
        }

        private void clearEventId() {
            this.eventId_ = 0;
        }

        private void clearEventType() {
            this.eventType_ = 0;
        }

        private void clearImpressionOpportunityId() {
            this.bitField0_ &= -9;
            this.impressionOpportunityId_ = DiagnosticEvent.getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearIsHeaderBidding() {
            this.bitField0_ &= -65;
            this.isHeaderBidding_ = false;
        }

        private void clearPlacementId() {
            this.bitField0_ &= -17;
            this.placementId_ = "";
        }

        private void clearTimeValue() {
            this.bitField0_ &= -5;
            this.timeValue_ = 0.0;
        }

        private void clearTimestamps() {
            this.timestamps_ = null;
            this.bitField0_ &= -3;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public boolean containsIntTags(String s) {
            s.getClass();
            return this.internalGetIntTags().containsKey(s);
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public boolean containsStringTags(String s) {
            s.getClass();
            return this.internalGetStringTags().containsKey(s);
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new DiagnosticEvent();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(DiagnosticEvent.DEFAULT_INSTANCE, "\u0000\u000B\u0000\u0001\u0001\u000B\u000B\u0002\u0000\u0000\u0001\f\u0002ለ\u0000\u0003ဉ\u0001\u0004က\u0002\u00052\u00062\u0007\u0004\bည\u0003\tለ\u0004\nဌ\u0005\u000Bဇ\u0006", new Object[]{"bitField0_", "eventType_", "customEventType_", "timestamps_", "timeValue_", "stringTags_", gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.b.a, "intTags_", gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEvent.a.a, "eventId_", "impressionOpportunityId_", "placementId_", "adType_", "isHeaderBidding_"});
                }
                case 4: {
                    return DiagnosticEvent.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = DiagnosticEvent.PARSER;
                    if(parser0 == null) {
                        Class class0 = DiagnosticEvent.class;
                        synchronized(class0) {
                            parser0 = DiagnosticEvent.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(DiagnosticEvent.DEFAULT_INSTANCE);
                                DiagnosticEvent.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public DiagnosticAdType getAdType() {
            DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0 = DiagnosticAdType.forNumber(this.adType_);
            return diagnosticEventRequestOuterClass$DiagnosticAdType0 == null ? DiagnosticAdType.UNRECOGNIZED : diagnosticEventRequestOuterClass$DiagnosticAdType0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public String getCustomEventType() {
            return this.customEventType_;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public ByteString getCustomEventTypeBytes() {
            return ByteString.copyFromUtf8(this.customEventType_);
        }

        public static DiagnosticEvent getDefaultInstance() {
            return DiagnosticEvent.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public int getEventId() {
            return this.eventId_;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public DiagnosticEventType getEventType() {
            DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0 = DiagnosticEventType.forNumber(this.eventType_);
            return diagnosticEventRequestOuterClass$DiagnosticEventType0 == null ? DiagnosticEventType.UNRECOGNIZED : diagnosticEventRequestOuterClass$DiagnosticEventType0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public int getEventTypeValue() {
            return this.eventType_;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        @Deprecated
        public Map getIntTags() {
            return this.getIntTagsMap();
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public int getIntTagsCount() {
            return this.internalGetIntTags().size();
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public Map getIntTagsMap() {
            return DesugarCollections.unmodifiableMap(this.internalGetIntTags());
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public int getIntTagsOrDefault(String s, int v) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.internalGetIntTags();
            return mapFieldLite0.containsKey(s) ? ((int)(((Integer)mapFieldLite0.get(s)))) : v;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public int getIntTagsOrThrow(String s) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.internalGetIntTags();
            if(!mapFieldLite0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (int)(((Integer)mapFieldLite0.get(s)));
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public boolean getIsHeaderBidding() {
            return this.isHeaderBidding_;
        }

        private Map getMutableIntTagsMap() {
            return this.internalGetMutableIntTags();
        }

        private Map getMutableStringTagsMap() {
            return this.internalGetMutableStringTags();
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public String getPlacementId() {
            return this.placementId_;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        @Deprecated
        public Map getStringTags() {
            return this.getStringTagsMap();
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public int getStringTagsCount() {
            return this.internalGetStringTags().size();
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public Map getStringTagsMap() {
            return DesugarCollections.unmodifiableMap(this.internalGetStringTags());
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public String getStringTagsOrDefault(String s, String s1) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.internalGetStringTags();
            return mapFieldLite0.containsKey(s) ? ((String)mapFieldLite0.get(s)) : s1;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public String getStringTagsOrThrow(String s) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.internalGetStringTags();
            if(!mapFieldLite0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (String)mapFieldLite0.get(s);
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public double getTimeValue() {
            return this.timeValue_;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public Timestamps getTimestamps() {
            return this.timestamps_ == null ? Timestamps.getDefaultInstance() : this.timestamps_;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public boolean hasAdType() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public boolean hasCustomEventType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public boolean hasImpressionOpportunityId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public boolean hasIsHeaderBidding() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public boolean hasPlacementId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public boolean hasTimeValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventOrBuilder
        public boolean hasTimestamps() {
            return (this.bitField0_ & 2) != 0;
        }

        private MapFieldLite internalGetIntTags() {
            return this.intTags_;
        }

        private MapFieldLite internalGetMutableIntTags() {
            if(!this.intTags_.isMutable()) {
                this.intTags_ = this.intTags_.mutableCopy();
            }
            return this.intTags_;
        }

        private MapFieldLite internalGetMutableStringTags() {
            if(!this.stringTags_.isMutable()) {
                this.stringTags_ = this.stringTags_.mutableCopy();
            }
            return this.stringTags_;
        }

        private MapFieldLite internalGetStringTags() {
            return this.stringTags_;
        }

        private void mergeTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
            timestampsOuterClass$Timestamps0.getClass();
            this.timestamps_ = this.timestamps_ == null || this.timestamps_ == Timestamps.getDefaultInstance() ? timestampsOuterClass$Timestamps0 : ((Timestamps)((gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder)Timestamps.newBuilder(this.timestamps_).mergeFrom(timestampsOuterClass$Timestamps0)).buildPartial());
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder)DiagnosticEvent.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
            return (Builder)DiagnosticEvent.DEFAULT_INSTANCE.createBuilder(diagnosticEventRequestOuterClass$DiagnosticEvent0);
        }

        public static DiagnosticEvent parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (DiagnosticEvent)GeneratedMessageLite.parseDelimitedFrom(DiagnosticEvent.DEFAULT_INSTANCE, inputStream0);
        }

        public static DiagnosticEvent parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticEvent)GeneratedMessageLite.parseDelimitedFrom(DiagnosticEvent.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DiagnosticEvent parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (DiagnosticEvent)GeneratedMessageLite.parseFrom(DiagnosticEvent.DEFAULT_INSTANCE, byteString0);
        }

        public static DiagnosticEvent parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticEvent)GeneratedMessageLite.parseFrom(DiagnosticEvent.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static DiagnosticEvent parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (DiagnosticEvent)GeneratedMessageLite.parseFrom(DiagnosticEvent.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static DiagnosticEvent parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticEvent)GeneratedMessageLite.parseFrom(DiagnosticEvent.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static DiagnosticEvent parseFrom(InputStream inputStream0) throws IOException {
            return (DiagnosticEvent)GeneratedMessageLite.parseFrom(DiagnosticEvent.DEFAULT_INSTANCE, inputStream0);
        }

        public static DiagnosticEvent parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticEvent)GeneratedMessageLite.parseFrom(DiagnosticEvent.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DiagnosticEvent parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (DiagnosticEvent)GeneratedMessageLite.parseFrom(DiagnosticEvent.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static DiagnosticEvent parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticEvent)GeneratedMessageLite.parseFrom(DiagnosticEvent.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static DiagnosticEvent parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (DiagnosticEvent)GeneratedMessageLite.parseFrom(DiagnosticEvent.DEFAULT_INSTANCE, arr_b);
        }

        public static DiagnosticEvent parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticEvent)GeneratedMessageLite.parseFrom(DiagnosticEvent.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return DiagnosticEvent.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdType(DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0) {
            this.adType_ = diagnosticEventRequestOuterClass$DiagnosticAdType0.getNumber();
            this.bitField0_ |= 0x20;
        }

        private void setAdTypeValue(int v) {
            this.bitField0_ |= 0x20;
            this.adType_ = v;
        }

        private void setCustomEventType(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.customEventType_ = s;
        }

        private void setCustomEventTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.customEventType_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setEventId(int v) {
            this.eventId_ = v;
        }

        private void setEventType(DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            this.eventType_ = diagnosticEventRequestOuterClass$DiagnosticEventType0.getNumber();
        }

        private void setEventTypeValue(int v) {
            this.eventType_ = v;
        }

        private void setImpressionOpportunityId(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 8;
            this.impressionOpportunityId_ = byteString0;
        }

        private void setIsHeaderBidding(boolean z) {
            this.bitField0_ |= 0x40;
            this.isHeaderBidding_ = z;
        }

        private void setPlacementId(String s) {
            s.getClass();
            this.bitField0_ |= 16;
            this.placementId_ = s;
        }

        private void setPlacementIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.placementId_ = byteString0.toStringUtf8();
            this.bitField0_ |= 16;
        }

        private void setTimeValue(double f) {
            this.bitField0_ |= 4;
            this.timeValue_ = f;
        }

        private void setTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
            timestampsOuterClass$Timestamps0.getClass();
            this.timestamps_ = timestampsOuterClass$Timestamps0;
            this.bitField0_ |= 2;
        }
    }

    public interface DiagnosticEventOrBuilder extends MessageLiteOrBuilder {
        boolean containsIntTags(String arg1);

        boolean containsStringTags(String arg1);

        DiagnosticAdType getAdType();

        int getAdTypeValue();

        String getCustomEventType();

        ByteString getCustomEventTypeBytes();

        int getEventId();

        DiagnosticEventType getEventType();

        int getEventTypeValue();

        ByteString getImpressionOpportunityId();

        @Deprecated
        Map getIntTags();

        int getIntTagsCount();

        Map getIntTagsMap();

        int getIntTagsOrDefault(String arg1, int arg2);

        int getIntTagsOrThrow(String arg1);

        boolean getIsHeaderBidding();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        @Deprecated
        Map getStringTags();

        int getStringTagsCount();

        Map getStringTagsMap();

        String getStringTagsOrDefault(String arg1, String arg2);

        String getStringTagsOrThrow(String arg1);

        double getTimeValue();

        Timestamps getTimestamps();

        boolean hasAdType();

        boolean hasCustomEventType();

        boolean hasImpressionOpportunityId();

        boolean hasIsHeaderBidding();

        boolean hasPlacementId();

        boolean hasTimeValue();

        boolean hasTimestamps();
    }

    public static final class DiagnosticEventRequest extends GeneratedMessageLite implements DiagnosticEventRequestOrBuilder {
        public static final class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements DiagnosticEventRequestOrBuilder {
            private gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder() {
                super(DiagnosticEventRequest.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a diagnosticEventRequestOuterClass$a0) {
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder addAllBatch(Iterable iterable0) {
                this.copyOnWrite();
                ((DiagnosticEventRequest)this.instance).addAllBatch(iterable0);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder addBatch(int v, Builder diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0) {
                this.copyOnWrite();
                ((DiagnosticEventRequest)this.instance).addBatch(v, ((DiagnosticEvent)diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder addBatch(int v, DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
                this.copyOnWrite();
                ((DiagnosticEventRequest)this.instance).addBatch(v, diagnosticEventRequestOuterClass$DiagnosticEvent0);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder addBatch(Builder diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0) {
                this.copyOnWrite();
                ((DiagnosticEventRequest)this.instance).addBatch(((DiagnosticEvent)diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder addBatch(DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
                this.copyOnWrite();
                ((DiagnosticEventRequest)this.instance).addBatch(diagnosticEventRequestOuterClass$DiagnosticEvent0);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder clearBatch() {
                this.copyOnWrite();
                ((DiagnosticEventRequest)this.instance).clearBatch();
                return this;
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequestOrBuilder
            public DiagnosticEvent getBatch(int v) {
                return ((DiagnosticEventRequest)this.instance).getBatch(v);
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequestOrBuilder
            public int getBatchCount() {
                return ((DiagnosticEventRequest)this.instance).getBatchCount();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequestOrBuilder
            public List getBatchList() {
                return DesugarCollections.unmodifiableList(((DiagnosticEventRequest)this.instance).getBatchList());
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder removeBatch(int v) {
                this.copyOnWrite();
                ((DiagnosticEventRequest)this.instance).removeBatch(v);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder setBatch(int v, Builder diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0) {
                this.copyOnWrite();
                ((DiagnosticEventRequest)this.instance).setBatch(v, ((DiagnosticEvent)diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder setBatch(int v, DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
                this.copyOnWrite();
                ((DiagnosticEventRequest)this.instance).setBatch(v, diagnosticEventRequestOuterClass$DiagnosticEvent0);
                return this;
            }
        }

        public static final int BATCH_FIELD_NUMBER = 1;
        private static final DiagnosticEventRequest DEFAULT_INSTANCE;
        private static volatile Parser PARSER;
        private ProtobufList batch_;

        static {
            DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest0 = new DiagnosticEventRequest();
            DiagnosticEventRequest.DEFAULT_INSTANCE = diagnosticEventRequestOuterClass$DiagnosticEventRequest0;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEventRequest.class, diagnosticEventRequestOuterClass$DiagnosticEventRequest0);
        }

        private DiagnosticEventRequest() {
            this.batch_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllBatch(Iterable iterable0) {
            this.ensureBatchIsMutable();
            AbstractMessageLite.addAll(iterable0, this.batch_);
        }

        private void addBatch(int v, DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
            diagnosticEventRequestOuterClass$DiagnosticEvent0.getClass();
            this.ensureBatchIsMutable();
            this.batch_.add(v, diagnosticEventRequestOuterClass$DiagnosticEvent0);
        }

        private void addBatch(DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
            diagnosticEventRequestOuterClass$DiagnosticEvent0.getClass();
            this.ensureBatchIsMutable();
            this.batch_.add(diagnosticEventRequestOuterClass$DiagnosticEvent0);
        }

        private void clearBatch() {
            this.batch_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new DiagnosticEventRequest();
                }
                case 2: {
                    return new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(DiagnosticEventRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"batch_", DiagnosticEvent.class});
                }
                case 4: {
                    return DiagnosticEventRequest.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = DiagnosticEventRequest.PARSER;
                    if(parser0 == null) {
                        Class class0 = DiagnosticEventRequest.class;
                        synchronized(class0) {
                            parser0 = DiagnosticEventRequest.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(DiagnosticEventRequest.DEFAULT_INSTANCE);
                                DiagnosticEventRequest.PARSER = parser0;
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

        private void ensureBatchIsMutable() {
            ProtobufList internal$ProtobufList0 = this.batch_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.batch_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequestOrBuilder
        public DiagnosticEvent getBatch(int v) {
            return (DiagnosticEvent)this.batch_.get(v);
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequestOrBuilder
        public int getBatchCount() {
            return this.batch_.size();
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequestOrBuilder
        public List getBatchList() {
            return this.batch_;
        }

        public DiagnosticEventOrBuilder getBatchOrBuilder(int v) {
            return (DiagnosticEventOrBuilder)this.batch_.get(v);
        }

        public List getBatchOrBuilderList() {
            return this.batch_;
        }

        public static DiagnosticEventRequest getDefaultInstance() {
            return DiagnosticEventRequest.DEFAULT_INSTANCE;
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder newBuilder() {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder)DiagnosticEventRequest.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder newBuilder(DiagnosticEventRequest diagnosticEventRequestOuterClass$DiagnosticEventRequest0) {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder)DiagnosticEventRequest.DEFAULT_INSTANCE.createBuilder(diagnosticEventRequestOuterClass$DiagnosticEventRequest0);
        }

        public static DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseDelimitedFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseDelimitedFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DiagnosticEventRequest parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, byteString0);
        }

        public static DiagnosticEventRequest parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static DiagnosticEventRequest parseFrom(InputStream inputStream0) throws IOException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static DiagnosticEventRequest parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static DiagnosticEventRequest parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, arr_b);
        }

        public static DiagnosticEventRequest parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest)GeneratedMessageLite.parseFrom(DiagnosticEventRequest.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return DiagnosticEventRequest.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeBatch(int v) {
            this.ensureBatchIsMutable();
            this.batch_.remove(v);
        }

        private void setBatch(int v, DiagnosticEvent diagnosticEventRequestOuterClass$DiagnosticEvent0) {
            diagnosticEventRequestOuterClass$DiagnosticEvent0.getClass();
            this.ensureBatchIsMutable();
            this.batch_.set(v, diagnosticEventRequestOuterClass$DiagnosticEvent0);
        }
    }

    public interface DiagnosticEventRequestOrBuilder extends MessageLiteOrBuilder {
        DiagnosticEvent getBatch(int arg1);

        int getBatchCount();

        List getBatchList();
    }

    public static enum DiagnosticEventType implements EnumLite {
        class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.a implements EnumLiteMap {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.a() {
                super();
            }

            public DiagnosticEventType a(int v) {
                return DiagnosticEventType.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.b.a = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return DiagnosticEventType.forNumber(v) != null;
            }
        }

        DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_EVENT_TYPE_CUSTOM(1),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_EVENT_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static DiagnosticEventType[] $values() [...] // Inlined contents

        static {
            DiagnosticEventType.internalValueMap = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.a();
        }

        private DiagnosticEventType(int v1) {
            this.value = v1;
        }

        public static DiagnosticEventType forNumber(int v) {
            switch(v) {
                case 0: {
                    return DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED;
                }
                case 1: {
                    return DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == DiagnosticEventType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return DiagnosticEventType.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.b.a;
        }

        @Deprecated
        public static DiagnosticEventType valueOf(int v) {
            return DiagnosticEventType.forNumber(v);
        }
    }

    public static enum DiagnosticEventsSeverity implements EnumLite {
        class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.a implements EnumLiteMap {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.a() {
                super();
            }

            public DiagnosticEventsSeverity a(int v) {
                return DiagnosticEventsSeverity.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.b.a = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return DiagnosticEventsSeverity.forNumber(v) != null;
            }
        }

        DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED(0),
        DIAGNOSTIC_EVENTS_SEVERITY_DEBUG(1),
        DIAGNOSTIC_EVENTS_SEVERITY_INFO(2),
        DIAGNOSTIC_EVENTS_SEVERITY_WARNING(3),
        DIAGNOSTIC_EVENTS_SEVERITY_ERROR(4),
        DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS(5),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS_VALUE = 5;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_DEBUG_VALUE = 1;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ERROR_VALUE = 4;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_INFO_VALUE = 2;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED_VALUE = 0;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_WARNING_VALUE = 3;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static DiagnosticEventsSeverity[] $values() [...] // Inlined contents

        static {
            DiagnosticEventsSeverity.internalValueMap = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.a();
        }

        private DiagnosticEventsSeverity(int v1) {
            this.value = v1;
        }

        public static DiagnosticEventsSeverity forNumber(int v) {
            switch(v) {
                case 0: {
                    return DiagnosticEventsSeverity.DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED;
                }
                case 1: {
                    return DiagnosticEventsSeverity.DIAGNOSTIC_EVENTS_SEVERITY_DEBUG;
                }
                case 2: {
                    return DiagnosticEventsSeverity.DIAGNOSTIC_EVENTS_SEVERITY_INFO;
                }
                case 3: {
                    return DiagnosticEventsSeverity.DIAGNOSTIC_EVENTS_SEVERITY_WARNING;
                }
                case 4: {
                    return DiagnosticEventsSeverity.DIAGNOSTIC_EVENTS_SEVERITY_ERROR;
                }
                case 5: {
                    return DiagnosticEventsSeverity.DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == DiagnosticEventsSeverity.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return DiagnosticEventsSeverity.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.b.a;
        }

        @Deprecated
        public static DiagnosticEventsSeverity valueOf(int v) {
            return DiagnosticEventsSeverity.forNumber(v);
        }
    }

    public static final class DiagnosticTag extends GeneratedMessageLite implements DiagnosticTagOrBuilder {
        public static final class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements DiagnosticTagOrBuilder {
            private gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder() {
                super(DiagnosticTag.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder(gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a diagnosticEventRequestOuterClass$a0) {
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder addAllTagType(Iterable iterable0) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).addAllTagType(iterable0);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder addAllTagTypeValue(Iterable iterable0) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).addAllTagTypeValue(iterable0);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder addTagType(DiagnosticTagType diagnosticEventRequestOuterClass$DiagnosticTagType0) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).addTagType(diagnosticEventRequestOuterClass$DiagnosticTagType0);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder addTagTypeValue(int v) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).addTagTypeValue(v);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder clearCustomTagType() {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).clearCustomTagType();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder clearIntValue() {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).clearIntValue();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder clearStringValue() {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).clearStringValue();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder clearTagType() {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).clearTagType();
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder clearValue() {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).clearValue();
                return this;
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public String getCustomTagType() {
                return ((DiagnosticTag)this.instance).getCustomTagType();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public ByteString getCustomTagTypeBytes() {
                return ((DiagnosticTag)this.instance).getCustomTagTypeBytes();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public int getIntValue() {
                return ((DiagnosticTag)this.instance).getIntValue();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public String getStringValue() {
                return ((DiagnosticTag)this.instance).getStringValue();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public ByteString getStringValueBytes() {
                return ((DiagnosticTag)this.instance).getStringValueBytes();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public DiagnosticTagType getTagType(int v) {
                return ((DiagnosticTag)this.instance).getTagType(v);
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public int getTagTypeCount() {
                return ((DiagnosticTag)this.instance).getTagTypeCount();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public List getTagTypeList() {
                return ((DiagnosticTag)this.instance).getTagTypeList();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public int getTagTypeValue(int v) {
                return ((DiagnosticTag)this.instance).getTagTypeValue(v);
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public List getTagTypeValueList() {
                return DesugarCollections.unmodifiableList(((DiagnosticTag)this.instance).getTagTypeValueList());
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public ValueCase getValueCase() {
                return ((DiagnosticTag)this.instance).getValueCase();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public boolean hasCustomTagType() {
                return ((DiagnosticTag)this.instance).hasCustomTagType();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public boolean hasIntValue() {
                return ((DiagnosticTag)this.instance).hasIntValue();
            }

            @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
            public boolean hasStringValue() {
                return ((DiagnosticTag)this.instance).hasStringValue();
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setCustomTagType(String s) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).setCustomTagType(s);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setCustomTagTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).setCustomTagTypeBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setIntValue(int v) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).setIntValue(v);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setStringValue(String s) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).setStringValue(s);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setStringValueBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).setStringValueBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setTagType(int v, DiagnosticTagType diagnosticEventRequestOuterClass$DiagnosticTagType0) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).setTagType(v, diagnosticEventRequestOuterClass$DiagnosticTagType0);
                return this;
            }

            public gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder setTagTypeValue(int v, int v1) {
                this.copyOnWrite();
                ((DiagnosticTag)this.instance).setTagTypeValue(v, v1);
                return this;
            }
        }

        public static enum ValueCase {
            STRING_VALUE(3),
            INT_VALUE(4),
            VALUE_NOT_SET(0);

            private final int value;

            private static ValueCase[] $values() [...] // Inlined contents

            private ValueCase(int v1) {
                this.value = v1;
            }

            public static ValueCase forNumber(int v) {
                switch(v) {
                    case 0: {
                        return ValueCase.VALUE_NOT_SET;
                    }
                    case 3: {
                        return ValueCase.STRING_VALUE;
                    }
                    case 4: {
                        return ValueCase.INT_VALUE;
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
            public static ValueCase valueOf(int v) {
                return ValueCase.forNumber(v);
            }
        }

        class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.a implements Converter {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.a() {
                super();
            }

            public DiagnosticTagType a(Integer integer0) {
                DiagnosticTagType diagnosticEventRequestOuterClass$DiagnosticTagType0 = DiagnosticTagType.forNumber(((int)integer0));
                return diagnosticEventRequestOuterClass$DiagnosticTagType0 == null ? DiagnosticTagType.UNRECOGNIZED : diagnosticEventRequestOuterClass$DiagnosticTagType0;
            }

            @Override  // com.google.protobuf.Internal$ListAdapter$Converter
            public Object convert(Object object0) {
                return this.a(((Integer)object0));
            }
        }

        public static final int CUSTOM_TAG_TYPE_FIELD_NUMBER = 2;
        private static final DiagnosticTag DEFAULT_INSTANCE = null;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 3;
        public static final int TAG_TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String customTagType_;
        private int tagTypeMemoizedSerializedSize;
        private IntList tagType_;
        private static final Converter tagType_converter_;
        private int valueCase_;
        private Object value_;

        static {
            DiagnosticTag.tagType_converter_ = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.a();
            DiagnosticTag diagnosticEventRequestOuterClass$DiagnosticTag0 = new DiagnosticTag();
            DiagnosticTag.DEFAULT_INSTANCE = diagnosticEventRequestOuterClass$DiagnosticTag0;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticTag.class, diagnosticEventRequestOuterClass$DiagnosticTag0);
        }

        private DiagnosticTag() {
            this.valueCase_ = 0;
            this.tagType_ = GeneratedMessageLite.emptyIntList();
            this.customTagType_ = "";
        }

        private void addAllTagType(Iterable iterable0) {
            this.ensureTagTypeIsMutable();
            for(Object object0: iterable0) {
                this.tagType_.addInt(((DiagnosticTagType)object0).getNumber());
            }
        }

        private void addAllTagTypeValue(Iterable iterable0) {
            this.ensureTagTypeIsMutable();
            for(Object object0: iterable0) {
                this.tagType_.addInt(((int)(((Integer)object0))));
            }
        }

        private void addTagType(DiagnosticTagType diagnosticEventRequestOuterClass$DiagnosticTagType0) {
            diagnosticEventRequestOuterClass$DiagnosticTagType0.getClass();
            this.ensureTagTypeIsMutable();
            this.tagType_.addInt(diagnosticEventRequestOuterClass$DiagnosticTagType0.getNumber());
        }

        private void addTagTypeValue(int v) {
            this.ensureTagTypeIsMutable();
            this.tagType_.addInt(v);
        }

        private void clearCustomTagType() {
            this.bitField0_ &= -2;
            this.customTagType_ = DiagnosticTag.getDefaultInstance().getCustomTagType();
        }

        private void clearIntValue() {
            if(this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        private void clearStringValue() {
            if(this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        private void clearTagType() {
            this.tagType_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new DiagnosticTag();
                }
                case 2: {
                    return new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(DiagnosticTag.DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001,\u0002ለ\u0000\u0003Ȼ\u0000\u00047\u0000", new Object[]{"value_", "valueCase_", "bitField0_", "tagType_", "customTagType_"});
                }
                case 4: {
                    return DiagnosticTag.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = DiagnosticTag.PARSER;
                    if(parser0 == null) {
                        Class class0 = DiagnosticTag.class;
                        synchronized(class0) {
                            parser0 = DiagnosticTag.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(DiagnosticTag.DEFAULT_INSTANCE);
                                DiagnosticTag.PARSER = parser0;
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

        private void ensureTagTypeIsMutable() {
            IntList internal$IntList0 = this.tagType_;
            if(!internal$IntList0.isModifiable()) {
                this.tagType_ = GeneratedMessageLite.mutableCopy(internal$IntList0);
            }
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public String getCustomTagType() {
            return this.customTagType_;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public ByteString getCustomTagTypeBytes() {
            return ByteString.copyFromUtf8(this.customTagType_);
        }

        public static DiagnosticTag getDefaultInstance() {
            return DiagnosticTag.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public int getIntValue() {
            return this.valueCase_ == 4 ? ((int)(((Integer)this.value_))) : 0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public String getStringValue() {
            return this.valueCase_ == 3 ? ((String)this.value_) : "";
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public ByteString getStringValueBytes() {
            return this.valueCase_ == 3 ? ByteString.copyFromUtf8(((String)this.value_)) : ByteString.copyFromUtf8("");
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public DiagnosticTagType getTagType(int v) {
            DiagnosticTagType diagnosticEventRequestOuterClass$DiagnosticTagType0 = DiagnosticTagType.forNumber(this.tagType_.getInt(v));
            return diagnosticEventRequestOuterClass$DiagnosticTagType0 == null ? DiagnosticTagType.UNRECOGNIZED : diagnosticEventRequestOuterClass$DiagnosticTagType0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public int getTagTypeCount() {
            return this.tagType_.size();
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public List getTagTypeList() {
            return new ListAdapter(this.tagType_, DiagnosticTag.tagType_converter_);
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public int getTagTypeValue(int v) {
            return this.tagType_.getInt(v);
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public List getTagTypeValueList() {
            return this.tagType_;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public boolean hasCustomTagType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public boolean hasIntValue() {
            return this.valueCase_ == 4;
        }

        @Override  // gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticTagOrBuilder
        public boolean hasStringValue() {
            return this.valueCase_ == 3;
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder newBuilder() {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder)DiagnosticTag.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder newBuilder(DiagnosticTag diagnosticEventRequestOuterClass$DiagnosticTag0) {
            return (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTag.Builder)DiagnosticTag.DEFAULT_INSTANCE.createBuilder(diagnosticEventRequestOuterClass$DiagnosticTag0);
        }

        public static DiagnosticTag parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (DiagnosticTag)GeneratedMessageLite.parseDelimitedFrom(DiagnosticTag.DEFAULT_INSTANCE, inputStream0);
        }

        public static DiagnosticTag parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticTag)GeneratedMessageLite.parseDelimitedFrom(DiagnosticTag.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DiagnosticTag parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (DiagnosticTag)GeneratedMessageLite.parseFrom(DiagnosticTag.DEFAULT_INSTANCE, byteString0);
        }

        public static DiagnosticTag parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticTag)GeneratedMessageLite.parseFrom(DiagnosticTag.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static DiagnosticTag parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (DiagnosticTag)GeneratedMessageLite.parseFrom(DiagnosticTag.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static DiagnosticTag parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticTag)GeneratedMessageLite.parseFrom(DiagnosticTag.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static DiagnosticTag parseFrom(InputStream inputStream0) throws IOException {
            return (DiagnosticTag)GeneratedMessageLite.parseFrom(DiagnosticTag.DEFAULT_INSTANCE, inputStream0);
        }

        public static DiagnosticTag parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DiagnosticTag)GeneratedMessageLite.parseFrom(DiagnosticTag.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DiagnosticTag parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (DiagnosticTag)GeneratedMessageLite.parseFrom(DiagnosticTag.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static DiagnosticTag parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticTag)GeneratedMessageLite.parseFrom(DiagnosticTag.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static DiagnosticTag parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (DiagnosticTag)GeneratedMessageLite.parseFrom(DiagnosticTag.DEFAULT_INSTANCE, arr_b);
        }

        public static DiagnosticTag parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DiagnosticTag)GeneratedMessageLite.parseFrom(DiagnosticTag.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return DiagnosticTag.DEFAULT_INSTANCE.getParserForType();
        }

        private void setCustomTagType(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.customTagType_ = s;
        }

        private void setCustomTagTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.customTagType_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setIntValue(int v) {
            this.valueCase_ = 4;
            this.value_ = v;
        }

        private void setStringValue(String s) {
            s.getClass();
            this.valueCase_ = 3;
            this.value_ = s;
        }

        private void setStringValueBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.value_ = byteString0.toStringUtf8();
            this.valueCase_ = 3;
        }

        private void setTagType(int v, DiagnosticTagType diagnosticEventRequestOuterClass$DiagnosticTagType0) {
            diagnosticEventRequestOuterClass$DiagnosticTagType0.getClass();
            this.ensureTagTypeIsMutable();
            this.tagType_.setInt(v, diagnosticEventRequestOuterClass$DiagnosticTagType0.getNumber());
        }

        private void setTagTypeValue(int v, int v1) {
            this.ensureTagTypeIsMutable();
            this.tagType_.setInt(v, v1);
        }
    }

    public interface DiagnosticTagOrBuilder extends MessageLiteOrBuilder {
        String getCustomTagType();

        ByteString getCustomTagTypeBytes();

        int getIntValue();

        String getStringValue();

        ByteString getStringValueBytes();

        DiagnosticTagType getTagType(int arg1);

        int getTagTypeCount();

        List getTagTypeList();

        int getTagTypeValue(int arg1);

        List getTagTypeValueList();

        ValueCase getValueCase();

        boolean hasCustomTagType();

        boolean hasIntValue();

        boolean hasStringValue();
    }

    public static enum DiagnosticTagType implements EnumLite {
        class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.a implements EnumLiteMap {
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.a() {
                super();
            }

            public DiagnosticTagType a(int v) {
                return DiagnosticTagType.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.b.a = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return DiagnosticTagType.forNumber(v) != null;
            }
        }

        DIAGNOSTIC_TAG_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_TAG_TYPE_CUSTOM(1),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_TAG_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_TAG_TYPE_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static DiagnosticTagType[] $values() [...] // Inlined contents

        static {
            DiagnosticTagType.internalValueMap = new gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.a();
        }

        private DiagnosticTagType(int v1) {
            this.value = v1;
        }

        public static DiagnosticTagType forNumber(int v) {
            switch(v) {
                case 0: {
                    return DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_UNSPECIFIED;
                }
                case 1: {
                    return DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == DiagnosticTagType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return DiagnosticTagType.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticTagType.b.a;
        }

        @Deprecated
        public static DiagnosticTagType valueOf(int v) {
            return DiagnosticTagType.forNumber(v);
        }
    }

    static class gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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

