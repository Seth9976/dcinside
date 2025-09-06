package androidx.media3.exoplayer.trackselection;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.Y0;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.TrackGroupArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

@UnstableApi
public abstract class MappingTrackSelector extends TrackSelector {
    public static final class MappedTrackInfo {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        public @interface RendererSupport {
        }

        private final int a;
        private final String[] b;
        private final int[] c;
        private final TrackGroupArray[] d;
        private final int[] e;
        private final int[][][] f;
        private final TrackGroupArray g;
        public static final int h = 0;
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 3;

        @VisibleForTesting
        MappedTrackInfo(String[] arr_s, int[] arr_v, TrackGroupArray[] arr_trackGroupArray, int[] arr_v1, int[][][] arr3_v, TrackGroupArray trackGroupArray0) {
            this.b = arr_s;
            this.c = arr_v;
            this.d = arr_trackGroupArray;
            this.f = arr3_v;
            this.e = arr_v1;
            this.g = trackGroupArray0;
            this.a = arr_v.length;
        }

        public int a(int v, int v1, boolean z) {
            int v2 = this.d[v].c(v1).a;
            int[] arr_v = new int[v2];
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                int v5 = this.i(v, v1, v3);
                if(v5 == 4 || z && v5 == 3) {
                    arr_v[v4] = v3;
                    ++v4;
                }
            }
            return this.b(v, v1, Arrays.copyOf(arr_v, v4));
        }

        public int b(int v, int v1, int[] arr_v) {
            int v2 = 0;
            String s = null;
            int v3 = 0;
            int v5 = 16;
            for(int v4 = 0; v2 < arr_v.length; ++v4) {
                int v6 = arr_v[v2];
                String s1 = this.d[v].c(v1).c(v6).n;
                if(v4 == 0) {
                    s = s1;
                }
                else {
                    v3 |= !Util.g(s, s1);
                }
                v5 = Math.min(v5, Y0.h(this.f[v][v1][v2]));
                ++v2;
            }
            return v3 == 0 ? v5 : Math.min(v5, this.e[v]);
        }

        public int c(int v, int v1, int v2) {
            return this.f[v][v1][v2];
        }

        public int d() {
            return this.a;
        }

        public String e(int v) {
            return this.b[v];
        }

