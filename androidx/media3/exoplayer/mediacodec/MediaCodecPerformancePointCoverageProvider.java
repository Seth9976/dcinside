package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint;
import android.media.MediaCodecInfo.VideoCapabilities;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import java.util.List;

final class MediaCodecPerformancePointCoverageProvider {
    @RequiresApi(29)
    static final class Api29 {
        @DoNotInline
        public static int a(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1, double f) {
            List list0 = mediaCodecInfo$VideoCapabilities0.getSupportedPerformancePoints();
            if(list0 != null && !list0.isEmpty()) {
                int v2 = Api29.b(list0, r.a(v, v1, ((int)f)));
                if(v2 == 1 && MediaCodecPerformancePointCoverageProvider.a == null) {
                    MediaCodecPerformancePointCoverageProvider.a = Boolean.valueOf(Api29.c());
                    return MediaCodecPerformancePointCoverageProvider.a.booleanValue() ? 0 : v2;
                }
                return v2;
            }
            return 0;
        }

        private static int b(List list0, MediaCodecInfo.VideoCapabilities.PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint0) {
            for(int v = 0; v < list0.size(); ++v) {
                if(p.a(list0.get(v)).covers(mediaCodecInfo$VideoCapabilities$PerformancePoint0)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean c() {
            List list1;
            if(Util.a >= 35) {
                return false;
            }
            try {
                Format format0 = new Builder().o0("video/avc").K();
                List list0 = MediaCodecUtil.w(MediaCodecSelector.a, format0, false, false);
                int v = 0;
                while(v < list0.size()) {
                    if(((MediaCodecInfo)list0.get(v)).d == null || ((MediaCodecInfo)list0.get(v)).d.getVideoCapabilities() == null) {
                        ++v;
                        continue;
                    }
                    else {
                        list1 = ((MediaCodecInfo)list0.get(v)).d.getVideoCapabilities().getSupportedPerformancePoints();
                        if(list1 == null || list1.isEmpty()) {
                            ++v;
                            continue;
                        }
                    }
                    return Api29.b(list1, r.a(0x500, 720, 60)) == 1;
                }
            }
            catch(DecoderQueryException unused_ex) {
            }
            return true;
        }
    }

    private static Boolean a = null;
    static final int b = 0;
    static final int c = 1;
    static final int d = 2;

    // 去混淆评级： 低(20)
    public static int c(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1, double f) {
        return Util.a < 29 || MediaCodecPerformancePointCoverageProvider.a != null && MediaCodecPerformancePointCoverageProvider.a.booleanValue() ? 0 : Api29.a(mediaCodecInfo$VideoCapabilities0, v, v1, f);
    }
}

