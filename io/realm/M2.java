package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.q;
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

public class m2 extends q implements s, n2 {
    public static final class a {
        public static final String a = "GalleryParams";

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
        long n;
        long o;

        b(OsSchemaInfo osSchemaInfo0) {
            super(11);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("GalleryParams");
            this.e = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.f = this.b("minorReason", "minorReason", osObjectSchemaInfo0);
            this.g = this.b("managerAlarm", "managerAlarm", osObjectSchemaInfo0);
            this.h = this.b("miniCoverImage", "miniCoverImage", osObjectSchemaInfo0);
            this.i = this.b("autoRefreshInterval", "autoRefreshInterval", osObjectSchemaInfo0);
            this.j = this.b("autoRefreshEnable", "autoRefreshEnable", osObjectSchemaInfo0);
            this.k = this.b("canMakeAiImage", "canMakeAiImage", osObjectSchemaInfo0);
            this.l = this.b("warningGalleryViewTime", "warningGalleryViewTime", osObjectSchemaInfo0);
            this.m = this.b("warningOpenWriteTime", "warningOpenWriteTime", osObjectSchemaInfo0);
            this.n = this.b("managerNotifyTime", "managerNotifyTime", osObjectSchemaInfo0);
            this.o = this.b("ignorePostHeadList", "ignorePostHeadList", osObjectSchemaInfo0);
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
            ((b)c1).n = ((b)c0).n;
            ((b)c1).o = ((b)c0).o;
        }
    }

    private b p;
    private A0 q;
    private T0 r;
    private static final String s = "";
    private static final OsObjectSchemaInfo t;

    static {
        m2.t = m2.q6();
    }

    m2() {
        this.q.p();
    }

