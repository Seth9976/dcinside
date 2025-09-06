package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class n0 extends GeneratedMessageLite implements o0 {
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

    public static final class b extends Builder implements o0 {
        private b() {
            super(n0.DEFAULT_INSTANCE);
        }

        b(a n0$a0) {
        }

        public b Ab() {
            this.copyOnWrite();
            ((n0)this.instance).vb();
            return this;
        }

        public b Bb() {
            this.copyOnWrite();
            ((n0)this.instance).wb();
            return this;
        }

        public b Cb() {
            this.copyOnWrite();
            ((n0)this.instance).clearName();
            return this;
        }

        public b Db(int v) {
            this.copyOnWrite();
            ((n0)this.instance).Pb(v);
            return this;
        }

        public b Eb(String s) {
            this.copyOnWrite();
            ((n0)this.instance).Qb(s);
            return this;
        }

        public b Fb(ByteString byteString0) {
            this.copyOnWrite();
            ((n0)this.instance).Rb(byteString0);
            return this;
        }

        public b Gb(String s) {
            this.copyOnWrite();
            ((n0)this.instance).Sb(s);
            return this;
        }

        public b Hb(ByteString byteString0) {
            this.copyOnWrite();
            ((n0)this.instance).Tb(byteString0);
            return this;
        }

        public b Ib(int v, com.google.api.i0.b i0$b0) {
            this.copyOnWrite();
            ((n0)this.instance).Ub(v, ((i0)i0$b0.build()));
            return this;
        }

        public b Jb(int v, i0 i00) {
            this.copyOnWrite();
            ((n0)this.instance).Ub(v, i00);
            return this;
        }

        public b Kb(String s) {
            this.copyOnWrite();
            ((n0)this.instance).setName(s);
            return this;
        }

        public b Lb(ByteString byteString0) {
            this.copyOnWrite();
            ((n0)this.instance).setNameBytes(byteString0);
            return this;
        }

        @Override  // com.google.api.o0
        public i0 O(int v) {
            return ((n0)this.instance).O(v);
        }

        @Override  // com.google.api.o0
        public ByteString a() {
            return ((n0)this.instance).a();
        }

        @Override  // com.google.api.o0
        public int d() {
            return ((n0)this.instance).d();
        }

        @Override  // com.google.api.o0
        public String getDescription() {
            return ((n0)this.instance).getDescription();
        }

        @Override  // com.google.api.o0
        public String getName() {
            return ((n0)this.instance).getName();
        }

        @Override  // com.google.api.o0
        public ByteString getNameBytes() {
            return ((n0)this.instance).getNameBytes();
        }

        @Override  // com.google.api.o0
        public String h() {
            return ((n0)this.instance).h();
        }

        @Override  // com.google.api.o0
        public ByteString r() {
            return ((n0)this.instance).r();
        }

        @Override  // com.google.api.o0
        public List s() {
            return DesugarCollections.unmodifiableList(((n0)this.instance).s());
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((n0)this.instance).ca(iterable0);
            return this;
        }

        public b vb(int v, com.google.api.i0.b i0$b0) {
            this.copyOnWrite();
            ((n0)this.instance).Ja(v, ((i0)i0$b0.build()));
            return this;
        }

        public b wb(int v, i0 i00) {
            this.copyOnWrite();
            ((n0)this.instance).Ja(v, i00);
            return this;
        }

        public b xb(com.google.api.i0.b i0$b0) {
            this.copyOnWrite();
            ((n0)this.instance).La(((i0)i0$b0.build()));
            return this;
        }

        public b yb(i0 i00) {
            this.copyOnWrite();
            ((n0)this.instance).La(i00);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((n0)this.instance).ub();
            return this;
        }
    }

    private static final n0 DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String description_;
    private String displayName_;
    private ProtobufList labels_;
    private String name_;

    static {
        n0 n00 = new n0();
        n0.DEFAULT_INSTANCE = n00;
        GeneratedMessageLite.registerDefaultInstance(n0.class, n00);
    }

    private n0() {
        this.name_ = "";
        this.labels_ = GeneratedMessageLite.emptyProtobufList();
        this.description_ = "";
        this.displayName_ = "";
    }

    public List Ab() {
        return this.labels_;
    }

    public static b Bb() {
        return (b)n0.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Cb(n0 n00) {
        return (b)n0.DEFAULT_INSTANCE.createBuilder(n00);
    }

    public static n0 Db(InputStream inputStream0) throws IOException {
        return (n0)GeneratedMessageLite.parseDelimitedFrom(n0.DEFAULT_INSTANCE, inputStream0);
    }

    public static n0 Eb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n0)GeneratedMessageLite.parseDelimitedFrom(n0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static n0 Fb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (n0)GeneratedMessageLite.parseFrom(n0.DEFAULT_INSTANCE, byteString0);
    }

    public static n0 Gb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n0)GeneratedMessageLite.parseFrom(n0.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static n0 Hb(CodedInputStream codedInputStream0) throws IOException {
        return (n0)GeneratedMessageLite.parseFrom(n0.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static n0 Ib(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n0)GeneratedMessageLite.parseFrom(n0.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    private void Ja(int v, i0 i00) {
        i00.getClass();
        this.xb();
        this.labels_.add(v, i00);
    }

    public static n0 Jb(InputStream inputStream0) throws IOException {
        return (n0)GeneratedMessageLite.parseFrom(n0.DEFAULT_INSTANCE, inputStream0);
    }

    public static n0 Kb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n0)GeneratedMessageLite.parseFrom(n0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void La(i0 i00) {
        i00.getClass();
        this.xb();
        this.labels_.add(i00);
    }

    public static n0 Lb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (n0)GeneratedMessageLite.parseFrom(n0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static n0 Mb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n0)GeneratedMessageLite.parseFrom(n0.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static n0 Nb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (n0)GeneratedMessageLite.parseFrom(n0.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.api.o0
    public i0 O(int v) {
        return (i0)this.labels_.get(v);
    }

    public static n0 Ob(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n0)GeneratedMessageLite.parseFrom(n0.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Pb(int v) {
        this.xb();
        this.labels_.remove(v);
    }

    private void Qb(String s) {
        s.getClass();
        this.description_ = s;
    }

    private void Rb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.description_ = byteString0.toStringUtf8();
    }

    private void Sb(String s) {
        s.getClass();
        this.displayName_ = s;
    }

    private void Tb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.displayName_ = byteString0.toStringUtf8();
    }

    private void Ub(int v, i0 i00) {
        i00.getClass();
        this.xb();
        this.labels_.set(v, i00);
    }

    @Override  // com.google.api.o0
    public ByteString a() {
        return ByteString.copyFromUtf8(this.description_);
    }

    private void ca(Iterable iterable0) {
        this.xb();
        AbstractMessageLite.addAll(iterable0, this.labels_);
    }

    private void clearName() {
        this.name_ = "";
    }

    @Override  // com.google.api.o0
    public int d() {
        return this.labels_.size();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new n0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(n0.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001B\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "labels_", i0.class, "description_", "displayName_"});
            }
            case 4: {
                return n0.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = n0.PARSER;
                if(parser0 == null) {
                    Class class0 = n0.class;
                    synchronized(class0) {
                        parser0 = n0.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(n0.DEFAULT_INSTANCE);
                            n0.PARSER = parser0;
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

    @Override  // com.google.api.o0
    public String getDescription() {
        return this.description_;
    }

    @Override  // com.google.api.o0
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.api.o0
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // com.google.api.o0
    public String h() {
        return this.displayName_;
    }

    public static Parser parser() {
        return n0.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.api.o0
    public ByteString r() {
        return ByteString.copyFromUtf8(this.displayName_);
    }

    @Override  // com.google.api.o0
    public List s() {
        return this.labels_;
    }

    private void setName(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.name_ = byteString0.toStringUtf8();
    }

    private void ub() {
        this.description_ = n0.yb().getDescription();
    }

    private void vb() {
        this.displayName_ = "";
    }

    private void wb() {
        this.labels_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void xb() {
        ProtobufList internal$ProtobufList0 = this.labels_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static n0 yb() {
        return n0.DEFAULT_INSTANCE;
    }

    public j0 zb(int v) {
        return (j0)this.labels_.get(v);
    }
}

