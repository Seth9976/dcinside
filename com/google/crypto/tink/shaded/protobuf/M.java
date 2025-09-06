package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

@y
abstract class m implements r1 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.j.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.p.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.d.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.g.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.e.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.m.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.q.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.r.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.s.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.t.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.k.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.o.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.f.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static final class com.google.crypto.tink.shaded.protobuf.m.b extends m {
        private final boolean e;
        private final byte[] f;
        private int g;
        private final int h;
        private int i;
        private int j;
        private int k;

        public com.google.crypto.tink.shaded.protobuf.m.b(ByteBuffer byteBuffer0, boolean z) {
            super(null);
            this.e = z;
            this.f = byteBuffer0.array();
            int v = byteBuffer0.arrayOffset() + byteBuffer0.position();
            this.g = v;
            this.h = v;
            this.i = byteBuffer0.arrayOffset() + byteBuffer0.limit();
        }

        private long A() throws IOException {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.o();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw y0.g();
        }

        private void B(int v) throws IOException {
            if(v < 0 || v > this.i - this.g) {
                throw y0.n();
            }
        }

        private void C(int v) throws IOException {
            if(this.g != v) {
                throw y0.n();
            }
        }

        private void D(int v) throws IOException {
            if((this.j & 7) != v) {
                throw y0.f();
            }
        }

        private void E(int v) throws IOException {
            this.B(v);
            this.g += v;
        }

        private void F() throws IOException {
            int v = this.k;
            this.k = this.j >>> 3 << 3 | 4;
            while(this.getFieldNumber() != 0x7FFFFFFF && this.skipField()) {
            }
            if(this.j != this.k) {
                throw y0.i();
            }
            this.k = v;
        }

        private void G() throws IOException {
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
            this.H();
        }

        private void H() throws IOException {
            for(int v = 0; v < 10; ++v) {
                if(this.o() >= 0) {
                    return;
                }
            }
            throw y0.g();
        }

        private void I(int v) throws IOException {
            this.B(v);
            if((v & 3) != 0) {
                throw y0.i();
            }
        }

