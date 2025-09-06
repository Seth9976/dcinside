package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.n;
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

public class i2 extends n implements s, j2 {
    public static final class a {
        public static final String a = "FcmMsg";

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
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("FcmMsg");
            this.e = this.b("idx", "idx", osObjectSchemaInfo0);
            this.f = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.g = this.b("postNumber", "postNumber", osObjectSchemaInfo0);
            this.h = this.b("count", "count", osObjectSchemaInfo0);
            this.i = this.b("time", "time", osObjectSchemaInfo0);
            this.j = this.b("pushType", "pushType", osObjectSchemaInfo0);
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
        i2.n = i2.g6();
    }

    i2() {
        this.l.p();
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public String K2() {
        this.l.f().k();
        return this.l.g().U(this.k.j);
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public void K4(int v) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            u0.b().u0(this.k.h, u0.F(), ((long)v), true);
            return;
        }
        this.l.f().k();
        this.l.g().e(this.k.h, ((long)v));
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public long P() {
        this.l.f().k();
        return this.l.g().w(this.k.e);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.l;
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public void Z(long v) {
        if(this.l.i()) {
            return;
        }
        this.l.f().k();
        throw new RealmException("Primary key field \'idx\' cannot be changed after object was created.");
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public String a() {
        this.l.f().k();
        return this.l.g().U(this.k.f);
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public void b(String s) {
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

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public void c(long v) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            u0.b().u0(this.k.i, u0.F(), v, true);
            return;
        }
        this.l.f().k();
        this.l.g().e(this.k.i, v);
    }

    public static n c6(F0 f00, b i2$b0, n n0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(n0);
        if(s0 != null) {
            return (n)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(n.class), set0);
        osObjectBuilder0.n3(i2$b0.e, n0.P());
        osObjectBuilder0.n4(i2$b0.f, n0.a());
        osObjectBuilder0.i3(i2$b0.g, n0.g());
        osObjectBuilder0.i3(i2$b0.h, n0.g2());
        osObjectBuilder0.n3(i2$b0.i, n0.d());
        osObjectBuilder0.n4(i2$b0.j, n0.K2());
        n n1 = i2.p6(f00, osObjectBuilder0.v4());
        map0.put(n0, n1);
        return n1;
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public long d() {
        this.l.f().k();
        return this.l.g().w(this.k.i);
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public void d5(String s) {
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

    public static n d6(F0 f00, b i2$b0, n n0, boolean z, Map map0, Set set0) {
        if(n0 instanceof s && !d1.F5(n0) && ((s)n0).R3().f() != null) {
            io.realm.a a0 = ((s)n0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return n0;
            }
        }
        i2 i20 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(n0);
        if(s0 != null) {
            return (n)s0;
        }
        if(z) {
            Table table0 = f00.n4(n.class);
            long v = table0.t(i2$b0.e, n0.P());
            if(v == -1L) {
                return i2.c6(f00, i2$b0, n0, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v), i2$b0, false, Collections.emptyList());
                i20 = new i2();
                map0.put(n0, i20);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? i2.q6(f00, i2$b0, i20, n0, map0, set0) : i2.c6(f00, i2$b0, n0, z, map0, set0);
    }

    public static b e6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.l.f();
            io.realm.a a1 = ((i2)object0).l.f();
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
            String s3 = ((i2)object0).l.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.l.g().F() == ((i2)object0).l.g().F() : false;
            }
            return s3 == null ? this.l.g().F() == ((i2)object0).l.g().F() : false;
        }
        return false;
    }

    public static n f6(n n0, int v, int v1, Map map0) {
        n n1;
        if(v <= v1 && n0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(n0);
            if(s$a0 == null) {
                n1 = new n();
                map0.put(n0, new io.realm.internal.s.a(v, n1));
            }
            else {
                if(v >= s$a0.a) {
                    return (n)s$a0.b;
                }
                s$a0.a = v;
                n1 = (n)s$a0.b;
            }
            F0 f00 = (F0)((s)n0).R3().f();
            n1.Z(n0.P());
            n1.b(n0.a());
            n1.o(n0.g());
            n1.K4(n0.g2());
            n1.c(n0.d());
            n1.d5(n0.K2());
            return n1;
        }
        return null;
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public int g() {
        this.l.f().k();
        return (int)this.l.g().w(this.k.g);
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public int g2() {
        this.l.f().k();
        return (int)this.l.g().w(this.k.h);
    }

    private static OsObjectSchemaInfo g6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "FcmMsg", false, 6, 0);
        osObjectSchemaInfo$b0.d("", "idx", RealmFieldType.INTEGER, true, false, true);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "postNumber", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "count", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "time", RealmFieldType.INTEGER, false, true, true);
        osObjectSchemaInfo$b0.d("", "pushType", RealmFieldType.STRING, false, false, false);
        return osObjectSchemaInfo$b0.g();
    }

    public static n h6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        n n0;
        List list0 = Collections.emptyList();
        Class class0 = n.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("idx") ? -1L : table0.t(v, jSONObject0.getLong("idx"));
            if(v1 == -1L) {
                n0 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    n0 = new i2();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            n0 = null;
        }
        if(n0 == null) {
            if(!jSONObject0.has("idx")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'idx\'.");
            }
            n0 = jSONObject0.isNull("idx") ? ((i2)f00.v3(class0, null, true, list0)) : ((i2)f00.v3(class0, jSONObject0.getLong("idx"), true, list0));
        }
        if(jSONObject0.has("galleryId")) {
            if(jSONObject0.isNull("galleryId")) {
                n0.b(null);
            }
            else {
                n0.b(jSONObject0.getString("galleryId"));
            }
        }
        if(jSONObject0.has("postNumber")) {
            if(jSONObject0.isNull("postNumber")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'postNumber\' to null.");
            }
            n0.o(jSONObject0.getInt("postNumber"));
        }
        if(jSONObject0.has("count")) {
            if(jSONObject0.isNull("count")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'count\' to null.");
            }
            n0.K4(jSONObject0.getInt("count"));
        }
        if(jSONObject0.has("time")) {
            if(jSONObject0.isNull("time")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
            }
            n0.c(jSONObject0.getLong("time"));
        }
        if(jSONObject0.has("pushType")) {
            if(jSONObject0.isNull("pushType")) {
                n0.d5(null);
                return n0;
            }
            n0.d5(jSONObject0.getString("pushType"));
        }
        return n0;
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

    @TargetApi(11)
    public static n i6(F0 f00, JsonReader jsonReader0) throws IOException {
        n n0 = new n();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("idx")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    n0.Z(jsonReader0.nextLong());
                    z = true;
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'idx\' to null.");
            }
            if(!s.equals("galleryId")) {
                if(s.equals("postNumber")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        n0.o(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'postNumber\' to null.");
                }
                if(s.equals("count")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        n0.K4(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'count\' to null.");
                }
                if(s.equals("time")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        n0.c(jsonReader0.nextLong());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
                }
                if(!s.equals("pushType")) {
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    n0.d5(null);
                }
                else {
                    n0.d5(jsonReader0.nextString());
                }
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                n0.b(null);
            }
            else {
                n0.b(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'idx\'.");
        }
        return (n)f00.t2(n0, new W[0]);
    }

    public static OsObjectSchemaInfo j6() {
        return i2.n;
    }

    public static String k6() {
        return "FcmMsg";
    }

    public static long l6(F0 f00, n n0, Map map0) {
        if(n0 instanceof s && !d1.F5(n0) && ((s)n0).R3().f() != null && ((s)n0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)n0).R3().g().F();
        }
        Table table0 = f00.n4(n.class);
        long v = table0.getNativePtr();
        b i2$b0 = (b)f00.e0().j(n.class);
        long v1 = i2$b0.e;
        Long long0 = n0.P();
        long v2 = Table.nativeFindFirstInt(v, v1, n0.P());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, n0.P());
        }
        else {
            Table.B0(long0);
        }
        map0.put(n0, v2);
        String s = n0.a();
        if(s != null) {
            Table.nativeSetString(v, i2$b0.f, v2, s, false);
        }
        Table.nativeSetLong(v, i2$b0.g, v2, n0.g(), false);
        Table.nativeSetLong(v, i2$b0.h, v2, n0.g2(), false);
        Table.nativeSetLong(v, i2$b0.i, v2, n0.d(), false);
        String s1 = n0.K2();
        if(s1 != null) {
            Table.nativeSetString(v, i2$b0.j, v2, s1, false);
        }
        return v2;
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

    public static void m6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(n.class);
        long v = table0.getNativePtr();
        b i2$b0 = (b)f00.e0().j(n.class);
        long v1 = i2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            n n0 = (n)object0;
            if(map0.containsKey(n0)) {
            }
            else if(n0 instanceof s && !d1.F5(n0) && ((s)n0).R3().f() != null && ((s)n0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(n0, ((s)n0).R3().g().F());
            }
            else {
                Long long0 = n0.P();
                long v2 = Table.nativeFindFirstInt(v, v1, n0.P());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, n0.P());
                }
                else {
                    Table.B0(long0);
                }
                map0.put(n0, v2);
                String s = n0.a();
                if(s != null) {
                    Table.nativeSetString(v, i2$b0.f, v2, s, false);
                }
                Table.nativeSetLong(v, i2$b0.g, v2, n0.g(), false);
                Table.nativeSetLong(v, i2$b0.h, v2, n0.g2(), false);
                Table.nativeSetLong(v, i2$b0.i, v2, n0.d(), false);
                String s1 = n0.K2();
                if(s1 != null) {
                    Table.nativeSetString(v, i2$b0.j, v2, s1, false);
                }
            }
        }
    }

