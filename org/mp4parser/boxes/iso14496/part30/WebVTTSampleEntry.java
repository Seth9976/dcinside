package org.mp4parser.boxes.iso14496.part30;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.boxes.sampleentry.AbstractSampleEntry;
import org.mp4parser.tools.Path;

public class WebVTTSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "wvtt";

    public WebVTTSampleEntry() {
        super("wvtt");
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        this.writeContainer(writableByteChannel0);
    }

    public WebVTTConfigurationBox getConfig() {
        return (WebVTTConfigurationBox)Path.getPath(this, "vttC");
    }

    public WebVTTSourceLabelBox getSourceLabel() {
        return (WebVTTSourceLabelBox)Path.getPath(this, "vlab");
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        this.initContainer(readableByteChannel0, v, boxParser0);
    }
}

