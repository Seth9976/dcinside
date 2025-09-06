package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.v0;
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

public class a3 extends v0 implements b3, s {
    public static final class a {
        public static final String a = "ReplyHistory";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;

        b(OsSchemaInfo osSchemaInfo0) {
            super(4);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("ReplyHistory");
            this.e = this.b("key", "key", osObjectSchemaInfo0);
            this.f = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.g = this.b("postNumber", "postNumber", osObjectSchemaInfo0);
            this.h = this.b("commentNumber", "commentNumber", osObjectSchemaInfo0);
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
        a3.l = a3.e6();
    }

    a3() {
        this.j.p();
    }

    @Override  // com.dcinside.app.realm.v0, io.realm.b3
    public void C1(int v) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            u0.b().u0(this.i.h, u0.F(), ((long)v), true);
            return;
        }
        this.j.f().k();
        this.j.g().e(this.i.h, ((long)v));
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.j;
    }

    @Override  // com.dcinside.app.realm.v0, io.realm.b3
    public String a() {
        this.j.f().k();
        return this.j.g().U(this.i.f);
    }

    public static v0 a6(F0 f00, b a3$b0, v0 v00, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(v00);
        if(s0 != null) {
            return (v0)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(v0.class), set0);
        osObjectBuilder0.n4(a3$b0.e, v00.i());
        osObjectBuilder0.n4(a3$b0.f, v00.a());
        osObjectBuilder0.i3(a3$b0.g, v00.g());
        osObjectBuilder0.i3(a3$b0.h, v00.j1());
        v0 v01 = a3.n6(f00, osObjectBuilder0.v4());
        map0.put(v00, v01);
        return v01;
    }

    @Override  // com.dcinside.app.realm.v0, io.realm.b3
    public void b(String s) {
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

    public static v0 b6(F0 f00, b a3$b0, v0 v00, boolean z, Map map0, Set set0) {
        if(v00 instanceof s && !d1.F5(v00) && ((s)v00).R3().f() != null) {
            io.realm.a a0 = ((s)v00).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return v00;
            }
        }
        a3 a30 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(v00);
        if(s0 != null) {
            return (v0)s0;
        }
        if(z) {
            Table table0 = f00.n4(v0.class);
            long v = a3$b0.e;
            String s1 = v00.i();
            long v1 = s1 == null ? table0.u(v) : table0.w(v, s1);
            if(v1 == -1L) {
                return a3.a6(f00, a3$b0, v00, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v1), a3$b0, false, Collections.emptyList());
                a30 = new a3();
                map0.put(v00, a30);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? a3.o6(f00, a3$b0, a30, v00, map0, set0) : a3.a6(f00, a3$b0, v00, z, map0, set0);
    }

    public static b c6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static v0 d6(v0 v00, int v, int v1, Map map0) {
        v0 v01;
        if(v <= v1 && v00 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(v00);
            if(s$a0 == null) {
                v01 = new v0();
                map0.put(v00, new io.realm.internal.s.a(v, v01));
            }
            else {
                if(v >= s$a0.a) {
                    return (v0)s$a0.b;
                }
                s$a0.a = v;
                v01 = (v0)s$a0.b;
            }
            F0 f00 = (F0)((s)v00).R3().f();
            v01.n(v00.i());
            v01.b(v00.a());
            v01.o(v00.g());
            v01.C1(v00.j1());
            return v01;
        }
        return null;
    }

    private static OsObjectSchemaInfo e6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "ReplyHistory", false, 4, 0);
        osObjectSchemaInfo$b0.d("", "key", RealmFieldType.STRING, true, false, false);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "postNumber", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "commentNumber", RealmFieldType.INTEGER, false, false, true);
        return osObjectSchemaInfo$b0.g();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.j.f();
            io.realm.a a1 = ((a3)object0).j.f();
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
            String s3 = ((a3)object0).j.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.j.g().F() == ((a3)object0).j.g().F() : false;
            }
            return s3 == null ? this.j.g().F() == ((a3)object0).j.g().F() : false;
        }
        return false;
    }

    public static v0 f6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        v0 v00;
        List list0 = Collections.emptyList();
        Class class0 = v0.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("key") ? table0.u(v) : table0.w(v, jSONObject0.getString("key"));
            if(v1 == -1L) {
                v00 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    v00 = new a3();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            v00 = null;
        }
        if(v00 == null) {
            if(!jSONObject0.has("key")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'key\'.");
            }
            v00 = jSONObject0.isNull("key") ? ((a3)f00.v3(class0, null, true, list0)) : ((a3)f00.v3(class0, jSONObject0.getString("key"), true, list0));
        }
        if(jSONObject0.has("galleryId")) {
            if(jSONObject0.isNull("galleryId")) {
                v00.b(null);
            }
            else {
                v00.b(jSONObject0.getString("galleryId"));
            }
        }
        if(jSONObject0.has("postNumber")) {
            if(jSONObject0.isNull("postNumber")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'postNumber\' to null.");
            }
            v00.o(jSONObject0.getInt("postNumber"));
        }
        if(jSONObject0.has("commentNumber")) {
            if(jSONObject0.isNull("commentNumber")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'commentNumber\' to null.");
            }
            v00.C1(jSONObject0.getInt("commentNumber"));
            return v00;
        }
        return v00;
    }

    @Override  // com.dcinside.app.realm.v0, io.realm.b3
    public int g() {
        this.j.f().k();
        return (int)this.j.g().w(this.i.g);
    }

    @TargetApi(11)
    public static v0 g6(F0 f00, JsonReader jsonReader0) throws IOException {
        v0 v00 = new v0();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("key")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    v00.n(null);
                }
                else {
                    v00.n(jsonReader0.nextString());
                }
                z = true;
            }
            else if(!s.equals("galleryId")) {
                if(s.equals("postNumber")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        v00.o(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'postNumber\' to null.");
                }
                if(s.equals("commentNumber")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        v00.C1(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'commentNumber\' to null.");
                }
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                v00.b(null);
            }
            else {
                v00.b(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'key\'.");
        }
        return (v0)f00.t2(v00, new W[0]);
    }

    public static OsObjectSchemaInfo h6() {
        return a3.l;
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

    @Override  // com.dcinside.app.realm.v0, io.realm.b3
    public String i() {
        this.j.f().k();
        return this.j.g().U(this.i.e);
    }

    public static String i6() {
        return "ReplyHistory";
    }

    @Override  // com.dcinside.app.realm.v0, io.realm.b3
    public int j1() {
        this.j.f().k();
        return (int)this.j.g().w(this.i.h);
    }

    public static long j6(F0 f00, v0 v00, Map map0) {
        if(v00 instanceof s && !d1.F5(v00) && ((s)v00).R3().f() != null && ((s)v00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)v00).R3().g().F();
        }
        Table table0 = f00.n4(v0.class);
        long v = table0.getNativePtr();
        b a3$b0 = (b)f00.e0().j(v0.class);
        long v1 = a3$b0.e;
        String s = v00.i();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        else {
            Table.B0(s);
        }
        map0.put(v00, v2);
        String s1 = v00.a();
        if(s1 != null) {
            Table.nativeSetString(v, a3$b0.f, v2, s1, false);
        }
        Table.nativeSetLong(v, a3$b0.g, v2, v00.g(), false);
        Table.nativeSetLong(v, a3$b0.h, v2, v00.j1(), false);
        return v2;
    }

    public static void k6(F0 f00, Iterator iterator0, Map map0) {
        long v3;
        Table table0 = f00.n4(v0.class);
        long v = table0.getNativePtr();
        b a3$b0 = (b)f00.e0().j(v0.class);
        long v1 = a3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            v0 v00 = (v0)object0;
            if(map0.containsKey(v00)) {
            }
            else if(v00 instanceof s && !d1.F5(v00) && ((s)v00).R3().f() != null && ((s)v00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(v00, ((s)v00).R3().g().F());
            }
            else {
                String s = v00.i();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v3 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                else {
                    Table.B0(s);
                    v3 = v2;
                }
                map0.put(v00, v3);
                String s1 = v00.a();
                if(s1 != null) {
                    Table.nativeSetString(v, a3$b0.f, v3, s1, false);
                }
                Table.nativeSetLong(v, a3$b0.g, v3, v00.g(), false);
                Table.nativeSetLong(v, a3$b0.h, v3, v00.j1(), false);
            }
        }
    }

    public static long l6(F0 f00, v0 v00, Map map0) {
        if(v00 instanceof s && !d1.F5(v00) && ((s)v00).R3().f() != null && ((s)v00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)v00).R3().g().F();
        }
        Table table0 = f00.n4(v0.class);
        long v = table0.getNativePtr();
        b a3$b0 = (b)f00.e0().j(v0.class);
        long v1 = a3$b0.e;
        String s = v00.i();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        map0.put(v00, v2);
        String s1 = v00.a();
        if(s1 == null) {
            Table.nativeSetNull(v, a3$b0.f, v2, false);
        }
        else {
            Table.nativeSetString(v, a3$b0.f, v2, s1, false);
        }
        Table.nativeSetLong(v, a3$b0.g, v2, v00.g(), false);
        Table.nativeSetLong(v, a3$b0.h, v2, v00.j1(), false);
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
        Table table0 = f00.n4(v0.class);
        long v = table0.getNativePtr();
        b a3$b0 = (b)f00.e0().j(v0.class);
        long v1 = a3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            v0 v00 = (v0)object0;
            if(map0.containsKey(v00)) {
            }
            else if(v00 instanceof s && !d1.F5(v00) && ((s)v00).R3().f() != null && ((s)v00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(v00, ((s)v00).R3().g().F());
            }
            else {
                String s = v00.i();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                long v3 = v2 == -1L ? OsObject.createRowWithPrimaryKey(table0, v1, s) : v2;
                map0.put(v00, v3);
                String s1 = v00.a();
                if(s1 == null) {
                    Table.nativeSetNull(v, a3$b0.f, v3, false);
                }
                else {
                    Table.nativeSetString(v, a3$b0.f, v3, s1, false);
                }
                Table.nativeSetLong(v, a3$b0.g, v3, v00.g(), false);
                Table.nativeSetLong(v, a3$b0.h, v3, v00.j1(), false);
            }
        }
    }

    @Override  // com.dcinside.app.realm.v0, io.realm.b3
    public void n(String s) {
        if(this.j.i()) {
            return;
        }
        this.j.f().k();
        throw new RealmException("Primary key field \'key\' cannot be changed after object was created.");
    }

    static a3 n6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(v0.class), false, Collections.emptyList());
        a3 a30 = new a3();
        a$h0.a();
        return a30;
    }

    @Override  // com.dcinside.app.realm.v0, io.realm.b3
    public void o(int v) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            u0.b().u0(this.i.g, u0.F(), ((long)v), true);
            return;
        }
        this.j.f().k();
        this.j.g().e(this.i.g, ((long)v));
    }

    static v0 o6(F0 f00, b a3$b0, v0 v00, v0 v01, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(v0.class), set0);
        osObjectBuilder0.n4(a3$b0.e, v01.i());
        osObjectBuilder0.n4(a3$b0.f, v01.a());
        osObjectBuilder0.i3(a3$b0.g, v01.g());
        osObjectBuilder0.i3(a3$b0.h, v01.j1());
        osObjectBuilder0.x4();
        return v00;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("ReplyHistory = proxy[");
        stringBuilder0.append("{key:");
        String s = "null";
        stringBuilder0.append((this.i() == null ? "null" : this.i()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryId:");
        if(this.a() != null) {
            s = this.a();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{postNumber:");
        stringBuilder0.append(this.g());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{commentNumber:");
        stringBuilder0.append(this.j1());
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

