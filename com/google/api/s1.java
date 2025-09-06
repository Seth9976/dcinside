package com.google.api;

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

public final class s1 extends GeneratedMessageLite implements t1 {
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

    public static final class b extends Builder implements t1 {
        private b() {
            super(s1.DEFAULT_INSTANCE);
        }

        b(a s1$a0) {
        }

        public b Ab(boolean z) {
            this.copyOnWrite();
            ((s1)this.instance).Eb(z);
            return this;
        }

        @Override  // com.google.api.t1
        public boolean C3() {
            return ((s1)this.instance).C3();
        }

        @Override  // com.google.api.t1
        public boolean F2() {
            return ((s1)this.instance).F2();
        }

        @Override  // com.google.api.t1
        public String b() {
            return ((s1)this.instance).b();
        }

        @Override  // com.google.api.t1
        public ByteString c() {
            return ((s1)this.instance).c();
        }

        public b ub() {
            this.copyOnWrite();
            ((s1)this.instance).z6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((s1)this.instance).A6();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((s1)this.instance).B6();
            return this;
        }

        public b xb(boolean z) {
            this.copyOnWrite();
            ((s1)this.instance).Bb(z);
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((s1)this.instance).Cb(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((s1)this.instance).Db(byteString0);
            return this;
        }
    }

    public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
    private static final s1 DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
    private boolean allowUnregisteredCalls_;
    private String selector_;
    private boolean skipServiceControl_;

    static {
        s1 s10 = new s1();
        s1.DEFAULT_INSTANCE = s10;
        GeneratedMessageLite.registerDefaultInstance(s1.class, s10);
    }

    private s1() {
        this.selector_ = "";
    }

    private void A6() {
        this.selector_ = "";
    }

    public static s1 A8(InputStream inputStream0) throws IOException {
        return (s1)GeneratedMessageLite.parseDelimitedFrom(s1.DEFAULT_INSTANCE, inputStream0);
    }

    public static s1 Ab(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (s1)GeneratedMessageLite.parseFrom(s1.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void B6() {
        this.skipServiceControl_ = false;
    }

    private void Bb(boolean z) {
        this.allowUnregisteredCalls_ = z;
    }

    @Override  // com.google.api.t1
    public boolean C3() {
        return this.allowUnregisteredCalls_;
    }

    private void Cb(String s) {
        s.getClass();
        this.selector_ = s;
    }

    private void Db(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.selector_ = byteString0.toStringUtf8();
    }

    private void Eb(boolean z) {
        this.skipServiceControl_ = z;
    }

    @Override  // com.google.api.t1
    public boolean F2() {
        return this.skipServiceControl_;
    }

    public static s1 Ja(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (s1)GeneratedMessageLite.parseFrom(s1.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static s1 La(CodedInputStream codedInputStream0) throws IOException {
        return (s1)GeneratedMessageLite.parseFrom(s1.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static s1 M6() {
        return s1.DEFAULT_INSTANCE;
    }

    public static b Z7() {
        return (b)s1.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.api.t1
    public String b() {
        return this.selector_;
    }

    @Override  // com.google.api.t1
    public ByteString c() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    public static s1 ca(ByteString byteString0) throws InvalidProtocolBufferException {
        return (s1)GeneratedMessageLite.parseFrom(s1.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new s1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(s1.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"selector_", "allowUnregisteredCalls_", "skipServiceControl_"});
            }
            case 4: {
                return s1.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = s1.PARSER;
                if(parser0 == null) {
                    Class class0 = s1.class;
                    synchronized(class0) {
                        parser0 = s1.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(s1.DEFAULT_INSTANCE);
                            s1.PARSER = parser0;
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

    public static s1 j9(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (s1)GeneratedMessageLite.parseDelimitedFrom(s1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return s1.DEFAULT_INSTANCE.getParserForType();
    }

    public static s1 ub(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (s1)GeneratedMessageLite.parseFrom(s1.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static b v8(s1 s10) {
        return (b)s1.DEFAULT_INSTANCE.createBuilder(s10);
    }

    public static s1 vb(InputStream inputStream0) throws IOException {
        return (s1)GeneratedMessageLite.parseFrom(s1.DEFAULT_INSTANCE, inputStream0);
    }

    public static s1 wb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (s1)GeneratedMessageLite.parseFrom(s1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static s1 xb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (s1)GeneratedMessageLite.parseFrom(s1.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static s1 yb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (s1)GeneratedMessageLite.parseFrom(s1.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    private void z6() {
        this.allowUnregisteredCalls_ = false;
    }

    public static s1 zb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (s1)GeneratedMessageLite.parseFrom(s1.DEFAULT_INSTANCE, arr_b);
    }
}

