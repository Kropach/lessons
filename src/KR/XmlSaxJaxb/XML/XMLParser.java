package KR.XmlSaxJaxb.XML;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

public class XMLParser {
    private String xml;

    public XMLParser(String path){
        byte[] buf = null;
        RandomAccessFile file = null;
        try{
            file = new RandomAccessFile(path, "r");
            buf = new byte[(int) file.length()];
            file.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file != null)
                    file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            xml = new String(buf, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String get(String path){
        String[] parts = path.split("/");
        String s_xml = xml;

        for (String s :
                parts) {
            String toFind = "<" + s + ">";
            int start = s_xml.indexOf(toFind);
            if (start < 0){
                return null;
            } else {
                start += toFind.length();
            }
            int end = s_xml.lastIndexOf("</" + s + ">");
            if (end < 0)
                return null;
            s_xml = s_xml.substring(start, end);
        }
        return s_xml;
    }
}
