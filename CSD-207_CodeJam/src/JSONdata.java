import jdk.nashorn.internal.parser.JSONParser;


import java.io.*;

public class JSONdata {

    String name;
    int id;
    int cage;
    String medications;
    String status;
    int frequency;

//    public String go() throws IOException {
//        String fileName = "animals.json";
//        BufferedReader br = new BufferedReader(new FileReader(fileName));
//
//        try {
//        StringBuilder sb = new StringBuilder();
//        String line = br.readLine();
//
//        while (line != null) {
//            sb.append(line);
//            sb.append("\n");
//            line = br.readLine();
//        }
//        return sb.toString();
//    } finally {
//        br.close();
//    }
//    }

    public void go() throws Exception{
        String fileName = "/home/raman/Desktop/CSD-207_CodeJam/animals.json";
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        String line;
        File file = new File(fileName);
        br = new BufferedReader(new FileReader(fileName));

        while((line = br.readLine()) != null){
            sb.append(line);
        }
        String jsonFile_String = sb.toString();
        System.out.print(sb.toString());

//        JsonParser parser = new JsonParser();
//
//        Gson g = new Gson();
//        JsonArray jArray = (JsonArray)parser.parse(jsonFileString);
//        for(Object o: jArray){
//            JsonObject obj = (JsonObject)o;
//            Animal animal = g.fromJson(obj, Animal.class);
//            animals.add(animal);
//            System.out.println(animal.getTrainers());


    }
}
