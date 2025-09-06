package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.m;
import com.dcinside.app.realm.y0;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class g3 extends y0 implements h3, s {
    public static final class a {
        public static final String a = "UserFavorite";

    }

    static final class b extends c {
        long e;
        long f;
        long g;

        b(OsSchemaInfo osSchemaInfo0) {
            super(3);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("UserFavorite");
            this.e = this.b("userId", "userId", osObjectSchemaInfo0);
            this.f = this.b("updateTime", "updateTime", osObjectSchemaInfo0);
            this.g = this.b("favoriteList", "favoriteList", osObjectSchemaInfo0);
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
    private T0 i;
    private static final String j = "";
    private static final OsObjectSchemaInfo k;

    static {
        g3.k = g3.b6();
    }

    g3() {
        this.h.p();
    }

    @Override  // com.dcinside.app.realm.y0, io.realm.h3
    public String C() {
        this.h.f().k();
        return this.h.g().U(this.g.e);
    }

    @Override  // com.dcinside.app.realm.y0, io.realm.h3
    public long E2() {
        this.h.f().k();
        return this.h.g().w(this.g.f);
    }

    @Override  // com.dcinside.app.realm.y0, io.realm.h3
    public T0 Q0() {
        this.h.f().k();
        T0 t00 = this.i;
        if(t00 != null) {
            return t00;
        }
        OsList osList0 = this.h.g().y(this.g.g);
        T0 t01 = new T0(m.class, osList0, this.h.f());
        this.i = t01;
        return t01;
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.h;
    }

    @Override  // com.dcinside.app.realm.y0, io.realm.h3
    public void U(String s) {
        if(this.h.i()) {
            return;
        }
        this.h.f().k();
        throw new RealmException("Primary key field \'userId\' cannot be changed after object was created.");
    }

    public static y0 X5(F0 f00, b g3$b0, y0 y00, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(y00);
        if(s0 != null) {
            return (y0)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(y0.class), set0);
        osObjectBuilder0.n4(g3$b0.e, y00.C());
        osObjectBuilder0.n3(g3$b0.f, y00.E2());
        y0 y01 = g3.k6(f00, osObjectBuilder0.v4());
        map0.put(y00, y01);
        T0 t00 = y00.Q0();
        if(t00 != null) {
            T0 t01 = ((g3)y01).Q0();
            t01.clear();
            for(int v = 0; v < t00.size(); ++v) {
                m m0 = (m)t00.get(v);
                m m1 = (m)map0.get(m0);
                if(m1 == null) {
                    t01.add(g2.Z5(f00, ((io.realm.g2.b)f00.e0().j(m.class)), m0, z, map0, set0));
                }
                else {
                    t01.add(m1);
                }
            }
        }
        return y01;
    }

    public static y0 Y5(F0 f00, b g3$b0, y0 y00, boolean z, Map map0, Set set0) {
        if(y00 instanceof s && !d1.F5(y00) && ((s)y00).R3().f() != null) {
            io.realm.a a0 = ((s)y00).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return y00;
            }
        }
        g3 g30 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(y00);
        if(s0 != null) {
            return (y0)s0;
        }
        if(z) {
            Table table0 = f00.n4(y0.class);
            long v = g3$b0.e;
            String s1 = y00.C();
            long v1 = s1 == null ? table0.u(v) : table0.w(v, s1);
            if(v1 == -1L) {
                return g3.X5(f00, g3$b0, y00, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v1), g3$b0, false, Collections.emptyList());
                g30 = new g3();
                map0.put(y00, g30);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? g3.l6(f00, g3$b0, g30, y00, map0, set0) : g3.X5(f00, g3$b0, y00, z, map0, set0);
    }

    public static b Z5(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static y0 a6(y0 y00, int v, int v1, Map map0) {
        y0 y01;
        if(v <= v1 && y00 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(y00);
            if(s$a0 == null) {
                y01 = new y0();
                map0.put(y00, new io.realm.internal.s.a(v, y01));
            }
            else {
                if(v >= s$a0.a) {
                    return (y0)s$a0.b;
                }
                s$a0.a = v;
                y01 = (y0)s$a0.b;
            }
            F0 f00 = (F0)((s)y00).R3().f();
            y01.U(y00.C());
            y01.b2(y00.E2());
            if(v == v1) {
                y01.x1(null);
                return y01;
            }
            T0 t00 = y00.Q0();
            T0 t01 = new T0();
            y01.x1(t01);
            int v2 = t00.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                t01.add(g2.b6(((m)t00.get(v3)), v + 1, v1, map0));
            }
            return y01;
        }
        return null;
    }

    @Override  // com.dcinside.app.realm.y0, io.realm.h3
    public void b2(long v) {
        if(this.h.i()) {
            if(!this.h.d()) {
                return;
            }
            u u0 = this.h.g();
            u0.b().u0(this.g.f, u0.F(), v, true);
            return;
        }
        this.h.f().k();
        this.h.g().e(this.g.f, v);
    }

    private static OsObjectSchemaInfo b6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "UserFavorite", false, 3, 0);
        osObjectSchemaInfo$b0.d("", "userId", RealmFieldType.STRING, true, false, false);
        osObjectSchemaInfo$b0.d("", "updateTime", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.b("", "favoriteList", RealmFieldType.LIST, "FavoriteGallery");
        return osObjectSchemaInfo$b0.g();
    }

    public static y0 c6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        y0 y00;
        ArrayList arrayList0 = new ArrayList(1);
        Class class0 = y0.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("userId") ? table0.u(v) : table0.w(v, jSONObject0.getString("userId"));
            if(v1 == -1L) {
                y00 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    y00 = new g3();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            y00 = null;
        }
        if(y00 == null) {
            if(jSONObject0.has("favoriteList")) {
                arrayList0.add("favoriteList");
            }
            if(!jSONObject0.has("userId")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'userId\'.");
            }
            y00 = jSONObject0.isNull("userId") ? ((g3)f00.v3(class0, null, true, arrayList0)) : ((g3)f00.v3(class0, jSONObject0.getString("userId"), true, arrayList0));
        }
        if(jSONObject0.has("updateTime")) {
            if(jSONObject0.isNull("updateTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'updateTime\' to null.");
            }
            y00.b2(jSONObject0.getLong("updateTime"));
        }
        if(jSONObject0.has("favoriteList")) {
            if(jSONObject0.isNull("favoriteList")) {
                y00.x1(null);
                return y00;
            }
            y00.Q0().clear();
            JSONArray jSONArray0 = jSONObject0.getJSONArray("favoriteList");
            for(int v3 = 0; v3 < jSONArray0.length(); ++v3) {
                m m0 = g2.d6(f00, jSONArray0.getJSONObject(v3), z);
                y00.Q0().add(m0);
            }
        }
        return y00;
    }

    @TargetApi(11)
    public static y0 d6(F0 f00, JsonReader jsonReader0) throws IOException {
        y0 y00 = new y0();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("userId")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    y00.U(null);
                }
                else {
                    y00.U(jsonReader0.nextString());
                }
                z = true;
            }
            else {
                if(s.equals("updateTime")) {
                    if(jsonReader0.peek() != JsonToken.NULL) {
                        y00.b2(jsonReader0.nextLong());
                        continue;
                    }
                    jsonReader0.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field \'updateTime\' to null.");
                }
                if(!s.equals("favoriteList")) {
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    y00.x1(null);
                }
                else {
                    y00.x1(new T0());
                    jsonReader0.beginArray();
                    while(jsonReader0.hasNext()) {
                        m m0 = g2.e6(f00, jsonReader0);
                        y00.Q0().add(m0);
                    }
                    jsonReader0.endArray();
                }
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'userId\'.");
        }
        return (y0)f00.t2(y00, new W[0]);
    }

    public static OsObjectSchemaInfo e6() {
        return g3.k;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.h.f();
            io.realm.a a1 = ((g3)object0).h.f();
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
            String s3 = ((g3)object0).h.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.h.g().F() == ((g3)object0).h.g().F() : false;
            }
            return s3 == null ? this.h.g().F() == ((g3)object0).h.g().F() : false;
        }
        return false;
    }

    public static String f6() {
        return "UserFavorite";
    }

    public static long g6(F0 f00, y0 y00, Map map0) {
        if(y00 instanceof s && !d1.F5(y00) && ((s)y00).R3().f() != null && ((s)y00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)y00).R3().g().F();
        }
        Table table0 = f00.n4(y0.class);
        long v = table0.getNativePtr();
        b g3$b0 = (b)f00.e0().j(y0.class);
        long v1 = g3$b0.e;
        String s = y00.C();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        else {
            Table.B0(s);
        }
        map0.put(y00, v2);
        Table.nativeSetLong(v, g3$b0.f, v2, y00.E2(), false);
        T0 t00 = y00.Q0();
        if(t00 != null) {
            OsList osList0 = new OsList(table0.U(v2), g3$b0.g);
            for(Object object0: t00) {
                m m0 = (m)object0;
                Long long0 = (Long)map0.get(m0);
                if(long0 == null) {
                    long0 = g2.h6(f00, m0, map0);
                }
                osList0.m(((long)long0));
            }
        }
        return v2;
    }

    public static void h6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(y0.class);
        long v = table0.getNativePtr();
        b g3$b0 = (b)f00.e0().j(y0.class);
        long v1 = g3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            y0 y00 = (y0)object0;
            if(map0.containsKey(y00)) {
            }
            else if(y00 instanceof s && !d1.F5(y00) && ((s)y00).R3().f() != null && ((s)y00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(y00, ((s)y00).R3().g().F());
            }
            else {
                String s = y00.C();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                else {
                    Table.B0(s);
                }
                map0.put(y00, v2);
                Table.nativeSetLong(v, g3$b0.f, v2, y00.E2(), false);
                T0 t00 = y00.Q0();
                if(t00 != null) {
                    OsList osList0 = new OsList(table0.U(v2), g3$b0.g);
                    for(Object object1: t00) {
                        m m0 = (m)object1;
                        Long long0 = (Long)map0.get(m0);
                        if(long0 == null) {
                            long0 = g2.h6(f00, m0, map0);
                        }
                        osList0.m(((long)long0));
                    }
                }
            }
        }
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

    public static long i6(F0 f00, y0 y00, Map map0) {
        if(y00 instanceof s && !d1.F5(y00) && ((s)y00).R3().f() != null && ((s)y00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)y00).R3().g().F();
        }
        Table table0 = f00.n4(y0.class);
        long v = table0.getNativePtr();
        b g3$b0 = (b)f00.e0().j(y0.class);
        long v1 = g3$b0.e;
        String s = y00.C();
        long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
        }
        map0.put(y00, v2);
        Table.nativeSetLong(v, g3$b0.f, v2, y00.E2(), false);
        OsList osList0 = new OsList(table0.U(v2), g3$b0.g);
        T0 t00 = y00.Q0();
        if(t00 != null && ((long)t00.size()) == osList0.h0()) {
            int v3 = t00.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                m m0 = (m)t00.get(v4);
                Long long0 = (Long)map0.get(m0);
                if(long0 == null) {
                    long0 = g2.j6(f00, m0, map0);
                }
                osList0.e0(((long)v4), ((long)long0));
            }
            return v2;
        }
        osList0.Q();
        if(t00 != null) {
            for(Object object0: t00) {
                m m1 = (m)object0;
                Long long1 = (Long)map0.get(m1);
                if(long1 == null) {
                    long1 = g2.j6(f00, m1, map0);
                }
                osList0.m(((long)long1));
            }
        }
        return v2;
    }

    public static void j6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(y0.class);
        long v = table0.getNativePtr();
        b g3$b0 = (b)f00.e0().j(y0.class);
        long v1 = g3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            y0 y00 = (y0)object0;
            if(map0.containsKey(y00)) {
            }
            else if(y00 instanceof s && !d1.F5(y00) && ((s)y00).R3().f() != null && ((s)y00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(y00, ((s)y00).R3().g().F());
            }
            else {
                String s = y00.C();
                long v2 = s == null ? Table.nativeFindFirstNull(v, v1) : Table.nativeFindFirstString(v, v1, s);
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, s);
                }
                map0.put(y00, v2);
                Table.nativeSetLong(v, g3$b0.f, v2, y00.E2(), false);
                OsList osList0 = new OsList(table0.U(v2), g3$b0.g);
                T0 t00 = y00.Q0();
                if(t00 != null && ((long)t00.size()) == osList0.h0()) {
                    int v3 = t00.size();
                    for(int v4 = 0; v4 < v3; ++v4) {
                        m m0 = (m)t00.get(v4);
                        Long long0 = (Long)map0.get(m0);
                        if(long0 == null) {
                            long0 = g2.j6(f00, m0, map0);
                        }
                        osList0.e0(((long)v4), ((long)long0));
                    }
                }
                else {
                    osList0.Q();
                    if(t00 != null) {
                        for(Object object1: t00) {
                            m m1 = (m)object1;
                            Long long1 = (Long)map0.get(m1);
                            if(long1 == null) {
                                long1 = g2.j6(f00, m1, map0);
                            }
                            osList0.m(((long)long1));
                        }
                    }
                }
            }
        }
    }

    static g3 k6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(y0.class), false, Collections.emptyList());
        g3 g30 = new g3();
        a$h0.a();
        return g30;
    }

    static y0 l6(F0 f00, b g3$b0, y0 y00, y0 y01, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(y0.class), set0);
        osObjectBuilder0.n4(g3$b0.e, y01.C());
        osObjectBuilder0.n3(g3$b0.f, y01.E2());
        T0 t00 = y01.Q0();
        if(t00 == null) {
            osObjectBuilder0.d4(g3$b0.g, new T0());
        }
        else {
            T0 t01 = new T0();
            for(int v = 0; v < t00.size(); ++v) {
                m m0 = (m)t00.get(v);
                m m1 = (m)map0.get(m0);
                if(m1 == null) {
                    t01.add(g2.Z5(f00, ((io.realm.g2.b)f00.e0().j(m.class)), m0, true, map0, set0));
                }
                else {
                    t01.add(m1);
                }
            }
            osObjectBuilder0.d4(g3$b0.g, t01);
        }
        osObjectBuilder0.x4();
        return y00;
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

    // 去混淆评级： 低(30)
    @Override
    public String toString() {
        return d1.I5(this) ? "UserFavorite = proxy[{userId:" + (this.C() == null ? "null" : this.C()) + "}" + "," + "{updateTime:" + this.E2() + "}" + "," + "{favoriteList:" + "RealmList<FavoriteGallery>[" + this.Q0().size() + "]" + "}" + "]" : "Invalid object";
    }

    @Override  // com.dcinside.app.realm.y0, io.realm.h3
    public void x1(T0 t00) {
        int v = 0;
        if(this.h.i()) {
            if(!this.h.d()) {
                return;
            }
            if(this.h.e().contains("favoriteList")) {
                return;
            }
            if(t00 != null && !t00.L()) {
                F0 f00 = (F0)this.h.f();
                T0 t01 = new T0();
                for(Object object0: t00) {
                    m m0 = (m)object0;
                    if(m0 != null && !d1.H5(m0)) {
                        t01.add(((m)f00.o2(m0, new W[0])));
                    }
                    else {
                        t01.add(m0);
                    }
                }
                t00 = t01;
            }
        }
        this.h.f().k();
        OsList osList0 = this.h.g().y(this.g.g);
        if(t00 != null && ((long)t00.size()) == osList0.h0()) {
            int v1 = t00.size();
            while(v < v1) {
                m m1 = (m)t00.get(v);
                this.h.c(m1);
                osList0.e0(((long)v), ((s)m1).R3().g().F());
                ++v;
            }
            return;
        }
        osList0.Q();
        if(t00 == null) {
            return;
        }
        int v2 = t00.size();
        while(v < v2) {
            m m2 = (m)t00.get(v);
            this.h.c(m2);
            osList0.m(((s)m2).R3().g().F());
            ++v;
        }
    }
}

