package com.google.firebase.perf.v1;

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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class o extends GeneratedMessageLite implements p {
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

    public static final class b extends Builder implements p {
        private b() {
            super(o.DEFAULT_INSTANCE);
        }

        b(a o$a0) {
        }

        @Override  // com.google.firebase.perf.v1.p
        public boolean R9() {
            return ((o)this.instance).R9();
        }

        @Override  // com.google.firebase.perf.v1.p
        public d getNetworkType() {
            return ((o)this.instance).getNetworkType();
        }

        @Override  // com.google.firebase.perf.v1.p
        public boolean hasNetworkType() {
            return ((o)this.instance).hasNetworkType();
        }

        @Override  // com.google.firebase.perf.v1.p
        public c u5() {
            return ((o)this.instance).u5();
        }

        public b ub() {
            this.copyOnWrite();
            ((o)this.instance).M4();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((o)this.instance).clearNetworkType();
            return this;
        }

        public b wb(c o$c0) {
            this.copyOnWrite();
            ((o)this.instance).wb(o$c0);
            return this;
        }

        public b xb(d o$d0) {
            this.copyOnWrite();
            ((o)this.instance).xb(o$d0);
            return this;
        }
    }

    public static enum c implements EnumLite {
        class com.google.firebase.perf.v1.o.c.a implements EnumLiteMap {
            com.google.firebase.perf.v1.o.c.a() {
                super();
            }

            public c a(int v) {
                return c.b(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class com.google.firebase.perf.v1.o.c.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                com.google.firebase.perf.v1.o.c.b.a = new com.google.firebase.perf.v1.o.c.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return c.b(v) != null;
            }
        }

        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);

        public static final int A = 4;
        public static final int B = 5;
        public static final int C = 6;
        public static final int D = 7;
        public static final int E = 8;
        public static final int F = 9;
        public static final int G = 10;
        public static final int H = 11;
        public static final int I = 12;
        public static final int J = 13;
        public static final int K = 14;
        public static final int L = 15;
        public static final int M = 16;
        public static final int N = 17;
        public static final int O = 18;
        public static final int P = 19;
        public static final int Q = 100;
        private static final EnumLiteMap X = null;
        private final int a;
        public static final int w = 0;
        public static final int x = 1;
        public static final int y = 2;
        public static final int z = 3;

        static {
            c.X = new com.google.firebase.perf.v1.o.c.a();
        }

        private c(int v1) {
            this.a = v1;
        }

        private static c[] a() [...] // Inlined contents

        public static c b(int v) {
            if(v != 100) {
                switch(v) {
                    case 0: {
                        return c.b;
                    }
                    case 1: {
                        return c.c;
                    }
                    case 2: {
                        return c.d;
                    }
                    case 3: {
                        return c.e;
                    }
                    case 4: {
                        return c.f;
                    }
                    case 5: {
                        return c.g;
                    }
                    case 6: {
                        return c.h;
                    }
                    case 7: {
                        return c.i;
                    }
                    case 8: {
                        return c.j;
                    }
                    case 9: {
                        return c.k;
                    }
                    case 10: {
                        return c.l;
                    }
                    case 11: {
                        return c.m;
                    }
                    case 12: {
                        return c.n;
                    }
                    case 13: {
                        return c.o;
                    }
                    case 14: {
                        return c.p;
                    }
                    case 15: {
                        return c.q;
                    }
                    case 16: {
                        return c.r;
                    }
                    case 17: {
                        return c.s;
                    }
                    case 18: {
                        return c.t;
                    }
                    case 19: {
                        return c.u;
                    }
                    default: {
                        return null;
                    }
                }
            }
            return c.v;
        }

        public static EnumLiteMap c() {
            return c.X;
        }

        public static EnumVerifier d() {
            return com.google.firebase.perf.v1.o.c.b.a;
        }

        @Deprecated
        public static c e(int v) {
            return c.b(v);
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            return this.a;
        }
    }

    public static enum d implements EnumLite {
        class com.google.firebase.perf.v1.o.d.a implements EnumLiteMap {
            com.google.firebase.perf.v1.o.d.a() {
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

        static final class com.google.firebase.perf.v1.o.d.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                com.google.firebase.perf.v1.o.d.b.a = new com.google.firebase.perf.v1.o.d.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return d.b(v) != null;
            }
        }

        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);

        public static final int A = 5;
        public static final int B = 6;
        public static final int C = 7;
        public static final int D = 8;
        public static final int E = 9;
        public static final int F = 10;
        public static final int G = 11;
        public static final int H = 12;
        public static final int I = 13;
        public static final int J = 14;
        public static final int K = 15;
        public static final int L = 16;
        public static final int M = 17;
        private static final EnumLiteMap N = null;
        private final int a;
        public static final int u = -1;
        public static final int v = 0;
        public static final int w = 1;
        public static final int x = 2;
        public static final int y = 3;
        public static final int z = 4;

        static {
            d.N = new com.google.firebase.perf.v1.o.d.a();
        }

        private d(int v1) {
            this.a = v1;
        }

        private static d[] a() [...] // Inlined contents

        public static d b(int v) {
            switch(v) {
                case -1: {
                    return d.b;
                }
                case 0: {
                    return d.c;
                }
                case 1: {
                    return d.d;
                }
                case 2: {
                    return d.e;
                }
                case 3: {
                    return d.f;
                }
                case 4: {
                    return d.g;
                }
                case 5: {
                    return d.h;
                }
                case 6: {
                    return d.i;
                }
                case 7: {
                    return d.j;
                }
                case 8: {
                    return d.k;
                }
                case 9: {
                    return d.l;
                }
                case 10: {
                    return d.m;
                }
                case 11: {
                    return d.n;
                }
                case 12: {
                    return d.o;
                }
                case 13: {
                    return d.p;
                }
                case 14: {
                    return d.q;
                }
                case 15: {
                    return d.r;
                }
                case 16: {
                    return d.s;
                }
                case 17: {
                    return d.t;
                }
                default: {
                    return null;
                }
            }
        }

        public static EnumLiteMap c() {
            return d.N;
        }

        public static EnumVerifier d() {
            return com.google.firebase.perf.v1.o.d.b.a;
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

    private static final o DEFAULT_INSTANCE = null;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_;

    static {
        o o0 = new o();
        o.DEFAULT_INSTANCE = o0;
        GeneratedMessageLite.registerDefaultInstance(o.class, o0);
    }

    private o() {
        this.networkType_ = -1;
    }

    public static o A6(InputStream inputStream0) throws IOException {
        return (o)GeneratedMessageLite.parseDelimitedFrom(o.DEFAULT_INSTANCE, inputStream0);
    }

    public static o A8(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (o)GeneratedMessageLite.parseFrom(o.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static o B6(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (o)GeneratedMessageLite.parseDelimitedFrom(o.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static o Ja(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (o)GeneratedMessageLite.parseFrom(o.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static o La(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (o)GeneratedMessageLite.parseFrom(o.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    private void M4() {
        this.bitField0_ &= -3;
        this.mobileSubtype_ = 0;
    }

    public static o M6(ByteString byteString0) throws InvalidProtocolBufferException {
        return (o)GeneratedMessageLite.parseFrom(o.DEFAULT_INSTANCE, byteString0);
    }

    public static o P4() {
        return o.DEFAULT_INSTANCE;
    }

    @Override  // com.google.firebase.perf.v1.p
    public boolean R9() {
        return (this.bitField0_ & 2) != 0;
    }

    public static o Z7(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (o)GeneratedMessageLite.parseFrom(o.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static o ca(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (o)GeneratedMessageLite.parseFrom(o.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void clearNetworkType() {
        this.bitField0_ &= -2;
        this.networkType_ = -1;
    }

    public static b d6() {
        return (b)o.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new o();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(o.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "networkType_", d.d(), "mobileSubtype_", c.d()});
            }
            case 4: {
                return o.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = o.PARSER;
                if(parser0 == null) {
                    Class class0 = o.class;
                    synchronized(class0) {
                        parser0 = o.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(o.DEFAULT_INSTANCE);
                            o.PARSER = parser0;
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

    @Override  // com.google.firebase.perf.v1.p
    public d getNetworkType() {
        d o$d0 = d.b(this.networkType_);
        return o$d0 == null ? d.b : o$d0;
    }

    @Override  // com.google.firebase.perf.v1.p
    public boolean hasNetworkType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static o j9(InputStream inputStream0) throws IOException {
        return (o)GeneratedMessageLite.parseFrom(o.DEFAULT_INSTANCE, inputStream0);
    }

    public static Parser parser() {
        return o.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.firebase.perf.v1.p
    public c u5() {
        c o$c0 = c.b(this.mobileSubtype_);
        return o$c0 == null ? c.b : o$c0;
    }

    public static o ub(byte[] arr_b) throws InvalidProtocolBufferException {
        return (o)GeneratedMessageLite.parseFrom(o.DEFAULT_INSTANCE, arr_b);
    }

    public static o v8(CodedInputStream codedInputStream0) throws IOException {
        return (o)GeneratedMessageLite.parseFrom(o.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static o vb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (o)GeneratedMessageLite.parseFrom(o.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void wb(c o$c0) {
        this.mobileSubtype_ = o$c0.getNumber();
        this.bitField0_ |= 2;
    }

    private void xb(d o$d0) {
        this.networkType_ = o$d0.getNumber();
        this.bitField0_ |= 1;
    }

    public static b z6(o o0) {
        return (b)o.DEFAULT_INSTANCE.createBuilder(o0);
    }
}

