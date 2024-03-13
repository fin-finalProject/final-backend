# 별책빵
> 국비 파이널 프로젝트<br>
> 온라인 서점 + 내 위치를 기반으로 도서관 찾아가기
>
> 개발기간: 2024.01~02 개발인원: 3명


## :wrench:기술 스택
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

<br>

## 본인 기여도
<h3>백엔드</h3>

- DB 설계 40%
- SpringSecurity 100%
- Oauth2 100%
  - 구글, 네이버, 카카오 로그인 api 사용
- JWT 100%
  - 멤버ID를 저장한 엑세스 토큰과 리프레시 토큰을 발급해 프론트로 전달
- 장바구니 100%
  - 장바구니 추가, 삭제 
  - 기존 장바구니에 있는 상품은 장바구니에 추가되지 않도록 구현
- 주문하기 100%
  - 기본배송지 정보 불러오기
  - 주문 및 결제 완료시 장바구니에서 해당 상품 삭제
- 결제하기 100%
  - 포스원 api 사용
- 마이페이지 33%
  - 회원 주문내역 리스트
- 관리자 기능 35%
  - 회원관리 100%
    - 미응답된 문의내역 & 미승인된 승인건수 표시
    - 주문 승인 처리
    - 회원 수정, 탈퇴 기능 



<h3>그 외 </h3>

- 깃허브 관리 100%

<br>

## 프로젝트를 통해 배운 점

- 백엔드에서 JWT를 생성하여 엑세스 토큰을 프론트엔드로 전달하는 과정에서 여러 어려움을 겪었지만, 결과적으로 백엔드와 프론트엔드 간의 데이터 교환 방식, 특히 Header 활용법에 대해 상당한 이해를 얻을 수 있었습니다.
- 웹 크롤링을 통해 정보를 수집하고 이를 정기적으로 데이터베이스에 업데이트하는 방법을 익혔습니다.
- 리액트의 비동기 처리 방식에 대한 이해를 향상시킬 수 있었습니다.

<br>

## :speaker: 프로젝트 주요 기능 
- 네이버 책검색 API를 활용하여 책 검색 및 상세 정보 표시
- 크롤링을 통한 책 정보 수집
- 책 상세 정보와 수량을 장바구니에 담고 결제하기 구현
- 공공 데이터를 활용하여 도서관 위치 정보 수집
- 카카오 맵 API를 통해 도서관 위치 표시
- 주문, 문의 내역 확인
- 관리자 계정으로 주문관리, 문의관리, 회원관리

## ERD
<img src="https://github.com/fin-finalProject/final-backend/assets/147576555/05607ae0-71e3-441d-abd1-debf0f954ed9"/>



## 유스케이스
<img src="https://github.com/fin-finalProject/final-backend/assets/147576555/3b31c45c-bb95-48e6-a78b-58d0a0c94f73"/>



