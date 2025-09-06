package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.IntList;
import com.google.protobuf.Internal.ListAdapter.Converter;
import com.google.protobuf.Internal.ListAdapter;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class u extends GeneratedMessageLite implements v {
    class a implements Converter {
        a() {
            super();
        }

        public w a(Integer integer0) {
            w w0 = w.b(((int)integer0));
            return w0 == null ? w.b : w0;
        }

        @Override  // com.google.protobuf.Internal$ListAdapter$Converter
        public Object convert(Object object0) {
            return this.a(((Integer)object0));
        }
    }

    static class b {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            b.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class c extends Builder implements v {
        private c() {
            super(u.DEFAULT_INSTANCE);
        }

        c(a u$a0) {
        }

        public c Ab(int v, w w0) {
            this.copyOnWrite();
            ((u)this.instance).Cb(v, w0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.v
        public List G8() {
            return ((u)this.instance).G8();
        }

        @Override  // com.google.firebase.perf.v1.v
        public w Ha(int v) {
            return ((u)this.instance).Ha(v);
        }

        @Override  // com.google.firebase.perf.v1.v
        public String getSessionId() {
            return ((u)this.instance).getSessionId();
        }

        @Override  // com.google.firebase.perf.v1.v
        public ByteString getSessionIdBytes() {
            return ((u)this.instance).getSessionIdBytes();
        }

        @Override  // com.google.firebase.perf.v1.v
        public boolean hasSessionId() {
            return ((u)this.instance).hasSessionId();
        }

        @Override  // com.google.firebase.perf.v1.v
        public int ra() {
            return ((u)this.instance).ra();
        }

        public c ub(Iterable iterable0) {
            this.copyOnWrite();
            ((u)this.instance).z6(iterable0);
            return this;
        }

        public c vb(w w0) {
            this.copyOnWrite();
            ((u)this.instance).A6(w0);
            return this;
        }

        public c wb() {
            this.copyOnWrite();
            ((u)this.instance).clearSessionId();
            return this;
        }

        public c xb() {
            this.copyOnWrite();
            ((u)this.instance).B6();
            return this;
        }

        public c yb(String s) {
            this.copyOnWrite();
            ((u)this.instance).setSessionId(s);
            return this;
        }

        public c zb(ByteString byteString0) {
            this.copyOnWrite();
            ((u)this.instance).setSessionIdBytes(byteString0);
            return this;
        }
    }

    private static final u DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private int bitField0_;
    private String sessionId_;
    private IntList sessionVerbosity_;
    private static final Converter sessionVerbosity_converter_;

    static {
        u.sessionVerbosity_converter_ = new a();
        u u0 = new u();
        u.DEFAULT_INSTANCE = u0;
        GeneratedMessageLite.registerDefaultInstance(u.class, u0);
    }

    private u() {
        this.sessionId_ = "";
        this.sessionVerbosity_ = GeneratedMessageLite.emptyIntList();
    }

    private void A6(w w0) {
        w0.getClass();
        this.M6();
        this.sessionVerbosity_.addInt(w0.getNumber());
    }

    public static c A8(u u0) {
        return (c)u.DEFAULT_INSTANCE.createBuilder(u0);
    }

    public static u Ab(byte[] arr_b) throws InvalidProtocolBufferException {
        return (u)GeneratedMessageLite.parseFrom(u.DEFAULT_INSTANCE, arr_b);
    }

    private void B6() {
        this.sessionVerbosity_ = GeneratedMessageLite.emptyIntList();
    }

    public static u Bb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (u)GeneratedMessageLite.parseFrom(u.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Cb(int v, w w0) {
        w0.getClass();
        this.M6();
        this.sessionVerbosity_.setInt(v, w0.getNumber());
    }

    @Override  // com.google.firebase.perf.v1.v
    public List G8() {
        return new ListAdapter(this.sessionVerbosity_, u.sessionVerbosity_converter_);
    }

    @Override  // com.google.firebase.perf.v1.v
    public w Ha(int v) {
        w w0 = w.b(this.sessionVerbosity_.getInt(v));
        return w0 == null ? w.b : w0;
    }

    public static u Ja(ByteString byteString0) throws InvalidProtocolBufferException {
        return (u)GeneratedMessageLite.parseFrom(u.DEFAULT_INSTANCE, byteString0);
    }

    public static u La(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (u)GeneratedMessageLite.parseFrom(u.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void M6() {
        IntList internal$IntList0 = this.sessionVerbosity_;
        if(!internal$IntList0.isModifiable()) {
            this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(internal$IntList0);
        }
    }

    public static u Z7() {
        return u.DEFAULT_INSTANCE;
    }

    public static u ca(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (u)GeneratedMessageLite.parseDelimitedFrom(u.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new u();
            }
            case 2: {
                return new c(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(u.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001E", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", w.d()});
            }
            case 4: {
                return u.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = u.PARSER;
                if(parser0 == null) {
                    Class class0 = u.class;
                    synchronized(class0) {
                        parser0 = u.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(u.DEFAULT_INSTANCE);
                            u.PARSER = parser0;
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

    @Override  // com.google.firebase.perf.v1.v
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override  // com.google.firebase.perf.v1.v
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override  // com.google.firebase.perf.v1.v
    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static u j9(InputStream inputStream0) throws IOException {
        return (u)GeneratedMessageLite.parseDelimitedFrom(u.DEFAULT_INSTANCE, inputStream0);
    }

    public static Parser parser() {
        return u.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.firebase.perf.v1.v
    public int ra() {
        return this.sessionVerbosity_.size();
    }

    private void setSessionId(String s) {
        s.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = s;
    }

    private void setSessionIdBytes(ByteString byteString0) {
        this.sessionId_ = byteString0.toStringUtf8();
        this.bitField0_ |= 1;
    }

    public static u ub(CodedInputStream codedInputStream0) throws IOException {
        return (u)GeneratedMessageLite.parseFrom(u.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static c v8() {
        return (c)u.DEFAULT_INSTANCE.createBuilder();
    }

    public static u vb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (u)GeneratedMessageLite.parseFrom(u.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static u wb(InputStream inputStream0) throws IOException {
        return (u)GeneratedMessageLite.parseFrom(u.DEFAULT_INSTANCE, inputStream0);
    }

    public static u xb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (u)GeneratedMessageLite.parseFrom(u.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static u yb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (u)GeneratedMessageLite.parseFrom(u.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void z6(Iterable iterable0) {
        this.M6();
        for(Object object0: iterable0) {
            this.sessionVerbosity_.addInt(((w)object0).getNumber());
        }
    }

    public static u zb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (u)GeneratedMessageLite.parseFrom(u.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }
}

