package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat.FieldType;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public final class q extends GeneratedMessageLite implements r {
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

    public static final class b extends Builder implements r {
        private b() {
            super(q.DEFAULT_INSTANCE);
        }

        b(a q$a0) {
        }

        public b Ab() {
            this.copyOnWrite();
            ((q)this.instance).Yb().clear();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public ByteString B0() {
            return ((q)this.instance).B0();
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean B2() {
            return ((q)this.instance).B2();
        }

        public b Bb() {
            this.copyOnWrite();
            ((q)this.instance).Lb();
            return this;
        }

        public b Cb() {
            this.copyOnWrite();
            ((q)this.instance).Mb();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public int D() {
            return ((q)this.instance).L().size();
        }

        @Override  // com.google.firebase.perf.v1.r
        public ByteString D2() {
            return ((q)this.instance).D2();
        }

        @Override  // com.google.firebase.perf.v1.r
        public d D4() {
            return ((q)this.instance).D4();
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean D5() {
            return ((q)this.instance).D5();
        }

        public b Db() {
            this.copyOnWrite();
            ((q)this.instance).Nb();
            return this;
        }

        public b Eb() {
            this.copyOnWrite();
            ((q)this.instance).Ob();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public String F0() {
            return ((q)this.instance).F0();
        }

        public b Fb() {
            this.copyOnWrite();
            ((q)this.instance).Pb();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public String G(String s, String s1) {
            s.getClass();
            Map map0 = ((q)this.instance).L();
            return map0.containsKey(s) ? ((String)map0.get(s)) : s1;
        }

        public b Gb() {
            this.copyOnWrite();
            ((q)this.instance).Qb();
            return this;
        }

        public b Hb() {
            this.copyOnWrite();
            ((q)this.instance).Rb();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        @Deprecated
        public Map I() {
            return this.L();
        }

        public b Ib() {
            this.copyOnWrite();
            ((q)this.instance).Sb();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public u J0(int v) {
            return ((q)this.instance).J0(v);
        }

        public b Jb() {
            this.copyOnWrite();
            ((q)this.instance).Tb();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean K(String s) {
            s.getClass();
            return ((q)this.instance).L().containsKey(s);
        }

        @Override  // com.google.firebase.perf.v1.r
        public e K9() {
            return ((q)this.instance).K9();
        }

        public b Kb() {
            this.copyOnWrite();
            ((q)this.instance).Ub();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public Map L() {
            return DesugarCollections.unmodifiableMap(((q)this.instance).L());
        }

        @Override  // com.google.firebase.perf.v1.r
        public int L0() {
            return ((q)this.instance).L0();
        }

        public b Lb() {
            this.copyOnWrite();
            ((q)this.instance).Vb();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public int M7() {
            return ((q)this.instance).M7();
        }

        public b Mb(Map map0) {
            this.copyOnWrite();
            ((q)this.instance).Yb().putAll(map0);
            return this;
        }

        public b Nb(String s, String s1) {
            s.getClass();
            s1.getClass();
            this.copyOnWrite();
            ((q)this.instance).Yb().put(s, s1);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean O2() {
            return ((q)this.instance).O2();
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean O8() {
            return ((q)this.instance).O8();
        }

        public b Ob(String s) {
            s.getClass();
            this.copyOnWrite();
            ((q)this.instance).Yb().remove(s);
            return this;
        }

        public b Pb(int v) {
            this.copyOnWrite();
            ((q)this.instance).rc(v);
            return this;
        }

        public b Qb(long v) {
            this.copyOnWrite();
            ((q)this.instance).sc(v);
            return this;
        }

        public b Rb(d q$d0) {
            this.copyOnWrite();
            ((q)this.instance).tc(q$d0);
            return this;
        }

        public b Sb(int v) {
            this.copyOnWrite();
            ((q)this.instance).uc(v);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean T6() {
            return ((q)this.instance).T6();
        }

        public b Tb(e q$e0) {
            this.copyOnWrite();
            ((q)this.instance).vc(q$e0);
            return this;
        }

        public b Ub(int v, c u$c0) {
            this.copyOnWrite();
            ((q)this.instance).wc(v, ((u)u$c0.build()));
            return this;
        }

        public b Vb(int v, u u0) {
            this.copyOnWrite();
            ((q)this.instance).wc(v, u0);
            return this;
        }

        public b Wb(long v) {
            this.copyOnWrite();
            ((q)this.instance).xc(v);
            return this;
        }

        public b Xb(String s) {
            this.copyOnWrite();
            ((q)this.instance).yc(s);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean Y1() {
            return ((q)this.instance).Y1();
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean Y3() {
            return ((q)this.instance).Y3();
        }

        public b Yb(ByteString byteString0) {
            this.copyOnWrite();
            ((q)this.instance).zc(byteString0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public List Z0() {
            return DesugarCollections.unmodifiableList(((q)this.instance).Z0());
        }

        @Override  // com.google.firebase.perf.v1.r
        public long Z1() {
            return ((q)this.instance).Z1();
        }

        public b Zb(long v) {
            this.copyOnWrite();
            ((q)this.instance).Ac(v);
            return this;
        }

        public b ac(long v) {
            this.copyOnWrite();
            ((q)this.instance).Bc(v);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean b1() {
            return ((q)this.instance).b1();
        }

        public b bc(long v) {
            this.copyOnWrite();
            ((q)this.instance).Cc(v);
            return this;
        }

        public b cc(long v) {
            this.copyOnWrite();
            ((q)this.instance).Dc(v);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public long d1() {
            return ((q)this.instance).d1();
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean d5() {
            return ((q)this.instance).d5();
        }

        public b dc(String s) {
            this.copyOnWrite();
            ((q)this.instance).Ec(s);
            return this;
        }

        public b ec(ByteString byteString0) {
            this.copyOnWrite();
            ((q)this.instance).Fc(byteString0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public long na() {
            return ((q)this.instance).na();
        }

        @Override  // com.google.firebase.perf.v1.r
        public long p2() {
            return ((q)this.instance).p2();
        }

        @Override  // com.google.firebase.perf.v1.r
        public String s5() {
            return ((q)this.instance).s5();
        }

        @Override  // com.google.firebase.perf.v1.r
        public long t1() {
            return ((q)this.instance).t1();
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean u2() {
            return ((q)this.instance).u2();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((q)this.instance).Hb(iterable0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public boolean v1() {
            return ((q)this.instance).v1();
        }

        public b vb(int v, c u$c0) {
            this.copyOnWrite();
            ((q)this.instance).Ib(v, ((u)u$c0.build()));
            return this;
        }

        @Override  // com.google.firebase.perf.v1.r
        public String w(String s) {
            s.getClass();
            Map map0 = ((q)this.instance).L();
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (String)map0.get(s);
        }

        @Override  // com.google.firebase.perf.v1.r
        public long w1() {
            return ((q)this.instance).w1();
        }

        public b wb(int v, u u0) {
            this.copyOnWrite();
            ((q)this.instance).Ib(v, u0);
            return this;
        }

        public b xb(c u$c0) {
            this.copyOnWrite();
            ((q)this.instance).Jb(((u)u$c0.build()));
            return this;
        }

        public b yb(u u0) {
            this.copyOnWrite();
            ((q)this.instance).Jb(u0);
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((q)this.instance).Kb();
            return this;
        }
    }

    static final class com.google.firebase.perf.v1.q.c {
        static final MapEntryLite a;

        static {
            com.google.firebase.perf.v1.q.c.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.STRING, "");
        }
    }

    public static enum d implements EnumLite {
        class com.google.firebase.perf.v1.q.d.a implements EnumLiteMap {
            com.google.firebase.perf.v1.q.d.a() {
                super();
            }

            public d a(int v) {
                return d.b(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class com.google.firebase.perf.v1.q.d.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                com.google.firebase.perf.v1.q.d.b.a = new com.google.firebase.perf.v1.q.d.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return d.b(v) != null;
            }
        }

        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        private final int a;
        public static final int l = 0;
        public static final int m = 1;
        public static final int n = 2;
        public static final int o = 3;
        public static final int p = 4;
        public static final int q = 5;
        public static final int r = 6;
        public static final int s = 7;
        public static final int t = 8;
        public static final int u = 9;
        private static final EnumLiteMap v;

        static {
            d.v = new com.google.firebase.perf.v1.q.d.a();
        }

        private d(int v1) {
            this.a = v1;
        }

        private static d[] a() [...] // Inlined contents

        public static d b(int v) {
            switch(v) {
                case 0: {
                    return d.b;
                }
                case 1: {
                    return d.c;
                }
                case 2: {
                    return d.d;
                }
                case 3: {
                    return d.e;
                }
                case 4: {
                    return d.f;
                }
                case 5: {
                    return d.g;
                }
                case 6: {
                    return d.h;
                }
                case 7: {
                    return d.i;
                }
                case 8: {
                    return d.j;
                }
                case 9: {
                    return d.k;
                }
                default: {
                    return null;
                }
            }
        }

        public static EnumLiteMap c() {
            return d.v;
        }

        public static EnumVerifier d() {
            return com.google.firebase.perf.v1.q.d.b.a;
        }

        @Deprecated
        public static d e(int v) {
            return d.b(v);
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            return this.a;
        }
    }

    public static enum e implements EnumLite {
        class com.google.firebase.perf.v1.q.e.a implements EnumLiteMap {
            com.google.firebase.perf.v1.q.e.a() {
                super();
            }

            public e a(int v) {
                return e.b(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class com.google.firebase.perf.v1.q.e.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                com.google.firebase.perf.v1.q.e.b.a = new com.google.firebase.perf.v1.q.e.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return e.b(v) != null;
            }
        }

        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        private final int a;
        public static final int d = 0;
        public static final int e = 1;
        private static final EnumLiteMap f;

        static {
            e.f = new com.google.firebase.perf.v1.q.e.a();
        }

        private e(int v1) {
            this.a = v1;
        }

        private static e[] a() [...] // Inlined contents

        public static e b(int v) {
            switch(v) {
                case 0: {
                    return e.b;
                }
                case 1: {
                    return e.c;
                }
                default: {
                    return null;
                }
            }
        }

        public static EnumLiteMap c() {
            return e.f;
        }

        public static EnumVerifier d() {
            return com.google.firebase.perf.v1.q.e.b.a;
        }

        @Deprecated
        public static e e(int v) {
            return e.b(v);
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            return this.a;
        }
    }

    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final q DEFAULT_INSTANCE = null;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite customAttributes_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private ProtobufList perfSessions_;
    private long requestPayloadBytes_;
    private String responseContentType_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_;

    static {
        q q0 = new q();
        q.DEFAULT_INSTANCE = q0;
        GeneratedMessageLite.registerDefaultInstance(q.class, q0);
    }

    private q() {
        this.customAttributes_ = MapFieldLite.emptyMapField();
        this.url_ = "";
        this.responseContentType_ = "";
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Ac(long v) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = v;
    }

    @Override  // com.google.firebase.perf.v1.r
    public ByteString B0() {
        return ByteString.copyFromUtf8(this.url_);
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean B2() {
        return (this.bitField0_ & 2) != 0;
    }

    private void Bc(long v) {
        this.bitField0_ |= 0x100;
        this.timeToRequestCompletedUs_ = v;
    }

    private void Cc(long v) {
        this.bitField0_ |= 0x400;
        this.timeToResponseCompletedUs_ = v;
    }

    @Override  // com.google.firebase.perf.v1.r
    public int D() {
        return this.bc().size();
    }

    @Override  // com.google.firebase.perf.v1.r
    public ByteString D2() {
        return ByteString.copyFromUtf8(this.responseContentType_);
    }

    @Override  // com.google.firebase.perf.v1.r
    public d D4() {
        d q$d0 = d.b(this.httpMethod_);
        return q$d0 == null ? d.b : q$d0;
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean D5() {
        return (this.bitField0_ & 1) != 0;
    }

    private void Dc(long v) {
        this.bitField0_ |= 0x200;
        this.timeToResponseInitiatedUs_ = v;
    }

    private void Ec(String s) {
        s.getClass();
        this.bitField0_ |= 1;
        this.url_ = s;
    }

    @Override  // com.google.firebase.perf.v1.r
    public String F0() [...] // 潜在的解密器

    private void Fc(ByteString byteString0) {
        this.url_ = byteString0.toStringUtf8();
        this.bitField0_ |= 1;
    }

    @Override  // com.google.firebase.perf.v1.r
    public String G(String s, String s1) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.bc();
        return mapFieldLite0.containsKey(s) ? ((String)mapFieldLite0.get(s)) : s1;
    }

    private void Hb(Iterable iterable0) {
        this.Wb();
        AbstractMessageLite.addAll(iterable0, this.perfSessions_);
    }

    @Override  // com.google.firebase.perf.v1.r
    @Deprecated
    public Map I() {
        return this.L();
    }

    private void Ib(int v, u u0) {
        u0.getClass();
        this.Wb();
        this.perfSessions_.add(v, u0);
    }

    @Override  // com.google.firebase.perf.v1.r
    public u J0(int v) {
        return (u)this.perfSessions_.get(v);
    }

    private void Jb(u u0) {
        u0.getClass();
        this.Wb();
        this.perfSessions_.add(u0);
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean K(String s) {
        s.getClass();
        return this.bc().containsKey(s);
    }

    @Override  // com.google.firebase.perf.v1.r
    public e K9() {
        e q$e0 = e.b(this.networkClientErrorReason_);
        return q$e0 == null ? e.b : q$e0;
    }

    private void Kb() {
        this.bitField0_ &= 0xFFFFFF7F;
        this.clientStartTimeUs_ = 0L;
    }

    @Override  // com.google.firebase.perf.v1.r
    public Map L() {
        return DesugarCollections.unmodifiableMap(this.bc());
    }

    @Override  // com.google.firebase.perf.v1.r
    public int L0() {
        return this.perfSessions_.size();
    }

    private void Lb() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    @Override  // com.google.firebase.perf.v1.r
    public int M7() {
        return this.httpResponseCode_;
    }

    private void Mb() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    private void Nb() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean O2() {
        return (this.bitField0_ & 0x100) != 0;
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean O8() {
        return (this.bitField0_ & 4) != 0;
    }

    private void Ob() {
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Pb() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0L;
    }

    private void Qb() {
        this.bitField0_ &= -65;
        this.responseContentType_ = q.Xb().s5();
    }

    private void Rb() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0L;
    }

    private void Sb() {
        this.bitField0_ &= 0xFFFFFEFF;
        this.timeToRequestCompletedUs_ = 0L;
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean T6() {
        return (this.bitField0_ & 0x20) != 0;
    }

    private void Tb() {
        this.bitField0_ &= 0xFFFFFBFF;
        this.timeToResponseCompletedUs_ = 0L;
    }

    private void Ub() {
        this.bitField0_ &= 0xFFFFFDFF;
        this.timeToResponseInitiatedUs_ = 0L;
    }

    private void Vb() {
        this.bitField0_ &= -2;
        this.url_ = q.Xb().F0();
    }

    private void Wb() {
        ProtobufList internal$ProtobufList0 = this.perfSessions_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static q Xb() {
        return q.DEFAULT_INSTANCE;
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean Y1() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean Y3() {
        return (this.bitField0_ & 8) != 0;
    }

    private Map Yb() {
        return this.cc();
    }

    @Override  // com.google.firebase.perf.v1.r
    public List Z0() {
        return this.perfSessions_;
    }

    @Override  // com.google.firebase.perf.v1.r
    public long Z1() {
        return this.responsePayloadBytes_;
    }

    public v Zb(int v) {
        return (v)this.perfSessions_.get(v);
    }

    public List ac() {
        return this.perfSessions_;
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean b1() {
        return (this.bitField0_ & 0x80) != 0;
    }

    private MapFieldLite bc() {
        return this.customAttributes_;
    }

    private MapFieldLite cc() {
        if(!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    @Override  // com.google.firebase.perf.v1.r
    public long d1() {
        return this.clientStartTimeUs_;
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean d5() {
        return (this.bitField0_ & 0x400) != 0;
    }

    public static b dc() {
        return (b)q.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new q();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(q.DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000Bဌ\u0004\f2\r\u001B", new Object[]{"bitField0_", "url_", "httpMethod_", d.d(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.d(), "customAttributes_", com.google.firebase.perf.v1.q.c.a, "perfSessions_", u.class});
            }
            case 4: {
                return q.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = q.PARSER;
                if(parser0 == null) {
                    Class class0 = q.class;
                    synchronized(class0) {
                        parser0 = q.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(q.DEFAULT_INSTANCE);
                            q.PARSER = parser0;
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

    public static b ec(q q0) {
        return (b)q.DEFAULT_INSTANCE.createBuilder(q0);
    }

    public static q fc(InputStream inputStream0) throws IOException {
        return (q)GeneratedMessageLite.parseDelimitedFrom(q.DEFAULT_INSTANCE, inputStream0);
    }

    public static q gc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (q)GeneratedMessageLite.parseDelimitedFrom(q.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static q hc(ByteString byteString0) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, byteString0);
    }

    public static q ic(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static q jc(CodedInputStream codedInputStream0) throws IOException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static q kc(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static q lc(InputStream inputStream0) throws IOException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, inputStream0);
    }

    public static q mc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.firebase.perf.v1.r
    public long na() {
        return this.timeToResponseInitiatedUs_;
    }

    public static q nc(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static q oc(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    @Override  // com.google.firebase.perf.v1.r
    public long p2() {
        return this.requestPayloadBytes_;
    }

    public static Parser parser() {
        return q.DEFAULT_INSTANCE.getParserForType();
    }

    public static q pc(byte[] arr_b) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, arr_b);
    }

    public static q qc(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (q)GeneratedMessageLite.parseFrom(q.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void rc(int v) {
        this.Wb();
        this.perfSessions_.remove(v);
    }

    @Override  // com.google.firebase.perf.v1.r
    public String s5() {
        return this.responseContentType_;
    }

    private void sc(long v) {
        this.bitField0_ |= 0x80;
        this.clientStartTimeUs_ = v;
    }

    @Override  // com.google.firebase.perf.v1.r
    public long t1() {
        return this.timeToRequestCompletedUs_;
    }

    private void tc(d q$d0) {
        this.httpMethod_ = q$d0.getNumber();
        this.bitField0_ |= 2;
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean u2() {
        return (this.bitField0_ & 0x200) != 0;
    }

    private void uc(int v) {
        this.bitField0_ |= 0x20;
        this.httpResponseCode_ = v;
    }

    @Override  // com.google.firebase.perf.v1.r
    public boolean v1() {
        return (this.bitField0_ & 0x40) != 0;
    }

    private void vc(e q$e0) {
        this.networkClientErrorReason_ = q$e0.getNumber();
        this.bitField0_ |= 16;
    }

    @Override  // com.google.firebase.perf.v1.r
    public String w(String s) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.bc();
        if(!mapFieldLite0.containsKey(s)) {
            throw new IllegalArgumentException();
        }
        return (String)mapFieldLite0.get(s);
    }

    @Override  // com.google.firebase.perf.v1.r
    public long w1() {
        return this.timeToResponseCompletedUs_;
    }

    private void wc(int v, u u0) {
        u0.getClass();
        this.Wb();
        this.perfSessions_.set(v, u0);
    }

    private void xc(long v) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = v;
    }

    private void yc(String s) {
        s.getClass();
        this.bitField0_ |= 0x40;
        this.responseContentType_ = s;
    }

    private void zc(ByteString byteString0) {
        this.responseContentType_ = byteString0.toStringUtf8();
        this.bitField0_ |= 0x40;
    }
}

