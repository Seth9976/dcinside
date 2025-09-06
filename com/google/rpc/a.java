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

public final class a extends GeneratedMessageLite implements b {
    static class com.google.rpc.a.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            com.google.rpc.a.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.a.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.a.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.a.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.a.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.a.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.a.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class com.google.rpc.a.b extends Builder implements b {
        private com.google.rpc.a.b() {
            super(a.DEFAULT_INSTANCE);
        }

        com.google.rpc.a.b(com.google.rpc.a.a a$a0) {
        }

        public com.google.rpc.a.b Ab(int v) {
            this.copyOnWrite();
            ((a)this.instance).Eb(v);
            return this;
        }

        public com.google.rpc.a.b Bb(int v, com.google.rpc.a.c.a a$c$a0) {
            this.copyOnWrite();
            ((a)this.instance).Fb(v, ((c)a$c$a0.build()));
            return this;
        }

        public com.google.rpc.a.b Cb(int v, c a$c0) {
            this.copyOnWrite();
            ((a)this.instance).Fb(v, a$c0);
            return this;
        }

        @Override  // com.google.rpc.b
        public List G7() {
            return DesugarCollections.unmodifiableList(((a)this.instance).G7());
        }

        @Override  // com.google.rpc.b
        public c Ma(int v) {
            return ((a)this.instance).Ma(v);
        }

        @Override  // com.google.rpc.b
        public int l3() {
            return ((a)this.instance).l3();
        }

        public com.google.rpc.a.b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((a)this.instance).d6(iterable0);
            return this;
        }

        public com.google.rpc.a.b vb(int v, com.google.rpc.a.c.a a$c$a0) {
            this.copyOnWrite();
            ((a)this.instance).z6(v, ((c)a$c$a0.build()));
            return this;
        }

        public com.google.rpc.a.b wb(int v, c a$c0) {
            this.copyOnWrite();
            ((a)this.instance).z6(v, a$c0);
            return this;
        }

        public com.google.rpc.a.b xb(com.google.rpc.a.c.a a$c$a0) {
            this.copyOnWrite();
            ((a)this.instance).A6(((c)a$c$a0.build()));
            return this;
        }

        public com.google.rpc.a.b yb(c a$c0) {
            this.copyOnWrite();
            ((a)this.instance).A6(a$c0);
            return this;
        }

