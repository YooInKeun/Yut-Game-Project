from django.db import models
from jsonfield import JSONField

# Create your models here.

class Yut(models.Model): # 난수 생성의 역할밖에 하지 않기 때문에 사실상 없어도 무관한 Model

    name = models.CharField(max_length=100, default = 'None') # 윷의 이름
    val = models.IntegerField() # 윷의 값(도, 개, 걸, 윷, 모, 빽도)

    def __str__(self):

        return self.name

class Horse(models.Model): # 윷판을 움직이는 말 
    
    player_name = models.CharField(max_length=100, default = 'None') # 어느 플레이어의 말인지 구분
    horse_number = models.IntegerField(default = 0) # 플레이어의 몇 번째 말인지 구분
    move_val = models.IntegerField() # 이동하는 값(Yut으로 부터 이동하는 값을 받음)
    x_coor = models.IntegerField() # 말의 x 좌표
    y_coor =models.IntegerField() # 말의 y 좌표

    def __str__(self):

        return self.player_name + '_horse' + '('+ str(self.horse_number) +')'

class Board(models.Model): # 윷놀이판

    name = models.CharField(max_length=100, default = 'None') # 윷놀이판 이름
    board_coor = JSONField() # 윷놀이판 좌표(윷놀이판의 각각의 위치에 index와 좌표값을 json 형태로 저장,
                             # 후에 Horse가 move_val값을 보내면 이에 해당하는 위치(index)의 좌표값을 리턴)

    def __str__(self):

        return self.name