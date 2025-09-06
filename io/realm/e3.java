package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.x0;
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

public class e3 extends x0 implements f3, s {
    public static final class a {
        public static final String a = "SearchGalleryItem";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;
        long i;

        b(OsSchemaInfo osSchemaInfo0) {
            super(5);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("SearchGalleryItem");
            this.e = this.b("id", "id", osObjectSchemaInfo0);
            this.f = this.b("name", "name", osObjectSchemaInfo0);
            this.g = this.b("isMinor", "isMinor", osObjectSchemaInfo0);
            this.h = this.b("isUnder", "isUnder", osObjectSchemaInfo0);
            this.i = this.b("linkTo", "linkTo", osObjectSchemaInfo0);
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

    private b i;
    private A0 j;
    private static final String k = "";
    private static final OsObjectSchemaInfo l;

    static {
        e3.l = e3.e6();
    }

    e3() {
        this.j.p();
    }

    @Override  // com.dcinside.app.realm.x0, io.realm.f3
    public boolean D1() {
        this.j.f().k();
        return this.j.g().Q(this.i.h);
    }

    @Override  // com.dcinside.app.realm.x0, io.realm.f3
    public void P3(boolean z) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            u0.b().m0(this.i.g, u0.F(), z, true);
            return;
        }
        this.j.f().k();
        this.j.g().p(this.i.g, z);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.j;
    }

    @Override  // com.dcinside.app.realm.x0, io.realm.f3
    public String Z3() {
        this.j.f().k();
        return this.j.g().U(this.i.i);
    }

    public static x0 a6(F0 f00, b e3$b0, x0 x00, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(x00);
        if(s0 != null) {
            return (x0)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(x0.class), set0);
        osObjectBuilder0.n4(e3$b0.e, x00.m());
        osObjectBuilder0.n4(e3$b0.f, x00.f());
        osObjectBuilder0.a1(e3$b0.g, Boolean.valueOf(x00.f2()));
        osObjectBuilder0.a1(e3$b0.h, Boolean.valueOf(x00.D1()));
        osObjectBuilder0.n4(e3$b0.i, x00.Z3());
        x0 x01 = e3.n6(f00, osObjectBuilder0.v4());
        map0.put(x00, x01);
        return x01;
    }

    public static x0 b6(F0 f00, b e3$b0, x0 x00, boolean z, Map map0, Set set0) {
        if(x00 instanceof s && !d1.F5(x00) && ((s)x00).R3().f() != null) {
            io.realm.a a0 = ((s)x00).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return x00;
            }
        }
        e3 e30 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(x00);
        if(s0 != null) {
            return (x0)s0;
        }
        if(z) {
            Table table0 = f00.n4(x0.class);
            long v = e3$b0.e;
            String s1 = x00.m();
            long v1 = s1 == null ? table0.u(v) : table0.w(v, s1);
            if(v1 == -1L) {
                return e3.a6(f00, e3$b0, x00, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v1), e3$b0, false, Collections.emptyList());
                e30 = new e3();
                map0.put(x00, e30);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? e3.o6(f00, e3$b0, e30, x00, map0, set0) : e3.a6(f00, e3$b0, x00, z, map0, set0);
    }

    public static b c6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static x0 d6(x0 x00, int v, int v1, Map map0) {
        x0 x01;
        if(v <= v1 && x00 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(x00);
            if(s$a0 == null) {
                x01 = new x0();
                map0.put(x00, new io.realm.internal.s.a(v, x01));
            }
            else {
                if(v >= s$a0.a) {
                    return (x0)s$a0.b;
                }
                s$a0.a = v;
                x01 = (x0)s$a0.b;
            }
            F0 f00 = (F0)((s)x00).R3().f();
            x01.q(x00.m());
            x01.e(x00.f());
            x01.P3(x00.f2());
            x01.k3(x00.D1());
            x01.y3(x00.Z3());
            return x01;
        }
        return null;
    }

