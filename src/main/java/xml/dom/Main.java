package xml.dom;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Main {
  public static void main(String[] args) throws Exception {
    File file = new File("students.xml");
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    Document doc = db.parse(file);
    doc.getDocumentElement().normalize();
    printNode(doc, 0);
    // printTable(doc);
  }

  public static void printNode(Node node, int indent) {
    for (int i = 0; i < indent; i++) {
      System.out.print(' ');
    }

    switch (node.getNodeType()) {
      case Node.DOCUMENT_NODE:
        System.out.println("Document : " + node.getNodeName());
        break;
      case Node.ELEMENT_NODE:
        System.out.println("Element : " + node.getNodeName());
        break;
    }

    for (Node child = node.getFirstChild(); child != null; child = child.getNextSibling()) {
      printNode(child, indent + 1);
    }
  }

  public static void printTable(Document doc) {
    System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
    NodeList nodeList = doc.getElementsByTagName("student");
    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      System.out.println("\nNode Name :" + node.getNodeName());
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element eElement = (Element) node;
        System.out
            .println("Student id: " + eElement.getElementsByTagName("id").item(0).getTextContent());
        System.out.println(
            "First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
        System.out.println(
            "Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
        System.out.println(
            "Subject: " + eElement.getElementsByTagName("subject").item(0).getTextContent());
        System.out
            .println("Marks: " + eElement.getElementsByTagName("marks").item(0).getTextContent());
      }
    }
  }


}
