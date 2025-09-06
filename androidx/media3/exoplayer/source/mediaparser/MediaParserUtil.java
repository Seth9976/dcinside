package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;

@UnstableApi
public final class MediaParserUtil {
    @RequiresApi(0x1F)
    static final class Api31 {
        @DoNotInline
        public static void a(MediaParser mediaParser0, PlayerId playerId0) {
            LogSessionId logSessionId0 = playerId0.a();
            if(!logSessionId0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                mediaParser0.setLogSessionId(logSessionId0);
            }
        }
    }

    public static final String a = "android.media.mediaparser.inBandCryptoInfo";
    public static final String b = "android.media.mediaparser.includeSupplementalData";
    public static final String c = "android.media.mediaparser.eagerlyExposeTrackType";
    public static final String d = "android.media.mediaparser.exposeDummySeekMap";
    public static final String e = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";
    public static final String f = "android.media.mediaParser.overrideInBandCaptionDeclarations";
    public static final String g = "android.media.mediaParser.exposeCaptionFormats";
    public static final String h = "android.media.mediaparser.ignoreTimestampOffset";

    @RequiresApi(0x1F)
    public static void a(MediaParser mediaParser0, PlayerId playerId0) {
        Api31.a(mediaParser0, playerId0);
    }

    public static MediaFormat b(Format format0) {
        MediaFormat mediaFormat0 = new MediaFormat();
        mediaFormat0.setString("mime", format0.n);
        int v = format0.G;
        if(v != -1) {
            mediaFormat0.setInteger("caption-service-number", v);
        }
        return mediaFormat0;
    }
}

