package yootgame;

public class Piece {
	int x;
	int y;
	int point;
	Piece(int x, int y){
		this.x=x;
		this.y=y;
		point = 1;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	void setPosition(int act) {//act 만큼 움직임
		
	}
	void setPoint(int point) {//말을 업으면 업은 말의 포인트가 +됨
		this.point += point;
	}
}
