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

public final class e extends GeneratedMessageLite implements f {
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

    public static final class b extends Builder implements f {
        private b() {
            super(e.DEFAULT_INSTANCE);
        }

        b(a e$a0) {
        }

        public b Ab() {
            this.copyOnWrite();
            ((e)this.instance).Bb();
            return this;
        }

        public b Bb() {
            this.copyOnWrite();
            ((e)this.instance).Cb();
            return this;
        }

        public b Cb() {
            this.copyOnWrite();
            ((e)this.instance).Db();
            return this;
        }

        public b Db() {
            this.copyOnWrite();
            ((e)this.instance).Eb();
            return this;
        }

        @Override  // com.google.api.f
        public ByteString E0() {
            return ((e)this.instance).E0();
        }

        public b Eb() {
            this.copyOnWrite();
            ((e)this.instance).Fb();
            return this;
        }

        public b Fb(int v) {
            this.copyOnWrite();
            ((e)this.instance).Yb(v);
            return this;
        }

        public b Gb(String s) {
            this.copyOnWrite();
            ((e)this.instance).Zb(s);
            return this;
        }

        @Override  // com.google.api.f
        public List H7() {
            return DesugarCollections.unmodifiableList(((e)this.instance).H7());
        }

        public b Hb(ByteString byteString0) {
            this.copyOnWrite();
            ((e)this.instance).ac(byteString0);
            return this;
        }

        @Override  // com.google.api.f
        public String I2() {
            return ((e)this.instance).I2();
        }

        public b Ib(String s) {
            this.copyOnWrite();
            ((e)this.instance).bc(s);
            return this;
        }

        @Override  // com.google.api.f
        public ByteString J7() {
            return ((e)this.instance).J7();
        }

        public b Jb(ByteString byteString0) {
            this.copyOnWrite();
            ((e)this.instance).cc(byteString0);
            return this;
        }

        @Override  // com.google.api.f
        public ByteString K3() {
            return ((e)this.instance).K3();
        }

        public b Kb(String s) {
            this.copyOnWrite();
            ((e)this.instance).dc(s);
            return this;
        }

        public b Lb(ByteString byteString0) {
            this.copyOnWrite();
            ((e)this.instance).ec(byteString0);
            return this;
        }

        public b Mb(String s) {
            this.copyOnWrite();
            ((e)this.instance).fc(s);
            return this;
        }

        public b Nb(ByteString byteString0) {
            this.copyOnWrite();
            ((e)this.instance).gc(byteString0);
            return this;
        }

        public b Ob(String s) {
            this.copyOnWrite();
            ((e)this.instance).hc(s);
            return this;
        }

        @Override  // com.google.api.f
        public String P2() {
            return ((e)this.instance).P2();
        }

        public b Pb(ByteString byteString0) {
            this.copyOnWrite();
            ((e)this.instance).ic(byteString0);
            return this;
        }

        public b Qb(int v, com.google.api.g0.b g0$b0) {
            this.copyOnWrite();
            ((e)this.instance).jc(v, ((g0)g0$b0.build()));
            return this;
        }

        public b Rb(int v, g0 g00) {
            this.copyOnWrite();
            ((e)this.instance).jc(v, g00);
            return this;
        }

        @Override  // com.google.api.f
        public String U5() {
            return ((e)this.instance).U5();
        }

        @Override  // com.google.api.f
        public String a1() {
            return ((e)this.instance).a1();
        }

        @Override  // com.google.api.f
        public g0 g6(int v) {
            return ((e)this.instance).g6(v);
        }

        @Override  // com.google.api.f
        public String getId() {
            return ((e)this.instance).getId();
        }

        @Override  // com.google.api.f
        public ByteString m() {
            return ((e)this.instance).m();
        }

        @Override  // com.google.api.f
        public ByteString n2() {
            return ((e)this.instance).n2();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((e)this.instance).xb(iterable0);
            return this;
        }

        public b vb(int v, com.google.api.g0.b g0$b0) {
            this.copyOnWrite();
            ((e)this.instance).yb(v, ((g0)g0$b0.build()));
            return this;
        }

        @Override  // com.google.api.f
        public int w7() {
            return ((e)this.instance).w7();
        }

        public b wb(int v, g0 g00) {
            this.copyOnWrite();
            ((e)this.instance).yb(v, g00);
            return this;
        }

        public b xb(com.google.api.g0.b g0$b0) {
            this.copyOnWrite();
            ((e)this.instance).zb(((g0)g0$b0.build()));
            return this;
        }

        public b yb(g0 g00) {
            this.copyOnWrite();
            ((e)this.instance).zb(g00);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((e)this.instance).Ab();
            return this;
        }
    }

    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final e DEFAULT_INSTANCE = null;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile Parser PARSER;
    private String audiences_;
    private String authorizationUrl_;
    private String id_;
    private String issuer_;
    private String jwksUri_;
    private ProtobufList jwtLocations_;

