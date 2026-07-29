package be_study.quiz.quiz53;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiServiceMain {

	public static void main(String[] args) {
		ApiExplorer api = new ApiExplorer();
		MinuDustFrcstDspthDAO dao = new MinuDustFrcstDspthDAO();
		
		try {

            String jsonResponse = api.requestApi_getMinu("2026-07-29", "PM10");


            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(jsonResponse);
            
            
            JSONObject response = (JSONObject) jsonObject.get("response");
            JSONObject body = (JSONObject) response.get("body");
            JSONArray items = (JSONArray) body.get("items");

            int saveCount = 0;

            for (int i = 0; i < items.size(); i++) {
                JSONObject item = (JSONObject) items.get(i);

                MinuDustFrcstDspthDTO dto = new MinuDustFrcstDspthDTO();
                
                dto.setImageUrl14((String) item.get("imageUrl14"));
                dto.setInformCode((String) item.get("informCode"));
                dto.setImageUrl15((String) item.get("imageUrl15"));
                dto.setImageUrl16((String) item.get("imageUrl16"));
                dto.setActionKnack((String) item.get("actionKnack"));
                dto.setInformCause((String) item.get("informCause"));
                dto.setInformOverall((String) item.get("informOverall"));
                dto.setInformData((String) item.get("informData"));
                dto.setInformGrade((String) item.get("informGrade"));
                dto.setDataTime((String) item.get("dataTime"));
                dto.setImageUrl13((String) item.get("imageUrl13"));
                dto.setImageUrl12((String) item.get("imageUrl12"));
                dto.setImageUrl11((String) item.get("imageUrl11"));

                int result = dao.saveMinuDustFrucst(dto);
                if (result > 0) {
                    saveCount++;
                }
            }

            System.out.println("총 " + saveCount + "건의 미세먼지 예보 데이터가 DB에 성공적으로 저장되었습니다.");

        } catch (Exception e) {
            System.err.println("데이터 수집 및 저장 중 오류 발생:");
            e.printStackTrace();
        }
		
		
		
		
	}

}
