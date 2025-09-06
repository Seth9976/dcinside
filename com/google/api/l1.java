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

public final class l1 extends GeneratedMessageLite implements m1 {
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

    public static final class b extends Builder implements m1 {
        private b() {
            super(l1.DEFAULT_INSTANCE);
        }

        b(a l1$a0) {
        }

        public b Ab() {
            this.copyOnWrite();
            ((l1)this.instance).A8();
            return this;
        }

        public b Bb(int v) {
            this.copyOnWrite();
            ((l1)this.instance).Ib(v);
            return this;
        }

        public b Cb(int v, com.google.api.i1.b i1$b0) {
            this.copyOnWrite();
            ((l1)this.instance).Jb(v, ((i1)i1$b0.build()));
            return this;
        }

        public b Db(int v, i1 i10) {
            this.copyOnWrite();
            ((l1)this.instance).Jb(v, i10);
            return this;
        }

        public b Eb(String s) {
            this.copyOnWrite();
            ((l1)this.instance).Kb(s);
            return this;
        }

        public b Fb(ByteString byteString0) {
            this.copyOnWrite();
            ((l1)this.instance).Lb(byteString0);
            return this;
        }

        @Override  // com.google.api.m1
        public i1 J2(int v) {
            return ((l1)this.instance).J2(v);
        }

        @Override  // com.google.api.m1
        public List N8() {
            return DesugarCollections.unmodifiableList(((l1)this.instance).N8());
        }

        @Override  // com.google.api.m1
        public String b() {
            return ((l1)this.instance).b();
        }

        @Override  // com.google.api.m1
        public ByteString c() {
            return ((l1)this.instance).c();
        }

        @Override  // com.google.api.m1
        public int k9() {
            return ((l1)this.instance).k9();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((l1)this.instance).B6(iterable0);
            return this;
        }

        public b vb(int v, com.google.api.i1.b i1$b0) {
            this.copyOnWrite();
            ((l1)this.instance).M6(v, ((i1)i1$b0.build()));
            return this;
        }

        public b wb(int v, i1 i10) {
            this.copyOnWrite();
            ((l1)this.instance).M6(v, i10);
            return this;
        }

        public b xb(com.google.api.i1.b i1$b0) {
            this.copyOnWrite();
            ((l1)this.instance).Z7(((i1)i1$b0.build()));
            return this;
        }

        public b yb(i1 i10) {
            this.copyOnWrite();
            ((l1)this.instance).Z7(i10);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((l1)this.instance).v8();
            return this;
        }
    }

    private static final l1 DEFAULT_INSTANCE = null;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private ProtobufList parameters_;
    private String selector_;

    static {
        l1 l10 = new l1();
        l1.DEFAULT_INSTANCE = l10;
        GeneratedMessageLite.registerDefaultInstance(l1.class, l10);
    }

    private l1() {
        this.selector_ = "";
        this.parameters_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A8() {
        this.selector_ = "";
    }

    public static l1 Ab(CodedInputStream codedInputStream0) throws IOException {
        return (l1)GeneratedMessageLite.parseFrom(l1.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void B6(Iterable iterable0) {
        this.j9();
        AbstractMessageLite.addAll(iterable0, this.parameters_);
    }

    public static l1 Bb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (l1)GeneratedMessageLite.parseFrom(l1.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static l1 Cb(InputStream inputStream0) throws IOException {
        return (l1)GeneratedMessageLite.parseFrom(l1.DEFAULT_INSTANCE, inputStream0);
    }

    public static l1 Db(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (l1)GeneratedMessageLite.parseFrom(l1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static l1 Eb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (l1)GeneratedMessageLite.parseFrom(l1.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static l1 Fb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (l1)GeneratedMessageLite.parseFrom(l1.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static l1 Gb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (l1)GeneratedMessageLite.parseFrom(l1.DEFAULT_INSTANCE, arr_b);
    }

    public static l1 Hb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (l1)GeneratedMessageLite.parseFrom(l1.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Ib(int v) {
        this.j9();
        this.parameters_.remove(v);
    }

    @Override  // com.google.api.m1
    public i1 J2(int v) {
        return (i1)this.parameters_.get(v);
    }

    public j1 Ja(int v) {
        return (j1)this.parameters_.get(v);
    }

    private void Jb(int v, i1 i10) {
        i10.getClass();
        this.j9();
        this.parameters_.set(v, i10);
    }

    private void Kb(String s) {
        s.getClass();
        this.selector_ = s;
    }

    public List La() {
        return this.parameters_;
    }

    private void Lb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.selector_ = byteString0.toStringUtf8();
    }

    private void M6(int v, i1 i10) {
        i10.getClass();
        this.j9();
        this.parameters_.add(v, i10);
    }

    @Override  // com.google.api.m1
    public List N8() {
        return this.parameters_;
    }

    private void Z7(i1 i10) {
        i10.getClass();
        this.j9();
        this.parameters_.add(i10);
    }

    @Override  // com.google.api.m1
    public String b() {
        return this.selector_;
    }

    @Override  // com.google.api.m1
    public ByteString c() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    public static l1 ca() {
        return l1.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new l1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(l1.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001B", new Object[]{"selector_", "parameters_", i1.class});
            }
            case 4: {
                return l1.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = l1.PARSER;
                if(parser0 == null) {
                    Class class0 = l1.class;
                    synchronized(class0) {
                        parser0 = l1.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(l1.DEFAULT_INSTANCE);
                            l1.PARSER = parser0;
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

    private void j9() {
        ProtobufList internal$ProtobufList0 = this.parameters_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.parameters_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.api.m1
    public int k9() {
        return this.parameters_.size();
    }

    public static Parser parser() {
        return l1.DEFAULT_INSTANCE.getParserForType();
    }

    public static b ub() {
        return (b)l1.DEFAULT_INSTANCE.createBuilder();
    }

    private void v8() {
        this.parameters_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static b vb(l1 l10) {
        return (b)l1.DEFAULT_INSTANCE.createBuilder(l10);
    }

    public static l1 wb(InputStream inputStream0) throws IOException {
        return (l1)GeneratedMessageLite.parseDelimitedFrom(l1.DEFAULT_INSTANCE, inputStream0);
    }

    public static l1 xb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (l1)GeneratedMessageLite.parseDelimitedFrom(l1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static l1 yb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (l1)GeneratedMessageLite.parseFrom(l1.DEFAULT_INSTANCE, byteString0);
    }

    public static l1 zb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (l1)GeneratedMessageLite.parseFrom(l1.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }
}

