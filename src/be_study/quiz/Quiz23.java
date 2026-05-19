package be_study.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
//		엘리베이터
//
//		스마트 엘리베이터 시스템을 제작하려고 합니다.
//		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//		(반복문, 조건문, 배열 최대한 사용하시면 됩니다. )
//
//		- 기본 문제
//		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다.
//		(오로지 한번에 100층까지 쭉)
//		(100층을 찍고 다시 1층까지 내려와야함)
//
//		+ 탑승 인원을 입력받습니다.
//		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
//		(
//		* 입력된 층은 중복되지 않게 입력이 된다고 가정
//		예시)
//		[10, 20, 35, 50, 11, 24] O 정상입력 케이스로 가정하고 진행
//		[10, 20, 35, 10, 20, 24] X 중복층 입력 없음으로 가정
//		)
//
//
//		- 레벨 1
//		부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
//		엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
//		(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
//		현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
//
//		+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다.
//
//
//
//		- 레벨 2
//		엘리베이터는 태울 수 있는 총 중량 또는 정원이 있습니다.
//		탑승 인원을 순서대로 측정하되, 총 무게를 넘거나 정원이 넘으면 그 뒤에 인원을 엘리베이터에 태우지 않습니다.
//		(총 중량이 200kg 일 경우, 탑승 인원 순서대로 80, 120, 40 이면 가장 마지막 사람은 태우지 않음)
//
//		+ 엘리베이터의 총 무게 및 정원은 사용자 입력을 받습니다.
//		+ 탑승 인원 및 각 탑승 인원의 내릴 층은 랜덤으로 추출합니다. (사용자 입력에서 변경)
//		+ 각 탑승 인원의 무게도 랜덤으로 추출합니다. (40 kg ~ 150 kg)
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
				
				System.out.print("엘리베이터가 멈출 수 있는 최대 횟수를 입력해주세요 : ");
				int stop = scanner.nextInt();
				int st = 0; 
				
				System.out.print("엘리베이터의 총 무게 및 정원을 입력해주세요 (무게 정원 순) : ");
				int w = scanner.nextInt();
				int p = scanner.nextInt(); 
				
				int wait = random.nextInt(15) + 1;
				System.out.println("현재 대기 인원 : " + wait + "명");
				
				int checkWeight = 0; 
				int count = 0;      
				
				// [수정] 100층까지 인덱스를 안전하게 쓰기 위해 크기를 101로 변경
				int[] outCount = new int[101]; 
		        
				System.out.println("----------탑승 시작------------");
				
				for(int i = 0; i < wait; i++) {
					int weight = random.nextInt(111) + 40; // 40kg ~ 150kg
					
					// [수정] 2층부터 100층까지 안전하게 생성 (nextInt(99)는 0~98 반환)
					int floor = random.nextInt(99) + 2;
					
					System.out.print((i + 1) + "번째 대기자 (무게: " + weight + "kg, 목적지: " + floor + "층)  ");
					
					if (count + 1 <= p && checkWeight + weight <= w) {
						count++;
						checkWeight += weight;
						outCount[floor]++;
						System.out.println("탑승 성공 (현재 인원: " + count + "명, 누적 무게: " + checkWeight + "kg)");
					} else {
						System.out.println("탑승 실패 (정원 또는 무게 초과). 이후 대기자는 탑승하지 않습니다.");
						break;
					}
				}
				
				System.out.println("인원: " + count + "명, 총 무게: " + checkWeight + "kg");
				if (count == 0) {
					System.out.println("탑승한 승객이 없어 운행을 종료합니다.");
					return;
				}
				
				System.out.println("----------------운행 시작합니다-----------------");
				for(int fl = 1; fl <= 100; fl++) {
					System.out.println("현재 층은 " + fl + "층 입니다.");
				
					if (outCount[fl] > 0) {
						System.out.println(fl + "층에서 승객 " + outCount[fl] + "명이 하차하겠습니다.");
						st++;

						if (stop == st) {
							System.out.println("부실 공사로 인한 전력 한계 도달!");
							System.out.println(fl + "층 점검중 - 모든 승객들은 내려 계단으로 가주세요.");
							return; 
						}
					}
				}
				
				System.out.println("---------------하강을 시작합니다---------------------");
				for(int fl = 100; fl >= 1; fl--) {
					System.out.println("현재 층은 " + fl + "층 입니다.");
				}
				System.out.println("-------------------운행을 종료합니다.----------------------");
			
		
		
//		System.out.print("탑승 인원 수 입력 : ");
//		int personCount = scanner.nextInt();
//		
//		int[] destFloorArr = new int[personCount];
//		System.out.print("목적지 층수 입력(2~100) : ");
////		
//		//for 문
//		for(int i=0; i<destFloorArr.length; i++) {
//			destFloorArr[i] = scanner.nextInt();
//		}
////		
//		System.out.print("최대 멈춤 횟수 입력 : ");
//		int maxStopCount = scanner.nextInt();
//		int stopCount = 0;
//		for(int floor=1; floor<=100; floor++) {
//			System.out.println(floor + "층");
//			
//			for(int i=0; i<destFloorArr.length;i++) {
//				if (floor==destFloorArr[i]) {
//					System.out.println(">>> 도착 (승객하차)");
//					stopCount++;
//					
//				}
//			}
//			if(stopCount == maxStopCount ) {
//				System.out.println("===운행중지 (점검중) ===");
//				System.out.println("===계단을 이용해주세요==");
//				break;
//			}
//			for(floor=100; floor>=1; floor--) {
//				System.out.println(floor + "층");
//				break;
//			}
//		}
		
		
		
		
//		
//		int floor = 1;
//		boolean isUp = true;
//		
//		while(true) {
//			System.out.println(floor + "층");
//			if(floor == 1 && isUp == false) {
//				break;
//			}
//			if(floor == 100) {
//				isUp = false;
//			}
//			if(isUp) {
//				floor++;
//			} else {
//				floor--;
//			}
//		}
		

//		int floor = 1;
//		int flow = 1;
//		
//		if(flow == 1) {
//		for(floor=1; floor<=100; floor++) {
//			System.out.println(floor + "층");
//			
//			for(int i=0; i<destFloorArr.length;i++) {
//				if (floor==destFloorArr[i]) {
//					System.out.println(">>> 도착 (승객하차)");
//				}
//			}
//		}
//		
//			
//			if(floor == 1 && flow == -1) {
//				break;
//			}
//			if(floor == 100) {
//				flow = -1;
//			}
//			floor = floor + flow;
//			}
		}
}

