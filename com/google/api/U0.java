package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
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
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class u0 extends GeneratedMessageLite implements v0 {
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

    public static final class b extends Builder implements v0 {
        private b() {
            super(u0.DEFAULT_INSTANCE);
        }

        b(a u0$a0) {
        }

        public b Ab() {
            this.copyOnWrite();
            ((u0)this.instance).Nb();
            return this;
        }

        public b Bb() {
            this.copyOnWrite();
            ((u0)this.instance).Ob();
            return this;
        }

        public b Cb() {
            this.copyOnWrite();
            ((u0)this.instance).Pb();
            return this;
        }

        public b Db() {
            this.copyOnWrite();
            ((u0)this.instance).Qb();
            return this;
        }

        public b Eb() {
            this.copyOnWrite();
            ((u0)this.instance).Rb();
            return this;
        }

        public b Fb() {
            this.copyOnWrite();
            ((u0)this.instance).clearName();
            return this;
        }

        public b Gb() {
            this.copyOnWrite();
            ((u0)this.instance).clearType();
            return this;
        }

        public b Hb() {
            this.copyOnWrite();
            ((u0)this.instance).Sb();
            return this;
        }

        public b Ib() {
            this.copyOnWrite();
            ((u0)this.instance).Tb();
            return this;
        }

        public b Jb(c u0$c0) {
            this.copyOnWrite();
            ((u0)this.instance).Yb(u0$c0);
            return this;
        }

        public b Kb(int v) {
            this.copyOnWrite();
            ((u0)this.instance).nc(v);
            return this;
        }

        public b Lb(String s) {
            this.copyOnWrite();
            ((u0)this.instance).oc(s);
            return this;
        }

        @Override  // com.google.api.v0
        public ByteString M0() {
            return ((u0)this.instance).M0();
        }

        public b Mb(ByteString byteString0) {
            this.copyOnWrite();
            ((u0)this.instance).pc(byteString0);
            return this;
        }

        public b Nb(String s) {
            this.copyOnWrite();
            ((u0)this.instance).qc(s);
            return this;
        }

        @Override  // com.google.api.v0
        public i0 O(int v) {
            return ((u0)this.instance).O(v);
        }

        public b Ob(ByteString byteString0) {
            this.copyOnWrite();
            ((u0)this.instance).rc(byteString0);
            return this;
        }

        @Override  // com.google.api.v0
        public int P() {
            return ((u0)this.instance).P();
        }

        @Override  // com.google.api.v0
        public int P9() {
            return ((u0)this.instance).P9();
        }

        public b Pb(int v, com.google.api.i0.b i0$b0) {
            this.copyOnWrite();
            ((u0)this.instance).sc(v, ((i0)i0$b0.build()));
            return this;
        }

        public b Qb(int v, i0 i00) {
            this.copyOnWrite();
            ((u0)this.instance).sc(v, i00);
            return this;
        }

        @Override  // com.google.api.v0
        public boolean R0() {
            return ((u0)this.instance).R0();
        }

        public b Rb(l0 l00) {
            this.copyOnWrite();
            ((u0)this.instance).tc(l00);
            return this;
        }

        public b Sb(int v) {
            this.copyOnWrite();
            ((u0)this.instance).uc(v);
            return this;
        }

        public b Tb(com.google.api.u0.c.a u0$c$a0) {
            this.copyOnWrite();
            ((u0)this.instance).vc(((c)u0$c$a0.build()));
            return this;
        }

        public b Ub(c u0$c0) {
            this.copyOnWrite();
            ((u0)this.instance).vc(u0$c0);
            return this;
        }

        @Override  // com.google.api.v0
        public String V() {
            return ((u0)this.instance).V();
        }

        public b Vb(e u0$e0) {
            this.copyOnWrite();
            ((u0)this.instance).wc(u0$e0);
            return this;
        }

        public b Wb(int v) {
            this.copyOnWrite();
            ((u0)this.instance).xc(v);
            return this;
        }

        public b Xb(String s) {
            this.copyOnWrite();
            ((u0)this.instance).setName(s);
            return this;
        }

        public b Yb(ByteString byteString0) {
            this.copyOnWrite();
            ((u0)this.instance).setNameBytes(byteString0);
            return this;
        }

        public b Zb(String s) {
            this.copyOnWrite();
            ((u0)this.instance).setType(s);
            return this;
        }

        @Override  // com.google.api.v0
        public ByteString a() {
            return ((u0)this.instance).a();
        }

        @Override  // com.google.api.v0
        public int a0() {
            return ((u0)this.instance).a0();
        }

        public b ac(ByteString byteString0) {
            this.copyOnWrite();
            ((u0)this.instance).setTypeBytes(byteString0);
            return this;
        }

        public b bc(String s) {
            this.copyOnWrite();
            ((u0)this.instance).yc(s);
            return this;
        }

        public b cc(ByteString byteString0) {
            this.copyOnWrite();
            ((u0)this.instance).zc(byteString0);
            return this;
        }

        @Override  // com.google.api.v0
        public int d() {
            return ((u0)this.instance).d();
        }

        public b dc(f u0$f0) {
            this.copyOnWrite();
            ((u0)this.instance).Ac(u0$f0);
            return this;
        }

        public b ec(int v) {
            this.copyOnWrite();
            ((u0)this.instance).Bc(v);
            return this;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.api.v0
        public String getDescription() {
            return "";
        }

        @Override  // com.google.api.v0
        public c getMetadata() {
            return ((u0)this.instance).getMetadata();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.api.v0
        public String getName() {
            return "";
        }

        @Override  // com.google.api.v0
        public ByteString getNameBytes() {
            return ((u0)this.instance).getNameBytes();
        }

        @Override  // com.google.api.v0
        public String getType() {
            return ((u0)this.instance).getType();
        }

        @Override  // com.google.api.v0
        public ByteString getTypeBytes() {
            return ((u0)this.instance).getTypeBytes();
        }

        @Override  // com.google.api.v0
        public String h() {
            return ((u0)this.instance).h();
        }

        @Override  // com.google.api.v0
        public f o0() {
            return ((u0)this.instance).o0();
        }

        @Override  // com.google.api.v0
        public ByteString r() {
            return ((u0)this.instance).r();
        }

        @Override  // com.google.api.v0
        public List s() {
            return DesugarCollections.unmodifiableList(((u0)this.instance).s());
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((u0)this.instance).Jb(iterable0);
            return this;
        }

        @Override  // com.google.api.v0
        public l0 v() {
            return ((u0)this.instance).v();
        }

        public b vb(int v, com.google.api.i0.b i0$b0) {
            this.copyOnWrite();
            ((u0)this.instance).Kb(v, ((i0)i0$b0.build()));
            return this;
        }

        public b wb(int v, i0 i00) {
            this.copyOnWrite();
            ((u0)this.instance).Kb(v, i00);
            return this;
        }

        public b xb(com.google.api.i0.b i0$b0) {
            this.copyOnWrite();
            ((u0)this.instance).Lb(((i0)i0$b0.build()));
            return this;
        }

        public b yb(i0 i00) {
            this.copyOnWrite();
            ((u0)this.instance).Lb(i00);
            return this;
        }

        @Override  // com.google.api.v0
        public e z9() {
            return ((u0)this.instance).z9();
        }

        public b zb() {
            this.copyOnWrite();
            ((u0)this.instance).Mb();
            return this;
        }
    }

    public static final class c extends GeneratedMessageLite implements d {
        public static final class com.google.api.u0.c.a extends Builder implements d {
            private com.google.api.u0.c.a() {
                super(c.DEFAULT_INSTANCE);
            }

            com.google.api.u0.c.a(a u0$a0) {
            }

            public com.google.api.u0.c.a Ab(Duration duration0) {
                this.copyOnWrite();
                ((c)this.instance).Fb(duration0);
                return this;
            }

            @Deprecated
            public com.google.api.u0.c.a Bb(l0 l00) {
                this.copyOnWrite();
                ((c)this.instance).Gb(l00);
                return this;
            }

            @Deprecated
            public com.google.api.u0.c.a Cb(int v) {
                this.copyOnWrite();
                ((c)this.instance).Hb(v);
                return this;
            }

            public com.google.api.u0.c.a Db(com.google.protobuf.Duration.Builder duration$Builder0) {
                this.copyOnWrite();
                ((c)this.instance).Ib(((Duration)duration$Builder0.build()));
                return this;
            }

            public com.google.api.u0.c.a Eb(Duration duration0) {
                this.copyOnWrite();
                ((c)this.instance).Ib(duration0);
                return this;
            }

            @Override  // com.google.api.u0$d
            @Deprecated
            public int P() {
                return ((c)this.instance).P();
            }

            @Override  // com.google.api.u0$d
            public boolean Ra() {
                return ((c)this.instance).Ra();
            }

            @Override  // com.google.api.u0$d
            public boolean Z5() {
                return ((c)this.instance).Z5();
            }

            @Override  // com.google.api.u0$d
            public Duration h7() {
                return ((c)this.instance).h7();
            }

            @Override  // com.google.api.u0$d
            public Duration ob() {
                return ((c)this.instance).ob();
            }

            public com.google.api.u0.c.a ub() {
                this.copyOnWrite();
                ((c)this.instance).B6();
                return this;
            }

            @Override  // com.google.api.u0$d
            @Deprecated
            public l0 v() {
                return ((c)this.instance).v();
            }

            @Deprecated
            public com.google.api.u0.c.a vb() {
                this.copyOnWrite();
                ((c)this.instance).M6();
                return this;
            }

            public com.google.api.u0.c.a wb() {
                this.copyOnWrite();
                ((c)this.instance).Z7();
                return this;
            }

            public com.google.api.u0.c.a xb(Duration duration0) {
                this.copyOnWrite();
                ((c)this.instance).A8(duration0);
                return this;
            }

            public com.google.api.u0.c.a yb(Duration duration0) {
                this.copyOnWrite();
                ((c)this.instance).j9(duration0);
                return this;
            }

            public com.google.api.u0.c.a zb(com.google.protobuf.Duration.Builder duration$Builder0) {
                this.copyOnWrite();
                ((c)this.instance).Fb(((Duration)duration$Builder0.build()));
                return this;
            }
        }

        private static final c DEFAULT_INSTANCE = null;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private Duration ingestDelay_;
        private int launchStage_;
        private Duration samplePeriod_;

        static {
            c u0$c0 = new c();
            c.DEFAULT_INSTANCE = u0$c0;
            GeneratedMessageLite.registerDefaultInstance(c.class, u0$c0);
        }

        private void A8(Duration duration0) {
            duration0.getClass();
            if(this.ingestDelay_ != null && this.ingestDelay_ != Duration.getDefaultInstance()) {
                this.ingestDelay_ = (Duration)((com.google.protobuf.Duration.Builder)Duration.newBuilder(this.ingestDelay_).mergeFrom(duration0)).buildPartial();
                return;
            }
            this.ingestDelay_ = duration0;
        }

        public static c Ab(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        private void B6() {
            this.ingestDelay_ = null;
        }

        public static c Bb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static c Cb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static c Db(byte[] arr_b) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b);
        }

        public static c Eb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        private void Fb(Duration duration0) {
            duration0.getClass();
            this.ingestDelay_ = duration0;
        }

        private void Gb(l0 l00) {
            this.launchStage_ = l00.getNumber();
        }

        private void Hb(int v) {
            this.launchStage_ = v;
        }

        private void Ib(Duration duration0) {
            duration0.getClass();
            this.samplePeriod_ = duration0;
        }

        public static com.google.api.u0.c.a Ja(c u0$c0) {
            return (com.google.api.u0.c.a)c.DEFAULT_INSTANCE.createBuilder(u0$c0);
        }

        public static c La(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0);
        }

        private void M6() {
            this.launchStage_ = 0;
        }

        @Override  // com.google.api.u0$d
        @Deprecated
        public int P() {
            return this.launchStage_;
        }

        @Override  // com.google.api.u0$d
        public boolean Ra() {
            return this.ingestDelay_ != null;
        }

        @Override  // com.google.api.u0$d
        public boolean Z5() {
            return this.samplePeriod_ != null;
        }

        private void Z7() {
            this.samplePeriod_ = null;
        }

        public static com.google.api.u0.c.a ca() {
            return (com.google.api.u0.c.a)c.DEFAULT_INSTANCE.createBuilder();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new c();
                }
                case 2: {
                    return new com.google.api.u0.c.a(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(c.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"launchStage_", "samplePeriod_", "ingestDelay_"});
                }
                case 4: {
                    return c.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = c.PARSER;
                    if(parser0 == null) {
                        Class class0 = c.class;
                        synchronized(class0) {
                            parser0 = c.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(c.DEFAULT_INSTANCE);
                                c.PARSER = parser0;
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

        @Override  // com.google.api.u0$d
        public Duration h7() {
            return this.samplePeriod_ == null ? Duration.getDefaultInstance() : this.samplePeriod_;
        }

        private void j9(Duration duration0) {
            duration0.getClass();
            if(this.samplePeriod_ != null && this.samplePeriod_ != Duration.getDefaultInstance()) {
                this.samplePeriod_ = (Duration)((com.google.protobuf.Duration.Builder)Duration.newBuilder(this.samplePeriod_).mergeFrom(duration0)).buildPartial();
                return;
            }
            this.samplePeriod_ = duration0;
        }

        @Override  // com.google.api.u0$d
        public Duration ob() {
            return this.ingestDelay_ == null ? Duration.getDefaultInstance() : this.ingestDelay_;
        }

        public static Parser parser() {
            return c.DEFAULT_INSTANCE.getParserForType();
        }

        public static c ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        @Override  // com.google.api.u0$d
        @Deprecated
        public l0 v() {
            l0 l00 = l0.a(this.launchStage_);
            return l00 == null ? l0.h : l00;
        }

        public static c v8() {
            return c.DEFAULT_INSTANCE;
        }

        public static c vb(ByteString byteString0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0);
        }

        public static c wb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static c xb(CodedInputStream codedInputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static c yb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static c zb(InputStream inputStream0) throws IOException {
            return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0);
        }
    }

    public interface d extends MessageLiteOrBuilder {
        @Deprecated
        int P();

        boolean Ra();

        boolean Z5();

        Duration h7();

        Duration ob();

        @Deprecated
        l0 v();
    }

    public static enum e implements EnumLite {
        class com.google.api.u0.e.a implements EnumLiteMap {
            com.google.api.u0.e.a() {
                super();
            }

            public e a(int v) {
                return e.a(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class com.google.api.u0.e.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                com.google.api.u0.e.b.a = new com.google.api.u0.e.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return e.a(v) != null;
            }
        }

        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);

        private final int a;
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
        private static final EnumLiteMap k;

        static {
            e.k = new com.google.api.u0.e.a();
        }

        private e(int v1) {
            this.a = v1;
        }

        public static e a(int v) {
            switch(v) {
                case 0: {
                    return e.b;
                }
                case 1: {
                    return e.c;
                }
                case 2: {
                    return e.d;
                }
                case 3: {
                    return e.e;
                }
                default: {
                    return null;
                }
            }
        }

        public static EnumLiteMap b() {
            return e.k;
        }

        public static EnumVerifier c() {
            return com.google.api.u0.e.b.a;
        }

        @Deprecated
        public static e d(int v) {
            return e.a(v);
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == e.f) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.a;
        }
    }

    public static enum f implements EnumLite {
        class com.google.api.u0.f.a implements EnumLiteMap {
            com.google.api.u0.f.a() {
                super();
            }

            public f a(int v) {
                return f.a(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class com.google.api.u0.f.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                com.google.api.u0.f.b.a = new com.google.api.u0.f.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return f.a(v) != null;
            }
        }

        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);

        private final int a;
        public static final int j = 0;
        public static final int k = 1;
        public static final int l = 2;
        public static final int m = 3;
        public static final int n = 4;
        public static final int o = 5;
        public static final int p = 6;
        private static final EnumLiteMap q;

        static {
            f.q = new com.google.api.u0.f.a();
        }

        private f(int v1) {
            this.a = v1;
        }

        public static f a(int v) {
            switch(v) {
                case 0: {
                    return f.b;
                }
                case 1: {
                    return f.c;
                }
                case 2: {
                    return f.d;
                }
                case 3: {
                    return f.e;
                }
                case 4: {
                    return f.f;
                }
                case 5: {
                    return f.g;
                }
                case 6: {
                    return f.h;
                }
                default: {
                    return null;
                }
            }
        }

        public static EnumLiteMap b() {
            return f.q;
        }

        public static EnumVerifier c() {
            return com.google.api.u0.f.b.a;
        }

        @Deprecated
        public static f d(int v) {
            return f.a(v);
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == f.i) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.a;
        }
    }

    private static final u0 DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private String description_;
    private String displayName_;
    private ProtobufList labels_;
    private int launchStage_;
    private c metadata_;
    private int metricKind_;
    private String name_;
    private String type_;
    private String unit_;
    private int valueType_;

    static {
        u0 u00 = new u0();
        u0.DEFAULT_INSTANCE = u00;
        GeneratedMessageLite.registerDefaultInstance(u0.class, u00);
    }

    private u0() {
        this.name_ = "";
        this.type_ = "";
        this.labels_ = GeneratedMessageLite.emptyProtobufList();
        this.unit_ = "";
        this.description_ = "";
        this.displayName_ = "";
    }

    private void Ac(f u0$f0) {
        this.valueType_ = u0$f0.getNumber();
    }

    private void Bc(int v) {
        this.valueType_ = v;
    }

    private void Jb(Iterable iterable0) {
        this.Ub();
        AbstractMessageLite.addAll(iterable0, this.labels_);
    }

    private void Kb(int v, i0 i00) {
        i00.getClass();
        this.Ub();
        this.labels_.add(v, i00);
    }

    private void Lb(i0 i00) {
        i00.getClass();
        this.Ub();
        this.labels_.add(i00);
    }

    @Override  // com.google.api.v0
    public ByteString M0() {
        return ByteString.copyFromUtf8(this.unit_);
    }

    private void Mb() {
        this.description_ = "";
    }

    private void Nb() {
        this.displayName_ = u0.Vb().h();
    }

    @Override  // com.google.api.v0
    public i0 O(int v) {
        return (i0)this.labels_.get(v);
    }

    private void Ob() {
        this.labels_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.api.v0
    public int P() {
        return this.launchStage_;
    }

    @Override  // com.google.api.v0
    public int P9() {
        return this.metricKind_;
    }

    private void Pb() {
        this.launchStage_ = 0;
    }

    private void Qb() {
        this.metadata_ = null;
    }

    @Override  // com.google.api.v0
    public boolean R0() {
        return this.metadata_ != null;
    }

    private void Rb() {
        this.metricKind_ = 0;
    }

    private void Sb() {
        this.unit_ = "";
    }

    private void Tb() {
        this.valueType_ = 0;
    }

    private void Ub() {
        ProtobufList internal$ProtobufList0 = this.labels_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.api.v0
    public String V() {
        return this.unit_;
    }

    public static u0 Vb() {
        return u0.DEFAULT_INSTANCE;
    }

    public j0 Wb(int v) {
        return (j0)this.labels_.get(v);
    }

    public List Xb() {
        return this.labels_;
    }

    private void Yb(c u0$c0) {
        u0$c0.getClass();
        if(this.metadata_ != null && this.metadata_ != c.v8()) {
            this.metadata_ = (c)((com.google.api.u0.c.a)c.Ja(this.metadata_).mergeFrom(u0$c0)).buildPartial();
            return;
        }
        this.metadata_ = u0$c0;
    }

    public static b Zb() {
        return (b)u0.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.api.v0
    public ByteString a() {
        return ByteString.copyFromUtf8(this.description_);
    }

    @Override  // com.google.api.v0
    public int a0() {
        return this.valueType_;
    }

    public static b ac(u0 u00) {
        return (b)u0.DEFAULT_INSTANCE.createBuilder(u00);
    }

    public static u0 bc(InputStream inputStream0) throws IOException {
        return (u0)GeneratedMessageLite.parseDelimitedFrom(u0.DEFAULT_INSTANCE, inputStream0);
    }

    public static u0 cc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (u0)GeneratedMessageLite.parseDelimitedFrom(u0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void clearName() {
        this.name_ = "";
    }

    private void clearType() {
        this.type_ = "";
    }

    @Override  // com.google.api.v0
    public int d() {
        return this.labels_.size();
    }

    public static u0 dc(ByteString byteString0) throws InvalidProtocolBufferException {
        return (u0)GeneratedMessageLite.parseFrom(u0.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new u0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(u0.DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001B\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\n\t\f\f", new Object[]{"name_", "labels_", i0.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            }
            case 4: {
                return u0.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = u0.PARSER;
                if(parser0 == null) {
                    Class class0 = u0.class;
                    synchronized(class0) {
                        parser0 = u0.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(u0.DEFAULT_INSTANCE);
                            u0.PARSER = parser0;
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

    public static u0 ec(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (u0)GeneratedMessageLite.parseFrom(u0.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static u0 fc(CodedInputStream codedInputStream0) throws IOException {
        return (u0)GeneratedMessageLite.parseFrom(u0.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static u0 gc(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (u0)GeneratedMessageLite.parseFrom(u0.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.api.v0
    public String getDescription() [...] // 潜在的解密器

    @Override  // com.google.api.v0
    public c getMetadata() {
        return this.metadata_ == null ? c.v8() : this.metadata_;
    }

    @Override  // com.google.api.v0
    public String getName() [...] // 潜在的解密器

    @Override  // com.google.api.v0
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // com.google.api.v0
    public String getType() {
        return this.type_;
    }

    @Override  // com.google.api.v0
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    @Override  // com.google.api.v0
    public String h() {
        return this.displayName_;
    }

    public static u0 hc(InputStream inputStream0) throws IOException {
        return (u0)GeneratedMessageLite.parseFrom(u0.DEFAULT_INSTANCE, inputStream0);
    }

    public static u0 ic(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (u0)GeneratedMessageLite.parseFrom(u0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static u0 jc(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (u0)GeneratedMessageLite.parseFrom(u0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static u0 kc(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (u0)GeneratedMessageLite.parseFrom(u0.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static u0 lc(byte[] arr_b) throws InvalidProtocolBufferException {
        return (u0)GeneratedMessageLite.parseFrom(u0.DEFAULT_INSTANCE, arr_b);
    }

    public static u0 mc(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (u0)GeneratedMessageLite.parseFrom(u0.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void nc(int v) {
        this.Ub();
        this.labels_.remove(v);
    }

    @Override  // com.google.api.v0
    public f o0() {
        f u0$f0 = f.a(this.valueType_);
        return u0$f0 == null ? f.i : u0$f0;
    }

    private void oc(String s) {
        s.getClass();
        this.description_ = s;
    }

    public static Parser parser() {
        return u0.DEFAULT_INSTANCE.getParserForType();
    }

    private void pc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.description_ = byteString0.toStringUtf8();
    }

    private void qc(String s) {
        s.getClass();
        this.displayName_ = s;
    }

    @Override  // com.google.api.v0
    public ByteString r() {
        return ByteString.copyFromUtf8(this.displayName_);
    }

    private void rc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.displayName_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.v0
    public List s() {
        return this.labels_;
    }

    private void sc(int v, i0 i00) {
        i00.getClass();
        this.Ub();
        this.labels_.set(v, i00);
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

    private void tc(l0 l00) {
        this.launchStage_ = l00.getNumber();
    }

    private void uc(int v) {
        this.launchStage_ = v;
    }

    @Override  // com.google.api.v0
    public l0 v() {
        l0 l00 = l0.a(this.launchStage_);
        return l00 == null ? l0.h : l00;
    }

    private void vc(c u0$c0) {
        u0$c0.getClass();
        this.metadata_ = u0$c0;
    }

    private void wc(e u0$e0) {
        this.metricKind_ = u0$e0.getNumber();
    }

    private void xc(int v) {
        this.metricKind_ = v;
    }

    private void yc(String s) {
        s.getClass();
        this.unit_ = s;
    }

    @Override  // com.google.api.v0
    public e z9() {
        e u0$e0 = e.a(this.metricKind_);
        return u0$e0 == null ? e.f : u0$e0;
    }

    private void zc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.unit_ = byteString0.toStringUtf8();
    }
}

