package be_study.cls.cls12;

import java.util.ArrayList;

/**
 * 
 */
/**
 * 
 */
public class ClassRoom {	//강의실 교실
	
	//필드
	int floor; //멸층
	int roomNumber; //몇호실이냐?
	double area; // 몇평이냐> 몇m2?
	boolean hasWhiteBoard; //화이트보드 존재 여부
	
	//String whiteBoard; //"2m 짜리 자석붙는 화이트보드"
	WhiteBoard whiteBoard;	//객체
	
	AirCon airCon;
	
//	Desk desk; //책상 객체 1개
//	Desk desk2;
//	Desk desk3;
//	Desk desk4;
	
	//Desk[] deskArr;
	ArrayList<Desk> deskList;
	
	public ClassRoom() {
		floor = 0;
		roomNumber = 0;
		area = 0;
		hasWhiteBoard = false;
		airCon = null;
		deskList = null;
		//deskList = new ArrayList<Desk>(); //ArrayList 공간 초기화
	}
	
	public ClassRoom(int floor, int roomNumber) {
		this.floor = floor;
		this.roomNumber = roomNumber;
	}
	
	public ClassRoom(WhiteBoard whiteBoard, AirCon airCon) {
		this.whiteBoard = whiteBoard;
		this.airCon = airCon;
	}

	public WhiteBoard getWhiteBoard() {
		return whiteBoard;
	}

	public void setWhiteBoard(WhiteBoard whiteBoard) {
		this.whiteBoard = whiteBoard;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public ArrayList<Desk> getDeskList() {
		return deskList;
	}

	public void setDeskList(ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	
	public void addDesk(Desk desk) {
		//this.deskList = null;	 기존에 초기화 안해서 null 인 경우
		
		if(deskList == null) {
			deskList = new ArrayList<Desk>();
		}
		this.deskList.add(desk);
	}
	
	public void addDesk(int sizeX, int sizeY, String color) {
		
		Desk d = new Desk(sizeX, sizeY, color);
		
		if(deskList == null) {
			deskList = new ArrayList<Desk>();
		}
		this.deskList.add(d);
	}
}
