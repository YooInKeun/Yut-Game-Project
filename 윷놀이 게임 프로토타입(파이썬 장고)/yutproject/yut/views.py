from django.shortcuts import render, redirect
from .models import Yut
from .models import Horse
from .models import Board
import random
import json

# Create your views here.

player1_first_horse = Horse.objects.get(player_name='player1', horse_number=1)
player2_first_horse = Horse.objects.get(player_name='player2', horse_number=1)
yut = Yut.objects.get(name='윷')
board = Board.objects.get(name='윷놀이판')

def home(request): # 초기 화면

    return render(request, 'home.html')

def create_val(request): # 던지기 버튼을 눌러 난수생성(horse에 전달, horse의 값을 board가 확인해 좌표 값을 horse에게 리턴)

    yut.val = random.randrange(-1,6)

    while(yut.val== 0):

        yut.val = random.randrange(-1,6)

    '''
    yut = Yut.objects.get(name='윷')
    player1_first_horse = Horse.objects.get(player_name='player1', horse_number=1)
    board = Board.objects.get(name='윷놀이판')

    player1_first_horse.move_val += yut.val

    player1_first_horse.move_val = player1_first_horse.move_val % 20

    json_str = json.dumps(board.board_coor)
    json_data = json.loads(json_str)
    coor_data = json_data[str(player1_first_horse.move_val)]

    comma = ','
    comma_pos = coor_data.find(comma)
        
    player1_first_horse.x_coor = coor_data[0:comma_pos]
    player1_first_horse.y_coor = coor_data[comma_pos+1:len(coor_data)]

    yut.save()
    player1_first_horse.save()
    board.save()

    '''

    return render(request, 'home.html', {'yut' : yut, 'player1_first_horse' : player1_first_horse, 'player2_first_horse' : player2_first_horse})

def horse_init(request): # 말을 원래 위치로

    player1_first_horse.move_val = 0
    player1_first_horse.x_coor=600
    player1_first_horse.y_coor=10

    player2_first_horse.move_val = 0
    player2_first_horse.x_coor=600
    player2_first_horse.y_coor=100

    return render(request, 'home.html', {'player1_first_horse' : player1_first_horse, 'player2_first_horse' : player2_first_horse})

def horse_select(request):
    
    if 'P1_1' in request.POST:

        player1_first_horse.move_val += yut.val
        player1_first_horse.move_val = player1_first_horse.move_val % 20

        json_str = json.dumps(board.board_coor)
        json_data = json.loads(json_str)
        coor_data = json_data[str(player1_first_horse.move_val)]

        comma = ','
        comma_pos = coor_data.find(comma)
            
        player1_first_horse.x_coor = coor_data[0:comma_pos]
        player1_first_horse.y_coor = coor_data[comma_pos+1:len(coor_data)]

    elif 'P2_1' in request.POST:

        player2_first_horse.move_val += yut.val
        player2_first_horse.move_val = player2_first_horse.move_val % 20

        json_str = json.dumps(board.board_coor)
        json_data = json.loads(json_str)
        coor_data = json_data[str(player2_first_horse.move_val)]

        comma = ','
        comma_pos = coor_data.find(comma)
            
        player2_first_horse.x_coor = coor_data[0:comma_pos]
        player2_first_horse.y_coor = coor_data[comma_pos+1:len(coor_data)]

    # list에 horse 객체 다 넣어서 for문 돌리자

    yut.save()
    player1_first_horse.save()
    player2_first_horse.save()
    board.save()
    
    return render(request, 'home.html', {'player1_first_horse' : player1_first_horse, 'player2_first_horse' : player2_first_horse})