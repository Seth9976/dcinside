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
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DeveloperConsentOuterClass {
    public static final class DeveloperConsent extends GeneratedMessageLite implements DeveloperConsentOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements DeveloperConsentOrBuilder {
            private Builder() {
                super(DeveloperConsent.DEFAULT_INSTANCE);
            }

            Builder(a developerConsentOuterClass$a0) {
            }

            public Builder addAllOptions(Iterable iterable0) {
                this.copyOnWrite();
                ((DeveloperConsent)this.instance).addAllOptions(iterable0);
                return this;
            }

            public Builder addOptions(int v, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder developerConsentOuterClass$DeveloperConsentOption$Builder0) {
                this.copyOnWrite();
                ((DeveloperConsent)this.instance).addOptions(v, ((DeveloperConsentOption)developerConsentOuterClass$DeveloperConsentOption$Builder0.build()));
                return this;
            }

            public Builder addOptions(int v, DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0) {
                this.copyOnWrite();
                ((DeveloperConsent)this.instance).addOptions(v, developerConsentOuterClass$DeveloperConsentOption0);
                return this;
            }

            public Builder addOptions(gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder developerConsentOuterClass$DeveloperConsentOption$Builder0) {
                this.copyOnWrite();
                ((DeveloperConsent)this.instance).addOptions(((DeveloperConsentOption)developerConsentOuterClass$DeveloperConsentOption$Builder0.build()));
                return this;
            }

            public Builder addOptions(DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0) {
                this.copyOnWrite();
                ((DeveloperConsent)this.instance).addOptions(developerConsentOuterClass$DeveloperConsentOption0);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((DeveloperConsent)this.instance).clearOptions();
                return this;
            }

            @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOrBuilder
            public DeveloperConsentOption getOptions(int v) {
                return ((DeveloperConsent)this.instance).getOptions(v);
            }

            @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOrBuilder
            public int getOptionsCount() {
                return ((DeveloperConsent)this.instance).getOptionsCount();
            }

            @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOrBuilder
            public List getOptionsList() {
                return DesugarCollections.unmodifiableList(((DeveloperConsent)this.instance).getOptionsList());
            }

            public Builder removeOptions(int v) {
                this.copyOnWrite();
                ((DeveloperConsent)this.instance).removeOptions(v);
                return this;
            }

            public Builder setOptions(int v, gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder developerConsentOuterClass$DeveloperConsentOption$Builder0) {
                this.copyOnWrite();
                ((DeveloperConsent)this.instance).setOptions(v, ((DeveloperConsentOption)developerConsentOuterClass$DeveloperConsentOption$Builder0.build()));
                return this;
            }

            public Builder setOptions(int v, DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0) {
                this.copyOnWrite();
                ((DeveloperConsent)this.instance).setOptions(v, developerConsentOuterClass$DeveloperConsentOption0);
                return this;
            }
        }

        private static final DeveloperConsent DEFAULT_INSTANCE = null;
        public static final int OPTIONS_FIELD_NUMBER = 1;
        private static volatile Parser PARSER;
        private ProtobufList options_;

        static {
            DeveloperConsent developerConsentOuterClass$DeveloperConsent0 = new DeveloperConsent();
            DeveloperConsent.DEFAULT_INSTANCE = developerConsentOuterClass$DeveloperConsent0;
            GeneratedMessageLite.registerDefaultInstance(DeveloperConsent.class, developerConsentOuterClass$DeveloperConsent0);
        }

        private DeveloperConsent() {
            this.options_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllOptions(Iterable iterable0) {
            this.ensureOptionsIsMutable();
            AbstractMessageLite.addAll(iterable0, this.options_);
        }

        private void addOptions(int v, DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0) {
            developerConsentOuterClass$DeveloperConsentOption0.getClass();
            this.ensureOptionsIsMutable();
            this.options_.add(v, developerConsentOuterClass$DeveloperConsentOption0);
        }

        private void addOptions(DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0) {
            developerConsentOuterClass$DeveloperConsentOption0.getClass();
            this.ensureOptionsIsMutable();
            this.options_.add(developerConsentOuterClass$DeveloperConsentOption0);
        }

        private void clearOptions() {
            this.options_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new DeveloperConsent();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(DeveloperConsent.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"options_", DeveloperConsentOption.class});
                }
                case 4: {
                    return DeveloperConsent.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = DeveloperConsent.PARSER;
                    if(parser0 == null) {
                        Class class0 = DeveloperConsent.class;
                        synchronized(class0) {
                            parser0 = DeveloperConsent.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(DeveloperConsent.DEFAULT_INSTANCE);
                                DeveloperConsent.PARSER = parser0;
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

        private void ensureOptionsIsMutable() {
            ProtobufList internal$ProtobufList0 = this.options_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.options_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static DeveloperConsent getDefaultInstance() {
            return DeveloperConsent.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOrBuilder
        public DeveloperConsentOption getOptions(int v) {
            return (DeveloperConsentOption)this.options_.get(v);
        }

        @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOrBuilder
        public int getOptionsCount() {
            return this.options_.size();
        }

        @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOrBuilder
        public List getOptionsList() {
            return this.options_;
        }

        public DeveloperConsentOptionOrBuilder getOptionsOrBuilder(int v) {
            return (DeveloperConsentOptionOrBuilder)this.options_.get(v);
        }

        public List getOptionsOrBuilderList() {
            return this.options_;
        }

        public static Builder newBuilder() {
            return (Builder)DeveloperConsent.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DeveloperConsent developerConsentOuterClass$DeveloperConsent0) {
            return (Builder)DeveloperConsent.DEFAULT_INSTANCE.createBuilder(developerConsentOuterClass$DeveloperConsent0);
        }

        public static DeveloperConsent parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (DeveloperConsent)GeneratedMessageLite.parseDelimitedFrom(DeveloperConsent.DEFAULT_INSTANCE, inputStream0);
        }

        public static DeveloperConsent parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DeveloperConsent)GeneratedMessageLite.parseDelimitedFrom(DeveloperConsent.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DeveloperConsent parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (DeveloperConsent)GeneratedMessageLite.parseFrom(DeveloperConsent.DEFAULT_INSTANCE, byteString0);
        }

        public static DeveloperConsent parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DeveloperConsent)GeneratedMessageLite.parseFrom(DeveloperConsent.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static DeveloperConsent parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (DeveloperConsent)GeneratedMessageLite.parseFrom(DeveloperConsent.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static DeveloperConsent parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DeveloperConsent)GeneratedMessageLite.parseFrom(DeveloperConsent.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static DeveloperConsent parseFrom(InputStream inputStream0) throws IOException {
            return (DeveloperConsent)GeneratedMessageLite.parseFrom(DeveloperConsent.DEFAULT_INSTANCE, inputStream0);
        }

        public static DeveloperConsent parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DeveloperConsent)GeneratedMessageLite.parseFrom(DeveloperConsent.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DeveloperConsent parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (DeveloperConsent)GeneratedMessageLite.parseFrom(DeveloperConsent.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static DeveloperConsent parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DeveloperConsent)GeneratedMessageLite.parseFrom(DeveloperConsent.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static DeveloperConsent parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (DeveloperConsent)GeneratedMessageLite.parseFrom(DeveloperConsent.DEFAULT_INSTANCE, arr_b);
        }

        public static DeveloperConsent parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DeveloperConsent)GeneratedMessageLite.parseFrom(DeveloperConsent.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return DeveloperConsent.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeOptions(int v) {
            this.ensureOptionsIsMutable();
            this.options_.remove(v);
        }

        private void setOptions(int v, DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0) {
            developerConsentOuterClass$DeveloperConsentOption0.getClass();
            this.ensureOptionsIsMutable();
            this.options_.set(v, developerConsentOuterClass$DeveloperConsentOption0);
        }
    }

    public static enum DeveloperConsentChoice implements EnumLite {
        class gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.a implements EnumLiteMap {
            gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.a() {
                super();
            }

            public DeveloperConsentChoice a(int v) {
                return DeveloperConsentChoice.forNumber(v);
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
                return DeveloperConsentChoice.forNumber(v) != null;
            }
        }

        DEVELOPER_CONSENT_CHOICE_UNSPECIFIED(0),
        DEVELOPER_CONSENT_CHOICE_TRUE(1),
        DEVELOPER_CONSENT_CHOICE_FALSE(2),
        UNRECOGNIZED(-1);

        public static final int DEVELOPER_CONSENT_CHOICE_FALSE_VALUE = 2;
        public static final int DEVELOPER_CONSENT_CHOICE_TRUE_VALUE = 1;
        public static final int DEVELOPER_CONSENT_CHOICE_UNSPECIFIED_VALUE;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static DeveloperConsentChoice[] $values() [...] // Inlined contents

        static {
            DeveloperConsentChoice.internalValueMap = new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.a();
        }

        private DeveloperConsentChoice(int v1) {
            this.value = v1;
        }

        public static DeveloperConsentChoice forNumber(int v) {
            switch(v) {
                case 0: {
                    return DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
                }
                case 1: {
                    return DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE;
                }
                case 2: {
                    return DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == DeveloperConsentChoice.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return DeveloperConsentChoice.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Deprecated
        public static DeveloperConsentChoice valueOf(int v) {
            return DeveloperConsentChoice.forNumber(v);
        }
    }

    public static final class DeveloperConsentOption extends GeneratedMessageLite implements DeveloperConsentOptionOrBuilder {
        public static final class gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements DeveloperConsentOptionOrBuilder {
            private gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder() {
                super(DeveloperConsentOption.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder(a developerConsentOuterClass$a0) {
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder clearCustomType() {
                this.copyOnWrite();
                ((DeveloperConsentOption)this.instance).clearCustomType();
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder clearType() {
                this.copyOnWrite();
                ((DeveloperConsentOption)this.instance).clearType();
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder clearValue() {
                this.copyOnWrite();
                ((DeveloperConsentOption)this.instance).clearValue();
                return this;
            }

            @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
            public String getCustomType() {
                return ((DeveloperConsentOption)this.instance).getCustomType();
            }

            @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
            public ByteString getCustomTypeBytes() {
                return ((DeveloperConsentOption)this.instance).getCustomTypeBytes();
            }

            @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
            public DeveloperConsentType getType() {
                return ((DeveloperConsentOption)this.instance).getType();
            }

            @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
            public int getTypeValue() {
                return ((DeveloperConsentOption)this.instance).getTypeValue();
            }

            @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
            public DeveloperConsentChoice getValue() {
                return ((DeveloperConsentOption)this.instance).getValue();
            }

            @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
            public int getValueValue() {
                return ((DeveloperConsentOption)this.instance).getValueValue();
            }

            @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
            public boolean hasCustomType() {
                return ((DeveloperConsentOption)this.instance).hasCustomType();
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setCustomType(String s) {
                this.copyOnWrite();
                ((DeveloperConsentOption)this.instance).setCustomType(s);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setCustomTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DeveloperConsentOption)this.instance).setCustomTypeBytes(byteString0);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setType(DeveloperConsentType developerConsentOuterClass$DeveloperConsentType0) {
                this.copyOnWrite();
                ((DeveloperConsentOption)this.instance).setType(developerConsentOuterClass$DeveloperConsentType0);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setTypeValue(int v) {
                this.copyOnWrite();
                ((DeveloperConsentOption)this.instance).setTypeValue(v);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setValue(DeveloperConsentChoice developerConsentOuterClass$DeveloperConsentChoice0) {
                this.copyOnWrite();
                ((DeveloperConsentOption)this.instance).setValue(developerConsentOuterClass$DeveloperConsentChoice0);
                return this;
            }

            public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder setValueValue(int v) {
                this.copyOnWrite();
                ((DeveloperConsentOption)this.instance).setValueValue(v);
                return this;
            }
        }

        public static final int CUSTOM_TYPE_FIELD_NUMBER = 2;
        private static final DeveloperConsentOption DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private String customType_;
        private int type_;
        private int value_;

        static {
            DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0 = new DeveloperConsentOption();
            DeveloperConsentOption.DEFAULT_INSTANCE = developerConsentOuterClass$DeveloperConsentOption0;
            GeneratedMessageLite.registerDefaultInstance(DeveloperConsentOption.class, developerConsentOuterClass$DeveloperConsentOption0);
        }

        private DeveloperConsentOption() {
            this.customType_ = "";
        }

        private void clearCustomType() {
            this.bitField0_ &= -2;
            this.customType_ = "";
        }

        private void clearType() {
            this.type_ = 0;
        }

        private void clearValue() {
            this.value_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new DeveloperConsentOption();
                }
                case 2: {
                    return new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(DeveloperConsentOption.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003\f", new Object[]{"bitField0_", "type_", "customType_", "value_"});
                }
                case 4: {
                    return DeveloperConsentOption.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = DeveloperConsentOption.PARSER;
                    if(parser0 == null) {
                        Class class0 = DeveloperConsentOption.class;
                        synchronized(class0) {
                            parser0 = DeveloperConsentOption.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(DeveloperConsentOption.DEFAULT_INSTANCE);
                                DeveloperConsentOption.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
        public String getCustomType() {
            return this.customType_;
        }

        @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
        public ByteString getCustomTypeBytes() {
            return ByteString.copyFromUtf8(this.customType_);
        }

        public static DeveloperConsentOption getDefaultInstance() {
            return DeveloperConsentOption.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
        public DeveloperConsentType getType() {
            DeveloperConsentType developerConsentOuterClass$DeveloperConsentType0 = DeveloperConsentType.forNumber(this.type_);
            return developerConsentOuterClass$DeveloperConsentType0 == null ? DeveloperConsentType.UNRECOGNIZED : developerConsentOuterClass$DeveloperConsentType0;
        }

        @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
        public DeveloperConsentChoice getValue() {
            DeveloperConsentChoice developerConsentOuterClass$DeveloperConsentChoice0 = DeveloperConsentChoice.forNumber(this.value_);
            return developerConsentOuterClass$DeveloperConsentChoice0 == null ? DeveloperConsentChoice.UNRECOGNIZED : developerConsentOuterClass$DeveloperConsentChoice0;
        }

        @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
        public int getValueValue() {
            return this.value_;
        }

        @Override  // gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOptionOrBuilder
        public boolean hasCustomType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder() {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder)DeveloperConsentOption.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder(DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0) {
            return (gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder)DeveloperConsentOption.DEFAULT_INSTANCE.createBuilder(developerConsentOuterClass$DeveloperConsentOption0);
        }

        public static DeveloperConsentOption parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseDelimitedFrom(DeveloperConsentOption.DEFAULT_INSTANCE, inputStream0);
        }

        public static DeveloperConsentOption parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseDelimitedFrom(DeveloperConsentOption.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DeveloperConsentOption parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseFrom(DeveloperConsentOption.DEFAULT_INSTANCE, byteString0);
        }

        public static DeveloperConsentOption parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseFrom(DeveloperConsentOption.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static DeveloperConsentOption parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseFrom(DeveloperConsentOption.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static DeveloperConsentOption parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseFrom(DeveloperConsentOption.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static DeveloperConsentOption parseFrom(InputStream inputStream0) throws IOException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseFrom(DeveloperConsentOption.DEFAULT_INSTANCE, inputStream0);
        }

        public static DeveloperConsentOption parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseFrom(DeveloperConsentOption.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DeveloperConsentOption parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseFrom(DeveloperConsentOption.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static DeveloperConsentOption parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseFrom(DeveloperConsentOption.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static DeveloperConsentOption parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseFrom(DeveloperConsentOption.DEFAULT_INSTANCE, arr_b);
        }

        public static DeveloperConsentOption parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DeveloperConsentOption)GeneratedMessageLite.parseFrom(DeveloperConsentOption.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return DeveloperConsentOption.DEFAULT_INSTANCE.getParserForType();
        }

        private void setCustomType(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.customType_ = s;
        }

        private void setCustomTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.customType_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setType(DeveloperConsentType developerConsentOuterClass$DeveloperConsentType0) {
            this.type_ = developerConsentOuterClass$DeveloperConsentType0.getNumber();
        }

        private void setTypeValue(int v) {
            this.type_ = v;
        }

        private void setValue(DeveloperConsentChoice developerConsentOuterClass$DeveloperConsentChoice0) {
            this.value_ = developerConsentOuterClass$DeveloperConsentChoice0.getNumber();
        }

        private void setValueValue(int v) {
            this.value_ = v;
        }
    }

    public interface DeveloperConsentOptionOrBuilder extends MessageLiteOrBuilder {
        String getCustomType();

        ByteString getCustomTypeBytes();

        DeveloperConsentType getType();

        int getTypeValue();

        DeveloperConsentChoice getValue();

        int getValueValue();

        boolean hasCustomType();
    }

    public interface DeveloperConsentOrBuilder extends MessageLiteOrBuilder {
        DeveloperConsentOption getOptions(int arg1);

        int getOptionsCount();

        List getOptionsList();
    }

    public static enum DeveloperConsentType implements EnumLite {
        class gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.a implements EnumLiteMap {
            gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.a() {
                super();
            }

            public DeveloperConsentType a(int v) {
                return DeveloperConsentType.forNumber(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.b.a = new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return DeveloperConsentType.forNumber(v) != null;
            }
        }

        DEVELOPER_CONSENT_TYPE_UNSPECIFIED(0),
        DEVELOPER_CONSENT_TYPE_CUSTOM(1),
        DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL(2),
        DEVELOPER_CONSENT_TYPE_PIPL_CONSENT(3),
        DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT(4),
        DEVELOPER_CONSENT_TYPE_GDPR_CONSENT(5),
        DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT(6),
        UNRECOGNIZED(-1);

        public static final int DEVELOPER_CONSENT_TYPE_CUSTOM_VALUE = 1;
        public static final int DEVELOPER_CONSENT_TYPE_GDPR_CONSENT_VALUE = 5;
        public static final int DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL_VALUE = 2;
        public static final int DEVELOPER_CONSENT_TYPE_PIPL_CONSENT_VALUE = 3;
        public static final int DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT_VALUE = 4;
        public static final int DEVELOPER_CONSENT_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT_VALUE = 6;
        private static final EnumLiteMap internalValueMap;
        private final int value;

        private static DeveloperConsentType[] $values() [...] // Inlined contents

        static {
            DeveloperConsentType.internalValueMap = new gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.a();
        }

        private DeveloperConsentType(int v1) {
            this.value = v1;
        }

        public static DeveloperConsentType forNumber(int v) {
            switch(v) {
                case 0: {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
                }
                case 1: {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
                }
                case 2: {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                case 3: {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                case 4: {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                case 5: {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                case 6: {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == DeveloperConsentType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static EnumLiteMap internalGetValueMap() {
            return DeveloperConsentType.internalValueMap;
        }

        public static EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.b.a;
        }

        @Deprecated
        public static DeveloperConsentType valueOf(int v) {
            return DeveloperConsentType.forNumber(v);
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