    static {
        e e0 = new e();
        e.DEFAULT_INSTANCE = e0;
        GeneratedMessageLite.registerDefaultInstance(e.class, e0);
    }

    private e() {
        this.id_ = "";
        this.issuer_ = "";
        this.jwksUri_ = "";
        this.audiences_ = "";
        this.authorizationUrl_ = "";
        this.jwtLocations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Ab() {
        this.audiences_ = e.Hb().a1();
    }

    private void Bb() {
        this.authorizationUrl_ = e.Hb().P2();
    }

    private void Cb() {
        this.id_ = e.Hb().getId();
    }

    private void Db() {
        this.issuer_ = e.Hb().U5();
    }

    @Override  // com.google.api.f
    public ByteString E0() {
        return ByteString.copyFromUtf8(this.audiences_);
    }

    private void Eb() {
        this.jwksUri_ = e.Hb().I2();
    }

    private void Fb() {
        this.jwtLocations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Gb() {
        ProtobufList internal$ProtobufList0 = this.jwtLocations_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.jwtLocations_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.api.f
    public List H7() {
        return this.jwtLocations_;
    }

    public static e Hb() {
        return e.DEFAULT_INSTANCE;
    }

    @Override  // com.google.api.f
    public String I2() {
        return this.jwksUri_;
    }

    public h0 Ib(int v) {
        return (h0)this.jwtLocations_.get(v);
    }

    @Override  // com.google.api.f
    public ByteString J7() {
        return ByteString.copyFromUtf8(this.issuer_);
    }

    public List Jb() {
        return this.jwtLocations_;
    }

    @Override  // com.google.api.f
    public ByteString K3() {
        return ByteString.copyFromUtf8(this.jwksUri_);
    }

    public static b Kb() {
        return (b)e.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Lb(e e0) {
        return (b)e.DEFAULT_INSTANCE.createBuilder(e0);
    }

    public static e Mb(InputStream inputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseDelimitedFrom(e.DEFAULT_INSTANCE, inputStream0);
    }

    public static e Nb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseDelimitedFrom(e.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static e Ob(ByteString byteString0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.api.f
    public String P2() {
        return this.authorizationUrl_;
    }

    public static e Pb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static e Qb(CodedInputStream codedInputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static e Rb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static e Sb(InputStream inputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, inputStream0);
    }

    public static e Tb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.api.f
    public String U5() {
        return this.issuer_;
    }

    public static e Ub(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static e Vb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static e Wb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, arr_b);
    }

    public static e Xb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Yb(int v) {
        this.Gb();
        this.jwtLocations_.remove(v);
    }

    private void Zb(String s) {
        s.getClass();
        this.audiences_ = s;
    }

    @Override  // com.google.api.f
    public String a1() {
        return this.audiences_;
    }

    private void ac(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.audiences_ = byteString0.toStringUtf8();
    }

    private void bc(String s) {
        s.getClass();
        this.authorizationUrl_ = s;
    }

    private void cc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.authorizationUrl_ = byteString0.toStringUtf8();
    }

    private void dc(String s) {
        s.getClass();
        this.id_ = s;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new e();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(e.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001B", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", g0.class});
            }
            case 4: {
                return e.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = e.PARSER;
                if(parser0 == null) {
                    Class class0 = e.class;
                    synchronized(class0) {
                        parser0 = e.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(e.DEFAULT_INSTANCE);
                            e.PARSER = parser0;
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

    private void ec(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.id_ = byteString0.toStringUtf8();
    }

    private void fc(String s) {
        s.getClass();
        this.issuer_ = s;
    }

    @Override  // com.google.api.f
    public g0 g6(int v) {
        return (g0)this.jwtLocations_.get(v);
    }

    private void gc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.issuer_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.f
    public String getId() {
        return this.id_;
    }

    private void hc(String s) {
        s.getClass();
        this.jwksUri_ = s;
    }

    private void ic(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.jwksUri_ = byteString0.toStringUtf8();
    }

    private void jc(int v, g0 g00) {
        g00.getClass();
        this.Gb();
        this.jwtLocations_.set(v, g00);
    }

    @Override  // com.google.api.f
    public ByteString m() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override  // com.google.api.f
    public ByteString n2() {
        return ByteString.copyFromUtf8(this.authorizationUrl_);
    }

    public static Parser parser() {
        return e.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.api.f
    public int w7() {
        return this.jwtLocations_.size();
    }

    private void xb(Iterable iterable0) {
        this.Gb();
        AbstractMessageLite.addAll(iterable0, this.jwtLocations_);
    }

    private void yb(int v, g0 g00) {
        g00.getClass();
        this.Gb();
        this.jwtLocations_.add(v, g00);
    }

    private void zb(g0 g00) {
        g00.getClass();
        this.Gb();
        this.jwtLocations_.add(g00);
    }
}

