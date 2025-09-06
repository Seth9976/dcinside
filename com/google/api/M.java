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

public final class m extends GeneratedMessageLite implements n {
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
            super(m.DEFAULT_INSTANCE);
        }

        b(a m$a0) {
        }

        public b Ab(int v) {
            this.copyOnWrite();
            ((m)this.instance).Eb(v);
            return this;
        }

        public b Bb(int v, c p$c0) {
            this.copyOnWrite();
            ((m)this.instance).Fb(v, ((p)p$c0.build()));
            return this;
        }

        public b Cb(int v, p p0) {
            this.copyOnWrite();
            ((m)this.instance).Fb(v, p0);
            return this;
        }

        @Override  // com.google.api.n
        public p e(int v) {
            return ((m)this.instance).e(v);
        }

        @Override  // com.google.api.n
        public int f() {
            return ((m)this.instance).f();
        }

        @Override  // com.google.api.n
        public List g() {
            return DesugarCollections.unmodifiableList(((m)this.instance).g());
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((m)this.instance).d6(iterable0);
            return this;
        }

        public b vb(int v, c p$c0) {
            this.copyOnWrite();
            ((m)this.instance).z6(v, ((p)p$c0.build()));
            return this;
        }

        public b wb(int v, p p0) {
            this.copyOnWrite();
            ((m)this.instance).z6(v, p0);
            return this;
        }

        public b xb(c p$c0) {
            this.copyOnWrite();
            ((m)this.instance).A6(((p)p$c0.build()));
            return this;
        }

        public b yb(p p0) {
            this.copyOnWrite();
            ((m)this.instance).A6(p0);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((m)this.instance).B6();
            return this;
        }
    }

    private static final m DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private ProtobufList rules_;

    static {
        m m0 = new m();
        m.DEFAULT_INSTANCE = m0;
        GeneratedMessageLite.registerDefaultInstance(m.class, m0);
    }

    private m() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A6(p p0) {
        p0.getClass();
        this.M6();
        this.rules_.add(p0);
    }

    public List A8() {
        return this.rules_;
    }

    public static m Ab(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void B6() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static m Bb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static m Cb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, arr_b);
    }

    public static m Db(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Eb(int v) {
        this.M6();
        this.rules_.remove(v);
    }

    private void Fb(int v, p p0) {
        p0.getClass();
        this.M6();
        this.rules_.set(v, p0);
    }

    public static m Ja(InputStream inputStream0) throws IOException {
        return (m)GeneratedMessageLite.parseDelimitedFrom(m.DEFAULT_INSTANCE, inputStream0);
    }

    public static m La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (m)GeneratedMessageLite.parseDelimitedFrom(m.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void M6() {
        ProtobufList internal$ProtobufList0 = this.rules_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static m Z7() {
        return m.DEFAULT_INSTANCE;
    }

    public static b ca(m m0) {
        return (b)m.DEFAULT_INSTANCE.createBuilder(m0);
    }

    private void d6(Iterable iterable0) {
        this.M6();
        AbstractMessageLite.addAll(iterable0, this.rules_);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new m();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(m.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"rules_", p.class});
            }
            case 4: {
                return m.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = m.PARSER;
                if(parser0 == null) {
                    Class class0 = m.class;
                    synchronized(class0) {
                        parser0 = m.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(m.DEFAULT_INSTANCE);
                            m.PARSER = parser0;
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

    @Override  // com.google.api.n
    public p e(int v) {
        return (p)this.rules_.get(v);
    }

    @Override  // com.google.api.n
    public int f() {
        return this.rules_.size();
    }

    @Override  // com.google.api.n
    public List g() {
        return this.rules_;
    }

    public static b j9() {
        return (b)m.DEFAULT_INSTANCE.createBuilder();
    }

    public static Parser parser() {
        return m.DEFAULT_INSTANCE.getParserForType();
    }

    public static m ub(ByteString byteString0) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteString0);
    }

    public q v8(int v) {
        return (q)this.rules_.get(v);
    }

    public static m vb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static m wb(CodedInputStream codedInputStream0) throws IOException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static m xb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static m yb(InputStream inputStream0) throws IOException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, inputStream0);
    }

    private void z6(int v, p p0) {
        p0.getClass();
        this.M6();
        this.rules_.add(v, p0);
    }

    public static m zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

