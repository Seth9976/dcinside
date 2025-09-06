package com.unity3d.services.core.device.reader;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.Display.HdrCapabilities;
import android.view.WindowManager;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class HdrInfoReader implements IHdrInfoReader {
    private static final AtomicBoolean _hdrMetricsCaptured;
    private static volatile HdrInfoReader _instance;
    private final SDKMetricsSender _sdkMetricsSender;

    static {
        HdrInfoReader._hdrMetricsCaptured = new AtomicBoolean(false);
    }

    private HdrInfoReader() {
        this._sdkMetricsSender = (SDKMetricsSender)Utilities.getService(SDKMetricsSender.class);
    }

    @Override  // com.unity3d.services.core.device.reader.IHdrInfoReader
    public void captureHDRCapabilityMetrics(Activity activity0, ExperimentsReader experimentsReader0) {
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        int v = 0;
        if(activity0 == null) {
            return;
        }
        if(!experimentsReader0.getCurrentlyActiveExperiments().isCaptureHDRCapabilitiesEnabled()) {
            return;
        }
        if(HdrInfoReader._hdrMetricsCaptured.compareAndSet(false, true)) {
            ArrayList arrayList0 = new ArrayList(5);
            if(Build.VERSION.SDK_INT >= 24) {
                Display.HdrCapabilities display$HdrCapabilities0 = ((WindowManager)activity0.getSystemService("window")).getDefaultDisplay().getHdrCapabilities();
                int[] arr_v = display$HdrCapabilities0.getSupportedHdrTypes();
                int v2 = 0;
                z = false;
                z1 = false;
                z2 = false;
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    switch(arr_v[v1]) {
                        case 1: {
                            v2 = 1;
                            break;
                        }
                        case 2: {
                            z = true;
                            break;
                        }
                        case 3: {
                            z2 = true;
                            break;
                        }
                        case 4: {
                            z1 = true;
                        }
                    }
                }
                float f = display$HdrCapabilities0.getDesiredMaxAverageLuminance();
                float f1 = display$HdrCapabilities0.getDesiredMaxLuminance();
                float f2 = display$HdrCapabilities0.getDesiredMinLuminance();
                arrayList0.add(new Metric("native_device_hdr_lum_max_average", ((long)Math.round(f))));
                arrayList0.add(new Metric("native_device_hdr_lum_max", ((long)Math.round(f1))));
                arrayList0.add(new Metric("native_device_hdr_lum_min", ((long)Math.round(f2))));
                if(Build.VERSION.SDK_INT >= 26) {
                    z3 = activity0.getResources().getConfiguration().isScreenHdr();
                    v = v2;
                }
                else {
                    v = v2;
                    z3 = false;
                }
            }
            else {
                z3 = false;
                z = false;
                z1 = false;
                z2 = false;
            }
            if(v == 0) {
                arrayList0.add(new Metric("native_device_hdr_dolby_vision_failure"));
            }
            else {
                arrayList0.add(new Metric("native_device_hdr_dolby_vision_success"));
            }
            if(z) {
                arrayList0.add(new Metric("native_device_hdr_hdr10_success"));
            }
            else {
                arrayList0.add(new Metric("native_device_hdr_hdr10_failure"));
            }
            if(z1) {
                arrayList0.add(new Metric("native_device_hdr_hdr10_plus_success"));
            }
            else {
                arrayList0.add(new Metric("native_device_hdr_hdr10_plus_failure"));
            }
            if(z2) {
                arrayList0.add(new Metric("native_device_hdr_hlg_success"));
            }
            else {
                arrayList0.add(new Metric("native_device_hdr_hlg_failure"));
            }
            if(z3) {
                arrayList0.add(new Metric("native_device_hdr_screen_hdr_success"));
            }
            else {
                arrayList0.add(new Metric("native_device_hdr_screen_hdr_failure"));
            }
            this._sdkMetricsSender.sendMetrics(arrayList0);
        }
    }

    public static HdrInfoReader getInstance() {
        if(HdrInfoReader._instance == null) {
            Class class0 = HdrInfoReader.class;
            synchronized(class0) {
                if(HdrInfoReader._instance == null) {
                    HdrInfoReader._instance = new HdrInfoReader();
                }
            }
        }
        return HdrInfoReader._instance;
    }
}

