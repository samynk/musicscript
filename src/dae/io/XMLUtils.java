/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dae.io;

import java.io.IOException;
import java.io.Writer;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Koen Samyn
 */
public class XMLUtils {

    public static void writeAttribute(Writer w, String key, String value) throws IOException {
        if (value == null) {
            return;
        }
        w.write(key);
        w.write("='");
        w.write(value);
        w.write("' ");
    }

    public static void writeAttribute(Writer w, String key, boolean value) throws IOException {
        w.write(key);
        w.write("='");
        if (value) {
            w.write("true");
        } else {
            w.write("false");
        }
        w.write("' ");
    }

    public static void writeAttribute(Writer w, String key, int value) throws IOException {
        w.write(key);
        w.write("='");
        w.write(Integer.toString(value));
        w.write("' ");
    }

    public static void writeAttribute(Writer w, String key, float value) throws IOException {
        w.write(key);
        w.write("='");
        w.write(Float.toString(value));
        w.write("' ");
    }

    
    /**
     * Writes the specified number of tabs to the writer.
     *
     * @param w the output writer.
     * @param nrOfTabs the number of tabs.
     */
    public static void writeTabs(Writer w, int nrOfTabs) throws IOException {
        for (int i = 0; i < nrOfTabs; ++i) {
            w.write("\t");
        }
    }

    /**
     * Gets the attribute as a string.
     *
     * @param key the name of the attribute.
     * @param map the named node map with the attribute key/value pairs.
     * @return the attribute value or an empty string if it does not exist.
     */
    public static String getAttribute(String key, NamedNodeMap map) {
        Node attr = map.getNamedItem(key);
        return attr != null ? attr.getTextContent() : "";
    }

    /**
     * Parses the value of the given attribute as a float.
     *
     * @param attributeName the name of the attribute.
     * @param map the map that contains all the attributes.
     * @return the float value.
     */
    public static float parseFloat(String attributeName, NamedNodeMap map) {
        org.w3c.dom.Node attr = map.getNamedItem(attributeName);
        try {
            return attr != null ? Float.parseFloat(attr.getTextContent()) : 0f;
        } catch (NumberFormatException ex) {
            return 0.0f;
        }
    }

    /**
     * Parses the value of the given attribute as an float.
     *
     * @param attributeName the name of the attribute.
     * @param map the map that contains all the attributes.
     * @return the float value.
     */
    public static int parseInt(String attributeName, NamedNodeMap map) {
        org.w3c.dom.Node attr = map.getNamedItem(attributeName);
        try {
            return attr != null ? Integer.parseInt(attr.getTextContent()) : 0;
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    /**
     * Parses the value of the given attribute as an boolean.
     *
     * @param attributeName the name of the attribute.
     * @param map the map that contains all the attributes.
     * @return the float value.
     */
    public static boolean parseBoolean(String attributeName, NamedNodeMap map) {
        org.w3c.dom.Node attr = map.getNamedItem(attributeName);
        return attr != null ? Boolean.parseBoolean(attr.getTextContent()) : false;
    }

    /**
     * Reads a cdata section that is the child of the given node.
     * @param node the parent node that 
     * @return 
     */
    public static String readCDATA(Node node) {
        NodeList nl = node.getChildNodes();
        for (int i = 0; i < nl.getLength(); ++i) {
            org.w3c.dom.Node child = nl.item(i);
            if (child.getNodeType() == org.w3c.dom.Node.CDATA_SECTION_NODE) {
                return child.getNodeValue();
            }
        }
        return null;
    }
}
