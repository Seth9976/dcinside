package com.google.android.gms.vision;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;

public class MultiDetector extends Detector {
    public static class Builder {
        private MultiDetector zza;

        public Builder() {
            this.zza = new MultiDetector(null);
        }

        @RecentlyNonNull
        public Builder add(@RecentlyNonNull Detector detector0) {
            this.zza.zza.add(detector0);
            return this;
        }

        @RecentlyNonNull
        public MultiDetector build() {
            if(this.zza.zza.size() == 0) {
                throw new RuntimeException("No underlying detectors added to MultiDetector.");
            }
            return this.zza;
        }
    }

    private List zza;

    private MultiDetector() {
        this.zza = new ArrayList();
    }

    MultiDetector(zzd zzd0) {
    }

    @Override  // com.google.android.gms.vision.Detector
    @RecentlyNonNull
    public SparseArray detect(@RecentlyNonNull Frame frame0) {
        SparseArray sparseArray0 = new SparseArray();
        for(Object object0: this.zza) {
            SparseArray sparseArray1 = ((Detector)object0).detect(frame0);
            for(int v = 0; v < sparseArray1.size(); ++v) {
                int v1 = sparseArray1.keyAt(v);
                if(sparseArray0.get(v1) != null) {
                    throw new IllegalStateException("Detection ID overlap for id = " + v1 + "  This means that one of the detectors is not using global IDs.");
                }
                sparseArray0.append(v1, sparseArray1.valueAt(v));
            }
        }
        return sparseArray0;
    }

    @Override  // com.google.android.gms.vision.Detector
    public boolean isOperational() {
        for(Object object0: this.zza) {
            if(!((Detector)object0).isOperational()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // com.google.android.gms.vision.Detector
    public void receiveFrame(@RecentlyNonNull Frame frame0) {
        for(Object object0: this.zza) {
            ((Detector)object0).receiveFrame(frame0);
        }
    }

    @Override  // com.google.android.gms.vision.Detector
    public void release() {
        for(Object object0: this.zza) {
            ((Detector)object0).release();
        }
        this.zza.clear();
    }

    @Override  // com.google.android.gms.vision.Detector
    public void setProcessor(@RecentlyNonNull Processor detector$Processor0) {
        throw new UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
    }
}

