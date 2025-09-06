package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

abstract class BinaryReader implements Reader {
    static final class SafeHeapReader extends BinaryReader {
        private final boolean e;
        private final byte[] f;
        private int g;
        private final int h;
        private int i;
        private int j;
        private int k;

        public SafeHeapReader(ByteBuffer byteBuffer0, boolean z) {
            super(null);
            this.e = z;
            this.f = byteBuffer0.array();
            int v = byteBuffer0.arrayOffset() + byteBuffer0.position();
            this.g = v;
            this.h = v;
            this.i = byteBuffer0.arrayOffset() + byteBuffer0.limit();
        }

        private void A(int v) throws IOException {
            if(this.g != v) {
                throw InvalidProtocolBufferException.l();
            }
        }

        private void B(int v) throws IOException {
            if((this.j & 7) != v) {
                throw InvalidProtocolBufferException.e();
            }
        }

        private void C(int v) throws IOException {
            this.z(v);
            this.g += v;
        }

        private void D() throws IOException {
            int v = this.k;
            this.k = this.j >>> 3 << 3 | 4;
            while(this.getFieldNumber() != 0x7FFFFFFF && this.skipField()) {
            }
            if(this.j != this.k) {
                throw InvalidProtocolBufferException.h();
            }
            this.k = v;
        }

        private void E() throws IOException {
            int v = this.g;
            if(this.i - v >= 10) {
                byte[] arr_b = this.f;
                int v1 = 0;
                while(v1 < 10) {
                    if(arr_b[v] >= 0) {
                        this.g = v + 1;
                        return;
                    }
                    ++v1;
                    ++v;
                }
            }
            this.F();
        }

