package io.realm.internal.modules;

import android.util.JsonReader;
import io.realm.F0;
import io.realm.X0;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import io.realm.internal.c;
import io.realm.internal.t;
import io.realm.internal.u;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends t {
    private final t a;
    private final Set b;

    public b(t t0, Collection collection0) {
        this(t0, collection0, false);
    }

    public b(t t0, Collection collection0, boolean z) {
        this.a = t0;
        HashSet hashSet0 = new HashSet();
        if(t0 != null) {
            Set set0 = t0.m();
            if(z) {
                for(Object object1: set0) {
                    Class class1 = (Class)object1;
                    if(!collection0.contains(class1)) {
                        hashSet0.add(class1);
                    }
                }
            }
            else {
                for(Object object0: collection0) {
                    Class class0 = (Class)object0;
                    if(set0.contains(class0)) {
                        hashSet0.add(class0);
                    }
                }
            }
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet0);
    }

    private void A(Class class0) {
        if(!this.b.contains(class0)) {
            throw new IllegalArgumentException(class0.getSimpleName() + " is not part of the schema for this Realm");
        }
    }

    @Override  // io.realm.internal.t
    public X0 c(F0 f00, X0 x00, boolean z, Map map0, Set set0) {
        this.A(Util.h(x00.getClass()));
        return this.a.c(f00, x00, z, map0, set0);
    }

    @Override  // io.realm.internal.t
    public c d(Class class0, OsSchemaInfo osSchemaInfo0) {
        this.A(class0);
        return this.a.d(class0, osSchemaInfo0);
    }

    @Override  // io.realm.internal.t
    public X0 e(X0 x00, int v, Map map0) {
        this.A(Util.h(x00.getClass()));
        return this.a.e(x00, v, map0);
    }

    @Override  // io.realm.internal.t
    public X0 f(Class class0, F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        this.A(class0);
        return this.a.f(class0, f00, jSONObject0, z);
    }

    @Override  // io.realm.internal.t
    public X0 g(Class class0, F0 f00, JsonReader jsonReader0) throws IOException {
        this.A(class0);
        return this.a.g(class0, f00, jsonReader0);
    }

    @Override  // io.realm.internal.t
    protected Class i(String s) {
        return this.a.h(s);
    }

    @Override  // io.realm.internal.t
    public Map j() {
        Map map0 = new HashMap();
        for(Object object0: this.a.j().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getKey();
            if(this.b.contains(object1)) {
                map0.put(((Class)map$Entry0.getKey()), ((OsObjectSchemaInfo)map$Entry0.getValue()));
            }
        }
        return map0;
    }

    @Override  // io.realm.internal.t
    public Set m() {
        return this.b;
    }

    @Override  // io.realm.internal.t
    protected String p(Class class0) {
        this.A(class0);
        return this.a.o(class0);
    }

    @Override  // io.realm.internal.t
    protected boolean r(Class class0) {
        return this.a.q(class0);
    }

    @Override  // io.realm.internal.t
    public long s(F0 f00, X0 x00, Map map0) {
        this.A(Util.h(x00.getClass()));
        return this.a.s(f00, x00, map0);
    }

    @Override  // io.realm.internal.t
    public void t(F0 f00, Collection collection0) {
        Object object0 = collection0.iterator().next();
        this.A(Util.h(((X0)object0).getClass()));
        this.a.t(f00, collection0);
    }

    @Override  // io.realm.internal.t
    public long u(F0 f00, X0 x00, Map map0) {
        this.A(Util.h(x00.getClass()));
        return this.a.u(f00, x00, map0);
    }

    @Override  // io.realm.internal.t
    public void v(F0 f00, Collection collection0) {
        Object object0 = collection0.iterator().next();
        this.A(Util.h(((X0)object0).getClass()));
        this.a.v(f00, collection0);
    }

    @Override  // io.realm.internal.t
    public boolean w(Class class0) {
        this.A(Util.h(class0));
        return this.a.w(class0);
    }

    @Override  // io.realm.internal.t
    public X0 x(Class class0, Object object0, u u0, c c0, boolean z, List list0) {
        this.A(class0);
        return this.a.x(class0, object0, u0, c0, z, list0);
    }

    @Override  // io.realm.internal.t
    public boolean y() {
        return this.a == null ? true : this.a.y();
    }

    @Override  // io.realm.internal.t
    public void z(F0 f00, X0 x00, X0 x01, Map map0, Set set0) {
        this.A(Util.h(x01.getClass()));
        this.a.z(f00, x00, x01, map0, set0);
    }
}

