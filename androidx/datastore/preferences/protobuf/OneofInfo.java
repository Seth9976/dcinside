package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

final class OneofInfo {
    private final int a;
    private final Field b;
    private final Field c;

    public OneofInfo(int v, Field field0, Field field1) {
        this.a = v;
        this.b = field0;
        this.c = field1;
    }

    public Field a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public Field c() {
        return this.c;
    }
}

