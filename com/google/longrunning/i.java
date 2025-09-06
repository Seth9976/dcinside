package com.google.longrunning;

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

        public b Ab() {
            this.copyOnWrite();
            ((i)this.instance).A8();
            return this;
        }

        public b Bb(int v) {
            this.copyOnWrite();
            ((i)this.instance).Ib(v);
            return this;
        }

        public b Cb(String s) {
            this.copyOnWrite();
            ((i)this.instance).Jb(s);
            return this;
        }

        public b Db(ByteString byteString0) {
            this.copyOnWrite();
            ((i)this.instance).Kb(byteString0);
            return this;
        }

        public b Eb(int v, com.google.longrunning.k.b k$b0) {
            this.copyOnWrite();
            ((i)this.instance).Lb(v, ((k)k$b0.build()));
            return this;
        }

        public b Fb(int v, k k0) {
            this.copyOnWrite();
            ((i)this.instance).Lb(v, k0);
            return this;
        }

        @Override  // com.google.longrunning.j
        public List H5() {
            return DesugarCollections.unmodifiableList(((i)this.instance).H5());
        }

        @Override  // com.google.longrunning.j
        public String L4() {
            return ((i)this.instance).L4();
        }

        @Override  // com.google.longrunning.j
        public ByteString g4() {
            return ((i)this.instance).g4();
        }

        @Override  // com.google.longrunning.j
        public k j4(int v) {
            return ((i)this.instance).j4(v);
        }

        @Override  // com.google.longrunning.j
        public int pa() {
            return ((i)this.instance).pa();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((i)this.instance).B6(iterable0);
            return this;
        }

        public b vb(int v, com.google.longrunning.k.b k$b0) {
            this.copyOnWrite();
            ((i)this.instance).M6(v, ((k)k$b0.build()));
            return this;
        }

        public b wb(int v, k k0) {
            this.copyOnWrite();
            ((i)this.instance).M6(v, k0);
            return this;
        }

        public b xb(com.google.longrunning.k.b k$b0) {
            this.copyOnWrite();
            ((i)this.instance).Z7(((k)k$b0.build()));
            return this;
        }

        public b yb(k k0) {
            this.copyOnWrite();
            ((i)this.instance).Z7(k0);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((i)this.instance).v8();
            return this;
        }
    }

    private static final i DEFAULT_INSTANCE = null;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String nextPageToken_;
    private ProtobufList operations_;

    static {
        i i0 = new i();
        i.DEFAULT_INSTANCE = i0;
        GeneratedMessageLite.registerDefaultInstance(i.class, i0);
    }

    private i() {
        this.operations_ = GeneratedMessageLite.emptyProtobufList();
        this.nextPageToken_ = "";
    }

    private void A8() {
        this.operations_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static i Ab(CodedInputStream codedInputStream0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void B6(Iterable iterable0) {
        this.j9();
        AbstractMessageLite.addAll(iterable0, this.operations_);
    }

    public static i Bb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static i Cb(InputStream inputStream0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, inputStream0);
    }

    public static i Db(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static i Eb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static i Fb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static i Gb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.longrunning.j
    public List H5() {
        return this.operations_;
    }

    public static i Hb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Ib(int v) {
        this.j9();
        this.operations_.remove(v);
    }

    public n Ja(int v) {
        return (n)this.operations_.get(v);
    }

    private void Jb(String s) {
        s.getClass();
        this.nextPageToken_ = s;
    }

    private void Kb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.nextPageToken_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.longrunning.j
    public String L4() {
        return this.nextPageToken_;
    }

    public List La() {
        return this.operations_;
    }

    private void Lb(int v, k k0) {
        k0.getClass();
        this.j9();
        this.operations_.set(v, k0);
    }

    private void M6(int v, k k0) {
        k0.getClass();
        this.j9();
        this.operations_.add(v, k0);
    }

    private void Z7(k k0) {
        k0.getClass();
        this.j9();
        this.operations_.add(k0);
    }

    public static i ca() {
        return i.DEFAULT_INSTANCE;
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
                return GeneratedMessageLite.newMessageInfo(i.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001B\u0002Ȉ", new Object[]{"operations_", k.class, "nextPageToken_"});
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

    @Override  // com.google.longrunning.j
    public ByteString g4() {
        return ByteString.copyFromUtf8(this.nextPageToken_);
    }

    @Override  // com.google.longrunning.j
    public k j4(int v) {
        return (k)this.operations_.get(v);
    }

    private void j9() {
        ProtobufList internal$ProtobufList0 = this.operations_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.operations_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.longrunning.j
    public int pa() {
        return this.operations_.size();
    }

    public static Parser parser() {
        return i.DEFAULT_INSTANCE.getParserForType();
    }

    public static b ub() {
        return (b)i.DEFAULT_INSTANCE.createBuilder();
    }

    private void v8() {
        this.nextPageToken_ = i.ca().L4();
    }

    public static b vb(i i0) {
        return (b)i.DEFAULT_INSTANCE.createBuilder(i0);
    }

    public static i wb(InputStream inputStream0) throws IOException {
        return (i)GeneratedMessageLite.parseDelimitedFrom(i.DEFAULT_INSTANCE, inputStream0);
    }

    public static i xb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i)GeneratedMessageLite.parseDelimitedFrom(i.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static i yb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteString0);
    }

    public static i zb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }
}

