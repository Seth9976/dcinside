package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

final class CodedInputStreamReader implements Reader {
    private final CodedInputStream c;
    private int d;
    private int e;
    private int f;
    private static final int g = 3;
    private static final int h = 7;
    private static final int i;

    private CodedInputStreamReader(CodedInputStream codedInputStream0) {
        this.f = 0;
        CodedInputStream codedInputStream1 = (CodedInputStream)Internal.e(codedInputStream0, "input");
        this.c = codedInputStream1;
        codedInputStream1.d = this;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public Object a(Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.p(3);
        return this.l(schema0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public Object b(Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.p(2);
        return this.m(Protobuf.a().i(class0), extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void c(List list0, Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.i(list0, Protobuf.a().i(class0), extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public Object d(Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.p(2);
        return this.m(schema0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void e(List list0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        if((this.d & 7) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int v = this.d;
        while(true) {
            list0.add(this.m(schema0, extensionRegistryLite0));
            if(this.c.i() || this.f != 0) {
                break;
            }
            int v1 = this.c.Y();
            if(v1 != v) {
                this.f = v1;
                return;
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public Object f(Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.p(3);
        return this.l(Protobuf.a().i(class0), extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void g(List list0, Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.e(list0, Protobuf.a().i(class0), extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public int getFieldNumber() throws IOException {
        int v = this.f;
        if(v != 0) {
            this.d = v;
            this.f = 0;
            return this.d == 0 || this.d == this.e ? 0x7FFFFFFF : this.d >>> 3;
        }
        this.d = this.c.Y();
        return this.d == 0 || this.d == this.e ? 0x7FFFFFFF : this.d >>> 3;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public int getTag() {
        return this.d;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void h(Map map0, Metadata mapEntryLite$Metadata0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.p(2);
        int v = this.c.Z();
        int v1 = this.c.t(v);
        Object object0 = mapEntryLite$Metadata0.b;
        Object object1 = mapEntryLite$Metadata0.d;
        try {
        alab1:
            while(true) {
                while(true) {
                    int v3 = this.getFieldNumber();
                    if(v3 == 0x7FFFFFFF || this.c.i()) {
                        break alab1;
                    }
                    try {
                        switch(v3) {
                            case 1: {
                                object0 = this.k(mapEntryLite$Metadata0.a, null, null);
                                continue;
                            }
                            case 2: {
                                goto label_14;
                            }
                            default: {
                                if(this.skipField()) {
                                    continue;
                                }
                            }
                        }
                        throw new InvalidProtocolBufferException("Unable to parse map entry.");
                    label_14:
                        Class class0 = mapEntryLite$Metadata0.d.getClass();
                        object1 = this.k(mapEntryLite$Metadata0.c, class0, extensionRegistryLite0);
                        continue;
                    }
                    catch(InvalidWireTypeException unused_ex) {
                    }
                    break;
                }
                if(!this.skipField()) {
                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                }
            }
            map0.put(object0, object1);
        }
        finally {
            this.c.s(v1);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void i(List list0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        if((this.d & 7) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int v = this.d;
        while(true) {
            list0.add(this.l(schema0, extensionRegistryLite0));
            if(this.c.i() || this.f != 0) {
                break;
            }
            int v1 = this.c.Y();
            if(v1 != v) {
                this.f = v1;
                return;
            }
        }
    }

    public static CodedInputStreamReader j(CodedInputStream codedInputStream0) {
        CodedInputStreamReader codedInputStreamReader0 = codedInputStream0.d;
        return codedInputStreamReader0 == null ? new CodedInputStreamReader(codedInputStream0) : codedInputStreamReader0;
    }

    private Object k(FieldType wireFormat$FieldType0, Class class0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
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

    private Object l(Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        int v1;
        try {
            v1 = this.e;
            this.e = this.d >>> 3 << 3 | 4;
            Object object0 = schema0.newInstance();
            schema0.b(object0, this, extensionRegistryLite0);
            schema0.makeImmutable(object0);
            if(this.d == this.e) {
                return object0;
            }
        }
        finally {
            this.e = v1;
        }
        throw InvalidProtocolBufferException.h();
    }

    private Object m(Schema schema0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        int v = this.c.Z();
        CodedInputStream codedInputStream0 = this.c;
        if(codedInputStream0.a >= codedInputStream0.b) {
            throw InvalidProtocolBufferException.i();
        }
        int v1 = codedInputStream0.t(v);
        Object object0 = schema0.newInstance();
        ++this.c.a;
        schema0.b(object0, this, extensionRegistryLite0);
        schema0.makeImmutable(object0);
        this.c.a(0);
        --this.c.a;
        this.c.s(v1);
        return object0;
    }

    public void n(List list0, boolean z) throws IOException {
        int v1;
        int v;
        if((this.d & 7) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if(list0 instanceof LazyStringList && !z) {
            do {
                ((LazyStringList)list0).i1(this.readBytes());
                if(this.c.i()) {
                    return;
                }
                v = this.c.Y();
            }
            while(v == this.d);
            this.f = v;
            return;
        }
        do {
            list0.add((z ? this.readStringRequireUtf8() : this.readString()));
            if(this.c.i()) {
                return;
            }
            v1 = this.c.Y();
        }
        while(v1 == this.d);
        this.f = v1;
    }

    private void o(int v) throws IOException {
        if(this.c.h() != v) {
            throw InvalidProtocolBufferException.l();
        }
    }

    private void p(int v) throws IOException {
        if((this.d & 7) != v) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void q(int v) throws IOException {
        if((v & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void r(int v) throws IOException {
        if((v & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public boolean readBool() throws IOException {
        this.p(0);
        return this.c.u();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readBoolList(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof BooleanArrayList) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((BooleanArrayList)list0).addBoolean(this.c.u());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    int v2 = this.c.h() + v1;
                    do {
                        ((BooleanArrayList)list0).addBoolean(this.c.u());
                    }
                    while(this.c.h() < v2);
                    this.o(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(this.c.u()));
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                int v5 = this.c.h() + v4;
                do {
                    list0.add(Boolean.valueOf(this.c.u()));
                }
                while(this.c.h() < v5);
                this.o(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public ByteString readBytes() throws IOException {
        this.p(2);
        return this.c.x();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readBytesList(List list0) throws IOException {
        int v;
        if((this.d & 7) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list0.add(this.readBytes());
            if(this.c.i()) {
                return;
            }
            v = this.c.Y();
        }
        while(v == this.d);
        this.f = v;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public double readDouble() throws IOException {
        this.p(1);
        return this.c.y();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readDoubleList(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof DoubleArrayList) {
            switch(this.d & 7) {
                case 1: {
                    do {
                        ((DoubleArrayList)list0).addDouble(this.c.y());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    this.r(v1);
                    int v2 = this.c.h();
                    do {
                        ((DoubleArrayList)list0).addDouble(this.c.y());
                    }
                    while(this.c.h() < v2 + v1);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 1: {
                do {
                    list0.add(this.c.y());
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                this.r(v4);
                int v5 = this.c.h();
                do {
                    list0.add(this.c.y());
                }
                while(this.c.h() < v5 + v4);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public int readEnum() throws IOException {
        this.p(0);
        return this.c.z();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readEnumList(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof IntArrayList) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((IntArrayList)list0).addInt(this.c.z());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    int v2 = this.c.h() + v1;
                    do {
                        ((IntArrayList)list0).addInt(this.c.z());
                    }
                    while(this.c.h() < v2);
                    this.o(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.z());
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                int v5 = this.c.h() + v4;
                do {
                    list0.add(this.c.z());
                }
                while(this.c.h() < v5);
                this.o(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public int readFixed32() throws IOException {
        this.p(5);
        return this.c.A();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readFixed32List(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof IntArrayList) {
            switch(this.d & 7) {
                case 2: {
                    int v = this.c.Z();
                    this.q(v);
                    int v1 = this.c.h();
                    do {
                        ((IntArrayList)list0).addInt(this.c.A());
                    }
                    while(this.c.h() < v1 + v);
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
                ((IntArrayList)list0).addInt(this.c.A());
                if(this.c.i()) {
                    return;
                }
                v2 = this.c.Y();
            }
            while(v2 == this.d);
            this.f = v2;
            return;
        }
        switch(this.d & 7) {
            case 2: {
                int v3 = this.c.Z();
                this.q(v3);
                int v4 = this.c.h();
                do {
                    list0.add(this.c.A());
                }
                while(this.c.h() < v4 + v3);
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
            list0.add(this.c.A());
            if(this.c.i()) {
                return;
            }
            v5 = this.c.Y();
        }
        while(v5 == this.d);
        this.f = v5;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public long readFixed64() throws IOException {
        this.p(1);
        return this.c.B();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readFixed64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof LongArrayList) {
            switch(this.d & 7) {
                case 1: {
                    do {
                        ((LongArrayList)list0).addLong(this.c.B());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    this.r(v1);
                    int v2 = this.c.h();
                    do {
                        ((LongArrayList)list0).addLong(this.c.B());
                    }
                    while(this.c.h() < v2 + v1);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 1: {
                do {
                    list0.add(this.c.B());
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                this.r(v4);
                int v5 = this.c.h();
                do {
                    list0.add(this.c.B());
                }
                while(this.c.h() < v5 + v4);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public float readFloat() throws IOException {
        this.p(5);
        return this.c.C();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readFloatList(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof FloatArrayList) {
            switch(this.d & 7) {
                case 2: {
                    int v = this.c.Z();
                    this.q(v);
                    int v1 = this.c.h();
                    do {
                        ((FloatArrayList)list0).addFloat(this.c.C());
                    }
                    while(this.c.h() < v1 + v);
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
                ((FloatArrayList)list0).addFloat(this.c.C());
                if(this.c.i()) {
                    return;
                }
                v2 = this.c.Y();
            }
            while(v2 == this.d);
            this.f = v2;
            return;
        }
        switch(this.d & 7) {
            case 2: {
                int v3 = this.c.Z();
                this.q(v3);
                int v4 = this.c.h();
                do {
                    list0.add(this.c.C());
                }
                while(this.c.h() < v4 + v3);
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
            list0.add(this.c.C());
            if(this.c.i()) {
                return;
            }
            v5 = this.c.Y();
        }
        while(v5 == this.d);
        this.f = v5;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public int readInt32() throws IOException {
        this.p(0);
        return this.c.F();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readInt32List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof IntArrayList) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((IntArrayList)list0).addInt(this.c.F());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    int v2 = this.c.h() + v1;
                    do {
                        ((IntArrayList)list0).addInt(this.c.F());
                    }
                    while(this.c.h() < v2);
                    this.o(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.F());
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                int v5 = this.c.h() + v4;
                do {
                    list0.add(this.c.F());
                }
                while(this.c.h() < v5);
                this.o(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public long readInt64() throws IOException {
        this.p(0);
        return this.c.G();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readInt64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof LongArrayList) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((LongArrayList)list0).addLong(this.c.G());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    int v2 = this.c.h() + v1;
                    do {
                        ((LongArrayList)list0).addLong(this.c.G());
                    }
                    while(this.c.h() < v2);
                    this.o(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.G());
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                int v5 = this.c.h() + v4;
                do {
                    list0.add(this.c.G());
                }
                while(this.c.h() < v5);
                this.o(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public int readSFixed32() throws IOException {
        this.p(5);
        return this.c.S();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed32List(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof IntArrayList) {
            switch(this.d & 7) {
                case 2: {
                    int v = this.c.Z();
                    this.q(v);
                    int v1 = this.c.h();
                    do {
                        ((IntArrayList)list0).addInt(this.c.S());
                    }
                    while(this.c.h() < v1 + v);
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
                ((IntArrayList)list0).addInt(this.c.S());
                if(this.c.i()) {
                    return;
                }
                v2 = this.c.Y();
            }
            while(v2 == this.d);
            this.f = v2;
            return;
        }
        switch(this.d & 7) {
            case 2: {
                int v3 = this.c.Z();
                this.q(v3);
                int v4 = this.c.h();
                do {
                    list0.add(this.c.S());
                }
                while(this.c.h() < v4 + v3);
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
            list0.add(this.c.S());
            if(this.c.i()) {
                return;
            }
            v5 = this.c.Y();
        }
        while(v5 == this.d);
        this.f = v5;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public long readSFixed64() throws IOException {
        this.p(1);
        return this.c.T();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof LongArrayList) {
            switch(this.d & 7) {
                case 1: {
                    do {
                        ((LongArrayList)list0).addLong(this.c.T());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    this.r(v1);
                    int v2 = this.c.h();
                    do {
                        ((LongArrayList)list0).addLong(this.c.T());
                    }
                    while(this.c.h() < v2 + v1);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 1: {
                do {
                    list0.add(this.c.T());
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                this.r(v4);
                int v5 = this.c.h();
                do {
                    list0.add(this.c.T());
                }
                while(this.c.h() < v5 + v4);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public int readSInt32() throws IOException {
        this.p(0);
        return this.c.U();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readSInt32List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof IntArrayList) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((IntArrayList)list0).addInt(this.c.U());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    int v2 = this.c.h() + v1;
                    do {
                        ((IntArrayList)list0).addInt(this.c.U());
                    }
                    while(this.c.h() < v2);
                    this.o(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.U());
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                int v5 = this.c.h() + v4;
                do {
                    list0.add(this.c.U());
                }
                while(this.c.h() < v5);
                this.o(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public long readSInt64() throws IOException {
        this.p(0);
        return this.c.V();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readSInt64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof LongArrayList) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((LongArrayList)list0).addLong(this.c.V());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    int v2 = this.c.h() + v1;
                    do {
                        ((LongArrayList)list0).addLong(this.c.V());
                    }
                    while(this.c.h() < v2);
                    this.o(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.V());
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                int v5 = this.c.h() + v4;
                do {
                    list0.add(this.c.V());
                }
                while(this.c.h() < v5);
                this.o(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public String readString() throws IOException {
        this.p(2);
        return this.c.W();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readStringList(List list0) throws IOException {
        this.n(list0, false);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readStringListRequireUtf8(List list0) throws IOException {
        this.n(list0, true);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public String readStringRequireUtf8() throws IOException {
        this.p(2);
        return this.c.X();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public int readUInt32() throws IOException {
        this.p(0);
        return this.c.Z();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readUInt32List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof IntArrayList) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((IntArrayList)list0).addInt(this.c.Z());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    int v2 = this.c.h() + v1;
                    do {
                        ((IntArrayList)list0).addInt(this.c.Z());
                    }
                    while(this.c.h() < v2);
                    this.o(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.Z());
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                int v5 = this.c.h() + v4;
                do {
                    list0.add(this.c.Z());
                }
                while(this.c.h() < v5);
                this.o(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public long readUInt64() throws IOException {
        this.p(0);
        return this.c.a0();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public void readUInt64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof LongArrayList) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((LongArrayList)list0).addLong(this.c.a0());
                        if(this.c.i()) {
                            return;
                        }
                        v = this.c.Y();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.Z();
                    int v2 = this.c.h() + v1;
                    do {
                        ((LongArrayList)list0).addLong(this.c.a0());
                    }
                    while(this.c.h() < v2);
                    this.o(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.a0());
                    if(this.c.i()) {
                        return;
                    }
                    v3 = this.c.Y();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.Z();
                int v5 = this.c.h() + v4;
                do {
                    list0.add(this.c.a0());
                }
                while(this.c.h() < v5);
                this.o(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
        return this.c.f0();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public boolean skipField() throws IOException {
        if(!this.c.i()) {
            return this.d == this.e ? false : this.c.g0(this.d);
        }
        return false;
    }
}

