package org.mp4parser.boxes.iso14496.part12;

import java.util.List;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.Path;

public class MovieBox extends AbstractContainerBox {
    public static final String TYPE = "moov";

    public MovieBox() {
        super("moov");
    }

    public MovieHeaderBox getMovieHeaderBox() {
        return (MovieHeaderBox)Path.getPath(this, "mvhd");
    }

    public int getTrackCount() {
        return this.getBoxes(TrackBox.class).size();
    }

    public long[] getTrackNumbers() {
        List list0 = this.getBoxes(TrackBox.class);
        long[] arr_v = new long[list0.size()];
        for(int v = 0; v < list0.size(); ++v) {
            arr_v[v] = ((TrackBox)list0.get(v)).getTrackHeaderBox().getTrackId();
        }
        return arr_v;
    }
}

