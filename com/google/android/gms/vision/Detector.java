package com.google.android.gms.vision;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import o3.h;
import p3.a;

public abstract class Detector {
    public static class Detections {
        private final SparseArray zza;
        private final Metadata zzb;
        private final boolean zzc;

        public Detections(@RecentlyNonNull SparseArray sparseArray0, @RecentlyNonNull Metadata frame$Metadata0, boolean z) {
            this.zza = sparseArray0;
            this.zzb = frame$Metadata0;
            this.zzc = z;
        }

        public boolean detectorIsOperational() {
            return this.zzc;
        }

        @RecentlyNonNull
        public SparseArray getDetectedItems() {
            return this.zza;
        }

        @RecentlyNonNull
        public Metadata getFrameMetadata() {
            return this.zzb;
        }
    }

    public interface Processor {
        void receiveDetections(@RecentlyNonNull Detections arg1);

        void release();
    }

    private final Object zza;
    @h
    @a("processorLock")
    private Processor zzb;

    public Detector() {
        this.zza = new Object();
    }

    @RecentlyNonNull
    public abstract SparseArray detect(@RecentlyNonNull Frame arg1);

    public boolean isOperational() {
        return true;
    }

    public void receiveFrame(@RecentlyNonNull Frame frame0) {
        Metadata frame$Metadata0 = new Metadata(frame0.getMetadata());
        frame$Metadata0.zza();
        Detections detector$Detections0 = new Detections(this.detect(frame0), frame$Metadata0, this.isOperational());
        synchronized(this.zza) {
            Processor detector$Processor0 = this.zzb;
            if(detector$Processor0 != null) {
                detector$Processor0.receiveDetections(detector$Detections0);
                return;
            }
        }
        throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
    }

    public void release() {
        synchronized(this.zza) {
            Processor detector$Processor0 = this.zzb;
            if(detector$Processor0 != null) {
                detector$Processor0.release();
                this.zzb = null;
            }
        }
    }

    public boolean setFocus(int v) {
        return true;
    }

    public void setProcessor(@RecentlyNonNull Processor detector$Processor0) {
        synchronized(this.zza) {
            Processor detector$Processor1 = this.zzb;
            if(detector$Processor1 != null) {
                detector$Processor1.release();
            }
            this.zzb = detector$Processor0;
        }
    }
}

