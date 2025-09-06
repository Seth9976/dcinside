package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class CodedOutputStreamWriter implements Writer {
    private final CodedOutputStream a;

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream0) {
        CodedOutputStream codedOutputStream1 = (CodedOutputStream)Internal.e(codedOutputStream0, "output");
        this.a = codedOutputStream1;
        codedOutputStream1.a = this;
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void a(int v, ByteString byteString0) throws IOException {
        this.a.a(v, byteString0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void b(int v, Object object0, Schema schema0) throws IOException {
        this.a.Z0(v, ((MessageLite)object0), schema0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void c(int v, Metadata mapEntryLite$Metadata0, Map map0) throws IOException {
        if(this.a.u0()) {
            this.l(v, mapEntryLite$Metadata0, map0);
            return;
        }
        for(Object object0: map0.entrySet()) {
            this.a.t1(v, 2);
            int v1 = MapEntryLite.b(mapEntryLite$Metadata0, ((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            this.a.u1(v1);
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            MapEntryLite.l(this.a, mapEntryLite$Metadata0, object1, object2);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void d(int v, List list0, Schema schema0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.e(v, list0.get(v1), schema0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void e(int v, Object object0, Schema schema0) throws IOException {
        this.a.T0(v, ((MessageLite)object0), schema0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void f(int v, List list0, Schema schema0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.b(v, list0.get(v1), schema0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public FieldOrder fieldOrder() {
        return FieldOrder.a;
    }

    public static CodedOutputStreamWriter g(CodedOutputStream codedOutputStream0) {
        CodedOutputStreamWriter codedOutputStreamWriter0 = codedOutputStream0.a;
        return codedOutputStreamWriter0 == null ? new CodedOutputStreamWriter(codedOutputStream0) : codedOutputStreamWriter0;
    }

    public int h() {
        return this.a.s0();
    }

    private void i(int v, boolean z, Object object0, Metadata mapEntryLite$Metadata0) throws IOException {
        this.a.t1(v, 2);
        int v1 = MapEntryLite.b(mapEntryLite$Metadata0, Boolean.valueOf(z), object0);
        this.a.u1(v1);
        MapEntryLite.l(this.a, mapEntryLite$Metadata0, Boolean.valueOf(z), object0);
    }

    private void j(int v, Metadata mapEntryLite$Metadata0, Map map0) throws IOException {
        int v1 = map0.size();
        int[] arr_v = new int[v1];
        int v3 = 0;
        for(Object object0: map0.keySet()) {
            arr_v[v3] = (int)(((Integer)object0));
            ++v3;
        }
        Arrays.sort(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            int v4 = arr_v[v2];
            Object object1 = map0.get(v4);
            this.a.t1(v, 2);
            int v5 = MapEntryLite.b(mapEntryLite$Metadata0, v4, object1);
            this.a.u1(v5);
            MapEntryLite.l(this.a, mapEntryLite$Metadata0, v4, object1);
        }
    }

    private void k(int v, Metadata mapEntryLite$Metadata0, Map map0) throws IOException {
        int v1 = map0.size();
        long[] arr_v = new long[v1];
        int v3 = 0;
        for(Object object0: map0.keySet()) {
            arr_v[v3] = (long)(((Long)object0));
            ++v3;
        }
        Arrays.sort(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            long v4 = arr_v[v2];
            Object object1 = map0.get(v4);
            this.a.t1(v, 2);
            int v5 = MapEntryLite.b(mapEntryLite$Metadata0, v4, object1);
            this.a.u1(v5);
            MapEntryLite.l(this.a, mapEntryLite$Metadata0, v4, object1);
        }
    }

    private void l(int v, Metadata mapEntryLite$Metadata0, Map map0) throws IOException {
        switch(mapEntryLite$Metadata0.a) {
            case 1: {
                Object object0 = map0.get(Boolean.FALSE);
                if(object0 != null) {
                    this.i(v, false, object0, mapEntryLite$Metadata0);
                }
                Object object1 = map0.get(Boolean.TRUE);
                if(object1 != null) {
                    this.i(v, true, object1, mapEntryLite$Metadata0);
                }
                return;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                this.j(v, mapEntryLite$Metadata0, map0);
                return;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                this.k(v, mapEntryLite$Metadata0, map0);
                return;
            }
            case 12: {
                this.m(v, mapEntryLite$Metadata0, map0);
                return;
            }
            default: {
                throw new IllegalArgumentException("does not support key type: " + mapEntryLite$Metadata0.a);
            }
        }
    }

    private void m(int v, Metadata mapEntryLite$Metadata0, Map map0) throws IOException {
        int v1 = map0.size();
        String[] arr_s = new String[v1];
        int v3 = 0;
        for(Object object0: map0.keySet()) {
            arr_s[v3] = (String)object0;
            ++v3;
        }
        Arrays.sort(arr_s);
        for(int v2 = 0; v2 < v1; ++v2) {
            String s = arr_s[v2];
            Object object1 = map0.get(s);
            this.a.t1(v, 2);
            int v4 = MapEntryLite.b(mapEntryLite$Metadata0, s, object1);
            this.a.u1(v4);
            MapEntryLite.l(this.a, mapEntryLite$Metadata0, s, object1);
        }
    }

    private void n(int v, Object object0) throws IOException {
        if(object0 instanceof String) {
            this.a.writeString(v, ((String)object0));
            return;
        }
        this.a.a(v, ((ByteString)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeBool(int v, boolean z) throws IOException {
        this.a.writeBool(v, z);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeBoolList(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.o(((Boolean)list0.get(v2)).booleanValue());
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                boolean z1 = ((Boolean)list0.get(v1)).booleanValue();
                this.a.G0(z1);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            boolean z2 = ((Boolean)list0.get(v1)).booleanValue();
            this.a.writeBool(v, z2);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeBytesList(int v, List list0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            ByteString byteString0 = (ByteString)list0.get(v1);
            this.a.a(v, byteString0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeDouble(int v, double f) throws IOException {
        this.a.writeDouble(v, f);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeDoubleList(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.w(((double)(((Double)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                double f = (double)(((Double)list0.get(v1)));
                this.a.N0(f);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            double f1 = (double)(((Double)list0.get(v1)));
            this.a.writeDouble(v, f1);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeEndGroup(int v) throws IOException {
        this.a.t1(v, 4);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeEnum(int v, int v1) throws IOException {
        this.a.writeEnum(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeEnumList(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.y(((int)(((Integer)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.O0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.writeEnum(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32(int v, int v1) throws IOException {
        this.a.writeFixed32(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32List(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.A(((int)(((Integer)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.P0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.writeFixed32(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64(int v, long v1) throws IOException {
        this.a.writeFixed64(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64List(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.C(((long)(((Long)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.a.Q0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.a.writeFixed64(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeFloat(int v, float f) throws IOException {
        this.a.writeFloat(v, f);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeFloatList(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.E(((float)(((Float)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                float f = (float)(((Float)list0.get(v1)));
                this.a.R0(f);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            float f1 = (float)(((Float)list0.get(v1)));
            this.a.writeFloat(v, f1);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeGroup(int v, Object object0) throws IOException {
        this.a.S0(v, ((MessageLite)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeGroupList(int v, List list0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.writeGroup(v, list0.get(v1));
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int v, int v1) throws IOException {
        this.a.writeInt32(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32List(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.K(((int)(((Integer)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.W0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.writeInt32(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64(int v, long v1) throws IOException {
        this.a.writeInt64(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64List(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.M(((long)(((Long)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.a.X0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.a.writeInt64(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int v, Object object0) throws IOException {
        this.a.Y0(v, ((MessageLite)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int v, List list0) throws IOException {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.writeMessage(v, list0.get(v1));
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int v, Object object0) throws IOException {
        if(object0 instanceof ByteString) {
            this.a.l1(v, ((ByteString)object0));
            return;
        }
        this.a.c1(v, ((MessageLite)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32(int v, int v1) throws IOException {
        this.a.writeSFixed32(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32List(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.b0(((int)(((Integer)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.o1(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.writeSFixed32(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64(int v, long v1) throws IOException {
        this.a.writeSFixed64(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64List(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.d0(((long)(((Long)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.a.p1(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.a.writeSFixed64(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32(int v, int v1) throws IOException {
        this.a.writeSInt32(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32List(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.f0(((int)(((Integer)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.q1(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.writeSInt32(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64(int v, long v1) throws IOException {
        this.a.writeSInt64(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64List(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.h0(((long)(((Long)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.a.r1(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.a.writeSInt64(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeStartGroup(int v) throws IOException {
        this.a.t1(v, 3);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeString(int v, String s) throws IOException {
        this.a.writeString(v, s);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeStringList(int v, List list0) throws IOException {
        int v1 = 0;
        if(list0 instanceof LazyStringList) {
            while(v1 < list0.size()) {
                this.n(v, ((LazyStringList)list0).getRaw(v1));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            String s = (String)list0.get(v1);
            this.a.writeString(v, s);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32(int v, int v1) throws IOException {
        this.a.writeUInt32(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32List(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.m0(((int)(((Integer)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.u1(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.writeUInt32(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64(int v, long v1) throws IOException {
        this.a.writeUInt64(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64List(int v, List list0, boolean z) throws IOException {
        int v1 = 0;
        if(z) {
            this.a.t1(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.o0(((long)(((Long)list0.get(v2)))));
            }
            this.a.u1(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.a.v1(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.a.writeUInt64(v, v5);
            ++v1;
        }
    }
}

