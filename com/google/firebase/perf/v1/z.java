package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class z extends GeneratedMessageLite implements A {
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

    public static final class b extends Builder implements A {
        private b() {
            super(z.DEFAULT_INSTANCE);
        }

        b(a z$a0) {
        }

        @Override  // com.google.firebase.perf.v1.A
        public c K6() {
            return ((z)this.instance).K6();
        }

        public b ub() {
            this.copyOnWrite();
            ((z)this.instance).E3();
            return this;
        }

        public b vb(c z$c0) {
            this.copyOnWrite();
            ((z)this.instance).ub(z$c0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.A
        public boolean z4() {
            return ((z)this.instance).z4();
        }
    }

    public static enum c implements EnumLite {
        class com.google.firebase.perf.v1.z.c.a implements EnumLiteMap {
            com.google.firebase.perf.v1.z.c.a() {
                super();
            }

            public c a(int v) {
                return c.b(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class com.google.firebase.perf.v1.z.c.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                com.google.firebase.perf.v1.z.c.b.a = new com.google.firebase.perf.v1.z.c.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return c.b(v) != null;
            }
        }

        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);

        private final int a;
        public static final int d = 0;
        public static final int e = 1;
        private static final EnumLiteMap f;

        static {
            c.f = new com.google.firebase.perf.v1.z.c.a();
        }

        private c(int v1) {
            this.a = v1;
        }

        private static c[] a() [...] // Inlined contents

        public static c b(int v) {
            switch(v) {
                case 0: {
                    return c.b;
                }
                case 1: {
                    return c.c;
                }
                default: {
                    return null;
                }
            }
        }

        public static EnumLiteMap c() {
            return c.f;
        }

        public static EnumVerifier d() {
            return com.google.firebase.perf.v1.z.c.b.a;
        }

        @Deprecated
        public static c e(int v) {
            return c.b(v);
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            return this.a;
        }
    }

    private static final z DEFAULT_INSTANCE = null;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static {
        z z0 = new z();
        z.DEFAULT_INSTANCE = z0;
        GeneratedMessageLite.registerDefaultInstance(z.class, z0);
    }

    public static z A6(ByteString byteString0) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, byteString0);
    }

    public static z A8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static z B6(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void E3() {
        this.bitField0_ &= -2;
        this.dispatchDestination_ = 0;
    }

    public static z F3() {
        return z.DEFAULT_INSTANCE;
    }

    public static z Ja(byte[] arr_b) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.firebase.perf.v1.A
    public c K6() {
        c z$c0 = c.b(this.dispatchDestination_);
        return z$c0 == null ? c.b : z$c0;
    }

    public static z La(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static b M4() {
        return (b)z.DEFAULT_INSTANCE.createBuilder();
    }

    public static z M6(CodedInputStream codedInputStream0) throws IOException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static b P4(z z0) {
        return (b)z.DEFAULT_INSTANCE.createBuilder(z0);
    }

    public static z Z7(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static z ca(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static z d6(InputStream inputStream0) throws IOException {
        return (z)GeneratedMessageLite.parseDelimitedFrom(z.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new z();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(z.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.d()});
            }
            case 4: {
                return z.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = z.PARSER;
                if(parser0 == null) {
                    Class class0 = z.class;
                    synchronized(class0) {
                        parser0 = z.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(z.DEFAULT_INSTANCE);
                            z.PARSER = parser0;
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

    public static z j9(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Parser parser() {
        return z.DEFAULT_INSTANCE.getParserForType();
    }

    private void ub(c z$c0) {
        this.dispatchDestination_ = z$c0.getNumber();
        this.bitField0_ |= 1;
    }

    public static z v8(InputStream inputStream0) throws IOException {
        return (z)GeneratedMessageLite.parseFrom(z.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.firebase.perf.v1.A
    public boolean z4() {
        return (this.bitField0_ & 1) != 0;
    }

    public static z z6(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (z)GeneratedMessageLite.parseDelimitedFrom(z.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

