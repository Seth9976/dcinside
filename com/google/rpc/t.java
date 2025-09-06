package com.google.rpc;

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

public final class t extends GeneratedMessageLite implements u {
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

    public static final class b extends Builder implements u {
        private b() {
            super(t.DEFAULT_INSTANCE);
        }

        b(a t$a0) {
        }

        public b Ab(String s) {
            this.copyOnWrite();
            ((t)this.instance).Jb(s);
            return this;
        }

        public b Bb(ByteString byteString0) {
            this.copyOnWrite();
            ((t)this.instance).Kb(byteString0);
            return this;
        }

        public b Cb(String s) {
            this.copyOnWrite();
            ((t)this.instance).Lb(s);
            return this;
        }

        public b Db(ByteString byteString0) {
            this.copyOnWrite();
            ((t)this.instance).Mb(byteString0);
            return this;
        }

        public b Eb(String s) {
            this.copyOnWrite();
            ((t)this.instance).Nb(s);
            return this;
        }

        public b Fb(ByteString byteString0) {
            this.copyOnWrite();
            ((t)this.instance).Ob(byteString0);
            return this;
        }

        @Override  // com.google.rpc.u
        public String J8() {
            return ((t)this.instance).J8();
        }

        @Override  // com.google.rpc.u
        public ByteString Q2() {
            return ((t)this.instance).Q2();
        }

        @Override  // com.google.rpc.u
        public ByteString Ua() {
            return ((t)this.instance).Ua();
        }

        @Override  // com.google.rpc.u
        public String Z() {
            return ((t)this.instance).Z();
        }

        @Override  // com.google.rpc.u
        public ByteString a() {
            return ((t)this.instance).a();
        }

        @Override  // com.google.rpc.u
        public String e0() {
            return ((t)this.instance).e0();
        }

        @Override  // com.google.rpc.u
        public String getDescription() {
            return ((t)this.instance).getDescription();
        }

        public b ub() {
            this.copyOnWrite();
            ((t)this.instance).v8();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((t)this.instance).A8();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((t)this.instance).j9();
            return this;
        }

        @Override  // com.google.rpc.u
        public ByteString x0() {
            return ((t)this.instance).x0();
        }

        public b xb() {
            this.copyOnWrite();
            ((t)this.instance).ca();
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((t)this.instance).Hb(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((t)this.instance).Ib(byteString0);
            return this;
        }
    }

    private static final t DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String description_;
    private String owner_;
    private String resourceName_;
    private String resourceType_;

    static {
        t t0 = new t();
        t.DEFAULT_INSTANCE = t0;
        GeneratedMessageLite.registerDefaultInstance(t.class, t0);
    }

    private t() {
        this.resourceType_ = "";
        this.resourceName_ = "";
        this.owner_ = "";
        this.description_ = "";
    }

    private void A8() {
        this.owner_ = t.Ja().e0();
    }

    public static t Ab(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static t Bb(InputStream inputStream0) throws IOException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, inputStream0);
    }

    public static t Cb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static t Db(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static t Eb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static t Fb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, arr_b);
    }

    public static t Gb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Hb(String s) {
        s.getClass();
        this.description_ = s;
    }

    private void Ib(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.description_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.rpc.u
    public String J8() {
        return this.resourceType_;
    }

    public static t Ja() {
        return t.DEFAULT_INSTANCE;
    }

    private void Jb(String s) {
        s.getClass();
        this.owner_ = s;
    }

    private void Kb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.owner_ = byteString0.toStringUtf8();
    }

    public static b La() {
        return (b)t.DEFAULT_INSTANCE.createBuilder();
    }

    private void Lb(String s) {
        s.getClass();
        this.resourceName_ = s;
    }

    private void Mb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.resourceName_ = byteString0.toStringUtf8();
    }

    private void Nb(String s) {
        s.getClass();
        this.resourceType_ = s;
    }

    private void Ob(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.resourceType_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.rpc.u
    public ByteString Q2() {
        return ByteString.copyFromUtf8(this.owner_);
    }

    @Override  // com.google.rpc.u
    public ByteString Ua() {
        return ByteString.copyFromUtf8(this.resourceType_);
    }

    @Override  // com.google.rpc.u
    public String Z() {
        return this.resourceName_;
    }

    @Override  // com.google.rpc.u
    public ByteString a() {
        return ByteString.copyFromUtf8(this.description_);
    }

    private void ca() {
        this.resourceType_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new t();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(t.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"resourceType_", "resourceName_", "owner_", "description_"});
            }
            case 4: {
                return t.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = t.PARSER;
                if(parser0 == null) {
                    Class class0 = t.class;
                    synchronized(class0) {
                        parser0 = t.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(t.DEFAULT_INSTANCE);
                            t.PARSER = parser0;
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

    @Override  // com.google.rpc.u
    public String e0() {
        return this.owner_;
    }

    @Override  // com.google.rpc.u
    public String getDescription() {
        return this.description_;
    }

    private void j9() {
        this.resourceName_ = "";
    }

    public static Parser parser() {
        return t.DEFAULT_INSTANCE.getParserForType();
    }

    public static b ub(t t0) {
        return (b)t.DEFAULT_INSTANCE.createBuilder(t0);
    }

    private void v8() {
        this.description_ = "";
    }

    public static t vb(InputStream inputStream0) throws IOException {
        return (t)GeneratedMessageLite.parseDelimitedFrom(t.DEFAULT_INSTANCE, inputStream0);
    }

    public static t wb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (t)GeneratedMessageLite.parseDelimitedFrom(t.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.rpc.u
    public ByteString x0() {
        return ByteString.copyFromUtf8(this.resourceName_);
    }

    public static t xb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, byteString0);
    }

    public static t yb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static t zb(CodedInputStream codedInputStream0) throws IOException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, codedInputStream0);
    }
}

