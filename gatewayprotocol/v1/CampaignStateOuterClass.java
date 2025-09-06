package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class CampaignStateOuterClass {
    public static final class Campaign extends GeneratedMessageLite implements CampaignOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements CampaignOrBuilder {
            private Builder() {
                super(Campaign.DEFAULT_INSTANCE);
            }

            Builder(a campaignStateOuterClass$a0) {
            }

            public Builder clearData() {
                this.copyOnWrite();
                ((Campaign)this.instance).clearData();
                return this;
            }

            public Builder clearDataVersion() {
                this.copyOnWrite();
                ((Campaign)this.instance).clearDataVersion();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                this.copyOnWrite();
                ((Campaign)this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearLoadTimestamp() {
                this.copyOnWrite();
                ((Campaign)this.instance).clearLoadTimestamp();
                return this;
            }

            public Builder clearPlacementId() {
                this.copyOnWrite();
                ((Campaign)this.instance).clearPlacementId();
                return this;
            }

            public Builder clearShowTimestamp() {
                this.copyOnWrite();
                ((Campaign)this.instance).clearShowTimestamp();
                return this;
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
            public ByteString getData() {
                return ((Campaign)this.instance).getData();
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
            public int getDataVersion() {
                return ((Campaign)this.instance).getDataVersion();
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((Campaign)this.instance).getImpressionOpportunityId();
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
            public Timestamps getLoadTimestamp() {
                return ((Campaign)this.instance).getLoadTimestamp();
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
            public String getPlacementId() {
                return ((Campaign)this.instance).getPlacementId();
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
            public ByteString getPlacementIdBytes() {
                return ((Campaign)this.instance).getPlacementIdBytes();
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
            public Timestamps getShowTimestamp() {
                return ((Campaign)this.instance).getShowTimestamp();
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
            public boolean hasLoadTimestamp() {
                return ((Campaign)this.instance).hasLoadTimestamp();
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
            public boolean hasShowTimestamp() {
                return ((Campaign)this.instance).hasShowTimestamp();
            }

            public Builder mergeLoadTimestamp(Timestamps timestampsOuterClass$Timestamps0) {
                this.copyOnWrite();
                ((Campaign)this.instance).mergeLoadTimestamp(timestampsOuterClass$Timestamps0);
                return this;
            }

            public Builder mergeShowTimestamp(Timestamps timestampsOuterClass$Timestamps0) {
                this.copyOnWrite();
                ((Campaign)this.instance).mergeShowTimestamp(timestampsOuterClass$Timestamps0);
                return this;
            }

            public Builder setData(ByteString byteString0) {
                this.copyOnWrite();
                ((Campaign)this.instance).setData(byteString0);
                return this;
            }

            public Builder setDataVersion(int v) {
                this.copyOnWrite();
                ((Campaign)this.instance).setDataVersion(v);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString0) {
                this.copyOnWrite();
                ((Campaign)this.instance).setImpressionOpportunityId(byteString0);
                return this;
            }

            public Builder setLoadTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder timestampsOuterClass$Timestamps$Builder0) {
                this.copyOnWrite();
                ((Campaign)this.instance).setLoadTimestamp(((Timestamps)timestampsOuterClass$Timestamps$Builder0.build()));
                return this;
            }

            public Builder setLoadTimestamp(Timestamps timestampsOuterClass$Timestamps0) {
                this.copyOnWrite();
                ((Campaign)this.instance).setLoadTimestamp(timestampsOuterClass$Timestamps0);
                return this;
            }

            public Builder setPlacementId(String s) {
                this.copyOnWrite();
                ((Campaign)this.instance).setPlacementId(s);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((Campaign)this.instance).setPlacementIdBytes(byteString0);
                return this;
            }

            public Builder setShowTimestamp(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder timestampsOuterClass$Timestamps$Builder0) {
                this.copyOnWrite();
                ((Campaign)this.instance).setShowTimestamp(((Timestamps)timestampsOuterClass$Timestamps$Builder0.build()));
                return this;
            }

            public Builder setShowTimestamp(Timestamps timestampsOuterClass$Timestamps0) {
                this.copyOnWrite();
                ((Campaign)this.instance).setShowTimestamp(timestampsOuterClass$Timestamps0);
                return this;
            }
        }

        public static final int DATA_FIELD_NUMBER = 2;
        public static final int DATA_VERSION_FIELD_NUMBER = 1;
        private static final Campaign DEFAULT_INSTANCE = null;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
        public static final int LOAD_TIMESTAMP_FIELD_NUMBER = 5;
        private static volatile Parser PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 3;
        public static final int SHOW_TIMESTAMP_FIELD_NUMBER = 6;
        private int bitField0_;
        private int dataVersion_;
        private ByteString data_;
        private ByteString impressionOpportunityId_;
        private Timestamps loadTimestamp_;
        private String placementId_;
        private Timestamps showTimestamp_;

        static {
            Campaign campaignStateOuterClass$Campaign0 = new Campaign();
            Campaign.DEFAULT_INSTANCE = campaignStateOuterClass$Campaign0;
            GeneratedMessageLite.registerDefaultInstance(Campaign.class, campaignStateOuterClass$Campaign0);
        }

        private Campaign() {
            this.data_ = ByteString.EMPTY;
            this.placementId_ = "";
            this.impressionOpportunityId_ = ByteString.EMPTY;
        }

        private void clearData() {
            this.data_ = Campaign.getDefaultInstance().getData();
        }

        private void clearDataVersion() {
            this.dataVersion_ = 0;
        }

        private void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = Campaign.getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearLoadTimestamp() {
            this.loadTimestamp_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPlacementId() {
            this.placementId_ = Campaign.getDefaultInstance().getPlacementId();
        }

        private void clearShowTimestamp() {
            this.showTimestamp_ = null;
            this.bitField0_ &= -3;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new Campaign();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(Campaign.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003Ȉ\u0004\n\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "dataVersion_", "data_", "placementId_", "impressionOpportunityId_", "loadTimestamp_", "showTimestamp_"});
                }
                case 4: {
                    return Campaign.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = Campaign.PARSER;
                    if(parser0 == null) {
                        Class class0 = Campaign.class;
                        synchronized(class0) {
                            parser0 = Campaign.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(Campaign.DEFAULT_INSTANCE);
                                Campaign.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
        public int getDataVersion() {
            return this.dataVersion_;
        }

        public static Campaign getDefaultInstance() {
            return Campaign.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
        public Timestamps getLoadTimestamp() {
            return this.loadTimestamp_ == null ? Timestamps.getDefaultInstance() : this.loadTimestamp_;
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
        public String getPlacementId() {
            return this.placementId_;
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
        public Timestamps getShowTimestamp() {
            return this.showTimestamp_ == null ? Timestamps.getDefaultInstance() : this.showTimestamp_;
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
        public boolean hasLoadTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignOrBuilder
        public boolean hasShowTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeLoadTimestamp(Timestamps timestampsOuterClass$Timestamps0) {
            timestampsOuterClass$Timestamps0.getClass();
            this.loadTimestamp_ = this.loadTimestamp_ == null || this.loadTimestamp_ == Timestamps.getDefaultInstance() ? timestampsOuterClass$Timestamps0 : ((Timestamps)((gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder)Timestamps.newBuilder(this.loadTimestamp_).mergeFrom(timestampsOuterClass$Timestamps0)).buildPartial());
            this.bitField0_ |= 1;
        }

        private void mergeShowTimestamp(Timestamps timestampsOuterClass$Timestamps0) {
            timestampsOuterClass$Timestamps0.getClass();
            this.showTimestamp_ = this.showTimestamp_ == null || this.showTimestamp_ == Timestamps.getDefaultInstance() ? timestampsOuterClass$Timestamps0 : ((Timestamps)((gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder)Timestamps.newBuilder(this.showTimestamp_).mergeFrom(timestampsOuterClass$Timestamps0)).buildPartial());
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder)Campaign.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Campaign campaignStateOuterClass$Campaign0) {
            return (Builder)Campaign.DEFAULT_INSTANCE.createBuilder(campaignStateOuterClass$Campaign0);
        }

        public static Campaign parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (Campaign)GeneratedMessageLite.parseDelimitedFrom(Campaign.DEFAULT_INSTANCE, inputStream0);
        }

        public static Campaign parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Campaign)GeneratedMessageLite.parseDelimitedFrom(Campaign.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Campaign parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (Campaign)GeneratedMessageLite.parseFrom(Campaign.DEFAULT_INSTANCE, byteString0);
        }

        public static Campaign parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Campaign)GeneratedMessageLite.parseFrom(Campaign.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static Campaign parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (Campaign)GeneratedMessageLite.parseFrom(Campaign.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static Campaign parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Campaign)GeneratedMessageLite.parseFrom(Campaign.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static Campaign parseFrom(InputStream inputStream0) throws IOException {
            return (Campaign)GeneratedMessageLite.parseFrom(Campaign.DEFAULT_INSTANCE, inputStream0);
        }

        public static Campaign parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Campaign)GeneratedMessageLite.parseFrom(Campaign.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Campaign parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (Campaign)GeneratedMessageLite.parseFrom(Campaign.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static Campaign parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Campaign)GeneratedMessageLite.parseFrom(Campaign.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static Campaign parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (Campaign)GeneratedMessageLite.parseFrom(Campaign.DEFAULT_INSTANCE, arr_b);
        }

        public static Campaign parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Campaign)GeneratedMessageLite.parseFrom(Campaign.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return Campaign.DEFAULT_INSTANCE.getParserForType();
        }

        private void setData(ByteString byteString0) {
            byteString0.getClass();
            this.data_ = byteString0;
        }

        private void setDataVersion(int v) {
            this.dataVersion_ = v;
        }

        private void setImpressionOpportunityId(ByteString byteString0) {
            byteString0.getClass();
            this.impressionOpportunityId_ = byteString0;
        }

        private void setLoadTimestamp(Timestamps timestampsOuterClass$Timestamps0) {
            timestampsOuterClass$Timestamps0.getClass();
            this.loadTimestamp_ = timestampsOuterClass$Timestamps0;
            this.bitField0_ |= 1;
        }

        private void setPlacementId(String s) {
            s.getClass();
            this.placementId_ = s;
        }

        private void setPlacementIdBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.placementId_ = byteString0.toStringUtf8();
        }

        private void setShowTimestamp(Timestamps timestampsOuterClass$Timestamps0) {
            timestampsOuterClass$Timestamps0.getClass();
            this.showTimestamp_ = timestampsOuterClass$Timestamps0;
            this.bitField0_ |= 2;
        }
    }

    public interface CampaignOrBuilder extends MessageLiteOrBuilder {
        ByteString getData();

        int getDataVersion();

        ByteString getImpressionOpportunityId();

        Timestamps getLoadTimestamp();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        Timestamps getShowTimestamp();

        boolean hasLoadTimestamp();

        boolean hasShowTimestamp();
    }

    public static final class CampaignState extends GeneratedMessageLite implements CampaignStateOrBuilder {
        public static final class gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements CampaignStateOrBuilder {
            private gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder() {
                super(CampaignState.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder(a campaignStateOuterClass$a0) {
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addAllLoadedCampaigns(Iterable iterable0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).addAllLoadedCampaigns(iterable0);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addAllShownCampaigns(Iterable iterable0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).addAllShownCampaigns(iterable0);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(int v, Builder campaignStateOuterClass$Campaign$Builder0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).addLoadedCampaigns(v, ((Campaign)campaignStateOuterClass$Campaign$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(int v, Campaign campaignStateOuterClass$Campaign0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).addLoadedCampaigns(v, campaignStateOuterClass$Campaign0);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(Builder campaignStateOuterClass$Campaign$Builder0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).addLoadedCampaigns(((Campaign)campaignStateOuterClass$Campaign$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addLoadedCampaigns(Campaign campaignStateOuterClass$Campaign0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).addLoadedCampaigns(campaignStateOuterClass$Campaign0);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(int v, Builder campaignStateOuterClass$Campaign$Builder0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).addShownCampaigns(v, ((Campaign)campaignStateOuterClass$Campaign$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(int v, Campaign campaignStateOuterClass$Campaign0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).addShownCampaigns(v, campaignStateOuterClass$Campaign0);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(Builder campaignStateOuterClass$Campaign$Builder0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).addShownCampaigns(((Campaign)campaignStateOuterClass$Campaign$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder addShownCampaigns(Campaign campaignStateOuterClass$Campaign0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).addShownCampaigns(campaignStateOuterClass$Campaign0);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder clearLoadedCampaigns() {
                this.copyOnWrite();
                ((CampaignState)this.instance).clearLoadedCampaigns();
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder clearShownCampaigns() {
                this.copyOnWrite();
                ((CampaignState)this.instance).clearShownCampaigns();
                return this;
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
            public Campaign getLoadedCampaigns(int v) {
                return ((CampaignState)this.instance).getLoadedCampaigns(v);
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
            public int getLoadedCampaignsCount() {
                return ((CampaignState)this.instance).getLoadedCampaignsCount();
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
            public List getLoadedCampaignsList() {
                return DesugarCollections.unmodifiableList(((CampaignState)this.instance).getLoadedCampaignsList());
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
            public Campaign getShownCampaigns(int v) {
                return ((CampaignState)this.instance).getShownCampaigns(v);
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
            public int getShownCampaignsCount() {
                return ((CampaignState)this.instance).getShownCampaignsCount();
            }

            @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
            public List getShownCampaignsList() {
                return DesugarCollections.unmodifiableList(((CampaignState)this.instance).getShownCampaignsList());
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder removeLoadedCampaigns(int v) {
                this.copyOnWrite();
                ((CampaignState)this.instance).removeLoadedCampaigns(v);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder removeShownCampaigns(int v) {
                this.copyOnWrite();
                ((CampaignState)this.instance).removeShownCampaigns(v);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setLoadedCampaigns(int v, Builder campaignStateOuterClass$Campaign$Builder0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).setLoadedCampaigns(v, ((Campaign)campaignStateOuterClass$Campaign$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setLoadedCampaigns(int v, Campaign campaignStateOuterClass$Campaign0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).setLoadedCampaigns(v, campaignStateOuterClass$Campaign0);
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setShownCampaigns(int v, Builder campaignStateOuterClass$Campaign$Builder0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).setShownCampaigns(v, ((Campaign)campaignStateOuterClass$Campaign$Builder0.build()));
                return this;
            }

            public gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder setShownCampaigns(int v, Campaign campaignStateOuterClass$Campaign0) {
                this.copyOnWrite();
                ((CampaignState)this.instance).setShownCampaigns(v, campaignStateOuterClass$Campaign0);
                return this;
            }
        }

        private static final CampaignState DEFAULT_INSTANCE = null;
        public static final int LOADED_CAMPAIGNS_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int SHOWN_CAMPAIGNS_FIELD_NUMBER = 2;
        private ProtobufList loadedCampaigns_;
        private ProtobufList shownCampaigns_;

        static {
            CampaignState campaignStateOuterClass$CampaignState0 = new CampaignState();
            CampaignState.DEFAULT_INSTANCE = campaignStateOuterClass$CampaignState0;
            GeneratedMessageLite.registerDefaultInstance(CampaignState.class, campaignStateOuterClass$CampaignState0);
        }

        private CampaignState() {
            this.loadedCampaigns_ = GeneratedMessageLite.emptyProtobufList();
            this.shownCampaigns_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllLoadedCampaigns(Iterable iterable0) {
            this.ensureLoadedCampaignsIsMutable();
            AbstractMessageLite.addAll(iterable0, this.loadedCampaigns_);
        }

        private void addAllShownCampaigns(Iterable iterable0) {
            this.ensureShownCampaignsIsMutable();
            AbstractMessageLite.addAll(iterable0, this.shownCampaigns_);
        }

        private void addLoadedCampaigns(int v, Campaign campaignStateOuterClass$Campaign0) {
            campaignStateOuterClass$Campaign0.getClass();
            this.ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.add(v, campaignStateOuterClass$Campaign0);
        }

        private void addLoadedCampaigns(Campaign campaignStateOuterClass$Campaign0) {
            campaignStateOuterClass$Campaign0.getClass();
            this.ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.add(campaignStateOuterClass$Campaign0);
        }

        private void addShownCampaigns(int v, Campaign campaignStateOuterClass$Campaign0) {
            campaignStateOuterClass$Campaign0.getClass();
            this.ensureShownCampaignsIsMutable();
            this.shownCampaigns_.add(v, campaignStateOuterClass$Campaign0);
        }

        private void addShownCampaigns(Campaign campaignStateOuterClass$Campaign0) {
            campaignStateOuterClass$Campaign0.getClass();
            this.ensureShownCampaignsIsMutable();
            this.shownCampaigns_.add(campaignStateOuterClass$Campaign0);
        }

        private void clearLoadedCampaigns() {
            this.loadedCampaigns_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearShownCampaigns() {
            this.shownCampaigns_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new CampaignState();
                }
                case 2: {
                    return new gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(CampaignState.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"loadedCampaigns_", Campaign.class, "shownCampaigns_", Campaign.class});
                }
                case 4: {
                    return CampaignState.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = CampaignState.PARSER;
                    if(parser0 == null) {
                        Class class0 = CampaignState.class;
                        synchronized(class0) {
                            parser0 = CampaignState.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(CampaignState.DEFAULT_INSTANCE);
                                CampaignState.PARSER = parser0;
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

        private void ensureLoadedCampaignsIsMutable() {
            ProtobufList internal$ProtobufList0 = this.loadedCampaigns_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.loadedCampaigns_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureShownCampaignsIsMutable() {
            ProtobufList internal$ProtobufList0 = this.shownCampaigns_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.shownCampaigns_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static CampaignState getDefaultInstance() {
            return CampaignState.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
        public Campaign getLoadedCampaigns(int v) {
            return (Campaign)this.loadedCampaigns_.get(v);
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
        public int getLoadedCampaignsCount() {
            return this.loadedCampaigns_.size();
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
        public List getLoadedCampaignsList() {
            return this.loadedCampaigns_;
        }

        public CampaignOrBuilder getLoadedCampaignsOrBuilder(int v) {
            return (CampaignOrBuilder)this.loadedCampaigns_.get(v);
        }

        public List getLoadedCampaignsOrBuilderList() {
            return this.loadedCampaigns_;
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
        public Campaign getShownCampaigns(int v) {
            return (Campaign)this.shownCampaigns_.get(v);
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
        public int getShownCampaignsCount() {
            return this.shownCampaigns_.size();
        }

        @Override  // gatewayprotocol.v1.CampaignStateOuterClass$CampaignStateOrBuilder
        public List getShownCampaignsList() {
            return this.shownCampaigns_;
        }

        public CampaignOrBuilder getShownCampaignsOrBuilder(int v) {
            return (CampaignOrBuilder)this.shownCampaigns_.get(v);
        }

        public List getShownCampaignsOrBuilderList() {
            return this.shownCampaigns_;
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder newBuilder() {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder)CampaignState.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder newBuilder(CampaignState campaignStateOuterClass$CampaignState0) {
            return (gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder)CampaignState.DEFAULT_INSTANCE.createBuilder(campaignStateOuterClass$CampaignState0);
        }

        public static CampaignState parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (CampaignState)GeneratedMessageLite.parseDelimitedFrom(CampaignState.DEFAULT_INSTANCE, inputStream0);
        }

        public static CampaignState parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (CampaignState)GeneratedMessageLite.parseDelimitedFrom(CampaignState.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static CampaignState parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (CampaignState)GeneratedMessageLite.parseFrom(CampaignState.DEFAULT_INSTANCE, byteString0);
        }

        public static CampaignState parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (CampaignState)GeneratedMessageLite.parseFrom(CampaignState.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static CampaignState parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (CampaignState)GeneratedMessageLite.parseFrom(CampaignState.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static CampaignState parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (CampaignState)GeneratedMessageLite.parseFrom(CampaignState.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static CampaignState parseFrom(InputStream inputStream0) throws IOException {
            return (CampaignState)GeneratedMessageLite.parseFrom(CampaignState.DEFAULT_INSTANCE, inputStream0);
        }

        public static CampaignState parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (CampaignState)GeneratedMessageLite.parseFrom(CampaignState.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static CampaignState parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (CampaignState)GeneratedMessageLite.parseFrom(CampaignState.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static CampaignState parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (CampaignState)GeneratedMessageLite.parseFrom(CampaignState.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static CampaignState parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (CampaignState)GeneratedMessageLite.parseFrom(CampaignState.DEFAULT_INSTANCE, arr_b);
        }

        public static CampaignState parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (CampaignState)GeneratedMessageLite.parseFrom(CampaignState.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return CampaignState.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeLoadedCampaigns(int v) {
            this.ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.remove(v);
        }

        private void removeShownCampaigns(int v) {
            this.ensureShownCampaignsIsMutable();
            this.shownCampaigns_.remove(v);
        }

        private void setLoadedCampaigns(int v, Campaign campaignStateOuterClass$Campaign0) {
            campaignStateOuterClass$Campaign0.getClass();
            this.ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.set(v, campaignStateOuterClass$Campaign0);
        }

        private void setShownCampaigns(int v, Campaign campaignStateOuterClass$Campaign0) {
            campaignStateOuterClass$Campaign0.getClass();
            this.ensureShownCampaignsIsMutable();
            this.shownCampaigns_.set(v, campaignStateOuterClass$Campaign0);
        }
    }

    public interface CampaignStateOrBuilder extends MessageLiteOrBuilder {
        Campaign getLoadedCampaigns(int arg1);

        int getLoadedCampaignsCount();

        List getLoadedCampaignsList();

        Campaign getShownCampaigns(int arg1);

        int getShownCampaignsCount();

        List getShownCampaignsList();
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

