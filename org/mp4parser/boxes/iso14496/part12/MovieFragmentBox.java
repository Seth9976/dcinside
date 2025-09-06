package org.mp4parser.boxes.iso14496.part12;

import java.util.ArrayList;
import java.util.List;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.Path;

public class MovieFragmentBox extends AbstractContainerBox {
    public static final String TYPE = "moof";

    public MovieFragmentBox() {
        super("moof");
    }

    public List getSyncSamples(SampleDependencyTypeBox sampleDependencyTypeBox0) {
        List list0 = new ArrayList();
        long v = 1L;
        for(Object object0: sampleDependencyTypeBox0.getEntries()) {
            if(((Entry)object0).getSampleDependsOn() == 2) {
                list0.add(v);
            }
            ++v;
        }
        return list0;
    }

    public int getTrackCount() {
        return this.getBoxes(TrackFragmentBox.class, false).size();
    }

    public List getTrackFragmentHeaderBoxes() {
        return Path.getPaths(this, "tfhd");
    }

    public long[] getTrackNumbers() {
        List list0 = this.getBoxes(TrackFragmentBox.class, false);
        long[] arr_v = new long[list0.size()];
        for(int v = 0; v < list0.size(); ++v) {
            arr_v[v] = ((TrackFragmentBox)list0.get(v)).getTrackFragmentHeaderBox().getTrackId();
        }
        return arr_v;
    }

    public List getTrackRunBoxes() {
        return this.getBoxes(TrackRunBox.class, true);
    }
}

