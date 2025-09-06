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

public final class k extends GeneratedMessageLite implements l {
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

    public static final class b extends Builder implements l {
        private b() {
            super(k.DEFAULT_INSTANCE);
        }

        b(a k$a0) {
        }

        public b Ab() {
            this.copyOnWrite();
            ((k)this.instance).ub();
            return this;
        }

        public b Bb() {
            this.copyOnWrite();
            ((k)this.instance).vb();
            return this;
        }

        public b Cb() {
            this.copyOnWrite();
            ((k)this.instance).wb();
            return this;
        }

        public b Db(K0 k00) {
            this.copyOnWrite();
            ((k)this.instance).Bb(k00);
            return this;
        }

        public b Eb(int v) {
            this.copyOnWrite();
            ((k)this.instance).Qb(v);
            return this;
        }

        public b Fb(boolean z) {
            this.copyOnWrite();
            ((k)this.instance).Rb(z);
            return this;
        }

        public b Gb(com.google.api.K0.b k0$b0) {
            this.copyOnWrite();
            ((k)this.instance).Sb(((K0)k0$b0.build()));
            return this;
        }

        @Override  // com.google.api.l
        public List H0() {
            return DesugarCollections.unmodifiableList(((k)this.instance).H0());
        }

        public b Hb(K0 k00) {
            this.copyOnWrite();
            ((k)this.instance).Sb(k00);
            return this;
        }

        @Override  // com.google.api.l
        public g I0(int v) {
            return ((k)this.instance).I0(v);
        }

        public b Ib(int v, com.google.api.g.b g$b0) {
            this.copyOnWrite();
            ((k)this.instance).Tb(v, ((g)g$b0.build()));
            return this;
        }

        public b Jb(int v, g g0) {
            this.copyOnWrite();
            ((k)this.instance).Tb(v, g0);
            return this;
        }

        public b Kb(String s) {
            this.copyOnWrite();
            ((k)this.instance).Ub(s);
            return this;
        }

        public b Lb(ByteString byteString0) {
            this.copyOnWrite();
            ((k)this.instance).Vb(byteString0);
            return this;
        }

        @Override  // com.google.api.l
        public K0 X7() {
            return ((k)this.instance).X7();
        }

        @Override  // com.google.api.l
        public int Y() {
            return ((k)this.instance).Y();
        }

        @Override  // com.google.api.l
        public String b() {
            return ((k)this.instance).b();
        }

        @Override  // com.google.api.l
        public ByteString c() {
            return ((k)this.instance).c();
        }

        @Override  // com.google.api.l
        public boolean m9() {
            return ((k)this.instance).m9();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((k)this.instance).j9(iterable0);
            return this;
        }

        public b vb(int v, com.google.api.g.b g$b0) {
            this.copyOnWrite();
            ((k)this.instance).ca(v, ((g)g$b0.build()));
            return this;
        }

        public b wb(int v, g g0) {
            this.copyOnWrite();
            ((k)this.instance).ca(v, g0);
            return this;
        }

        @Override  // com.google.api.l
        public boolean x7() {
            return ((k)this.instance).x7();
        }

        public b xb(com.google.api.g.b g$b0) {
            this.copyOnWrite();
            ((k)this.instance).Ja(((g)g$b0.build()));
            return this;
        }

        public b yb(g g0) {
            this.copyOnWrite();
            ((k)this.instance).Ja(g0);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((k)this.instance).La();
            return this;
        }
    }

    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final k DEFAULT_INSTANCE = null;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private K0 oauth_;
    private ProtobufList requirements_;
    private String selector_;

    static {
        k k0 = new k();
        k.DEFAULT_INSTANCE = k0;
        GeneratedMessageLite.registerDefaultInstance(k.class, k0);
    }

    private k() {
        this.selector_ = "";
        this.requirements_ = GeneratedMessageLite.emptyProtobufList();
    }

    public List Ab() {
        return this.requirements_;
    }

    private void Bb(K0 k00) {
        k00.getClass();
        if(this.oauth_ != null && this.oauth_ != K0.M4()) {
            this.oauth_ = (K0)((com.google.api.K0.b)K0.d6(this.oauth_).mergeFrom(k00)).buildPartial();
            return;
        }
        this.oauth_ = k00;
    }

    public static b Cb() {
        return (b)k.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Db(k k0) {
        return (b)k.DEFAULT_INSTANCE.createBuilder(k0);
    }

    public static k Eb(InputStream inputStream0) throws IOException {
        return (k)GeneratedMessageLite.parseDelimitedFrom(k.DEFAULT_INSTANCE, inputStream0);
    }

    public static k Fb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (k)GeneratedMessageLite.parseDelimitedFrom(k.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static k Gb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.api.l
    public List H0() {
        return this.requirements_;
    }

    public static k Hb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // com.google.api.l
    public g I0(int v) {
        return (g)this.requirements_.get(v);
    }

    public static k Ib(CodedInputStream codedInputStream0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void Ja(g g0) {
        g0.getClass();
        this.xb();
        this.requirements_.add(g0);
    }

    public static k Jb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static k Kb(InputStream inputStream0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, inputStream0);
    }

    private void La() {
        this.allowWithoutCredential_ = false;
    }

    public static k Lb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static k Mb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static k Nb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static k Ob(byte[] arr_b) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, arr_b);
    }

    public static k Pb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Qb(int v) {
        this.xb();
        this.requirements_.remove(v);
    }

    private void Rb(boolean z) {
        this.allowWithoutCredential_ = z;
    }

    private void Sb(K0 k00) {
        k00.getClass();
        this.oauth_ = k00;
    }

    private void Tb(int v, g g0) {
        g0.getClass();
        this.xb();
        this.requirements_.set(v, g0);
    }

    private void Ub(String s) {
        s.getClass();
        this.selector_ = s;
    }

    private void Vb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.selector_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.l
    public K0 X7() {
        return this.oauth_ == null ? K0.M4() : this.oauth_;
    }

    @Override  // com.google.api.l
    public int Y() {
        return this.requirements_.size();
    }

    @Override  // com.google.api.l
    public String b() {
        return this.selector_;
    }

    @Override  // com.google.api.l
    public ByteString c() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    private void ca(int v, g g0) {
        g0.getClass();
        this.xb();
        this.requirements_.add(v, g0);
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
                return GeneratedMessageLite.newMessageInfo(k.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0005\u0007\u0007\u001B", new Object[]{"selector_", "oauth_", "allowWithoutCredential_", "requirements_", g.class});
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

    private void j9(Iterable iterable0) {
        this.xb();
        AbstractMessageLite.addAll(iterable0, this.requirements_);
    }

    @Override  // com.google.api.l
    public boolean m9() {
        return this.oauth_ != null;
    }

    public static Parser parser() {
        return k.DEFAULT_INSTANCE.getParserForType();
    }

    private void ub() {
        this.oauth_ = null;
    }

    private void vb() {
        this.requirements_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void wb() {
        this.selector_ = k.yb().b();
    }

    @Override  // com.google.api.l
    public boolean x7() {
        return this.allowWithoutCredential_;
    }

    private void xb() {
        ProtobufList internal$ProtobufList0 = this.requirements_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.requirements_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static k yb() {
        return k.DEFAULT_INSTANCE;
    }

    public h zb(int v) {
        return (h)this.requirements_.get(v);
    }
}

