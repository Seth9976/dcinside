package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.IJsonStorageReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public class DeviceInfoReaderFilterProvider {
    private static final String FILTER_EXCLUDE_KEY = "exclude";
    private static final String UNIFIED_CONFIG_KEY = "unifiedconfig";
    private IJsonStorageReader _storage;

    public DeviceInfoReaderFilterProvider(IJsonStorageReader iJsonStorageReader0) {
        this._storage = iJsonStorageReader0;
    }

    public List getFilterList() {
        List list0 = new ArrayList();
        if(this._storage != null && this._storage.getData() != null) {
            Object object0 = this._storage.getData().opt("unifiedconfig");
            if(object0 != null && object0 instanceof JSONObject) {
                Object object1 = ((JSONObject)object0).opt("exclude");
                return object1 instanceof String ? this.trimWhiteSpaces(Arrays.asList(((String)object1).split(","))) : list0;
            }
        }
        return list0;
    }

    private List trimWhiteSpaces(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(((String)object0).trim());
        }
        return list1;
    }
}

