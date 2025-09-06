package com.bytedance.adsdk.ugeno.XX;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public class JQp {
    private static Field PjT;
    private static boolean Zh;

    public static Drawable PjT(CompoundButton compoundButton0) {
        if(Build.VERSION.SDK_INT >= 23) {
            return compoundButton0.getButtonDrawable();
        }
        if(!JQp.Zh) {
            try {
                Field field0 = CompoundButton.class.getDeclaredField("mButtonDrawable");
                JQp.PjT = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", noSuchFieldException0);
            }
            JQp.Zh = true;
        }
        Field field1 = JQp.PjT;
        if(field1 != null) {
            try {
                return (Drawable)field1.get(compoundButton0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", illegalAccessException0);
                JQp.PjT = null;
            }
        }
        return null;
    }
}

