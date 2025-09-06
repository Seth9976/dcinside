package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.dvb.DvbParser;
import androidx.media3.extractor.text.pgs.PgsParser;
import androidx.media3.extractor.text.ssa.SsaParser;
import androidx.media3.extractor.text.subrip.SubripParser;
import androidx.media3.extractor.text.ttml.TtmlParser;
import androidx.media3.extractor.text.tx3g.Tx3gParser;
import androidx.media3.extractor.text.webvtt.Mp4WebvttParser;
import androidx.media3.extractor.text.webvtt.WebvttParser;
import j..util.Objects;

@UnstableApi
public final class DefaultSubtitleParserFactory implements Factory {
    // 去混淆评级： 中等(80)
    @Override  // androidx.media3.extractor.text.SubtitleParser$Factory
    public boolean a(Format format0) {
        return Objects.equals(format0.n, "text/x-ssa") || Objects.equals(format0.n, "text/vtt") || Objects.equals(format0.n, "application/x-mp4-vtt") || Objects.equals(format0.n, "application/x-subrip") || Objects.equals(format0.n, "application/x-quicktime-tx3g") || Objects.equals(format0.n, "application/pgs") || Objects.equals(format0.n, "application/dvbsubs") || Objects.equals(format0.n, "application/ttml+xml");
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser$Factory
    public int b(Format format0) {
        String s = format0.n;
        if(s != null) {
            switch(s) {
                case "application/dvbsubs": {
                    return 2;
                }
                case "application/pgs": {
                    return 2;
                }
                case "application/ttml+xml": {
                    return 1;
                }
                case "application/x-mp4-vtt": {
                    return 2;
                }
                case "application/x-quicktime-tx3g": {
                    return 2;
                }
                case "application/x-subrip": {
                    return 1;
                }
                case "text/vtt": {
                    return 1;
                }
                case "text/x-ssa": {
                    return 1;
                }
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + s);
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser$Factory
    public SubtitleParser c(Format format0) {
        String s = format0.n;
        if(s != null) {
            switch(s) {
                case "application/dvbsubs": {
                    return new DvbParser(format0.q);
                }
                case "application/pgs": {
                    return new PgsParser();
                }
                case "application/ttml+xml": {
                    return new TtmlParser();
                }
                case "application/x-mp4-vtt": {
                    return new Mp4WebvttParser();
                }
                case "application/x-quicktime-tx3g": {
                    return new Tx3gParser(format0.q);
                }
                case "application/x-subrip": {
                    return new SubripParser();
                }
                case "text/vtt": {
                    return new WebvttParser();
                }
                case "text/x-ssa": {
                    return new SsaParser(format0.q);
                }
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + s);
    }
}

