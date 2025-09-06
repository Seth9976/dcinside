package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.j;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class a2 extends j implements b2, s {
    static final class a extends c {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        long k;

        a(OsSchemaInfo osSchemaInfo0) {
            super(7);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("BlockReportedPost");
            this.e = this.b("reportTime", "reportTime", osObjectSchemaInfo0);
            this.f = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.g = this.b("galleryName", "galleryName", osObjectSchemaInfo0);
            this.h = this.b("postNumber", "postNumber", osObjectSchemaInfo0);
            this.i = this.b("subject", "subject", osObjectSchemaInfo0);
            this.j = this.b("date", "date", osObjectSchemaInfo0);
            this.k = this.b("name", "name", osObjectSchemaInfo0);
        }

        a(c c0, boolean z) {
            super(c0, z);
            this.d(c0, this);
        }

        @Override  // io.realm.internal.c
        protected final c c(boolean z) {
            return new a(this, z);
        }

        @Override  // io.realm.internal.c
        protected final void d(c c0, c c1) {
            ((a)c1).e = ((a)c0).e;
            ((a)c1).f = ((a)c0).f;
            ((a)c1).g = ((a)c0).g;
            ((a)c1).h = ((a)c0).h;
            ((a)c1).i = ((a)c0).i;
            ((a)c1).j = ((a)c0).j;
            ((a)c1).k = ((a)c0).k;
        }
    }

    public static final class b {
        public static final String a = "BlockReportedPost";

    }

    private a l;
    private A0 m;
    private static final String n = "";
    private static final OsObjectSchemaInfo o;

    static {
        a2.o = a2.k6();
    }

    a2() {
        this.m.p();
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.m;
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public String a() {
        this.m.f().k();
        return this.m.g().U(this.l.f);
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public void b(String s) {
        if(this.m.i()) {
            if(!this.m.d()) {
                return;
            }
            u u0 = this.m.g();
            if(s == null) {
                u0.b().v0(this.l.f, u0.F(), true);
                return;
            }
            u0.b().y0(this.l.f, u0.F(), s, true);
            return;
        }
        this.m.f().k();
        if(s == null) {
            this.m.g().K(this.l.f);
            return;
        }
        this.m.g().a(this.l.f, s);
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public void e(String s) {
        if(this.m.i()) {
            if(!this.m.d()) {
                return;
            }
            u u0 = this.m.g();
            if(s == null) {
                u0.b().v0(this.l.k, u0.F(), true);
                return;
            }
            u0.b().y0(this.l.k, u0.F(), s, true);
            return;
        }
        this.m.f().k();
        if(s == null) {
            this.m.g().K(this.l.k);
            return;
        }
        this.m.g().a(this.l.k, s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.m.f();
            io.realm.a a1 = ((a2)object0).m.f();
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
            String s2 = this.m.g().b().P();
            String s3 = ((a2)object0).m.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.m.g().F() == ((a2)object0).m.g().F() : false;
            }
            return s3 == null ? this.m.g().F() == ((a2)object0).m.g().F() : false;
        }
        return false;
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public String f() {
        this.m.f().k();
        return this.m.g().U(this.l.k);
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public int g() {
        this.m.f().k();
        return (int)this.m.g().w(this.l.h);
    }

    public static j g6(F0 f00, a a2$a0, j j0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(j0);
        if(s0 != null) {
            return (j)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(j.class), set0);
        osObjectBuilder0.n3(a2$a0.e, j0.i5());
        osObjectBuilder0.n4(a2$a0.f, j0.a());
        osObjectBuilder0.n4(a2$a0.g, j0.j());
        osObjectBuilder0.i3(a2$a0.h, j0.g());
        osObjectBuilder0.n4(a2$a0.i, j0.k());
        osObjectBuilder0.n4(a2$a0.j, j0.p());
        osObjectBuilder0.n4(a2$a0.k, j0.f());
        j j1 = a2.t6(f00, osObjectBuilder0.v4());
        map0.put(j0, j1);
        return j1;
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public void h(String s) {
        if(this.m.i()) {
            if(!this.m.d()) {
                return;
            }
            u u0 = this.m.g();
            if(s == null) {
                u0.b().v0(this.l.g, u0.F(), true);
                return;
            }
            u0.b().y0(this.l.g, u0.F(), s, true);
            return;
        }
        this.m.f().k();
        if(s == null) {
            this.m.g().K(this.l.g);
            return;
        }
        this.m.g().a(this.l.g, s);
    }

    public static j h6(F0 f00, a a2$a0, j j0, boolean z, Map map0, Set set0) {
        if(j0 instanceof s && !d1.F5(j0) && ((s)j0).R3().f() != null) {
            io.realm.a a0 = ((s)j0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return j0;
            }
        }
        a2 a20 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(j0);
        if(s0 != null) {
            return (j)s0;
        }
        if(z) {
            Table table0 = f00.n4(j.class);
            long v = table0.t(a2$a0.e, j0.i5());
            if(v == -1L) {
                return a2.g6(f00, a2$a0, j0, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v), a2$a0, false, Collections.emptyList());
                a20 = new a2();
                map0.put(j0, a20);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? a2.u6(f00, a2$a0, a20, j0, map0, set0) : a2.g6(f00, a2$a0, j0, z, map0, set0);
    }

    @Override
    public int hashCode() {
        String s = this.m.f().getPath();
        String s1 = this.m.g().b().P();
        long v = this.m.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public long i5() {
        this.m.f().k();
        return this.m.g().w(this.l.e);
    }

    public static a i6(OsSchemaInfo osSchemaInfo0) {
        return new a(osSchemaInfo0);
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public String j() {
        this.m.f().k();
        return this.m.g().U(this.l.g);
    }

    public static j j6(j j0, int v, int v1, Map map0) {
        j j1;
        if(v <= v1 && j0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(j0);
            if(s$a0 == null) {
                j1 = new j();
                map0.put(j0, new io.realm.internal.s.a(v, j1));
            }
            else {
                if(v >= s$a0.a) {
                    return (j)s$a0.b;
                }
                s$a0.a = v;
                j1 = (j)s$a0.b;
            }
            F0 f00 = (F0)((s)j0).R3().f();
            j1.w4(j0.i5());
            j1.b(j0.a());
            j1.h(j0.j());
            j1.o(j0.g());
            j1.l(j0.k());
            j1.r(j0.p());
            j1.e(j0.f());
            return j1;
        }
        return null;
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public String k() {
        this.m.f().k();
        return this.m.g().U(this.l.i);
    }

    private static OsObjectSchemaInfo k6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "BlockReportedPost", false, 7, 0);
        osObjectSchemaInfo$b0.d("", "reportTime", RealmFieldType.INTEGER, true, false, true);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, false, true, false);
        osObjectSchemaInfo$b0.d("", "galleryName", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "postNumber", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "subject", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "date", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "name", RealmFieldType.STRING, false, false, false);
        return osObjectSchemaInfo$b0.g();
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public void l(String s) {
        if(this.m.i()) {
            if(!this.m.d()) {
                return;
            }
            u u0 = this.m.g();
            if(s == null) {
                u0.b().v0(this.l.i, u0.F(), true);
                return;
            }
            u0.b().y0(this.l.i, u0.F(), s, true);
            return;
        }
        this.m.f().k();
        if(s == null) {
            this.m.g().K(this.l.i);
            return;
        }
        this.m.g().a(this.l.i, s);
    }

    public static j l6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        j j0;
        List list0 = Collections.emptyList();
        Class class0 = j.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((a)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("reportTime") ? -1L : table0.t(v, jSONObject0.getLong("reportTime"));
            if(v1 == -1L) {
                j0 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    j0 = new a2();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            j0 = null;
        }
        if(j0 == null) {
            if(!jSONObject0.has("reportTime")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'reportTime\'.");
            }
            j0 = jSONObject0.isNull("reportTime") ? ((a2)f00.v3(class0, null, true, list0)) : ((a2)f00.v3(class0, jSONObject0.getLong("reportTime"), true, list0));
        }
        if(jSONObject0.has("galleryId")) {
            if(jSONObject0.isNull("galleryId")) {
                j0.b(null);
            }
            else {
                j0.b(jSONObject0.getString("galleryId"));
            }
        }
        if(jSONObject0.has("galleryName")) {
            if(jSONObject0.isNull("galleryName")) {
                j0.h(null);
            }
            else {
                j0.h(jSONObject0.getString("galleryName"));
            }
        }
        if(jSONObject0.has("postNumber")) {
            if(jSONObject0.isNull("postNumber")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'postNumber\' to null.");
            }
            j0.o(jSONObject0.getInt("postNumber"));
        }
        if(jSONObject0.has("subject")) {
            if(jSONObject0.isNull("subject")) {
                j0.l(null);
            }
            else {
                j0.l(jSONObject0.getString("subject"));
            }
        }
        if(jSONObject0.has("date")) {
            if(jSONObject0.isNull("date")) {
                j0.r(null);
            }
            else {
                j0.r(jSONObject0.getString("date"));
            }
        }
        if(jSONObject0.has("name")) {
            if(jSONObject0.isNull("name")) {
                j0.e(null);
                return j0;
            }
            j0.e(jSONObject0.getString("name"));
        }
        return j0;
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.m != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.l = (a)a$h0.c();
        A0 a00 = new A0(this);
        this.m = a00;
        a00.r(a$h0.e());
        this.m.s(a$h0.f());
        this.m.o(a$h0.b());
        this.m.q(a$h0.d());
    }

    @TargetApi(11)
    public static j m6(F0 f00, JsonReader jsonReader0) throws IOException {
        j j0 = new j();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("reportTime")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    j0.w4(jsonReader0.nextLong());
                    z = true;
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'reportTime\' to null.");
            }
            if(s.equals("galleryId")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    j0.b(null);
                }
                else {
                    j0.b(jsonReader0.nextString());
                }
            }
            else if(!s.equals("galleryName")) {
                if(s.equals("postNumber")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        j0.o(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'postNumber\' to null.");
                }
                if(s.equals("subject")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        j0.l(null);
                    }
                    else {
                        j0.l(jsonReader0.nextString());
                    }
                }
                else if(s.equals("date")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        j0.r(null);
                    }
                    else {
                        j0.r(jsonReader0.nextString());
                    }
                }
                else if(!s.equals("name")) {
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    j0.e(null);
                }
                else {
                    j0.e(jsonReader0.nextString());
                }
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                j0.h(null);
            }
            else {
                j0.h(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'reportTime\'.");
        }
        return (j)f00.t2(j0, new W[0]);
    }

    public static OsObjectSchemaInfo n6() {
        return a2.o;
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public void o(int v) {
        if(this.m.i()) {
            if(!this.m.d()) {
                return;
            }
            u u0 = this.m.g();
            u0.b().u0(this.l.h, u0.F(), ((long)v), true);
            return;
        }
        this.m.f().k();
        this.m.g().e(this.l.h, ((long)v));
    }

    public static String o6() {
        return "BlockReportedPost";
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public String p() {
        this.m.f().k();
        return this.m.g().U(this.l.j);
    }

    public static long p6(F0 f00, j j0, Map map0) {
        if(j0 instanceof s && !d1.F5(j0) && ((s)j0).R3().f() != null && ((s)j0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)j0).R3().g().F();
        }
        Table table0 = f00.n4(j.class);
        long v = table0.getNativePtr();
        a a2$a0 = (a)f00.e0().j(j.class);
        long v1 = a2$a0.e;
        Long long0 = j0.i5();
        long v2 = Table.nativeFindFirstInt(v, v1, j0.i5());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, j0.i5());
        }
        else {
            Table.B0(long0);
        }
        map0.put(j0, v2);
        String s = j0.a();
        if(s != null) {
            Table.nativeSetString(v, a2$a0.f, v2, s, false);
        }
        String s1 = j0.j();
        if(s1 != null) {
            Table.nativeSetString(v, a2$a0.g, v2, s1, false);
        }
        Table.nativeSetLong(v, a2$a0.h, v2, j0.g(), false);
        String s2 = j0.k();
        if(s2 != null) {
            Table.nativeSetString(v, a2$a0.i, v2, s2, false);
        }
        String s3 = j0.p();
        if(s3 != null) {
            Table.nativeSetString(v, a2$a0.j, v2, s3, false);
        }
        String s4 = j0.f();
        if(s4 != null) {
            Table.nativeSetString(v, a2$a0.k, v2, s4, false);
        }
        return v2;
    }

    public static void q6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(j.class);
        long v = table0.getNativePtr();
        a a2$a0 = (a)f00.e0().j(j.class);
        long v1 = a2$a0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            j j0 = (j)object0;
            if(map0.containsKey(j0)) {
            }
            else if(j0 instanceof s && !d1.F5(j0) && ((s)j0).R3().f() != null && ((s)j0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(j0, ((s)j0).R3().g().F());
            }
            else {
                Long long0 = j0.i5();
                long v2 = Table.nativeFindFirstInt(v, v1, j0.i5());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, j0.i5());
                }
                else {
                    Table.B0(long0);
                }
                map0.put(j0, v2);
                String s = j0.a();
                if(s != null) {
                    Table.nativeSetString(v, a2$a0.f, v2, s, false);
                }
                String s1 = j0.j();
                if(s1 != null) {
                    Table.nativeSetString(v, a2$a0.g, v2, s1, false);
                }
                Table.nativeSetLong(v, a2$a0.h, v2, j0.g(), false);
                String s2 = j0.k();
                if(s2 != null) {
                    Table.nativeSetString(v, a2$a0.i, v2, s2, false);
                }
                String s3 = j0.p();
                if(s3 != null) {
                    Table.nativeSetString(v, a2$a0.j, v2, s3, false);
                }
                String s4 = j0.f();
                if(s4 != null) {
                    Table.nativeSetString(v, a2$a0.k, v2, s4, false);
                }
            }
        }
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public void r(String s) {
        if(this.m.i()) {
            if(!this.m.d()) {
                return;
            }
            u u0 = this.m.g();
            if(s == null) {
                u0.b().v0(this.l.j, u0.F(), true);
                return;
            }
            u0.b().y0(this.l.j, u0.F(), s, true);
            return;
        }
        this.m.f().k();
        if(s == null) {
            this.m.g().K(this.l.j);
            return;
        }
        this.m.g().a(this.l.j, s);
    }

    public static long r6(F0 f00, j j0, Map map0) {
        if(j0 instanceof s && !d1.F5(j0) && ((s)j0).R3().f() != null && ((s)j0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)j0).R3().g().F();
        }
        Table table0 = f00.n4(j.class);
        long v = table0.getNativePtr();
        a a2$a0 = (a)f00.e0().j(j.class);
        long v1 = a2$a0.e;
        j0.i5();
        long v2 = Table.nativeFindFirstInt(v, v1, j0.i5());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, j0.i5());
        }
        map0.put(j0, v2);
        String s = j0.a();
        if(s == null) {
            Table.nativeSetNull(v, a2$a0.f, v2, false);
        }
        else {
            Table.nativeSetString(v, a2$a0.f, v2, s, false);
        }
        String s1 = j0.j();
        if(s1 == null) {
            Table.nativeSetNull(v, a2$a0.g, v2, false);
        }
        else {
            Table.nativeSetString(v, a2$a0.g, v2, s1, false);
        }
        Table.nativeSetLong(v, a2$a0.h, v2, j0.g(), false);
        String s2 = j0.k();
        if(s2 == null) {
            Table.nativeSetNull(v, a2$a0.i, v2, false);
        }
        else {
            Table.nativeSetString(v, a2$a0.i, v2, s2, false);
        }
        String s3 = j0.p();
        if(s3 == null) {
            Table.nativeSetNull(v, a2$a0.j, v2, false);
        }
        else {
            Table.nativeSetString(v, a2$a0.j, v2, s3, false);
        }
        String s4 = j0.f();
        if(s4 != null) {
            Table.nativeSetString(v, a2$a0.k, v2, s4, false);
            return v2;
        }
        Table.nativeSetNull(v, a2$a0.k, v2, false);
        return v2;
    }

    public static void s6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(j.class);
        long v = table0.getNativePtr();
        a a2$a0 = (a)f00.e0().j(j.class);
        long v1 = a2$a0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            j j0 = (j)object0;
            if(map0.containsKey(j0)) {
            }
            else if(j0 instanceof s && !d1.F5(j0) && ((s)j0).R3().f() != null && ((s)j0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(j0, ((s)j0).R3().g().F());
            }
            else {
                j0.i5();
                long v2 = Table.nativeFindFirstInt(v, v1, j0.i5());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, j0.i5());
                }
                map0.put(j0, v2);
                String s = j0.a();
                if(s == null) {
                    Table.nativeSetNull(v, a2$a0.f, v2, false);
                }
                else {
                    Table.nativeSetString(v, a2$a0.f, v2, s, false);
                }
                String s1 = j0.j();
                if(s1 == null) {
                    Table.nativeSetNull(v, a2$a0.g, v2, false);
                }
                else {
                    Table.nativeSetString(v, a2$a0.g, v2, s1, false);
                }
                Table.nativeSetLong(v, a2$a0.h, v2, j0.g(), false);
                String s2 = j0.k();
                if(s2 == null) {
                    Table.nativeSetNull(v, a2$a0.i, v2, false);
                }
                else {
                    Table.nativeSetString(v, a2$a0.i, v2, s2, false);
                }
                String s3 = j0.p();
                if(s3 == null) {
                    Table.nativeSetNull(v, a2$a0.j, v2, false);
                }
                else {
                    Table.nativeSetString(v, a2$a0.j, v2, s3, false);
                }
                String s4 = j0.f();
                if(s4 == null) {
                    Table.nativeSetNull(v, a2$a0.k, v2, false);
                }
                else {
                    Table.nativeSetString(v, a2$a0.k, v2, s4, false);
                }
            }
        }
    }

    static a2 t6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(j.class), false, Collections.emptyList());
        a2 a20 = new a2();
        a$h0.a();
        return a20;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("BlockReportedPost = proxy[");
        stringBuilder0.append("{reportTime:");
        stringBuilder0.append(this.i5());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryId:");
        String s = "null";
        stringBuilder0.append((this.a() == null ? "null" : this.a()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryName:");
        stringBuilder0.append((this.j() == null ? "null" : this.j()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{postNumber:");
        stringBuilder0.append(this.g());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{subject:");
        stringBuilder0.append((this.k() == null ? "null" : this.k()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{date:");
        stringBuilder0.append((this.p() == null ? "null" : this.p()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{name:");
        if(this.f() != null) {
            s = this.f();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    static j u6(F0 f00, a a2$a0, j j0, j j1, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(j.class), set0);
        osObjectBuilder0.n3(a2$a0.e, j1.i5());
        osObjectBuilder0.n4(a2$a0.f, j1.a());
        osObjectBuilder0.n4(a2$a0.g, j1.j());
        osObjectBuilder0.i3(a2$a0.h, j1.g());
        osObjectBuilder0.n4(a2$a0.i, j1.k());
        osObjectBuilder0.n4(a2$a0.j, j1.p());
        osObjectBuilder0.n4(a2$a0.k, j1.f());
        osObjectBuilder0.x4();
        return j0;
    }

    @Override  // com.dcinside.app.realm.j, io.realm.b2
    public void w4(long v) {
        if(this.m.i()) {
            return;
        }
        this.m.f().k();
        throw new RealmException("Primary key field \'reportTime\' cannot be changed after object was created.");
    }
}

