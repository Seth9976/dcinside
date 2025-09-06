package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

public class MapEntryLite {
    static class Metadata {
        public final FieldType a;
        public final Object b;
        public final FieldType c;
        public final Object d;

        public Metadata(FieldType wireFormat$FieldType0, Object object0, FieldType wireFormat$FieldType1, Object object1) {
            this.a = wireFormat$FieldType0;
            this.b = object0;
            this.c = wireFormat$FieldType1;
            this.d = object1;
        }
    }

    private final Metadata a;
    private final Object b;
    private final Object c;
    private static final int d = 1;
    private static final int e = 2;

    private MapEntryLite(Metadata mapEntryLite$Metadata0, Object object0, Object object1) {
        this.a = mapEntryLite$Metadata0;
        this.b = object0;
        this.c = object1;
    }

    private MapEntryLite(FieldType wireFormat$FieldType0, Object object0, FieldType wireFormat$FieldType1, Object object1) {
        this.a = new Metadata(wireFormat$FieldType0, object0, wireFormat$FieldType1, object1);
        this.b = object0;
        this.c = object1;
    }

    public int a(int v, Object object0, Object object1) {
        return CodedOutputStream.k0(v) + CodedOutputStream.Q(MapEntryLite.b(this.a, object0, object1));
    }

    static int b(Metadata mapEntryLite$Metadata0, Object object0, Object object1) {
        return FieldSet.o(mapEntryLite$Metadata0.a, 1, object0) + FieldSet.o(mapEntryLite$Metadata0.c, 2, object1);
    }

    public Object c() {
        return this.b;
    }

    Metadata d() {
        return this.a;
    }

    public Object e() {
        return this.c;
    }

    public static MapEntryLite f(FieldType wireFormat$FieldType0, Object object0, FieldType wireFormat$FieldType1, Object object1) {
        return new MapEntryLite(wireFormat$FieldType0, object0, wireFormat$FieldType1, object1);
    }

    public Map.Entry g(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return MapEntryLite.h(byteString0.H(), this.a, extensionRegistryLite0);
    }

    static Map.Entry h(CodedInputStream codedInputStream0, Metadata mapEntryLite$Metadata0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        Object object0 = mapEntryLite$Metadata0.b;
        Object object1 = mapEntryLite$Metadata0.d;
        int v;
        while((v = codedInputStream0.Y()) != 0) {
            if(v == WireFormat.c(1, mapEntryLite$Metadata0.a.b())) {
                object0 = MapEntryLite.i(codedInputStream0, extensionRegistryLite0, mapEntryLite$Metadata0.a, object0);
            }
            else if(v == WireFormat.c(2, mapEntryLite$Metadata0.c.b())) {
                object1 = MapEntryLite.i(codedInputStream0, extensionRegistryLite0, mapEntryLite$Metadata0.c, object1);
            }
            else if(!codedInputStream0.g0(v)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(object0, object1);
    }

    static Object i(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, FieldType wireFormat$FieldType0, Object object0) throws IOException {
        switch(wireFormat$FieldType0) {
            case 1: {
                Builder messageLite$Builder0 = ((MessageLite)object0).toBuilder();
                codedInputStream0.I(messageLite$Builder0, extensionRegistryLite0);
                return messageLite$Builder0.buildPartial();
            }
            case 2: {
                return codedInputStream0.z();
            }
            case 3: {
                throw new RuntimeException("Groups are not allowed in maps.");
            }
            default: {
                return FieldSet.N(codedInputStream0, wireFormat$FieldType0, true);
            }
        }
    }

    public void j(MapFieldLite mapFieldLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        int v = codedInputStream0.t(codedInputStream0.N());
        Object object0 = this.a.b;
        Object object1 = this.a.d;
        int v1;
        while((v1 = codedInputStream0.Y()) != 0) {
            if(v1 == WireFormat.c(1, this.a.a.b())) {
                object0 = MapEntryLite.i(codedInputStream0, extensionRegistryLite0, this.a.a, object0);
            }
            else if(v1 == WireFormat.c(2, this.a.c.b())) {
                object1 = MapEntryLite.i(codedInputStream0, extensionRegistryLite0, this.a.c, object1);
            }
            else if(!codedInputStream0.g0(v1)) {
                break;
            }
        }
        codedInputStream0.a(0);
        codedInputStream0.s(v);
        mapFieldLite0.put(object0, object1);
    }

    public void k(CodedOutputStream codedOutputStream0, int v, Object object0, Object object1) throws IOException {
        codedOutputStream0.t1(v, 2);
        codedOutputStream0.u1(MapEntryLite.b(this.a, object0, object1));
        MapEntryLite.l(codedOutputStream0, this.a, object0, object1);
    }

    static void l(CodedOutputStream codedOutputStream0, Metadata mapEntryLite$Metadata0, Object object0, Object object1) throws IOException {
        FieldSet.R(codedOutputStream0, mapEntryLite$Metadata0.a, 1, object0);
        FieldSet.R(codedOutputStream0, mapEntryLite$Metadata0.c, 2, object1);
    }
}

