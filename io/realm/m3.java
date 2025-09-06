package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.B0;
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

public class m3 extends B0 implements s, n3 {
    public static final class a {
        public static final String a = "YoutubeSearchCache";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;
        long i;

        b(OsSchemaInfo osSchemaInfo0) {
            super(5);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("YoutubeSearchCache");
            this.e = this.b("id", "id", osObjectSchemaInfo0);
            this.f = this.b("keyword", "keyword", osObjectSchemaInfo0);
            this.g = this.b("token", "token", osObjectSchemaInfo0);
            this.h = this.b("value", "value", osObjectSchemaInfo0);
            this.i = this.b("time", "time", osObjectSchemaInfo0);
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
        m3.l = m3.U5();
    }

    m3() {
        this.j.p();
    }

    @Override  // com.dcinside.app.realm.B0, io.realm.n3
    public void B1(byte[] arr_b) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            if(arr_b == null) {
                u0.b().v0(this.i.h, u0.F(), true);
                return;
            }
            u0.b().l0(this.i.h, u0.F(), arr_b, true);
            return;
        }
        this.j.f().k();
        if(arr_b == null) {
            this.j.g().K(this.i.h);
            return;
        }
        this.j.g().m(this.i.h, arr_b);
    }

    public static B0 Q5(F0 f00, b m3$b0, B0 b00, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(b00);
        if(s0 != null) {
            return (B0)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(B0.class), set0);
        osObjectBuilder0.n3(m3$b0.e, b00.m());
        osObjectBuilder0.n4(m3$b0.f, b00.n3());
        osObjectBuilder0.n4(m3$b0.g, b00.T());
        osObjectBuilder0.h1(m3$b0.h, b00.s3());
        osObjectBuilder0.n3(m3$b0.i, b00.d());
        B0 b01 = m3.d6(f00, osObjectBuilder0.v4());
        map0.put(b00, b01);
        return b01;
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.j;
    }

    public static B0 R5(F0 f00, b m3$b0, B0 b00, boolean z, Map map0, Set set0) {
        if(b00 instanceof s && !d1.F5(b00) && ((s)b00).R3().f() != null) {
            io.realm.a a0 = ((s)b00).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return b00;
            }
        }
        m3 m30 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(b00);
        if(s0 != null) {
            return (B0)s0;
        }
        if(z) {
            Table table0 = f00.n4(B0.class);
            long v = table0.t(m3$b0.e, b00.m());
            if(v == -1L) {
                return m3.Q5(f00, m3$b0, b00, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v), m3$b0, false, Collections.emptyList());
                m30 = new m3();
                map0.put(b00, m30);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? m3.e6(f00, m3$b0, m30, b00, map0, set0) : m3.Q5(f00, m3$b0, b00, z, map0, set0);
    }

    @Override  // com.dcinside.app.realm.B0, io.realm.n3
    public void S(long v) {
        if(this.j.i()) {
            return;
        }
        this.j.f().k();
        throw new RealmException("Primary key field \'id\' cannot be changed after object was created.");
    }

    public static b S5(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    @Override  // com.dcinside.app.realm.B0, io.realm.n3
    public String T() {
        this.j.f().k();
        return this.j.g().U(this.i.g);
    }

    public static B0 T5(B0 b00, int v, int v1, Map map0) {
        B0 b01;
        if(v <= v1 && b00 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(b00);
            if(s$a0 == null) {
                b01 = new B0();
                map0.put(b00, new io.realm.internal.s.a(v, b01));
            }
            else {
                if(v >= s$a0.a) {
                    return (B0)s$a0.b;
                }
                s$a0.a = v;
                b01 = (B0)s$a0.b;
            }
            F0 f00 = (F0)((s)b00).R3().f();
            b01.S(b00.m());
            b01.W2(b00.n3());
            b01.g0(b00.T());
            b01.B1(b00.s3());
            b01.c(b00.d());
            return b01;
        }
        return null;
    }

    private static OsObjectSchemaInfo U5() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "YoutubeSearchCache", false, 5, 0);
        osObjectSchemaInfo$b0.d("", "id", RealmFieldType.INTEGER, true, false, true);
        osObjectSchemaInfo$b0.d("", "keyword", RealmFieldType.STRING, false, true, false);
        osObjectSchemaInfo$b0.d("", "token", RealmFieldType.STRING, false, true, false);
        osObjectSchemaInfo$b0.d("", "value", RealmFieldType.BINARY, false, false, false);
        osObjectSchemaInfo$b0.d("", "time", RealmFieldType.INTEGER, false, true, true);
        return osObjectSchemaInfo$b0.g();
    }

    public static B0 V5(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        B0 b00;
        List list0 = Collections.emptyList();
        Class class0 = B0.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("id") ? -1L : table0.t(v, jSONObject0.getLong("id"));
            if(v1 == -1L) {
                b00 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    b00 = new m3();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            b00 = null;
        }
        if(b00 == null) {
            if(!jSONObject0.has("id")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'id\'.");
            }
            b00 = jSONObject0.isNull("id") ? ((m3)f00.v3(class0, null, true, list0)) : ((m3)f00.v3(class0, jSONObject0.getLong("id"), true, list0));
        }
        if(jSONObject0.has("keyword")) {
            if(jSONObject0.isNull("keyword")) {
                b00.W2(null);
            }
            else {
                b00.W2(jSONObject0.getString("keyword"));
            }
        }
        if(jSONObject0.has("token")) {
            if(jSONObject0.isNull("token")) {
                b00.g0(null);
            }
            else {
                b00.g0(jSONObject0.getString("token"));
            }
        }
        if(jSONObject0.has("value")) {
            if(jSONObject0.isNull("value")) {
                b00.B1(null);
            }
            else {
                b00.B1(io.realm.internal.android.c.a(jSONObject0.getString("value")));
            }
        }
        if(jSONObject0.has("time")) {
            if(jSONObject0.isNull("time")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
            }
            b00.c(jSONObject0.getLong("time"));
            return b00;
        }
        return b00;
    }

    @Override  // com.dcinside.app.realm.B0, io.realm.n3
    public void W2(String s) {
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

    @TargetApi(11)
    public static B0 W5(F0 f00, JsonReader jsonReader0) throws IOException {
        B0 b00 = new B0();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("id")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    b00.S(jsonReader0.nextLong());
                    z = true;
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'id\' to null.");
            }
            if(s.equals("keyword")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    b00.W2(null);
                }
                else {
                    b00.W2(jsonReader0.nextString());
                }
            }
            else if(s.equals("token")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    b00.g0(null);
                }
                else {
                    b00.g0(jsonReader0.nextString());
                }
            }
            else if(!s.equals("value")) {
                if(s.equals("time")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        b00.c(jsonReader0.nextLong());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
                }
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                b00.B1(null);
            }
            else {
                b00.B1(io.realm.internal.android.c.a(jsonReader0.nextString()));
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'id\'.");
        }
        return (B0)f00.t2(b00, new W[0]);
    }

    public static OsObjectSchemaInfo X5() {
        return m3.l;
    }

    public static String Y5() {
        return "YoutubeSearchCache";
    }

    public static long Z5(F0 f00, B0 b00, Map map0) {
        if(b00 instanceof s && !d1.F5(b00) && ((s)b00).R3().f() != null && ((s)b00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)b00).R3().g().F();
        }
        Table table0 = f00.n4(B0.class);
        long v = table0.getNativePtr();
        b m3$b0 = (b)f00.e0().j(B0.class);
        long v1 = m3$b0.e;
        Long long0 = b00.m();
        long v2 = Table.nativeFindFirstInt(v, v1, b00.m());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, b00.m());
        }
        else {
            Table.B0(long0);
        }
        map0.put(b00, v2);
        String s = b00.n3();
        if(s != null) {
            Table.nativeSetString(v, m3$b0.f, v2, s, false);
        }
        String s1 = b00.T();
        if(s1 != null) {
            Table.nativeSetString(v, m3$b0.g, v2, s1, false);
        }
        byte[] arr_b = b00.s3();
        if(arr_b != null) {
            Table.nativeSetByteArray(v, m3$b0.h, v2, arr_b, false);
        }
        Table.nativeSetLong(v, m3$b0.i, v2, b00.d(), false);
        return v2;
    }

    public static void a6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(B0.class);
        long v = table0.getNativePtr();
        b m3$b0 = (b)f00.e0().j(B0.class);
        long v1 = m3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            B0 b00 = (B0)object0;
            if(map0.containsKey(b00)) {
            }
            else if(b00 instanceof s && !d1.F5(b00) && ((s)b00).R3().f() != null && ((s)b00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(b00, ((s)b00).R3().g().F());
            }
            else {
                Long long0 = b00.m();
                long v2 = Table.nativeFindFirstInt(v, v1, b00.m());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, b00.m());
                }
                else {
                    Table.B0(long0);
                }
                map0.put(b00, v2);
                String s = b00.n3();
                if(s != null) {
                    Table.nativeSetString(v, m3$b0.f, v2, s, false);
                }
                String s1 = b00.T();
                if(s1 != null) {
                    Table.nativeSetString(v, m3$b0.g, v2, s1, false);
                }
                byte[] arr_b = b00.s3();
                if(arr_b != null) {
                    Table.nativeSetByteArray(v, m3$b0.h, v2, arr_b, false);
                }
                Table.nativeSetLong(v, m3$b0.i, v2, b00.d(), false);
            }
        }
    }

    public static long b6(F0 f00, B0 b00, Map map0) {
        if(b00 instanceof s && !d1.F5(b00) && ((s)b00).R3().f() != null && ((s)b00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)b00).R3().g().F();
        }
        Table table0 = f00.n4(B0.class);
        long v = table0.getNativePtr();
        b m3$b0 = (b)f00.e0().j(B0.class);
        long v1 = m3$b0.e;
        b00.m();
        long v2 = Table.nativeFindFirstInt(v, v1, b00.m());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, b00.m());
        }
        map0.put(b00, v2);
        String s = b00.n3();
        if(s == null) {
            Table.nativeSetNull(v, m3$b0.f, v2, false);
        }
        else {
            Table.nativeSetString(v, m3$b0.f, v2, s, false);
        }
        String s1 = b00.T();
        if(s1 == null) {
            Table.nativeSetNull(v, m3$b0.g, v2, false);
        }
        else {
            Table.nativeSetString(v, m3$b0.g, v2, s1, false);
        }
        byte[] arr_b = b00.s3();
        if(arr_b == null) {
            Table.nativeSetNull(v, m3$b0.h, v2, false);
        }
        else {
            Table.nativeSetByteArray(v, m3$b0.h, v2, arr_b, false);
        }
        Table.nativeSetLong(v, m3$b0.i, v2, b00.d(), false);
        return v2;
    }

    @Override  // com.dcinside.app.realm.B0, io.realm.n3
    public void c(long v) {
        if(this.j.i()) {
            if(!this.j.d()) {
                return;
            }
            u u0 = this.j.g();
            u0.b().u0(this.i.i, u0.F(), v, true);
            return;
        }
        this.j.f().k();
        this.j.g().e(this.i.i, v);
    }

    public static void c6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(B0.class);
        long v = table0.getNativePtr();
        b m3$b0 = (b)f00.e0().j(B0.class);
        long v1 = m3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            B0 b00 = (B0)object0;
            if(map0.containsKey(b00)) {
            }
            else if(b00 instanceof s && !d1.F5(b00) && ((s)b00).R3().f() != null && ((s)b00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(b00, ((s)b00).R3().g().F());
            }
            else {
                b00.m();
                long v2 = Table.nativeFindFirstInt(v, v1, b00.m());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, b00.m());
                }
                map0.put(b00, v2);
                String s = b00.n3();
                if(s == null) {
                    Table.nativeSetNull(v, m3$b0.f, v2, false);
                }
                else {
                    Table.nativeSetString(v, m3$b0.f, v2, s, false);
                }
                String s1 = b00.T();
                if(s1 == null) {
                    Table.nativeSetNull(v, m3$b0.g, v2, false);
                }
                else {
                    Table.nativeSetString(v, m3$b0.g, v2, s1, false);
                }
                byte[] arr_b = b00.s3();
                if(arr_b == null) {
                    Table.nativeSetNull(v, m3$b0.h, v2, false);
                }
                else {
                    Table.nativeSetByteArray(v, m3$b0.h, v2, arr_b, false);
                }
                Table.nativeSetLong(v, m3$b0.i, v2, b00.d(), false);
            }
        }
    }

    @Override  // com.dcinside.app.realm.B0, io.realm.n3
    public long d() {
        this.j.f().k();
        return this.j.g().w(this.i.i);
    }

    static m3 d6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(B0.class), false, Collections.emptyList());
        m3 m30 = new m3();
        a$h0.a();
        return m30;
    }

    static B0 e6(F0 f00, b m3$b0, B0 b00, B0 b01, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(B0.class), set0);
        osObjectBuilder0.n3(m3$b0.e, b01.m());
        osObjectBuilder0.n4(m3$b0.f, b01.n3());
        osObjectBuilder0.n4(m3$b0.g, b01.T());
        osObjectBuilder0.h1(m3$b0.h, b01.s3());
        osObjectBuilder0.n3(m3$b0.i, b01.d());
        osObjectBuilder0.x4();
        return b00;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.j.f();
            io.realm.a a1 = ((m3)object0).j.f();
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
            String s3 = ((m3)object0).j.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.j.g().F() == ((m3)object0).j.g().F() : false;
            }
            return s3 == null ? this.j.g().F() == ((m3)object0).j.g().F() : false;
        }
        return false;
    }

    @Override  // com.dcinside.app.realm.B0, io.realm.n3
    public void g0(String s) {
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

    @Override  // com.dcinside.app.realm.B0, io.realm.n3
    public long m() {
        this.j.f().k();
        return this.j.g().w(this.i.e);
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

    @Override  // com.dcinside.app.realm.B0, io.realm.n3
    public String n3() {
        this.j.f().k();
        return this.j.g().U(this.i.f);
    }

    @Override  // com.dcinside.app.realm.B0, io.realm.n3
    public byte[] s3() {
        this.j.f().k();
        return this.j.g().i(this.i.h);
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("YoutubeSearchCache = proxy[");
        stringBuilder0.append("{id:");
        stringBuilder0.append(this.m());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{keyword:");
        String s = "null";
        stringBuilder0.append((this.n3() == null ? "null" : this.n3()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{token:");
        stringBuilder0.append((this.T() == null ? "null" : this.T()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{value:");
        if(this.s3() != null) {
            s = "binary(" + this.s3().length + ")";
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{time:");
        stringBuilder0.append(this.d());
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

