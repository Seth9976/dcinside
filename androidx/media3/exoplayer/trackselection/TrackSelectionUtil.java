package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks.Group;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.util.Arrays;
import java.util.List;

@UnstableApi
public final class TrackSelectionUtil {
    public interface AdaptiveTrackSelectionFactory {
        ExoTrackSelection a(Definition arg1);
    }

    public static Tracks a(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, TrackSelection[] arr_trackSelection) {
        List[] arr_list = new List[arr_trackSelection.length];
        for(int v = 0; v < arr_trackSelection.length; ++v) {
            TrackSelection trackSelection0 = arr_trackSelection[v];
            arr_list[v] = trackSelection0 == null ? O2.A() : O2.B(trackSelection0);
        }
        return TrackSelectionUtil.b(mappingTrackSelector$MappedTrackInfo0, arr_list);
    }

    public static Tracks b(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, List[] arr_list) {
        boolean z1;
        a o2$a0 = new a();
        int v = 0;
        while(v < mappingTrackSelector$MappedTrackInfo0.d()) {
            TrackGroupArray trackGroupArray0 = mappingTrackSelector$MappedTrackInfo0.h(v);
            List list0 = arr_list[v];
            int v1 = 0;
            while(v1 < trackGroupArray0.a) {
                TrackGroup trackGroup0 = trackGroupArray0.c(v1);
                boolean z = mappingTrackSelector$MappedTrackInfo0.a(v, v1, false) != 0;
                int[] arr_v = new int[trackGroup0.a];
                boolean[] arr_z = new boolean[trackGroup0.a];
                int v2 = 0;
                while(v2 < trackGroup0.a) {
                    arr_v[v2] = mappingTrackSelector$MappedTrackInfo0.i(v, v1, v2);
                    int v3 = 0;
                    while(true) {
                        z1 = false;
                        if(v3 < list0.size()) {
                            TrackSelection trackSelection0 = (TrackSelection)list0.get(v3);
                            if(!trackSelection0.i().equals(trackGroup0) || trackSelection0.h(v2) == -1) {
                                ++v3;
                                continue;
                            }
                            else {
                                z1 = true;
                            }
                        }
                        break;
                    }
                    arr_z[v2] = z1;
                    ++v2;
                }
                o2$a0.j(new Group(trackGroup0, z, arr_v, arr_z));
                ++v1;
            }
            ++v;
        }
        TrackGroupArray trackGroupArray1 = mappingTrackSelector$MappedTrackInfo0.k();
        for(int v4 = 0; v4 < trackGroupArray1.a; ++v4) {
            TrackGroup trackGroup1 = trackGroupArray1.c(v4);
            int[] arr_v1 = new int[trackGroup1.a];
            Arrays.fill(arr_v1, 0);
            o2$a0.j(new Group(trackGroup1, false, arr_v1, new boolean[trackGroup1.a]));
        }
        return new Tracks(o2$a0.n());
    }

    public static FallbackOptions c(ExoTrackSelection exoTrackSelection0) {
        long v = SystemClock.elapsedRealtime();
        int v1 = exoTrackSelection0.length();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(exoTrackSelection0.b(v2, v)) {
                ++v3;
            }
        }
        return new FallbackOptions(1, 0, v1, v3);
    }

    public static ExoTrackSelection[] d(Definition[] arr_exoTrackSelection$Definition, AdaptiveTrackSelectionFactory trackSelectionUtil$AdaptiveTrackSelectionFactory0) {
        ExoTrackSelection[] arr_exoTrackSelection = new ExoTrackSelection[arr_exoTrackSelection$Definition.length];
        boolean z = false;
        for(int v = 0; v < arr_exoTrackSelection$Definition.length; ++v) {
            Definition exoTrackSelection$Definition0 = arr_exoTrackSelection$Definition[v];
            if(exoTrackSelection$Definition0 != null) {
                int[] arr_v = exoTrackSelection$Definition0.b;
                if(arr_v.length <= 1 || z) {
                    arr_exoTrackSelection[v] = new FixedTrackSelection(exoTrackSelection$Definition0.a, arr_v[0], exoTrackSelection$Definition0.c);
                }
                else {
                    arr_exoTrackSelection[v] = trackSelectionUtil$AdaptiveTrackSelectionFactory0.a(exoTrackSelection$Definition0);
                    z = true;
                }
            }
        }
        return arr_exoTrackSelection;
    }

    @Deprecated
    public static Parameters e(Parameters defaultTrackSelector$Parameters0, int v, TrackGroupArray trackGroupArray0, boolean z, @Nullable SelectionOverride defaultTrackSelector$SelectionOverride0) {
        Builder defaultTrackSelector$Parameters$Builder0 = defaultTrackSelector$Parameters0.O().R0(v).N1(v, z);
        if(defaultTrackSelector$SelectionOverride0 != null) {
            defaultTrackSelector$Parameters$Builder0.P1(v, trackGroupArray0, defaultTrackSelector$SelectionOverride0);
        }
        return defaultTrackSelector$Parameters$Builder0.L0();
    }
}

