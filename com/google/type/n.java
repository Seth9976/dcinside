package com.google.type;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

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

        public b Ab(String s) {
            this.copyOnWrite();
            ((n)this.instance).Ib(s);
            return this;
        }

        public b Bb(ByteString byteString0) {
            this.copyOnWrite();
            ((n)this.instance).Jb(byteString0);
            return this;
        }

        public b Cb(String s) {
            this.copyOnWrite();
            ((n)this.instance).Kb(s);
            return this;
        }

        public b Db(ByteString byteString0) {
            this.copyOnWrite();
            ((n)this.instance).Lb(byteString0);
            return this;
        }

        public b Eb(String s) {
            this.copyOnWrite();
            ((n)this.instance).Mb(s);
            return this;
        }

        public b Fb(ByteString byteString0) {
            this.copyOnWrite();
            ((n)this.instance).Nb(byteString0);
            return this;
        }

        @Override  // com.google.type.o
        public ByteString Q0() {
            return ((n)this.instance).Q0();
        }

        @Override  // com.google.type.o
        public ByteString a() {
            return ((n)this.instance).a();
        }

        @Override  // com.google.type.o
        public ByteString a3() {
            return ((n)this.instance).a3();
        }

        @Override  // com.google.type.o
        public String b6() {
            return ((n)this.instance).b6();
        }

        @Override  // com.google.type.o
        public String getDescription() {
            return ((n)this.instance).getDescription();
        }

        @Override  // com.google.type.o
        public String getLocation() {
            return ((n)this.instance).getLocation();
        }

        @Override  // com.google.type.o
        public String getTitle() {
            return ((n)this.instance).getTitle();
        }

        @Override  // com.google.type.o
        public ByteString m8() {
            return ((n)this.instance).m8();
        }

        public b ub() {
            this.copyOnWrite();
            ((n)this.instance).v8();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((n)this.instance).A8();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((n)this.instance).clearLocation();
            return this;
        }

        public b xb() {
            this.copyOnWrite();
            ((n)this.instance).j9();
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((n)this.instance).Gb(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((n)this.instance).Hb(byteString0);
            return this;
        }
    }

    private static final n DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile Parser PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String description_;
    private String expression_;
    private String location_;
    private String title_;

    static {
        n n0 = new n();
        n.DEFAULT_INSTANCE = n0;
        GeneratedMessageLite.registerDefaultInstance(n.class, n0);
    }

    private n() {
        this.expression_ = "";
        this.title_ = "";
        this.description_ = "";
        this.location_ = "";
    }

    private void A8() {
        this.expression_ = "";
    }

    public static n Ab(InputStream inputStream0) throws IOException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, inputStream0);
    }

    public static n Bb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static n Cb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static n Db(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static n Eb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, arr_b);
    }

    public static n Fb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Gb(String s) {
        s.getClass();
        this.description_ = s;
    }

    private void Hb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.description_ = byteString0.toStringUtf8();
    }

    private void Ib(String s) {
        s.getClass();
        this.expression_ = s;
    }

    public static b Ja() {
        return (b)n.DEFAULT_INSTANCE.createBuilder();
    }

    private void Jb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.expression_ = byteString0.toStringUtf8();
    }

    private void Kb(String s) {
        s.getClass();
        this.location_ = s;
    }

    public static b La(n n0) {
        return (b)n.DEFAULT_INSTANCE.createBuilder(n0);
    }

    private void Lb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.location_ = byteString0.toStringUtf8();
    }

    private void Mb(String s) {
        s.getClass();
        this.title_ = s;
    }

    private void Nb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.title_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.type.o
    public ByteString Q0() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override  // com.google.type.o
    public ByteString a() {
        return ByteString.copyFromUtf8(this.description_);
    }

    @Override  // com.google.type.o
    public ByteString a3() {
        return ByteString.copyFromUtf8(this.expression_);
    }

    @Override  // com.google.type.o
    public String b6() {
        return this.expression_;
    }

    public static n ca() {
        return n.DEFAULT_INSTANCE;
    }

    private void clearLocation() {
        this.location_ = n.ca().getLocation();
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
                return GeneratedMessageLite.newMessageInfo(n.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"expression_", "title_", "description_", "location_"});
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

    @Override  // com.google.type.o
    public String getDescription() {
        return this.description_;
    }

    @Override  // com.google.type.o
    public String getLocation() {
        return this.location_;
    }

    @Override  // com.google.type.o
    public String getTitle() {
        return this.title_;
    }

    private void j9() {
        this.title_ = n.ca().getTitle();
    }

    @Override  // com.google.type.o
    public ByteString m8() {
        return ByteString.copyFromUtf8(this.location_);
    }

    public static Parser parser() {
        return n.DEFAULT_INSTANCE.getParserForType();
    }

    public static n ub(InputStream inputStream0) throws IOException {
        return (n)GeneratedMessageLite.parseDelimitedFrom(n.DEFAULT_INSTANCE, inputStream0);
    }

    private void v8() {
        this.description_ = "";
    }

    public static n vb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n)GeneratedMessageLite.parseDelimitedFrom(n.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static n wb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, byteString0);
    }

    public static n xb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static n yb(CodedInputStream codedInputStream0) throws IOException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static n zb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n)GeneratedMessageLite.parseFrom(n.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }
}

