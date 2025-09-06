package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class SharedPreferencesView {
    @l
    private final SharedPreferences a;
    @m
    private final Set b;

    public SharedPreferencesView(@l SharedPreferences sharedPreferences0, @m Set set0) {
        L.p(sharedPreferences0, "prefs");
        super();
        this.a = sharedPreferences0;
        this.b = set0;
    }

    private final String a(String s) {
        if(this.b != null && !this.b.contains(s)) {
            throw new IllegalStateException(("Can\'t access key outside migration: " + s).toString());
        }
        return s;
    }

    public final boolean b(@l String s) {
        L.p(s, "key");
        String s1 = this.a(s);
        return this.a.contains(s1);
    }

    @l
    public final Map c() {
        Map map0 = this.a.getAll();
        L.o(map0, "prefs.all");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = (String)map$Entry0.getKey();
            if((this.b == null ? true : this.b.contains(s))) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        Map map1 = new LinkedHashMap(Y.j(linkedHashMap0.size()));
        for(Object object1: linkedHashMap0.entrySet()) {
            Object object2 = ((Map.Entry)object1).getKey();
            Set set0 = ((Map.Entry)object1).getValue();
            if(set0 instanceof Set) {
                set0 = u.a6(set0);
            }
            map1.put(object2, set0);
        }
        return map1;
    }

    public final boolean d(@l String s, boolean z) {
        L.p(s, "key");
        String s1 = this.a(s);
        return this.a.getBoolean(s1, z);
    }

    public final float e(@l String s, float f) {
        L.p(s, "key");
        String s1 = this.a(s);
        return this.a.getFloat(s1, f);
    }

    public final int f(@l String s, int v) {
        L.p(s, "key");
        String s1 = this.a(s);
        return this.a.getInt(s1, v);
    }

    public final long g(@l String s, long v) {
        L.p(s, "key");
        String s1 = this.a(s);
        return this.a.getLong(s1, v);
    }

    @m
    public final String h(@l String s, @m String s1) {
        L.p(s, "key");
        String s2 = this.a(s);
        return this.a.getString(s2, s1);
    }

    public static String i(SharedPreferencesView sharedPreferencesView0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        return sharedPreferencesView0.h(s, s1);
    }

    @m
    public final Set j(@l String s, @m Set set0) {
        L.p(s, "key");
        String s1 = this.a(s);
        Set set1 = this.a.getStringSet(s1, set0);
        return set1 == null ? null : u.Z5(set1);
    }

    public static Set k(SharedPreferencesView sharedPreferencesView0, String s, Set set0, int v, Object object0) {
        if((v & 2) != 0) {
            set0 = null;
        }
        return sharedPreferencesView0.j(s, set0);
    }
}

