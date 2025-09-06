package com.google.cloud.audit;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
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
import com.google.protobuf.Struct;
import com.google.rpc.x;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class a extends GeneratedMessageLite implements b {
    static class com.google.cloud.audit.a.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            com.google.cloud.audit.a.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.cloud.audit.a.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.cloud.audit.a.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.cloud.audit.a.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.cloud.audit.a.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.cloud.audit.a.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.cloud.audit.a.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class com.google.cloud.audit.a.b extends Builder implements b {
        private com.google.cloud.audit.a.b() {
            super(a.DEFAULT_INSTANCE);
        }

        com.google.cloud.audit.a.b(com.google.cloud.audit.a.a a$a0) {
        }

        public com.google.cloud.audit.a.b Ab() {
            this.copyOnWrite();
            ((a)this.instance).Pb();
            return this;
        }

        public com.google.cloud.audit.a.b Bb() {
            this.copyOnWrite();
            ((a)this.instance).Qb();
            return this;
        }

        public com.google.cloud.audit.a.b Cb() {
            this.copyOnWrite();
            ((a)this.instance).Rb();
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public boolean D6() {
            return ((a)this.instance).D6();
        }

        public com.google.cloud.audit.a.b Db() {
            this.copyOnWrite();
            ((a)this.instance).Sb();
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public boolean E() {
            return ((a)this.instance).E();
        }

        public com.google.cloud.audit.a.b Eb() {
            this.copyOnWrite();
            ((a)this.instance).Tb();
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public Struct F() {
            return ((a)this.instance).F();
        }

        @Override  // com.google.cloud.audit.b
        public boolean F9() {
            return ((a)this.instance).F9();
        }

        public com.google.cloud.audit.a.b Fb() {
            this.copyOnWrite();
            ((a)this.instance).Ub();
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public f G1(int v) {
            return ((a)this.instance).G1(v);
        }

        public com.google.cloud.audit.a.b Gb() {
            this.copyOnWrite();
            ((a)this.instance).Vb();
            return this;
        }

        public com.google.cloud.audit.a.b Hb() {
            this.copyOnWrite();
            ((a)this.instance).Wb();
            return this;
        }

        public com.google.cloud.audit.a.b Ib() {
            this.copyOnWrite();
            ((a)this.instance).Xb();
            return this;
        }

        public com.google.cloud.audit.a.b Jb() {
            this.copyOnWrite();
            ((a)this.instance).Yb();
            return this;
        }

        public com.google.cloud.audit.a.b Kb(d d0) {
            this.copyOnWrite();
            ((a)this.instance).dc(d0);
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public String L5() {
            return ((a)this.instance).L5();
        }

        public com.google.cloud.audit.a.b Lb(Struct struct0) {
            this.copyOnWrite();
            ((a)this.instance).ec(struct0);
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public List M3() {
            return DesugarCollections.unmodifiableList(((a)this.instance).M3());
        }

        public com.google.cloud.audit.a.b Mb(h h0) {
            this.copyOnWrite();
            ((a)this.instance).fc(h0);
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public Any N2() {
            return ((a)this.instance).N2();
        }

        public com.google.cloud.audit.a.b Nb(Struct struct0) {
            this.copyOnWrite();
            ((a)this.instance).gc(struct0);
            return this;
        }

        public com.google.cloud.audit.a.b Ob(Any any0) {
            this.copyOnWrite();
            ((a)this.instance).hc(any0);
            return this;
        }

        public com.google.cloud.audit.a.b Pb(x x0) {
            this.copyOnWrite();
            ((a)this.instance).ic(x0);
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public String Q6() {
            return ((a)this.instance).Q6();
        }

        public com.google.cloud.audit.a.b Qb(int v) {
            this.copyOnWrite();
            ((a)this.instance).xc(v);
            return this;
        }

        public com.google.cloud.audit.a.b Rb(com.google.cloud.audit.d.b d$b0) {
            this.copyOnWrite();
            ((a)this.instance).yc(((d)d$b0.build()));
            return this;
        }

        public com.google.cloud.audit.a.b Sb(d d0) {
            this.copyOnWrite();
            ((a)this.instance).yc(d0);
            return this;
        }

        public com.google.cloud.audit.a.b Tb(int v, com.google.cloud.audit.f.b f$b0) {
            this.copyOnWrite();
            ((a)this.instance).zc(v, ((f)f$b0.build()));
            return this;
        }

        public com.google.cloud.audit.a.b Ub(int v, f f0) {
            this.copyOnWrite();
            ((a)this.instance).zc(v, f0);
            return this;
        }

        public com.google.cloud.audit.a.b Vb(String s) {
            this.copyOnWrite();
            ((a)this.instance).Ac(s);
            return this;
        }

        public com.google.cloud.audit.a.b Wb(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Bc(byteString0);
            return this;
        }

        public com.google.cloud.audit.a.b Xb(long v) {
            this.copyOnWrite();
            ((a)this.instance).Cc(v);
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public boolean Y5() {
            return ((a)this.instance).Y5();
        }

        public com.google.cloud.audit.a.b Yb(com.google.protobuf.Struct.Builder struct$Builder0) {
            this.copyOnWrite();
            ((a)this.instance).Dc(((Struct)struct$Builder0.build()));
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.cloud.audit.b
        public String Z() {
            return "";
        }

        public com.google.cloud.audit.a.b Zb(Struct struct0) {
            this.copyOnWrite();
            ((a)this.instance).Dc(struct0);
            return this;
        }

        public com.google.cloud.audit.a.b ac(com.google.cloud.audit.h.b h$b0) {
            this.copyOnWrite();
            ((a)this.instance).Ec(((h)h$b0.build()));
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public ByteString b8() {
            return ((a)this.instance).b8();
        }

        public com.google.cloud.audit.a.b bc(h h0) {
            this.copyOnWrite();
            ((a)this.instance).Ec(h0);
            return this;
        }

        public com.google.cloud.audit.a.b cc(String s) {
            this.copyOnWrite();
            ((a)this.instance).Fc(s);
            return this;
        }

        public com.google.cloud.audit.a.b dc(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Gc(byteString0);
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public h e9() {
            return ((a)this.instance).e9();
        }

        public com.google.cloud.audit.a.b ec(com.google.protobuf.Struct.Builder struct$Builder0) {
            this.copyOnWrite();
            ((a)this.instance).Hc(((Struct)struct$Builder0.build()));
            return this;
        }

        public com.google.cloud.audit.a.b fc(Struct struct0) {
            this.copyOnWrite();
            ((a)this.instance).Hc(struct0);
            return this;
        }

        public com.google.cloud.audit.a.b gc(com.google.protobuf.Any.Builder any$Builder0) {
            this.copyOnWrite();
            ((a)this.instance).Ic(((Any)any$Builder0.build()));
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public x getStatus() {
            return ((a)this.instance).getStatus();
        }

        public com.google.cloud.audit.a.b hc(Any any0) {
            this.copyOnWrite();
            ((a)this.instance).Ic(any0);
            return this;
        }

        public com.google.cloud.audit.a.b ic(String s) {
            this.copyOnWrite();
            ((a)this.instance).Jc(s);
            return this;
        }

        public com.google.cloud.audit.a.b jc(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Kc(byteString0);
            return this;
        }

        public com.google.cloud.audit.a.b kc(com.google.rpc.x.b x$b0) {
            this.copyOnWrite();
            ((a)this.instance).Lc(((x)x$b0.build()));
            return this;
        }

        public com.google.cloud.audit.a.b lc(x x0) {
            this.copyOnWrite();
            ((a)this.instance).Lc(x0);
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public ByteString m6() {
            return ((a)this.instance).m6();
        }

        @Override  // com.google.cloud.audit.b
        public boolean n0() {
            return ((a)this.instance).n0();
        }

        @Override  // com.google.cloud.audit.b
        public long q1() {
            return ((a)this.instance).q1();
        }

        @Override  // com.google.cloud.audit.b
        public int qb() {
            return ((a)this.instance).qb();
        }

        @Override  // com.google.cloud.audit.b
        public d t8() {
            return ((a)this.instance).t8();
        }

        public com.google.cloud.audit.a.b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((a)this.instance).Lb(iterable0);
            return this;
        }

        public com.google.cloud.audit.a.b vb(int v, com.google.cloud.audit.f.b f$b0) {
            this.copyOnWrite();
            ((a)this.instance).Mb(v, ((f)f$b0.build()));
            return this;
        }

        public com.google.cloud.audit.a.b wb(int v, f f0) {
            this.copyOnWrite();
            ((a)this.instance).Mb(v, f0);
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public ByteString x0() {
            return ((a)this.instance).x0();
        }

        @Override  // com.google.cloud.audit.b
        public boolean x1() {
            return ((a)this.instance).x1();
        }

        public com.google.cloud.audit.a.b xb(com.google.cloud.audit.f.b f$b0) {
            this.copyOnWrite();
            ((a)this.instance).Nb(((f)f$b0.build()));
            return this;
        }

        public com.google.cloud.audit.a.b yb(f f0) {
            this.copyOnWrite();
            ((a)this.instance).Nb(f0);
            return this;
        }

        @Override  // com.google.cloud.audit.b
        public Struct z() {
            return ((a)this.instance).z();
        }

        public com.google.cloud.audit.a.b zb() {
            this.copyOnWrite();
            ((a)this.instance).Ob();
            return this;
        }
    }

    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    private static final a DEFAULT_INSTANCE = null;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile Parser PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private d authenticationInfo_;
    private ProtobufList authorizationInfo_;
    private String methodName_;
    private long numResponseItems_;
    private h requestMetadata_;
    private Struct request_;
    private String resourceName_;
    private Struct response_;
    private Any serviceData_;
    private String serviceName_;
    private x status_;

    static {
        a a0 = new a();
        a.DEFAULT_INSTANCE = a0;
        GeneratedMessageLite.registerDefaultInstance(a.class, a0);
    }

    private a() {
        this.serviceName_ = "";
        this.methodName_ = "";
        this.resourceName_ = "";
        this.authorizationInfo_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Ac(String s) {
        s.getClass();
        this.methodName_ = s;
    }

    private void Bc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.methodName_ = byteString0.toStringUtf8();
    }

    private void Cc(long v) {
        this.numResponseItems_ = v;
    }

    @Override  // com.google.cloud.audit.b
    public boolean D6() {
        return this.serviceData_ != null;
    }

    private void Dc(Struct struct0) {
        struct0.getClass();
        this.request_ = struct0;
    }

    @Override  // com.google.cloud.audit.b
    public boolean E() {
        return this.response_ != null;
    }

    private void Ec(h h0) {
        h0.getClass();
        this.requestMetadata_ = h0;
    }

    @Override  // com.google.cloud.audit.b
    public Struct F() {
        return this.response_ == null ? Struct.getDefaultInstance() : this.response_;
    }

    @Override  // com.google.cloud.audit.b
    public boolean F9() {
        return this.requestMetadata_ != null;
    }

    private void Fc(String s) {
        s.getClass();
        this.resourceName_ = s;
    }

    @Override  // com.google.cloud.audit.b
    public f G1(int v) {
        return (f)this.authorizationInfo_.get(v);
    }

    private void Gc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.resourceName_ = byteString0.toStringUtf8();
    }

    private void Hc(Struct struct0) {
        struct0.getClass();
        this.response_ = struct0;
    }

    private void Ic(Any any0) {
        any0.getClass();
        this.serviceData_ = any0;
    }

    private void Jc(String s) {
        s.getClass();
        this.serviceName_ = s;
    }

    private void Kc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.serviceName_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.cloud.audit.b
    public String L5() {
        return this.methodName_;
    }

    private void Lb(Iterable iterable0) {
        this.Zb();
        AbstractMessageLite.addAll(iterable0, this.authorizationInfo_);
    }

    private void Lc(x x0) {
        x0.getClass();
        this.status_ = x0;
    }

    @Override  // com.google.cloud.audit.b
    public List M3() {
        return this.authorizationInfo_;
    }

    private void Mb(int v, f f0) {
        f0.getClass();
        this.Zb();
        this.authorizationInfo_.add(v, f0);
    }

    @Override  // com.google.cloud.audit.b
    public Any N2() {
        return this.serviceData_ == null ? Any.getDefaultInstance() : this.serviceData_;
    }

    private void Nb(f f0) {
        f0.getClass();
        this.Zb();
        this.authorizationInfo_.add(f0);
    }

    private void Ob() {
        this.authenticationInfo_ = null;
    }

    private void Pb() {
        this.authorizationInfo_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.cloud.audit.b
    public String Q6() {
        return this.serviceName_;
    }

    private void Qb() {
        this.methodName_ = a.cc().L5();
    }

    private void Rb() {
        this.numResponseItems_ = 0L;
    }

    private void Sb() {
        this.request_ = null;
    }

    private void Tb() {
        this.requestMetadata_ = null;
    }

    private void Ub() {
        this.resourceName_ = "";
    }

    private void Vb() {
        this.response_ = null;
    }

    private void Wb() {
        this.serviceData_ = null;
    }

    private void Xb() {
        this.serviceName_ = a.cc().Q6();
    }

    @Override  // com.google.cloud.audit.b
    public boolean Y5() {
        return this.authenticationInfo_ != null;
    }

    private void Yb() {
        this.status_ = null;
    }

    @Override  // com.google.cloud.audit.b
    public String Z() [...] // 潜在的解密器

    private void Zb() {
        ProtobufList internal$ProtobufList0 = this.authorizationInfo_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.authorizationInfo_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public g ac(int v) {
        return (g)this.authorizationInfo_.get(v);
    }

    @Override  // com.google.cloud.audit.b
    public ByteString b8() {
        return ByteString.copyFromUtf8(this.methodName_);
    }

    public List bc() {
        return this.authorizationInfo_;
    }

    public static a cc() {
        return a.DEFAULT_INSTANCE;
    }

    private void dc(d d0) {
        d0.getClass();
        if(this.authenticationInfo_ != null && this.authenticationInfo_ != d.M4()) {
            this.authenticationInfo_ = (d)((com.google.cloud.audit.d.b)d.d6(this.authenticationInfo_).mergeFrom(d0)).buildPartial();
            return;
        }
        this.authenticationInfo_ = d0;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new a();
            }
            case 2: {
                return new com.google.cloud.audit.a.b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(a.DEFAULT_INSTANCE, "\u0000\u000B\u0000\u0000\u0002\u0011\u000B\u0000\u0001\u0000\u0002\t\u0003\t\u0004\t\u0007Ȉ\bȈ\t\u001B\u000BȈ\f\u0002\u000F\t\u0010\t\u0011\t", new Object[]{"status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", f.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
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

    @Override  // com.google.cloud.audit.b
    public h e9() {
        return this.requestMetadata_ == null ? h.A6() : this.requestMetadata_;
    }

    private void ec(Struct struct0) {
        struct0.getClass();
        if(this.request_ != null && this.request_ != Struct.getDefaultInstance()) {
            this.request_ = (Struct)((com.google.protobuf.Struct.Builder)Struct.newBuilder(this.request_).mergeFrom(struct0)).buildPartial();
            return;
        }
        this.request_ = struct0;
    }

    private void fc(h h0) {
        h0.getClass();
        if(this.requestMetadata_ != null && this.requestMetadata_ != h.A6()) {
            this.requestMetadata_ = (h)((com.google.cloud.audit.h.b)h.M6(this.requestMetadata_).mergeFrom(h0)).buildPartial();
            return;
        }
        this.requestMetadata_ = h0;
    }

    private void gc(Struct struct0) {
        struct0.getClass();
        if(this.response_ != null && this.response_ != Struct.getDefaultInstance()) {
            this.response_ = (Struct)((com.google.protobuf.Struct.Builder)Struct.newBuilder(this.response_).mergeFrom(struct0)).buildPartial();
            return;
        }
        this.response_ = struct0;
    }

    @Override  // com.google.cloud.audit.b
    public x getStatus() {
        return this.status_ == null ? x.La() : this.status_;
    }

    private void hc(Any any0) {
        any0.getClass();
        if(this.serviceData_ != null && this.serviceData_ != Any.getDefaultInstance()) {
            this.serviceData_ = (Any)((com.google.protobuf.Any.Builder)Any.newBuilder(this.serviceData_).mergeFrom(any0)).buildPartial();
            return;
        }
        this.serviceData_ = any0;
    }

    private void ic(x x0) {
        x0.getClass();
        if(this.status_ != null && this.status_ != x.La()) {
            this.status_ = (x)((com.google.rpc.x.b)x.xb(this.status_).mergeFrom(x0)).buildPartial();
            return;
        }
        this.status_ = x0;
    }

    public static com.google.cloud.audit.a.b jc() {
        return (com.google.cloud.audit.a.b)a.DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.cloud.audit.a.b kc(a a0) {
        return (com.google.cloud.audit.a.b)a.DEFAULT_INSTANCE.createBuilder(a0);
    }

    public static a lc(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.cloud.audit.b
    public ByteString m6() {
        return ByteString.copyFromUtf8(this.serviceName_);
    }

    public static a mc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.cloud.audit.b
    public boolean n0() {
        return this.request_ != null;
    }

    public static a nc(ByteString byteString0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0);
    }

    public static a oc(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return a.DEFAULT_INSTANCE.getParserForType();
    }

    public static a pc(CodedInputStream codedInputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0);
    }

    @Override  // com.google.cloud.audit.b
    public long q1() {
        return this.numResponseItems_;
    }

    @Override  // com.google.cloud.audit.b
    public int qb() {
        return this.authorizationInfo_.size();
    }

    public static a qc(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static a rc(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    public static a sc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.cloud.audit.b
    public d t8() {
        return this.authenticationInfo_ == null ? d.M4() : this.authenticationInfo_;
    }

    public static a tc(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static a uc(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static a vc(byte[] arr_b) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b);
    }

    public static a wc(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    @Override  // com.google.cloud.audit.b
    public ByteString x0() {
        return ByteString.copyFromUtf8(this.resourceName_);
    }

    @Override  // com.google.cloud.audit.b
    public boolean x1() {
        return this.status_ != null;
    }

    private void xc(int v) {
        this.Zb();
        this.authorizationInfo_.remove(v);
    }

    private void yc(d d0) {
        d0.getClass();
        this.authenticationInfo_ = d0;
    }

    @Override  // com.google.cloud.audit.b
    public Struct z() {
        return this.request_ == null ? Struct.getDefaultInstance() : this.request_;
    }

    private void zc(int v, f f0) {
        f0.getClass();
        this.Zb();
        this.authorizationInfo_.set(v, f0);
    }
}

