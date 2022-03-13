# java-functional-practice

### 1급 시민서에 대해서.

1급 시민은 사전 조건 3가지가 있다.
1. 함수/메서드 의 매개변수 (parameter) 로써 전달 할 수 있는가.
2. 함수/메서드 의 반환값 (return) 이 될 수 있는가.
3. 변수에 담을 수 있는가.

위 조건들을 만족하면 1급 시민 이 된다.
Object 를 생각해 봤을때, 매개변수 받을수 있고, 반환값 있고, 변수에 담을 수 도 있다.
- 그래서 Object 는 1급 시민이다.
- 함수를 생각해 보면, 매개변수로 함수를 지정 할 수도없고, 반활할떄 함수로 지정한다는것,
- 어떤 변수를 선언하고 , 함수를 호출하는것도 아닌, 함수 자체를 지정한다면,
- 그 변수는 무슨타입이고,, 뭔가 싶다.

함수 를 object 형태로 나타낸다면, 이모든게 해결된다. 

---
### Adder 라는 Class 가  필요없이 lamda 로 n + 10 해결

Function<Integer,Integer> myAdder = new Adder();
X : myAdder(1); -> 11
O :  Function<Integer, Integer> myAdder = x -> x + 10;;

