package com.google.firebase.perf.v1;

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

public final class a extends GeneratedMessageLite implements b {
    static class com.google.firebase.perf.v1.a.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            com.google.firebase.perf.v1.a.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.firebase.perf.v1.a.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.firebase.perf.v1.a.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.firebase.perf.v1.a.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.firebase.perf.v1.a.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.firebase.perf.v1.a.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.firebase.perf.v1.a.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class com.google.firebase.perf.v1.a.b extends Builder implements b {
        private com.google.firebase.perf.v1.a.b() {
            super(a.DEFAULT_INSTANCE);
        }

        com.google.firebase.perf.v1.a.b(com.google.firebase.perf.v1.a.a a$a0) {
        }

        public com.google.firebase.perf.v1.a.b Ab(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Fb(byteString0);
            return this;
        }

        public com.google.firebase.perf.v1.a.b Bb(String s) {
            this.copyOnWrite();
            ((a)this.instance).Gb(s);
            return this;
        }

        public com.google.firebase.perf.v1.a.b Cb(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Hb(byteString0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.b
        public ByteString Fa() {
            return ((a)this.instance).Fa();
        }

        @Override  // com.google.firebase.perf.v1.b
        public boolean I1() {
            return ((a)this.instance).I1();
        }

        @Override  // com.google.firebase.perf.v1.b
        public ByteString U9() {
            return ((a)this.instance).U9();
        }

        @Override  // com.google.firebase.perf.v1.b
        public boolean e8() {
            return ((a)this.instance).e8();
        }

        @Override  // com.google.firebase.perf.v1.b
        public boolean f3() {
            return ((a)this.instance).f3();
        }

        @Override  // com.google.firebase.perf.v1.b
        public String getPackageName() {
            return ((a)this.instance).getPackageName();
        }

        @Override  // com.google.firebase.perf.v1.b
        public String getSdkVersion() {
            return ((a)this.instance).getSdkVersion();
        }

        @Override  // com.google.firebase.perf.v1.b
        public String m1() {
            return ((a)this.instance).m1();
        }

        public com.google.firebase.perf.v1.a.b ub() {
            this.copyOnWrite();
            ((a)this.instance).B6();
            return this;
        }

        public com.google.firebase.perf.v1.a.b vb() {
            this.copyOnWrite();
            ((a)this.instance).clearSdkVersion();
            return this;
        }

        public com.google.firebase.perf.v1.a.b wb() {
            this.copyOnWrite();
            ((a)this.instance).M6();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.b
        public ByteString xa() {
            return ((a)this.instance).xa();
        }

        public com.google.firebase.perf.v1.a.b xb(String s) {
            this.copyOnWrite();
            ((a)this.instance).Cb(s);
            return this;
        }

        public com.google.firebase.perf.v1.a.b yb(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Db(byteString0);
            return this;
        }

        public com.google.firebase.perf.v1.a.b zb(String s) {
            this.copyOnWrite();
            ((a)this.instance).Eb(s);
            return this;
        }
    }

    private static final a DEFAULT_INSTANCE = null;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_;
    private String sdkVersion_;
    private String versionName_;

    static {
        a a0 = new a();
        a.DEFAULT_INSTANCE = a0;
        GeneratedMessageLite.registerDefaultInstance(a.class, a0);
    }

    private a() {
        this.packageName_ = "";
        this.sdkVersion_ = "";
        this.versionName_ = "";
    }

    public static com.google.firebase.perf.v1.a.b A8(a a0) {
        return (com.google.firebase.perf.v1.a.b)a.DEFAULT_INSTANCE.createBuilder(a0);
    }

    public static a Ab(byte[] arr_b) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b);
    }

    private void B6() {
        this.bitField0_ &= -2;
        this.packageName_ = "";
    }

    public static a Bb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Cb(String s) {
        s.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = s;
    }

    private void Db(ByteString byteString0) {
        this.packageName_ = byteString0.toStringUtf8();
        this.bitField0_ |= 1;
    }

    private void Eb(String s) {
        s.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = s;
    }

    @Override  // com.google.firebase.perf.v1.b
    public ByteString Fa() {
        return ByteString.copyFromUtf8(this.sdkVersion_);
    }

    private void Fb(ByteString byteString0) {
        this.sdkVersion_ = byteString0.toStringUtf8();
        this.bitField0_ |= 2;
    }

    private void Gb(String s) {
        s.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = s;
    }

    private void Hb(ByteString byteString0) {
        this.versionName_ = byteString0.toStringUtf8();
        this.bitField0_ |= 4;
    }

    @Override  // com.google.firebase.perf.v1.b
    public boolean I1() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a Ja(ByteString byteString0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0);
    }

    public static a La(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void M6() {
        this.bitField0_ &= -5;
        this.versionName_ = "";
    }

    @Override  // com.google.firebase.perf.v1.b
    public ByteString U9() {
        return ByteString.copyFromUtf8(this.packageName_);
    }

    public static a Z7() {
        return a.DEFAULT_INSTANCE;
    }

    public static a ca(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void clearSdkVersion() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new a();
            }
            case 2: {
                return new com.google.firebase.perf.v1.a.b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(a.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            }
            case 4: {
                return a.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = a.PARSER;
                if(parser0 == null) {
                    Class class0 = a.class;
                    synchronized(class0) {
                        parser0 = a.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(a.DEFAULT_INSTANCE);
                            a.PARSER = parser0;
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

    @Override  // com.google.firebase.perf.v1.b
    public boolean e8() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override  // com.google.firebase.perf.v1.b
    public boolean f3() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override  // com.google.firebase.perf.v1.b
    public String getPackageName() {
        return this.packageName_;
    }

    @Override  // com.google.firebase.perf.v1.b
    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    public static a j9(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.firebase.perf.v1.b
    public String m1() {
        return this.versionName_;
    }

    public static Parser parser() {
        return a.DEFAULT_INSTANCE.getParserForType();
    }

    public static a ub(CodedInputStream codedInputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static com.google.firebase.perf.v1.a.b v8() {
        return (com.google.firebase.perf.v1.a.b)a.DEFAULT_INSTANCE.createBuilder();
    }

    public static a vb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static a wb(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.firebase.perf.v1.b
    public ByteString xa() {
        return ByteString.copyFromUtf8(this.versionName_);
    }

    public static a xb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static a yb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static a zb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }
}

