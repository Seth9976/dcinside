package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import com.dcinside.app.realm.w0;
import com.dcinside.app.realm.x0;
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

public class c3 extends w0 implements d3, s {
    public static final class a {
        public static final String a = "SearchGalleryCategory";

    }

    static final class b extends c {
        long e;
        long f;
        long g;
        long h;

        b(OsSchemaInfo osSchemaInfo0) {
            super(4);
            OsObjectSchemaInfo osObjectSchemaInfo0 = osSchemaInfo0.b("SearchGalleryCategory");
            this.e = this.b("id", "id", osObjectSchemaInfo0);
            this.f = this.b("idx", "idx", osObjectSchemaInfo0);
            this.g = this.b("name", "name", osObjectSchemaInfo0);
            this.h = this.b("galleries", "galleries", osObjectSchemaInfo0);
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

    private b h;
    private A0 i;
    private T0 j;
    private static final String k = "";
    private static final OsObjectSchemaInfo l;

    static {
        c3.l = c3.c6();
    }

    c3() {
        this.i.p();
    }

    @Override  // com.dcinside.app.realm.w0, io.realm.d3
    public long P() {
        this.i.f().k();
        return this.i.g().w(this.h.f);
    }

    @Override  // io.realm.internal.s
    public A0 R3() {
        return this.i;
    }

    @Override  // com.dcinside.app.realm.w0, io.realm.d3
    public void S(long v) {
        if(this.i.i()) {
            return;
        }
        this.i.f().k();
        throw new RealmException("Primary key field \'id\' cannot be changed after object was created.");
    }

    @Override  // com.dcinside.app.realm.w0, io.realm.d3
    public T0 T1() {
        this.i.f().k();
        T0 t00 = this.j;
        if(t00 != null) {
            return t00;
        }
        OsList osList0 = this.i.g().y(this.h.h);
        T0 t01 = new T0(x0.class, osList0, this.i.f());
        this.j = t01;
        return t01;
    }

    public static w0 Y5(F0 f00, b c3$b0, w0 w00, boolean z, Map map0, Set set0) {
        s s0 = (s)map0.get(w00);
        if(s0 != null) {
            return (w0)s0;
        }
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(w0.class), set0);
        osObjectBuilder0.n3(c3$b0.e, w00.m());
        osObjectBuilder0.n3(c3$b0.f, w00.P());
        osObjectBuilder0.n4(c3$b0.g, w00.f());
        w0 w01 = c3.l6(f00, osObjectBuilder0.v4());
        map0.put(w00, w01);
        T0 t00 = w00.T1();
        if(t00 != null) {
            T0 t01 = ((c3)w01).T1();
            t01.clear();
            for(int v = 0; v < t00.size(); ++v) {
                x0 x00 = (x0)t00.get(v);
                x0 x01 = (x0)map0.get(x00);
                if(x01 == null) {
                    t01.add(e3.b6(f00, ((io.realm.e3.b)f00.e0().j(x0.class)), x00, z, map0, set0));
                }
                else {
                    t01.add(x01);
                }
            }
        }
        return w01;
    }

    @Override  // com.dcinside.app.realm.w0, io.realm.d3
    public void Z(long v) {
        if(this.i.i()) {
            if(!this.i.d()) {
                return;
            }
            u u0 = this.i.g();
            u0.b().u0(this.h.f, u0.F(), v, true);
            return;
        }
        this.i.f().k();
        this.i.g().e(this.h.f, v);
    }

    public static w0 Z5(F0 f00, b c3$b0, w0 w00, boolean z, Map map0, Set set0) {
        if(w00 instanceof s && !d1.F5(w00) && ((s)w00).R3().f() != null) {
            io.realm.a a0 = ((s)w00).R3().f();
            if(a0.b != f00.b) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if(a0.getPath().equals(f00.getPath())) {
                return w00;
            }
        }
        c3 c30 = null;
        h a$h0 = (h)io.realm.a.q.get();
        s s0 = (s)map0.get(w00);
        if(s0 != null) {
            return (w0)s0;
        }
        if(z) {
            Table table0 = f00.n4(w0.class);
            long v = table0.t(c3$b0.e, w00.m());
            if(v == -1L) {
                return c3.Y5(f00, c3$b0, w00, true, map0, set0);
            }
            try {
                a$h0.g(f00, table0.U(v), c3$b0, false, Collections.emptyList());
                c30 = new c3();
                map0.put(w00, c30);
            }
            finally {
                a$h0.a();
            }
        }
        return z ? c3.m6(f00, c3$b0, c30, w00, map0, set0) : c3.Y5(f00, c3$b0, w00, z, map0, set0);
    }

