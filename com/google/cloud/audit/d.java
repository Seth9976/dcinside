package com.google.cloud.audit;

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

public final class d extends GeneratedMessageLite implements e {
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

    public static final class b extends Builder implements e {
        private b() {
            super(d.DEFAULT_INSTANCE);
        }

        b(a d$a0) {
        }

        @Override  // com.google.cloud.audit.e
        public ByteString H8() {
            return ((d)this.instance).H8();
        }

        @Override  // com.google.cloud.audit.e
        public String V1() {
            return ((d)this.instance).V1();
        }

        public b ub() {
            this.copyOnWrite();
            ((d)this.instance).F3();
            return this;
        }

        public b vb(String s) {
            this.copyOnWrite();
            ((d)this.instance).vb(s);
            return this;
        }

        public b wb(ByteString byteString0) {
            this.copyOnWrite();
            ((d)this.instance).wb(byteString0);
            return this;
        }
    }

    private static final d DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    private String principalEmail_;

    static {
        d d0 = new d();
        d.DEFAULT_INSTANCE = d0;
        GeneratedMessageLite.registerDefaultInstance(d.class, d0);
    }

    private d() {
        this.principalEmail_ = "";
    }

    public static d A6(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (d)GeneratedMessageLite.parseDelimitedFrom(d.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static d A8(InputStream inputStream0) throws IOException {
        return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, inputStream0);
    }

    public static d B6(ByteString byteString0) throws InvalidProtocolBufferException {
        return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, byteString0);
    }

    private void F3() {
        this.principalEmail_ = "";
    }

    @Override  // com.google.cloud.audit.e
    public ByteString H8() {
        return ByteString.copyFromUtf8(this.principalEmail_);
    }

    public static d Ja(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static d La(byte[] arr_b) throws InvalidProtocolBufferException {
        return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, arr_b);
    }

    public static d M4() {
        return d.DEFAULT_INSTANCE;
    }

    public static d M6(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static b P4() {
        return (b)d.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.cloud.audit.e
    public String V1() {
        return this.principalEmail_;
    }

    public static d Z7(CodedInputStream codedInputStream0) throws IOException {
        return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static d ca(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static b d6(d d0) {
        return (b)d.DEFAULT_INSTANCE.createBuilder(d0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new d();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(d.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"principalEmail_"});
            }
            case 4: {
                return d.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = d.PARSER;
                if(parser0 == null) {
                    Class class0 = d.class;
                    synchronized(class0) {
                        parser0 = d.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(d.DEFAULT_INSTANCE);
                            d.PARSER = parser0;
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

    public static d j9(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return d.DEFAULT_INSTANCE.getParserForType();
    }

    public static d ub(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static d v8(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    private void vb(String s) {
        s.getClass();
        this.principalEmail_ = s;
    }

    private void wb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.principalEmail_ = byteString0.toStringUtf8();
    }

    public static d z6(InputStream inputStream0) throws IOException {
        return (d)GeneratedMessageLite.parseDelimitedFrom(d.DEFAULT_INSTANCE, inputStream0);
    }
}

