package org.jsson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritesample {
	public static void main(String[] args) throws FileNotFoundException {
		JSONObject j=new JSONObject();
		Map mp=new HashMap();
		mp.put("id", 7);
		mp.put("email", "\"michael.lawson@reqres.in\"");
		mp.put("first_name", "Michael");
		mp.put("last_name", "Lawson");
		mp.put("avatar", "https://reqres.in/img/faces/7-image.jpg");
		
		Map mp1=new HashMap();
		mp1.put("id", 8);
		mp1.put("email","lindsay.ferguson@reqres.in");
		mp1.put("first_name", "Lindsay");
		mp1.put("last_name", "Ferguson");
		mp1.put("avatar", "https://reqres.in/img/faces/8-image.jpg");
		
		JSONArray ja=new JSONArray();
		ja.add(mp);
		ja.add(mp1);
		
		
		JSONObject js=new JSONObject();
		js.put("url", "https://reqres.in/#support-heading");
		js.put("text", "To keep ReqRes free, contributions towards server costs are appreciated!");
		
		j.put("page", 2);
		j.put("per_page", 6);
		j.put("total", 12);
		j.put("total_pages", 2);
		j.put("data", ja);
		j.put("support", js);
		
		JSONObject jso=new JSONObject();
		jso.putAll(j);
		
		File f=new File("D:\\APITesting\\MyApi\\src\\test\\resources\\output.json");
		PrintWriter p=new PrintWriter(f);
		p.write(jso.toJSONString());
		p.flush();
		p.close();
		System.out.println("done");
		
	}

}
