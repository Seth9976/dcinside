package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedInputStream;
import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal.ProtobufList;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.WireFormat.FieldType;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public final class PreferencesProto {
    public static final class PreferenceMap extends GeneratedMessageLite implements PreferenceMapOrBuilder {
        public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements PreferenceMapOrBuilder {
            private Builder() {
                super(PreferenceMap.DEFAULT_INSTANCE);
            }

            Builder(androidx.datastore.preferences.PreferencesProto.1 preferencesProto$10) {
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            @Deprecated
            public Map C() {
                return this.F();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            public Map F() {
                return DesugarCollections.unmodifiableMap(((PreferenceMap)this.b).F());
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            public int d() {
                return ((PreferenceMap)this.b).F().size();
            }

            public Builder k0() {
                this.c0();
                ((PreferenceMap)this.b).U0().clear();
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            public Value l(String s, Value preferencesProto$Value0) {
                s.getClass();
                Map map0 = ((PreferenceMap)this.b).F();
                return map0.containsKey(s) ? ((Value)map0.get(s)) : preferencesProto$Value0;
            }

            public Builder l0(Map map0) {
                this.c0();
                ((PreferenceMap)this.b).U0().putAll(map0);
                return this;
            }

            public Builder m0(String s, Value preferencesProto$Value0) {
                s.getClass();
                preferencesProto$Value0.getClass();
                this.c0();
                ((PreferenceMap)this.b).U0().put(s, preferencesProto$Value0);
                return this;
            }

            public Builder n0(String s) {
                s.getClass();
                this.c0();
                ((PreferenceMap)this.b).U0().remove(s);
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            public Value p(String s) {
                s.getClass();
                Map map0 = ((PreferenceMap)this.b).F();
                if(!map0.containsKey(s)) {
                    throw new IllegalArgumentException();
                }
                return (Value)map0.get(s);
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
            public boolean s(String s) {
                s.getClass();
                return ((PreferenceMap)this.b).F().containsKey(s);
            }
        }

        static final class PreferencesDefaultEntryHolder {
            static final MapEntryLite a;

            static {
                Value preferencesProto$Value0 = Value.t1();
                PreferencesDefaultEntryHolder.a = MapEntryLite.f(FieldType.k, "", FieldType.m, preferencesProto$Value0);
            }
        }

        private static final PreferenceMap DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite preferences_;

        static {
            PreferenceMap preferencesProto$PreferenceMap0 = new PreferenceMap();
            PreferenceMap.DEFAULT_INSTANCE = preferencesProto$PreferenceMap0;
            GeneratedMessageLite.P0(PreferenceMap.class, preferencesProto$PreferenceMap0);
        }

        private PreferenceMap() {
            this.preferences_ = MapFieldLite.f();
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        @Deprecated
        public Map C() {
            return this.F();
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public Map F() {
            return DesugarCollections.unmodifiableMap(this.W0());
        }

        public static PreferenceMap T0() {
            return PreferenceMap.DEFAULT_INSTANCE;
        }

        private Map U0() {
            return this.V0();
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new PreferenceMap();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.t0(PreferenceMap.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PreferencesDefaultEntryHolder.a});
                }
                case 4: {
                    return PreferenceMap.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = PreferenceMap.PARSER;
                    if(parser0 == null) {
                        Class class0 = PreferenceMap.class;
                        synchronized(class0) {
                            parser0 = PreferenceMap.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(PreferenceMap.DEFAULT_INSTANCE);
                                PreferenceMap.PARSER = parser0;
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

        private MapFieldLite V0() {
            if(!this.preferences_.l()) {
                this.preferences_ = this.preferences_.q();
            }
            return this.preferences_;
        }

        private MapFieldLite W0() {
            return this.preferences_;
        }

        public static Builder X0() {
            return (Builder)PreferenceMap.DEFAULT_INSTANCE.R();
        }

        public static Builder Y0(PreferenceMap preferencesProto$PreferenceMap0) {
            return (Builder)PreferenceMap.DEFAULT_INSTANCE.S(preferencesProto$PreferenceMap0);
        }

        public static PreferenceMap Z0(InputStream inputStream0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.w0(PreferenceMap.DEFAULT_INSTANCE, inputStream0);
        }

        public static PreferenceMap a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.x0(PreferenceMap.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static PreferenceMap b1(ByteString byteString0) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.y0(PreferenceMap.DEFAULT_INSTANCE, byteString0);
        }

        public static PreferenceMap c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.z0(PreferenceMap.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public int d() {
            return this.W0().size();
        }

        public static PreferenceMap d1(CodedInputStream codedInputStream0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.A0(PreferenceMap.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static PreferenceMap e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.B0(PreferenceMap.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static PreferenceMap f1(InputStream inputStream0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.C0(PreferenceMap.DEFAULT_INSTANCE, inputStream0);
        }

        public static PreferenceMap g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (PreferenceMap)GeneratedMessageLite.D0(PreferenceMap.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static PreferenceMap h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.E0(PreferenceMap.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static PreferenceMap i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.F0(PreferenceMap.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static PreferenceMap j1(byte[] arr_b) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.G0(PreferenceMap.DEFAULT_INSTANCE, arr_b);
        }

        public static PreferenceMap k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (PreferenceMap)GeneratedMessageLite.H0(PreferenceMap.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public Value l(String s, Value preferencesProto$Value0) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.W0();
            return mapFieldLite0.containsKey(s) ? ((Value)mapFieldLite0.get(s)) : preferencesProto$Value0;
        }

        public static Parser m1() {
            return PreferenceMap.DEFAULT_INSTANCE.getParserForType();
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public Value p(String s) {
            s.getClass();
            MapFieldLite mapFieldLite0 = this.W0();
            if(!mapFieldLite0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            return (Value)mapFieldLite0.get(s);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
        public boolean s(String s) {
            s.getClass();
            return this.W0().containsKey(s);
        }
    }

    public interface PreferenceMapOrBuilder extends MessageLiteOrBuilder {
        @Deprecated
        Map C();

        Map F();

        int d();

        Value l(String arg1, Value arg2);

        Value p(String arg1);

        boolean s(String arg1);
    }

    public static final class StringSet extends GeneratedMessageLite implements StringSetOrBuilder {
        public static final class androidx.datastore.preferences.PreferencesProto.StringSet.Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements StringSetOrBuilder {
            private androidx.datastore.preferences.PreferencesProto.StringSet.Builder() {
                super(StringSet.DEFAULT_INSTANCE);
            }

            androidx.datastore.preferences.PreferencesProto.StringSet.Builder(androidx.datastore.preferences.PreferencesProto.1 preferencesProto$10) {
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
            public String D(int v) {
                return ((StringSet)this.b).D(v);
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
            public int k() {
                return ((StringSet)this.b).k();
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder k0(Iterable iterable0) {
                this.c0();
                ((StringSet)this.b).X0(iterable0);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder l0(String s) {
                this.c0();
                ((StringSet)this.b).Y0(s);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder m0(ByteString byteString0) {
                this.c0();
                ((StringSet)this.b).Z0(byteString0);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder n0() {
                this.c0();
                ((StringSet)this.b).a1();
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
            public List o() {
                return DesugarCollections.unmodifiableList(((StringSet)this.b).o());
            }

            public androidx.datastore.preferences.PreferencesProto.StringSet.Builder o0(int v, String s) {
                this.c0();
                ((StringSet)this.b).t1(v, s);
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
            public ByteString y(int v) {
                return ((StringSet)this.b).y(v);
            }
        }

        private static final StringSet DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private ProtobufList strings_;

        static {
            StringSet preferencesProto$StringSet0 = new StringSet();
            StringSet.DEFAULT_INSTANCE = preferencesProto$StringSet0;
            GeneratedMessageLite.P0(StringSet.class, preferencesProto$StringSet0);
        }

        private StringSet() {
            this.strings_ = GeneratedMessageLite.b0();
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public String D(int v) {
            return (String)this.strings_.get(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new StringSet();
                }
                case 2: {
                    return new androidx.datastore.preferences.PreferencesProto.StringSet.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.t0(StringSet.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001A", new Object[]{"strings_"});
                }
                case 4: {
                    return StringSet.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = StringSet.PARSER;
                    if(parser0 == null) {
                        Class class0 = StringSet.class;
                        synchronized(class0) {
                            parser0 = StringSet.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(StringSet.DEFAULT_INSTANCE);
                                StringSet.PARSER = parser0;
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

        private void X0(Iterable iterable0) {
            this.b1();
            AbstractMessageLite.G(iterable0, this.strings_);
        }

        private void Y0(String s) {
            s.getClass();
            this.b1();
            this.strings_.add(s);
        }

        private void Z0(ByteString byteString0) {
            byteString0.getClass();
            this.b1();
            this.strings_.add(byteString0.b0());
        }

        private void a1() {
            this.strings_ = GeneratedMessageLite.b0();
        }

        private void b1() {
            if(!this.strings_.isModifiable()) {
                this.strings_ = GeneratedMessageLite.r0(this.strings_);
            }
        }

        public static StringSet c1() {
            return StringSet.DEFAULT_INSTANCE;
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet.Builder d1() {
            return (androidx.datastore.preferences.PreferencesProto.StringSet.Builder)StringSet.DEFAULT_INSTANCE.R();
        }

        public static androidx.datastore.preferences.PreferencesProto.StringSet.Builder e1(StringSet preferencesProto$StringSet0) {
            return (androidx.datastore.preferences.PreferencesProto.StringSet.Builder)StringSet.DEFAULT_INSTANCE.S(preferencesProto$StringSet0);
        }

        public static StringSet f1(InputStream inputStream0) throws IOException {
            return (StringSet)GeneratedMessageLite.w0(StringSet.DEFAULT_INSTANCE, inputStream0);
        }

        public static StringSet g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (StringSet)GeneratedMessageLite.x0(StringSet.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static StringSet h1(ByteString byteString0) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.y0(StringSet.DEFAULT_INSTANCE, byteString0);
        }

        public static StringSet i1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.z0(StringSet.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static StringSet j1(CodedInputStream codedInputStream0) throws IOException {
            return (StringSet)GeneratedMessageLite.A0(StringSet.DEFAULT_INSTANCE, codedInputStream0);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public int k() {
            return this.strings_.size();
        }

        public static StringSet k1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (StringSet)GeneratedMessageLite.B0(StringSet.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static StringSet m1(InputStream inputStream0) throws IOException {
            return (StringSet)GeneratedMessageLite.C0(StringSet.DEFAULT_INSTANCE, inputStream0);
        }

        public static StringSet n1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (StringSet)GeneratedMessageLite.D0(StringSet.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public List o() {
            return this.strings_;
        }

        public static StringSet o1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.E0(StringSet.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static StringSet p1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.F0(StringSet.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static StringSet q1(byte[] arr_b) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.G0(StringSet.DEFAULT_INSTANCE, arr_b);
        }

        public static StringSet r1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (StringSet)GeneratedMessageLite.H0(StringSet.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser s1() {
            return StringSet.DEFAULT_INSTANCE.getParserForType();
        }

        private void t1(int v, String s) {
            s.getClass();
            this.b1();
            this.strings_.set(v, s);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
        public ByteString y(int v) {
            return ByteString.r(((String)this.strings_.get(v)));
        }
    }

    public interface StringSetOrBuilder extends MessageLiteOrBuilder {
        String D(int arg1);

        int k();

        List o();

        ByteString y(int arg1);
    }

    public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
        public static final class androidx.datastore.preferences.PreferencesProto.Value.Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements ValueOrBuilder {
            private androidx.datastore.preferences.PreferencesProto.Value.Builder() {
                super(Value.DEFAULT_INSTANCE);
            }

            androidx.datastore.preferences.PreferencesProto.Value.Builder(androidx.datastore.preferences.PreferencesProto.1 preferencesProto$10) {
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder A0(androidx.datastore.preferences.PreferencesProto.StringSet.Builder preferencesProto$StringSet$Builder0) {
                this.c0();
                ((Value)this.b).R1(preferencesProto$StringSet$Builder0);
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean B() {
                return ((Value)this.b).B();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder B0(StringSet preferencesProto$StringSet0) {
                this.c0();
                ((Value)this.b).S1(preferencesProto$StringSet0);
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean E() {
                return ((Value)this.b).E();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public long a() {
                return ((Value)this.b).a();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public double b() {
                return ((Value)this.b).b();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public ByteString c() {
                return ((Value)this.b).c();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean e() {
                return ((Value)this.b).e();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean f() {
                return ((Value)this.b).f();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public ValueCase getValueCase() {
                return ((Value)this.b).getValueCase();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public int h() {
                return ((Value)this.b).h();
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public StringSet j() {
                return ((Value)this.b).j();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder k0() {
                this.c0();
                ((Value)this.b).k1();
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder l0() {
                this.c0();
                ((Value)this.b).m1();
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean m() {
                return ((Value)this.b).m();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder m0() {
                this.c0();
                ((Value)this.b).n1();
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder n0() {
                this.c0();
                ((Value)this.b).o1();
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder o0() {
                this.c0();
                ((Value)this.b).p1();
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder p0() {
                this.c0();
                ((Value)this.b).q1();
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean q() {
                return ((Value)this.b).q();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder q0() {
                this.c0();
                ((Value)this.b).r1();
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder r0() {
                this.c0();
                ((Value)this.b).s1();
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder s0(StringSet preferencesProto$StringSet0) {
                this.c0();
                ((Value)this.b).u1(preferencesProto$StringSet0);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder t0(boolean z) {
                this.c0();
                ((Value)this.b).K1(z);
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public float u() {
                return ((Value)this.b).u();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder u0(double f) {
                this.c0();
                ((Value)this.b).L1(f);
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean v() {
                return ((Value)this.b).v();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder v0(float f) {
                this.c0();
                ((Value)this.b).M1(f);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder w0(int v) {
                this.c0();
                ((Value)this.b).N1(v);
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public String x() {
                return ((Value)this.b).x();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder x0(long v) {
                this.c0();
                ((Value)this.b).O1(v);
                return this;
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder y0(String s) {
                this.c0();
                ((Value)this.b).P1(s);
                return this;
            }

            @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
            public boolean z() {
                return ((Value)this.b).z();
            }

            public androidx.datastore.preferences.PreferencesProto.Value.Builder z0(ByteString byteString0) {
                this.c0();
                ((Value)this.b).Q1(byteString0);
                return this;
            }
        }

        public static enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);

            private final int a;

            private ValueCase(int v1) {
                this.a = v1;
            }

            public static ValueCase a(int v) {
                switch(v) {
                    case 0: {
                        return ValueCase.i;
                    }
                    case 1: {
                        return ValueCase.b;
                    }
                    case 2: {
                        return ValueCase.c;
                    }
                    case 3: {
                        return ValueCase.d;
                    }
                    case 4: {
                        return ValueCase.e;
                    }
                    case 5: {
                        return ValueCase.f;
                    }
                    case 6: {
                        return ValueCase.g;
                    }
                    case 7: {
                        return ValueCase.h;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Deprecated
            public static ValueCase b(int v) {
                return ValueCase.a(v);
            }

            public int getNumber() {
                return this.a;
            }
        }

        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final Value DEFAULT_INSTANCE = null;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_;
        private Object value_;

        static {
            Value preferencesProto$Value0 = new Value();
            Value.DEFAULT_INSTANCE = preferencesProto$Value0;
            GeneratedMessageLite.P0(Value.class, preferencesProto$Value0);
        }

        private Value() {
            this.valueCase_ = 0;
        }

        public static Value A1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.z0(Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean B() {
            return this.valueCase_ == 1 ? ((Boolean)this.value_).booleanValue() : false;
        }

        public static Value B1(CodedInputStream codedInputStream0) throws IOException {
            return (Value)GeneratedMessageLite.A0(Value.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static Value C1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Value)GeneratedMessageLite.B0(Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static Value D1(InputStream inputStream0) throws IOException {
            return (Value)GeneratedMessageLite.C0(Value.DEFAULT_INSTANCE, inputStream0);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean E() {
            return this.valueCase_ == 6;
        }

        public static Value E1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Value)GeneratedMessageLite.D0(Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static Value F1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.E0(Value.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static Value G1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.F0(Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static Value H1(byte[] arr_b) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.G0(Value.DEFAULT_INSTANCE, arr_b);
        }

        public static Value I1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.H0(Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser J1() {
            return Value.DEFAULT_INSTANCE.getParserForType();
        }

        private void K1(boolean z) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z);
        }

        private void L1(double f) {
            this.valueCase_ = 7;
            this.value_ = f;
        }

        private void M1(float f) {
            this.valueCase_ = 2;
            this.value_ = f;
        }

        private void N1(int v) {
            this.valueCase_ = 3;
            this.value_ = v;
        }

        private void O1(long v) {
            this.valueCase_ = 4;
            this.value_ = v;
        }

        private void P1(String s) {
            s.getClass();
            this.valueCase_ = 5;
            this.value_ = s;
        }

        private void Q1(ByteString byteString0) {
            byteString0.getClass();
            this.valueCase_ = 5;
            this.value_ = byteString0.b0();
        }

        private void R1(androidx.datastore.preferences.PreferencesProto.StringSet.Builder preferencesProto$StringSet$Builder0) {
            this.value_ = preferencesProto$StringSet$Builder0.Y();
            this.valueCase_ = 6;
        }

        private void S1(StringSet preferencesProto$StringSet0) {
            preferencesProto$StringSet0.getClass();
            this.value_ = preferencesProto$StringSet0;
            this.valueCase_ = 6;
        }

        @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new Value();
                }
                case 2: {
                    return new androidx.datastore.preferences.PreferencesProto.Value.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.t0(Value.DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", StringSet.class});
                }
                case 4: {
                    return Value.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = Value.PARSER;
                    if(parser0 == null) {
                        Class class0 = Value.class;
                        synchronized(class0) {
                            parser0 = Value.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(Value.DEFAULT_INSTANCE);
                                Value.PARSER = parser0;
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

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public long a() {
            return this.valueCase_ == 4 ? ((long)(((Long)this.value_))) : 0L;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public double b() {
            return this.valueCase_ == 7 ? ((double)(((Double)this.value_))) : 0.0;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public ByteString c() {
            return this.valueCase_ == 5 ? ByteString.r(((String)this.value_)) : ByteString.r("");
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean e() {
            return this.valueCase_ == 5;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean f() {
            return this.valueCase_ == 2;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.a(this.valueCase_);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public int h() {
            return this.valueCase_ == 3 ? ((int)(((Integer)this.value_))) : 0;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public StringSet j() {
            return this.valueCase_ == 6 ? ((StringSet)this.value_) : StringSet.c1();
        }

        private void k1() {
            if(this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean m() {
            return this.valueCase_ == 7;
        }

        private void m1() {
            if(this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        private void n1() {
            if(this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        private void o1() {
            if(this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        private void p1() {
            if(this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean q() {
            return this.valueCase_ == 1;
        }

        private void q1() {
            if(this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        private void r1() {
            if(this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        private void s1() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static Value t1() {
            return Value.DEFAULT_INSTANCE;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public float u() {
            return this.valueCase_ == 2 ? ((float)(((Float)this.value_))) : 0.0f;
        }

        private void u1(StringSet preferencesProto$StringSet0) {
            preferencesProto$StringSet0.getClass();
            this.value_ = this.valueCase_ != 6 || this.value_ == StringSet.c1() ? preferencesProto$StringSet0 : ((androidx.datastore.preferences.PreferencesProto.StringSet.Builder)StringSet.e1(((StringSet)this.value_)).g0(preferencesProto$StringSet0)).Z();
            this.valueCase_ = 6;
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean v() {
            return this.valueCase_ == 3;
        }

        public static androidx.datastore.preferences.PreferencesProto.Value.Builder v1() {
            return (androidx.datastore.preferences.PreferencesProto.Value.Builder)Value.DEFAULT_INSTANCE.R();
        }

        public static androidx.datastore.preferences.PreferencesProto.Value.Builder w1(Value preferencesProto$Value0) {
            return (androidx.datastore.preferences.PreferencesProto.Value.Builder)Value.DEFAULT_INSTANCE.S(preferencesProto$Value0);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public String x() [...] // 潜在的解密器

        public static Value x1(InputStream inputStream0) throws IOException {
            return (Value)GeneratedMessageLite.w0(Value.DEFAULT_INSTANCE, inputStream0);
        }

        public static Value y1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (Value)GeneratedMessageLite.x0(Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
        public boolean z() {
            return this.valueCase_ == 4;
        }

        public static Value z1(ByteString byteString0) throws InvalidProtocolBufferException {
            return (Value)GeneratedMessageLite.y0(Value.DEFAULT_INSTANCE, byteString0);
        }
    }

    public interface ValueOrBuilder extends MessageLiteOrBuilder {
        boolean B();

        boolean E();

        long a();

        double b();

        ByteString c();

        boolean e();

        boolean f();

        ValueCase getValueCase();

        int h();

        StringSet j();

        boolean m();

        boolean q();

        float u();

        boolean v();

        String x();

        boolean z();
    }

    static {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

