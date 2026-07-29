package be_study.quiz.quiz51;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz51 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String jsonString = "{"
				+ "\"employees\": ["
				+ "{"
				+ "\"id\": 1,"
				+ "\"name\": \"홍길동\","
				+ "\"position\": \"개발자\","
				+ "\"salary\": 50000,"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]"
				+ "},"
				+ "{"
				+ "\"id\": 2,"
				+ "\"name\": \"김철수\","
				+ "\"position\": \"디자이너\","
				+ "\"salary\": 40000,"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]"
				+ "}"
				+ "],"
				+ "\"company\": {"
				+ "\"name\": \"주식회사 ABC\","
				+ "\"address\": \"서울시 강남구\","
				+ "\"established\": \"1990-01-01\","
				+ "\"departments\": ["
				+ "{"
				+ "\"name\": \"개발부\","
				+ "\"employees\": [1, 3, 5]"
				+ "},"
				+ "{"
				+ "\"name\": \"디자인부\","
				+ "\"employees\": [2, 4]"
				+ "}"
				+ "]"
				+ "},"
				+ "\"projects\": ["
				+ "{"
				+ "\"title\": \"사내 시스템 개발\","
				+ "\"budget\": 100000,"
				+ "\"team\": [1, 3]"
				+ "},"
				+ "{"
				+ "\"title\": \"웹 디자인 프로젝트\","
				+ "\"budget\": 80000,"
				+ "\"team\": [2, 4]"
				+ "}"
				+ "]"
				+ "}";
		
		JSONParser jsonParser = new JSONParser();
		//JSONObject JSONArray
		JSONObject obj = (JSONObject)jsonParser.parse(jsonString);
		
		JSONArray employees = (JSONArray)obj.get("employees");
		
		for(int i=0; i<employees.size(); i++) {
			
			JSONObject emp = (JSONObject)employees.get(i);
			System.out.println(emp.get("id"));
			System.out.println(emp.get("name"));
			System.out.println(emp.get("position"));
			System.out.println(emp.get("salary"));
			
			JSONArray skills = (JSONArray)emp.get("skills");
			for(int j=0; j<skills.size(); j++) {
				System.out.println(skills.get(j));
			}
		}
		
		
		JSONObject company = (JSONObject)obj.get("company");
		
		System.out.println(company.get("name"));
		System.out.println(company.get("address"));
		System.out.println(company.get("established"));
		JSONArray departments = (JSONArray)company.get("departments");
		
		for(int i=0; i<departments.size(); i++) {
			JSONObject dept = (JSONObject)departments.get(i);
			
			System.out.println(dept.get("name"));
			JSONArray emps = (JSONArray)dept.get("employees");
			for(int j=0; j<emps.size(); j++) {
				System.out.println(emps.get(j));
			}
		}
		
		
		JSONArray projects = (JSONArray)obj.get("projects");
		
		for(int i=0; i<projects.size(); i++) {
			JSONObject pro = (JSONObject)projects.get(i);
			
			System.out.println(pro.get("title"));
			System.out.println(pro.get("budget"));
			JSONArray team = (JSONArray)pro.get("team");
			for(int j=0; j<team.size(); j++) {
				System.out.println(team.get(j));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
