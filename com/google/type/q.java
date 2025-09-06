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

public final class q extends GeneratedMessageLite implements r {
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

    public static final class b extends Builder implements r {
        private b() {
            super(q.DEFAULT_INSTANCE);
        }

        b(a q$a0) {
        }

        @Override  // com.google.type.r
        public long h8() {
            return ((q)this.instance).h8();
        }

        @Override  // com.google.type.r
        public long k2() {
            return ((q)this.instance).k2();
        }

        public b ub() {
            this.copyOnWrite();
            ((q)this.instance).M4();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((q)this.instance).P4();
            return this;
        }

        public b wb(long v) {
            this.copyOnWrite();
            ((q)this.instance).xb(v);
            return this;
        }

        public b xb(long v) {
            this.copyOnWrite();
            ((q)this.instance).yb(v);
            return this;
        }
    }

    private static final q DEFAULT_INSTANCE = null;
    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private long denominator_;
    private long numerator_;

    static {
        q q0 = new q();
        q.DEFAULT_INSTANCE = q0;
        GeneratedMessageLite.registerDefaultInstance(q.class, q0);
    }

    public static b A6(q q0) {
        return (b)q.DEFAULT_INSTANCE.createBuilder(q0);
    }

    public static q A8(CodedInputStream codedInputStream0) throws IOException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static q B6(InputStream inputStream0) throws IOException {
        return (q)GeneratedMessageLite.parseDelimitedFrom(q.DEFAULT_INSTANCE, inputStream0);
    }

    public static q Ja(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static q La(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void M4() {
        this.denominator_ = 0L;
    }

    public static q M6(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (q)GeneratedMessageLite.parseDelimitedFrom(q.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void P4() {
        this.numerator_ = 0L;
    }

    public static q Z7(ByteString byteString0) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, byteString0);
    }

    public static q ca(InputStream inputStream0) throws IOException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, inputStream0);
    }

    public static q d6() {
        return q.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new q();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(q.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"numerator_", "denominator_"});
            }
            case 4: {
                return q.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = q.PARSER;
                if(parser0 == null) {
                    Class class0 = q.class;
                    synchronized(class0) {
                        parser0 = q.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(q.DEFAULT_INSTANCE);
                            q.PARSER = parser0;
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

    @Override  // com.google.type.r
    public long h8() {
        return this.numerator_;
    }

    public static q j9(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.type.r
    public long k2() {
        return this.denominator_;
    }

    public static Parser parser() {
        return q.DEFAULT_INSTANCE.getParserForType();
    }

    public static q ub(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static q v8(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static q vb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, arr_b);
    }

    public static q wb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void xb(long v) {
        this.denominator_ = v;
    }

    private void yb(long v) {
        this.numerator_ = v;
    }

    public static b z6() {
        return (b)q.DEFAULT_INSTANCE.createBuilder();
    }
}

