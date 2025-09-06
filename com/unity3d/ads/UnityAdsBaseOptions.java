package com.unity3d.ads;

import com.unity3d.services.core.log.DeviceLog;
import org.json.JSONException;
import org.json.JSONObject;

public class UnityAdsBaseOptions {
    private String OBJECT_ID;
    private JSONObject _data;

    public UnityAdsBaseOptions() {
        this.OBJECT_ID = "objectId";
        this._data = new JSONObject();
    }

    public JSONObject getData() {
        return this._data;
    }

    public String getObjectId() {
        try {
            return this._data.getString(this.OBJECT_ID);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public void set(String s, String s1) {
        if(s != null && s1 != null) {
            try {
                this._data.put(s, s1);
            }
            catch(JSONException jSONException0) {
                DeviceLog.exception("Failed to set Unity Ads options", jSONException0);
            }
        }
    }

    public void setObjectId(String s) {
        this.set(this.OBJECT_ID, s);
    }
}

