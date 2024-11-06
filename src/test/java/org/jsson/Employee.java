package org.jsson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Employee {
public static void main(String[] args) throws IOException, ParseException {
	JSONParser p=new JSONParser();
	File f=new File("D:\\APITesting\\MyApi\\src\\test\\resources\\sample.json");
	FileReader fr=new FileReader(f);
    Object o = p.parse(fr);
    
    JSONObject js=(JSONObject)o;
    Object obj = js.get("employee");
    System.out.println("employee " +obj);
    JSONObject js1=(JSONObject) obj;
   System.out.print(js1.get("age") + " " + js1.get("name"));
   
    Object obj1 = js.get("company");
    JSONObject js22=(JSONObject) obj1;
    System.out.println("\n " +js22.get("name") +" \n "+ js22.get("id"));	
}
}
