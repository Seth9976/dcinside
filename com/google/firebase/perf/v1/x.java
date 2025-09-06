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

public final class x extends GeneratedMessageLite implements y {
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

    public static final class b extends Builder implements y {
        private b() {
            super(x.DEFAULT_INSTANCE);
        }

        b(a x$a0) {
        }

        @Override  // com.google.firebase.perf.v1.y
        public long A4(String s, long v) {
            s.getClass();
            Map map0 = ((x)this.instance).X1();
            return map0.containsKey(s) ? ((long)(((Long)map0.get(s)))) : v;
        }

        public b Ab(int v, b x$b0) {
            this.copyOnWrite();
            ((x)this.instance).Db(v, ((x)x$b0.build()));
            return this;
        }

        public b Bb(int v, x x0) {
            this.copyOnWrite();
            ((x)this.instance).Db(v, x0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public boolean C8() {
            return ((x)this.instance).C8();
        }

        public b Cb(b x$b0) {
            this.copyOnWrite();
            ((x)this.instance).Eb(((x)x$b0.build()));
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public int D() {
            return ((x)this.instance).L().size();
        }

        public b Db(x x0) {
            this.copyOnWrite();
            ((x)this.instance).Eb(x0);
            return this;
        }

        public b Eb() {
            this.copyOnWrite();
            ((x)this.instance).Fb();
            return this;
        }

        public b Fb() {
            this.copyOnWrite();
            ((x)this.instance).Nb().clear();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public String G(String s, String s1) {
            s.getClass();
            Map map0 = ((x)this.instance).L();
            return map0.containsKey(s) ? ((String)map0.get(s)) : s1;
        }

        public b Gb() {
            this.copyOnWrite();
            ((x)this.instance).Ob().clear();
            return this;
        }

        public b Hb() {
            this.copyOnWrite();
            ((x)this.instance).Gb();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        @Deprecated
        public Map I() {
            return this.L();
        }

        public b Ib() {
            this.copyOnWrite();
            ((x)this.instance).Hb();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public u J0(int v) {
            return ((x)this.instance).J0(v);
        }

        public b Jb() {
            this.copyOnWrite();
            ((x)this.instance).clearName();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public boolean K(String s) {
            s.getClass();
            return ((x)this.instance).L().containsKey(s);
        }

        public b Kb() {
            this.copyOnWrite();
            ((x)this.instance).Ib();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public Map L() {
            return DesugarCollections.unmodifiableMap(((x)this.instance).L());
        }

        @Override  // com.google.firebase.perf.v1.y
        public int L0() {
            return ((x)this.instance).L0();
        }

        public b Lb() {
            this.copyOnWrite();
            ((x)this.instance).Jb();
            return this;
        }

        public b Mb(Map map0) {
            this.copyOnWrite();
            ((x)this.instance).Nb().putAll(map0);
            return this;
        }

        public b Nb(Map map0) {
            this.copyOnWrite();
            ((x)this.instance).Ob().putAll(map0);
            return this;
        }

        public b Ob(String s, long v) {
            s.getClass();
            this.copyOnWrite();
            ((x)this.instance).Nb().put(s, v);
            return this;
        }

        public b Pb(String s, String s1) {
            s.getClass();
            s1.getClass();
            this.copyOnWrite();
            ((x)this.instance).Ob().put(s, s1);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public List Q5() {
            return DesugarCollections.unmodifiableList(((x)this.instance).Q5());
        }

        public b Qb(String s) {
            s.getClass();
            this.copyOnWrite();
            ((x)this.instance).Nb().remove(s);
            return this;
        }

        public b Rb(String s) {
            s.getClass();
            this.copyOnWrite();
            ((x)this.instance).Ob().remove(s);
            return this;
        }

        public b Sb(int v) {
            this.copyOnWrite();
            ((x)this.instance).lc(v);
            return this;
        }

        public b Tb(int v) {
            this.copyOnWrite();
            ((x)this.instance).mc(v);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public int U4() {
            return ((x)this.instance).X1().size();
        }

        public b Ub(long v) {
            this.copyOnWrite();
            ((x)this.instance).nc(v);
            return this;
        }

        public b Vb(long v) {
            this.copyOnWrite();
            ((x)this.instance).oc(v);
            return this;
        }

        public b Wb(boolean z) {
            this.copyOnWrite();
            ((x)this.instance).pc(z);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public Map X1() {
            return DesugarCollections.unmodifiableMap(((x)this.instance).X1());
        }

        public b Xb(String s) {
            this.copyOnWrite();
            ((x)this.instance).setName(s);
            return this;
        }

        public b Yb(ByteString byteString0) {
            this.copyOnWrite();
            ((x)this.instance).setNameBytes(byteString0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public List Z0() {
            return DesugarCollections.unmodifiableList(((x)this.instance).Z0());
        }

        public b Zb(int v, c u$c0) {
            this.copyOnWrite();
            ((x)this.instance).qc(v, ((u)u$c0.build()));
            return this;
        }

        public b ac(int v, u u0) {
            this.copyOnWrite();
            ((x)this.instance).qc(v, u0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public boolean b1() {
            return ((x)this.instance).b1();
        }

        public b bc(int v, b x$b0) {
            this.copyOnWrite();
            ((x)this.instance).rc(v, ((x)x$b0.build()));
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public long c1() {
            return ((x)this.instance).c1();
        }

        public b cc(int v, x x0) {
            this.copyOnWrite();
            ((x)this.instance).rc(v, x0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public long d1() {
            return ((x)this.instance).d1();
        }

        @Override  // com.google.firebase.perf.v1.y
        public x d2(int v) {
            return ((x)this.instance).d2(v);
        }

        @Override  // com.google.firebase.perf.v1.y
        public String getName() {
            return ((x)this.instance).getName();
        }

        @Override  // com.google.firebase.perf.v1.y
        public ByteString getNameBytes() {
            return ((x)this.instance).getNameBytes();
        }

        @Override  // com.google.firebase.perf.v1.y
        @Deprecated
        public Map h6() {
            return this.X1();
        }

        @Override  // com.google.firebase.perf.v1.y
        public boolean hasName() {
            return ((x)this.instance).hasName();
        }

        @Override  // com.google.firebase.perf.v1.y
        public long k3(String s) {
            s.getClass();
            Map map0 = ((x)this.instance).X1();
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (long)(((Long)map0.get(s)));
        }

        @Override  // com.google.firebase.perf.v1.y
        public boolean t2() {
            return ((x)this.instance).t2();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((x)this.instance).zb(iterable0);
            return this;
        }

        public b vb(Iterable iterable0) {
            this.copyOnWrite();
            ((x)this.instance).Ab(iterable0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public String w(String s) {
            s.getClass();
            Map map0 = ((x)this.instance).L();
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (String)map0.get(s);
        }

        @Override  // com.google.firebase.perf.v1.y
        public int w2() {
            return ((x)this.instance).w2();
        }

        @Override  // com.google.firebase.perf.v1.y
        public boolean w8(String s) {
            s.getClass();
            return ((x)this.instance).X1().containsKey(s);
        }

        public b wb(int v, c u$c0) {
            this.copyOnWrite();
            ((x)this.instance).Bb(v, ((u)u$c0.build()));
            return this;
        }

        @Override  // com.google.firebase.perf.v1.y
        public boolean x8() {
            return ((x)this.instance).x8();
        }

        public b xb(int v, u u0) {
            this.copyOnWrite();
            ((x)this.instance).Bb(v, u0);
            return this;
        }

        public b yb(c u$c0) {
            this.copyOnWrite();
            ((x)this.instance).Cb(((u)u$c0.build()));
            return this;
        }

        public b zb(u u0) {
            this.copyOnWrite();
            ((x)this.instance).Cb(u0);
            return this;
        }
    }

    static final class com.google.firebase.perf.v1.x.c {
        static final MapEntryLite a;

        static {
            com.google.firebase.perf.v1.x.c.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.INT64, 0L);
        }
    }

    static final class d {
        static final MapEntryLite a;

        static {
            d.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.STRING, "");
        }
    }

    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final x DEFAULT_INSTANCE = null;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite counters_;
    private MapFieldLite customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private ProtobufList perfSessions_;
    private ProtobufList subtraces_;

    static {
        x x0 = new x();
        x.DEFAULT_INSTANCE = x0;
        GeneratedMessageLite.registerDefaultInstance(x.class, x0);
    }

    private x() {
        this.counters_ = MapFieldLite.emptyMapField();
        this.customAttributes_ = MapFieldLite.emptyMapField();
        this.name_ = "";
        this.subtraces_ = GeneratedMessageLite.emptyProtobufList();
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.firebase.perf.v1.y
    public long A4(String s, long v) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.Tb();
        return mapFieldLite0.containsKey(s) ? ((long)(((Long)mapFieldLite0.get(s)))) : v;
    }

    private void Ab(Iterable iterable0) {
        this.Lb();
        AbstractMessageLite.addAll(iterable0, this.subtraces_);
    }

    private void Bb(int v, u u0) {
        u0.getClass();
        this.Kb();
        this.perfSessions_.add(v, u0);
    }

    @Override  // com.google.firebase.perf.v1.y
    public boolean C8() {
        return this.isAuto_;
    }

    private void Cb(u u0) {
        u0.getClass();
        this.Kb();
        this.perfSessions_.add(u0);
    }

    @Override  // com.google.firebase.perf.v1.y
    public int D() {
        return this.Ub().size();
    }

    private void Db(int v, x x0) {
        x0.getClass();
        this.Lb();
        this.subtraces_.add(v, x0);
    }

    private void Eb(x x0) {
        x0.getClass();
        this.Lb();
        this.subtraces_.add(x0);
    }

    private void Fb() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0L;
    }

    @Override  // com.google.firebase.perf.v1.y
    public String G(String s, String s1) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.Ub();
        return mapFieldLite0.containsKey(s) ? ((String)mapFieldLite0.get(s)) : s1;
    }

    private void Gb() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0L;
    }

    private void Hb() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    @Override  // com.google.firebase.perf.v1.y
    @Deprecated
    public Map I() {
        return this.L();
    }

    private void Ib() {
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.firebase.perf.v1.y
    public u J0(int v) {
        return (u)this.perfSessions_.get(v);
    }

    private void Jb() {
        this.subtraces_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.firebase.perf.v1.y
    public boolean K(String s) {
        s.getClass();
        return this.Ub().containsKey(s);
    }

    private void Kb() {
        ProtobufList internal$ProtobufList0 = this.perfSessions_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.firebase.perf.v1.y
    public Map L() {
        return DesugarCollections.unmodifiableMap(this.Ub());
    }

    @Override  // com.google.firebase.perf.v1.y
    public int L0() {
        return this.perfSessions_.size();
    }

    private void Lb() {
        ProtobufList internal$ProtobufList0 = this.subtraces_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.subtraces_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    public static x Mb() {
        return x.DEFAULT_INSTANCE;
    }

    private Map Nb() {
        return this.Vb();
    }

    private Map Ob() {
        return this.Wb();
    }

    public v Pb(int v) {
        return (v)this.perfSessions_.get(v);
    }

    @Override  // com.google.firebase.perf.v1.y
    public List Q5() {
        return this.subtraces_;
    }

    public List Qb() {
        return this.perfSessions_;
    }

    public y Rb(int v) {
        return (y)this.subtraces_.get(v);
    }

    public List Sb() {
        return this.subtraces_;
    }

    private MapFieldLite Tb() {
        return this.counters_;
    }

    @Override  // com.google.firebase.perf.v1.y
    public int U4() {
        return this.Tb().size();
    }

    private MapFieldLite Ub() {
        return this.customAttributes_;
    }

    private MapFieldLite Vb() {
        if(!this.counters_.isMutable()) {
            this.counters_ = this.counters_.mutableCopy();
        }
        return this.counters_;
    }

    private MapFieldLite Wb() {
        if(!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    @Override  // com.google.firebase.perf.v1.y
    public Map X1() {
        return DesugarCollections.unmodifiableMap(this.Tb());
    }

    public static b Xb() {
        return (b)x.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Yb(x x0) {
        return (b)x.DEFAULT_INSTANCE.createBuilder(x0);
    }

    @Override  // com.google.firebase.perf.v1.y
    public List Z0() {
        return this.perfSessions_;
    }

    public static x Zb(InputStream inputStream0) throws IOException {
        return (x)GeneratedMessageLite.parseDelimitedFrom(x.DEFAULT_INSTANCE, inputStream0);
    }

    public static x ac(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (x)GeneratedMessageLite.parseDelimitedFrom(x.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.firebase.perf.v1.y
    public boolean b1() {
        return (this.bitField0_ & 4) != 0;
    }

    public static x bc(ByteString byteString0) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.firebase.perf.v1.y
    public long c1() {
        return this.durationUs_;
    }

    public static x cc(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void clearName() {
        this.bitField0_ &= -2;
        this.name_ = x.Mb().getName();
    }

    @Override  // com.google.firebase.perf.v1.y
    public long d1() {
        return this.clientStartTimeUs_;
    }

    @Override  // com.google.firebase.perf.v1.y
    public x d2(int v) {
        return (x)this.subtraces_.get(v);
    }

    public static x dc(CodedInputStream codedInputStream0) throws IOException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, codedInputStream0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new x();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(x.DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001B\b2\t\u001B", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", com.google.firebase.perf.v1.x.c.a, "subtraces_", x.class, "customAttributes_", d.a, "perfSessions_", u.class});
            }
            case 4: {
                return x.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = x.PARSER;
                if(parser0 == null) {
                    Class class0 = x.class;
                    synchronized(class0) {
                        parser0 = x.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(x.DEFAULT_INSTANCE);
                            x.PARSER = parser0;
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

    public static x ec(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static x fc(InputStream inputStream0) throws IOException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, inputStream0);
    }

    public static x gc(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.firebase.perf.v1.y
    public String getName() [...] // 潜在的解密器

    @Override  // com.google.firebase.perf.v1.y
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // com.google.firebase.perf.v1.y
    @Deprecated
    public Map h6() {
        return this.X1();
    }

    @Override  // com.google.firebase.perf.v1.y
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static x hc(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static x ic(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static x jc(byte[] arr_b) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.firebase.perf.v1.y
    public long k3(String s) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.Tb();
        if(!mapFieldLite0.containsKey(s)) {
            throw new IllegalArgumentException();
        }
        return (long)(((Long)mapFieldLite0.get(s)));
    }

    public static x kc(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (x)GeneratedMessageLite.parseFrom(x.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void lc(int v) {
        this.Kb();
        this.perfSessions_.remove(v);
    }

    private void mc(int v) {
        this.Lb();
        this.subtraces_.remove(v);
    }

    private void nc(long v) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = v;
    }

    private void oc(long v) {
        this.bitField0_ |= 8;
        this.durationUs_ = v;
    }

    public static Parser parser() {
        return x.DEFAULT_INSTANCE.getParserForType();
    }

    private void pc(boolean z) {
        this.bitField0_ |= 2;
        this.isAuto_ = z;
    }

    private void qc(int v, u u0) {
        u0.getClass();
        this.Kb();
        this.perfSessions_.set(v, u0);
    }

    private void rc(int v, x x0) {
        x0.getClass();
        this.Lb();
        this.subtraces_.set(v, x0);
    }

    private void setName(String s) {
        s.getClass();
        this.bitField0_ |= 1;
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        this.name_ = byteString0.toStringUtf8();
        this.bitField0_ |= 1;
    }

    @Override  // com.google.firebase.perf.v1.y
    public boolean t2() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override  // com.google.firebase.perf.v1.y
    public String w(String s) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.Ub();
        if(!mapFieldLite0.containsKey(s)) {
            throw new IllegalArgumentException();
        }
        return (String)mapFieldLite0.get(s);
    }

    @Override  // com.google.firebase.perf.v1.y
    public int w2() {
        return this.subtraces_.size();
    }

    @Override  // com.google.firebase.perf.v1.y
    public boolean w8(String s) {
        s.getClass();
        return this.Tb().containsKey(s);
    }

    @Override  // com.google.firebase.perf.v1.y
    public boolean x8() {
        return (this.bitField0_ & 8) != 0;
    }

    private void zb(Iterable iterable0) {
        this.Kb();
        AbstractMessageLite.addAll(iterable0, this.perfSessions_);
    }
}

