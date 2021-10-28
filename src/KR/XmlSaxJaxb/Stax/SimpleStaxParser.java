package KR.XmlSaxJaxb.Stax;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class SimpleStaxParser {
    public static void main(String[] args) throws XMLStreamException {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(System.out);

        writer.writeStartDocument("1.0");
        writer.writeStartElement("catalog");
        writer.writeStartElement("book");
        writer.writeStartElement("author");
        writer.writeCharacters("Aa");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();

        writer.flush();
        writer.close();
    }
}
