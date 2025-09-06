package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite extends LinkedHashMap {
    private boolean a;
    private static final MapFieldLite b;

    static {
        MapFieldLite mapFieldLite0 = new MapFieldLite();
        MapFieldLite.b = mapFieldLite0;
        mapFieldLite0.m();
    }

    private MapFieldLite() {
        this.a = true;
    }

    private MapFieldLite(Map map0) {
        super(map0);
        this.a = true;
    }

    static int a(Map map0) {
        int v = 0;
        for(Object object0: map0.entrySet()) {
            int v1 = MapFieldLite.b(((Map.Entry)object0).getKey());
            v += MapFieldLite.b(((Map.Entry)object0).getValue()) ^ v1;
        }
        return v;
    }

    private static int b(Object object0) {
        if(object0 instanceof byte[]) {
            return Internal.m(((byte[])object0));
        }
        if(object0 instanceof EnumLite) {
            throw new UnsupportedOperationException();
        }
        return object0.hashCode();
    }

    private static void c(Map map0) {
        for(Object object0: map0.keySet()) {
            Internal.d(object0);
            Internal.d(map0.get(object0));
        }
    }

    @Override
    public void clear() {
        this.g();
        super.clear();
    }

    private static Object d(Object object0) {
        return object0 instanceof byte[] ? Arrays.copyOf(((byte[])object0), ((byte[])object0).length) : object0;
    }

    static Map e(Map map0) {
        Map map1 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            map1.put(((Map.Entry)object0).getKey(), MapFieldLite.d(((Map.Entry)object0).getValue()));
        }
        return map1;
    }

    // 去混淆评级： 低(20)
    @Override
    public Set entrySet() {
        return this.isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Map && MapFieldLite.j(this, ((Map)object0));
    }

    public static MapFieldLite f() {
        return MapFieldLite.b;
    }

    private void g() {
        if(!this.l()) {
            throw new UnsupportedOperationException();
        }
    }

    // 去混淆评级： 低(20)
    private static boolean h(Object object0, Object object1) {
        return !(object0 instanceof byte[]) || !(object1 instanceof byte[]) ? object0.equals(object1) : Arrays.equals(((byte[])object0), ((byte[])object1));
    }

    @Override
    public int hashCode() {
        return MapFieldLite.a(this);
    }

    static boolean j(Map map0, Map map1) {
        if(map0 == map1) {
            return true;
        }
        if(map0.size() != map1.size()) {
            return false;
        }
        for(Object object0: map0.entrySet()) {
            if(!map1.containsKey(((Map.Entry)object0).getKey())) {
                return false;
            }
            if(!MapFieldLite.h(((Map.Entry)object0).getValue(), map1.get(((Map.Entry)object0).getKey()))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public boolean l() {
        return this.a;
    }

    public void m() {
        this.a = false;
    }

    public void o(MapFieldLite mapFieldLite0) {
        this.g();
        if(!mapFieldLite0.isEmpty()) {
            this.putAll(mapFieldLite0);
        }
    }

    @Override
    public Object put(Object object0, Object object1) {
        this.g();
        Internal.d(object0);
        Internal.d(object1);
        return super.put(object0, object1);
    }

    @Override
    public void putAll(Map map0) {
        this.g();
        MapFieldLite.c(map0);
        super.putAll(map0);
    }

    // 去混淆评级： 低(20)
    public MapFieldLite q() {
        return this.isEmpty() ? new MapFieldLite() : new MapFieldLite(this);
    }

    public Object r(Map.Entry map$Entry0) {
        return this.put(map$Entry0.getKey(), map$Entry0.getValue());
    }

    @Override
    public Object remove(Object object0) {
        this.g();
        return super.remove(object0);
    }
}

