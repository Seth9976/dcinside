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

public final class n extends GeneratedMessageLite implements o {
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

    public static final class b extends Builder implements o {
        private b() {
            super(n.DEFAULT_INSTANCE);
        }

        b(a n$a0) {
        }

        public b Ab(int v) {
            this.copyOnWrite();
            ((n)this.instance).Eb(v);
            return this;
        }

        public b Bb(int v, com.google.rpc.n.c.a n$c$a0) {
            this.copyOnWrite();
            ((n)this.instance).Fb(v, ((c)n$c$a0.build()));
            return this;
        }

        public b Cb(int v, c n$c0) {
            this.copyOnWrite();
            ((n)this.instance).Fb(v, n$c0);
            return this;
        }

        @Override  // com.google.rpc.o
        public List S0() {
            return DesugarCollections.unmodifiableList(((n)this.instance).S0());
        }

        @Override  // com.google.rpc.o
        public c T0(int v) {
            return ((n)this.instance).T0(v);
        }

        @Override  // com.google.rpc.o
        public int p0() {
            return ((n)this.instance).p0();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((n)this.instance).d6(iterable0);
            return this;
        }

        public b vb(int v, com.google.rpc.n.c.a n$c$a0) {
            this.copyOnWrite();
            ((n)this.instance).z6(v, ((c)n$c$a0.build()));
            return this;
        }

        public b wb(int v, c n$c0) {
            this.copyOnWrite();
            ((n)this.instance).z6(v, n$c0);
            return this;
        }

        public b xb(com.google.rpc.n.c.a n$c$a0) {
            this.copyOnWrite();
            ((n)this.instance).A6(((c)n$c$a0.build()));
            return this;
        }

        public b yb(c n$c0) {
            this.copyOnWrite();
            ((n)this.instance).A6(n$c0);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((n)this.instance).B6();
            return this;
        }
    }

    public static final class c extends GeneratedMessageLite implements d {
        public static final class com.google.rpc.n.c.a extends Builder implements d {
            private com.google.rpc.n.c.a() {
                super(c.DEFAULT_INSTANCE);
            }

            com.google.rpc.n.c.a(a n$a0) {
            }

            public com.google.rpc.n.c.a Ab(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).Fb(byteString0);
                return this;
            }

            public com.google.rpc.n.c.a Bb(String s) {
                this.copyOnWrite();
                ((c)this.instance).setType(s);
                return this;
            }

            public com.google.rpc.n.c.a Cb(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).setTypeBytes(byteString0);
                return this;
            }

            @Override  // com.google.rpc.n$d
            public String D0() {
                return ((c)this.instance).D0();
            }

            @Override  // com.google.rpc.n$d
            public ByteString O0() {
                return ((c)this.instance).O0();
            }

            @Override  // com.google.rpc.n$d
            public ByteString a() {
                return ((c)this.instance).a();
            }

            @Override  // com.google.rpc.n$d
            public String getDescription() {
                return ((c)this.instance).getDescription();
            }

            @Override  // com.google.rpc.n$d
            public String getType() {
                return ((c)this.instance).getType();
            }

            @Override  // com.google.rpc.n$d
            public ByteString getTypeBytes() {
                return ((c)this.instance).getTypeBytes();
            }

            public com.google.rpc.n.c.a ub() {
                this.copyOnWrite();
                ((c)this.instance).B6();
                return this;
            }

            public com.google.rpc.n.c.a vb() {
                this.copyOnWrite();
                ((c)this.instance).M6();
                return this;
            }

            public com.google.rpc.n.c.a wb() {
                this.copyOnWrite();
                ((c)this.instance).clearType();
                return this;
            }

            public com.google.rpc.n.c.a xb(String s) {
                this.copyOnWrite();
                ((c)this.instance).Cb(s);
                return this;
            }

