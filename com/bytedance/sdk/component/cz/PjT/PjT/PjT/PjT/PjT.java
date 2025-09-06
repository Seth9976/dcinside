package com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.JQp;
import com.bytedance.sdk.component.cz.PjT.ReZ.Zh;
import com.bytedance.sdk.component.cz.PjT.Zh.cr;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jeb.synthetic.TWR;
import org.json.JSONObject;

public class PjT extends ReZ {
    protected List PjT;
    private final Context ReZ;
    private com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT cr;

    public PjT(Context context0, com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT pjT0) {
        super(context0);
        this.PjT = new ArrayList();
        this.ReZ = context0;
        this.cr = pjT0;
        if(pjT0 == null) {
            this.cr = com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT.ReZ();
        }
    }

    private static String PjT(String s, String s1) {
        return TextUtils.isEmpty(s) ? s1 : s;
    }

    private static String PjT(String s, List list0, int v, boolean z) {
        int v1 = Math.min(v, 1000);
        int v2 = list0.size();
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v3 = 0; v3 < (v2 % v1 == 0 ? v2 / v1 : v2 / v1 + 1); ++v3) {
            String s1 = PjT.PjT(TextUtils.join("\',\'", list0.subList(v3 * v1, Math.min(v3 * v1 + v1, v2))), "");
            if(v3 != 0) {
                stringBuilder0.append((z ? " OR " : " AND "));
            }
            stringBuilder0.append(s);
            stringBuilder0.append((z ? " IN " : " NOT IN "));
            stringBuilder0.append("(\'");
            stringBuilder0.append(s1);
            stringBuilder0.append("\')");
        }
        return PjT.PjT(stringBuilder0.toString(), s + (z ? " IN " : " NOT IN ") + "(\'\')");
    }

    public int PjT() {
        int v;
        Cursor cursor0 = null;
        try {
            v = 0;
            cursor0 = com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), this.Zh(), new String[]{"count(1)"}, null, null, null, null, null);
            if(cursor0 != null) {
                cursor0.moveToFirst();
                v = cursor0.getInt(0);
            }
        }
        catch(Exception unused_ex) {
            if(cursor0 != null) {
                goto label_13;
            }
            return 0;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        if(cursor0 != null) {
            try {
            label_13:
                cursor0.close();
                return v;
            }
            catch(Exception unused_ex) {
            }
        }
        return v;
    }

    public List PjT(int v, String s) {
        JQp jQp0;
        String s2;
        String[] arr_s;
        long v1 = com.bytedance.sdk.component.cz.PjT.Zh.PjT.PjT(v, this.JQp());
        this.Zh();
        if(v1 <= 0L) {
            v1 = 1L;
        }
        else if(v1 > 100L) {
            v1 = 100L;
        }
        String s1 = s + " DESC limit " + v1;
        List list0 = new ArrayList();
        this.PjT.clear();
        long v2 = Au.XX().ub();
        if(v2 > 0L) {
            arr_s = new String[]{String.valueOf(System.currentTimeMillis() - v2)};
            s2 = "gen_time>?";
        }
        else {
            s2 = null;
            arr_s = null;
        }
        Cursor cursor0 = !com.bytedance.sdk.component.cz.PjT.ReZ.PjT.cr() || this.cr() != 3 ? com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), this.Zh(), new String[]{"id", "value", "encrypt"}, s2, arr_s, null, null, s1) : com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), this.Zh(), new String[]{"id", "value", "encrypt", "channel"}, s2, arr_s, null, null, s1);
        if(cursor0 != null) {
            try {
                jQp0 = Au.XX().xE();
            label_20:
                while(!cursor0.moveToNext()) {
                    goto label_50;
                }
            }
            catch(Throwable throwable0) {
                try {
                    cursor0.close();
                    if(!this.PjT.isEmpty()) {
                        this.PjT(this.PjT);
                        this.PjT.clear();
                    }
                }
                catch(Exception unused_ex) {
                }
                throw throwable0;
            }
            try {
                String s3 = cursor0.getString(cursor0.getColumnIndex("id"));
                String s4 = cursor0.getString(cursor0.getColumnIndex("value"));
                int v3 = cursor0.getInt(cursor0.getColumnIndex("encrypt"));
                int v4 = !com.bytedance.sdk.component.cz.PjT.ReZ.PjT.cr() || this.cr() != 3 ? 0 : cursor0.getInt(cursor0.getColumnIndex("channel"));
                if(v3 == 1) {
                    s4 = jQp0.PjT(s4);
                }
                if(TextUtils.isEmpty(s4)) {
                    this.PjT.add(s3);
                    goto label_20;
                }
                if(list0.size() > 100) {
                    goto label_50;
                }
                JSONObject jSONObject0 = new JSONObject(s4);
                com.bytedance.sdk.component.cz.PjT.cr.PjT.PjT pjT0 = new com.bytedance.sdk.component.cz.PjT.cr.PjT.PjT(s3, jSONObject0);
                pjT0.PjT(this.cr());
                pjT0.Zh(this.ReZ());
                if(com.bytedance.sdk.component.cz.PjT.ReZ.PjT.cr() && this.cr() == 3) {
                    pjT0.PjT(v4);
                }
                com.bytedance.sdk.component.cz.PjT.ReZ.PjT.PjT(jSONObject0, pjT0);
                list0.add(pjT0);
            }
            catch(Throwable unused_ex) {
            }
            goto label_20;
            try {
            label_50:
                cursor0.close();
                if(!this.PjT.isEmpty()) {
                    this.PjT(this.PjT);
                    this.PjT.clear();
                }
            }
            catch(Exception unused_ex) {
            }
        }
        this.Zh();
        return list0;
    }

    public List PjT(String s) {
        com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT pjT0 = this.cr;
        return pjT0 == null ? new ArrayList() : this.PjT(pjT0.Zh(), s);
    }

    public void PjT(int v, long v1) {
        this.Zh(v, v1);
    }

    protected void PjT(List list0) {
        this.Zh();
        list0.size();
        com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), "DELETE FROM " + this.Zh() + " WHERE " + PjT.PjT("id", list0, 1000, true));
        Zh.PjT(cr.cr.zZ(), list0.size());
        this.ReZ(list0);
    }

    public boolean PjT(int v) {
        if(this.cr == null) {
            return false;
        }
        int v1 = this.PjT();
        int v2 = this.cr.PjT();
        this.Zh();
        return !com.bytedance.sdk.component.cz.PjT.ReZ.PjT.ReZ() || v != 1 && v != 2 ? v1 >= v2 : v1 > 0;
    }

    public byte ReZ() {
        return 2;
    }

    public static String Zh(String s) {
        return "CREATE TABLE IF NOT EXISTS " + s + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    private void Zh(int v, long v1) {
        if(v1 <= 0L && v <= 0) {
            return;
        }
        com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), this.Zh(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - v1), String.valueOf(v)});
        this.Zh();
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT.ReZ
    public String Zh() {
        com.bytedance.sdk.component.cz.PjT.PjT.JQp jQp0 = Au.XX().cr();
        return jQp0 == null ? null : jQp0.Zh();
    }

    public void Zh(List list0) {
        if(list0 != null && list0.size() != 0) {
            LinkedList linkedList0 = new LinkedList();
            for(Object object0: list0) {
                linkedList0.add(((com.bytedance.sdk.component.cz.PjT.cr.PjT)object0).ReZ());
                com.bytedance.sdk.component.cz.PjT.ReZ.PjT.DWo(((com.bytedance.sdk.component.cz.PjT.cr.PjT)object0));
            }
            this.Zh();
            com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), "DELETE FROM " + this.Zh() + " WHERE " + PjT.PjT("id", linkedList0, 1000, true));
            this.ReZ(linkedList0);
        }
    }

    public byte cr() {
        return 0;
    }
}

