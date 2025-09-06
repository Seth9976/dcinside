package com.bytedance.sdk.component.PjT;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class Au {
    private xf PjT;

    private Au(xf xf0) {
        this.PjT = xf0;
    }

    static Au PjT(xf xf0) {
        return new Au(xf0);
    }

    private static void PjT(String s) {
        if(!s.startsWith("{") || !s.endsWith("}")) {
            SM.PjT(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n " + s));
        }
    }

    Object PjT(String s, Type type0) throws JSONException {
        Au.PjT(s);
        return !type0.equals(JSONObject.class) && (!(type0 instanceof Class) || !JSONObject.class.isAssignableFrom(((Class)type0))) ? this.PjT.PjT(s, type0) : new JSONObject(s);
    }

    String PjT(Object object0) {
        if(object0 == null) {
            return "{}";
        }
        String s = object0 instanceof JSONObject || object0 instanceof JSONArray ? object0.toString() : this.PjT.PjT(object0);
        Au.PjT(s);
        return s;
    }
}

