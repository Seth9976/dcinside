package javax.xml.bind.attachment;

import javax.activation.g;

public abstract class AttachmentMarshaller {
    public abstract String addMtomAttachment(g arg1, String arg2, String arg3);

    public abstract String addMtomAttachment(byte[] arg1, int arg2, int arg3, String arg4, String arg5, String arg6);

    public abstract String addSwaRefAttachment(g arg1);

    public boolean isXOPPackage() {
        return false;
    }
}

