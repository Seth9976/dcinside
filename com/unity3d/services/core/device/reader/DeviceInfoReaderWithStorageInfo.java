package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import com.unity3d.services.core.misc.Utilities;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DeviceInfoReaderWithStorageInfo implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final JsonFlattenerRules _jsonFlattenerRules;
    private final List _storageReaders;

    public DeviceInfoReaderWithStorageInfo(IDeviceInfoReader iDeviceInfoReader0, JsonFlattenerRules jsonFlattenerRules0, IJsonStorageReader[] arr_iJsonStorageReader) {
        this._deviceInfoReader = iDeviceInfoReader0;
        this._jsonFlattenerRules = jsonFlattenerRules0;
        this._storageReaders = Arrays.asList(arr_iJsonStorageReader);
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map getDeviceInfoData() {
        Map map0 = this._deviceInfoReader.getDeviceInfoData();
        return map0 == null ? null : Utilities.combineJsonIntoMap(map0, new JsonFlattener(new JsonStorageAggregator(this._storageReaders).getData()).flattenJson(".", this._jsonFlattenerRules));
    }
}

