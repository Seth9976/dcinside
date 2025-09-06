package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.A0;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class k3 extends A0 implements s, l3 {
    public static final class a {
        public static final String a = "VoiceArchive";

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

        b(OsSchemaInfo osSchemaInfo0) {
            super(10);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("VoiceArchive");
            this.e = this.b("source", "source", osObjectSchemaInfo0);
            this.f = this.b("galleryId", "galleryId", osObjectSchemaInfo0);
            this.g = this.b("galleryName", "galleryName", osObjectSchemaInfo0);
            this.h = this.b("postNumber", "postNumber", osObjectSchemaInfo0);
            this.i = this.b("subject", "subject", osObjectSchemaInfo0);
            this.j = this.b("date", "date", osObjectSchemaInfo0);
            this.k = this.b("writeUserName", "writeUserName", osObjectSchemaInfo0);
            this.l = this.b("memo", "memo", osObjectSchemaInfo0);
            this.m = this.b("folder", "folder", osObjectSchemaInfo0);
            this.n = this.b("time", "time", osObjectSchemaInfo0);
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
        }
    }

    private b n;
    private io.realm.A0 o;
    private static final String p = "";
    private static final OsObjectSchemaInfo q;

    static {
        k3.q = k3.o6();
    }

    k3() {
        this.o.p();
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public String A1() {
        this.o.f().k();
        return this.o.g().U(this.n.e);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public String I() {
        this.o.f().k();
        return this.o.g().U(this.n.k);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public String M() {
        this.o.f().k();
        return this.o.g().U(this.n.l);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public void Q(String s) {
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

    @Override  // io.realm.internal.s
    public io.realm.A0 R3() {
        return this.o;
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public void Y(com.dcinside.app.realm.c c0) {
        F0 f00 = (F0)this.o.f();
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            if(this.o.e().contains("folder")) {
                return;
            }
            if(c0 != null && !d1.H5(c0)) {
                c0 = (com.dcinside.app.realm.c)f00.t2(c0, new W[0]);
            }
            u u0 = this.o.g();
            if(c0 == null) {
                u0.A(this.n.m);
                return;
            }
            this.o.c(c0);
            u0.b().t0(this.n.m, u0.F(), ((s)c0).R3().g().F(), true);
            return;
        }
        this.o.f().k();
        if(c0 == null) {
            this.o.g().A(this.n.m);
            return;
        }
        this.o.c(c0);
        this.o.g().d(this.n.m, ((s)c0).R3().g().F());
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public String a() {
        this.o.f().k();
        return this.o.g().U(this.n.f);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public void b(String s) {
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

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public void c(long v) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            u0.b().u0(this.n.n, u0.F(), v, true);
            return;
        }
        this.o.f().k();
        this.o.g().e(this.n.n, v);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public com.dcinside.app.realm.c c0() {
        this.o.f().k();
        if(this.o.g().D(this.n.m)) {
            return null;
        }
        io.realm.a a0 = this.o.f();
        long v = this.o.g().L(this.n.m);
        List list0 = Collections.emptyList();
        return (com.dcinside.app.realm.c)a0.L(com.dcinside.app.realm.c.class, v, false, list0);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public long d() {
        this.o.f().k();
        return this.o.g().w(this.n.n);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public void d0(String s) {
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

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.o.f();
            io.realm.a a1 = ((k3)object0).o.f();
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
            String s3 = ((k3)object0).o.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.o.g().F() == ((k3)object0).o.g().F() : false;
            }
            return s3 == null ? this.o.g().F() == ((k3)object0).o.g().F() : false;
        }
        return false;
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public int g() {
        this.o.f().k();
        return (int)this.o.g().w(this.n.h);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public void h(String s) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            if(s == null) {
                u0.b().v0(this.n.g, u0.F(), true);
                return;
            }
            u0.b().y0(this.n.g, u0.F(), s, true);
            return;
        }
        this.o.f().k();
        if(s == null) {
            this.o.g().K(this.n.g);
            return;
        }
        this.o.g().a(this.n.g, s);
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

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public String j() {
        this.o.f().k();
        return this.o.g().U(this.n.g);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public String k() {
        this.o.f().k();
        return this.o.g().U(this.n.i);
    }

    public static A0 k6(F0 f00, b k3$b0, A0 a00, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(a00);
        if(s0 != null) {
            return (A0)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(A0.class), set0);
        osObjectBuilder0.n4(k3$b0.e, a00.A1());
        osObjectBuilder0.n4(k3$b0.f, a00.a());
        osObjectBuilder0.n4(k3$b0.g, a00.j());
        osObjectBuilder0.i3(k3$b0.h, a00.g());
        osObjectBuilder0.n4(k3$b0.i, a00.k());
        osObjectBuilder0.n4(k3$b0.j, a00.p());
        osObjectBuilder0.n4(k3$b0.k, a00.I());
        osObjectBuilder0.n4(k3$b0.l, a00.M());
        osObjectBuilder0.n3(k3$b0.n, a00.d());
        A0 a01 = k3.x6(f00, osObjectBuilder0.v4());
        map0.put(a00, a01);
        com.dcinside.app.realm.c c0 = a00.c0();
        if(c0 == null) {
            ((k3)a01).Y(null);
            return a01;
        }
        com.dcinside.app.realm.c c1 = (com.dcinside.app.realm.c)map0.get(c0);
        if(c1 != null) {
            ((k3)a01).Y(c1);
            return a01;
        }
        ((k3)a01).Y(O1.X5(f00, ((io.realm.O1.a)f00.e0().j(com.dcinside.app.realm.c.class)), c0, z, map0, set0));
        return a01;
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public void l(String s) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            if(s == null) {
                u0.b().v0(this.n.i, u0.F(), true);
                return;
            }
            u0.b().y0(this.n.i, u0.F(), s, true);
            return;
        }
        this.o.f().k();
        if(s == null) {
            this.o.g().K(this.n.i);
            return;
        }
        this.o.g().a(this.n.i, s);
    }

    public static A0 l6(F0 f00, b k3$b0, A0 a00, boolean z, Map map0, Set set0) {
        if(a00 instanceof s && !d1.F5(a00) && ((s)a00).R3().f() != null) {
            io.realm.a a0 = ((s)a00).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return a00;
            }
        }
        k3 k30 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(a00);
        if(s0 != null) {
            return (A0)s0;
        }
        if(z) {
            Table table0 = f00.n4(A0.class);
            long v = k3$b0.e;
            String s1 = a00.A1();
            long v1 = s1 == null ? table0.u(v) : table0.w(v, s1);
            if(v1 == -1L) {
                return k3.k6(f00, k3$b0, a00, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v1), k3$b0, false, Collections.emptyList());
                k30 = new k3();
                map0.put(a00, k30);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? k3.y6(f00, k3$b0, k30, a00, map0, set0) : k3.k6(f00, k3$b0, a00, z, map0, set0);
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.o != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.n = (b)a$h0.c();
        io.realm.A0 a00 = new io.realm.A0(this);
        this.o = a00;
        a00.r(a$h0.e());
        this.o.s(a$h0.f());
        this.o.o(a$h0.b());
        this.o.q(a$h0.d());
    }

    public static b m6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static A0 n6(A0 a00, int v, int v1, Map map0) {
        A0 a01;
        if(v <= v1 && a00 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(a00);
            if(s$a0 == null) {
                a01 = new A0();
                map0.put(a00, new io.realm.internal.s.a(v, a01));
            }
            else {
                if(v >= s$a0.a) {
                    return (A0)s$a0.b;
                }
                s$a0.a = v;
                a01 = (A0)s$a0.b;
            }
            F0 f00 = (F0)((s)a00).R3().f();
            a01.p1(a00.A1());
            a01.b(a00.a());
            a01.h(a00.j());
            a01.o(a00.g());
            a01.l(a00.k());
            a01.r(a00.p());
            a01.Q(a00.I());
            a01.d0(a00.M());
            a01.Y(O1.Z5(a00.c0(), v + 1, v1, map0));
            a01.c(a00.d());
            return a01;
        }
        return null;
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public void o(int v) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            u0.b().u0(this.n.h, u0.F(), ((long)v), true);
            return;
        }
        this.o.f().k();
        this.o.g().e(this.n.h, ((long)v));
    }

    private static OsObjectSchemaInfo o6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "VoiceArchive", false, 10, 0);
        osObjectSchemaInfo$b0.d("", "source", RealmFieldType.STRING, true, false, false);
        osObjectSchemaInfo$b0.d("", "galleryId", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "galleryName", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "postNumber", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "subject", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "date", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "writeUserName", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.d("", "memo", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.b("", "folder", RealmFieldType.OBJECT, "ArchiveFolderChild");
        osObjectSchemaInfo$b0.d("", "time", RealmFieldType.INTEGER, false, true, true);
        return osObjectSchemaInfo$b0.g();
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public String p() {
        this.o.f().k();
        return this.o.g().U(this.n.j);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public void p1(String s) {
        if(this.o.i()) {
            return;
        }
        this.o.f().k();
        throw new RealmException("Primary key field \'source\' cannot be changed after object was created.");
    }

    public static A0 p6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        A0 a00;
        ArrayList arrayList0 = new ArrayList(1);
        Class class0 = A0.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("source") ? table0.u(v) : table0.w(v, jSONObject0.getString("source"));
            if(v1 == -1L) {
                a00 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    a00 = new k3();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            a00 = null;
        }
        if(a00 == null) {
            if(jSONObject0.has("folder")) {
                arrayList0.add("folder");
            }
            if(!jSONObject0.has("source")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'source\'.");
            }
            a00 = jSONObject0.isNull("source") ? ((k3)f00.v3(class0, null, true, arrayList0)) : ((k3)f00.v3(class0, jSONObject0.getString("source"), true, arrayList0));
        }
        if(jSONObject0.has("galleryId")) {
            if(jSONObject0.isNull("galleryId")) {
                a00.b(null);
            }
            else {
                a00.b(jSONObject0.getString("galleryId"));
            }
        }
        if(jSONObject0.has("galleryName")) {
            if(jSONObject0.isNull("galleryName")) {
                a00.h(null);
            }
            else {
                a00.h(jSONObject0.getString("galleryName"));
            }
        }
        if(jSONObject0.has("postNumber")) {
            if(jSONObject0.isNull("postNumber")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'postNumber\' to null.");
            }
            a00.o(jSONObject0.getInt("postNumber"));
        }
        if(jSONObject0.has("subject")) {
            if(jSONObject0.isNull("subject")) {
                a00.l(null);
            }
            else {
                a00.l(jSONObject0.getString("subject"));
            }
        }
        if(jSONObject0.has("date")) {
            if(jSONObject0.isNull("date")) {
                a00.r(null);
            }
            else {
                a00.r(jSONObject0.getString("date"));
            }
        }
        if(jSONObject0.has("writeUserName")) {
            if(jSONObject0.isNull("writeUserName")) {
                a00.Q(null);
            }
            else {
                a00.Q(jSONObject0.getString("writeUserName"));
            }
        }
        if(jSONObject0.has("memo")) {
            if(jSONObject0.isNull("memo")) {
                a00.d0(null);
            }
            else {
                a00.d0(jSONObject0.getString("memo"));
            }
        }
        if(jSONObject0.has("folder")) {
            if(jSONObject0.isNull("folder")) {
                a00.Y(null);
            }
            else {
                a00.Y(O1.b6(f00, jSONObject0.getJSONObject("folder"), z));
            }
        }
        if(jSONObject0.has("time")) {
            if(jSONObject0.isNull("time")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
            }
            a00.c(jSONObject0.getLong("time"));
            return a00;
        }
        return a00;
    }

    @TargetApi(11)
    public static A0 q6(F0 f00, JsonReader jsonReader0) throws IOException {
        A0 a00 = new A0();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("source")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    a00.p1(null);
                }
                else {
                    a00.p1(jsonReader0.nextString());
                }
                z = true;
            }
            else if(s.equals("galleryId")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    a00.b(null);
                }
                else {
                    a00.b(jsonReader0.nextString());
                }
            }
            else if(!s.equals("galleryName")) {
                if(s.equals("postNumber")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        a00.o(jsonReader0.nextInt());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'postNumber\' to null.");
                }
                if(s.equals("subject")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        a00.l(null);
                    }
                    else {
                        a00.l(jsonReader0.nextString());
                    }
                }
                else if(s.equals("date")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        a00.r(null);
                    }
                    else {
                        a00.r(jsonReader0.nextString());
                    }
                }
                else if(s.equals("writeUserName")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        a00.Q(null);
                    }
                    else {
                        a00.Q(jsonReader0.nextString());
                    }
                }
                else if(s.equals("memo")) {
                    if(jsonReader0.peek() == JsonToken.NULL) {
                        jsonReader0.skipValue();
                        a00.d0(null);
                    }
                    else {
                        a00.d0(jsonReader0.nextString());
                    }
                }
                else if(!s.equals("folder")) {
                    if(s.equals("time")) {
                        if(jsonReader0.peek() != JsonToken.NULL) {
                            a00.c(jsonReader0.nextLong());
                            continue;
                        }
                        jsonReader0.skipValue();
                        throw new IllegalArgumentException("Trying to set non-nullable field \'time\' to null.");
                    }
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    a00.Y(null);
                }
                else {
                    a00.Y(O1.c6(f00, jsonReader0));
                }
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                a00.h(null);
            }
            else {
                a00.h(jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'source\'.");
        }
        return (A0)f00.t2(a00, new W[0]);
    }

    @Override  // com.dcinside.app.realm.A0, io.realm.l3
    public void r(String s) {
        if(this.o.i()) {
            if(!this.o.d()) {
                return;
            }
            u u0 = this.o.g();
            if(s == null) {
                u0.b().v0(this.n.j, u0.F(), true);
                return;
            }
            u0.b().y0(this.n.j, u0.F(), s, true);
            return;
        }
        this.o.f().k();
        if(s == null) {
            this.o.g().K(this.n.j);
            return;
        }
        this.o.g().a(this.n.j, s);
    }

    public static OsObjectSchemaInfo r6() {
        return k3.q;
    }

    public static String s6() {
        return "VoiceArchive";
    }

    public static long t6(F0 f00, A0 a00, Map map0) {
        if(a00 instanceof s && !d1.F5(a00) && ((s)a00).R3().f() != null && ((s)a00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)a00).R3().g().F();
        }
        Table table0 = f00.n4(A0.class);
        long v = table0.getNativePtr();
        b k3$b0 = (b)f00.e0().j(A0.class);
        long v1 = k3$b0.e;
        String s = a00.A1();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        else {
            Table.B0(s);
        }
        map0.put(a00, v2);
        String s1 = a00.a();
        if(s1 != null) {
            Table.nativeSetString(v, k3$b0.f, v2, s1, false);
        }
        String s2 = a00.j();
        if(s2 != null) {
            Table.nativeSetString(v, k3$b0.g, v2, s2, false);
        }
        Table.nativeSetLong(v, k3$b0.h, v2, a00.g(), false);
        String s3 = a00.k();
        if(s3 != null) {
            Table.nativeSetString(v, k3$b0.i, v2, s3, false);
        }
        String s4 = a00.p();
        if(s4 != null) {
            Table.nativeSetString(v, k3$b0.j, v2, s4, false);
        }
        String s5 = a00.I();
        if(s5 != null) {
            Table.nativeSetString(v, k3$b0.k, v2, s5, false);
        }
        String s6 = a00.M();
        if(s6 != null) {
            Table.nativeSetString(v, k3$b0.l, v2, s6, false);
        }
        com.dcinside.app.realm.c c0 = a00.c0();
        if(c0 != null) {
            Long long0 = (Long)map0.get(c0);
            if(long0 == null) {
                long0 = O1.f6(f00, c0, map0);
            }
            Table.nativeSetLink(v, k3$b0.m, v2, ((long)long0), false);
        }
        Table.nativeSetLong(v, k3$b0.n, v2, a00.d(), false);
        return v2;
    }

    @Override
    public String toString() {
        if(!d1.I5(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder0 = new StringBuilder("VoiceArchive = proxy[");
        stringBuilder0.append("{source:");
        String s = "null";
        stringBuilder0.append((this.A1() == null ? "null" : this.A1()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryId:");
        stringBuilder0.append((this.a() == null ? "null" : this.a()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{galleryName:");
        stringBuilder0.append((this.j() == null ? "null" : this.j()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{postNumber:");
        stringBuilder0.append(this.g());
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{subject:");
        stringBuilder0.append((this.k() == null ? "null" : this.k()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{date:");
        stringBuilder0.append((this.p() == null ? "null" : this.p()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{writeUserName:");
        stringBuilder0.append((this.I() == null ? "null" : this.I()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{memo:");
        stringBuilder0.append((this.M() == null ? "null" : this.M()));
        stringBuilder0.append("}");
        stringBuilder0.append(",");
        stringBuilder0.append("{folder:");
        if(this.c0() != null) {
            s = "ArchiveFolderChild";
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

    public static void u6(F0 f00, Iterator iterator0, Map map0) {
        long v3;
        Table table0 = f00.n4(A0.class);
        long v = table0.getNativePtr();
        b k3$b0 = (b)f00.e0().j(A0.class);
        long v1 = k3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            A0 a00 = (A0)object0;
            if(map0.containsKey(a00)) {
            }
            else if(a00 instanceof s && !d1.F5(a00) && ((s)a00).R3().f() != null && ((s)a00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(a00, ((s)a00).R3().g().F());
            }
            else {
                String s = a00.A1();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v3 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                else {
                    Table.B0(s);
                    v3 = v2;
                }
                map0.put(a00, v3);
                String s1 = a00.a();
                if(s1 != null) {
                    Table.nativeSetString(v, k3$b0.f, v3, s1, false);
                }
                String s2 = a00.j();
                if(s2 != null) {
                    Table.nativeSetString(v, k3$b0.g, v3, s2, false);
                }
                Table.nativeSetLong(v, k3$b0.h, v3, a00.g(), false);
                String s3 = a00.k();
                if(s3 != null) {
                    Table.nativeSetString(v, k3$b0.i, v3, s3, false);
                }
                String s4 = a00.p();
                if(s4 != null) {
                    Table.nativeSetString(v, k3$b0.j, v3, s4, false);
                }
                String s5 = a00.I();
                if(s5 != null) {
                    Table.nativeSetString(v, k3$b0.k, v3, s5, false);
                }
                String s6 = a00.M();
                if(s6 != null) {
                    Table.nativeSetString(v, k3$b0.l, v3, s6, false);
                }
                com.dcinside.app.realm.c c0 = a00.c0();
                if(c0 != null) {
                    Long long0 = (Long)map0.get(c0);
                    if(long0 == null) {
                        long0 = O1.f6(f00, c0, map0);
                    }
                    Table.nativeSetLink(v, k3$b0.m, v3, ((long)long0), false);
                }
                Table.nativeSetLong(v, k3$b0.n, v3, a00.d(), false);
            }
        }
    }

    public static long v6(F0 f00, A0 a00, Map map0) {
        if(a00 instanceof s && !d1.F5(a00) && ((s)a00).R3().f() != null && ((s)a00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)a00).R3().g().F();
        }
        Table table0 = f00.n4(A0.class);
        long v = table0.getNativePtr();
        b k3$b0 = (b)f00.e0().j(A0.class);
        long v1 = k3$b0.e;
        String s = a00.A1();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        map0.put(a00, v2);
        String s1 = a00.a();
        if(s1 == null) {
            Table.nativeSetNull(v, k3$b0.f, v2, false);
        }
        else {
            Table.nativeSetString(v, k3$b0.f, v2, s1, false);
        }
        String s2 = a00.j();
        if(s2 == null) {
            Table.nativeSetNull(v, k3$b0.g, v2, false);
        }
        else {
            Table.nativeSetString(v, k3$b0.g, v2, s2, false);
        }
        Table.nativeSetLong(v, k3$b0.h, v2, a00.g(), false);
        String s3 = a00.k();
        if(s3 == null) {
            Table.nativeSetNull(v, k3$b0.i, v2, false);
        }
        else {
            Table.nativeSetString(v, k3$b0.i, v2, s3, false);
        }
        String s4 = a00.p();
        if(s4 == null) {
            Table.nativeSetNull(v, k3$b0.j, v2, false);
        }
        else {
            Table.nativeSetString(v, k3$b0.j, v2, s4, false);
        }
        String s5 = a00.I();
        if(s5 == null) {
            Table.nativeSetNull(v, k3$b0.k, v2, false);
        }
        else {
            Table.nativeSetString(v, k3$b0.k, v2, s5, false);
        }
        String s6 = a00.M();
        if(s6 == null) {
            Table.nativeSetNull(v, k3$b0.l, v2, false);
        }
        else {
            Table.nativeSetString(v, k3$b0.l, v2, s6, false);
        }
        com.dcinside.app.realm.c c0 = a00.c0();
        if(c0 == null) {
            Table.nativeNullifyLink(v, k3$b0.m, v2);
        }
        else {
            Long long0 = (Long)map0.get(c0);
            if(long0 == null) {
                long0 = O1.h6(f00, c0, map0);
            }
            Table.nativeSetLink(v, k3$b0.m, v2, ((long)long0), false);
        }
        Table.nativeSetLong(v, k3$b0.n, v2, a00.d(), false);
        return v2;
    }

    public static void w6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(A0.class);
        long v = table0.getNativePtr();
        b k3$b0 = (b)f00.e0().j(A0.class);
        long v1 = k3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            A0 a00 = (A0)object0;
            if(map0.containsKey(a00)) {
            }
            else if(a00 instanceof s && !d1.F5(a00) && ((s)a00).R3().f() != null && ((s)a00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(a00, ((s)a00).R3().g().F());
            }
            else {
                String s = a00.A1();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                long v3 = v2 == -1L ? OsObject.createRowWithPrimaryKey(table0, v1, s) : v2;
                map0.put(a00, v3);
                String s1 = a00.a();
                if(s1 == null) {
                    Table.nativeSetNull(v, k3$b0.f, v3, false);
                }
                else {
                    Table.nativeSetString(v, k3$b0.f, v3, s1, false);
                }
                String s2 = a00.j();
                if(s2 == null) {
                    Table.nativeSetNull(v, k3$b0.g, v3, false);
                }
                else {
                    Table.nativeSetString(v, k3$b0.g, v3, s2, false);
                }
                Table.nativeSetLong(v, k3$b0.h, v3, a00.g(), false);
                String s3 = a00.k();
                if(s3 == null) {
                    Table.nativeSetNull(v, k3$b0.i, v3, false);
                }
                else {
                    Table.nativeSetString(v, k3$b0.i, v3, s3, false);
                }
                String s4 = a00.p();
                if(s4 == null) {
                    Table.nativeSetNull(v, k3$b0.j, v3, false);
                }
                else {
                    Table.nativeSetString(v, k3$b0.j, v3, s4, false);
                }
                String s5 = a00.I();
                if(s5 == null) {
                    Table.nativeSetNull(v, k3$b0.k, v3, false);
                }
                else {
                    Table.nativeSetString(v, k3$b0.k, v3, s5, false);
                }
                String s6 = a00.M();
                if(s6 == null) {
                    Table.nativeSetNull(v, k3$b0.l, v3, false);
                }
                else {
                    Table.nativeSetString(v, k3$b0.l, v3, s6, false);
                }
                com.dcinside.app.realm.c c0 = a00.c0();
                if(c0 == null) {
                    Table.nativeNullifyLink(v, k3$b0.m, v3);
                }
                else {
                    Long long0 = (Long)map0.get(c0);
                    if(long0 == null) {
                        long0 = O1.h6(f00, c0, map0);
                    }
                    Table.nativeSetLink(v, k3$b0.m, v3, ((long)long0), false);
                }
                Table.nativeSetLong(v, k3$b0.n, v3, a00.d(), false);
            }
        }
    }

    static k3 x6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(A0.class), false, Collections.emptyList());
        k3 k30 = new k3();
        a$h0.a();
        return k30;
    }

    static A0 y6(F0 f00, b k3$b0, A0 a00, A0 a01, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(A0.class), set0);
        osObjectBuilder0.n4(k3$b0.e, a01.A1());
        osObjectBuilder0.n4(k3$b0.f, a01.a());
        osObjectBuilder0.n4(k3$b0.g, a01.j());
        osObjectBuilder0.i3(k3$b0.h, a01.g());
        osObjectBuilder0.n4(k3$b0.i, a01.k());
        osObjectBuilder0.n4(k3$b0.j, a01.p());
        osObjectBuilder0.n4(k3$b0.k, a01.I());
        osObjectBuilder0.n4(k3$b0.l, a01.M());
        com.dcinside.app.realm.c c0 = a01.c0();
        if(c0 == null) {
            osObjectBuilder0.S3(k3$b0.m);
        }
        else {
            com.dcinside.app.realm.c c1 = (com.dcinside.app.realm.c)map0.get(c0);
            if(c1 == null) {
                osObjectBuilder0.T3(k3$b0.m, O1.X5(f00, ((io.realm.O1.a)f00.e0().j(com.dcinside.app.realm.c.class)), c0, true, map0, set0));
            }
            else {
                osObjectBuilder0.T3(k3$b0.m, c1);
            }
        }
        osObjectBuilder0.n3(k3$b0.n, a01.d());
        osObjectBuilder0.x4();
        return a00;
    }
}

