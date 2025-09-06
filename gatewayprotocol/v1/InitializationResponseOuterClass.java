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

public final class InitializationResponseOuterClass {
    public static enum AdFormat implements EnumLite {
        class a implements EnumLiteMap {
            a() {
                super();
            }

            public AdFormat a(int v) {
                return AdFormat.forNumber(v);
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
                return AdFormat.forNumber(v) != null;
            }
        }

        AD_FORMAT_UNSPECIFIED(0),
        AD_FORMAT_INTERSTITIAL(1),
        AD_FORMAT_REWARDED(2),
        AD_FORMAT_BANNER(3),
        UNRECOGNIZED(-1);

        public static final int AD_FORMAT_BANNER_VALUE = 3;
        public static final int AD_FORMAT_INTERSTITIAL_VALUE = 1;
        public static final int AD_FORMAT_REWARDED_VALUE = 2;
        public static final int AD_FORMAT_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static AdFormat[] $values() [...] // Inlined contents

        static {
            AdFormat.internalValueMap = new a();
        }

        private AdFormat(int v1) {
            this.value = v1;
        }

        public static AdFormat forNumber(int v) {
            switch(v) {
                case 0: {
                    return AdFormat.AD_FORMAT_UNSPECIFIED;
                }
                case 1: {
                    return AdFormat.AD_FORMAT_INTERSTITIAL;
                }
                case 2: {
                    return AdFormat.AD_FORMAT_REWARDED;
                }
                case 3: {
                    return AdFormat.AD_FORMAT_BANNER;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == AdFormat.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return AdFormat.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Deprecated
        public static AdFormat valueOf(int v) {
            return AdFormat.forNumber(v);
        }
    }

    public static final class InitializationResponse extends GeneratedMessageLite implements InitializationResponseOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements InitializationResponseOrBuilder {
            private Builder() {
                super(InitializationResponse.DEFAULT_INSTANCE);
            }

            Builder(gatewayprotocol.v1.InitializationResponseOuterClass.a initializationResponseOuterClass$a0) {
            }

            public Builder addAllScarEligibleFormats(Iterable iterable0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).addAllScarEligibleFormats(iterable0);
                return this;
            }

            public Builder addAllScarEligibleFormatsValue(Iterable iterable0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).addAllScarEligibleFormatsValue(iterable0);
                return this;
            }

            public Builder addScarEligibleFormats(AdFormat initializationResponseOuterClass$AdFormat0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).addScarEligibleFormats(initializationResponseOuterClass$AdFormat0);
                return this;
            }