        public com.google.rpc.a.b zb() {
            this.copyOnWrite();
            ((a)this.instance).B6();
            return this;
        }
    }

    public static final class c extends GeneratedMessageLite implements d {
        public static final class com.google.rpc.a.c.a extends Builder implements d {
            private com.google.rpc.a.c.a() {
                super(c.DEFAULT_INSTANCE);
            }

            com.google.rpc.a.c.a(com.google.rpc.a.a a$a0) {
            }

            @Override  // com.google.rpc.a$d
            public ByteString a() {
                return ((c)this.instance).a();
            }

            @Override  // com.google.rpc.a$d
            public ByteString c7() {
                return ((c)this.instance).c7();
            }

            @Override  // com.google.rpc.a$d
            public String getDescription() {
                return ((c)this.instance).getDescription();
            }

            @Override  // com.google.rpc.a$d
            public String getField() {
                return ((c)this.instance).getField();
            }

            public com.google.rpc.a.c.a ub() {
                this.copyOnWrite();
                ((c)this.instance).d6();
                return this;
            }

            public com.google.rpc.a.c.a vb() {
                this.copyOnWrite();
                ((c)this.instance).clearField();
                return this;
            }

            public com.google.rpc.a.c.a wb(String s) {
                this.copyOnWrite();
                ((c)this.instance).yb(s);
                return this;
            }

            public com.google.rpc.a.c.a xb(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).zb(byteString0);
                return this;
            }

            public com.google.rpc.a.c.a yb(String s) {
                this.copyOnWrite();
                ((c)this.instance).Ab(s);
                return this;
            }

            public com.google.rpc.a.c.a zb(ByteString byteString0) {
                this.copyOnWrite();
                ((c)this.instance).Bb(byteString0);
                return this;
            }
        }

        private static final c DEFAULT_INSTANCE = null;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser PARSER;
        private String description_;
        private String field_;

        static {
            c a$c0 = new c();
            c.DEFAULT_INSTANCE = a$c0;
            GeneratedMessageLite.registerDefaultInstance(c.class, a$c0);
        }

        private c() {
            this.field_ = "";
            this.description_ = "";
        }

        public static com.google.rpc.a.c.a A6() {
            return (com.google.rpc.a.c.a)c.DEFAULT_INSTANCE.createBuilder();
        }

        public static c A8(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        private void Ab(String s) {
            s.getClass();
            this.field_ = s;
        }

        public static com.google.rpc.a.c.a B6(c a$c0) {
            return (com.google.rpc.a.c.a)c.DEFAULT_INSTANCE.createBuilder(a$c0);
        }

        private void Bb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.field_ = byteString0.toStringUtf8();
        }

        public static c Ja(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0);
        }

        public static c La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static c M6(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0);
        }

        public static c Z7(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        @Override  // com.google.rpc.a$d
        public ByteString a() {
            return ByteString.copyFromUtf8(this.description_);
        }

        @Override  // com.google.rpc.a$d
        public ByteString c7() {
            return ByteString.copyFromUtf8(this.field_);
        }

        public static c ca(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        private void clearField() {
            this.field_ = "";
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
                    return new com.google.rpc.a.c.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(c.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"field_", "description_"});
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

        @Override  // com.google.rpc.a$d
        public String getDescription() {
            return this.description_;
        }

        @Override  // com.google.rpc.a$d
        public String getField() {
            return this.field_;
        }

        public static c j9(CodedInputStream codedInputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static Parser parser() {
            return c.DEFAULT_INSTANCE.getParserForType();
        }

        public static c ub(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static c v8(ByteString byteString0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0);
        }

        public static c vb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static c wb(byte[] arr_b) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b);
        }

        public static c xb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void yb(String s) {
            s.getClass();
            this.description_ = s;
        }

        public static c z6() {
            return c.DEFAULT_INSTANCE;
        }

        private void zb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.description_ = byteString0.toStringUtf8();
        }
    }

    public interface d extends MessageLiteOrBuilder {
        ByteString a();

        ByteString c7();

        String getDescription();

        String getField();
    }

    private static final a DEFAULT_INSTANCE = null;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private ProtobufList fieldViolations_;

    static {
        a a0 = new a();
        a.DEFAULT_INSTANCE = a0;
        GeneratedMessageLite.registerDefaultInstance(a.class, a0);
    }

    private a() {
        this.fieldViolations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A6(c a$c0) {
        a$c0.getClass();
        this.M6();
        this.fieldViolations_.add(a$c0);
    }

    public List A8() {
        return this.fieldViolations_;
    }

    public static a Ab(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void B6() {
        this.fieldViolations_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static a Bb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static a Cb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b);
    }

    public static a Db(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Eb(int v) {
        this.M6();
        this.fieldViolations_.remove(v);
    }

    private void Fb(int v, c a$c0) {
        a$c0.getClass();
        this.M6();
        this.fieldViolations_.set(v, a$c0);
    }

    @Override  // com.google.rpc.b
    public List G7() {
        return this.fieldViolations_;
    }

    public static a Ja(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    public static a La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void M6() {
        ProtobufList internal$ProtobufList0 = this.fieldViolations_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.fieldViolations_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.rpc.b
    public c Ma(int v) {
        return (c)this.fieldViolations_.get(v);
    }

    public static a Z7() {
        return a.DEFAULT_INSTANCE;
    }

    public static com.google.rpc.a.b ca(a a0) {
        return (com.google.rpc.a.b)a.DEFAULT_INSTANCE.createBuilder(a0);
    }

    private void d6(Iterable iterable0) {
        this.M6();
        AbstractMessageLite.addAll(iterable0, this.fieldViolations_);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new a();
            }
            case 2: {
                return new com.google.rpc.a.b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(a.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"fieldViolations_", c.class});
            }
            case 4: {
                return a.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = a.PARSER;
                if(parser0 == null) {
                    Class class0 = a.class;
                    synchronized(class0) {
                        parser0 = a.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(a.DEFAULT_INSTANCE);
                            a.PARSER = parser0;
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

    public static com.google.rpc.a.b j9() {
        return (com.google.rpc.a.b)a.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.rpc.b
    public int l3() {
        return this.fieldViolations_.size();
    }

    public static Parser parser() {
        return a.DEFAULT_INSTANCE.getParserForType();
    }

    public static a ub(ByteString byteString0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0);
    }

    public d v8(int v) {
        return (d)this.fieldViolations_.get(v);
    }

    public static a vb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static a wb(CodedInputStream codedInputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static a xb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static a yb(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    private void z6(int v, c a$c0) {
        a$c0.getClass();
        this.M6();
        this.fieldViolations_.add(v, a$c0);
    }

    public static a zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

