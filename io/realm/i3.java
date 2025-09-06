package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.z0;
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

public class i3 extends z0 implements s, j3 {
    public static final class a {
        public static final String a = "UserNoticeInfo";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;
        long i;

        b(OsSchemaInfo osSchemaInfo0) {
            super(5);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("UserNoticeInfo");
            this.e = this.b("key", "key", osObjectSchemaInfo0);
            this.f = this.b("index", "index", osObjectSchemaInfo0);
            this.g = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.h = this.b("userId", "userId", osObjectSchemaInfo0);
            this.i = this.b("nickname", "nickname", osObjectSchemaInfo0);
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

    private b j;
    private A0 k;
    private static final String l = "";
    private static final OsObjectSchemaInfo m;

    static {
        i3.m = i3.e6();
    }

    i3() {
        this.k.p();
    }

    @Override  // com.dcinside.app.realm.z0, io.realm.j3
    public String C() {
        this.k.f().k();
        return this.k.g().U(this.j.h);
    }

    @Override  // com.dcinside.app.realm.z0, io.realm.j3
    public int K() {
        this.k.f().k();
        return (int)this.k.g().w(this.j.f);
    }

    @Override  // com.dcinside.app.realm.z0, io.realm.j3
    public void R(int v) {
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            u u0 = this.k.g();
            u0.b().u0(this.j.f, u0.F(), ((long)v), true);
            return;
        }
        this.k.f().k();
        this.k.g().e(this.j.f, ((long)v));
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.k;
    }

    @Override  // com.dcinside.app.realm.z0, io.realm.j3
    public void S3(String s) {
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            u u0 = this.k.g();
            if(s == null) {
                u0.b().v0(this.j.i, u0.F(), true);
                return;
            }
            u0.b().y0(this.j.i, u0.F(), s, true);
            return;
        }
        this.k.f().k();
        if(s == null) {
            this.k.g().K(this.j.i);
            return;
        }
        this.k.g().a(this.j.i, s);
    }

    @Override  // com.dcinside.app.realm.z0, io.realm.j3
    public String T4() {
        this.k.f().k();
        return this.k.g().U(this.j.i);
    }

