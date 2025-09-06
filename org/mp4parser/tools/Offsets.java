package org.mp4parser.tools;

import java.util.Iterator;
import org.mp4parser.Box;
import org.mp4parser.Container;
import org.mp4parser.ParsableBox;

public class Offsets {
    public static long find(Container container0, ParsableBox parsableBox0, long v) {
        long v2;
        Iterator iterator0 = container0.getBoxes().iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                return -1L;
            }
            Object object0 = iterator0.next();
            Box box0 = (Box)object0;
            if(box0 == parsableBox0) {
                return v;
            }
            if(box0 instanceof Container) {
                long v1 = Offsets.find(((Container)box0), parsableBox0, 0L);
                if(v1 > 0L) {
                    return v1 + v;
                }
            }
            v2 = box0.getSize();
            v += v2;
        }
    }
}

