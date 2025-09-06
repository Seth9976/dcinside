package com.bytedance.sdk.component.cz.PjT.PjT.PjT;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class JQp implements com.bytedance.sdk.component.cz.PjT.PjT.JQp {
    public static final JQp PjT;
    private volatile SQLiteDatabase Zh;

    static {
        JQp.PjT = new JQp();
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.JQp
    public String JQp() {
        return "logstatsbatch";
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.JQp
    public SQLiteDatabase PjT(Context context0) {
        if(this.Zh == null) {
            __monitor_enter(this);
            try {
                if(this.Zh == null) {
                    this.Zh = new cr(context0).getWritableDatabase();
                }
                __monitor_exit(this);
                return this.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        }
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.JQp
    public String PjT() {
        return "loghighpriority";
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.JQp
    public String ReZ() {
        return null;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.JQp
    public String Zh() {
        return "adevent";
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.JQp
    public String cr() {
        return "logstats";
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.JQp
    public String cz() {
        return null;
    }
}

