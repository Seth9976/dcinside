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

public final class OperativeEventRequestOuterClass {
    public static final class OperativeEventErrorData extends GeneratedMessageLite implements OperativeEventErrorDataOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements OperativeEventErrorDataOrBuilder {
            private Builder() {
                super(OperativeEventErrorData.DEFAULT_INSTANCE);
            }

            Builder(a operativeEventRequestOuterClass$a0) {
            }

            public Builder clearErrorType() {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).clearErrorType();
                return this;
            }

            public Builder clearMessage() {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).clearMessage();
                return this;
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorDataOrBuilder
            public OperativeEventErrorType getErrorType() {
                return ((OperativeEventErrorData)this.instance).getErrorType();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorDataOrBuilder
            public int getErrorTypeValue() {
                return ((OperativeEventErrorData)this.instance).getErrorTypeValue();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorDataOrBuilder
            public String getMessage() {
                return ((OperativeEventErrorData)this.instance).getMessage();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorDataOrBuilder
            public ByteString getMessageBytes() {
                return ((OperativeEventErrorData)this.instance).getMessageBytes();
            }

            public Builder setErrorType(OperativeEventErrorType operativeEventRequestOuterClass$OperativeEventErrorType0) {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).setErrorType(operativeEventRequestOuterClass$OperativeEventErrorType0);
                return this;
            }

            public Builder setErrorTypeValue(int v) {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).setErrorTypeValue(v);
                return this;
            }

            public Builder setMessage(String s) {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).setMessage(s);
                return this;
            }

