package org.mp4parser;

import java.io.EOFException;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicContainer implements Container {
    private List boxes;

    public BasicContainer() {
        this.boxes = new ArrayList();
    }

    public BasicContainer(List list0) {
        new ArrayList();
        this.boxes = list0;
    }

    public void addBox(Box box0) {
        if(box0 != null) {
            ArrayList arrayList0 = new ArrayList(this.getBoxes());
            this.boxes = arrayList0;
            arrayList0.add(box0);
        }
    }

    @Override  // org.mp4parser.Container
    public List getBoxes() {
        return this.boxes;
    }

    @Override  // org.mp4parser.Container
    public List getBoxes(Class class0) {
        List list0 = null;
        Box box0 = null;
        for(Object object0: this.getBoxes()) {
            Box box1 = (Box)object0;
            if(!class0.isInstance(box1)) {
            }
            else if(box0 == null) {
                box0 = box1;
            }
            else {
                if(list0 == null) {
                    list0 = new ArrayList(2);
                    list0.add(box0);
                }
                list0.add(box1);
            }
        }
        if(list0 != null) {
            return list0;
        }
        return box0 == null ? Collections.emptyList() : Collections.singletonList(box0);
    }

    @Override  // org.mp4parser.Container
    public List getBoxes(Class class0, boolean z) {
        List list0 = new ArrayList(2);
        List list1 = this.getBoxes();
        for(int v = 0; v < list1.size(); ++v) {
            Box box0 = (Box)list1.get(v);
            if(class0.isInstance(box0)) {
                list0.add(box0);
            }
            if(z && box0 instanceof Container) {
                list0.addAll(((Container)box0).getBoxes(class0, true));
            }
        }
        return list0;
    }

    protected long getContainerSize() {
        long v = 0L;
        for(int v1 = 0; v1 < this.getBoxes().size(); ++v1) {
            v += ((Box)this.boxes.get(v1)).getSize();
        }
        return v;
    }

    public void initContainer(ReadableByteChannel readableByteChannel0, long v, BoxParser boxParser0) throws IOException {
        long v1 = 0L;
        while(true) {
            int v2 = Long.compare(v, 0L);
            if(v2 >= 0 && v1 >= v) {
                return;
            }
            try {
                ParsableBox parsableBox0 = boxParser0.parseBox(readableByteChannel0, (this instanceof ParsableBox ? ((ParsableBox)this).getType() : null));
                this.boxes.add(parsableBox0);
                v1 += parsableBox0.getSize();
                continue;
            label_9:
                if(v2 >= 0) {
                    throw eOFException0;
                }
                break;
            }
            catch(EOFException eOFException0) {
                goto label_9;
            }
        }
    }

    @Override  // org.mp4parser.Container
    public void setBoxes(List list0) {
        this.boxes = new ArrayList(list0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append("[");
        for(int v = 0; v < this.boxes.size(); ++v) {
            if(v > 0) {
                stringBuilder0.append(";");
            }
            stringBuilder0.append(((Box)this.boxes.get(v)).toString());
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // org.mp4parser.Container
    public final void writeContainer(WritableByteChannel writableByteChannel0) throws IOException {
        for(Object object0: this.getBoxes()) {
            ((Box)object0).getBox(writableByteChannel0);
        }
    }
}

