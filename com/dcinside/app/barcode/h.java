package com.dcinside.app.barcode;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector.Detections;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.FocusingProcessor;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.barcode.Barcode;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class h extends FocusingProcessor {
    private final boolean a;

    public h(@m Detector detector0, @m Tracker tracker0, boolean z) {
        super(detector0, tracker0);
        this.a = z;
    }

    @Override  // com.google.android.gms.vision.FocusingProcessor
    public int selectFocus(@l Detections detector$Detections0) {
        L.p(detector$Detections0, "detections");
        SparseArray sparseArray0 = detector$Detections0.getDetectedItems();
        int v = sparseArray0.size();
        int v1 = 0;
        while(v1 < v) {
            int v2 = sparseArray0.keyAt(v1);
            if(this.a) {
                Object object0 = sparseArray0.valueAt(v1);
                L.m(object0);
                if(g.a(((Barcode)object0))) {
                    return v2;
                }
                ++v1;
                continue;
            }
            return v2;
        }
        return -1;
    }
}

