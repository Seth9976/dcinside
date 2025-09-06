package androidx.media3.exoplayer.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.database.VersionTable;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class DefaultDownloadIndex implements WritableDownloadIndex {
    static final class DownloadCursorImpl implements DownloadCursor {
        private final Cursor a;

        private DownloadCursorImpl(Cursor cursor0) {
            this.a = cursor0;
        }

        DownloadCursorImpl(Cursor cursor0, androidx.media3.exoplayer.offline.DefaultDownloadIndex.1 defaultDownloadIndex$10) {
            this(cursor0);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public void close() {
            this.a.close();
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public int getCount() {
            return this.a.getCount();
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public int getPosition() {
            return this.a.getPosition();
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean isAfterLast() {
            return a.a(this);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean isBeforeFirst() {
            return a.b(this);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean isClosed() {
            return this.a.isClosed();
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean isFirst() {
            return a.c(this);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean isLast() {
            return a.d(this);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean moveToFirst() {
            return a.e(this);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean moveToLast() {
            return a.f(this);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean moveToNext() {
            return a.g(this);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean moveToPosition(int v) {
            return this.a.moveToPosition(v);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public boolean moveToPrevious() {
            return a.h(this);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadCursor
        public Download p0() {
            return DefaultDownloadIndex.n(this.a);
        }
    }

    private static final int A = 4;
    private static final int B = 5;
    private static final int C = 6;
    private static final int D = 7;
    private static final int E = 8;
    private static final int F = 9;
    private static final int G = 10;
    private static final int H = 11;
    private static final int I = 12;
    private static final int J = 13;
    private static final int K = 14;
    private static final String L = "id = ?";
    private static final String M = "state = 2";
    private static final String N = null;
    private static final String[] O = null;
    private static final String P = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)";
    private static final String Q = "1";
    private final String a;
    private final String b;
    private final DatabaseProvider c;
    private final Object d;
    @GuardedBy("initializationLock")
    private boolean e;
    private static final String f = "ExoPlayerDownloads";
    @VisibleForTesting
    static final int g = 3;
    private static final String h = "id";
    private static final String i = "mime_type";
    private static final String j = "uri";
    private static final String k = "stream_keys";
    private static final String l = "custom_cache_key";
    private static final String m = "data";
    private static final String n = "state";
    private static final String o = "start_time_ms";
    private static final String p = "update_time_ms";
    private static final String q = "content_length";
    private static final String r = "stop_reason";
    private static final String s = "failure_reason";
    private static final String t = "percent_downloaded";
    private static final String u = "bytes_downloaded";
    private static final String v = "key_set_id";
    private static final int w = 0;
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 3;

    static {
        DefaultDownloadIndex.N = "state IN (3,4)";
        DefaultDownloadIndex.O = new String[]{"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public DefaultDownloadIndex(DatabaseProvider databaseProvider0) {
        this(databaseProvider0, "");
    }

    public DefaultDownloadIndex(DatabaseProvider databaseProvider0, String s) {
        this.a = s;
        this.c = databaseProvider0;
        this.b = "ExoPlayerDownloads" + s;
        this.d = new Object();
    }

    @Override  // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void a(String s, int v) throws DatabaseIOException {
        this.l();
        try {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("stop_reason", v);
            this.c.getWritableDatabase().update(this.b, contentValues0, "state IN (3,4) AND id = ?", new String[]{s});
        }
        catch(SQLException sQLException0) {
            throw new DatabaseIOException(sQLException0);
        }
    }

    @Override  // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void b(Download download0) throws DatabaseIOException {
        this.l();
        try {
            this.s(download0, this.c.getWritableDatabase());
        }
        catch(SQLiteException sQLiteException0) {
            throw new DatabaseIOException(sQLiteException0);
        }
    }

    @Override  // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void c(String s) throws DatabaseIOException {
        this.l();
        try {
            this.c.getWritableDatabase().delete(this.b, "id = ?", new String[]{s});
        }
        catch(SQLiteException sQLiteException0) {
            throw new DatabaseIOException(sQLiteException0);
        }
    }

    @Override  // androidx.media3.exoplayer.offline.DownloadIndex
    public DownloadCursor d(int[] arr_v) throws DatabaseIOException {
        this.l();
        return new DownloadCursorImpl(this.m(DefaultDownloadIndex.p(arr_v), null), null);
    }

    @Override  // androidx.media3.exoplayer.offline.DownloadIndex
    @Nullable
    public Download e(String s) throws DatabaseIOException {
        this.l();
        try(Cursor cursor0 = this.m("id = ?", new String[]{s})) {
            if(cursor0.getCount() == 0) {
                return null;
            }
            cursor0.moveToNext();
            return DefaultDownloadIndex.n(cursor0);
        }
        catch(SQLiteException sQLiteException0) {
            throw new DatabaseIOException(sQLiteException0);
        }
    }

    @Override  // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void f(int v) throws DatabaseIOException {
        this.l();
        try {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("stop_reason", v);
            this.c.getWritableDatabase().update(this.b, contentValues0, "state IN (3,4)", null);
        }
        catch(SQLException sQLException0) {
            throw new DatabaseIOException(sQLException0);
        }
    }

    @Override  // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void g() throws DatabaseIOException {
        this.l();
        try {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("state", 5);
            contentValues0.put("failure_reason", 0);
            this.c.getWritableDatabase().update(this.b, contentValues0, null, null);
        }
        catch(SQLException sQLException0) {
            throw new DatabaseIOException(sQLException0);
        }
    }

    @Override  // androidx.media3.exoplayer.offline.WritableDownloadIndex
    public void h() throws DatabaseIOException {
        this.l();
        try {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("state", 0);
            this.c.getWritableDatabase().update(this.b, contentValues0, "state = 2", null);
        }
        catch(SQLException sQLException0) {
            throw new DatabaseIOException(sQLException0);
        }
    }

    private static List j(@Nullable String s) {
        List list0 = new ArrayList();
        if(TextUtils.isEmpty(s)) {
            return list0;
        }
        String[] arr_s = Util.m2(s, ",");
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = Util.m2(arr_s[v], "\\.");
            Assertions.i(arr_s1.length == 3);
            ((ArrayList)list0).add(new StreamKey(Integer.parseInt(arr_s1[0]), Integer.parseInt(arr_s1[1]), Integer.parseInt(arr_s1[2])));
        }
        return list0;
    }

    @VisibleForTesting
    static String k(List list0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < list0.size(); ++v) {
            StreamKey streamKey0 = (StreamKey)list0.get(v);
            stringBuilder0.append(streamKey0.a);
            stringBuilder0.append('.');
            stringBuilder0.append(streamKey0.b);
            stringBuilder0.append('.');
            stringBuilder0.append(streamKey0.c);
            stringBuilder0.append(',');
        }
        if(stringBuilder0.length() > 0) {
            stringBuilder0.setLength(stringBuilder0.length() - 1);
        }
        return stringBuilder0.toString();
    }

    private void l() throws DatabaseIOException {
        SQLiteDatabase sQLiteDatabase0;
        int v1;
        synchronized(this.d) {
            if(this.e) {
                return;
            }
            try {
                v1 = VersionTable.b(this.c.getReadableDatabase(), 0, this.a);
                if(v1 != 3) {
                    sQLiteDatabase0 = this.c.getWritableDatabase();
                    sQLiteDatabase0.beginTransactionNonExclusive();
                    goto label_12;
                }
                this.e = true;
                return;
            }
            catch(SQLException sQLException0) {
                throw new DatabaseIOException(sQLException0);
            }
            try {
            label_12:
                VersionTable.d(sQLiteDatabase0, 0, this.a, 3);
                List list0 = v1 == 2 ? this.r(sQLiteDatabase0) : new ArrayList();
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS " + this.b);
                sQLiteDatabase0.execSQL("CREATE TABLE " + this.b + " " + "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                for(Object object1: list0) {
                    this.s(((Download)object1), sQLiteDatabase0);
                }
                sQLiteDatabase0.setTransactionSuccessful();
                goto label_30;
            }
            catch(Throwable throwable0) {
            }
            try {
                sQLiteDatabase0.endTransaction();
                throw throwable0;
            label_30:
                sQLiteDatabase0.endTransaction();
                this.e = true;
                return;
            }
            catch(SQLException sQLException0) {
            }
        }
        throw new DatabaseIOException(sQLException0);
    }

    private Cursor m(String s, @Nullable String[] arr_s) throws DatabaseIOException {
        try {
            return this.c.getReadableDatabase().query(this.b, DefaultDownloadIndex.O, s, arr_s, null, null, "start_time_ms ASC");
        }
        catch(SQLiteException sQLiteException0) {
            throw new DatabaseIOException(sQLiteException0);
        }
    }

    private static Download n(Cursor cursor0) {
        byte[] arr_b = cursor0.getBlob(14);
        Builder downloadRequest$Builder0 = new Builder(((String)Assertions.g(cursor0.getString(0))), Uri.parse(((String)Assertions.g(cursor0.getString(2))))).e(cursor0.getString(1)).f(DefaultDownloadIndex.j(cursor0.getString(3)));
        if(arr_b.length <= 0) {
            arr_b = null;
        }
        DownloadRequest downloadRequest0 = downloadRequest$Builder0.d(arr_b).b(cursor0.getString(4)).c(cursor0.getBlob(5)).a();
        DownloadProgress downloadProgress0 = new DownloadProgress();
        downloadProgress0.a = cursor0.getLong(13);
        downloadProgress0.b = cursor0.getFloat(12);
        int v = cursor0.getInt(6);
        if(v == 4) {
            int v1 = cursor0.getInt(11);
            return new Download(downloadRequest0, 4, cursor0.getLong(7), cursor0.getLong(8), cursor0.getLong(9), cursor0.getInt(10), v1, downloadProgress0);
        }
        return new Download(downloadRequest0, v, cursor0.getLong(7), cursor0.getLong(8), cursor0.getLong(9), cursor0.getInt(10), 0, downloadProgress0);
    }

    private static Download o(Cursor cursor0) {
        DownloadRequest downloadRequest0 = new Builder(((String)Assertions.g(cursor0.getString(0))), Uri.parse(((String)Assertions.g(cursor0.getString(2))))).e(DefaultDownloadIndex.q(cursor0.getString(1))).f(DefaultDownloadIndex.j(cursor0.getString(3))).b(cursor0.getString(4)).c(cursor0.getBlob(5)).a();
        DownloadProgress downloadProgress0 = new DownloadProgress();
        downloadProgress0.a = cursor0.getLong(13);
        downloadProgress0.b = cursor0.getFloat(12);
        int v = cursor0.getInt(6);
        if(v == 4) {
            int v1 = cursor0.getInt(11);
            return new Download(downloadRequest0, 4, cursor0.getLong(7), cursor0.getLong(8), cursor0.getLong(9), cursor0.getInt(10), v1, downloadProgress0);
        }
        return new Download(downloadRequest0, v, cursor0.getLong(7), cursor0.getLong(8), cursor0.getLong(9), cursor0.getInt(10), 0, downloadProgress0);
    }

    private static String p(int[] arr_v) {
        if(arr_v.length == 0) {
            return "1";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("state");
        stringBuilder0.append(" IN (");
        for(int v = 0; v < arr_v.length; ++v) {
            if(v > 0) {
                stringBuilder0.append(',');
            }
            stringBuilder0.append(arr_v[v]);
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    private static String q(@Nullable String s) {
        if("dash".equals(s)) {
            return "application/dash+xml";
        }
        if("hls".equals(s)) {
            return "application/x-mpegURL";
        }
        return "ss".equals(s) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
    }

    private List r(SQLiteDatabase sQLiteDatabase0) {
        List list0 = new ArrayList();
        if(!Util.s2(sQLiteDatabase0, this.b)) {
            return list0;
        }
        try(Cursor cursor0 = sQLiteDatabase0.query(this.b, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                list0.add(DefaultDownloadIndex.o(cursor0));
            }
        }
        return list0;
    }

    private void s(Download download0, SQLiteDatabase sQLiteDatabase0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("id", download0.a.a);
        contentValues0.put("mime_type", download0.a.c);
        contentValues0.put("uri", download0.a.b.toString());
        contentValues0.put("stream_keys", DefaultDownloadIndex.k(download0.a.d));
        contentValues0.put("custom_cache_key", download0.a.f);
        contentValues0.put("data", download0.a.g);
        contentValues0.put("state", download0.b);
        contentValues0.put("start_time_ms", download0.c);
        contentValues0.put("update_time_ms", download0.d);
        contentValues0.put("content_length", download0.e);
        contentValues0.put("stop_reason", download0.f);
        contentValues0.put("failure_reason", download0.g);
        contentValues0.put("percent_downloaded", download0.b());
        contentValues0.put("bytes_downloaded", download0.a());
        contentValues0.put("key_set_id", (download0.a.e == null ? Util.f : download0.a.e));
        sQLiteDatabase0.replaceOrThrow(this.b, null, contentValues0);
    }

    class androidx.media3.exoplayer.offline.DefaultDownloadIndex.1 {
    }

}

