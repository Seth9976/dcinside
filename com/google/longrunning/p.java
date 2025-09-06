package com.google.longrunning;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
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

public final class p extends GeneratedMessageLite implements q {
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

    public static final class b extends Builder implements q {
        private b() {
            super(p.DEFAULT_INSTANCE);
        }

        b(a p$a0) {
        }

        public b Ab(Duration duration0) {
            this.copyOnWrite();
            ((p)this.instance).zb(duration0);
            return this;
        }

        @Override  // com.google.longrunning.q
        public boolean K7() {
            return ((p)this.instance).K7();
        }

        @Override  // com.google.longrunning.q
        public Duration P1() {
            return ((p)this.instance).P1();
        }

        @Override  // com.google.longrunning.q
        public String getName() {
            return ((p)this.instance).getName();
        }

        @Override  // com.google.longrunning.q
        public ByteString getNameBytes() {
            return ((p)this.instance).getNameBytes();
        }

        public b ub() {
            this.copyOnWrite();
            ((p)this.instance).clearName();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((p)this.instance).d6();
            return this;
        }

        public b wb(Duration duration0) {
            this.copyOnWrite();
            ((p)this.instance).A6(duration0);
            return this;
        }

        public b xb(String s) {
            this.copyOnWrite();
            ((p)this.instance).setName(s);
            return this;
        }

        public b yb(ByteString byteString0) {
            this.copyOnWrite();
            ((p)this.instance).setNameBytes(byteString0);
            return this;
        }

        public b zb(com.google.protobuf.Duration.Builder duration$Builder0) {
            this.copyOnWrite();
            ((p)this.instance).zb(((Duration)duration$Builder0.build()));
            return this;
        }
    }

    private static final p DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 2;
    private String name_;
    private Duration timeout_;

    static {
        p p0 = new p();
        p.DEFAULT_INSTANCE = p0;
        GeneratedMessageLite.registerDefaultInstance(p.class, p0);
    }

    private p() {
        this.name_ = "";
    }

    private void A6(Duration duration0) {
        duration0.getClass();
        if(this.timeout_ != null && this.timeout_ != Duration.getDefaultInstance()) {
            this.timeout_ = (Duration)((com.google.protobuf.Duration.Builder)Duration.newBuilder(this.timeout_).mergeFrom(duration0)).buildPartial();
            return;
        }
        this.timeout_ = duration0;
    }

    public static p A8(ByteString byteString0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteString0);
    }

    public static b B6() {
        return (b)p.DEFAULT_INSTANCE.createBuilder();
    }

    public static p Ja(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.longrunning.q
    public boolean K7() {
        return this.timeout_ != null;
    }

    public static p La(InputStream inputStream0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, inputStream0);
    }

    public static b M6(p p0) {
        return (b)p.DEFAULT_INSTANCE.createBuilder(p0);
    }

    @Override  // com.google.longrunning.q
    public Duration P1() {
        return this.timeout_ == null ? Duration.getDefaultInstance() : this.timeout_;
    }

    public static p Z7(InputStream inputStream0) throws IOException {
        return (p)GeneratedMessageLite.parseDelimitedFrom(p.DEFAULT_INSTANCE, inputStream0);
    }

    public static p ca(CodedInputStream codedInputStream0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void clearName() {
        this.name_ = "";
    }

    private void d6() {
        this.timeout_ = null;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new p();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(p.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "timeout_"});
            }
            case 4: {
                return p.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = p.PARSER;
                if(parser0 == null) {
                    Class class0 = p.class;
                    synchronized(class0) {
                        parser0 = p.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(p.DEFAULT_INSTANCE);
                            p.PARSER = parser0;
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

    @Override  // com.google.longrunning.q
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.longrunning.q
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static p j9(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return p.DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.name_ = byteString0.toStringUtf8();
    }

    public static p ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static p v8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p)GeneratedMessageLite.parseDelimitedFrom(p.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static p vb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static p wb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static p xb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, arr_b);
    }

    public static p yb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static p z6() {
        return p.DEFAULT_INSTANCE;
    }

    private void zb(Duration duration0) {
        duration0.getClass();
        this.timeout_ = duration0;
    }
}

