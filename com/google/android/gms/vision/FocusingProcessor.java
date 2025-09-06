package com.google.android.gms.vision;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;

public abstract class FocusingProcessor implements Processor {
    private Detector zza;
    private Tracker zzb;
    private int zzc;
    private boolean zzd;
    private int zze;
    private int zzf;

    public FocusingProcessor(@RecentlyNonNull Detector detector0, @RecentlyNonNull Tracker tracker0) {
        this.zzc = 3;
        this.zzd = false;
        this.zzf = 0;
        this.zza = detector0;
        this.zzb = tracker0;
    }

    @Override  // com.google.android.gms.vision.Detector$Processor
    public void receiveDetections(@RecentlyNonNull Detections detector$Detections0) {
        SparseArray sparseArray0 = detector$Detections0.getDetectedItems();
        if(sparseArray0.size() == 0) {
            if(this.zzf == this.zzc) {
                this.zzd = false;
            }
            ++this.zzf;
            return;
        }
        this.zzf = 0;
        if(this.zzd) {
            if(sparseArray0.get(this.zze) != null) {
                return;
            }
            this.zzd = false;
        }
        int v = this.selectFocus(detector$Detections0);
        Object object0 = sparseArray0.get(v);
        if(object0 == null) {
            Log.w("FocusingProcessor", "Invalid focus selected: " + v);
            return;
        }
        this.zzd = true;
        this.zze = v;
        this.zza.setFocus(v);
        this.zzb.onNewItem(this.zze, object0);
    }

    @Override  // com.google.android.gms.vision.Detector$Processor
    public void release() {
    }

    public abstract int selectFocus(@RecentlyNonNull Detections arg1);

    protected final void zza(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Invalid max gap: " + v);
        }
        this.zzc = v;
    }
}

