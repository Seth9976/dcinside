package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
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

public final class s extends GeneratedMessageLite implements t {
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

    public static final class b extends Builder implements t {
        private b() {
            super(s.DEFAULT_INSTANCE);
        }

        b(a s$a0) {
        }

        public b Ab(m m0) {
            this.copyOnWrite();
            ((s)this.instance).yb(m0);
            return this;
        }

        public b Bb(q q0) {
            this.copyOnWrite();
            ((s)this.instance).zb(q0);
            return this;
        }

        public b Cb(x x0) {
            this.copyOnWrite();
            ((s)this.instance).Ab(x0);
            return this;
        }

        public b Db(z z0) {
            this.copyOnWrite();
            ((s)this.instance).Bb(z0);
            return this;
        }

        public b Eb(com.google.firebase.perf.v1.e.b e$b0) {
            this.copyOnWrite();
            ((s)this.instance).Qb(((e)e$b0.build()));
            return this;
        }

        public b Fb(e e0) {
            this.copyOnWrite();
            ((s)this.instance).Qb(e0);
            return this;
        }

        public b Gb(com.google.firebase.perf.v1.m.b m$b0) {
            this.copyOnWrite();
            ((s)this.instance).Rb(((m)m$b0.build()));
            return this;
        }

        public b Hb(m m0) {
            this.copyOnWrite();
            ((s)this.instance).Rb(m0);
            return this;
        }

        public b Ib(com.google.firebase.perf.v1.q.b q$b0) {
            this.copyOnWrite();
            ((s)this.instance).Sb(((q)q$b0.build()));
            return this;
        }

        public b Jb(q q0) {
            this.copyOnWrite();
            ((s)this.instance).Sb(q0);
            return this;
        }

        public b Kb(com.google.firebase.perf.v1.x.b x$b0) {
            this.copyOnWrite();
            ((s)this.instance).Tb(((x)x$b0.build()));
            return this;
        }

        public b Lb(x x0) {
            this.copyOnWrite();
            ((s)this.instance).Tb(x0);
            return this;
        }

        public b Mb(com.google.firebase.perf.v1.z.b z$b0) {
            this.copyOnWrite();
            ((s)this.instance).Ub(((z)z$b0.build()));
            return this;
        }

