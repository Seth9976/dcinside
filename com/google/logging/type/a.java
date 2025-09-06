package com.google.logging.type;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a extends GeneratedMessageLite implements b {
    static class com.google.logging.type.a.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            com.google.logging.type.a.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.logging.type.a.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.logging.type.a.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.logging.type.a.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.logging.type.a.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.logging.type.a.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.logging.type.a.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class com.google.logging.type.a.b extends Builder implements b {
        private com.google.logging.type.a.b() {
            super(a.DEFAULT_INSTANCE);
        }

        com.google.logging.type.a.b(com.google.logging.type.a.a a$a0) {
        }

        public com.google.logging.type.a.b Ab() {
            this.copyOnWrite();
            ((a)this.instance).Ub();
            return this;
        }

        public com.google.logging.type.a.b Bb() {
            this.copyOnWrite();
            ((a)this.instance).Vb();
            return this;
        }

        public com.google.logging.type.a.b Cb() {
            this.copyOnWrite();
            ((a)this.instance).Wb();
            return this;
        }

        public com.google.logging.type.a.b Db() {
            this.copyOnWrite();
            ((a)this.instance).Xb();
            return this;
        }

        @Override  // com.google.logging.type.b
        public ByteString E2() {
            return ((a)this.instance).E2();
        }

        public com.google.logging.type.a.b Eb() {
            this.copyOnWrite();
            ((a)this.instance).Yb();
            return this;
        }

        public com.google.logging.type.a.b Fb() {
            this.copyOnWrite();
            ((a)this.instance).Zb();
            return this;
        }

        @Override  // com.google.logging.type.b
        public boolean G4() {
            return ((a)this.instance).G4();
        }

        public com.google.logging.type.a.b Gb() {
            this.copyOnWrite();
            ((a)this.instance).ac();
            return this;
        }

        @Override  // com.google.logging.type.b
        public boolean H1() {
            return ((a)this.instance).H1();
        }

        public com.google.logging.type.a.b Hb() {
            this.copyOnWrite();
            ((a)this.instance).bc();
            return this;
        }

        @Override  // com.google.logging.type.b
        public ByteString I5() {
            return ((a)this.instance).I5();
        }

        @Override  // com.google.logging.type.b
        public long I8() {
            return ((a)this.instance).I8();
        }

        public com.google.logging.type.a.b Ib() {
            this.copyOnWrite();
            ((a)this.instance).cc();
            return this;
        }

        public com.google.logging.type.a.b Jb(Duration duration0) {
            this.copyOnWrite();
            ((a)this.instance).ec(duration0);
            return this;
        }

        public com.google.logging.type.a.b Kb(long v) {
            this.copyOnWrite();
            ((a)this.instance).tc(v);
            return this;
        }

        public com.google.logging.type.a.b Lb(boolean z) {
            this.copyOnWrite();
            ((a)this.instance).uc(z);
            return this;
        }

        public com.google.logging.type.a.b Mb(boolean z) {
            this.copyOnWrite();
            ((a)this.instance).vc(z);
            return this;
        }

        public com.google.logging.type.a.b Nb(boolean z) {
            this.copyOnWrite();
            ((a)this.instance).wc(z);
            return this;
        }

        public com.google.logging.type.a.b Ob(com.google.protobuf.Duration.Builder duration$Builder0) {
            this.copyOnWrite();
            ((a)this.instance).xc(((Duration)duration$Builder0.build()));
            return this;
        }

        public com.google.logging.type.a.b Pb(Duration duration0) {
            this.copyOnWrite();
            ((a)this.instance).xc(duration0);
            return this;
        }

        public com.google.logging.type.a.b Qb(String s) {
            this.copyOnWrite();
            ((a)this.instance).yc(s);
            return this;
        }

        public com.google.logging.type.a.b Rb(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).zc(byteString0);
            return this;
        }

        public com.google.logging.type.a.b Sb(String s) {
            this.copyOnWrite();
            ((a)this.instance).Ac(s);
            return this;
        }

        public com.google.logging.type.a.b Tb(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Bc(byteString0);
            return this;
        }

        public com.google.logging.type.a.b Ub(String s) {
            this.copyOnWrite();
            ((a)this.instance).Cc(s);
            return this;
        }

        @Override  // com.google.logging.type.b
        public long V2() {
            return ((a)this.instance).V2();
        }

        public com.google.logging.type.a.b Vb(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Dc(byteString0);
            return this;
        }

        public com.google.logging.type.a.b Wb(String s) {
            this.copyOnWrite();
            ((a)this.instance).Ec(s);
            return this;
        }

        public com.google.logging.type.a.b Xb(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Fc(byteString0);
            return this;
        }

        public com.google.logging.type.a.b Yb(long v) {
            this.copyOnWrite();
            ((a)this.instance).Gc(v);
            return this;
        }

        public com.google.logging.type.a.b Zb(String s) {
            this.copyOnWrite();
            ((a)this.instance).Hc(s);
            return this;
        }

        public com.google.logging.type.a.b ac(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Ic(byteString0);
            return this;
        }

        @Override  // com.google.logging.type.b
        public String ba() {
            return ((a)this.instance).ba();
        }

        public com.google.logging.type.a.b bc(long v) {
            this.copyOnWrite();
            ((a)this.instance).Jc(v);
            return this;
        }

        public com.google.logging.type.a.b cc(String s) {
            this.copyOnWrite();
            ((a)this.instance).Kc(s);
            return this;
        }

        public com.google.logging.type.a.b dc(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Lc(byteString0);
            return this;
        }

        public com.google.logging.type.a.b ec(int v) {
            this.copyOnWrite();
            ((a)this.instance).Mc(v);
            return this;
        }

        @Override  // com.google.logging.type.b
        public String f8() {
            return ((a)this.instance).f8();
        }

        public com.google.logging.type.a.b fc(String s) {
            this.copyOnWrite();
            ((a)this.instance).Nc(s);
            return this;
        }

        public com.google.logging.type.a.b gc(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).Oc(byteString0);
            return this;
        }

        @Override  // com.google.logging.type.b
        public Duration getLatency() {
            return ((a)this.instance).getLatency();
        }

        @Override  // com.google.logging.type.b
        public int getStatus() {
            return ((a)this.instance).getStatus();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.logging.type.b
        public String getUserAgent() {
            return "";
        }

        @Override  // com.google.logging.type.b
        public ByteString j() {
            return ((a)this.instance).j();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.logging.type.b
        public String l() {
            return "";
        }

        @Override  // com.google.logging.type.b
        public boolean m3() {
            return ((a)this.instance).m3();
        }

        @Override  // com.google.logging.type.b
        public ByteString n3() {
            return ((a)this.instance).n3();
        }

        @Override  // com.google.logging.type.b
        public boolean o8() {
            return ((a)this.instance).o8();
        }

        @Override  // com.google.logging.type.b
        public ByteString p4() {
            return ((a)this.instance).p4();
        }

        @Override  // com.google.logging.type.b
        public ByteString q3() {
            return ((a)this.instance).q3();
        }

        @Override  // com.google.logging.type.b
        public String q7() {
            return ((a)this.instance).q7();
        }

        @Override  // com.google.logging.type.b
        public String sa() {
            return ((a)this.instance).sa();
        }

        @Override  // com.google.logging.type.b
        public long ua() {
            return ((a)this.instance).ua();
        }

        public com.google.logging.type.a.b ub() {
            this.copyOnWrite();
            ((a)this.instance).Ob();
            return this;
        }

        public com.google.logging.type.a.b vb() {
            this.copyOnWrite();
            ((a)this.instance).Pb();
            return this;
        }

        public com.google.logging.type.a.b wb() {
            this.copyOnWrite();
            ((a)this.instance).Qb();
            return this;
        }

        public com.google.logging.type.a.b xb() {
            this.copyOnWrite();
            ((a)this.instance).Rb();
            return this;
        }

        public com.google.logging.type.a.b yb() {
            this.copyOnWrite();
            ((a)this.instance).Sb();
            return this;
        }

        @Override  // com.google.logging.type.b
        public String z1() {
            return ((a)this.instance).z1();
        }

        @Override  // com.google.logging.type.b
        public ByteString z2() {
            return ((a)this.instance).z2();
        }

        public com.google.logging.type.a.b zb() {
            this.copyOnWrite();
            ((a)this.instance).Tb();
            return this;
        }
    }

    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    private static final a DEFAULT_INSTANCE = null;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile Parser PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private Duration latency_;
    private String protocol_;
    private String referer_;
    private String remoteIp_;
    private String requestMethod_;
    private long requestSize_;
    private String requestUrl_;
    private long responseSize_;
    private String serverIp_;
    private int status_;
    private String userAgent_;

    static {
        a a0 = new a();
        a.DEFAULT_INSTANCE = a0;
        GeneratedMessageLite.registerDefaultInstance(a.class, a0);
    }

    private a() {
        this.requestMethod_ = "";
        this.requestUrl_ = "";
        this.userAgent_ = "";
        this.remoteIp_ = "";
        this.serverIp_ = "";
        this.referer_ = "";
        this.protocol_ = "";
    }

    private void Ac(String s) {
        s.getClass();
        this.referer_ = s;
    }

    private void Bc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.referer_ = byteString0.toStringUtf8();
    }

    private void Cc(String s) {
        s.getClass();
        this.remoteIp_ = s;
    }

    private void Dc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.remoteIp_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.logging.type.b
    public ByteString E2() {
        return ByteString.copyFromUtf8(this.requestUrl_);
    }

    private void Ec(String s) {
        s.getClass();
        this.requestMethod_ = s;
    }

    private void Fc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.requestMethod_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.logging.type.b
    public boolean G4() {
        return this.latency_ != null;
    }

    private void Gc(long v) {
        this.requestSize_ = v;
    }

    @Override  // com.google.logging.type.b
    public boolean H1() {
        return this.cacheValidatedWithOriginServer_;
    }

    private void Hc(String s) {
        s.getClass();
        this.requestUrl_ = s;
    }

    @Override  // com.google.logging.type.b
    public ByteString I5() {
        return ByteString.copyFromUtf8(this.referer_);
    }

    @Override  // com.google.logging.type.b
    public long I8() {
        return this.requestSize_;
    }

    private void Ic(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.requestUrl_ = byteString0.toStringUtf8();
    }

    private void Jc(long v) {
        this.responseSize_ = v;
    }

    private void Kc(String s) {
        s.getClass();
        this.serverIp_ = s;
    }

    private void Lc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.serverIp_ = byteString0.toStringUtf8();
    }

    private void Mc(int v) {
        this.status_ = v;
    }

    private void Nc(String s) {
        s.getClass();
        this.userAgent_ = s;
    }

    private void Ob() {
        this.cacheFillBytes_ = 0L;
    }

    private void Oc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.userAgent_ = byteString0.toStringUtf8();
    }

    private void Pb() {
        this.cacheHit_ = false;
    }

    private void Qb() {
        this.cacheLookup_ = false;
    }

    private void Rb() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    private void Sb() {
        this.latency_ = null;
    }

    private void Tb() {
        this.protocol_ = a.dc().l();
    }

    private void Ub() {
        this.referer_ = "";
    }

    @Override  // com.google.logging.type.b
    public long V2() {
        return this.responseSize_;
    }

    private void Vb() {
        this.remoteIp_ = "";
    }

    private void Wb() {
        this.requestMethod_ = "";
    }

    private void Xb() {
        this.requestSize_ = 0L;
    }

    private void Yb() {
        this.requestUrl_ = "";
    }

    private void Zb() {
        this.responseSize_ = 0L;
    }

    private void ac() {
        this.serverIp_ = "";
    }

    @Override  // com.google.logging.type.b
    public String ba() {
        return this.requestUrl_;
    }

    private void bc() {
        this.status_ = 0;
    }

    private void cc() {
        this.userAgent_ = "";
    }

    public static a dc() {
        return a.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new a();
            }
            case 2: {
                return new com.google.logging.type.a.b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(a.DEFAULT_INSTANCE, "\u0000\u000F\u0000\u0000\u0001\u000F\u000F\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0004\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000B\u0007\f\u0002\rȈ\u000E\t\u000FȈ", new Object[]{"requestMethod_", "requestUrl_", "requestSize_", "status_", "responseSize_", "userAgent_", "remoteIp_", "referer_", "cacheHit_", "cacheValidatedWithOriginServer_", "cacheLookup_", "cacheFillBytes_", "serverIp_", "latency_", "protocol_"});
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

    private void ec(Duration duration0) {
        duration0.getClass();
        if(this.latency_ != null && this.latency_ != Duration.getDefaultInstance()) {
            this.latency_ = (Duration)((com.google.protobuf.Duration.Builder)Duration.newBuilder(this.latency_).mergeFrom(duration0)).buildPartial();
            return;
        }
        this.latency_ = duration0;
    }

    @Override  // com.google.logging.type.b
    public String f8() {
        return this.serverIp_;
    }

    public static com.google.logging.type.a.b fc() {
        return (com.google.logging.type.a.b)a.DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.logging.type.a.b gc(a a0) {
        return (com.google.logging.type.a.b)a.DEFAULT_INSTANCE.createBuilder(a0);
    }

    @Override  // com.google.logging.type.b
    public Duration getLatency() {
        return this.latency_ == null ? Duration.getDefaultInstance() : this.latency_;
    }

    @Override  // com.google.logging.type.b
    public int getStatus() {
        return this.status_;
    }

    @Override  // com.google.logging.type.b
    public String getUserAgent() [...] // 潜在的解密器

    public static a hc(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    public static a ic(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.logging.type.b
    public ByteString j() {
        return ByteString.copyFromUtf8(this.protocol_);
    }

    public static a jc(ByteString byteString0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0);
    }

    public static a kc(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // com.google.logging.type.b
    public String l() [...] // 潜在的解密器

    public static a lc(CodedInputStream codedInputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0);
    }

    @Override  // com.google.logging.type.b
    public boolean m3() {
        return this.cacheHit_;
    }

    public static a mc(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.logging.type.b
    public ByteString n3() {
        return ByteString.copyFromUtf8(this.serverIp_);
    }

    public static a nc(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.logging.type.b
    public boolean o8() {
        return this.cacheLookup_;
    }

    public static a oc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.logging.type.b
    public ByteString p4() {
        return ByteString.copyFromUtf8(this.remoteIp_);
    }

    public static Parser parser() {
        return a.DEFAULT_INSTANCE.getParserForType();
    }

    public static a pc(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0);
    }

    @Override  // com.google.logging.type.b
    public ByteString q3() {
        return ByteString.copyFromUtf8(this.requestMethod_);
    }

    @Override  // com.google.logging.type.b
    public String q7() {
        return this.remoteIp_;
    }

    public static a qc(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static a rc(byte[] arr_b) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.logging.type.b
    public String sa() {
        return this.referer_;
    }

    public static a sc(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void tc(long v) {
        this.cacheFillBytes_ = v;
    }

    @Override  // com.google.logging.type.b
    public long ua() {
        return this.cacheFillBytes_;
    }

    private void uc(boolean z) {
        this.cacheHit_ = z;
    }

    private void vc(boolean z) {
        this.cacheLookup_ = z;
    }

    private void wc(boolean z) {
        this.cacheValidatedWithOriginServer_ = z;
    }

    private void xc(Duration duration0) {
        duration0.getClass();
        this.latency_ = duration0;
    }

    private void yc(String s) {
        s.getClass();
        this.protocol_ = s;
    }

    @Override  // com.google.logging.type.b
    public String z1() {
        return this.requestMethod_;
    }

    @Override  // com.google.logging.type.b
    public ByteString z2() {
        return ByteString.copyFromUtf8(this.userAgent_);
    }

    private void zc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.protocol_ = byteString0.toStringUtf8();
    }
}

