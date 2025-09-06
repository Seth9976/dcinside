package com.google.api;

import com.google.protobuf.AbstractMessageLite;
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

public final class w extends GeneratedMessageLite implements x {
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

    public static final class b extends Builder implements x {
        private b() {
            super(w.DEFAULT_INSTANCE);
        }

        b(a w$a0) {
        }

        public b Ab() {
            this.copyOnWrite();
            ((w)this.instance).yb();
            return this;
        }

        @Override  // com.google.api.x
        public int B1() {
            return ((w)this.instance).B1();
        }

        public b Bb() {
            this.copyOnWrite();
            ((w)this.instance).zb();
            return this;
        }

        public b Cb() {
            this.copyOnWrite();
            ((w)this.instance).Ab();
            return this;
        }

        public b Db() {
            this.copyOnWrite();
            ((w)this.instance).Bb();
            return this;
        }

        @Override  // com.google.api.x
        public String E8() {
            return ((w)this.instance).E8();
        }

        public b Eb(int v) {
            this.copyOnWrite();
            ((w)this.instance).Ub(v);
            return this;
        }

        @Override  // com.google.api.x
        public ByteString F6() {
            return ((w)this.instance).F6();
        }

        public b Fb(int v, com.google.api.a.b a$b0) {
            this.copyOnWrite();
            ((w)this.instance).Vb(v, ((com.google.api.a)a$b0.build()));
            return this;
        }

        public b Gb(int v, com.google.api.a a0) {
            this.copyOnWrite();
            ((w)this.instance).Vb(v, a0);
            return this;
        }

        public b Hb(u u0) {
            this.copyOnWrite();
            ((w)this.instance).Wb(u0);
            return this;
        }

        public b Ib(int v) {
            this.copyOnWrite();
            ((w)this.instance).Xb(v);
            return this;
        }

        public b Jb(String s) {
            this.copyOnWrite();
            ((w)this.instance).Yb(s);
            return this;
        }

        public b Kb(ByteString byteString0) {
            this.copyOnWrite();
            ((w)this.instance).Zb(byteString0);
            return this;
        }

        public b Lb(String s) {
            this.copyOnWrite();
            ((w)this.instance).ac(s);
            return this;
        }

        public b Mb(ByteString byteString0) {
            this.copyOnWrite();
            ((w)this.instance).bc(byteString0);
            return this;
        }

        public b Nb(String s) {
            this.copyOnWrite();
            ((w)this.instance).cc(s);
            return this;
        }

        public b Ob(ByteString byteString0) {
            this.copyOnWrite();
            ((w)this.instance).dc(byteString0);
            return this;
        }

        @Override  // com.google.api.x
        public u P3() {
            return ((w)this.instance).P3();
        }

        @Override  // com.google.api.x
        public int T7() {
            return ((w)this.instance).T7();
        }

