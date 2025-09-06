package com.unity3d.services.core.device.reader.builder;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager.StorageType;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.reader.DeviceInfoReaderFilterProvider;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithBehavioralFlag;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithFilter;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithStorageInfo;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.device.reader.IGameSessionIdReader;
import com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader;
import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import java.util.Arrays;
import java.util.Collections;

public class DeviceInfoReaderPrivacyBuilder extends DeviceInfoReaderBuilder {
    public DeviceInfoReaderPrivacyBuilder(ConfigurationReader configurationReader0, PrivacyConfigStorage privacyConfigStorage0, IGameSessionIdReader iGameSessionIdReader0) {
        super(configurationReader0, privacyConfigStorage0, iGameSessionIdReader0);
    }

    @Override  // com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder
    public IDeviceInfoReader build() {
        Storage storage0 = StorageManager.getStorage(StorageType.PRIVATE);
        Storage storage1 = StorageManager.getStorage(StorageType.PUBLIC);
        NonBehavioralFlagReader nonBehavioralFlagReader0 = new NonBehavioralFlagReader(new JsonStorageAggregator(Arrays.asList(new IJsonStorageReader[]{storage1, storage0})));
        DeviceInfoReaderFilterProvider deviceInfoReaderFilterProvider0 = new DeviceInfoReaderFilterProvider(storage0);
        return new DeviceInfoReaderWithFilter(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithBehavioralFlag(this.buildWithRequestType(InitRequestType.PRIVACY), nonBehavioralFlagReader0), this.getPrivacyRequestStorageRules(), new IJsonStorageReader[]{storage0, storage1}), deviceInfoReaderFilterProvider0.getFilterList());
    }

    private JsonFlattenerRules getPrivacyRequestStorageRules() {
        return new JsonFlattenerRules(Arrays.asList(new String[]{"privacy", "gdpr", "unity", "pipl", "mediation"}), Collections.singletonList("value"), Arrays.asList(new String[]{"ts", "exclude", "mode", "traits", "name", "version", "adapter_version"}));
    }
}

