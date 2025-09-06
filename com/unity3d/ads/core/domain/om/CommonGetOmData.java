package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class CommonGetOmData implements GetOmData {
    @l
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(@l OpenMeasurementRepository openMeasurementRepository0) {
        L.p(openMeasurementRepository0, "openMeasurementRepository");
        super();
        this.openMeasurementRepository = openMeasurementRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.om.GetOmData
    @m
    public Object invoke(@l d d0) {
        return this.openMeasurementRepository.getOmData();
    }
}

