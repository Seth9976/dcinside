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

public final class e0 extends GeneratedMessageLite implements f0 {
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

    public static final class b extends Builder implements f0 {
        private b() {
            super(e0.DEFAULT_INSTANCE);
        }

        b(a e0$a0) {
        }

        @Override  // com.google.api.f0
        public e0 A3(int v) {
            return ((e0)this.instance).A3(v);
        }

        public b Ab() {
            this.copyOnWrite();
            ((e0)this.instance).Ob();
            return this;
        }

        @Override  // com.google.api.f0
        public String B5() {
            return ((e0)this.instance).B5();
        }

        public b Bb() {
            this.copyOnWrite();
            ((e0)this.instance).Pb();
            return this;
        }

        @Override  // com.google.api.f0
        public ByteString C5() {
            return ((e0)this.instance).C5();
        }

        public b Cb() {
            this.copyOnWrite();
            ((e0)this.instance).Qb();
            return this;
        }

        @Override  // com.google.api.f0
        public String D1() {
            return ((e0)this.instance).D1();
        }

        public b Db() {
            this.copyOnWrite();
            ((e0)this.instance).Rb();
            return this;
        }

        @Override  // com.google.api.f0
        public int E1() {
            return ((e0)this.instance).E1();
        }

        public b Eb() {
            this.copyOnWrite();
            ((e0)this.instance).Sb();
            return this;
        }

        public b Fb() {
            this.copyOnWrite();
            ((e0)this.instance).Tb();
            return this;
        }

        public b Gb() {
            this.copyOnWrite();
            ((e0)this.instance).Ub();
            return this;
        }

        public b Hb() {
            this.copyOnWrite();
            ((e0)this.instance).Vb();
            return this;
        }

        public b Ib() {
            this.copyOnWrite();
            ((e0)this.instance).Wb();
            return this;
        }

        public b Jb() {
            this.copyOnWrite();
            ((e0)this.instance).Xb();
            return this;
        }

        public b Kb(I i0) {
            this.copyOnWrite();
            ((e0)this.instance).cc(i0);
            return this;
        }

        public b Lb(int v) {
            this.copyOnWrite();
            ((e0)this.instance).rc(v);
            return this;
        }

        public b Mb(int v, b e0$b0) {
            this.copyOnWrite();
            ((e0)this.instance).sc(v, ((e0)e0$b0.build()));
            return this;
        }

        public b Nb(int v, e0 e00) {
            this.copyOnWrite();
            ((e0)this.instance).sc(v, e00);
            return this;
        }

        public b Ob(String s) {
            this.copyOnWrite();
            ((e0)this.instance).tc(s);
            return this;
        }

        public b Pb(ByteString byteString0) {
            this.copyOnWrite();
            ((e0)this.instance).uc(byteString0);
            return this;
        }

        @Override  // com.google.api.f0
        public I Qa() {
            return ((e0)this.instance).Qa();
        }

        public b Qb(com.google.api.I.b i$b0) {
            this.copyOnWrite();
            ((e0)this.instance).vc(((I)i$b0.build()));
            return this;
        }

        public b Rb(I i0) {
            this.copyOnWrite();
            ((e0)this.instance).vc(i0);
            return this;
        }

        public b Sb(String s) {
            this.copyOnWrite();
            ((e0)this.instance).wc(s);
            return this;
        }

        public b Tb(ByteString byteString0) {
            this.copyOnWrite();
            ((e0)this.instance).xc(byteString0);
            return this;
        }

        @Override  // com.google.api.f0
        public ByteString U3() {
            return ((e0)this.instance).U3();
        }

        public b Ub(String s) {
            this.copyOnWrite();
            ((e0)this.instance).yc(s);
            return this;
        }

        public b Vb(ByteString byteString0) {
            this.copyOnWrite();
            ((e0)this.instance).zc(byteString0);
            return this;
        }

        public b Wb(String s) {
            this.copyOnWrite();
            ((e0)this.instance).Ac(s);
            return this;
        }

        public b Xb(ByteString byteString0) {
            this.copyOnWrite();
            ((e0)this.instance).Bc(byteString0);
            return this;
        }

        public b Yb(String s) {
            this.copyOnWrite();
            ((e0)this.instance).Cc(s);
            return this;
        }

        public b Zb(ByteString byteString0) {
            this.copyOnWrite();
            ((e0)this.instance).Dc(byteString0);
            return this;
        }

