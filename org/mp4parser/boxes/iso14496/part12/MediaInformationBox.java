package org.mp4parser.boxes.iso14496.part12;

import java.util.Iterator;
import org.mp4parser.Box;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.Path;

public class MediaInformationBox extends AbstractContainerBox {
    public static final String TYPE = "minf";

    public MediaInformationBox() {
        super("minf");
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        Box box0;
        Iterator iterator0 = this.getBoxes().iterator();
        do {
            if(!iterator0.hasNext()) {
                return null;
            }
            Object object0 = iterator0.next();
            box0 = (Box)object0;
        }
        while(!(box0 instanceof AbstractMediaHeaderBox));
        return (AbstractMediaHeaderBox)box0;
    }

    public SampleTableBox getSampleTableBox() {
        return (SampleTableBox)Path.getPath(this, "stbl[0]");
    }
}

