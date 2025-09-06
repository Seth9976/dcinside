package org.mp4parser.tools;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mp4parser.Box;
import org.mp4parser.Container;
import org.mp4parser.ParsableBox;
import org.mp4parser.support.AbstractContainerBox;

public class Path {
    static Pattern component;

    static {
        Path.component = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static Box getPath(Box box0, String s) {
        List list0 = Path.getPaths(box0, s, true);
        return list0.isEmpty() ? null : ((Box)list0.get(0));
    }

    public static Box getPath(Container container0, String s) {
        List list0 = Path.getPaths(container0, s, true);
        return list0.isEmpty() ? null : ((Box)list0.get(0));
    }

    public static Box getPath(AbstractContainerBox abstractContainerBox0, String s) {
        List list0 = Path.getPaths(abstractContainerBox0, s, true);
        return list0.isEmpty() ? null : ((Box)list0.get(0));
    }

    private static List getPaths(Object object0, String s, boolean z) {
        String s1;
        int v = 0;
        if(s.startsWith("/")) {
            throw new RuntimeException("Cannot start at / - only relative path expression into the structure are allowed");
        }
        if(s.length() == 0) {
            if(!(object0 instanceof ParsableBox)) {
                throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
            }
            return Collections.singletonList(((Box)object0));
        }
        if(s.contains("/")) {
            s1 = s.substring(s.indexOf(0x2F) + 1);
            s = s.substring(0, s.indexOf(0x2F));
        }
        else {
            s1 = "";
        }
        Matcher matcher0 = Path.component.matcher(s);
        if(!matcher0.matches()) {
            throw new RuntimeException(s + " is invalid path.");
        }
        String s2 = matcher0.group(1);
        if("..".equals(s2)) {
            throw new RuntimeException(".. notation no longer allowed");
        }
        if(object0 instanceof Container) {
            int v1 = matcher0.group(2) == null ? -1 : Integer.parseInt(matcher0.group(3));
            List list0 = new LinkedList();
            Iterator iterator0 = ((Container)object0).getBoxes().iterator();
            do {
                if(!iterator0.hasNext()) {
                    return list0;
                }
                Object object1 = iterator0.next();
                Box box0 = (Box)object1;
                if(box0.getType().matches(s2)) {
                    if(v1 == -1 || v1 == v) {
                        list0.addAll(Path.getPaths(box0, s1, z));
                    }
                    ++v;
                }
            }
            while(!z && v1 < 0 || list0.isEmpty());
            return list0;
        }
        return Collections.emptyList();
    }

    public static List getPaths(Box box0, String s) {
        return Path.getPaths(box0, s, false);
    }

    public static List getPaths(Container container0, String s) {
        return Path.getPaths(container0, s, false);
    }

    private static List getPaths(Container container0, String s, boolean z) {
        return Path.getPaths(container0, s, z);
    }

    private static List getPaths(ParsableBox parsableBox0, String s, boolean z) {
        return Path.getPaths(parsableBox0, s, z);
    }

    private static List getPaths(AbstractContainerBox abstractContainerBox0, String s, boolean z) {
        return Path.getPaths(abstractContainerBox0, s, z);
    }

    public static boolean isContained(Container container0, Box box0, String s) {
        return Path.getPaths(container0, s).contains(box0);
    }
}

