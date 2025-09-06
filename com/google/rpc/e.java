package com.google.rpc;

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

public final class e extends GeneratedMessageLite implements f {
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

    public static final class b extends Builder implements f {
        private b() {
            super(e.DEFAULT_INSTANCE);
        }

        b(a e$a0) {
        }

        public b Ab(ByteString byteString0) {
            this.copyOnWrite();
            ((e)this.instance).Gb(byteString0);
            return this;
        }

        public b Bb(int v, String s) {
            this.copyOnWrite();
            ((e)this.instance).Hb(v, s);
            return this;
        }

        @Override  // com.google.rpc.f
        public ByteString E7() {
            return ((e)this.instance).E7();
        }

        @Override  // com.google.rpc.f
        public String K4(int v) {
            return ((e)this.instance).K4(v);
        }

        @Override  // com.google.rpc.f
        public List V5() {
            return DesugarCollections.unmodifiableList(((e)this.instance).V5());
        }

        @Override  // com.google.rpc.f
        public int W4() {
            return ((e)this.instance).W4();
        }

        @Override  // com.google.rpc.f
        public String ma() {
            return ((e)this.instance).ma();
        }

        @Override  // com.google.rpc.f
        public ByteString q8(int v) {
            return ((e)this.instance).q8(v);
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((e)this.instance).A6(iterable0);
            return this;
        }

        public b vb(String s) {
            this.copyOnWrite();
            ((e)this.instance).B6(s);
            return this;
        }

        public b wb(ByteString byteString0) {
            this.copyOnWrite();
            ((e)this.instance).M6(byteString0);
            return this;
        }

        public b xb() {
            this.copyOnWrite();
            ((e)this.instance).Z7();
            return this;
        }

        public b yb() {
            this.copyOnWrite();
            ((e)this.instance).v8();
            return this;
        }

        public b zb(String s) {
            this.copyOnWrite();
            ((e)this.instance).Fb(s);
            return this;
        }
    }

    private static final e DEFAULT_INSTANCE = null;
    public static final int DETAIL_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
    private String detail_;
    private ProtobufList stackEntries_;

    static {
        e e0 = new e();
        e.DEFAULT_INSTANCE = e0;
        GeneratedMessageLite.registerDefaultInstance(e.class, e0);
    }

    private e() {
        this.stackEntries_ = GeneratedMessageLite.emptyProtobufList();
        this.detail_ = "";
    }

    private void A6(Iterable iterable0) {
        this.A8();
        AbstractMessageLite.addAll(iterable0, this.stackEntries_);
    }

    private void A8() {
        ProtobufList internal$ProtobufList0 = this.stackEntries_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.stackEntries_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static e Ab(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void B6(String s) {
        s.getClass();
        this.A8();
        this.stackEntries_.add(s);
    }

    public static e Bb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static e Cb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static e Db(byte[] arr_b) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.rpc.f
    public ByteString E7() {
        return ByteString.copyFromUtf8(this.detail_);
    }

    public static e Eb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Fb(String s) {
        s.getClass();
        this.detail_ = s;
    }

    private void Gb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.detail_ = byteString0.toStringUtf8();
    }

    private void Hb(int v, String s) {
        s.getClass();
        this.A8();
        this.stackEntries_.set(v, s);
    }

    public static b Ja(e e0) {
        return (b)e.DEFAULT_INSTANCE.createBuilder(e0);
    }

    @Override  // com.google.rpc.f
    public String K4(int v) {
        return (String)this.stackEntries_.get(v);
    }

    public static e La(InputStream inputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseDelimitedFrom(e.DEFAULT_INSTANCE, inputStream0);
    }

    private void M6(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.A8();
        this.stackEntries_.add(byteString0.toStringUtf8());
    }

    @Override  // com.google.rpc.f
    public List V5() {
        return this.stackEntries_;
    }

    @Override  // com.google.rpc.f
    public int W4() {
        return this.stackEntries_.size();
    }

    private void Z7() {
        this.detail_ = e.j9().ma();
    }

    public static b ca() {
        return (b)e.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new e();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(e.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"stackEntries_", "detail_"});
            }
            case 4: {
                return e.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = e.PARSER;
                if(parser0 == null) {
                    Class class0 = e.class;
                    synchronized(class0) {
                        parser0 = e.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(e.DEFAULT_INSTANCE);
                            e.PARSER = parser0;
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

    public static e j9() {
        return e.DEFAULT_INSTANCE;
    }

    @Override  // com.google.rpc.f
    public String ma() {
        return this.detail_;
    }

    public static Parser parser() {
        return e.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.rpc.f
    public ByteString q8(int v) {
        return ByteString.copyFromUtf8(((String)this.stackEntries_.get(v)));
    }

    public static e ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseDelimitedFrom(e.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void v8() {
        this.stackEntries_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static e vb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteString0);
    }

    public static e wb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static e xb(CodedInputStream codedInputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static e yb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static e zb(InputStream inputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, inputStream0);
    }
}

