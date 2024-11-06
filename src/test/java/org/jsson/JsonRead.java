package org.jsson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {
public static void main(String[] args) throws IOException, ParseException {
	JSONParser js=new JSONParser();
	File f=new File("D:\\APITesting\\MyApi\\src\\test\\resources\\hello.json");
	FileReader fr=new FileReader(f);
	Object parse = js.parse(fr);
	JSONObject jo=(JSONObject) parse;
	System.out.println(parse  );
	System.out.println(jo.get("page"));
	System.out.println(jo.get("per_page"));
	System.out.println(jo.get("total"));
	System.out.println(jo.get("total_pages"));
	System.out.println(jo.get("data"));
	
	Object o1 = jo.get("data");
	JSONArray js1=(JSONArray)o1;
	
	System.out.println(js1.get(1));

	Object index0 = js1.get(0);
	JSONObject j2=(JSONObject)index0;
	
	System.out.println(j2.get("id"));
	System.out.println(j2.get("email"));
	System.out.println(j2.get("first_name"));
	System.out.println(j2.get("last_name"));
	System.out.println(j2.get("avatar"));
	
	Object index1 = js1.get(1);
	JSONObject j3=(JSONObject)index1;
	
	System.out.println(j3.get("id"));
	System.out.println(j3.get("email"));
	System.out.println(j3.get("first_name"));
	System.out.println(j3.get("last_name"));
	System.out.println(j3.get("avatar"));
}
}
