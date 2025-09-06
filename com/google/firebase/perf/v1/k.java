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

public final class k extends GeneratedMessageLite implements l {
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

    public static final class b extends Builder implements l {
        private b() {
            super(k.DEFAULT_INSTANCE);
        }

        b(a k$a0) {
        }

        @Override  // com.google.firebase.perf.v1.l
        @Deprecated
        public boolean A5() {
            return ((k)this.instance).A5();
        }

        public b Ab(int v) {
            this.copyOnWrite();
            ((k)this.instance).Kb(v);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.l
        public int B7() {
            return ((k)this.instance).B7();
        }

        public b Bb(int v) {
            this.copyOnWrite();
            ((k)this.instance).Lb(v);
            return this;
        }

        public b Cb(int v) {
            this.copyOnWrite();
            ((k)this.instance).Mb(v);
            return this;
        }

        public b Db(int v) {
            this.copyOnWrite();
            ((k)this.instance).Nb(v);
            return this;
        }

        public b Eb(int v) {
            this.copyOnWrite();
            ((k)this.instance).Ob(v);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.l
        public boolean F1() {
            return ((k)this.instance).F1();
        }

        @Deprecated
        public b Fb(String s) {
            this.copyOnWrite();
            ((k)this.instance).Pb(s);
            return this;
        }

        @Deprecated
        public b Gb(ByteString byteString0) {
            this.copyOnWrite();
            ((k)this.instance).Qb(byteString0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.l
        public int J4() {
            return ((k)this.instance).J4();
        }

        @Override  // com.google.firebase.perf.v1.l
        public boolean R7() {
            return ((k)this.instance).R7();
        }

        @Override  // com.google.firebase.perf.v1.l
        public int T1() {
            return ((k)this.instance).T1();
        }

        @Override  // com.google.firebase.perf.v1.l
        public int T9() {
            return ((k)this.instance).T9();
        }

        @Override  // com.google.firebase.perf.v1.l
        public boolean V3() {
            return ((k)this.instance).V3();
        }

        @Override  // com.google.firebase.perf.v1.l
        public boolean Z8() {
            return ((k)this.instance).Z8();
        }

        @Override  // com.google.firebase.perf.v1.l
        @Deprecated
        public ByteString bb() {
            return ((k)this.instance).bb();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.firebase.perf.v1.l
        @Deprecated
        public String g5() {
            return "";
        }

        @Override  // com.google.firebase.perf.v1.l
        public int ha() {
            return ((k)this.instance).ha();
        }

        public b ub() {
            this.copyOnWrite();
            ((k)this.instance).A8();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((k)this.instance).j9();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((k)this.instance).ca();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.l
        public boolean x6() {
            return ((k)this.instance).x6();
        }

        public b xb() {
            this.copyOnWrite();
            ((k)this.instance).Ja();
            return this;
        }

        public b yb() {
            this.copyOnWrite();
            ((k)this.instance).La();
            return this;
        }

        @Deprecated
        public b zb() {
            this.copyOnWrite();
            ((k)this.instance).ub();
            return this;
        }
    }

    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final k DEFAULT_INSTANCE = null;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile Parser PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_;

    static {
        k k0 = new k();
        k.DEFAULT_INSTANCE = k0;
        GeneratedMessageLite.registerDefaultInstance(k.class, k0);
    }

    private k() {
        this.processName_ = "";
    }

    @Override  // com.google.firebase.perf.v1.l
    @Deprecated
    public boolean A5() {
        return (this.bitField0_ & 1) != 0;
    }

    private void A8() {
        this.bitField0_ &= -3;
        this.cpuClockRateKhz_ = 0;
    }

    public static k Ab(ByteString byteString0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.firebase.perf.v1.l
    public int B7() {
        return this.deviceRamSizeKb_;
    }

    public static k Bb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static k Cb(CodedInputStream codedInputStream0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static k Db(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static k Eb(InputStream inputStream0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.firebase.perf.v1.l
    public boolean F1() {
        return (this.bitField0_ & 16) != 0;
    }

    public static k Fb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static k Gb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static k Hb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static k Ib(byte[] arr_b) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.firebase.perf.v1.l
    public int J4() {
        return this.cpuProcessorCount_;
    }

    private void Ja() {
        this.bitField0_ &= -17;
        this.maxAppJavaHeapMemoryKb_ = 0;
    }

    public static k Jb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (k)GeneratedMessageLite.parseFrom(k.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Kb(int v) {
        this.bitField0_ |= 2;
        this.cpuClockRateKhz_ = v;
    }

    private void La() {
        this.bitField0_ &= -33;
        this.maxEncouragedAppJavaHeapMemoryKb_ = 0;
    }

    private void Lb(int v) {
        this.bitField0_ |= 4;
        this.cpuProcessorCount_ = v;
    }

    private void Mb(int v) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = v;
    }

    private void Nb(int v) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = v;
    }

    private void Ob(int v) {
        this.bitField0_ |= 0x20;
        this.maxEncouragedAppJavaHeapMemoryKb_ = v;
    }

    private void Pb(String s) {
        s.getClass();
        this.bitField0_ |= 1;
        this.processName_ = s;
    }

    private void Qb(ByteString byteString0) {
        this.processName_ = byteString0.toStringUtf8();
        this.bitField0_ |= 1;
    }

    @Override  // com.google.firebase.perf.v1.l
    public boolean R7() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override  // com.google.firebase.perf.v1.l
    public int T1() {
        return this.maxEncouragedAppJavaHeapMemoryKb_;
    }

    @Override  // com.google.firebase.perf.v1.l
    public int T9() {
        return this.cpuClockRateKhz_;
    }

    @Override  // com.google.firebase.perf.v1.l
    public boolean V3() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override  // com.google.firebase.perf.v1.l
    public boolean Z8() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override  // com.google.firebase.perf.v1.l
    @Deprecated
    public ByteString bb() {
        return ByteString.copyFromUtf8(this.processName_);
    }

    private void ca() {
        this.bitField0_ &= -9;
        this.deviceRamSizeKb_ = 0;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new k();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(k.DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
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

    @Override  // com.google.firebase.perf.v1.l
    @Deprecated
    public String g5() [...] // 潜在的解密器

    @Override  // com.google.firebase.perf.v1.l
    public int ha() {
        return this.maxAppJavaHeapMemoryKb_;
    }

    private void j9() {
        this.bitField0_ &= -5;
        this.cpuProcessorCount_ = 0;
    }

    public static Parser parser() {
        return k.DEFAULT_INSTANCE.getParserForType();
    }

    private void ub() {
        this.bitField0_ &= -2;
        this.processName_ = "";
    }

    public static k vb() {
        return k.DEFAULT_INSTANCE;
    }

    public static b wb() {
        return (b)k.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.firebase.perf.v1.l
    public boolean x6() {
        return (this.bitField0_ & 4) != 0;
    }

    public static b xb(k k0) {
        return (b)k.DEFAULT_INSTANCE.createBuilder(k0);
    }

    public static k yb(InputStream inputStream0) throws IOException {
        return (k)GeneratedMessageLite.parseDelimitedFrom(k.DEFAULT_INSTANCE, inputStream0);
    }

    public static k zb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (k)GeneratedMessageLite.parseDelimitedFrom(k.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

