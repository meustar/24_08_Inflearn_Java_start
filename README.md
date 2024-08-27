# section.2 자바란?

### 자바 표준 스펙
#### 자바 표준 스펙
- 자바 컴파일러 - 스펙
- 자바 실행 라이브러리 - 스펙
- 자바 가상 머신(JVM) - 스펙

#### 자바 구현 (실체화)
- 오라클 Open JDK
- Adoptium Eclipse Temurin
- Amazon Corretto

### 자바는 표준 스펙과 구현으로 나눌 수 있다.
- 자바 표준 스펙
  - 자바는 이렇게 만들어야 한다는 설계도, 문서
  - 이 표준 스펙을 기반으로 여러 회사에서 실제 작동하는 자바를 만든다(구현)
  - 표준 스펙은 자바 커뮤니티 프로세스(JCP)를 통해 관리된다.
- 다양한 자바 구현
  - 여러 회사에서 자바 표준 스펙에 맞추어 실제 작동하는 자바 프로그램을 개발한다.
  - 각각 장단점이 있다. Amazon Corretto는 AWS에 최적화 되어있다.
  - 각 회사들은 대부분 윈도우, MAC, 리눅스 같이 다양한 OS에서 작동하는 버전의 자바도 함께 제공한다.

### 변경의 용이
- 자바 구현들은 모두 표준 스펙에 맞도록 개발되어 있어서 오라클 Open JDK를 사용하다가 Amazon Corretto 자바로 변경해도 문제 없이 동작한다.

### 컴파일과 실행
#### 자바 프로그램은 컴파일과 실행 단계를 거친다.
- Hello.java와 같은 자바 소스 코드를 개발자가 작성
- 자바 컴파일러를 사용해서 소스 코드를 컴파일 한다.
  - 자바가 제공하는 javac 라는 프로그램을 사용
  - .java -> .class 파일이 생성된다.
  - 자바 소스 코드를 바이트코드로 변환하며 자바 가상 머신에서 더 빠르게 실행될 수 있게 최적화하고 문법 오류도 검출한다.
- 자바 프로그램을 실행한다.
  - 자바가 제공하는 java라는 프로그램을 사용
  - 자바 가상 머신(JVM)이 실해되면서 프로그램이 작동


## 자바와 운영체제 독립성
### 일반적인 프로그램
- 일반적인 프로그램은 다른 운영체제에서 실행할 수 없다.
- 예를 들어 윈도우 프로그램은 MAC이나 리눅스에서 작동하지 않는다.
- 왜냐하면, 윈도우 프로그램은 윈도우 OS가 사용하는 명령어들로 구성되어 있어 다른 OS와는 호환되지 않는다.

### 자바 프로그램
- 자바 프로그램은 자바가 설치된 모든 OS에서 실행할 수 있다.
- 자바 개발자는 특정 OS에 맞춰서 개발을 하지 않고, 자바에 맞추어 개발하면 된다. OS 호환성 문제는 자바가 해결한다. Hello.class 와 같이 컴파일된 자바 파일은 모든 자바 환경에서 실행할 수 있다.
- 각각의 OS(윈도우, MAC, 리눅스)에 맞는 자바를 설치만 하면된다.

### 자바 개발과 운영 환경
- 개발할 때 자바와 서버에서 실행할 때 다른 자바를 사용할 수 있다.
- 개발자들은 개발의 편의를 위해서 윈도우나 MAC OS를 주로 사용한다.
- 서버는 주로 리눅스를 사용한다. 만약 AWS를 사용한다면 Amazon Corretto 자바를 AWS 리눅스 서버에 설치하면 된다.
- 자바는 운영체제 독립성 덕분에 각각의 환경에 맞추어 설치하는 것이 가능하다.

