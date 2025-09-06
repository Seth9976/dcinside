package com.unity3d.services.core.sensorinfo;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import org.json.JSONException;
import org.json.JSONObject;

public class SensorInfoListener implements SensorEventListener {
    private static SensorInfoListener _accelerometerListener;
    private static Sensor _accelerometerSensor;
    private static SensorEvent _latestAccelerometerEvent;

    static {
    }

    public static JSONObject getAccelerometerData() {
        if(SensorInfoListener._latestAccelerometerEvent != null) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("x", ((double)SensorInfoListener._latestAccelerometerEvent.values[0]));
                jSONObject0.put("y", ((double)SensorInfoListener._latestAccelerometerEvent.values[1]));
                jSONObject0.put("z", ((double)SensorInfoListener._latestAccelerometerEvent.values[2]));
            }
            catch(JSONException jSONException0) {
                DeviceLog.exception("JSON error while constructing accelerometer data", jSONException0);
            }
            return jSONObject0;
        }
        return null;
    }

    public static boolean isAccelerometerListenerActive() [...] // 潜在的解密器

    @Override  // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor0, int v) {
    }

    @Override  // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent0) {
        if(sensorEvent0.sensor.getType() == 1) {
            SensorInfoListener._latestAccelerometerEvent = sensorEvent0;
        }
    }

    public static boolean startAccelerometerListener(int v) {
        if(SensorInfoListener._accelerometerListener == null) {
            SensorInfoListener._accelerometerListener = new SensorInfoListener();
        }
        SensorManager sensorManager0 = (SensorManager)ClientProperties.getApplicationContext().getSystemService("sensor");
        Sensor sensor0 = sensorManager0.getDefaultSensor(1);
        SensorInfoListener._accelerometerSensor = sensor0;
        return sensorManager0.registerListener(SensorInfoListener._accelerometerListener, sensor0, v);
    }

    public static void stopAccelerometerListener() {
        if(SensorInfoListener._accelerometerListener != null) {
            ((SensorManager)ClientProperties.getApplicationContext().getSystemService("sensor")).unregisterListener(SensorInfoListener._accelerometerListener);
            SensorInfoListener._accelerometerListener = null;
        }
    }
}

