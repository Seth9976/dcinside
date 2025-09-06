package org.mp4parser.boxes.iso14496.part12;

import java.util.Iterator;
import org.mp4parser.Box;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.support.DoNotParseDetail;

public class TrackFragmentBox extends AbstractContainerBox {
    public static final String TYPE = "traf";

    public TrackFragmentBox() {
        super("traf");
    }

    @DoNotParseDetail
    public TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
        Box box0;
        Iterator iterator0 = this.getBoxes().iterator();
        do {
            if(!iterator0.hasNext()) {
                return null;
            }
            Object object0 = iterator0.next();
            box0 = (Box)object0;
        }
        while(!(box0 instanceof TrackFragmentHeaderBox));
        return (TrackFragmentHeaderBox)box0;
    }
}

