package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.jvm.internal.L;
import y4.l;

public final class CommonIsOMActivated implements IsOMActivated {
    @l
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonIsOMActivated(@l OpenMeasurementRepository openMeasurementRepository0) {
        L.p(openMeasurementRepository0, "openMeasurementRepository");
        super();
        this.openMeasurementRepository = openMeasurementRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.om.IsOMActivated
    public boolean invoke() {
        return this.openMeasurementRepository.isOMActive();
    }
}

