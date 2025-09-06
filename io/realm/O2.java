package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.r;
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

public class o2 extends r implements s, p2 {
    public static final class a {
        public static final String a = "GalleryTextOption";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        long k;

        b(OsSchemaInfo osSchemaInfo0) {
            super(7);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("GalleryTextOption");
            this.e = this.b("writeEnable", "writeEnable", osObjectSchemaInfo0);
            this.f = this.b("replyEnable", "replyEnable", osObjectSchemaInfo0);
            this.g = this.b("writePrefix", "writePrefix", osObjectSchemaInfo0);
            this.h = this.b("writeSuffix", "writeSuffix", osObjectSchemaInfo0);
            this.i = this.b("replySuffix", "replySuffix", osObjectSchemaInfo0);
            this.j = this.b("writePrefixColor", "writePrefixColor", osObjectSchemaInfo0);
            this.k = this.b("writeSuffixColor", "writeSuffixColor", osObjectSchemaInfo0);
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
        }
    }

    private b k;
    private A0 l;
    private static final String m = "";
    private static final OsObjectSchemaInfo n;

    static {
        o2.n = o2.i6();
    }

    o2() {
        this.l.p();
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public void A0(String s) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            if(s == null) {
                u0.b().v0(this.k.k, u0.F(), true);
                return;
            }
            u0.b().y0(this.k.k, u0.F(), s, true);
            return;
        }
        this.l.f().k();
        if(s == null) {
            this.l.g().K(this.k.k);
            return;
        }
        this.l.g().a(this.k.k, s);
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public void E3(String s) {
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

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public void J3(String s) {
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

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public void L3(boolean z) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            u0.b().m0(this.k.e, u0.F(), z, true);
            return;
        }
        this.l.f().k();
        this.l.g().p(this.k.e, z);
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public String N2() {
        this.l.f().k();
        return this.l.g().U(this.k.g);
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public String Q3() {
        this.l.f().k();
        return this.l.g().U(this.k.k);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.l;
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public boolean Z0() {
        this.l.f().k();
        return this.l.g().Q(this.k.f);
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public void b5(String s) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            if(s == null) {
                u0.b().v0(this.k.i, u0.F(), true);
                return;
            }
            u0.b().y0(this.k.i, u0.F(), s, true);
            return;
        }
        this.l.f().k();
        if(s == null) {
            this.l.g().K(this.k.i);
            return;
        }
        this.l.g().a(this.k.i, s);
    }

    public static r e6(F0 f00, b o2$b0, r r0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(r0);
        if(s0 != null) {
            return (r)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(r.class), set0);
        osObjectBuilder0.a1(o2$b0.e, Boolean.valueOf(r0.y0()));
        osObjectBuilder0.a1(o2$b0.f, Boolean.valueOf(r0.Z0()));
        osObjectBuilder0.n4(o2$b0.g, r0.N2());
        osObjectBuilder0.n4(o2$b0.h, r0.k1());
        osObjectBuilder0.n4(o2$b0.i, r0.z1());
        osObjectBuilder0.n4(o2$b0.j, r0.n2());
        osObjectBuilder0.n4(o2$b0.k, r0.Q3());
        r r1 = o2.r6(f00, osObjectBuilder0.v4());
        map0.put(r0, r1);
        return r1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.l.f();
            io.realm.a a1 = ((o2)object0).l.f();
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
            String s3 = ((o2)object0).l.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.l.g().F() == ((o2)object0).l.g().F() : false;
            }
            return s3 == null ? this.l.g().F() == ((o2)object0).l.g().F() : false;
        }
        return false;
    }