# section.3 변수
- 패키지는 자바 파일을 구분하기 위한 폴더로 이해하자.
- variable 라는 패키지를 만들었다면, 해당 패키지에 들어가는 자바 파일 첫줄에 package variable;와 같이 소속된 패키지를 선언해 주어야 한다.
- 자바 파일이 위치하는 패키지와 package variable 선언 위치가 같아야 한다.
```java
package variable;

public class Var1 {

    public static void main(String[] args) {
        System.out.println(20); // 변경 10 -> 20
        System.out.println(20); // 변경 10 -> 20
        System.out.println(20); // 변경 10 -> 20
    }
}
```
숫자 10을 20으로 변경해야 한다면, 여기서 총 3번의 코드 변경이 발생한다.
만약 바꿔야 할 부분이 100개, 1000개 라면 그 갯수 만큼의 코드를 모두 변경해야 한다.

하지만 값을 어딘가에 보관해두고 필요할 때 값을 꺼내서 읽을 수는 있는 저장소가 있다면?
100개 1000개의 변경할 코드부분을 단지 저장소에 저장한 값만 바꾸면 해결될 수 있다.

모든 프로그래밍 언어에는 이런 문제를 해결하기 위해 변수(variable)라는 기능을 제공한다.
변수는 이름 그대로 변할 수 있다는 뜻이다.

```java
package variable;

public class Var2 {
  public static void main(String[] args) {
    int a;  // 변수 선언
    a = 20; // 변수 초기화 10 -> 20 변경

    System.out.println(a);
    System.out.println(a);
    System.out.println(a);
  }
}
```
변수 a의 값을 변경하면 출력결과가 모두 함께 변경된다.

## 변수 선언
### 숫자 정수 보관소 
#### int a
- 숫자 정수(integer)를 보관할 수 있는 이름이 a라는 데이터 저장소를 만든다. = 변수
- 변수를 만드는 행위를 **"변수 선언"** 이라 한다.
- 이제 변수 a에는 숫자 정수를 보관할 수 있다.
- 숫자 정수 뿐만 아니라 문자, 소수와 같이 다양한 종류의 값을 저장할 수 있는 변수들이 있다. 우선 숫자 정수를 저장하는 "int"를 알아두자.

### 변수에 값 대입
#### a = 10
- 자바에서 "="는  오른쪽에 있는 값을 왼쪽에 저장한다는 뜻이다. 수학에서의 두 값이 같다(equals)와는 다른 뜻이다.
- 숫자를 보관할 수 있는 데이터 저장소인 변수 a에 값 10을 저장한다.
- 선언한 변수에 "처음으로 값을 대입"해서 저장하는 것을 "변수 초기화"라 한다

## 변수 값 읽기
### System.out.println(a)
- 변수에 저장되어 있는 값을 읽어서 사용하는 방법은 간단하다. 변수 이름을 적어두기만 하면 된다.
- 변수 a에 10이 들어가 있다면 자바는 실행 시점에 변수의 값을 읽어서 사용한다.
  - System.out.println(a) // 변수 a의 값을 읽음
  - System.out.println(10)// a의 값인 10으로 변경, 숫자 10 출력
- 참고로 변수의 값은 반복해서 읽을 수 있다. 변수의 값을 읽는다고 값이 없어지는 것이 아니다.

### 변수 값 변경
```
a = 10;                 // 1. 변수 a에 10을 저장한다.
System.out.println(a);  // 2. 변수 a의 값을 읽는다. a에는 10이 들어있어 10을 출력한다.
a = 50;                 // 3. 변수 a의 값을 50으로 변경한다 a(10 -> 50)
System.out.println(a);  // 4. 변수 a의 값을 읽는다. a에는 50이 들어있어 50을 출력한다.
```

## 변수 선언과 초기화
### 변수 선언
- 변수를 선언하면 컴퓨퓨터 메모리 공간을 확보해서 데이터를 저장할 수 있다. 변수의 이름을 통해서 해당 메모리 공간에 접근할 수 있다.
- 데이터를 보관하는 공간을 만들고, 그곳에 이름을 부여한다.
```java
package variable;

public class Var4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c, d;
    }
}
```

