package KR.XmlSaxJaxb.JAXB;

import javax.xml.bind.*;
import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.add(new Book("Aa", "aA", 40, new Date()));
        catalog.add(new Book("Bb", "bB", 30, new Date()));

        try {
            File file = new File("C:\\Users\\akropachev\\IdeaProjects\\lessons\\src\\KR\\XmlSaxJaxb\\JAXB\\output.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(catalog, file);
            marshaller.marshal(catalog, System.out);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            catalog = (Catalog) unmarshaller.unmarshal(file);
            System.out.println(catalog);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
