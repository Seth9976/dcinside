package com.google.longrunning;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.rpc.x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class k extends GeneratedMessageLite implements n {
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

    public static final class b extends Builder implements n {
        private b() {
            super(k.DEFAULT_INSTANCE);
        }

        b(a k$a0) {
        }

        public b Ab(x x0) {
            this.copyOnWrite();
            ((k)this.instance).wb(x0);
            return this;
        }

        public b Bb(Any any0) {
            this.copyOnWrite();
            ((k)this.instance).xb(any0);
            return this;
        }

        public b Cb(Any any0) {
            this.copyOnWrite();
            ((k)this.instance).yb(any0);
            return this;
        }

        public b Db(boolean z) {
            this.copyOnWrite();
            ((k)this.instance).Nb(z);
            return this;
        }

        @Override  // com.google.longrunning.n
        public boolean E() {
            return ((k)this.instance).E();
        }

        public b Eb(com.google.rpc.x.b x$b0) {
            this.copyOnWrite();
            ((k)this.instance).Ob(((x)x$b0.build()));
            return this;
        }

        @Override  // com.google.longrunning.n
        public Any F() {
            return ((k)this.instance).F();
        }

        public b Fb(x x0) {
            this.copyOnWrite();
            ((k)this.instance).Ob(x0);
            return this;
        }

        public b Gb(com.google.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            ((k)this.instance).Pb(((Any)any$Builder0.build()));
            return this;
        }

        public b Hb(Any any0) {
            this.copyOnWrite();
            ((k)this.instance).Pb(any0);
            return this;
        }

        public b Ib(String s) {
            this.copyOnWrite();
            ((k)this.instance).setName(s);
            return this;
        }

        public b Jb(ByteString byteString0) {
            this.copyOnWrite();
            ((k)this.instance).setNameBytes(byteString0);
            return this;
        }

        public b Kb(com.google.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            ((k)this.instance).Qb(((Any)any$Builder0.build()));
            return this;
        }

        public b Lb(Any any0) {
            this.copyOnWrite();
            ((k)this.instance).Qb(any0);
            return this;
        }

        @Override  // com.google.longrunning.n
        public boolean R0() {
            return ((k)this.instance).R0();
        }

        @Override  // com.google.longrunning.n
        public c X8() {
            return ((k)this.instance).X8();
        }

        @Override  // com.google.longrunning.n
        public boolean X9() {
            return ((k)this.instance).X9();
        }

        @Override  // com.google.longrunning.n
        public x getError() {
            return ((k)this.instance).getError();
        }

        @Override  // com.google.longrunning.n
        public Any getMetadata() {
            return ((k)this.instance).getMetadata();
        }

        @Override  // com.google.longrunning.n
        public String getName() {
            return ((k)this.instance).getName();
        }

        @Override  // com.google.longrunning.n
        public ByteString getNameBytes() {
            return ((k)this.instance).getNameBytes();
        }

        @Override  // com.google.longrunning.n
        public boolean hasError() {
            return ((k)this.instance).hasError();
        }

        public b ub() {
            this.copyOnWrite();
            ((k)this.instance).ca();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((k)this.instance).clearError();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((k)this.instance).Ja();
            return this;
        }

        public b xb() {
            this.copyOnWrite();
            ((k)this.instance).clearName();
            return this;
        }

        public b yb() {
            this.copyOnWrite();
            ((k)this.instance).La();
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((k)this.instance).ub();
            return this;
        }
    }

    public static enum c {
        ERROR(4),
        RESPONSE(5),
        RESULT_NOT_SET(0);

        private final int a;

        private c(int v1) {
            this.a = v1;
        }

        public static c a(int v) {
            switch(v) {
                case 0: {
                    return c.d;
                }
                case 4: {
                    return c.b;
                }
                case 5: {
                    return c.c;
                }
                default: {
                    return null;
                }
            }
        }

        @Deprecated
        public static c b(int v) {
            return c.a(v);
        }

        public int getNumber() {
            return this.a;
        }
    }

    private static final k DEFAULT_INSTANCE = null;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private Any metadata_;
    private String name_;
    private int resultCase_;
    private Object result_;

    static {
        k k0 = new k();
        k.DEFAULT_INSTANCE = k0;
        GeneratedMessageLite.registerDefaultInstance(k.class, k0);
    }

    private k() {
        this.resultCase_ = 0;
        this.name_ = "";
    }

    public static b Ab(k k0) {
        return (b)k.DEFAULT_INSTANCE.createBuilder(k0);
    }

    public static k Bb(InputStream inputStream0) throws IOException {
        return (k)GeneratedMessageLite.parseDelimitedFrom(k.DEFAULT_INSTANCE, inputStream0);
    }

    public static k Cb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (k)GeneratedMessageLite.parseDelimitedFrom(k.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static k Db(ByteString byteString0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.longrunning.n
    public boolean E() {
        return this.resultCase_ == 5;
    }

    public static k Eb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // com.google.longrunning.n
    public Any F() {
        return this.resultCase_ == 5 ? ((Any)this.result_) : Any.getDefaultInstance();
    }

    public static k Fb(CodedInputStream codedInputStream0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static k Gb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static k Hb(InputStream inputStream0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, inputStream0);
    }

    public static k Ib(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void Ja() {
        this.metadata_ = null;
    }

    public static k Jb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static k Kb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    private void La() {
        if(this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    public static k Lb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, arr_b);
    }

    public static k Mb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Nb(boolean z) {
        this.done_ = z;
    }

    private void Ob(x x0) {
        x0.getClass();
        this.result_ = x0;
        this.resultCase_ = 4;
    }

    private void Pb(Any any0) {
        any0.getClass();
        this.metadata_ = any0;
    }

    private void Qb(Any any0) {
        any0.getClass();
        this.result_ = any0;
        this.resultCase_ = 5;
    }

    @Override  // com.google.longrunning.n
    public boolean R0() {
        return this.metadata_ != null;
    }

    @Override  // com.google.longrunning.n
    public c X8() {
        return c.a(this.resultCase_);
    }

    @Override  // com.google.longrunning.n
    public boolean X9() {
        return this.done_;
    }

    private void ca() {
        this.done_ = false;
    }

    private void clearError() {
        if(this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearName() {
        this.name_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new k();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(k.DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0007\u0004<\u0000\u0005<\u0000", new Object[]{"result_", "resultCase_", "name_", "metadata_", "done_", x.class, Any.class});
            }
            case 4: {
                return k.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = k.PARSER;
                if(parser0 == null) {
                    Class class0 = k.class;
                    synchronized(class0) {
                        parser0 = k.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(k.DEFAULT_INSTANCE);
                            k.PARSER = parser0;
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

    @Override  // com.google.longrunning.n
    public x getError() {
        return this.resultCase_ == 4 ? ((x)this.result_) : x.La();
    }

    @Override  // com.google.longrunning.n
    public Any getMetadata() {
        return this.metadata_ == null ? Any.getDefaultInstance() : this.metadata_;
    }

    @Override  // com.google.longrunning.n
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.longrunning.n
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // com.google.longrunning.n
    public boolean hasError() {
        return this.resultCase_ == 4;
    }

    public static Parser parser() {
        return k.DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.name_ = byteString0.toStringUtf8();
    }

    private void ub() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    public static k vb() {
        return k.DEFAULT_INSTANCE;
    }

    private void wb(x x0) {
        x0.getClass();
        this.result_ = this.resultCase_ != 4 || this.result_ == x.La() ? x0 : ((com.google.rpc.x.b)x.xb(((x)this.result_)).mergeFrom(x0)).buildPartial();
        this.resultCase_ = 4;
    }

    private void xb(Any any0) {
        any0.getClass();
        if(this.metadata_ != null && this.metadata_ != Any.getDefaultInstance()) {
            this.metadata_ = (Any)((com.google.protobuf.Any.Builder)Any.newBuilder(this.metadata_).mergeFrom(any0)).buildPartial();
            return;
        }
        this.metadata_ = any0;
    }

    private void yb(Any any0) {
        any0.getClass();
        this.result_ = this.resultCase_ != 5 || this.result_ == Any.getDefaultInstance() ? any0 : ((com.google.protobuf.Any.Builder)Any.newBuilder(((Any)this.result_)).mergeFrom(any0)).buildPartial();
        this.resultCase_ = 5;
    }

    public static b zb() {
        return (b)k.DEFAULT_INSTANCE.createBuilder();
    }
}

