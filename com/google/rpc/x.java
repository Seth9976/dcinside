package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class x extends GeneratedMessageLite implements y {
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

    public static final class b extends Builder implements y {
        private b() {
            super(x.DEFAULT_INSTANCE);
        }

        b(a x$a0) {
        }

        public b Ab() {
            this.copyOnWrite();
            ((x)this.instance).ca();
            return this;
        }

        public b Bb() {
            this.copyOnWrite();
            ((x)this.instance).clearMessage();
            return this;
        }

        public b Cb(int v) {
            this.copyOnWrite();
            ((x)this.instance).Kb(v);
            return this;
        }

        public b Db(int v) {
            this.copyOnWrite();
            ((x)this.instance).Lb(v);
            return this;
        }

        public b Eb(int v, com.google.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            ((x)this.instance).Mb(v, ((Any)any$Builder0.build()));
            return this;
        }

        public b Fb(int v, Any any0) {
            this.copyOnWrite();
            ((x)this.instance).Mb(v, any0);
            return this;
        }

        public b Gb(String s) {
            this.copyOnWrite();
            ((x)this.instance).setMessage(s);
            return this;
        }

        public b Hb(ByteString byteString0) {
            this.copyOnWrite();
            ((x)this.instance).setMessageBytes(byteString0);
            return this;
        }

        @Override  // com.google.rpc.y
        public int O1() {
            return ((x)this.instance).O1();
        }

        @Override  // com.google.rpc.y
        public List ab() {
            return DesugarCollections.unmodifiableList(((x)this.instance).ab());
        }

        @Override  // com.google.rpc.y
        public int getCode() {
            return ((x)this.instance).getCode();
        }

        @Override  // com.google.rpc.y
        public String getMessage() {
            return ((x)this.instance).getMessage();
        }

        @Override  // com.google.rpc.y
        public ByteString getMessageBytes() {
            return ((x)this.instance).getMessageBytes();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((x)this.instance).Z7(iterable0);
            return this;
        }

        public b vb(int v, com.google.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            ((x)this.instance).v8(v, ((Any)any$Builder0.build()));
            return this;
        }

        public b wb(int v, Any any0) {
            this.copyOnWrite();
            ((x)this.instance).v8(v, any0);
            return this;
        }

        @Override  // com.google.rpc.y
        public Any x2(int v) {
            return ((x)this.instance).x2(v);
        }

        public b xb(com.google.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            ((x)this.instance).A8(((Any)any$Builder0.build()));
            return this;
        }

        public b yb(Any any0) {
            this.copyOnWrite();
            ((x)this.instance).A8(any0);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((x)this.instance).j9();
            return this;
        }
    }

    public static final int CODE_FIELD_NUMBER = 1;
    private static final x DEFAULT_INSTANCE = null;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private int code_;
    private ProtobufList details_;
    private String message_;

    static {
        x x0 = new x();
        x.DEFAULT_INSTANCE = x0;
        GeneratedMessageLite.registerDefaultInstance(x.class, x0);
    }

    private x() {
        this.message_ = "";
        this.details_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A8(Any any0) {
        any0.getClass();
        this.Ja();
        this.details_.add(any0);
    }

    public static x Ab(ByteString byteString0) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, byteString0);
    }

    public static x Bb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static x Cb(CodedInputStream codedInputStream0) throws IOException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static x Db(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static x Eb(InputStream inputStream0) throws IOException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, inputStream0);
    }

    public static x Fb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static x Gb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static x Hb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static x Ib(byte[] arr_b) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, arr_b);
    }

    private void Ja() {
        ProtobufList internal$ProtobufList0 = this.details_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.details_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static x Jb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Kb(int v) {
        this.Ja();
        this.details_.remove(v);
    }

    public static x La() {
        return x.DEFAULT_INSTANCE;
    }

    private void Lb(int v) {
        this.code_ = v;
    }

    private void Mb(int v, Any any0) {
        any0.getClass();
        this.Ja();
        this.details_.set(v, any0);
    }

    @Override  // com.google.rpc.y
    public int O1() {
        return this.details_.size();
    }

    private void Z7(Iterable iterable0) {
        this.Ja();
        AbstractMessageLite.addAll(iterable0, this.details_);
    }

    @Override  // com.google.rpc.y
    public List ab() {
        return this.details_;
    }

    private void ca() {
        this.details_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMessage() {
        this.message_ = x.La().getMessage();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new x();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(x.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001B", new Object[]{"code_", "message_", "details_", Any.class});
            }
            case 4: {
                return x.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = x.PARSER;
                if(parser0 == null) {
                    Class class0 = x.class;
                    synchronized(class0) {
                        parser0 = x.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(x.DEFAULT_INSTANCE);
                            x.PARSER = parser0;
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

    @Override  // com.google.rpc.y
    public int getCode() {
        return this.code_;
    }

    @Override  // com.google.rpc.y
    public String getMessage() {
        return this.message_;
    }

    @Override  // com.google.rpc.y
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    private void j9() {
        this.code_ = 0;
    }

    public static Parser parser() {
        return x.DEFAULT_INSTANCE.getParserForType();
    }

    private void setMessage(String s) {
        s.getClass();
        this.message_ = s;
    }

    private void setMessageBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.message_ = byteString0.toStringUtf8();
    }

    public AnyOrBuilder ub(int v) {
        return (AnyOrBuilder)this.details_.get(v);
    }

    private void v8(int v, Any any0) {
        any0.getClass();
        this.Ja();
        this.details_.add(v, any0);
    }

    public List vb() {
        return this.details_;
    }

    public static b wb() {
        return (b)x.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.rpc.y
    public Any x2(int v) {
        return (Any)this.details_.get(v);
    }

    public static b xb(x x0) {
        return (b)x.DEFAULT_INSTANCE.createBuilder(x0);
    }

    public static x yb(InputStream inputStream0) throws IOException {
        return (x)GeneratedMessageLite.parseDelimitedFrom(x.DEFAULT_INSTANCE, inputStream0);
    }

    public static x zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (x)GeneratedMessageLite.parseDelimitedFrom(x.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

