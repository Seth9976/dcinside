package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface OpenMeasurementRepository {
    @m
    Object activateOM(@l Context arg1, @l d arg2);

    @m
    Object finishSession(@l ByteString arg1, @l d arg2);

    @l
    OMData getOmData();

    boolean hasSessionFinished(@l ByteString arg1);

    @m
    Object impressionOccurred(@l ByteString arg1, boolean arg2, @l d arg3);

    boolean isOMActive();

    void setOMActive(boolean arg1);

    @m
    Object startSession(@l ByteString arg1, @m WebView arg2, @l OmidOptions arg3, @l d arg4);
}

