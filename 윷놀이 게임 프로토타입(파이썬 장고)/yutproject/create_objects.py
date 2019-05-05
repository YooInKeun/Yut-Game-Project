import os
os.environ.setdefault("DJANGO_SETTINGS_MODULE", "yutproject.settings")
import django
django.setup()
from yut.models import Yut
from yut.models import Horse
from yut.models import Board

if __name__=='__main__':

    Yut(name = '윷', val = 0).save()
    Horse(player_name = 'player1', horse_number = 1, move_val = 0, x_coor = 600, y_coor = 10).save()
    Board(name= '윷놀이판', board_coor ={0: '400,320', 1: '400,240', 2:'400,160', 3:'400,80', 4: '400,0',
    5: '320,0', 6: '240,0', 7:'160,0', 8:'80,0', 9:'0,0', 10:'0,80', 11:'0,160', 12:'0,240', 13:'0,320',
    14:'0,400', 15: '80,400', 16: '160,400', 17:'240,400', 18: '320,400', 19:'400,400'}).save()