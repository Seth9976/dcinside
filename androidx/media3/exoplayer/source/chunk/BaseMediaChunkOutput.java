package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.TrackOutput;

@UnstableApi
public final class BaseMediaChunkOutput implements TrackOutputProvider {
    private final int[] a;
    private final SampleQueue[] b;
    private static final String c = "BaseMediaChunkOutput";

    public BaseMediaChunkOutput(int[] arr_v, SampleQueue[] arr_sampleQueue) {
        this.a = arr_v;
        this.b = arr_sampleQueue;
    }

    public int[] a() {
        int[] arr_v = new int[this.b.length];
        for(int v = 0; true; ++v) {
            SampleQueue[] arr_sampleQueue = this.b;
            if(v >= arr_sampleQueue.length) {
                break;
            }
            arr_v[v] = arr_sampleQueue[v].J();
        }
        return arr_v;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor$TrackOutputProvider
    public TrackOutput b(int v, int v1) {
        for(int v2 = 0; true; ++v2) {
            int[] arr_v = this.a;
            if(v2 >= arr_v.length) {
                break;
            }
            if(v1 == arr_v[v2]) {
                return this.b[v2];
            }
        }
        Log.d("BaseMediaChunkOutput", "Unmatched track of type: " + v1);
        return new DiscardingTrackOutput();
    }

    public void c(long v) {
        SampleQueue[] arr_sampleQueue = this.b;
        for(int v1 = 0; v1 < arr_sampleQueue.length; ++v1) {
            arr_sampleQueue[v1].d0(v);
        }
    }
}

