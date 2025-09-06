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

        @Override  // com.google.rpc.m
        public ByteString N3() {
            return ((l)this.instance).N3();
        }

        @Override  // com.google.rpc.m
        public String R5() {
            return ((l)this.instance).R5();
        }

        @Override  // com.google.rpc.m
        public String getMessage() {
            return ((l)this.instance).getMessage();
        }

        @Override  // com.google.rpc.m
        public ByteString getMessageBytes() {
            return ((l)this.instance).getMessageBytes();
        }

        public b ub() {
            this.copyOnWrite();
            ((l)this.instance).d6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((l)this.instance).clearMessage();
            return this;
        }

        public b wb(String s) {
            this.copyOnWrite();
            ((l)this.instance).yb(s);
            return this;
        }

        public b xb(ByteString byteString0) {
            this.copyOnWrite();
            ((l)this.instance).zb(byteString0);
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((l)this.instance).setMessage(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((l)this.instance).setMessageBytes(byteString0);
            return this;
        }
    }

    private static final l DEFAULT_INSTANCE = null;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private String locale_;
    private String message_;

    static {
        l l0 = new l();
        l.DEFAULT_INSTANCE = l0;
        GeneratedMessageLite.registerDefaultInstance(l.class, l0);
    }

    private l() {
        this.locale_ = "";
        this.message_ = "";
    }

    public static b A6() {
        return (b)l.DEFAULT_INSTANCE.createBuilder();
    }

    public static l A8(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static b B6(l l0) {
        return (b)l.DEFAULT_INSTANCE.createBuilder(l0);
    }

    public static l Ja(InputStream inputStream0) throws IOException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, inputStream0);
    }

    public static l La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static l M6(InputStream inputStream0) throws IOException {
        return (l)GeneratedMessageLite.parseDelimitedFrom(l.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.rpc.m
    public ByteString N3() {
        return ByteString.copyFromUtf8(this.locale_);
    }

    @Override  // com.google.rpc.m
    public String R5() {
        return this.locale_;
    }

    public static l Z7(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (l)GeneratedMessageLite.parseDelimitedFrom(l.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static l ca(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    private void clearMessage() {
        this.message_ = "";
    }

    private void d6() {
        this.locale_ = l.z6().R5();
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
                return GeneratedMessageLite.newMessageInfo(l.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"locale_", "message_"});
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

    @Override  // com.google.rpc.m
    public String getMessage() {
        return this.message_;
    }

    @Override  // com.google.rpc.m
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    public static l j9(CodedInputStream codedInputStream0) throws IOException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Parser parser() {
        return l.DEFAULT_INSTANCE.getParserForType();
    }

    private void setMessage(String s) {
        s.getClass();
        this.message_ = s;
    }

    private void setMessageBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.message_ = byteString0.toStringUtf8();
    }

    public static l ub(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static l v8(ByteString byteString0) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, byteString0);
    }

    public static l vb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static l wb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, arr_b);
    }

    public static l xb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (l)GeneratedMessageLite.parseFrom(l.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void yb(String s) {
        s.getClass();
        this.locale_ = s;
    }

    public static l z6() {
        return l.DEFAULT_INSTANCE;
    }

    private void zb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.locale_ = byteString0.toStringUtf8();
    }
}

