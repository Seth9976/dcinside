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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PiiOuterClass {
    public static final class Pii extends GeneratedMessageLite implements PiiOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements PiiOrBuilder {
            private Builder() {
                super(Pii.DEFAULT_INSTANCE);
            }

            Builder(a piiOuterClass$a0) {
            }

            public Builder clearAdvertisingId() {
                this.copyOnWrite();
                ((Pii)this.instance).clearAdvertisingId();
                return this;
            }

            public Builder clearOpenAdvertisingTrackingId() {
                this.copyOnWrite();
                ((Pii)this.instance).clearOpenAdvertisingTrackingId();
                return this;
            }

            public Builder clearVendorId() {
                this.copyOnWrite();
                ((Pii)this.instance).clearVendorId();
                return this;
            }

            @Override  // gatewayprotocol.v1.PiiOuterClass$PiiOrBuilder
            public ByteString getAdvertisingId() {
                return ((Pii)this.instance).getAdvertisingId();
            }

            @Override  // gatewayprotocol.v1.PiiOuterClass$PiiOrBuilder
            public ByteString getOpenAdvertisingTrackingId() {
                return ((Pii)this.instance).getOpenAdvertisingTrackingId();
            }

            @Override  // gatewayprotocol.v1.PiiOuterClass$PiiOrBuilder
            public ByteString getVendorId() {
                return ((Pii)this.instance).getVendorId();
            }

            public Builder setAdvertisingId(ByteString byteString0) {
                this.copyOnWrite();
                ((Pii)this.instance).setAdvertisingId(byteString0);
                return this;
            }

            public Builder setOpenAdvertisingTrackingId(ByteString byteString0) {
                this.copyOnWrite();
                ((Pii)this.instance).setOpenAdvertisingTrackingId(byteString0);
                return this;
            }

            public Builder setVendorId(ByteString byteString0) {
                this.copyOnWrite();
                ((Pii)this.instance).setVendorId(byteString0);
                return this;
            }
        }

        public static final int ADVERTISING_ID_FIELD_NUMBER = 1;
        private static final Pii DEFAULT_INSTANCE = null;
        public static final int OPEN_ADVERTISING_TRACKING_ID_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int VENDOR_ID_FIELD_NUMBER = 2;
        private ByteString advertisingId_;
        private ByteString openAdvertisingTrackingId_;
        private ByteString vendorId_;

        static {
            Pii piiOuterClass$Pii0 = new Pii();
            Pii.DEFAULT_INSTANCE = piiOuterClass$Pii0;
            GeneratedMessageLite.registerDefaultInstance(Pii.class, piiOuterClass$Pii0);
        }

        private Pii() {
            this.advertisingId_ = ByteString.EMPTY;
            this.vendorId_ = ByteString.EMPTY;
            this.openAdvertisingTrackingId_ = ByteString.EMPTY;
        }

        private void clearAdvertisingId() {
            this.advertisingId_ = Pii.getDefaultInstance().getAdvertisingId();
        }

        private void clearOpenAdvertisingTrackingId() {
            this.openAdvertisingTrackingId_ = Pii.getDefaultInstance().getOpenAdvertisingTrackingId();
        }

        private void clearVendorId() {
            this.vendorId_ = Pii.getDefaultInstance().getVendorId();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new Pii();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(Pii.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"advertisingId_", "vendorId_", "openAdvertisingTrackingId_"});
                }
                case 4: {
                    return Pii.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = Pii.PARSER;
                    if(parser0 == null) {
                        Class class0 = Pii.class;
                        synchronized(class0) {
                            parser0 = Pii.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(Pii.DEFAULT_INSTANCE);
                                Pii.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.PiiOuterClass$PiiOrBuilder
        public ByteString getAdvertisingId() {
            return this.advertisingId_;
        }

        public static Pii getDefaultInstance() {
            return Pii.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.PiiOuterClass$PiiOrBuilder
        public ByteString getOpenAdvertisingTrackingId() {
            return this.openAdvertisingTrackingId_;
        }

        @Override  // gatewayprotocol.v1.PiiOuterClass$PiiOrBuilder
        public ByteString getVendorId() {
            return this.vendorId_;
        }

        public static Builder newBuilder() {
            return (Builder)Pii.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Pii piiOuterClass$Pii0) {
            return (Builder)Pii.DEFAULT_INSTANCE.createBuilder(piiOuterClass$Pii0);
        }

        public static Pii parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (Pii)GeneratedMessageLite.parseDelimitedFrom(Pii.DEFAULT_INSTANCE, inputStream0);
        }

        public static Pii parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Pii)GeneratedMessageLite.parseDelimitedFrom(Pii.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Pii parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom(Pii.DEFAULT_INSTANCE, byteString0);
        }

        public static Pii parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom(Pii.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static Pii parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (Pii)GeneratedMessageLite.parseFrom(Pii.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static Pii parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Pii)GeneratedMessageLite.parseFrom(Pii.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static Pii parseFrom(InputStream inputStream0) throws IOException {
            return (Pii)GeneratedMessageLite.parseFrom(Pii.DEFAULT_INSTANCE, inputStream0);
        }

        public static Pii parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Pii)GeneratedMessageLite.parseFrom(Pii.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Pii parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom(Pii.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static Pii parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom(Pii.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static Pii parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom(Pii.DEFAULT_INSTANCE, arr_b);
        }

        public static Pii parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Pii)GeneratedMessageLite.parseFrom(Pii.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return Pii.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdvertisingId(ByteString byteString0) {
            byteString0.getClass();
            this.advertisingId_ = byteString0;
        }

        private void setOpenAdvertisingTrackingId(ByteString byteString0) {
            byteString0.getClass();
            this.openAdvertisingTrackingId_ = byteString0;
        }

        private void setVendorId(ByteString byteString0) {
            byteString0.getClass();
            this.vendorId_ = byteString0;
        }
    }

    public interface PiiOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdvertisingId();

        ByteString getOpenAdvertisingTrackingId();

        ByteString getVendorId();
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

