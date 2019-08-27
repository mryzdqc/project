package aop_test;

import java.io.FileInputStream;

import java.lang.reflect.Field;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Type;
import model.Type2;

public class java_test {
	
//	@Test
//	public void aa() throws Exception{
//		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
//		DocumentBuilder b = f.newDocumentBuilder();
//		Document d = b.parse(new FileInputStream("d:/applicationContext.xml"));
//		Node n1 = d.getFirstChild();
//		NodeList ns = n1.getChildNodes();
//		for(int i =0;i<ns.getLength();i++) {
//			if(ns.item(i).getNodeName().equals("bean")) {
//				Element e = (Element)ns.item(i);
//				String cname = e.getAttribute("class");
//				Class<?> cls = Class.forName(cname);
//				Object o = cls.newInstance();
////				System.out.println(o.getClass());
//				
//				NodeList ns1 = e.getChildNodes();
//				for(int ii =0;ii<ns1.getLength();ii++) {
//					if(ns1.item(ii).getNodeName().equals("property")) {
//						Element e1 = (Element)ns1.item(ii);
//						String name = e1.getAttribute("name");
//						String value = e1.getAttribute("value");
//						//System.out.println(value);
//						Field f1 =cls.getDeclaredField(name);
//						f1.setAccessible(true);
//						f1.set(o, value);
//				}
//			}
//				Type obj = (Type)o;
//				System.out.println(obj.getName());
//		}
//	}
//}
	
	@Test
	public void bb() {
		ApplicationContext  act = new ClassPathXmlApplicationContext("aa.xml");
		Type2 t = (Type2)act.getBean("my");
		System.out.println(t.getName());
		System.out.println(t.getId());

	}
	
	
}
