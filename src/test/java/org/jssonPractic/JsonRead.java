package org.jssonPractic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {
	
	public static void main(String[] args) throws ParseException, IOException {
		
		JSONParser p=new JSONParser();
		File f=new File("D:\\APITesting\\MyApi\\src\\test\\resources\\hello.json");
		FileReader read=new FileReader(f);
		Object o = p.parse(read);
		JSONObject j=(JSONObject)o;
		System.out.println(j.get("page")+"\n");
		System.out.println(j.get("per_page") +"\n");
		System.out.println(j.get("total" )+"\n");
		System.out.println(j.get("total_pages" )+"\n");
		System.out.println(j.get("data" )+"\n");
		
		Object o1 = j.get("data");
		JSONArray ja=(JSONArray)o1;
		
		Object o2 = ja.get(1);
		System.out.println(o2);
		
		JSONObject j2=(JSONObject)o2;
		
		System.out.println("print id " +j2.get("id")+"\n");
		System.out.println("print email " +j2.get("email")+"\n");
		System.out.println("print first_name " +j2.get("first_name")+"\n");
		System.out.println("print per_page " +j2.get("last_name")+"\n");
		System.out.println("print avatar " +j2.get("avatar")+"\n");
	
	Object object = j.get("support");
	JSONObject js=(JSONObject)object;
	
	System.out.println(js.get("url"));
	System.out.println(js.get("text"));
	
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
        },
        {
            "id": 9,
            "email": "tobias.funke@reqres.in",
            "first_name": "Tobias",
            "last_name": "Funke",
            "avatar": "https://reqres.in/img/faces/9-image.jpg"
        },
        {
            "id": 10,
            "email": "byron.fields@reqres.in",
            "first_name": "Byron",
            "last_name": "Fields",
            "avatar": "https://reqres.in/img/faces/10-image.jpg"
        },
        {
            "id": 11,
            "email": "george.edwards@reqres.in",
            "first_name": "George",
            "last_name": "Edwards",
            "avatar": "https://reqres.in/img/faces/11-image.jpg"
        },
        {
            "id": 12,
            "email": "rachel.howell@reqres.in",
            "first_name": "Rachel",
            "last_name": "Howell",
            "avatar": "https://reqres.in/img/faces/12-image.jpg"
        }
    ],
    "support": {
        "url": "https://reqres.in/#support-heading",
        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
    }
}
*/