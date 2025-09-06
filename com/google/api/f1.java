package com.google.api;

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

public final class f1 extends GeneratedMessageLite implements g1 {
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

    public static final class b extends Builder implements g1 {
        private b() {
            super(f1.DEFAULT_INSTANCE);
        }

        b(a f1$a0) {
        }

        public b Ab(int v) {
            this.copyOnWrite();
            ((f1)this.instance).Eb(v);
            return this;
        }

        public b Bb(int v, com.google.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            ((f1)this.instance).Fb(v, ((Any)any$Builder0.build()));
            return this;
        }

        @Override  // com.google.api.g1
        public Any Ca(int v) {
            return ((f1)this.instance).Ca(v);
        }

        public b Cb(int v, Any any0) {
            this.copyOnWrite();
            ((f1)this.instance).Fb(v, any0);
            return this;
        }

        @Override  // com.google.api.g1
        public int Z4() {
            return ((f1)this.instance).Z4();
        }

        @Override  // com.google.api.g1
        public List mb() {
            return DesugarCollections.unmodifiableList(((f1)this.instance).mb());
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((f1)this.instance).d6(iterable0);
            return this;
        }

        public b vb(int v, com.google.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            ((f1)this.instance).z6(v, ((Any)any$Builder0.build()));
            return this;
        }

        public b wb(int v, Any any0) {
            this.copyOnWrite();
            ((f1)this.instance).z6(v, any0);
            return this;
        }

        public b xb(com.google.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            ((f1)this.instance).A6(((Any)any$Builder0.build()));
            return this;
        }

        public b yb(Any any0) {
            this.copyOnWrite();
            ((f1)this.instance).A6(any0);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((f1)this.instance).B6();
            return this;
        }
    }

    private static final f1 DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private ProtobufList sourceFiles_;

    static {
        f1 f10 = new f1();
        f1.DEFAULT_INSTANCE = f10;
        GeneratedMessageLite.registerDefaultInstance(f1.class, f10);
    }

    private f1() {
        this.sourceFiles_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void A6(Any any0) {
        any0.getClass();
        this.M6();
        this.sourceFiles_.add(any0);
    }

    public List A8() {
        return this.sourceFiles_;
    }

    public static f1 Ab(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (f1)GeneratedMessageLite.parseFrom(f1.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void B6() {
        this.sourceFiles_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static f1 Bb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (f1)GeneratedMessageLite.parseFrom(f1.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    @Override  // com.google.api.g1
    public Any Ca(int v) {
        return (Any)this.sourceFiles_.get(v);
    }

    public static f1 Cb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (f1)GeneratedMessageLite.parseFrom(f1.DEFAULT_INSTANCE, arr_b);
    }

    public static f1 Db(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (f1)GeneratedMessageLite.parseFrom(f1.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Eb(int v) {
        this.M6();
        this.sourceFiles_.remove(v);
    }

    private void Fb(int v, Any any0) {
        any0.getClass();
        this.M6();
        this.sourceFiles_.set(v, any0);
    }

    public static f1 Ja(InputStream inputStream0) throws IOException {
        return (f1)GeneratedMessageLite.parseDelimitedFrom(f1.DEFAULT_INSTANCE, inputStream0);
    }

    public static f1 La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (f1)GeneratedMessageLite.parseDelimitedFrom(f1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void M6() {
        ProtobufList internal$ProtobufList0 = this.sourceFiles_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.sourceFiles_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.api.g1
    public int Z4() {
        return this.sourceFiles_.size();
    }

    public static f1 Z7() {
        return f1.DEFAULT_INSTANCE;
    }

    public static b ca(f1 f10) {
        return (b)f1.DEFAULT_INSTANCE.createBuilder(f10);
    }

    private void d6(Iterable iterable0) {
        this.M6();
        AbstractMessageLite.addAll(iterable0, this.sourceFiles_);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new f1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(f1.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"sourceFiles_", Any.class});
            }
            case 4: {
                return f1.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = f1.PARSER;
                if(parser0 == null) {
                    Class class0 = f1.class;
                    synchronized(class0) {
                        parser0 = f1.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(f1.DEFAULT_INSTANCE);
                            f1.PARSER = parser0;
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

    public static b j9() {
        return (b)f1.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.api.g1
    public List mb() {
        return this.sourceFiles_;
    }

    public static Parser parser() {
        return f1.DEFAULT_INSTANCE.getParserForType();
    }

    public static f1 ub(ByteString byteString0) throws InvalidProtocolBufferException {
        return (f1)GeneratedMessageLite.parseFrom(f1.DEFAULT_INSTANCE, byteString0);
    }

    public AnyOrBuilder v8(int v) {
        return (AnyOrBuilder)this.sourceFiles_.get(v);
    }

    public static f1 vb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (f1)GeneratedMessageLite.parseFrom(f1.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static f1 wb(CodedInputStream codedInputStream0) throws IOException {
        return (f1)GeneratedMessageLite.parseFrom(f1.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static f1 xb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (f1)GeneratedMessageLite.parseFrom(f1.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static f1 yb(InputStream inputStream0) throws IOException {
        return (f1)GeneratedMessageLite.parseFrom(f1.DEFAULT_INSTANCE, inputStream0);
    }

    private void z6(int v, Any any0) {
        any0.getClass();
        this.M6();
        this.sourceFiles_.add(v, any0);
    }

    public static f1 zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (f1)GeneratedMessageLite.parseFrom(f1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

