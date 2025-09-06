package com.google.rpc.context;

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
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat.FieldType;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public final class a extends GeneratedMessageLite implements b {
    static class com.google.rpc.context.a.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            com.google.rpc.context.a.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.context.a.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.context.a.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.context.a.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.context.a.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.context.a.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.rpc.context.a.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class com.google.rpc.context.a.b extends GeneratedMessageLite implements c {
        public static final class com.google.rpc.context.a.b.a extends Builder implements c {
            private com.google.rpc.context.a.b.a() {
                super(com.google.rpc.context.a.b.DEFAULT_INSTANCE);
            }

            com.google.rpc.context.a.b.a(com.google.rpc.context.a.a a$a0) {
            }

            public com.google.rpc.context.a.b.a Ab(String s) {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).Hb(s);
                return this;
            }

            public com.google.rpc.context.a.b.a Bb(ByteString byteString0) {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).Ib(byteString0);
                return this;
            }

            public com.google.rpc.context.a.b.a Cb(String s) {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).Jb(s);
                return this;
            }

            public com.google.rpc.context.a.b.a Db(ByteString byteString0) {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).Kb(byteString0);
                return this;
            }

            public com.google.rpc.context.a.b.a Eb(String s) {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).setVersion(s);
                return this;
            }

            public com.google.rpc.context.a.b.a Fb(ByteString byteString0) {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).setVersionBytes(byteString0);
                return this;
            }

            @Override  // com.google.rpc.context.a$c
            public String c0() {
                return ((com.google.rpc.context.a.b)this.instance).c0();
            }

            @Override  // com.google.rpc.context.a$c
            public ByteString g0() {
                return ((com.google.rpc.context.a.b)this.instance).g0();
            }

            @Override  // com.google.rpc.context.a$c
            public String getVersion() {
                return ((com.google.rpc.context.a.b)this.instance).getVersion();
            }

            @Override  // com.google.rpc.context.a$c
            public ByteString getVersionBytes() {
                return ((com.google.rpc.context.a.b)this.instance).getVersionBytes();
            }

            @Override  // com.google.rpc.context.a$c
            public ByteString j() {
                return ((com.google.rpc.context.a.b)this.instance).j();
            }

            @Override  // com.google.rpc.context.a$c
            public String l() {
                return ((com.google.rpc.context.a.b)this.instance).l();
            }

            @Override  // com.google.rpc.context.a$c
            public ByteString m5() {
                return ((com.google.rpc.context.a.b)this.instance).m5();
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.rpc.context.a$c
            public String u9() {
                return "";
            }

            public com.google.rpc.context.a.b.a ub() {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).v8();
                return this;
            }

            public com.google.rpc.context.a.b.a vb() {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).A8();
                return this;
            }

            public com.google.rpc.context.a.b.a wb() {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).clearService();
                return this;
            }

            public com.google.rpc.context.a.b.a xb() {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).clearVersion();
                return this;
            }

            public com.google.rpc.context.a.b.a yb(String s) {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).Fb(s);
                return this;
            }

            public com.google.rpc.context.a.b.a zb(ByteString byteString0) {
                this.copyOnWrite();
                ((com.google.rpc.context.a.b)this.instance).Gb(byteString0);
                return this;
            }
        }

        private static final com.google.rpc.context.a.b DEFAULT_INSTANCE = null;
        public static final int OPERATION_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private String operation_;
        private String protocol_;
        private String service_;
        private String version_;

        static {
            com.google.rpc.context.a.b a$b0 = new com.google.rpc.context.a.b();
            com.google.rpc.context.a.b.DEFAULT_INSTANCE = a$b0;
            GeneratedMessageLite.registerDefaultInstance(com.google.rpc.context.a.b.class, a$b0);
        }

        private com.google.rpc.context.a.b() {
            this.service_ = "";
            this.operation_ = "";
            this.protocol_ = "";
            this.version_ = "";
        }

        private void A8() {
            this.protocol_ = "";
        }

        public static com.google.rpc.context.a.b Ab(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static com.google.rpc.context.a.b Bb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static com.google.rpc.context.a.b Cb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static com.google.rpc.context.a.b Db(byte[] arr_b) throws InvalidProtocolBufferException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, arr_b);
        }

        public static com.google.rpc.context.a.b Eb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void Fb(String s) {
            s.getClass();
            this.operation_ = s;
        }

        private void Gb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.operation_ = byteString0.toStringUtf8();
        }

        private void Hb(String s) {
            s.getClass();
            this.protocol_ = s;
        }

        private void Ib(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.protocol_ = byteString0.toStringUtf8();
        }

        public static com.google.rpc.context.a.b.a Ja(com.google.rpc.context.a.b a$b0) {
            return (com.google.rpc.context.a.b.a)com.google.rpc.context.a.b.DEFAULT_INSTANCE.createBuilder(a$b0);
        }

        private void Jb(String s) {
            s.getClass();
            this.service_ = s;
        }

        private void Kb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.service_ = byteString0.toStringUtf8();
        }

        public static com.google.rpc.context.a.b La(InputStream inputStream0) throws IOException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseDelimitedFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, inputStream0);
        }

        @Override  // com.google.rpc.context.a$c
        public String c0() {
            return this.service_;
        }

        public static com.google.rpc.context.a.b.a ca() {
            return (com.google.rpc.context.a.b.a)com.google.rpc.context.a.b.DEFAULT_INSTANCE.createBuilder();
        }

        private void clearService() {
            this.service_ = com.google.rpc.context.a.b.j9().c0();
        }

        private void clearVersion() {
            this.version_ = "";
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new com.google.rpc.context.a.b();
                }
                case 2: {
                    return new com.google.rpc.context.a.b.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(com.google.rpc.context.a.b.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"service_", "operation_", "protocol_", "version_"});
                }
                case 4: {
                    return com.google.rpc.context.a.b.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = com.google.rpc.context.a.b.PARSER;
                    if(parser0 == null) {
                        Class class0 = com.google.rpc.context.a.b.class;
                        synchronized(class0) {
                            parser0 = com.google.rpc.context.a.b.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(com.google.rpc.context.a.b.DEFAULT_INSTANCE);
                                com.google.rpc.context.a.b.PARSER = parser0;
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

        @Override  // com.google.rpc.context.a$c
        public ByteString g0() {
            return ByteString.copyFromUtf8(this.service_);
        }

        @Override  // com.google.rpc.context.a$c
        public String getVersion() {
            return this.version_;
        }

        @Override  // com.google.rpc.context.a$c
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override  // com.google.rpc.context.a$c
        public ByteString j() {
            return ByteString.copyFromUtf8(this.protocol_);
        }

        public static com.google.rpc.context.a.b j9() {
            return com.google.rpc.context.a.b.DEFAULT_INSTANCE;
        }

        @Override  // com.google.rpc.context.a$c
        public String l() {
            return this.protocol_;
        }

        @Override  // com.google.rpc.context.a$c
        public ByteString m5() {
            return ByteString.copyFromUtf8(this.operation_);
        }

        public static Parser parser() {
            return com.google.rpc.context.a.b.DEFAULT_INSTANCE.getParserForType();
        }

        private void setVersion(String s) {
            s.getClass();
            this.version_ = s;
        }

        private void setVersionBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.version_ = byteString0.toStringUtf8();
        }

        @Override  // com.google.rpc.context.a$c
        public String u9() [...] // 潜在的解密器

        public static com.google.rpc.context.a.b ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseDelimitedFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        private void v8() {
            this.operation_ = "";
        }

        public static com.google.rpc.context.a.b vb(ByteString byteString0) throws InvalidProtocolBufferException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, byteString0);
        }

        public static com.google.rpc.context.a.b wb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static com.google.rpc.context.a.b xb(CodedInputStream codedInputStream0) throws IOException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static com.google.rpc.context.a.b yb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static com.google.rpc.context.a.b zb(InputStream inputStream0) throws IOException {
            return (com.google.rpc.context.a.b)GeneratedMessageLite.parseFrom(com.google.rpc.context.a.b.DEFAULT_INSTANCE, inputStream0);
        }
    }

    public interface c extends MessageLiteOrBuilder {
        String c0();

        ByteString g0();

        String getVersion();

        ByteString getVersionBytes();

        ByteString j();

        String l();

        ByteString m5();

        String u9();
    }

    public static final class d extends GeneratedMessageLite implements e {
        public static final class com.google.rpc.context.a.d.a extends Builder implements e {
            private com.google.rpc.context.a.d.a() {
                super(d.DEFAULT_INSTANCE);
            }

            com.google.rpc.context.a.d.a(com.google.rpc.context.a.a a$a0) {
            }

            @Override  // com.google.rpc.context.a$e
            public String A9(int v) {
                return ((d)this.instance).A9(v);
            }

            public com.google.rpc.context.a.d.a Ab() {
                this.copyOnWrite();
                ((d)this.instance).Bb();
                return this;
            }

            public com.google.rpc.context.a.d.a Bb() {
                this.copyOnWrite();
                ((d)this.instance).Cb();
                return this;
            }

            public com.google.rpc.context.a.d.a Cb() {
                this.copyOnWrite();
                ((d)this.instance).Db();
                return this;
            }

            public com.google.rpc.context.a.d.a Db() {
                this.copyOnWrite();
                ((d)this.instance).Eb();
                return this;
            }

            public com.google.rpc.context.a.d.a Eb() {
                this.copyOnWrite();
                ((d)this.instance).Fb();
                return this;
            }

            public com.google.rpc.context.a.d.a Fb(Struct struct0) {
                this.copyOnWrite();
                ((d)this.instance).Jb(struct0);
                return this;
            }

            public com.google.rpc.context.a.d.a Gb(int v, String s) {
                this.copyOnWrite();
                ((d)this.instance).Yb(v, s);
                return this;
            }

            public com.google.rpc.context.a.d.a Hb(int v, String s) {
                this.copyOnWrite();
                ((d)this.instance).Zb(v, s);
                return this;
            }

            @Override  // com.google.rpc.context.a$e
            public boolean I9() {
                return ((d)this.instance).I9();
            }

            public com.google.rpc.context.a.d.a Ib(com.google.protobuf.Struct.Builder struct$Builder0) {
                this.copyOnWrite();
                ((d)this.instance).ac(((Struct)struct$Builder0.build()));
                return this;
            }

            public com.google.rpc.context.a.d.a Jb(Struct struct0) {
                this.copyOnWrite();
                ((d)this.instance).ac(struct0);
                return this;
            }

            @Override  // com.google.rpc.context.a$e
            public List K5() {
                return DesugarCollections.unmodifiableList(((d)this.instance).K5());
            }

            public com.google.rpc.context.a.d.a Kb(String s) {
                this.copyOnWrite();
                ((d)this.instance).bc(s);
                return this;
            }

            public com.google.rpc.context.a.d.a Lb(ByteString byteString0) {
                this.copyOnWrite();
                ((d)this.instance).cc(byteString0);
                return this;
            }

            public com.google.rpc.context.a.d.a Mb(String s) {
                this.copyOnWrite();
                ((d)this.instance).dc(s);
                return this;
            }

            public com.google.rpc.context.a.d.a Nb(ByteString byteString0) {
                this.copyOnWrite();
                ((d)this.instance).ec(byteString0);
                return this;
            }

            @Override  // com.google.rpc.context.a$e
            public ByteString P7(int v) {
                return ((d)this.instance).P7(v);
            }

            @Override  // com.google.rpc.context.a$e
            public int R2() {
                return ((d)this.instance).R2();
            }

            @Override  // com.google.rpc.context.a$e
            public List S6() {
                return DesugarCollections.unmodifiableList(((d)this.instance).S6());
            }

            @Override  // com.google.rpc.context.a$e
            public ByteString W7() {
                return ((d)this.instance).W7();
            }

            @Override  // com.google.rpc.context.a$e
            public ByteString Wa(int v) {
                return ((d)this.instance).Wa(v);
            }

            @Override  // com.google.rpc.context.a$e
            public Struct b3() {
                return ((d)this.instance).b3();
            }

            @Override  // com.google.rpc.context.a$e
            public String f0() {
                return ((d)this.instance).f0();
            }

            @Override  // com.google.rpc.context.a$e
            public ByteString k0() {
                return ((d)this.instance).k0();
            }

            @Override  // com.google.rpc.context.a$e
            public int k1() {
                return ((d)this.instance).k1();
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.rpc.context.a$e
            public String r3() {
                return "";
            }

            @Override  // com.google.rpc.context.a$e
            public String ta(int v) {
                return ((d)this.instance).ta(v);
            }

            public com.google.rpc.context.a.d.a ub(String s) {
                this.copyOnWrite();
                ((d)this.instance).vb(s);
                return this;
            }

            public com.google.rpc.context.a.d.a vb(ByteString byteString0) {
                this.copyOnWrite();
                ((d)this.instance).wb(byteString0);
                return this;
            }

            public com.google.rpc.context.a.d.a wb(Iterable iterable0) {
                this.copyOnWrite();
                ((d)this.instance).xb(iterable0);
                return this;
            }

            public com.google.rpc.context.a.d.a xb(Iterable iterable0) {
                this.copyOnWrite();
                ((d)this.instance).yb(iterable0);
                return this;
            }

            public com.google.rpc.context.a.d.a yb(String s) {
                this.copyOnWrite();
                ((d)this.instance).zb(s);
                return this;
            }

            public com.google.rpc.context.a.d.a zb(ByteString byteString0) {
                this.copyOnWrite();
                ((d)this.instance).Ab(byteString0);
                return this;
            }
        }

        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        private static final d DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private ProtobufList accessLevels_;
        private ProtobufList audiences_;
        private Struct claims_;
        private String presenter_;
        private String principal_;

        static {
            d a$d0 = new d();
            d.DEFAULT_INSTANCE = a$d0;
            GeneratedMessageLite.registerDefaultInstance(d.class, a$d0);
        }

        private d() {
            this.principal_ = "";
            this.audiences_ = GeneratedMessageLite.emptyProtobufList();
            this.presenter_ = "";
            this.accessLevels_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.rpc.context.a$e
        public String A9(int v) {
            return (String)this.accessLevels_.get(v);
        }

        private void Ab(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.Hb();
            this.audiences_.add(byteString0.toStringUtf8());
        }

        private void Bb() {
            this.accessLevels_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void Cb() {
            this.audiences_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void Db() {
            this.claims_ = null;
        }

        private void Eb() {
            this.presenter_ = "";
        }

        private void Fb() {
            this.principal_ = d.Ib().f0();
        }

        private void Gb() {
            ProtobufList internal$ProtobufList0 = this.accessLevels_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.accessLevels_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void Hb() {
            ProtobufList internal$ProtobufList0 = this.audiences_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.audiences_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // com.google.rpc.context.a$e
        public boolean I9() {
            return this.claims_ != null;
        }

        public static d Ib() {
            return d.DEFAULT_INSTANCE;
        }

        private void Jb(Struct struct0) {
            struct0.getClass();
            if(this.claims_ != null && this.claims_ != Struct.getDefaultInstance()) {
                this.claims_ = (Struct)((com.google.protobuf.Struct.Builder)Struct.newBuilder(this.claims_).mergeFrom(struct0)).buildPartial();
                return;
            }
            this.claims_ = struct0;
        }

        @Override  // com.google.rpc.context.a$e
        public List K5() {
            return this.accessLevels_;
        }

        public static com.google.rpc.context.a.d.a Kb() {
            return (com.google.rpc.context.a.d.a)d.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.rpc.context.a.d.a Lb(d a$d0) {
            return (com.google.rpc.context.a.d.a)d.DEFAULT_INSTANCE.createBuilder(a$d0);
        }

        public static d Mb(InputStream inputStream0) throws IOException {
            return (d)GeneratedMessageLite.parseDelimitedFrom(d.DEFAULT_INSTANCE, inputStream0);
        }

        public static d Nb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (d)GeneratedMessageLite.parseDelimitedFrom(d.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static d Ob(ByteString byteString0) throws InvalidProtocolBufferException {
            return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, byteString0);
        }

        @Override  // com.google.rpc.context.a$e
        public ByteString P7(int v) {
            return ByteString.copyFromUtf8(((String)this.audiences_.get(v)));
        }

        public static d Pb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static d Qb(CodedInputStream codedInputStream0) throws IOException {
            return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, codedInputStream0);
        }

        @Override  // com.google.rpc.context.a$e
        public int R2() {
            return this.audiences_.size();
        }

        public static d Rb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        @Override  // com.google.rpc.context.a$e
        public List S6() {
            return this.audiences_;
        }

        public static d Sb(InputStream inputStream0) throws IOException {
            return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, inputStream0);
        }

        public static d Tb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static d Ub(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static d Vb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        @Override  // com.google.rpc.context.a$e
        public ByteString W7() {
            return ByteString.copyFromUtf8(this.presenter_);
        }

        @Override  // com.google.rpc.context.a$e
        public ByteString Wa(int v) {
            return ByteString.copyFromUtf8(((String)this.accessLevels_.get(v)));
        }

        public static d Wb(byte[] arr_b) throws InvalidProtocolBufferException {
            return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, arr_b);
        }

        public static d Xb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (d)GeneratedMessageLite.parseFrom(d.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void Yb(int v, String s) {
            s.getClass();
            this.Gb();
            this.accessLevels_.set(v, s);
        }

        private void Zb(int v, String s) {
            s.getClass();
            this.Hb();
            this.audiences_.set(v, s);
        }

        private void ac(Struct struct0) {
            struct0.getClass();
            this.claims_ = struct0;
        }

        @Override  // com.google.rpc.context.a$e
        public Struct b3() {
            return this.claims_ == null ? Struct.getDefaultInstance() : this.claims_;
        }

        private void bc(String s) {
            s.getClass();
            this.presenter_ = s;
        }

        private void cc(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.presenter_ = byteString0.toStringUtf8();
        }

        private void dc(String s) {
            s.getClass();
            this.principal_ = s;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new d();
                }
                case 2: {
                    return new com.google.rpc.context.a.d.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(d.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\t\u0005Ț", new Object[]{"principal_", "audiences_", "presenter_", "claims_", "accessLevels_"});
                }
                case 4: {
                    return d.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = d.PARSER;
                    if(parser0 == null) {
                        Class class0 = d.class;
                        synchronized(class0) {
                            parser0 = d.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(d.DEFAULT_INSTANCE);
                                d.PARSER = parser0;
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
            this.principal_ = byteString0.toStringUtf8();
        }

        @Override  // com.google.rpc.context.a$e
        public String f0() {
            return this.principal_;
        }

        @Override  // com.google.rpc.context.a$e
        public ByteString k0() {
            return ByteString.copyFromUtf8(this.principal_);
        }

        @Override  // com.google.rpc.context.a$e
        public int k1() {
            return this.accessLevels_.size();
        }

        public static Parser parser() {
            return d.DEFAULT_INSTANCE.getParserForType();
        }

        @Override  // com.google.rpc.context.a$e
        public String r3() [...] // 潜在的解密器

        @Override  // com.google.rpc.context.a$e
        public String ta(int v) {
            return (String)this.audiences_.get(v);
        }

        private void vb(String s) {
            s.getClass();
            this.Gb();
            this.accessLevels_.add(s);
        }

        private void wb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.Gb();
            this.accessLevels_.add(byteString0.toStringUtf8());
        }

        private void xb(Iterable iterable0) {
            this.Gb();
            AbstractMessageLite.addAll(iterable0, this.accessLevels_);
        }

        private void yb(Iterable iterable0) {
            this.Hb();
            AbstractMessageLite.addAll(iterable0, this.audiences_);
        }

        private void zb(String s) {
            s.getClass();
            this.Hb();
            this.audiences_.add(s);
        }
    }

    public interface e extends MessageLiteOrBuilder {
        String A9(int arg1);

        boolean I9();

        List K5();

        ByteString P7(int arg1);

        int R2();

        List S6();

        ByteString W7();

        ByteString Wa(int arg1);

        Struct b3();

        String f0();

        ByteString k0();

        int k1();

        String r3();

        String ta(int arg1);
    }

    public static final class f extends Builder implements b {
        private f() {
            super(a.DEFAULT_INSTANCE);
        }

        f(com.google.rpc.context.a.a a$a0) {
        }

        public f Ab() {
            this.copyOnWrite();
            ((a)this.instance).Db();
            return this;
        }

        public f Bb(com.google.rpc.context.a.b a$b0) {
            this.copyOnWrite();
            ((a)this.instance).Fb(a$b0);
            return this;
        }

        public f Cb(g a$g0) {
            this.copyOnWrite();
            ((a)this.instance).Gb(a$g0);
            return this;
        }

        public f Db(g a$g0) {
            this.copyOnWrite();
            ((a)this.instance).Hb(a$g0);
            return this;
        }

        @Override  // com.google.rpc.context.b
        public boolean E() {
            return ((a)this.instance).E();
        }

        public f Eb(i a$i0) {
            this.copyOnWrite();
            ((a)this.instance).Ib(a$i0);
            return this;
        }

        @Override  // com.google.rpc.context.b
        public m F() {
            return ((a)this.instance).F();
        }

        public f Fb(k a$k0) {
            this.copyOnWrite();
            ((a)this.instance).Jb(a$k0);
            return this;
        }

        public f Gb(m a$m0) {
            this.copyOnWrite();
            ((a)this.instance).Kb(a$m0);
            return this;
        }

        public f Hb(g a$g0) {
            this.copyOnWrite();
            ((a)this.instance).Lb(a$g0);
            return this;
        }

        public f Ib(com.google.rpc.context.a.b.a a$b$a0) {
            this.copyOnWrite();
            ((a)this.instance).ac(((com.google.rpc.context.a.b)a$b$a0.build()));
            return this;
        }

        @Override  // com.google.rpc.context.b
        public boolean J6() {
            return ((a)this.instance).J6();
        }

        public f Jb(com.google.rpc.context.a.b a$b0) {
            this.copyOnWrite();
            ((a)this.instance).ac(a$b0);
            return this;
        }

        public f Kb(com.google.rpc.context.a.g.a a$g$a0) {
            this.copyOnWrite();
            ((a)this.instance).bc(((g)a$g$a0.build()));
            return this;
        }

        public f Lb(g a$g0) {
            this.copyOnWrite();
            ((a)this.instance).bc(a$g0);
            return this;
        }

        public f Mb(com.google.rpc.context.a.g.a a$g$a0) {
            this.copyOnWrite();
            ((a)this.instance).cc(((g)a$g$a0.build()));
            return this;
        }

        @Override  // com.google.rpc.context.b
        public g N() {
            return ((a)this.instance).N();
        }

        @Override  // com.google.rpc.context.b
        public boolean N4() {
            return ((a)this.instance).N4();
        }

        @Override  // com.google.rpc.context.b
        public g N5() {
            return ((a)this.instance).N5();
        }

        public f Nb(g a$g0) {
            this.copyOnWrite();
            ((a)this.instance).cc(a$g0);
            return this;
        }

        public f Ob(com.google.rpc.context.a.i.a a$i$a0) {
            this.copyOnWrite();
            ((a)this.instance).dc(((i)a$i$a0.build()));
            return this;
        }

        public f Pb(i a$i0) {
            this.copyOnWrite();
            ((a)this.instance).dc(a$i0);
            return this;
        }

        @Override  // com.google.rpc.context.b
        public boolean Q8() {
            return ((a)this.instance).Q8();
        }

        public f Qb(com.google.rpc.context.a.k.a a$k$a0) {
            this.copyOnWrite();
            ((a)this.instance).ec(((k)a$k$a0.build()));
            return this;
        }

        @Override  // com.google.rpc.context.b
        public k R() {
            return ((a)this.instance).R();
        }

        public f Rb(k a$k0) {
            this.copyOnWrite();
            ((a)this.instance).ec(a$k0);
            return this;
        }

        @Override  // com.google.rpc.context.b
        public g S5() {
            return ((a)this.instance).S5();
        }

        public f Sb(com.google.rpc.context.a.m.a a$m$a0) {
            this.copyOnWrite();
            ((a)this.instance).fc(((m)a$m$a0.build()));
            return this;
        }

        public f Tb(m a$m0) {
            this.copyOnWrite();
            ((a)this.instance).fc(a$m0);
            return this;
        }

        public f Ub(com.google.rpc.context.a.g.a a$g$a0) {
            this.copyOnWrite();
            ((a)this.instance).gc(((g)a$g$a0.build()));
            return this;
        }

        public f Vb(g a$g0) {
            this.copyOnWrite();
            ((a)this.instance).gc(a$g0);
            return this;
        }

        @Override  // com.google.rpc.context.b
        public boolean Xa() {
            return ((a)this.instance).Xa();
        }

        @Override  // com.google.rpc.context.b
        public com.google.rpc.context.a.b jb() {
            return ((a)this.instance).jb();
        }

        @Override  // com.google.rpc.context.b
        public boolean n0() {
            return ((a)this.instance).n0();
        }

        public f ub() {
            this.copyOnWrite();
            ((a)this.instance).xb();
            return this;
        }

        public f vb() {
            this.copyOnWrite();
            ((a)this.instance).yb();
            return this;
        }

        @Override  // com.google.rpc.context.b
        public boolean w4() {
            return ((a)this.instance).w4();
        }

        public f wb() {
            this.copyOnWrite();
            ((a)this.instance).zb();
            return this;
        }

        public f xb() {
            this.copyOnWrite();
            ((a)this.instance).Ab();
            return this;
        }

        public f yb() {
            this.copyOnWrite();
            ((a)this.instance).Bb();
            return this;
        }

        @Override  // com.google.rpc.context.b
        public i z() {
            return ((a)this.instance).z();
        }

        public f zb() {
            this.copyOnWrite();
            ((a)this.instance).Cb();
            return this;
        }
    }

    public static final class g extends GeneratedMessageLite implements h {
        public static final class com.google.rpc.context.a.g.a extends Builder implements h {
            private com.google.rpc.context.a.g.a() {
                super(g.DEFAULT_INSTANCE);
            }

            com.google.rpc.context.a.g.a(com.google.rpc.context.a.a a$a0) {
            }

            public com.google.rpc.context.a.g.a Ab(String s, String s1) {
                s.getClass();
                s1.getClass();
                this.copyOnWrite();
                ((g)this.instance).La().put(s, s1);
                return this;
            }

            public com.google.rpc.context.a.g.a Bb(String s) {
                s.getClass();
                this.copyOnWrite();
                ((g)this.instance).La().remove(s);
                return this;
            }

            public com.google.rpc.context.a.g.a Cb(String s) {
                this.copyOnWrite();
                ((g)this.instance).Kb(s);
                return this;
            }

            public com.google.rpc.context.a.g.a Db(ByteString byteString0) {
                this.copyOnWrite();
                ((g)this.instance).Lb(byteString0);
                return this;
            }

            public com.google.rpc.context.a.g.a Eb(long v) {
                this.copyOnWrite();
                ((g)this.instance).Mb(v);
                return this;
            }

            public com.google.rpc.context.a.g.a Fb(String s) {
                this.copyOnWrite();
                ((g)this.instance).Nb(s);
                return this;
            }

            public com.google.rpc.context.a.g.a Gb(ByteString byteString0) {
                this.copyOnWrite();
                ((g)this.instance).Ob(byteString0);
                return this;
            }

            public com.google.rpc.context.a.g.a Hb(String s) {
                this.copyOnWrite();
                ((g)this.instance).Pb(s);
                return this;
            }

            public com.google.rpc.context.a.g.a Ib(ByteString byteString0) {
                this.copyOnWrite();
                ((g)this.instance).Qb(byteString0);
                return this;
            }

            @Override  // com.google.rpc.context.a$h
            public long Q1() {
                return ((g)this.instance).Q1();
            }

            @Override  // com.google.rpc.context.a$h
            public ByteString T() {
                return ((g)this.instance).T();
            }

            @Override  // com.google.rpc.context.a$h
            public int d() {
                return ((g)this.instance).n().size();
            }

            @Override  // com.google.rpc.context.a$h
            public String f0() {
                return ((g)this.instance).f0();
            }

            @Override  // com.google.rpc.context.a$h
            public String k(String s) {
                s.getClass();
                Map map0 = ((g)this.instance).n();
                if(!map0.containsKey(s)) {
                    throw new IllegalArgumentException();
                }
                return (String)map0.get(s);
            }

            @Override  // com.google.rpc.context.a$h
            public ByteString k0() {
                return ((g)this.instance).k0();
            }

            @Override  // com.google.rpc.context.a$h
            public Map n() {
                return DesugarCollections.unmodifiableMap(((g)this.instance).n());
            }

            @Override  // com.google.rpc.context.a$h
            public boolean o(String s) {
                s.getClass();
                return ((g)this.instance).n().containsKey(s);
            }

            @Override  // com.google.rpc.context.a$h
            @Deprecated
            public Map p() {
                return this.n();
            }

            @Override  // com.google.rpc.context.a$h
            public String q(String s, String s1) {
                s.getClass();
                Map map0 = ((g)this.instance).n();
                return map0.containsKey(s) ? ((String)map0.get(s)) : s1;
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.rpc.context.a$h
            public String s0() {
                return "";
            }

            public com.google.rpc.context.a.g.a ub() {
                this.copyOnWrite();
                ((g)this.instance).v8();
                return this;
            }

            public com.google.rpc.context.a.g.a vb() {
                this.copyOnWrite();
                ((g)this.instance).La().clear();
                return this;
            }

            @Override  // com.google.rpc.context.a$h
            public ByteString w5() {
                return ((g)this.instance).w5();
            }

            public com.google.rpc.context.a.g.a wb() {
                this.copyOnWrite();
                ((g)this.instance).A8();
                return this;
            }

            public com.google.rpc.context.a.g.a xb() {
                this.copyOnWrite();
                ((g)this.instance).j9();
                return this;
            }

            public com.google.rpc.context.a.g.a yb() {
                this.copyOnWrite();
                ((g)this.instance).ca();
                return this;
            }

            @Override  // com.google.rpc.context.a$h
            public String z3() {
                return ((g)this.instance).z3();
            }

            public com.google.rpc.context.a.g.a zb(Map map0) {
                this.copyOnWrite();
                ((g)this.instance).La().putAll(map0);
                return this;
            }
        }

        static final class com.google.rpc.context.a.g.b {
            static final MapEntryLite a;

            static {
                com.google.rpc.context.a.g.b.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.STRING, "");
            }
        }

        private static final g DEFAULT_INSTANCE = null;
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        private static volatile Parser PARSER = null;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private String ip_;
        private MapFieldLite labels_;
        private long port_;
        private String principal_;
        private String regionCode_;

        static {
            g a$g0 = new g();
            g.DEFAULT_INSTANCE = a$g0;
            GeneratedMessageLite.registerDefaultInstance(g.class, a$g0);
        }

        private g() {
            this.labels_ = MapFieldLite.emptyMapField();
            this.ip_ = "";
            this.principal_ = "";
            this.regionCode_ = "";
        }

        private void A8() {
            this.port_ = 0L;
        }

        public static g Ab(ByteString byteString0) throws InvalidProtocolBufferException {
            return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteString0);
        }

        public static g Bb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static g Cb(CodedInputStream codedInputStream0) throws IOException {
            return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static g Db(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static g Eb(InputStream inputStream0) throws IOException {
            return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, inputStream0);
        }

        public static g Fb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static g Gb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static g Hb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static g Ib(byte[] arr_b) throws InvalidProtocolBufferException {
            return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, arr_b);
        }

        public static g Ja() {
            return g.DEFAULT_INSTANCE;
        }

        public static g Jb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void Kb(String s) {
            s.getClass();
            this.ip_ = s;
        }

        private Map La() {
            return this.vb();
        }

        private void Lb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.ip_ = byteString0.toStringUtf8();
        }

        private void Mb(long v) {
            this.port_ = v;
        }

        private void Nb(String s) {
            s.getClass();
            this.principal_ = s;
        }

        private void Ob(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.principal_ = byteString0.toStringUtf8();
        }

        private void Pb(String s) {
            s.getClass();
            this.regionCode_ = s;
        }

        @Override  // com.google.rpc.context.a$h
        public long Q1() {
            return this.port_;
        }

        private void Qb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.regionCode_ = byteString0.toStringUtf8();
        }

        @Override  // com.google.rpc.context.a$h
        public ByteString T() {
            return ByteString.copyFromUtf8(this.regionCode_);
        }

        private void ca() {
            this.regionCode_ = "";
        }

        @Override  // com.google.rpc.context.a$h
        public int d() {
            return this.ub().size();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new g();
                }
                case 2: {
                    return new com.google.rpc.context.a.g.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(g.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u00062\u0007Ȉ\bȈ", new Object[]{"ip_", "port_", "labels_", com.google.rpc.context.a.g.b.a, "principal_", "regionCode_"});
                }
                case 4: {
                    return g.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = g.PARSER;
                    if(parser0 == null) {
                        Class class0 = g.class;
                        synchronized(class0) {
                            parser0 = g.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(g.DEFAULT_INSTANCE);
                                g.PARSER = parser0;
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

        @Override  // com.google.rpc.context.a$h
        public String f0() {
            return this.principal_;
        }

        private void j9() {
            this.principal_ = "";
        }

        @Override  // com.google.rpc.context.a$h
        public String k(String s) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.ub();
            if(!mapFieldLite0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (String)mapFieldLite0.get(s);
        }

        @Override  // com.google.rpc.context.a$h
        public ByteString k0() {
            return ByteString.copyFromUtf8(this.principal_);
        }

        @Override  // com.google.rpc.context.a$h
        public Map n() {
            return DesugarCollections.unmodifiableMap(this.ub());
        }

        @Override  // com.google.rpc.context.a$h
        public boolean o(String s) {
            s.getClass();
            return this.ub().containsKey(s);
        }

        @Override  // com.google.rpc.context.a$h
        @Deprecated
        public Map p() {
            return this.n();
        }

        public static Parser parser() {
            return g.DEFAULT_INSTANCE.getParserForType();
        }

        @Override  // com.google.rpc.context.a$h
        public String q(String s, String s1) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.ub();
            return mapFieldLite0.containsKey(s) ? ((String)mapFieldLite0.get(s)) : s1;
        }

        @Override  // com.google.rpc.context.a$h
        public String s0() [...] // 潜在的解密器

        private MapFieldLite ub() {
            return this.labels_;
        }

        private void v8() {
            this.ip_ = "";
        }

        private MapFieldLite vb() {
            if(!this.labels_.isMutable()) {
                this.labels_ = this.labels_.mutableCopy();
            }
            return this.labels_;
        }

        @Override  // com.google.rpc.context.a$h
        public ByteString w5() {
            return ByteString.copyFromUtf8(this.ip_);
        }

        public static com.google.rpc.context.a.g.a wb() {
            return (com.google.rpc.context.a.g.a)g.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.rpc.context.a.g.a xb(g a$g0) {
            return (com.google.rpc.context.a.g.a)g.DEFAULT_INSTANCE.createBuilder(a$g0);
        }

        public static g yb(InputStream inputStream0) throws IOException {
            return (g)GeneratedMessageLite.parseDelimitedFrom(g.DEFAULT_INSTANCE, inputStream0);
        }

        @Override  // com.google.rpc.context.a$h
        public String z3() {
            return this.ip_;
        }

        public static g zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (g)GeneratedMessageLite.parseDelimitedFrom(g.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }
    }

    public interface h extends MessageLiteOrBuilder {
        long Q1();

        ByteString T();

        int d();

        String f0();

        String k(String arg1);

        ByteString k0();

        Map n();

        boolean o(String arg1);

        @Deprecated
        Map p();

        String q(String arg1, String arg2);

        String s0();

        ByteString w5();

        String z3();
    }

    public static final class i extends GeneratedMessageLite implements j {
        public static final class com.google.rpc.context.a.i.a extends Builder implements j {
            private com.google.rpc.context.a.i.a() {
                super(i.DEFAULT_INSTANCE);
            }

            com.google.rpc.context.a.i.a(com.google.rpc.context.a.a a$a0) {
            }

            public com.google.rpc.context.a.i.a Ab() {
                this.copyOnWrite();
                ((i)this.instance).Mb();
                return this;
            }

            public com.google.rpc.context.a.i.a Bb() {
                this.copyOnWrite();
                ((i)this.instance).Nb();
                return this;
            }

            public com.google.rpc.context.a.i.a Cb() {
                this.copyOnWrite();
                ((i)this.instance).clearReason();
                return this;
            }

            public com.google.rpc.context.a.i.a Db() {
                this.copyOnWrite();
                ((i)this.instance).Ob();
                return this;
            }

            public com.google.rpc.context.a.i.a Eb() {
                this.copyOnWrite();
                ((i)this.instance).Pb();
                return this;
            }

            public com.google.rpc.context.a.i.a Fb() {
                this.copyOnWrite();
                ((i)this.instance).Qb();
                return this;
            }

            public com.google.rpc.context.a.i.a Gb(d a$d0) {
                this.copyOnWrite();
                ((i)this.instance).Vb(a$d0);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            @Deprecated
            public Map H() {
                return this.W0();
            }

            public com.google.rpc.context.a.i.a Hb(Timestamp timestamp0) {
                this.copyOnWrite();
                ((i)this.instance).Wb(timestamp0);
                return this;
            }

            public com.google.rpc.context.a.i.a Ib(Map map0) {
                this.copyOnWrite();
                ((i)this.instance).Sb().putAll(map0);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public Timestamp J() {
                return ((i)this.instance).J();
            }

            public com.google.rpc.context.a.i.a Jb(String s, String s1) {
                s.getClass();
                s1.getClass();
                this.copyOnWrite();
                ((i)this.instance).Sb().put(s, s1);
                return this;
            }

            public com.google.rpc.context.a.i.a Kb(String s) {
                s.getClass();
                this.copyOnWrite();
                ((i)this.instance).Sb().remove(s);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public ByteString L3() {
                return ((i)this.instance).L3();
            }

            public com.google.rpc.context.a.i.a Lb(com.google.rpc.context.a.d.a a$d$a0) {
                this.copyOnWrite();
                ((i)this.instance).lc(((d)a$d$a0.build()));
                return this;
            }

            public com.google.rpc.context.a.i.a Mb(d a$d0) {
                this.copyOnWrite();
                ((i)this.instance).lc(a$d0);
                return this;
            }

            public com.google.rpc.context.a.i.a Nb(String s) {
                this.copyOnWrite();
                ((i)this.instance).mc(s);
                return this;
            }

            public com.google.rpc.context.a.i.a Ob(ByteString byteString0) {
                this.copyOnWrite();
                ((i)this.instance).nc(byteString0);
                return this;
            }

            public com.google.rpc.context.a.i.a Pb(String s) {
                this.copyOnWrite();
                ((i)this.instance).oc(s);
                return this;
            }

            public com.google.rpc.context.a.i.a Qb(ByteString byteString0) {
                this.copyOnWrite();
                ((i)this.instance).pc(byteString0);
                return this;
            }

            public com.google.rpc.context.a.i.a Rb(String s) {
                this.copyOnWrite();
                ((i)this.instance).qc(s);
                return this;
            }

            public com.google.rpc.context.a.i.a Sb(ByteString byteString0) {
                this.copyOnWrite();
                ((i)this.instance).rc(byteString0);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public String T2() {
                return ((i)this.instance).T2();
            }

            public com.google.rpc.context.a.i.a Tb(String s) {
                this.copyOnWrite();
                ((i)this.instance).sc(s);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public String U() {
                return ((i)this.instance).U();
            }

            @Override  // com.google.rpc.context.a$j
            public ByteString U0() {
                return ((i)this.instance).U0();
            }

            public com.google.rpc.context.a.i.a Ub(ByteString byteString0) {
                this.copyOnWrite();
                ((i)this.instance).tc(byteString0);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public String V7() {
                return ((i)this.instance).V7();
            }

            public com.google.rpc.context.a.i.a Vb(String s) {
                this.copyOnWrite();
                ((i)this.instance).uc(s);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public boolean W() {
                return ((i)this.instance).W();
            }

            @Override  // com.google.rpc.context.a$j
            public Map W0() {
                return DesugarCollections.unmodifiableMap(((i)this.instance).W0());
            }

            public com.google.rpc.context.a.i.a Wb(ByteString byteString0) {
                this.copyOnWrite();
                ((i)this.instance).vc(byteString0);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public String X0(String s) {
                s.getClass();
                Map map0 = ((i)this.instance).W0();
                if(!map0.containsKey(s)) {
                    throw new IllegalArgumentException();
                }
                return (String)map0.get(s);
            }

            public com.google.rpc.context.a.i.a Xb(String s) {
                this.copyOnWrite();
                ((i)this.instance).wc(s);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public ByteString Y0() {
                return ((i)this.instance).Y0();
            }

            public com.google.rpc.context.a.i.a Yb(ByteString byteString0) {
                this.copyOnWrite();
                ((i)this.instance).xc(byteString0);
                return this;
            }

            public com.google.rpc.context.a.i.a Zb(String s) {
                this.copyOnWrite();
                ((i)this.instance).yc(s);
                return this;
            }

            public com.google.rpc.context.a.i.a ac(ByteString byteString0) {
                this.copyOnWrite();
                ((i)this.instance).zc(byteString0);
                return this;
            }

            public com.google.rpc.context.a.i.a bc(String s) {
                this.copyOnWrite();
                ((i)this.instance).Ac(s);
                return this;
            }

            public com.google.rpc.context.a.i.a cc(ByteString byteString0) {
                this.copyOnWrite();
                ((i)this.instance).Bc(byteString0);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public String d0(String s, String s1) {
                s.getClass();
                Map map0 = ((i)this.instance).W0();
                return map0.containsKey(s) ? ((String)map0.get(s)) : s1;
            }

            public com.google.rpc.context.a.i.a dc(long v) {
                this.copyOnWrite();
                ((i)this.instance).Cc(v);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public ByteString e1() {
                return ((i)this.instance).e1();
            }

            public com.google.rpc.context.a.i.a ec(com.google.protobuf.Timestamp.Builder timestamp$Builder0) {
                this.copyOnWrite();
                ((i)this.instance).Dc(((Timestamp)timestamp$Builder0.build()));
                return this;
            }

            public com.google.rpc.context.a.i.a fc(Timestamp timestamp0) {
                this.copyOnWrite();
                ((i)this.instance).Dc(timestamp0);
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public String getId() {
                return ((i)this.instance).getId();
            }

            @Override  // com.google.rpc.context.a$j
            public String getMethod() {
                return ((i)this.instance).getMethod();
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.rpc.context.a$j
            public String getPath() {
                return "";
            }

            @Override  // com.google.rpc.context.a$j
            public String getReason() {
                return ((i)this.instance).getReason();
            }

            @Override  // com.google.rpc.context.a$j
            public long getSize() {
                return ((i)this.instance).getSize();
            }

            @Override  // com.google.rpc.context.a$j
            public int i0() {
                return ((i)this.instance).W0().size();
            }

            @Override  // com.google.rpc.context.a$j
            public ByteString j() {
                return ((i)this.instance).j();
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.rpc.context.a$j
            public String l() {
                return "";
            }

            @Override  // com.google.rpc.context.a$j
            public ByteString m() {
                return ((i)this.instance).m();
            }

            @Override  // com.google.rpc.context.a$j
            public d m4() {
                return ((i)this.instance).m4();
            }

            @Override  // com.google.rpc.context.a$j
            public boolean p9() {
                return ((i)this.instance).p9();
            }

            @Override  // com.google.rpc.context.a$j
            public ByteString t5() {
                return ((i)this.instance).t5();
            }

            public com.google.rpc.context.a.i.a ub() {
                this.copyOnWrite();
                ((i)this.instance).Jb();
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public ByteString v6() {
                return ((i)this.instance).v6();
            }

            public com.google.rpc.context.a.i.a vb() {
                this.copyOnWrite();
                ((i)this.instance).Sb().clear();
                return this;
            }

            public com.google.rpc.context.a.i.a wb() {
                this.copyOnWrite();
                ((i)this.instance).Kb();
                return this;
            }

            public com.google.rpc.context.a.i.a xb() {
                this.copyOnWrite();
                ((i)this.instance).Lb();
                return this;
            }

            public com.google.rpc.context.a.i.a yb() {
                this.copyOnWrite();
                ((i)this.instance).clearMethod();
                return this;
            }

            @Override  // com.google.rpc.context.a$j
            public boolean z0(String s) {
                s.getClass();
                return ((i)this.instance).W0().containsKey(s);
            }

            public com.google.rpc.context.a.i.a zb() {
                this.copyOnWrite();
                ((i)this.instance).clearPath();
                return this;
            }
        }

        static final class com.google.rpc.context.a.i.b {
            static final MapEntryLite a;

            static {
                com.google.rpc.context.a.i.b.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.STRING, "");
            }
        }

        public static final int AUTH_FIELD_NUMBER = 13;
        private static final i DEFAULT_INSTANCE = null;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private d auth_;
        private MapFieldLite headers_;
        private String host_;
        private String id_;
        private String method_;
        private String path_;
        private String protocol_;
        private String query_;
        private String reason_;
        private String scheme_;
        private long size_;
        private Timestamp time_;

        static {
            i a$i0 = new i();
            i.DEFAULT_INSTANCE = a$i0;
            GeneratedMessageLite.registerDefaultInstance(i.class, a$i0);
        }

        private i() {
            this.headers_ = MapFieldLite.emptyMapField();
            this.id_ = "";
            this.method_ = "";
            this.path_ = "";
            this.host_ = "";
            this.scheme_ = "";
            this.query_ = "";
            this.protocol_ = "";
            this.reason_ = "";
        }

        private void Ac(String s) {
            s.getClass();
            this.scheme_ = s;
        }

        private void Bc(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.scheme_ = byteString0.toStringUtf8();
        }

        private void Cc(long v) {
            this.size_ = v;
        }

        private void Dc(Timestamp timestamp0) {
            timestamp0.getClass();
            this.time_ = timestamp0;
        }

        @Override  // com.google.rpc.context.a$j
        @Deprecated
        public Map H() {
            return this.W0();
        }

        @Override  // com.google.rpc.context.a$j
        public Timestamp J() {
            return this.time_ == null ? Timestamp.getDefaultInstance() : this.time_;
        }

        private void Jb() {
            this.auth_ = null;
        }

        private void Kb() {
            this.host_ = "";
        }

        @Override  // com.google.rpc.context.a$j
        public ByteString L3() {
            return ByteString.copyFromUtf8(this.method_);
        }

        private void Lb() {
            this.id_ = "";
        }

        private void Mb() {
            this.protocol_ = i.Rb().l();
        }

        private void Nb() {
            this.query_ = "";
        }

        private void Ob() {
            this.scheme_ = "";
        }

        private void Pb() {
            this.size_ = 0L;
        }

        private void Qb() {
            this.time_ = null;
        }

        public static i Rb() {
            return i.DEFAULT_INSTANCE;
        }

        private Map Sb() {
            return this.Ub();
        }

        @Override  // com.google.rpc.context.a$j
        public String T2() {
            return this.scheme_;
        }

        private MapFieldLite Tb() {
            return this.headers_;
        }

        @Override  // com.google.rpc.context.a$j
        public String U() {
            return this.query_;
        }

        @Override  // com.google.rpc.context.a$j
        public ByteString U0() {
            return ByteString.copyFromUtf8(this.reason_);
        }

        private MapFieldLite Ub() {
            if(!this.headers_.isMutable()) {
                this.headers_ = this.headers_.mutableCopy();
            }
            return this.headers_;
        }

        @Override  // com.google.rpc.context.a$j
        public String V7() {
            return this.host_;
        }

        private void Vb(d a$d0) {
            a$d0.getClass();
            if(this.auth_ != null && this.auth_ != d.Ib()) {
                this.auth_ = (d)((com.google.rpc.context.a.d.a)d.Lb(this.auth_).mergeFrom(a$d0)).buildPartial();
                return;
            }
            this.auth_ = a$d0;
        }

        @Override  // com.google.rpc.context.a$j
        public boolean W() {
            return this.time_ != null;
        }

        @Override  // com.google.rpc.context.a$j
        public Map W0() {
            return DesugarCollections.unmodifiableMap(this.Tb());
        }

        private void Wb(Timestamp timestamp0) {
            timestamp0.getClass();
            if(this.time_ != null && this.time_ != Timestamp.getDefaultInstance()) {
                this.time_ = (Timestamp)((com.google.protobuf.Timestamp.Builder)Timestamp.newBuilder(this.time_).mergeFrom(timestamp0)).buildPartial();
                return;
            }
            this.time_ = timestamp0;
        }

        @Override  // com.google.rpc.context.a$j
        public String X0(String s) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.Tb();
            if(!mapFieldLite0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (String)mapFieldLite0.get(s);
        }

        public static com.google.rpc.context.a.i.a Xb() {
            return (com.google.rpc.context.a.i.a)i.DEFAULT_INSTANCE.createBuilder();
        }

        @Override  // com.google.rpc.context.a$j
        public ByteString Y0() {
            return ByteString.copyFromUtf8(this.query_);
        }

        public static com.google.rpc.context.a.i.a Yb(i a$i0) {
            return (com.google.rpc.context.a.i.a)i.DEFAULT_INSTANCE.createBuilder(a$i0);
        }

        public static i Zb(InputStream inputStream0) throws IOException {
            return (i)GeneratedMessageLite.parseDelimitedFrom(i.DEFAULT_INSTANCE, inputStream0);
        }

        public static i ac(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (i)GeneratedMessageLite.parseDelimitedFrom(i.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static i bc(ByteString byteString0) throws InvalidProtocolBufferException {
            return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteString0);
        }

        public static i cc(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        private void clearMethod() {
            this.method_ = "";
        }

        private void clearPath() {
            this.path_ = "";
        }

        private void clearReason() {
            this.reason_ = "";
        }

        @Override  // com.google.rpc.context.a$j
        public String d0(String s, String s1) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.Tb();
            return mapFieldLite0.containsKey(s) ? ((String)mapFieldLite0.get(s)) : s1;
        }

        public static i dc(CodedInputStream codedInputStream0) throws IOException {
            return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, codedInputStream0);
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new i();
                }
                case 2: {
                    return new com.google.rpc.context.a.i.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(i.DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\r\f\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\t\t\n\u0002\u000BȈ\fȈ\r\t", new Object[]{"id_", "method_", "headers_", com.google.rpc.context.a.i.b.a, "path_", "host_", "scheme_", "query_", "time_", "size_", "protocol_", "reason_", "auth_"});
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

        @Override  // com.google.rpc.context.a$j
        public ByteString e1() {
            return ByteString.copyFromUtf8(this.path_);
        }

        public static i ec(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static i fc(InputStream inputStream0) throws IOException {
            return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, inputStream0);
        }

        public static i gc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        @Override  // com.google.rpc.context.a$j
        public String getId() {
            return this.id_;
        }

        @Override  // com.google.rpc.context.a$j
        public String getMethod() {
            return this.method_;
        }

        @Override  // com.google.rpc.context.a$j
        public String getPath() [...] // 潜在的解密器

        @Override  // com.google.rpc.context.a$j
        public String getReason() {
            return this.reason_;
        }

        @Override  // com.google.rpc.context.a$j
        public long getSize() {
            return this.size_;
        }

        public static i hc(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteBuffer0);
        }

        @Override  // com.google.rpc.context.a$j
        public int i0() {
            return this.Tb().size();
        }

        public static i ic(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        @Override  // com.google.rpc.context.a$j
        public ByteString j() {
            return ByteString.copyFromUtf8(this.protocol_);
        }

        public static i jc(byte[] arr_b) throws InvalidProtocolBufferException {
            return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, arr_b);
        }

        public static i kc(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        @Override  // com.google.rpc.context.a$j
        public String l() [...] // 潜在的解密器

        private void lc(d a$d0) {
            a$d0.getClass();
            this.auth_ = a$d0;
        }

        @Override  // com.google.rpc.context.a$j
        public ByteString m() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override  // com.google.rpc.context.a$j
        public d m4() {
            return this.auth_ == null ? d.Ib() : this.auth_;
        }

        private void mc(String s) {
            s.getClass();
            this.host_ = s;
        }

        private void nc(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.host_ = byteString0.toStringUtf8();
        }

        private void oc(String s) {
            s.getClass();
            this.id_ = s;
        }

        @Override  // com.google.rpc.context.a$j
        public boolean p9() {
            return this.auth_ != null;
        }

        public static Parser parser() {
            return i.DEFAULT_INSTANCE.getParserForType();
        }

        private void pc(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.id_ = byteString0.toStringUtf8();
        }

        private void qc(String s) {
            s.getClass();
            this.method_ = s;
        }

        private void rc(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.method_ = byteString0.toStringUtf8();
        }

        private void sc(String s) {
            s.getClass();
            this.path_ = s;
        }

        @Override  // com.google.rpc.context.a$j
        public ByteString t5() {
            return ByteString.copyFromUtf8(this.scheme_);
        }

        private void tc(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.path_ = byteString0.toStringUtf8();
        }

        private void uc(String s) {
            s.getClass();
            this.protocol_ = s;
        }

        @Override  // com.google.rpc.context.a$j
        public ByteString v6() {
            return ByteString.copyFromUtf8(this.host_);
        }

        private void vc(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.protocol_ = byteString0.toStringUtf8();
        }

        private void wc(String s) {
            s.getClass();
            this.query_ = s;
        }

        private void xc(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.query_ = byteString0.toStringUtf8();
        }

        private void yc(String s) {
            s.getClass();
            this.reason_ = s;
        }

        @Override  // com.google.rpc.context.a$j
        public boolean z0(String s) {
            s.getClass();
            return this.Tb().containsKey(s);
        }

        private void zc(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.reason_ = byteString0.toStringUtf8();
        }
    }

    public interface j extends MessageLiteOrBuilder {
        @Deprecated
        Map H();

        Timestamp J();

        ByteString L3();

        String T2();

        String U();

        ByteString U0();

        String V7();

        boolean W();

        Map W0();

        String X0(String arg1);

        ByteString Y0();

        String d0(String arg1, String arg2);

        ByteString e1();

        String getId();

        String getMethod();

        String getPath();

        String getReason();

        long getSize();

        int i0();

        ByteString j();

        String l();

        ByteString m();

        d m4();

        boolean p9();

        ByteString t5();

        ByteString v6();

        boolean z0(String arg1);
    }

    public static final class k extends GeneratedMessageLite implements l {
        public static final class com.google.rpc.context.a.k.a extends Builder implements l {
            private com.google.rpc.context.a.k.a() {
                super(k.DEFAULT_INSTANCE);
            }

            com.google.rpc.context.a.k.a(com.google.rpc.context.a.a a$a0) {
            }

            public com.google.rpc.context.a.k.a Ab(String s) {
                s.getClass();
                this.copyOnWrite();
                ((k)this.instance).Z7().remove(s);
                return this;
            }

            public com.google.rpc.context.a.k.a Bb(String s) {
                this.copyOnWrite();
                ((k)this.instance).setName(s);
                return this;
            }

            public com.google.rpc.context.a.k.a Cb(ByteString byteString0) {
                this.copyOnWrite();
                ((k)this.instance).setNameBytes(byteString0);
                return this;
            }

            public com.google.rpc.context.a.k.a Db(String s) {
                this.copyOnWrite();
                ((k)this.instance).Eb(s);
                return this;
            }

            public com.google.rpc.context.a.k.a Eb(ByteString byteString0) {
                this.copyOnWrite();
                ((k)this.instance).Fb(byteString0);
                return this;
            }

            public com.google.rpc.context.a.k.a Fb(String s) {
                this.copyOnWrite();
                ((k)this.instance).setType(s);
                return this;
            }

            public com.google.rpc.context.a.k.a Gb(ByteString byteString0) {
                this.copyOnWrite();
                ((k)this.instance).setTypeBytes(byteString0);
                return this;
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.rpc.context.a$l
            public String c0() {
                return "";
            }

            @Override  // com.google.rpc.context.a$l
            public int d() {
                return ((k)this.instance).n().size();
            }

            @Override  // com.google.rpc.context.a$l
            public ByteString g0() {
                return ((k)this.instance).g0();
            }

            @Override  // com.google.rpc.context.a$l
            public String getName() {
                return ((k)this.instance).getName();
            }

            @Override  // com.google.rpc.context.a$l
            public ByteString getNameBytes() {
                return ((k)this.instance).getNameBytes();
            }

            @Override  // com.google.rpc.context.a$l
            public String getType() {
                return ((k)this.instance).getType();
            }

            @Override  // com.google.rpc.context.a$l
            public ByteString getTypeBytes() {
                return ((k)this.instance).getTypeBytes();
            }

            @Override  // com.google.rpc.context.a$l
            public String k(String s) {
                s.getClass();
                Map map0 = ((k)this.instance).n();
                if(!map0.containsKey(s)) {
                    throw new IllegalArgumentException();
                }
                return (String)map0.get(s);
            }

            @Override  // com.google.rpc.context.a$l
            public Map n() {
                return DesugarCollections.unmodifiableMap(((k)this.instance).n());
            }

            @Override  // com.google.rpc.context.a$l
            public boolean o(String s) {
                s.getClass();
                return ((k)this.instance).n().containsKey(s);
            }

            @Override  // com.google.rpc.context.a$l
            @Deprecated
            public Map p() {
                return this.n();
            }

            @Override  // com.google.rpc.context.a$l
            public String q(String s, String s1) {
                s.getClass();
                Map map0 = ((k)this.instance).n();
                return map0.containsKey(s) ? ((String)map0.get(s)) : s1;
            }

            public com.google.rpc.context.a.k.a ub() {
                this.copyOnWrite();
                ((k)this.instance).Z7().clear();
                return this;
            }

            public com.google.rpc.context.a.k.a vb() {
                this.copyOnWrite();
                ((k)this.instance).clearName();
                return this;
            }

            public com.google.rpc.context.a.k.a wb() {
                this.copyOnWrite();
                ((k)this.instance).clearService();
                return this;
            }

            public com.google.rpc.context.a.k.a xb() {
                this.copyOnWrite();
                ((k)this.instance).clearType();
                return this;
            }

            public com.google.rpc.context.a.k.a yb(Map map0) {
                this.copyOnWrite();
                ((k)this.instance).Z7().putAll(map0);
                return this;
            }

            public com.google.rpc.context.a.k.a zb(String s, String s1) {
                s.getClass();
                s1.getClass();
                this.copyOnWrite();
                ((k)this.instance).Z7().put(s, s1);
                return this;
            }
        }

        static final class com.google.rpc.context.a.k.b {
            static final MapEntryLite a;

            static {
                com.google.rpc.context.a.k.b.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.STRING, "");
            }
        }

        private static final k DEFAULT_INSTANCE = null;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private MapFieldLite labels_;
        private String name_;
        private String service_;
        private String type_;

        static {
            k a$k0 = new k();
            k.DEFAULT_INSTANCE = a$k0;
            GeneratedMessageLite.registerDefaultInstance(k.class, a$k0);
        }

        private k() {
            this.labels_ = MapFieldLite.emptyMapField();
            this.service_ = "";
            this.name_ = "";
            this.type_ = "";
        }

        private MapFieldLite A8() {
            if(!this.labels_.isMutable()) {
                this.labels_ = this.labels_.mutableCopy();
            }
            return this.labels_;
        }

        public static k Ab(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static k Bb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static k Cb(byte[] arr_b) throws InvalidProtocolBufferException {
            return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, arr_b);
        }

        public static k Db(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void Eb(String s) {
            s.getClass();
            this.service_ = s;
        }

        private void Fb(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.service_ = byteString0.toStringUtf8();
        }

        public static k Ja(InputStream inputStream0) throws IOException {
            return (k)GeneratedMessageLite.parseDelimitedFrom(k.DEFAULT_INSTANCE, inputStream0);
        }

        public static k La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (k)GeneratedMessageLite.parseDelimitedFrom(k.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static k M6() {
            return k.DEFAULT_INSTANCE;
        }

        private Map Z7() {
            return this.A8();
        }

        @Override  // com.google.rpc.context.a$l
        public String c0() [...] // 潜在的解密器

        public static com.google.rpc.context.a.k.a ca(k a$k0) {
            return (com.google.rpc.context.a.k.a)k.DEFAULT_INSTANCE.createBuilder(a$k0);
        }

        private void clearName() {
            this.name_ = "";
        }

        private void clearService() {
            this.service_ = "";
        }

        private void clearType() {
            this.type_ = "";
        }

        @Override  // com.google.rpc.context.a$l
        public int d() {
            return this.v8().size();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new k();
                }
                case 2: {
                    return new com.google.rpc.context.a.k.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(k.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"service_", "name_", "type_", "labels_", com.google.rpc.context.a.k.b.a});
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

        @Override  // com.google.rpc.context.a$l
        public ByteString g0() {
            return ByteString.copyFromUtf8(this.service_);
        }

        @Override  // com.google.rpc.context.a$l
        public String getName() {
            return this.name_;
        }

        @Override  // com.google.rpc.context.a$l
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override  // com.google.rpc.context.a$l
        public String getType() {
            return this.type_;
        }

        @Override  // com.google.rpc.context.a$l
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        public static com.google.rpc.context.a.k.a j9() {
            return (com.google.rpc.context.a.k.a)k.DEFAULT_INSTANCE.createBuilder();
        }

        @Override  // com.google.rpc.context.a$l
        public String k(String s) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.v8();
            if(!mapFieldLite0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (String)mapFieldLite0.get(s);
        }

        @Override  // com.google.rpc.context.a$l
        public Map n() {
            return DesugarCollections.unmodifiableMap(this.v8());
        }

        @Override  // com.google.rpc.context.a$l
        public boolean o(String s) {
            s.getClass();
            return this.v8().containsKey(s);
        }

        @Override  // com.google.rpc.context.a$l
        @Deprecated
        public Map p() {
            return this.n();
        }

        public static Parser parser() {
            return k.DEFAULT_INSTANCE.getParserForType();
        }

        @Override  // com.google.rpc.context.a$l
        public String q(String s, String s1) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.v8();
            return mapFieldLite0.containsKey(s) ? ((String)mapFieldLite0.get(s)) : s1;
        }

        private void setName(String s) {
            s.getClass();
            this.name_ = s;
        }

        private void setNameBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.name_ = byteString0.toStringUtf8();
        }

        private void setType(String s) {
            s.getClass();
            this.type_ = s;
        }

        private void setTypeBytes(ByteString byteString0) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString0);
            this.type_ = byteString0.toStringUtf8();
        }

        public static k ub(ByteString byteString0) throws InvalidProtocolBufferException {
            return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteString0);
        }

        private MapFieldLite v8() {
            return this.labels_;
        }

        public static k vb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static k wb(CodedInputStream codedInputStream0) throws IOException {
            return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static k xb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static k yb(InputStream inputStream0) throws IOException {
            return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, inputStream0);
        }

        public static k zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }
    }

    public interface l extends MessageLiteOrBuilder {
        String c0();

        int d();

        ByteString g0();

        String getName();

        ByteString getNameBytes();

        String getType();

        ByteString getTypeBytes();

        String k(String arg1);

        Map n();

        boolean o(String arg1);

        @Deprecated
        Map p();

        String q(String arg1, String arg2);
    }

    public static final class m extends GeneratedMessageLite implements n {
        public static final class com.google.rpc.context.a.m.a extends Builder implements n {
            private com.google.rpc.context.a.m.a() {
                super(m.DEFAULT_INSTANCE);
            }

            com.google.rpc.context.a.m.a(com.google.rpc.context.a.a a$a0) {
            }

            public com.google.rpc.context.a.m.a Ab(String s, String s1) {
                s.getClass();
                s1.getClass();
                this.copyOnWrite();
                ((m)this.instance).v8().put(s, s1);
                return this;
            }

            public com.google.rpc.context.a.m.a Bb(String s) {
                s.getClass();
                this.copyOnWrite();
                ((m)this.instance).v8().remove(s);
                return this;
            }

            public com.google.rpc.context.a.m.a Cb(long v) {
                this.copyOnWrite();
                ((m)this.instance).Gb(v);
                return this;
            }

            public com.google.rpc.context.a.m.a Db(long v) {
                this.copyOnWrite();
                ((m)this.instance).Hb(v);
                return this;
            }

            public com.google.rpc.context.a.m.a Eb(com.google.protobuf.Timestamp.Builder timestamp$Builder0) {
                this.copyOnWrite();
                ((m)this.instance).Ib(((Timestamp)timestamp$Builder0.build()));
                return this;
            }

            public com.google.rpc.context.a.m.a Fb(Timestamp timestamp0) {
                this.copyOnWrite();
                ((m)this.instance).Ib(timestamp0);
                return this;
            }

            @Override  // com.google.rpc.context.a$n
            @Deprecated
            public Map H() {
                return this.W0();
            }

            @Override  // com.google.rpc.context.a$n
            public Timestamp J() {
                return ((m)this.instance).J();
            }

            @Override  // com.google.rpc.context.a$n
            public boolean W() {
                return ((m)this.instance).W();
            }

            @Override  // com.google.rpc.context.a$n
            public Map W0() {
                return DesugarCollections.unmodifiableMap(((m)this.instance).W0());
            }

            @Override  // com.google.rpc.context.a$n
            public String X0(String s) {
                s.getClass();
                Map map0 = ((m)this.instance).W0();
                if(!map0.containsKey(s)) {
                    throw new IllegalArgumentException();
                }
                return (String)map0.get(s);
            }

            @Override  // com.google.rpc.context.a$n
            public String d0(String s, String s1) {
                s.getClass();
                Map map0 = ((m)this.instance).W0();
                return map0.containsKey(s) ? ((String)map0.get(s)) : s1;
            }

            @Override  // com.google.rpc.context.a$n
            public long getCode() {
                return ((m)this.instance).getCode();
            }

            @Override  // com.google.rpc.context.a$n
            public long getSize() {
                return ((m)this.instance).getSize();
            }

            @Override  // com.google.rpc.context.a$n
            public int i0() {
                return ((m)this.instance).W0().size();
            }

            public com.google.rpc.context.a.m.a ub() {
                this.copyOnWrite();
                ((m)this.instance).A6();
                return this;
            }

            public com.google.rpc.context.a.m.a vb() {
                this.copyOnWrite();
                ((m)this.instance).v8().clear();
                return this;
            }

            public com.google.rpc.context.a.m.a wb() {
                this.copyOnWrite();
                ((m)this.instance).B6();
                return this;
            }

            public com.google.rpc.context.a.m.a xb() {
                this.copyOnWrite();
                ((m)this.instance).M6();
                return this;
            }

            public com.google.rpc.context.a.m.a yb(Timestamp timestamp0) {
                this.copyOnWrite();
                ((m)this.instance).ca(timestamp0);
                return this;
            }

            @Override  // com.google.rpc.context.a$n
            public boolean z0(String s) {
                s.getClass();
                return ((m)this.instance).W0().containsKey(s);
            }

            public com.google.rpc.context.a.m.a zb(Map map0) {
                this.copyOnWrite();
                ((m)this.instance).v8().putAll(map0);
                return this;
            }
        }

        static final class com.google.rpc.context.a.m.b {
            static final MapEntryLite a;

            static {
                com.google.rpc.context.a.m.b.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.STRING, "");
            }
        }

        public static final int CODE_FIELD_NUMBER = 1;
        private static final m DEFAULT_INSTANCE = null;
        public static final int HEADERS_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private long code_;
        private MapFieldLite headers_;
        private long size_;
        private Timestamp time_;

        static {
            m a$m0 = new m();
            m.DEFAULT_INSTANCE = a$m0;
            GeneratedMessageLite.registerDefaultInstance(m.class, a$m0);
        }

        private m() {
            this.headers_ = MapFieldLite.emptyMapField();
        }

        private void A6() {
            this.code_ = 0L;
        }

        private MapFieldLite A8() {
            return this.headers_;
        }

        public static m Ab(InputStream inputStream0) throws IOException {
            return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, inputStream0);
        }

        private void B6() {
            this.size_ = 0L;
        }

        public static m Bb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static m Cb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static m Db(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static m Eb(byte[] arr_b) throws InvalidProtocolBufferException {
            return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, arr_b);
        }

        public static m Fb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void Gb(long v) {
            this.code_ = v;
        }

        @Override  // com.google.rpc.context.a$n
        @Deprecated
        public Map H() {
            return this.W0();
        }

        private void Hb(long v) {
            this.size_ = v;
        }

        private void Ib(Timestamp timestamp0) {
            timestamp0.getClass();
            this.time_ = timestamp0;
        }

        @Override  // com.google.rpc.context.a$n
        public Timestamp J() {
            return this.time_ == null ? Timestamp.getDefaultInstance() : this.time_;
        }

        public static com.google.rpc.context.a.m.a Ja() {
            return (com.google.rpc.context.a.m.a)m.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.rpc.context.a.m.a La(m a$m0) {
            return (com.google.rpc.context.a.m.a)m.DEFAULT_INSTANCE.createBuilder(a$m0);
        }

        private void M6() {
            this.time_ = null;
        }

        @Override  // com.google.rpc.context.a$n
        public boolean W() {
            return this.time_ != null;
        }

        @Override  // com.google.rpc.context.a$n
        public Map W0() {
            return DesugarCollections.unmodifiableMap(this.A8());
        }

        @Override  // com.google.rpc.context.a$n
        public String X0(String s) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.A8();
            if(!mapFieldLite0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (String)mapFieldLite0.get(s);
        }

        public static m Z7() {
            return m.DEFAULT_INSTANCE;
        }

        private void ca(Timestamp timestamp0) {
            timestamp0.getClass();
            if(this.time_ != null && this.time_ != Timestamp.getDefaultInstance()) {
                this.time_ = (Timestamp)((com.google.protobuf.Timestamp.Builder)Timestamp.newBuilder(this.time_).mergeFrom(timestamp0)).buildPartial();
                return;
            }
            this.time_ = timestamp0;
        }

        @Override  // com.google.rpc.context.a$n
        public String d0(String s, String s1) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.A8();
            return mapFieldLite0.containsKey(s) ? ((String)mapFieldLite0.get(s)) : s1;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new m();
                }
                case 2: {
                    return new com.google.rpc.context.a.m.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(m.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u00032\u0004\t", new Object[]{"code_", "size_", "headers_", com.google.rpc.context.a.m.b.a, "time_"});
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

        @Override  // com.google.rpc.context.a$n
        public long getCode() {
            return this.code_;
        }

        @Override  // com.google.rpc.context.a$n
        public long getSize() {
            return this.size_;
        }

        @Override  // com.google.rpc.context.a$n
        public int i0() {
            return this.A8().size();
        }

        private MapFieldLite j9() {
            if(!this.headers_.isMutable()) {
                this.headers_ = this.headers_.mutableCopy();
            }
            return this.headers_;
        }

        public static Parser parser() {
            return m.DEFAULT_INSTANCE.getParserForType();
        }

        public static m ub(InputStream inputStream0) throws IOException {
            return (m)GeneratedMessageLite.parseDelimitedFrom(m.DEFAULT_INSTANCE, inputStream0);
        }

        private Map v8() {
            return this.j9();
        }

        public static m vb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (m)GeneratedMessageLite.parseDelimitedFrom(m.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static m wb(ByteString byteString0) throws InvalidProtocolBufferException {
            return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteString0);
        }

        public static m xb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static m yb(CodedInputStream codedInputStream0) throws IOException {
            return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, codedInputStream0);
        }

        @Override  // com.google.rpc.context.a$n
        public boolean z0(String s) {
            s.getClass();
            return this.A8().containsKey(s);
        }

        public static m zb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }
    }

    public interface n extends MessageLiteOrBuilder {
        @Deprecated
        Map H();

        Timestamp J();

        boolean W();

        Map W0();

        String X0(String arg1);

        String d0(String arg1, String arg2);

        long getCode();

        long getSize();

        int i0();

        boolean z0(String arg1);
    }

    public static final int API_FIELD_NUMBER = 6;
    private static final a DEFAULT_INSTANCE = null;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile Parser PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private com.google.rpc.context.a.b api_;
    private g destination_;
    private g origin_;
    private i request_;
    private k resource_;
    private m response_;
    private g source_;

    static {
        a a0 = new a();
        a.DEFAULT_INSTANCE = a0;
        GeneratedMessageLite.registerDefaultInstance(a.class, a0);
    }

    private void Ab() {
        this.request_ = null;
    }

    private void Bb() {
        this.resource_ = null;
    }

    private void Cb() {
        this.response_ = null;
    }

    private void Db() {
        this.source_ = null;
    }

    @Override  // com.google.rpc.context.b
    public boolean E() {
        return this.response_ != null;
    }

    public static a Eb() {
        return a.DEFAULT_INSTANCE;
    }

    @Override  // com.google.rpc.context.b
    public m F() {
        return this.response_ == null ? m.Z7() : this.response_;
    }

    private void Fb(com.google.rpc.context.a.b a$b0) {
        a$b0.getClass();
        if(this.api_ != null && this.api_ != com.google.rpc.context.a.b.j9()) {
            this.api_ = (com.google.rpc.context.a.b)((com.google.rpc.context.a.b.a)com.google.rpc.context.a.b.Ja(this.api_).mergeFrom(a$b0)).buildPartial();
            return;
        }
        this.api_ = a$b0;
    }

    private void Gb(g a$g0) {
        a$g0.getClass();
        if(this.destination_ != null && this.destination_ != g.Ja()) {
            this.destination_ = (g)((com.google.rpc.context.a.g.a)g.xb(this.destination_).mergeFrom(a$g0)).buildPartial();
            return;
        }
        this.destination_ = a$g0;
    }

    private void Hb(g a$g0) {
        a$g0.getClass();
        if(this.origin_ != null && this.origin_ != g.Ja()) {
            this.origin_ = (g)((com.google.rpc.context.a.g.a)g.xb(this.origin_).mergeFrom(a$g0)).buildPartial();
            return;
        }
        this.origin_ = a$g0;
    }

    private void Ib(i a$i0) {
        a$i0.getClass();
        if(this.request_ != null && this.request_ != i.Rb()) {
            this.request_ = (i)((com.google.rpc.context.a.i.a)i.Yb(this.request_).mergeFrom(a$i0)).buildPartial();
            return;
        }
        this.request_ = a$i0;
    }

    @Override  // com.google.rpc.context.b
    public boolean J6() {
        return this.api_ != null;
    }

    private void Jb(k a$k0) {
        a$k0.getClass();
        if(this.resource_ != null && this.resource_ != k.M6()) {
            this.resource_ = (k)((com.google.rpc.context.a.k.a)k.ca(this.resource_).mergeFrom(a$k0)).buildPartial();
            return;
        }
        this.resource_ = a$k0;
    }

    private void Kb(m a$m0) {
        a$m0.getClass();
        if(this.response_ != null && this.response_ != m.Z7()) {
            this.response_ = (m)((com.google.rpc.context.a.m.a)m.La(this.response_).mergeFrom(a$m0)).buildPartial();
            return;
        }
        this.response_ = a$m0;
    }

    private void Lb(g a$g0) {
        a$g0.getClass();
        if(this.source_ != null && this.source_ != g.Ja()) {
            this.source_ = (g)((com.google.rpc.context.a.g.a)g.xb(this.source_).mergeFrom(a$g0)).buildPartial();
            return;
        }
        this.source_ = a$g0;
    }

    public static f Mb() {
        return (f)a.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.rpc.context.b
    public g N() {
        return this.source_ == null ? g.Ja() : this.source_;
    }

    @Override  // com.google.rpc.context.b
    public boolean N4() {
        return this.destination_ != null;
    }

    @Override  // com.google.rpc.context.b
    public g N5() {
        return this.origin_ == null ? g.Ja() : this.origin_;
    }

    public static f Nb(a a0) {
        return (f)a.DEFAULT_INSTANCE.createBuilder(a0);
    }

    public static a Ob(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    public static a Pb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.rpc.context.b
    public boolean Q8() {
        return this.origin_ != null;
    }

    public static a Qb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.rpc.context.b
    public k R() {
        return this.resource_ == null ? k.M6() : this.resource_;
    }

    public static a Rb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // com.google.rpc.context.b
    public g S5() {
        return this.destination_ == null ? g.Ja() : this.destination_;
    }

    public static a Sb(CodedInputStream codedInputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static a Tb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static a Ub(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    public static a Vb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static a Wb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0);
    }

    @Override  // com.google.rpc.context.b
    public boolean Xa() {
        return this.resource_ != null;
    }

    public static a Xb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static a Yb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b);
    }

    public static a Zb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void ac(com.google.rpc.context.a.b a$b0) {
        a$b0.getClass();
        this.api_ = a$b0;
    }

    private void bc(g a$g0) {
        a$g0.getClass();
        this.destination_ = a$g0;
    }

    private void cc(g a$g0) {
        a$g0.getClass();
        this.origin_ = a$g0;
    }

    private void dc(i a$i0) {
        a$i0.getClass();
        this.request_ = a$i0;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new a();
            }
            case 2: {
                return new f(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(a.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"source_", "destination_", "request_", "response_", "resource_", "api_", "origin_"});
            }
            case 4: {
                return a.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = a.PARSER;
                if(parser0 == null) {
                    Class class0 = a.class;
                    synchronized(class0) {
                        parser0 = a.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(a.DEFAULT_INSTANCE);
                            a.PARSER = parser0;
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

    private void ec(k a$k0) {
        a$k0.getClass();
        this.resource_ = a$k0;
    }

    private void fc(m a$m0) {
        a$m0.getClass();
        this.response_ = a$m0;
    }

    private void gc(g a$g0) {
        a$g0.getClass();
        this.source_ = a$g0;
    }

    @Override  // com.google.rpc.context.b
    public com.google.rpc.context.a.b jb() {
        return this.api_ == null ? com.google.rpc.context.a.b.j9() : this.api_;
    }

    @Override  // com.google.rpc.context.b
    public boolean n0() {
        return this.request_ != null;
    }

    public static Parser parser() {
        return a.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.rpc.context.b
    public boolean w4() {
        return this.source_ != null;
    }

    private void xb() {
        this.api_ = null;
    }

    private void yb() {
        this.destination_ = null;
    }

    @Override  // com.google.rpc.context.b
    public i z() {
        return this.request_ == null ? i.Rb() : this.request_;
    }

    private void zb() {
        this.origin_ = null;
    }
}

