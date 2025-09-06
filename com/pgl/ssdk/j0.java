package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public class j0 {
    private static volatile j0 a;
    private Context b;
    private List c;

    static {
    }

    private j0(Context context0) {
        this.b = null;
        this.c = new ArrayList();
        this.b = context0;
    }

    public static j0 a(Context context0) {
        if(j0.a == null) {
            Class class0 = j0.class;
            __monitor_enter(class0);
            try {
                if(j0.a == null) {
                    j0.a = new j0(context0);
                }
                __monitor_exit(class0);
                return j0.a;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return j0.a;
    }

    public void a() {
        int v = this.f();
        if(v == -1) {
            return;
        }
        this.c.add(v);
        try {
            int v1 = this.c.size();
            if(v1 > 20) {
                ArrayList arrayList0 = new ArrayList(this.c.subList(v1 - 10, v1));
                this.c.clear();
                this.c = arrayList0;
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public int b() {
        Intent intent0 = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return intent0 == null ? 0 : intent0.getIntExtra("plugged", 0);
    }

    public int c() {
        Intent intent0 = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return intent0 == null ? 0 : Math.round(((float)intent0.getIntExtra("level", 0)) / ((float)intent0.getIntExtra("scale", 0)) * 1000.0f) / 10;
    }

    public String d() {
        synchronized(this) {
            return this.c.size() <= 0 ? "-1" : String.valueOf(((int)(((Integer)this.c.get(this.c.size() - 1)))) % 10000);
        }
    }

    public String e() {
        synchronized(this) {
            return new JSONArray(this.c).toString();
        }
    }

    @SuppressLint({"DefaultLocale"})
    public int f() {
        int v1;
        int v = 0;
        try {
            synchronized(this) {
                v = this.b();
                v1 = this.c();
            }
            return v * 10000 + v1;
        }
        catch(Exception unused_ex) {
            return v * 10000;
        }
    }
}

