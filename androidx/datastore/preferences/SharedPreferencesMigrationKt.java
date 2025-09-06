package androidx.datastore.preferences;

import A3.a;
import A3.o;
import A3.p;
import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences.Key;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.j;

public final class SharedPreferencesMigrationKt {
    @l
    private static final Set a;

    static {
        SharedPreferencesMigrationKt.a = new LinkedHashSet();
    }

    @l
    @j
    public static final SharedPreferencesMigration a(@l a a0) {
        L.p(a0, "produceSharedPreferences");
        return SharedPreferencesMigrationKt.e(a0, null, 2, null);
    }

    @l
    @j
    public static final SharedPreferencesMigration b(@l a a0, @l Set set0) {
        L.p(a0, "produceSharedPreferences");
        L.p(set0, "keysToMigrate");
        return set0 == SharedPreferencesMigrationKt.a ? new SharedPreferencesMigration(a0, null, SharedPreferencesMigrationKt.i(set0), SharedPreferencesMigrationKt.h(), 2, null) : new SharedPreferencesMigration(a0, set0, SharedPreferencesMigrationKt.i(set0), SharedPreferencesMigrationKt.h());
    }

    @l
    @j
    public static final SharedPreferencesMigration c(@l Context context0, @l String s) {
        L.p(context0, "context");
        L.p(s, "sharedPreferencesName");
        return SharedPreferencesMigrationKt.f(context0, s, null, 4, null);
    }

    @l
    @j
    public static final SharedPreferencesMigration d(@l Context context0, @l String s, @l Set set0) {
        L.p(context0, "context");
        L.p(s, "sharedPreferencesName");
        L.p(set0, "keysToMigrate");
        return set0 == SharedPreferencesMigrationKt.a ? new SharedPreferencesMigration(context0, s, null, SharedPreferencesMigrationKt.i(set0), SharedPreferencesMigrationKt.h(), 4, null) : new SharedPreferencesMigration(context0, s, set0, SharedPreferencesMigrationKt.i(set0), SharedPreferencesMigrationKt.h());
    }

    public static SharedPreferencesMigration e(a a0, Set set0, int v, Object object0) {
        if((v & 2) != 0) {
            set0 = SharedPreferencesMigrationKt.a;
        }
        return SharedPreferencesMigrationKt.b(a0, set0);
    }

    public static SharedPreferencesMigration f(Context context0, String s, Set set0, int v, Object object0) {
        if((v & 4) != 0) {
            set0 = SharedPreferencesMigrationKt.a;
        }
        return SharedPreferencesMigrationKt.d(context0, s, set0);
    }

    @l
    public static final Set g() {
        return SharedPreferencesMigrationKt.a;
    }

    private static final p h() {
        return new p(null) {
            int k;
            Object l;
            Object m;

            {
                super(3, d0);
            }

            @m
            public final Object a(@l SharedPreferencesView sharedPreferencesView0, @l Preferences preferences0, @m d d0) {
                androidx.datastore.preferences.SharedPreferencesMigrationKt.getMigrationFunction.1 sharedPreferencesMigrationKt$getMigrationFunction$10 = new androidx.datastore.preferences.SharedPreferencesMigrationKt.getMigrationFunction.1(d0);
                sharedPreferencesMigrationKt$getMigrationFunction$10.l = sharedPreferencesView0;
                sharedPreferencesMigrationKt$getMigrationFunction$10.m = preferences0;
                return sharedPreferencesMigrationKt$getMigrationFunction$10.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((SharedPreferencesView)object0), ((Preferences)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                SharedPreferencesView sharedPreferencesView0 = (SharedPreferencesView)this.l;
                Preferences preferences0 = (Preferences)this.m;
                Set set0 = preferences0.a().keySet();
                ArrayList arrayList0 = new ArrayList(u.b0(set0, 10));
                for(Object object1: set0) {
                    arrayList0.add(((Key)object1).a());
                }
                Map map0 = sharedPreferencesView0.c();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object2: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object2;
                    if(b.a(!arrayList0.contains(((String)map$Entry0.getKey()))).booleanValue()) {
                        linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                    }
                }
                MutablePreferences mutablePreferences0 = preferences0.d();
                for(Object object3: linkedHashMap0.entrySet()) {
                    String s = (String)((Map.Entry)object3).getKey();
                    Object object4 = ((Map.Entry)object3).getValue();
                    if(object4 instanceof Boolean) {
                        mutablePreferences0.o(PreferencesKeys.a(s), object4);
                    }
                    else if(object4 instanceof Float) {
                        mutablePreferences0.o(PreferencesKeys.c(s), object4);
                    }
                    else if(object4 instanceof Integer) {
                        mutablePreferences0.o(PreferencesKeys.d(s), object4);
                    }
                    else if(object4 instanceof Long) {
                        mutablePreferences0.o(PreferencesKeys.e(s), object4);
                    }
                    else if(object4 instanceof String) {
                        mutablePreferences0.o(PreferencesKeys.f(s), object4);
                    }
                    else if(object4 instanceof Set) {
                        Key preferences$Key0 = PreferencesKeys.g(s);
                        if(object4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                        }
                        mutablePreferences0.o(preferences$Key0, ((Set)object4));
                    }
                }
                return mutablePreferences0.e();
            }
        };
    }

    private static final o i(Set set0) {
        return new o(set0, null) {
            int k;
            Object l;
            final Set m;

            {
                this.m = set0;
                super(2, d0);
            }

            @m
            public final Object a(@l Preferences preferences0, @m d d0) {
                return ((androidx.datastore.preferences.SharedPreferencesMigrationKt.getShouldRunMigration.1)this.create(preferences0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.datastore.preferences.SharedPreferencesMigrationKt.getShouldRunMigration.1(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Preferences)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Set set0 = ((Preferences)this.l).a().keySet();
                ArrayList arrayList0 = new ArrayList(u.b0(set0, 10));
                for(Object object1: set0) {
                    arrayList0.add(((Key)object1).a());
                }
                if(this.m != SharedPreferencesMigrationKt.g()) {
                    Set set1 = this.m;
                    if(!(set1 instanceof Collection) || !set1.isEmpty()) {
                        for(Object object2: set1) {
                            if(!b.a(!arrayList0.contains(((String)object2))).booleanValue()) {
                                continue;
                            }
                            return b.a(true);
                        }
                    }
                    return b.a(false);
                }
                return b.a(true);
            }
        };
    }
}

