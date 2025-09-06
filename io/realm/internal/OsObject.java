package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.X0;
import io.realm.e1;
import io.realm.exceptions.RealmException;
import io.realm.q0;
import java.util.UUID;
import o3.h;
import org.bson.types.ObjectId;

@Keep
public class OsObject implements l {
    static class a implements io.realm.internal.n.a {
        private final String[] a;

        a(String[] arr_s) {
            this.a = arr_s;
        }

        @Override  // io.realm.internal.n$a
        public void a(b n$b0, Object object0) {
            this.c(((io.realm.internal.OsObject.b)n$b0), object0);
        }

        private q0 b() {
            String[] arr_s = this.a;
            boolean z = arr_s == null;
            if(z) {
                arr_s = new String[0];
            }
            return new c(arr_s, z);
        }

        public void c(io.realm.internal.OsObject.b osObject$b0, Object object0) {
            osObject$b0.a(((X0)object0), this.b());
        }
    }

    public static class io.realm.internal.OsObject.b extends b {
        public io.realm.internal.OsObject.b(X0 x00, e1 e10) {
            super(x00, e10);
        }

        public void a(X0 x00, @h q0 q00) {
            ((e1)this.b).a(x00, q00);
        }
    }

    static class c implements q0 {
        final String[] a;
        final boolean b;

        c(String[] arr_s, boolean z) {
            this.a = arr_s;
            this.b = z;
        }

        @Override  // io.realm.q0
        public boolean a(String s) {
            String[] arr_s = this.a;
            for(int v = 0; v < arr_s.length; ++v) {
                if(arr_s[v].equals(s)) {
                    return true;
                }
            }
            return false;
        }

        @Override  // io.realm.q0
        public String[] b() {
            return this.a;
        }

        @Override  // io.realm.q0
        public boolean c() {
            return this.b;
        }
    }

    private static final long nativeFinalizerPtr;
    private final long nativePtr;
    private n observerPairs;

    static {
        OsObject.nativeFinalizerPtr = OsObject.nativeGetFinalizerPtr();
    }

    public OsObject(OsSharedRealm osSharedRealm0, UncheckedRow uncheckedRow0) {
        this.observerPairs = new n();
        this.nativePtr = OsObject.nativeCreate(osSharedRealm0.getNativePtr(), uncheckedRow0.getNativePtr());
        osSharedRealm0.context.a(this);
    }

    public void addListener(X0 x00, e1 e10) {
        if(this.observerPairs.d()) {
            this.nativeStartListening(this.nativePtr);
        }
        io.realm.internal.OsObject.b osObject$b0 = new io.realm.internal.OsObject.b(x00, e10);
        this.observerPairs.a(osObject$b0);
    }

    public static UncheckedRow create(Table table0) {
        long v = OsObject.nativeCreateNewObject(table0.getNativePtr());
        return new UncheckedRow(table0.Q().context, table0, v);
    }

    public static long createEmbeddedObject(Table table0, long v, long v1) {
        return OsObject.nativeCreateEmbeddedObject(table0.getNativePtr(), v, v1);
    }

    public static long createRow(Table table0) {
        return OsObject.nativeCreateRow(table0.getNativePtr());
    }

