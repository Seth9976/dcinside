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
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class p extends GeneratedMessageLite implements q {
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

    public static final class b extends Builder implements q {
        private b() {
            super(p.DEFAULT_INSTANCE);
        }

        b(a p$a0) {
        }

        public b Ab(int v) {
            this.copyOnWrite();
            ((p)this.instance).Eb(v);
            return this;
        }

        public b Bb(int v, com.google.rpc.p.c.a p$c$a0) {
            this.copyOnWrite();
            ((p)this.instance).Fb(v, ((c)p$c$a0.build()));
            return this;
        }

        public b Cb(int v, c p$c0) {
            this.copyOnWrite();
            ((p)this.instance).Fb(v, p$c0);
            return this;
        }

        @Override  // com.google.rpc.q
        public List S0() {
            return DesugarCollections.unmodifiableList(((p)this.instance).S0());
        }

        @Override  // com.google.rpc.q
        public c T0(int v) {
            return ((p)this.instance).T0(v);
        }

        @Override  // com.google.rpc.q
        public int p0() {
            return ((p)this.instance).p0();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((p)this.instance).d6(iterable0);
            return this;
        }

        public b vb(int v, com.google.rpc.p.c.a p$c$a0) {
            this.copyOnWrite();
            ((p)this.instance).z6(v, ((c)p$c$a0.build()));
            return this;
        }

        public b wb(int v, c p$c0) {
            this.copyOnWrite();
            ((p)this.instance).z6(v, p$c0);
            return this;
        }

        public b xb(com.google.rpc.p.c.a p$c$a0) {
            this.copyOnWrite();
            ((p)this.instance).A6(((c)p$c$a0.build()));
            return this;
        }

        public b yb(c p$c0) {
            this.copyOnWrite();
            ((p)this.instance).A6(p$c0);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((p)this.instance).B6();
            return this;
        }
    }

    public static final class c extends GeneratedMessageLite implements d {
        public static final class com.google.rpc.p.c.a extends Builder implements d {
            private com.google.rpc.p.c.a() {
                super(c.DEFAULT_INSTANCE);
            }

            com.google.rpc.p.c.a(a p$a0) {
            }

            @Override  // com.google.rpc.p$d
            public String D0() {
                return ((c)this.instance).D0();
            }

            @Override  // com.google.rpc.p$d
            public ByteString O0() {
                return ((c)this.instance).O0();
            }

            @Override  // com.google.rpc.p$d
            public ByteString a() {
                return ((c)this.instance).a();
            }

            @Override  // com.google.rpc.p$d
            public String getDescription() {
                return ((c)this.instance).getDescription();
            }

            public com.google.rpc.p.c.a ub() {
                this.copyOnWrite();
                ((c)this.instance).d6();
                return this;
            }

            public com.google.rpc.p.c.a vb() {
                this.copyOnWrite();
                ((c)this.instance).z6();
                return this;
            }

            public com.google.rpc.p.c.a wb(String s) {
                this.copyOnWrite();
                ((c)this.instance).zb(s);
                return this;
            }

            public com.google.rpc.p.c.a xb(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).Ab(byteString0);
                return this;
            }

            public com.google.rpc.p.c.a yb(String s) {
                this.copyOnWrite();
                ((c)this.instance).Bb(s);
                return this;
            }

            public com.google.rpc.p.c.a zb(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).Cb(byteString0);
                return this;
            }
        }

        private static final c DEFAULT_INSTANCE = null;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 1;
        private String description_;
        private String subject_;

        static {
            c p$c0 = new c();
            c.DEFAULT_INSTANCE = p$c0;
            GeneratedMessageLite.registerDefaultInstance(c.class, p$c0);
        }

        private c() {
            this.subject_ = "";
            this.description_ = "";
        }

        public static c A6() {
            return c.DEFAULT_INSTANCE;
        }

        public static c A8(ByteString byteString0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0);
        }

        private void Ab(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.description_ = byteString0.toStringUtf8();
        }

        public static com.google.rpc.p.c.a B6() {
            return (com.google.rpc.p.c.a)c.DEFAULT_INSTANCE.createBuilder();
        }

        private void Bb(String s) {
            s.getClass();
            this.subject_ = s;
        }

        private void Cb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.subject_ = byteString0.toStringUtf8();
        }

        @Override  // com.google.rpc.p$d
        public String D0() {
            return this.subject_;
        }

        public static c Ja(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static c La(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0);
        }

        public static com.google.rpc.p.c.a M6(c p$c0) {
            return (com.google.rpc.p.c.a)c.DEFAULT_INSTANCE.createBuilder(p$c0);
        }

        @Override  // com.google.rpc.p$d
        public ByteString O0() {
            return ByteString.copyFromUtf8(this.subject_);
        }

        public static c Z7(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0);
        }

        @Override  // com.google.rpc.p$d
        public ByteString a() {
            return ByteString.copyFromUtf8(this.description_);
        }

        public static c ca(CodedInputStream codedInputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0);
        }

        private void d6() {
            this.description_ = "";
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new c();
                }
                case 2: {
                    return new com.google.rpc.p.c.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(c.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"subject_", "description_"});
                }
                case 4: {
                    return c.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = c.PARSER;
                    if(parser0 == null) {
                        Class class0 = c.class;
                        synchronized(class0) {
                            parser0 = c.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(c.DEFAULT_INSTANCE);
                                c.PARSER = parser0;
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

        @Override  // com.google.rpc.p$d
        public String getDescription() {
            return this.description_;
        }

        public static c j9(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static Parser parser() {
            return c.DEFAULT_INSTANCE.getParserForType();
        }

        public static c ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static c v8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static c vb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static c wb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static c xb(byte[] arr_b) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b);
        }

        public static c yb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void z6() {
            this.subject_ = "";
        }

        private void zb(String s) {
            s.getClass();
            this.description_ = s;
        }
    }

    public interface d extends MessageLiteOrBuilder {
        String D0();

        ByteString O0();

        ByteString a();

        String getDescription();
    }

    private static final p DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private ProtobufList violations_;

    static {
        p p0 = new p();
        p.DEFAULT_INSTANCE = p0;
        GeneratedMessageLite.registerDefaultInstance(p.class, p0);
    }

    private p() {
        this.violations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A6(c p$c0) {
        p$c0.getClass();
        this.M6();
        this.violations_.add(p$c0);
    }

    public List A8() {
        return this.violations_;
    }

    public static p Ab(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void B6() {
        this.violations_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static p Bb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static p Cb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, arr_b);
    }

    public static p Db(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Eb(int v) {
        this.M6();
        this.violations_.remove(v);
    }

    private void Fb(int v, c p$c0) {
        p$c0.getClass();
        this.M6();
        this.violations_.set(v, p$c0);
    }

    public static p Ja(InputStream inputStream0) throws IOException {
        return (p)GeneratedMessageLite.parseDelimitedFrom(p.DEFAULT_INSTANCE, inputStream0);
    }

    public static p La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p)GeneratedMessageLite.parseDelimitedFrom(p.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void M6() {
        ProtobufList internal$ProtobufList0 = this.violations_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.violations_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.rpc.q
    public List S0() {
        return this.violations_;
    }

    @Override  // com.google.rpc.q
    public c T0(int v) {
        return (c)this.violations_.get(v);
    }

    public static p Z7() {
        return p.DEFAULT_INSTANCE;
    }

    public static b ca(p p0) {
        return (b)p.DEFAULT_INSTANCE.createBuilder(p0);
    }

    private void d6(Iterable iterable0) {
        this.M6();
        AbstractMessageLite.addAll(iterable0, this.violations_);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new p();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(p.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"violations_", c.class});
            }
            case 4: {
                return p.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = p.PARSER;
                if(parser0 == null) {
                    Class class0 = p.class;
                    synchronized(class0) {
                        parser0 = p.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(p.DEFAULT_INSTANCE);
                            p.PARSER = parser0;
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

    public static b j9() {
        return (b)p.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.rpc.q
    public int p0() {
        return this.violations_.size();
    }

    public static Parser parser() {
        return p.DEFAULT_INSTANCE.getParserForType();
    }

    public static p ub(ByteString byteString0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteString0);
    }

    public d v8(int v) {
        return (d)this.violations_.get(v);
    }

    public static p vb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static p wb(CodedInputStream codedInputStream0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static p xb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static p yb(InputStream inputStream0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, inputStream0);
    }

    private void z6(int v, c p$c0) {
        p$c0.getClass();
        this.M6();
        this.violations_.add(v, p$c0);
    }

    public static p zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

