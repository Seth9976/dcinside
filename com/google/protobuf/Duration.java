package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Duration extends GeneratedMessageLite implements DurationOrBuilder {
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements DurationOrBuilder {
        private Builder() {
            super(Duration.DEFAULT_INSTANCE);
        }

        Builder(a duration$a0) {
        }

        public Builder clearNanos() {
            this.copyOnWrite();
            ((Duration)this.instance).clearNanos();
            return this;
        }

        public Builder clearSeconds() {
            this.copyOnWrite();
            ((Duration)this.instance).clearSeconds();
            return this;
        }

        @Override  // com.google.protobuf.DurationOrBuilder
        public int getNanos() {
            return ((Duration)this.instance).getNanos();
        }

        @Override  // com.google.protobuf.DurationOrBuilder
        public long getSeconds() {
            return ((Duration)this.instance).getSeconds();
        }

        public Builder setNanos(int v) {
            this.copyOnWrite();
            ((Duration)this.instance).setNanos(v);
            return this;
        }

        public Builder setSeconds(long v) {
            this.copyOnWrite();
            ((Duration)this.instance).setSeconds(v);
            return this;
        }
    }

    static class a {
        static final int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final Duration DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Duration duration0 = new Duration();
        Duration.DEFAULT_INSTANCE = duration0;
        GeneratedMessageLite.registerDefaultInstance(Duration.class, duration0);
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    private void clearSeconds() {
        this.seconds_ = 0L;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Duration();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(Duration.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            }
            case 4: {
                return Duration.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Duration.PARSER;
                if(parser0 == null) {
                    Class class0 = Duration.class;
                    synchronized(class0) {
                        parser0 = Duration.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Duration.DEFAULT_INSTANCE);
                            Duration.PARSER = parser0;
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

    public static Duration getDefaultInstance() {
        return Duration.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.DurationOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    @Override  // com.google.protobuf.DurationOrBuilder
    public long getSeconds() {
        return this.seconds_;
    }

    public static Builder newBuilder() {
        return (Builder)Duration.DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Duration duration0) {
        return (Builder)Duration.DEFAULT_INSTANCE.createBuilder(duration0);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream0) throws IOException {
        return (Duration)GeneratedMessageLite.parseDelimitedFrom(Duration.DEFAULT_INSTANCE, inputStream0);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Duration)GeneratedMessageLite.parseDelimitedFrom(Duration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Duration parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, byteString0);
    }

    public static Duration parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Duration parseFrom(CodedInputStream codedInputStream0) throws IOException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Duration parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Duration parseFrom(InputStream inputStream0) throws IOException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, inputStream0);
    }

    public static Duration parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Duration parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, arr_b);
    }

    public static Duration parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.parseFrom(Duration.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser parser() {
        return Duration.DEFAULT_INSTANCE.getParserForType();
    }

    private void setNanos(int v) {
        this.nanos_ = v;
    }

    private void setSeconds(long v) {
        this.seconds_ = v;
    }
}

