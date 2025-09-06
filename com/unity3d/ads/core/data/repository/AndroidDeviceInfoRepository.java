package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo;
import gatewayprotocol.v1.PiiOuterClass.Pii;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;

public final class AndroidDeviceInfoRepository implements DeviceInfoRepository {
    @l
    private final E allowedPii;
    @m
    private final String analyticsUserId;
    @l
    private final DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource;
    @l
    private final PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource;
    @l
    private final SessionRepository sessionRepository;
    @l
    private final StaticDeviceInfoDataSource staticDeviceInfoDataSource;
    @l
    private final i volumeSettingsChange;

    public AndroidDeviceInfoRepository(@l StaticDeviceInfoDataSource staticDeviceInfoDataSource0, @l DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource0, @l PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource0, @l SessionRepository sessionRepository0) {
        L.p(staticDeviceInfoDataSource0, "staticDeviceInfoDataSource");
        L.p(dynamicDeviceInfoDataSource0, "dynamicDeviceInfoDataSource");
        L.p(privacyDeviceInfoDataSource0, "privacyDeviceInfoDataSource");
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.staticDeviceInfoDataSource = staticDeviceInfoDataSource0;
        this.dynamicDeviceInfoDataSource = dynamicDeviceInfoDataSource0;
        this.privacyDeviceInfoDataSource = privacyDeviceInfoDataSource0;
        this.sessionRepository = sessionRepository0;
        AllowedPii allowedPiiOuterClass$AllowedPii0 = AllowedPii.getDefaultInstance();
        L.o(allowedPiiOuterClass$AllowedPii0, "getDefaultInstance()");
        this.allowedPii = W.a(allowedPiiOuterClass$AllowedPii0);
        this.analyticsUserId = staticDeviceInfoDataSource0.getAnalyticsUserId();
        this.volumeSettingsChange = dynamicDeviceInfoDataSource0.getVolumeSettingsChange();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public StaticDeviceInfo cachedStaticDeviceInfo() {
        return this.staticDeviceInfoDataSource.fetchCached();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public E getAllowedPii() {
        return this.allowedPii;
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @m
    public String getAnalyticsUserId() {
        return this.analyticsUserId;
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public String getAppName() {
        return this.staticDeviceInfoDataSource.getAppName();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @m
    public Object getAuidByteString(@l d d0) {
        com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository.getAuidByteString.1 androidDeviceInfoRepository$getAuidByteString$10;
        if(d0 instanceof com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository.getAuidByteString.1) {
            androidDeviceInfoRepository$getAuidByteString$10 = (com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository.getAuidByteString.1)d0;
            int v = androidDeviceInfoRepository$getAuidByteString$10.label;
            if((v & 0x80000000) == 0) {
                androidDeviceInfoRepository$getAuidByteString$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.getAuidByteString(this);
                    }
                };
            }
            else {
                androidDeviceInfoRepository$getAuidByteString$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidDeviceInfoRepository$getAuidByteString$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.getAuidByteString(this);
                }
            };
        }
        Object object0 = androidDeviceInfoRepository$getAuidByteString$10.result;
        Object object1 = b.l();
        switch(androidDeviceInfoRepository$getAuidByteString$10.label) {
            case 0: {
                f0.n(object0);
                androidDeviceInfoRepository$getAuidByteString$10.label = 1;
                object0 = this.getAuidString(androidDeviceInfoRepository$getAuidByteString$10);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s = (String)object0;
        if(s == null) {
            return null;
        }
        try {
            UUID uUID0 = UUID.fromString(s);
            L.o(uUID0, "fromString(auidString)");
            return ProtobufExtensionsKt.toByteString(uUID0);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @m
    public Object getAuidString(@l d d0) {
        return this.staticDeviceInfoDataSource.getAuid(d0);
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public String getConnectionTypeStr() {
        return this.dynamicDeviceInfoDataSource.getConnectionTypeStr();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getCurrentUiTheme() {
        return this.dynamicDeviceInfoDataSource.getCurrentUiTheme();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public DynamicDeviceInfo getDynamicDeviceInfo() {
        return this.dynamicDeviceInfoDataSource.fetch();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public boolean getHasInternet() {
        return this.dynamicDeviceInfoDataSource.hasInternet();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @m
    public Object getIdfi(@l d d0) {
        return this.staticDeviceInfoDataSource.getIdfi(d0);
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public List getLocaleList() {
        return this.dynamicDeviceInfoDataSource.getLocaleList();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public String getManufacturer() {
        return this.staticDeviceInfoDataSource.getManufacturer();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public String getModel() {
        return this.staticDeviceInfoDataSource.getModel();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public String getOrientation() {
        return this.dynamicDeviceInfoDataSource.getOrientation();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public String getOsVersion() {
        return this.staticDeviceInfoDataSource.getOsVersion();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public Pii getPiiData() {
        AllowedPii allowedPiiOuterClass$AllowedPii0 = (AllowedPii)this.getAllowedPii().getValue();
        return this.privacyDeviceInfoDataSource.fetch(allowedPiiOuterClass$AllowedPii0);
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getRingerMode() {
        return this.dynamicDeviceInfoDataSource.getRingerMode();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public long getSystemBootTime() {
        return this.staticDeviceInfoDataSource.getSystemBootTime();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @l
    public i getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override  // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @m
    public Object staticDeviceInfo(@l d d0) {
        List list0 = this.sessionRepository.getNativeConfiguration().getAdditionalStorePackagesList();
        L.o(list0, "sessionRepository.native…ditionalStorePackagesList");
        return this.staticDeviceInfoDataSource.fetch(list0, d0);
    }
}