    @Override  // com.dcinside.app.realm.z0, io.realm.j3
    public void U(String s) {
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            u u0 = this.k.g();
            if(s == null) {
                u0.b().v0(this.j.h, u0.F(), true);
                return;
            }
            u0.b().y0(this.j.h, u0.F(), s, true);
            return;
        }
        this.k.f().k();
        if(s == null) {
            this.k.g().K(this.j.h);
            return;
        }
        this.k.g().a(this.j.h, s);
    }

    @Override  // com.dcinside.app.realm.z0, io.realm.j3
    public String a() {
        this.k.f().k();
        return this.k.g().U(this.j.g);
    }

    public static z0 a6(F0 f00, b i3$b0, z0 z00, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(z00);
        if(s0 != null) {
            return (z0)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(z0.class), set0);
        osObjectBuilder0.n4(i3$b0.e, z00.i());
        osObjectBuilder0.i3(i3$b0.f, z00.K());
        osObjectBuilder0.n4(i3$b0.g, z00.a());
        osObjectBuilder0.n4(i3$b0.h, z00.C());
        osObjectBuilder0.n4(i3$b0.i, z00.T4());
        z0 z01 = i3.n6(f00, osObjectBuilder0.v4());
        map0.put(z00, z01);
        return z01;
    }

    @Override  // com.dcinside.app.realm.z0, io.realm.j3
    public void b(String s) {
        if(this.k.i()) {
            if(!this.k.d()) {
                return;
            }
            u u0 = this.k.g();
            if(s == null) {
                u0.b().v0(this.j.g, u0.F(), true);
                return;
            }
            u0.b().y0(this.j.g, u0.F(), s, true);
            return;
        }
        this.k.f().k();
        if(s == null) {
            this.k.g().K(this.j.g);
            return;
        }
        this.k.g().a(this.j.g, s);
    }

    public static z0 b6(F0 f00, b i3$b0, z0 z00, boolean z, Map map0, Set set0) {
        if(z00 instanceof s && !d1.F5(z00) && ((s)z00).R3().f() != null) {
            io.realm.a a0 = ((s)z00).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return z00;
            }
        }
        i3 i30 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(z00);
        if(s0 != null) {
            return (z0)s0;
        }
        if(z) {
            Table table0 = f00.n4(z0.class);
            long v = i3$b0.e;
            String s1 = z00.i();
            long v1 = s1 == null ? table0.u(v) : table0.w(v, s1);
            if(v1 == -1L) {
                return i3.a6(f00, i3$b0, z00, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v1), i3$b0, false, Collections.emptyList());
                i30 = new i3();
                map0.put(z00, i30);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? i3.o6(f00, i3$b0, i30, z00, map0, set0) : i3.a6(f00, i3$b0, z00, z, map0, set0);
    }

    public static b c6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static z0 d6(z0 z00, int v, int v1, Map map0) {
        z0 z01;
        if(v <= v1 && z00 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(z00);
            if(s$a0 == null) {
                z01 = new z0();
                map0.put(z00, new io.realm.internal.s.a(v, z01));
            }
            else {
                if(v >= s$a0.a) {
                    return (z0)s$a0.b;
                }
                s$a0.a = v;
                z01 = (z0)s$a0.b;
            }
            F0 f00 = (F0)((s)z00).R3().f();
            z01.n(z00.i());
            z01.R(z00.K());
            z01.b(z00.a());
            z01.U(z00.C());
            z01.S3(z00.T4());
            return z01;
        }
        return null;
    }

    private static OsObjectSchemaInfo e6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "UserNoticeInfo", false, 5, 0);
        osObjectSchemaInfo$b0.d("", "key", RealmFieldType.STRING, true, false, false);
        osObjectSchemaInfo$b0.d("", "index", RealmFieldType.INTEGER, false, true, true);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "userId", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "nickname", RealmFieldType.STRING, false, false, false);
        return osObjectSchemaInfo$b0.g();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.k.f();
            io.realm.a a1 = ((i3)object0).k.f();
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
            String s3 = ((i3)object0).k.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.k.g().F() == ((i3)object0).k.g().F() : false;
            }
            return s3 == null ? this.k.g().F() == ((i3)object0).k.g().F() : false;
        }
        return false;
    }

    public static z0 f6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        z0 z00;
        List list0 = Collections.emptyList();
        Class class0 = z0.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("key") ? table0.u(v) : table0.w(v, jSONObject0.getString("key"));
            if(v1 == -1L) {
                z00 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    z00 = new i3();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            z00 = null;
        }
        if(z00 == null) {
            if(!jSONObject0.has("key")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'key\'.");
            }
            z00 = jSONObject0.isNull("key") ? ((i3)f00.v3(class0, null, true, list0)) : ((i3)f00.v3(class0, jSONObject0.getString("key"), true, list0));
        }
        if(jSONObject0.has("index")) {
            if(jSONObject0.isNull("index")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'index\' to null.");
            }
            z00.R(jSONObject0.getInt("index"));
        }
        if(jSONObject0.has("galleryId")) {
            if(jSONObject0.isNull("galleryId")) {
                z00.b(null);
            }
            else {
                z00.b(jSONObject0.getString("galleryId"));
            }
        }
        if(jSONObject0.has("userId")) {
            if(jSONObject0.isNull("userId")) {
                z00.U(null);
            }
            else {
                z00.U(jSONObject0.getString("userId"));
            }
        }
        if(jSONObject0.has("nickname")) {
            if(jSONObject0.isNull("nickname")) {
                z00.S3(null);
                return z00;
            }
            z00.S3(jSONObject0.getString("nickname"));
        }
        return z00;
    }

    @TargetApi(11)
    public static z0 g6(F0 f00, JsonReader jsonReader0) throws IOException {
        z0 z00 = new z0();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("key")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    z00.n(null);
                }
                else {
                    z00.n(jsonReader0.nextString());
                }
                z = true;
            }
            else {
                if(s.equals("index")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        z00.R(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'index\' to null.");
                }
                if(s.equals("galleryId")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        z00.b(null);
                    }
                    else {
                        z00.b(jsonReader0.nextString());
                    }
                }
                else if(s.equals("userId")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        z00.U(null);
                    }
                    else {
                        z00.U(jsonReader0.nextString());
                    }
                }
                else if(!s.equals("nickname")) {
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    z00.S3(null);
                }
                else {
                    z00.S3(jsonReader0.nextString());
                }
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'key\'.");
        }
        return (z0)f00.t2(z00, new W[0]);
    }

    public static OsObjectSchemaInfo h6() {
        return i3.m;
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

    @Override  // com.dcinside.app.realm.z0, io.realm.j3
    public String i() {
        this.k.f().k();
        return this.k.g().U(this.j.e);
    }

    public static String i6() {
        return "UserNoticeInfo";
    }

    public static long j6(F0 f00, z0 z00, Map map0) {
        if(z00 instanceof s && !d1.F5(z00) && ((s)z00).R3().f() != null && ((s)z00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)z00).R3().g().F();
        }
        Table table0 = f00.n4(z0.class);
        long v = table0.getNativePtr();
        b i3$b0 = (b)f00.e0().j(z0.class);
        long v1 = i3$b0.e;
        String s = z00.i();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        else {
            Table.B0(s);
        }
        map0.put(z00, v2);
        Table.nativeSetLong(v, i3$b0.f, v2, z00.K(), false);
        String s1 = z00.a();
        if(s1 != null) {
            Table.nativeSetString(v, i3$b0.g, v2, s1, false);
        }
        String s2 = z00.C();
        if(s2 != null) {
            Table.nativeSetString(v, i3$b0.h, v2, s2, false);
        }
        String s3 = z00.T4();
        if(s3 != null) {
            Table.nativeSetString(v, i3$b0.i, v2, s3, false);
        }
        return v2;
    }

    public static void k6(F0 f00, Iterator iterator0, Map map0) {
        long v3;
        Table table0 = f00.n4(z0.class);
        long v = table0.getNativePtr();
        b i3$b0 = (b)f00.e0().j(z0.class);
        long v1 = i3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            z0 z00 = (z0)object0;
            if(map0.containsKey(z00)) {
            }
            else if(z00 instanceof s && !d1.F5(z00) && ((s)z00).R3().f() != null && ((s)z00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(z00, ((s)z00).R3().g().F());
            }
            else {
                String s = z00.i();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v3 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                else {
                    Table.B0(s);
                    v3 = v2;
                }
                map0.put(z00, v3);
                Table.nativeSetLong(v, i3$b0.f, v3, z00.K(), false);
                String s1 = z00.a();
                if(s1 != null) {
                    Table.nativeSetString(v, i3$b0.g, v3, s1, false);
                }
                String s2 = z00.C();
                if(s2 != null) {
                    Table.nativeSetString(v, i3$b0.h, v3, s2, false);
                }
                String s3 = z00.T4();
                if(s3 != null) {
                    Table.nativeSetString(v, i3$b0.i, v3, s3, false);
                }
            }
        }
    }

    public static long l6(F0 f00, z0 z00, Map map0) {
        if(z00 instanceof s && !d1.F5(z00) && ((s)z00).R3().f() != null && ((s)z00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)z00).R3().g().F();
        }
        Table table0 = f00.n4(z0.class);
        long v = table0.getNativePtr();
        b i3$b0 = (b)f00.e0().j(z0.class);
        long v1 = i3$b0.e;
        String s = z00.i();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        map0.put(z00, v2);
        Table.nativeSetLong(v, i3$b0.f, v2, z00.K(), false);
        String s1 = z00.a();
        if(s1 == null) {
            Table.nativeSetNull(v, i3$b0.g, v2, false);
        }
        else {
            Table.nativeSetString(v, i3$b0.g, v2, s1, false);
        }
        String s2 = z00.C();
        if(s2 == null) {
            Table.nativeSetNull(v, i3$b0.h, v2, false);
        }
        else {
            Table.nativeSetString(v, i3$b0.h, v2, s2, false);
        }
        String s3 = z00.T4();
        if(s3 != null) {
            Table.nativeSetString(v, i3$b0.i, v2, s3, false);
            return v2;
        }
        Table.nativeSetNull(v, i3$b0.i, v2, false);
        return v2;
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

    public static void m6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(z0.class);
        long v = table0.getNativePtr();
        b i3$b0 = (b)f00.e0().j(z0.class);
        long v1 = i3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            z0 z00 = (z0)object0;
            if(map0.containsKey(z00)) {
            }
            else if(z00 instanceof s && !d1.F5(z00) && ((s)z00).R3().f() != null && ((s)z00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(z00, ((s)z00).R3().g().F());
            }
            else {
                String s = z00.i();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                long v3 = v2 == -1L ? OsObject.createRowWithPrimaryKey(table0, v1, s) : v2;
                map0.put(z00, v3);
                Table.nativeSetLong(v, i3$b0.f, v3, z00.K(), false);
                String s1 = z00.a();
                if(s1 == null) {
                    Table.nativeSetNull(v, i3$b0.g, v3, false);
                }
                else {
                    Table.nativeSetString(v, i3$b0.g, v3, s1, false);
                }
                String s2 = z00.C();
                if(s2 == null) {
                    Table.nativeSetNull(v, i3$b0.h, v3, false);
                }
                else {
                    Table.nativeSetString(v, i3$b0.h, v3, s2, false);
                }
                String s3 = z00.T4();
                if(s3 == null) {
                    Table.nativeSetNull(v, i3$b0.i, v3, false);
                }
                else {
                    Table.nativeSetString(v, i3$b0.i, v3, s3, false);
                }
            }
        }
    }

    @Override  // com.dcinside.app.realm.z0, io.realm.j3
    public void n(String s) {
        if(this.k.i()) {
            return;
        }
        this.k.f().k();
        throw new RealmException("Primary key field \'key\' cannot be changed after object was created.");
    }

    static i3 n6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(z0.class), false, Collections.emptyList());
        i3 i30 = new i3();
        a$h0.a();
        return i30;
    }

    static z0 o6(F0 f00, b i3$b0, z0 z00, z0 z01, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(z0.class), set0);
        osObjectBuilder0.n4(i3$b0.e, z01.i());
        osObjectBuilder0.i3(i3$b0.f, z01.K());
        osObjectBuilder0.n4(i3$b0.g, z01.a());
        osObjectBuilder0.n4(i3$b0.h, z01.C());
        osObjectBuilder0.n4(i3$b0.i, z01.T4());
        osObjectBuilder0.x4();
        return z00;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("UserNoticeInfo = proxy[");
        stringBuilder0.append("{key:");
        String s = "null";
        stringBuilder0.append((this.i() == null ? "null" : this.i()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{index:");
        stringBuilder0.append(this.K());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryId:");
        stringBuilder0.append((this.a() == null ? "null" : this.a()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{userId:");
        stringBuilder0.append((this.C() == null ? "null" : this.C()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{nickname:");
        if(this.T4() != null) {
            s = this.T4();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

