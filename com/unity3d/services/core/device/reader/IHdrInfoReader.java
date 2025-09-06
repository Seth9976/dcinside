package com.unity3d.services.core.device.reader;

import android.app.Activity;
import com.unity3d.services.core.configuration.ExperimentsReader;

public interface IHdrInfoReader {
    void captureHDRCapabilityMetrics(Activity arg1, ExperimentsReader arg2);
}

