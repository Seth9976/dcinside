package org.mp4parser.boxes.iso14496.part12;

import java.util.List;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.Path;

public class TrackBox extends AbstractContainerBox {
    public static final String TYPE = "trak";
    private SampleTableBox sampleTableBox;

    public TrackBox() {
        super("trak");
    }

    public MediaBox getMediaBox() {
        return (MediaBox)Path.getPath(this, "mdia[0]");
    }

    public SampleTableBox getSampleTableBox() {
        SampleTableBox sampleTableBox0 = this.sampleTableBox;
        if(sampleTableBox0 != null) {
            return sampleTableBox0;
        }
        MediaBox mediaBox0 = this.getMediaBox();
        if(mediaBox0 != null) {
            MediaInformationBox mediaInformationBox0 = mediaBox0.getMediaInformationBox();
            if(mediaInformationBox0 != null) {
                SampleTableBox sampleTableBox1 = mediaInformationBox0.getSampleTableBox();
                this.sampleTableBox = sampleTableBox1;
                return sampleTableBox1;
            }
        }
        return null;
    }

    public TrackHeaderBox getTrackHeaderBox() {
        return (TrackHeaderBox)Path.getPath(this, "tkhd[0]");
    }

    @Override  // org.mp4parser.BasicContainer
    public void setBoxes(List list0) {
        super.setBoxes(list0);
        this.sampleTableBox = null;
    }
}

