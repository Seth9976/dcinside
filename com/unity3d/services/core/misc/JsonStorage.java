package com.unity3d.services.core.misc;

import android.text.TextUtils;
import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonStorage implements IJsonStorageReader {
    private JSONObject _data;

    public void clearData() {
        synchronized(this) {
            this._data = null;
        }
    }

    private void createObjectTree(String s) {
        synchronized(this) {
            String[] arr_s = s.split("\\.");
            JSONObject jSONObject0 = this._data;
            if(s.length() == 0) {
                return;
            }
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(jSONObject0.has(arr_s[v1])) {
                    try {
                        jSONObject0 = jSONObject0.getJSONObject(arr_s[v1]);
                    }
                    catch(Exception exception1) {
                        DeviceLog.exception("Couldn\'t get existing JSONObject", exception1);
                    }
                }
                else {
                    try {
                        jSONObject0 = jSONObject0.put(arr_s[v1], new JSONObject());
                        jSONObject0 = jSONObject0.getJSONObject(arr_s[v1]);
                    }
                    catch(Exception exception0) {
                        DeviceLog.exception("Couldn\'t create new JSONObject", exception0);
                    }
                }
            }
        }
    }

    public boolean delete(String s) {
        synchronized(this) {
            if(this._data == null) {
                DeviceLog.error("Data is NULL, readStorage probably not called");
                return false;
            }
            String[] arr_s = s.split("\\.");
            if(this.findObject(this.getParentObjectTreeFor(s)) instanceof JSONObject) {
                JSONObject jSONObject0 = (JSONObject)this.findObject(this.getParentObjectTreeFor(s));
                if(jSONObject0 != null && jSONObject0.remove(arr_s[arr_s.length - 1]) != null) {
                    return true;
                }
            }
            return false;
        }
    }

    private Object findObject(String s) {
        synchronized(this) {
            String[] arr_s = s.split("\\.");
            JSONObject jSONObject0 = this._data;
            if(s.length() == 0) {
                return jSONObject0;
            }
            int v1 = 0;
            while(v1 < arr_s.length) {
                if(jSONObject0.has(arr_s[v1])) {
                    try {
                        jSONObject0 = jSONObject0.getJSONObject(arr_s[v1]);
                        ++v1;
                    }
                    catch(Exception exception0) {
                        DeviceLog.exception(("Couldn\'t read JSONObject: " + arr_s[v1]), exception0);
                        return null;
                    }
                    continue;
                }
                return null;
            }
            return jSONObject0;
        }
    }

    @Override  // com.unity3d.services.core.misc.IJsonStorageReader
    public Object get(String s) {
        Object object0 = null;
        synchronized(this) {
            if(this._data == null) {
                DeviceLog.error("Data is NULL, readStorage probably not called");
                return null;
            }
            String[] arr_s = s.split("\\.");
            if(this.findObject(this.getParentObjectTreeFor(s)) instanceof JSONObject) {
                JSONObject jSONObject0 = (JSONObject)this.findObject(this.getParentObjectTreeFor(s));
                if(jSONObject0 != null) {
                    try {
                        if(jSONObject0.has(arr_s[arr_s.length - 1])) {
                            object0 = jSONObject0.get(arr_s[arr_s.length - 1]);
                        }
                    }
                    catch(Exception exception0) {
                        DeviceLog.exception("Error getting data", exception0);
                    }
                    return object0;
                }
            }
            return null;
        }
    }

    @Override  // com.unity3d.services.core.misc.IJsonStorageReader
    public JSONObject getData() {
        synchronized(this) {
        }
        return this._data;
    }

    public List getKeys(String s, boolean z) {
        synchronized(this) {
            if(this.get(s) instanceof JSONObject) {
                JSONObject jSONObject0 = (JSONObject)this.get(s);
                List list0 = new ArrayList();
                if(jSONObject0 != null) {
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        String s1 = (String)object0;
                        List list1 = z ? this.getKeys(s + "." + s1, true) : null;
                        list0.add(s1);
                        if(list1 != null) {
                            for(Object object1: list1) {
                                list0.add(s1 + "." + ((String)object1));
                            }
                        }
                    }
                }
                return list0;
            }
            return null;
        }
    }

    private String getParentObjectTreeFor(String s) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(Arrays.asList(s.split("\\.")));
            arrayList0.remove(arrayList0.size() - 1);
            return TextUtils.join(".", arrayList0.toArray());
        }
    }

    public boolean hasData() {
        synchronized(this) {
            return this._data != null && this._data.length() > 0;
        }
    }

    public boolean initData() {
        synchronized(this) {
            if(this._data == null) {
                this._data = new JSONObject();
                return true;
            }
            return false;
        }
    }

    public boolean set(String s, Object object0) {
        synchronized(this) {
            if(this._data != null && s != null && s.length() != 0 && object0 != null) {
                this.createObjectTree(this.getParentObjectTreeFor(s));
                if(this.findObject(this.getParentObjectTreeFor(s)) instanceof JSONObject) {
                    JSONObject jSONObject0 = (JSONObject)this.findObject(this.getParentObjectTreeFor(s));
                    String[] arr_s = s.split("\\.");
                    if(jSONObject0 != null) {
                        try {
                            jSONObject0.put(arr_s[arr_s.length - 1], object0);
                        }
                        catch(JSONException jSONException0) {
                            DeviceLog.exception("Couldn\'t set value", jSONException0);
                            return false;
                        }
                    }
                    return true;
                }
                DeviceLog.debug("Cannot set subvalue to an object that is not JSONObject");
                return false;
            }
            DeviceLog.error(("Storage not properly initialized or incorrect parameters:" + this._data + ", " + s + ", " + object0));
            return false;
        }
    }

    public void setData(JSONObject jSONObject0) {
        synchronized(this) {
            this._data = jSONObject0;
        }
    }
}

