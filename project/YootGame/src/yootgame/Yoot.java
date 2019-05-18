package yootgame;

import java.util.Random;

public class Yoot {
	
	// 윷을 던져서 나온 값에 해당하는 플래그
	public static final int BACKDO = -1;	// 빽도: 1칸 뒤로
	public static final int DO = 1;			// 도: 1칸 전진
	public static final int GAE = 2;		// 개: 2칸 전진
	public static final int GUL = 3;		// 걸: 3칸 전진
	public static final int YOOT = 4;		// 윷: 4칸 전진
	public static final int MO = 5;			// 모: 5칸 전진
	
	public static final boolean SIDE_FLAT = true;	// 평평한 면을 나타내는 플래그 변수
	public static final boolean SIDE_ROUND = false;	// 둥근 면을 나타내는 플래그 변수

	private final float PROB_FLAT = 0.6f;	// 평평한 면이 나올 확률, 대체로  평평한 면이 나올 확률이 60%, 둥근 면이 나올 확률을 40%로 한다.
	
	private boolean backdo;	// 빽도를 담당할 윷가락
	private boolean yoot1;	// 일반 윷가락1
	private boolean yoot2;	// 일반 윷가락2
	private boolean yoot3;	// 일반 윷가락3
	
	private int yootValue;	// 윷을 던지고 나온 값
	