        public b Nb(z z0) {
            this.copyOnWrite();
            ((s)this.instance).Ub(z0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.t
        public e W1() {
            return ((s)this.instance).W1();
        }

        @Override  // com.google.firebase.perf.v1.t
        public boolean Z6() {
            return ((s)this.instance).Z6();
        }

        @Override  // com.google.firebase.perf.v1.t
        public z b4() {
            return ((s)this.instance).b4();
        }

        @Override  // com.google.firebase.perf.v1.t
        public m e5() {
            return ((s)this.instance).e5();
        }

        @Override  // com.google.firebase.perf.v1.t
        public boolean e6() {
            return ((s)this.instance).e6();
        }

        @Override  // com.google.firebase.perf.v1.t
        public boolean n5() {
            return ((s)this.instance).n5();
        }

        @Override  // com.google.firebase.perf.v1.t
        public q s2() {
            return ((s)this.instance).s2();
        }

        @Override  // com.google.firebase.perf.v1.t
        public boolean s7() {
            return ((s)this.instance).s7();
        }

        @Override  // com.google.firebase.perf.v1.t
        public boolean t9() {
            return ((s)this.instance).t9();
        }

        public b ub() {
            this.copyOnWrite();
            ((s)this.instance).ca();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((s)this.instance).Ja();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((s)this.instance).La();
            return this;
        }

        public b xb() {
            this.copyOnWrite();
            ((s)this.instance).ub();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.t
        public x y9() {
            return ((s)this.instance).y9();
        }

        public b yb() {
            this.copyOnWrite();
            ((s)this.instance).vb();
            return this;
        }

        public b zb(e e0) {
            this.copyOnWrite();
            ((s)this.instance).xb(e0);
            return this;
        }
    }

    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final s DEFAULT_INSTANCE = null;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private e applicationInfo_;
    private int bitField0_;
    private m gaugeMetric_;
    private q networkRequestMetric_;
    private x traceMetric_;
    private z transportInfo_;

    static {
        s s0 = new s();
        s.DEFAULT_INSTANCE = s0;
        GeneratedMessageLite.registerDefaultInstance(s.class, s0);
    }

    private void Ab(x x0) {
        x0.getClass();
        this.traceMetric_ = this.traceMetric_ == null || this.traceMetric_ == x.Mb() ? x0 : ((x)((com.google.firebase.perf.v1.x.b)x.Yb(this.traceMetric_).mergeFrom(x0)).buildPartial());
        this.bitField0_ |= 2;
    }

    private void Bb(z z0) {
        z0.getClass();
        this.transportInfo_ = this.transportInfo_ == null || this.transportInfo_ == z.F3() ? z0 : ((z)((com.google.firebase.perf.v1.z.b)z.P4(this.transportInfo_).mergeFrom(z0)).buildPartial());
        this.bitField0_ |= 16;
    }

    public static b Cb() {
        return (b)s.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Db(s s0) {
        return (b)s.DEFAULT_INSTANCE.createBuilder(s0);
    }

    public static s Eb(InputStream inputStream0) throws IOException {
        return (s)GeneratedMessageLite.parseDelimitedFrom(s.DEFAULT_INSTANCE, inputStream0);
    }

    public static s Fb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (s)GeneratedMessageLite.parseDelimitedFrom(s.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static s Gb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (s)GeneratedMessageLite.parseFrom(s.DEFAULT_INSTANCE, byteString0);
    }

    public static s Hb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (s)GeneratedMessageLite.parseFrom(s.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static s Ib(CodedInputStream codedInputStream0) throws IOException {
        return (s)GeneratedMessageLite.parseFrom(s.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void Ja() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    public static s Jb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (s)GeneratedMessageLite.parseFrom(s.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static s Kb(InputStream inputStream0) throws IOException {
        return (s)GeneratedMessageLite.parseFrom(s.DEFAULT_INSTANCE, inputStream0);
    }

    private void La() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    public static s Lb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (s)GeneratedMessageLite.parseFrom(s.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static s Mb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (s)GeneratedMessageLite.parseFrom(s.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static s Nb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (s)GeneratedMessageLite.parseFrom(s.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static s Ob(byte[] arr_b) throws InvalidProtocolBufferException {
        return (s)GeneratedMessageLite.parseFrom(s.DEFAULT_INSTANCE, arr_b);
    }

    public static s Pb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (s)GeneratedMessageLite.parseFrom(s.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Qb(e e0) {
        e0.getClass();
        this.applicationInfo_ = e0;
        this.bitField0_ |= 1;
    }

    private void Rb(m m0) {
        m0.getClass();
        this.gaugeMetric_ = m0;
        this.bitField0_ |= 8;
    }

    private void Sb(q q0) {
        q0.getClass();
        this.networkRequestMetric_ = q0;
        this.bitField0_ |= 4;
    }

    private void Tb(x x0) {
        x0.getClass();
        this.traceMetric_ = x0;
        this.bitField0_ |= 2;
    }

    private void Ub(z z0) {
        z0.getClass();
        this.transportInfo_ = z0;
        this.bitField0_ |= 16;
    }

    @Override  // com.google.firebase.perf.v1.t
    public e W1() {
        return this.applicationInfo_ == null ? e.Ja() : this.applicationInfo_;
    }

    @Override  // com.google.firebase.perf.v1.t
    public boolean Z6() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override  // com.google.firebase.perf.v1.t
    public z b4() {
        return this.transportInfo_ == null ? z.F3() : this.transportInfo_;
    }

    private void ca() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new s();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(s.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            }
            case 4: {
                return s.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = s.PARSER;
                if(parser0 == null) {
                    Class class0 = s.class;
                    synchronized(class0) {
                        parser0 = s.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(s.DEFAULT_INSTANCE);
                            s.PARSER = parser0;
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

    @Override  // com.google.firebase.perf.v1.t
    public m e5() {
        return this.gaugeMetric_ == null ? m.Jb() : this.gaugeMetric_;
    }

    @Override  // com.google.firebase.perf.v1.t
    public boolean e6() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override  // com.google.firebase.perf.v1.t
    public boolean n5() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Parser parser() {
        return s.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.firebase.perf.v1.t
    public q s2() {
        return this.networkRequestMetric_ == null ? q.Xb() : this.networkRequestMetric_;
    }

    @Override  // com.google.firebase.perf.v1.t
    public boolean s7() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override  // com.google.firebase.perf.v1.t
    public boolean t9() {
        return (this.bitField0_ & 2) != 0;
    }

    private void ub() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    private void vb() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static s wb() {
        return s.DEFAULT_INSTANCE;
    }

    private void xb(e e0) {
        e0.getClass();
        this.applicationInfo_ = this.applicationInfo_ == null || this.applicationInfo_ == e.Ja() ? e0 : ((e)((com.google.firebase.perf.v1.e.b)e.yb(this.applicationInfo_).mergeFrom(e0)).buildPartial());
        this.bitField0_ |= 1;
    }

    @Override  // com.google.firebase.perf.v1.t
    public x y9() {
        return this.traceMetric_ == null ? x.Mb() : this.traceMetric_;
    }

    private void yb(m m0) {
        m0.getClass();
        this.gaugeMetric_ = this.gaugeMetric_ == null || this.gaugeMetric_ == m.Jb() ? m0 : ((m)((com.google.firebase.perf.v1.m.b)m.Mb(this.gaugeMetric_).mergeFrom(m0)).buildPartial());
        this.bitField0_ |= 8;
    }

    private void zb(q q0) {
        q0.getClass();
        this.networkRequestMetric_ = this.networkRequestMetric_ == null || this.networkRequestMetric_ == q.Xb() ? q0 : ((q)((com.google.firebase.perf.v1.q.b)q.ec(this.networkRequestMetric_).mergeFrom(q0)).buildPartial());
        this.bitField0_ |= 4;
    }
}

