package org.mp4parser.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.support.AbstractContainerBox;

public abstract class AbstractSampleEntry extends AbstractContainerBox implements SampleEntry {
    protected int dataReferenceIndex;

    protected AbstractSampleEntry(String s) {
        super(s);
        this.dataReferenceIndex = 1;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public abstract void getBox(WritableByteChannel arg1) throws IOException;

    @Override  // org.mp4parser.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        return this.dataReferenceIndex;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public abstract void parse(ReadableByteChannel arg1, ByteBuffer arg2, long arg3, BoxParser arg4) throws IOException;

    @Override  // org.mp4parser.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int v) {
        this.dataReferenceIndex = v;
    }
}

