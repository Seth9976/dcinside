package com.google.api;

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

public final class i1 extends GeneratedMessageLite implements j1 {
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

    public static final class b extends Builder implements j1 {
        private b() {
            super(i1.DEFAULT_INSTANCE);
        }

        b(a i1$a0) {
        }

        public b Ab(ByteString byteString0) {
            this.copyOnWrite();
            ((i1)this.instance).setNameBytes(byteString0);
            return this;
        }

        public b Bb(String s) {
            this.copyOnWrite();
            ((i1)this.instance).Eb(s);
            return this;
        }

        public b Cb(ByteString byteString0) {
            this.copyOnWrite();
            ((i1)this.instance).Fb(byteString0);
            return this;
        }

        @Override  // com.google.api.j1
        public String Na() {
            return ((i1)this.instance).Na();
        }

        @Override  // com.google.api.j1
        public String W6() {
            return ((i1)this.instance).W6();
        }

        @Override  // com.google.api.j1
        public String getName() {
            return ((i1)this.instance).getName();
        }

        @Override  // com.google.api.j1
        public ByteString getNameBytes() {
            return ((i1)this.instance).getNameBytes();
        }

        @Override  // com.google.api.j1
        public ByteString t4() {
            return ((i1)this.instance).t4();
        }

        public b ub() {
            this.copyOnWrite();
            ((i1)this.instance).B6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((i1)this.instance).clearName();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((i1)this.instance).M6();
            return this;
        }

        public b xb(String s) {
            this.copyOnWrite();
            ((i1)this.instance).Cb(s);
            return this;
        }

        @Override  // com.google.api.j1
        public ByteString y8() {
            return ((i1)this.instance).y8();
        }

        public b yb(ByteString byteString0) {
            this.copyOnWrite();
            ((i1)this.instance).Db(byteString0);
            return this;
        }

        public b zb(String s) {
            this.copyOnWrite();
            ((i1)this.instance).setName(s);
            return this;
        }
    }

    private static final i1 DEFAULT_INSTANCE = null;
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String httpHeader_;
    private String name_;
    private String urlQueryParameter_;

    static {
        i1 i10 = new i1();
        i1.DEFAULT_INSTANCE = i10;
        GeneratedMessageLite.registerDefaultInstance(i1.class, i10);
    }

    private i1() {
        this.name_ = "";
        this.httpHeader_ = "";
        this.urlQueryParameter_ = "";
    }

    public static b A8(i1 i10) {
        return (b)i1.DEFAULT_INSTANCE.createBuilder(i10);
    }

    public static i1 Ab(byte[] arr_b) throws InvalidProtocolBufferException {
        return (i1)GeneratedMessageLite.parseFrom(i1.DEFAULT_INSTANCE, arr_b);
    }

    private void B6() {
        this.httpHeader_ = "";
    }

    public static i1 Bb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i1)GeneratedMessageLite.parseFrom(i1.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Cb(String s) {
        s.getClass();
        this.httpHeader_ = s;
    }

    private void Db(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.httpHeader_ = byteString0.toStringUtf8();
    }

    private void Eb(String s) {
        s.getClass();
        this.urlQueryParameter_ = s;
    }

    private void Fb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.urlQueryParameter_ = byteString0.toStringUtf8();
    }

    public static i1 Ja(ByteString byteString0) throws InvalidProtocolBufferException {
        return (i1)GeneratedMessageLite.parseFrom(i1.DEFAULT_INSTANCE, byteString0);
    }

    public static i1 La(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i1)GeneratedMessageLite.parseFrom(i1.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void M6() {
        this.urlQueryParameter_ = "";
    }

    @Override  // com.google.api.j1
    public String Na() {
        return this.httpHeader_;
    }

    @Override  // com.google.api.j1
    public String W6() {
        return this.urlQueryParameter_;
    }

    public static i1 Z7() {
        return i1.DEFAULT_INSTANCE;
    }

    public static i1 ca(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i1)GeneratedMessageLite.parseDelimitedFrom(i1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void clearName() {
        this.name_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new i1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(i1.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "httpHeader_", "urlQueryParameter_"});
            }
            case 4: {
                return i1.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = i1.PARSER;
                if(parser0 == null) {
                    Class class0 = i1.class;
                    synchronized(class0) {
                        parser0 = i1.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(i1.DEFAULT_INSTANCE);
                            i1.PARSER = parser0;
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

    @Override  // com.google.api.j1
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.api.j1
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static i1 j9(InputStream inputStream0) throws IOException {
        return (i1)GeneratedMessageLite.parseDelimitedFrom(i1.DEFAULT_INSTANCE, inputStream0);
    }

    public static Parser parser() {
        return i1.DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.name_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.j1
    public ByteString t4() {
        return ByteString.copyFromUtf8(this.urlQueryParameter_);
    }

    public static i1 ub(CodedInputStream codedInputStream0) throws IOException {
        return (i1)GeneratedMessageLite.parseFrom(i1.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static b v8() {
        return (b)i1.DEFAULT_INSTANCE.createBuilder();
    }

    public static i1 vb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i1)GeneratedMessageLite.parseFrom(i1.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static i1 wb(InputStream inputStream0) throws IOException {
        return (i1)GeneratedMessageLite.parseFrom(i1.DEFAULT_INSTANCE, inputStream0);
    }

    public static i1 xb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i1)GeneratedMessageLite.parseFrom(i1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.api.j1
    public ByteString y8() {
        return ByteString.copyFromUtf8(this.httpHeader_);
    }

    public static i1 yb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (i1)GeneratedMessageLite.parseFrom(i1.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static i1 zb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i1)GeneratedMessageLite.parseFrom(i1.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }
}

