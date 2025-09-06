package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TimestampsOuterClass {
    public static final class Timestamps extends GeneratedMessageLite implements TimestampsOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements TimestampsOrBuilder {
            private Builder() {
                super(Timestamps.DEFAULT_INSTANCE);
            }

            Builder(a timestampsOuterClass$a0) {
            }

            public Builder clearSessionTimestamp() {
                this.copyOnWrite();
                ((Timestamps)this.instance).clearSessionTimestamp();
                return this;
            }

            public Builder clearTimestamp() {
                this.copyOnWrite();
                ((Timestamps)this.instance).clearTimestamp();
                return this;
            }

            @Override  // gatewayprotocol.v1.TimestampsOuterClass$TimestampsOrBuilder
            public long getSessionTimestamp() {
                return ((Timestamps)this.instance).getSessionTimestamp();
            }

            @Override  // gatewayprotocol.v1.TimestampsOuterClass$TimestampsOrBuilder
            public Timestamp getTimestamp() {
                return ((Timestamps)this.instance).getTimestamp();
            }

            @Override  // gatewayprotocol.v1.TimestampsOuterClass$TimestampsOrBuilder
            public boolean hasTimestamp() {
                return ((Timestamps)this.instance).hasTimestamp();
            }

            public Builder mergeTimestamp(Timestamp timestamp0) {
                this.copyOnWrite();
                ((Timestamps)this.instance).mergeTimestamp(timestamp0);
                return this;
            }

            public Builder setSessionTimestamp(long v) {
                this.copyOnWrite();
                ((Timestamps)this.instance).setSessionTimestamp(v);
                return this;
            }

            public Builder setTimestamp(com.google.protobuf.Timestamp.Builder timestamp$Builder0) {
                this.copyOnWrite();
                ((Timestamps)this.instance).setTimestamp(((Timestamp)timestamp$Builder0.build()));
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp0) {
                this.copyOnWrite();
                ((Timestamps)this.instance).setTimestamp(timestamp0);
                return this;
            }
        }

        private static final Timestamps DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int SESSION_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private int bitField0_;
        private long sessionTimestamp_;
        private Timestamp timestamp_;

        static {
            Timestamps timestampsOuterClass$Timestamps0 = new Timestamps();
            Timestamps.DEFAULT_INSTANCE = timestampsOuterClass$Timestamps0;
            GeneratedMessageLite.registerDefaultInstance(Timestamps.class, timestampsOuterClass$Timestamps0);
        }

        private void clearSessionTimestamp() {
            this.sessionTimestamp_ = 0L;
        }

        private void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= -2;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new Timestamps();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(Timestamps.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002", new Object[]{"bitField0_", "timestamp_", "sessionTimestamp_"});
                }
                case 4: {
                    return Timestamps.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = Timestamps.PARSER;
                    if(parser0 == null) {
                        Class class0 = Timestamps.class;
                        synchronized(class0) {
                            parser0 = Timestamps.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(Timestamps.DEFAULT_INSTANCE);
                                Timestamps.PARSER = parser0;
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

        public static Timestamps getDefaultInstance() {
            return Timestamps.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.TimestampsOuterClass$TimestampsOrBuilder
        public long getSessionTimestamp() {
            return this.sessionTimestamp_;
        }

        @Override  // gatewayprotocol.v1.TimestampsOuterClass$TimestampsOrBuilder
        public Timestamp getTimestamp() {
            return this.timestamp_ == null ? Timestamp.getDefaultInstance() : this.timestamp_;
        }

        @Override  // gatewayprotocol.v1.TimestampsOuterClass$TimestampsOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeTimestamp(Timestamp timestamp0) {
            timestamp0.getClass();
            this.timestamp_ = this.timestamp_ == null || this.timestamp_ == Timestamp.getDefaultInstance() ? timestamp0 : ((Timestamp)((com.google.protobuf.Timestamp.Builder)Timestamp.newBuilder(this.timestamp_).mergeFrom(timestamp0)).buildPartial());
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)Timestamps.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Timestamps timestampsOuterClass$Timestamps0) {
            return (Builder)Timestamps.DEFAULT_INSTANCE.createBuilder(timestampsOuterClass$Timestamps0);
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseDelimitedFrom(Timestamps.DEFAULT_INSTANCE, inputStream0);
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseDelimitedFrom(Timestamps.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Timestamps parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom(Timestamps.DEFAULT_INSTANCE, byteString0);
        }

        public static Timestamps parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom(Timestamps.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseFrom(Timestamps.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseFrom(Timestamps.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static Timestamps parseFrom(InputStream inputStream0) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseFrom(Timestamps.DEFAULT_INSTANCE, inputStream0);
        }

        public static Timestamps parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Timestamps)GeneratedMessageLite.parseFrom(Timestamps.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom(Timestamps.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom(Timestamps.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static Timestamps parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom(Timestamps.DEFAULT_INSTANCE, arr_b);
        }

        public static Timestamps parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Timestamps)GeneratedMessageLite.parseFrom(Timestamps.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return Timestamps.DEFAULT_INSTANCE.getParserForType();
        }

        private void setSessionTimestamp(long v) {
            this.sessionTimestamp_ = v;
        }

        private void setTimestamp(Timestamp timestamp0) {
            timestamp0.getClass();
            this.timestamp_ = timestamp0;
            this.bitField0_ |= 1;
        }
    }

    public interface TimestampsOrBuilder extends MessageLiteOrBuilder {
        long getSessionTimestamp();

        Timestamp getTimestamp();

        boolean hasTimestamp();
    }

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

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

