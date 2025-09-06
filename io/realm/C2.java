package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.k;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.c;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.internal.s;
import io.realm.internal.u;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class c2 extends k implements d2, s {
    public static final class a {
        public static final String a = "DcconGuestHistory";

    }

    static final class b extends c {
        long e;
        long f;
        long g;

        b(OsSchemaInfo osSchemaInfo0) {
            super(3);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("DcconGuestHistory");
            this.e = this.b("packageIdx", "packageIdx", osObjectSchemaInfo0);
            this.f = this.b("detailIdx", "detailIdx", osObjectSchemaInfo0);
            this.g = this.b("date", "date", osObjectSchemaInfo0);
        }

        b(c c0, boolean z) {
            super(c0, z);
            this.d(c0, this);
        }

        @Override  // io.realm.internal.c
        protected final c c(boolean z) {
            return new b(this, z);
        }

        @Override  // io.realm.internal.c
        protected final void d(c c0, c c1) {
            ((b)c1).e = ((b)c0).e;
            ((b)c1).f = ((b)c0).f;
            ((b)c1).g = ((b)c0).g;
        }
    }

    private b h;
    private A0 i;
    private static final String j = "";
    private static final OsObjectSchemaInfo k;

    static {
        c2.k = c2.a6();
    }

    c2() {
        this.i.p();
    }

    @Override  // com.dcinside.app.realm.k, io.realm.d2
    public int A() {
        this.i.f().k();
        return (int)this.i.g().w(this.h.f);
    }

    @Override  // com.dcinside.app.realm.k, io.realm.d2
    public int B() {
        this.i.f().k();
        return (int)this.i.g().w(this.h.e);
    }

    @Override  // com.dcinside.app.realm.k, io.realm.d2
    public void O(Date date0) {
        if(this.i.i()) {
            if(!this.i.d()) {
                return;
            }
            u u0 = this.i.g();
            if(date0 == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'date\' to null.");
            }
            u0.b().n0(this.h.g, u0.F(), date0, true);
            return;
        }
        this.i.f().k();
        if(date0 == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field \'date\' to null.");
        }
        this.i.g().N(this.h.g, date0);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.i;
    }

    public static k W5(F0 f00, b c2$b0, k k0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(k0);
        if(s0 != null) {
            return (k)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(k.class), set0);
        osObjectBuilder0.i3(c2$b0.e, k0.B());
        osObjectBuilder0.i3(c2$b0.f, k0.A());
        osObjectBuilder0.u1(c2$b0.g, k0.p());
        k k1 = c2.j6(f00, osObjectBuilder0.v4());
        map0.put(k0, k1);
        return k1;
    }

    public static k X5(F0 f00, b c2$b0, k k0, boolean z, Map map0, Set set0) {
        if(k0 instanceof s && !d1.F5(k0) && ((s)k0).R3().f() != null) {
            io.realm.a a0 = ((s)k0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return k0;
            }
        }
        c2 c20 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(k0);
        if(s0 != null) {
            return (k)s0;
        }
        if(z) {
            Table table0 = f00.n4(k.class);
            long v = table0.t(c2$b0.f, ((long)k0.A()));
            if(v == -1L) {
                return c2.W5(f00, c2$b0, k0, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v), c2$b0, false, Collections.emptyList());
                c20 = new c2();
                map0.put(k0, c20);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? c2.k6(f00, c2$b0, c20, k0, map0, set0) : c2.W5(f00, c2$b0, k0, z, map0, set0);
    }

    public static b Y5(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static k Z5(k k0, int v, int v1, Map map0) {
        k k1;
        if(v <= v1 && k0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(k0);
            if(s$a0 == null) {
                k1 = new k();
                map0.put(k0, new io.realm.internal.s.a(v, k1));
            }
            else {
                if(v >= s$a0.a) {
                    return (k)s$a0.b;
                }
                s$a0.a = v;
                k1 = (k)s$a0.b;
            }
            F0 f00 = (F0)((s)k0).R3().f();
            k1.t(k0.B());
            k1.x(k0.A());
            k1.O(k0.p());
            return k1;
        }
        return null;
    }

    private static OsObjectSchemaInfo a6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "DcconGuestHistory", false, 3, 0);
        osObjectSchemaInfo$b0.d("", "packageIdx", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "detailIdx", RealmFieldType.INTEGER, true, false, true);
        osObjectSchemaInfo$b0.d("", "date", RealmFieldType.DATE, false, true, true);
        return osObjectSchemaInfo$b0.g();
    }

    public static k b6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        k k0;
        List list0 = Collections.emptyList();
        Class class0 = k.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).f;
            long v1 = jSONObject0.isNull("detailIdx") ? -1L : table0.t(v, jSONObject0.getLong("detailIdx"));
            if(v1 == -1L) {
                k0 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    k0 = new c2();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            k0 = null;
        }
        if(k0 == null) {
            if(!jSONObject0.has("detailIdx")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'detailIdx\'.");
            }
            k0 = jSONObject0.isNull("detailIdx") ? ((c2)f00.v3(class0, null, true, list0)) : ((c2)f00.v3(class0, jSONObject0.getInt("detailIdx"), true, list0));
        }
        if(jSONObject0.has("packageIdx")) {
            if(jSONObject0.isNull("packageIdx")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'packageIdx\' to null.");
            }
            k0.t(jSONObject0.getInt("packageIdx"));
        }
        if(jSONObject0.has("date")) {
            if(jSONObject0.isNull("date")) {
                k0.O(null);
                return k0;
            }
            Object object0 = jSONObject0.get("date");
            if(object0 instanceof String) {
                k0.O(io.realm.internal.android.c.b(((String)object0)));
                return k0;
            }
            k0.O(new Date(jSONObject0.getLong("date")));
        }
        return k0;
    }

    @TargetApi(11)
    public static k c6(F0 f00, JsonReader jsonReader0) throws IOException {
        k k0 = new k();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("packageIdx")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    k0.t(jsonReader0.nextInt());
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'packageIdx\' to null.");
            }
            if(s.equals("detailIdx")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    k0.x(jsonReader0.nextInt());
                    z = true;
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'detailIdx\' to null.");
            }
            if(!s.equals("date")) {
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                k0.O(null);
            }
            else if(jsonReader0.peek() == JsonToken.NUMBER) {
                long v = jsonReader0.nextLong();
                if(v <= -1L) {
                    continue;
                }
                k0.O(new Date(v));
            }
            else {
                k0.O(io.realm.internal.android.c.b(jsonReader0.nextString()));
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'detailIdx\'.");
        }
        return (k)f00.t2(k0, new W[0]);
    }

    public static OsObjectSchemaInfo d6() {
        return c2.k;
    }

    public static String e6() {
        return "DcconGuestHistory";
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.i.f();
            io.realm.a a1 = ((c2)object0).i.f();
            String s = a0.getPath();
            String s1 = a1.getPath();
            if(s != null) {
                if(!s.equals(s1)) {
                    return false;
                }
            }
            else if(s1 != null) {
                return false;
            }
            if(a0.x0() != a1.x0()) {
                return false;
            }
            if(!a0.e.getVersionID().equals(a1.e.getVersionID())) {
                return false;
            }
            String s2 = this.i.g().b().P();
            String s3 = ((c2)object0).i.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.i.g().F() == ((c2)object0).i.g().F() : false;
            }
            return s3 == null ? this.i.g().F() == ((c2)object0).i.g().F() : false;
        }
        return false;
    }

    public static long f6(F0 f00, k k0, Map map0) {
        if(k0 instanceof s && !d1.F5(k0) && ((s)k0).R3().f() != null && ((s)k0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)k0).R3().g().F();
        }
        Table table0 = f00.n4(k.class);
        long v = table0.getNativePtr();
        b c2$b0 = (b)f00.e0().j(k.class);
        long v1 = c2$b0.f;
        Integer integer0 = k0.A();
        long v2 = Table.nativeFindFirstInt(v, v1, k0.A());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, k0.A());
        }
        else {
            Table.B0(integer0);
        }
        map0.put(k0, v2);
        Table.nativeSetLong(v, c2$b0.e, v2, k0.B(), false);
        Date date0 = k0.p();
        if(date0 != null) {
            Table.nativeSetTimestamp(v, c2$b0.g, v2, date0.getTime(), false);
        }
        return v2;
    }

    public static void g6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(k.class);
        long v = table0.getNativePtr();
        b c2$b0 = (b)f00.e0().j(k.class);
        long v1 = c2$b0.f;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            k k0 = (k)object0;
            if(map0.containsKey(k0)) {
            }
            else if(k0 instanceof s && !d1.F5(k0) && ((s)k0).R3().f() != null && ((s)k0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(k0, ((s)k0).R3().g().F());
            }
            else {
                Integer integer0 = k0.A();
                long v2 = Table.nativeFindFirstInt(v, v1, k0.A());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, k0.A());
                }
                else {
                    Table.B0(integer0);
                }
                map0.put(k0, v2);
                Table.nativeSetLong(v, c2$b0.e, v2, k0.B(), false);
                Date date0 = k0.p();
                if(date0 != null) {
                    Table.nativeSetTimestamp(v, c2$b0.g, v2, date0.getTime(), false);
                }
            }
        }
    }

    public static long h6(F0 f00, k k0, Map map0) {
        if(k0 instanceof s && !d1.F5(k0) && ((s)k0).R3().f() != null && ((s)k0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)k0).R3().g().F();
        }
        Table table0 = f00.n4(k.class);
        long v = table0.getNativePtr();
        b c2$b0 = (b)f00.e0().j(k.class);
        long v1 = c2$b0.f;
        k0.A();
        long v2 = Table.nativeFindFirstInt(v, v1, k0.A());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, k0.A());
        }
        map0.put(k0, v2);
        Table.nativeSetLong(v, c2$b0.e, v2, k0.B(), false);
        Date date0 = k0.p();
        if(date0 != null) {
            Table.nativeSetTimestamp(v, c2$b0.g, v2, date0.getTime(), false);
            return v2;
        }
        Table.nativeSetNull(v, c2$b0.g, v2, false);
        return v2;
    }

    @Override
    public int hashCode() {
        String s = this.i.f().getPath();
        String s1 = this.i.g().b().P();
        long v = this.i.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    public static void i6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(k.class);
        long v = table0.getNativePtr();
        b c2$b0 = (b)f00.e0().j(k.class);
        long v1 = c2$b0.f;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            k k0 = (k)object0;
            if(map0.containsKey(k0)) {
            }
            else if(k0 instanceof s && !d1.F5(k0) && ((s)k0).R3().f() != null && ((s)k0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(k0, ((s)k0).R3().g().F());
            }
            else {
                k0.A();
                long v2 = Table.nativeFindFirstInt(v, v1, k0.A());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, k0.A());
                }
                map0.put(k0, v2);
                Table.nativeSetLong(v, c2$b0.e, v2, k0.B(), false);
                Date date0 = k0.p();
                if(date0 == null) {
                    Table.nativeSetNull(v, c2$b0.g, v2, false);
                }
                else {
                    Table.nativeSetTimestamp(v, c2$b0.g, v2, date0.getTime(), false);
                }
            }
        }
    }

    static c2 j6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(k.class), false, Collections.emptyList());
        c2 c20 = new c2();
        a$h0.a();
        return c20;
    }

    static k k6(F0 f00, b c2$b0, k k0, k k1, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(k.class), set0);
        osObjectBuilder0.i3(c2$b0.e, k1.B());
        osObjectBuilder0.i3(c2$b0.f, k1.A());
        osObjectBuilder0.u1(c2$b0.g, k1.p());
        osObjectBuilder0.x4();
        return k0;
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.i != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.h = (b)a$h0.c();
        A0 a00 = new A0(this);
        this.i = a00;
        a00.r(a$h0.e());
        this.i.s(a$h0.f());
        this.i.o(a$h0.b());
        this.i.q(a$h0.d());
    }

    @Override  // com.dcinside.app.realm.k, io.realm.d2
    public Date p() {
        this.i.f().k();
        return this.i.g().R(this.h.g);
    }

    @Override  // com.dcinside.app.realm.k, io.realm.d2
    public void t(int v) {
        if(this.i.i()) {
            if(!this.i.d()) {
                return;
            }
            u u0 = this.i.g();
            u0.b().u0(this.h.e, u0.F(), ((long)v), true);
            return;
        }
        this.i.f().k();
        this.i.g().e(this.h.e, ((long)v));
    }

    // 去混淆评级： 低(30)
    @Override
    public String toString() {
        return d1.I5(this) ? "DcconGuestHistory = proxy[{packageIdx:" + this.B() + "}" + "," + "{detailIdx:" + this.A() + "}" + "," + "{date:" + this.p() + "}" + "]" : "Invalid object";
    }

    @Override  // com.dcinside.app.realm.k, io.realm.d2
    public void x(int v) {
        if(this.i.i()) {
            return;
        }
        this.i.f().k();
        throw new RealmException("Primary key field \'detailIdx\' cannot be changed after object was created.");
    }
}

