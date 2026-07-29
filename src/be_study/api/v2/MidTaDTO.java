package be_study.api.v2;

//DB 쪽 테이블   midta
public class MidTaDTO {
	
	// 테이블을 설계한다면, API 요청 이력 테이블로 분리할 수 있는 컬럼
	String resultCode;
	String resultMsg;
	// ----
	
	// pk
	String tmFc; //요청기준 날짜
	String regId;				
	int taMin4; // minTemperatureAfter4days
	int taMax4;
	int taMin5;		
	int taMax5;
	
	
	// 11B10101 26 33 25 34
	// 202607280600	202607281800 202607290600 202607291800
	// 11B20201
	// 202607280600	202607281800 202607290600 202607291800
	
	
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getTmFc() {
		return tmFc;
	}
	public void setTmFc(String tmFc) {
		this.tmFc = tmFc;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public int getTaMin4() {
		return taMin4;
	}
	public void setTaMin4(int taMin4) {
		this.taMin4 = taMin4;
	}
	public int getTaMax4() {
		return taMax4;
	}
	public void setTaMax4(int taMax4) {
		this.taMax4 = taMax4;
	}
	public int getTaMin5() {
		return taMin5;
	}
	public void setTaMin5(int taMin5) {
		this.taMin5 = taMin5;
	}
	public int getTaMax5() {
		return taMax5;
	}
	public void setTaMax5(int taMax5) {
		this.taMax5 = taMax5;
	}
	@Override
	public String toString() {
		return "MidTaDTO [resultCode=" + resultCode + ", resultMsg=" + resultMsg + ", tmFc=" + tmFc + ", regId=" + regId
				+ ", taMin4=" + taMin4 + ", taMax4=" + taMax4 + ", taMin5=" + taMin5 + ", taMax5=" + taMax5 + "]";
	}

}



