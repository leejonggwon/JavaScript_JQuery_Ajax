## ex18문서객체실습
<p align="center">
  <img src="https://github.com/user-attachments/assets/bd789bee-2b4b-4da1-9fc3-ae7ab4fb25f1" 
       alt="사진1" 
       width="300" />
  <img src="https://github.com/user-attachments/assets/6e0465a4-16b7-4fc0-aed0-03a971c4202b" 
       alt="사진2" 
       width="300" />
</p>

좋아요/싫어요 버튼을 통한 이벤트 처리 및 DOM 조작 실습
<br>
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
<br>


## 로또번호생성_ 실습용
<p align="center">
  <img src="https://github.com/user-attachments/assets/4a97f082-b835-4464-adb2-5517ca62f8b9" 
       alt="로또번호생성실습" 
       width="600" />
</p>

<br>
<br>

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
<br>

## 가위바위보게임_실습용
<p align="center">
  <img src="https://github.com/user-attachments/assets/58cd114e-2513-4b44-a9bb-a5cf38e2203c" 
       alt="가위바위보게임_실습용" 
       width="600" />
</p>

버튼 클릭 시 유저와 컴퓨터가 랜덤하게 가위·바위·보를 선택하고, 승패를 비교해 결과와 스타일을 동적으로 출력하는 실습
<br>
<br>
#### 1. Play 버튼 클릭 → 유저와 컴퓨터가 Math.random() 으로 랜덤하게 "가위, 바위, 보" 선택
#### 2.결과 비교 → 승/패/무승부를 판별 (if문 + 삼항연산자 활용)
▪ document.getElementById 로 HTML 요소(like, icon)에 접근
▪ innerText 로 숫자를 읽고 증가/감소
▪ innerHTML 로 이모지(아이콘)를 변경
#### 3.화면 출력
▪ 선택한 값을 이미지로 표시 (innerHTML에 <img> 삽입)
▪ 결과(win/lose/tie)를 텍스트로 표시
▪ CSS 클래스(.win, .lose, .tie)를 동적으로 적용해 테두리 색상 변경

<br>

## ex21Ajax
<p align="center">
  <img src="https://github.com/user-attachments/assets/c40707f2-b3c4-4d89-888f-d25f2326ae87" 
       alt="ex21" 
       width="200" />
  <img src="https://github.com/user-attachments/assets/1add62cc-8573-47c0-9c20-263679fd53bb" 
       alt="ex21-1" 
       width="200" />
</p>

JSON + jQuery를 활용한 AJAX, DOM 조작, 이벤트 처리 실습
<br>
<br>
#### 1.목적
▪ 영화진흥위원회(KOBIS) API에서 JSON 형태의 영화 데이터를 가져와, 웹 페이지에서 동적으로 테이블로 출력하는 실습

#### 2.사용 기술
▪ AJAX: 페이지 새로고침 없이 서버에서 영화 데이터를 가져오기 위해 사용

▪ JSON: 서버에서 전달받는 데이터 포맷

▪ jQuery: AJAX 요청, DOM 조작, 이벤트 처리를 간단하게 구현

#### 3.주요 코드 흐름

▪ 버튼 클릭 이벤트 등록

▪ AJAX 요청 수행

▪ JSON 데이터 처리

▪ DOM 조작

<br>
<br>

## ex22카카오지도

<p align="center">
  <img src="https://github.com/user-attachments/assets/e0e31acf-027b-4493-80eb-b530bba0a95b" 
       alt="ex22카카오지도" 
       width="300" />
  <img src="https://github.com/user-attachments/assets/7d30898b-ead6-4174-aeb5-94dc1a67ead8" 
       alt="ex23카카오지도 여러개마커출력" 
       width="300" />
</p>

#### 1.목적
▪ 카카오맵 API를 활용하여 지도 위에 마커를 표시하고, 마커와 인포윈도우에 이벤트를 등록하는 방법을 실습

#### 2.주요 학습 포인트
▪ 마커생성하기

▪ 마커에 인포윈도우 표시하기

▪ 마커에 이벤트 등록하기

▪ 여러개 마커에 이벤트 등록하기

<br>
<br>

## ex23카카오지도_여러개마커출

<p align="center">
  <img src="https://github.com/user-attachments/assets/5dd54902-2459-4ca4-9ec4-7b285b0d9703" 
       alt="ex23 관광지" 
       width="300" />
</p>


#### 1. 목적
▪ 공공데이터 API(JSON)에서 충청북도 괴산군 관광지 정보를 가져와, 카카오맵에 마커로 표시하는 실습

#### 2. 사용기술
▪ AJAX (jQuery): 페이지 새로고침 없이 서버에서 관광지 데이터를 요청

▪ JSON: API에서 전달받는 데이터 포맷

▪ 카카오맵 API: 지도 생성 및 마커 표시

▪ jQuery: AJAX 요청, DOM 조작, 이벤트 처리 간단히 구현

<br>
<br>







