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

public final class j extends GeneratedMessageLite implements k {
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

    public static final class b extends Builder implements k {
        private b() {
            super(j.DEFAULT_INSTANCE);
        }

        b(a j$a0) {
        }

        public b Ab(int v) {
            this.copyOnWrite();
            ((j)this.instance).Eb(v);
            return this;
        }

        public b Bb(int v, com.google.rpc.j.c.a j$c$a0) {
            this.copyOnWrite();
            ((j)this.instance).Fb(v, ((c)j$c$a0.build()));
            return this;
        }

        public b Cb(int v, c j$c0) {
            this.copyOnWrite();
            ((j)this.instance).Fb(v, j$c0);
            return this;
        }

        @Override  // com.google.rpc.k
        public int N7() {
            return ((j)this.instance).N7();
        }

        @Override  // com.google.rpc.k
        public List o4() {
            return DesugarCollections.unmodifiableList(((j)this.instance).o4());
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((j)this.instance).d6(iterable0);
            return this;
        }

        public b vb(int v, com.google.rpc.j.c.a j$c$a0) {
            this.copyOnWrite();
            ((j)this.instance).z6(v, ((c)j$c$a0.build()));
            return this;
        }

        public b wb(int v, c j$c0) {
            this.copyOnWrite();
            ((j)this.instance).z6(v, j$c0);
            return this;
        }

        public b xb(com.google.rpc.j.c.a j$c$a0) {
            this.copyOnWrite();
            ((j)this.instance).A6(((c)j$c$a0.build()));
            return this;
        }

        @Override  // com.google.rpc.k
        public c y3(int v) {
            return ((j)this.instance).y3(v);
        }

        public b yb(c j$c0) {
            this.copyOnWrite();
            ((j)this.instance).A6(j$c0);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((j)this.instance).B6();
            return this;
        }
    }

    public static final class c extends GeneratedMessageLite implements d {
        public static final class com.google.rpc.j.c.a extends Builder implements d {
            private com.google.rpc.j.c.a() {
                super(c.DEFAULT_INSTANCE);
            }

            com.google.rpc.j.c.a(a j$a0) {
            }

            @Override  // com.google.rpc.j$d
            public ByteString B0() {
                return ((c)this.instance).B0();
            }

            @Override  // com.google.rpc.j$d
            public String F0() {
                return ((c)this.instance).F0();
            }

            @Override  // com.google.rpc.j$d
            public ByteString a() {
                return ((c)this.instance).a();
            }

            @Override  // com.google.rpc.j$d
            public String getDescription() {
                return ((c)this.instance).getDescription();
            }

            public com.google.rpc.j.c.a ub() {
                this.copyOnWrite();
                ((c)this.instance).d6();
                return this;
            }

            public com.google.rpc.j.c.a vb() {
                this.copyOnWrite();
                ((c)this.instance).z6();
                return this;
            }

            public com.google.rpc.j.c.a wb(String s) {
                this.copyOnWrite();
                ((c)this.instance).zb(s);
                return this;
            }

            public com.google.rpc.j.c.a xb(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).Ab(byteString0);
                return this;
            }

            public com.google.rpc.j.c.a yb(String s) {
                this.copyOnWrite();
                ((c)this.instance).Bb(s);
                return this;
            }

