package KR.DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Main {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element rootElement = doc.createElement("catalog");
            doc.appendChild(rootElement);

            Element book1 = doc.createElement("book");
            rootElement.appendChild(book1);

            Element author1 = doc.createElement("author");
            author1.setTextContent("Aa");
            book1.appendChild(author1);

            Element book2 = doc.createElement("book");
            rootElement.appendChild(book2);

            Element author2 = doc.createElement("author");
            author2.setTextContent("Bb");
            book2.appendChild(author2);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult sr = new StreamResult("C:\\Users\\akropachev\\IdeaProjects\\lessons\\src\\KR\\DOM\\output.xml");
            t.transform(source, sr);
        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