    public static r f6(F0 f00, b o2$b0, r r0, boolean z, Map map0, Set set0) {
        if(r0 instanceof s && !d1.F5(r0) && ((s)r0).R3().f() != null) {
            io.realm.a a0 = ((s)r0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return r0;
            }
        }
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(r0);
        return s0 == null ? o2.e6(f00, o2$b0, r0, z, map0, set0) : ((r)s0);
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public void g4(boolean z) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            u0.b().m0(this.k.f, u0.F(), z, true);
            return;
        }
        this.l.f().k();
        this.l.g().p(this.k.f, z);
    }

    public static b g6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static r h6(r r0, int v, int v1, Map map0) {
        r r1;
        if(v <= v1 && r0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(r0);
            if(s$a0 == null) {
                r1 = new r();
                map0.put(r0, new io.realm.internal.s.a(v, r1));
            }
            else {
                if(v >= s$a0.a) {
                    return (r)s$a0.b;
                }
                s$a0.a = v;
                r1 = (r)s$a0.b;
            }
            F0 f00 = (F0)((s)r0).R3().f();
            r1.L3(r0.y0());
            r1.g4(r0.Z0());
            r1.E3(r0.N2());
            r1.l5(r0.k1());
            r1.b5(r0.z1());
            r1.J3(r0.n2());
            r1.A0(r0.Q3());
            return r1;
        }
        return null;
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

    private static OsObjectSchemaInfo i6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "GalleryTextOption", false, 7, 0);
        osObjectSchemaInfo$b0.d("", "writeEnable", RealmFieldType.BOOLEAN, false, false, true);
        osObjectSchemaInfo$b0.d("", "replyEnable", RealmFieldType.BOOLEAN, false, false, true);
        osObjectSchemaInfo$b0.d("", "writePrefix", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "writeSuffix", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "replySuffix", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "writePrefixColor", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "writeSuffixColor", RealmFieldType.STRING, false, false, false);
        return osObjectSchemaInfo$b0.g();
    }

    public static r j6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        List list0 = Collections.emptyList();
        r r0 = (r)f00.y3(r.class, true, list0);
        if(jSONObject0.has("writeEnable")) {
            if(jSONObject0.isNull("writeEnable")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'writeEnable\' to null.");
            }
            r0.L3(jSONObject0.getBoolean("writeEnable"));
        }
        if(jSONObject0.has("replyEnable")) {
            if(jSONObject0.isNull("replyEnable")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'replyEnable\' to null.");
            }
            r0.g4(jSONObject0.getBoolean("replyEnable"));
        }
        if(jSONObject0.has("writePrefix")) {
            if(jSONObject0.isNull("writePrefix")) {
                r0.E3(null);
            }
            else {
                r0.E3(jSONObject0.getString("writePrefix"));
            }
        }
        if(jSONObject0.has("writeSuffix")) {
            if(jSONObject0.isNull("writeSuffix")) {
                r0.l5(null);
            }
            else {
                r0.l5(jSONObject0.getString("writeSuffix"));
            }
        }
        if(jSONObject0.has("replySuffix")) {
            if(jSONObject0.isNull("replySuffix")) {
                r0.b5(null);
            }
            else {
                r0.b5(jSONObject0.getString("replySuffix"));
            }
        }
        if(jSONObject0.has("writePrefixColor")) {
            if(jSONObject0.isNull("writePrefixColor")) {
                r0.J3(null);
            }
            else {
                r0.J3(jSONObject0.getString("writePrefixColor"));
            }
        }
        if(jSONObject0.has("writeSuffixColor")) {
            if(jSONObject0.isNull("writeSuffixColor")) {
                r0.A0(null);
                return r0;
            }
            r0.A0(jSONObject0.getString("writeSuffixColor"));
        }
        return r0;
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public String k1() {
        this.l.f().k();
        return this.l.g().U(this.k.h);
    }

    @TargetApi(11)
    public static r k6(F0 f00, JsonReader jsonReader0) throws IOException {
        r r0 = new r();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("writeEnable")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    r0.L3(jsonReader0.nextBoolean());
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'writeEnable\' to null.");
            }
            if(s.equals("replyEnable")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    r0.g4(jsonReader0.nextBoolean());
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'replyEnable\' to null.");
            }
            if(s.equals("writePrefix")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    r0.E3(null);
                }
                else {
                    r0.E3(jsonReader0.nextString());
                }
            }
            else if(s.equals("writeSuffix")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    r0.l5(null);
                }
                else {
                    r0.l5(jsonReader0.nextString());
                }
            }
            else if(s.equals("replySuffix")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    r0.b5(null);
                }
                else {
                    r0.b5(jsonReader0.nextString());
                }
            }
            else if(s.equals("writePrefixColor")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    r0.J3(null);
                }
                else {
                    r0.J3(jsonReader0.nextString());
                }
            }
            else if(!s.equals("writeSuffixColor")) {
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                r0.A0(null);
            }
            else {
                r0.A0(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        return (r)f00.o2(r0, new W[0]);
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public void l5(String s) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            if(s == null) {
                u0.b().v0(this.k.h, u0.F(), true);
                return;
            }
            u0.b().y0(this.k.h, u0.F(), s, true);
            return;
        }
        this.l.f().k();
        if(s == null) {
            this.l.g().K(this.k.h);
            return;
        }
        this.l.g().a(this.k.h, s);
    }

    public static OsObjectSchemaInfo l6() {
        return o2.n;
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

    public static String m6() {
        return "GalleryTextOption";
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public String n2() {
        this.l.f().k();
        return this.l.g().U(this.k.j);
    }

    public static long n6(F0 f00, r r0, Map map0) {
        if(r0 instanceof s && !d1.F5(r0) && ((s)r0).R3().f() != null && ((s)r0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)r0).R3().g().F();
        }
        Table table0 = f00.n4(r.class);
        long v = table0.getNativePtr();
        b o2$b0 = (b)f00.e0().j(r.class);
        long v1 = OsObject.createRow(table0);
        map0.put(r0, v1);
        Table.nativeSetBoolean(v, o2$b0.e, v1, r0.y0(), false);
        Table.nativeSetBoolean(v, o2$b0.f, v1, r0.Z0(), false);
        String s = r0.N2();
        if(s != null) {
            Table.nativeSetString(v, o2$b0.g, v1, s, false);
        }
        String s1 = r0.k1();
        if(s1 != null) {
            Table.nativeSetString(v, o2$b0.h, v1, s1, false);
        }
        String s2 = r0.z1();
        if(s2 != null) {
            Table.nativeSetString(v, o2$b0.i, v1, s2, false);
        }
        String s3 = r0.n2();
        if(s3 != null) {
            Table.nativeSetString(v, o2$b0.j, v1, s3, false);
        }
        String s4 = r0.Q3();
        if(s4 != null) {
            Table.nativeSetString(v, o2$b0.k, v1, s4, false);
        }
        return v1;
    }

    public static void o6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(r.class);
        long v = table0.getNativePtr();
        b o2$b0 = (b)f00.e0().j(r.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            r r0 = (r)object0;
            if(map0.containsKey(r0)) {
            }
            else if(r0 instanceof s && !d1.F5(r0) && ((s)r0).R3().f() != null && ((s)r0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(r0, ((s)r0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(r0, v1);
                Table.nativeSetBoolean(v, o2$b0.e, v1, r0.y0(), false);
                Table.nativeSetBoolean(v, o2$b0.f, v1, r0.Z0(), false);
                String s = r0.N2();
                if(s != null) {
                    Table.nativeSetString(v, o2$b0.g, v1, s, false);
                }
                String s1 = r0.k1();
                if(s1 != null) {
                    Table.nativeSetString(v, o2$b0.h, v1, s1, false);
                }
                String s2 = r0.z1();
                if(s2 != null) {
                    Table.nativeSetString(v, o2$b0.i, v1, s2, false);
                }
                String s3 = r0.n2();
                if(s3 != null) {
                    Table.nativeSetString(v, o2$b0.j, v1, s3, false);
                }
                String s4 = r0.Q3();
                if(s4 != null) {
                    Table.nativeSetString(v, o2$b0.k, v1, s4, false);
                }
            }
        }
    }

    public static long p6(F0 f00, r r0, Map map0) {
        if(r0 instanceof s && !d1.F5(r0) && ((s)r0).R3().f() != null && ((s)r0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)r0).R3().g().F();
        }
        Table table0 = f00.n4(r.class);
        long v = table0.getNativePtr();
        b o2$b0 = (b)f00.e0().j(r.class);
        long v1 = OsObject.createRow(table0);
        map0.put(r0, v1);
        Table.nativeSetBoolean(v, o2$b0.e, v1, r0.y0(), false);
        Table.nativeSetBoolean(v, o2$b0.f, v1, r0.Z0(), false);
        String s = r0.N2();
        if(s == null) {
            Table.nativeSetNull(v, o2$b0.g, v1, false);
        }
        else {
            Table.nativeSetString(v, o2$b0.g, v1, s, false);
        }
        String s1 = r0.k1();
        if(s1 == null) {
            Table.nativeSetNull(v, o2$b0.h, v1, false);
        }
        else {
            Table.nativeSetString(v, o2$b0.h, v1, s1, false);
        }
        String s2 = r0.z1();
        if(s2 == null) {
            Table.nativeSetNull(v, o2$b0.i, v1, false);
        }
        else {
            Table.nativeSetString(v, o2$b0.i, v1, s2, false);
        }
        String s3 = r0.n2();
        if(s3 == null) {
            Table.nativeSetNull(v, o2$b0.j, v1, false);
        }
        else {
            Table.nativeSetString(v, o2$b0.j, v1, s3, false);
        }
        String s4 = r0.Q3();
        if(s4 != null) {
            Table.nativeSetString(v, o2$b0.k, v1, s4, false);
            return v1;
        }
        Table.nativeSetNull(v, o2$b0.k, v1, false);
        return v1;
    }

    public static void q6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(r.class);
        long v = table0.getNativePtr();
        b o2$b0 = (b)f00.e0().j(r.class);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            r r0 = (r)object0;
            if(map0.containsKey(r0)) {
            }
            else if(r0 instanceof s && !d1.F5(r0) && ((s)r0).R3().f() != null && ((s)r0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(r0, ((s)r0).R3().g().F());
            }
            else {
                long v1 = OsObject.createRow(table0);
                map0.put(r0, v1);
                Table.nativeSetBoolean(v, o2$b0.e, v1, r0.y0(), false);
                Table.nativeSetBoolean(v, o2$b0.f, v1, r0.Z0(), false);
                String s = r0.N2();
                if(s == null) {
                    Table.nativeSetNull(v, o2$b0.g, v1, false);
                }
                else {
                    Table.nativeSetString(v, o2$b0.g, v1, s, false);
                }
                String s1 = r0.k1();
                if(s1 == null) {
                    Table.nativeSetNull(v, o2$b0.h, v1, false);
                }
                else {
                    Table.nativeSetString(v, o2$b0.h, v1, s1, false);
                }
                String s2 = r0.z1();
                if(s2 == null) {
                    Table.nativeSetNull(v, o2$b0.i, v1, false);
                }
                else {
                    Table.nativeSetString(v, o2$b0.i, v1, s2, false);
                }
                String s3 = r0.n2();
                if(s3 == null) {
                    Table.nativeSetNull(v, o2$b0.j, v1, false);
                }
                else {
                    Table.nativeSetString(v, o2$b0.j, v1, s3, false);
                }
                String s4 = r0.Q3();
                if(s4 == null) {
                    Table.nativeSetNull(v, o2$b0.k, v1, false);
                }
                else {
                    Table.nativeSetString(v, o2$b0.k, v1, s4, false);
                }
            }
        }
    }

    static o2 r6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(r.class), false, Collections.emptyList());
        o2 o20 = new o2();
        a$h0.a();
        return o20;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("GalleryTextOption = proxy[");
        stringBuilder0.append("{writeEnable:");
        stringBuilder0.append(this.y0());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{replyEnable:");
        stringBuilder0.append(this.Z0());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{writePrefix:");
        String s = "null";
        stringBuilder0.append((this.N2() == null ? "null" : this.N2()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{writeSuffix:");
        stringBuilder0.append((this.k1() == null ? "null" : this.k1()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{replySuffix:");
        stringBuilder0.append((this.z1() == null ? "null" : this.z1()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{writePrefixColor:");
        stringBuilder0.append((this.n2() == null ? "null" : this.n2()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{writeSuffixColor:");
        if(this.Q3() != null) {
            s = this.Q3();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public boolean y0() {
        this.l.f().k();
        return this.l.g().Q(this.k.e);
    }

    @Override  // com.dcinside.app.realm.r, io.realm.p2
    public String z1() {
        this.l.f().k();
        return this.l.g().U(this.k.i);
    }
}

