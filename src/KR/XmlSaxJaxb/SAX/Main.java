package KR.XmlSaxJaxb.SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final String fileName = "C:\\Users\\akropachev\\IdeaProjects\\lessons\\src\\KR\\SAX\\example.xml";
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler(){
                boolean name = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes){
                    if (qName.equalsIgnoreCase("name"))
                        name = true;
                }

                @Override
                public void characters(char ch[], int start, int length){
                    if (name){
                        System.out.println("name: " + new String(ch, start, length));
                        name = false;
                    }

                }
            };
            saxParser.parse(fileName, handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
