package androidx.datastore.preferences.core;

import j..util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class MutablePreferences extends Preferences {
    @l
    private final Map a;
    @l
    private final AtomicBoolean b;

    public MutablePreferences() {
        this(null, false, 3, null);
    }

    public MutablePreferences(@l Map map0, boolean z) {
        L.p(map0, "preferencesMap");
        super();
        this.a = map0;
        this.b = new AtomicBoolean(z);
    }

    public MutablePreferences(Map map0, boolean z, int v, w w0) {
        if((v & 1) != 0) {
            map0 = new LinkedHashMap();
        }
        if((v & 2) != 0) {
            z = true;
        }
        this(map0, z);
    }

    @Override  // androidx.datastore.preferences.core.Preferences
    @l
    public Map a() {
        Map map0 = DesugarCollections.unmodifiableMap(this.a);
        L.o(map0, "unmodifiableMap(preferencesMap)");
        return map0;
    }

    @Override  // androidx.datastore.preferences.core.Preferences
    public boolean b(@l Key preferences$Key0) {
        L.p(preferences$Key0, "key");
        return this.a.containsKey(preferences$Key0);
    }

    @Override  // androidx.datastore.preferences.core.Preferences
    @m
    public Object c(@l Key preferences$Key0) {
        L.p(preferences$Key0, "key");
        return this.a.get(preferences$Key0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof MutablePreferences ? L.g(this.a, ((MutablePreferences)object0).a) : false;
    }

    public final void f() {
        if(this.b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void g() {
        this.f();
        this.a.clear();
    }

    public final void h() {
        this.b.set(true);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @l
    public final Map i() {
        return this.a;
    }

    public final void j(@l Key preferences$Key0) {
        L.p(preferences$Key0, "key");
        this.f();
        this.n(preferences$Key0);
    }

    public final void k(@l Pair preferences$Pair0) {
        L.p(preferences$Pair0, "pair");
        this.f();
        this.m(new Pair[]{preferences$Pair0});
    }

    public final void l(@l Preferences preferences0) {
        L.p(preferences0, "prefs");
        this.f();
        Map map0 = preferences0.a();
        this.a.putAll(map0);
    }

    public final void m(@l Pair[] arr_preferences$Pair) {
        L.p(arr_preferences$Pair, "pairs");
        this.f();
        for(int v = 0; v < arr_preferences$Pair.length; ++v) {
            Pair preferences$Pair0 = arr_preferences$Pair[v];
            this.p(preferences$Pair0.a(), preferences$Pair0.b());
        }
    }

    public final Object n(@l Key preferences$Key0) {
        L.p(preferences$Key0, "key");
        this.f();
        return this.a.remove(preferences$Key0);
    }

    public final void o(@l Key preferences$Key0, Object object0) {
        L.p(preferences$Key0, "key");
        this.p(preferences$Key0, object0);
    }

    public final void p(@l Key preferences$Key0, @m Object object0) {
        L.p(preferences$Key0, "key");
        this.f();
        if(object0 == null) {
            this.n(preferences$Key0);
            return;
        }
        if(object0 instanceof Set) {
            Set set0 = DesugarCollections.unmodifiableSet(u.a6(((Iterable)object0)));
            L.o(set0, "unmodifiableSet(value.toSet())");
            this.a.put(preferences$Key0, set0);
            return;
        }
        this.a.put(preferences$Key0, object0);
    }

    @Override
    @l
    public String toString() {
        return u.m3(this.a.entrySet(), ",\n", "{\n", "\n}", 0, null, androidx.datastore.preferences.core.MutablePreferences.toString.1.e, 24, null);

        final class androidx.datastore.preferences.core.MutablePreferences.toString.1 extends N implements Function1 {
            public static final androidx.datastore.preferences.core.MutablePreferences.toString.1 e;

            static {
                androidx.datastore.preferences.core.MutablePreferences.toString.1.e = new androidx.datastore.preferences.core.MutablePreferences.toString.1();
            }

            androidx.datastore.preferences.core.MutablePreferences.toString.1() {
                super(1);
            }

            @l
            public final CharSequence a(@l Map.Entry map$Entry0) {
                L.p(map$Entry0, "entry");
                return "  " + ((Key)map$Entry0.getKey()).a() + " = " + map$Entry0.getValue();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Map.Entry)object0));
            }
        }

    }
}

