package org.mp4parser.boxes.iso14496.part12;

import org.mp4parser.support.AbstractContainerBox;

public class TrackReferenceBox extends AbstractContainerBox {
    public static final String TYPE = "tref";

    public TrackReferenceBox() {
        super("tref");
    }
}

