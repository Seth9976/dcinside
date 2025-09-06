package com.google.android.gms.vision;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import java.util.HashSet;

public class MultiProcessor implements Processor {
    public static class Builder {
        private MultiProcessor zza;

        public Builder(@RecentlyNonNull Factory multiProcessor$Factory0) {
            MultiProcessor multiProcessor0 = new MultiProcessor(null);
            this.zza = multiProcessor0;
            if(multiProcessor$Factory0 == null) {
                throw new IllegalArgumentException("No factory supplied.");
            }
            multiProcessor0.zza = multiProcessor$Factory0;
        }

        @RecentlyNonNull
        public MultiProcessor build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setMaxGapFrames(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Invalid max gap: " + v);
            }
            this.zza.zzc = v;
            return this;
        }
    }

    public interface Factory {
        @RecentlyNonNull
        Tracker create(@RecentlyNonNull Object arg1);
    }

    final class zza {
        private Tracker zza;
        private int zzb;

        private zza() {
            this.zzb = 0;
        }

        zza(zze zze0) {
        }

        static int zza(zza multiProcessor$zza0, int v) {
            multiProcessor$zza0.zzb = 0;
            return 0;
        }

        static int zzb(zza multiProcessor$zza0) {
            int v = multiProcessor$zza0.zzb;
            multiProcessor$zza0.zzb = v + 1;
            return v;
        }
    }

    private Factory zza;
    private SparseArray zzb;
    private int zzc;

    private MultiProcessor() {
        this.zzb = new SparseArray();
        this.zzc = 3;
    }

    MultiProcessor(zze zze0) {
    }

    @Override  // com.google.android.gms.vision.Detector$Processor
    public void receiveDetections(@RecentlyNonNull Detections detector$Detections0) {
        SparseArray sparseArray0 = detector$Detections0.getDetectedItems();
        for(int v = 0; v < sparseArray0.size(); ++v) {
            int v1 = sparseArray0.keyAt(v);
            Object object0 = sparseArray0.valueAt(v);
            if(this.zzb.get(v1) == null) {
                zza multiProcessor$zza0 = new zza(this, null);
                multiProcessor$zza0.zza = this.zza.create(object0);
                multiProcessor$zza0.zza.onNewItem(v1, object0);
                this.zzb.append(v1, multiProcessor$zza0);
            }
        }
        SparseArray sparseArray1 = detector$Detections0.getDetectedItems();
        HashSet hashSet0 = new HashSet();
        for(int v2 = 0; v2 < this.zzb.size(); ++v2) {
            int v3 = this.zzb.keyAt(v2);
            if(sparseArray1.get(v3) == null) {
                zza multiProcessor$zza1 = (zza)this.zzb.valueAt(v2);
                zza.zzb(multiProcessor$zza1);
                if(multiProcessor$zza1.zzb >= this.zzc) {
                    hashSet0.add(v3);
                }
            }
        }
        for(Object object1: hashSet0) {
            this.zzb.delete(((int)(((Integer)object1))));
        }
        SparseArray sparseArray2 = detector$Detections0.getDetectedItems();
        for(int v4 = 0; v4 < sparseArray2.size(); ++v4) {
            int v5 = sparseArray2.keyAt(v4);
            sparseArray2.valueAt(v4);
            zza.zza(((zza)this.zzb.get(v5)), 0);
        }
    }

    @Override  // com.google.android.gms.vision.Detector$Processor
    public void release() {
        for(int v = 0; v < this.zzb.size(); ++v) {
            ((zza)this.zzb.valueAt(v)).zza.onDone();
        }
        this.zzb.clear();
    }
}

