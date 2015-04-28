package main.java.zeroglosa;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;

public class TransformadorXML {

	static String obtenhaXMl(Object obj, Class classe) throws Exception {
		JAXBContext context = JAXBContext.newInstance(classe);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		m.marshal(obj, b);
		return b.toString();
	}

	static Object obtenhaObj(String arquivoXMl, Class classe) throws Exception {
		JAXBContext context = JAXBContext.newInstance(classe);
		Unmarshaller un = context.createUnmarshaller();
		return un.unmarshal(new FileReader(arquivoXMl));
	}


}
