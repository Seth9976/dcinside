package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.HashMap;
import java.util.Map;

public class MinimalDeviceInfoReader implements IDeviceInfoReader {
    final IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(IGameSessionIdReader iGameSessionIdReader0) {
        this._gameSessionIdReader = iGameSessionIdReader0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map getDeviceInfoData() {
        Map map0 = new HashMap();
        map0.put("platform", "android");
        map0.put("sdkVersion", 41401);
        map0.put("sdkVersionName", "4.14.1");
        map0.put("idfi", Device.getIdfi());
        map0.put("unifiedconfig.data.gameSessionId", this._gameSessionIdReader.getGameSessionIdAndStore());
        map0.put("ts", System.currentTimeMillis());
        map0.put("gameId", ClientProperties.getGameId());
        return map0;
    }
}

