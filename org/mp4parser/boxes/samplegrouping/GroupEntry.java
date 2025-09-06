package org.mp4parser.boxes.samplegrouping;

import java.nio.ByteBuffer;

public abstract class GroupEntry {
    public abstract ByteBuffer get();

    public abstract String getType();

    public abstract void parse(ByteBuffer arg1);

    public int size() {
        return this.get().limit();
    }
}