            public com.google.rpc.n.c.a yb(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).Db(byteString0);
                return this;
            }

            public com.google.rpc.n.c.a zb(String s) {
                this.copyOnWrite();
                ((c)this.instance).Eb(s);
                return this;
            }
        }

        private static final c DEFAULT_INSTANCE = null;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String description_;
        private String subject_;
        private String type_;

        static {
            c n$c0 = new c();
            c.DEFAULT_INSTANCE = n$c0;
            GeneratedMessageLite.registerDefaultInstance(c.class, n$c0);
        }

        private c() {
            this.type_ = "";
            this.subject_ = "";
            this.description_ = "";
        }

        public static com.google.rpc.n.c.a A8(c n$c0) {
            return (com.google.rpc.n.c.a)c.DEFAULT_INSTANCE.createBuilder(n$c0);
        }

        public static c Ab(byte[] arr_b) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b);
        }

        private void B6() {
            this.description_ = "";
        }

        public static c Bb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void Cb(String s) {
            s.getClass();
            this.description_ = s;
        }

        @Override  // com.google.rpc.n$d
        public String D0() {
            return this.subject_;
        }

        private void Db(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.description_ = byteString0.toStringUtf8();
        }

        private void Eb(String s) {
            s.getClass();
            this.subject_ = s;
        }

        private void Fb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.subject_ = byteString0.toStringUtf8();
        }

        public static c Ja(ByteString byteString0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0);
        }

        public static c La(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        private void M6() {
            this.subject_ = c.Z7().D0();
        }

        @Override  // com.google.rpc.n$d
        public ByteString O0() {
            return ByteString.copyFromUtf8(this.subject_);
        }

        public static c Z7() {
            return c.DEFAULT_INSTANCE;
        }

        @Override  // com.google.rpc.n$d
        public ByteString a() {
            return ByteString.copyFromUtf8(this.description_);
        }

        public static c ca(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        private void clearType() {
            this.type_ = "";
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new c();
                }
                case 2: {
                    return new com.google.rpc.n.c.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(c.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "subject_", "description_"});
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

        @Override  // com.google.rpc.n$d
        public String getDescription() {
            return this.description_;
        }

        @Override  // com.google.rpc.n$d
        public String getType() {
            return this.type_;
        }

        @Override  // com.google.rpc.n$d
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        public static c j9(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0);
        }

        public static Parser parser() {
            return c.DEFAULT_INSTANCE.getParserForType();
        }

        private void setType(String s) {
            s.getClass();
            this.type_ = s;
        }

        private void setTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.type_ = byteString0.toStringUtf8();
        }

        public static c ub(CodedInputStream codedInputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static com.google.rpc.n.c.a v8() {
            return (com.google.rpc.n.c.a)c.DEFAULT_INSTANCE.createBuilder();
        }

        public static c vb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static c wb(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0);
        }

        public static c xb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static c yb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static c zb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }
    }

    public interface d extends MessageLiteOrBuilder {
        String D0();

        ByteString O0();

        ByteString a();

        String getDescription();

        String getType();

        ByteString getTypeBytes();
    }

    private static final n DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private ProtobufList violations_;

    static {
        n n0 = new n();
        n.DEFAULT_INSTANCE = n0;
        GeneratedMessageLite.registerDefaultInstance(n.class, n0);
    }

    private n() {
        this.violations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A6(c n$c0) {
        n$c0.getClass();
        this.M6();
        this.violations_.add(n$c0);
    }

    public List A8() {
        return this.violations_;
    }

    public static n Ab(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void B6() {
        this.violations_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static n Bb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static n Cb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, arr_b);
    }

    public static n Db(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Eb(int v) {
        this.M6();
        this.violations_.remove(v);
    }

    private void Fb(int v, c n$c0) {
        n$c0.getClass();
        this.M6();
        this.violations_.set(v, n$c0);
    }

    public static n Ja(InputStream inputStream0) throws IOException {
        return (n)GeneratedMessageLite.parseDelimitedFrom(n.DEFAULT_INSTANCE, inputStream0);
    }

    public static n La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n)GeneratedMessageLite.parseDelimitedFrom(n.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void M6() {
        ProtobufList internal$ProtobufList0 = this.violations_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.violations_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.rpc.o
    public List S0() {
        return this.violations_;
    }

    @Override  // com.google.rpc.o
    public c T0(int v) {
        return (c)this.violations_.get(v);
    }

    public static n Z7() {
        return n.DEFAULT_INSTANCE;
    }

    public static b ca(n n0) {
        return (b)n.DEFAULT_INSTANCE.createBuilder(n0);
    }

    private void d6(Iterable iterable0) {
        this.M6();
        AbstractMessageLite.addAll(iterable0, this.violations_);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new n();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(n.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"violations_", c.class});
            }
            case 4: {
                return n.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = n.PARSER;
                if(parser0 == null) {
                    Class class0 = n.class;
                    synchronized(class0) {
                        parser0 = n.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(n.DEFAULT_INSTANCE);
                            n.PARSER = parser0;
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
        return (b)n.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.rpc.o
    public int p0() {
        return this.violations_.size();
    }

    public static Parser parser() {
        return n.DEFAULT_INSTANCE.getParserForType();
    }

    public static n ub(ByteString byteString0) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, byteString0);
    }

    public d v8(int v) {
        return (d)this.violations_.get(v);
    }

    public static n vb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static n wb(CodedInputStream codedInputStream0) throws IOException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static n xb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static n yb(InputStream inputStream0) throws IOException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, inputStream0);
    }

    private void z6(int v, c n$c0) {
        n$c0.getClass();
        this.M6();
        this.violations_.add(v, n$c0);
    }

    public static n zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

