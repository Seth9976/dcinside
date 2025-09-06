package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.Au.SM;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class h.d {
    private final SparseArray a;
    private final h.f b;
    private final Executor c;
    private volatile SQLiteStatement d;
    private static volatile h.d e;

    private h.d(Context context0) {
        SparseArray sparseArray0 = new SparseArray(2);
        this.a = sparseArray0;
        this.c = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new SM(5, "video_proxy_db"));
        this.b = new h.f(context0.getApplicationContext());
        sparseArray0.put(0, new ConcurrentHashMap());
        sparseArray0.put(1, new ConcurrentHashMap());
    }

    public h.c c(String s, int v) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        Map map0 = (Map)this.a.get(v);
        h.c h$c0 = map0 == null ? null : ((h.c)map0.get(s));
        if(h$c0 != null) {
            return h$c0;
        }
        try {
            Cursor cursor0 = this.b.getReadableDatabase().query("video_http_header_t", null, "key=? AND flag=?", new String[]{s, String.valueOf(v)}, null, null, null, "1");
            if(cursor0 != null) {
                if(cursor0.getCount() > 0 && cursor0.moveToNext()) {
                    h$c0 = new h.c(cursor0.getString(cursor0.getColumnIndex("key")), cursor0.getString(cursor0.getColumnIndex("mime")), cursor0.getInt(cursor0.getColumnIndex("contentLength")), v, cursor0.getString(cursor0.getColumnIndex("extra")));
                }
                cursor0.close();
            }
            if(h$c0 != null && map0 != null) {
                map0.put(s, h$c0);
            }
            return h$c0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static h.d d(Context context0) {
        if(h.d.e == null) {
            Class class0 = h.d.class;
            __monitor_enter(class0);
            try {
                if(h.d.e == null) {
                    h.d.e = new h.d(context0);
                }
                __monitor_exit(class0);
                return h.d.e;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return h.d.e;
    }

    public void e(int v) {
        class b implements Runnable {
            final int a;
            final h.d b;

            b(int v) {
                this.a = v;
                super();
            }

            @Override
            public void run() {
                try {
                    h.d.this.b.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(this.a)});
                }
                catch(Throwable unused_ex) {
                }
            }
        }

        Map map0 = (Map)this.a.get(v);
        if(map0 != null) {
            map0.clear();
        }
        b h$d$b0 = new b(this, v);
        this.c.execute(h$d$b0);
    }

    public void f(h.c h$c0) {
        class a implements Runnable {
            final h.c a;
            final h.d b;

            a(h.c h$c0) {
                this.a = h$c0;
                super();
            }

            @Override
            public void run() {
                try {
                    if(h.d.this.d == null) {
                        SQLiteStatement sQLiteStatement0 = h.d.this.b.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        h.d.this.d = sQLiteStatement0;
                    }
                    else {
                        h.d.this.d.clearBindings();
                    }
                    h.d.this.d.bindString(1, this.a.a);
                    h.d.this.d.bindString(2, this.a.b);
                    h.d.this.d.bindLong(3, ((long)this.a.c));
                    h.d.this.d.bindLong(4, ((long)this.a.d));
                    h.d.this.d.bindString(5, this.a.e);
                    h.d.this.d.executeInsert();
                }
                catch(Throwable unused_ex) {
                }
            }
        }

        if(h$c0 != null) {
            Map map0 = (Map)this.a.get(h$c0.d);
            if(map0 != null) {
                map0.put(h$c0.a, h$c0);
            }
            a h$d$a0 = new a(this, h$c0);
            this.c.execute(h$d$a0);
        }
    }

    public void g(Collection collection0, int v) {
        if(collection0 != null && !collection0.isEmpty()) {
            int v1 = collection0.size();
            String[] arr_s = new String[v1 + 1];
            Map map0 = (Map)this.a.get(v);
            int v2 = -1;
            for(Object object0: collection0) {
                String s = (String)object0;
                if(map0 != null) {
                    map0.remove(s);
                }
                ++v2;
                arr_s[v2] = s;
            }
            arr_s[v2 + 1] = String.valueOf(v);
            try {
                this.b.getWritableDatabase().delete("video_http_header_t", "key IN(" + this.i(v1 + 1) + ") AND flag=?", arr_s);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private String i(int v) {
        if(v <= 0) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder(v << 1);
        stringBuilder0.append("?");
        for(int v1 = 1; v1 < v; ++v1) {
            stringBuilder0.append(",?");
        }
        return stringBuilder0.toString();
    }
}

