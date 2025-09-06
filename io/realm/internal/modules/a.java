package io.realm.internal.modules;

import android.util.JsonReader;
import io.realm.F0;
import io.realm.X0;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import io.realm.internal.c;
import io.realm.internal.t;
import io.realm.internal.u;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends t {
    private final Map a;
    private final Map b;

    public a(t[] arr_t) {
        this.b = new HashMap();
        HashMap hashMap0 = new HashMap();
        if(arr_t != null) {
            for(int v = 0; v < arr_t.length; ++v) {
                t t0 = arr_t[v];
                for(Object object0: t0.m()) {
                    Class class0 = (Class)object0;
                    String s = t0.o(class0);
                    Class class1 = (Class)this.b.get(s);
                    if(class1 != null && !class1.equals(class0)) {
                        throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules \'%s\' and \'%s\' and they share the same internal name \'%s\'.", class1, class0, hashMap0.get(class1), t0, s));
                    }
                    hashMap0.put(class0, t0);
                    this.b.put(s, class0);
                }
            }
        }
        this.a = DesugarCollections.unmodifiableMap(hashMap0);
    }

    private t A(Class class0) {
        Class class1 = Util.h(class0);
        t t0 = (t)this.a.get(class1);
        if(t0 == null) {
            throw new RealmException(class0.getSimpleName() + " is not part of the schema for this Realm");
        }
        return t0;
    }

    private t B(String s) {
        return this.A(((Class)this.b.get(s)));
    }

    @Override  // io.realm.internal.t
    public X0 c(F0 f00, X0 x00, boolean z, Map map0, Set set0) {
        return this.A(Util.h(x00.getClass())).c(f00, x00, z, map0, set0);
    }

    @Override  // io.realm.internal.t
    public c d(Class class0, OsSchemaInfo osSchemaInfo0) {
        return this.A(class0).d(class0, osSchemaInfo0);
    }

    @Override  // io.realm.internal.t
    public X0 e(X0 x00, int v, Map map0) {
        return this.A(Util.h(x00.getClass())).e(x00, v, map0);
    }

    @Override  // io.realm.internal.t
    public X0 f(Class class0, F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        return this.A(class0).f(class0, f00, jSONObject0, z);
    }

    @Override  // io.realm.internal.t
    public X0 g(Class class0, F0 f00, JsonReader jsonReader0) throws IOException {
        return this.A(class0).g(class0, f00, jsonReader0);
    }

    @Override  // io.realm.internal.t
    protected Class i(String s) {
        return this.B(s).h(s);
    }

    @Override  // io.realm.internal.t
    public Map j() {
        Map map0 = new HashMap();
        for(Object object0: this.a.values()) {
            map0.putAll(((t)object0).j());
        }
        return map0;
    }

    @Override  // io.realm.internal.t
    public Set m() {
        return this.a.keySet();
    }

    @Override  // io.realm.internal.t
    protected String p(Class class0) {
        return this.A(class0).o(class0);
    }

    @Override  // io.realm.internal.t
    protected boolean r(Class class0) {
        return this.A(class0).q(class0);
    }

    @Override  // io.realm.internal.t
    public long s(F0 f00, X0 x00, Map map0) {
        return this.A(Util.h(x00.getClass())).s(f00, x00, map0);
    }

    @Override  // io.realm.internal.t
    public void t(F0 f00, Collection collection0) {
        Object object0 = collection0.iterator().next();
        this.A(Util.h(Util.h(((X0)object0).getClass()))).t(f00, collection0);
    }

    @Override  // io.realm.internal.t
    public long u(F0 f00, X0 x00, Map map0) {
        return this.A(Util.h(x00.getClass())).u(f00, x00, map0);
    }

    @Override  // io.realm.internal.t
    public void v(F0 f00, Collection collection0) {
        Object object0 = collection0.iterator().next();
        this.A(Util.h(Util.h(((X0)object0).getClass()))).v(f00, collection0);
    }

    @Override  // io.realm.internal.t
    public boolean w(Class class0) {
        return this.A(Util.h(class0)).w(class0);
    }

    @Override  // io.realm.internal.t
    public X0 x(Class class0, Object object0, u u0, c c0, boolean z, List list0) {
        return this.A(class0).x(class0, object0, u0, c0, z, list0);
    }

    @Override  // io.realm.internal.t
    public boolean y() {
        for(Object object0: this.a.entrySet()) {
            if(!((t)((Map.Entry)object0).getValue()).y()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // io.realm.internal.t
    public void z(F0 f00, X0 x00, X0 x01, Map map0, Set set0) {
        this.A(Util.h(x01.getClass())).z(f00, x00, x01, map0, set0);
    }
}

