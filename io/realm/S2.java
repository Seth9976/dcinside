package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.t;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class s2 extends t implements s, t2 {
    public static final class a {
        public static final String a = "GuestUserInfo";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;
        long i;

        b(OsSchemaInfo osSchemaInfo0) {
            super(5);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("GuestUserInfo");
            this.e = this.b("name", "name", osObjectSchemaInfo0);
            this.f = this.b("pw", "pw", osObjectSchemaInfo0);
            this.g = this.b("secondName", "secondName", osObjectSchemaInfo0);
            this.h = this.b("secondPw", "secondPw", osObjectSchemaInfo0);
            this.i = this.b("enabled", "enabled", osObjectSchemaInfo0);
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
            ((b)c1).h = ((b)c0).h;
            ((b)c1).i = ((b)c0).i;
        }
    }

    private b j;
    private A0 k;
    private static final String l = "";
    private static final OsObjectSchemaInfo m;

    static {
        s2.m = s2.h6();
    }

    s2() {
        this.k.p();
    }

    @Override  // com.dcinside.app.realm.t, io.realm.t2
    public boolean H2() {
        this.k.f().k();
        return this.k.g().Q(this.j.i);
    }

    @Override  // com.dcinside.app.realm.t, io.realm.t2
    public void I2(boolean z) {
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            u u0 = this.k.g();
            u0.b().m0(this.j.i, u0.F(), z, true);
            return;
        }
        this.k.f().k();
        this.k.g().p(this.j.i, z);
    }

    @Override  // com.dcinside.app.realm.t, io.realm.t2
    public void L4(String s) {
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            u u0 = this.k.g();
            if(s == null) {
                u0.b().v0(this.j.f, u0.F(), true);
                return;
            }
            u0.b().y0(this.j.f, u0.F(), s, true);
            return;
        }
        this.k.f().k();
        if(s == null) {
            this.k.g().K(this.j.f);
            return;
        }
        this.k.g().a(this.j.f, s);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.k;
    }

    public static t d6(F0 f00, b s2$b0, t t0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(t0);
        if(s0 != null) {
            return (t)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(t.class), set0);
        osObjectBuilder0.n4(s2$b0.e, t0.f());
        osObjectBuilder0.n4(s2$b0.f, t0.k2());
        osObjectBuilder0.n4(s2$b0.g, t0.p0());
        osObjectBuilder0.n4(s2$b0.h, t0.v4());
        osObjectBuilder0.a1(s2$b0.i, Boolean.valueOf(t0.H2()));
        t t1 = s2.q6(f00, osObjectBuilder0.v4());
        map0.put(t0, t1);
        return t1;
    }

    @Override  // com.dcinside.app.realm.t, io.realm.t2
    public void e(String s) {
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            u u0 = this.k.g();
            if(s == null) {
                u0.b().v0(this.j.e, u0.F(), true);
                return;
            }
            u0.b().y0(this.j.e, u0.F(), s, true);
            return;
        }
        this.k.f().k();
        if(s == null) {
            this.k.g().K(this.j.e);
            return;
        }
        this.k.g().a(this.j.e, s);
    }

    public static t e6(F0 f00, b s2$b0, t t0, boolean z, Map map0, Set set0) {
        if(t0 instanceof s && !d1.F5(t0) && ((s)t0).R3().f() != null) {
            io.realm.a a0 = ((s)t0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return t0;
            }
        }
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(t0);
        return s0 == null ? s2.d6(f00, s2$b0, t0, z, map0, set0) : ((t)s0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.k.f();
            io.realm.a a1 = ((s2)object0).k.f();
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
            String s2 = this.k.g().b().P();
            String s3 = ((s2)object0).k.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.k.g().F() == ((s2)object0).k.g().F() : false;
            }
            return s3 == null ? this.k.g().F() == ((s2)object0).k.g().F() : false;
        }
        return false;
    }

    @Override  // com.dcinside.app.realm.t, io.realm.t2
    public String f() {
        this.k.f().k();
        return this.k.g().U(this.j.e);
    }

    public static b f6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    @Override  // com.dcinside.app.realm.t, io.realm.t2
    public void g5(String s) {
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            u u0 = this.k.g();
            if(s == null) {
                u0.b().v0(this.j.g, u0.F(), true);
                return;
            }
            u0.b().y0(this.j.g, u0.F(), s, true);
            return;
        }
        this.k.f().k();
        if(s == null) {
            this.k.g().K(this.j.g);
            return;
        }
        this.k.g().a(this.j.g, s);
    }

    public static t g6(t t0, int v, int v1, Map map0) {
        t t1;
        if(v <= v1 && t0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(t0);
            if(s$a0 == null) {
                t1 = new t();
                map0.put(t0, new io.realm.internal.s.a(v, t1));
            }
            else {
                if(v >= s$a0.a) {
                    return (t)s$a0.b;
                }
                s$a0.a = v;
                t1 = (t)s$a0.b;
            }
            F0 f00 = (F0)((s)t0).R3().f();
            t1.e(t0.f());
            t1.L4(t0.k2());
            t1.g5(t0.p0());
            t1.w3(t0.v4());
            t1.I2(t0.H2());
            return t1;
        }
        return null;
    }

    private static OsObjectSchemaInfo h6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "GuestUserInfo", false, 5, 0);
        osObjectSchemaInfo$b0.d("", "name", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "pw", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "secondName", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "secondPw", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "enabled", RealmFieldType.BOOLEAN, false, false, true);
        return osObjectSchemaInfo$b0.g();
    }

    @Override
    public int hashCode() {
        String s = this.k.f().getPath();
        String s1 = this.k.g().b().P();
        long v = this.k.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    public static t i6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        List list0 = Collections.emptyList();
        t t0 = (t)f00.y3(t.class, true, list0);
        if(jSONObject0.has("name")) {
            if(jSONObject0.isNull("name")) {
                t0.e(null);
            }
            else {
                t0.e(jSONObject0.getString("name"));
            }
        }
        if(jSONObject0.has("pw")) {
            if(jSONObject0.isNull("pw")) {
                t0.L4(null);
            }
            else {
                t0.L4(jSONObject0.getString("pw"));
            }
        }
        if(jSONObject0.has("secondName")) {
            if(jSONObject0.isNull("secondName")) {
                t0.g5(null);
            }
            else {
                t0.g5(jSONObject0.getString("secondName"));
            }
        }
        if(jSONObject0.has("secondPw")) {
            if(jSONObject0.isNull("secondPw")) {
                t0.w3(null);
            }
            else {
                t0.w3(jSONObject0.getString("secondPw"));
            }
        }
        if(jSONObject0.has("enabled")) {
            if(jSONObject0.isNull("enabled")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'enabled\' to null.");
            }
            t0.I2(jSONObject0.getBoolean("enabled"));
            return t0;
        }
        return t0;
    }

    @TargetApi(11)
    public static t j6(F0 f00, JsonReader jsonReader0) throws IOException {
        t t0 = new t();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("name")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    t0.e(null);
                }
                else {
                    t0.e(jsonReader0.nextString());
                }
            }
            else if(s.equals("pw")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    t0.L4(null);
                }
                else {
                    t0.L4(jsonReader0.nextString());
                }
            }
            else if(s.equals("secondName")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    t0.g5(null);
                }
                else {
                    t0.g5(jsonReader0.nextString());
                }
            }
            else if(!s.equals("secondPw")) {
                if(s.equals("enabled")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        t0.I2(jsonReader0.nextBoolean());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'enabled\' to null.");
                }
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                t0.w3(null);
            }
            else {
                t0.w3(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        return (t)f00.o2(t0, new W[0]);
    }

    @Override  // com.dcinside.app.realm.t, io.realm.t2
    public String k2() {
        this.k.f().k();
        return this.k.g().U(this.j.f);
    }

    public static OsObjectSchemaInfo k6() {
        return s2.m;
    }

    public static String l6() {
        return "GuestUserInfo";
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.k != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.j = (b)a$h0.c();
        A0 a00 = new A0(this);
        this.k = a00;
        a00.r(a$h0.e());
        this.k.s(a$h0.f());
        this.k.o(a$h0.b());
        this.k.q(a$h0.d());
    }

    public static long m6(F0 f00, t t0, Map map0) {
        if(t0 instanceof s && !d1.F5(t0) && ((s)t0).R3().f() != null && ((s)t0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)t0).R3().g().F();
        }
        Table table0 = f00.n4(t.class);
        long v = table0.getNativePtr();
        b s2$b0 = (b)f00.e0().j(t.class);
        long v1 = OsObject.createRow(table0);
        map0.put(t0, v1);
        String s = t0.f();
        if(s != null) {
            Table.nativeSetString(v, s2$b0.e, v1, s, false);
        }
        String s1 = t0.k2();
        if(s1 != null) {
            Table.nativeSetString(v, s2$b0.f, v1, s1, false);
        }
        String s2 = t0.p0();
        if(s2 != null) {
            Table.nativeSetString(v, s2$b0.g, v1, s2, false);
        }
        String s3 = t0.v4();
        if(s3 != null) {
            Table.nativeSetString(v, s2$b0.h, v1, s3, false);
        }
        Table.nativeSetBoolean(v, s2$b0.i, v1, t0.H2(), false);
        return v1;
    }

    public static void n6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(t.class);
        long v = table0.getNativePtr();
        b s2$b0 = (b)f00.e0().j(t.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            t t0 = (t)object0;
            if(map0.containsKey(t0)) {
            }
            else if(t0 instanceof s && !d1.F5(t0) && ((s)t0).R3().f() != null && ((s)t0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(t0, ((s)t0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(t0, v1);
                String s = t0.f();
                if(s != null) {
                    Table.nativeSetString(v, s2$b0.e, v1, s, false);
                }
                String s1 = t0.k2();
                if(s1 != null) {
                    Table.nativeSetString(v, s2$b0.f, v1, s1, false);
                }
                String s2 = t0.p0();
                if(s2 != null) {
                    Table.nativeSetString(v, s2$b0.g, v1, s2, false);
                }
                String s3 = t0.v4();
                if(s3 != null) {
                    Table.nativeSetString(v, s2$b0.h, v1, s3, false);
                }
                Table.nativeSetBoolean(v, s2$b0.i, v1, t0.H2(), false);
            }
        }
    }

    public static long o6(F0 f00, t t0, Map map0) {
        if(t0 instanceof s && !d1.F5(t0) && ((s)t0).R3().f() != null && ((s)t0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)t0).R3().g().F();
        }
        Table table0 = f00.n4(t.class);
        long v = table0.getNativePtr();
        b s2$b0 = (b)f00.e0().j(t.class);
        long v1 = OsObject.createRow(table0);
        map0.put(t0, v1);
        String s = t0.f();
        if(s == null) {
            Table.nativeSetNull(v, s2$b0.e, v1, false);
        }
        else {
            Table.nativeSetString(v, s2$b0.e, v1, s, false);
        }
        String s1 = t0.k2();
        if(s1 == null) {
            Table.nativeSetNull(v, s2$b0.f, v1, false);
        }
        else {
            Table.nativeSetString(v, s2$b0.f, v1, s1, false);
        }
        String s2 = t0.p0();
        if(s2 == null) {
            Table.nativeSetNull(v, s2$b0.g, v1, false);
        }
        else {
            Table.nativeSetString(v, s2$b0.g, v1, s2, false);
        }
        String s3 = t0.v4();
        if(s3 == null) {
            Table.nativeSetNull(v, s2$b0.h, v1, false);
        }
        else {
            Table.nativeSetString(v, s2$b0.h, v1, s3, false);
        }
        Table.nativeSetBoolean(v, s2$b0.i, v1, t0.H2(), false);
        return v1;
    }

    @Override  // com.dcinside.app.realm.t, io.realm.t2
    public String p0() {
        this.k.f().k();
        return this.k.g().U(this.j.g);
    }

    public static void p6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(t.class);
        long v = table0.getNativePtr();
        b s2$b0 = (b)f00.e0().j(t.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            t t0 = (t)object0;
            if(map0.containsKey(t0)) {
            }
            else if(t0 instanceof s && !d1.F5(t0) && ((s)t0).R3().f() != null && ((s)t0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(t0, ((s)t0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(t0, v1);
                String s = t0.f();
                if(s == null) {
                    Table.nativeSetNull(v, s2$b0.e, v1, false);
                }
                else {
                    Table.nativeSetString(v, s2$b0.e, v1, s, false);
                }
                String s1 = t0.k2();
                if(s1 == null) {
                    Table.nativeSetNull(v, s2$b0.f, v1, false);
                }
                else {
                    Table.nativeSetString(v, s2$b0.f, v1, s1, false);
                }
                String s2 = t0.p0();
                if(s2 == null) {
                    Table.nativeSetNull(v, s2$b0.g, v1, false);
                }
                else {
                    Table.nativeSetString(v, s2$b0.g, v1, s2, false);
                }
                String s3 = t0.v4();
                if(s3 == null) {
                    Table.nativeSetNull(v, s2$b0.h, v1, false);
                }
                else {
                    Table.nativeSetString(v, s2$b0.h, v1, s3, false);
                }
                Table.nativeSetBoolean(v, s2$b0.i, v1, t0.H2(), false);
            }
        }
    }

    static s2 q6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(t.class), false, Collections.emptyList());
        s2 s20 = new s2();
        a$h0.a();
        return s20;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("GuestUserInfo = proxy[");
        stringBuilder0.append("{name:");
        String s = "null";
        stringBuilder0.append((this.f() == null ? "null" : this.f()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{pw:");
        stringBuilder0.append((this.k2() == null ? "null" : this.k2()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{secondName:");
        stringBuilder0.append((this.p0() == null ? "null" : this.p0()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{secondPw:");
        if(this.v4() != null) {
            s = this.v4();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{enabled:");
        stringBuilder0.append(this.H2());
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // com.dcinside.app.realm.t, io.realm.t2
    public String v4() {
        this.k.f().k();
        return this.k.g().U(this.j.h);
    }

    @Override  // com.dcinside.app.realm.t, io.realm.t2
    public void w3(String s) {
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            u u0 = this.k.g();
            if(s == null) {
                u0.b().v0(this.j.h, u0.F(), true);
                return;
            }
            u0.b().y0(this.j.h, u0.F(), s, true);
            return;
        }
        this.k.f().k();
        if(s == null) {
            this.k.g().K(this.j.h);
            return;
        }
        this.k.g().a(this.j.h, s);
    }
}

