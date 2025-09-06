package org.mp4parser;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public interface Container {
    List getBoxes();

    List getBoxes(Class arg1);

    List getBoxes(Class arg1, boolean arg2);

    void setBoxes(List arg1);

    void writeContainer(WritableByteChannel arg1) throws IOException;
}

