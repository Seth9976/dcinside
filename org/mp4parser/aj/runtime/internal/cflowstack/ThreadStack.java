package org.mp4parser.aj.runtime.internal.cflowstack;

import java.util.Stack;

public interface ThreadStack {
    Stack getThreadStack();

    void removeThreadStack();
}

