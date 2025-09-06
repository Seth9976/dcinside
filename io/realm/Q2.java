package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.s;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.c;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.internal.u;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class q2 extends s implements io.realm.internal.s, r2 {
    public static final class a {
        public static final String a = "GalleryZipInfo";

    }

    static final class b extends c {
        long e;
        long f;
        long g;

        b(OsSchemaInfo osSchemaInfo0) {
            super(3);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("GalleryZipInfo");
            this.e = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.f = this.b("postHeads", "postHeads", osObjectSchemaInfo0);
            this.g = this.b("postHeadStoreTimeMs", "postHeadStoreTimeMs", osObjectSchemaInfo0);
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
        }
    }

    private b g;
    private A0 h;
    private static final String i = "";
    private static final OsObjectSchemaInfo j;

    static {
        q2.j = q2.U5();
    }

    q2() {
        this.h.p();
    }

    @Override  // com.dcinside.app.realm.s, io.realm.r2
    public long H3() {
        this.h.f().k();
        return this.h.g().w(this.g.g);
    }

    @Override  // com.dcinside.app.realm.s, io.realm.r2
    public byte[] I3() {
        this.h.f().k();
        return this.h.g().i(this.g.f);
    }

    public static s Q5(F0 f00, b q2$b0, s s0, boolean z, Map map0, Set set0) {
        io.realm.internal.s s1 = (io.realm.internal.s)map0.get(s0);
        if(s1 != null) {
            return (s)s1;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(s.class), set0);
        osObjectBuilder0.n4(q2$b0.e, s0.a());
        osObjectBuilder0.h1(q2$b0.f, s0.I3());
        osObjectBuilder0.n3(q2$b0.g, s0.H3());
        s s2 = q2.d6(f00, osObjectBuilder0.v4());
        map0.put(s0, s2);
        return s2;
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.h;
    }

    public static s R5(F0 f00, b q2$b0, s s0, boolean z, Map map0, Set set0) {
        if(s0 instanceof io.realm.internal.s && !d1.F5(s0) && ((io.realm.internal.s)s0).R3().f() != null) {
            io.realm.a a0 = ((io.realm.internal.s)s0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return s0;
            }
        }
        q2 q20 = null;
        h a$h0 = (h)io.realm.a.q.get();
        io.realm.internal.s s1 = (io.realm.internal.s)map0.get(s0);
        if(s1 != null) {
            return (s)s1;
        }
        if(z) {
            Table table0 = f00.n4(s.class);
            long v = q2$b0.e;
            String s2 = s0.a();
            long v1 = s2 == null ? table0.u(v) : table0.w(v, s2);
            if(v1 == -1L) {
                return q2.Q5(f00, q2$b0, s0, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v1), q2$b0, false, Collections.emptyList());
                q20 = new q2();
                map0.put(s0, q20);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? q2.e6(f00, q2$b0, q20, s0, map0, set0) : q2.Q5(f00, q2$b0, s0, z, map0, set0);
    }

    public static b S5(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static s T5(s s0, int v, int v1, Map map0) {
        s s1;
        if(v <= v1 && s0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(s0);
            if(s$a0 == null) {
                s1 = new s();
                map0.put(s0, new io.realm.internal.s.a(v, s1));
            }
            else {
                if(v >= s$a0.a) {
                    return (s)s$a0.b;
                }
                s$a0.a = v;
                s1 = (s)s$a0.b;
            }
            F0 f00 = (F0)((io.realm.internal.s)s0).R3().f();
            s1.b(s0.a());
            s1.v1(s0.I3());
            s1.v2(s0.H3());
            return s1;
        }
        return null;
    }

    private static OsObjectSchemaInfo U5() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "GalleryZipInfo", false, 3, 0);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, true, false, false);
        osObjectSchemaInfo$b0.d("", "postHeads", RealmFieldType.BINARY, false, false, false);
        osObjectSchemaInfo$b0.d("", "postHeadStoreTimeMs", RealmFieldType.INTEGER, false, false, true);
        return osObjectSchemaInfo$b0.g();
    }

    public static s V5(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        s s0;
        List list0 = Collections.emptyList();
        Class class0 = s.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("galleryId") ? table0.u(v) : table0.w(v, jSONObject0.getString("galleryId"));
            if(v1 == -1L) {
                s0 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    s0 = new q2();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            s0 = null;
        }
        if(s0 == null) {
            if(!jSONObject0.has("galleryId")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'galleryId\'.");
            }
            s0 = jSONObject0.isNull("galleryId") ? ((q2)f00.v3(class0, null, true, list0)) : ((q2)f00.v3(class0, jSONObject0.getString("galleryId"), true, list0));
        }
        if(jSONObject0.has("postHeads")) {
            if(jSONObject0.isNull("postHeads")) {
                s0.v1(null);
            }
            else {
                s0.v1(io.realm.internal.android.c.a(jSONObject0.getString("postHeads")));
            }
        }
        if(jSONObject0.has("postHeadStoreTimeMs")) {
            if(jSONObject0.isNull("postHeadStoreTimeMs")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'postHeadStoreTimeMs\' to null.");
            }
            s0.v2(jSONObject0.getLong("postHeadStoreTimeMs"));
            return s0;
        }
        return s0;
    }

    @TargetApi(11)
    public static s W5(F0 f00, JsonReader jsonReader0) throws IOException {
        s s0 = new s();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            if(s1.equals("galleryId")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    s0.b(null);
                }
                else {
                    s0.b(jsonReader0.nextString());
                }
                z = true;
            }
            else if(!s1.equals("postHeads")) {
                if(s1.equals("postHeadStoreTimeMs")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        s0.v2(jsonReader0.nextLong());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'postHeadStoreTimeMs\' to null.");
                }
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                s0.v1(null);
            }
            else {
                s0.v1(io.realm.internal.android.c.a(jsonReader0.nextString()));
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'galleryId\'.");
        }
        return (s)f00.t2(s0, new W[0]);
    }

    public static OsObjectSchemaInfo X5() {
        return q2.j;
    }

    public static String Y5() {
        return "GalleryZipInfo";
    }

    public static long Z5(F0 f00, s s0, Map map0) {
        if(s0 instanceof io.realm.internal.s && !d1.F5(s0) && ((io.realm.internal.s)s0).R3().f() != null && ((io.realm.internal.s)s0).R3().f().getPath().equals(f00.getPath())) {
            return ((io.realm.internal.s)s0).R3().g().F();
        }
        Table table0 = f00.n4(s.class);
        long v = table0.getNativePtr();
        b q2$b0 = (b)f00.e0().j(s.class);
        long v1 = q2$b0.e;
        String s1 = s0.a();
        long v2 = s1 == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s1);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s1);
        }
        else {
            Table.B0(s1);
        }
        map0.put(s0, v2);
        byte[] arr_b = s0.I3();
        if(arr_b != null) {
            Table.nativeSetByteArray(v, q2$b0.f, v2, arr_b, false);
        }
        Table.nativeSetLong(v, q2$b0.g, v2, s0.H3(), false);
        return v2;
    }

    @Override  // com.dcinside.app.realm.s, io.realm.r2
    public String a() {
        this.h.f().k();
        return this.h.g().U(this.g.e);
    }

    public static void a6(F0 f00, Iterator iterator0, Map map0) {
        long v3;
        Table table0 = f00.n4(s.class);
        long v = table0.getNativePtr();
        b q2$b0 = (b)f00.e0().j(s.class);
        long v1 = q2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            s s0 = (s)object0;
            if(map0.containsKey(s0)) {
            }
            else if(s0 instanceof io.realm.internal.s && !d1.F5(s0) && ((io.realm.internal.s)s0).R3().f() != null && ((io.realm.internal.s)s0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(s0, ((io.realm.internal.s)s0).R3().g().F());
            }
            else {
                String s1 = s0.a();
                long v2 = s1 == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s1);
                if(v2 == -1L) {
                    v3 = OsObject.createRowWithPrimaryKey(table0, v1, s1);
                }
                else {
                    Table.B0(s1);
                    v3 = v2;
                }
                map0.put(s0, v3);
                byte[] arr_b = s0.I3();
                if(arr_b != null) {
                    Table.nativeSetByteArray(v, q2$b0.f, v3, arr_b, false);
                }
                Table.nativeSetLong(v, q2$b0.g, v3, s0.H3(), false);
            }
        }
    }

    @Override  // com.dcinside.app.realm.s, io.realm.r2
    public void b(String s) {
        if(this.h.i()) {
            return;
        }
        this.h.f().k();
        throw new RealmException("Primary key field \'galleryId\' cannot be changed after object was created.");
    }

    public static long b6(F0 f00, s s0, Map map0) {
        if(s0 instanceof io.realm.internal.s && !d1.F5(s0) && ((io.realm.internal.s)s0).R3().f() != null && ((io.realm.internal.s)s0).R3().f().getPath().equals(f00.getPath())) {
            return ((io.realm.internal.s)s0).R3().g().F();
        }
        Table table0 = f00.n4(s.class);
        long v = table0.getNativePtr();
        b q2$b0 = (b)f00.e0().j(s.class);
        long v1 = q2$b0.e;
        String s1 = s0.a();
        long v2 = s1 == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s1);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s1);
        }
        map0.put(s0, v2);
        byte[] arr_b = s0.I3();
        if(arr_b == null) {
            Table.nativeSetNull(v, q2$b0.f, v2, false);
        }
        else {
            Table.nativeSetByteArray(v, q2$b0.f, v2, arr_b, false);
        }
        Table.nativeSetLong(v, q2$b0.g, v2, s0.H3(), false);
        return v2;
    }

    public static void c6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(s.class);
        long v = table0.getNativePtr();
        b q2$b0 = (b)f00.e0().j(s.class);
        long v1 = q2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            s s0 = (s)object0;
            if(map0.containsKey(s0)) {
            }
            else if(s0 instanceof io.realm.internal.s && !d1.F5(s0) && ((io.realm.internal.s)s0).R3().f() != null && ((io.realm.internal.s)s0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(s0, ((io.realm.internal.s)s0).R3().g().F());
            }
            else {
                String s1 = s0.a();
                long v2 = s1 == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s1);
                long v3 = v2 == -1L ? OsObject.createRowWithPrimaryKey(table0, v1, s1) : v2;
                map0.put(s0, v3);
                byte[] arr_b = s0.I3();
                if(arr_b == null) {
                    Table.nativeSetNull(v, q2$b0.f, v3, false);
                }
                else {
                    Table.nativeSetByteArray(v, q2$b0.f, v3, arr_b, false);
                }
                Table.nativeSetLong(v, q2$b0.g, v3, s0.H3(), false);
            }
        }
    }

    static q2 d6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(s.class), false, Collections.emptyList());
        q2 q20 = new q2();
        a$h0.a();
        return q20;
    }

    static s e6(F0 f00, b q2$b0, s s0, s s1, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(s.class), set0);
        osObjectBuilder0.n4(q2$b0.e, s1.a());
        osObjectBuilder0.h1(q2$b0.f, s1.I3());
        osObjectBuilder0.n3(q2$b0.g, s1.H3());
        osObjectBuilder0.x4();
        return s0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.h.f();
            io.realm.a a1 = ((q2)object0).h.f();
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
            String s2 = this.h.g().b().P();
            String s3 = ((q2)object0).h.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.h.g().F() == ((q2)object0).h.g().F() : false;
            }
            return s3 == null ? this.h.g().F() == ((q2)object0).h.g().F() : false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        String s = this.h.f().getPath();
        String s1 = this.h.g().b().P();
        long v = this.h.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.h != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.g = (b)a$h0.c();
        A0 a00 = new A0(this);
        this.h = a00;
        a00.r(a$h0.e());
        this.h.s(a$h0.f());
        this.h.o(a$h0.b());
        this.h.q(a$h0.d());
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("GalleryZipInfo = proxy[");
        stringBuilder0.append("{galleryId:");
        String s = "null";
        stringBuilder0.append((this.a() == null ? "null" : this.a()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{postHeads:");
        if(this.I3() != null) {
            s = "binary(" + this.I3().length + ")";
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{postHeadStoreTimeMs:");
        stringBuilder0.append(this.H3());
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // com.dcinside.app.realm.s, io.realm.r2
    public void v1(byte[] arr_b) {
        if(this.h.i()) {
            if(!this.h.d()) {
                return;
            }
            u u0 = this.h.g();
            if(arr_b == null) {
                u0.b().v0(this.g.f, u0.F(), true);
                return;
            }
            u0.b().l0(this.g.f, u0.F(), arr_b, true);
            return;
        }
        this.h.f().k();
        if(arr_b == null) {
            this.h.g().K(this.g.f);
            return;
        }
        this.h.g().m(this.g.f, arr_b);
    }

    @Override  // com.dcinside.app.realm.s, io.realm.r2
    public void v2(long v) {
        if(this.h.i()) {
            if(!this.h.d()) {
                return;
            }
            u u0 = this.h.g();
            u0.b().u0(this.g.g, u0.F(), v, true);
            return;
        }
        this.h.f().k();
        this.h.g().e(this.g.g, v);
    }
}

