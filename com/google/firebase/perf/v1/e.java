package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat.FieldType;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public final class e extends GeneratedMessageLite implements f {
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

    public static final class b extends Builder implements f {
        private b() {
            super(e.DEFAULT_INSTANCE);
        }

        b(a e$a0) {
        }

        public b Ab(Map map0) {
            this.copyOnWrite();
            ((e)this.instance).La().putAll(map0);
            return this;
        }

        public b Bb(String s, String s1) {
            s.getClass();
            s1.getClass();
            this.copyOnWrite();
            ((e)this.instance).La().put(s, s1);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.f
        public boolean C9() {
            return ((e)this.instance).C9();
        }

        public b Cb(String s) {
            s.getClass();
            this.copyOnWrite();
            ((e)this.instance).La().remove(s);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.f
        public int D() {
            return ((e)this.instance).L().size();
        }

        public b Db(com.google.firebase.perf.v1.a.b a$b0) {
            this.copyOnWrite();
            ((e)this.instance).Lb(((com.google.firebase.perf.v1.a)a$b0.build()));
            return this;
        }

        public b Eb(com.google.firebase.perf.v1.a a0) {
            this.copyOnWrite();
            ((e)this.instance).Lb(a0);
            return this;
        }

        public b Fb(String s) {
            this.copyOnWrite();
            ((e)this.instance).Mb(s);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.f
        public String G(String s, String s1) {
            s.getClass();
            Map map0 = ((e)this.instance).L();
            return map0.containsKey(s) ? ((String)map0.get(s)) : s1;
        }

        @Override  // com.google.firebase.perf.v1.f
        public boolean G5() {
            return ((e)this.instance).G5();
        }

        public b Gb(ByteString byteString0) {
            this.copyOnWrite();
            ((e)this.instance).Nb(byteString0);
            return this;
        }

        public b Hb(g g0) {
            this.copyOnWrite();
            ((e)this.instance).Ob(g0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.f
        @Deprecated
        public Map I() {
            return this.L();
        }

        public b Ib(String s) {
            this.copyOnWrite();
            ((e)this.instance).Pb(s);
            return this;
        }

        public b Jb(ByteString byteString0) {
            this.copyOnWrite();
            ((e)this.instance).Qb(byteString0);
            return this;
        }

        @Override  // com.google.firebase.perf.v1.f
        public boolean K(String s) {
            s.getClass();
            return ((e)this.instance).L().containsKey(s);
        }

        @Override  // com.google.firebase.perf.v1.f
        public ByteString K8() {
            return ((e)this.instance).K8();
        }

        @Override  // com.google.firebase.perf.v1.f
        public Map L() {
            return DesugarCollections.unmodifiableMap(((e)this.instance).L());
        }

        @Override  // com.google.firebase.perf.v1.f
        public String M1() {
            return ((e)this.instance).M1();
        }

        @Override  // com.google.firebase.perf.v1.f
        public g Y8() {
            return ((e)this.instance).Y8();
        }

        @Override  // com.google.firebase.perf.v1.f
        public com.google.firebase.perf.v1.a a8() {
            return ((e)this.instance).a8();
        }

        @Override  // com.google.firebase.perf.v1.f
        public String b5() {
            return ((e)this.instance).b5();
        }

        @Override  // com.google.firebase.perf.v1.f
        public ByteString c2() {
            return ((e)this.instance).c2();
        }

        @Override  // com.google.firebase.perf.v1.f
        public boolean fb() {
            return ((e)this.instance).fb();
        }

        @Override  // com.google.firebase.perf.v1.f
        public boolean r5() {
            return ((e)this.instance).r5();
        }

        public b ub() {
            this.copyOnWrite();
            ((e)this.instance).v8();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((e)this.instance).A8();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.f
        public String w(String s) {
            s.getClass();
            Map map0 = ((e)this.instance).L();
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (String)map0.get(s);
        }

        public b wb() {
            this.copyOnWrite();
            ((e)this.instance).j9();
            return this;
        }

        public b xb() {
            this.copyOnWrite();
            ((e)this.instance).La().clear();
            return this;
        }

        public b yb() {
            this.copyOnWrite();
            ((e)this.instance).ca();
            return this;
        }

        public b zb(com.google.firebase.perf.v1.a a0) {
            this.copyOnWrite();
            ((e)this.instance).wb(a0);
            return this;
        }
    }

    static final class c {
        static final MapEntryLite a;

        static {
            c.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.STRING, "");
        }
    }

    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final e DEFAULT_INSTANCE = null;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private com.google.firebase.perf.v1.a androidAppInfo_;
    private String appInstanceId_;
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite customAttributes_;
    private String googleAppId_;

    static {
        e e0 = new e();
        e.DEFAULT_INSTANCE = e0;
        GeneratedMessageLite.registerDefaultInstance(e.class, e0);
    }

    private e() {
        this.customAttributes_ = MapFieldLite.emptyMapField();
        this.googleAppId_ = "";
        this.appInstanceId_ = "";
    }

    private void A8() {
        this.bitField0_ &= -3;
        this.appInstanceId_ = "";
    }

    public static e Ab(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseDelimitedFrom(e.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static e Bb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.firebase.perf.v1.f
    public boolean C9() {
        return (this.bitField0_ & 4) != 0;
    }

    public static e Cb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // com.google.firebase.perf.v1.f
    public int D() {
        return this.ub().size();
    }

    public static e Db(CodedInputStream codedInputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static e Eb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static e Fb(InputStream inputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.firebase.perf.v1.f
    public String G(String s, String s1) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.ub();
        return mapFieldLite0.containsKey(s) ? ((String)mapFieldLite0.get(s)) : s1;
    }

    @Override  // com.google.firebase.perf.v1.f
    public boolean G5() {
        return (this.bitField0_ & 2) != 0;
    }

    public static e Gb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static e Hb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteBuffer0);
    }

    @Override  // com.google.firebase.perf.v1.f
    @Deprecated
    public Map I() {
        return this.L();
    }

    public static e Ib(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static e Ja() {
        return e.DEFAULT_INSTANCE;
    }

    public static e Jb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.firebase.perf.v1.f
    public boolean K(String s) {
        s.getClass();
        return this.ub().containsKey(s);
    }

    @Override  // com.google.firebase.perf.v1.f
    public ByteString K8() {
        return ByteString.copyFromUtf8(this.appInstanceId_);
    }

    public static e Kb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    @Override  // com.google.firebase.perf.v1.f
    public Map L() {
        return DesugarCollections.unmodifiableMap(this.ub());
    }

    private Map La() {
        return this.vb();
    }

    private void Lb(com.google.firebase.perf.v1.a a0) {
        a0.getClass();
        this.androidAppInfo_ = a0;
        this.bitField0_ |= 4;
    }

    @Override  // com.google.firebase.perf.v1.f
    public String M1() {
        return this.appInstanceId_;
    }

    private void Mb(String s) {
        s.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = s;
    }

    private void Nb(ByteString byteString0) {
        this.appInstanceId_ = byteString0.toStringUtf8();
        this.bitField0_ |= 2;
    }

    private void Ob(g g0) {
        this.applicationProcessState_ = g0.getNumber();
        this.bitField0_ |= 8;
    }

    private void Pb(String s) {
        s.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = s;
    }

    private void Qb(ByteString byteString0) {
        this.googleAppId_ = byteString0.toStringUtf8();
        this.bitField0_ |= 1;
    }

    @Override  // com.google.firebase.perf.v1.f
    public g Y8() {
        g g0 = g.b(this.applicationProcessState_);
        return g0 == null ? g.b : g0;
    }

    @Override  // com.google.firebase.perf.v1.f
    public com.google.firebase.perf.v1.a a8() {
        return this.androidAppInfo_ == null ? com.google.firebase.perf.v1.a.Z7() : this.androidAppInfo_;
    }

    @Override  // com.google.firebase.perf.v1.f
    public String b5() {
        return this.googleAppId_;
    }

    @Override  // com.google.firebase.perf.v1.f
    public ByteString c2() {
        return ByteString.copyFromUtf8(this.googleAppId_);
    }

    private void ca() {
        this.bitField0_ &= -2;
        this.googleAppId_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new e();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(e.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", g.d(), "customAttributes_", c.a});
            }
            case 4: {
                return e.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = e.PARSER;
                if(parser0 == null) {
                    Class class0 = e.class;
                    synchronized(class0) {
                        parser0 = e.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(e.DEFAULT_INSTANCE);
                            e.PARSER = parser0;
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

    @Override  // com.google.firebase.perf.v1.f
    public boolean fb() {
        return (this.bitField0_ & 8) != 0;
    }

    private void j9() {
        this.bitField0_ &= -9;
        this.applicationProcessState_ = 0;
    }

    public static Parser parser() {
        return e.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.firebase.perf.v1.f
    public boolean r5() {
        return (this.bitField0_ & 1) != 0;
    }

    private MapFieldLite ub() {
        return this.customAttributes_;
    }

    private void v8() {
        this.androidAppInfo_ = null;
        this.bitField0_ &= -5;
    }

    private MapFieldLite vb() {
        if(!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    @Override  // com.google.firebase.perf.v1.f
    public String w(String s) {
        s.getClass();
        MapFieldLite mapFieldLite0 = this.ub();
        if(!mapFieldLite0.containsKey(s)) {
            throw new IllegalArgumentException();
        }
        return (String)mapFieldLite0.get(s);
    }

    private void wb(com.google.firebase.perf.v1.a a0) {
        a0.getClass();
        this.androidAppInfo_ = this.androidAppInfo_ == null || this.androidAppInfo_ == com.google.firebase.perf.v1.a.Z7() ? a0 : ((com.google.firebase.perf.v1.a)((com.google.firebase.perf.v1.a.b)com.google.firebase.perf.v1.a.A8(this.androidAppInfo_).mergeFrom(a0)).buildPartial());
        this.bitField0_ |= 4;
    }

    public static b xb() {
        return (b)e.DEFAULT_INSTANCE.createBuilder();
    }

    public static b yb(e e0) {
        return (b)e.DEFAULT_INSTANCE.createBuilder(e0);
    }

    public static e zb(InputStream inputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseDelimitedFrom(e.DEFAULT_INSTANCE, inputStream0);
    }
}

