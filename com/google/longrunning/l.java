package com.google.longrunning;

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

public final class l extends GeneratedMessageLite implements m {
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

    public static final class b extends Builder implements m {
        private b() {
            super(l.DEFAULT_INSTANCE);
        }

        b(a l$a0) {
        }

        @Override  // com.google.longrunning.m
        public String c6() {
            return ((l)this.instance).c6();
        }

        @Override  // com.google.longrunning.m
        public String g7() {
            return ((l)this.instance).g7();
        }

        @Override  // com.google.longrunning.m
        public ByteString l6() {
            return ((l)this.instance).l6();
        }

        public b ub() {
            this.copyOnWrite();
            ((l)this.instance).d6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((l)this.instance).z6();
            return this;
        }

        public b wb(String s) {
            this.copyOnWrite();
            ((l)this.instance).zb(s);
            return this;
        }

        public b xb(ByteString byteString0) {
            this.copyOnWrite();
            ((l)this.instance).Ab(byteString0);
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((l)this.instance).Bb(s);
            return this;
        }

        @Override  // com.google.longrunning.m
        public ByteString z5() {
            return ((l)this.instance).z5();
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((l)this.instance).Cb(byteString0);
            return this;
        }
    }

    private static final l DEFAULT_INSTANCE = null;
    public static final int METADATA_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
    private String metadataType_;
    private String responseType_;

    static {
        l l0 = new l();
        l.DEFAULT_INSTANCE = l0;
        GeneratedMessageLite.registerDefaultInstance(l.class, l0);
    }

    private l() {
        this.responseType_ = "";
        this.metadataType_ = "";
    }

    public static l A6() {
        return l.DEFAULT_INSTANCE;
    }

    public static l A8(ByteString byteString0) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, byteString0);
    }

    private void Ab(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.metadataType_ = byteString0.toStringUtf8();
    }

    public static b B6() {
        return (b)l.DEFAULT_INSTANCE.createBuilder();
    }

    private void Bb(String s) {
        s.getClass();
        this.responseType_ = s;
    }

    private void Cb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.responseType_ = byteString0.toStringUtf8();
    }

    public static l Ja(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static l La(InputStream inputStream0) throws IOException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, inputStream0);
    }

    public static b M6(l l0) {
        return (b)l.DEFAULT_INSTANCE.createBuilder(l0);
    }

    public static l Z7(InputStream inputStream0) throws IOException {
        return (l)GeneratedMessageLite.parseDelimitedFrom(l.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.longrunning.m
    public String c6() {
        return this.metadataType_;
    }

    public static l ca(CodedInputStream codedInputStream0) throws IOException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void d6() {
        this.metadataType_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new l();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(l.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"responseType_", "metadataType_"});
            }
            case 4: {
                return l.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = l.PARSER;
                if(parser0 == null) {
                    Class class0 = l.class;
                    synchronized(class0) {
                        parser0 = l.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(l.DEFAULT_INSTANCE);
                            l.PARSER = parser0;
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

    @Override  // com.google.longrunning.m
    public String g7() {
        return this.responseType_;
    }

    public static l j9(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // com.google.longrunning.m
    public ByteString l6() {
        return ByteString.copyFromUtf8(this.metadataType_);
    }

    public static Parser parser() {
        return l.DEFAULT_INSTANCE.getParserForType();
    }

    public static l ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static l v8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (l)GeneratedMessageLite.parseDelimitedFrom(l.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static l vb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static l wb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static l xb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, arr_b);
    }

    public static l yb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    @Override  // com.google.longrunning.m
    public ByteString z5() {
        return ByteString.copyFromUtf8(this.responseType_);
    }

    private void z6() {
        this.responseType_ = "";
    }

    private void zb(String s) {
        s.getClass();
        this.metadataType_ = s;
    }
}

