package ru.vetalshev.collections.homework.demo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.vetalshev.collections.homework.model.City;
import ru.vetalshev.collections.homework.model.Route;
import ru.vetalshev.collections.homework.service.RouteService;
import ru.vetalshev.collections.homework.service.RouteServiceImpl;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Во входном файле хранится информация о системе главных автодорог,
// связывающих г. Минск с другими городами Беларуси. Используя эту информацию,
// построить дерево, отображающее систему дорог республики,
// а затем, продвигаясь по дереву, определить минимальный по длине путь из г. Минска в другой
// заданный город. Предусмотреть возможность сохранения дерева в виртуальной памяти.
public class Demo3 {

    public static void main(String[] args) {
        RouteService routeService = new RouteServiceImpl();
        Map<Integer, City> cityMap;

        try {
            cityMap = getCityList("src/ru/vetalshev/collections/cities.xml");
        } catch (Exception ex) {
            throw new RuntimeException("File can't be imported", ex);
        }

        System.out.println(cityMap);

        City from = cityMap.get(1);
        System.out.println("===========");
        System.out.println("FROM: " + from);

        City to = cityMap.get(6);
        System.out.println("TO: " + to);
        System.out.println("===========");

        Route route = routeService.findOptimalRoute(from, to);

        System.out.println("Optimal route distance is: " + route);
    }

    private static Map<Integer, City> getCityList(String pathname)
            throws Exception {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Load the input XML document, parse it and return an instance of the
        // Document class.
        Document document = builder.parse(new File(pathname));

        Map<Integer, City> cities = new HashMap<>();
        NodeList citiesNodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < citiesNodeList.getLength(); i++) {
            Node cityNode = citiesNodeList.item(i);

            if (cityNode.getNodeType() == Node.ELEMENT_NODE) {
                Element elem = (Element) cityNode;

                // Get the value of the ID attribute.
                int ID = Integer.parseInt(cityNode.getAttributes()
                        .getNamedItem("pk").getNodeValue());

                // Get the value of all sub-elements.
                String name = elem.getElementsByTagName("name")
                        .item(0).getChildNodes().item(0).getNodeValue();

                NodeList relatedCities = elem.getElementsByTagName("relatedCities").item(0).getChildNodes();
                Map<Integer, Double> relatedCitiesMap = new HashMap<>();

                for (int j = 0; j < relatedCities.getLength(); j++) {
                    Node cityIdNode = relatedCities.item(j);

                    if (cityIdNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element cityIdEl = (Element) cityIdNode;

                        double distance = Double.parseDouble(cityIdEl.getAttributes()
                                .getNamedItem("distance").getNodeValue());

                        int relatedCityId = Integer.parseInt(cityIdEl.getFirstChild().getNodeValue());

                        relatedCitiesMap.put(relatedCityId, distance);
                    }
                }

                City city = new City();

                city.setPk(ID);
                city.setName(name);
                city.setRelatedCities(relatedCitiesMap);

                cities.put(city.getPk(), city);
            }
        }

        return cities;
    }

}
