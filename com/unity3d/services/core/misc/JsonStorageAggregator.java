package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.DeviceLog;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonStorageAggregator implements IJsonStorageReader {
    private final List _jsonStorageReaders;

    public JsonStorageAggregator(List list0) {
        this._jsonStorageReaders = list0;
    }

    @Override  // com.unity3d.services.core.misc.IJsonStorageReader
    public Object get(String s) {
        Object object0 = null;
        for(Object object1: this._jsonStorageReaders) {
            IJsonStorageReader iJsonStorageReader0 = (IJsonStorageReader)object1;
            if(iJsonStorageReader0 != null) {
                object0 = iJsonStorageReader0.get(s);
                if(object0 != null) {
                    break;
                }
            }
        }
        return object0;
    }

    @Override  // com.unity3d.services.core.misc.IJsonStorageReader
    public JSONObject getData() {
        JSONObject jSONObject0 = new JSONObject();
        for(Object object0: this._jsonStorageReaders) {
            IJsonStorageReader iJsonStorageReader0 = (IJsonStorageReader)object0;
            if(iJsonStorageReader0 != null) {
                try {
                    jSONObject0 = Utilities.mergeJsonObjects(jSONObject0, iJsonStorageReader0.getData());
                }
                catch(JSONException unused_ex) {
                    DeviceLog.error(("Failed to merge storage: " + iJsonStorageReader0));
                }
            }
        }
        return jSONObject0;
    }
}