    public static b a6(OsSchemaInfo osSchemaInfo0) {
        return new b(osSchemaInfo0);
    }

    public static w0 b6(w0 w00, int v, int v1, Map map0) {
        w0 w01;
        if(v <= v1 && w00 != null) {
            io.realm.internal.s.a s$a0 = (io.realm.internal.s.a)map0.get(w00);
            if(s$a0 == null) {
                w01 = new w0();
                map0.put(w00, new io.realm.internal.s.a(v, w01));
            }
            else {
                if(v >= s$a0.a) {
                    return (w0)s$a0.b;
                }
                s$a0.a = v;
                w01 = (w0)s$a0.b;
            }
            F0 f00 = (F0)((s)w00).R3().f();
            w01.S(w00.m());
            w01.Z(w00.P());
            w01.e(w00.f());
            if(v == v1) {
                w01.d2(null);
                return w01;
            }
            T0 t00 = w00.T1();
            T0 t01 = new T0();
            w01.d2(t01);
            int v2 = t00.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                t01.add(e3.d6(((x0)t00.get(v3)), v + 1, v1, map0));
            }
            return w01;
        }
        return null;
    }

    private static OsObjectSchemaInfo c6() {
        io.realm.internal.OsObjectSchemaInfo.b osObjectSchemaInfo$b0 = new io.realm.internal.OsObjectSchemaInfo.b("", "SearchGalleryCategory", false, 4, 0);
        osObjectSchemaInfo$b0.d("", "id", RealmFieldType.INTEGER, true, false, true);
        osObjectSchemaInfo$b0.d("", "idx", RealmFieldType.INTEGER, false, false, true);
        osObjectSchemaInfo$b0.d("", "name", RealmFieldType.STRING, false, false, false);
        osObjectSchemaInfo$b0.b("", "galleries", RealmFieldType.LIST, "SearchGalleryItem");
        return osObjectSchemaInfo$b0.g();
    }