### 변수 초기화
```java
package variable;

public class Var5 {
    public static void main(String[] args) {
        // 1. 변수 선언, 초기화 각각 따로
        int a;
        a = 1;
        System.out.println(a);

        // 2. 변수 선언과 초기화를 한번에.
        int b = 2;
        System.out.println(b);

        // 3. 여러 변수의 선언과 초기화를 한번에
        int c = 3, d = 4;
        System.out.println(c);
        System.out.println(d);
    }
}
```
1. 변수의 선언과 초기화를 각각 따로 할 수 있다.
2. 변수를 선언하면서 동시에 초기화 할 수 있다.
3. 여러 변수를 선언하면서 초기화도 동시에 진행할 수 있다.


#### 변수는 초기화 해야한다.
만약 변수를 초기화 하지 않고 사용하면 어떻게 될까?
```java
package variable;

public class Var6 {
    public static void main(String[] args) {
        int a;
        System.out.println(a);
    }
}
```
#### 초기화 하지 않은 변수 읽기
에러 발생.
```
java: variable a might not have been initialized
```
- 변수가 초기화되지 않았다는 오류이다.
- 컴퓨터에서 메모리는 여러 시스템이 함께 사용하는 공간이다. 그래서 어떠한 값들이 계속 저장된다.
- 변수를 선언하면 메모리상의 어떤 공간을 차지하고 사용된다. 그 공간에 기존의 어떤 값이 있었는지는 모른다. 따라서 초기화를 하지 않으면 이상한 값이 출력될 수 있다.
- 이러한 문제를 예방하기 위해 자바는 변수를 초기화 하도록 강제 한다.

> 참고:
> 지금의 변수는 지역변수(Local Variable)라고 하며, 지역 변수는 개발자가 직접 초기화를 해주어야한다. 클래스 변수와 인스턴스 변수는 자바가 자동으로 초기화를 진행한다.

> 참고:
> 컴파일 에러는 자바 문법에 맞지 않았을 때 발생하는 에러이다.
> 컴파일 에러는 오류를 빨리, 그리고 명확하게 찾을 수 있기 때문에 좋은 에러이고, 덕분에 버그를 빠르게 찾아서 고칠 수 있다.
> ```
> D:\inflearn_java_start\java-start\src\variable\Var6.java:6:28
> ```
> 컴파일 에러가 발생한 위치를 알려준다. 6번째줄 28번째 칸

## 변수의 타입 1
```java
package variable;

public class Var7 {
    public static void main(String[] args) {
        int a = 100;        // 정수
        double b = 10.5;    // 실수
        boolean c = true;   // 불리언(boolean) true, false 입력 가능
        char d = 'A';       // 문자 하나
        String e = "Hello"; // 문자열, 문자열을 다루기 위한 특별한 타입

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
```
실행결과
```
100
10.5
true
A
Hello
```
- 변수는 데이터를 다루는 종류에 따라 다양한 형식이 존재한다.
- 이러한 형식을 영어로는 타입(Type)이라 하고, 우리말로는 "형식"또는"형"이라 한다.
- 예를 들어 int 타입, int 형식, int 형 등으로 부른다.

