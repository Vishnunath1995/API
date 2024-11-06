package org.jsson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MyRead {
	public static void main(String[]args) throws IOException, ParseException
	{
		JSONParser p=new JSONParser();
		File f=new File("D:\\APITesting\\MyApi\\src\\test\\resources\\hello.json");
		FileReader read=new FileReader(f);
        Object o = p.parse(read);	
        JSONObject j=(JSONObject)o;
        System.out.println(j.get("data"));
        Object o1 = j.get("data");
        JSONArray ja=(JSONArray)o1;
        System.out.println(ja.get(0));
       System.out.println("Index of zero " + ja.get(0) + " \n");
       System.out.println("Index of one " + ja.get(1) + " \n");
       System.out.println("Index of two " + ja.get(2) + " \n");
       System.out.println("Index of three " + ja.get(3) + " \n");
       System.out.println("Index of four " + ja.get(3) + " \n");
       System.out.println("Index of five " + ja.get(3) + " \n");
		Object indexzero = ja.get(0);
JSONObject j1=(JSONObject)indexzero;
System.out.println(j1.get("id"));


}
}