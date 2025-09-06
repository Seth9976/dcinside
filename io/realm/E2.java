package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.l;
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

public class e2 extends l implements f2, s {
    public static final class a {
        public static final String a = "DefaultImage";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;

        b(OsSchemaInfo osSchemaInfo0) {
            super(6);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("DefaultImage");
            this.e = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.f = this.b("galleryName", "galleryName", osObjectSchemaInfo0);
            this.g = this.b("path", "path", osObjectSchemaInfo0);
            this.h = this.b("pick", "pick", osObjectSchemaInfo0);
            this.i = this.b("random", "random", osObjectSchemaInfo0);
            this.j = this.b("promptData", "promptData", osObjectSchemaInfo0);
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
            ((b)c1).j = ((b)c0).j;
        }
    }

    private b k;
    private A0 l;
    private static final String m = "";
    private static final OsObjectSchemaInfo n;

    static {
        e2.n = e2.h6();
    }

    e2() {
        this.l.p();
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public void A3(boolean z) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            u0.b().m0(this.k.i, u0.F(), z, true);
            return;
        }
        this.l.f().k();
        this.l.g().p(this.k.i, z);
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public String P4() {
        this.l.f().k();
        return this.l.g().U(this.k.g);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.l;
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public void Y1(String s) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            if(s == null) {
                u0.b().v0(this.k.g, u0.F(), true);
                return;
            }
            u0.b().y0(this.k.g, u0.F(), s, true);
            return;
        }
        this.l.f().k();
        if(s == null) {
            this.l.g().K(this.k.g);
            return;
        }
        this.l.g().a(this.k.g, s);
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public void Z2(String s) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            if(s == null) {
                u0.b().v0(this.k.j, u0.F(), true);
                return;
            }
            u0.b().y0(this.k.j, u0.F(), s, true);
            return;
        }
        this.l.f().k();
        if(s == null) {
            this.l.g().K(this.k.j);
            return;
        }
        this.l.g().a(this.k.j, s);
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public String a() {
        this.l.f().k();
        return this.l.g().U(this.k.e);
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public void b(String s) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            if(s == null) {
                u0.b().v0(this.k.e, u0.F(), true);
                return;
            }
            u0.b().y0(this.k.e, u0.F(), s, true);
            return;
        }
        this.l.f().k();
        if(s == null) {
            this.l.g().K(this.k.e);
            return;
        }
        this.l.g().a(this.k.e, s);
    }

    public static l d6(F0 f00, b e2$b0, l l0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(l0);
        if(s0 != null) {
            return (l)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(l.class), set0);
        osObjectBuilder0.n4(e2$b0.e, l0.a());
        osObjectBuilder0.n4(e2$b0.f, l0.j());
        osObjectBuilder0.n4(e2$b0.g, l0.P4());
        osObjectBuilder0.a1(e2$b0.h, Boolean.valueOf(l0.p4()));
        osObjectBuilder0.a1(e2$b0.i, Boolean.valueOf(l0.j4()));
        osObjectBuilder0.n4(e2$b0.j, l0.l0());
        l l1 = e2.q6(f00, osObjectBuilder0.v4());
        map0.put(l0, l1);
        return l1;
    }

    public static l e6(F0 f00, b e2$b0, l l0, boolean z, Map map0, Set set0) {
        if(l0 instanceof s && !d1.F5(l0) && ((s)l0).R3().f() != null) {
            io.realm.a a0 = ((s)l0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return l0;
            }
        }
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(l0);
        return s0 == null ? e2.d6(f00, e2$b0, l0, z, map0, set0) : ((l)s0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.l.f();
            io.realm.a a1 = ((e2)object0).l.f();
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
            String s2 = this.l.g().b().P();
            String s3 = ((e2)object0).l.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.l.g().F() == ((e2)object0).l.g().F() : false;
            }
            return s3 == null ? this.l.g().F() == ((e2)object0).l.g().F() : false;
        }
        return false;
    }

    public static b f6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static l g6(l l0, int v, int v1, Map map0) {
        l l1;
        if(v <= v1 && l0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(l0);
            if(s$a0 == null) {
                l1 = new l();
                map0.put(l0, new io.realm.internal.s.a(v, l1));
            }
            else {
                if(v >= s$a0.a) {
                    return (l)s$a0.b;
                }
                s$a0.a = v;
                l1 = (l)s$a0.b;
            }
            F0 f00 = (F0)((s)l0).R3().f();
            l1.b(l0.a());
            l1.h(l0.j());
            l1.Y1(l0.P4());
            l1.h3(l0.p4());
            l1.A3(l0.j4());
            l1.Z2(l0.l0());
            return l1;
        }
        return null;
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public void h(String s) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            if(s == null) {
                u0.b().v0(this.k.f, u0.F(), true);
                return;
            }
            u0.b().y0(this.k.f, u0.F(), s, true);
            return;
        }
        this.l.f().k();
        if(s == null) {
            this.l.g().K(this.k.f);
            return;
        }
        this.l.g().a(this.k.f, s);
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public void h3(boolean z) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            u0.b().m0(this.k.h, u0.F(), z, true);
            return;
        }
        this.l.f().k();
        this.l.g().p(this.k.h, z);
    }

    private static OsObjectSchemaInfo h6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "DefaultImage", false, 6, 0);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "galleryName", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "path", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "pick", RealmFieldType.BOOLEAN, false, false, true);
        osObjectSchemaInfo$b0.d("", "random", RealmFieldType.BOOLEAN, false, false, true);
        osObjectSchemaInfo$b0.d("", "promptData", RealmFieldType.STRING, false, false, false);
        return osObjectSchemaInfo$b0.g();
    }

    @Override
    public int hashCode() {
        String s = this.l.f().getPath();
        String s1 = this.l.g().b().P();
        long v = this.l.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    public static l i6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        List list0 = Collections.emptyList();
        l l0 = (l)f00.y3(l.class, true, list0);
        if(jSONObject0.has("galleryId")) {
            if(jSONObject0.isNull("galleryId")) {
                l0.b(null);
            }
            else {
                l0.b(jSONObject0.getString("galleryId"));
            }
        }
        if(jSONObject0.has("galleryName")) {
            if(jSONObject0.isNull("galleryName")) {
                l0.h(null);
            }
            else {
                l0.h(jSONObject0.getString("galleryName"));
            }
        }
        if(jSONObject0.has("path")) {
            if(jSONObject0.isNull("path")) {
                l0.Y1(null);
            }
            else {
                l0.Y1(jSONObject0.getString("path"));
            }
        }
        if(jSONObject0.has("pick")) {
            if(jSONObject0.isNull("pick")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'pick\' to null.");
            }
            l0.h3(jSONObject0.getBoolean("pick"));
        }
        if(jSONObject0.has("random")) {
            if(jSONObject0.isNull("random")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'random\' to null.");
            }
            l0.A3(jSONObject0.getBoolean("random"));
        }
        if(jSONObject0.has("promptData")) {
            if(jSONObject0.isNull("promptData")) {
                l0.Z2(null);
                return l0;
            }
            l0.Z2(jSONObject0.getString("promptData"));
        }
        return l0;
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public String j() {
        this.l.f().k();
        return this.l.g().U(this.k.f);
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public boolean j4() {
        this.l.f().k();
        return this.l.g().Q(this.k.i);
    }

    @TargetApi(11)
    public static l j6(F0 f00, JsonReader jsonReader0) throws IOException {
        l l0 = new l();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("galleryId")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    l0.b(null);
                }
                else {
                    l0.b(jsonReader0.nextString());
                }
            }
            else if(s.equals("galleryName")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    l0.h(null);
                }
                else {
                    l0.h(jsonReader0.nextString());
                }
            }
            else if(!s.equals("path")) {
                if(s.equals("pick")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        l0.h3(jsonReader0.nextBoolean());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'pick\' to null.");
                }
                if(s.equals("random")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        l0.A3(jsonReader0.nextBoolean());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'random\' to null.");
                }
                if(!s.equals("promptData")) {
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    l0.Z2(null);
                }
                else {
                    l0.Z2(jsonReader0.nextString());
                }
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                l0.Y1(null);
            }
            else {
                l0.Y1(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        return (l)f00.o2(l0, new W[0]);
    }

    public static OsObjectSchemaInfo k6() {
        return e2.n;
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public String l0() {
        this.l.f().k();
        return this.l.g().U(this.k.j);
    }

    public static String l6() {
        return "DefaultImage";
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.l != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.k = (b)a$h0.c();
        A0 a00 = new A0(this);
        this.l = a00;
        a00.r(a$h0.e());
        this.l.s(a$h0.f());
        this.l.o(a$h0.b());
        this.l.q(a$h0.d());
    }

    public static long m6(F0 f00, l l0, Map map0) {
        if(l0 instanceof s && !d1.F5(l0) && ((s)l0).R3().f() != null && ((s)l0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)l0).R3().g().F();
        }
        Table table0 = f00.n4(l.class);
        long v = table0.getNativePtr();
        b e2$b0 = (b)f00.e0().j(l.class);
        long v1 = OsObject.createRow(table0);
        map0.put(l0, v1);
        String s = l0.a();
        if(s != null) {
            Table.nativeSetString(v, e2$b0.e, v1, s, false);
        }
        String s1 = l0.j();
        if(s1 != null) {
            Table.nativeSetString(v, e2$b0.f, v1, s1, false);
        }
        String s2 = l0.P4();
        if(s2 != null) {
            Table.nativeSetString(v, e2$b0.g, v1, s2, false);
        }
        Table.nativeSetBoolean(v, e2$b0.h, v1, l0.p4(), false);
        Table.nativeSetBoolean(v, e2$b0.i, v1, l0.j4(), false);
        String s3 = l0.l0();
        if(s3 != null) {
            Table.nativeSetString(v, e2$b0.j, v1, s3, false);
        }
        return v1;
    }

    public static void n6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(l.class);
        long v = table0.getNativePtr();
        b e2$b0 = (b)f00.e0().j(l.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            l l0 = (l)object0;
            if(map0.containsKey(l0)) {
            }
            else if(l0 instanceof s && !d1.F5(l0) && ((s)l0).R3().f() != null && ((s)l0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(l0, ((s)l0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(l0, v1);
                String s = l0.a();
                if(s != null) {
                    Table.nativeSetString(v, e2$b0.e, v1, s, false);
                }
                String s1 = l0.j();
                if(s1 != null) {
                    Table.nativeSetString(v, e2$b0.f, v1, s1, false);
                }
                String s2 = l0.P4();
                if(s2 != null) {
                    Table.nativeSetString(v, e2$b0.g, v1, s2, false);
                }
                Table.nativeSetBoolean(v, e2$b0.h, v1, l0.p4(), false);
                Table.nativeSetBoolean(v, e2$b0.i, v1, l0.j4(), false);
                String s3 = l0.l0();
                if(s3 != null) {
                    Table.nativeSetString(v, e2$b0.j, v1, s3, false);
                }
            }
        }
    }

    public static long o6(F0 f00, l l0, Map map0) {
        if(l0 instanceof s && !d1.F5(l0) && ((s)l0).R3().f() != null && ((s)l0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)l0).R3().g().F();
        }
        Table table0 = f00.n4(l.class);
        long v = table0.getNativePtr();
        b e2$b0 = (b)f00.e0().j(l.class);
        long v1 = OsObject.createRow(table0);
        map0.put(l0, v1);
        String s = l0.a();
        if(s == null) {
            Table.nativeSetNull(v, e2$b0.e, v1, false);
        }
        else {
            Table.nativeSetString(v, e2$b0.e, v1, s, false);
        }
        String s1 = l0.j();
        if(s1 == null) {
            Table.nativeSetNull(v, e2$b0.f, v1, false);
        }
        else {
            Table.nativeSetString(v, e2$b0.f, v1, s1, false);
        }
        String s2 = l0.P4();
        if(s2 == null) {
            Table.nativeSetNull(v, e2$b0.g, v1, false);
        }
        else {
            Table.nativeSetString(v, e2$b0.g, v1, s2, false);
        }
        Table.nativeSetBoolean(v, e2$b0.h, v1, l0.p4(), false);
        Table.nativeSetBoolean(v, e2$b0.i, v1, l0.j4(), false);
        String s3 = l0.l0();
        if(s3 != null) {
            Table.nativeSetString(v, e2$b0.j, v1, s3, false);
            return v1;
        }
        Table.nativeSetNull(v, e2$b0.j, v1, false);
        return v1;
    }

    @Override  // com.dcinside.app.realm.l, io.realm.f2
    public boolean p4() {
        this.l.f().k();
        return this.l.g().Q(this.k.h);
    }

    public static void p6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(l.class);
        long v = table0.getNativePtr();
        b e2$b0 = (b)f00.e0().j(l.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            l l0 = (l)object0;
            if(map0.containsKey(l0)) {
            }
            else if(l0 instanceof s && !d1.F5(l0) && ((s)l0).R3().f() != null && ((s)l0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(l0, ((s)l0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(l0, v1);
                String s = l0.a();
                if(s == null) {
                    Table.nativeSetNull(v, e2$b0.e, v1, false);
                }
                else {
                    Table.nativeSetString(v, e2$b0.e, v1, s, false);
                }
                String s1 = l0.j();
                if(s1 == null) {
                    Table.nativeSetNull(v, e2$b0.f, v1, false);
                }
                else {
                    Table.nativeSetString(v, e2$b0.f, v1, s1, false);
                }
                String s2 = l0.P4();
                if(s2 == null) {
                    Table.nativeSetNull(v, e2$b0.g, v1, false);
                }
                else {
                    Table.nativeSetString(v, e2$b0.g, v1, s2, false);
                }
                Table.nativeSetBoolean(v, e2$b0.h, v1, l0.p4(), false);
                Table.nativeSetBoolean(v, e2$b0.i, v1, l0.j4(), false);
                String s3 = l0.l0();
                if(s3 == null) {
                    Table.nativeSetNull(v, e2$b0.j, v1, false);
                }
                else {
                    Table.nativeSetString(v, e2$b0.j, v1, s3, false);
                }
            }
        }
    }

    static e2 q6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(l.class), false, Collections.emptyList());
        e2 e20 = new e2();
        a$h0.a();
        return e20;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("DefaultImage = proxy[");
        stringBuilder0.append("{galleryId:");
        String s = "null";
        stringBuilder0.append((this.a() == null ? "null" : this.a()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryName:");
        stringBuilder0.append((this.j() == null ? "null" : this.j()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{path:");
        stringBuilder0.append((this.P4() == null ? "null" : this.P4()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{pick:");
        stringBuilder0.append(this.p4());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{random:");
        stringBuilder0.append(this.j4());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{promptData:");
        if(this.l0() != null) {
            s = this.l0();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

