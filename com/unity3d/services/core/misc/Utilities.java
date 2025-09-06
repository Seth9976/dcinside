package com.unity3d.services.core.misc;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jeb.synthetic.TWR;
import org.json.JSONException;
import org.json.JSONObject;
import z3.b;

public class Utilities {
    public static String Sha256(InputStream inputStream0) throws IOException {
        byte[] arr_b;
        MessageDigest messageDigest0;
        if(inputStream0 == null) {
            return null;
        }
        try {
            messageDigest0 = MessageDigest.getInstance("SHA-256");
            arr_b = new byte[0x1000];
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            DeviceLog.exception("SHA-256 algorithm not found", noSuchAlgorithmException0);
            return null;
        }
        int v;
        while((v = inputStream0.read(arr_b)) != -1) {
            messageDigest0.update(arr_b, 0, v);
        }
        return Utilities.toHexString(messageDigest0.digest());
    }

    public static String Sha256(String s) {
        return Utilities.Sha256(s.getBytes());
    }

    public static String Sha256(byte[] arr_b) {
        MessageDigest messageDigest0;
        if(arr_b == null) {
            return null;
        }
        try {
            messageDigest0 = MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            DeviceLog.exception("SHA-256 algorithm not found", noSuchAlgorithmException0);
            return null;
        }
        messageDigest0.update(arr_b, 0, arr_b.length);
        return Utilities.toHexString(messageDigest0.digest());
    }

    public static Map combineJsonIntoMap(Map map0, JSONObject jSONObject0) {
        return Utilities.combineJsonIntoMap(map0, jSONObject0, "");
    }

    public static Map combineJsonIntoMap(Map map0, JSONObject jSONObject0, String s) {
        Map map1 = new HashMap(map0);
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            map1.put(s + ((String)object0), jSONObject0.opt(((String)object0)));
        }
        return map1;
    }

    public static Map convertJsonToMap(JSONObject jSONObject0) {
        return Utilities.combineJsonIntoMap(new HashMap(), jSONObject0);
    }

    public static Object getService(Class class0) {
        return Utilities.getService("", class0);
    }

    public static Object getService(String s, Class class0) {
        return ServiceProvider.INSTANCE.getRegistry().getService(s, b.i(class0));
    }

    public static JSONObject mergeJsonObjects(JSONObject jSONObject0, JSONObject jSONObject1) throws JSONException {
        if(jSONObject0 == null) {
            return jSONObject1;
        }
        if(jSONObject1 == null) {
            return jSONObject0;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator iterator0 = jSONObject1.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            jSONObject2.put(((String)object0), jSONObject1.get(((String)object0)));
        }
        Iterator iterator1 = jSONObject0.keys();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            String s = (String)object1;
            if(jSONObject2.has(s) && jSONObject2.get(s) instanceof JSONObject && jSONObject0.get(s) instanceof JSONObject) {
                jSONObject2.put(s, Utilities.mergeJsonObjects(jSONObject0.getJSONObject(s), jSONObject2.getJSONObject(s)));
            }
            else {
                jSONObject2.put(s, jSONObject0.get(s));
            }
        }
        return jSONObject2;
    }

    public static byte[] readFileBytes(File file0) throws IOException {
        byte[] arr_b;
        FileInputStream fileInputStream0;
        if(file0 != null && file0.exists()) {
            if(Build.VERSION.SDK_INT >= 26) {
                return Files.readAllBytes(file0.toPath());
            }
            try {
                fileInputStream0 = new FileInputStream(file0);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(null, throwable0);
                throw throwable0;
            }
            try {
                int v = (int)file0.length();
                arr_b = new byte[v];
                if(fileInputStream0.read(arr_b) != v) {
                    throw new IOException("Failed to read all bytes from input file path: " + file0.getPath());
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(fileInputStream0, throwable0);
                throw throwable0;
            }
            fileInputStream0.close();
            return arr_b;
        }
        return null;
    }

    public static void runOnUiThread(Runnable runnable0) {
        Utilities.runOnUiThread(runnable0, 0L);
    }

    public static void runOnUiThread(Runnable runnable0, long v) {
        Handler handler0 = new Handler(Looper.getMainLooper());
        if(v > 0L) {
            handler0.postDelayed(runnable0, v);
            return;
        }
        handler0.post(runnable0);
    }

    public static String toHexString(byte[] arr_b) {
        String s = "";
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v] & 0xFF;
            if(v1 <= 15) {
                s = s + "0";
            }
            s = s + Integer.toHexString(v1);
        }
        return s;
    }

    public static void wrapCustomerListener(Runnable runnable0) {
        try {
            runnable0.run();
        }
        catch(Exception exception0) {
            DeviceLog.error("An uncaught exception has occurred in the client application.  Exception: %s", new Object[]{exception0.getMessage()});
        }
    }

    public static boolean writeFile(File file0, String s) {
        FileOutputStream fileOutputStream0;
        boolean z = false;
        if(file0 == null) {
            return false;
        }
        try {
            try {
                fileOutputStream0 = null;
                fileOutputStream0 = new FileOutputStream(file0);
                fileOutputStream0.write(s.getBytes());
                fileOutputStream0.flush();
                goto label_23;
            }
            catch(Exception exception0) {
            }
            DeviceLog.exception("Could not write file", exception0);
            if(fileOutputStream0 != null) {
                goto label_11;
            }
            goto label_28;
        }
        catch(Throwable throwable0) {
            goto label_17;
        }
        try {
        label_11:
            fileOutputStream0.close();
        }
        catch(Exception exception1) {
            DeviceLog.exception("Error closing FileOutputStream", exception1);
        }
        goto label_28;
    label_17:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(Exception exception2) {
                DeviceLog.exception("Error closing FileOutputStream", exception2);
            }
        }
        throw throwable0;
        try {
        label_23:
            fileOutputStream0.close();
        }
        catch(Exception exception3) {
            DeviceLog.exception("Error closing FileOutputStream", exception3);
        }
        z = true;
    label_28:
        if(z) {
            DeviceLog.debug(("Wrote file: " + file0.getAbsolutePath()));
        }
        return z;
    }
}

