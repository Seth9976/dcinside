package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e.a.b;
import com.apm.insight.e;

public class a {
    private static volatile a a;
    private b b;
    private SQLiteDatabase c;

    public static a a() {
        if(a.a == null) {
            Class class0 = a.class;
            synchronized(class0) {
                if(a.a == null) {
                    a.a = new a();
                }
            }
        }
        return a.a;
    }

    public final void a(Context context0) {
        synchronized(this) {
            try {
                this.c = new com.apm.insight.e.b(context0).getWritableDatabase();
            }
            catch(Throwable throwable0) {
                com.apm.insight.a.b(throwable0);
            }
        }
        this.b = new b();
    }

    public final void a(com.apm.insight.d.a a0) {
        synchronized(this) {
            this.b();
            b b0 = this.b;
            if(b0 != null) {
                b0.a(this.c, a0);
            }
        }
    }

    public final boolean a(String s) {
        synchronized(this) {
            this.b();
            b b0 = this.b;
            return b0 != null ? b0.a(this.c, s) : false;
        }
    }

    private void b() {
        if(this.b == null) {
            this.a(e.g());
        }
    }
}