        public int f(int v) {
            int[][] arr2_v = this.f[v];
            int v2 = 0;
            for(int v1 = 0; v1 < arr2_v.length; ++v1) {
                int[] arr_v = arr2_v[v1];
                for(int v3 = 0; v3 < arr_v.length; ++v3) {
                    int v4 = Y0.k(arr_v[v3]);
                    int v5 = 1;
                    if(v4 != 0 && v4 != 1) {
                        switch(v4) {
                            case 2: {
                                break;
                            }
                            case 3: {
                                v5 = 2;
                                break;
                            }
                            case 4: {
                                return 3;
                            }
                            default: {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    v2 = Math.max(v2, v5);
                }
            }
            return v2;
        }

        public int g(int v) {
            return this.c[v];
        }

        public TrackGroupArray h(int v) {
            return this.d[v];
        }

        public int i(int v, int v1, int v2) {
            return Y0.k(this.c(v, v1, v2));
        }

        public int j(int v) {
            int v2 = 0;
            for(int v1 = 0; v1 < this.a; ++v1) {
                if(this.c[v1] == v) {
                    v2 = Math.max(v2, this.f(v1));
                }
            }
            return v2;
        }

        public TrackGroupArray k() {
            return this.g;
        }
    }

    @Nullable
    private MappedTrackInfo c;

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void i(@Nullable Object object0) {
        this.c = (MappedTrackInfo)object0;
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelector
    public final TrackSelectorResult k(RendererCapabilities[] arr_rendererCapabilities, TrackGroupArray trackGroupArray0, MediaPeriodId mediaSource$MediaPeriodId0, Timeline timeline0) throws ExoPlaybackException {
        int[] arr_v = new int[arr_rendererCapabilities.length + 1];
        int v = arr_rendererCapabilities.length + 1;
        TrackGroup[][] arr2_trackGroup = new TrackGroup[v][];
        int[][][] arr3_v = new int[arr_rendererCapabilities.length + 1][][];
        for(int v2 = 0; v2 < v; ++v2) {
            arr2_trackGroup[v2] = new TrackGroup[trackGroupArray0.a];
            arr3_v[v2] = new int[trackGroupArray0.a][];
        }
        int[] arr_v1 = MappingTrackSelector.q(arr_rendererCapabilities);
        for(int v3 = 0; v3 < trackGroupArray0.a; ++v3) {
            TrackGroup trackGroup0 = trackGroupArray0.c(v3);
            int v4 = MappingTrackSelector.n(arr_rendererCapabilities, trackGroup0, arr_v, trackGroup0.c == 5);
            int[] arr_v2 = v4 == arr_rendererCapabilities.length ? new int[trackGroup0.a] : MappingTrackSelector.p(arr_rendererCapabilities[v4], trackGroup0);
            int v5 = arr_v[v4];
            arr2_trackGroup[v4][v5] = trackGroup0;
            arr3_v[v4][v5] = arr_v2;
            arr_v[v4] = v5 + 1;
        }
        TrackGroupArray[] arr_trackGroupArray = new TrackGroupArray[arr_rendererCapabilities.length];
        String[] arr_s = new String[arr_rendererCapabilities.length];
        int[] arr_v3 = new int[arr_rendererCapabilities.length];
        for(int v1 = 0; v1 < arr_rendererCapabilities.length; ++v1) {
            int v6 = arr_v[v1];
            arr_trackGroupArray[v1] = new TrackGroupArray(((TrackGroup[])Util.L1(arr2_trackGroup[v1], v6)));
            arr3_v[v1] = (int[][])Util.L1(arr3_v[v1], v6);
            arr_s[v1] = arr_rendererCapabilities[v1].getName();
            arr_v3[v1] = arr_rendererCapabilities[v1].g();
        }
        MappedTrackInfo mappingTrackSelector$MappedTrackInfo0 = new MappedTrackInfo(arr_s, arr_v3, arr_trackGroupArray, arr_v1, arr3_v, new TrackGroupArray(((TrackGroup[])Util.L1(arr2_trackGroup[arr_rendererCapabilities.length], arr_v[arr_rendererCapabilities.length]))));
        Pair pair0 = this.r(mappingTrackSelector$MappedTrackInfo0, arr3_v, arr_v1, mediaSource$MediaPeriodId0, timeline0);
        Tracks tracks0 = TrackSelectionUtil.a(mappingTrackSelector$MappedTrackInfo0, ((TrackSelection[])pair0.second));
        return new TrackSelectorResult(((RendererConfiguration[])pair0.first), ((ExoTrackSelection[])pair0.second), tracks0, mappingTrackSelector$MappedTrackInfo0);
    }

    private static int n(RendererCapabilities[] arr_rendererCapabilities, TrackGroup trackGroup0, int[] arr_v, boolean z) throws ExoPlaybackException {
        int v = arr_rendererCapabilities.length;
        int v2 = 0;
        int v3 = 1;
        for(int v1 = 0; v1 < arr_rendererCapabilities.length; ++v1) {
            RendererCapabilities rendererCapabilities0 = arr_rendererCapabilities[v1];
            int v5 = 0;
            for(int v4 = 0; v4 < trackGroup0.a; ++v4) {
                v5 = Math.max(v5, Y0.k(rendererCapabilities0.a(trackGroup0.c(v4))));
            }
            int v6 = arr_v[v1] == 0 ? 1 : 0;
            if(v5 > v2 || v5 == v2 && z && v3 == 0 && v6 != 0) {
                v = v1;
                v3 = v6;
                v2 = v5;
            }
        }
        return v;
    }

    @Nullable
    public final MappedTrackInfo o() {
        return this.c;
    }

    private static int[] p(RendererCapabilities rendererCapabilities0, TrackGroup trackGroup0) throws ExoPlaybackException {
        int[] arr_v = new int[trackGroup0.a];
        for(int v = 0; v < trackGroup0.a; ++v) {
            arr_v[v] = rendererCapabilities0.a(trackGroup0.c(v));
        }
        return arr_v;
    }

    private static int[] q(RendererCapabilities[] arr_rendererCapabilities) throws ExoPlaybackException {
        int[] arr_v = new int[arr_rendererCapabilities.length];
        for(int v = 0; v < arr_rendererCapabilities.length; ++v) {
            arr_v[v] = arr_rendererCapabilities[v].F();
        }
        return arr_v;
    }

    protected abstract Pair r(MappedTrackInfo arg1, int[][][] arg2, int[] arg3, MediaPeriodId arg4, Timeline arg5) throws ExoPlaybackException;
}