#### 변수 타입의 예
- int : 정수를 다룬다 예) 1, 100, 1000
- double : 실수를 다룬다. 예) 0.2, 1.5, 100.121
- boolean : 불리언 타입. true, false 값만 사용하며, 참/거짓 을 판단하는 곳에서 사용한다.
- char : 문자 하나를 다룰 때 사용한다. 작음따옴표(')를 사용해서 감싼다. 예) 'A', 'a', '가'
- String : 문자열을 다룬다. 큰따옴표(")를 사용해야 한다. 예) "Hello Java"
> 참고 : String은 첫 글자가 대문자로 시작하는 특별한 타입이다.(참조타입) 클래스를 배워야 이해할 수 있다.

#### 자신의 타입에 맞는 데이터 사용
각 변수는 지정한 타입에 맞는 값을 사용해야 한다. 그렇지 않으면 컴파일 오류가 발생한다.
- int a = "백원" : 정수 타입에 문자열(X)
- int a = "100" : 이것은 숫자 100이 아니라 문자열 "100"이다.
- int a = 100 : 맞는 표현.

#### 리터럴
코드에서 개발자가 직접 적은 100, 10.5, true, 'A', "Hello Java"와 같은 고정된 값을 프로그래밍 용어로 **리터럴**(literal) 이라한다
```java
int a = 100;        // 정수 리터럴
double b = 10.5;    // 실수 리터럴
boolean c = true;   // 불리언 리터럴
char d = 'A';       // 문자 하나 리터럴
String e = "Hello"; // 문자열 리터럴
```
변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.

## 변수의 타입 2
### 숫자 타입
```java
package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127;       // -128 ~ 127
        short s = 32767;    // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,684 ~ 2,147,483,647 (약 20억)

        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f;
        double d = 10.0;
    }
}
```
- 메모리를 작게 사용하면 작은 숫자를 표현할 수 있고, 많이 사용하면 큰 숫자를 표현할 수 있다.
- 변수를 선언하면 표현 범위에 따라 메모리 공간을 차지한다. 그래서 필요에 맞도록 다양한 타입을 제공한다.

#### 변수와 메모리 공간 크기
표현할 수 있는 숫자의 범위와 차지하는 메모리 공간
- 정수형
  - byte : (1byte, 2⁸) -128 ~ 127
  - short : (2byte, 2¹⁶) -32,768 ~ 32,767
  - int : (4byte, 2³²) -2,147,483,684 ~ 2,147,483,647 (약 20억)
  - long : (8byte, 2⁶⁴) -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
- 실수형
  - float : (4byte, 2³²) 대략 -3.4E38 ~ 3.4E38, 7자리 정밀도
  - double : (8byte, 2⁶⁴) 대략 -1.7E308 ~ 1.7E308, 15자리 정밀도
    - double이 float 보다 정밀도가 높다.
- 기타
  - boolean : (1byte, 2⁸) true, false
  - char : (1byte, 2⁸) 문자 하나 
  - String : 메모리 사용량은 문자열 길이에 따라 동적으로 달라진다.

#### 리터럴 타입 지정
- 정수 리터럴은 int를 기본으로 사용한다. 만약 int의 범위인 20억을 넘어가게 되면, L을 붙여서 정수 리터럴을 long으로 변경해야 한다.
- 실수 리터럴은 double을 기본으로 사용한다.

#### 변수 타입 정리(실무에서 사용하지 않는 타입들)
- byte : 표현 길이가 너무 작다. 자바는 기본으로 4byte(int)를 효율적으로 계산하도록 설계되어 있다.
  - byte 타입을 직접 선언하고 여기서 숫자 값을 대입해도 계산하는 일은 거의 없다.
  - 대신 파일을 바이트 단위로 다루기 때문에 파일전송, 파일복사 등에 주로 사용한다.
- short : 표현의 길이가 작다, byte와 이유가 같다.
- float : 표현 길이와 정밀도가 낮다. (계산에 오차가 많아진다. 위험하다.)
- char : 문자 하나를 표현하는 일은 거의 없다. 문자 하나를 표현할 때도 문자열을 사용할 수 있다. String a = "a"와 같이 사용하면 된다.

#### 자주 사용하는 타입
- 정수 - int, long : 자바는 정수에 기본으로 int를 사용한다.
  - 파일을 다룰 때는 byte를 사용
- 실수 - double : 실수는 고민하지 말고 double을 쓰자.
- 불린형 - boolean : true, false. 참/거짓을 표현한다. 조건문에서 자주 사용한다.
- 문자열 - String : 문자를 다룰 때는 문자 하나든 문자열이든 모두 String을 사용하는 것이 편리하다.


## 변수 명명 규칙
### 규칙은 필수이다. 규칙을 지키지 않으면 컴파일 오류가 발생
### 관례는 필수는 아니지만 전세계 개발자가 해당 관례를 따르기 때문에 사실상 규칙이라 생각하자.

### 규칙
- 변수 이름은 숫자로 시작할 수 없다.(1num, 1st)
  - 숫자를 이름안에 포함하는 것은 가능 (myVar1, num1)
- 이름에는 공백이 들어갈 수 없다.
- 자바의 예약어를 변수 이름으로 사용할 수 없다. (int, class, public..등)
- 변수 이름에는 영문자(a-z, A-Z), 숫자(0-9),달러 기호($) 또는 밑줄(_)만 사용할 수 있다.

### 관례
- 소문자로 시작하는 낙타 표기법
  - 변수 이름은 소문자로 시작하는 것이 일반적. 여러 단어로 이루어진 변수 이름의 경우, 첫 번째 단어는 소문자로 시작하고 그 이후의 각 단어는 대문자로 시작하는 낙타 표기법(camel case)를 사용한다 (orderDetail, myAccount)
> #### 낙타표기법
> 낙타표기법(Camel Case)은 프로그래밍에서 변수, 함수, 클래스 등의 이름을 지을 때 많이 사용하는 표기법 중 하나이다. 이 표기법의 이름은 이름이 여러 단어로 구성되어 있을 때, 각 단어의 첫 글자가 대문자로 시작하고, 이 대문자들이 낙타의 등봉처럼 보이는 것에서 유래했다. 낙타 표기법을 사용하면 이름에 공백을 넣지 않고도 여러 단어를 쉽게 구분할 수 있으므로, 변수의 이름을 이해하기 쉽게 만들어 준다. 또한, 대부분의 프로그래밍 언어에서는 이름에 공백을 포함할 수 없기 때문에, 낙타표기법은 이런 제한을 우회하는 좋은 방법이다.

### 자바 언어의 관례 정리.
#### 클래스는 대문자로 시작, 나머지는 소문자로 시작
- 자바에서 클래스 이름의 첫 글자는 대문자로 시작한다. 나머지는 모두 첫 글자를 소문자로 시작하며, 낙타 표기법을 적용한다.
  - 클래스 : Person, OrderDetail
  - 변수를 포함한 나머지: firstName, userAccount
- 예외
  - 상수는 모두 대문자를 사용하고 언더바로 구분
    - USER_LIMIT
  - 패키지는 모두 소문자를 사용.
    - org.spring.boot
> 참고로 이름은 그 용도를 명확하게 설명해야 한다.
> - a, b: 단순 예제에서만 사용
> - studentCount, maxScore, userAccount, orderCount: 용도를 명확하게 설명한다.


# Section.4 연산자
## 산술 연산자
### 연산자 시작
+, -, *, / 와 같이 계산을 수행하는 기호

#### 연산자 종류
- 산술 연산자 : +(더하기), -(빼기_, *(곱하기), /(나누기), %(나머지)
- 증감(증가 및 감소) 연산자 : ++, --
- 비교 연산자 : ==, !=, >, <, >=, <=
- 논리 연산자 : &&(AND), ||(OR), ! (NOT)
- 대입 연산자 : =, +=, -=, *=, /=, %=
- 삼항 연산자 : ? :

#### 연산자와 피연산자

 
> 3 + 4
> 
> a + b

- 연산자(operator) : 연산 기호 +, -
- 피연산자(operand) : 연산 대상 3, 4, a, b

### 1. 산술 연산자.
```java
package operator;

public class Operator1 {
    public static void main(String[] args) {

        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;    // 5 / 2 -> 2.5 하지만, int는 소수점 표현이 안되는 "정수"이다.
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
```
실행결과
```
a + b = 7
a - b = 3
a * b = 10
a / b = 2
a % b = 1
```
- 5 / 2의 결과는 2.5가 되어야 하지만 결과는 소수점이 제거된 2가 나왔다.
  - 자바에서 같은 int형끼리 계산하면 계산 결과도 같은 int형을 사용한다. int형은 정수이기 때문에 소수점 이하를 포함할 수 없다.
- 나머지 연산자(%)
  - 이름 그대로 나머지를 구하는 연산자이다. 5 / 2는 몫이 2, 나머지가 1이다. 따라서 나머지 연산자 5 % 2의 결과는 1이 된다.
  - 나머지 연산자는 실무와 알고리즘 모두 종종 사용된다.

>
> 주의. 0의로 나누기
> 10 / 0 과 같이 숫자는 0으로 나눌 수 없다.(수학에서 허용하지 않음)
> 실행하면 다음과 같은 예외가 출력된다.
 
```
xception in thread "main" java.lang.ArithmeticException: / by zero
```
> 예외가 발생하면 해당 시점 이후의 결과가 출력되지 않고 프로그램이 종료된다.
---

#### 문자열 더하기
문자열에 + 연산자를 사용하면 두 문자를 연결할 수 있다.
```java
package operator;

public class Operator2 {
    public static void main(String[] args) {

        // 문자열과 문자열 더하기 1
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기 2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기 1
        String result3 = "a + b = " + 10;   // 문자열과 더하는 숫자는 문자열 "10"으로 바꿔서 계산한다.
        System.out.println(result3);

        // 문자열과 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;         //"a + b = " + 20 => "a + b = " + "20" 숫자를 문자열로 바꾼다.
        System.out.println(result4);
    }
}
```
실형결과
```
hello world
string1string2
a + b = 10
a + b = 20
```
1. 문자열과 문자열 더하기 1
String result1 = "hello " + "world"
- "hello "문자열과 "world" 문자열을 더해서 "hello world" 문자열을 만든다.
- 결과를 result1에 저장한다.

2. 문자열과 문자열 더하기 2
   String result2 = s1 + s2;
- s1과 s2 변수에 있는 문자열을 읽는다.
- "string1" + "string2" 연산을 수행해서"string1string2" 문자열을 만든다.
- 결과를 result2에 저장한다.

3. 문자열과 숫자 더하기 1
문자와 숫자를 더하면 숫자를 문자열로 변경한 다음에 서로 더한다.
- "a + b = " + 10;
- 문자 : "a + b = "
- 숫자 : 10

계산과정
```
"a + b = "(String) + 10(int)                // 문자열과 숫자 더하기
"a + b = "(String) + "10"(int -> String)    // 숫자를 문자열로 변경
"a + b = " + "10"                           // 문자열과 문자열 더하기
"a + b = + 10"                              // 결과
```

4. 문자열과 숫자 더하기 2
   변수에 담겨 있어도 문자와 숫자를 더하면 문자가 된다.
계산과정
```
str(String) + num(int)
"a + b = "(String) + num(int)               // str 변수에서 값 조회
"a + b = "(String) + 20(int)                // num 변수에서 값 조회
"a + b = "(String) + "20"(int -> String)    // 숫자를 문자열로 변경
"a + b = " + "20"                           // 문자열과 문자열 더하기
"a + b = + 20"                              // 결과
```
자바는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다.
(문자열에 더하는것은 다 문자열이 된다.)

#### 연산자 우선순위
```java
package operator;

public class Operator3 {
    public static void main(String[] args) {
        
        int sum1 = 1 + 2 * 3;       // 1 + (2 * 3)
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
```
실행결과
```
sum1 = 7
sum2 = 9
```
- 출력 결과 연산자 우선순위에 의해 곱셈이 먼저 계산되었다.
- 연산자 우선순위를 변경하려면 수학과 마찬가지로 ()를 사용하면 된다.

```java
package operator;

public class Operator4 {
    public static void main(String[] args) {

        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3);   // sum3과 같다.
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
```
실행결과
```
sum3 = 13
sum4 = 13
```
- 결괏값이 동일하지만 눈에 보이는 명시적인 효과는 다르다.
- 괄호를 사용하는 것이 더 명확하고 이해하기 쉽다.

**코드를 몇자 줄여서 모호하거나 복잡해 지는 것 보다 코드가 더 많더라도 명확하고 단순한 것이 더 유지보수 하기 좋다.**

#### 연산자 우선순위 암기법
자바는 연산자간 우선순위가 있다.
1. 괄화 ()
2. 단항 연산자 (++, --, !, ~, new, (type))
3. 산술 연산자 (*, /, % 우선, 그다음에 +, -)
4. Shift 연산자 (<<, >>, >>>)
5. 비교 연산자 (<, <=, >, >=, instanceof)
6. 동식 연산자 (==, !=)
7. 비트 연산자 (&, ^, |)
8. 논리 연산자 (&&, ||)
9. 삼항 연산자 (? :)
10. 대입 연산자 (=, +=, -=, /=, %= 등등)

실무 개발자들은 연산자 우선순위를 외우지 않는다

- 연산자 우선순위는 딱 2가지만 기억하자.
1. 상식선에서 우선순위를 사용하자.
2. 애매하면 괄호()를 사용하자

>**정리**
>- 연산자 우선순위는 상식선에서 생각하고, 애매하면 괄호를 사용
>- 누구나 코드를 보고 쉽고 명확하게 이해할 수 있어야 한다. 개발자들이 연산자 우선순위를 외우고 개발하는 것이 아니다. 복잡하면 괄호를 넣어라.
>- 개발에서 가장 중요한 것은 단순함과 명확함이다. 애매하거나 복잡하면 안된다.

---
### 증감 연산자 *중요*
- ++, --로 표현하며, 변수의 값을 1만큼 **증가**시키거나 **감소**시킨다.
```java
package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {

        int a = 0;

        a = a  + 1;
        System.out.println("a = " + a);     // 1

        a = a + 1;
        System.out.println("a = " + a);     // 2

        // 증감 연산자
        ++ a;   // a = a + 1
        System.out.println("a = " + a);     // 3
        ++ a;   // a = a + 1
        System.out.println("a = " + a);     // 4
    }
}
```
- 변수 a의 값을 하나 증가하려면 a = a + 1 연산을 수행해야 한다. 자기 자신에 1을 더하고 그 결과를 자신에게 다시 저장해야 한다.

#### 전위/후위 증감연산자
증감 연산자는 피연산자 앞에 두거나 뒤에 둘 수 있으며, 연사자의 위치에 따라 연산이 수행되는 시점이 달라진다.
- ++a : 전위(Prefix) 증감 연산자 -> 값을 일단 증가
- a++ : 후위(Postfix) 증감 연산자 -> 마지막에 증가

```java
package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {

        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a;        // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);  // 결과 : a = 2, b = 2

        // 후위 증감 연산자 사용 예
        a = 1;          // a 값을 다시 1로 지정
        b = 0;          // b 값을 다시 0으로 지정

        b = a++;        // a의 현재 값을 b에 먼저 대입하고, 그 후 a값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);  // 결과 : a = 2, b = 1
    }
}
```
실행결과
```
a = 2, b = 2
a = 2, b = 1
```

1. 전위 증감 연산자
- 증감 연산이 먼저 수행된 후 나머지 연산 수행
```
a = 1, b = 0
b = ++a       // 전위 증감 연산자

a = a + 1     // a의 증감 연산이 먼저 진행, a = 2
b = a         // 이후에 a를 대입 b = 2

결과 : a = 2, b = 2
```

2. 후위 증감 연산자
- 다른 연산이 먼저 수행된 후 증감 연산이 수행
```
a = 1 , b = 0
b = a++       // 후위 증감 연산자

b = a;        // a의 값을 먼저 b에 대입 b = 1
a = a + 1;    // 이후에 a의 값을 증가 a = 2

결과 : a = 2, b = 1
```

> **참고**
> a++, ++a가 단독으로 사용됬을 경우에는 다른 연산이 없기 때문에, 본인의 값만 증가한다.