package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder;
import androidx.datastore.preferences.PreferencesProto.PreferenceMap;
import androidx.datastore.preferences.PreferencesProto.StringSet;
import androidx.datastore.preferences.PreferencesProto.Value.ValueCase;
import androidx.datastore.preferences.PreferencesProto.Value;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.J;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class PreferencesSerializer implements Serializer {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[ValueCase.values().length];
            arr_v[ValueCase.b.ordinal()] = 1;
            arr_v[ValueCase.c.ordinal()] = 2;
            arr_v[ValueCase.h.ordinal()] = 3;
            arr_v[ValueCase.d.ordinal()] = 4;
            arr_v[ValueCase.e.ordinal()] = 5;
            arr_v[ValueCase.f.ordinal()] = 6;
            arr_v[ValueCase.g.ordinal()] = 7;
            arr_v[ValueCase.i.ordinal()] = 8;
            WhenMappings.a = arr_v;
        }
    }

    @l
    public static final PreferencesSerializer a;
    @l
    private static final String b;

    static {
        PreferencesSerializer.a = new PreferencesSerializer();
        PreferencesSerializer.b = "preferences_pb";
    }

    private final void a(String s, Value preferencesProto$Value0, MutablePreferences mutablePreferences0) {
        ValueCase preferencesProto$Value$ValueCase0 = preferencesProto$Value0.getValueCase();
        switch((preferencesProto$Value$ValueCase0 == null ? -1 : WhenMappings.a[preferencesProto$Value$ValueCase0.ordinal()])) {
            case -1: {
                throw new CorruptionException("Value case is null.", null, 2, null);
            }
            case 1: {
                mutablePreferences0.o(PreferencesKeys.a(s), Boolean.valueOf(preferencesProto$Value0.B()));
                return;
            }
            case 2: {
                mutablePreferences0.o(PreferencesKeys.c(s), preferencesProto$Value0.u());
                return;
            }
            case 3: {
                mutablePreferences0.o(PreferencesKeys.b(s), preferencesProto$Value0.b());
                return;
            }
            case 4: {
                mutablePreferences0.o(PreferencesKeys.d(s), preferencesProto$Value0.h());
                return;
            }
            case 5: {
                mutablePreferences0.o(PreferencesKeys.e(s), preferencesProto$Value0.a());
                return;
            }
            case 6: {
                Key preferences$Key0 = PreferencesKeys.f(s);
                L.o("", "value.string");
                mutablePreferences0.o(preferences$Key0, "");
                return;
            }
            case 7: {
                Key preferences$Key1 = PreferencesKeys.g(s);
                List list0 = preferencesProto$Value0.j().o();
                L.o(list0, "value.stringSet.stringsList");
                mutablePreferences0.o(preferences$Key1, u.a6(list0));
                return;
            }
            case 8: {
                throw new CorruptionException("Value not set.", null, 2, null);
            }
            default: {
                throw new J();
            }
        }
    }

    @l
    public Preferences b() {
        return PreferencesFactory.b();
    }

    // 去混淆评级： 低(20)
    @l
    public final String c() [...] // 潜在的解密器

    private final Value d(Object object0) {
        if(object0 instanceof Boolean) {
            GeneratedMessageLite generatedMessageLite0 = Value.v1().t0(((Boolean)object0).booleanValue()).Y();
            L.o(generatedMessageLite0, "newBuilder().setBoolean(value).build()");
            return (Value)generatedMessageLite0;
        }
        if(object0 instanceof Float) {
            GeneratedMessageLite generatedMessageLite1 = Value.v1().v0(((Number)object0).floatValue()).Y();
            L.o(generatedMessageLite1, "newBuilder().setFloat(value).build()");
            return (Value)generatedMessageLite1;
        }
        if(object0 instanceof Double) {
            GeneratedMessageLite generatedMessageLite2 = Value.v1().u0(((Number)object0).doubleValue()).Y();
            L.o(generatedMessageLite2, "newBuilder().setDouble(value).build()");
            return (Value)generatedMessageLite2;
        }
        if(object0 instanceof Integer) {
            GeneratedMessageLite generatedMessageLite3 = Value.v1().w0(((Number)object0).intValue()).Y();
            L.o(generatedMessageLite3, "newBuilder().setInteger(value).build()");
            return (Value)generatedMessageLite3;
        }
        if(object0 instanceof Long) {
            GeneratedMessageLite generatedMessageLite4 = Value.v1().x0(((Number)object0).longValue()).Y();
            L.o(generatedMessageLite4, "newBuilder().setLong(value).build()");
            return (Value)generatedMessageLite4;
        }
        if(object0 instanceof String) {
            GeneratedMessageLite generatedMessageLite5 = Value.v1().y0(((String)object0)).Y();
            L.o(generatedMessageLite5, "newBuilder().setString(value).build()");
            return (Value)generatedMessageLite5;
        }
        if(!(object0 instanceof Set)) {
            throw new IllegalStateException(L.C("PreferencesSerializer does not support type: ", object0.getClass().getName()));
        }
        GeneratedMessageLite generatedMessageLite6 = Value.v1().A0(StringSet.d1().k0(((Set)object0))).Y();
        L.o(generatedMessageLite6, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return (Value)generatedMessageLite6;
    }

    @m
    public Object e(@l Preferences preferences0, @l OutputStream outputStream0, @l d d0) throws IOException, CorruptionException {
        Map map0 = preferences0.a();
        Builder preferencesProto$PreferenceMap$Builder0 = PreferenceMap.X0();
        for(Object object0: map0.entrySet()) {
            preferencesProto$PreferenceMap$Builder0.m0(((Key)((Map.Entry)object0).getKey()).a(), this.d(((Map.Entry)object0).getValue()));
        }
        ((PreferenceMap)preferencesProto$PreferenceMap$Builder0.Y()).writeTo(outputStream0);
        return S0.a;
    }

    @Override  // androidx.datastore.core.Serializer
    public Object getDefaultValue() {
        return this.b();
    }

    @Override  // androidx.datastore.core.Serializer
    @m
    public Object readFrom(@l InputStream inputStream0, @l d d0) throws IOException, CorruptionException {
        PreferenceMap preferencesProto$PreferenceMap0 = PreferencesMapCompat.a.a(inputStream0);
        MutablePreferences mutablePreferences0 = PreferencesFactory.c(new Pair[0]);
        Map map0 = preferencesProto$PreferenceMap0.F();
        L.o(map0, "preferencesProto.preferencesMap");
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Value preferencesProto$Value0 = (Value)((Map.Entry)object0).getValue();
            L.o(s, "name");
            L.o(preferencesProto$Value0, "value");
            PreferencesSerializer.a.a(s, preferencesProto$Value0, mutablePreferences0);
        }
        return mutablePreferences0.e();
    }

    @Override  // androidx.datastore.core.Serializer
    public Object writeTo(Object object0, OutputStream outputStream0, d d0) {
        return this.e(((Preferences)object0), outputStream0, d0);
    }
}

