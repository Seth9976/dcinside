package com.unity3d.services.core.device.reader.builder;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager.StorageType;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.reader.DeviceInfoReaderExtended;
import com.unity3d.services.core.device.reader.DeviceInfoReaderFilterProvider;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithAuid;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithFilter;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithLifecycle;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithMetrics;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithPrivacy;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithRequestType;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithSessionId;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithStorageInfo;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.device.reader.IGameSessionIdReader;
import com.unity3d.services.core.device.reader.MinimalDeviceInfoReader;
import com.unity3d.services.core.device.reader.pii.PiiDataProvider;
import com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.Session;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Arrays;
import java.util.Collections;

public class DeviceInfoReaderBuilder {
    private final ConfigurationReader _configurationReader;
    private final IGameSessionIdReader _gameSessionIdReader;
    private final PrivacyConfigStorage _privacyConfigStorage;

    public DeviceInfoReaderBuilder(ConfigurationReader configurationReader0, PrivacyConfigStorage privacyConfigStorage0, IGameSessionIdReader iGameSessionIdReader0) {
        this._configurationReader = configurationReader0;
        this._privacyConfigStorage = privacyConfigStorage0;
        this._gameSessionIdReader = iGameSessionIdReader0;
    }

    public IDeviceInfoReader build() {
        Storage storage0 = StorageManager.getStorage(StorageType.PRIVATE);
        Storage storage1 = StorageManager.getStorage(StorageType.PUBLIC);
        JsonStorageAggregator jsonStorageAggregator0 = new JsonStorageAggregator(Arrays.asList(new IJsonStorageReader[]{storage1, storage0}));
        DeviceInfoReaderFilterProvider deviceInfoReaderFilterProvider0 = new DeviceInfoReaderFilterProvider(storage0);
        DeviceInfoReaderWithStorageInfo deviceInfoReaderWithStorageInfo0 = new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithLifecycle(new DeviceInfoReaderExtended(new DeviceInfoReaderWithAuid(new DeviceInfoReaderWithSessionId(this.buildWithRequestType(InitRequestType.TOKEN), Session.Default))), CachedLifecycle.getLifecycleListener()), this.getTsiRequestStorageRules(), new IJsonStorageReader[]{storage0, storage1});
        PiiTrackingStatusReader piiTrackingStatusReader0 = new PiiTrackingStatusReader(jsonStorageAggregator0);
        PiiDataProvider piiDataProvider0 = new PiiDataProvider();
        return new DeviceInfoReaderWithMetrics(new DeviceInfoReaderWithFilter(new DeviceInfoReaderWithPrivacy(deviceInfoReaderWithStorageInfo0, this._privacyConfigStorage, piiDataProvider0, piiTrackingStatusReader0), deviceInfoReaderFilterProvider0.getFilterList()), ((SDKMetricsSender)Utilities.getService(SDKMetricsSender.class)));
    }

    protected IDeviceInfoReader buildWithRequestType(InitRequestType initRequestType0) {
        return new DeviceInfoReaderWithRequestType(new MinimalDeviceInfoReader(this._gameSessionIdReader), initRequestType0);
    }

    private JsonFlattenerRules getTsiRequestStorageRules() {
        return new JsonFlattenerRules(Arrays.asList(new String[]{"privacy", "gdpr", "framework", "adapter", "mediation", "unity", "pipl", "configuration", "user", "unifiedconfig"}), Collections.singletonList("value"), Arrays.asList(new String[]{"ts", "exclude", "pii", "nonBehavioral", "nonbehavioral", "traits"}));
    }
}

