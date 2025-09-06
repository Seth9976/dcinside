package com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.ReZ.Zh;
import com.bytedance.sdk.component.cz.PjT.Zh.cr;
import com.bytedance.sdk.component.cz.PjT.cr.Zh.PjT;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public class XX extends ReZ {
    protected List PjT;
    private PjT ReZ;

    public XX(Context context0, PjT pjT0) {
        super(context0);
        this.PjT = new ArrayList();
        this.ReZ = pjT0;
        if(pjT0 == null) {
            this.ReZ = PjT.ReZ();
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
            String s1 = XX.PjT(TextUtils.join("\',\'", list0.subList(v3 * v1, Math.min(v3 * v1 + v1, v2))), "");
            if(v3 != 0) {
                stringBuilder0.append((z ? " OR " : " AND "));
            }
            stringBuilder0.append(s);
            stringBuilder0.append((z ? " IN " : " NOT IN "));
            stringBuilder0.append("(\'");
            stringBuilder0.append(s1);
            stringBuilder0.append("\')");
        }
        return XX.PjT(stringBuilder0.toString(), s + (z ? " IN " : " NOT IN ") + "(\'\')");
    }

    public byte PjT() {
        return 1;
    }

    public List PjT(int v, String s) {
        long v1 = com.bytedance.sdk.component.cz.PjT.Zh.PjT.PjT(v, this.JQp());
        if(v1 <= 0L) {
            v1 = 1L;
        }
        else if(v1 > 100L) {
            v1 = 100L;
        }
        List list0 = new ArrayList();
        this.PjT.clear();
        Cursor cursor0 = com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), this.Zh(), new String[]{"id", "value", "encrypt"}, null, null, null, null, s + " DESC limit " + v1);
        if(cursor0 != null) {
            while(true) {
                try {
                label_10:
                    if(!cursor0.moveToNext()) {
                        break;
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
                    String s1 = cursor0.getString(cursor0.getColumnIndex("id"));
                    String s2 = cursor0.getString(cursor0.getColumnIndex("value"));
                    if(cursor0.getInt(cursor0.getColumnIndex("encrypt")) == 1) {
                        s2 = Au.XX().xE().PjT(s2);
                    }
                    if(TextUtils.isEmpty(s2)) {
                        this.PjT.add(s1);
                        goto label_10;
                    }
                    if(list0.size() > 100) {
                        break;
                    }
                    com.bytedance.sdk.component.cz.PjT.cr.PjT.PjT pjT0 = new com.bytedance.sdk.component.cz.PjT.cr.PjT.PjT(s1, new JSONObject(s2));
                    pjT0.Zh(this.ReZ());
                    pjT0.PjT(this.PjT());
                    list0.add(pjT0);
                }
                catch(Throwable unused_ex) {
                }
            }
            try {
                cursor0.close();
                if(!this.PjT.isEmpty()) {
                    this.PjT(this.PjT);
                    this.PjT.clear();
                    return list0;
                }
                return list0;
            }
            catch(Exception unused_ex) {
            }
        }
        return list0;
    }

    public void PjT(int v, long v1) {
        this.Zh(v, v1);
    }

    protected void PjT(List list0) {
        this.Zh();
        list0.size();
        com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), "DELETE FROM " + this.Zh() + " WHERE " + XX.PjT("id", list0, 1000, true));
        Zh.PjT(cr.cr.zZ(), list0.size());
        this.ReZ(list0);
    }

    public boolean PjT(int v) {
        return this.ReZ == null ? false : this.cr() >= this.ReZ.PjT();
    }

    public static String ReZ(String s) {
        return "CREATE TABLE IF NOT EXISTS " + s + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public byte ReZ() {
        return 2;
    }

    private void Zh(int v, long v1) {
        com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), this.Zh(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - v1), String.valueOf(v)});
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT.ReZ
    public String Zh() {
        return Au.XX().cr().cr();
    }

    public List Zh(String s) {
        PjT pjT0 = this.ReZ;
        return pjT0 == null ? new ArrayList() : this.PjT(pjT0.Zh(), s);
    }

    public void Zh(List list0) {
        if(list0 != null && list0.size() != 0) {
            LinkedList linkedList0 = new LinkedList();
            for(Object object0: list0) {
                linkedList0.add(((com.bytedance.sdk.component.cz.PjT.cr.PjT)object0).ReZ());
                com.bytedance.sdk.component.cz.PjT.ReZ.PjT.DWo(((com.bytedance.sdk.component.cz.PjT.cr.PjT)object0));
            }
            this.Zh();
            com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), "DELETE FROM " + this.Zh() + " WHERE " + XX.PjT("id", linkedList0, 1000, true));
            this.ReZ(linkedList0);
        }
    }

    public int cr() {
        Cursor cursor0;
        int v = 0;
        try {
            cursor0 = null;
            cursor0 = com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), this.Zh(), new String[]{"count(1)"}, null, null, null, null, null);
            if(cursor0 != null) {
                cursor0.moveToFirst();
                v = cursor0.getInt(0);
            }
        }
        catch(Throwable unused_ex) {
            if(cursor0 != null) {
                goto label_10;
            }
            return 0;
        }
        if(cursor0 != null) {
            try {
            label_10:
                cursor0.close();
                return v;
            }
            catch(Exception unused_ex) {
            }
        }
        return v;
    }
}

