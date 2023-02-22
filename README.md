# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## ✨기능 구현 목록

- [x] 참여자 이름 입력받기
    - [x] 사람이름은 공백 제외 1글자 이상, 5글자 이하
    - [x] 쉼표로 구분한다
    - [x] 사람이름 중복입력 불가


- [x] 사다리 높이 입력받기
    - [x] 1이상 10이하의 정수만 입력 가능


- [x] 사람이름과 높이에 따라 사다리생성

- [x] 생성한 사다리 출력
    - [x] 사람이름 출력시, 이름이 5자 이하면 공백을 붙여서 5글자로 만듬
    - [x] 사다리를 지정된 형식으로 parsing 하여 출력

## 🎉 Refactoring list

- [x] 에러메세지 enum을 통한 상수화
- [x] 매직넘버 상수화
- [x] 변수명 정리
- [x] 메서드명 정리
- [x] 입력값 예외발생 시, 메세지 출력후 재입력
- [x] 입력된 이름 공백제거
- [x] LadderRow 생성자에서 validate
    - [x] 연속적으로 true가 들어오면 예외발생

## 🚀step2 기능 구현 목록

- [x] 실행결과를 입력 받는다.
    - [x] 쉽표로 구분하여 입력 받는다.
    - [x] 실행 결과는 공백 제외 1글자 이상, 5글자 이하이다.
    - [x] 입력받은 사람의 숫자와 일치하지 않으면 예외를 발생한다.
  
  
- [x] 결과를 보고 싶은 사람의 이름을 입력받는다.
    - [x] 종료커맨드와 일치하면, 게임을 종료한다.
    - [x] 종료커맨드와 일치하지 않으면, 해당하는 사람의 결과를 검색하여 출력한다.
    - [x] 입력받은 사람의 이름이 존재하지 않고, 커맨드와도 일치하지 않을 경우 예외를 발생한다.

  
- [x] 실행 결과를 출력한다.
    - [x] 사용자의 이름이 입력된 경우
        - [x] 이전에 결과를 확인했던 사용자인지 resultTable을 통해 확인한다.
            - [x] resultTable에 결과가 저장되어있으면 저장되어있는 값을 출력한다.
            - [x] resultTable에 결과가 저장되어 있지 않으면, 게임을 실행한뒤 결과를 저장한후 출력한다.
    - [x] ALL command가 입력된 경우
        - [x] resultTable 에서 결과가 저장되어 있지 않은 user들을 찾는다.
        - [x] 위의 결과에 해당하는 결과를 찾는다.
        - [x] 결과를 resultTable에 저장한 후 출력한다.
