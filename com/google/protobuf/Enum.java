package com.google.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Enum extends GeneratedMessageLite implements EnumOrBuilder {
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements EnumOrBuilder {
        private Builder() {
            super(Enum.DEFAULT_INSTANCE);
        }

        Builder(a enum$a0) {
        }

        public Builder addAllEnumvalue(Iterable iterable0) {
            this.copyOnWrite();
            ((Enum)this.instance).addAllEnumvalue(iterable0);
            return this;
        }

        public Builder addAllOptions(Iterable iterable0) {
            this.copyOnWrite();
            ((Enum)this.instance).addAllOptions(iterable0);
            return this;
        }

        public Builder addEnumvalue(int v, com.google.protobuf.EnumValue.Builder enumValue$Builder0) {
            this.copyOnWrite();
            ((Enum)this.instance).addEnumvalue(v, ((EnumValue)enumValue$Builder0.build()));
            return this;
        }

        public Builder addEnumvalue(int v, EnumValue enumValue0) {
            this.copyOnWrite();
            ((Enum)this.instance).addEnumvalue(v, enumValue0);
            return this;
        }

        public Builder addEnumvalue(com.google.protobuf.EnumValue.Builder enumValue$Builder0) {
            this.copyOnWrite();
            ((Enum)this.instance).addEnumvalue(((EnumValue)enumValue$Builder0.build()));
            return this;
        }

        public Builder addEnumvalue(EnumValue enumValue0) {
            this.copyOnWrite();
            ((Enum)this.instance).addEnumvalue(enumValue0);
            return this;
        }

        public Builder addOptions(int v, com.google.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            ((Enum)this.instance).addOptions(v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(int v, Option option0) {
            this.copyOnWrite();
            ((Enum)this.instance).addOptions(v, option0);
            return this;
        }

        public Builder addOptions(com.google.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            ((Enum)this.instance).addOptions(((Option)option$Builder0.build()));
            return this;
        }

        public Builder addOptions(Option option0) {
            this.copyOnWrite();
            ((Enum)this.instance).addOptions(option0);
            return this;
        }

        public Builder clearEdition() {
            this.copyOnWrite();
            ((Enum)this.instance).clearEdition();
            return this;
        }

        public Builder clearEnumvalue() {
            this.copyOnWrite();
            ((Enum)this.instance).clearEnumvalue();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Enum)this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            ((Enum)this.instance).clearOptions();
            return this;
        }

        public Builder clearSourceContext() {
            this.copyOnWrite();
            ((Enum)this.instance).clearSourceContext();
            return this;
        }

        public Builder clearSyntax() {
            this.copyOnWrite();
            ((Enum)this.instance).clearSyntax();
            return this;
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public String getEdition() {
            return ((Enum)this.instance).getEdition();
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public ByteString getEditionBytes() {
            return ((Enum)this.instance).getEditionBytes();
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public EnumValue getEnumvalue(int v) {
            return ((Enum)this.instance).getEnumvalue(v);
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
            return ((Enum)this.instance).getEnumvalueCount();
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public List getEnumvalueList() {
            return DesugarCollections.unmodifiableList(((Enum)this.instance).getEnumvalueList());
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public String getName() {
            return ((Enum)this.instance).getName();
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public ByteString getNameBytes() {
            return ((Enum)this.instance).getNameBytes();
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public Option getOptions(int v) {
            return ((Enum)this.instance).getOptions(v);
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public int getOptionsCount() {
            return ((Enum)this.instance).getOptionsCount();
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public List getOptionsList() {
            return DesugarCollections.unmodifiableList(((Enum)this.instance).getOptionsList());
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public SourceContext getSourceContext() {
            return ((Enum)this.instance).getSourceContext();
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public Syntax getSyntax() {
            return ((Enum)this.instance).getSyntax();
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
            return ((Enum)this.instance).getSyntaxValue();
        }

        @Override  // com.google.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
            return ((Enum)this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext0) {
            this.copyOnWrite();
            ((Enum)this.instance).mergeSourceContext(sourceContext0);
            return this;
        }

        public Builder removeEnumvalue(int v) {
            this.copyOnWrite();
            ((Enum)this.instance).removeEnumvalue(v);
            return this;
        }

        public Builder removeOptions(int v) {
            this.copyOnWrite();
            ((Enum)this.instance).removeOptions(v);
            return this;
        }

        public Builder setEdition(String s) {
            this.copyOnWrite();
            ((Enum)this.instance).setEdition(s);
            return this;
        }

        public Builder setEditionBytes(ByteString byteString0) {
            this.copyOnWrite();
            ((Enum)this.instance).setEditionBytes(byteString0);
            return this;
        }

        public Builder setEnumvalue(int v, com.google.protobuf.EnumValue.Builder enumValue$Builder0) {
            this.copyOnWrite();
            ((Enum)this.instance).setEnumvalue(v, ((EnumValue)enumValue$Builder0.build()));
            return this;
        }

        public Builder setEnumvalue(int v, EnumValue enumValue0) {
            this.copyOnWrite();
            ((Enum)this.instance).setEnumvalue(v, enumValue0);
            return this;
        }

        public Builder setName(String s) {
            this.copyOnWrite();
            ((Enum)this.instance).setName(s);
            return this;
        }

        public Builder setNameBytes(ByteString byteString0) {
            this.copyOnWrite();
            ((Enum)this.instance).setNameBytes(byteString0);
            return this;
        }

        public Builder setOptions(int v, com.google.protobuf.Option.Builder option$Builder0) {
            this.copyOnWrite();
            ((Enum)this.instance).setOptions(v, ((Option)option$Builder0.build()));
            return this;
        }

        public Builder setOptions(int v, Option option0) {
            this.copyOnWrite();
            ((Enum)this.instance).setOptions(v, option0);
            return this;
        }

        public Builder setSourceContext(com.google.protobuf.SourceContext.Builder sourceContext$Builder0) {
            this.copyOnWrite();
            ((Enum)this.instance).setSourceContext(((SourceContext)sourceContext$Builder0.build()));
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext0) {
            this.copyOnWrite();
            ((Enum)this.instance).setSourceContext(sourceContext0);
            return this;
        }

        public Builder setSyntax(Syntax syntax0) {
            this.copyOnWrite();
            ((Enum)this.instance).setSyntax(syntax0);
            return this;
        }

        public Builder setSyntaxValue(int v) {
            this.copyOnWrite();
            ((Enum)this.instance).setSyntaxValue(v);
            return this;
        }
    }

    static class a {
        static final int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final Enum DEFAULT_INSTANCE = null;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private String edition_;
    private ProtobufList enumvalue_;
    private String name_;
    private ProtobufList options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        Enum enum0 = new Enum();
        Enum.DEFAULT_INSTANCE = enum0;
        GeneratedMessageLite.registerDefaultInstance(Enum.class, enum0);
    }

    private Enum() {
        this.name_ = "";
        this.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
        this.options_ = GeneratedMessageLite.emptyProtobufList();
        this.edition_ = "";
    }

    private void addAllEnumvalue(Iterable iterable0) {
        this.ensureEnumvalueIsMutable();
        AbstractMessageLite.addAll(iterable0, this.enumvalue_);
    }

    private void addAllOptions(Iterable iterable0) {
        this.ensureOptionsIsMutable();
        AbstractMessageLite.addAll(iterable0, this.options_);
    }

    private void addEnumvalue(int v, EnumValue enumValue0) {
        enumValue0.getClass();
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.add(v, enumValue0);
    }

    private void addEnumvalue(EnumValue enumValue0) {
        enumValue0.getClass();
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.add(enumValue0);
    }

    private void addOptions(int v, Option option0) {
        option0.getClass();
        this.ensureOptionsIsMutable();
        this.options_.add(v, option0);
    }

    private void addOptions(Option option0) {
        option0.getClass();
        this.ensureOptionsIsMutable();
        this.options_.add(option0);
    }

    private void clearEdition() {
        this.edition_ = "";
    }

    private void clearEnumvalue() {
        this.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        this.name_ = Enum.getDefaultInstance().getName();
    }

    private void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSourceContext() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSyntax() {
        this.syntax_ = 0;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Enum();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Enum.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\u001B\u0003\u001B\u0004ဉ\u0000\u0005\f\u0006Ȉ", new Object[]{"bitField0_", "name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_", "edition_"});
            }
            case 4: {
                return Enum.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Enum.PARSER;
                if(parser0 == null) {
                    Class class0 = Enum.class;
                    synchronized(class0) {
                        parser0 = Enum.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Enum.DEFAULT_INSTANCE);
                            Enum.PARSER = parser0;
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

    private void ensureEnumvalueIsMutable() {
        ProtobufList internal$ProtobufList0 = this.enumvalue_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.enumvalue_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    private void ensureOptionsIsMutable() {
        ProtobufList internal$ProtobufList0 = this.options_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.options_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static Enum getDefaultInstance() {
        return Enum.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public String getEdition() {
        return this.edition_;
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public ByteString getEditionBytes() {
        return ByteString.copyFromUtf8(this.edition_);
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public EnumValue getEnumvalue(int v) {
        return (EnumValue)this.enumvalue_.get(v);
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public List getEnumvalueList() {
        return this.enumvalue_;
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int v) {
        return (EnumValueOrBuilder)this.enumvalue_.get(v);
    }

    public List getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public SourceContext getSourceContext() {
        return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public Syntax getSyntax() {
        Syntax syntax0 = Syntax.forNumber(this.syntax_);
        return syntax0 == null ? Syntax.UNRECOGNIZED : syntax0;
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override  // com.google.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeSourceContext(SourceContext sourceContext0) {
        sourceContext0.getClass();
        this.sourceContext_ = this.sourceContext_ == null || this.sourceContext_ == SourceContext.getDefaultInstance() ? sourceContext0 : ((SourceContext)((com.google.protobuf.SourceContext.Builder)SourceContext.newBuilder(this.sourceContext_).mergeFrom(sourceContext0)).buildPartial());
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder)Enum.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Enum enum0) {
        return (Builder)Enum.DEFAULT_INSTANCE.createBuilder(enum0);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Enum)GeneratedMessageLite.parseDelimitedFrom(Enum.DEFAULT_INSTANCE, inputStream0);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Enum)GeneratedMessageLite.parseDelimitedFrom(Enum.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Enum parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, byteString0);
    }

    public static Enum parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Enum parseFrom(InputStream inputStream0) throws IOException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, inputStream0);
    }

    public static Enum parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Enum parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, arr_b);
    }

    public static Enum parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Enum)GeneratedMessageLite.parseFrom(Enum.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Enum.DEFAULT_INSTANCE.getParserForType();
    }

    private void removeEnumvalue(int v) {
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.remove(v);
    }

    private void removeOptions(int v) {
        this.ensureOptionsIsMutable();
        this.options_.remove(v);
    }

    private void setEdition(String s) {
        s.getClass();
        this.edition_ = s;
    }

    private void setEditionBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.edition_ = byteString0.toStringUtf8();
    }

    private void setEnumvalue(int v, EnumValue enumValue0) {
        enumValue0.getClass();
        this.ensureEnumvalueIsMutable();
        this.enumvalue_.set(v, enumValue0);
    }

    private void setName(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.name_ = byteString0.toStringUtf8();
    }

    private void setOptions(int v, Option option0) {
        option0.getClass();
        this.ensureOptionsIsMutable();
        this.options_.set(v, option0);
    }

    private void setSourceContext(SourceContext sourceContext0) {
        sourceContext0.getClass();
        this.sourceContext_ = sourceContext0;
        this.bitField0_ |= 1;
    }

    private void setSyntax(Syntax syntax0) {
        this.syntax_ = syntax0.getNumber();
    }

    private void setSyntaxValue(int v) {
        this.syntax_ = v;
    }
}

