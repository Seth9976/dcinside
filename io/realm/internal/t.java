package io.realm.internal;

import android.util.JsonReader;
import io.realm.F0;
import io.realm.X0;
import io.realm.exceptions.RealmException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class t {
    protected static void a(Class class0) {
        if(class0 == null) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    protected static void b(String s) {
        if(s == null || s.isEmpty()) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    public abstract X0 c(F0 arg1, X0 arg2, boolean arg3, Map arg4, Set arg5);

    public abstract c d(Class arg1, OsSchemaInfo arg2);

    public abstract X0 e(X0 arg1, int arg2, Map arg3);

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof t ? this.m().equals(((t)object0).m()) : false;
    }

    public abstract X0 f(Class arg1, F0 arg2, JSONObject arg3, boolean arg4) throws JSONException;

    public abstract X0 g(Class arg1, F0 arg2, JsonReader arg3) throws IOException;

    public final Class h(String s) {
        return this.i(s);
    }

    @Override
    public int hashCode() {
        return this.m().hashCode();
    }

    protected abstract Class i(String arg1);

    public abstract Map j();

    protected static RealmException k(Class class0) {
        return new RealmException(String.format("\'%s\' is not part of the schema for this Realm.", class0.toString()));
    }

    protected static RealmException l(String s) {
        return new RealmException(String.format("\'%s\' is not part of the schema for this Realm.", s));
    }

    public abstract Set m();

    protected static IllegalStateException n(String s) {
        return new IllegalStateException("This class is not marked embedded: " + s);
    }

    public final String o(Class class0) {
        return this.p(Util.h(class0));
    }

    protected abstract String p(Class arg1);

    public boolean q(Class class0) {
        return this.r(class0);
    }

    protected abstract boolean r(Class arg1);

    public abstract long s(F0 arg1, X0 arg2, Map arg3);

    public abstract void t(F0 arg1, Collection arg2);

    public abstract long u(F0 arg1, X0 arg2, Map arg3);

    public abstract void v(F0 arg1, Collection arg2);

    public abstract boolean w(Class arg1);

    public abstract X0 x(Class arg1, Object arg2, u arg3, c arg4, boolean arg5, List arg6);

    public boolean y() {
        return false;
    }

    public abstract void z(F0 arg1, X0 arg2, X0 arg3, Map arg4, Set arg5);
}

