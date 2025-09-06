package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.m;
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

public class g2 extends m implements h2, s {
    public static final class a {
        public static final String a = "FavoriteGallery";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;

        b(OsSchemaInfo osSchemaInfo0) {
            super(4);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("FavoriteGallery");
            this.e = this.b("id", "id", osObjectSchemaInfo0);
            this.f = this.b("name", "name", osObjectSchemaInfo0);
            this.g = this.b("galleryType", "galleryType", osObjectSchemaInfo0);
            this.h = this.b("order", "order", osObjectSchemaInfo0);
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
        }
    }

    private b h;
    private A0 i;
    private static final String j = "";
    private static final OsObjectSchemaInfo k;

    static {
        g2.k = g2.c6();
    }

    g2() {
        this.i.p();
    }

    @Override  // com.dcinside.app.realm.m, io.realm.h2
    public int H() {
        this.i.f().k();
        return (int)this.i.g().w(this.h.g);
    }

    @Override  // com.dcinside.app.realm.m, io.realm.h2
    public void N(int v) {
        if(this.i.i()) {
            if(!this.i.d()) {
                return;
            }
            u u0 = this.i.g();
            u0.b().u0(this.h.g, u0.F(), ((long)v), true);
            return;
        }
        this.i.f().k();
        this.i.g().e(this.h.g, ((long)v));
    }

    @Override  // com.dcinside.app.realm.m, io.realm.h2
    public int N0() {
        this.i.f().k();
        return (int)this.i.g().w(this.h.h);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.i;
    }

    public static m Y5(F0 f00, b g2$b0, m m0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(m0);
        if(s0 != null) {
            return (m)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(m.class), set0);
        osObjectBuilder0.n4(g2$b0.e, m0.m());
        osObjectBuilder0.n4(g2$b0.f, m0.f());
        osObjectBuilder0.i3(g2$b0.g, m0.H());
        osObjectBuilder0.i3(g2$b0.h, m0.N0());
        m m1 = g2.l6(f00, osObjectBuilder0.v4());
        map0.put(m0, m1);
        return m1;
    }

    public static m Z5(F0 f00, b g2$b0, m m0, boolean z, Map map0, Set set0) {
        if(m0 instanceof s && !d1.F5(m0) && ((s)m0).R3().f() != null) {
            io.realm.a a0 = ((s)m0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return m0;
            }
        }
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(m0);
        return s0 == null ? g2.Y5(f00, g2$b0, m0, z, map0, set0) : ((m)s0);
    }

    public static b a6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static m b6(m m0, int v, int v1, Map map0) {
        m m1;
        if(v <= v1 && m0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(m0);
            if(s$a0 == null) {
                m1 = new m();
                map0.put(m0, new io.realm.internal.s.a(v, m1));
            }
            else {
                if(v >= s$a0.a) {
                    return (m)s$a0.b;
                }
                s$a0.a = v;
                m1 = (m)s$a0.b;
            }
            F0 f00 = (F0)((s)m0).R3().f();
            m1.q(m0.m());
            m1.e(m0.f());
            m1.N(m0.H());
            m1.j0(m0.N0());
            return m1;
        }
        return null;
    }

