package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ErrorOuterClass {
    public static final class Error extends GeneratedMessageLite implements ErrorOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements ErrorOrBuilder {
            private Builder() {
                super(Error.DEFAULT_INSTANCE);
            }

            Builder(a errorOuterClass$a0) {
            }

            public Builder clearErrorText() {
                this.copyOnWrite();
                ((Error)this.instance).clearErrorText();
                return this;
            }

            @Override  // gatewayprotocol.v1.ErrorOuterClass$ErrorOrBuilder
            public String getErrorText() {
                return ((Error)this.instance).getErrorText();
            }

            @Override  // gatewayprotocol.v1.ErrorOuterClass$ErrorOrBuilder
            public ByteString getErrorTextBytes() {
                return ((Error)this.instance).getErrorTextBytes();
            }

            public Builder setErrorText(String s) {
                this.copyOnWrite();
                ((Error)this.instance).setErrorText(s);
                return this;
            }

            public Builder setErrorTextBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((Error)this.instance).setErrorTextBytes(byteString0);
                return this;
            }
        }

        private static final Error DEFAULT_INSTANCE = null;
        public static final int ERROR_TEXT_FIELD_NUMBER = 2;
        private static volatile Parser PARSER;
        private String errorText_;

        static {
            Error errorOuterClass$Error0 = new Error();
            Error.DEFAULT_INSTANCE = errorOuterClass$Error0;
            GeneratedMessageLite.registerDefaultInstance(Error.class, errorOuterClass$Error0);
        }

        private Error() {
            this.errorText_ = "";
        }

        private void clearErrorText() {
            this.errorText_ = "";
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new Error();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(Error.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"errorText_"});
                }
                case 4: {
                    return Error.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = Error.PARSER;
                    if(parser0 == null) {
                        Class class0 = Error.class;
                        synchronized(class0) {
                            parser0 = Error.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(Error.DEFAULT_INSTANCE);
                                Error.PARSER = parser0;
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

        public static Error getDefaultInstance() {
            return Error.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.ErrorOuterClass$ErrorOrBuilder
        public String getErrorText() [...] // 潜在的解密器

        @Override  // gatewayprotocol.v1.ErrorOuterClass$ErrorOrBuilder
        public ByteString getErrorTextBytes() {
            return ByteString.copyFromUtf8(this.errorText_);
        }

        public static Builder newBuilder() {
            return (Builder)Error.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Error errorOuterClass$Error0) {
            return (Builder)Error.DEFAULT_INSTANCE.createBuilder(errorOuterClass$Error0);
        }

        public static Error parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (Error)GeneratedMessageLite.parseDelimitedFrom(Error.DEFAULT_INSTANCE, inputStream0);
        }

        public static Error parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Error)GeneratedMessageLite.parseDelimitedFrom(Error.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Error parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (Error)GeneratedMessageLite.parseFrom(Error.DEFAULT_INSTANCE, byteString0);
        }

        public static Error parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Error)GeneratedMessageLite.parseFrom(Error.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static Error parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (Error)GeneratedMessageLite.parseFrom(Error.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static Error parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Error)GeneratedMessageLite.parseFrom(Error.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static Error parseFrom(InputStream inputStream0) throws IOException {
            return (Error)GeneratedMessageLite.parseFrom(Error.DEFAULT_INSTANCE, inputStream0);
        }

        public static Error parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Error)GeneratedMessageLite.parseFrom(Error.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Error parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (Error)GeneratedMessageLite.parseFrom(Error.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static Error parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Error)GeneratedMessageLite.parseFrom(Error.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static Error parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (Error)GeneratedMessageLite.parseFrom(Error.DEFAULT_INSTANCE, arr_b);
        }

        public static Error parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Error)GeneratedMessageLite.parseFrom(Error.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return Error.DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorText(String s) {
            s.getClass();
            this.errorText_ = s;
        }

        private void setErrorTextBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.errorText_ = byteString0.toStringUtf8();
        }
    }

    public interface ErrorOrBuilder extends MessageLiteOrBuilder {
        String getErrorText();

        ByteString getErrorTextBytes();
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

