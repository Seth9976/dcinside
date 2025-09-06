package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.AtomicFile;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.database.VersionTable;
import com.google.common.collect.a3;
import com.google.common.collect.u5;
import j..util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class CachedContentIndex {
    static final class DatabaseStorage implements Storage {
        private final DatabaseProvider a;
        private final SparseArray b;
        private String c;
        private String d;
        private static final String e = "ExoPlayerCacheIndex";
        private static final int f = 1;
        private static final String g = "id";
        private static final String h = "key";
        private static final String i = "metadata";
        private static final int j = 0;
        private static final int k = 1;
        private static final int l = 2;
        private static final String m = "id = ?";
        private static final String[] n = null;
        private static final String o = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";

        static {
            DatabaseStorage.n = new String[]{"id", "key", "metadata"};
        }

        public DatabaseStorage(DatabaseProvider databaseProvider0) {
            this.a = databaseProvider0;
            this.b = new SparseArray();
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void a() throws DatabaseIOException {
            String s = (String)Assertions.g(this.c);
            DatabaseStorage.k(this.a, s);
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void b(long v) {
            String s = Long.toHexString(v);
            this.c = s;
            this.d = "ExoPlayerCacheIndex" + s;
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void c(HashMap hashMap0) throws IOException {
            try {
                SQLiteDatabase sQLiteDatabase0 = this.a.getWritableDatabase();
                sQLiteDatabase0.beginTransactionNonExclusive();
                try {
                    this.p(sQLiteDatabase0);
                    for(Object object0: hashMap0.values()) {
                        this.i(sQLiteDatabase0, ((CachedContent)object0));
                    }
                    sQLiteDatabase0.setTransactionSuccessful();
                    this.b.clear();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
                return;
            }
            catch(SQLException sQLException0) {
            }
            throw new DatabaseIOException(sQLException0);
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void d(CachedContent cachedContent0) {
            this.b.put(cachedContent0.a, cachedContent0);
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public boolean e() throws DatabaseIOException {
            try {
                return VersionTable.b(this.a.getReadableDatabase(), 1, ((String)Assertions.g(this.c))) == -1 ? false : true;
            }
            catch(SQLException sQLException0) {
                throw new DatabaseIOException(sQLException0);
            }
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void f(HashMap hashMap0) throws IOException {
            if(this.b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase sQLiteDatabase0 = this.a.getWritableDatabase();
                sQLiteDatabase0.beginTransactionNonExclusive();
                try {
                    for(int v = 0; v < this.b.size(); ++v) {
                        CachedContent cachedContent0 = (CachedContent)this.b.valueAt(v);
                        if(cachedContent0 == null) {
                            this.l(sQLiteDatabase0, this.b.keyAt(v));
                        }
                        else {
                            this.i(sQLiteDatabase0, cachedContent0);
                        }
                    }
                    sQLiteDatabase0.setTransactionSuccessful();
                    this.b.clear();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
                return;
            }
            catch(SQLException sQLException0) {
            }
            throw new DatabaseIOException(sQLException0);
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void g(CachedContent cachedContent0, boolean z) {
            if(z) {
                this.b.delete(cachedContent0.a);
                return;
            }
            this.b.put(cachedContent0.a, null);
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void h(HashMap hashMap0, SparseArray sparseArray0) throws IOException {
            Assertions.i(this.b.size() == 0);
            try {
                if(VersionTable.b(this.a.getReadableDatabase(), 1, ((String)Assertions.g(this.c))) != 1) {
                    SQLiteDatabase sQLiteDatabase0 = this.a.getWritableDatabase();
                    sQLiteDatabase0.beginTransactionNonExclusive();
                    try {
                        this.p(sQLiteDatabase0);
                        sQLiteDatabase0.setTransactionSuccessful();
                    }
                    finally {
                        sQLiteDatabase0.endTransaction();
                    }
                }
                try(Cursor cursor0 = this.n()) {
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        CachedContent cachedContent0 = new CachedContent(cursor0.getInt(0), ((String)Assertions.g(cursor0.getString(1))), CachedContentIndex.q(new DataInputStream(new ByteArrayInputStream(cursor0.getBlob(2)))));
                        hashMap0.put(cachedContent0.b, cachedContent0);
                        sparseArray0.put(cachedContent0.a, cachedContent0.b);
                    }
                }
                return;
            }
            catch(SQLiteException sQLiteException0) {
            }
            hashMap0.clear();
            sparseArray0.clear();
            throw new DatabaseIOException(sQLiteException0);
        }

        private void i(SQLiteDatabase sQLiteDatabase0, CachedContent cachedContent0) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            CachedContentIndex.t(cachedContent0.d(), new DataOutputStream(byteArrayOutputStream0));
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("id", cachedContent0.a);
            contentValues0.put("key", cachedContent0.b);
            contentValues0.put("metadata", arr_b);
            sQLiteDatabase0.replaceOrThrow(((String)Assertions.g(this.d)), null, contentValues0);
        }

        public static void j(DatabaseProvider databaseProvider0, long v) throws DatabaseIOException {
            DatabaseStorage.k(databaseProvider0, Long.toHexString(v));
        }

        private static void k(DatabaseProvider databaseProvider0, String s) throws DatabaseIOException {
            try {
                SQLiteDatabase sQLiteDatabase0 = databaseProvider0.getWritableDatabase();
                sQLiteDatabase0.beginTransactionNonExclusive();
                try {
                    VersionTable.c(sQLiteDatabase0, 1, s);
                    DatabaseStorage.m(sQLiteDatabase0, "ExoPlayerCacheIndex" + s);
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
                return;
            }
            catch(SQLException sQLException0) {
            }
            throw new DatabaseIOException(sQLException0);
        }

        private void l(SQLiteDatabase sQLiteDatabase0, int v) {
            sQLiteDatabase0.delete(((String)Assertions.g(this.d)), "id = ?", new String[]{Integer.toString(v)});
        }

        private static void m(SQLiteDatabase sQLiteDatabase0, String s) {
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS " + s);
        }

        private Cursor n() {
            return this.a.getReadableDatabase().query(((String)Assertions.g(this.d)), DatabaseStorage.n, null, null, null, null, null);
        }

        private static String o(String s) [...] // Inlined contents

        private void p(SQLiteDatabase sQLiteDatabase0) throws DatabaseIOException {
            VersionTable.d(sQLiteDatabase0, 1, ((String)Assertions.g(this.c)), 1);
            DatabaseStorage.m(sQLiteDatabase0, ((String)Assertions.g(this.d)));
            sQLiteDatabase0.execSQL("CREATE TABLE " + this.d + " " + "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    static class LegacyStorage implements Storage {
        private final boolean a;
        @Nullable
        private final Cipher b;
        @Nullable
        private final SecretKeySpec c;
        @Nullable
        private final SecureRandom d;
        private final AtomicFile e;
        private boolean f;
        @Nullable
        private ReusableBufferedOutputStream g;
        private static final int h = 2;
        private static final int i = 2;
        private static final int j = 1;

        public LegacyStorage(File file0, @Nullable byte[] arr_b, boolean z) {
            SecretKeySpec secretKeySpec0;
            Cipher cipher0;
            boolean z1 = false;
            Assertions.i(arr_b != null || !z);
            SecureRandom secureRandom0 = null;
            if(arr_b == null) {
                Assertions.a(!z);
                cipher0 = null;
                secretKeySpec0 = null;
            }
            else {
                if(arr_b.length == 16) {
                    z1 = true;
                }
                Assertions.a(z1);
                try {
                    cipher0 = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
                }
                catch(NoSuchAlgorithmException | NoSuchPaddingException noSuchAlgorithmException0) {
                    throw new IllegalStateException(noSuchAlgorithmException0);
                }
            }
            this.a = z;
            this.b = cipher0;
            this.c = secretKeySpec0;
            if(z) {
                secureRandom0 = new SecureRandom();
            }
            this.d = secureRandom0;
            this.e = new AtomicFile(file0);
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void a() {
            this.e.a();
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void b(long v) {
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void c(HashMap hashMap0) throws IOException {
            this.m(hashMap0);
            this.f = false;
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void d(CachedContent cachedContent0) {
            this.f = true;
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public boolean e() {
            return this.e.c();
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void f(HashMap hashMap0) throws IOException {
            if(!this.f) {
                return;
            }
            this.c(hashMap0);
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void g(CachedContent cachedContent0, boolean z) {
            this.f = true;
        }

        @Override  // androidx.media3.datasource.cache.CachedContentIndex$Storage
        public void h(HashMap hashMap0, SparseArray sparseArray0) {
            Assertions.i(!this.f);
            if(!this.k(hashMap0, sparseArray0)) {
                hashMap0.clear();
                sparseArray0.clear();
                this.e.a();
            }
        }

        private int i(CachedContent cachedContent0, int v) {
            int v1 = cachedContent0.a * 0x1F + cachedContent0.b.hashCode();
            if(v < 2) {
                long v2 = c.a(cachedContent0.d());
                return v1 * 0x1F + ((int)(v2 ^ v2 >>> 0x20));
            }
            return v1 * 0x1F + cachedContent0.d().hashCode();
        }

        private CachedContent j(int v, DataInputStream dataInputStream0) throws IOException {
            int v1 = dataInputStream0.readInt();
            String s = dataInputStream0.readUTF();
            if(v < 2) {
                long v2 = dataInputStream0.readLong();
                ContentMetadataMutations contentMetadataMutations0 = new ContentMetadataMutations();
                ContentMetadataMutations.h(contentMetadataMutations0, v2);
                return new CachedContent(v1, s, DefaultContentMetadata.f.f(contentMetadataMutations0));
            }
            return new CachedContent(v1, s, CachedContentIndex.q(dataInputStream0));
        }

        private boolean k(HashMap hashMap0, SparseArray sparseArray0) {
            int v;
            DataInputStream dataInputStream1;
            BufferedInputStream bufferedInputStream0;
            DataInputStream dataInputStream0;
            if(!this.e.c()) {
                return true;
            }
            try {
                dataInputStream0 = null;
                bufferedInputStream0 = new BufferedInputStream(this.e.d());
                dataInputStream1 = new DataInputStream(bufferedInputStream0);
            }
            catch(IOException unused_ex) {
                goto label_43;
            }
            catch(Throwable throwable0) {
                goto label_46;
            }
            try {
                v = dataInputStream1.readInt();
                if(v >= 0 && v <= 2) {
                    if((dataInputStream1.readInt() & 1) != 0) {
                        goto label_15;
                    }
                    else if(this.a) {
                        this.f = true;
                    }
                    goto label_26;
                }
                goto label_57;
            }
            catch(IOException unused_ex) {
                dataInputStream0 = dataInputStream1;
                goto label_43;
            }
            catch(Throwable throwable0) {
                dataInputStream0 = dataInputStream1;
                goto label_46;
            }
        label_15:
            if(this.b == null) {
                Util.t(dataInputStream1);
                return false;
            }
            try {
                byte[] arr_b = new byte[16];
                dataInputStream1.readFully(arr_b);
                IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b);
                try {
                    this.b.init(2, this.c, ivParameterSpec0);
                }
                catch(InvalidKeyException | InvalidAlgorithmParameterException invalidKeyException0) {
                    throw new IllegalStateException(invalidKeyException0);
                }
                dataInputStream1 = new DataInputStream(new CipherInputStream(bufferedInputStream0, this.b));
            label_26:
                int v1 = dataInputStream1.readInt();
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    CachedContent cachedContent0 = this.j(v, dataInputStream1);
                    hashMap0.put(cachedContent0.b, cachedContent0);
                    sparseArray0.put(cachedContent0.a, cachedContent0.b);
                    v3 += this.i(cachedContent0, v);
                }
                int v4 = dataInputStream1.readInt();
                if(dataInputStream1.read() == -1) {
                    goto label_49;
                }
                else {
                    goto label_51;
                }
                goto label_52;
            }
            catch(IOException unused_ex) {
                dataInputStream0 = dataInputStream1;
            }
            catch(Throwable throwable0) {
                dataInputStream0 = dataInputStream1;
                goto label_46;
            }
        label_43:
            if(dataInputStream0 != null) {
                Util.t(dataInputStream0);
            }
            return false;
        label_46:
            if(dataInputStream0 != null) {
                Util.t(dataInputStream0);
            }
            throw throwable0;
        label_49:
            boolean z = true;
            goto label_52;
        label_51:
            z = false;
        label_52:
            if(v4 == v3 && z) {
                Util.t(dataInputStream1);
                return true;
            }
            Util.t(dataInputStream1);
            return false;
        label_57:
            Util.t(dataInputStream1);
            return false;
        }

        private void l(CachedContent cachedContent0, DataOutputStream dataOutputStream0) throws IOException {
            dataOutputStream0.writeInt(cachedContent0.a);
            dataOutputStream0.writeUTF(cachedContent0.b);
            CachedContentIndex.t(cachedContent0.d(), dataOutputStream0);
        }

        private void m(HashMap hashMap0) throws IOException {
            DataOutputStream dataOutputStream0;
            ReusableBufferedOutputStream reusableBufferedOutputStream1;
            Closeable closeable0 = null;
            try {
                OutputStream outputStream0 = this.e.f();
                ReusableBufferedOutputStream reusableBufferedOutputStream0 = this.g;
                if(reusableBufferedOutputStream0 == null) {
                    this.g = new ReusableBufferedOutputStream(outputStream0);
                }
                else {
                    reusableBufferedOutputStream0.a(outputStream0);
                }
                reusableBufferedOutputStream1 = this.g;
                dataOutputStream0 = new DataOutputStream(reusableBufferedOutputStream1);
                goto label_12;
            }
            catch(Throwable throwable0) {
            }
            Util.t(closeable0);
            throw throwable0;
            try {
            label_12:
                dataOutputStream0.writeInt(2);
                int v = 0;
                dataOutputStream0.writeInt(((int)this.a));
                if(this.a) {
                    byte[] arr_b = new byte[16];
                    this.d.nextBytes(arr_b);
                    dataOutputStream0.write(arr_b);
                    IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b);
                    try {
                        this.b.init(1, this.c, ivParameterSpec0);
                    }
                    catch(InvalidKeyException | InvalidAlgorithmParameterException invalidKeyException0) {
                        throw new IllegalStateException(invalidKeyException0);
                    }
                    dataOutputStream0.flush();
                    dataOutputStream0 = new DataOutputStream(new CipherOutputStream(reusableBufferedOutputStream1, this.b));
                }
                dataOutputStream0.writeInt(hashMap0.size());
                for(Object object0: hashMap0.values()) {
                    this.l(((CachedContent)object0), dataOutputStream0);
                    v += this.i(((CachedContent)object0), 2);
                }
                dataOutputStream0.writeInt(v);
                this.e.b(dataOutputStream0);
            }
            catch(Throwable throwable0) {
                closeable0 = dataOutputStream0;
                Util.t(closeable0);
                throw throwable0;
            }
            Util.t(null);
        }
    }

    interface Storage {
        void a() throws IOException;

        void b(long arg1);

        void c(HashMap arg1) throws IOException;

        void d(CachedContent arg1);

        boolean e() throws IOException;

        void f(HashMap arg1) throws IOException;

        void g(CachedContent arg1, boolean arg2);

        void h(HashMap arg1, SparseArray arg2) throws IOException;
    }

    private final HashMap a;
    private final SparseArray b;
    private final SparseBooleanArray c;
    private final SparseBooleanArray d;
    private Storage e;
    @Nullable
    private Storage f;
    static final String g = "cached_content_index.exi";
    private static final int h = 0xA00000;

    public CachedContentIndex(DatabaseProvider databaseProvider0) {
        this(databaseProvider0, null, null, false, false);
    }

    public CachedContentIndex(@Nullable DatabaseProvider databaseProvider0, @Nullable File file0, @Nullable byte[] arr_b, boolean z, boolean z1) {
        Assertions.i(databaseProvider0 != null || file0 != null);
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        LegacyStorage cachedContentIndex$LegacyStorage0 = null;
        DatabaseStorage cachedContentIndex$DatabaseStorage0 = databaseProvider0 == null ? null : new DatabaseStorage(databaseProvider0);
        if(file0 != null) {
            cachedContentIndex$LegacyStorage0 = new LegacyStorage(new File(file0, "cached_content_index.exi"), arr_b, z);
        }
        if(cachedContentIndex$DatabaseStorage0 != null && (cachedContentIndex$LegacyStorage0 == null || !z1)) {
            this.e = cachedContentIndex$DatabaseStorage0;
            this.f = cachedContentIndex$LegacyStorage0;
            return;
        }
        this.e = cachedContentIndex$LegacyStorage0;
        this.f = cachedContentIndex$DatabaseStorage0;
    }

    private CachedContent c(String s) {
        int v = CachedContentIndex.l(this.b);
        CachedContent cachedContent0 = new CachedContent(v, s);
        this.a.put(s, cachedContent0);
        this.b.put(v, s);
        this.d.put(v, true);
        this.e.d(cachedContent0);
        return cachedContent0;
    }

    public void d(String s, ContentMetadataMutations contentMetadataMutations0) {
        CachedContent cachedContent0 = this.m(s);
        if(cachedContent0.b(contentMetadataMutations0)) {
            this.e.d(cachedContent0);
        }
    }

    public int e(String s) {
        return this.m(s).a;
    }

    @WorkerThread
    public static void f(DatabaseProvider databaseProvider0, long v) throws DatabaseIOException {
        DatabaseStorage.j(databaseProvider0, v);
    }

    @Nullable
    public CachedContent g(String s) {
        return (CachedContent)this.a.get(s);
    }

    public Collection h() {
        return DesugarCollections.unmodifiableCollection(this.a.values());
    }

    public ContentMetadata i(String s) {
        CachedContent cachedContent0 = this.g(s);
        return cachedContent0 == null ? DefaultContentMetadata.f : cachedContent0.d();
    }

    @Nullable
    public String j(int v) {
        return (String)this.b.get(v);
    }

    public Set k() {
        return this.a.keySet();
    }

    @VisibleForTesting
    static int l(SparseArray sparseArray0) {
        int v = sparseArray0.size();
        int v1 = 0;
        int v2 = v == 0 ? 0 : sparseArray0.keyAt(v - 1) + 1;
        if(v2 < 0) {
            while(v1 < v && v1 == sparseArray0.keyAt(v1)) {
                ++v1;
            }
            return v1;
        }
        return v2;
    }

    public CachedContent m(String s) {
        CachedContent cachedContent0 = (CachedContent)this.a.get(s);
        return cachedContent0 == null ? this.c(s) : cachedContent0;
    }

    @WorkerThread
    public void n(long v) throws IOException {
        this.e.b(v);
        Storage cachedContentIndex$Storage0 = this.f;
        if(cachedContentIndex$Storage0 != null) {
            cachedContentIndex$Storage0.b(v);
        }
        if(this.e.e() || (this.f == null || !this.f.e())) {
            this.e.h(this.a, this.b);
        }
        else {
            this.f.h(this.a, this.b);
            this.e.c(this.a);
        }
        Storage cachedContentIndex$Storage1 = this.f;
        if(cachedContentIndex$Storage1 != null) {
            cachedContentIndex$Storage1.a();
            this.f = null;
        }
    }

    public static boolean o(String s) {
        return s.startsWith("cached_content_index.exi");
    }

    public void p(String s) {
        CachedContent cachedContent0 = (CachedContent)this.a.get(s);
        if(cachedContent0 != null && cachedContent0.g() && cachedContent0.i()) {
            this.a.remove(s);
            int v = cachedContent0.a;
            boolean z = this.d.get(v);
            this.e.g(cachedContent0, z);
            if(z) {
                this.b.remove(v);
                this.d.delete(v);
                return;
            }
            this.b.put(v, null);
            this.c.put(v, true);
        }
    }

    private static DefaultContentMetadata q(DataInputStream dataInputStream0) throws IOException {
        int v = dataInputStream0.readInt();
        HashMap hashMap0 = new HashMap();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = dataInputStream0.readUTF();
            int v2 = dataInputStream0.readInt();
            if(v2 < 0) {
                throw new IOException("Invalid value size: " + v2);
            }
            int v3 = Math.min(v2, 0xA00000);
            byte[] arr_b = Util.f;
            for(int v4 = 0; v4 != v2; v4 = v5) {
                int v5 = v4 + v3;
                arr_b = Arrays.copyOf(arr_b, v5);
                dataInputStream0.readFully(arr_b, v4, v3);
                v3 = Math.min(v2 - v5, 0xA00000);
            }
            hashMap0.put(s, arr_b);
        }
        return new DefaultContentMetadata(hashMap0);
    }

    public void r() {
        u5 u50 = a3.u(this.a.keySet()).i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            this.p(((String)object0));
        }
    }

    @WorkerThread
    public void s() throws IOException {
        this.e.f(this.a);
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = this.c.keyAt(v1);
            this.b.remove(v2);
        }
        this.c.clear();
        this.d.clear();
    }

    private static void t(DefaultContentMetadata defaultContentMetadata0, DataOutputStream dataOutputStream0) throws IOException {
        Set set0 = defaultContentMetadata0.g();
        dataOutputStream0.writeInt(set0.size());
        for(Object object0: set0) {
            dataOutputStream0.writeUTF(((String)((Map.Entry)object0).getKey()));
            byte[] arr_b = (byte[])((Map.Entry)object0).getValue();
            dataOutputStream0.writeInt(arr_b.length);
            dataOutputStream0.write(arr_b);
        }
    }
}

