package com.google.firebase.perf.v1;

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

public final class m extends GeneratedMessageLite implements n {
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

    public static final class b extends Builder implements n {
        private b() {
            super(m.DEFAULT_INSTANCE);
        }

        b(a m$a0) {
        }

        public b Ab(int v, com.google.firebase.perf.v1.h.b h$b0) {
            this.copyOnWrite();
            ((m)this.instance).yb(v, ((h)h$b0.build()));
            return this;
        }

        public b Bb(int v, h h0) {
            this.copyOnWrite();
            ((m)this.instance).yb(v, h0);
            return this;
        }

        public b Cb(com.google.firebase.perf.v1.h.b h$b0) {
            this.copyOnWrite();
            ((m)this.instance).zb(((h)h$b0.build()));
            return this;
        }

        public b Db(h h0) {
            this.copyOnWrite();
            ((m)this.instance).zb(h0);
            return this;
        }

        public b Eb() {
            this.copyOnWrite();
            ((m)this.instance).Ab();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.n
        public k F5() {
            return ((m)this.instance).F5();
        }

        public b Fb() {
            this.copyOnWrite();
            ((m)this.instance).Bb();
            return this;
        }

        public b Gb() {
            this.copyOnWrite();
            ((m)this.instance).Cb();
            return this;
        }

        public b Hb() {
            this.copyOnWrite();
            ((m)this.instance).clearSessionId();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.n
        public List I3() {
            return DesugarCollections.unmodifiableList(((m)this.instance).I3());
        }

        public b Ib(k k0) {
            this.copyOnWrite();
            ((m)this.instance).Kb(k0);
            return this;
        }

        public b Jb(int v) {
            this.copyOnWrite();
            ((m)this.instance).Zb(v);
            return this;
        }

        public b Kb(int v) {
            this.copyOnWrite();
            ((m)this.instance).ac(v);
            return this;
        }

        public b Lb(int v, com.google.firebase.perf.v1.c.b c$b0) {
            this.copyOnWrite();
            ((m)this.instance).bc(v, ((c)c$b0.build()));
            return this;
        }

        public b Mb(int v, c c0) {
            this.copyOnWrite();
            ((m)this.instance).bc(v, c0);
            return this;
        }

        public b Nb(int v, com.google.firebase.perf.v1.h.b h$b0) {
            this.copyOnWrite();
            ((m)this.instance).cc(v, ((h)h$b0.build()));
            return this;
        }

        public b Ob(int v, h h0) {
            this.copyOnWrite();
            ((m)this.instance).cc(v, h0);
            return this;
        }

        public b Pb(com.google.firebase.perf.v1.k.b k$b0) {
            this.copyOnWrite();
            ((m)this.instance).dc(((k)k$b0.build()));
            return this;
        }

        public b Qb(k k0) {
            this.copyOnWrite();
            ((m)this.instance).dc(k0);
            return this;
        }

        public b Rb(String s) {
            this.copyOnWrite();
            ((m)this.instance).setSessionId(s);
            return this;
        }

        public b Sb(ByteString byteString0) {
            this.copyOnWrite();
            ((m)this.instance).setSessionIdBytes(byteString0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.n
        public List X5() {
            return DesugarCollections.unmodifiableList(((m)this.instance).X5());
        }

        @Override  // com.google.firebase.perf.v1.n
        public boolean Y9() {
            return ((m)this.instance).Y9();
        }

        @Override  // com.google.firebase.perf.v1.n
        public c d4(int v) {
            return ((m)this.instance).d4(v);
        }

        @Override  // com.google.firebase.perf.v1.n
        public String getSessionId() {
            return ((m)this.instance).getSessionId();
        }

        @Override  // com.google.firebase.perf.v1.n
        public ByteString getSessionIdBytes() {
            return ((m)this.instance).getSessionIdBytes();
        }

        @Override  // com.google.firebase.perf.v1.n
        public boolean hasSessionId() {
            return ((m)this.instance).hasSessionId();
        }

        @Override  // com.google.firebase.perf.v1.n
        public int j1() {
            return ((m)this.instance).j1();
        }

        @Override  // com.google.firebase.perf.v1.n
        public int j5() {
            return ((m)this.instance).j5();
        }

        @Override  // com.google.firebase.perf.v1.n
        public h n8(int v) {
            return ((m)this.instance).n8(v);
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((m)this.instance).ub(iterable0);
            return this;
        }

        public b vb(Iterable iterable0) {
            this.copyOnWrite();
            ((m)this.instance).vb(iterable0);
            return this;
        }

        public b wb(int v, com.google.firebase.perf.v1.c.b c$b0) {
            this.copyOnWrite();
            ((m)this.instance).wb(v, ((c)c$b0.build()));
            return this;
        }

        public b xb(int v, c c0) {
            this.copyOnWrite();
            ((m)this.instance).wb(v, c0);
            return this;
        }

        public b yb(com.google.firebase.perf.v1.c.b c$b0) {
            this.copyOnWrite();
            ((m)this.instance).xb(((c)c$b0.build()));
            return this;
        }

        public b zb(c c0) {
            this.copyOnWrite();
            ((m)this.instance).xb(c0);
            return this;
        }
    }

    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final m DEFAULT_INSTANCE = null;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private ProtobufList androidMemoryReadings_;
    private int bitField0_;
    private ProtobufList cpuMetricReadings_;
    private k gaugeMetadata_;
    private String sessionId_;

    static {
        m m0 = new m();
        m.DEFAULT_INSTANCE = m0;
        GeneratedMessageLite.registerDefaultInstance(m.class, m0);
    }

    private m() {
        this.sessionId_ = "";
        this.cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
        this.androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Ab() {
        this.androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Bb() {
        this.cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Cb() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    private void Db() {
        ProtobufList internal$ProtobufList0 = this.androidMemoryReadings_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.androidMemoryReadings_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    private void Eb() {
        ProtobufList internal$ProtobufList0 = this.cpuMetricReadings_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.cpuMetricReadings_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.firebase.perf.v1.n
    public k F5() {
        return this.gaugeMetadata_ == null ? k.vb() : this.gaugeMetadata_;
    }

    public d Fb(int v) {
        return (d)this.androidMemoryReadings_.get(v);
    }

    public List Gb() {
        return this.androidMemoryReadings_;
    }

    public i Hb(int v) {
        return (i)this.cpuMetricReadings_.get(v);
    }

    @Override  // com.google.firebase.perf.v1.n
    public List I3() {
        return this.cpuMetricReadings_;
    }

    public List Ib() {
        return this.cpuMetricReadings_;
    }

    public static m Jb() {
        return m.DEFAULT_INSTANCE;
    }

    private void Kb(k k0) {
        k0.getClass();
        this.gaugeMetadata_ = this.gaugeMetadata_ == null || this.gaugeMetadata_ == k.vb() ? k0 : ((k)((com.google.firebase.perf.v1.k.b)k.xb(this.gaugeMetadata_).mergeFrom(k0)).buildPartial());
        this.bitField0_ |= 2;
    }

    public static b Lb() {
        return (b)m.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Mb(m m0) {
        return (b)m.DEFAULT_INSTANCE.createBuilder(m0);
    }

    public static m Nb(InputStream inputStream0) throws IOException {
        return (m)GeneratedMessageLite.parseDelimitedFrom(m.DEFAULT_INSTANCE, inputStream0);
    }

    public static m Ob(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (m)GeneratedMessageLite.parseDelimitedFrom(m.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static m Pb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteString0);
    }

    public static m Qb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static m Rb(CodedInputStream codedInputStream0) throws IOException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static m Sb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static m Tb(InputStream inputStream0) throws IOException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, inputStream0);
    }

    public static m Ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static m Vb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static m Wb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    @Override  // com.google.firebase.perf.v1.n
    public List X5() {
        return this.androidMemoryReadings_;
    }

    public static m Xb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.firebase.perf.v1.n
    public boolean Y9() {
        return (this.bitField0_ & 2) != 0;
    }

    public static m Yb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (m)GeneratedMessageLite.parseFrom(m.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Zb(int v) {
        this.Db();
        this.androidMemoryReadings_.remove(v);
    }

    private void ac(int v) {
        this.Eb();
        this.cpuMetricReadings_.remove(v);
    }

    private void bc(int v, c c0) {
        c0.getClass();
        this.Db();
        this.androidMemoryReadings_.set(v, c0);
    }

    private void cc(int v, h h0) {
        h0.getClass();
        this.Eb();
        this.cpuMetricReadings_.set(v, h0);
    }

    private void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = m.Jb().getSessionId();
    }

    @Override  // com.google.firebase.perf.v1.n
    public c d4(int v) {
        return (c)this.androidMemoryReadings_.get(v);
    }

    private void dc(k k0) {
        k0.getClass();
        this.gaugeMetadata_ = k0;
        this.bitField0_ |= 2;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new m();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(m.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001B\u0003ဉ\u0001\u0004\u001B", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", h.class, "gaugeMetadata_", "androidMemoryReadings_", c.class});
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

    @Override  // com.google.firebase.perf.v1.n
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override  // com.google.firebase.perf.v1.n
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override  // com.google.firebase.perf.v1.n
    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override  // com.google.firebase.perf.v1.n
    public int j1() {
        return this.androidMemoryReadings_.size();
    }

    @Override  // com.google.firebase.perf.v1.n
    public int j5() {
        return this.cpuMetricReadings_.size();
    }

    @Override  // com.google.firebase.perf.v1.n
    public h n8(int v) {
        return (h)this.cpuMetricReadings_.get(v);
    }

    public static Parser parser() {
        return m.DEFAULT_INSTANCE.getParserForType();
    }

    private void setSessionId(String s) {
        s.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = s;
    }

    private void setSessionIdBytes(ByteString byteString0) {
        this.sessionId_ = byteString0.toStringUtf8();
        this.bitField0_ |= 1;
    }

    private void ub(Iterable iterable0) {
        this.Db();
        AbstractMessageLite.addAll(iterable0, this.androidMemoryReadings_);
    }

    private void vb(Iterable iterable0) {
        this.Eb();
        AbstractMessageLite.addAll(iterable0, this.cpuMetricReadings_);
    }

    private void wb(int v, c c0) {
        c0.getClass();
        this.Db();
        this.androidMemoryReadings_.add(v, c0);
    }

    private void xb(c c0) {
        c0.getClass();
        this.Db();
        this.androidMemoryReadings_.add(c0);
    }

    private void yb(int v, h h0) {
        h0.getClass();
        this.Eb();
        this.cpuMetricReadings_.add(v, h0);
    }

    private void zb(h h0) {
        h0.getClass();
        this.Eb();
        this.cpuMetricReadings_.add(h0);
    }
}

