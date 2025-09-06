package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager.StorageType;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import java.util.Iterator;
import org.json.JSONObject;

public class MetaData extends JsonStorage {
    private String _category;
    protected Context _context;

    public MetaData(Context context0) {
        this._context = context0.getApplicationContext();
    }

    public void commit() {
        if(StorageManager.init(this._context)) {
            Storage storage0 = StorageManager.getStorage(StorageType.PUBLIC);
            if(this.getData() != null && storage0 != null) {
                Iterator iterator0 = this.getData().keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    JSONObject jSONObject0 = this.get(s);
                    if(storage0.get(s) != null && storage0.get(s) instanceof JSONObject && this.get(s) instanceof JSONObject) {
                        try {
                            jSONObject0 = Utilities.mergeJsonObjects(jSONObject0, ((JSONObject)storage0.get(s)));
                        }
                        catch(Exception exception0) {
                            DeviceLog.exception("Exception merging JSONs", exception0);
                        }
                    }
                    storage0.set(s, jSONObject0);
                }
                storage0.writeStorage();
                JSONObject jSONObject1 = this.getData();
                storage0.sendEvent(StorageEvent.SET, jSONObject1);
            }
        }
        else {
            DeviceLog.error("Unity Ads could not commit metadata due to storage error");
        }
    }

    private String getActualKey(String s) {
        return this.getCategory() == null ? s : this.getCategory() + "." + s;
    }

    public String getCategory() {
        return this._category;
    }

    private boolean set(String s, int v) {
        synchronized(this) {
            return this.set(s, v);
        }
    }

    private boolean set(String s, long v) {
        synchronized(this) {
            return this.set(s, v);
        }
    }

    private boolean set(String s, boolean z) {
        synchronized(this) {
            return this.set(s, Boolean.valueOf(z));
        }
    }

    @Override  // com.unity3d.services.core.misc.JsonStorage
    public boolean set(String s, Object object0) {
        synchronized(this) {
            this.initData();
            return super.set(this.getActualKey(s) + ".value", object0) && super.set(this.getActualKey(s) + ".ts", System.currentTimeMillis());
        }
    }

    public void setCategory(String s) {
        this._category = s;
    }

    protected boolean setRaw(String s, Object object0) {
        synchronized(this) {
            this.initData();
            return super.set(this.getActualKey(s), object0);
        }
    }
}

