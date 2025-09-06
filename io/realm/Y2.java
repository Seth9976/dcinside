package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.A;
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

public class y2 extends A implements s, z2 {
    public static final class a {
        public static final String a = "LastManagerSituation";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;

        b(OsSchemaInfo osSchemaInfo0) {
            super(4);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("LastManagerSituation");
            this.e = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.f = this.b("time", "time", osObjectSchemaInfo0);
            this.g = this.b("situation", "situation", osObjectSchemaInfo0);
            this.h = this.b("show", "show", osObjectSchemaInfo0);
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

    private b i;
    private A0 j;
    private static final String k = "";
    private static final OsObjectSchemaInfo l;

    static {
        y2.l = y2.e6();
    }

    y2() {
        this.j.p();
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.j;
    }

    @Override  // com.dcinside.app.realm.A, io.realm.z2
    public long V0() {
        this.j.f().k();
        return this.j.g().w(this.i.h);
    }

    @Override  // com.dcinside.app.realm.A, io.realm.z2
    public String a() {
        this.j.f().k();
        return this.j.g().U(this.i.e);
    }

    @Override  // com.dcinside.app.realm.A, io.realm.z2
    public void a1(String s) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            if(s == null) {
                u0.b().v0(this.i.g, u0.F(), true);
                return;
            }
            u0.b().y0(this.i.g, u0.F(), s, true);
            return;
        }
        this.j.f().k();
        if(s == null) {
            this.j.g().K(this.i.g);
            return;
        }
        this.j.g().a(this.i.g, s);
    }

    public static A a6(F0 f00, b y2$b0, A a0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(a0);
        if(s0 != null) {
            return (A)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(A.class), set0);
        osObjectBuilder0.n4(y2$b0.e, a0.a());
        osObjectBuilder0.n3(y2$b0.f, a0.d());
        osObjectBuilder0.n4(y2$b0.g, a0.t3());
        osObjectBuilder0.n3(y2$b0.h, a0.V0());
        A a1 = y2.n6(f00, osObjectBuilder0.v4());
        map0.put(a0, a1);
        return a1;
    }

    @Override  // com.dcinside.app.realm.A, io.realm.z2
    public void b(String s) {
        if(this.j.i()) {
            return;
        }
        this.j.f().k();
        throw new RealmException("Primary key field \'galleryId\' cannot be changed after object was created.");
    }

