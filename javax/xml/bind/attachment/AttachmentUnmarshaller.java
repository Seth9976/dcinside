package javax.xml.bind.attachment;

import javax.activation.g;

public abstract class AttachmentUnmarshaller {
    public abstract byte[] getAttachmentAsByteArray(String arg1);

    public abstract g getAttachmentAsDataHandler(String arg1);

    public boolean isXOPPackage() {
        return false;
    }
}