            public Builder setMessageBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((OperativeEventErrorData)this.instance).setMessageBytes(byteString0);
                return this;
            }
        }

        private static final OperativeEventErrorData DEFAULT_INSTANCE = null;
        public static final int ERROR_TYPE_FIELD_NUMBER = 1;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile Parser PARSER;
        private int errorType_;
        private String message_;

        static {
            OperativeEventErrorData operativeEventRequestOuterClass$OperativeEventErrorData0 = new OperativeEventErrorData();
            OperativeEventErrorData.DEFAULT_INSTANCE = operativeEventRequestOuterClass$OperativeEventErrorData0;
            GeneratedMessageLite.registerDefaultInstance(OperativeEventErrorData.class, operativeEventRequestOuterClass$OperativeEventErrorData0);
        }

        private OperativeEventErrorData() {
            this.message_ = "";
        }

        private void clearErrorType() {
            this.errorType_ = 0;
        }

        private void clearMessage() {
            this.message_ = "";
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new OperativeEventErrorData();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(OperativeEventErrorData.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"errorType_", "message_"});
                }
                case 4: {
                    return OperativeEventErrorData.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = OperativeEventErrorData.PARSER;
                    if(parser0 == null) {
                        Class class0 = OperativeEventErrorData.class;
                        synchronized(class0) {
                            parser0 = OperativeEventErrorData.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(OperativeEventErrorData.DEFAULT_INSTANCE);
                                OperativeEventErrorData.PARSER = parser0;
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

        public static OperativeEventErrorData getDefaultInstance() {
            return OperativeEventErrorData.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorDataOrBuilder
        public OperativeEventErrorType getErrorType() {
            OperativeEventErrorType operativeEventRequestOuterClass$OperativeEventErrorType0 = OperativeEventErrorType.forNumber(this.errorType_);
            return operativeEventRequestOuterClass$OperativeEventErrorType0 == null ? OperativeEventErrorType.UNRECOGNIZED : operativeEventRequestOuterClass$OperativeEventErrorType0;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorDataOrBuilder
        public int getErrorTypeValue() {
            return this.errorType_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorDataOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorDataOrBuilder
        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        public static Builder newBuilder() {
            return (Builder)OperativeEventErrorData.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(OperativeEventErrorData operativeEventRequestOuterClass$OperativeEventErrorData0) {
            return (Builder)OperativeEventErrorData.DEFAULT_INSTANCE.createBuilder(operativeEventRequestOuterClass$OperativeEventErrorData0);
        }

        public static OperativeEventErrorData parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseDelimitedFrom(OperativeEventErrorData.DEFAULT_INSTANCE, inputStream0);
        }

        public static OperativeEventErrorData parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseDelimitedFrom(OperativeEventErrorData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static OperativeEventErrorData parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom(OperativeEventErrorData.DEFAULT_INSTANCE, byteString0);
        }

        public static OperativeEventErrorData parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom(OperativeEventErrorData.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static OperativeEventErrorData parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom(OperativeEventErrorData.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static OperativeEventErrorData parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom(OperativeEventErrorData.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static OperativeEventErrorData parseFrom(InputStream inputStream0) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom(OperativeEventErrorData.DEFAULT_INSTANCE, inputStream0);
        }

        public static OperativeEventErrorData parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom(OperativeEventErrorData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static OperativeEventErrorData parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom(OperativeEventErrorData.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static OperativeEventErrorData parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom(OperativeEventErrorData.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static OperativeEventErrorData parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom(OperativeEventErrorData.DEFAULT_INSTANCE, arr_b);
        }

        public static OperativeEventErrorData parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData)GeneratedMessageLite.parseFrom(OperativeEventErrorData.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return OperativeEventErrorData.DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorType(OperativeEventErrorType operativeEventRequestOuterClass$OperativeEventErrorType0) {
            this.errorType_ = operativeEventRequestOuterClass$OperativeEventErrorType0.getNumber();
        }

        private void setErrorTypeValue(int v) {
            this.errorType_ = v;
        }

        private void setMessage(String s) {
            s.getClass();
            this.message_ = s;
        }

        private void setMessageBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.message_ = byteString0.toStringUtf8();
        }
    }

    public interface OperativeEventErrorDataOrBuilder extends MessageLiteOrBuilder {
        OperativeEventErrorType getErrorType();

        int getErrorTypeValue();

        String getMessage();

        ByteString getMessageBytes();
    }

    public static enum OperativeEventErrorType implements EnumLite {
        class gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.a implements EnumLiteMap {
            gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.a() {
                super();
            }

            public OperativeEventErrorType a(int v) {
                return OperativeEventErrorType.forNumber(v);
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
                return OperativeEventErrorType.forNumber(v) != null;
            }
        }

        OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED(0),
        OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT(1),
        UNRECOGNIZED(-1);

        public static final int OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT_VALUE = 1;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static OperativeEventErrorType[] $values() [...] // Inlined contents

        static {
            OperativeEventErrorType.internalValueMap = new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.a();
        }

        private OperativeEventErrorType(int v1) {
            this.value = v1;
        }

        public static OperativeEventErrorType forNumber(int v) {
            switch(v) {
                case 0: {
                    return OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                }
                case 1: {
                    return OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == OperativeEventErrorType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return OperativeEventErrorType.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Deprecated
        public static OperativeEventErrorType valueOf(int v) {
            return OperativeEventErrorType.forNumber(v);
        }
    }

    public static final class OperativeEventRequest extends GeneratedMessageLite implements OperativeEventRequestOrBuilder {
        public static final class gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements OperativeEventRequestOrBuilder {
            private gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder() {
                super(OperativeEventRequest.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder(a operativeEventRequestOuterClass$a0) {
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearAdditionalData() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearAdditionalData();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearCampaignState() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearCampaignState();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearDynamicDeviceInfo() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearEventId() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearEventId();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearEventType() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearEventType();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearImpressionOpportunityId() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearImpressionOpportunityId();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearSessionCounters() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearSessionCounters();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearSid() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearSid();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearStaticDeviceInfo() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearStaticDeviceInfo();
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder clearTrackingToken() {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).clearTrackingToken();
                return this;
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public ByteString getAdditionalData() {
                return ((OperativeEventRequest)this.instance).getAdditionalData();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public CampaignState getCampaignState() {
                return ((OperativeEventRequest)this.instance).getCampaignState();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((OperativeEventRequest)this.instance).getDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public ByteString getEventId() {
                return ((OperativeEventRequest)this.instance).getEventId();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public OperativeEventType getEventType() {
                return ((OperativeEventRequest)this.instance).getEventType();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public int getEventTypeValue() {
                return ((OperativeEventRequest)this.instance).getEventTypeValue();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((OperativeEventRequest)this.instance).getImpressionOpportunityId();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public SessionCounters getSessionCounters() {
                return ((OperativeEventRequest)this.instance).getSessionCounters();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public String getSid() {
                return ((OperativeEventRequest)this.instance).getSid();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public ByteString getSidBytes() {
                return ((OperativeEventRequest)this.instance).getSidBytes();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public StaticDeviceInfo getStaticDeviceInfo() {
                return ((OperativeEventRequest)this.instance).getStaticDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public ByteString getTrackingToken() {
                return ((OperativeEventRequest)this.instance).getTrackingToken();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public boolean hasCampaignState() {
                return ((OperativeEventRequest)this.instance).hasCampaignState();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((OperativeEventRequest)this.instance).hasDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public boolean hasSessionCounters() {
                return ((OperativeEventRequest)this.instance).hasSessionCounters();
            }

            @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((OperativeEventRequest)this.instance).hasStaticDeviceInfo();
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).mergeCampaignState(campaignStateOuterClass$CampaignState0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).mergeSessionCounters(sessionCountersOuterClass$SessionCounters0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).mergeStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setAdditionalData(ByteString byteString0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setAdditionalData(byteString0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder campaignStateOuterClass$CampaignState$Builder0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setCampaignState(((CampaignState)campaignStateOuterClass$CampaignState$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setCampaignState(campaignStateOuterClass$CampaignState0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setDynamicDeviceInfo(((DynamicDeviceInfo)dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setEventId(ByteString byteString0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setEventId(byteString0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setEventType(OperativeEventType operativeEventRequestOuterClass$OperativeEventType0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setEventType(operativeEventRequestOuterClass$OperativeEventType0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setEventTypeValue(int v) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setEventTypeValue(v);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setImpressionOpportunityId(ByteString byteString0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setImpressionOpportunityId(byteString0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder sessionCountersOuterClass$SessionCounters$Builder0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setSessionCounters(((SessionCounters)sessionCountersOuterClass$SessionCounters$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setSessionCounters(sessionCountersOuterClass$SessionCounters0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSid(String s) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setSid(s);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setSidBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setSidBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setStaticDeviceInfo(((StaticDeviceInfo)staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }

            public gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder setTrackingToken(ByteString byteString0) {
                this.copyOnWrite();
                ((OperativeEventRequest)this.instance).setTrackingToken(byteString0);
                return this;
            }
        }

        public static final int ADDITIONAL_DATA_FIELD_NUMBER = 5;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        private static final OperativeEventRequest DEFAULT_INSTANCE = null;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int EVENT_ID_FIELD_NUMBER = 1;
        public static final int EVENT_TYPE_FIELD_NUMBER = 2;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 7;
        public static final int SID_FIELD_NUMBER = 6;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 8;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 4;
        private ByteString additionalData_;
        private int bitField0_;
        private CampaignState campaignState_;
        private DynamicDeviceInfo dynamicDeviceInfo_;
        private ByteString eventId_;
        private int eventType_;
        private ByteString impressionOpportunityId_;
        private SessionCounters sessionCounters_;
        private String sid_;
        private StaticDeviceInfo staticDeviceInfo_;
        private ByteString trackingToken_;

        static {
            OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest0 = new OperativeEventRequest();
            OperativeEventRequest.DEFAULT_INSTANCE = operativeEventRequestOuterClass$OperativeEventRequest0;
            GeneratedMessageLite.registerDefaultInstance(OperativeEventRequest.class, operativeEventRequestOuterClass$OperativeEventRequest0);
        }

        private OperativeEventRequest() {
            this.eventId_ = ByteString.EMPTY;
            this.impressionOpportunityId_ = ByteString.EMPTY;
            this.trackingToken_ = ByteString.EMPTY;
            this.additionalData_ = ByteString.EMPTY;
            this.sid_ = "";
        }

        private void clearAdditionalData() {
            this.additionalData_ = OperativeEventRequest.getDefaultInstance().getAdditionalData();
        }

        private void clearCampaignState() {
            this.campaignState_ = null;
            this.bitField0_ &= -9;
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -5;
        }

        private void clearEventId() {
            this.eventId_ = OperativeEventRequest.getDefaultInstance().getEventId();
        }

        private void clearEventType() {
            this.eventType_ = 0;
        }

        private void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = OperativeEventRequest.getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -2;
        }

        private void clearSid() {
            this.sid_ = OperativeEventRequest.getDefaultInstance().getSid();
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        private void clearTrackingToken() {
            this.trackingToken_ = OperativeEventRequest.getDefaultInstance().getTrackingToken();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new OperativeEventRequest();
                }
                case 2: {
                    return new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(OperativeEventRequest.DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\n\u0002\f\u0003\n\u0004\n\u0005\n\u0006Ȉ\u0007ဉ\u0000\bဉ\u0001\tဉ\u0002\nဉ\u0003", new Object[]{"bitField0_", "eventId_", "eventType_", "impressionOpportunityId_", "trackingToken_", "additionalData_", "sid_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_"});
                }
                case 4: {
                    return OperativeEventRequest.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = OperativeEventRequest.PARSER;
                    if(parser0 == null) {
                        Class class0 = OperativeEventRequest.class;
                        synchronized(class0) {
                            parser0 = OperativeEventRequest.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(OperativeEventRequest.DEFAULT_INSTANCE);
                                OperativeEventRequest.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public ByteString getAdditionalData() {
            return this.additionalData_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public CampaignState getCampaignState() {
            return this.campaignState_ == null ? CampaignState.getDefaultInstance() : this.campaignState_;
        }

        public static OperativeEventRequest getDefaultInstance() {
            return OperativeEventRequest.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public DynamicDeviceInfo getDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ == null ? DynamicDeviceInfo.getDefaultInstance() : this.dynamicDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public ByteString getEventId() {
            return this.eventId_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public OperativeEventType getEventType() {
            OperativeEventType operativeEventRequestOuterClass$OperativeEventType0 = OperativeEventType.forNumber(this.eventType_);
            return operativeEventRequestOuterClass$OperativeEventType0 == null ? OperativeEventType.UNRECOGNIZED : operativeEventRequestOuterClass$OperativeEventType0;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public int getEventTypeValue() {
            return this.eventType_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public SessionCounters getSessionCounters() {
            return this.sessionCounters_ == null ? SessionCounters.getDefaultInstance() : this.sessionCounters_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public String getSid() {
            return this.sid_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public ByteString getSidBytes() {
            return ByteString.copyFromUtf8(this.sid_);
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public StaticDeviceInfo getStaticDeviceInfo() {
            return this.staticDeviceInfo_ == null ? StaticDeviceInfo.getDefaultInstance() : this.staticDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public boolean hasCampaignState() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public boolean hasSessionCounters() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
            campaignStateOuterClass$CampaignState0.getClass();
            this.campaignState_ = this.campaignState_ == null || this.campaignState_ == CampaignState.getDefaultInstance() ? campaignStateOuterClass$CampaignState0 : ((CampaignState)((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder)CampaignState.newBuilder(this.campaignState_).mergeFrom(campaignStateOuterClass$CampaignState0)).buildPartial());
            this.bitField0_ |= 8;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getClass();
            this.dynamicDeviceInfo_ = this.dynamicDeviceInfo_ == null || this.dynamicDeviceInfo_ == DynamicDeviceInfo.getDefaultInstance() ? dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 : ((DynamicDeviceInfo)((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder)DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0)).buildPartial());
            this.bitField0_ |= 4;
        }

        private void mergeSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
            sessionCountersOuterClass$SessionCounters0.getClass();
            this.sessionCounters_ = this.sessionCounters_ == null || this.sessionCounters_ == SessionCounters.getDefaultInstance() ? sessionCountersOuterClass$SessionCounters0 : ((SessionCounters)((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCountersOuterClass$SessionCounters0)).buildPartial());
            this.bitField0_ |= 1;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo0.getClass();
            this.staticDeviceInfo_ = this.staticDeviceInfo_ == null || this.staticDeviceInfo_ == StaticDeviceInfo.getDefaultInstance() ? staticDeviceInfoOuterClass$StaticDeviceInfo0 : ((StaticDeviceInfo)((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder)StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfoOuterClass$StaticDeviceInfo0)).buildPartial());
            this.bitField0_ |= 2;
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder newBuilder() {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder)OperativeEventRequest.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder newBuilder(OperativeEventRequest operativeEventRequestOuterClass$OperativeEventRequest0) {
            return (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.Builder)OperativeEventRequest.DEFAULT_INSTANCE.createBuilder(operativeEventRequestOuterClass$OperativeEventRequest0);
        }

        public static OperativeEventRequest parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseDelimitedFrom(OperativeEventRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static OperativeEventRequest parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseDelimitedFrom(OperativeEventRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static OperativeEventRequest parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom(OperativeEventRequest.DEFAULT_INSTANCE, byteString0);
        }

        public static OperativeEventRequest parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom(OperativeEventRequest.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static OperativeEventRequest parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom(OperativeEventRequest.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static OperativeEventRequest parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom(OperativeEventRequest.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static OperativeEventRequest parseFrom(InputStream inputStream0) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom(OperativeEventRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static OperativeEventRequest parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom(OperativeEventRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static OperativeEventRequest parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom(OperativeEventRequest.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static OperativeEventRequest parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom(OperativeEventRequest.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static OperativeEventRequest parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom(OperativeEventRequest.DEFAULT_INSTANCE, arr_b);
        }

        public static OperativeEventRequest parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OperativeEventRequest)GeneratedMessageLite.parseFrom(OperativeEventRequest.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return OperativeEventRequest.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdditionalData(ByteString byteString0) {
            byteString0.getClass();
            this.additionalData_ = byteString0;
        }

        private void setCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
            campaignStateOuterClass$CampaignState0.getClass();
            this.campaignState_ = campaignStateOuterClass$CampaignState0;
            this.bitField0_ |= 8;
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfoOuterClass$DynamicDeviceInfo0;
            this.bitField0_ |= 4;
        }

        private void setEventId(ByteString byteString0) {
            byteString0.getClass();
            this.eventId_ = byteString0;
        }

        private void setEventType(OperativeEventType operativeEventRequestOuterClass$OperativeEventType0) {
            this.eventType_ = operativeEventRequestOuterClass$OperativeEventType0.getNumber();
        }

        private void setEventTypeValue(int v) {
            this.eventType_ = v;
        }

        private void setImpressionOpportunityId(ByteString byteString0) {
            byteString0.getClass();
            this.impressionOpportunityId_ = byteString0;
        }

        private void setSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
            sessionCountersOuterClass$SessionCounters0.getClass();
            this.sessionCounters_ = sessionCountersOuterClass$SessionCounters0;
            this.bitField0_ |= 1;
        }

        private void setSid(String s) {
            s.getClass();
            this.sid_ = s;
        }

        private void setSidBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.sid_ = byteString0.toStringUtf8();
        }

        private void setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo0.getClass();
            this.staticDeviceInfo_ = staticDeviceInfoOuterClass$StaticDeviceInfo0;
            this.bitField0_ |= 2;
        }

        private void setTrackingToken(ByteString byteString0) {
            byteString0.getClass();
            this.trackingToken_ = byteString0;
        }
    }

    public interface OperativeEventRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdditionalData();

        CampaignState getCampaignState();

        DynamicDeviceInfo getDynamicDeviceInfo();

        ByteString getEventId();

        OperativeEventType getEventType();

        int getEventTypeValue();

        ByteString getImpressionOpportunityId();

        SessionCounters getSessionCounters();

        String getSid();

        ByteString getSidBytes();

        StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTrackingToken();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();
    }

    public static enum OperativeEventType implements EnumLite {
        class gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.a implements EnumLiteMap {
            gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.a() {
                super();
            }

            public OperativeEventType a(int v) {
                return OperativeEventType.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.b.a = new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return OperativeEventType.forNumber(v) != null;
            }
        }

        OPERATIVE_EVENT_TYPE_UNSPECIFIED(0),
        OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER(1),
        OPERATIVE_EVENT_TYPE_LOAD_ERROR(2),
        OPERATIVE_EVENT_TYPE_SHOW_ERROR(3),
        UNRECOGNIZED(-1);

        public static final int OPERATIVE_EVENT_TYPE_LOAD_ERROR_VALUE = 2;
        public static final int OPERATIVE_EVENT_TYPE_SHOW_ERROR_VALUE = 3;
        public static final int OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER_VALUE = 1;
        public static final int OPERATIVE_EVENT_TYPE_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static OperativeEventType[] $values() [...] // Inlined contents

        static {
            OperativeEventType.internalValueMap = new gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.a();
        }

        private OperativeEventType(int v1) {
            this.value = v1;
        }

        public static OperativeEventType forNumber(int v) {
            switch(v) {
                case 0: {
                    return OperativeEventType.OPERATIVE_EVENT_TYPE_UNSPECIFIED;
                }
                case 1: {
                    return OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
                }
                case 2: {
                    return OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
                }
                case 3: {
                    return OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == OperativeEventType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return OperativeEventType.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.b.a;
        }

        @Deprecated
        public static OperativeEventType valueOf(int v) {
            return OperativeEventType.forNumber(v);
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

