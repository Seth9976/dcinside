package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.lifecycle.LifecycleCache;
import java.util.Map;

public class DeviceInfoReaderWithLifecycle implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final LifecycleCache _lifecycleCache;

    public DeviceInfoReaderWithLifecycle(IDeviceInfoReader iDeviceInfoReader0, LifecycleCache lifecycleCache0) {
        this._deviceInfoReader = iDeviceInfoReader0;
        this._lifecycleCache = lifecycleCache0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map getDeviceInfoData() {
        Map map0 = this._deviceInfoReader.getDeviceInfoData();
        map0.put("appActive", Boolean.valueOf(this._lifecycleCache.isAppActive()));
        return map0;
    }
}

