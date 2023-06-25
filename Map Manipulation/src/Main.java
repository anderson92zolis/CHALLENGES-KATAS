import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] animalNames1 = {
                "Lion", "Tiger", "Elephant", "Lion", "Monkey", "Giraffe", "Tiger",
                "Penguin", "Kangaroo", "Zebra", "Lion", "Gorilla" /*, "Elephant", "Koala",
                "Tiger", "Giraffe", "Kangaroo", "Gorilla", "Lion", "Monkey", "Elephant",
                "Kangaroo", "Zebra", "Tiger", "Giraffe", "Elephant", "Lion", "Monkey",
                "Kangaroo", "Gorilla", "Elephant"  */

        };

        String[] animalNames2 = {
                "Lion", "Tiger", "Elephant", "Giraffe", "Zebra",
                "Monkey", "Hippo", "Kangaroo", "Penguin", "Bear", /*
                "Crocodile", "Snake", "Wolf", "Koala", "Panda",
                "Lion", "Gorilla", "Cheetah", "Rhino", "Zebra",
                "Elephant", "Lion", "Tiger", "Giraffe", "Monkey" */
        };

        MapManipulation mapManipulationObject1 = new MapManipulation(animalNames1);
        MapManipulation mapManipulationObject2 = new MapManipulation(animalNames2);

        if (mapManipulationObject1.testSizeArray() &&  mapManipulationObject2.testSizeArray() ) {

            System.out.println("OHHH YES!! THE ARRAY CONTAIN ELEMENTS!!");

            System.out.println("\nCOUNT ELEMENT");
            Map<String, Integer> map = mapManipulationObject1.mapCountElementsInArray();
            mapManipulationObject1.printMap(map);

            System.out.println("\nREMOVE ELEMENT");
            mapManipulationObject1.removeKeyMap("Monkey");
            mapManipulationObject1.printMap(map);

            System.out.println("\nMERGE TWO MAPS");
            Map<String,Integer> mergeMap= mapManipulationObject1.mergeTwoMaps(mapManipulationObject1.getFrecuencyElements(),mapManipulationObject2.getFrecuencyElements() );
            mapManipulationObject1.printMap(mergeMap);

            System.out.println("\nSORT MAP ASC");
            Map<String,Integer> sortedMapAsc= mapManipulationObject1.sortValuesAsc();
            mapManipulationObject1.printMap(sortedMapAsc);

            System.out.println("\nSORT MAP ASC");
            Map<String,Integer> sortedMapDSC=  mapManipulationObject1.sortValuesDSC();
            mapManipulationObject1.printMap(sortedMapDSC);

            System.out.println("\nPERFORM VARIOUS OPERATIONS (ADD, REMOVE, UPDATE) ON A MAP.");
            mapManipulationObject1.optionProgram();

        } else {
            System.out.println("PUFFFFFFF!! THE ARRAY DOES'T CONTAIN ELEMETS!!  ");
        }
    }

}