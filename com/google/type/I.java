package com.google.type;

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
            ((i)this.instance).Bb();
            return this;
        }

        public b Bb() {
            this.copyOnWrite();
            ((i)this.instance).clearTimeZone();
            return this;
        }

        public b Cb() {
            this.copyOnWrite();
            ((i)this.instance).Cb();
            return this;
        }

        public b Db() {
            this.copyOnWrite();
            ((i)this.instance).Db();
            return this;
        }

        public b Eb(I i0) {
            this.copyOnWrite();
            ((i)this.instance).Fb(i0);
            return this;
        }

        public b Fb(Duration duration0) {
            this.copyOnWrite();
            ((i)this.instance).Gb(duration0);
            return this;
        }

        public b Gb(int v) {
            this.copyOnWrite();
            ((i)this.instance).Vb(v);
            return this;
        }

        public b Hb(int v) {
            this.copyOnWrite();
            ((i)this.instance).Wb(v);
            return this;
        }

        public b Ib(int v) {
            this.copyOnWrite();
            ((i)this.instance).Xb(v);
            return this;
        }

        public b Jb(int v) {
            this.copyOnWrite();
            ((i)this.instance).Yb(v);
            return this;
        }

        @Override  // com.google.type.j
        public int K0() {
            return ((i)this.instance).K0();
        }

        public b Kb(int v) {
            this.copyOnWrite();
            ((i)this.instance).setNanos(v);
            return this;
        }

        public b Lb(int v) {
            this.copyOnWrite();
            ((i)this.instance).Zb(v);
            return this;
        }

        @Override  // com.google.type.j
        public Duration M2() {
            return ((i)this.instance).M2();
        }

        public b Mb(com.google.type.I.b i$b0) {
            this.copyOnWrite();
            ((i)this.instance).ac(((I)i$b0.build()));
            return this;
        }

        public b Nb(I i0) {
            this.copyOnWrite();
            ((i)this.instance).ac(i0);
            return this;
        }

        public b Ob(com.google.protobuf.Duration.Builder duration$Builder0) {
            this.copyOnWrite();
            ((i)this.instance).bc(((Duration)duration$Builder0.build()));
            return this;
        }

        @Override  // com.google.type.j
        public int P0() {
            return ((i)this.instance).P0();
        }

        public b Pb(Duration duration0) {
            this.copyOnWrite();
            ((i)this.instance).bc(duration0);
            return this;
        }

        public b Qb(int v) {
            this.copyOnWrite();
            ((i)this.instance).cc(v);
            return this;
        }

        @Override  // com.google.type.j
        public int getNanos() {
            return ((i)this.instance).getNanos();
        }

        @Override  // com.google.type.j
        public int getSeconds() {
            return ((i)this.instance).getSeconds();
        }

        @Override  // com.google.type.j
        public I getTimeZone() {
            return ((i)this.instance).getTimeZone();
        }

        @Override  // com.google.type.j
        public boolean hasTimeZone() {
            return ((i)this.instance).hasTimeZone();
        }

        @Override  // com.google.type.j
        public int l0() {
            return ((i)this.instance).l0();
        }

        @Override  // com.google.type.j
        public int q0() {
            return ((i)this.instance).q0();
        }

        @Override  // com.google.type.j
        public boolean r4() {
            return ((i)this.instance).r4();
        }

        @Override  // com.google.type.j
        public int t0() {
            return ((i)this.instance).t0();
        }

        @Override  // com.google.type.j
        public c t3() {
            return ((i)this.instance).t3();
        }

        public b ub() {
            this.copyOnWrite();
            ((i)this.instance).xb();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((i)this.instance).yb();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((i)this.instance).zb();
            return this;
        }

        public b xb() {
            this.copyOnWrite();
            ((i)this.instance).Ab();
            return this;
        }

        public b yb() {
            this.copyOnWrite();
            ((i)this.instance).clearNanos();
            return this;
        }

        public b zb() {
            this.copyOnWrite();
            ((i)this.instance).clearSeconds();
            return this;
        }
    }

    public static enum c {
        UTC_OFFSET(8),
        TIME_ZONE(9),
        TIMEOFFSET_NOT_SET(0);

        private final int a;

        private c(int v1) {
            this.a = v1;
        }

        public static c a(int v) {
            switch(v) {
                case 0: {
                    return c.d;
                }
                case 8: {
                    return c.b;
                }
                case 9: {
                    return c.c;
                }
                default: {
                    return null;
                }
            }
        }

        @Deprecated
        public static c b(int v) {
            return c.a(v);
        }

        public int getNumber() {
            return this.a;
        }
    }

    public static final int DAY_FIELD_NUMBER = 3;
    private static final i DEFAULT_INSTANCE = null;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile Parser PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_;
    private Object timeOffset_;
    private int year_;

    static {
        i i0 = new i();
        i.DEFAULT_INSTANCE = i0;
        GeneratedMessageLite.registerDefaultInstance(i.class, i0);
    }

    private i() {
        this.timeOffsetCase_ = 0;
    }

    private void Ab() {
        this.month_ = 0;
    }

    private void Bb() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    private void Cb() {
        if(this.timeOffsetCase_ == 8) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    private void Db() {
        this.year_ = 0;
    }

    public static i Eb() {
        return i.DEFAULT_INSTANCE;
    }

    private void Fb(I i0) {
        i0.getClass();
        this.timeOffset_ = this.timeOffsetCase_ != 9 || this.timeOffset_ == I.z6() ? i0 : ((com.google.type.I.b)I.B6(((I)this.timeOffset_)).mergeFrom(i0)).buildPartial();
        this.timeOffsetCase_ = 9;
    }

    private void Gb(Duration duration0) {
        duration0.getClass();
        this.timeOffset_ = this.timeOffsetCase_ != 8 || this.timeOffset_ == Duration.getDefaultInstance() ? duration0 : ((com.google.protobuf.Duration.Builder)Duration.newBuilder(((Duration)this.timeOffset_)).mergeFrom(duration0)).buildPartial();
        this.timeOffsetCase_ = 8;
    }

    public static b Hb() {
        return (b)i.DEFAULT_INSTANCE.createBuilder();
    }

    public static b Ib(i i0) {
        return (b)i.DEFAULT_INSTANCE.createBuilder(i0);
    }

    public static i Jb(InputStream inputStream0) throws IOException {
        return (i)GeneratedMessageLite.parseDelimitedFrom(i.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.type.j
    public int K0() {
        return this.minutes_;
    }

    public static i Kb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i)GeneratedMessageLite.parseDelimitedFrom(i.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static i Lb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.type.j
    public Duration M2() {
        return this.timeOffsetCase_ == 8 ? ((Duration)this.timeOffset_) : Duration.getDefaultInstance();
    }

    public static i Mb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static i Nb(CodedInputStream codedInputStream0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static i Ob(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.type.j
    public int P0() {
        return this.month_;
    }

    public static i Pb(InputStream inputStream0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, inputStream0);
    }

    public static i Qb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static i Rb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static i Sb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static i Tb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, arr_b);
    }

    public static i Ub(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i)GeneratedMessageLite.parseFrom(i.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Vb(int v) {
        this.day_ = v;
    }

    private void Wb(int v) {
        this.hours_ = v;
    }

    private void Xb(int v) {
        this.minutes_ = v;
    }

    private void Yb(int v) {
        this.month_ = v;
    }

    private void Zb(int v) {
        this.seconds_ = v;
    }

    private void ac(I i0) {
        i0.getClass();
        this.timeOffset_ = i0;
        this.timeOffsetCase_ = 9;
    }

    private void bc(Duration duration0) {
        duration0.getClass();
        this.timeOffset_ = duration0;
        this.timeOffsetCase_ = 8;
    }

    private void cc(int v) {
        this.year_ = v;
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    private void clearSeconds() {
        this.seconds_ = 0;
    }

    private void clearTimeZone() {
        if(this.timeOffsetCase_ == 9) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
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
                return GeneratedMessageLite.newMessageInfo(i.DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", Duration.class, I.class});
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

    @Override  // com.google.type.j
    public int getNanos() {
        return this.nanos_;
    }

    @Override  // com.google.type.j
    public int getSeconds() {
        return this.seconds_;
    }

    @Override  // com.google.type.j
    public I getTimeZone() {
        return this.timeOffsetCase_ == 9 ? ((I)this.timeOffset_) : I.z6();
    }

    @Override  // com.google.type.j
    public boolean hasTimeZone() {
        return this.timeOffsetCase_ == 9;
    }

    @Override  // com.google.type.j
    public int l0() {
        return this.hours_;
    }

    public static Parser parser() {
        return i.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.type.j
    public int q0() {
        return this.year_;
    }

    @Override  // com.google.type.j
    public boolean r4() {
        return this.timeOffsetCase_ == 8;
    }

    private void setNanos(int v) {
        this.nanos_ = v;
    }

    @Override  // com.google.type.j
    public int t0() {
        return this.day_;
    }

    @Override  // com.google.type.j
    public c t3() {
        return c.a(this.timeOffsetCase_);
    }

    private void xb() {
        this.day_ = 0;
    }

    private void yb() {
        this.hours_ = 0;
    }

    private void zb() {
        this.minutes_ = 0;
    }
}

