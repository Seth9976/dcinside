package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.Map;

public class DeviceInfoReaderWithMetrics implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final SDKMetricsSender _sdkMetricsSender;

    public DeviceInfoReaderWithMetrics(IDeviceInfoReader iDeviceInfoReader0, SDKMetricsSender sDKMetricsSender0) {
        this._deviceInfoReader = iDeviceInfoReader0;
        this._sdkMetricsSender = sDKMetricsSender0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map getDeviceInfoData() {
        IDeviceInfoReader iDeviceInfoReader0 = this._deviceInfoReader;
        if(iDeviceInfoReader0 == null) {
            return null;
        }
        Map map0 = iDeviceInfoReader0.getDeviceInfoData();
        this.sendMetrics(map0);
        return map0;
    }

    private void sendMetrics(Map map0) {
        if(map0 != null) {
            Object object0 = map0.get("unifiedconfig.data.gameSessionId");
            if(object0 instanceof Long && ((long)(((Long)object0))) == 0L) {
                Metric metric0 = TSIMetric.newMissingGameSessionId();
                this._sdkMetricsSender.sendMetric(metric0);
            }
        }
    }
}

