package com.unity3d.services.core.preferences;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;

public class AndroidPreferences {
    public static Boolean getBoolean(String s, String s1) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null && sharedPreferences0.contains(s1)) {
            try {
                return Boolean.valueOf(sharedPreferences0.getBoolean(s1, false));
            }
            catch(ClassCastException classCastException0) {
                DeviceLog.warning(("Unity Ads failed to cast " + s1 + ": " + classCastException0.getMessage()));
            }
        }
        return null;
    }

    public static Float getFloat(String s, String s1) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null && sharedPreferences0.contains(s1)) {
            try {
                return sharedPreferences0.getFloat(s1, NaNf);
            }
            catch(ClassCastException classCastException0) {
                DeviceLog.warning(("Unity Ads failed to cast " + s1 + ": " + classCastException0.getMessage()));
            }
        }
        return null;
    }

    public static Integer getInteger(String s, String s1) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null && sharedPreferences0.contains(s1)) {
            try {
                return sharedPreferences0.getInt(s1, -1);
            }
            catch(ClassCastException classCastException0) {
                DeviceLog.warning(("Unity Ads failed to cast " + s1 + ": " + classCastException0.getMessage()));
            }
        }
        return null;
    }

    public static Long getLong(String s, String s1) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null && sharedPreferences0.contains(s1)) {
            try {
                return sharedPreferences0.getLong(s1, -1L);
            }
            catch(ClassCastException classCastException0) {
                DeviceLog.warning(("Unity Ads failed to cast " + s1 + ": " + classCastException0.getMessage()));
            }
        }
        return null;
    }

    public static String getString(String s, String s1) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null && sharedPreferences0.contains(s1)) {
            try {
                return sharedPreferences0.getString(s1, "");
            }
            catch(ClassCastException classCastException0) {
                DeviceLog.warning(("Unity Ads failed to cast " + s1 + ": " + classCastException0.getMessage()));
            }
        }
        return null;
    }

    public static boolean hasKey(String s, String s1) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        return sharedPreferences0 != null && sharedPreferences0.contains(s1);
    }

    public static void removeKey(String s, String s1) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.remove(s1);
            sharedPreferences$Editor0.commit();
        }
    }

    public static void setBoolean(String s, String s1, Boolean boolean0) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.putBoolean(s1, boolean0.booleanValue());
            sharedPreferences$Editor0.commit();
        }
    }

    public static void setFloat(String s, String s1, Double double0) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.putFloat(s1, double0.floatValue());
            sharedPreferences$Editor0.commit();
        }
    }

    public static void setInteger(String s, String s1, Integer integer0) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.putInt(s1, ((int)integer0));
            sharedPreferences$Editor0.commit();
        }
    }

    public static void setLong(String s, String s1, Long long0) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.putLong(s1, ((long)long0));
            sharedPreferences$Editor0.commit();
        }
    }

    public static void setString(String s, String s1, String s2) {
        SharedPreferences sharedPreferences0 = ClientProperties.getApplicationContext().getSharedPreferences(s, 0);
        if(sharedPreferences0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.putString(s1, s2);
            sharedPreferences$Editor0.commit();
        }
    }
}

