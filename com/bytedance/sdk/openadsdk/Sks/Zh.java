package com.bytedance.sdk.openadsdk.Sks;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

public class Zh {
    private SharedPreferences PjT;
    private final String ReZ;
    private final Context Zh;

    public Zh(Context context0, String s) {
        this.Zh = context0;
        this.ReZ = s;
    }

    public int PjT(String s, int v) {
        try {
            SharedPreferences sharedPreferences0 = this.Zh();
            return sharedPreferences0 == null || !sharedPreferences0.contains(s) ? v : sharedPreferences0.getInt(s, v);
        }
        catch(Throwable throwable0) {
            Log.i("SPUnit", this.ReZ + throwable0.getMessage());
            return v;
        }
    }

    public String PjT(String s, String s1) {
        try {
            SharedPreferences sharedPreferences0 = this.Zh();
            return sharedPreferences0 == null || !sharedPreferences0.contains(s) ? s1 : sharedPreferences0.getString(s, s1);
        }
        catch(Throwable throwable0) {
            Log.i("SPUnit", this.ReZ + throwable0.getMessage());
            return s1;
        }
    }

    public void PjT() {
        SharedPreferences sharedPreferences0 = this.Zh();
        if(sharedPreferences0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.clear();
            sharedPreferences$Editor0.commit();
        }
    }

    public void PjT(String s, long v) {
        try {
            SharedPreferences sharedPreferences0 = this.Zh();
            if(sharedPreferences0 != null) {
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                sharedPreferences$Editor0.putLong(s, v);
                sharedPreferences$Editor0.apply();
            }
        }
        catch(Throwable throwable0) {
            Log.e("SPUnit", throwable0.getMessage());
        }
    }

    public void PjT(JSONObject jSONObject0) {
        String s;
        SharedPreferences.Editor sharedPreferences$Editor0;
        try {
            SharedPreferences sharedPreferences0 = this.Zh();
            if(sharedPreferences0 == null) {
                return;
            }
            sharedPreferences$Editor0 = sharedPreferences0.edit();
            Iterator iterator0 = jSONObject0.keys();
            while(true) {
            label_4:
                if(!iterator0.hasNext()) {
                    sharedPreferences$Editor0.apply();
                    return;
                }
                Object object0 = iterator0.next();
                s = (String)object0;
                break;
            }
        }
        catch(Throwable throwable0) {
            Log.e("SPUnit", throwable0.getMessage());
            return;
        }
        try {
            if(TextUtils.isEmpty(s)) {
                goto label_4;
            }
            Object object1 = jSONObject0.get(s);
            if(!(object1 instanceof Integer)) {
                if(object1 instanceof Long) {
                    sharedPreferences$Editor0.putLong(s, ((long)(((Long)object1))));
                }
                else if(object1 instanceof String) {
                    sharedPreferences$Editor0.putString(s, ((String)object1));
                }
                else if(object1 instanceof Boolean) {
                    sharedPreferences$Editor0.putBoolean(s, ((Boolean)object1).booleanValue());
                }
                else if(object1 instanceof Float) {
                    sharedPreferences$Editor0.putFloat(s, ((float)(((Float)object1))));
                }
                else {
                    if(!(object1 instanceof Double)) {
                        goto label_4;
                    }
                    ((Double)object1).doubleValue();
                    sharedPreferences$Editor0.putFloat(s, ((Double)object1).floatValue());
                }
                goto label_4;
            }
            sharedPreferences$Editor0.putInt(s, ((int)(((Integer)object1))));
            goto label_4;
        }
        catch(Throwable throwable1) {
        }
        try {
            Log.e("SPUnit", throwable1.getMessage());
            goto label_4;
        }
        catch(Throwable throwable0) {
        }
        Log.e("SPUnit", throwable0.getMessage());
    }

    public boolean PjT(String s, boolean z) {
        try {
            SharedPreferences sharedPreferences0 = this.Zh();
            return sharedPreferences0 == null || !sharedPreferences0.contains(s) ? z : sharedPreferences0.getBoolean(s, z);
        }
        catch(Throwable throwable0) {
            Log.i("SPUnit", this.ReZ + throwable0.getMessage());
            return z;
        }
    }

    private SharedPreferences Zh() {
        SharedPreferences sharedPreferences0 = this.PjT;
        if(sharedPreferences0 != null) {
            return sharedPreferences0;
        }
        if(!TextUtils.isEmpty(this.ReZ)) {
            Context context0 = this.Zh;
            if(context0 != null) {
                try {
                    this.PjT = context0.getSharedPreferences(this.ReZ, 0);
                }
                catch(Throwable throwable0) {
                    Log.e("SPUnit", throwable0.getMessage());
                }
                return this.PjT;
            }
        }
        return null;
    }

    public long Zh(String s, long v) {
        try {
            SharedPreferences sharedPreferences0 = this.Zh();
            return sharedPreferences0 == null || !sharedPreferences0.contains(s) ? v : sharedPreferences0.getLong(s, v);
        }
        catch(Throwable throwable0) {
            Log.i("SPUnit", this.ReZ + throwable0.getMessage());
            return v;
        }
    }
}

