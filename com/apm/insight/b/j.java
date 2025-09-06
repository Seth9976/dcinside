package com.apm.insight.b;

import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;
import jeb.synthetic.FIN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {
    private static MessageQueue a;
    private static Field b;
    private static Field c;

    static {
    }

    private static Message a(Message message0) {
        Field field0 = j.c;
        if(field0 == null) {
            try {
                Field field1 = Message.class.getDeclaredField("next");
                j.c = field1;
                field1.setAccessible(true);
                return (Message)j.c.get(message0);
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
        try {
            return (Message)field0.get(message0);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static Message a(MessageQueue messageQueue0) {
        Field field0 = j.b;
        if(field0 == null) {
            try {
                Field field1 = MessageQueue.class.getDeclaredField("mMessages");
                j.b = field1;
                field1.setAccessible(true);
                return (Message)j.b.get(messageQueue0);
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
        try {
            return (Message)field0.get(messageQueue0);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static MessageQueue a() {
        if(j.a == null && Looper.getMainLooper() != null) {
            Looper looper0 = Looper.getMainLooper();
            if(looper0 == Looper.myLooper()) {
                j.a = Looper.myQueue();
                return j.a;
            }
            if(Build.VERSION.SDK_INT >= 23) {
                j.a = looper0.getQueue();
                return j.a;
            }
            try {
                Field field0 = looper0.getClass().getDeclaredField("mQueue");
                field0.setAccessible(true);
                j.a = (MessageQueue)field0.get(looper0);
                return j.a;
            }
            catch(Throwable throwable0) {
                throwable0.printStackTrace();
            }
        }
        return j.a;
    }

    public static JSONArray a(long v) {
        MessageQueue messageQueue0 = j.a();
        JSONArray jSONArray0 = new JSONArray();
        if(messageQueue0 == null) {
            return jSONArray0;
        }
        try {
            __monitor_enter(messageQueue0);
            int v1 = FIN.finallyOpen$NT();
            Message message0 = j.a(messageQueue0);
            if(message0 == null) {
                FIN.finallyCodeBegin$NT(v1);
                __monitor_exit(messageQueue0);
                FIN.finallyCodeEnd$NT(v1);
                return jSONArray0;
            }
            int v2 = 0;
            int v3 = 0;
            while(true) {
                if(message0 == null || v2 >= 100) {
                    FIN.finallyExec$NT(v1);
                    return jSONArray0;
                }
                ++v2;
                ++v3;
                JSONObject jSONObject0 = j.a(message0, v);
                try {
                    jSONObject0.put("id", v3);
                }
                catch(JSONException unused_ex) {
                }
                jSONArray0.put(jSONObject0);
                message0 = j.a(message0);
            }
        }
        catch(Throwable throwable0) {
            com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            return jSONArray0;
        }
    }

    private static JSONObject a(Message message0, long v) {
        JSONObject jSONObject0 = new JSONObject();
        if(message0 == null) {
            return jSONObject0;
        }
        try {
            jSONObject0.put("when", message0.getWhen() - v);
            if(message0.getCallback() != null) {
                jSONObject0.put("callback", String.valueOf(message0.getCallback()));
            }
            jSONObject0.put("what", message0.what);
            if(message0.getTarget() == null) {
                jSONObject0.put("barrier", message0.arg1);
            }
            else {
                jSONObject0.put("target", String.valueOf(message0.getTarget()));
            }
            jSONObject0.put("arg1", message0.arg1);
            jSONObject0.put("arg2", message0.arg2);
            Object object0 = message0.obj;
            if(object0 != null) {
                jSONObject0.put("obj", object0);
                return jSONObject0;
            }
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        return jSONObject0;
    }
}