    public static long createRowWithPrimaryKey(Table table0, long v, @h Object object0) {
        RealmFieldType realmFieldType0 = table0.I(v);
        OsSharedRealm osSharedRealm0 = table0.Q();
        if(realmFieldType0 == RealmFieldType.STRING) {
            if(object0 != null && !(object0 instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + object0);
            }
            return OsObject.nativeCreateRowWithStringPrimaryKey(osSharedRealm0.getNativePtr(), table0.getNativePtr(), v, ((String)object0));
        }
        if(realmFieldType0 == RealmFieldType.INTEGER) {
            long v1 = object0 == null ? 0L : Long.parseLong(object0.toString());
            long v2 = osSharedRealm0.getNativePtr();
            long v3 = table0.getNativePtr();
            return object0 == null ? OsObject.nativeCreateRowWithLongPrimaryKey(v2, v3, v, v1, true) : OsObject.nativeCreateRowWithLongPrimaryKey(v2, v3, v, v1, false);
        }
        if(realmFieldType0 == RealmFieldType.OBJECT_ID) {
            if(object0 != null && !(object0 instanceof ObjectId)) {
                throw new IllegalArgumentException("Primary key value is not an ObjectId: " + object0);
            }
            return object0 == null ? OsObject.nativeCreateRowWithObjectIdPrimaryKey(osSharedRealm0.getNativePtr(), table0.getNativePtr(), v, null) : OsObject.nativeCreateRowWithObjectIdPrimaryKey(osSharedRealm0.getNativePtr(), table0.getNativePtr(), v, object0.toString());
        }
        if(realmFieldType0 != RealmFieldType.UUID) {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + realmFieldType0);
        }
        if(object0 != null && !(object0 instanceof UUID)) {
            throw new IllegalArgumentException("Primary key value is not an UUID: " + object0);
        }
        return object0 == null ? OsObject.nativeCreateRowWithUUIDPrimaryKey(osSharedRealm0.getNativePtr(), table0.getNativePtr(), v, null) : OsObject.nativeCreateRowWithUUIDPrimaryKey(osSharedRealm0.getNativePtr(), table0.getNativePtr(), v, object0.toString());
    }

    public static UncheckedRow createWithPrimaryKey(Table table0, @h Object object0) {
        long v = OsObject.getAndVerifyPrimaryKeyColumnIndex(table0);
        RealmFieldType realmFieldType0 = table0.I(v);
        OsSharedRealm osSharedRealm0 = table0.Q();
        if(realmFieldType0 == RealmFieldType.STRING) {
            if(object0 != null && !(object0 instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + object0);
            }
            long v1 = OsObject.nativeCreateNewObjectWithStringPrimaryKey(osSharedRealm0.getNativePtr(), table0.getNativePtr(), v, ((String)object0));
            return new UncheckedRow(osSharedRealm0.context, table0, v1);
        }
        if(realmFieldType0 == RealmFieldType.INTEGER) {
            long v2 = object0 == null ? 0L : Long.parseLong(object0.toString());
            long v3 = osSharedRealm0.getNativePtr();
            long v4 = table0.getNativePtr();
            return object0 == null ? new UncheckedRow(osSharedRealm0.context, table0, OsObject.nativeCreateNewObjectWithLongPrimaryKey(v3, v4, v, v2, true)) : new UncheckedRow(osSharedRealm0.context, table0, OsObject.nativeCreateNewObjectWithLongPrimaryKey(v3, v4, v, v2, false));
        }
        if(realmFieldType0 == RealmFieldType.OBJECT_ID) {
            long v5 = OsObject.nativeCreateNewObjectWithObjectIdPrimaryKey(osSharedRealm0.getNativePtr(), table0.getNativePtr(), v, (object0 == null ? null : object0.toString()));
            return new UncheckedRow(osSharedRealm0.context, table0, v5);
        }
        if(realmFieldType0 != RealmFieldType.UUID) {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + realmFieldType0);
        }
        long v6 = OsObject.nativeCreateNewObjectWithUUIDPrimaryKey(osSharedRealm0.getNativePtr(), table0.getNativePtr(), v, (object0 == null ? null : object0.toString()));
        return new UncheckedRow(osSharedRealm0.context, table0, v6);
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table0) {
        String s = OsObjectStore.c(table0.Q(), table0.C());
        if(s == null) {
            throw new IllegalStateException(table0.P() + " has no primary key defined.");
        }
        return table0.F(s);
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsObject.nativeFinalizerPtr;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.nativePtr;
    }

    private static native long nativeCreate(long arg0, long arg1) {
    }

    private static native long nativeCreateEmbeddedObject(long arg0, long arg1, long arg2) {
    }

    private static native long nativeCreateNewObject(long arg0) {
    }

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long arg0, long arg1, long arg2, long arg3, boolean arg4) {
    }

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long arg0, long arg1, long arg2, @h String arg3) {
    }

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long arg0, long arg1, long arg2, @h String arg3) {
    }

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long arg0, long arg1, long arg2, @h String arg3) {
    }

    private static native long nativeCreateRow(long arg0) {
    }

    private static native long nativeCreateRowWithLongPrimaryKey(long arg0, long arg1, long arg2, long arg3, boolean arg4) {
    }

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long arg0, long arg1, long arg2, @h String arg3) {
    }

    private static native long nativeCreateRowWithStringPrimaryKey(long arg0, long arg1, long arg2, @h String arg3) {
    }

    private static native long nativeCreateRowWithUUIDPrimaryKey(long arg0, long arg1, long arg2, @h String arg3) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private native void nativeStartListening(long arg1) {
    }

    private native void nativeStopListening(long arg1) {
    }

    private void notifyChangeListeners(String[] arr_s) {
        this.observerPairs.c(new a(arr_s));
    }

    public void removeListener(X0 x00) {
        this.observerPairs.f(x00);
        if(this.observerPairs.d()) {
            this.nativeStopListening(this.nativePtr);
        }
    }

    public void removeListener(X0 x00, e1 e10) {
        this.observerPairs.e(x00, e10);
        if(this.observerPairs.d()) {
            this.nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(n n0) {
        if(!this.observerPairs.d()) {
            throw new IllegalStateException("\'observerPairs\' is not empty. Listeners have been added before.");
        }
        this.observerPairs = n0;
        if(!n0.d()) {
            this.nativeStartListening(this.nativePtr);
        }
    }
}

