Yut-Game-Project
================

Yut-Game Development with JAVA & OOAD(Team Project)
---------------------------------------------------

<br/>

## 프로젝트 소개

### 주제 : "윷놀이 게임 개발"

<br/>

윷놀이 게임을 **객체지향 분석 및 설계(OOAD)** 를 통해 개발한다.

<br/>

## 목차

<!--ts-->

* [빌드 방법](#빌드-방법)

* [실행 방법](#실행-방법)

* [게임 초기 화면](#게임-초기-화면)

* [세부 규칙](#세부-규칙)

* [기 타](#기-타)

<!--te-->

<br/>

## 빌드 방법

![how to build](https://user-images.githubusercontent.com/41741539/58937697-22d5b180-87ae-11e9-80c0-20596f61d92c.png)

&nbsp;&nbsp;프로젝트 파일을 다운 받아, FirstPage.java(Main이 있는 파일)에서 Run을 실행해 프로젝트를 빌드한다.

<br/>

## 실행 방법

![first page](https://user-images.githubusercontent.com/41741539/58937666-0a659700-87ae-11e9-94b4-8e5ec4244dfc.png)

&nbsp;&nbsp;사용자 명수와 말의 개수를 설정한다. 각각의 설정을 중복해서 선택할 수 없도록 Radio 버튼을 사용해주었다. 선택이 끝난 후 시작 버튼을 누르면 본격적인 게임이 시작된다.

<br/>

## 게임 초기 화면

![window](https://user-images.githubusercontent.com/41741539/58938575-1b170c80-87b0-11e9-8421-e6d144bcaffe.png)

① 윷판: 출발(도착)점, 교차점은 이중 원으로 표현해서 가독성을 높여주었다. 화살표는 중앙 교차점에서 빽도가 나왔을 경우 가게 될 방향을 나타내준다.

② 플레이어 정보: 플레이어 말의 색을 다르게 하여 플레이어를 구분해준다. 말 오른쪽에 플레이어의 남은 말과 점수를 숫자로 나타내준다.

③	상태 메시지: 누구의 차례인지와 같은 현재 상태 정보를 나타내준다.

④ 지정 윷 던지기 버튼

⑤ 플레이어가 할 수 있는 행동과 관련된 버튼: 누를 수 있는 버튼을 노란색으로 표현해서 플레이어가 해당 버튼을 누를 수 있도록 유도한다. 만약 노란색 버튼을 누르지 않았다면 상태메시지 창에 "잘못 눌렀습니다", "다시 누르세요" 등의 안내 메세지를 나타내서 눌러야 하는 버튼을 다시 누를 수 있도록 한다.

<br/>



<br/>

## 세부 규칙

플레이어 수는 최소 2명, 최대 4명이다.
사용할 말의 개수는 최소 2개, 최대 5개다.

① 윷을 던져서 윷 또는 모가 나온 경우 한번 더 던진다.
② 윷은 나온 순서대로만 적용할 수 있다.
③	움직인 말의 최종 위치에 다른 플레이어의 말이 있는 경우에는 상대방의 말을 잡아 상대방의 말을 판에서 제거하고 윷을 한번 더 던진다.
③ 윷이나 모로 상대방을 잡은 경우에는 한번 더 던지지 않는다.
⑤ 빽도가 나온 경우에는 판 위에 있는 플레이어의 말을 뒤로 한 칸 무르거나 새로운 말을 결승점 바로 전에 놓을 수 있다.
⑥ 갈림길에 있는 경우에는 무조건 지름길로만 갈 수 있다.
⑦ 갈림길에서 빽도가 나오면 무조건 외곽으로 나온다.
⑧ 도에서 빽도가 나온 경우 다음 번 움직이게 되면 한바퀴를 도는 것이 아닌 결승점을 통과한 것으로 한다.


<br/>

## 기타

```
- 사용 언어 : JAVA Swing
```