        private void F() throws IOException {
            for(int v = 0; v < 10; ++v) {
                if(this.m() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void G(int v) throws IOException {
            this.z(v);
            if((v & 3) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        private void H(int v) throws IOException {
            this.z(v);
            if((v & 7) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public Object a(Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            this.B(3);
            return this.o(schema0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public Object b(Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            this.B(2);
            return this.t(Protobuf.a().i(class0), extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void c(List list0, Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            this.i(list0, Protobuf.a().i(class0), extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public Object d(Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            this.B(2);
            return this.t(schema0, extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void e(List list0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1;
            if((this.j & 7) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int v = this.j;
            do {
                list0.add(this.t(schema0, extensionRegistryLite0));
                if(this.l()) {
                    return;
                }
                v1 = this.g;
            }
            while(this.w() == v);
            this.g = v1;
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public Object f(Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            this.B(3);
            return this.o(Protobuf.a().i(class0), extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void g(List list0, Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            this.e(list0, Protobuf.a().i(class0), extensionRegistryLite0);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public int getFieldNumber() throws IOException {
            if(this.l()) {
                return 0x7FFFFFFF;
            }
            int v = this.w();
            this.j = v;
            return v == this.k ? 0x7FFFFFFF : v >>> 3;
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public int getTag() {
            return this.j;
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void h(Map map0, Metadata mapEntryLite$Metadata0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            this.B(2);
            int v = this.w();
            this.z(v);
            int v1 = this.i;
            this.i = this.g + v;
            try {
                Object object0 = mapEntryLite$Metadata0.b;
                Object object1 = mapEntryLite$Metadata0.d;
                while(true) {
                    while(true) {
                    label_7:
                        int v2 = this.getFieldNumber();
                        if(v2 == 0x7FFFFFFF) {
                            map0.put(object0, object1);
                            this.i = v1;
                            return;
                        }
                        try {
                            switch(v2) {
                                case 1: {
                                    object0 = this.n(mapEntryLite$Metadata0.a, null, null);
                                    continue;
                                }
                                case 2: {
                                    goto label_17;
                                }
                                default: {
                                    if(this.skipField()) {
                                        continue;
                                    }
                                }
                            }
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        label_17:
                            Class class0 = mapEntryLite$Metadata0.d.getClass();
                            object1 = this.n(mapEntryLite$Metadata0.c, class0, extensionRegistryLite0);
                            continue;
                        }
                        catch(InvalidWireTypeException unused_ex) {
                        }
                        break;
                    }
                    if(this.skipField()) {
                        goto label_7;
                    }
                    break;
                }
                throw new InvalidProtocolBufferException("Unable to parse map entry.");
            }
            catch(Throwable throwable0) {
                this.i = v1;
                throw throwable0;
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void i(List list0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1;
            if((this.j & 7) != 3) {
                throw InvalidProtocolBufferException.e();
            }
            int v = this.j;
            do {
                list0.add(this.o(schema0, extensionRegistryLite0));
                if(this.l()) {
                    return;
                }
                v1 = this.g;
            }
            while(this.w() == v);
            this.g = v1;
        }

        @Override  // androidx.datastore.preferences.protobuf.BinaryReader
        public int j() {
            return this.g - this.h;
        }

        private boolean l() {
            return this.g == this.i;
        }

        private byte m() throws IOException {
            int v = this.g;
            if(v == this.i) {
                throw InvalidProtocolBufferException.l();
            }
            this.g = v + 1;
            return this.f[v];
        }

        private Object n(FieldType wireFormat$FieldType0, Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            switch(wireFormat$FieldType0) {
                case 1: {
                    return Boolean.valueOf(this.readBool());
                }
                case 2: {
                    return this.readBytes();
                }
                case 3: {
                    return this.readDouble();
                }
                case 4: {
                    return this.readEnum();
                }
                case 5: {
                    return this.readFixed32();
                }
                case 6: {
                    return this.readFixed64();
                }
                case 7: {
                    return this.readFloat();
                }
                case 8: {
                    return this.readInt32();
                }
                case 9: {
                    return this.readInt64();
                }
                case 10: {
                    return this.b(class0, extensionRegistryLite0);
                }
                case 11: {
                    return this.readSFixed32();
                }
                case 12: {
                    return this.readSFixed64();
                }
                case 13: {
                    return this.readSInt32();
                }
                case 14: {
                    return this.readSInt64();
                }
                case 15: {
                    return this.readStringRequireUtf8();
                }
                case 16: {
                    return this.readUInt32();
                }
                case 17: {
                    return this.readUInt64();
                }
                default: {
                    throw new RuntimeException("unsupported field type.");
                }
            }
        }

        private Object o(Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v1;
            try {
                v1 = this.k;
                this.k = this.j >>> 3 << 3 | 4;
                Object object0 = schema0.newInstance();
                schema0.b(object0, this, extensionRegistryLite0);
                schema0.makeImmutable(object0);
                if(this.j == this.k) {
                    return object0;
                }
            }
            finally {
                this.k = v1;
            }
            throw InvalidProtocolBufferException.h();
        }

        private int p() throws IOException {
            this.z(4);
            return this.q();
        }

        private int q() {
            int v = this.g;
            this.g = v + 4;
            return (this.f[v + 3] & 0xFF) << 24 | (this.f[v] & 0xFF | (this.f[v + 1] & 0xFF) << 8 | (this.f[v + 2] & 0xFF) << 16);
        }

        private long r() throws IOException {
            this.z(8);
            return this.s();
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public boolean readBool() throws IOException {
            this.B(0);
            return this.w() != 0;
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readBoolList(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof BooleanArrayList) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((BooleanArrayList)list0).addBoolean(this.readBool());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((BooleanArrayList)list0).addBoolean(this.w() != 0);
                        }
                        this.A(v2);
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(Boolean.valueOf(this.readBool()));
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(Boolean.valueOf(this.w() != 0));
                    }
                    this.A(v5);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public ByteString readBytes() throws IOException {
            this.B(2);
            int v = this.w();
            if(v == 0) {
                return ByteString.e;
            }
            this.z(v);
            ByteString byteString0 = this.e ? ByteString.i0(this.f, this.g, v) : ByteString.q(this.f, this.g, v);
            this.g += v;
            return byteString0;
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readBytesList(List list0) throws IOException {
            int v;
            if((this.j & 7) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list0.add(this.readBytes());
                if(this.l()) {
                    return;
                }
                v = this.g;
            }
            while(this.w() == this.j);
            this.g = v;
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public double readDouble() throws IOException {
            this.B(1);
            return Double.longBitsToDouble(this.r());
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readDoubleList(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof DoubleArrayList) {
                switch(this.j & 7) {
                    case 1: {
                        do {
                            ((DoubleArrayList)list0).addDouble(this.readDouble());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        this.H(v1);
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((DoubleArrayList)list0).addDouble(Double.longBitsToDouble(this.s()));
                        }
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 1: {
                    do {
                        list0.add(this.readDouble());
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    this.H(v4);
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(Double.longBitsToDouble(this.s()));
                    }
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public int readEnum() throws IOException {
            this.B(0);
            return this.w();
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readEnumList(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof IntArrayList) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((IntArrayList)list0).addInt(this.readEnum());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((IntArrayList)list0).addInt(this.w());
                        }
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readEnum());
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.w());
                    }
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public int readFixed32() throws IOException {
            this.B(5);
            return this.p();
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readFixed32List(List list0) throws IOException {
            int v5;
            int v2;
            if(list0 instanceof IntArrayList) {
                switch(this.j & 7) {
                    case 2: {
                        int v = this.w();
                        this.G(v);
                        int v1 = this.g + v;
                        while(this.g < v1) {
                            ((IntArrayList)list0).addInt(this.q());
                        }
                        return;
                    }
                    case 5: {
                        break;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
                do {
                    ((IntArrayList)list0).addInt(this.readFixed32());
                    if(this.l()) {
                        return;
                    }
                    v2 = this.g;
                }
                while(this.w() == this.j);
                this.g = v2;
                return;
            }
            switch(this.j & 7) {
                case 2: {
                    int v3 = this.w();
                    this.G(v3);
                    int v4 = this.g + v3;
                    while(this.g < v4) {
                        list0.add(this.q());
                    }
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
            do {
                list0.add(this.readFixed32());
                if(this.l()) {
                    return;
                }
                v5 = this.g;
            }
            while(this.w() == this.j);
            this.g = v5;
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public long readFixed64() throws IOException {
            this.B(1);
            return this.r();
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readFixed64List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof LongArrayList) {
                switch(this.j & 7) {
                    case 1: {
                        do {
                            ((LongArrayList)list0).addLong(this.readFixed64());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        this.H(v1);
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((LongArrayList)list0).addLong(this.s());
                        }
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 1: {
                    do {
                        list0.add(this.readFixed64());
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    this.H(v4);
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.s());
                    }
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public float readFloat() throws IOException {
            this.B(5);
            return Float.intBitsToFloat(this.p());
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readFloatList(List list0) throws IOException {
            int v5;
            int v2;
            if(list0 instanceof FloatArrayList) {
                switch(this.j & 7) {
                    case 2: {
                        int v = this.w();
                        this.G(v);
                        int v1 = this.g + v;
                        while(this.g < v1) {
                            ((FloatArrayList)list0).addFloat(Float.intBitsToFloat(this.q()));
                        }
                        return;
                    }
                    case 5: {
                        break;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
                do {
                    ((FloatArrayList)list0).addFloat(this.readFloat());
                    if(this.l()) {
                        return;
                    }
                    v2 = this.g;
                }
                while(this.w() == this.j);
                this.g = v2;
                return;
            }
            switch(this.j & 7) {
                case 2: {
                    int v3 = this.w();
                    this.G(v3);
                    int v4 = this.g + v3;
                    while(this.g < v4) {
                        list0.add(Float.intBitsToFloat(this.q()));
                    }
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
            do {
                list0.add(this.readFloat());
                if(this.l()) {
                    return;
                }
                v5 = this.g;
            }
            while(this.w() == this.j);
            this.g = v5;
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public int readInt32() throws IOException {
            this.B(0);
            return this.w();
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readInt32List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof IntArrayList) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((IntArrayList)list0).addInt(this.readInt32());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((IntArrayList)list0).addInt(this.w());
                        }
                        this.A(v2);
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readInt32());
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.w());
                    }
                    this.A(v5);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public long readInt64() throws IOException {
            this.B(0);
            return this.x();
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readInt64List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof LongArrayList) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((LongArrayList)list0).addLong(this.readInt64());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((LongArrayList)list0).addLong(this.x());
                        }
                        this.A(v2);
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readInt64());
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.x());
                    }
                    this.A(v5);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public int readSFixed32() throws IOException {
            this.B(5);
            return this.p();
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readSFixed32List(List list0) throws IOException {
            int v5;
            int v2;
            if(list0 instanceof IntArrayList) {
                switch(this.j & 7) {
                    case 2: {
                        int v = this.w();
                        this.G(v);
                        int v1 = this.g + v;
                        while(this.g < v1) {
                            ((IntArrayList)list0).addInt(this.q());
                        }
                        return;
                    }
                    case 5: {
                        break;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
                do {
                    ((IntArrayList)list0).addInt(this.readSFixed32());
                    if(this.l()) {
                        return;
                    }
                    v2 = this.g;
                }
                while(this.w() == this.j);
                this.g = v2;
                return;
            }
            switch(this.j & 7) {
                case 2: {
                    int v3 = this.w();
                    this.G(v3);
                    int v4 = this.g + v3;
                    while(this.g < v4) {
                        list0.add(this.q());
                    }
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
            do {
                list0.add(this.readSFixed32());
                if(this.l()) {
                    return;
                }
                v5 = this.g;
            }
            while(this.w() == this.j);
            this.g = v5;
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public long readSFixed64() throws IOException {
            this.B(1);
            return this.r();
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readSFixed64List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof LongArrayList) {
                switch(this.j & 7) {
                    case 1: {
                        do {
                            ((LongArrayList)list0).addLong(this.readSFixed64());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        this.H(v1);
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((LongArrayList)list0).addLong(this.s());
                        }
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 1: {
                    do {
                        list0.add(this.readSFixed64());
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    this.H(v4);
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.s());
                    }
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public int readSInt32() throws IOException {
            this.B(0);
            return CodedInputStream.b(this.w());
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readSInt32List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof IntArrayList) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((IntArrayList)list0).addInt(this.readSInt32());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((IntArrayList)list0).addInt(CodedInputStream.b(this.w()));
                        }
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readSInt32());
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(CodedInputStream.b(this.w()));
                    }
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public long readSInt64() throws IOException {
            this.B(0);
            return CodedInputStream.c(this.x());
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readSInt64List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof LongArrayList) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((LongArrayList)list0).addLong(this.readSInt64());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((LongArrayList)list0).addLong(CodedInputStream.c(this.x()));
                        }
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readSInt64());
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(CodedInputStream.c(this.x()));
                    }
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public String readString() throws IOException {
            return this.u(false);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readStringList(List list0) throws IOException {
            this.v(list0, false);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readStringListRequireUtf8(List list0) throws IOException {
            this.v(list0, true);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public String readStringRequireUtf8() throws IOException {
            return this.u(true);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public int readUInt32() throws IOException {
            this.B(0);
            return this.w();
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readUInt32List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof IntArrayList) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((IntArrayList)list0).addInt(this.readUInt32());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((IntArrayList)list0).addInt(this.w());
                        }
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readUInt32());
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.w());
                    }
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public long readUInt64() throws IOException {
            this.B(0);
            return this.x();
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public void readUInt64List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof LongArrayList) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((LongArrayList)list0).addLong(this.readUInt64());
                            if(this.l()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.w() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.w();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((LongArrayList)list0).addLong(this.x());
                        }
                        this.A(v2);
                        return;
                    }
                    default: {
                        throw InvalidProtocolBufferException.e();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readUInt64());
                        if(this.l()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.w() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.w();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.x());
                    }
                    this.A(v5);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        private long s() {
            int v = this.g;
            this.g = v + 8;
            return (((long)this.f[v + 7]) & 0xFFL) << 56 | (((long)this.f[v]) & 0xFFL | (((long)this.f[v + 1]) & 0xFFL) << 8 | (((long)this.f[v + 2]) & 0xFFL) << 16 | (((long)this.f[v + 3]) & 0xFFL) << 24 | (((long)this.f[v + 4]) & 0xFFL) << 0x20 | (((long)this.f[v + 5]) & 0xFFL) << 40 | (((long)this.f[v + 6]) & 0xFFL) << 0x30);
        }

        @Override  // androidx.datastore.preferences.protobuf.Reader
        public boolean skipField() throws IOException {
            if(!this.l()) {
                int v = this.j;
                if(v != this.k) {
                    switch(v & 7) {
                        case 0: {
                            this.E();
                            return true;
                        }
                        case 1: {
                            this.C(8);
                            return true;
                        }
                        case 2: {
                            this.C(this.w());
                            return true;
                        }
                        case 3: {
                            this.D();
                            return true;
                        }
                        case 5: {
                            this.C(4);
                            return true;
                        }
                        default: {
                            throw InvalidProtocolBufferException.e();
                        }
                    }
                }
            }
            return false;
        }

        private Object t(Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = this.w();
            this.z(v);
            int v1 = this.i;
            int v2 = this.g + v;
            this.i = v2;
            try {
                Object object0 = schema0.newInstance();
                schema0.b(object0, this, extensionRegistryLite0);
                schema0.makeImmutable(object0);
                if(this.g == v2) {
                    return object0;
                }
            }
            finally {
                this.i = v1;
            }
            throw InvalidProtocolBufferException.h();
        }

        public String u(boolean z) throws IOException {
            this.B(2);
            int v = this.w();
            if(v == 0) {
                return "";
            }
            this.z(v);
            if(z && !Utf8.u(this.f, this.g, this.g + v)) {
                throw InvalidProtocolBufferException.d();
            }
            String s = new String(this.f, this.g, v, Internal.a);
            this.g += v;
            return s;
        }

        public void v(List list0, boolean z) throws IOException {
            int v1;
            int v;
            if((this.j & 7) != 2) {
                throw InvalidProtocolBufferException.e();
            }
            if(list0 instanceof LazyStringList && !z) {
                do {
                    ((LazyStringList)list0).i1(this.readBytes());
                    if(this.l()) {
                        return;
                    }
                    v = this.g;
                }
                while(this.w() == this.j);
                this.g = v;
                return;
            }
            do {
                list0.add(this.u(z));
                if(this.l()) {
                    return;
                }
                v1 = this.g;
            }
            while(this.w() == this.j);
            this.g = v1;
        }

        private int w() throws IOException {
            int v5;
            int v = this.g;
            int v1 = this.i;
            if(v1 == v) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] arr_b = this.f;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.g = v + 1;
                return v2;
            }
            if(v1 - (v + 1) < 9) {
                return (int)this.y();
            }
            int v3 = v + 2;
            int v4 = arr_b[v + 1] << 7 ^ v2;
            if(v4 < 0) {
                v5 = v4 ^ 0xFFFFFF80;
            }
            else {
                int v6 = arr_b[v3] << 14 ^ v4;
                if(v6 >= 0) {
                    v5 = v6 ^ 0x3F80;
                    v3 = v + 3;
                }
                else {
                    int v7 = v6 ^ arr_b[v + 3] << 21;
                    if(v7 < 0) {
                        v5 = 0xFFE03F80 ^ v7;
                        v3 = v + 4;
                    }
                    else {
                        int v8 = arr_b[v + 4];
                        int v9 = v7 ^ v8 << 28 ^ 0xFE03F80;
                        if(v8 >= 0) {
                            v5 = v9;
                            v3 = v + 5;
                        }
                        else if(arr_b[v + 5] >= 0) {
                            v5 = v9;
                            v3 = v + 6;
                        }
                        else if(arr_b[v + 6] >= 0) {
                            v5 = v9;
                            v3 = v + 7;
                        }
                        else if(arr_b[v + 7] >= 0) {
                            v5 = v9;
                            v3 = v + 8;
                        }
                        else if(arr_b[v + 8] < 0) {
                            if(arr_b[v + 9] < 0) {
                                throw InvalidProtocolBufferException.f();
                            }
                            v3 = v + 10;
                            v5 = v9;
                        }
                        else {
                            v5 = v9;
                            v3 = v + 9;
                        }
                    }
                }
            }
            this.g = v3;
            return v5;
        }

        public long x() throws IOException {
            long v5;
            int v = this.g;
            int v1 = this.i;
            if(v1 == v) {
                throw InvalidProtocolBufferException.l();
            }
            byte[] arr_b = this.f;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.g = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) < 9) {
                return this.y();
            }
            int v3 = v + 2;
            int v4 = arr_b[v + 1] << 7 ^ v2;
            if(v4 < 0) {
                v5 = (long)(v4 ^ 0xFFFFFF80);
            }
            else {
                int v6 = arr_b[v3] << 14 ^ v4;
                if(v6 >= 0) {
                    v5 = (long)(v6 ^ 0x3F80);
                    v3 = v + 3;
                }
                else {
                    int v7 = v6 ^ arr_b[v + 3] << 21;
                    if(v7 < 0) {
                        v3 = v + 4;
                        v5 = (long)(0xFFE03F80 ^ v7);
                    }
                    else {
                        v3 = v + 5;
                        long v8 = ((long)v7) ^ ((long)arr_b[v + 4]) << 28;
                        if(v8 >= 0L) {
                            v5 = v8 ^ 0xFE03F80L;
                        }
                        else {
                            long v9 = v8 ^ ((long)arr_b[v3]) << 35;
                            if(v9 < 0L) {
                                v5 = v9 ^ 0xFFFFFFF80FE03F80L;
                                v3 = v + 6;
                            }
                            else {
                                v3 = v + 7;
                                v8 = v9 ^ ((long)arr_b[v + 6]) << 42;
                                if(v8 >= 0L) {
                                    v5 = v8 ^ 0x3F80FE03F80L;
                                }
                                else {
                                    v9 = v8 ^ ((long)arr_b[v3]) << 49;
                                    if(v9 < 0L) {
                                        v5 = v9 ^ 0xFFFE03F80FE03F80L;
                                        v3 = v + 8;
                                    }
                                    else {
                                        v3 = v + 9;
                                        long v10 = v9 ^ ((long)arr_b[v + 8]) << 56 ^ 0xFE03F80FE03F80L;
                                        if(v10 < 0L) {
                                            if(((long)arr_b[v3]) < 0L) {
                                                throw InvalidProtocolBufferException.f();
                                            }
                                            v3 = v + 10;
                                        }
                                        v5 = v10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.g = v3;
            return v5;
        }

        private long y() throws IOException {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.m();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void z(int v) throws IOException {
            if(v < 0 || v > this.i - this.g) {
                throw InvalidProtocolBufferException.l();
            }
        }
    }

    private static final int c = 3;
    private static final int d = 7;

    private BinaryReader() {
    }

    BinaryReader(androidx.datastore.preferences.protobuf.BinaryReader.1 binaryReader$10) {
    }

    public abstract int j();

    public static BinaryReader k(ByteBuffer byteBuffer0, boolean z) {
        if(!byteBuffer0.hasArray()) {
            throw new IllegalArgumentException("Direct buffers not yet supported");
        }
        return new SafeHeapReader(byteBuffer0, z);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
        return false;
    }
}

