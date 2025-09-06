package com.bytedance.sdk.component.cz.PjT.cz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ;
import java.util.LinkedList;
import java.util.List;
import jeb.synthetic.TWR;

public class cz implements JQp {
    private Context PjT;

    public cz(Context context0) {
        this.PjT = context0;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz.JQp
    public cr PjT(String s) {
        cr cr0;
        Cursor cursor0 = ReZ.PjT(this.PjT, "trackurl", null, "id=?", new String[]{s}, null, null, null);
        if(cursor0 != null && cursor0.moveToFirst()) {
            try {
                String s1 = cursor0.getString(cursor0.getColumnIndex("id"));
                String s2 = cursor0.getString(cursor0.getColumnIndex("url"));
                boolean z = cursor0.getInt(cursor0.getColumnIndex("replaceholder")) > 0;
                int v = cursor0.getInt(cursor0.getColumnIndex("retry"));
                int v1 = cursor0.getInt(cursor0.getColumnIndex("url_type"));
                String s3 = cursor0.getString(cursor0.getColumnIndex("ad_id"));
                String s4 = cursor0.getString(cursor0.getColumnIndex("error_code"));
                String s5 = cursor0.getString(cursor0.getColumnIndex("error_msg"));
                cr0 = new cr(s1, s2, z, v1, s3);
                cr0.PjT(v);
                if(!TextUtils.isEmpty(s4)) {
                    cr0.PjT(s4);
                }
                if(!TextUtils.isEmpty(s5)) {
                    cr0.Zh(s5);
                }
            }
            catch(Throwable unused_ex) {
                cursor0.close();
                cursor0 = null;
                goto label_22;
            }
            cursor0.close();
            return cr0;
        }
    label_22:
        if(cursor0 != null) {
            cursor0.close();
        }
        return null;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz.JQp
    public List PjT() {
        List list0 = new LinkedList();
        Cursor cursor0 = ReZ.PjT(this.PjT, "trackurl", null, null, null, null, null, null);
        if(cursor0 != null) {
            while(true) {
                try {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    String s = cursor0.getString(cursor0.getColumnIndex("id"));
                    String s1 = cursor0.getString(cursor0.getColumnIndex("url"));
                    boolean z = cursor0.getInt(cursor0.getColumnIndex("replaceholder")) > 0;
                    int v = cursor0.getInt(cursor0.getColumnIndex("retry"));
                    int v1 = cursor0.getInt(cursor0.getColumnIndex("url_type"));
                    String s2 = cursor0.getString(cursor0.getColumnIndex("ad_id"));
                    String s3 = cursor0.getString(cursor0.getColumnIndex("error_code"));
                    String s4 = cursor0.getString(cursor0.getColumnIndex("error_msg"));
                    cr cr0 = new cr(s, s1, z, v1, s2);
                    cr0.PjT(v);
                    if(!TextUtils.isEmpty(s3)) {
                        cr0.PjT(s3);
                    }
                    if(!TextUtils.isEmpty(s4)) {
                        cr0.Zh(s4);
                    }
                    list0.add(cr0);
                }
                catch(Throwable unused_ex) {
                    try {
                        cursor0.close();
                        return list0;
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(cursor0, throwable0);
                        throw throwable0;
                    }
                }
            }
            cursor0.close();
            return list0;
        }
        return list0;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz.JQp
    public void PjT(cr cr0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("id", cr0.PjT());
        contentValues0.put("url", cr0.Zh());
        contentValues0.put("replaceholder", ((int)cr0.ReZ()));
        contentValues0.put("retry", cr0.cr());
        contentValues0.put("url_type", cr0.JQp());
        contentValues0.put("ad_id", cr0.cz());
        contentValues0.put("error_code", cr0.XX());
        contentValues0.put("error_msg", cr0.SM());
        ReZ.PjT(this.PjT, "trackurl", contentValues0);
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz.JQp
    public void ReZ(cr cr0) {
        ReZ.PjT(this.PjT, "trackurl", "id=?", new String[]{cr0.PjT()});
    }

    public static String Zh() [...] // Inlined contents

    @Override  // com.bytedance.sdk.component.cz.PjT.cz.JQp
    public void Zh(cr cr0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("id", cr0.PjT());
        contentValues0.put("url", cr0.Zh());
        contentValues0.put("replaceholder", ((int)cr0.ReZ()));
        contentValues0.put("retry", cr0.cr());
        contentValues0.put("error_code", cr0.XX());
        contentValues0.put("error_msg", cr0.SM());
        contentValues0.put("url_type", cr0.JQp());
        contentValues0.put("ad_id", cr0.cz());
        ReZ.PjT(this.PjT, "trackurl", contentValues0, "id=?", new String[]{cr0.PjT()});
    }
}

