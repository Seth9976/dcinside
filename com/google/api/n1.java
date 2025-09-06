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

public final class n1 extends GeneratedMessageLite implements o1 {
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

    public static final class b extends Builder implements o1 {
        private b() {
            super(n1.DEFAULT_INSTANCE);
        }

        b(a n1$a0) {
        }

        public b Ab(int v) {
            this.copyOnWrite();
            ((n1)this.instance).Eb(v);
            return this;
        }

        public b Bb(int v, com.google.api.l1.b l1$b0) {
            this.copyOnWrite();
            ((n1)this.instance).Fb(v, ((l1)l1$b0.build()));
            return this;
        }

        public b Cb(int v, l1 l10) {
            this.copyOnWrite();
            ((n1)this.instance).Fb(v, l10);
            return this;
        }

        @Override  // com.google.api.o1
        public l1 e(int v) {
            return ((n1)this.instance).e(v);
        }

        @Override  // com.google.api.o1
        public int f() {
            return ((n1)this.instance).f();
        }

        @Override  // com.google.api.o1
        public List g() {
            return DesugarCollections.unmodifiableList(((n1)this.instance).g());
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((n1)this.instance).d6(iterable0);
            return this;
        }

        public b vb(int v, com.google.api.l1.b l1$b0) {
            this.copyOnWrite();
            ((n1)this.instance).z6(v, ((l1)l1$b0.build()));
            return this;
        }

        public b wb(int v, l1 l10) {
            this.copyOnWrite();
            ((n1)this.instance).z6(v, l10);
            return this;
        }

        public b xb(com.google.api.l1.b l1$b0) {
            this.copyOnWrite();
            ((n1)this.instance).A6(((l1)l1$b0.build()));
            return this;
        }

        public b yb(l1 l10) {
            this.copyOnWrite();
            ((n1)this.instance).A6(l10);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((n1)this.instance).B6();
            return this;
        }
    }

    private static final n1 DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private ProtobufList rules_;

    static {
        n1 n10 = new n1();
        n1.DEFAULT_INSTANCE = n10;
        GeneratedMessageLite.registerDefaultInstance(n1.class, n10);
    }

    private n1() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A6(l1 l10) {
        l10.getClass();
        this.M6();
        this.rules_.add(l10);
    }

    public List A8() {
        return this.rules_;
    }

    public static n1 Ab(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (n1)GeneratedMessageLite.parseFrom(n1.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void B6() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static n1 Bb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n1)GeneratedMessageLite.parseFrom(n1.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static n1 Cb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (n1)GeneratedMessageLite.parseFrom(n1.DEFAULT_INSTANCE, arr_b);
    }

    public static n1 Db(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n1)GeneratedMessageLite.parseFrom(n1.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Eb(int v) {
        this.M6();
        this.rules_.remove(v);
    }

    private void Fb(int v, l1 l10) {
        l10.getClass();
        this.M6();
        this.rules_.set(v, l10);
    }

    public static n1 Ja(InputStream inputStream0) throws IOException {
        return (n1)GeneratedMessageLite.parseDelimitedFrom(n1.DEFAULT_INSTANCE, inputStream0);
    }

    public static n1 La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n1)GeneratedMessageLite.parseDelimitedFrom(n1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void M6() {
        ProtobufList internal$ProtobufList0 = this.rules_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static n1 Z7() {
        return n1.DEFAULT_INSTANCE;
    }

    public static b ca(n1 n10) {
        return (b)n1.DEFAULT_INSTANCE.createBuilder(n10);
    }

    private void d6(Iterable iterable0) {
        this.M6();
        AbstractMessageLite.addAll(iterable0, this.rules_);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new n1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(n1.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"rules_", l1.class});
            }
            case 4: {
                return n1.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = n1.PARSER;
                if(parser0 == null) {
                    Class class0 = n1.class;
                    synchronized(class0) {
                        parser0 = n1.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(n1.DEFAULT_INSTANCE);
                            n1.PARSER = parser0;
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

    @Override  // com.google.api.o1
    public l1 e(int v) {
        return (l1)this.rules_.get(v);
    }

    @Override  // com.google.api.o1
    public int f() {
        return this.rules_.size();
    }

    @Override  // com.google.api.o1
    public List g() {
        return this.rules_;
    }

    public static b j9() {
        return (b)n1.DEFAULT_INSTANCE.createBuilder();
    }

    public static Parser parser() {
        return n1.DEFAULT_INSTANCE.getParserForType();
    }

    public static n1 ub(ByteString byteString0) throws InvalidProtocolBufferException {
        return (n1)GeneratedMessageLite.parseFrom(n1.DEFAULT_INSTANCE, byteString0);
    }

    public m1 v8(int v) {
        return (m1)this.rules_.get(v);
    }

    public static n1 vb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (n1)GeneratedMessageLite.parseFrom(n1.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static n1 wb(CodedInputStream codedInputStream0) throws IOException {
        return (n1)GeneratedMessageLite.parseFrom(n1.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static n1 xb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n1)GeneratedMessageLite.parseFrom(n1.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static n1 yb(InputStream inputStream0) throws IOException {
        return (n1)GeneratedMessageLite.parseFrom(n1.DEFAULT_INSTANCE, inputStream0);
    }

    private void z6(int v, l1 l10) {
        l10.getClass();
        this.M6();
        this.rules_.add(v, l10);
    }

    public static n1 zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (n1)GeneratedMessageLite.parseFrom(n1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

