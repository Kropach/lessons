package KR.XmlSaxJaxb.XML;

public class Main {
    public static void main(String[] args) {
        XMLParser xml = new XMLParser("C:\\Users\\akropachev\\IdeaProjects\\lessons\\src\\KR\\XML\\example2.xml");

        System.out.println(xml.get("catalog/book/author"));
    }
}
