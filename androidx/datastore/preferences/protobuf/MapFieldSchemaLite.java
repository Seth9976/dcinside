package androidx.datastore.preferences.protobuf;

import java.util.Map.Entry;
import java.util.Map;

class MapFieldSchemaLite implements MapFieldSchema {
    private static int a(int v, Object object0, Object object1) {
        int v1 = 0;
        if(((MapFieldLite)object0).isEmpty()) {
            return 0;
        }
        for(Object object2: ((MapFieldLite)object0).entrySet()) {
            v1 += ((MapEntryLite)object1).a(v, ((Map.Entry)object2).getKey(), ((Map.Entry)object2).getValue());
        }
        return v1;
    }

    private static MapFieldLite b(Object object0, Object object1) {
        MapFieldLite mapFieldLite0 = (MapFieldLite)object0;
        if(!((MapFieldLite)object1).isEmpty()) {
            if(!mapFieldLite0.l()) {
                mapFieldLite0 = mapFieldLite0.q();
            }
            mapFieldLite0.o(((MapFieldLite)object1));
        }
        return mapFieldLite0;
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Map forMapData(Object object0) {
        return (MapFieldLite)object0;
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Metadata forMapMetadata(Object object0) {
        return ((MapEntryLite)object0).d();
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Map forMutableMapData(Object object0) {
        return (MapFieldLite)object0;
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public int getSerializedSize(int v, Object object0, Object object1) {
        return MapFieldSchemaLite.a(v, object0, object1);
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public boolean isImmutable(Object object0) {
        return !((MapFieldLite)object0).l();
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Object mergeFrom(Object object0, Object object1) {
        return MapFieldSchemaLite.b(object0, object1);
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Object newMapField(Object object0) {
        return MapFieldLite.f().q();
    }

    @Override  // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Object toImmutable(Object object0) {
        ((MapFieldLite)object0).m();
        return object0;
    }
}