    public static A b6(F0 f00, b y2$b0, A a0, boolean z, Map map0, Set set0) {
        if(a0 instanceof s && !d1.F5(a0) && ((s)a0).R3().f() != null) {
            io.realm.a a1 = ((s)a0).R3().f();
            if(a1.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a1.getPath().equals(f00.getPath())) {
                return a0;
            }
        }
        y2 y20 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(a0);
        if(s0 != null) {
            return (A)s0;
        }
        if(z) {
            Table table0 = f00.n4(A.class);
            long v = y2$b0.e;
            String s1 = a0.a();
            long v1 = s1 == null ? table0.u(v) : table0.w(v, s1);
            if(v1 == -1L) {
                return y2.a6(f00, y2$b0, a0, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v1), y2$b0, false, Collections.emptyList());
                y20 = new y2();
                map0.put(a0, y20);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? y2.o6(f00, y2$b0, y20, a0, map0, set0) : y2.a6(f00, y2$b0, a0, z, map0, set0);
    }

    @Override  // com.dcinside.app.realm.A, io.realm.z2
    public void c(long v) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            u0.b().u0(this.i.f, u0.F(), v, true);
            return;
        }
        this.j.f().k();
        this.j.g().e(this.i.f, v);
    }

    public static b c6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    @Override  // com.dcinside.app.realm.A, io.realm.z2
    public long d() {
        this.j.f().k();
        return this.j.g().w(this.i.f);
    }

    public static A d6(A a0, int v, int v1, Map map0) {
        A a1;
        if(v <= v1 && a0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(a0);
            if(s$a0 == null) {
                a1 = new A();
                map0.put(a0, new io.realm.internal.s.a(v, a1));
            }
            else {
                if(v >= s$a0.a) {
                    return (A)s$a0.b;
                }
                s$a0.a = v;
                a1 = (A)s$a0.b;
            }
            F0 f00 = (F0)((s)a0).R3().f();
            a1.b(a0.a());
            a1.c(a0.d());
            a1.a1(a0.t3());
            a1.h4(a0.V0());
            return a1;
        }
        return null;
    }

    private static OsObjectSchemaInfo e6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "LastManagerSituation", false, 4, 0);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, true, false, false);
        osObjectSchemaInfo$b0.d("", "time", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "situation", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "show", RealmFieldType.INTEGER, false, false, true);
        return osObjectSchemaInfo$b0.g();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.j.f();
            io.realm.a a1 = ((y2)object0).j.f();
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
            String s3 = ((y2)object0).j.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.j.g().F() == ((y2)object0).j.g().F() : false;
            }
            return s3 == null ? this.j.g().F() == ((y2)object0).j.g().F() : false;
        }
        return false;
    }

    public static A f6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        A a0;
        List list0 = Collections.emptyList();
        Class class0 = A.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("galleryId") ? table0.u(v) : table0.w(v, jSONObject0.getString("galleryId"));
            if(v1 == -1L) {
                a0 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    a0 = new y2();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            a0 = null;
        }
        if(a0 == null) {
            if(!jSONObject0.has("galleryId")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'galleryId\'.");
            }
            a0 = jSONObject0.isNull("galleryId") ? ((y2)f00.v3(class0, null, true, list0)) : ((y2)f00.v3(class0, jSONObject0.getString("galleryId"), true, list0));
        }
        if(jSONObject0.has("time")) {
            if(jSONObject0.isNull("time")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
            }
            a0.c(jSONObject0.getLong("time"));
        }
        if(jSONObject0.has("situation")) {
            if(jSONObject0.isNull("situation")) {
                a0.a1(null);
            }
            else {
                a0.a1(jSONObject0.getString("situation"));
            }
        }
        if(jSONObject0.has("show")) {
            if(jSONObject0.isNull("show")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'show\' to null.");
            }
            a0.h4(jSONObject0.getLong("show"));
            return a0;
        }
        return a0;
    }

    @TargetApi(11)
    public static A g6(F0 f00, JsonReader jsonReader0) throws IOException {
        A a0 = new A();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("galleryId")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    a0.b(null);
                }
                else {
                    a0.b(jsonReader0.nextString());
                }
                z = true;
            }
            else {
                if(s.equals("time")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        a0.c(jsonReader0.nextLong());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
                }
                if(!s.equals("situation")) {
                    if(s.equals("show")) {
                        if(jsonReader0.peek() != JsonToken.NULL) {
                            a0.h4(jsonReader0.nextLong());
                            continue;
                        }
                        jsonReader0.skipValue();
                        throw new IllegalArgumentException("Trying to set non-nullable field \'show\' to null.");
                    }
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    a0.a1(null);
                }
                else {
                    a0.a1(jsonReader0.nextString());
                }
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'galleryId\'.");
        }
        return (A)f00.t2(a0, new W[0]);
    }

    @Override  // com.dcinside.app.realm.A, io.realm.z2
    public void h4(long v) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            u0.b().u0(this.i.h, u0.F(), v, true);
            return;
        }
        this.j.f().k();
        this.j.g().e(this.i.h, v);
    }

    public static OsObjectSchemaInfo h6() {
        return y2.l;
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

    public static String i6() {
        return "LastManagerSituation";
    }

    public static long j6(F0 f00, A a0, Map map0) {
        if(a0 instanceof s && !d1.F5(a0) && ((s)a0).R3().f() != null && ((s)a0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)a0).R3().g().F();
        }
        Table table0 = f00.n4(A.class);
        long v = table0.getNativePtr();
        b y2$b0 = (b)f00.e0().j(A.class);
        long v1 = y2$b0.e;
        String s = a0.a();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        else {
            Table.B0(s);
        }
        map0.put(a0, v2);
        Table.nativeSetLong(v, y2$b0.f, v2, a0.d(), false);
        String s1 = a0.t3();
        if(s1 != null) {
            Table.nativeSetString(v, y2$b0.g, v2, s1, false);
        }
        Table.nativeSetLong(v, y2$b0.h, v2, a0.V0(), false);
        return v2;
    }

    public static void k6(F0 f00, Iterator iterator0, Map map0) {
        long v3;
        Table table0 = f00.n4(A.class);
        long v = table0.getNativePtr();
        b y2$b0 = (b)f00.e0().j(A.class);
        long v1 = y2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            A a0 = (A)object0;
            if(map0.containsKey(a0)) {
            }
            else if(a0 instanceof s && !d1.F5(a0) && ((s)a0).R3().f() != null && ((s)a0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(a0, ((s)a0).R3().g().F());
            }
            else {
                String s = a0.a();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v3 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                else {
                    Table.B0(s);
                    v3 = v2;
                }
                map0.put(a0, v3);
                Table.nativeSetLong(v, y2$b0.f, v3, a0.d(), false);
                String s1 = a0.t3();
                if(s1 != null) {
                    Table.nativeSetString(v, y2$b0.g, v3, s1, false);
                }
                Table.nativeSetLong(v, y2$b0.h, v3, a0.V0(), false);
            }
        }
    }

    public static long l6(F0 f00, A a0, Map map0) {
        if(a0 instanceof s && !d1.F5(a0) && ((s)a0).R3().f() != null && ((s)a0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)a0).R3().g().F();
        }
        Table table0 = f00.n4(A.class);
        long v = table0.getNativePtr();
        b y2$b0 = (b)f00.e0().j(A.class);
        long v1 = y2$b0.e;
        String s = a0.a();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        map0.put(a0, v2);
        Table.nativeSetLong(v, y2$b0.f, v2, a0.d(), false);
        String s1 = a0.t3();
        if(s1 == null) {
            Table.nativeSetNull(v, y2$b0.g, v2, false);
        }
        else {
            Table.nativeSetString(v, y2$b0.g, v2, s1, false);
        }
        Table.nativeSetLong(v, y2$b0.h, v2, a0.V0(), false);
        return v2;
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.j != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.i = (b)a$h0.c();
        A0 a00 = new A0(this);
        this.j = a00;
        a00.r(a$h0.e());
        this.j.s(a$h0.f());
        this.j.o(a$h0.b());
        this.j.q(a$h0.d());
    }

    public static void m6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(A.class);
        long v = table0.getNativePtr();
        b y2$b0 = (b)f00.e0().j(A.class);
        long v1 = y2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            A a0 = (A)object0;
            if(map0.containsKey(a0)) {
            }
            else if(a0 instanceof s && !d1.F5(a0) && ((s)a0).R3().f() != null && ((s)a0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(a0, ((s)a0).R3().g().F());
            }
            else {
                String s = a0.a();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                long v3 = v2 == -1L ? OsObject.createRowWithPrimaryKey(table0, v1, s) : v2;
                map0.put(a0, v3);
                Table.nativeSetLong(v, y2$b0.f, v3, a0.d(), false);
                String s1 = a0.t3();
                if(s1 == null) {
                    Table.nativeSetNull(v, y2$b0.g, v3, false);
                }
                else {
                    Table.nativeSetString(v, y2$b0.g, v3, s1, false);
                }
                Table.nativeSetLong(v, y2$b0.h, v3, a0.V0(), false);
            }
        }
    }

    static y2 n6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(A.class), false, Collections.emptyList());
        y2 y20 = new y2();
        a$h0.a();
        return y20;
    }

    static A o6(F0 f00, b y2$b0, A a0, A a1, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(A.class), set0);
        osObjectBuilder0.n4(y2$b0.e, a1.a());
        osObjectBuilder0.n3(y2$b0.f, a1.d());
        osObjectBuilder0.n4(y2$b0.g, a1.t3());
        osObjectBuilder0.n3(y2$b0.h, a1.V0());
        osObjectBuilder0.x4();
        return a0;
    }

    @Override  // com.dcinside.app.realm.A, io.realm.z2
    public String t3() {
        this.j.f().k();
        return this.j.g().U(this.i.g);
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("LastManagerSituation = proxy[");
        stringBuilder0.append("{galleryId:");
        String s = "null";
        stringBuilder0.append((this.a() == null ? "null" : this.a()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{time:");
        stringBuilder0.append(this.d());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{situation:");
        if(this.t3() != null) {
            s = this.t3();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{show:");
        stringBuilder0.append(this.V0());
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