        @Override  // com.google.api.f0
        public String a4() {
            return ((e0)this.instance).a4();
        }

        @Override  // com.google.api.f0
        public c aa() {
            return ((e0)this.instance).aa();
        }

        public b ac(String s) {
            this.copyOnWrite();
            ((e0)this.instance).Ec(s);
            return this;
        }

        @Override  // com.google.api.f0
        public String b() {
            return ((e0)this.instance).b();
        }

        public b bc(ByteString byteString0) {
            this.copyOnWrite();
            ((e0)this.instance).Fc(byteString0);
            return this;
        }

        @Override  // com.google.api.f0
        public ByteString c() {
            return ((e0)this.instance).c();
        }

        public b cc(String s) {
            this.copyOnWrite();
            ((e0)this.instance).Gc(s);
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.api.f0
        public String d3() {
            return "";
        }

        @Override  // com.google.api.f0
        public ByteString da() {
            return ((e0)this.instance).da();
        }

        public b dc(ByteString byteString0) {
            this.copyOnWrite();
            ((e0)this.instance).Hc(byteString0);
            return this;
        }

        public b ec(String s) {
            this.copyOnWrite();
            ((e0)this.instance).Ic(s);
            return this;
        }

        @Override  // com.google.api.f0
        public boolean f2() {
            return ((e0)this.instance).f2();
        }

        public b fc(ByteString byteString0) {
            this.copyOnWrite();
            ((e0)this.instance).Jc(byteString0);
            return this;
        }

        @Override  // com.google.api.f0
        public List g9() {
            return DesugarCollections.unmodifiableList(((e0)this.instance).g9());
        }

        @Override  // com.google.api.f0
        public String h1() {
            return ((e0)this.instance).h1();
        }

        @Override  // com.google.api.f0
        public String n7() {
            return ((e0)this.instance).n7();
        }

        @Override  // com.google.api.f0
        public ByteString qa() {
            return ((e0)this.instance).qa();
        }

        @Override  // com.google.api.f0
        public ByteString sb() {
            return ((e0)this.instance).sb();
        }

        public b ub(int v, b e0$b0) {
            this.copyOnWrite();
            ((e0)this.instance).Kb(v, ((e0)e0$b0.build()));
            return this;
        }

        @Override  // com.google.api.f0
        public ByteString v4() {
            return ((e0)this.instance).v4();
        }

        public b vb(int v, e0 e00) {
            this.copyOnWrite();
            ((e0)this.instance).Kb(v, e00);
            return this;
        }

        @Override  // com.google.api.f0
        public String wa() {
            return ((e0)this.instance).wa();
        }

        public b wb(b e0$b0) {
            this.copyOnWrite();
            ((e0)this.instance).Lb(((e0)e0$b0.build()));
            return this;
        }

        public b xb(e0 e00) {
            this.copyOnWrite();
            ((e0)this.instance).Lb(e00);
            return this;
        }

        public b yb(Iterable iterable0) {
            this.copyOnWrite();
            ((e0)this.instance).Mb(iterable0);
            return this;
        }

        @Override  // com.google.api.f0
        public ByteString z8() {
            return ((e0)this.instance).z8();
        }

        public b zb() {
            this.copyOnWrite();
            ((e0)this.instance).Nb();
            return this;
        }
    }

    public static enum c {
        GET(2),
        PUT(3),
        POST(4),
        DELETE(5),
        PATCH(6),
        CUSTOM(8),
        PATTERN_NOT_SET(0);

        private final int a;

        private c(int v1) {
            this.a = v1;
        }

