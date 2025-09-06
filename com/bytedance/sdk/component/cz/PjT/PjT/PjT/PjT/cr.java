package com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT;

import android.content.Context;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.PjT.JQp;

public class cr extends PjT {
    public cr(Context context0, com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT pjT0) {
        super(context0, pjT0);
    }

    public static String ReZ(String s) {
        return "CREATE TABLE IF NOT EXISTS " + s + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT.PjT
    public byte ReZ() {
        return 1;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT.PjT
    public String Zh() {
        JQp jQp0 = Au.XX().cr();
        return jQp0 == null ? null : jQp0.PjT();
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT.PjT
    public byte cr() {
        return 0;
    }
}

