package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.o;
import com.dcinside.app.realm.r;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class k2 extends o implements s, l2 {
    public static final class a {
        public static final String a = "GalleryOptions";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;

        b(OsSchemaInfo osSchemaInfo0) {
            super(4);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("GalleryOptions");
            this.e = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.f = this.b("galleryName", "galleryName", osObjectSchemaInfo0);
            this.g = this.b("time", "time", osObjectSchemaInfo0);
            this.h = this.b("textOption", "textOption", osObjectSchemaInfo0);
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

    private b j;
    private A0 k;
    private static final String l = "";
    private static final OsObjectSchemaInfo m;

    static {
        k2.m = k2.c6();
    }

    k2() {
        this.k.p();
    }

    @Override  // com.dcinside.app.realm.o, io.realm.l2
    public void F4(r r0) {
        F0 f00 = (F0)this.k.f();
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            if(this.k.e().contains("textOption")) {
                return;
            }
            if(r0 != null && !d1.H5(r0)) {
                r0 = (r)f00.o2(r0, new W[0]);
            }
            u u0 = this.k.g();
            if(r0 == null) {
                u0.A(this.j.h);
                return;
            }
            this.k.c(r0);
            u0.b().t0(this.j.h, u0.F(), ((s)r0).R3().g().F(), true);
            return;
        }
        this.k.f().k();
        if(r0 == null) {
            this.k.g().A(this.j.h);
            return;
        }
        this.k.c(r0);
        this.k.g().d(this.j.h, ((s)r0).R3().g().F());
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.k;
    }

    public static o Y5(F0 f00, b k2$b0, o o0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(o0);
        if(s0 != null) {
            return (o)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(o.class), set0);
        osObjectBuilder0.n4(k2$b0.e, o0.a());
        osObjectBuilder0.n4(k2$b0.f, o0.j());
        osObjectBuilder0.n3(k2$b0.g, o0.d());
        o o1 = k2.l6(f00, osObjectBuilder0.v4());
        map0.put(o0, o1);
        r r0 = o0.d3();
        if(r0 == null) {
            ((k2)o1).F4(null);
            return o1;
        }
        r r1 = (r)map0.get(r0);
        if(r1 != null) {
            ((k2)o1).F4(r1);
            return o1;
        }
        ((k2)o1).F4(o2.f6(f00, ((io.realm.o2.b)f00.e0().j(r.class)), r0, z, map0, set0));
        return o1;
    }

    public static o Z5(F0 f00, b k2$b0, o o0, boolean z, Map map0, Set set0) {
        if(o0 instanceof s && !d1.F5(o0) && ((s)o0).R3().f() != null) {
            io.realm.a a0 = ((s)o0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return o0;
            }
        }
        k2 k20 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(o0);
        if(s0 != null) {
            return (o)s0;
        }
        if(z) {
            Table table0 = f00.n4(o.class);
            long v = k2$b0.e;
            String s1 = o0.a();
            long v1 = s1 == null ? table0.u(v) : table0.w(v, s1);
            if(v1 == -1L) {
                return k2.Y5(f00, k2$b0, o0, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v1), k2$b0, false, Collections.emptyList());
                k20 = new k2();
                map0.put(o0, k20);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? k2.m6(f00, k2$b0, k20, o0, map0, set0) : k2.Y5(f00, k2$b0, o0, z, map0, set0);
    }

    @Override  // com.dcinside.app.realm.o, io.realm.l2
    public String a() {
        this.k.f().k();
        return this.k.g().U(this.j.e);
    }

    public static b a6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    @Override  // com.dcinside.app.realm.o, io.realm.l2
    public void b(String s) {
        if(this.k.i()) {
            return;
        }
        this.k.f().k();
        throw new RealmException("Primary key field \'galleryId\' cannot be changed after object was created.");
    }

    public static o b6(o o0, int v, int v1, Map map0) {
        o o1;
        if(v <= v1 && o0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(o0);
            if(s$a0 == null) {
                o1 = new o();
                map0.put(o0, new io.realm.internal.s.a(v, o1));
            }
            else {
                if(v >= s$a0.a) {
                    return (o)s$a0.b;
                }
                s$a0.a = v;
                o1 = (o)s$a0.b;
            }
            F0 f00 = (F0)((s)o0).R3().f();
            o1.b(o0.a());
            o1.h(o0.j());
            o1.c(o0.d());
            o1.F4(o2.h6(o0.d3(), v + 1, v1, map0));
            return o1;
        }
        return null;
    }

    @Override  // com.dcinside.app.realm.o, io.realm.l2
    public void c(long v) {
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            u u0 = this.k.g();
            u0.b().u0(this.j.g, u0.F(), v, true);
            return;
        }
        this.k.f().k();
        this.k.g().e(this.j.g, v);
    }

    private static OsObjectSchemaInfo c6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "GalleryOptions", false, 4, 0);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, true, false, false);
        osObjectSchemaInfo$b0.d("", "galleryName", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "time", RealmFieldType.INTEGER, false, true, true);
        osObjectSchemaInfo$b0.b("", "textOption", RealmFieldType.OBJECT, "GalleryTextOption");
        return osObjectSchemaInfo$b0.g();
    }

    @Override  // com.dcinside.app.realm.o, io.realm.l2
    public long d() {
        this.k.f().k();
        return this.k.g().w(this.j.g);
    }

    @Override  // com.dcinside.app.realm.o, io.realm.l2
    public r d3() {
        this.k.f().k();
        if(this.k.g().D(this.j.h)) {
            return null;
        }
        io.realm.a a0 = this.k.f();
        long v = this.k.g().L(this.j.h);
        List list0 = Collections.emptyList();
        return (r)a0.L(r.class, v, false, list0);
    }

    public static o d6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        o o0;
        ArrayList arrayList0 = new ArrayList(1);
        Class class0 = o.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("galleryId") ? table0.u(v) : table0.w(v, jSONObject0.getString("galleryId"));
            if(v1 == -1L) {
                o0 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    o0 = new k2();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            o0 = null;
        }
        if(o0 == null) {
            if(jSONObject0.has("textOption")) {
                arrayList0.add("textOption");
            }
            if(!jSONObject0.has("galleryId")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'galleryId\'.");
            }
            o0 = jSONObject0.isNull("galleryId") ? ((k2)f00.v3(class0, null, true, arrayList0)) : ((k2)f00.v3(class0, jSONObject0.getString("galleryId"), true, arrayList0));
        }
        if(jSONObject0.has("galleryName")) {
            if(jSONObject0.isNull("galleryName")) {
                o0.h(null);
            }
            else {
                o0.h(jSONObject0.getString("galleryName"));
            }
        }
        if(jSONObject0.has("time")) {
            if(jSONObject0.isNull("time")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
            }
            o0.c(jSONObject0.getLong("time"));
        }
        if(jSONObject0.has("textOption")) {
            if(jSONObject0.isNull("textOption")) {
                o0.F4(null);
                return o0;
            }
            o0.F4(o2.j6(f00, jSONObject0.getJSONObject("textOption"), z));
        }
        return o0;
    }

    @TargetApi(11)
    public static o e6(F0 f00, JsonReader jsonReader0) throws IOException {
        o o0 = new o();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("galleryId")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    o0.b(null);
                }
                else {
                    o0.b(jsonReader0.nextString());
                }
                z = true;
            }
            else if(!s.equals("galleryName")) {
                if(s.equals("time")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        o0.c(jsonReader0.nextLong());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
                }
                if(!s.equals("textOption")) {
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    o0.F4(null);
                }
                else {
                    o0.F4(o2.k6(f00, jsonReader0));
                }
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                o0.h(null);
            }
            else {
                o0.h(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'galleryId\'.");
        }
        return (o)f00.t2(o0, new W[0]);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.k.f();
            io.realm.a a1 = ((k2)object0).k.f();
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
            String s3 = ((k2)object0).k.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.k.g().F() == ((k2)object0).k.g().F() : false;
            }
            return s3 == null ? this.k.g().F() == ((k2)object0).k.g().F() : false;
        }
        return false;
    }

    public static OsObjectSchemaInfo f6() {
        return k2.m;
    }

    public static String g6() {
        return "GalleryOptions";
    }

    @Override  // com.dcinside.app.realm.o, io.realm.l2
    public void h(String s) {
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

    public static long h6(F0 f00, o o0, Map map0) {
        if(o0 instanceof s && !d1.F5(o0) && ((s)o0).R3().f() != null && ((s)o0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)o0).R3().g().F();
        }
        Table table0 = f00.n4(o.class);
        long v = table0.getNativePtr();
        b k2$b0 = (b)f00.e0().j(o.class);
        long v1 = k2$b0.e;
        String s = o0.a();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        else {
            Table.B0(s);
        }
        map0.put(o0, v2);
        String s1 = o0.j();
        if(s1 != null) {
            Table.nativeSetString(v, k2$b0.f, v2, s1, false);
        }
        Table.nativeSetLong(v, k2$b0.g, v2, o0.d(), false);
        r r0 = o0.d3();
        if(r0 != null) {
            Long long0 = (Long)map0.get(r0);
            if(long0 == null) {
                long0 = o2.n6(f00, r0, map0);
            }
            Table.nativeSetLink(v, k2$b0.h, v2, ((long)long0), false);
        }
        return v2;
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

    public static void i6(F0 f00, Iterator iterator0, Map map0) {
        long v3;
        Table table0 = f00.n4(o.class);
        long v = table0.getNativePtr();
        b k2$b0 = (b)f00.e0().j(o.class);
        long v1 = k2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            o o0 = (o)object0;
            if(map0.containsKey(o0)) {
            }
            else if(o0 instanceof s && !d1.F5(o0) && ((s)o0).R3().f() != null && ((s)o0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(o0, ((s)o0).R3().g().F());
            }
            else {
                String s = o0.a();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v3 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                else {
                    Table.B0(s);
                    v3 = v2;
                }
                map0.put(o0, v3);
                String s1 = o0.j();
                if(s1 != null) {
                    Table.nativeSetString(v, k2$b0.f, v3, s1, false);
                }
                Table.nativeSetLong(v, k2$b0.g, v3, o0.d(), false);
                r r0 = o0.d3();
                if(r0 != null) {
                    Long long0 = (Long)map0.get(r0);
                    if(long0 == null) {
                        long0 = o2.n6(f00, r0, map0);
                    }
                    Table.nativeSetLink(v, k2$b0.h, v3, ((long)long0), false);
                }
            }
        }
    }

    @Override  // com.dcinside.app.realm.o, io.realm.l2
    public String j() {
        this.k.f().k();
        return this.k.g().U(this.j.f);
    }

    public static long j6(F0 f00, o o0, Map map0) {
        if(o0 instanceof s && !d1.F5(o0) && ((s)o0).R3().f() != null && ((s)o0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)o0).R3().g().F();
        }
        Table table0 = f00.n4(o.class);
        long v = table0.getNativePtr();
        b k2$b0 = (b)f00.e0().j(o.class);
        long v1 = k2$b0.e;
        String s = o0.a();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        map0.put(o0, v2);
        String s1 = o0.j();
        if(s1 == null) {
            Table.nativeSetNull(v, k2$b0.f, v2, false);
        }
        else {
            Table.nativeSetString(v, k2$b0.f, v2, s1, false);
        }
        Table.nativeSetLong(v, k2$b0.g, v2, o0.d(), false);
        r r0 = o0.d3();
        if(r0 != null) {
            Long long0 = (Long)map0.get(r0);
            if(long0 == null) {
                long0 = o2.p6(f00, r0, map0);
            }
            Table.nativeSetLink(v, k2$b0.h, v2, ((long)long0), false);
            return v2;
        }
        Table.nativeNullifyLink(v, k2$b0.h, v2);
        return v2;
    }

    public static void k6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(o.class);
        long v = table0.getNativePtr();
        b k2$b0 = (b)f00.e0().j(o.class);
        long v1 = k2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            o o0 = (o)object0;
            if(map0.containsKey(o0)) {
            }
            else if(o0 instanceof s && !d1.F5(o0) && ((s)o0).R3().f() != null && ((s)o0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(o0, ((s)o0).R3().g().F());
            }
            else {
                String s = o0.a();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                long v3 = v2 == -1L ? OsObject.createRowWithPrimaryKey(table0, v1, s) : v2;
                map0.put(o0, v3);
                String s1 = o0.j();
                if(s1 == null) {
                    Table.nativeSetNull(v, k2$b0.f, v3, false);
                }
                else {
                    Table.nativeSetString(v, k2$b0.f, v3, s1, false);
                }
                Table.nativeSetLong(v, k2$b0.g, v3, o0.d(), false);
                r r0 = o0.d3();
                if(r0 == null) {
                    Table.nativeNullifyLink(v, k2$b0.h, v3);
                }
                else {
                    Long long0 = (Long)map0.get(r0);
                    if(long0 == null) {
                        long0 = o2.p6(f00, r0, map0);
                    }
                    Table.nativeSetLink(v, k2$b0.h, v3, ((long)long0), false);
                }
            }
        }
    }

    static k2 l6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(o.class), false, Collections.emptyList());
        k2 k20 = new k2();
        a$h0.a();
        return k20;
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

    static o m6(F0 f00, b k2$b0, o o0, o o1, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(o.class), set0);
        osObjectBuilder0.n4(k2$b0.e, o1.a());
        osObjectBuilder0.n4(k2$b0.f, o1.j());
        osObjectBuilder0.n3(k2$b0.g, o1.d());
        r r0 = o1.d3();
        if(r0 == null) {
            osObjectBuilder0.S3(k2$b0.h);
        }
        else {
            r r1 = (r)map0.get(r0);
            if(r1 == null) {
                osObjectBuilder0.T3(k2$b0.h, o2.f6(f00, ((io.realm.o2.b)f00.e0().j(r.class)), r0, true, map0, set0));
            }
            else {
                osObjectBuilder0.T3(k2$b0.h, r1);
            }
        }
        osObjectBuilder0.x4();
        return o0;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("GalleryOptions = proxy[");
        stringBuilder0.append("{galleryId:");
        String s = "null";
        stringBuilder0.append((this.a() == null ? "null" : this.a()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryName:");
        stringBuilder0.append((this.j() == null ? "null" : this.j()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{time:");
        stringBuilder0.append(this.d());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{textOption:");
        if(this.d3() != null) {
            s = "GalleryTextOption";
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