	// 생성자
	Yoot(){
		// 윷가락은 모두 둥근면이 나오도록 초기화 한다.
		backdo = SIDE_ROUND;
		yoot1 = SIDE_ROUND;
		yoot2 = SIDE_ROUND;
		yoot3 = SIDE_ROUND;
		
		yootValue = 0;
	}
	
	
	// 윷을 랜덤으로 던지는 메소드
	public void throwing() {
		Random random = new Random();
		
		// 빽도 윷가락
		if(random.nextFloat() <= PROB_FLAT)
		{
			// 평평한 면이 나온 경우
			backdo = SIDE_FLAT;
		}
		else
		{
			// 둥근 면이 나온 경우
			backdo = SIDE_ROUND;
		}
		
		// 윷가락1
		if(random.nextFloat() <= PROB_FLAT)
		{
			// 평평한 면이 나온 경우
			yoot1 = SIDE_FLAT;
		}
		else
		{
			// 둥근 면이 나온 경우
			yoot1 = SIDE_ROUND;
		}
		
		// 윷가락2
		if(random.nextFloat() <= PROB_FLAT)
		{
			// 평평한 면이 나온 경우
			yoot2 = SIDE_FLAT;
		}
		else
		{
			// 둥근 면이 나온 경우
			yoot2 = SIDE_ROUND;
		}
		
		// 윷가락3
		if(random.nextFloat() <= PROB_FLAT)
		{
			// 평평한 면이 나온 경우
			yoot3 = SIDE_FLAT;
		}
		else
		{
			// 둥근 면이 나온 경우
			yoot3 = SIDE_ROUND;
		}
	}
	
	
	// 빽도가 나오게 설정하는 메소드
	public void setBackdo() {
		backdo = SIDE_FLAT;
		yoot1 = SIDE_ROUND;
		yoot2 = SIDE_ROUND;
		yoot3 = SIDE_ROUND;
	}
	
	
	// 도가 나오게 설정하는 메소드
	public void setDo() {
		backdo = SIDE_ROUND;
		yoot1 = SIDE_FLAT;
		yoot2 = SIDE_ROUND;
		yoot3 = SIDE_ROUND;
	}
	
	
	// 개가 나오게 설정하는 메소드
	public void setGae() {
		backdo = SIDE_FLAT; 
		yoot1 = SIDE_FLAT;
		yoot2 = SIDE_ROUND;
		yoot3 = SIDE_ROUND;
	}
	
	
	// 걸이 나오게 설정하는 메소드
	public void setGul() {
		backdo = SIDE_ROUND;
		yoot1 = SIDE_FLAT;
		yoot2 = SIDE_FLAT;
		yoot3 = SIDE_FLAT;
	}
	
	
	// 윷이 나오게 설정하는 메소드
	public void setYoot() {
		backdo = SIDE_FLAT;
		yoot1 = SIDE_FLAT;
		yoot2 = SIDE_FLAT;
		yoot3 = SIDE_FLAT;
	}
	
	
	// 모가 나오게 설정하는 메소드
	public void setMo() {
		backdo = SIDE_ROUND;
		yoot1 = SIDE_ROUND;
		yoot2 = SIDE_ROUND;
		yoot3 = SIDE_ROUND;
	}
	
	
	// 현재 나온 윷의 값으로 변경해주는 메소드
	public void setYootValue() {
		// 모
		if(backdo == SIDE_ROUND && yoot1 == SIDE_ROUND && yoot2 == SIDE_ROUND && yoot3 == SIDE_ROUND)
		{
			// 윷가락 모두 둥근 면이 나온 경우 모
			yootValue = MO;
		}
		// 윷
		else if(backdo == SIDE_FLAT && yoot1 == SIDE_FLAT && yoot2 == SIDE_FLAT && yoot3 == SIDE_FLAT)
		{
			// 윷가락 모두 평평한 면이 나온 경우 윷
			yootValue = YOOT;
		}
		// 빽도
		else if(backdo == SIDE_FLAT && yoot1 == SIDE_ROUND && yoot2 == SIDE_ROUND && yoot3 == SIDE_ROUND)
		{
			// 빽도를 담당하는 윷가락만 평평한 면이고 나머지는 모두 둥근 면인 경우 빽도
			yootValue = BACKDO;
		}
		// 도
		else if((backdo == SIDE_ROUND && yoot1 == SIDE_FLAT && yoot2 == SIDE_ROUND && yoot3 == SIDE_ROUND)||
				(backdo == SIDE_ROUND && yoot1 == SIDE_ROUND && yoot2 == SIDE_FLAT && yoot3 == SIDE_ROUND)||
				(backdo == SIDE_ROUND && yoot1 == SIDE_ROUND && yoot2 == SIDE_ROUND && yoot3 == SIDE_FLAT))
		{	
			// 빽도를 담당하는 윷가락은 평평한 면이고 나머지 윷가락 중에 하나만 평평한 면일 경우 도
			yootValue = DO;
		}
		// 개
		else if((backdo == SIDE_FLAT && yoot1 == SIDE_FLAT && yoot2 == SIDE_ROUND && yoot3 == SIDE_ROUND)||
				(backdo == SIDE_FLAT && yoot1 == SIDE_ROUND && yoot2 == SIDE_FLAT && yoot3 == SIDE_ROUND)||
				(backdo == SIDE_FLAT && yoot1 == SIDE_ROUND && yoot2 == SIDE_ROUND && yoot3 == SIDE_FLAT)||
				(backdo == SIDE_ROUND && yoot1 == SIDE_FLAT && yoot2 == SIDE_FLAT && yoot3 == SIDE_ROUND)||
				(backdo == SIDE_ROUND && yoot1 == SIDE_FLAT && yoot2 == SIDE_ROUND && yoot3 == SIDE_FLAT)||
				(backdo == SIDE_ROUND && yoot1 == SIDE_ROUND && yoot2 == SIDE_FLAT && yoot3 == SIDE_FLAT))
		{
			// 윷가락 중에 2개만 평평한 면일 경우 개
			yootValue = GAE;
		}
		// 걸
		else if((backdo == SIDE_ROUND && yoot1 == SIDE_FLAT && yoot2 == SIDE_FLAT && yoot3 == SIDE_FLAT)||
				(backdo == SIDE_FLAT && yoot1 == SIDE_ROUND && yoot2 == SIDE_FLAT && yoot3 == SIDE_FLAT)||
				(backdo == SIDE_FLAT && yoot1 == SIDE_FLAT && yoot2 == SIDE_ROUND && yoot3 == SIDE_FLAT)||
				(backdo == SIDE_FLAT && yoot1 == SIDE_FLAT && yoot2 == SIDE_FLAT && yoot3 == SIDE_ROUND))
		{
			// 윷가락 중에 1개만 둥근 면일 경우 걸
			yootValue = GUL;
		}
		
		else
		{
			// 위의 모든 경우에 해당 되지 않으면 0을 반환해서 오류를 확인할 수 있도록 한다.
			yootValue = 0;
		}
	}
	
	
	public int getYootValue() {
		return yootValue;
	}
	
	
	// 현재 나온 윷의 값을 출력하는 메소드
	public void printYootValue() {
		if(yootValue == BACKDO)
		{
			System.out.println("빽도");
		}
		else if(yootValue == DO)
		{
			System.out.println("도");
		}
		else if(yootValue == GAE)
		{
			System.out.println("개");
		}
		else if(yootValue == GUL)
		{
			System.out.println("걸");
		}
		else if(yootValue == YOOT)
		{
			System.out.println("윷");
		}
		else if(yootValue == MO)
		{
			System.out.println("모");
		}
		else
		{
			System.out.println("오류");
		}
	}
}
