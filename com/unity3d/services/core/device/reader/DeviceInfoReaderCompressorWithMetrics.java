package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DeviceInfoReaderCompressorWithMetrics implements IDeviceInfoDataCompressor {
    private final IDeviceInfoDataCompressor _deviceInfoDataCompressor;
    private long _endTime;
    private final SDKMetricsSender _sdkMetricsSender;
    private long _startTimeCompression;
    private long _startTimeInfo;

    public DeviceInfoReaderCompressorWithMetrics(IDeviceInfoDataCompressor iDeviceInfoDataCompressor0, SDKMetricsSender sDKMetricsSender0) {
        this._deviceInfoDataCompressor = iDeviceInfoDataCompressor0;
        this._sdkMetricsSender = sDKMetricsSender0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoDataCompressor
    public byte[] compressDeviceInfo(Map map0) {
        this._startTimeCompression = System.nanoTime();
        byte[] arr_b = this._deviceInfoDataCompressor.compressDeviceInfo(map0);
        this._endTime = System.nanoTime();
        return arr_b;
    }

    private long getCompressionDuration() {
        return TimeUnit.NANOSECONDS.toMillis(this._endTime - this._startTimeCompression);
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoDataContainer
    public byte[] getDeviceData() {
        if(this._deviceInfoDataCompressor == null) {
            return new byte[0];
        }
        this._startTimeInfo = System.nanoTime();
        byte[] arr_b = this.compressDeviceInfo(this.getDeviceInfo());
        this.sendDeviceInfoMetrics();
        return arr_b;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoDataContainer
    public Map getDeviceInfo() {
        return this._deviceInfoDataCompressor.getDeviceInfo();
    }

    private long getDeviceInfoCollectionDuration() {
        return TimeUnit.NANOSECONDS.toMillis(this._startTimeCompression - this._startTimeInfo);
    }

    private void sendDeviceInfoMetrics() {
        Metric metric0 = TSIMetric.newDeviceInfoCollectionLatency(this.getDeviceInfoCollectionDuration());
        this._sdkMetricsSender.sendMetric(metric0);
        Metric metric1 = TSIMetric.newDeviceInfoCompressionLatency(this.getCompressionDuration());
        this._sdkMetricsSender.sendMetric(metric1);
    }
}

