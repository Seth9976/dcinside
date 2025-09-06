package com.google.android.gms.vision.face;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.vision.Detector.Detections;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.FocusingProcessor;
import com.google.android.gms.vision.Tracker;

public class LargestFaceFocusingProcessor extends FocusingProcessor {
    public static class Builder {
        private LargestFaceFocusingProcessor zza;

        public Builder(@RecentlyNonNull Detector detector0, @RecentlyNonNull Tracker tracker0) {
            this.zza = new LargestFaceFocusingProcessor(detector0, tracker0);
        }

        @RecentlyNonNull
        public LargestFaceFocusingProcessor build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setMaxGapFrames(int v) {
            this.zza.zza(v);
            return this;
        }
    }

    public LargestFaceFocusingProcessor(@RecentlyNonNull Detector detector0, @RecentlyNonNull Tracker tracker0) {
        super(detector0, tracker0);
    }

    @Override  // com.google.android.gms.vision.FocusingProcessor
    public int selectFocus(@RecentlyNonNull Detections detector$Detections0) {
        SparseArray sparseArray0 = detector$Detections0.getDetectedItems();
        if(sparseArray0.size() == 0) {
            throw new IllegalArgumentException("No faces for selectFocus.");
        }
        int v = sparseArray0.keyAt(0);
        float f = ((Face)sparseArray0.valueAt(0)).getWidth();
        for(int v1 = 1; v1 < sparseArray0.size(); ++v1) {
            int v2 = sparseArray0.keyAt(v1);
            float f1 = ((Face)sparseArray0.valueAt(v1)).getWidth();
            if(f1 > f) {
                v = v2;
                f = f1;
            }
        }
        return v;
    }
}

