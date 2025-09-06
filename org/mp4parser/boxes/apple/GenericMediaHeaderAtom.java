package org.mp4parser.boxes.apple;

import org.mp4parser.support.AbstractContainerBox;

public class GenericMediaHeaderAtom extends AbstractContainerBox {
    public static final String TYPE = "gmhd";

    public GenericMediaHeaderAtom() {
        super("gmhd");
    }
}

