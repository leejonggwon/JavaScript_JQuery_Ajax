## ex18문서객체실습
<div style="display: flex; justify-content: space-between; align-items: center; gap: 10px; margin-top: 20px;">
  <img src="https://github.com/user-attachments/assets/bd789bee-2b4b-4da1-9fc3-ae7ab4fb25f1" alt="사진1" style="width: 45%; height: auto;">
  <img src="https://github.com/user-attachments/assets/6e0465a4-16b7-4fc0-aed0-03a971c4202b" alt="사진2" style="width: 45%; height: auto;">
</div>

좋아요/싫어요 버튼을 통한 이벤트 처리 및 DOM 조작 실습
<br>
#### 1. 이벤트 처리 (onclick 속성)
▪ 버튼 클릭 시 함수(clicKLike, clickDislike)가 실행되도록 설정
#### 2. DOM 조작 (getElementById, innerText, innerHTML)
▪ document.getElementById 로 HTML 요소(like, icon)에 접근
▪ innerText 로 숫자를 읽고 증가/감소
▪ innerHTML 로 이모지(아이콘)를 변경
#### 3. 데이터 처리 (parseInt, 조건문 if/else)
▪ 문자열로 저장된 숫자를 parseInt 로 정수 변환
▪ 조건문을 활용해 숫자 범위별로 아이콘 변경
<br>



## ex19문서객체실습
<img width="1710" height="717" alt="ex19 로또번호생성_ 실습용" src="https://github.com/user-attachments/assets/b9a85fc1-af96-48ef-8447-943b032a4f40" />

랜덤으로 생성한 데이터를 화면에 출력하는 이벤트 처리 및 DOM 조작 실습, 로또번호생성 실습
<br>

#### 1. 입력 값 접근
▪ input.value 로 사용자가 입력한 값 가져오기
#### 2. DOM 조작
▪ 가져온 값을 innerHTML 로 특정 태그(p)에 출력하기
#### 3. 이벤트 활용
▪ onclick, keyup, mouseover 등 다양한 이벤트를 연결해 동작 제어
▪ addEventListener 로 이벤트 등록하기
<br>

























 

▪ 개발 내용
   ###### 일산화탄소 및 화재감지, 유해가스 센서, 온도 및 습도 센서 등을 활용하여 비상황 발생 시 사용자에게 LCD 화면과 스피커를 통해 위험 상황을 즉시 전달하고 관리자가 대응 할 수 있도록함에 있음
   ###### 캠핑장 관리자를 위한 전용 웹 페이지를 통해 캠핑장 내 상황을 실시간으로 모니터링하고 관리할 수 있도록 히며 캠핑장 이용자를 위한 전용 웹을 구축하여 이용자들이 캠핑장 안전 정보를 확인하고 필요한 조치를 취 할 수 있도록 함
   
<br>

### 3. STP
##### Segmentation
###### 캠핑을 즐기는 이용자들
##### Targeting
###### 캠핑을 즐기는 이용자들
##### Positioning
###### 안전한 캠핑 경험 제공, 효율적인 캠핑장 관리 솔루션
<br>

### 4. 개발목표
▪ 개발목표
IoT 센서를 활용한 캠핑 안전 관리 서비스

▪ 개발내용
##### [IoT 기능]
 ###### 화재 경보 : 불꽃 센서, 연기, 온도 센서를 활용하여 알림 
 ###### 온습도 감지 : 텐트 내의 온습도를 감지하여 LCD와 웹에 표시
 ###### 일산화탄소 및 각종 유해가스 감지 : 텐트 내의 일산화탄소 농도와 유해가스를 감지하여, LED를 통한 알림과 웹에서의 관리자 모니터링 기능 > 일정 수치 이상이 되면 캠퍼, 관리자 알림
 ###### 관리자 알림 기능 : 관리자 페이지에서 이용객별로 특이 사항 있을 때, 알림 기능
 ###### 비상 버튼 : 비상 버튼 누를시, 비상벨 울리고, 관리자에게 알림
 ###### 배터리 잔량 기능 : 배터리 잔량 LCD 및 관리자 페이지에 표시

##### [웹 기능]
###### 관리자 로그인&회원가입 기능 : 캠핑장 업주가 자기 고유의 계정으로 관리자 페이지로 접속해 관리
###### 관리자 메인 페이지 : 각 테크별로 상황을 나타내는 데이터를 실시간으로 관리자 대시보드 페이지로 전달받음 
###### 이벤트 알림 기능 : 캠핑장 내 이벤트를 사용자에게 전송
###### 사용자 전용 LCD 화면 : 실내의 온습도 측정값, 일산화탄소 농도 수치를 전용 LCD 디스플레이를 통해 전달 받고 OpenWeatherMap API를 통해 캠핑장 지역 날씨 데이터를 제공 받음.
###### 데이터관리 : 캠핑장 각 테크별 데이터값을 데이터베이스에 저장하고 관리

<br>

### 5. 개발언어 
##### 개발언어 및 프레임워크 
###### Node.js, React.js, Python 
##### 데이터베이스
###### MySQL
##### 하드웨어/플랫폼
###### Raspberry Pi
##### 버전 관리 및 협업 도구
###### GitHub
##### 외부 API
###### OPEN Weather Map API
<br>

### 6. 서비스흐름도
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/8cfd18fa-11bf-48b6-948b-45c9fb4ea216)

<br>

### 7. 메뉴구성 
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/0d6cfd0e-2340-40d5-bc38-8c17c23b5dcf)

<br>

### 8. 유스케이스 다이어그램 
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/1b34ea26-2f81-4f32-89cb-65a303258662)

<br>

### 9. 화면설계서
##### 로그인페이지
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/cacb68f3-4a38-4b13-8503-c81544566f4e)
##### 회원가입페이지
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/c78b2b1a-5ce1-47ea-8976-4d01c39c8747)
##### 시간관리페이지
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/5e21c37c-407e-40b5-ac04-926f2a8818a5)
##### 실시간관리페이지(일산화탄소농도 증가시)
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/1d3ec1a5-6e6e-4ba7-9f13-80af7816d411)
##### 실시간관리페이지(안전박스에 설치된 위험벨 누를시)
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/3e66fd35-948a-4ab0-9f44-9fe9fff5fa28)

##### 알림페이지
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/ddf39c35-5ccf-4c53-b0f6-21881b032c0c)
##### 데이터관리페이지
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/47d5621b-48cb-4614-9dd0-4ae3aa850ff8)
##### 마이페이지
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/68cc2b5e-166e-44fc-9ce9-918554ef1f26)

<br>

### 10. 회로도설계
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/08227d15-2660-4618-827e-5a2d97b0d112)

<br>

### 11. 데이터베이스 E-R Diagram
![image](https://github.com/2024-SMHRD-IS-IOT-2/Smartcamperss/assets/140790966/0d16c623-357e-4671-a338-36e2ea40a5db)

<br>

### 12. 팀원 및 역할
###### 최홍철: 기획 및 일정관리, Back(주기능), Front, 서버통신, 최종발표
###### 이종권: Back, DB, Front, UX/UI, 시연영상
###### 박희재: IoT, Back(LCD), 서버통신, 시연설명
###### 김상석: 기획발표
#####  WBS주소
