package yootgame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Playgame implements ActionListener{
	int turn;				//게임이 진행된 턴수
	int player_num;			//게임에 참여하는 플레이어수
	int piece_num;			//플레이어 한명당 가질 말 갯수
	Player []player_array;	//플레이어 저장할 배열
	Playgame(int player_num, int piece_num){//게임 시작시 사용자로부터 플레이어 수와 말의 갯수를 입력 받고 플에이어 생성
		turn = 0;
		this.player_num = player_num;
		this.piece_num = piece_num;
		player_array = new Player [player_num];
		for(int i=0;i<player_num;i++) {
			player_array[i]=new Player(piece_num);
		}

	}
	boolean checkFinish(){//게임이 끝났는지 확인
		return false;
	}
	public void actionPerformed(ActionEvent e) {//컨트롤러에서 yootboard에 있는 버튼 입력을 처리함
		
	}
	public void start(String[] args) {
		new Playgame(2,2);

	}

	
}