    public static long n6(F0 f00, n n0, Map map0) {
        if(n0 instanceof s && !d1.F5(n0) && ((s)n0).R3().f() != null && ((s)n0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)n0).R3().g().F();
        }
        Table table0 = f00.n4(n.class);
        long v = table0.getNativePtr();
        b i2$b0 = (b)f00.e0().j(n.class);
        long v1 = i2$b0.e;
        n0.P();
        long v2 = Table.nativeFindFirstInt(v, v1, n0.P());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, n0.P());
        }
        map0.put(n0, v2);
        String s = n0.a();
        if(s == null) {
            Table.nativeSetNull(v, i2$b0.f, v2, false);
        }
        else {
            Table.nativeSetString(v, i2$b0.f, v2, s, false);
        }
        Table.nativeSetLong(v, i2$b0.g, v2, n0.g(), false);
        Table.nativeSetLong(v, i2$b0.h, v2, n0.g2(), false);
        Table.nativeSetLong(v, i2$b0.i, v2, n0.d(), false);
        String s1 = n0.K2();
        if(s1 != null) {
            Table.nativeSetString(v, i2$b0.j, v2, s1, false);
            return v2;
        }
        Table.nativeSetNull(v, i2$b0.j, v2, false);
        return v2;
    }

    @Override  // com.dcinside.app.realm.n, io.realm.j2
    public void o(int v) {
        if(this.l.i()) {
            if(!this.l.d()) {
                return;
            }
            u u0 = this.l.g();
            u0.b().u0(this.k.g, u0.F(), ((long)v), true);
            return;
        }
        this.l.f().k();
        this.l.g().e(this.k.g, ((long)v));
    }

    public static void o6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(n.class);
        long v = table0.getNativePtr();
        b i2$b0 = (b)f00.e0().j(n.class);
        long v1 = i2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            n n0 = (n)object0;
            if(map0.containsKey(n0)) {
            }
            else if(n0 instanceof s && !d1.F5(n0) && ((s)n0).R3().f() != null && ((s)n0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(n0, ((s)n0).R3().g().F());
            }
            else {
                n0.P();
                long v2 = Table.nativeFindFirstInt(v, v1, n0.P());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, n0.P());
                }
                map0.put(n0, v2);
                String s = n0.a();
                if(s == null) {
                    Table.nativeSetNull(v, i2$b0.f, v2, false);
                }
                else {
                    Table.nativeSetString(v, i2$b0.f, v2, s, false);
                }
                Table.nativeSetLong(v, i2$b0.g, v2, n0.g(), false);
                Table.nativeSetLong(v, i2$b0.h, v2, n0.g2(), false);
                Table.nativeSetLong(v, i2$b0.i, v2, n0.d(), false);
                String s1 = n0.K2();
                if(s1 == null) {
                    Table.nativeSetNull(v, i2$b0.j, v2, false);
                }
                else {
                    Table.nativeSetString(v, i2$b0.j, v2, s1, false);
                }
            }
        }
    }

    static i2 p6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(n.class), false, Collections.emptyList());
        i2 i20 = new i2();
        a$h0.a();
        return i20;
    }

    static n q6(F0 f00, b i2$b0, n n0, n n1, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(n.class), set0);
        osObjectBuilder0.n3(i2$b0.e, n1.P());
        osObjectBuilder0.n4(i2$b0.f, n1.a());
        osObjectBuilder0.i3(i2$b0.g, n1.g());
        osObjectBuilder0.i3(i2$b0.h, n1.g2());
        osObjectBuilder0.n3(i2$b0.i, n1.d());
        osObjectBuilder0.n4(i2$b0.j, n1.K2());
        osObjectBuilder0.x4();
        return n0;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("FcmMsg = proxy[");
        stringBuilder0.append("{idx:");
        stringBuilder0.append(this.P());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryId:");
        String s = "null";
        stringBuilder0.append((this.a() == null ? "null" : this.a()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{postNumber:");
        stringBuilder0.append(this.g());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{count:");
        stringBuilder0.append(this.g2());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{time:");
        stringBuilder0.append(this.d());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{pushType:");
        if(this.K2() != null) {
            s = this.K2();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

