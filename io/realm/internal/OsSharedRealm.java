package io.realm.internal;

import io.realm.Q0;
import io.realm.RealmFieldType;
import io.realm.exceptions.RealmError;
import io.realm.internal.android.AndroidRealmNotifier;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.h;

@Keep
public final class OsSharedRealm implements l, Closeable {
    @Keep
    public interface InitializationCallback {
        void onInit(OsSharedRealm arg1);
    }

    @Keep
    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm arg1, long arg2, long arg3);
    }

    @Keep
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    public static class a implements Comparable {
        public final long a;
        public final long b;
        public static final a c;

        static {
            a.c = new a(-1L, -1L);
        }

        a(long v, long v1) {
            this.a = v;
            this.b = v1;
        }

        public int a(a osSharedRealm$a0) {
            if(osSharedRealm$a0 == null) {
                throw new IllegalArgumentException("Version cannot be compared to a null value.");
            }
            long v = this.a;
            long v1 = osSharedRealm$a0.a;
            if(v > v1) {
                return 1;
            }
            return v >= v1 ? 0 : -1;
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((a)object0));
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(Object object0) {
            return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && (this.a == ((a)object0).a && this.b == ((a)object0).b);
        }

        @Override
        public int hashCode() {
            return ((int)(this.a ^ this.a >>> 0x20)) * 0x1F + ((int)(this.b ^ this.b >>> 0x20));
        }

        @Override
        public String toString() {
            return "VersionID{version=" + this.a + ", index=" + this.b + '}';
        }
    }

    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    public final io.realm.internal.a capabilities;
    public final k context;
    final List iterators;
    private static final long nativeFinalizerPtr;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private static final List sharedRealmsUnderConstruction;
    private final List tempSharedRealmsForCallback;
    private static volatile File temporaryDirectory;

    static {
        OsSharedRealm.nativeFinalizerPtr = OsSharedRealm.nativeGetFinalizerPtr();
        OsSharedRealm.sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    }

    OsSharedRealm(long v, OsRealmConfig osRealmConfig0) {
        this(v, osRealmConfig0, osRealmConfig0.a());
        for(Object object0: OsSharedRealm.sharedRealmsUnderConstruction) {
            OsSharedRealm osSharedRealm0 = (OsSharedRealm)object0;
            if(osSharedRealm0.context == osRealmConfig0.a()) {
                osSharedRealm0.tempSharedRealmsForCallback.add(this);
                return;
            }
            if(false) {
                break;
            }
        }
        throw new IllegalStateException("Cannot find the parent \'OsSharedRealm\' which is under construction.");
    }

    OsSharedRealm(long v, OsRealmConfig osRealmConfig0, k k0) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        this.nativePtr = v;
        this.osRealmConfig = osRealmConfig0;
        this.schemaInfo = new OsSchemaInfo(OsSharedRealm.nativeGetSchemaInfo(v), this);
        this.context = k0;
        k0.a(this);
        this.capabilities = new io.realm.internal.android.a();
        this.realmNotifier = null;
        OsSharedRealm.nativeSetAutoRefresh(v, false);
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig0, a osSharedRealm$a0) {
        long v;
        ArrayList arrayList0 = new ArrayList();
        this.tempSharedRealmsForCallback = arrayList0;
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        io.realm.internal.android.a a0 = new io.realm.internal.android.a();
        AndroidRealmNotifier androidRealmNotifier0 = new AndroidRealmNotifier(this, a0);
        k k0 = osRealmConfig0.a();
        this.context = k0;
        List list0 = OsSharedRealm.sharedRealmsUnderConstruction;
        list0.add(this);
        try {
            v = OsSharedRealm.nativeGetSharedRealm(osRealmConfig0.getNativePtr(), osSharedRealm$a0.a, osSharedRealm$a0.b, androidRealmNotifier0);
            this.nativePtr = v;
        }
        catch(Throwable throwable0) {
            try {
                for(Object object0: this.tempSharedRealmsForCallback) {
                    OsSharedRealm osSharedRealm0 = (OsSharedRealm)object0;
                    if(!osSharedRealm0.isClosed()) {
                        osSharedRealm0.close();
                    }
                }
                throw throwable0;
            }
            catch(Throwable throwable1) {
            }
            this.tempSharedRealmsForCallback.clear();
            OsSharedRealm.sharedRealmsUnderConstruction.remove(this);
            throw throwable1;
        }
        arrayList0.clear();
        list0.remove(this);
        this.osRealmConfig = osRealmConfig0;
        this.schemaInfo = new OsSchemaInfo(OsSharedRealm.nativeGetSchemaInfo(v), this);
        k0.a(this);
        this.capabilities = a0;
        this.realmNotifier = androidRealmNotifier0;
        if(osSharedRealm$a0.equals(a.c)) {
            OsSharedRealm.nativeSetAutoRefresh(v, a0.b());
        }
    }

    void addIterator(q osResults$q0) {
        WeakReference weakReference0 = new WeakReference(osResults$q0);
        this.iterators.add(weakReference0);
    }

    void addPendingRow(p p0) {
        WeakReference weakReference0 = new WeakReference(p0);
        this.pendingRows.add(weakReference0);
    }

    public void beginTransaction() {
        this.detachIterators();
        this.executePendingRowQueries();
        OsSharedRealm.nativeBeginTransaction(this.nativePtr);
    }

    public void cancelTransaction() {
        OsSharedRealm.nativeCancelTransaction(this.nativePtr);
    }

    @Override
    public void close() {
        RealmNotifier realmNotifier0 = this.realmNotifier;
        if(realmNotifier0 != null) {
            realmNotifier0.close();
        }
        synchronized(this.context) {
            OsSharedRealm.nativeCloseSharedRealm(this.nativePtr);
        }
    }

    public void commitTransaction() {
        OsSharedRealm.nativeCommitTransaction(this.nativePtr);
    }

    public boolean compact() {
        return OsSharedRealm.nativeCompact(this.nativePtr);
    }

    public Table createTable(String s) {
        return new Table(this, OsSharedRealm.nativeCreateTable(this.nativePtr, s));
    }

    public Table createTableWithPrimaryKey(String s, String s1, RealmFieldType realmFieldType0, boolean z) {
        return new Table(this, OsSharedRealm.nativeCreateTableWithPrimaryKeyField(this.nativePtr, s, s1, realmFieldType0.getNativeValue(), z));
    }

    private void detachIterators() {
        for(Object object0: this.iterators) {
            q osResults$q0 = (q)((WeakReference)object0).get();
            if(osResults$q0 != null) {
                osResults$q0.c();
            }
        }
        this.iterators.clear();
    }

    private void executePendingRowQueries() {
        for(Object object0: this.pendingRows) {
            p p0 = (p)((WeakReference)object0).get();
            if(p0 != null) {
                p0.t();
            }
        }
        this.pendingRows.clear();
    }

    public OsSharedRealm freeze() {
        a osSharedRealm$a0 = this.getVersionID();
        return new OsSharedRealm(this.osRealmConfig, osSharedRealm$a0);
    }

    public Q0 getConfiguration() {
        return this.osRealmConfig.c();
    }

    public static OsSharedRealm getInstance(Q0 q00, a osSharedRealm$a0) {
        return OsSharedRealm.getInstance(new b(q00), osSharedRealm$a0);
    }

    public static OsSharedRealm getInstance(b osRealmConfig$b0, a osSharedRealm$a0) {
        return new OsSharedRealm(osRealmConfig$b0.b(), osSharedRealm$a0);
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsSharedRealm.nativeFinalizerPtr;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getNumberOfVersions() {
        return OsSharedRealm.nativeNumberOfVersions(this.nativePtr);
    }

    public String getPath() {
        return this.osRealmConfig.c().n();
    }

    public OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public Table getTable(String s) {
        return new Table(this, OsSharedRealm.nativeGetTableRef(this.nativePtr, s));
    }

    public String[] getTablesNames() {
        String[] arr_s = OsSharedRealm.nativeGetTablesName(this.nativePtr);
        return arr_s == null ? new String[0] : arr_s;
    }

    public static File getTemporaryDirectory() {
        return OsSharedRealm.temporaryDirectory;
    }

    public a getVersionID() {
        long[] arr_v = OsSharedRealm.nativeGetVersionID(this.nativePtr);
        if(arr_v == null) {
            throw new IllegalStateException("Cannot get versionId, this could be related to a non existing read/write transaction");
        }
        return new a(arr_v[0], arr_v[1]);
    }

    public boolean hasTable(String s) {
        return OsSharedRealm.nativeHasTable(this.nativePtr, s);
    }

    public static void initialize(File file0) {
        if(OsSharedRealm.temporaryDirectory != null) {
            return;
        }
        String s = file0.getAbsolutePath();
        if(!file0.isDirectory() && !file0.mkdirs() && !file0.isDirectory()) {
            throw new g("failed to create temporary directory: " + s);
        }
        if(!s.endsWith("/")) {
            s = s + "/";
        }
        OsSharedRealm.nativeInit(s);
        OsSharedRealm.temporaryDirectory = file0;
    }

    void invalidateIterators() {
        for(Object object0: this.iterators) {
            q osResults$q0 = (q)((WeakReference)object0).get();
            if(osResults$q0 != null) {
                osResults$q0.f();
            }
        }
        this.iterators.clear();
    }

    public boolean isAutoRefresh() {
        return OsSharedRealm.nativeIsAutoRefresh(this.nativePtr);
    }

    public boolean isClosed() {
        return OsSharedRealm.nativeIsClosed(this.nativePtr);
    }

    public boolean isEmpty() {
        return OsSharedRealm.nativeIsEmpty(this.nativePtr);
    }

    public boolean isFrozen() {
        return OsSharedRealm.nativeIsFrozen(this.nativePtr);
    }

    public boolean isInTransaction() {
        return OsSharedRealm.nativeIsInTransaction(this.nativePtr);
    }

    public boolean isSyncRealm() {
        return this.osRealmConfig.d() != null;
    }

    private static native void nativeBeginTransaction(long arg0) {
    }

    private static native void nativeCancelTransaction(long arg0) {
    }

    private static native void nativeCloseSharedRealm(long arg0) {
    }

    private static native void nativeCommitTransaction(long arg0) {
    }

    private static native boolean nativeCompact(long arg0) {
    }

    private static native long nativeCreateTable(long arg0, String arg1) {
    }

    private static native long nativeCreateTableWithPrimaryKeyField(long arg0, String arg1, String arg2, int arg3, boolean arg4) {
    }

    private static native long nativeFreeze(long arg0) {
    }

    private static native long nativeGetActiveSubscriptionSet(long arg0) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native long nativeGetLatestSubscriptionSet(long arg0) {
    }

    private static native long nativeGetSchemaInfo(long arg0) {
    }

    private static native long nativeGetSharedRealm(long arg0, long arg1, long arg2, RealmNotifier arg3) {
    }

    private static native long nativeGetTableRef(long arg0, String arg1) {
    }

    private static native String[] nativeGetTablesName(long arg0) {
    }

    private static native long[] nativeGetVersionID(long arg0) {
    }

    private static native boolean nativeHasTable(long arg0, String arg1) {
    }

    private static native void nativeInit(String arg0) {
    }

    private static native boolean nativeIsAutoRefresh(long arg0) {
    }

    private static native boolean nativeIsClosed(long arg0) {
    }

    private static native boolean nativeIsEmpty(long arg0) {
    }

    private static native boolean nativeIsFrozen(long arg0) {
    }

    private static native boolean nativeIsInTransaction(long arg0) {
    }

    private static native long nativeNumberOfVersions(long arg0) {
    }

    private static native void nativeRefresh(long arg0) {
    }

    private static native void nativeRegisterSchemaChangedCallback(long arg0, SchemaChangedCallback arg1) {
    }

    private static native void nativeRenameTable(long arg0, String arg1, String arg2) {
    }

    private static native void nativeSetAutoRefresh(long arg0, boolean arg1) {
    }

    private static native long nativeSize(long arg0) {
    }

    private static native void nativeStopWaitForChange(long arg0) {
    }

    private static native boolean nativeWaitForChange(long arg0) {
    }

    private static native void nativeWriteCopy(long arg0, String arg1, @h byte[] arg2) {
    }

    public void refresh() {
        if(this.isFrozen()) {
            throw new IllegalStateException("It is not possible to refresh frozen Realms.");
        }
        OsSharedRealm.nativeRefresh(this.nativePtr);
    }

    public void registerSchemaChangedCallback(SchemaChangedCallback osSharedRealm$SchemaChangedCallback0) {
        OsSharedRealm.nativeRegisterSchemaChangedCallback(this.nativePtr, osSharedRealm$SchemaChangedCallback0);
    }

    void removePendingRow(p p0) {
        for(Object object0: this.pendingRows) {
            WeakReference weakReference0 = (WeakReference)object0;
            p p1 = (p)weakReference0.get();
            if(p1 == null || p1 == p0) {
                this.pendingRows.remove(weakReference0);
            }
        }
    }

    public void renameTable(String s, String s1) {
        try {
            OsSharedRealm.nativeRenameTable(this.nativePtr, s, s1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new RealmError(illegalArgumentException0.getMessage());
        }
    }

    private static void runInitializationCallback(long v, OsRealmConfig osRealmConfig0, InitializationCallback osSharedRealm$InitializationCallback0) {
        osSharedRealm$InitializationCallback0.onInit(new OsSharedRealm(v, osRealmConfig0));
    }

    private static void runMigrationCallback(long v, OsRealmConfig osRealmConfig0, MigrationCallback osSharedRealm$MigrationCallback0, long v1) {
        osSharedRealm$MigrationCallback0.onMigrationNeeded(new OsSharedRealm(v, osRealmConfig0), v1, osRealmConfig0.c().t());
    }

    public void setAutoRefresh(boolean z) {
        this.capabilities.c(null);
        OsSharedRealm.nativeSetAutoRefresh(this.nativePtr, z);
    }

    public long size() {
        return OsSharedRealm.nativeSize(this.nativePtr);
    }

    public void stopWaitForChange() {
        OsSharedRealm.nativeStopWaitForChange(this.nativePtr);
    }

    public boolean waitForChange() {
        return OsSharedRealm.nativeWaitForChange(this.nativePtr);
    }

    public void writeCopy(File file0, @h byte[] arr_b) {
        if(file0.isFile() && file0.exists()) {
            throw new IllegalArgumentException("The destination file must not exist");
        }
        if(this.isSyncRealm()) {
            Util.d("writeCopyTo() cannot be called from the main thread when using synchronized Realms.");
        }
        try {
            String s = file0.getAbsolutePath();
            OsSharedRealm.nativeWriteCopy(this.nativePtr, s, arr_b);
            return;
        }
        catch(RuntimeException runtimeException0) {
            String s1 = runtimeException0.getMessage();
            if(!s1.contains("Could not write file as not all client changes are integrated in server")) {
                throw runtimeException0;
            }
            throw new IllegalStateException(s1);
        }
    }
}

