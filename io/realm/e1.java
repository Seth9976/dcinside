package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.dccon.setting.tag.b;
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

public class E1 extends b implements F1, s {
    public static final class a {
        public static final String a = "DcconTagItem";

    }

    static final class io.realm.E1.b extends c {
        long e;
        long f;
        long g;
        long h;

        io.realm.E1.b(OsSchemaInfo osSchemaInfo0) {
            super(4);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("DcconTagItem");
            this.e = this.b("packageIdx", "packageIdx", osObjectSchemaInfo0);
            this.f = this.b("detailIdx", "detailIdx", osObjectSchemaInfo0);
            this.g = this.b("customTag", "customTag", osObjectSchemaInfo0);
            this.h = this.b("date", "date", osObjectSchemaInfo0);
        }

        io.realm.E1.b(c c0, boolean z) {
            super(c0, z);
            this.d(c0, this);
        }

        @Override  // io.realm.internal.c
        protected final c c(boolean z) {
            return new io.realm.E1.b(this, z);
        }

        @Override  // io.realm.internal.c
        protected final void d(c c0, c c1) {
            ((io.realm.E1.b)c1).e = ((io.realm.E1.b)c0).e;
            ((io.realm.E1.b)c1).f = ((io.realm.E1.b)c0).f;
            ((io.realm.E1.b)c1).g = ((io.realm.E1.b)c0).g;
            ((io.realm.E1.b)c1).h = ((io.realm.E1.b)c0).h;
        }
    }

    private io.realm.E1.b i;
    private A0 j;
    private static final String k = "";
    private static final OsObjectSchemaInfo l;

    static {
        E1.l = E1.c6();
    }

    E1() {
        this.j.p();
    }

    @Override  // com.dcinside.app.dccon.setting.tag.b, io.realm.F1
    public int A() {
        this.j.f().k();
        return (int)this.j.g().w(this.i.f);
    }

    @Override  // com.dcinside.app.dccon.setting.tag.b, io.realm.F1
    public int B() {
        this.j.f().k();
        return (int)this.j.g().w(this.i.e);
    }

