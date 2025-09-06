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

public final class i extends GeneratedMessageLite implements j {
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

    public static final class b extends Builder implements j {
        private b() {
            super(i.DEFAULT_INSTANCE);
        }

        b(a i$a0) {
        }

        public b Ab(int v, com.google.api.k.b k$b0) {
            this.copyOnWrite();
            ((i)this.instance).Ja(v, ((k)k$b0.build()));
            return this;
        }

        public b Bb(int v, k k0) {
            this.copyOnWrite();
            ((i)this.instance).Ja(v, k0);
            return this;
        }

        public b Cb(com.google.api.k.b k$b0) {
            this.copyOnWrite();
            ((i)this.instance).La(((k)k$b0.build()));
            return this;
        }

        public b Db(k k0) {
            this.copyOnWrite();
            ((i)this.instance).La(k0);
            return this;
        }

        public b Eb() {
            this.copyOnWrite();
            ((i)this.instance).ub();
            return this;
        }

        public b Fb() {
            this.copyOnWrite();
            ((i)this.instance).vb();
            return this;
        }

        public b Gb(int v) {
            this.copyOnWrite();
            ((i)this.instance).Rb(v);
            return this;
        }

        public b Hb(int v) {
            this.copyOnWrite();
            ((i)this.instance).Sb(v);
            return this;
        }

        public b Ib(int v, com.google.api.e.b e$b0) {
            this.copyOnWrite();
            ((i)this.instance).Tb(v, ((e)e$b0.build()));
            return this;
        }

        public b Jb(int v, e e0) {
            this.copyOnWrite();
            ((i)this.instance).Tb(v, e0);
            return this;
        }

        public b Kb(int v, com.google.api.k.b k$b0) {
            this.copyOnWrite();
            ((i)this.instance).Ub(v, ((k)k$b0.build()));
            return this;
        }

        public b Lb(int v, k k0) {
            this.copyOnWrite();
            ((i)this.instance).Ub(v, k0);
            return this;
        }

        @Override  // com.google.api.j
        public int Ta() {
            return ((i)this.instance).Ta();
        }

        @Override  // com.google.api.j
        public k e(int v) {
            return ((i)this.instance).e(v);
        }

        @Override  // com.google.api.j
        public int f() {
            return ((i)this.instance).f();
        }

        @Override  // com.google.api.j
        public List g() {
            return DesugarCollections.unmodifiableList(((i)this.instance).g());
        }

        @Override  // com.google.api.j
        public List gb() {
            return DesugarCollections.unmodifiableList(((i)this.instance).gb());
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((i)this.instance).v8(iterable0);
            return this;
        }

        public b vb(Iterable iterable0) {
            this.copyOnWrite();
            ((i)this.instance).A8(iterable0);
            return this;
        }

        public b wb(int v, com.google.api.e.b e$b0) {
            this.copyOnWrite();
            ((i)this.instance).j9(v, ((e)e$b0.build()));
            return this;
        }

        public b xb(int v, e e0) {
            this.copyOnWrite();
            ((i)this.instance).j9(v, e0);
            return this;
        }

        public b yb(com.google.api.e.b e$b0) {
            this.copyOnWrite();
            ((i)this.instance).ca(((e)e$b0.build()));
            return this;
        }

        @Override  // com.google.api.j
        public e z7(int v) {
            return ((i)this.instance).z7(v);
        }

        public b zb(e e0) {
            this.copyOnWrite();
            ((i)this.instance).ca(e0);
            return this;
        }
    }

    private static final i DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private ProtobufList providers_;
    private ProtobufList rules_;

    static {
        i i0 = new i();
        i.DEFAULT_INSTANCE = i0;
        GeneratedMessageLite.registerDefaultInstance(i.class, i0);
    }

    private i() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
        this.providers_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A8(Iterable iterable0) {
        this.xb();
        AbstractMessageLite.addAll(iterable0, this.rules_);
    }

    public List Ab() {
        return this.providers_;
    }

    public l Bb(int v) {
        return (l)this.rules_.get(v);
    }

    public List Cb() {
        return this.rules_;
    }

    public static b Db() {
        return (b)i.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Eb(i i0) {
        return (b)i.DEFAULT_INSTANCE.createBuilder(i0);
    }

    public static i Fb(InputStream inputStream0) throws IOException {
        return (i)GeneratedMessageLite.parseDelimitedFrom(i.DEFAULT_INSTANCE, inputStream0);
    }

    public static i Gb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i)GeneratedMessageLite.parseDelimitedFrom(i.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static i Hb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteString0);
    }

    public static i Ib(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void Ja(int v, k k0) {
        k0.getClass();
        this.xb();
        this.rules_.add(v, k0);
    }

    public static i Jb(CodedInputStream codedInputStream0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static i Kb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    private void La(k k0) {
        k0.getClass();
        this.xb();
        this.rules_.add(k0);
    }

    public static i Lb(InputStream inputStream0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, inputStream0);
    }

    public static i Mb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static i Nb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static i Ob(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static i Pb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, arr_b);
    }

    public static i Qb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Rb(int v) {
        this.wb();
        this.providers_.remove(v);
    }

    private void Sb(int v) {
        this.xb();
        this.rules_.remove(v);
    }

    @Override  // com.google.api.j
    public int Ta() {
        return this.providers_.size();
    }

    private void Tb(int v, e e0) {
        e0.getClass();
        this.wb();
        this.providers_.set(v, e0);
    }

    private void Ub(int v, k k0) {
        k0.getClass();
        this.xb();
        this.rules_.set(v, k0);
    }

    private void ca(e e0) {
        e0.getClass();
        this.wb();
        this.providers_.add(e0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new i();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(i.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001B\u0004\u001B", new Object[]{"rules_", k.class, "providers_", e.class});
            }
            case 4: {
                return i.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = i.PARSER;
                if(parser0 == null) {
                    Class class0 = i.class;
                    synchronized(class0) {
                        parser0 = i.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(i.DEFAULT_INSTANCE);
                            i.PARSER = parser0;
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

    @Override  // com.google.api.j
    public k e(int v) {
        return (k)this.rules_.get(v);
    }

    @Override  // com.google.api.j
    public int f() {
        return this.rules_.size();
    }

    @Override  // com.google.api.j
    public List g() {
        return this.rules_;
    }

    @Override  // com.google.api.j
    public List gb() {
        return this.providers_;
    }

    private void j9(int v, e e0) {
        e0.getClass();
        this.wb();
        this.providers_.add(v, e0);
    }

    public static Parser parser() {
        return i.DEFAULT_INSTANCE.getParserForType();
    }

    private void ub() {
        this.providers_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void v8(Iterable iterable0) {
        this.wb();
        AbstractMessageLite.addAll(iterable0, this.providers_);
    }

    private void vb() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void wb() {
        ProtobufList internal$ProtobufList0 = this.providers_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.providers_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    private void xb() {
        ProtobufList internal$ProtobufList0 = this.rules_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static i yb() {
        return i.DEFAULT_INSTANCE;
    }

    @Override  // com.google.api.j
    public e z7(int v) {
        return (e)this.providers_.get(v);
    }

    public f zb(int v) {
        return (f)this.providers_.get(v);
    }
}

