package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.z;
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

public class w2 extends z implements s, x2 {
    public static final class a {
        public static final String a = "ImageDownloadInfo";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        long k;
        long l;
        long m;

        b(OsSchemaInfo osSchemaInfo0) {
            super(9);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("ImageDownloadInfo");
            this.e = this.b("group", "group", osObjectSchemaInfo0);
            this.f = this.b("time", "time", osObjectSchemaInfo0);
            this.g = this.b("postNumber", "postNumber", osObjectSchemaInfo0);
            this.h = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.i = this.b("url", "url", osObjectSchemaInfo0);
            this.j = this.b("subject", "subject", osObjectSchemaInfo0);
            this.k = this.b("name", "name", osObjectSchemaInfo0);
            this.l = this.b("toDir", "toDir", osObjectSchemaInfo0);
            this.m = this.b("state", "state", osObjectSchemaInfo0);
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
            ((b)c1).k = ((b)c0).k;
            ((b)c1).l = ((b)c0).l;
            ((b)c1).m = ((b)c0).m;
        }
    }

    private b r;
    private A0 s;
    private static final String t = "";
    private static final OsObjectSchemaInfo u;

    static {
        w2.u = w2.n6();
    }

    w2() {
        this.s.p();
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public void G1(String s) {
        if(this.s.i()) {
            if(!this.s.d()) {
                return;
            }
            u u0 = this.s.g();
            if(s == null) {
                u0.b().v0(this.r.l, u0.F(), true);
                return;
            }
            u0.b().y0(this.r.l, u0.F(), s, true);
            return;
        }
        this.s.f().k();
        if(s == null) {
            this.s.g().K(this.r.l);
            return;
        }
        this.s.g().a(this.r.l, s);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public long G4() {
        this.s.f().k();
        return this.s.g().w(this.r.e);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.s;
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public String S0() {
        this.s.f().k();
        return this.s.g().U(this.r.l);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public void Z4(long v) {
        if(this.s.i()) {
            if(!this.s.d()) {
                return;
            }
            u u0 = this.s.g();
            u0.b().u0(this.r.e, u0.F(), v, true);
            return;
        }
        this.s.f().k();
        this.s.g().e(this.r.e, v);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public String a() {
        this.s.f().k();
        return this.s.g().U(this.r.h);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public void b(String s) {
        if(this.s.i()) {
            if(!this.s.d()) {
                return;
            }
            u u0 = this.s.g();
            if(s == null) {
                u0.b().v0(this.r.h, u0.F(), true);
                return;
            }
            u0.b().y0(this.r.h, u0.F(), s, true);
            return;
        }
        this.s.f().k();
        if(s == null) {
            this.s.g().K(this.r.h);
            return;
        }
        this.s.g().a(this.r.h, s);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public void c(long v) {
        if(this.s.i()) {
            if(!this.s.d()) {
                return;
            }
            u u0 = this.s.g();
            u0.b().u0(this.r.f, u0.F(), v, true);
            return;
        }
        this.s.f().k();
        this.s.g().e(this.r.f, v);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public long d() {
        this.s.f().k();
        return this.s.g().w(this.r.f);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public void e(String s) {
        if(this.s.i()) {
            if(!this.s.d()) {
                return;
            }
            u u0 = this.s.g();
            if(s == null) {
                u0.b().v0(this.r.k, u0.F(), true);
                return;
            }
            u0.b().y0(this.r.k, u0.F(), s, true);
            return;
        }
        this.s.f().k();
        if(s == null) {
            this.s.g().K(this.r.k);
            return;
        }
        this.s.g().a(this.r.k, s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.s.f();
            io.realm.a a1 = ((w2)object0).s.f();
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
            String s2 = this.s.g().b().P();
            String s3 = ((w2)object0).s.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.s.g().F() == ((w2)object0).s.g().F() : false;
            }
            return s3 == null ? this.s.g().F() == ((w2)object0).s.g().F() : false;
        }
        return false;
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public String f() {
        this.s.f().k();
        return this.s.g().U(this.r.k);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public int f4() {
        this.s.f().k();
        return (int)this.s.g().w(this.r.m);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public int g() {
        this.s.f().k();
        return (int)this.s.g().w(this.r.g);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public void g1(String s) {
        if(this.s.i()) {
            if(!this.s.d()) {
                return;
            }
            u u0 = this.s.g();
            if(s == null) {
                u0.b().v0(this.r.i, u0.F(), true);
                return;
            }
            u0.b().y0(this.r.i, u0.F(), s, true);
            return;
        }
        this.s.f().k();
        if(s == null) {
            this.s.g().K(this.r.i);
            return;
        }
        this.s.g().a(this.r.i, s);
    }

    @Override
    public int hashCode() {
        String s = this.s.f().getPath();
        String s1 = this.s.g().b().P();
        long v = this.s.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    public static z j6(F0 f00, b w2$b0, z z0, boolean z1, Map map0, Set set0) {
        s s0 = (s)map0.get(z0);
        if(s0 != null) {
            return (z)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(z.class), set0);
        osObjectBuilder0.n3(w2$b0.e, z0.G4());
        osObjectBuilder0.n3(w2$b0.f, z0.d());
        osObjectBuilder0.i3(w2$b0.g, z0.g());
        osObjectBuilder0.n4(w2$b0.h, z0.a());
        osObjectBuilder0.n4(w2$b0.i, z0.l4());
        osObjectBuilder0.n4(w2$b0.j, z0.k());
        osObjectBuilder0.n4(w2$b0.k, z0.f());
        osObjectBuilder0.n4(w2$b0.l, z0.S0());
        osObjectBuilder0.i3(w2$b0.m, z0.f4());
        z z2 = w2.w6(f00, osObjectBuilder0.v4());
        map0.put(z0, z2);
        return z2;
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public String k() {
        this.s.f().k();
        return this.s.g().U(this.r.j);
    }

    public static z k6(F0 f00, b w2$b0, z z0, boolean z1, Map map0, Set set0) {
        if(z0 instanceof s && !d1.F5(z0) && ((s)z0).R3().f() != null) {
            io.realm.a a0 = ((s)z0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return z0;
            }
        }
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(z0);
        return s0 == null ? w2.j6(f00, w2$b0, z0, z1, map0, set0) : ((z)s0);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public void l(String s) {
        if(this.s.i()) {
            if(!this.s.d()) {
                return;
            }
            u u0 = this.s.g();
            if(s == null) {
                u0.b().v0(this.r.j, u0.F(), true);
                return;
            }
            u0.b().y0(this.r.j, u0.F(), s, true);
            return;
        }
        this.s.f().k();
        if(s == null) {
            this.s.g().K(this.r.j);
            return;
        }
        this.s.g().a(this.r.j, s);
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public String l4() {
        this.s.f().k();
        return this.s.g().U(this.r.i);
    }

    public static b l6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.s != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.r = (b)a$h0.c();
        A0 a00 = new A0(this);
        this.s = a00;
        a00.r(a$h0.e());
        this.s.s(a$h0.f());
        this.s.o(a$h0.b());
        this.s.q(a$h0.d());
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public void m4(int v) {
        if(this.s.i()) {
            if(!this.s.d()) {
                return;
            }
            u u0 = this.s.g();
            u0.b().u0(this.r.m, u0.F(), ((long)v), true);
            return;
        }
        this.s.f().k();
        this.s.g().e(this.r.m, ((long)v));
    }

    public static z m6(z z0, int v, int v1, Map map0) {
        z z1;
        if(v <= v1 && z0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(z0);
            if(s$a0 == null) {
                z1 = new z();
                map0.put(z0, new io.realm.internal.s.a(v, z1));
            }
            else {
                if(v >= s$a0.a) {
                    return (z)s$a0.b;
                }
                s$a0.a = v;
                z1 = (z)s$a0.b;
            }
            F0 f00 = (F0)((s)z0).R3().f();
            z1.Z4(z0.G4());
            z1.c(z0.d());
            z1.o(z0.g());
            z1.b(z0.a());
            z1.g1(z0.l4());
            z1.l(z0.k());
            z1.e(z0.f());
            z1.G1(z0.S0());
            z1.m4(z0.f4());
            return z1;
        }
        return null;
    }

    private static OsObjectSchemaInfo n6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "ImageDownloadInfo", false, 9, 0);
        osObjectSchemaInfo$b0.d("", "group", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "time", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "postNumber", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "url", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "subject", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "name", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "toDir", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "state", RealmFieldType.INTEGER, false, false, true);
        return osObjectSchemaInfo$b0.g();
    }

    @Override  // com.dcinside.app.realm.z, io.realm.x2
    public void o(int v) {
        if(this.s.i()) {
            if(!this.s.d()) {
                return;
            }
            u u0 = this.s.g();
            u0.b().u0(this.r.g, u0.F(), ((long)v), true);
            return;
        }
        this.s.f().k();
        this.s.g().e(this.r.g, ((long)v));
    }

    public static z o6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        List list0 = Collections.emptyList();
        z z1 = (z)f00.y3(z.class, true, list0);
        if(jSONObject0.has("group")) {
            if(jSONObject0.isNull("group")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'group\' to null.");
            }
            z1.Z4(jSONObject0.getLong("group"));
        }
        if(jSONObject0.has("time")) {
            if(jSONObject0.isNull("time")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
            }
            z1.c(jSONObject0.getLong("time"));
        }
        if(jSONObject0.has("postNumber")) {
            if(jSONObject0.isNull("postNumber")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'postNumber\' to null.");
            }
            z1.o(jSONObject0.getInt("postNumber"));
        }
        if(jSONObject0.has("galleryId")) {
            if(jSONObject0.isNull("galleryId")) {
                z1.b(null);
            }
            else {
                z1.b(jSONObject0.getString("galleryId"));
            }
        }
        if(jSONObject0.has("url")) {
            if(jSONObject0.isNull("url")) {
                z1.g1(null);
            }
            else {
                z1.g1(jSONObject0.getString("url"));
            }
        }
        if(jSONObject0.has("subject")) {
            if(jSONObject0.isNull("subject")) {
                z1.l(null);
            }
            else {
                z1.l(jSONObject0.getString("subject"));
            }
        }
        if(jSONObject0.has("name")) {
            if(jSONObject0.isNull("name")) {
                z1.e(null);
            }
            else {
                z1.e(jSONObject0.getString("name"));
            }
        }
        if(jSONObject0.has("toDir")) {
            if(jSONObject0.isNull("toDir")) {
                z1.G1(null);
            }
            else {
                z1.G1(jSONObject0.getString("toDir"));
            }
        }
        if(jSONObject0.has("state")) {
            if(jSONObject0.isNull("state")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'state\' to null.");
            }
            z1.m4(jSONObject0.getInt("state"));
            return z1;
        }
        return z1;
    }

    @TargetApi(11)
    public static z p6(F0 f00, JsonReader jsonReader0) throws IOException {
        z z0 = new z();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("group")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    z0.Z4(jsonReader0.nextLong());
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'group\' to null.");
            }
            if(s.equals("time")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    z0.c(jsonReader0.nextLong());
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
            }
            if(s.equals("postNumber")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    z0.o(jsonReader0.nextInt());
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'postNumber\' to null.");
            }
            if(s.equals("galleryId")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    z0.b(null);
                }
                else {
                    z0.b(jsonReader0.nextString());
                }
            }
            else if(s.equals("url")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    z0.g1(null);
                }
                else {
                    z0.g1(jsonReader0.nextString());
                }
            }
            else if(s.equals("subject")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    z0.l(null);
                }
                else {
                    z0.l(jsonReader0.nextString());
                }
            }
            else if(s.equals("name")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    z0.e(null);
                }
                else {
                    z0.e(jsonReader0.nextString());
                }
            }
            else if(!s.equals("toDir")) {
                if(s.equals("state")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        z0.m4(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'state\' to null.");
                }
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                z0.G1(null);
            }
            else {
                z0.G1(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        return (z)f00.o2(z0, new W[0]);
    }

    public static OsObjectSchemaInfo q6() {
        return w2.u;
    }

    public static String r6() {
        return "ImageDownloadInfo";
    }

    public static long s6(F0 f00, z z0, Map map0) {
        if(z0 instanceof s && !d1.F5(z0) && ((s)z0).R3().f() != null && ((s)z0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)z0).R3().g().F();
        }
        Table table0 = f00.n4(z.class);
        long v = table0.getNativePtr();
        b w2$b0 = (b)f00.e0().j(z.class);
        long v1 = OsObject.createRow(table0);
        map0.put(z0, v1);
        Table.nativeSetLong(v, w2$b0.e, v1, z0.G4(), false);
        Table.nativeSetLong(v, w2$b0.f, v1, z0.d(), false);
        Table.nativeSetLong(v, w2$b0.g, v1, z0.g(), false);
        String s = z0.a();
        if(s != null) {
            Table.nativeSetString(v, w2$b0.h, v1, s, false);
        }
        String s1 = z0.l4();
        if(s1 != null) {
            Table.nativeSetString(v, w2$b0.i, v1, s1, false);
        }
        String s2 = z0.k();
        if(s2 != null) {
            Table.nativeSetString(v, w2$b0.j, v1, s2, false);
        }
        String s3 = z0.f();
        if(s3 != null) {
            Table.nativeSetString(v, w2$b0.k, v1, s3, false);
        }
        String s4 = z0.S0();
        if(s4 != null) {
            Table.nativeSetString(v, w2$b0.l, v1, s4, false);
        }
        Table.nativeSetLong(v, w2$b0.m, v1, z0.f4(), false);
        return v1;
    }

    public static void t6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(z.class);
        long v = table0.getNativePtr();
        b w2$b0 = (b)f00.e0().j(z.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            z z0 = (z)object0;
            if(map0.containsKey(z0)) {
            }
            else if(z0 instanceof s && !d1.F5(z0) && ((s)z0).R3().f() != null && ((s)z0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(z0, ((s)z0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(z0, v1);
                Table.nativeSetLong(v, w2$b0.e, v1, z0.G4(), false);
                Table.nativeSetLong(v, w2$b0.f, v1, z0.d(), false);
                Table.nativeSetLong(v, w2$b0.g, v1, z0.g(), false);
                String s = z0.a();
                if(s != null) {
                    Table.nativeSetString(v, w2$b0.h, v1, s, false);
                }
                String s1 = z0.l4();
                if(s1 != null) {
                    Table.nativeSetString(v, w2$b0.i, v1, s1, false);
                }
                String s2 = z0.k();
                if(s2 != null) {
                    Table.nativeSetString(v, w2$b0.j, v1, s2, false);
                }
                String s3 = z0.f();
                if(s3 != null) {
                    Table.nativeSetString(v, w2$b0.k, v1, s3, false);
                }
                String s4 = z0.S0();
                if(s4 != null) {
                    Table.nativeSetString(v, w2$b0.l, v1, s4, false);
                }
                Table.nativeSetLong(v, w2$b0.m, v1, z0.f4(), false);
            }
        }
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("ImageDownloadInfo = proxy[");
        stringBuilder0.append("{group:");
        stringBuilder0.append(this.G4());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{time:");
        stringBuilder0.append(this.d());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{postNumber:");
        stringBuilder0.append(this.g());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryId:");
        String s = "null";
        stringBuilder0.append((this.a() == null ? "null" : this.a()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{url:");
        stringBuilder0.append((this.l4() == null ? "null" : this.l4()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{subject:");
        stringBuilder0.append((this.k() == null ? "null" : this.k()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{name:");
        stringBuilder0.append((this.f() == null ? "null" : this.f()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{toDir:");
        if(this.S0() != null) {
            s = this.S0();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{state:");
        stringBuilder0.append(this.f4());
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public static long u6(F0 f00, z z0, Map map0) {
        if(z0 instanceof s && !d1.F5(z0) && ((s)z0).R3().f() != null && ((s)z0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)z0).R3().g().F();
        }
        Table table0 = f00.n4(z.class);
        long v = table0.getNativePtr();
        b w2$b0 = (b)f00.e0().j(z.class);
        long v1 = OsObject.createRow(table0);
        map0.put(z0, v1);
        Table.nativeSetLong(v, w2$b0.e, v1, z0.G4(), false);
        Table.nativeSetLong(v, w2$b0.f, v1, z0.d(), false);
        Table.nativeSetLong(v, w2$b0.g, v1, z0.g(), false);
        String s = z0.a();
        if(s == null) {
            Table.nativeSetNull(v, w2$b0.h, v1, false);
        }
        else {
            Table.nativeSetString(v, w2$b0.h, v1, s, false);
        }
        String s1 = z0.l4();
        if(s1 == null) {
            Table.nativeSetNull(v, w2$b0.i, v1, false);
        }
        else {
            Table.nativeSetString(v, w2$b0.i, v1, s1, false);
        }
        String s2 = z0.k();
        if(s2 == null) {
            Table.nativeSetNull(v, w2$b0.j, v1, false);
        }
        else {
            Table.nativeSetString(v, w2$b0.j, v1, s2, false);
        }
        String s3 = z0.f();
        if(s3 == null) {
            Table.nativeSetNull(v, w2$b0.k, v1, false);
        }
        else {
            Table.nativeSetString(v, w2$b0.k, v1, s3, false);
        }
        String s4 = z0.S0();
        if(s4 == null) {
            Table.nativeSetNull(v, w2$b0.l, v1, false);
        }
        else {
            Table.nativeSetString(v, w2$b0.l, v1, s4, false);
        }
        Table.nativeSetLong(v, w2$b0.m, v1, z0.f4(), false);
        return v1;
    }

    public static void v6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(z.class);
        long v = table0.getNativePtr();
        b w2$b0 = (b)f00.e0().j(z.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            z z0 = (z)object0;
            if(map0.containsKey(z0)) {
            }
            else if(z0 instanceof s && !d1.F5(z0) && ((s)z0).R3().f() != null && ((s)z0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(z0, ((s)z0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(z0, v1);
                Table.nativeSetLong(v, w2$b0.e, v1, z0.G4(), false);
                Table.nativeSetLong(v, w2$b0.f, v1, z0.d(), false);
                Table.nativeSetLong(v, w2$b0.g, v1, z0.g(), false);
                String s = z0.a();
                if(s == null) {
                    Table.nativeSetNull(v, w2$b0.h, v1, false);
                }
                else {
                    Table.nativeSetString(v, w2$b0.h, v1, s, false);
                }
                String s1 = z0.l4();
                if(s1 == null) {
                    Table.nativeSetNull(v, w2$b0.i, v1, false);
                }
                else {
                    Table.nativeSetString(v, w2$b0.i, v1, s1, false);
                }
                String s2 = z0.k();
                if(s2 == null) {
                    Table.nativeSetNull(v, w2$b0.j, v1, false);
                }
                else {
                    Table.nativeSetString(v, w2$b0.j, v1, s2, false);
                }
                String s3 = z0.f();
                if(s3 == null) {
                    Table.nativeSetNull(v, w2$b0.k, v1, false);
                }
                else {
                    Table.nativeSetString(v, w2$b0.k, v1, s3, false);
                }
                String s4 = z0.S0();
                if(s4 == null) {
                    Table.nativeSetNull(v, w2$b0.l, v1, false);
                }
                else {
                    Table.nativeSetString(v, w2$b0.l, v1, s4, false);
                }
                Table.nativeSetLong(v, w2$b0.m, v1, z0.f4(), false);
            }
        }
    }

    static w2 w6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(z.class), false, Collections.emptyList());
        w2 w20 = new w2();
        a$h0.a();
        return w20;
    }
}

