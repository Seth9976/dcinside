package com.bytedance.sdk.openadsdk.Owx;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class cz {
    interface PjT {
        JSONObject PjT(JSONObject arg1) throws Throwable;
    }

    private SensorEventListener JQp;
    private Context PjT;
    private Map ReZ;
    private SensorEventListener XX;
    private WeakReference Zh;
    private SensorEventListener cr;
    private SensorEventListener cz;

    public cz(Au au0) {
        this.ReZ = new HashMap();
        this.cr = new SensorEventListener() {
            final cz PjT;

            @Override  // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor0, int v) {
            }

            @Override  // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent0) {
                if(sensorEvent0.sensor.getType() == 1) {
                    Au au0 = cz.this.cr();
                    if(au0 == null) {
                        return;
                    }
                    float[] arr_f = sensorEvent0.values;
                    float f = arr_f[0];
                    float f1 = arr_f[1];
                    float f2 = arr_f[2];
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("x", ((double)f));
                        jSONObject0.put("y", ((double)f1));
                        jSONObject0.put("z", ((double)f2));
                        au0.PjT("accelerometer_callback", jSONObject0);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        };
        this.JQp = new SensorEventListener() {
            final cz PjT;

            @Override  // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor0, int v) {
            }

            @Override  // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent0) {
                if(sensorEvent0.sensor.getType() == 4) {
                    Au au0 = cz.this.cr();
                    if(au0 == null) {
                        return;
                    }
                    float f = (float)Math.toDegrees(sensorEvent0.values[0]);
                    float f1 = (float)Math.toDegrees(sensorEvent0.values[1]);
                    float f2 = (float)Math.toDegrees(sensorEvent0.values[2]);
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("x", ((double)f));
                        jSONObject0.put("y", ((double)f1));
                        jSONObject0.put("z", ((double)f2));
                        au0.PjT("gyro_callback", jSONObject0);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        };
        this.cz = new SensorEventListener() {
            final cz PjT;

            @Override  // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor0, int v) {
            }

            @Override  // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent0) {
                if(sensorEvent0.sensor.getType() == 10) {
                    Au au0 = cz.this.cr();
                    if(au0 == null) {
                        return;
                    }
                    float[] arr_f = sensorEvent0.values;
                    float f = arr_f[0];
                    float f1 = arr_f[1];
                    float f2 = arr_f[2];
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("x", ((double)f));
                        jSONObject0.put("y", ((double)f1));
                        jSONObject0.put("z", ((double)f2));
                        au0.PjT("accelerometer_grativityless_callback", jSONObject0);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        };
        this.XX = new SensorEventListener() {
            final cz PjT;

            @Override  // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor0, int v) {
            }

            @Override  // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent0) {
                switch(sensorEvent0.sensor.getType()) {
                    case 1: {
                        System.arraycopy(sensorEvent0.values, 0, DWo.Zh, 0, DWo.Zh.length);
                        break;
                    }
                    case 2: {
                        System.arraycopy(sensorEvent0.values, 0, DWo.ReZ, 0, DWo.ReZ.length);
                    }
                }
                SensorManager.getRotationMatrix(DWo.cr, null, DWo.Zh, DWo.ReZ);
                float[] arr_f = DWo.JQp;
                SensorManager.getOrientation(DWo.cr, arr_f);
                Au au0 = cz.this.cr();
                if(au0 == null) {
                    return;
                }
                float f = arr_f[0];
                float f1 = arr_f[1];
                float f2 = arr_f[2];
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("alpha", ((double)f));
                    jSONObject0.put("beta", ((double)f1));
                    jSONObject0.put("gamma", ((double)f2));
                    au0.PjT("rotation_vector_callback", jSONObject0);
                }
                catch(Throwable unused_ex) {
                }
            }
        };
        this.PjT = au0.PjT();
        this.Zh = new WeakReference(au0);
        this.ReZ();
    }

    private com.bytedance.sdk.openadsdk.Owx.PjT JQp() {
        Au au0 = this.cr();
        return au0 == null ? null : au0.ub();
    }

    public Set PjT() {
        return this.ReZ.keySet();
    }

    public JSONObject PjT(String s, JSONObject jSONObject0) {
        try {
            PjT cz$PjT0 = (PjT)this.ReZ.get(s);
            if(cz$PjT0 == null) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("code", -1);
                return jSONObject1;
            }
            return cz$PjT0.PjT(jSONObject0);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    private void ReZ() {
        this.ReZ.put("adInfo", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                if(au0 != null) {
                    JSONObject jSONObject1 = au0.ltE();
                    if(jSONObject1 != null) {
                        jSONObject1.put("code", 1);
                        return jSONObject1;
                    }
                    jSONObject1 = new JSONObject();
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.ReZ.put("appInfo", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("code", 1);
                jSONObject1.put("appName", "playable_sdk");
                jSONObject1.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: cz.this.PjT()) {
                    jSONArray0.put(((String)object0));
                }
                jSONObject1.put("supportList", jSONArray0);
                Au au0 = cz.this.cr();
                if(au0 != null) {
                    jSONObject1.put("deviceId", au0.XX());
                    jSONObject1.put("netType", au0.xE());
                    jSONObject1.put("innerAppName", au0.cr());
                    jSONObject1.put("appName", au0.JQp());
                    jSONObject1.put("appVersion", au0.cz());
                    Map map0 = au0.Zh();
                    for(Object object1: map0.keySet()) {
                        jSONObject1.put(((String)object1), map0.get(((String)object1)));
                    }
                }
                return jSONObject1;
            }
        });
        this.ReZ.put("playableSDKInfo", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("code", 1);
                jSONObject1.put("appName", "playable_sdk");
                jSONObject1.put("playableSdkEdition", "6.6.0");
                jSONObject1.put("os", "android");
                return jSONObject1;
            }
        });
        this.ReZ.put("subscribe_app_ad", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                com.bytedance.sdk.openadsdk.Owx.PjT pjT0 = cz.this.JQp();
                JSONObject jSONObject1 = new JSONObject();
                if(pjT0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("download_app_ad", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                com.bytedance.sdk.openadsdk.Owx.PjT pjT0 = cz.this.JQp();
                JSONObject jSONObject1 = new JSONObject();
                if(pjT0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("isViewable", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                if(au0 == null) {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("viewStatus", au0.SM());
                return jSONObject2;
            }
        });
        this.ReZ.put("getVolume", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                if(au0 == null) {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("endcard_mute", au0.Au());
                return jSONObject2;
            }
        });
        this.ReZ.put("getScreenSize", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                if(au0 == null) {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = au0.gK();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ReZ.put("start_accelerometer_observer", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                int v = 2;
                try {
                    if(jSONObject0 != null) {
                        v = jSONObject0.optInt("interval_android", 2);
                    }
                    DWo.PjT(cz.this.PjT, cz.this.cr, v);
                    jSONObject1.put("code", 1);
                    return jSONObject1;
                }
                catch(Throwable throwable0) {
                }
                jSONObject1.put("code", -1);
                jSONObject1.put("codeMsg", throwable0.toString());
                return jSONObject1;
            }
        });
        this.ReZ.put("close_accelerometer_observer", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.put("code", 1);
                }
                catch(Throwable throwable0) {
                    jSONObject1.put("code", -1);
                    jSONObject1.put("codeMsg", throwable0.toString());
                }
                return jSONObject1;
            }
        });
        this.ReZ.put("start_gyro_observer", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                int v = 2;
                try {
                    if(jSONObject0 != null) {
                        v = jSONObject0.optInt("interval_android", 2);
                    }
                    DWo.Zh(cz.this.PjT, cz.this.JQp, v);
                    jSONObject1.put("code", 1);
                    return jSONObject1;
                }
                catch(Throwable throwable0) {
                }
                jSONObject1.put("code", -1);
                jSONObject1.put("codeMsg", throwable0.toString());
                return jSONObject1;
            }
        });
        this.ReZ.put("close_gyro_observer", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.put("code", 1);
                }
                catch(Throwable throwable0) {
                    jSONObject1.put("code", -1);
                    jSONObject1.put("codeMsg", throwable0.toString());
                }
                return jSONObject1;
            }
        });
        this.ReZ.put("start_accelerometer_grativityless_observer", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                int v = 2;
                try {
                    if(jSONObject0 != null) {
                        v = jSONObject0.optInt("interval_android", 2);
                    }
                    DWo.ReZ(cz.this.PjT, cz.this.cz, v);
                    jSONObject1.put("code", 1);
                    return jSONObject1;
                }
                catch(Throwable throwable0) {
                }
                jSONObject1.put("code", -1);
                jSONObject1.put("codeMsg", throwable0.toString());
                return jSONObject1;
            }
        });
        this.ReZ.put("close_accelerometer_grativityless_observer", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.put("code", 1);
                }
                catch(Throwable throwable0) {
                    jSONObject1.put("code", -1);
                    jSONObject1.put("codeMsg", throwable0.toString());
                }
                return jSONObject1;
            }
        });
        this.ReZ.put("start_rotation_vector_observer", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                int v = 2;
                try {
                    if(jSONObject0 != null) {
                        v = jSONObject0.optInt("interval_android", 2);
                    }
                    DWo.cr(cz.this.PjT, cz.this.XX, v);
                    jSONObject1.put("code", 1);
                    return jSONObject1;
                }
                catch(Throwable throwable0) {
                }
                jSONObject1.put("code", -1);
                jSONObject1.put("codeMsg", throwable0.toString());
                return jSONObject1;
            }
        });
        this.ReZ.put("close_rotation_vector_observer", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.put("code", 1);
                }
                catch(Throwable throwable0) {
                    jSONObject1.put("code", -1);
                    jSONObject1.put("codeMsg", throwable0.toString());
                }
                return jSONObject1;
            }
        });
        this.ReZ.put("device_shake", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                try {
                    DWo.PjT(cz.this.PjT, 300L);
                    jSONObject1.put("code", 1);
                }
                catch(Throwable throwable0) {
                    jSONObject1.put("code", -1);
                    jSONObject1.put("codeMsg", throwable0.toString());
                }
                return jSONObject1;
            }
        });
        this.ReZ.put("device_shake_short", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                JSONObject jSONObject1 = new JSONObject();
                try {
                    DWo.PjT(cz.this.PjT, 150L);
                    jSONObject1.put("code", 1);
                }
                catch(Throwable throwable0) {
                    jSONObject1.put("code", -1);
                    jSONObject1.put("codeMsg", throwable0.toString());
                }
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_style", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 != null) {
                    JSONObject jSONObject2 = au0.ReZ();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject1.put("code", -1);
                return jSONObject1;
            }
        });
        this.ReZ.put("sendReward", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 != null) {
                    au0.RD();
                    jSONObject1.put("code", 1);
                    return jSONObject1;
                }
                jSONObject1.put("code", -1);
                return jSONObject1;
            }
        });
        this.ReZ.put("webview_time_track", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                return new JSONObject();
            }
        });
        this.ReZ.put("playable_event", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 != null && jSONObject0 != null) {
                    au0.Zh(jSONObject0.optString("event", null), jSONObject0.optJSONObject("params"));
                    jSONObject1.put("code", 1);
                    return jSONObject1;
                }
                jSONObject1.put("code", -1);
                return jSONObject1;
            }
        });
        this.ReZ.put("reportAd", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("close", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("openAdLandPageLinks", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("get_viewport", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = au0.Owx();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ReZ.put("jssdk_load_finish", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.Qf();
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_material_render_result", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.SM(jSONObject0);
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("detect_change_playable_click", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = au0.DWo();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ReZ.put("check_camera_permission", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = au0.xs();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ReZ.put("check_external_storage", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = au0.fDm();
                if(jSONObject2.isNull("result")) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ReZ.put("playable_open_camera", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_pick_photo", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_download_media_in_photos", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.PjT(jSONObject0);
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_preventTouchEvent", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.Zh(jSONObject0);
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_settings_info", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = au0.qla();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ReZ.put("playable_load_main_scene", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.Sks();
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_enter_section", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.cr(jSONObject0);
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_end", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.tT();
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_finish_play_playable", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.Lrd();
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_transfrom_module_show", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_transfrom_module_change_color", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_set_scroll_rect", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_click_area", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.JQp(jSONObject0);
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_real_play_start", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_material_first_frame_show", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.iZZ();
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_stuck_check_pong", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.Yo();
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_material_adnormal_mask", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                au0.cz(jSONObject0);
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_long_press_panel", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_alpha_player_play", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_transfrom_module_highlight", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_send_click_event", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_query_media_permission_declare", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = au0.XX(jSONObject0);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ReZ.put("playable_query_media_permission_enable", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                Au au0 = cz.this.cr();
                JSONObject jSONObject1 = new JSONObject();
                if(au0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                JSONObject jSONObject2 = au0.Au(jSONObject0);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ReZ.put("playable_apply_media_permission", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                com.bytedance.sdk.openadsdk.Owx.PjT pjT0 = cz.this.JQp();
                JSONObject jSONObject1 = new JSONObject();
                if(pjT0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_start_kws", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                com.bytedance.sdk.openadsdk.Owx.PjT pjT0 = cz.this.JQp();
                JSONObject jSONObject1 = new JSONObject();
                if(pjT0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_close_kws", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                com.bytedance.sdk.openadsdk.Owx.PjT pjT0 = cz.this.JQp();
                JSONObject jSONObject1 = new JSONObject();
                if(pjT0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_video_preload_task_add", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                com.bytedance.sdk.openadsdk.Owx.PjT pjT0 = cz.this.JQp();
                JSONObject jSONObject1 = new JSONObject();
                if(pjT0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
        this.ReZ.put("playable_video_preload_task_cancel", new PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.cz$PjT
            public JSONObject PjT(JSONObject jSONObject0) throws Throwable {
                com.bytedance.sdk.openadsdk.Owx.PjT pjT0 = cz.this.JQp();
                JSONObject jSONObject1 = new JSONObject();
                if(pjT0 == null) {
                    jSONObject1.put("code", -1);
                    return jSONObject1;
                }
                jSONObject1.put("code", 1);
                return jSONObject1;
            }
        });
    }

    public void Zh() {
    }

    private Au cr() {
        return this.Zh == null ? null : ((Au)this.Zh.get());
    }
}