    private static OsObjectSchemaInfo c6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "FavoriteGallery", false, 4, 0);
        osObjectSchemaInfo$b0.d("", "id", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "name", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "galleryType", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "order", RealmFieldType.INTEGER, false, false, true);
        return osObjectSchemaInfo$b0.g();
    }

    public static m d6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        List list0 = Collections.emptyList();
        m m0 = (m)f00.y3(m.class, true, list0);
        if(jSONObject0.has("id")) {
            if(jSONObject0.isNull("id")) {
                m0.q(null);
            }
            else {
                m0.q(jSONObject0.getString("id"));
            }
        }
        if(jSONObject0.has("name")) {
            if(jSONObject0.isNull("name")) {
                m0.e(null);
            }
            else {
                m0.e(jSONObject0.getString("name"));
            }
        }
        if(jSONObject0.has("galleryType")) {
            if(jSONObject0.isNull("galleryType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'galleryType\' to null.");
            }
            m0.N(jSONObject0.getInt("galleryType"));
        }
        if(jSONObject0.has("order")) {
            if(jSONObject0.isNull("order")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'order\' to null.");
            }
            m0.j0(jSONObject0.getInt("order"));
            return m0;
        }
        return m0;
    }

    @Override  // com.dcinside.app.realm.m, io.realm.h2
    public void e(String s) {
        if(this.i.i()) {
            if(!this.i.d()) {
                return;
            }
            u u0 = this.i.g();
            if(s == null) {
                u0.b().v0(this.h.f, u0.F(), true);
                return;
            }
            u0.b().y0(this.h.f, u0.F(), s, true);
            return;
        }
        this.i.f().k();
        if(s == null) {
            this.i.g().K(this.h.f);
            return;
        }
        this.i.g().a(this.h.f, s);
    }

    @TargetApi(11)
    public static m e6(F0 f00, JsonReader jsonReader0) throws IOException {
        m m0 = new m();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("id")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    m0.q(null);
                }
                else {
                    m0.q(jsonReader0.nextString());
                }
            }
            else if(!s.equals("name")) {
                if(s.equals("galleryType")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        m0.N(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'galleryType\' to null.");
                }
                if(s.equals("order")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        m0.j0(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'order\' to null.");
                }
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                m0.e(null);
            }
            else {
                m0.e(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        return (m)f00.o2(m0, new W[0]);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.i.f();
            io.realm.a a1 = ((g2)object0).i.f();
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
            String s3 = ((g2)object0).i.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.i.g().F() == ((g2)object0).i.g().F() : false;
            }
            return s3 == null ? this.i.g().F() == ((g2)object0).i.g().F() : false;
        }
        return false;
    }

    @Override  // com.dcinside.app.realm.m, io.realm.h2
    public String f() {
        this.i.f().k();
        return this.i.g().U(this.h.f);
    }

    public static OsObjectSchemaInfo f6() {
        return g2.k;
    }

    public static String g6() {
        return "FavoriteGallery";
    }

    public static long h6(F0 f00, m m0, Map map0) {
        if(m0 instanceof s && !d1.F5(m0) && ((s)m0).R3().f() != null && ((s)m0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)m0).R3().g().F();
        }
        Table table0 = f00.n4(m.class);
        long v = table0.getNativePtr();
        b g2$b0 = (b)f00.e0().j(m.class);
        long v1 = OsObject.createRow(table0);
        map0.put(m0, v1);
        String s = m0.m();
        if(s != null) {
            Table.nativeSetString(v, g2$b0.e, v1, s, false);
        }
        String s1 = m0.f();
        if(s1 != null) {
            Table.nativeSetString(v, g2$b0.f, v1, s1, false);
        }
        Table.nativeSetLong(v, g2$b0.g, v1, m0.H(), false);
        Table.nativeSetLong(v, g2$b0.h, v1, m0.N0(), false);
        return v1;
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
        Table table0 = f00.n4(m.class);
        long v = table0.getNativePtr();
        b g2$b0 = (b)f00.e0().j(m.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            m m0 = (m)object0;
            if(map0.containsKey(m0)) {
            }
            else if(m0 instanceof s && !d1.F5(m0) && ((s)m0).R3().f() != null && ((s)m0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(m0, ((s)m0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(m0, v1);
                String s = m0.m();
                if(s != null) {
                    Table.nativeSetString(v, g2$b0.e, v1, s, false);
                }
                String s1 = m0.f();
                if(s1 != null) {
                    Table.nativeSetString(v, g2$b0.f, v1, s1, false);
                }
                Table.nativeSetLong(v, g2$b0.g, v1, m0.H(), false);
                Table.nativeSetLong(v, g2$b0.h, v1, m0.N0(), false);
            }
        }
    }

    @Override  // com.dcinside.app.realm.m, io.realm.h2
    public void j0(int v) {
        if(this.i.i()) {
            if(!this.i.d()) {
                return;
            }
            u u0 = this.i.g();
            u0.b().u0(this.h.h, u0.F(), ((long)v), true);
            return;
        }
        this.i.f().k();
        this.i.g().e(this.h.h, ((long)v));
    }

    public static long j6(F0 f00, m m0, Map map0) {
        if(m0 instanceof s && !d1.F5(m0) && ((s)m0).R3().f() != null && ((s)m0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)m0).R3().g().F();
        }
        Table table0 = f00.n4(m.class);
        long v = table0.getNativePtr();
        b g2$b0 = (b)f00.e0().j(m.class);
        long v1 = OsObject.createRow(table0);
        map0.put(m0, v1);
        String s = m0.m();
        if(s == null) {
            Table.nativeSetNull(v, g2$b0.e, v1, false);
        }
        else {
            Table.nativeSetString(v, g2$b0.e, v1, s, false);
        }
        String s1 = m0.f();
        if(s1 == null) {
            Table.nativeSetNull(v, g2$b0.f, v1, false);
        }
        else {
            Table.nativeSetString(v, g2$b0.f, v1, s1, false);
        }
        Table.nativeSetLong(v, g2$b0.g, v1, m0.H(), false);
        Table.nativeSetLong(v, g2$b0.h, v1, m0.N0(), false);
        return v1;
    }

    public static void k6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(m.class);
        long v = table0.getNativePtr();
        b g2$b0 = (b)f00.e0().j(m.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            m m0 = (m)object0;
            if(map0.containsKey(m0)) {
            }
            else if(m0 instanceof s && !d1.F5(m0) && ((s)m0).R3().f() != null && ((s)m0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(m0, ((s)m0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(m0, v1);
                String s = m0.m();
                if(s == null) {
                    Table.nativeSetNull(v, g2$b0.e, v1, false);
                }
                else {
                    Table.nativeSetString(v, g2$b0.e, v1, s, false);
                }
                String s1 = m0.f();
                if(s1 == null) {
                    Table.nativeSetNull(v, g2$b0.f, v1, false);
                }
                else {
                    Table.nativeSetString(v, g2$b0.f, v1, s1, false);
                }
                Table.nativeSetLong(v, g2$b0.g, v1, m0.H(), false);
                Table.nativeSetLong(v, g2$b0.h, v1, m0.N0(), false);
            }
        }
    }

    static g2 l6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(m.class), false, Collections.emptyList());
        g2 g20 = new g2();
        a$h0.a();
        return g20;
    }

    @Override  // com.dcinside.app.realm.m, io.realm.h2
    public String m() {
        this.i.f().k();
        return this.i.g().U(this.h.e);
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

    @Override  // com.dcinside.app.realm.m, io.realm.h2
    public void q(String s) {
        if(this.i.i()) {
            if(!this.i.d()) {
                return;
            }
            u u0 = this.i.g();
            if(s == null) {
                u0.b().v0(this.h.e, u0.F(), true);
                return;
            }
            u0.b().y0(this.h.e, u0.F(), s, true);
            return;
        }
        this.i.f().k();
        if(s == null) {
            this.i.g().K(this.h.e);
            return;
        }
        this.i.g().a(this.h.e, s);
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("FavoriteGallery = proxy[");
        stringBuilder0.append("{id:");
        String s = "null";
        stringBuilder0.append((this.m() == null ? "null" : this.m()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{name:");
        if(this.f() != null) {
            s = this.f();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryType:");
        stringBuilder0.append(this.H());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{order:");
        stringBuilder0.append(this.N0());
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