    @Override  // com.dcinside.app.dccon.setting.tag.b, io.realm.F1
    public void H1(String s) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            if(s == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'customTag\' to null.");
            }
            u0.b().y0(this.i.g, u0.F(), s, true);
            return;
        }
        this.j.f().k();
        if(s == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field \'customTag\' to null.");
        }
        this.j.g().a(this.i.g, s);
    }

    @Override  // com.dcinside.app.dccon.setting.tag.b, io.realm.F1
    public void O(Date date0) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            if(date0 == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'date\' to null.");
            }
            u0.b().n0(this.i.h, u0.F(), date0, true);
            return;
        }
        this.j.f().k();
        if(date0 == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field \'date\' to null.");
        }
        this.j.g().N(this.i.h, date0);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.j;
    }

    public static b Y5(F0 f00, io.realm.E1.b e1$b0, b b0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(b0);
        if(s0 != null) {
            return (b)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(b.class), set0);
        osObjectBuilder0.i3(e1$b0.e, b0.B());
        osObjectBuilder0.i3(e1$b0.f, b0.A());
        osObjectBuilder0.n4(e1$b0.g, b0.k5());
        osObjectBuilder0.u1(e1$b0.h, b0.p());
        b b1 = E1.l6(f00, osObjectBuilder0.v4());
        map0.put(b0, b1);
        return b1;
    }

    public static b Z5(F0 f00, io.realm.E1.b e1$b0, b b0, boolean z, Map map0, Set set0) {
        if(b0 instanceof s && !d1.F5(b0) && ((s)b0).R3().f() != null) {
            io.realm.a a0 = ((s)b0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return b0;
            }
        }
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(b0);
        return s0 == null ? E1.Y5(f00, e1$b0, b0, z, map0, set0) : ((b)s0);
    }

    public static io.realm.E1.b a6(OsSchemaInfo osSchemaInfo0) {
        return new io.realm.E1.b(osSchemaInfo0);
    }

    public static b b6(b b0, int v, int v1, Map map0) {
        b b1;
        if(v <= v1 && b0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(b0);
            if(s$a0 == null) {
                b1 = new b();
                map0.put(b0, new io.realm.internal.s.a(v, b1));
            }
            else {
                if(v >= s$a0.a) {
                    return (b)s$a0.b;
                }
                s$a0.a = v;
                b1 = (b)s$a0.b;
            }
            F0 f00 = (F0)((s)b0).R3().f();
            b1.t(b0.B());
            b1.x(b0.A());
            b1.H1(b0.k5());
            b1.O(b0.p());
            return b1;
        }
        return null;
    }

    private static OsObjectSchemaInfo c6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "DcconTagItem", false, 4, 0);
        osObjectSchemaInfo$b0.d("", "packageIdx", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "detailIdx", RealmFieldType.INTEGER, false, true, true);
        osObjectSchemaInfo$b0.d("", "customTag", RealmFieldType.STRING, false, true, true);
        osObjectSchemaInfo$b0.d("", "date", RealmFieldType.DATE, false, true, true);
        return osObjectSchemaInfo$b0.g();
    }

    public static b d6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        List list0 = Collections.emptyList();
        b b0 = (b)f00.y3(b.class, true, list0);
        if(jSONObject0.has("packageIdx")) {
            if(jSONObject0.isNull("packageIdx")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'packageIdx\' to null.");
            }
            b0.t(jSONObject0.getInt("packageIdx"));
        }
        if(jSONObject0.has("detailIdx")) {
            if(jSONObject0.isNull("detailIdx")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'detailIdx\' to null.");
            }
            b0.x(jSONObject0.getInt("detailIdx"));
        }
        if(jSONObject0.has("customTag")) {
            if(jSONObject0.isNull("customTag")) {
                b0.H1(null);
            }
            else {
                b0.H1(jSONObject0.getString("customTag"));
            }
        }
        if(jSONObject0.has("date")) {
            if(jSONObject0.isNull("date")) {
                b0.O(null);
                return b0;
            }
            Object object0 = jSONObject0.get("date");
            if(object0 instanceof String) {
                b0.O(io.realm.internal.android.c.b(((String)object0)));
                return b0;
            }
            b0.O(new Date(jSONObject0.getLong("date")));
        }
        return b0;
    }

    @TargetApi(11)
    public static b e6(F0 f00, JsonReader jsonReader0) throws IOException {
        b b0 = new b();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("packageIdx")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    b0.t(jsonReader0.nextInt());
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'packageIdx\' to null.");
            }
            if(s.equals("detailIdx")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    b0.x(jsonReader0.nextInt());
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'detailIdx\' to null.");
            }
            if(s.equals("customTag")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    b0.H1(null);
                }
                else {
                    b0.H1(jsonReader0.nextString());
                }
            }
            else if(!s.equals("date")) {
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                b0.O(null);
            }
            else if(jsonReader0.peek() == JsonToken.NUMBER) {
                long v = jsonReader0.nextLong();
                if(v <= -1L) {
                    continue;
                }
                b0.O(new Date(v));
            }
            else {
                b0.O(io.realm.internal.android.c.b(jsonReader0.nextString()));
            }
        }
        jsonReader0.endObject();
        return (b)f00.o2(b0, new W[0]);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.j.f();
            io.realm.a a1 = ((E1)object0).j.f();
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
            String s2 = this.j.g().b().P();
            String s3 = ((E1)object0).j.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.j.g().F() == ((E1)object0).j.g().F() : false;
            }
            return s3 == null ? this.j.g().F() == ((E1)object0).j.g().F() : false;
        }
        return false;
    }

    public static OsObjectSchemaInfo f6() {
        return E1.l;
    }

    public static String g6() {
        return "DcconTagItem";
    }

    public static long h6(F0 f00, b b0, Map map0) {
        if(b0 instanceof s && !d1.F5(b0) && ((s)b0).R3().f() != null && ((s)b0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)b0).R3().g().F();
        }
        Table table0 = f00.n4(b.class);
        long v = table0.getNativePtr();
        io.realm.E1.b e1$b0 = (io.realm.E1.b)f00.e0().j(b.class);
        long v1 = OsObject.createRow(table0);
        map0.put(b0, v1);
        Table.nativeSetLong(v, e1$b0.e, v1, b0.B(), false);
        Table.nativeSetLong(v, e1$b0.f, v1, b0.A(), false);
        String s = b0.k5();
        if(s != null) {
            Table.nativeSetString(v, e1$b0.g, v1, s, false);
        }
        Date date0 = b0.p();
        if(date0 != null) {
            Table.nativeSetTimestamp(v, e1$b0.h, v1, date0.getTime(), false);
        }
        return v1;
    }

    @Override
    public int hashCode() {
        String s = this.j.f().getPath();
        String s1 = this.j.g().b().P();
        long v = this.j.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    public static void i6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(b.class);
        long v = table0.getNativePtr();
        io.realm.E1.b e1$b0 = (io.realm.E1.b)f00.e0().j(b.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            b b0 = (b)object0;
            if(map0.containsKey(b0)) {
            }
            else if(b0 instanceof s && !d1.F5(b0) && ((s)b0).R3().f() != null && ((s)b0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(b0, ((s)b0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(b0, v1);
                Table.nativeSetLong(v, e1$b0.e, v1, b0.B(), false);
                Table.nativeSetLong(v, e1$b0.f, v1, b0.A(), false);
                String s = b0.k5();
                if(s != null) {
                    Table.nativeSetString(v, e1$b0.g, v1, s, false);
                }
                Date date0 = b0.p();
                if(date0 != null) {
                    Table.nativeSetTimestamp(v, e1$b0.h, v1, date0.getTime(), false);
                }
            }
        }
    }

    public static long j6(F0 f00, b b0, Map map0) {
        if(b0 instanceof s && !d1.F5(b0) && ((s)b0).R3().f() != null && ((s)b0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)b0).R3().g().F();
        }
        Table table0 = f00.n4(b.class);
        long v = table0.getNativePtr();
        io.realm.E1.b e1$b0 = (io.realm.E1.b)f00.e0().j(b.class);
        long v1 = OsObject.createRow(table0);
        map0.put(b0, v1);
        Table.nativeSetLong(v, e1$b0.e, v1, b0.B(), false);
        Table.nativeSetLong(v, e1$b0.f, v1, b0.A(), false);
        String s = b0.k5();
        if(s == null) {
            Table.nativeSetNull(v, e1$b0.g, v1, false);
        }
        else {
            Table.nativeSetString(v, e1$b0.g, v1, s, false);
        }
        Date date0 = b0.p();
        if(date0 != null) {
            Table.nativeSetTimestamp(v, e1$b0.h, v1, date0.getTime(), false);
            return v1;
        }
        Table.nativeSetNull(v, e1$b0.h, v1, false);
        return v1;
    }

    @Override  // com.dcinside.app.dccon.setting.tag.b, io.realm.F1
    public String k5() {
        this.j.f().k();
        return this.j.g().U(this.i.g);
    }

    public static void k6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(b.class);
        long v = table0.getNativePtr();
        io.realm.E1.b e1$b0 = (io.realm.E1.b)f00.e0().j(b.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            b b0 = (b)object0;
            if(map0.containsKey(b0)) {
            }
            else if(b0 instanceof s && !d1.F5(b0) && ((s)b0).R3().f() != null && ((s)b0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(b0, ((s)b0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(b0, v1);
                Table.nativeSetLong(v, e1$b0.e, v1, b0.B(), false);
                Table.nativeSetLong(v, e1$b0.f, v1, b0.A(), false);
                String s = b0.k5();
                if(s == null) {
                    Table.nativeSetNull(v, e1$b0.g, v1, false);
                }
                else {
                    Table.nativeSetString(v, e1$b0.g, v1, s, false);
                }
                Date date0 = b0.p();
                if(date0 == null) {
                    Table.nativeSetNull(v, e1$b0.h, v1, false);
                }
                else {
                    Table.nativeSetTimestamp(v, e1$b0.h, v1, date0.getTime(), false);
                }
            }
        }
    }

    static E1 l6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(b.class), false, Collections.emptyList());
        E1 e10 = new E1();
        a$h0.a();
        return e10;
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.j != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.i = (io.realm.E1.b)a$h0.c();
        A0 a00 = new A0(this);
        this.j = a00;
        a00.r(a$h0.e());
        this.j.s(a$h0.f());
        this.j.o(a$h0.b());
        this.j.q(a$h0.d());
    }

    @Override  // com.dcinside.app.dccon.setting.tag.b, io.realm.F1
    public Date p() {
        this.j.f().k();
        return this.j.g().R(this.i.h);
    }

    @Override  // com.dcinside.app.dccon.setting.tag.b, io.realm.F1
    public void t(int v) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            u0.b().u0(this.i.e, u0.F(), ((long)v), true);
            return;
        }
        this.j.f().k();
        this.j.g().e(this.i.e, ((long)v));
    }

    // 去混淆评级： 低(30)
    @Override
    public String toString() {
        return d1.I5(this) ? "DcconTagItem = proxy[{packageIdx:" + this.B() + "}" + "," + "{detailIdx:" + this.A() + "}" + "," + "{customTag:" + this.k5() + "}" + "," + "{date:" + this.p() + "}" + "]" : "Invalid object";
    }

    @Override  // com.dcinside.app.dccon.setting.tag.b, io.realm.F1
    public void x(int v) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            u0.b().u0(this.i.f, u0.F(), ((long)v), true);
            return;
        }
        this.j.f().k();
        this.j.g().e(this.i.f, ((long)v));
    }
}

