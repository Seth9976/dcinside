package org.mp4parser.aj.runtime.reflect;

import org.mp4parser.aj.lang.reflect.SourceLocation;

class SourceLocationImpl implements SourceLocation {
    String fileName;
    int line;
    Class withinType;

    SourceLocationImpl(Class class0, String s, int v) {
        this.withinType = class0;
        this.fileName = s;
        this.line = v;
    }

    @Override  // org.mp4parser.aj.lang.reflect.SourceLocation
    public int getColumn() {
        return -1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.SourceLocation
    public String getFileName() {
        return this.fileName;
    }

    @Override  // org.mp4parser.aj.lang.reflect.SourceLocation
    public int getLine() {
        return this.line;
    }

    @Override  // org.mp4parser.aj.lang.reflect.SourceLocation
    public Class getWithinType() {
        return this.withinType;
    }

    @Override
    public String toString() {
        return this.getFileName() + ":" + this.getLine();
    }
}

