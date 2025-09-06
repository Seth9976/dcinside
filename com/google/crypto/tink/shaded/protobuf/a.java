package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@y
final class A implements r1 {
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

    private final z c;
    private int d;
    private int e;
    private int f;
    private static final int g = 3;
    private static final int h = 7;
    private static final int i;

    private A(z z0) {
        this.f = 0;
        z z1 = (z)t0.e(z0, "input");
        this.c = z1;
        z1.d = this;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void a(Object object0, t1 t10, V v0) throws IOException {
        this.t(3);
        this.m(object0, t10, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    @Deprecated
    public Object b(t1 t10, V v0) throws IOException {
        this.t(3);
        return this.p(t10, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    @Deprecated
    public Object c(Class class0, V v0) throws IOException {
        this.t(3);
        return this.p(m1.a().i(class0), v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void d(Map map0, com.google.crypto.tink.shaded.protobuf.K0.b k0$b0, V v0) throws IOException {
        this.t(2);
        int v1 = this.c.a0();
        int v2 = this.c.u(v1);
        Object object0 = k0$b0.b;
        Object object1 = k0$b0.d;
        try {
        alab1:
            while(true) {
                while(true) {
                    int v4 = this.getFieldNumber();
                    if(v4 == 0x7FFFFFFF || this.c.j()) {
                        break alab1;
                    }
                    try {
                        switch(v4) {
                            case 1: {
                                object0 = this.o(k0$b0.a, null, null);
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
                        throw new y0("Unable to parse map entry.");
                    label_14:
                        Class class0 = k0$b0.d.getClass();
                        object1 = this.o(k0$b0.c, class0, v0);
                        continue;
                    }
                    catch(com.google.crypto.tink.shaded.protobuf.y0.a unused_ex) {
                    }
                    break;
                }
                if(!this.skipField()) {
                    throw new y0("Unable to parse map entry.");
                }
            }
            map0.put(object0, object1);
        }
        finally {
            this.c.t(v2);
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void e(List list0, t1 t10, V v0) throws IOException {
        if((this.d & 7) != 2) {
            throw y0.f();
        }
        int v1 = this.d;
        while(true) {
            list0.add(this.q(t10, v0));
            if(this.c.j() || this.f != 0) {
                break;
            }
            int v2 = this.c.Z();
            if(v2 != v1) {
                this.f = v2;
                return;
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public Object f(t1 t10, V v0) throws IOException {
        this.t(2);
        return this.q(t10, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void g(List list0, Class class0, V v0) throws IOException {
        this.e(list0, m1.a().i(class0), v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public int getFieldNumber() throws IOException {
        int v = this.f;
        if(v != 0) {
            this.d = v;
            this.f = 0;
            return this.d == 0 || this.d == this.e ? 0x7FFFFFFF : this.d >>> 3;
        }
        this.d = this.c.Z();
        return this.d == 0 || this.d == this.e ? 0x7FFFFFFF : this.d >>> 3;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public int getTag() {
        return this.d;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void h(Object object0, t1 t10, V v0) throws IOException {
        this.t(2);
        this.n(object0, t10, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public Object i(Class class0, V v0) throws IOException {
        this.t(2);
        return this.q(m1.a().i(class0), v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    @Deprecated
    public void j(List list0, Class class0, V v0) throws IOException {
        this.k(list0, m1.a().i(class0), v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    @Deprecated
    public void k(List list0, t1 t10, V v0) throws IOException {
        if((this.d & 7) != 3) {
            throw y0.f();
        }
        int v1 = this.d;
        while(true) {
            list0.add(this.p(t10, v0));
            if(this.c.j() || this.f != 0) {
                break;
            }
            int v2 = this.c.Z();
            if(v2 != v1) {
                this.f = v2;
                return;
            }
        }
    }

    public static A l(z z0) {
        A a0 = z0.d;
        return a0 == null ? new A(z0) : a0;
    }

    private void m(Object object0, t1 t10, V v0) throws IOException {
        int v2;
        try {
            v2 = this.e;
            this.e = this.d >>> 3 << 3 | 4;
            t10.b(object0, this, v0);
            if(this.d == this.e) {
                return;
            }
        }
        finally {
            this.e = v2;
        }
        throw y0.i();
    }

    private void n(Object object0, t1 t10, V v0) throws IOException {
        int v1 = this.c.a0();
        z z0 = this.c;
        if(z0.a >= z0.b) {
            throw y0.j();
        }
        int v2 = z0.u(v1);
        ++this.c.a;
        t10.b(object0, this, v0);
        this.c.a(0);
        --this.c.a;
        this.c.t(v2);
    }

    private Object o(b c2$b0, Class class0, V v0) throws IOException {
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
                throw new IllegalArgumentException("unsupported field type.");
            }
        }
    }

    private Object p(t1 t10, V v0) throws IOException {
        Object object0 = t10.newInstance();
        this.m(object0, t10, v0);
        t10.makeImmutable(object0);
        return object0;
    }

    private Object q(t1 t10, V v0) throws IOException {
        Object object0 = t10.newInstance();
        this.n(object0, t10, v0);
        t10.makeImmutable(object0);
        return object0;
    }

    public void r(List list0, boolean z) throws IOException {
        int v1;
        int v;
        if((this.d & 7) != 2) {
            throw y0.f();
        }
        if(list0 instanceof E0 && !z) {
            do {
                ((E0)list0).J1(this.readBytes());
                if(this.c.j()) {
                    return;
                }
                v = this.c.Z();
            }
            while(v == this.d);
            this.f = v;
            return;
        }
        do {
            list0.add((z ? this.readStringRequireUtf8() : this.readString()));
            if(this.c.j()) {
                return;
            }
            v1 = this.c.Z();
        }
        while(v1 == this.d);
        this.f = v1;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public boolean readBool() throws IOException {
        this.t(0);
        return this.c.v();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readBoolList(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof q) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((q)list0).addBoolean(this.c.v());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    int v2 = this.c.i() + v1;
                    do {
                        ((q)list0).addBoolean(this.c.v());
                    }
                    while(this.c.i() < v2);
                    this.s(v2);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(this.c.v()));
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                int v5 = this.c.i() + v4;
                do {
                    list0.add(Boolean.valueOf(this.c.v()));
                }
                while(this.c.i() < v5);
                this.s(v5);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public u readBytes() throws IOException {
        this.t(2);
        return this.c.y();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readBytesList(List list0) throws IOException {
        int v;
        if((this.d & 7) != 2) {
            throw y0.f();
        }
        do {
            list0.add(this.readBytes());
            if(this.c.j()) {
                return;
            }
            v = this.c.Z();
        }
        while(v == this.d);
        this.f = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public double readDouble() throws IOException {
        this.t(1);
        return this.c.z();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readDoubleList(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof E) {
            switch(this.d & 7) {
                case 1: {
                    do {
                        ((E)list0).addDouble(this.c.z());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    this.v(v1);
                    int v2 = this.c.i();
                    do {
                        ((E)list0).addDouble(this.c.z());
                    }
                    while(this.c.i() < v2 + v1);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 1: {
                do {
                    list0.add(this.c.z());
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                this.v(v4);
                int v5 = this.c.i();
                do {
                    list0.add(this.c.z());
                }
                while(this.c.i() < v5 + v4);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public int readEnum() throws IOException {
        this.t(0);
        return this.c.A();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readEnumList(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof r0) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((r0)list0).addInt(this.c.A());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    int v2 = this.c.i() + v1;
                    do {
                        ((r0)list0).addInt(this.c.A());
                    }
                    while(this.c.i() < v2);
                    this.s(v2);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.A());
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                int v5 = this.c.i() + v4;
                do {
                    list0.add(this.c.A());
                }
                while(this.c.i() < v5);
                this.s(v5);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public int readFixed32() throws IOException {
        this.t(5);
        return this.c.B();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readFixed32List(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof r0) {
            switch(this.d & 7) {
                case 2: {
                    int v = this.c.a0();
                    this.u(v);
                    int v1 = this.c.i();
                    do {
                        ((r0)list0).addInt(this.c.B());
                    }
                    while(this.c.i() < v1 + v);
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
                ((r0)list0).addInt(this.c.B());
                if(this.c.j()) {
                    return;
                }
                v2 = this.c.Z();
            }
            while(v2 == this.d);
            this.f = v2;
            return;
        }
        switch(this.d & 7) {
            case 2: {
                int v3 = this.c.a0();
                this.u(v3);
                int v4 = this.c.i();
                do {
                    list0.add(this.c.B());
                }
                while(this.c.i() < v4 + v3);
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
            list0.add(this.c.B());
            if(this.c.j()) {
                return;
            }
            v5 = this.c.Z();
        }
        while(v5 == this.d);
        this.f = v5;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public long readFixed64() throws IOException {
        this.t(1);
        return this.c.C();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readFixed64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof I0) {
            switch(this.d & 7) {
                case 1: {
                    do {
                        ((I0)list0).addLong(this.c.C());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    this.v(v1);
                    int v2 = this.c.i();
                    do {
                        ((I0)list0).addLong(this.c.C());
                    }
                    while(this.c.i() < v2 + v1);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 1: {
                do {
                    list0.add(this.c.C());
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                this.v(v4);
                int v5 = this.c.i();
                do {
                    list0.add(this.c.C());
                }
                while(this.c.i() < v5 + v4);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public float readFloat() throws IOException {
        this.t(5);
        return this.c.D();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readFloatList(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof h0) {
            switch(this.d & 7) {
                case 2: {
                    int v = this.c.a0();
                    this.u(v);
                    int v1 = this.c.i();
                    do {
                        ((h0)list0).addFloat(this.c.D());
                    }
                    while(this.c.i() < v1 + v);
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
                ((h0)list0).addFloat(this.c.D());
                if(this.c.j()) {
                    return;
                }
                v2 = this.c.Z();
            }
            while(v2 == this.d);
            this.f = v2;
            return;
        }
        switch(this.d & 7) {
            case 2: {
                int v3 = this.c.a0();
                this.u(v3);
                int v4 = this.c.i();
                do {
                    list0.add(this.c.D());
                }
                while(this.c.i() < v4 + v3);
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
            list0.add(this.c.D());
            if(this.c.j()) {
                return;
            }
            v5 = this.c.Z();
        }
        while(v5 == this.d);
        this.f = v5;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public int readInt32() throws IOException {
        this.t(0);
        return this.c.G();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readInt32List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof r0) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((r0)list0).addInt(this.c.G());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    int v2 = this.c.i() + v1;
                    do {
                        ((r0)list0).addInt(this.c.G());
                    }
                    while(this.c.i() < v2);
                    this.s(v2);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.G());
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                int v5 = this.c.i() + v4;
                do {
                    list0.add(this.c.G());
                }
                while(this.c.i() < v5);
                this.s(v5);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public long readInt64() throws IOException {
        this.t(0);
        return this.c.H();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readInt64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof I0) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((I0)list0).addLong(this.c.H());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    int v2 = this.c.i() + v1;
                    do {
                        ((I0)list0).addLong(this.c.H());
                    }
                    while(this.c.i() < v2);
                    this.s(v2);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.H());
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                int v5 = this.c.i() + v4;
                do {
                    list0.add(this.c.H());
                }
                while(this.c.i() < v5);
                this.s(v5);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public int readSFixed32() throws IOException {
        this.t(5);
        return this.c.T();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readSFixed32List(List list0) throws IOException {
        int v5;
        int v2;
        if(list0 instanceof r0) {
            switch(this.d & 7) {
                case 2: {
                    int v = this.c.a0();
                    this.u(v);
                    int v1 = this.c.i();
                    do {
                        ((r0)list0).addInt(this.c.T());
                    }
                    while(this.c.i() < v1 + v);
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
                ((r0)list0).addInt(this.c.T());
                if(this.c.j()) {
                    return;
                }
                v2 = this.c.Z();
            }
            while(v2 == this.d);
            this.f = v2;
            return;
        }
        switch(this.d & 7) {
            case 2: {
                int v3 = this.c.a0();
                this.u(v3);
                int v4 = this.c.i();
                do {
                    list0.add(this.c.T());
                }
                while(this.c.i() < v4 + v3);
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
            list0.add(this.c.T());
            if(this.c.j()) {
                return;
            }
            v5 = this.c.Z();
        }
        while(v5 == this.d);
        this.f = v5;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public long readSFixed64() throws IOException {
        this.t(1);
        return this.c.U();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readSFixed64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof I0) {
            switch(this.d & 7) {
                case 1: {
                    do {
                        ((I0)list0).addLong(this.c.U());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    this.v(v1);
                    int v2 = this.c.i();
                    do {
                        ((I0)list0).addLong(this.c.U());
                    }
                    while(this.c.i() < v2 + v1);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 1: {
                do {
                    list0.add(this.c.U());
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                this.v(v4);
                int v5 = this.c.i();
                do {
                    list0.add(this.c.U());
                }
                while(this.c.i() < v5 + v4);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public int readSInt32() throws IOException {
        this.t(0);
        return this.c.V();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readSInt32List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof r0) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((r0)list0).addInt(this.c.V());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    int v2 = this.c.i() + v1;
                    do {
                        ((r0)list0).addInt(this.c.V());
                    }
                    while(this.c.i() < v2);
                    this.s(v2);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.V());
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                int v5 = this.c.i() + v4;
                do {
                    list0.add(this.c.V());
                }
                while(this.c.i() < v5);
                this.s(v5);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public long readSInt64() throws IOException {
        this.t(0);
        return this.c.W();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readSInt64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof I0) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((I0)list0).addLong(this.c.W());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    int v2 = this.c.i() + v1;
                    do {
                        ((I0)list0).addLong(this.c.W());
                    }
                    while(this.c.i() < v2);
                    this.s(v2);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.W());
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                int v5 = this.c.i() + v4;
                do {
                    list0.add(this.c.W());
                }
                while(this.c.i() < v5);
                this.s(v5);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public String readString() throws IOException {
        this.t(2);
        return this.c.X();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readStringList(List list0) throws IOException {
        this.r(list0, false);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readStringListRequireUtf8(List list0) throws IOException {
        this.r(list0, true);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public String readStringRequireUtf8() throws IOException {
        this.t(2);
        return this.c.Y();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public int readUInt32() throws IOException {
        this.t(0);
        return this.c.a0();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readUInt32List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof r0) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((r0)list0).addInt(this.c.a0());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    int v2 = this.c.i() + v1;
                    do {
                        ((r0)list0).addInt(this.c.a0());
                    }
                    while(this.c.i() < v2);
                    this.s(v2);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.a0());
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                int v5 = this.c.i() + v4;
                do {
                    list0.add(this.c.a0());
                }
                while(this.c.i() < v5);
                this.s(v5);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public long readUInt64() throws IOException {
        this.t(0);
        return this.c.b0();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public void readUInt64List(List list0) throws IOException {
        int v3;
        int v;
        if(list0 instanceof I0) {
            switch(this.d & 7) {
                case 0: {
                    do {
                        ((I0)list0).addLong(this.c.b0());
                        if(this.c.j()) {
                            return;
                        }
                        v = this.c.Z();
                    }
                    while(v == this.d);
                    this.f = v;
                    return;
                }
                case 2: {
                    int v1 = this.c.a0();
                    int v2 = this.c.i() + v1;
                    do {
                        ((I0)list0).addLong(this.c.b0());
                    }
                    while(this.c.i() < v2);
                    this.s(v2);
                    return;
                }
                default: {
                    throw y0.f();
                }
            }
        }
        switch(this.d & 7) {
            case 0: {
                do {
                    list0.add(this.c.b0());
                    if(this.c.j()) {
                        return;
                    }
                    v3 = this.c.Z();
                }
                while(v3 == this.d);
                this.f = v3;
                return;
            }
            case 2: {
                int v4 = this.c.a0();
                int v5 = this.c.i() + v4;
                do {
                    list0.add(this.c.b0());
                }
                while(this.c.i() < v5);
                this.s(v5);
                return;
            }
            default: {
                throw y0.f();
            }
        }
    }

    private void s(int v) throws IOException {
        if(this.c.i() != v) {
            throw y0.n();
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public boolean shouldDiscardUnknownFields() {
        return this.c.g0();
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.r1
    public boolean skipField() throws IOException {
        if(!this.c.j()) {
            return this.d == this.e ? false : this.c.h0(this.d);
        }
        return false;
    }

    private void t(int v) throws IOException {
        if((this.d & 7) != v) {
            throw y0.f();
        }
    }

    private void u(int v) throws IOException {
        if((v & 3) != 0) {
            throw y0.i();
        }
    }

    private void v(int v) throws IOException {
        if((v & 7) != 0) {
            throw y0.i();
        }
    }
}

