package com.google.type;

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

        @Override  // com.google.type.g
        public int P0() {
            return ((f)this.instance).P0();
        }

        @Override  // com.google.type.g
        public int q0() {
            return ((f)this.instance).q0();
        }

        @Override  // com.google.type.g
        public int t0() {
            return ((f)this.instance).t0();
        }

        public b ub() {
            this.copyOnWrite();
            ((f)this.instance).d6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((f)this.instance).z6();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((f)this.instance).A6();
            return this;
        }

        public b xb(int v) {
            this.copyOnWrite();
            ((f)this.instance).Ab(v);
            return this;
        }

        public b yb(int v) {
            this.copyOnWrite();
            ((f)this.instance).Bb(v);
            return this;
        }

        public b zb(int v) {
            this.copyOnWrite();
            ((f)this.instance).Cb(v);
            return this;
        }
    }

    public static final int DAY_FIELD_NUMBER = 3;
    private static final f DEFAULT_INSTANCE = null;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int month_;
    private int year_;

    static {
        f f0 = new f();
        f.DEFAULT_INSTANCE = f0;
        GeneratedMessageLite.registerDefaultInstance(f.class, f0);
    }

    private void A6() {
        this.year_ = 0;
    }

    public static f A8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (f)GeneratedMessageLite.parseDelimitedFrom(f.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void Ab(int v) {
        this.day_ = v;
    }

    public static f B6() {
        return f.DEFAULT_INSTANCE;
    }

    private void Bb(int v) {
        this.month_ = v;
    }

    private void Cb(int v) {
        this.year_ = v;
    }

    public static f Ja(CodedInputStream codedInputStream0) throws IOException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static f La(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static b M6() {
        return (b)f.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.type.g
    public int P0() {
        return this.month_;
    }

    public static b Z7(f f0) {
        return (b)f.DEFAULT_INSTANCE.createBuilder(f0);
    }

    public static f ca(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void d6() {
        this.day_ = 0;
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
                return GeneratedMessageLite.newMessageInfo(f.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"year_", "month_", "day_"});
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

    public static f j9(ByteString byteString0) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, byteString0);
    }

    public static Parser parser() {
        return f.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.type.g
    public int q0() {
        return this.year_;
    }

    @Override  // com.google.type.g
    public int t0() {
        return this.day_;
    }

    public static f ub(InputStream inputStream0) throws IOException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, inputStream0);
    }

    public static f v8(InputStream inputStream0) throws IOException {
        return (f)GeneratedMessageLite.parseDelimitedFrom(f.DEFAULT_INSTANCE, inputStream0);
    }

    public static f vb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static f wb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static f xb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static f yb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, arr_b);
    }

    private void z6() {
        this.month_ = 0;
    }

    public static f zb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (f)GeneratedMessageLite.parseFrom(f.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }
}