    static q A6(F0 f00, b m2$b0, q q0, q q1, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(q.class), set0);
        osObjectBuilder0.n4(m2$b0.e, q1.a());
        osObjectBuilder0.n4(m2$b0.f, q1.m5());
        osObjectBuilder0.n4(m2$b0.g, q1.K3());
        osObjectBuilder0.n4(m2$b0.h, q1.I1());
        osObjectBuilder0.n3(m2$b0.i, q1.J2());
        osObjectBuilder0.a1(m2$b0.j, Boolean.valueOf(q1.w1()));
        osObjectBuilder0.a1(m2$b0.k, Boolean.valueOf(q1.j2()));
        osObjectBuilder0.n3(m2$b0.l, q1.l1());
        osObjectBuilder0.n3(m2$b0.m, q1.p2());
        osObjectBuilder0.n3(m2$b0.n, q1.D2());
        osObjectBuilder0.r3(m2$b0.o, q1.S1());
        osObjectBuilder0.x4();
        return q0;
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void B2(long v) {
        if(this.q.i()) {
            if(!this.q.d()) {
                return;
            }
            u u0 = this.q.g();
            u0.b().u0(this.p.m, u0.F(), v, true);
            return;
        }
        this.q.f().k();
        this.q.g().e(this.p.m, v);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void C3(boolean z) {
        if(this.q.i()) {
            if(!this.q.d()) {
                return;
            }
            u u0 = this.q.g();
            u0.b().m0(this.p.j, u0.F(), z, true);
            return;
        }
        this.q.f().k();
        this.q.g().p(this.p.j, z);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public long D2() {
        this.q.f().k();
        return this.q.g().w(this.p.n);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public String I1() {
        this.q.f().k();
        return this.q.g().U(this.p.h);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public long J2() {
        this.q.f().k();
        return this.q.g().w(this.p.i);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public String K3() {
        this.q.f().k();
        return this.q.g().U(this.p.g);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void R0(long v) {
        if(this.q.i()) {
            if(!this.q.d()) {
                return;
            }
            u u0 = this.q.g();
            u0.b().u0(this.p.n, u0.F(), v, true);
            return;
        }
        this.q.f().k();
        this.q.g().e(this.p.n, v);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.q;
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public T0 S1() {
        this.q.f().k();
        T0 t00 = this.r;
        if(t00 != null) {
            return t00;
        }
        OsList osList0 = this.q.g().l(this.p.o, RealmFieldType.INTEGER_LIST);
        T0 t01 = new T0(Integer.class, osList0, this.q.f());
        this.r = t01;
        return t01;
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void T0(String s) {
        if(this.q.i()) {
            if(!this.q.d()) {
                return;
            }
            u u0 = this.q.g();
            if(s == null) {
                u0.b().v0(this.p.g, u0.F(), true);
                return;
            }
            u0.b().y0(this.p.g, u0.F(), s, true);
            return;
        }
        this.q.f().k();
        if(s == null) {
            this.q.g().K(this.p.g);
            return;
        }
        this.q.g().a(this.p.g, s);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void T2(String s) {
        if(this.q.i()) {
            if(!this.q.d()) {
                return;
            }
            u u0 = this.q.g();
            if(s == null) {
                u0.b().v0(this.p.h, u0.F(), true);
                return;
            }
            u0.b().y0(this.p.h, u0.F(), s, true);
            return;
        }
        this.q.f().k();
        if(s == null) {
            this.q.g().K(this.p.h);
            return;
        }
        this.q.g().a(this.p.h, s);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public String a() {
        this.q.f().k();
        return this.q.g().U(this.p.e);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void b(String s) {
        if(this.q.i()) {
            return;
        }
        this.q.f().k();
        throw new RealmException("Primary key field \'galleryId\' cannot be changed after object was created.");
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void c4(long v) {
        if(this.q.i()) {
            if(!this.q.d()) {
                return;
            }
            u u0 = this.q.g();
            u0.b().u0(this.p.i, u0.F(), v, true);
            return;
        }
        this.q.f().k();
        this.q.g().e(this.p.i, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.q.f();
            io.realm.a a1 = ((m2)object0).q.f();
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
            String s2 = this.q.g().b().P();
            String s3 = ((m2)object0).q.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.q.g().F() == ((m2)object0).q.g().F() : false;
            }
            return s3 == null ? this.q.g().F() == ((m2)object0).q.g().F() : false;
        }
        return false;
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void h0(T0 t00) {
        if(this.q.i()) {
            if(!this.q.d()) {
                return;
            }
            if(this.q.e().contains("ignorePostHeadList")) {
                return;
            }
        }
        this.q.f().k();
        OsList osList0 = this.q.g().l(this.p.o, RealmFieldType.INTEGER_LIST);
        osList0.Q();
        if(t00 == null) {
            return;
        }
        for(Object object0: t00) {
            Integer integer0 = (Integer)object0;
            if(integer0 == null) {
                osList0.j();
            }
            else {
                osList0.i(integer0.longValue());
            }
        }
    }

    @Override
    public int hashCode() {
        String s = this.q.f().getPath();
        String s1 = this.q.g().b().P();
        long v = this.q.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public boolean j2() {
        this.q.f().k();
        return this.q.g().Q(this.p.k);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public long l1() {
        this.q.f().k();
        return this.q.g().w(this.p.l);
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.q != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.p = (b)a$h0.c();
        A0 a00 = new A0(this);
        this.q = a00;
        a00.r(a$h0.e());
        this.q.s(a$h0.f());
        this.q.o(a$h0.b());
        this.q.q(a$h0.d());
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void m3(long v) {
        if(this.q.i()) {
            if(!this.q.d()) {
                return;
            }
            u u0 = this.q.g();
            u0.b().u0(this.p.l, u0.F(), v, true);
            return;
        }
        this.q.f().k();
        this.q.g().e(this.p.l, v);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public String m5() {
        this.q.f().k();
        return this.q.g().U(this.p.f);
    }

    public static q m6(F0 f00, b m2$b0, q q0, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(q0);
        if(s0 != null) {
            return (q)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(q.class), set0);
        osObjectBuilder0.n4(m2$b0.e, q0.a());
        osObjectBuilder0.n4(m2$b0.f, q0.m5());
        osObjectBuilder0.n4(m2$b0.g, q0.K3());
        osObjectBuilder0.n4(m2$b0.h, q0.I1());
        osObjectBuilder0.n3(m2$b0.i, q0.J2());
        osObjectBuilder0.a1(m2$b0.j, Boolean.valueOf(q0.w1()));
        osObjectBuilder0.a1(m2$b0.k, Boolean.valueOf(q0.j2()));
        osObjectBuilder0.n3(m2$b0.l, q0.l1());
        osObjectBuilder0.n3(m2$b0.m, q0.p2());
        osObjectBuilder0.n3(m2$b0.n, q0.D2());
        osObjectBuilder0.r3(m2$b0.o, q0.S1());
        q q1 = m2.z6(f00, osObjectBuilder0.v4());
        map0.put(q0, q1);
        return q1;
    }

    public static q n6(F0 f00, b m2$b0, q q0, boolean z, Map map0, Set set0) {
        if(q0 instanceof s && !d1.F5(q0) && ((s)q0).R3().f() != null) {
            io.realm.a a0 = ((s)q0).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return q0;
            }
        }
        m2 m20 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(q0);
        if(s0 != null) {
            return (q)s0;
        }
        if(z) {
            Table table0 = f00.n4(q.class);
            long v = m2$b0.e;
            String s1 = q0.a();
            long v1 = s1 == null ? table0.u(v) : table0.w(v, s1);
            if(v1 == -1L) {
                return m2.m6(f00, m2$b0, q0, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v1), m2$b0, false, Collections.emptyList());
                m20 = new m2();
                map0.put(q0, m20);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? m2.A6(f00, m2$b0, m20, q0, map0, set0) : m2.m6(f00, m2$b0, q0, z, map0, set0);
    }

    public static b o6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public long p2() {
        this.q.f().k();
        return this.q.g().w(this.p.m);
    }

    public static q p6(q q0, int v, int v1, Map map0) {
        q q1;
        if(v <= v1 && q0 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(q0);
            if(s$a0 == null) {
                q1 = new q();
                map0.put(q0, new io.realm.internal.s.a(v, q1));
            }
            else {
                if(v >= s$a0.a) {
                    return (q)s$a0.b;
                }
                s$a0.a = v;
                q1 = (q)s$a0.b;
            }
            F0 f00 = (F0)((s)q0).R3().f();
            q1.b(q0.a());
            q1.z3(q0.m5());
            q1.T0(q0.K3());
            q1.T2(q0.I1());
            q1.c4(q0.J2());
            q1.C3(q0.w1());
            q1.t1(q0.j2());
            q1.m3(q0.l1());
            q1.B2(q0.p2());
            q1.R0(q0.D2());
            q1.h0(new T0());
            q1.S1().addAll(q0.S1());
            return q1;
        }
        return null;
    }

    private static OsObjectSchemaInfo q6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "GalleryParams", false, 11, 0);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, true, false, false);
        osObjectSchemaInfo$b0.d("", "minorReason", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "managerAlarm", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "miniCoverImage", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "autoRefreshInterval", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "autoRefreshEnable", RealmFieldType.BOOLEAN, false, false, true);
        osObjectSchemaInfo$b0.d("", "canMakeAiImage", RealmFieldType.BOOLEAN, false, false, true);
        osObjectSchemaInfo$b0.d("", "warningGalleryViewTime", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "warningOpenWriteTime", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "managerNotifyTime", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.f("", "ignorePostHeadList", RealmFieldType.INTEGER_LIST, false);
        return osObjectSchemaInfo$b0.g();
    }

    public static q r6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        q q0;
        ArrayList arrayList0 = new ArrayList(1);
        Class class0 = q.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("galleryId") ? table0.u(v) : table0.w(v, jSONObject0.getString("galleryId"));
            if(v1 == -1L) {
                q0 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    q0 = new m2();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            q0 = null;
        }
        if(q0 == null) {
            if(jSONObject0.has("ignorePostHeadList")) {
                arrayList0.add("ignorePostHeadList");
            }
            if(!jSONObject0.has("galleryId")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'galleryId\'.");
            }
            q0 = jSONObject0.isNull("galleryId") ? ((m2)f00.v3(class0, null, true, arrayList0)) : ((m2)f00.v3(class0, jSONObject0.getString("galleryId"), true, arrayList0));
        }
        if(jSONObject0.has("minorReason")) {
            if(jSONObject0.isNull("minorReason")) {
                q0.z3(null);
            }
            else {
                q0.z3(jSONObject0.getString("minorReason"));
            }
        }
        if(jSONObject0.has("managerAlarm")) {
            if(jSONObject0.isNull("managerAlarm")) {
                q0.T0(null);
            }
            else {
                q0.T0(jSONObject0.getString("managerAlarm"));
            }
        }
        if(jSONObject0.has("miniCoverImage")) {
            if(jSONObject0.isNull("miniCoverImage")) {
                q0.T2(null);
            }
            else {
                q0.T2(jSONObject0.getString("miniCoverImage"));
            }
        }
        if(jSONObject0.has("autoRefreshInterval")) {
            if(jSONObject0.isNull("autoRefreshInterval")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'autoRefreshInterval\' to null.");
            }
            q0.c4(jSONObject0.getLong("autoRefreshInterval"));
        }
        if(jSONObject0.has("autoRefreshEnable")) {
            if(jSONObject0.isNull("autoRefreshEnable")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'autoRefreshEnable\' to null.");
            }
            q0.C3(jSONObject0.getBoolean("autoRefreshEnable"));
        }
        if(jSONObject0.has("canMakeAiImage")) {
            if(jSONObject0.isNull("canMakeAiImage")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'canMakeAiImage\' to null.");
            }
            q0.t1(jSONObject0.getBoolean("canMakeAiImage"));
        }
        if(jSONObject0.has("warningGalleryViewTime")) {
            if(jSONObject0.isNull("warningGalleryViewTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'warningGalleryViewTime\' to null.");
            }
            q0.m3(jSONObject0.getLong("warningGalleryViewTime"));
        }
        if(jSONObject0.has("warningOpenWriteTime")) {
            if(jSONObject0.isNull("warningOpenWriteTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'warningOpenWriteTime\' to null.");
            }
            q0.B2(jSONObject0.getLong("warningOpenWriteTime"));
        }
        if(jSONObject0.has("managerNotifyTime")) {
            if(jSONObject0.isNull("managerNotifyTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'managerNotifyTime\' to null.");
            }
            q0.R0(jSONObject0.getLong("managerNotifyTime"));
        }
        B0.h(f00, q0.S1(), jSONObject0, "ignorePostHeadList", z);
        return q0;
    }

    @TargetApi(11)
    public static q s6(F0 f00, JsonReader jsonReader0) throws IOException {
        q q0 = new q();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("galleryId")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    q0.b(null);
                }
                else {
                    q0.b(jsonReader0.nextString());
                }
                z = true;
            }
            else if(s.equals("minorReason")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    q0.z3(null);
                }
                else {
                    q0.z3(jsonReader0.nextString());
                }
            }
            else if(s.equals("managerAlarm")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    q0.T0(null);
                }
                else {
                    q0.T0(jsonReader0.nextString());
                }
            }
            else if(!s.equals("miniCoverImage")) {
                if(s.equals("autoRefreshInterval")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        q0.c4(jsonReader0.nextLong());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'autoRefreshInterval\' to null.");
                }
                if(s.equals("autoRefreshEnable")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        q0.C3(jsonReader0.nextBoolean());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'autoRefreshEnable\' to null.");
                }
                if(s.equals("canMakeAiImage")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        q0.t1(jsonReader0.nextBoolean());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'canMakeAiImage\' to null.");
                }
                if(s.equals("warningGalleryViewTime")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        q0.m3(jsonReader0.nextLong());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'warningGalleryViewTime\' to null.");
                }
                if(s.equals("warningOpenWriteTime")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        q0.B2(jsonReader0.nextLong());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'warningOpenWriteTime\' to null.");
                }
                if(s.equals("managerNotifyTime")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        q0.R0(jsonReader0.nextLong());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'managerNotifyTime\' to null.");
                }
                if(s.equals("ignorePostHeadList")) {
                    q0.h0(B0.e(Integer.class, jsonReader0));
                }
                else {
                    jsonReader0.skipValue();
                }
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                q0.T2(null);
            }
            else {
                q0.T2(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'galleryId\'.");
        }
        return (q)f00.t2(q0, new W[0]);
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void t1(boolean z) {
        if(this.q.i()) {
            if(!this.q.d()) {
                return;
            }
            u u0 = this.q.g();
            u0.b().m0(this.p.k, u0.F(), z, true);
            return;
        }
        this.q.f().k();
        this.q.g().p(this.p.k, z);
    }

    public static OsObjectSchemaInfo t6() {
        return m2.t;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("GalleryParams = proxy[");
        stringBuilder0.append("{galleryId:");
        String s = "null";
        stringBuilder0.append((this.a() == null ? "null" : this.a()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{minorReason:");
        stringBuilder0.append((this.m5() == null ? "null" : this.m5()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{managerAlarm:");
        stringBuilder0.append((this.K3() == null ? "null" : this.K3()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{miniCoverImage:");
        if(this.I1() != null) {
            s = this.I1();
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{autoRefreshInterval:");
        stringBuilder0.append(this.J2());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{autoRefreshEnable:");
        stringBuilder0.append(this.w1());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{canMakeAiImage:");
        stringBuilder0.append(this.j2());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{warningGalleryViewTime:");
        stringBuilder0.append(this.l1());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{warningOpenWriteTime:");
        stringBuilder0.append(this.p2());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{managerNotifyTime:");
        stringBuilder0.append(this.D2());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{ignorePostHeadList:");
        stringBuilder0.append("RealmList<Integer>[");
        stringBuilder0.append(this.S1().size());
        stringBuilder0.append("]");
        stringBuilder0.append("}");
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public static String u6() {
        return "GalleryParams";
    }

    public static long v6(F0 f00, q q0, Map map0) {
        long v3;
        if(q0 instanceof s && !d1.F5(q0) && ((s)q0).R3().f() != null && ((s)q0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)q0).R3().g().F();
        }
        Table table0 = f00.n4(q.class);
        long v = table0.getNativePtr();
        b m2$b0 = (b)f00.e0().j(q.class);
        long v1 = m2$b0.e;
        String s = q0.a();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        else {
            Table.B0(s);
        }
        map0.put(q0, v2);
        String s1 = q0.m5();
        if(s1 == null) {
            v3 = v2;
        }
        else {
            v3 = v2;
            Table.nativeSetString(v, m2$b0.f, v2, s1, false);
        }
        String s2 = q0.K3();
        if(s2 != null) {
            Table.nativeSetString(v, m2$b0.g, v3, s2, false);
        }
        String s3 = q0.I1();
        if(s3 != null) {
            Table.nativeSetString(v, m2$b0.h, v3, s3, false);
        }
        Table.nativeSetLong(v, m2$b0.i, v3, q0.J2(), false);
        Table.nativeSetBoolean(v, m2$b0.j, v3, q0.w1(), false);
        Table.nativeSetBoolean(v, m2$b0.k, v3, q0.j2(), false);
        Table.nativeSetLong(v, m2$b0.l, v3, q0.l1(), false);
        Table.nativeSetLong(v, m2$b0.m, v3, q0.p2(), false);
        Table.nativeSetLong(v, m2$b0.n, v3, q0.D2(), false);
        T0 t00 = q0.S1();
        if(t00 != null) {
            OsList osList0 = new OsList(table0.U(v3), m2$b0.o);
            for(Object object0: t00) {
                Integer integer0 = (Integer)object0;
                if(integer0 == null) {
                    osList0.j();
                }
                else {
                    osList0.i(integer0.longValue());
                }
            }
            return v3;
        }
        return v3;
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public boolean w1() {
        this.q.f().k();
        return this.q.g().Q(this.p.j);
    }

    public static void w6(F0 f00, Iterator iterator0, Map map0) {
        long v3;
        Table table0 = f00.n4(q.class);
        long v = table0.getNativePtr();
        b m2$b0 = (b)f00.e0().j(q.class);
        long v1 = m2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            q q0 = (q)object0;
            if(map0.containsKey(q0)) {
            }
            else if(q0 instanceof s && !d1.F5(q0) && ((s)q0).R3().f() != null && ((s)q0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(q0, ((s)q0).R3().g().F());
            }
            else {
                String s = q0.a();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                else {
                    Table.B0(s);
                }
                map0.put(q0, v2);
                String s1 = q0.m5();
                if(s1 == null) {
                    v3 = v2;
                }
                else {
                    v3 = v2;
                    Table.nativeSetString(v, m2$b0.f, v2, s1, false);
                }
                String s2 = q0.K3();
                if(s2 != null) {
                    Table.nativeSetString(v, m2$b0.g, v3, s2, false);
                }
                String s3 = q0.I1();
                if(s3 != null) {
                    Table.nativeSetString(v, m2$b0.h, v3, s3, false);
                }
                Table.nativeSetLong(v, m2$b0.i, v3, q0.J2(), false);
                Table.nativeSetBoolean(v, m2$b0.j, v3, q0.w1(), false);
                Table.nativeSetBoolean(v, m2$b0.k, v3, q0.j2(), false);
                Table.nativeSetLong(v, m2$b0.l, v3, q0.l1(), false);
                Table.nativeSetLong(v, m2$b0.m, v3, q0.p2(), false);
                Table.nativeSetLong(v, m2$b0.n, v3, q0.D2(), false);
                T0 t00 = q0.S1();
                if(t00 != null) {
                    OsList osList0 = new OsList(table0.U(v3), m2$b0.o);
                    for(Object object1: t00) {
                        Integer integer0 = (Integer)object1;
                        if(integer0 == null) {
                            osList0.j();
                        }
                        else {
                            osList0.i(integer0.longValue());
                        }
                    }
                }
            }
        }
    }

    public static long x6(F0 f00, q q0, Map map0) {
        long v3;
        if(q0 instanceof s && !d1.F5(q0) && ((s)q0).R3().f() != null && ((s)q0).R3().f().getPath().equals(f00.getPath())) {
            return ((s)q0).R3().g().F();
        }
        Table table0 = f00.n4(q.class);
        long v = table0.getNativePtr();
        b m2$b0 = (b)f00.e0().j(q.class);
        long v1 = m2$b0.e;
        String s = q0.a();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        map0.put(q0, v2);
        String s1 = q0.m5();
        if(s1 == null) {
            v3 = v2;
            Table.nativeSetNull(v, m2$b0.f, v3, false);
        }
        else {
            v3 = v2;
            Table.nativeSetString(v, m2$b0.f, v2, s1, false);
        }
        String s2 = q0.K3();
        if(s2 == null) {
            Table.nativeSetNull(v, m2$b0.g, v3, false);
        }
        else {
            Table.nativeSetString(v, m2$b0.g, v3, s2, false);
        }
        String s3 = q0.I1();
        if(s3 == null) {
            Table.nativeSetNull(v, m2$b0.h, v3, false);
        }
        else {
            Table.nativeSetString(v, m2$b0.h, v3, s3, false);
        }
        Table.nativeSetLong(v, m2$b0.i, v3, q0.J2(), false);
        Table.nativeSetBoolean(v, m2$b0.j, v3, q0.w1(), false);
        Table.nativeSetBoolean(v, m2$b0.k, v3, q0.j2(), false);
        Table.nativeSetLong(v, m2$b0.l, v3, q0.l1(), false);
        Table.nativeSetLong(v, m2$b0.m, v3, q0.p2(), false);
        Table.nativeSetLong(v, m2$b0.n, v3, q0.D2(), false);
        OsList osList0 = new OsList(table0.U(v3), m2$b0.o);
        osList0.Q();
        T0 t00 = q0.S1();
        if(t00 != null) {
            for(Object object0: t00) {
                Integer integer0 = (Integer)object0;
                if(integer0 == null) {
                    osList0.j();
                }
                else {
                    osList0.i(integer0.longValue());
                }
            }
        }
        return v3;
    }

    public static void y6(F0 f00, Iterator iterator0, Map map0) {
        long v3;
        Table table0 = f00.n4(q.class);
        long v = table0.getNativePtr();
        b m2$b0 = (b)f00.e0().j(q.class);
        long v1 = m2$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            q q0 = (q)object0;
            if(map0.containsKey(q0)) {
            }
            else if(q0 instanceof s && !d1.F5(q0) && ((s)q0).R3().f() != null && ((s)q0).R3().f().getPath().equals(f00.getPath())) {
                map0.put(q0, ((s)q0).R3().g().F());
            }
            else {
                String s = q0.a();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                map0.put(q0, v2);
                String s1 = q0.m5();
                if(s1 == null) {
                    v3 = v2;
                    Table.nativeSetNull(v, m2$b0.f, v2, false);
                }
                else {
                    v3 = v2;
                    Table.nativeSetString(v, m2$b0.f, v2, s1, false);
                }
                String s2 = q0.K3();
                if(s2 == null) {
                    Table.nativeSetNull(v, m2$b0.g, v3, false);
                }
                else {
                    Table.nativeSetString(v, m2$b0.g, v3, s2, false);
                }
                String s3 = q0.I1();
                if(s3 == null) {
                    Table.nativeSetNull(v, m2$b0.h, v3, false);
                }
                else {
                    Table.nativeSetString(v, m2$b0.h, v3, s3, false);
                }
                Table.nativeSetLong(v, m2$b0.i, v3, q0.J2(), false);
                Table.nativeSetBoolean(v, m2$b0.j, v3, q0.w1(), false);
                Table.nativeSetBoolean(v, m2$b0.k, v3, q0.j2(), false);
                Table.nativeSetLong(v, m2$b0.l, v3, q0.l1(), false);
                Table.nativeSetLong(v, m2$b0.m, v3, q0.p2(), false);
                Table.nativeSetLong(v, m2$b0.n, v3, q0.D2(), false);
                OsList osList0 = new OsList(table0.U(v3), m2$b0.o);
                osList0.Q();
                T0 t00 = q0.S1();
                if(t00 != null) {
                    for(Object object1: t00) {
                        Integer integer0 = (Integer)object1;
                        if(integer0 == null) {
                            osList0.j();
                        }
                        else {
                            osList0.i(integer0.longValue());
                        }
                    }
                }
            }
        }
    }

    @Override  // com.dcinside.app.realm.q, io.realm.n2
    public void z3(String s) {
        if(this.q.i()) {
            if(!this.q.d()) {
                return;
            }
            u u0 = this.q.g();
            if(s == null) {
                u0.b().v0(this.p.f, u0.F(), true);
                return;
            }
            u0.b().y0(this.p.f, u0.F(), s, true);
            return;
        }
        this.q.f().k();
        if(s == null) {
            this.q.g().K(this.p.f);
            return;
        }
        this.q.g().a(this.p.f, s);
    }

    static m2 z6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(q.class), false, Collections.emptyList());
        m2 m20 = new m2();
        a$h0.a();
        return m20;
    }
}