    @Override  // com.dcinside.app.realm.w0, io.realm.d3
    public void d2(T0 t00) {
        int v = 0;
        if(this.i.i()) {
            if(!this.i.d()) {
                return;
            }
            if(this.i.e().contains("galleries")) {
                return;
            }
            if(t00 != null && !t00.L()) {
                F0 f00 = (F0)this.i.f();
                T0 t01 = new T0();
                for(Object object0: t00) {
                    x0 x00 = (x0)object0;
                    if(x00 != null && !d1.H5(x00)) {
                        t01.add(((x0)f00.t2(x00, new W[0])));
                    }
                    else {
                        t01.add(x00);
                    }
                }
                t00 = t01;
            }
        }
        this.i.f().k();
        OsList osList0 = this.i.g().y(this.h.h);
        if(t00 != null && ((long)t00.size()) == osList0.h0()) {
            int v1 = t00.size();
            while(v < v1) {
                x0 x01 = (x0)t00.get(v);
                this.i.c(x01);
                osList0.e0(((long)v), ((s)x01).R3().g().F());
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
            x0 x02 = (x0)t00.get(v);
            this.i.c(x02);
            osList0.m(((s)x02).R3().g().F());
            ++v;
        }
    }

    public static w0 d6(F0 f00, JSONObject jSONObject0, boolean z) throws JSONException {
        w0 w00;
        ArrayList arrayList0 = new ArrayList(1);
        Class class0 = w0.class;
        if(z) {
            Table table0 = f00.n4(class0);
            long v = ((b)f00.e0().j(class0)).e;
            long v1 = jSONObject0.isNull("id") ? -1L : table0.t(v, jSONObject0.getLong("id"));
            if(v1 == -1L) {
                w00 = null;
            }
            else {
                h a$h0 = (h)io.realm.a.q.get();
                try {
                    a$h0.g(f00, table0.U(v1), f00.e0().j(class0), false, Collections.emptyList());
                    w00 = new c3();
                }
                finally {
                    a$h0.a();
                }
            }
        }
        else {
            w00 = null;
        }
        if(w00 == null) {
            if(jSONObject0.has("galleries")) {
                arrayList0.add("galleries");
            }
            if(!jSONObject0.has("id")) {
                throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'id\'.");
            }
            w00 = jSONObject0.isNull("id") ? ((c3)f00.v3(class0, null, true, arrayList0)) : ((c3)f00.v3(class0, jSONObject0.getLong("id"), true, arrayList0));
        }
        if(jSONObject0.has("idx")) {
            if(jSONObject0.isNull("idx")) {
                throw new IllegalArgumentException("Trying to set non-nullable field \'idx\' to null.");
            }
            w00.Z(jSONObject0.getLong("idx"));
        }
        if(jSONObject0.has("name")) {
            if(jSONObject0.isNull("name")) {
                w00.e(null);
            }
            else {
                w00.e(jSONObject0.getString("name"));
            }
        }
        if(jSONObject0.has("galleries")) {
            if(jSONObject0.isNull("galleries")) {
                w00.d2(null);
                return w00;
            }
            w00.T1().clear();
            JSONArray jSONArray0 = jSONObject0.getJSONArray("galleries");
            for(int v3 = 0; v3 < jSONArray0.length(); ++v3) {
                x0 x00 = e3.f6(f00, jSONArray0.getJSONObject(v3), z);
                w00.T1().add(x00);
            }
        }
        return w00;
    }

    @Override  // com.dcinside.app.realm.w0, io.realm.d3
    public void e(String s) {
        if(this.i.i()) {
            if(!this.i.d()) {
                return;
            }
            u u0 = this.i.g();
            if(s == null) {
                u0.b().v0(this.h.g, u0.F(), true);
                return;
            }
            u0.b().y0(this.h.g, u0.F(), s, true);
            return;
        }
        this.i.f().k();
        if(s == null) {
            this.i.g().K(this.h.g);
            return;
        }
        this.i.g().a(this.h.g, s);
    }

    @TargetApi(11)
    public static w0 e6(F0 f00, JsonReader jsonReader0) throws IOException {
        w0 w00 = new w0();
        jsonReader0.beginObject();
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(s.equals("id")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    w00.S(jsonReader0.nextLong());
                    z = true;
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'id\' to null.");
            }
            if(s.equals("idx")) {
                if(jsonReader0.peek() != JsonToken.NULL) {
                    w00.Z(jsonReader0.nextLong());
                    continue;
                }
                jsonReader0.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field \'idx\' to null.");
            }
            if(s.equals("name")) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.skipValue();
                    w00.e(null);
                }
                else {
                    w00.e(jsonReader0.nextString());
                }
            }
            else if(!s.equals("galleries")) {
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.skipValue();
                w00.d2(null);
            }
            else {
                w00.d2(new T0());
                jsonReader0.beginArray();
                while(jsonReader0.hasNext()) {
                    x0 x00 = e3.g6(f00, jsonReader0);
                    w00.T1().add(x00);
                }
                jsonReader0.endArray();
            }
        }
        jsonReader0.endObject();
        if(!z) {
            throw new IllegalArgumentException("JSON object doesn\'t have the primary key field \'id\'.");
        }
        return (w0)f00.t2(w00, new W[0]);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            io.realm.a a0 = this.i.f();
            io.realm.a a1 = ((c3)object0).i.f();
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
            String s2 = this.i.g().b().P();
            String s3 = ((c3)object0).i.g().b().P();
            if(s2 != null) {
                return s2.equals(s3) ? this.i.g().F() == ((c3)object0).i.g().F() : false;
            }
            return s3 == null ? this.i.g().F() == ((c3)object0).i.g().F() : false;
        }
        return false;
    }

    @Override  // com.dcinside.app.realm.w0, io.realm.d3
    public String f() {
        this.i.f().k();
        return this.i.g().U(this.h.g);
    }

    public static OsObjectSchemaInfo f6() {
        return c3.l;
    }

    public static String g6() {
        return "SearchGalleryCategory";
    }

    public static long h6(F0 f00, w0 w00, Map map0) {
        if(w00 instanceof s && !d1.F5(w00) && ((s)w00).R3().f() != null && ((s)w00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)w00).R3().g().F();
        }
        Table table0 = f00.n4(w0.class);
        long v = table0.getNativePtr();
        b c3$b0 = (b)f00.e0().j(w0.class);
        long v1 = c3$b0.e;
        Long long0 = w00.m();
        long v2 = Table.nativeFindFirstInt(v, v1, w00.m());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, w00.m());
        }
        else {
            Table.B0(long0);
        }
        map0.put(w00, v2);
        Table.nativeSetLong(v, c3$b0.f, v2, w00.P(), false);
        String s = w00.f();
        if(s != null) {
            Table.nativeSetString(v, c3$b0.g, v2, s, false);
        }
        T0 t00 = w00.T1();
        if(t00 != null) {
            OsList osList0 = new OsList(table0.U(v2), c3$b0.h);
            for(Object object0: t00) {
                x0 x00 = (x0)object0;
                Long long1 = (Long)map0.get(x00);
                if(long1 == null) {
                    long1 = e3.j6(f00, x00, map0);
                }
                osList0.m(((long)long1));
            }
            return v2;
        }
        return v2;
    }

    @Override
    public int hashCode() {
        String s = this.i.f().getPath();
        String s1 = this.i.g().b().P();
        long v = this.i.g().F();
        int v1 = 0;
        int v2 = s == null ? 0 : s.hashCode();
        if(s1 != null) {
            v1 = s1.hashCode();
        }
        return ((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    public static void i6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(w0.class);
        long v = table0.getNativePtr();
        b c3$b0 = (b)f00.e0().j(w0.class);
        long v1 = c3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            w0 w00 = (w0)object0;
            if(map0.containsKey(w00)) {
            }
            else if(w00 instanceof s && !d1.F5(w00) && ((s)w00).R3().f() != null && ((s)w00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(w00, ((s)w00).R3().g().F());
            }
            else {
                Long long0 = w00.m();
                long v2 = Table.nativeFindFirstInt(v, v1, w00.m());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, w00.m());
                }
                else {
                    Table.B0(long0);
                }
                map0.put(w00, v2);
                Table.nativeSetLong(v, c3$b0.f, v2, w00.P(), false);
                String s = w00.f();
                if(s != null) {
                    Table.nativeSetString(v, c3$b0.g, v2, s, false);
                }
                T0 t00 = w00.T1();
                if(t00 != null) {
                    OsList osList0 = new OsList(table0.U(v2), c3$b0.h);
                    for(Object object1: t00) {
                        x0 x00 = (x0)object1;
                        Long long1 = (Long)map0.get(x00);
                        if(long1 == null) {
                            long1 = e3.j6(f00, x00, map0);
                        }
                        osList0.m(((long)long1));
                    }
                }
            }
        }
    }

    public static long j6(F0 f00, w0 w00, Map map0) {
        if(w00 instanceof s && !d1.F5(w00) && ((s)w00).R3().f() != null && ((s)w00).R3().f().getPath().equals(f00.getPath())) {
            return ((s)w00).R3().g().F();
        }
        Table table0 = f00.n4(w0.class);
        long v = table0.getNativePtr();
        b c3$b0 = (b)f00.e0().j(w0.class);
        long v1 = c3$b0.e;
        w00.m();
        long v2 = Table.nativeFindFirstInt(v, v1, w00.m());
        if(v2 == -1L) {
            v2 = OsObject.createRowWithPrimaryKey(table0, v1, w00.m());
        }
        map0.put(w00, v2);
        Table.nativeSetLong(v, c3$b0.f, v2, w00.P(), false);
        String s = w00.f();
        if(s == null) {
            Table.nativeSetNull(v, c3$b0.g, v2, false);
        }
        else {
            Table.nativeSetString(v, c3$b0.g, v2, s, false);
        }
        OsList osList0 = new OsList(table0.U(v2), c3$b0.h);
        T0 t00 = w00.T1();
        if(t00 != null && ((long)t00.size()) == osList0.h0()) {
            int v3 = t00.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                x0 x00 = (x0)t00.get(v4);
                Long long0 = (Long)map0.get(x00);
                if(long0 == null) {
                    long0 = e3.l6(f00, x00, map0);
                }
                osList0.e0(((long)v4), ((long)long0));
            }
            return v2;
        }
        osList0.Q();
        if(t00 != null) {
            for(Object object0: t00) {
                x0 x01 = (x0)object0;
                Long long1 = (Long)map0.get(x01);
                if(long1 == null) {
                    long1 = e3.l6(f00, x01, map0);
                }
                osList0.m(((long)long1));
            }
        }
        return v2;
    }

    public static void k6(F0 f00, Iterator iterator0, Map map0) {
        Table table0 = f00.n4(w0.class);
        long v = table0.getNativePtr();
        b c3$b0 = (b)f00.e0().j(w0.class);
        long v1 = c3$b0.e;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            w0 w00 = (w0)object0;
            if(map0.containsKey(w00)) {
            }
            else if(w00 instanceof s && !d1.F5(w00) && ((s)w00).R3().f() != null && ((s)w00).R3().f().getPath().equals(f00.getPath())) {
                map0.put(w00, ((s)w00).R3().g().F());
            }
            else {
                w00.m();
                long v2 = Table.nativeFindFirstInt(v, v1, w00.m());
                if(v2 == -1L) {
                    v2 = OsObject.createRowWithPrimaryKey(table0, v1, w00.m());
                }
                map0.put(w00, v2);
                Table.nativeSetLong(v, c3$b0.f, v2, w00.P(), false);
                String s = w00.f();
                if(s == null) {
                    Table.nativeSetNull(v, c3$b0.g, v2, false);
                }
                else {
                    Table.nativeSetString(v, c3$b0.g, v2, s, false);
                }
                OsList osList0 = new OsList(table0.U(v2), c3$b0.h);
                T0 t00 = w00.T1();
                if(t00 != null && ((long)t00.size()) == osList0.h0()) {
                    int v3 = t00.size();
                    for(int v4 = 0; v4 < v3; ++v4) {
                        x0 x00 = (x0)t00.get(v4);
                        Long long0 = (Long)map0.get(x00);
                        if(long0 == null) {
                            long0 = e3.l6(f00, x00, map0);
                        }
                        osList0.e0(((long)v4), ((long)long0));
                    }
                }
                else {
                    osList0.Q();
                    if(t00 != null) {
                        for(Object object1: t00) {
                            x0 x01 = (x0)object1;
                            Long long1 = (Long)map0.get(x01);
                            if(long1 == null) {
                                long1 = e3.l6(f00, x01, map0);
                            }
                            osList0.m(((long)long1));
                        }
                    }
                }
            }
        }
    }

    static c3 l6(io.realm.a a0, u u0) {
        h a$h0 = (h)io.realm.a.q.get();
        a$h0.g(a0, u0, a0.e0().j(w0.class), false, Collections.emptyList());
        c3 c30 = new c3();
        a$h0.a();
        return c30;
    }

    @Override  // com.dcinside.app.realm.w0, io.realm.d3
    public long m() {
        this.i.f().k();
        return this.i.g().w(this.h.e);
    }

    @Override  // io.realm.internal.s
    public void m2() {
        if(this.i != null) {
            return;
        }
        h a$h0 = (h)io.realm.a.q.get();
        this.h = (b)a$h0.c();
        A0 a00 = new A0(this);
        this.i = a00;
        a00.r(a$h0.e());
        this.i.s(a$h0.f());
        this.i.o(a$h0.b());
        this.i.q(a$h0.d());
    }

    static w0 m6(F0 f00, b c3$b0, w0 w00, w0 w01, Map map0, Set set0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(f00.n4(w0.class), set0);
        osObjectBuilder0.n3(c3$b0.e, w01.m());
        osObjectBuilder0.n3(c3$b0.f, w01.P());
        osObjectBuilder0.n4(c3$b0.g, w01.f());
        T0 t00 = w01.T1();
        if(t00 == null) {
            osObjectBuilder0.d4(c3$b0.h, new T0());
        }
        else {
            T0 t01 = new T0();
            for(int v = 0; v < t00.size(); ++v) {
                x0 x00 = (x0)t00.get(v);
                x0 x01 = (x0)map0.get(x00);
                if(x01 == null) {
                    t01.add(e3.b6(f00, ((io.realm.e3.b)f00.e0().j(x0.class)), x00, true, map0, set0));
                }
                else {
                    t01.add(x01);
                }
            }
            osObjectBuilder0.d4(c3$b0.h, t01);
        }
        osObjectBuilder0.x4();
        return w00;
    }

    // 去混淆评级： 低(30)
    @Override
    public String toString() {
        return d1.I5(this) ? "SearchGalleryCategory = proxy[{id:" + this.m() + "}" + "," + "{idx:" + this.P() + "}" + "," + "{name:" + (this.f() == null ? "null" : this.f()) + "}" + "," + "{galleries:" + "RealmList<SearchGalleryItem>[" + this.T1().size() + "]" + "}" + "]" : "Invalid object";
    }
}