        private void J(int v) throws IOException {
            this.B(v);
            if((v & 7) != 0) {
                throw y0.i();
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void a(Object object0, t1 t10, V v0) throws IOException {
            int v2;
            try {
                v2 = this.k;
                this.k = this.j >>> 3 << 3 | 4;
                t10.b(object0, this, v0);
                if(this.j == this.k) {
                    return;
                }
            }
            finally {
                this.k = v2;
            }
            throw y0.i();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        @Deprecated
        public Object b(t1 t10, V v0) throws IOException {
            this.D(3);
            return this.q(t10, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        @Deprecated
        public Object c(Class class0, V v0) throws IOException {
            this.D(3);
            return this.q(m1.a().i(class0), v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void d(Map map0, com.google.crypto.tink.shaded.protobuf.K0.b k0$b0, V v0) throws IOException {
            this.D(2);
            int v1 = this.y();
            this.B(v1);
            int v2 = this.i;
            this.i = this.g + v1;
            try {
                Object object0 = k0$b0.b;
                Object object1 = k0$b0.d;
                while(true) {
                    while(true) {
                    label_7:
                        int v3 = this.getFieldNumber();
                        if(v3 == 0x7FFFFFFF) {
                            map0.put(object0, object1);
                            this.i = v2;
                            return;
                        }
                        try {
                            switch(v3) {
                                case 1: {
                                    object0 = this.p(k0$b0.a, null, null);
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
                            throw new y0("Unable to parse map entry.");
                        label_17:
                            Class class0 = k0$b0.d.getClass();
                            object1 = this.p(k0$b0.c, class0, v0);
                            continue;
                        }
                        catch(com.google.crypto.tink.shaded.protobuf.y0.a unused_ex) {
                        }
                        break;
                    }
                    if(this.skipField()) {
                        goto label_7;
                    }
                    break;
                }
                throw new y0("Unable to parse map entry.");
            }
            catch(Throwable throwable0) {
                this.i = v2;
                throw throwable0;
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void e(List list0, t1 t10, V v0) throws IOException {
            int v2;
            if((this.j & 7) != 2) {
                throw y0.f();
            }
            int v1 = this.j;
            do {
                list0.add(this.v(t10, v0));
                if(this.n()) {
                    return;
                }
                v2 = this.g;
            }
            while(this.y() == v1);
            this.g = v2;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public Object f(t1 t10, V v0) throws IOException {
            this.D(2);
            return this.v(t10, v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void g(List list0, Class class0, V v0) throws IOException {
            this.e(list0, m1.a().i(class0), v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public int getFieldNumber() throws IOException {
            if(this.n()) {
                return 0x7FFFFFFF;
            }
            int v = this.y();
            this.j = v;
            return v == this.k ? 0x7FFFFFFF : v >>> 3;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public int getTag() {
            return this.j;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void h(Object object0, t1 t10, V v0) throws IOException {
            int v1 = this.y();
            this.B(v1);
            int v2 = this.i;
            int v3 = this.g + v1;
            this.i = v3;
            try {
                t10.b(object0, this, v0);
                if(this.g == v3) {
                    return;
                }
            }
            finally {
                this.i = v2;
            }
            throw y0.i();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public Object i(Class class0, V v0) throws IOException {
            this.D(2);
            return this.v(m1.a().i(class0), v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        @Deprecated
        public void j(List list0, Class class0, V v0) throws IOException {
            this.k(list0, m1.a().i(class0), v0);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        @Deprecated
        public void k(List list0, t1 t10, V v0) throws IOException {
            int v2;
            if((this.j & 7) != 3) {
                throw y0.f();
            }
            int v1 = this.j;
            do {
                list0.add(this.q(t10, v0));
                if(this.n()) {
                    return;
                }
                v2 = this.g;
            }
            while(this.y() == v1);
            this.g = v2;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.m
        public int l() {
            return this.g - this.h;
        }

        private boolean n() {
            return this.g == this.i;
        }

        private byte o() throws IOException {
            int v = this.g;
            if(v == this.i) {
                throw y0.n();
            }
            this.g = v + 1;
            return this.f[v];
        }

        private Object p(b c2$b0, Class class0, V v0) throws IOException {
            switch(c2$b0) {
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
                    return this.i(class0, v0);
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

        private Object q(t1 t10, V v0) throws IOException {
            Object object0 = t10.newInstance();
            this.a(object0, t10, v0);
            t10.makeImmutable(object0);
            return object0;
        }

        private int r() throws IOException {
            this.B(4);
            return this.s();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public boolean readBool() throws IOException {
            this.D(0);
            return this.y() != 0;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readBoolList(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof q) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((q)list0).addBoolean(this.readBool());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((q)list0).addBoolean(this.y() != 0);
                        }
                        this.C(v2);
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(Boolean.valueOf(this.readBool()));
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(Boolean.valueOf(this.y() != 0));
                    }
                    this.C(v5);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public u readBytes() throws IOException {
            this.D(2);
            int v = this.y();
            if(v == 0) {
                return u.e;
            }
            this.B(v);
            u u0 = this.e ? u.o0(this.f, this.g, v) : u.q(this.f, this.g, v);
            this.g += v;
            return u0;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readBytesList(List list0) throws IOException {
            int v;
            if((this.j & 7) != 2) {
                throw y0.f();
            }
            do {
                list0.add(this.readBytes());
                if(this.n()) {
                    return;
                }
                v = this.g;
            }
            while(this.y() == this.j);
            this.g = v;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public double readDouble() throws IOException {
            this.D(1);
            return Double.longBitsToDouble(this.t());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readDoubleList(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof E) {
                switch(this.j & 7) {
                    case 1: {
                        do {
                            ((E)list0).addDouble(this.readDouble());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        this.J(v1);
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((E)list0).addDouble(Double.longBitsToDouble(this.u()));
                        }
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 1: {
                    do {
                        list0.add(this.readDouble());
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    this.J(v4);
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(Double.longBitsToDouble(this.u()));
                    }
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public int readEnum() throws IOException {
            this.D(0);
            return this.y();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readEnumList(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof r0) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((r0)list0).addInt(this.readEnum());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((r0)list0).addInt(this.y());
                        }
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readEnum());
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.y());
                    }
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public int readFixed32() throws IOException {
            this.D(5);
            return this.r();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readFixed32List(List list0) throws IOException {
            int v5;
            int v2;
            if(list0 instanceof r0) {
                switch(this.j & 7) {
                    case 2: {
                        int v = this.y();
                        this.I(v);
                        int v1 = this.g + v;
                        while(this.g < v1) {
                            ((r0)list0).addInt(this.s());
                        }
                        return;
                    }
                    case 5: {
                        break;
                    }
                    default: {
                        throw y0.f();
                    }
                }
                do {
                    ((r0)list0).addInt(this.readFixed32());
                    if(this.n()) {
                        return;
                    }
                    v2 = this.g;
                }
                while(this.y() == this.j);
                this.g = v2;
                return;
            }
            switch(this.j & 7) {
                case 2: {
                    int v3 = this.y();
                    this.I(v3);
                    int v4 = this.g + v3;
                    while(this.g < v4) {
                        list0.add(this.s());
                    }
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw y0.f();
                }
            }
            do {
                list0.add(this.readFixed32());
                if(this.n()) {
                    return;
                }
                v5 = this.g;
            }
            while(this.y() == this.j);
            this.g = v5;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public long readFixed64() throws IOException {
            this.D(1);
            return this.t();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readFixed64List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof I0) {
                switch(this.j & 7) {
                    case 1: {
                        do {
                            ((I0)list0).addLong(this.readFixed64());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        this.J(v1);
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((I0)list0).addLong(this.u());
                        }
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 1: {
                    do {
                        list0.add(this.readFixed64());
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    this.J(v4);
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.u());
                    }
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public float readFloat() throws IOException {
            this.D(5);
            return Float.intBitsToFloat(this.r());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readFloatList(List list0) throws IOException {
            int v5;
            int v2;
            if(list0 instanceof h0) {
                switch(this.j & 7) {
                    case 2: {
                        int v = this.y();
                        this.I(v);
                        int v1 = this.g + v;
                        while(this.g < v1) {
                            ((h0)list0).addFloat(Float.intBitsToFloat(this.s()));
                        }
                        return;
                    }
                    case 5: {
                        break;
                    }
                    default: {
                        throw y0.f();
                    }
                }
                do {
                    ((h0)list0).addFloat(this.readFloat());
                    if(this.n()) {
                        return;
                    }
                    v2 = this.g;
                }
                while(this.y() == this.j);
                this.g = v2;
                return;
            }
            switch(this.j & 7) {
                case 2: {
                    int v3 = this.y();
                    this.I(v3);
                    int v4 = this.g + v3;
                    while(this.g < v4) {
                        list0.add(Float.intBitsToFloat(this.s()));
                    }
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw y0.f();
                }
            }
            do {
                list0.add(this.readFloat());
                if(this.n()) {
                    return;
                }
                v5 = this.g;
            }
            while(this.y() == this.j);
            this.g = v5;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public int readInt32() throws IOException {
            this.D(0);
            return this.y();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readInt32List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof r0) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((r0)list0).addInt(this.readInt32());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((r0)list0).addInt(this.y());
                        }
                        this.C(v2);
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readInt32());
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.y());
                    }
                    this.C(v5);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public long readInt64() throws IOException {
            this.D(0);
            return this.z();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readInt64List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof I0) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((I0)list0).addLong(this.readInt64());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((I0)list0).addLong(this.z());
                        }
                        this.C(v2);
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readInt64());
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.z());
                    }
                    this.C(v5);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public int readSFixed32() throws IOException {
            this.D(5);
            return this.r();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readSFixed32List(List list0) throws IOException {
            int v5;
            int v2;
            if(list0 instanceof r0) {
                switch(this.j & 7) {
                    case 2: {
                        int v = this.y();
                        this.I(v);
                        int v1 = this.g + v;
                        while(this.g < v1) {
                            ((r0)list0).addInt(this.s());
                        }
                        return;
                    }
                    case 5: {
                        break;
                    }
                    default: {
                        throw y0.f();
                    }
                }
                do {
                    ((r0)list0).addInt(this.readSFixed32());
                    if(this.n()) {
                        return;
                    }
                    v2 = this.g;
                }
                while(this.y() == this.j);
                this.g = v2;
                return;
            }
            switch(this.j & 7) {
                case 2: {
                    int v3 = this.y();
                    this.I(v3);
                    int v4 = this.g + v3;
                    while(this.g < v4) {
                        list0.add(this.s());
                    }
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw y0.f();
                }
            }
            do {
                list0.add(this.readSFixed32());
                if(this.n()) {
                    return;
                }
                v5 = this.g;
            }
            while(this.y() == this.j);
            this.g = v5;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public long readSFixed64() throws IOException {
            this.D(1);
            return this.t();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readSFixed64List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof I0) {
                switch(this.j & 7) {
                    case 1: {
                        do {
                            ((I0)list0).addLong(this.readSFixed64());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        this.J(v1);
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((I0)list0).addLong(this.u());
                        }
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 1: {
                    do {
                        list0.add(this.readSFixed64());
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    this.J(v4);
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.u());
                    }
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public int readSInt32() throws IOException {
            this.D(0);
            return z.c(this.y());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readSInt32List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof r0) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((r0)list0).addInt(this.readSInt32());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((r0)list0).addInt(z.c(this.y()));
                        }
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readSInt32());
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(z.c(this.y()));
                    }
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public long readSInt64() throws IOException {
            this.D(0);
            return z.d(this.z());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readSInt64List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof I0) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((I0)list0).addLong(this.readSInt64());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((I0)list0).addLong(z.d(this.z()));
                        }
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readSInt64());
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(z.d(this.z()));
                    }
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public String readString() throws IOException {
            return this.w(false);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readStringList(List list0) throws IOException {
            this.x(list0, false);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readStringListRequireUtf8(List list0) throws IOException {
            this.x(list0, true);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public String readStringRequireUtf8() throws IOException {
            return this.w(true);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public int readUInt32() throws IOException {
            this.D(0);
            return this.y();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readUInt32List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof r0) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((r0)list0).addInt(this.readUInt32());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((r0)list0).addInt(this.y());
                        }
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readUInt32());
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.y());
                    }
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public long readUInt64() throws IOException {
            this.D(0);
            return this.z();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public void readUInt64List(List list0) throws IOException {
            int v3;
            int v;
            if(list0 instanceof I0) {
                switch(this.j & 7) {
                    case 0: {
                        do {
                            ((I0)list0).addLong(this.readUInt64());
                            if(this.n()) {
                                return;
                            }
                            v = this.g;
                        }
                        while(this.y() == this.j);
                        this.g = v;
                        return;
                    }
                    case 2: {
                        int v1 = this.y();
                        int v2 = this.g + v1;
                        while(this.g < v2) {
                            ((I0)list0).addLong(this.z());
                        }
                        this.C(v2);
                        return;
                    }
                    default: {
                        throw y0.f();
                    }
                }
            }
            switch(this.j & 7) {
                case 0: {
                    do {
                        list0.add(this.readUInt64());
                        if(this.n()) {
                            return;
                        }
                        v3 = this.g;
                    }
                    while(this.y() == this.j);
                    this.g = v3;
                    return;
                }
                case 2: {
                    int v4 = this.y();
                    int v5 = this.g + v4;
                    while(this.g < v5) {
                        list0.add(this.z());
                    }
                    this.C(v5);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }

        private int s() {
            int v = this.g;
            this.g = v + 4;
            return (this.f[v + 3] & 0xFF) << 24 | (this.f[v] & 0xFF | (this.f[v + 1] & 0xFF) << 8 | (this.f[v + 2] & 0xFF) << 16);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r1
        public boolean skipField() throws IOException {
            if(!this.n()) {
                int v = this.j;
                if(v != this.k) {
                    switch(v & 7) {
                        case 0: {
                            this.G();
                            return true;
                        }
                        case 1: {
                            this.E(8);
                            return true;
                        }
                        case 2: {
                            this.E(this.y());
                            return true;
                        }
                        case 3: {
                            this.F();
                            return true;
                        }
                        case 5: {
                            this.E(4);
                            return true;
                        }
                        default: {
                            throw y0.f();
                        }
                    }
                }
            }
            return false;
        }

        private long t() throws IOException {
            this.B(8);
            return this.u();
        }

        private long u() {
            int v = this.g;
            this.g = v + 8;
            return (((long)this.f[v + 7]) & 0xFFL) << 56 | (((long)this.f[v]) & 0xFFL | (((long)this.f[v + 1]) & 0xFFL) << 8 | (((long)this.f[v + 2]) & 0xFFL) << 16 | (((long)this.f[v + 3]) & 0xFFL) << 24 | (((long)this.f[v + 4]) & 0xFFL) << 0x20 | (((long)this.f[v + 5]) & 0xFFL) << 40 | (((long)this.f[v + 6]) & 0xFFL) << 0x30);
        }

        private Object v(t1 t10, V v0) throws IOException {
            Object object0 = t10.newInstance();
            this.h(object0, t10, v0);
            t10.makeImmutable(object0);
            return object0;
        }

        public String w(boolean z) throws IOException {
            this.D(2);
            int v = this.y();
            if(v == 0) {
                return "";
            }
            this.B(v);
            if(z && !Z1.u(this.f, this.g, this.g + v)) {
                throw y0.e();
            }
            String s = new String(this.f, this.g, v, t0.b);
            this.g += v;
            return s;
        }

        public void x(List list0, boolean z) throws IOException {
            int v1;
            int v;
            if((this.j & 7) != 2) {
                throw y0.f();
            }
            if(list0 instanceof E0 && !z) {
                do {
                    ((E0)list0).J1(this.readBytes());
                    if(this.n()) {
                        return;
                    }
                    v = this.g;
                }
                while(this.y() == this.j);
                this.g = v;
                return;
            }
            do {
                list0.add(this.w(z));
                if(this.n()) {
                    return;
                }
                v1 = this.g;
            }
            while(this.y() == this.j);
            this.g = v1;
        }

        private int y() throws IOException {
            int v5;
            int v = this.g;
            int v1 = this.i;
            if(v1 == v) {
                throw y0.n();
            }
            byte[] arr_b = this.f;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.g = v + 1;
                return v2;
            }
            if(v1 - (v + 1) < 9) {
                return (int)this.A();
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
                                throw y0.g();
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

        public long z() throws IOException {
            long v5;
            int v = this.g;
            int v1 = this.i;
            if(v1 == v) {
                throw y0.n();
            }
            byte[] arr_b = this.f;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.g = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) < 9) {
                return this.A();
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
                                                throw y0.g();
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
    }

    private static final int c = 3;
    private static final int d = 7;

    private m() {
    }

    m(a m$a0) {
    }

    public abstract int l();

    public static m m(ByteBuffer byteBuffer0, boolean z) {
        if(!byteBuffer0.hasArray()) {
            throw new IllegalArgumentException("Direct buffers not yet supported");
        }
        return new com.google.crypto.tink.shaded.protobuf.m.b(byteBuffer0, z);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public boolean shouldDiscardUnknownFields() {
        return false;
    }
}

