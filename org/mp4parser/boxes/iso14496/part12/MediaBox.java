package org.mp4parser.boxes.iso14496.part12;

import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.Path;

public class MediaBox extends AbstractContainerBox {
    public static final String TYPE = "mdia";

    public MediaBox() {
        super("mdia");
    }

    public HandlerBox getHandlerBox() {
        return (HandlerBox)Path.getPath(this, "hdlr[0]");
    }

    public MediaHeaderBox getMediaHeaderBox() {
        return (MediaHeaderBox)Path.getPath(this, "mdhd[0]");
    }

    public MediaInformationBox getMediaInformationBox() {
        return (MediaInformationBox)Path.getPath(this, "minf[0]");
    }
}

