package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.b;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
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
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class M1 extends b implements N1, s {
    static final class a extends c {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        long k;
        long l;
        long m;

        a(OsSchemaInfo osSchemaInfo0) {
            super(9);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("AiPromptHistory");
            this.e = this.b("time", "time", osObjectSchemaInfo0);
            this.f = this.b("positive", "positive", osObjectSchemaInfo0);
            this.g = this.b("loraPositiveList", "loraPositiveList", osObjectSchemaInfo0);
            this.h = this.b("negative", "negative", osObjectSchemaInfo0);
            this.i = this.b("loraNegativeList", "loraNegativeList", osObjectSchemaInfo0);
            this.j = this.b("model", "model", osObjectSchemaInfo0);
            this.k = this.b("sampling", "sampling", osObjectSchemaInfo0);
            this.l = this.b("style", "style", osObjectSchemaInfo0);
            this.m = this.b("upscale", "upscale", osObjectSchemaInfo0);
        }

        a(c c0, boolean z) {
            super(c0, z);
            this.d(c0, this);
        }

        @Override  // io.realm.internal.c
        protected final c c(boolean z) {
            return new a(this, z);
        }

        @Override  // io.realm.internal.c
        protected final void d(c c0, c c1) {
            ((a)c1).e = ((a)c0).e;
            ((a)c1).f = ((a)c0).f;
            ((a)c1).g = ((a)c0).g;
            ((a)c1).h = ((a)c0).h;
            ((a)c1).i = ((a)c0).i;
            ((a)c1).j = ((a)c0).j;
            ((a)c1).k = ((a)c0).k;
            ((a)c1).l = ((a)c0).l;
            ((a)c1).m = ((a)c0).m;
        }
    }

    public static final class io.realm.M1.b {
        public static final String a = "AiPromptHistory";

    }

    private a n;
    private A0 o;
    private T0 p;
    private T0 q;
    private static final String r = "";
    private static final OsObjectSchemaInfo s;

    static {
        M1.s = M1.m6();
    }

    M1() {
        this.o.p();
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public void M0(boolean z) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            u0.b().m0(this.n.m, u0.F(), z, true);
            return;
        }
        this.o.f().k();
        this.o.g().p(this.n.m, z);
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public String N1() {
        this.o.f().k();
        return this.o.g().U(this.n.k);
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public String O1() {
        this.o.f().k();
        return this.o.g().U(this.n.f);
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public T0 R1() {
        this.o.f().k();
        T0 t00 = this.q;
        if(t00 != null) {
            return t00;
        }
        OsList osList0 = this.o.g().l(this.n.i, RealmFieldType.STRING_LIST);
        T0 t01 = new T0(String.class, osList0, this.o.f());
        this.q = t01;
        return t01;
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.o;
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public T0 W4() {
        this.o.f().k();
        T0 t00 = this.p;
        if(t00 != null) {
            return t00;
        }
        OsList osList0 = this.o.g().l(this.n.g, RealmFieldType.STRING_LIST);
        T0 t01 = new T0(String.class, osList0, this.o.f());
        this.p = t01;
        return t01;
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public void X0(String s) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            if(s == null) {
                u0.b().v0(this.n.f, u0.F(), true);
                return;
            }
            u0.b().y0(this.n.f, u0.F(), s, true);
            return;
        }
        this.o.f().k();
        if(s == null) {
            this.o.g().K(this.n.f);
            return;
        }
        this.o.g().a(this.n.f, s);
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public String X1() {
        this.o.f().k();
        return this.o.g().U(this.n.j);
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public void Z1(T0 t00) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            if(this.o.e().contains("loraPositiveList")) {
                return;
            }
        }
        this.o.f().k();
        OsList osList0 = this.o.g().l(this.n.g, RealmFieldType.STRING_LIST);
        osList0.Q();
        if(t00 == null) {
            return;
        }
        for(Object object0: t00) {
            String s = (String)object0;
            if(s == null) {
                osList0.j();
            }
            else {
                osList0.n(s);
            }
        }
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public void a5(String s) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            if(s == null) {
                u0.b().v0(this.n.k, u0.F(), true);
                return;
            }
            u0.b().y0(this.n.k, u0.F(), s, true);
            return;
        }
        this.o.f().k();
        if(s == null) {
            this.o.g().K(this.n.k);
            return;
        }
        this.o.g().a(this.n.k, s);
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public void c(long v) {
        if(this.o.i()) {
            return;
        }
        this.o.f().k();
        throw new RealmException("Primary key field \'time\' cannot be changed after object was created.");
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public long d() {
        this.o.f().k();
        return this.o.g().w(this.n.e);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.o.f();
            io.realm.a a1 = ((M1)object0).o.f();
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
            String s2 = this.o.g().b().P();
            String s3 = ((M1)object0).o.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.o.g().F() == ((M1)object0).o.g().F() : false;
            }
            return s3 == null ? this.o.g().F() == ((M1)object0).o.g().F() : false;
        }
        return false;
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public boolean h5() {
        this.o.f().k();
        return this.o.g().Q(this.n.m);
    }

    @Override
    public int hashCode() {
        String s = this.o.f().getPath();
        String s1 = this.o.g().b().P();
        long v = this.o.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    public static b i6(F0 f00, a m1$a0, b b0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(b0);
        if(s0 != null) {
            return (b)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(b.class), set0);
        osObjectBuilder0.n3(m1$a0.e, b0.d());
        osObjectBuilder0.n4(m1$a0.f, b0.O1());
        osObjectBuilder0.o4(m1$a0.g, b0.W4());
        osObjectBuilder0.n4(m1$a0.h, b0.s2());
        osObjectBuilder0.o4(m1$a0.i, b0.R1());
        osObjectBuilder0.n4(m1$a0.j, b0.X1());
        osObjectBuilder0.n4(m1$a0.k, b0.N1());
        osObjectBuilder0.n4(m1$a0.l, b0.l3());
        osObjectBuilder0.a1(m1$a0.m, Boolean.valueOf(b0.h5()));
        b b1 = M1.v6(f00, osObjectBuilder0.v4());
        map0.put(b0, b1);
        return b1;
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public void j3(String s) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            if(s == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'model\' to null.");
            }
            u0.b().y0(this.n.j, u0.F(), s, true);
            return;
        }
        this.o.f().k();
        if(s == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field \'model\' to null.");
        }
        this.o.g().a(this.n.j, s);
    }

    public static b j6(F0 f00, a m1$a0, b b0, boolean z, Map map0, Set set0) {
        if(b0 instanceof s && !d1.F5(b0) && ((s)b0).R3().f() != null) {
            io.realm.a a0 = ((s)b0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return b0;
            }
        }
        M1 m10 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(b0);
        if(s0 != null) {
            return (b)s0;
        }
        if(z) {
            Table table0 = f00.n4(b.class);
            long v = table0.t(m1$a0.e, b0.d());
            if(v == -1L) {
                return M1.i6(f00, m1$a0, b0, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v), m1$a0, false, Collections.emptyList());
                m10 = new M1();
                map0.put(b0, m10);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? M1.w6(f00, m1$a0, m10, b0, map0, set0) : M1.i6(f00, m1$a0, b0, z, map0, set0);
    }

    public static a k6(OsSchemaInfo osSchemaInfo0) {
        return new a(osSchemaInfo0);
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public String l3() {
        this.o.f().k();
        return this.o.g().U(this.n.l);
    }

    public static b l6(b b0, int v, int v1, Map map0) {
        b b1;
        if(v <= v1 && b0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(b0);
            if(s$a0 == null) {
                b1 = new b();
                map0.put(b0, new io.realm.internal.s.a(v, b1));
            }
            else {
                if(v >= s$a0.a) {
                    return (b)s$a0.b;
                }
                s$a0.a = v;
                b1 = (b)s$a0.b;
            }
            F0 f00 = (F0)((s)b0).R3().f();
            b1.c(b0.d());
            b1.X0(b0.O1());
            b1.Z1(new T0());
            b1.W4().addAll(b0.W4());
            b1.q0(b0.s2());
            b1.q3(new T0());
            b1.R1().addAll(b0.R1());
            b1.j3(b0.X1());
            b1.a5(b0.N1());
            b1.z2(b0.l3());
            b1.M0(b0.h5());
            return b1;
        }
        return null;
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.o != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.n = (a)a$h0.c();
        A0 a00 = new A0(this);
        this.o = a00;
        a00.r(a$h0.e());
        this.o.s(a$h0.f());
        this.o.o(a$h0.b());
        this.o.q(a$h0.d());
    }

    private static OsObjectSchemaInfo m6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "AiPromptHistory", false, 9, 0);
        osObjectSchemaInfo$b0.d("", "time", RealmFieldType.INTEGER, true, false, true);
        osObjectSchemaInfo$b0.d("", "positive", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.f("", "loraPositiveList", RealmFieldType.STRING_LIST, false);
        osObjectSchemaInfo$b0.d("", "negative", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.f("", "loraNegativeList", RealmFieldType.STRING_LIST, false);
        osObjectSchemaInfo$b0.d("", "model", RealmFieldType.STRING, false, false, true);
        osObjectSchemaInfo$b0.d("", "sampling", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "style", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "upscale", RealmFieldType.BOOLEAN, false, false, true);
        return osObjectSchemaInfo$b0.g();
    }

    public static b n6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        b b0;
        ArrayList arrayList0 = new ArrayList(2);
        Class class0 = b.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((a)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("time") ? -1L : table0.t(v, jSONObject0.getLong("time"));
            if(v1 == -1L) {
                b0 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    b0 = new M1();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            b0 = null;
        }
        if(b0 == null) {
            if(jSONObject0.has("loraPositiveList")) {
                arrayList0.add("loraPositiveList");
            }
            if(jSONObject0.has("loraNegativeList")) {
                arrayList0.add("loraNegativeList");
            }
            if(!jSONObject0.has("time")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'time\'.");
            }
            b0 = jSONObject0.isNull("time") ? ((M1)f00.v3(class0, null, true, arrayList0)) : ((M1)f00.v3(class0, jSONObject0.getLong("time"), true, arrayList0));
        }
        if(jSONObject0.has("positive")) {
            if(jSONObject0.isNull("positive")) {
                b0.X0(null);
            }
            else {
                b0.X0(jSONObject0.getString("positive"));
            }
        }
        B0.h(f00, b0.W4(), jSONObject0, "loraPositiveList", z);
        if(jSONObject0.has("negative")) {
            if(jSONObject0.isNull("negative")) {
                b0.q0(null);
            }
            else {
                b0.q0(jSONObject0.getString("negative"));
            }
        }
        B0.h(f00, b0.R1(), jSONObject0, "loraNegativeList", z);
        if(jSONObject0.has("model")) {
            if(jSONObject0.isNull("model")) {
                b0.j3(null);
            }
            else {
                b0.j3(jSONObject0.getString("model"));
            }
        }
        if(jSONObject0.has("sampling")) {
            if(jSONObject0.isNull("sampling")) {
                b0.a5(null);
            }
            else {
                b0.a5(jSONObject0.getString("sampling"));
            }
        }
        if(jSONObject0.has("style")) {
            if(jSONObject0.isNull("style")) {
                b0.z2(null);
            }
            else {
                b0.z2(jSONObject0.getString("style"));
            }
        }
        if(jSONObject0.has("upscale")) {
            if(jSONObject0.isNull("upscale")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'upscale\' to null.");
            }
            b0.M0(jSONObject0.getBoolean("upscale"));
            return b0;
        }
        return b0;
    }

    @TargetApi(11)
    public static b o6(F0 f00, JsonReader jsonReader0) throws IOException {
        b b0 = new b();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("time")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    b0.c(jsonReader0.nextLong());
                    z = true;
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
            }
            if(!s.equals("positive")) {
                Class class0 = String.class;
                if(s.equals("loraPositiveList")) {
                    b0.Z1(B0.e(class0, jsonReader0));
                }
                else if(s.equals("negative")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        b0.q0(null);
                    }
                    else {
                        b0.q0(jsonReader0.nextString());
                    }
                }
                else if(s.equals("loraNegativeList")) {
                    b0.q3(B0.e(class0, jsonReader0));
                }
                else if(s.equals("model")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        b0.j3(null);
                    }
                    else {
                        b0.j3(jsonReader0.nextString());
                    }
                }
                else if(s.equals("sampling")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        b0.a5(null);
                    }
                    else {
                        b0.a5(jsonReader0.nextString());
                    }
                }
                else if(!s.equals("style")) {
                    if(s.equals("upscale")) {
                        if(jsonReader0.peek() != JsonToken.NULL) {
                            b0.M0(jsonReader0.nextBoolean());
                            continue;
                        }
                        jsonReader0.skipValue();
                        throw new IllegalArgumentException("Trying to set non-nullable field \'upscale\' to null.");
                    }
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    b0.z2(null);
                }
                else {
                    b0.z2(jsonReader0.nextString());
                }
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                b0.X0(null);
            }
            else {
                b0.X0(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'time\'.");
        }
        return (b)f00.t2(b0, new W[0]);
    }

    public static OsObjectSchemaInfo p6() {
        return M1.s;
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public void q0(String s) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            if(s == null) {
                u0.b().v0(this.n.h, u0.F(), true);
                return;
            }
            u0.b().y0(this.n.h, u0.F(), s, true);
            return;
        }
        this.o.f().k();
        if(s == null) {
            this.o.g().K(this.n.h);
            return;
        }
        this.o.g().a(this.n.h, s);
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public void q3(T0 t00) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            if(this.o.e().contains("loraNegativeList")) {
                return;
            }
        }
        this.o.f().k();
        OsList osList0 = this.o.g().l(this.n.i, RealmFieldType.STRING_LIST);
        osList0.Q();
        if(t00 == null) {
            return;
        }
        for(Object object0: t00) {
            String s = (String)object0;
            if(s == null) {
                osList0.j();
            }
            else {
                osList0.n(s);
            }
        }
    }

    public static String q6() {
        return "AiPromptHistory";
    }

    public static long r6(F0 f00, b b0, Map map0) {
        if(b0 instanceof s && !d1.F5(b0) && ((s)b0).R3().f() != null && ((s)b0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)b0).R3().g().F();
        }
        Table table0 = f00.n4(b.class);
        long v = table0.getNativePtr();
        a m1$a0 = (a)f00.e0().j(b.class);
        long v1 = m1$a0.e;
        Long long0 = b0.d();
        long v2 = Table.nativeFindFirstInt(v, v1, b0.d());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, b0.d());
        }
        else {
            Table.B0(long0);
        }
        map0.put(b0, v2);
        String s = b0.O1();
        if(s != null) {
            Table.nativeSetString(v, m1$a0.f, v2, s, false);
        }
        T0 t00 = b0.W4();
        if(t00 != null) {
            OsList osList0 = new OsList(table0.U(v2), m1$a0.g);
            for(Object object0: t00) {
                String s1 = (String)object0;
                if(s1 == null) {
                    osList0.j();
                }
                else {
                    osList0.n(s1);
                }
            }
        }
        String s2 = b0.s2();
        if(s2 != null) {
            Table.nativeSetString(v, m1$a0.h, v2, s2, false);
        }
        T0 t01 = b0.R1();
        if(t01 != null) {
            OsList osList1 = new OsList(table0.U(v2), m1$a0.i);
            for(Object object1: t01) {
                String s3 = (String)object1;
                if(s3 == null) {
                    osList1.j();
                }
                else {
                    osList1.n(s3);
                }
            }
        }
        String s4 = b0.X1();
        if(s4 != null) {
            Table.nativeSetString(v, m1$a0.j, v2, s4, false);
        }
        String s5 = b0.N1();
        if(s5 != null) {
            Table.nativeSetString(v, m1$a0.k, v2, s5, false);
        }
        String s6 = b0.l3();
        if(s6 != null) {
            Table.nativeSetString(v, m1$a0.l, v2, s6, false);
        }
        Table.nativeSetBoolean(v, m1$a0.m, v2, b0.h5(), false);
        return v2;
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public String s2() {
        this.o.f().k();
        return this.o.g().U(this.n.h);
    }

    public static void s6(F0 f00, Iterator iterator0, Map map0) {
        long v5;
        long v4;
        b b1;
        long v3;
        Table table0 = f00.n4(b.class);
        long v = table0.getNativePtr();
        a m1$a0 = (a)f00.e0().j(b.class);
        long v1 = m1$a0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            b b0 = (b)object0;
            if(map0.containsKey(b0)) {
            }
            else if(b0 instanceof s && !d1.F5(b0) && ((s)b0).R3().f() != null && ((s)b0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(b0, ((s)b0).R3().g().F());
            }
            else {
                Long long0 = b0.d();
                long v2 = Table.nativeFindFirstInt(v, v1, b0.d());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, b0.d());
                }
                else {
                    Table.B0(long0);
                }
                map0.put(b0, v2);
                String s = b0.O1();
                if(s == null) {
                    v3 = v2;
                    b1 = b0;
                }
                else {
                    v3 = v2;
                    b1 = b0;
                    Table.nativeSetString(v, m1$a0.f, v2, s, false);
                }
                T0 t00 = b1.W4();
                if(t00 == null) {
                    v4 = v3;
                }
                else {
                    v4 = v3;
                    OsList osList0 = new OsList(table0.U(v4), m1$a0.g);
                    for(Object object1: t00) {
                        String s1 = (String)object1;
                        if(s1 == null) {
                            osList0.j();
                        }
                        else {
                            osList0.n(s1);
                        }
                    }
                }
                String s2 = b1.s2();
                if(s2 == null) {
                    v5 = v4;
                }
                else {
                    v5 = v4;
                    Table.nativeSetString(v, m1$a0.h, v4, s2, false);
                }
                T0 t01 = b1.R1();
                if(t01 != null) {
                    OsList osList1 = new OsList(table0.U(v5), m1$a0.i);
                    for(Object object2: t01) {
                        String s3 = (String)object2;
                        if(s3 == null) {
                            osList1.j();
                        }
                        else {
                            osList1.n(s3);
                        }
                    }
                }
                String s4 = b1.X1();
                if(s4 != null) {
                    Table.nativeSetString(v, m1$a0.j, v5, s4, false);
                }
                String s5 = b1.N1();
                if(s5 != null) {
                    Table.nativeSetString(v, m1$a0.k, v5, s5, false);
                }
                String s6 = b1.l3();
                if(s6 != null) {
                    Table.nativeSetString(v, m1$a0.l, v5, s6, false);
                }
                Table.nativeSetBoolean(v, m1$a0.m, v5, b1.h5(), false);
            }
        }
    }

    public static long t6(F0 f00, b b0, Map map0) {
        if(b0 instanceof s && !d1.F5(b0) && ((s)b0).R3().f() != null && ((s)b0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)b0).R3().g().F();
        }
        Table table0 = f00.n4(b.class);
        long v = table0.getNativePtr();
        a m1$a0 = (a)f00.e0().j(b.class);
        long v1 = m1$a0.e;
        b0.d();
        long v2 = Table.nativeFindFirstInt(v, v1, b0.d());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, b0.d());
        }
        map0.put(b0, v2);
        String s = b0.O1();
        if(s == null) {
            Table.nativeSetNull(v, m1$a0.f, v2, false);
        }
        else {
            Table.nativeSetString(v, m1$a0.f, v2, s, false);
        }
        OsList osList0 = new OsList(table0.U(v2), m1$a0.g);
        osList0.Q();
        T0 t00 = b0.W4();
        if(t00 != null) {
            for(Object object0: t00) {
                String s1 = (String)object0;
                if(s1 == null) {
                    osList0.j();
                }
                else {
                    osList0.n(s1);
                }
            }
        }
        String s2 = b0.s2();
        if(s2 == null) {
            Table.nativeSetNull(v, m1$a0.h, v2, false);
        }
        else {
            Table.nativeSetString(v, m1$a0.h, v2, s2, false);
        }
        OsList osList1 = new OsList(table0.U(v2), m1$a0.i);
        osList1.Q();
        T0 t01 = b0.R1();
        if(t01 != null) {
            for(Object object1: t01) {
                String s3 = (String)object1;
                if(s3 == null) {
                    osList1.j();
                }
                else {
                    osList1.n(s3);
                }
            }
        }
        String s4 = b0.X1();
        if(s4 == null) {
            Table.nativeSetNull(v, m1$a0.j, v2, false);
        }
        else {
            Table.nativeSetString(v, m1$a0.j, v2, s4, false);
        }
        String s5 = b0.N1();
        if(s5 == null) {
            Table.nativeSetNull(v, m1$a0.k, v2, false);
        }
        else {
            Table.nativeSetString(v, m1$a0.k, v2, s5, false);
        }
        String s6 = b0.l3();
        if(s6 == null) {
            Table.nativeSetNull(v, m1$a0.l, v2, false);
        }
        else {
            Table.nativeSetString(v, m1$a0.l, v2, s6, false);
        }
        Table.nativeSetBoolean(v, m1$a0.m, v2, b0.h5(), false);
        return v2;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("AiPromptHistory = proxy[");
        stringBuilder0.append("{time:");
        stringBuilder0.append(this.d());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{positive:");
        String s = "null";
        stringBuilder0.append((this.O1() == null ? "null" : this.O1()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{loraPositiveList:");
        stringBuilder0.append("RealmList<String>[");
        stringBuilder0.append(this.W4().size());
        stringBuilder0.append("]");
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{negative:");
        stringBuilder0.append((this.s2() == null ? "null" : this.s2()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{loraNegativeList:");
        stringBuilder0.append("RealmList<String>[");
        stringBuilder0.append(this.R1().size());
        stringBuilder0.append("]");
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{model:");
        stringBuilder0.append(this.X1());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{sampling:");
        stringBuilder0.append((this.N1() == null ? "null" : this.N1()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{style:");
        if(this.l3() != null) {
            s = this.l3();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{upscale:");
        stringBuilder0.append(this.h5());
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public static void u6(F0 f00, Iterator iterator0, Map map0) {
        long v5;
        long v4;
        b b1;
        long v3;
        Table table0 = f00.n4(b.class);
        long v = table0.getNativePtr();
        a m1$a0 = (a)f00.e0().j(b.class);
        long v1 = m1$a0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            b b0 = (b)object0;
            if(map0.containsKey(b0)) {
            }
            else if(b0 instanceof s && !d1.F5(b0) && ((s)b0).R3().f() != null && ((s)b0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(b0, ((s)b0).R3().g().F());
            }
            else {
                b0.d();
                long v2 = Table.nativeFindFirstInt(v, v1, b0.d());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, b0.d());
                }
                map0.put(b0, v2);
                String s = b0.O1();
                if(s == null) {
                    v3 = v2;
                    b1 = b0;
                    Table.nativeSetNull(v, m1$a0.f, v2, false);
                }
                else {
                    v3 = v2;
                    b1 = b0;
                    Table.nativeSetString(v, m1$a0.f, v2, s, false);
                }
                OsList osList0 = new OsList(table0.U(v3), m1$a0.g);
                osList0.Q();
                T0 t00 = b1.W4();
                if(t00 != null) {
                    for(Object object1: t00) {
                        String s1 = (String)object1;
                        if(s1 == null) {
                            osList0.j();
                        }
                        else {
                            osList0.n(s1);
                        }
                    }
                }
                String s2 = b1.s2();
                if(s2 == null) {
                    v4 = v3;
                    Table.nativeSetNull(v, m1$a0.h, v4, false);
                }
                else {
                    v4 = v3;
                    Table.nativeSetString(v, m1$a0.h, v3, s2, false);
                }
                OsList osList1 = new OsList(table0.U(v4), m1$a0.i);
                osList1.Q();
                T0 t01 = b1.R1();
                if(t01 != null) {
                    for(Object object2: t01) {
                        String s3 = (String)object2;
                        if(s3 == null) {
                            osList1.j();
                        }
                        else {
                            osList1.n(s3);
                        }
                    }
                }
                String s4 = b1.X1();
                if(s4 == null) {
                    v5 = v4;
                    Table.nativeSetNull(v, m1$a0.j, v5, false);
                }
                else {
                    v5 = v4;
                    Table.nativeSetString(v, m1$a0.j, v4, s4, false);
                }
                String s5 = b1.N1();
                if(s5 == null) {
                    Table.nativeSetNull(v, m1$a0.k, v5, false);
                }
                else {
                    Table.nativeSetString(v, m1$a0.k, v5, s5, false);
                }
                String s6 = b1.l3();
                if(s6 == null) {
                    Table.nativeSetNull(v, m1$a0.l, v5, false);
                }
                else {
                    Table.nativeSetString(v, m1$a0.l, v5, s6, false);
                }
                Table.nativeSetBoolean(v, m1$a0.m, v5, b1.h5(), false);
            }
        }
    }

    static M1 v6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(b.class), false, Collections.emptyList());
        M1 m10 = new M1();
        a$h0.a();
        return m10;
    }

    static b w6(F0 f00, a m1$a0, b b0, b b1, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(b.class), set0);
        osObjectBuilder0.n3(m1$a0.e, b1.d());
        osObjectBuilder0.n4(m1$a0.f, b1.O1());
        osObjectBuilder0.o4(m1$a0.g, b1.W4());
        osObjectBuilder0.n4(m1$a0.h, b1.s2());
        osObjectBuilder0.o4(m1$a0.i, b1.R1());
        osObjectBuilder0.n4(m1$a0.j, b1.X1());
        osObjectBuilder0.n4(m1$a0.k, b1.N1());
        osObjectBuilder0.n4(m1$a0.l, b1.l3());
        osObjectBuilder0.a1(m1$a0.m, Boolean.valueOf(b1.h5()));
        osObjectBuilder0.x4();
        return b0;
    }

    @Override  // com.dcinside.app.realm.b, io.realm.N1
    public void z2(String s) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            if(s == null) {
                u0.b().v0(this.n.l, u0.F(), true);
                return;
            }
            u0.b().y0(this.n.l, u0.F(), s, true);
            return;
        }
        this.o.f().k();
        if(s == null) {
            this.o.g().K(this.n.l);
            return;
        }
        this.o.g().a(this.n.l, s);
    }
}