        @Override  // com.google.api.x
        public ByteString Z3() {
            return ((w)this.instance).Z3();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.api.x
        public String b0() {
            return "";
        }

        @Override  // com.google.api.x
        public com.google.api.a h5(int v) {
            return ((w)this.instance).h5(v);
        }

        @Override  // com.google.api.x
        public ByteString l2() {
            return ((w)this.instance).l2();
        }

        @Override  // com.google.api.x
        public List r7() {
            return DesugarCollections.unmodifiableList(((w)this.instance).r7());
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.api.x
        public String t7() {
            return "";
        }

        public b ub(int v, com.google.api.a.b a$b0) {
            this.copyOnWrite();
            ((w)this.instance).ub(v, ((com.google.api.a)a$b0.build()));
            return this;
        }

        public b vb(int v, com.google.api.a a0) {
            this.copyOnWrite();
            ((w)this.instance).ub(v, a0);
            return this;
        }

        public b wb(com.google.api.a.b a$b0) {
            this.copyOnWrite();
            ((w)this.instance).vb(((com.google.api.a)a$b0.build()));
            return this;
        }

        public b xb(com.google.api.a a0) {
            this.copyOnWrite();
            ((w)this.instance).vb(a0);
            return this;
        }

        public b yb(Iterable iterable0) {
            this.copyOnWrite();
            ((w)this.instance).wb(iterable0);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((w)this.instance).xb();
            return this;
        }
    }

    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final w DEFAULT_INSTANCE = null;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private ProtobufList advices_;
    private int changeType_;
    private String element_;
    private String newValue_;
    private String oldValue_;

    static {
        w w0 = new w();
        w.DEFAULT_INSTANCE = w0;
        GeneratedMessageLite.registerDefaultInstance(w.class, w0);
    }

    private w() {
        this.element_ = "";
        this.oldValue_ = "";
        this.newValue_ = "";
        this.advices_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Ab() {
        this.newValue_ = "";
    }

    @Override  // com.google.api.x
    public int B1() {
        return this.advices_.size();
    }

    private void Bb() {
        this.oldValue_ = "";
    }

    private void Cb() {
        ProtobufList internal$ProtobufList0 = this.advices_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.advices_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public com.google.api.b Db(int v) {
        return (com.google.api.b)this.advices_.get(v);
    }

    @Override  // com.google.api.x
    public String E8() {
        return this.newValue_;
    }

    public List Eb() {
        return this.advices_;
    }

    @Override  // com.google.api.x
    public ByteString F6() {
        return ByteString.copyFromUtf8(this.newValue_);
    }

    public static w Fb() {
        return w.DEFAULT_INSTANCE;
    }

    public static b Gb() {
        return (b)w.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Hb(w w0) {
        return (b)w.DEFAULT_INSTANCE.createBuilder(w0);
    }

    public static w Ib(InputStream inputStream0) throws IOException {
        return (w)GeneratedMessageLite.parseDelimitedFrom(w.DEFAULT_INSTANCE, inputStream0);
    }

    public static w Jb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (w)GeneratedMessageLite.parseDelimitedFrom(w.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static w Kb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, byteString0);
    }

    public static w Lb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static w Mb(CodedInputStream codedInputStream0) throws IOException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static w Nb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static w Ob(InputStream inputStream0) throws IOException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.api.x
    public u P3() {
        u u0 = u.a(this.changeType_);
        return u0 == null ? u.f : u0;
    }

    public static w Pb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static w Qb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static w Rb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static w Sb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.api.x
    public int T7() {
        return this.changeType_;
    }

    public static w Tb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Ub(int v) {
        this.Cb();
        this.advices_.remove(v);
    }

    private void Vb(int v, com.google.api.a a0) {
        a0.getClass();
        this.Cb();
        this.advices_.set(v, a0);
    }

    private void Wb(u u0) {
        this.changeType_ = u0.getNumber();
    }

    private void Xb(int v) {
        this.changeType_ = v;
    }

    private void Yb(String s) {
        s.getClass();
        this.element_ = s;
    }

    @Override  // com.google.api.x
    public ByteString Z3() {
        return ByteString.copyFromUtf8(this.oldValue_);
    }

    private void Zb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.element_ = byteString0.toStringUtf8();
    }

    private void ac(String s) {
        s.getClass();
        this.newValue_ = s;
    }

    @Override  // com.google.api.x
    public String b0() [...] // 潜在的解密器

    private void bc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.newValue_ = byteString0.toStringUtf8();
    }

    private void cc(String s) {
        s.getClass();
        this.oldValue_ = s;
    }

    private void dc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.oldValue_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new w();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(w.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001B", new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", com.google.api.a.class});
            }
            case 4: {
                return w.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = w.PARSER;
                if(parser0 == null) {
                    Class class0 = w.class;
                    synchronized(class0) {
                        parser0 = w.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(w.DEFAULT_INSTANCE);
                            w.PARSER = parser0;
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

    @Override  // com.google.api.x
    public com.google.api.a h5(int v) {
        return (com.google.api.a)this.advices_.get(v);
    }

    @Override  // com.google.api.x
    public ByteString l2() {
        return ByteString.copyFromUtf8(this.element_);
    }

    public static Parser parser() {
        return w.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.api.x
    public List r7() {
        return this.advices_;
    }

    @Override  // com.google.api.x
    public String t7() [...] // 潜在的解密器

    private void ub(int v, com.google.api.a a0) {
        a0.getClass();
        this.Cb();
        this.advices_.add(v, a0);
    }

    private void vb(com.google.api.a a0) {
        a0.getClass();
        this.Cb();
        this.advices_.add(a0);
    }

    private void wb(Iterable iterable0) {
        this.Cb();
        AbstractMessageLite.addAll(iterable0, this.advices_);
    }

    private void xb() {
        this.advices_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void yb() {
        this.changeType_ = 0;
    }

    private void zb() {
        this.element_ = w.Fb().b0();
    }
}

