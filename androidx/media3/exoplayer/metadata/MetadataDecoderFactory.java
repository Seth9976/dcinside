package androidx.media3.exoplayer.metadata;

import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.MetadataDecoder;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.metadata.emsg.EventMessageDecoder;
import androidx.media3.extractor.metadata.icy.IcyDecoder;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.scte35.SpliceInfoDecoder;

@UnstableApi
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory a;

    static {
        MetadataDecoderFactory.a = new MetadataDecoderFactory() {
            // 去混淆评级： 中等(50)
            @Override  // androidx.media3.exoplayer.metadata.MetadataDecoderFactory
            public boolean a(Format format0) {
                return "application/id3".equals(format0.n) || "application/x-emsg".equals(format0.n) || "application/x-scte35".equals(format0.n) || "application/x-icy".equals(format0.n) || "application/vnd.dvb.ait".equals(format0.n);
            }

            @Override  // androidx.media3.exoplayer.metadata.MetadataDecoderFactory
            public MetadataDecoder b(Format format0) {
                String s = format0.n;
                if(s != null) {
                    switch(s) {
                        case "application/id3": {
                            return new Id3Decoder();
                        }
                        case "application/vnd.dvb.ait": {
                            return new AppInfoTableDecoder();
                        }
                        case "application/x-emsg": {
                            return new EventMessageDecoder();
                        }
                        case "application/x-icy": {
                            return new IcyDecoder();
                        }
                        case "application/x-scte35": {
                            return new SpliceInfoDecoder();
                        }
                    }
                }
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + s);
            }
        };
    }

    boolean a(Format arg1);

    MetadataDecoder b(Format arg1);
}