        public static c a(int v) {
            switch(v) {
                case 0: {
                    return c.h;
                }
                case 2: {
                    return c.b;
                }
                case 3: {
                    return c.c;
                }
                case 4: {
                    return c.d;
                }
                case 5: {
                    return c.e;
                }
                case 6: {
                    return c.f;
                }
                case 8: {
                    return c.g;
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

    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final e0 DEFAULT_INSTANCE = null;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private ProtobufList additionalBindings_;
    private String body_;
    private int patternCase_;
    private Object pattern_;
    private String responseBody_;
    private String selector_;

    static {
        e0 e00 = new e0();
        e0.DEFAULT_INSTANCE = e00;
        GeneratedMessageLite.registerDefaultInstance(e0.class, e00);
    }

    private e0() {
        this.patternCase_ = 0;
        this.selector_ = "";
        this.body_ = "";
        this.responseBody_ = "";
        this.additionalBindings_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.api.f0
    public e0 A3(int v) {
        return (e0)this.additionalBindings_.get(v);
    }

    private void Ac(String s) {
        s.getClass();
        this.patternCase_ = 6;
        this.pattern_ = s;
    }

    @Override  // com.google.api.f0
    public String B5() {
        return this.responseBody_;
    }

    private void Bc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.pattern_ = byteString0.toStringUtf8();
        this.patternCase_ = 6;
    }

    @Override  // com.google.api.f0
    public ByteString C5() {
        return this.patternCase_ == 2 ? ByteString.copyFromUtf8(((String)this.pattern_)) : ByteString.copyFromUtf8("");
    }

    private void Cc(String s) {
        s.getClass();
        this.patternCase_ = 4;
        this.pattern_ = s;
    }

    @Override  // com.google.api.f0
    public String D1() {
        return this.patternCase_ == 5 ? ((String)this.pattern_) : "";
    }

    private void Dc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.pattern_ = byteString0.toStringUtf8();
        this.patternCase_ = 4;
    }

    @Override  // com.google.api.f0
    public int E1() {
        return this.additionalBindings_.size();
    }

    private void Ec(String s) {
        s.getClass();
        this.patternCase_ = 3;
        this.pattern_ = s;
    }

    private void Fc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.pattern_ = byteString0.toStringUtf8();
        this.patternCase_ = 3;
    }

    private void Gc(String s) {
        s.getClass();
        this.responseBody_ = s;
    }

    private void Hc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.responseBody_ = byteString0.toStringUtf8();
    }

    private void Ic(String s) {
        s.getClass();
        this.selector_ = s;
    }

    private void Jc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.selector_ = byteString0.toStringUtf8();
    }

    private void Kb(int v, e0 e00) {
        e00.getClass();
        this.Yb();
        this.additionalBindings_.add(v, e00);
    }

    private void Lb(e0 e00) {
        e00.getClass();
        this.Yb();
        this.additionalBindings_.add(e00);
    }

    private void Mb(Iterable iterable0) {
        this.Yb();
        AbstractMessageLite.addAll(iterable0, this.additionalBindings_);
    }

