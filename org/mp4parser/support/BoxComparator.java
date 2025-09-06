package org.mp4parser.support;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.Iterator;
import org.junit.Assert;
import org.mp4parser.Box;
import org.mp4parser.Container;
import org.mp4parser.tools.Path;

public class BoxComparator {
    public static void check(Container container0, Box box0, Container container1, Box box1, String[] arr_s) throws IOException {
        Assert.assertEquals(box0.getType(), box1.getType());
        if(!BoxComparator.isIgnore(container0, box0, arr_s)) {
            Assert.assertEquals(("Type differs. \ntypetrace ref : " + box0 + "\ntypetrace new : " + box1), box0.getType(), box1.getType());
            if((!(box1 instanceof Container) ^ box0 instanceof Container) != 0) {
                if(box0 instanceof Container) {
                    BoxComparator.check(container0, ((Container)box0), container1, ((Container)box1), arr_s);
                    return;
                }
                BoxComparator.checkBox(container0, box0, container1, box1, arr_s);
                return;
            }
            Assert.fail("Either both boxes are container boxes or none");
        }
    }

    public static void check(Container container0, Container container1, Container container2, Container container3, String[] arr_s) throws IOException {
        Iterator iterator0 = container1.getBoxes().iterator();
        Iterator iterator1 = container3.getBoxes().iterator();
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = iterator1.next();
            BoxComparator.check(container0, ((Box)object0), container2, ((Box)object1), arr_s);
        }
        if(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            Assert.fail(("There is a box missing in the current output of the tool: " + object2));
        }
        if(iterator1.hasNext()) {
            Object object3 = iterator1.next();
            Assert.fail(("There is a box too much in the current output of the tool: " + object3));
        }
    }

    public static void check(Container container0, Container container1, String[] arr_s) throws IOException {
        BoxComparator.check(container0, container0, container1, container1, arr_s);
    }

    private static void checkBox(Container container0, Box box0, Container container1, Box box1, String[] arr_s) throws IOException {
        if(!BoxComparator.isIgnore(container0, box0, arr_s)) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            box0.getBox(Channels.newChannel(byteArrayOutputStream0));
            box1.getBox(Channels.newChannel(byteArrayOutputStream1));
            byteArrayOutputStream0.close();
            byteArrayOutputStream1.close();
            Assert.assertArrayEquals(("Box at " + box0 + " differs from reference\n\n" + box0.toString() + "\n" + box1.toString()), byteArrayOutputStream0.toByteArray(), byteArrayOutputStream1.toByteArray());
        }
    }

    public static boolean isIgnore(Container container0, Box box0, String[] arr_s) {
        for(int v = 0; true; ++v) {
            if(v >= arr_s.length) {
                return false;
            }
            if(Path.isContained(container0, box0, arr_s[v])) {
                return true;
            }
        }
    }
}

