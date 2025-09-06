package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
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

public final class v extends GeneratedMessageLite implements w {
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

    public static final class b extends Builder implements w {
        private b() {
            super(v.DEFAULT_INSTANCE);
        }

        b(a v$a0) {
        }

        @Override  // com.google.rpc.w
        public Duration Ba() {
            return ((v)this.instance).Ba();
        }

        @Override  // com.google.rpc.w
        public boolean h4() {
            return ((v)this.instance).h4();
        }

        public b ub() {
            this.copyOnWrite();
            ((v)this.instance).F3();
            return this;
        }

        public b vb(Duration duration0) {
            this.copyOnWrite();
            ((v)this.instance).P4(duration0);
            return this;
        }

        public b wb(com.google.protobuf.Duration.Builder duration$Builder0) {
            this.copyOnWrite();
            ((v)this.instance).wb(((Duration)duration$Builder0.build()));
            return this;
        }

        public b xb(Duration duration0) {
            this.copyOnWrite();
            ((v)this.instance).wb(duration0);
            return this;
        }
    }

    private static final v DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int RETRY_DELAY_FIELD_NUMBER = 1;
    private Duration retryDelay_;

    static {
        v v0 = new v();
        v.DEFAULT_INSTANCE = v0;
        GeneratedMessageLite.registerDefaultInstance(v.class, v0);
    }

    public static v A6(InputStream inputStream0) throws IOException {
        return (v)GeneratedMessageLite.parseDelimitedFrom(v.DEFAULT_INSTANCE, inputStream0);
    }

    public static v A8(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (v)GeneratedMessageLite.parseFrom(v.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static v B6(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (v)GeneratedMessageLite.parseDelimitedFrom(v.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.rpc.w
    public Duration Ba() {
        return this.retryDelay_ == null ? Duration.getDefaultInstance() : this.retryDelay_;
    }

    private void F3() {
        this.retryDelay_ = null;
    }

    public static v Ja(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (v)GeneratedMessageLite.parseFrom(v.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static v La(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (v)GeneratedMessageLite.parseFrom(v.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static v M4() {
        return v.DEFAULT_INSTANCE;
    }

    public static v M6(ByteString byteString0) throws InvalidProtocolBufferException {
        return (v)GeneratedMessageLite.parseFrom(v.DEFAULT_INSTANCE, byteString0);
    }

    private void P4(Duration duration0) {
        duration0.getClass();
        if(this.retryDelay_ != null && this.retryDelay_ != Duration.getDefaultInstance()) {
            this.retryDelay_ = (Duration)((com.google.protobuf.Duration.Builder)Duration.newBuilder(this.retryDelay_).mergeFrom(duration0)).buildPartial();
            return;
        }
        this.retryDelay_ = duration0;
    }

    public static v Z7(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (v)GeneratedMessageLite.parseFrom(v.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static v ca(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (v)GeneratedMessageLite.parseFrom(v.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static b d6() {
        return (b)v.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new v();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(v.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"retryDelay_"});
            }
            case 4: {
                return v.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = v.PARSER;
                if(parser0 == null) {
                    Class class0 = v.class;
                    synchronized(class0) {
                        parser0 = v.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(v.DEFAULT_INSTANCE);
                            v.PARSER = parser0;
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

    @Override  // com.google.rpc.w
    public boolean h4() {
        return this.retryDelay_ != null;
    }

    public static v j9(InputStream inputStream0) throws IOException {
        return (v)GeneratedMessageLite.parseFrom(v.DEFAULT_INSTANCE, inputStream0);
    }

    public static Parser parser() {
        return v.DEFAULT_INSTANCE.getParserForType();
    }

    public static v ub(byte[] arr_b) throws InvalidProtocolBufferException {
        return (v)GeneratedMessageLite.parseFrom(v.DEFAULT_INSTANCE, arr_b);
    }

    public static v v8(CodedInputStream codedInputStream0) throws IOException {
        return (v)GeneratedMessageLite.parseFrom(v.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static v vb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (v)GeneratedMessageLite.parseFrom(v.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void wb(Duration duration0) {
        duration0.getClass();
        this.retryDelay_ = duration0;
    }

    public static b z6(v v0) {
        return (b)v.DEFAULT_INSTANCE.createBuilder(v0);
    }
}

