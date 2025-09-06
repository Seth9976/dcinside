package org.mp4parser.boxes.iso14496.part12;

import java.util.Iterator;
import org.mp4parser.Box;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.Path;

public class SampleTableBox extends AbstractContainerBox {
    public static final String TYPE = "stbl";
    private SampleToChunkBox sampleToChunkBox;

    public SampleTableBox() {
        super("stbl");
    }

    public ChunkOffsetBox getChunkOffsetBox() {
        Box box0;
        Iterator iterator0 = this.getBoxes().iterator();
        do {
            if(!iterator0.hasNext()) {
                return null;
            }
            Object object0 = iterator0.next();
            box0 = (Box)object0;
        }
        while(!(box0 instanceof ChunkOffsetBox));
        return (ChunkOffsetBox)box0;
    }

    public CompositionTimeToSample getCompositionTimeToSample() {
        return (CompositionTimeToSample)Path.getPath(this, "ctts");
    }

    public SampleDependencyTypeBox getSampleDependencyTypeBox() {
        return (SampleDependencyTypeBox)Path.getPath(this, "sdtp");
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return (SampleDescriptionBox)Path.getPath(this, "stsd");
    }

    public SampleSizeBox getSampleSizeBox() {
        return (SampleSizeBox)Path.getPath(this, "stsz");
    }

    public SampleToChunkBox getSampleToChunkBox() {
        return (SampleToChunkBox)Path.getPath(this, "stsc");
    }

    public SyncSampleBox getSyncSampleBox() {
        return (SyncSampleBox)Path.getPath(this, "stss");
    }

    public TimeToSampleBox getTimeToSampleBox() {
        return (TimeToSampleBox)Path.getPath(this, "stts");
    }
}

