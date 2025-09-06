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

public final class f extends GeneratedMessageLite implements g {
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

    public static final class b extends Builder implements g {
        private b() {
            super(f.DEFAULT_INSTANCE);
        }

        b(a f$a0) {
        }

        public b Ab(String s) {
            this.copyOnWrite();
            ((f)this.instance).Fb(s);
            return this;
        }

        public b Bb(ByteString byteString0) {
            this.copyOnWrite();
            ((f)this.instance).Gb(byteString0);
            return this;
        }

        @Override  // com.google.cloud.audit.g
        public String Ea() {
            return ((f)this.instance).Ea();
        }

        @Override  // com.google.cloud.audit.g
        public boolean H2() {
            return ((f)this.instance).H2();
        }

        @Override  // com.google.cloud.audit.g
        public String R() {
            return ((f)this.instance).R();
        }

        @Override  // com.google.cloud.audit.g
        public ByteString l5() {
            return ((f)this.instance).l5();
        }

        @Override  // com.google.cloud.audit.g
        public ByteString p6() {
            return ((f)this.instance).p6();
        }

        public b ub() {
            this.copyOnWrite();
            ((f)this.instance).A6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((f)this.instance).B6();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((f)this.instance).M6();
            return this;
        }

        public b xb(boolean z) {
            this.copyOnWrite();
            ((f)this.instance).Cb(z);
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((f)this.instance).Db(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((f)this.instance).Eb(byteString0);
            return this;
        }
    }

    private static final f DEFAULT_INSTANCE = null;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String permission_;
    private String resource_;

    static {
        f f0 = new f();
        f.DEFAULT_INSTANCE = f0;
        GeneratedMessageLite.registerDefaultInstance(f.class, f0);
    }

    private f() {
        this.resource_ = "";
        this.permission_ = "";
    }

    private void A6() {
        this.granted_ = false;
    }

    public static b A8(f f0) {
        return (b)f.DEFAULT_INSTANCE.createBuilder(f0);
    }

    public static f Ab(byte[] arr_b) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, arr_b);
    }

    private void B6() {
        this.permission_ = "";
    }

    public static f Bb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Cb(boolean z) {
        this.granted_ = z;
    }

    private void Db(String s) {
        s.getClass();
        this.permission_ = s;
    }

    @Override  // com.google.cloud.audit.g
    public String Ea() {
        return this.permission_;
    }

    private void Eb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.permission_ = byteString0.toStringUtf8();
    }

    private void Fb(String s) {
        s.getClass();
        this.resource_ = s;
    }

    private void Gb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.resource_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.cloud.audit.g
    public boolean H2() {
        return this.granted_;
    }

    public static f Ja(ByteString byteString0) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, byteString0);
    }

    public static f La(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void M6() {
        this.resource_ = "";
    }

    @Override  // com.google.cloud.audit.g
    public String R() {
        return this.resource_;
    }

    public static f Z7() {
        return f.DEFAULT_INSTANCE;
    }

    public static f ca(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (f)GeneratedMessageLite.parseDelimitedFrom(f.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new f();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(f.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"resource_", "permission_", "granted_"});
            }
            case 4: {
                return f.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = f.PARSER;
                if(parser0 == null) {
                    Class class0 = f.class;
                    synchronized(class0) {
                        parser0 = f.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(f.DEFAULT_INSTANCE);
                            f.PARSER = parser0;
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

    public static f j9(InputStream inputStream0) throws IOException {
        return (f)GeneratedMessageLite.parseDelimitedFrom(f.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.cloud.audit.g
    public ByteString l5() {
        return ByteString.copyFromUtf8(this.resource_);
    }

    @Override  // com.google.cloud.audit.g
    public ByteString p6() {
        return ByteString.copyFromUtf8(this.permission_);
    }

    public static Parser parser() {
        return f.DEFAULT_INSTANCE.getParserForType();
    }

    public static f ub(CodedInputStream codedInputStream0) throws IOException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static b v8() {
        return (b)f.DEFAULT_INSTANCE.createBuilder();
    }

    public static f vb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static f wb(InputStream inputStream0) throws IOException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, inputStream0);
    }

    public static f xb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static f yb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static f zb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }
}