            public Builder addScarEligibleFormatsValue(int v) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).addScarEligibleFormatsValue(v);
                return this;
            }

            public Builder clearCountOfLastShownCampaigns() {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).clearCountOfLastShownCampaigns();
                return this;
            }

            public Builder clearError() {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).clearError();
                return this;
            }

            public Builder clearNativeConfiguration() {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).clearNativeConfiguration();
                return this;
            }

            public Builder clearScarEligibleFormats() {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).clearScarEligibleFormats();
                return this;
            }

            public Builder clearScarPlacements() {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).getMutableScarPlacementsMap().clear();
                return this;
            }

            public Builder clearTriggerInitializationCompletedRequest() {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).clearTriggerInitializationCompletedRequest();
                return this;
            }

            public Builder clearUniversalRequestUrl() {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).clearUniversalRequestUrl();
                return this;
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public boolean containsScarPlacements(String s) {
                s.getClass();
                return ((InitializationResponse)this.instance).getScarPlacementsMap().containsKey(s);
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public int getCountOfLastShownCampaigns() {
                return ((InitializationResponse)this.instance).getCountOfLastShownCampaigns();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public Error getError() {
                return ((InitializationResponse)this.instance).getError();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public NativeConfiguration getNativeConfiguration() {
                return ((InitializationResponse)this.instance).getNativeConfiguration();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public AdFormat getScarEligibleFormats(int v) {
                return ((InitializationResponse)this.instance).getScarEligibleFormats(v);
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public int getScarEligibleFormatsCount() {
                return ((InitializationResponse)this.instance).getScarEligibleFormatsCount();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public List getScarEligibleFormatsList() {
                return ((InitializationResponse)this.instance).getScarEligibleFormatsList();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public int getScarEligibleFormatsValue(int v) {
                return ((InitializationResponse)this.instance).getScarEligibleFormatsValue(v);
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public List getScarEligibleFormatsValueList() {
                return DesugarCollections.unmodifiableList(((InitializationResponse)this.instance).getScarEligibleFormatsValueList());
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            @Deprecated
            public Map getScarPlacements() {
                return this.getScarPlacementsMap();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public int getScarPlacementsCount() {
                return ((InitializationResponse)this.instance).getScarPlacementsMap().size();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public Map getScarPlacementsMap() {
                return DesugarCollections.unmodifiableMap(((InitializationResponse)this.instance).getScarPlacementsMap());
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public Placement getScarPlacementsOrDefault(String s, Placement initializationResponseOuterClass$Placement0) {
                s.getClass();
                Map map0 = ((InitializationResponse)this.instance).getScarPlacementsMap();
                return map0.containsKey(s) ? ((Placement)map0.get(s)) : initializationResponseOuterClass$Placement0;
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public Placement getScarPlacementsOrThrow(String s) {
                s.getClass();
                Map map0 = ((InitializationResponse)this.instance).getScarPlacementsMap();
                if(!map0.containsKey(s)) {
                    throw new IllegalArgumentException();
                }
                return (Placement)map0.get(s);
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public boolean getTriggerInitializationCompletedRequest() {
                return ((InitializationResponse)this.instance).getTriggerInitializationCompletedRequest();
            }

            // 去混淆评级： 低(20)
            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public String getUniversalRequestUrl() {
                return "";
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public ByteString getUniversalRequestUrlBytes() {
                return ((InitializationResponse)this.instance).getUniversalRequestUrlBytes();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public boolean hasError() {
                return ((InitializationResponse)this.instance).hasError();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public boolean hasNativeConfiguration() {
                return ((InitializationResponse)this.instance).hasNativeConfiguration();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
            public boolean hasUniversalRequestUrl() {
                return ((InitializationResponse)this.instance).hasUniversalRequestUrl();
            }

            public Builder mergeError(Error errorOuterClass$Error0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).mergeError(errorOuterClass$Error0);
                return this;
            }

            public Builder mergeNativeConfiguration(NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).mergeNativeConfiguration(nativeConfigurationOuterClass$NativeConfiguration0);
                return this;
            }

            public Builder putAllScarPlacements(Map map0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).getMutableScarPlacementsMap().putAll(map0);
                return this;
            }

            public Builder putScarPlacements(String s, Placement initializationResponseOuterClass$Placement0) {
                s.getClass();
                initializationResponseOuterClass$Placement0.getClass();
                this.copyOnWrite();
                ((InitializationResponse)this.instance).getMutableScarPlacementsMap().put(s, initializationResponseOuterClass$Placement0);
                return this;
            }

            public Builder removeScarPlacements(String s) {
                s.getClass();
                this.copyOnWrite();
                ((InitializationResponse)this.instance).getMutableScarPlacementsMap().remove(s);
                return this;
            }

            public Builder setCountOfLastShownCampaigns(int v) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).setCountOfLastShownCampaigns(v);
                return this;
            }

            public Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder errorOuterClass$Error$Builder0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).setError(((Error)errorOuterClass$Error$Builder0.build()));
                return this;
            }

            public Builder setError(Error errorOuterClass$Error0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).setError(errorOuterClass$Error0);
                return this;
            }

            public Builder setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder nativeConfigurationOuterClass$NativeConfiguration$Builder0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).setNativeConfiguration(((NativeConfiguration)nativeConfigurationOuterClass$NativeConfiguration$Builder0.build()));
                return this;
            }

            public Builder setNativeConfiguration(NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).setNativeConfiguration(nativeConfigurationOuterClass$NativeConfiguration0);
                return this;
            }

            public Builder setScarEligibleFormats(int v, AdFormat initializationResponseOuterClass$AdFormat0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).setScarEligibleFormats(v, initializationResponseOuterClass$AdFormat0);
                return this;
            }

            public Builder setScarEligibleFormatsValue(int v, int v1) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).setScarEligibleFormatsValue(v, v1);
                return this;
            }

            public Builder setTriggerInitializationCompletedRequest(boolean z) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).setTriggerInitializationCompletedRequest(z);
                return this;
            }

            public Builder setUniversalRequestUrl(String s) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).setUniversalRequestUrl(s);
                return this;
            }

            public Builder setUniversalRequestUrlBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((InitializationResponse)this.instance).setUniversalRequestUrlBytes(byteString0);
                return this;
            }
        }

        class gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.a implements Converter {
            gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.a() {
                super();
            }

            public AdFormat a(Integer integer0) {
                AdFormat initializationResponseOuterClass$AdFormat0 = AdFormat.forNumber(((int)integer0));
                return initializationResponseOuterClass$AdFormat0 == null ? AdFormat.UNRECOGNIZED : initializationResponseOuterClass$AdFormat0;
            }

            @Override  // com.google.protobuf.Internal$ListAdapter$Converter
            public Object convert(Object object0) {
                return this.a(((Integer)object0));
            }
        }

        static final class gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.b {
            static final MapEntryLite a;

            static {
                Placement initializationResponseOuterClass$Placement0 = Placement.getDefaultInstance();
                gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.b.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.MESSAGE, initializationResponseOuterClass$Placement0);
            }
        }

        public static final int COUNT_OF_LAST_SHOWN_CAMPAIGNS_FIELD_NUMBER = 5;
        private static final InitializationResponse DEFAULT_INSTANCE = null;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int NATIVE_CONFIGURATION_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int SCAR_ELIGIBLE_FORMATS_FIELD_NUMBER = 7;
        public static final int SCAR_PLACEMENTS_FIELD_NUMBER = 6;
        public static final int TRIGGER_INITIALIZATION_COMPLETED_REQUEST_FIELD_NUMBER = 4;
        public static final int UNIVERSAL_REQUEST_URL_FIELD_NUMBER = 2;
        private int bitField0_;
        private int countOfLastShownCampaigns_;
        private Error error_;
        private NativeConfiguration nativeConfiguration_;
        private int scarEligibleFormatsMemoizedSerializedSize;
        private IntList scarEligibleFormats_;
        private static final Converter scarEligibleFormats_converter_;
        private MapFieldLite scarPlacements_;
        private boolean triggerInitializationCompletedRequest_;
        private String universalRequestUrl_;

        static {
            InitializationResponse.scarEligibleFormats_converter_ = new gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.a();
            InitializationResponse initializationResponseOuterClass$InitializationResponse0 = new InitializationResponse();
            InitializationResponse.DEFAULT_INSTANCE = initializationResponseOuterClass$InitializationResponse0;
            GeneratedMessageLite.registerDefaultInstance(InitializationResponse.class, initializationResponseOuterClass$InitializationResponse0);
        }

        private InitializationResponse() {
            this.scarPlacements_ = MapFieldLite.emptyMapField();
            this.universalRequestUrl_ = "";
            this.scarEligibleFormats_ = GeneratedMessageLite.emptyIntList();
        }

        private void addAllScarEligibleFormats(Iterable iterable0) {
            this.ensureScarEligibleFormatsIsMutable();
            for(Object object0: iterable0) {
                this.scarEligibleFormats_.addInt(((AdFormat)object0).getNumber());
            }
        }

        private void addAllScarEligibleFormatsValue(Iterable iterable0) {
            this.ensureScarEligibleFormatsIsMutable();
            for(Object object0: iterable0) {
                this.scarEligibleFormats_.addInt(((int)(((Integer)object0))));
            }
        }

        private void addScarEligibleFormats(AdFormat initializationResponseOuterClass$AdFormat0) {
            initializationResponseOuterClass$AdFormat0.getClass();
            this.ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.addInt(initializationResponseOuterClass$AdFormat0.getNumber());
        }

        private void addScarEligibleFormatsValue(int v) {
            this.ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.addInt(v);
        }

        private void clearCountOfLastShownCampaigns() {
            this.countOfLastShownCampaigns_ = 0;
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -5;
        }

        private void clearNativeConfiguration() {
            this.nativeConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        private void clearScarEligibleFormats() {
            this.scarEligibleFormats_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearTriggerInitializationCompletedRequest() {
            this.triggerInitializationCompletedRequest_ = false;
        }

        private void clearUniversalRequestUrl() {
            this.bitField0_ &= -3;
            this.universalRequestUrl_ = InitializationResponse.getDefaultInstance().getUniversalRequestUrl();
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public boolean containsScarPlacements(String s) {
            s.getClass();
            return this.internalGetScarPlacements().containsKey(s);
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new InitializationResponse();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(InitializationResponse.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004\u0007\u0005\u0004\u00062\u0007,", new Object[]{"bitField0_", "nativeConfiguration_", "universalRequestUrl_", "error_", "triggerInitializationCompletedRequest_", "countOfLastShownCampaigns_", "scarPlacements_", gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.b.a, "scarEligibleFormats_"});
                }
                case 4: {
                    return InitializationResponse.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = InitializationResponse.PARSER;
                    if(parser0 == null) {
                        Class class0 = InitializationResponse.class;
                        synchronized(class0) {
                            parser0 = InitializationResponse.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(InitializationResponse.DEFAULT_INSTANCE);
                                InitializationResponse.PARSER = parser0;
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

        private void ensureScarEligibleFormatsIsMutable() {
            IntList internal$IntList0 = this.scarEligibleFormats_;
            if(!internal$IntList0.isModifiable()) {
                this.scarEligibleFormats_ = GeneratedMessageLite.mutableCopy(internal$IntList0);
            }
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public int getCountOfLastShownCampaigns() {
            return this.countOfLastShownCampaigns_;
        }

        public static InitializationResponse getDefaultInstance() {
            return InitializationResponse.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public Error getError() {
            return this.error_ == null ? Error.getDefaultInstance() : this.error_;
        }

        private Map getMutableScarPlacementsMap() {
            return this.internalGetMutableScarPlacements();
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public NativeConfiguration getNativeConfiguration() {
            return this.nativeConfiguration_ == null ? NativeConfiguration.getDefaultInstance() : this.nativeConfiguration_;
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public AdFormat getScarEligibleFormats(int v) {
            AdFormat initializationResponseOuterClass$AdFormat0 = AdFormat.forNumber(this.scarEligibleFormats_.getInt(v));
            return initializationResponseOuterClass$AdFormat0 == null ? AdFormat.UNRECOGNIZED : initializationResponseOuterClass$AdFormat0;
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public int getScarEligibleFormatsCount() {
            return this.scarEligibleFormats_.size();
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public List getScarEligibleFormatsList() {
            return new ListAdapter(this.scarEligibleFormats_, InitializationResponse.scarEligibleFormats_converter_);
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public int getScarEligibleFormatsValue(int v) {
            return this.scarEligibleFormats_.getInt(v);
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public List getScarEligibleFormatsValueList() {
            return this.scarEligibleFormats_;
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        @Deprecated
        public Map getScarPlacements() {
            return this.getScarPlacementsMap();
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public int getScarPlacementsCount() {
            return this.internalGetScarPlacements().size();
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public Map getScarPlacementsMap() {
            return DesugarCollections.unmodifiableMap(this.internalGetScarPlacements());
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public Placement getScarPlacementsOrDefault(String s, Placement initializationResponseOuterClass$Placement0) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.internalGetScarPlacements();
            return mapFieldLite0.containsKey(s) ? ((Placement)mapFieldLite0.get(s)) : initializationResponseOuterClass$Placement0;
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public Placement getScarPlacementsOrThrow(String s) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.internalGetScarPlacements();
            if(!mapFieldLite0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (Placement)mapFieldLite0.get(s);
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public boolean getTriggerInitializationCompletedRequest() {
            return this.triggerInitializationCompletedRequest_;
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public String getUniversalRequestUrl() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public ByteString getUniversalRequestUrlBytes() {
            return ByteString.copyFromUtf8(this.universalRequestUrl_);
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public boolean hasNativeConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponseOrBuilder
        public boolean hasUniversalRequestUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        private MapFieldLite internalGetMutableScarPlacements() {
            if(!this.scarPlacements_.isMutable()) {
                this.scarPlacements_ = this.scarPlacements_.mutableCopy();
            }
            return this.scarPlacements_;
        }

        private MapFieldLite internalGetScarPlacements() {
            return this.scarPlacements_;
        }

        private void mergeError(Error errorOuterClass$Error0) {
            errorOuterClass$Error0.getClass();
            this.error_ = this.error_ == null || this.error_ == Error.getDefaultInstance() ? errorOuterClass$Error0 : ((Error)((gatewayprotocol.v1.ErrorOuterClass.Error.Builder)Error.newBuilder(this.error_).mergeFrom(errorOuterClass$Error0)).buildPartial());
            this.bitField0_ |= 4;
        }

        private void mergeNativeConfiguration(NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0) {
            nativeConfigurationOuterClass$NativeConfiguration0.getClass();
            this.nativeConfiguration_ = this.nativeConfiguration_ == null || this.nativeConfiguration_ == NativeConfiguration.getDefaultInstance() ? nativeConfigurationOuterClass$NativeConfiguration0 : ((NativeConfiguration)((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder)NativeConfiguration.newBuilder(this.nativeConfiguration_).mergeFrom(nativeConfigurationOuterClass$NativeConfiguration0)).buildPartial());
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)InitializationResponse.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InitializationResponse initializationResponseOuterClass$InitializationResponse0) {
            return (Builder)InitializationResponse.DEFAULT_INSTANCE.createBuilder(initializationResponseOuterClass$InitializationResponse0);
        }

        public static InitializationResponse parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (InitializationResponse)GeneratedMessageLite.parseDelimitedFrom(InitializationResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static InitializationResponse parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationResponse)GeneratedMessageLite.parseDelimitedFrom(InitializationResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static InitializationResponse parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (InitializationResponse)GeneratedMessageLite.parseFrom(InitializationResponse.DEFAULT_INSTANCE, byteString0);
        }

        public static InitializationResponse parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationResponse)GeneratedMessageLite.parseFrom(InitializationResponse.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static InitializationResponse parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (InitializationResponse)GeneratedMessageLite.parseFrom(InitializationResponse.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static InitializationResponse parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationResponse)GeneratedMessageLite.parseFrom(InitializationResponse.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static InitializationResponse parseFrom(InputStream inputStream0) throws IOException {
            return (InitializationResponse)GeneratedMessageLite.parseFrom(InitializationResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static InitializationResponse parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationResponse)GeneratedMessageLite.parseFrom(InitializationResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static InitializationResponse parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (InitializationResponse)GeneratedMessageLite.parseFrom(InitializationResponse.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static InitializationResponse parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationResponse)GeneratedMessageLite.parseFrom(InitializationResponse.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static InitializationResponse parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (InitializationResponse)GeneratedMessageLite.parseFrom(InitializationResponse.DEFAULT_INSTANCE, arr_b);
        }

        public static InitializationResponse parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationResponse)GeneratedMessageLite.parseFrom(InitializationResponse.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return InitializationResponse.DEFAULT_INSTANCE.getParserForType();
        }

        private void setCountOfLastShownCampaigns(int v) {
            this.countOfLastShownCampaigns_ = v;
        }

        private void setError(Error errorOuterClass$Error0) {
            errorOuterClass$Error0.getClass();
            this.error_ = errorOuterClass$Error0;
            this.bitField0_ |= 4;
        }

        private void setNativeConfiguration(NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0) {
            nativeConfigurationOuterClass$NativeConfiguration0.getClass();
            this.nativeConfiguration_ = nativeConfigurationOuterClass$NativeConfiguration0;
            this.bitField0_ |= 1;
        }

        private void setScarEligibleFormats(int v, AdFormat initializationResponseOuterClass$AdFormat0) {
            initializationResponseOuterClass$AdFormat0.getClass();
            this.ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.setInt(v, initializationResponseOuterClass$AdFormat0.getNumber());
        }

        private void setScarEligibleFormatsValue(int v, int v1) {
            this.ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.setInt(v, v1);
        }

        private void setTriggerInitializationCompletedRequest(boolean z) {
            this.triggerInitializationCompletedRequest_ = z;
        }

        private void setUniversalRequestUrl(String s) {
            s.getClass();
            this.bitField0_ |= 2;
            this.universalRequestUrl_ = s;
        }

        private void setUniversalRequestUrlBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.universalRequestUrl_ = byteString0.toStringUtf8();
            this.bitField0_ |= 2;
        }
    }

    public interface InitializationResponseOrBuilder extends MessageLiteOrBuilder {
        boolean containsScarPlacements(String arg1);

        int getCountOfLastShownCampaigns();

        Error getError();

        NativeConfiguration getNativeConfiguration();

        AdFormat getScarEligibleFormats(int arg1);

        int getScarEligibleFormatsCount();

        List getScarEligibleFormatsList();

        int getScarEligibleFormatsValue(int arg1);

        List getScarEligibleFormatsValueList();

        @Deprecated
        Map getScarPlacements();

        int getScarPlacementsCount();

        Map getScarPlacementsMap();

        Placement getScarPlacementsOrDefault(String arg1, Placement arg2);

        Placement getScarPlacementsOrThrow(String arg1);

        boolean getTriggerInitializationCompletedRequest();

        String getUniversalRequestUrl();

        ByteString getUniversalRequestUrlBytes();

        boolean hasError();

        boolean hasNativeConfiguration();

        boolean hasUniversalRequestUrl();
    }

    public static final class Placement extends GeneratedMessageLite implements PlacementOrBuilder {
        public static final class gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements PlacementOrBuilder {
            private gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder() {
                super(Placement.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder(gatewayprotocol.v1.InitializationResponseOuterClass.a initializationResponseOuterClass$a0) {
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder clearAdFormat() {
                this.copyOnWrite();
                ((Placement)this.instance).clearAdFormat();
                return this;
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$PlacementOrBuilder
            public AdFormat getAdFormat() {
                return ((Placement)this.instance).getAdFormat();
            }

            @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$PlacementOrBuilder
            public int getAdFormatValue() {
                return ((Placement)this.instance).getAdFormatValue();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder setAdFormat(AdFormat initializationResponseOuterClass$AdFormat0) {
                this.copyOnWrite();
                ((Placement)this.instance).setAdFormat(initializationResponseOuterClass$AdFormat0);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder setAdFormatValue(int v) {
                this.copyOnWrite();
                ((Placement)this.instance).setAdFormatValue(v);
                return this;
            }
        }

        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        private static final Placement DEFAULT_INSTANCE;
        private static volatile Parser PARSER;
        private int adFormat_;

        static {
            Placement initializationResponseOuterClass$Placement0 = new Placement();
            Placement.DEFAULT_INSTANCE = initializationResponseOuterClass$Placement0;
            GeneratedMessageLite.registerDefaultInstance(Placement.class, initializationResponseOuterClass$Placement0);
        }

        private void clearAdFormat() {
            this.adFormat_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new Placement();
                }
                case 2: {
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(Placement.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"adFormat_"});
                }
                case 4: {
                    return Placement.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = Placement.PARSER;
                    if(parser0 == null) {
                        Class class0 = Placement.class;
                        synchronized(class0) {
                            parser0 = Placement.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(Placement.DEFAULT_INSTANCE);
                                Placement.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$PlacementOrBuilder
        public AdFormat getAdFormat() {
            AdFormat initializationResponseOuterClass$AdFormat0 = AdFormat.forNumber(this.adFormat_);
            return initializationResponseOuterClass$AdFormat0 == null ? AdFormat.UNRECOGNIZED : initializationResponseOuterClass$AdFormat0;
        }

        @Override  // gatewayprotocol.v1.InitializationResponseOuterClass$PlacementOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        public static Placement getDefaultInstance() {
            return Placement.DEFAULT_INSTANCE;
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder newBuilder() {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder)Placement.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder newBuilder(Placement initializationResponseOuterClass$Placement0) {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder)Placement.DEFAULT_INSTANCE.createBuilder(initializationResponseOuterClass$Placement0);
        }

        public static Placement parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (Placement)GeneratedMessageLite.parseDelimitedFrom(Placement.DEFAULT_INSTANCE, inputStream0);
        }

        public static Placement parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Placement)GeneratedMessageLite.parseDelimitedFrom(Placement.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Placement parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (Placement)GeneratedMessageLite.parseFrom(Placement.DEFAULT_INSTANCE, byteString0);
        }

        public static Placement parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Placement)GeneratedMessageLite.parseFrom(Placement.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static Placement parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (Placement)GeneratedMessageLite.parseFrom(Placement.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static Placement parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Placement)GeneratedMessageLite.parseFrom(Placement.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static Placement parseFrom(InputStream inputStream0) throws IOException {
            return (Placement)GeneratedMessageLite.parseFrom(Placement.DEFAULT_INSTANCE, inputStream0);
        }

        public static Placement parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Placement)GeneratedMessageLite.parseFrom(Placement.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Placement parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (Placement)GeneratedMessageLite.parseFrom(Placement.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static Placement parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Placement)GeneratedMessageLite.parseFrom(Placement.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static Placement parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (Placement)GeneratedMessageLite.parseFrom(Placement.DEFAULT_INSTANCE, arr_b);
        }

        public static Placement parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Placement)GeneratedMessageLite.parseFrom(Placement.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return Placement.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(AdFormat initializationResponseOuterClass$AdFormat0) {
            this.adFormat_ = initializationResponseOuterClass$AdFormat0.getNumber();
        }

        private void setAdFormatValue(int v) {
            this.adFormat_ = v;
        }
    }

    public interface PlacementOrBuilder extends MessageLiteOrBuilder {
        AdFormat getAdFormat();

        int getAdFormatValue();
    }

    static class gatewayprotocol.v1.InitializationResponseOuterClass.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            gatewayprotocol.v1.InitializationResponseOuterClass.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.InitializationResponseOuterClass.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.InitializationResponseOuterClass.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.InitializationResponseOuterClass.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.InitializationResponseOuterClass.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.InitializationResponseOuterClass.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                gatewayprotocol.v1.InitializationResponseOuterClass.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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