    private void Nb() {
        this.additionalBindings_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Ob() {
        this.body_ = e0.bc().wa();
    }

    private void Pb() {
        if(this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    @Override  // com.google.api.f0
    public I Qa() {
        return this.patternCase_ == 8 ? ((I)this.pattern_) : I.d6();
    }

    private void Qb() {
        if(this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void Rb() {
        if(this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void Sb() {
        if(this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void Tb() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    @Override  // com.google.api.f0
    public ByteString U3() {
        return ByteString.copyFromUtf8(this.responseBody_);
    }

    private void Ub() {
        if(this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void Vb() {
        if(this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void Wb() {
        this.responseBody_ = e0.bc().B5();
    }

    private void Xb() {
        this.selector_ = e0.bc().b();
    }

    private void Yb() {
        ProtobufList internal$ProtobufList0 = this.additionalBindings_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.additionalBindings_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public f0 Zb(int v) {
        return (f0)this.additionalBindings_.get(v);
    }

    @Override  // com.google.api.f0
    public String a4() {
        return this.patternCase_ == 2 ? ((String)this.pattern_) : "";
    }

    @Override  // com.google.api.f0
    public c aa() {
        return c.a(this.patternCase_);
    }

    public List ac() {
        return this.additionalBindings_;
    }

    @Override  // com.google.api.f0
    public String b() {
        return this.selector_;
    }

    public static e0 bc() {
        return e0.DEFAULT_INSTANCE;
    }

    @Override  // com.google.api.f0
    public ByteString c() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    private void cc(I i0) {
        i0.getClass();
        this.pattern_ = this.patternCase_ != 8 || this.pattern_ == I.d6() ? i0 : ((com.google.api.I.b)I.A6(((I)this.pattern_)).mergeFrom(i0)).buildPartial();
        this.patternCase_ = 8;
    }

    @Override  // com.google.api.f0
    public String d3() [...] // 潜在的解密器

    @Override  // com.google.api.f0
    public ByteString da() {
        return this.patternCase_ == 4 ? ByteString.copyFromUtf8(((String)this.pattern_)) : ByteString.copyFromUtf8("");
    }

    public static b dc() {
        return (b)e0.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new e0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(e0.DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȉ\b<\u0000\u000B\u001B\fȈ", new Object[]{"pattern_", "patternCase_", "selector_", "body_", I.class, "additionalBindings_", e0.class, "responseBody_"});
            }
            case 4: {
                return e0.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = e0.PARSER;
                if(parser0 == null) {
                    Class class0 = e0.class;
                    synchronized(class0) {
                        parser0 = e0.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(e0.DEFAULT_INSTANCE);
                            e0.PARSER = parser0;
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

    public static b ec(e0 e00) {
        return (b)e0.DEFAULT_INSTANCE.createBuilder(e00);
    }

    @Override  // com.google.api.f0
    public boolean f2() {
        return this.patternCase_ == 8;
    }

    public static e0 fc(InputStream inputStream0) throws IOException {
        return (e0)GeneratedMessageLite.parseDelimitedFrom(e0.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.api.f0
    public List g9() {
        return this.additionalBindings_;
    }

    public static e0 gc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e0)GeneratedMessageLite.parseDelimitedFrom(e0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.api.f0
    public String h1() {
        return this.patternCase_ == 6 ? ((String)this.pattern_) : "";
    }

    public static e0 hc(ByteString byteString0) throws InvalidProtocolBufferException {
        return (e0)GeneratedMessageLite.parseFrom(e0.DEFAULT_INSTANCE, byteString0);
    }

    public static e0 ic(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e0)GeneratedMessageLite.parseFrom(e0.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static e0 jc(CodedInputStream codedInputStream0) throws IOException {
        return (e0)GeneratedMessageLite.parseFrom(e0.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static e0 kc(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e0)GeneratedMessageLite.parseFrom(e0.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static e0 lc(InputStream inputStream0) throws IOException {
        return (e0)GeneratedMessageLite.parseFrom(e0.DEFAULT_INSTANCE, inputStream0);
    }

    public static e0 mc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e0)GeneratedMessageLite.parseFrom(e0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.api.f0
    public String n7() {
        return this.patternCase_ == 3 ? ((String)this.pattern_) : "";
    }

    public static e0 nc(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (e0)GeneratedMessageLite.parseFrom(e0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static e0 oc(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e0)GeneratedMessageLite.parseFrom(e0.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return e0.DEFAULT_INSTANCE.getParserForType();
    }

    public static e0 pc(byte[] arr_b) throws InvalidProtocolBufferException {
        return (e0)GeneratedMessageLite.parseFrom(e0.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.api.f0
    public ByteString qa() {
        return this.patternCase_ == 5 ? ByteString.copyFromUtf8(((String)this.pattern_)) : ByteString.copyFromUtf8("");
    }

    public static e0 qc(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e0)GeneratedMessageLite.parseFrom(e0.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void rc(int v) {
        this.Yb();
        this.additionalBindings_.remove(v);
    }

    @Override  // com.google.api.f0
    public ByteString sb() {
        return this.patternCase_ == 3 ? ByteString.copyFromUtf8(((String)this.pattern_)) : ByteString.copyFromUtf8("");
    }

    private void sc(int v, e0 e00) {
        e00.getClass();
        this.Yb();
        this.additionalBindings_.set(v, e00);
    }

    private void tc(String s) {
        s.getClass();
        this.body_ = s;
    }

    private void uc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.body_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.f0
    public ByteString v4() {
        return ByteString.copyFromUtf8(this.body_);
    }

    private void vc(I i0) {
        i0.getClass();
        this.pattern_ = i0;
        this.patternCase_ = 8;
    }

    @Override  // com.google.api.f0
    public String wa() {
        return this.body_;
    }

    private void wc(String s) {
        s.getClass();
        this.patternCase_ = 5;
        this.pattern_ = s;
    }

    private void xc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.pattern_ = byteString0.toStringUtf8();
        this.patternCase_ = 5;
    }

    private void yc(String s) {
        s.getClass();
        this.patternCase_ = 2;
        this.pattern_ = s;
    }

    @Override  // com.google.api.f0
    public ByteString z8() {
        return this.patternCase_ == 6 ? ByteString.copyFromUtf8(((String)this.pattern_)) : ByteString.copyFromUtf8("");
    }

    private void zc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.pattern_ = byteString0.toStringUtf8();
        this.patternCase_ = 2;
    }
}