    @Override  // com.dcinside.app.realm.x0, io.realm.f3
    public void e(String s) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            if(s == null) {
                u0.b().v0(this.i.f, u0.F(), true);
                return;
            }
            u0.b().y0(this.i.f, u0.F(), s, true);
            return;
        }
        this.j.f().k();
        if(s == null) {
            this.j.g().K(this.i.f);
            return;
        }
        this.j.g().a(this.i.f, s);
    }

    private static OsObjectSchemaInfo e6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "SearchGalleryItem", false, 5, 0);
        osObjectSchemaInfo$b0.d("", "id", RealmFieldType.STRING, true, false, false);
        osObjectSchemaInfo$b0.d("", "name", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "isMinor", RealmFieldType.BOOLEAN, false, false, true);
        osObjectSchemaInfo$b0.d("", "isUnder", RealmFieldType.BOOLEAN, false, false, true);
        osObjectSchemaInfo$b0.d("", "linkTo", RealmFieldType.STRING, false, false, false);
        return osObjectSchemaInfo$b0.g();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.j.f();
            io.realm.a a1 = ((e3)object0).j.f();
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
            String s3 = ((e3)object0).j.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.j.g().F() == ((e3)object0).j.g().F() : false;
            }
            return s3 == null ? this.j.g().F() == ((e3)object0).j.g().F() : false;
        }
        return false;
    }

    @Override  // com.dcinside.app.realm.x0, io.realm.f3
    public String f() {
        this.j.f().k();
        return this.j.g().U(this.i.f);
    }

    @Override  // com.dcinside.app.realm.x0, io.realm.f3
    public boolean f2() {
        this.j.f().k();
        return this.j.g().Q(this.i.g);
    }

    public static x0 f6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        x0 x00;
        List list0 = Collections.emptyList();
        Class class0 = x0.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("id") ? table0.u(v) : table0.w(v, jSONObject0.getString("id"));
            if(v1 == -1L) {
                x00 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    x00 = new e3();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            x00 = null;
        }
        if(x00 == null) {
            if(!jSONObject0.has("id")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'id\'.");
            }
            x00 = jSONObject0.isNull("id") ? ((e3)f00.v3(class0, null, true, list0)) : ((e3)f00.v3(class0, jSONObject0.getString("id"), true, list0));
        }
        if(jSONObject0.has("name")) {
            if(jSONObject0.isNull("name")) {
                x00.e(null);
            }
            else {
                x00.e(jSONObject0.getString("name"));
            }
        }
        if(jSONObject0.has("isMinor")) {
            if(jSONObject0.isNull("isMinor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'isMinor\' to null.");
            }
            x00.P3(jSONObject0.getBoolean("isMinor"));
        }
        if(jSONObject0.has("isUnder")) {
            if(jSONObject0.isNull("isUnder")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'isUnder\' to null.");
            }
            x00.k3(jSONObject0.getBoolean("isUnder"));
        }
        if(jSONObject0.has("linkTo")) {
            if(jSONObject0.isNull("linkTo")) {
                x00.y3(null);
                return x00;
            }
            x00.y3(jSONObject0.getString("linkTo"));
        }
        return x00;
    }

    @TargetApi(11)
    public static x0 g6(F0 f00, JsonReader jsonReader0) throws IOException {
        x0 x00 = new x0();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("id")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    x00.q(null);
                }
                else {
                    x00.q(jsonReader0.nextString());
                }
                z = true;
            }
            else if(!s.equals("name")) {
                if(s.equals("isMinor")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        x00.P3(jsonReader0.nextBoolean());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'isMinor\' to null.");
                }
                if(s.equals("isUnder")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        x00.k3(jsonReader0.nextBoolean());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'isUnder\' to null.");
                }
                if(!s.equals("linkTo")) {
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    x00.y3(null);
                }
                else {
                    x00.y3(jsonReader0.nextString());
                }
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                x00.e(null);
            }
            else {
                x00.e(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'id\'.");
        }
        return (x0)f00.t2(x00, new W[0]);
    }

    public static OsObjectSchemaInfo h6() {
        return e3.l;
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
        return "SearchGalleryItem";
    }

    public static long j6(F0 f00, x0 x00, Map map0) {
        if(x00 instanceof s && !d1.F5(x00) && ((s)x00).R3().f() != null && ((s)x00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)x00).R3().g().F();
        }
        Table table0 = f00.n4(x0.class);
        long v = table0.getNativePtr();
        b e3$b0 = (b)f00.e0().j(x0.class);
        long v1 = e3$b0.e;
        String s = x00.m();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        else {
            Table.B0(s);
        }
        map0.put(x00, v2);
        String s1 = x00.f();
        if(s1 != null) {
            Table.nativeSetString(v, e3$b0.f, v2, s1, false);
        }
        Table.nativeSetBoolean(v, e3$b0.g, v2, x00.f2(), false);
        Table.nativeSetBoolean(v, e3$b0.h, v2, x00.D1(), false);
        String s2 = x00.Z3();
        if(s2 != null) {
            Table.nativeSetString(v, e3$b0.i, v2, s2, false);
        }
        return v2;
    }

    @Override  // com.dcinside.app.realm.x0, io.realm.f3
    public void k3(boolean z) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            u0.b().m0(this.i.h, u0.F(), z, true);
            return;
        }
        this.j.f().k();
        this.j.g().p(this.i.h, z);
    }

    public static void k6(F0 f00, Iterator iterator0, Map map0) {
        x0 x01;
        long v3;
        Table table0 = f00.n4(x0.class);
        long v = table0.getNativePtr();
        b e3$b0 = (b)f00.e0().j(x0.class);
        long v1 = e3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            x0 x00 = (x0)object0;
            if(map0.containsKey(x00)) {
            }
            else if(x00 instanceof s && !d1.F5(x00) && ((s)x00).R3().f() != null && ((s)x00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(x00, ((s)x00).R3().g().F());
            }
            else {
                String s = x00.m();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v3 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                else {
                    Table.B0(s);
                    v3 = v2;
                }
                map0.put(x00, v3);
                String s1 = x00.f();
                if(s1 == null) {
                    x01 = x00;
                }
                else {
                    x01 = x00;
                    Table.nativeSetString(v, e3$b0.f, v3, s1, false);
                }
                Table.nativeSetBoolean(v, e3$b0.g, v3, x01.f2(), false);
                Table.nativeSetBoolean(v, e3$b0.h, v3, x01.D1(), false);
                String s2 = x01.Z3();
                if(s2 != null) {
                    Table.nativeSetString(v, e3$b0.i, v3, s2, false);
                }
            }
        }
    }

    public static long l6(F0 f00, x0 x00, Map map0) {
        if(x00 instanceof s && !d1.F5(x00) && ((s)x00).R3().f() != null && ((s)x00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)x00).R3().g().F();
        }
        Table table0 = f00.n4(x0.class);
        long v = table0.getNativePtr();
        b e3$b0 = (b)f00.e0().j(x0.class);
        long v1 = e3$b0.e;
        String s = x00.m();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        map0.put(x00, v2);
        String s1 = x00.f();
        if(s1 == null) {
            Table.nativeSetNull(v, e3$b0.f, v2, false);
        }
        else {
            Table.nativeSetString(v, e3$b0.f, v2, s1, false);
        }
        Table.nativeSetBoolean(v, e3$b0.g, v2, x00.f2(), false);
        Table.nativeSetBoolean(v, e3$b0.h, v2, x00.D1(), false);
        String s2 = x00.Z3();
        if(s2 != null) {
            Table.nativeSetString(v, e3$b0.i, v2, s2, false);
            return v2;
        }
        Table.nativeSetNull(v, e3$b0.i, v2, false);
        return v2;
    }

    @Override  // com.dcinside.app.realm.x0, io.realm.f3
    public String m() {
        this.j.f().k();
        return this.j.g().U(this.i.e);
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
        x0 x01;
        Table table0 = f00.n4(x0.class);
        long v = table0.getNativePtr();
        b e3$b0 = (b)f00.e0().j(x0.class);
        long v1 = e3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            x0 x00 = (x0)object0;
            if(map0.containsKey(x00)) {
            }
            else if(x00 instanceof s && !d1.F5(x00) && ((s)x00).R3().f() != null && ((s)x00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(x00, ((s)x00).R3().g().F());
            }
            else {
                String s = x00.m();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                long v3 = v2 == -1L ? OsObject.createRowWithPrimaryKey(table0, v1, s) : v2;
                map0.put(x00, v3);
                String s1 = x00.f();
                if(s1 == null) {
                    x01 = x00;
                    Table.nativeSetNull(v, e3$b0.f, v3, false);
                }
                else {
                    x01 = x00;
                    Table.nativeSetString(v, e3$b0.f, v3, s1, false);
                }
                Table.nativeSetBoolean(v, e3$b0.g, v3, x01.f2(), false);
                Table.nativeSetBoolean(v, e3$b0.h, v3, x01.D1(), false);
                String s2 = x01.Z3();
                if(s2 == null) {
                    Table.nativeSetNull(v, e3$b0.i, v3, false);
                }
                else {
                    Table.nativeSetString(v, e3$b0.i, v3, s2, false);
                }
            }
        }
    }

    static e3 n6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(x0.class), false, Collections.emptyList());
        e3 e30 = new e3();
        a$h0.a();
        return e30;
    }

    static x0 o6(F0 f00, b e3$b0, x0 x00, x0 x01, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(x0.class), set0);
        osObjectBuilder0.n4(e3$b0.e, x01.m());
        osObjectBuilder0.n4(e3$b0.f, x01.f());
        osObjectBuilder0.a1(e3$b0.g, Boolean.valueOf(x01.f2()));
        osObjectBuilder0.a1(e3$b0.h, Boolean.valueOf(x01.D1()));
        osObjectBuilder0.n4(e3$b0.i, x01.Z3());
        osObjectBuilder0.x4();
        return x00;
    }

    @Override  // com.dcinside.app.realm.x0, io.realm.f3
    public void q(String s) {
        if(this.j.i()) {
            return;
        }
        this.j.f().k();
        throw new RealmException("Primary key field \'id\' cannot be changed after object was created.");
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("SearchGalleryItem = proxy[");
        stringBuilder0.append("{id:");
        String s = "null";
        stringBuilder0.append((this.m() == null ? "null" : this.m()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{name:");
        stringBuilder0.append((this.f() == null ? "null" : this.f()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{isMinor:");
        stringBuilder0.append(this.f2());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{isUnder:");
        stringBuilder0.append(this.D1());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{linkTo:");
        if(this.Z3() != null) {
            s = this.Z3();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // com.dcinside.app.realm.x0, io.realm.f3
    public void y3(String s) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            if(s == null) {
                u0.b().v0(this.i.i, u0.F(), true);
                return;
            }
            u0.b().y0(this.i.i, u0.F(), s, true);
            return;
        }
        this.j.f().k();
        if(s == null) {
            this.j.g().K(this.i.i);
            return;
        }
        this.j.g().a(this.i.i, s);
    }
}

