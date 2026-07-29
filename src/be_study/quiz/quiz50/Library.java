package be_study.quiz.quiz50;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Library {
	public static void main(String[] args) {
	String jsonString = 
			"{"
			+ "\"도서관\": {"
			+ "\"위치\": \"서울특별시 강남구\","
			+ "\"운영시간\": {"
			+ "\"평일\": [\"09:00\", \"21:00\"],"
			+ "\"주말\": [\"10:00\", \"18:00\"]"
			+ "},"
			+ "\"책목록\": ["
			+ "{"
			+ "\"제목\": \"자바 프로그래밍\","
			+ "\"저자\": \"홍길동\","
			+ "\"출판연도\": 2023,"
			+ "\"가격\": 25000,"
			+ "\"대출가능\": true,"
			+ "\"카테고리\": [\"프로그래밍\", \"자기계발\"]"
			+ "},"
			+ "{"
			+ "\"제목\": \"데이터 분석 입문\","
			+ "\"저자\": \"김철수\","
			+ "\"출판연도\": 2022,"
			+ "\"가격\": 28000,"
			+ "\"대출가능\": false,"
			+ "\"카테고리\": [\"데이터\", \"분석\"]"
			+ "}"
			+ "],"
			+ "\"특별서비스\": {"
			+ "\"키오스크\": true,"
			+ "\"스터디룸\": {"
			+ "\"개수\": 5,"
			+ "\"예약 가능\": true,"
			+ "\"비용\": {"
			+ "\"1시간당\": 5000,"
			+ "\"하루\": 30000"
			+ "}"
			+ "}"
			+ "}"
			+ "}"
			+ "}";
	try {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonobj = (JSONObject)jsonParser.parse(jsonString);
		JSONObject header = (JSONObject)jsonobj.get("도서관");
		
		String location = String.valueOf(header.get("위치"));
		JSONObject hour = (JSONObject) header.get("운영시간");
		JSONArray weekdayHour = (JSONArray)hour.get("평일");
		JSONArray weekendHour = (JSONArray)hour.get("주말");
		
		System.out.println("위치 : " + location);
		System.out.println("평일 :" + weekdayHour.get(0) + "~" + weekdayHour.get(1));
		System.out.println("주말 :" + weekendHour.get(0) + "~" + weekendHour.get(1));
	
		System.out.println("책 목록 : ");
		JSONArray books = (JSONArray) header.get("책목록");
		
		for (int i =0; i<books.size(); i++) {
			JSONObject book = (JSONObject)books.get(i);
			
			String title = String.valueOf(book.get("제목"));
            String author = String.valueOf(book.get("저자"));
            int year = ((Number) book.get("출판연도")).intValue();
            int price = ((Number) book.get("가격")).intValue();
            boolean available = (Boolean) book.get("대출가능");
            
            JSONArray categories = (JSONArray) book.get("카테고리");
            
            System.out.printf("%d. %s (%s, %d년) - %d원 | 대출가능: %b | 카테고리: %s\n",
                    (i + 1), title, author, year, price, available, categories.toJSONString());
		}
		JSONObject specialServiceObj = (JSONObject) header.get("특별서비스");
        boolean kiosk = (Boolean) specialServiceObj.get("키오스크");

        JSONObject studyRoomObj = (JSONObject) specialServiceObj.get("스터디룸");
        int roomCount = ((Number) studyRoomObj.get("개수")).intValue();
        boolean reservable = (Boolean) studyRoomObj.get("예약 가능");

        JSONObject costObj = (JSONObject) studyRoomObj.get("비용");
        int hourlyCost = ((Number) costObj.get("1시간당")).intValue();
        int dailyCost = ((Number) costObj.get("하루")).intValue();
        
        System.out.println("[특별 서비스 정보]");
        System.out.println("키오스크 여부: " + kiosk);
        System.out.println("스터디룸 개수: " + roomCount + "개 (예약가능: " + reservable + ")");
        System.out.println("스터디룸 비용 - 1시간당: " + hourlyCost + "원 / 하루: " + dailyCost + "원");
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
