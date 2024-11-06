package org.jssonPractic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWite {
	public static void main(String[] args) throws FileNotFoundException {
		
		JSONObject j=new JSONObject();
		File f=new File("D:\\APITesting\\MyApi\\src\\test\\resources\\jsRead.json");
		JSONArray ja=new JSONArray();
		Map m=new HashMap();
		Map mm=new HashMap();
		m.put("id", "7");
		m.put("email", "michael.lawson@reqres.in");
		m.put("first_name", "Michael");
		m.put("last_name", "Lawson");
		m.put("avatar", "https://reqres.in/img/faces/7-image.jpg");
		
		mm.put("id", "8");
		mm.put("email", "lindsay.ferguson@reqres.in");
		mm.put("first_name", "Lindsay");
		mm.put("last_name", "Ferguson");
		mm.put("avatar", "https://reqres.in/img/faces/8-image.jpg");
		
		ja.add(m);
		ja.add(mm);
		
		JSONObject js=new JSONObject();
		js.put("url", "https://reqres.in/#support-heading");
		js.put("text", "To keep ReqRes free, contributions towards server costs are appreciated!");
	j.put( "page", "2");	
	j.put( "per_page", "6");	
	j.put( "total", "12");	
	j.put("data",ja);
	j.put("support",js);
	
	JSONObject jso=new JSONObject();
	jso.putAll(j);
	PrintWriter p=new PrintWriter(f);
	p.write(jso.toJSONString());
	p.flush();
	p.close();
	System.out.println("done");
	}

}
/*

{
   "page": 2,
   "per_page": 6,
   "total": 12,
   "total_pages": 2,
   "data": [
       {
           "id": 7,
           "email": "michael.lawson@reqres.in",
           "first_name": "Michael",
           "last_name": "Lawson",
           "avatar": "https://reqres.in/img/faces/7-image.jpg"
       },
       {
           "id": 8,
           "email": "lindsay.ferguson@reqres.in",
           "first_name": "Lindsay",
           "last_name": "Ferguson",
           "avatar": "https://reqres.in/img/faces/8-image.jpg"
       }
]
"support": {
"url": "https://reqres.in/#support-heading",
"text": "To keep ReqRes free, contributions towards server costs are appreciated!"
}
}
*/