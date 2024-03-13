# 별책빵
> 국비 파이널 프로젝트<br>
> 온라인 서점 + 내 위치를 기반으로 도서관 찾아가기
>
> 개발기간: 2024.01~02 개발인원: 3명


## :wrench:기술 스택

### 프론트엔드
<img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=white"> <img src="https://img.shields.io/badge/java_script-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white">
<img src="https://img.shields.io/badge/styled_components-DB7093?style=for-the-badge&logo=styledcomponents&logoColor=white">

### 백엔드
- java11
- SpringBoot
- Spring Data JPA
- Spring Security
- JWT
- OAuth2.0
- Oracle
- AWS(LightSail)

### 협업툴
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white"> 
<img src="https://img.shields.io/badge/canva-00C4CC?style=for-the-badge&logo=canva&logoColor=white"> 

## 본인 기여도
<h3>백엔드</h3>

- DB 설계 40%
- SpringSecurity 100%
- Oauth2 100%
  - 구글, 네이버, 카카오 로그인 api 사용
- JWT 100%
  - 멤버ID를 저장한 엑세스 토큰과 리프레시 토큰을 발급해 프론트로 전달
- 장바구니 100%
  - 기존 장바구니에 있는 상품은 장바구니에 추가되지 않도록 구현
- 주문하기 100%
  - 기본배송지 정보 불러오기
  - 주문 및 결제 완료시 장바구니에서 해당 상품 삭제
- 결제하기 100%
  - 포스원 api 사용 
- 관리자 기능 35%
  - 회원관리 100%
  
<h3>프론트 엔드</h3>

- 소셜로그인 100%
- 로그인 35%
  - 발급된 엑세스토큰을 쿠키로 설정
- 장바구니 100%
  - 장바구니 상품 개수 표시/체크박스로 원하는 상품만 주문하기 
- 주문, 결제 100%
- 마이페이지 33%
  - 회원 주문내역 
- 책 상세 페이지 33%
- 관리자 35%
  - 회원관리 페이지



<h3>그 외 </h3>

- 깃허브 관리 100%
- ui 디자인 75%



## :speaker: 프로젝트 주요 기능 
- 네이버 책검색 API를 활용하여 책 검색 및 상세 정보 표시
- 크롤링을 통한 책 정보 수집
- 책 상세 정보와 수량을 장바구니에 담고 결제하기 구현
- 공공 데이터를 활용하여 도서관 위치 정보 수집
- 카카오 맵 API를 통해 도서관 위치 표시
- 주문, 문의 내역 확인
- 관리자 계정으로 주문관리, 문의관리, 회원관리


## 유스케이스
![image](https://github.com/fin-finalProject/final-backend/assets/147576555/8c0a4a53-12d0-4559-8f66-6ca019ad7953)
![image](https://github.com/fin-finalProject/final-backend/assets/147576555/5149ece8-9fb5-4924-aa06-8dfb7de986a6)



## 화면
- 메인 화면
  
![image](https://github.com/fin-finalProject/final-backend/assets/147576555/b5c5407f-7c80-446e-8d4c-8e98d145b463)

- 로그인

  ![image](https://github.com/fin-finalProject/final-backend/assets/147576555/3449902e-5741-42dd-94de-1445c76e5b65)


- 책 상세 페이지

![image](https://github.com/fin-finalProject/final-backend/assets/147576555/060b2b69-095f-4068-82bb-1031b8ce2216)

- 장바구니

![image](https://github.com/fin-finalProject/final-backend/assets/147576555/7b97fa4e-08ab-4d86-a2a7-e4ae81866e2e)

- 결제
  ![image](https://github.com/fin-finalProject/final-backend/assets/147576555/7bd2d53f-a167-4544-8165-674db4fb8850)
![image](https://github.com/fin-finalProject/final-backend/assets/147576555/7fc6eddc-8206-4b48-ba8a-61feff7b4b96)


- 주문 내역

![image](https://github.com/fin-finalProject/final-backend/assets/147576555/1b7dcc4e-539a-4f1c-a8bb-79ab705b9b82)

- 회원 관리
![image](https://github.com/fin-finalProject/final-backend/assets/147576555/8345c3b8-c210-4092-8af8-8f5562b654a1)