            public com.google.rpc.j.c.a zb(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).Cb(byteString0);
                return this;
            }
        }

        private static final c DEFAULT_INSTANCE = null;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_;
        private String url_;

        static {
            c j$c0 = new c();
            c.DEFAULT_INSTANCE = j$c0;
            GeneratedMessageLite.registerDefaultInstance(c.class, j$c0);
        }

        private c() {
            this.description_ = "";
            this.url_ = "";
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

        @Override  // com.google.rpc.j$d
        public ByteString B0() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public static com.google.rpc.j.c.a B6() {
            return (com.google.rpc.j.c.a)c.DEFAULT_INSTANCE.createBuilder();
        }

        private void Bb(String s) {
            s.getClass();
            this.url_ = s;
        }

        private void Cb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.url_ = byteString0.toStringUtf8();
        }

        @Override  // com.google.rpc.j$d
        public String F0() {
            return this.url_;
        }

        public static c Ja(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static c La(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0);
        }

        public static com.google.rpc.j.c.a M6(c j$c0) {
            return (com.google.rpc.j.c.a)c.DEFAULT_INSTANCE.createBuilder(j$c0);
        }

        public static c Z7(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0);
        }

        @Override  // com.google.rpc.j$d
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
                    return new com.google.rpc.j.c.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(c.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"description_", "url_"});
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

        @Override  // com.google.rpc.j$d
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
            this.url_ = "";
        }

        private void zb(String s) {
            s.getClass();
            this.description_ = s;
        }
    }

    public interface d extends MessageLiteOrBuilder {
        ByteString B0();

        String F0();

        ByteString a();

        String getDescription();
    }

    private static final j DEFAULT_INSTANCE = null;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private ProtobufList links_;

    static {
        j j0 = new j();
        j.DEFAULT_INSTANCE = j0;
        GeneratedMessageLite.registerDefaultInstance(j.class, j0);
    }

    private j() {
        this.links_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A6(c j$c0) {
        j$c0.getClass();
        this.M6();
        this.links_.add(j$c0);
    }

    public List A8() {
        return this.links_;
    }

    public static j Ab(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (j)GeneratedMessageLite.parseFrom(j.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void B6() {
        this.links_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static j Bb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (j)GeneratedMessageLite.parseFrom(j.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static j Cb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (j)GeneratedMessageLite.parseFrom(j.DEFAULT_INSTANCE, arr_b);
    }

    public static j Db(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (j)GeneratedMessageLite.parseFrom(j.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Eb(int v) {
        this.M6();
        this.links_.remove(v);
    }

    private void Fb(int v, c j$c0) {
        j$c0.getClass();
        this.M6();
        this.links_.set(v, j$c0);
    }

    public static j Ja(InputStream inputStream0) throws IOException {
        return (j)GeneratedMessageLite.parseDelimitedFrom(j.DEFAULT_INSTANCE, inputStream0);
    }

    public static j La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (j)GeneratedMessageLite.parseDelimitedFrom(j.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void M6() {
        ProtobufList internal$ProtobufList0 = this.links_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.links_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.rpc.k
    public int N7() {
        return this.links_.size();
    }

    public static j Z7() {
        return j.DEFAULT_INSTANCE;
    }

    public static b ca(j j0) {
        return (b)j.DEFAULT_INSTANCE.createBuilder(j0);
    }

    private void d6(Iterable iterable0) {
        this.M6();
        AbstractMessageLite.addAll(iterable0, this.links_);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new j();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(j.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"links_", c.class});
            }
            case 4: {
                return j.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = j.PARSER;
                if(parser0 == null) {
                    Class class0 = j.class;
                    synchronized(class0) {
                        parser0 = j.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(j.DEFAULT_INSTANCE);
                            j.PARSER = parser0;
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
        return (b)j.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.rpc.k
    public List o4() {
        return this.links_;
    }

    public static Parser parser() {
        return j.DEFAULT_INSTANCE.getParserForType();
    }

    public static j ub(ByteString byteString0) throws InvalidProtocolBufferException {
        return (j)GeneratedMessageLite.parseFrom(j.DEFAULT_INSTANCE, byteString0);
    }

    public d v8(int v) {
        return (d)this.links_.get(v);
    }

    public static j vb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (j)GeneratedMessageLite.parseFrom(j.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static j wb(CodedInputStream codedInputStream0) throws IOException {
        return (j)GeneratedMessageLite.parseFrom(j.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static j xb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (j)GeneratedMessageLite.parseFrom(j.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.rpc.k
    public c y3(int v) {
        return (c)this.links_.get(v);
    }

    public static j yb(InputStream inputStream0) throws IOException {
        return (j)GeneratedMessageLite.parseFrom(j.DEFAULT_INSTANCE, inputStream0);
    }

    private void z6(int v, c j$c0) {
        j$c0.getClass();
        this.M6();
        this.links_.add(v, j$c0);
    }

    public static j zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (j)GeneratedMessageLite.parseFrom(j.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

